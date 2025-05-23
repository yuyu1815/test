/*     */ package org.jetbrains.jewel.foundation.lazy.tree;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.shape.CornerSize;
/*     */ import androidx.compose.foundation.shape.CornerSizeKt;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShape;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScope;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListScopeKt;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectionMode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000ª\001\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\003\n\002\020!\n\000\n\002\020#\n\002\020\000\n\000\n\002\030\002\n\000\032Í\002\020\000\032\0020\001\"\004\b\000\020\0022\f\020\003\032\b\022\004\022\002H\0020\0042\b\b\002\020\005\032\0020\0062\030\020\007\032\024\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010\b2\006\020\n\032\0020\0132\006\020\f\032\0020\0132\006\020\r\032\0020\0132\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0232\006\020\025\032\0020\0172\006\020\026\032\0020\0172\b\b\002\020\027\032\0020\0302\b\b\002\020\031\032\0020\0322\030\020\033\032\024\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010\b2\036\020\034\032\032\022\020\022\016\022\n\022\b\022\004\022\002H\0020\t0\035\022\004\022\0020\0010\b2\b\b\002\020\036\032\0020\0372\b\b\002\020 \032\0020!2\b\b\002\020\"\032\0020#2&\020$\032\"\022\023\022\0210%¢\006\f\b&\022\b\b'\022\004\b\b((\022\004\022\0020\0010\b¢\006\002\b)2(\020*\032$\022\004\022\0020,\022\n\022\b\022\004\022\002H\0020\t\022\004\022\0020\0010+¢\006\002\b-¢\006\002\b)H\007¢\006\004\b.\020/\032\030\0200\032\0020\0212\006\0201\032\002022\006\0203\032\0020\021H\002\032;\0204\032\0020\032*\0020\0322\006\0205\032\0020%2\006\0206\032\0020\0132\006\0207\032\0020\0132\006\0208\032\0020\0132\006\0209\032\0020:H\002¢\006\004\b;\020<\032\"\020=\032\f\022\b\022\006\022\002\b\0030\t0>*\006\022\002\b\0030\t2\006\0205\032\0020\030H\002\032\037\020?\032\0020\001*\b\022\004\022\0020A0@2\n\020B\032\006\022\002\b\0030CH\004¨\006D²\006\n\0209\032\0020:X\002"}, d2 = {"BasicLazyTree", "", "T", "tree", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "onElementClick", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;", "elementBackgroundFocused", "Landroidx/compose/ui/graphics/Color;", "elementBackgroundSelectedFocused", "elementBackgroundSelected", "indentSize", "Landroidx/compose/ui/unit/Dp;", "elementBackgroundCornerSize", "Landroidx/compose/foundation/shape/CornerSize;", "elementPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "elementContentPadding", "elementMinHeight", "chevronContentGap", "treeState", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "modifier", "Landroidx/compose/ui/Modifier;", "onElementDoubleClick", "onSelectionChange", "", "platformDoubleClickDelay", "Lkotlin/time/Duration;", "keyActions", "Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;", "pointerEventScopedActions", "Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;", "chevronContent", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;", "Lkotlin/ParameterName;", "name", "nodeState", "Landroidx/compose/runtime/Composable;", "nodeContent", "Lkotlin/Function2;", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;", "Lkotlin/ExtensionFunctionType;", "BasicLazyTree-orM9XXQ", "(Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lkotlin/jvm/functions/Function1;JJJFLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFLorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JLorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;IIII)V", "computerCornerSize", "isRounded", "", "cornerSize", "elementBackground", "state", "selectedFocused", "focused", "selected", "backgroundShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "elementBackground-61ZKQAw", "(Landroidx/compose/ui/Modifier;JJJJLandroidx/compose/foundation/shape/RoundedCornerShape;)Landroidx/compose/ui/Modifier;", "flattenTree", "", "getAllSubNodes", "", "", "node", "Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nBasicLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1225#2,6:325\n1225#2,3:336\n1228#2,3:342\n1225#2,3:346\n1228#2,3:355\n1225#2,6:358\n1225#2,6:364\n1225#2,6:370\n1225#2,6:376\n481#3:331\n480#3,4:332\n484#3,2:339\n488#3:345\n480#4:341\n1360#5:349\n1446#5,5:350\n1549#5:383\n1620#5,3:384\n1855#5,2:388\n800#5,11:390\n1855#5,2:401\n1549#5:403\n1620#5,3:404\n149#6:382\n1#7:387\n*S KotlinDebug\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt\n*L\n93#1:325,6\n97#1:336,3\n97#1:342,3\n100#1:346,3\n100#1:355,3\n102#1:358,6\n121#1:364,6\n118#1:370,6\n122#1:376,6\n97#1:331\n97#1:332,4\n97#1:339,2\n97#1:345\n97#1:341\n100#1:349\n100#1:350,5\n298#1:383\n298#1:384,3\n308#1:388,2\n319#1:390,11\n319#1:401,2\n119#1:403\n119#1:404,3\n194#1:382\n*E\n"})
/*     */ public final class BasicLazyTreeKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final <T> void BasicLazyTree-orM9XXQ(@NotNull Tree tree, @Nullable SelectionMode selectionMode, @NotNull Function1 onElementClick, long elementBackgroundFocused, long elementBackgroundSelectedFocused, long elementBackgroundSelected, float indentSize, @NotNull CornerSize elementBackgroundCornerSize, @NotNull PaddingValues elementPadding, @NotNull PaddingValues elementContentPadding, float elementMinHeight, float chevronContentGap, @Nullable TreeState treeState, @Nullable Modifier modifier, @NotNull Function1 onElementDoubleClick, @NotNull Function1 onSelectionChange, long platformDoubleClickDelay, @Nullable KeyActions keyActions, @Nullable PointerEventActions pointerEventScopedActions, @NotNull Function3 chevronContent, @NotNull Function4 nodeContent, @Nullable Composer $composer, int $changed, int $changed1, int $changed2, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'tree'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'onElementClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #10
/*     */     //   14: ldc 'elementBackgroundCornerSize'
/*     */     //   16: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   19: aload #11
/*     */     //   21: ldc 'elementPadding'
/*     */     //   23: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   26: aload #12
/*     */     //   28: ldc 'elementContentPadding'
/*     */     //   30: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   33: aload #17
/*     */     //   35: ldc 'onElementDoubleClick'
/*     */     //   37: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   40: aload #18
/*     */     //   42: ldc 'onSelectionChange'
/*     */     //   44: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   47: aload #23
/*     */     //   49: ldc 'chevronContent'
/*     */     //   51: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   54: aload #24
/*     */     //   56: ldc 'nodeContent'
/*     */     //   58: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   61: aload #25
/*     */     //   63: ldc 255072762
/*     */     //   65: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   70: astore #25
/*     */     //   72: iload #26
/*     */     //   74: istore #30
/*     */     //   76: iload #27
/*     */     //   78: istore #31
/*     */     //   80: iload #28
/*     */     //   82: istore #32
/*     */     //   84: iload #29
/*     */     //   86: iconst_1
/*     */     //   87: iand
/*     */     //   88: ifeq -> 101
/*     */     //   91: iload #30
/*     */     //   93: bipush #6
/*     */     //   95: ior
/*     */     //   96: istore #30
/*     */     //   98: goto -> 130
/*     */     //   101: iload #26
/*     */     //   103: bipush #6
/*     */     //   105: iand
/*     */     //   106: ifne -> 130
/*     */     //   109: iload #30
/*     */     //   111: aload #25
/*     */     //   113: aload_0
/*     */     //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   119: ifeq -> 126
/*     */     //   122: iconst_4
/*     */     //   123: goto -> 127
/*     */     //   126: iconst_2
/*     */     //   127: ior
/*     */     //   128: istore #30
/*     */     //   130: iload #29
/*     */     //   132: iconst_2
/*     */     //   133: iand
/*     */     //   134: ifeq -> 147
/*     */     //   137: iload #30
/*     */     //   139: bipush #48
/*     */     //   141: ior
/*     */     //   142: istore #30
/*     */     //   144: goto -> 178
/*     */     //   147: iload #26
/*     */     //   149: bipush #48
/*     */     //   151: iand
/*     */     //   152: ifne -> 178
/*     */     //   155: iload #30
/*     */     //   157: aload #25
/*     */     //   159: aload_1
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 173
/*     */     //   168: bipush #32
/*     */     //   170: goto -> 175
/*     */     //   173: bipush #16
/*     */     //   175: ior
/*     */     //   176: istore #30
/*     */     //   178: iload #29
/*     */     //   180: iconst_4
/*     */     //   181: iand
/*     */     //   182: ifeq -> 196
/*     */     //   185: iload #30
/*     */     //   187: sipush #384
/*     */     //   190: ior
/*     */     //   191: istore #30
/*     */     //   193: goto -> 230
/*     */     //   196: iload #26
/*     */     //   198: sipush #384
/*     */     //   201: iand
/*     */     //   202: ifne -> 230
/*     */     //   205: iload #30
/*     */     //   207: aload #25
/*     */     //   209: aload_2
/*     */     //   210: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   215: ifeq -> 224
/*     */     //   218: sipush #256
/*     */     //   221: goto -> 227
/*     */     //   224: sipush #128
/*     */     //   227: ior
/*     */     //   228: istore #30
/*     */     //   230: iload #29
/*     */     //   232: bipush #8
/*     */     //   234: iand
/*     */     //   235: ifeq -> 249
/*     */     //   238: iload #30
/*     */     //   240: sipush #3072
/*     */     //   243: ior
/*     */     //   244: istore #30
/*     */     //   246: goto -> 283
/*     */     //   249: iload #26
/*     */     //   251: sipush #3072
/*     */     //   254: iand
/*     */     //   255: ifne -> 283
/*     */     //   258: iload #30
/*     */     //   260: aload #25
/*     */     //   262: lload_3
/*     */     //   263: invokeinterface changed : (J)Z
/*     */     //   268: ifeq -> 277
/*     */     //   271: sipush #2048
/*     */     //   274: goto -> 280
/*     */     //   277: sipush #1024
/*     */     //   280: ior
/*     */     //   281: istore #30
/*     */     //   283: iload #29
/*     */     //   285: bipush #16
/*     */     //   287: iand
/*     */     //   288: ifeq -> 302
/*     */     //   291: iload #30
/*     */     //   293: sipush #24576
/*     */     //   296: ior
/*     */     //   297: istore #30
/*     */     //   299: goto -> 337
/*     */     //   302: iload #26
/*     */     //   304: sipush #24576
/*     */     //   307: iand
/*     */     //   308: ifne -> 337
/*     */     //   311: iload #30
/*     */     //   313: aload #25
/*     */     //   315: lload #5
/*     */     //   317: invokeinterface changed : (J)Z
/*     */     //   322: ifeq -> 331
/*     */     //   325: sipush #16384
/*     */     //   328: goto -> 334
/*     */     //   331: sipush #8192
/*     */     //   334: ior
/*     */     //   335: istore #30
/*     */     //   337: iload #29
/*     */     //   339: bipush #32
/*     */     //   341: iand
/*     */     //   342: ifeq -> 355
/*     */     //   345: iload #30
/*     */     //   347: ldc 196608
/*     */     //   349: ior
/*     */     //   350: istore #30
/*     */     //   352: goto -> 387
/*     */     //   355: iload #26
/*     */     //   357: ldc 196608
/*     */     //   359: iand
/*     */     //   360: ifne -> 387
/*     */     //   363: iload #30
/*     */     //   365: aload #25
/*     */     //   367: lload #7
/*     */     //   369: invokeinterface changed : (J)Z
/*     */     //   374: ifeq -> 382
/*     */     //   377: ldc 131072
/*     */     //   379: goto -> 384
/*     */     //   382: ldc 65536
/*     */     //   384: ior
/*     */     //   385: istore #30
/*     */     //   387: iload #29
/*     */     //   389: bipush #64
/*     */     //   391: iand
/*     */     //   392: ifeq -> 405
/*     */     //   395: iload #30
/*     */     //   397: ldc 1572864
/*     */     //   399: ior
/*     */     //   400: istore #30
/*     */     //   402: goto -> 437
/*     */     //   405: iload #26
/*     */     //   407: ldc 1572864
/*     */     //   409: iand
/*     */     //   410: ifne -> 437
/*     */     //   413: iload #30
/*     */     //   415: aload #25
/*     */     //   417: fload #9
/*     */     //   419: invokeinterface changed : (F)Z
/*     */     //   424: ifeq -> 432
/*     */     //   427: ldc 1048576
/*     */     //   429: goto -> 434
/*     */     //   432: ldc 524288
/*     */     //   434: ior
/*     */     //   435: istore #30
/*     */     //   437: iload #29
/*     */     //   439: sipush #128
/*     */     //   442: iand
/*     */     //   443: ifeq -> 456
/*     */     //   446: iload #30
/*     */     //   448: ldc 12582912
/*     */     //   450: ior
/*     */     //   451: istore #30
/*     */     //   453: goto -> 488
/*     */     //   456: iload #26
/*     */     //   458: ldc 12582912
/*     */     //   460: iand
/*     */     //   461: ifne -> 488
/*     */     //   464: iload #30
/*     */     //   466: aload #25
/*     */     //   468: aload #10
/*     */     //   470: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   475: ifeq -> 483
/*     */     //   478: ldc 8388608
/*     */     //   480: goto -> 485
/*     */     //   483: ldc 4194304
/*     */     //   485: ior
/*     */     //   486: istore #30
/*     */     //   488: iload #29
/*     */     //   490: sipush #256
/*     */     //   493: iand
/*     */     //   494: ifeq -> 507
/*     */     //   497: iload #30
/*     */     //   499: ldc 100663296
/*     */     //   501: ior
/*     */     //   502: istore #30
/*     */     //   504: goto -> 539
/*     */     //   507: iload #26
/*     */     //   509: ldc 100663296
/*     */     //   511: iand
/*     */     //   512: ifne -> 539
/*     */     //   515: iload #30
/*     */     //   517: aload #25
/*     */     //   519: aload #11
/*     */     //   521: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   526: ifeq -> 534
/*     */     //   529: ldc 67108864
/*     */     //   531: goto -> 536
/*     */     //   534: ldc 33554432
/*     */     //   536: ior
/*     */     //   537: istore #30
/*     */     //   539: iload #29
/*     */     //   541: sipush #512
/*     */     //   544: iand
/*     */     //   545: ifeq -> 558
/*     */     //   548: iload #30
/*     */     //   550: ldc 805306368
/*     */     //   552: ior
/*     */     //   553: istore #30
/*     */     //   555: goto -> 590
/*     */     //   558: iload #26
/*     */     //   560: ldc 805306368
/*     */     //   562: iand
/*     */     //   563: ifne -> 590
/*     */     //   566: iload #30
/*     */     //   568: aload #25
/*     */     //   570: aload #12
/*     */     //   572: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   577: ifeq -> 585
/*     */     //   580: ldc 536870912
/*     */     //   582: goto -> 587
/*     */     //   585: ldc 268435456
/*     */     //   587: ior
/*     */     //   588: istore #30
/*     */     //   590: iload #29
/*     */     //   592: sipush #1024
/*     */     //   595: iand
/*     */     //   596: ifeq -> 609
/*     */     //   599: iload #31
/*     */     //   601: bipush #6
/*     */     //   603: ior
/*     */     //   604: istore #31
/*     */     //   606: goto -> 639
/*     */     //   609: iload #27
/*     */     //   611: bipush #6
/*     */     //   613: iand
/*     */     //   614: ifne -> 639
/*     */     //   617: iload #31
/*     */     //   619: aload #25
/*     */     //   621: fload #13
/*     */     //   623: invokeinterface changed : (F)Z
/*     */     //   628: ifeq -> 635
/*     */     //   631: iconst_4
/*     */     //   632: goto -> 636
/*     */     //   635: iconst_2
/*     */     //   636: ior
/*     */     //   637: istore #31
/*     */     //   639: iload #29
/*     */     //   641: sipush #2048
/*     */     //   644: iand
/*     */     //   645: ifeq -> 658
/*     */     //   648: iload #31
/*     */     //   650: bipush #48
/*     */     //   652: ior
/*     */     //   653: istore #31
/*     */     //   655: goto -> 690
/*     */     //   658: iload #27
/*     */     //   660: bipush #48
/*     */     //   662: iand
/*     */     //   663: ifne -> 690
/*     */     //   666: iload #31
/*     */     //   668: aload #25
/*     */     //   670: fload #14
/*     */     //   672: invokeinterface changed : (F)Z
/*     */     //   677: ifeq -> 685
/*     */     //   680: bipush #32
/*     */     //   682: goto -> 687
/*     */     //   685: bipush #16
/*     */     //   687: ior
/*     */     //   688: istore #31
/*     */     //   690: iload #27
/*     */     //   692: sipush #384
/*     */     //   695: iand
/*     */     //   696: ifne -> 734
/*     */     //   699: iload #31
/*     */     //   701: iload #29
/*     */     //   703: sipush #4096
/*     */     //   706: iand
/*     */     //   707: ifne -> 728
/*     */     //   710: aload #25
/*     */     //   712: aload #15
/*     */     //   714: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   719: ifeq -> 728
/*     */     //   722: sipush #256
/*     */     //   725: goto -> 731
/*     */     //   728: sipush #128
/*     */     //   731: ior
/*     */     //   732: istore #31
/*     */     //   734: iload #29
/*     */     //   736: sipush #8192
/*     */     //   739: iand
/*     */     //   740: ifeq -> 754
/*     */     //   743: iload #31
/*     */     //   745: sipush #3072
/*     */     //   748: ior
/*     */     //   749: istore #31
/*     */     //   751: goto -> 789
/*     */     //   754: iload #27
/*     */     //   756: sipush #3072
/*     */     //   759: iand
/*     */     //   760: ifne -> 789
/*     */     //   763: iload #31
/*     */     //   765: aload #25
/*     */     //   767: aload #16
/*     */     //   769: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   774: ifeq -> 783
/*     */     //   777: sipush #2048
/*     */     //   780: goto -> 786
/*     */     //   783: sipush #1024
/*     */     //   786: ior
/*     */     //   787: istore #31
/*     */     //   789: iload #29
/*     */     //   791: sipush #16384
/*     */     //   794: iand
/*     */     //   795: ifeq -> 809
/*     */     //   798: iload #31
/*     */     //   800: sipush #24576
/*     */     //   803: ior
/*     */     //   804: istore #31
/*     */     //   806: goto -> 844
/*     */     //   809: iload #27
/*     */     //   811: sipush #24576
/*     */     //   814: iand
/*     */     //   815: ifne -> 844
/*     */     //   818: iload #31
/*     */     //   820: aload #25
/*     */     //   822: aload #17
/*     */     //   824: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   829: ifeq -> 838
/*     */     //   832: sipush #16384
/*     */     //   835: goto -> 841
/*     */     //   838: sipush #8192
/*     */     //   841: ior
/*     */     //   842: istore #31
/*     */     //   844: iload #29
/*     */     //   846: ldc 32768
/*     */     //   848: iand
/*     */     //   849: ifeq -> 862
/*     */     //   852: iload #31
/*     */     //   854: ldc 196608
/*     */     //   856: ior
/*     */     //   857: istore #31
/*     */     //   859: goto -> 894
/*     */     //   862: iload #27
/*     */     //   864: ldc 196608
/*     */     //   866: iand
/*     */     //   867: ifne -> 894
/*     */     //   870: iload #31
/*     */     //   872: aload #25
/*     */     //   874: aload #18
/*     */     //   876: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   881: ifeq -> 889
/*     */     //   884: ldc 131072
/*     */     //   886: goto -> 891
/*     */     //   889: ldc 65536
/*     */     //   891: ior
/*     */     //   892: istore #31
/*     */     //   894: iload #27
/*     */     //   896: ldc 1572864
/*     */     //   898: iand
/*     */     //   899: ifne -> 934
/*     */     //   902: iload #31
/*     */     //   904: iload #29
/*     */     //   906: ldc 65536
/*     */     //   908: iand
/*     */     //   909: ifne -> 929
/*     */     //   912: aload #25
/*     */     //   914: lload #19
/*     */     //   916: invokeinterface changed : (J)Z
/*     */     //   921: ifeq -> 929
/*     */     //   924: ldc 1048576
/*     */     //   926: goto -> 931
/*     */     //   929: ldc 524288
/*     */     //   931: ior
/*     */     //   932: istore #31
/*     */     //   934: iload #27
/*     */     //   936: ldc 12582912
/*     */     //   938: iand
/*     */     //   939: ifne -> 994
/*     */     //   942: iload #31
/*     */     //   944: iload #29
/*     */     //   946: ldc 131072
/*     */     //   948: iand
/*     */     //   949: ifne -> 989
/*     */     //   952: iload #27
/*     */     //   954: ldc 16777216
/*     */     //   956: iand
/*     */     //   957: ifne -> 972
/*     */     //   960: aload #25
/*     */     //   962: aload #21
/*     */     //   964: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   969: goto -> 981
/*     */     //   972: aload #25
/*     */     //   974: aload #21
/*     */     //   976: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   981: ifeq -> 989
/*     */     //   984: ldc 8388608
/*     */     //   986: goto -> 991
/*     */     //   989: ldc 4194304
/*     */     //   991: ior
/*     */     //   992: istore #31
/*     */     //   994: iload #27
/*     */     //   996: ldc 100663296
/*     */     //   998: iand
/*     */     //   999: ifne -> 1054
/*     */     //   1002: iload #31
/*     */     //   1004: iload #29
/*     */     //   1006: ldc 262144
/*     */     //   1008: iand
/*     */     //   1009: ifne -> 1049
/*     */     //   1012: iload #27
/*     */     //   1014: ldc 134217728
/*     */     //   1016: iand
/*     */     //   1017: ifne -> 1032
/*     */     //   1020: aload #25
/*     */     //   1022: aload #22
/*     */     //   1024: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1029: goto -> 1041
/*     */     //   1032: aload #25
/*     */     //   1034: aload #22
/*     */     //   1036: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1041: ifeq -> 1049
/*     */     //   1044: ldc 67108864
/*     */     //   1046: goto -> 1051
/*     */     //   1049: ldc 33554432
/*     */     //   1051: ior
/*     */     //   1052: istore #31
/*     */     //   1054: iload #29
/*     */     //   1056: ldc 524288
/*     */     //   1058: iand
/*     */     //   1059: ifeq -> 1072
/*     */     //   1062: iload #31
/*     */     //   1064: ldc 805306368
/*     */     //   1066: ior
/*     */     //   1067: istore #31
/*     */     //   1069: goto -> 1104
/*     */     //   1072: iload #27
/*     */     //   1074: ldc 805306368
/*     */     //   1076: iand
/*     */     //   1077: ifne -> 1104
/*     */     //   1080: iload #31
/*     */     //   1082: aload #25
/*     */     //   1084: aload #23
/*     */     //   1086: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1091: ifeq -> 1099
/*     */     //   1094: ldc 536870912
/*     */     //   1096: goto -> 1101
/*     */     //   1099: ldc 268435456
/*     */     //   1101: ior
/*     */     //   1102: istore #31
/*     */     //   1104: iload #29
/*     */     //   1106: ldc 1048576
/*     */     //   1108: iand
/*     */     //   1109: ifeq -> 1122
/*     */     //   1112: iload #32
/*     */     //   1114: bipush #6
/*     */     //   1116: ior
/*     */     //   1117: istore #32
/*     */     //   1119: goto -> 1152
/*     */     //   1122: iload #28
/*     */     //   1124: bipush #6
/*     */     //   1126: iand
/*     */     //   1127: ifne -> 1152
/*     */     //   1130: iload #32
/*     */     //   1132: aload #25
/*     */     //   1134: aload #24
/*     */     //   1136: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1141: ifeq -> 1148
/*     */     //   1144: iconst_4
/*     */     //   1145: goto -> 1149
/*     */     //   1148: iconst_2
/*     */     //   1149: ior
/*     */     //   1150: istore #32
/*     */     //   1152: iload #30
/*     */     //   1154: ldc 306783379
/*     */     //   1156: iand
/*     */     //   1157: ldc 306783378
/*     */     //   1159: if_icmpne -> 1190
/*     */     //   1162: iload #31
/*     */     //   1164: ldc 306783379
/*     */     //   1166: iand
/*     */     //   1167: ldc 306783378
/*     */     //   1169: if_icmpne -> 1190
/*     */     //   1172: iload #32
/*     */     //   1174: iconst_3
/*     */     //   1175: iand
/*     */     //   1176: iconst_2
/*     */     //   1177: if_icmpne -> 1190
/*     */     //   1180: aload #25
/*     */     //   1182: invokeinterface getSkipping : ()Z
/*     */     //   1187: ifne -> 2847
/*     */     //   1190: aload #25
/*     */     //   1192: invokeinterface startDefaults : ()V
/*     */     //   1197: iload #26
/*     */     //   1199: iconst_1
/*     */     //   1200: iand
/*     */     //   1201: ifeq -> 1214
/*     */     //   1204: aload #25
/*     */     //   1206: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   1211: ifeq -> 1437
/*     */     //   1214: iload #29
/*     */     //   1216: iconst_2
/*     */     //   1217: iand
/*     */     //   1218: ifeq -> 1225
/*     */     //   1221: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Multiple : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   1224: astore_1
/*     */     //   1225: iload #29
/*     */     //   1227: sipush #4096
/*     */     //   1230: iand
/*     */     //   1231: ifeq -> 1253
/*     */     //   1234: aconst_null
/*     */     //   1235: aconst_null
/*     */     //   1236: aload #25
/*     */     //   1238: iconst_0
/*     */     //   1239: iconst_3
/*     */     //   1240: invokestatic rememberTreeState : (Landroidx/compose/foundation/lazy/LazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   1243: astore #15
/*     */     //   1245: iload #31
/*     */     //   1247: sipush #-897
/*     */     //   1250: iand
/*     */     //   1251: istore #31
/*     */     //   1253: iload #29
/*     */     //   1255: sipush #8192
/*     */     //   1258: iand
/*     */     //   1259: ifeq -> 1270
/*     */     //   1262: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1265: checkcast androidx/compose/ui/Modifier
/*     */     //   1268: astore #16
/*     */     //   1270: iload #29
/*     */     //   1272: ldc 65536
/*     */     //   1274: iand
/*     */     //   1275: ifeq -> 1300
/*     */     //   1278: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   1281: pop
/*     */     //   1282: sipush #500
/*     */     //   1285: getstatic kotlin/time/DurationUnit.MILLISECONDS : Lkotlin/time/DurationUnit;
/*     */     //   1288: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   1291: lstore #19
/*     */     //   1293: iload #31
/*     */     //   1295: ldc -3670017
/*     */     //   1297: iand
/*     */     //   1298: istore #31
/*     */     //   1300: iload #29
/*     */     //   1302: ldc 131072
/*     */     //   1304: iand
/*     */     //   1305: ifeq -> 1325
/*     */     //   1308: aload #15
/*     */     //   1310: invokestatic DefaultTreeViewKeyActions : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewKeyActions;
/*     */     //   1313: checkcast org/jetbrains/jewel/foundation/lazy/tree/KeyActions
/*     */     //   1316: astore #21
/*     */     //   1318: iload #31
/*     */     //   1320: ldc -29360129
/*     */     //   1322: iand
/*     */     //   1323: istore #31
/*     */     //   1325: iload #29
/*     */     //   1327: ldc 262144
/*     */     //   1329: iand
/*     */     //   1330: ifeq -> 1506
/*     */     //   1333: aload #25
/*     */     //   1335: ldc 948282421
/*     */     //   1337: invokeinterface startReplaceGroup : (I)V
/*     */     //   1342: aload #25
/*     */     //   1344: astore #34
/*     */     //   1346: iconst_0
/*     */     //   1347: istore #35
/*     */     //   1349: iconst_0
/*     */     //   1350: istore #36
/*     */     //   1352: aload #34
/*     */     //   1354: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1359: astore #37
/*     */     //   1361: iconst_0
/*     */     //   1362: istore #38
/*     */     //   1364: aload #37
/*     */     //   1366: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1369: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1372: if_acmpne -> 1403
/*     */     //   1375: iconst_0
/*     */     //   1376: istore #39
/*     */     //   1378: new org/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction
/*     */     //   1381: dup
/*     */     //   1382: aload #15
/*     */     //   1384: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)V
/*     */     //   1387: astore #40
/*     */     //   1389: aload #34
/*     */     //   1391: aload #40
/*     */     //   1393: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1398: aload #40
/*     */     //   1400: goto -> 1405
/*     */     //   1403: aload #37
/*     */     //   1405: nop
/*     */     //   1406: nop
/*     */     //   1407: nop
/*     */     //   1408: checkcast org/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewPointerEventAction
/*     */     //   1411: astore #33
/*     */     //   1413: aload #25
/*     */     //   1415: invokeinterface endReplaceGroup : ()V
/*     */     //   1420: aload #33
/*     */     //   1422: checkcast org/jetbrains/jewel/foundation/lazy/tree/PointerEventActions
/*     */     //   1425: astore #22
/*     */     //   1427: iload #31
/*     */     //   1429: ldc -234881025
/*     */     //   1431: iand
/*     */     //   1432: istore #31
/*     */     //   1434: goto -> 1506
/*     */     //   1437: aload #25
/*     */     //   1439: invokeinterface skipToGroupEnd : ()V
/*     */     //   1444: iload #29
/*     */     //   1446: sipush #4096
/*     */     //   1449: iand
/*     */     //   1450: ifeq -> 1461
/*     */     //   1453: iload #31
/*     */     //   1455: sipush #-897
/*     */     //   1458: iand
/*     */     //   1459: istore #31
/*     */     //   1461: iload #29
/*     */     //   1463: ldc 65536
/*     */     //   1465: iand
/*     */     //   1466: ifeq -> 1476
/*     */     //   1469: iload #31
/*     */     //   1471: ldc -3670017
/*     */     //   1473: iand
/*     */     //   1474: istore #31
/*     */     //   1476: iload #29
/*     */     //   1478: ldc 131072
/*     */     //   1480: iand
/*     */     //   1481: ifeq -> 1491
/*     */     //   1484: iload #31
/*     */     //   1486: ldc -29360129
/*     */     //   1488: iand
/*     */     //   1489: istore #31
/*     */     //   1491: iload #29
/*     */     //   1493: ldc 262144
/*     */     //   1495: iand
/*     */     //   1496: ifeq -> 1506
/*     */     //   1499: iload #31
/*     */     //   1501: ldc -234881025
/*     */     //   1503: iand
/*     */     //   1504: istore #31
/*     */     //   1506: aload #25
/*     */     //   1508: invokeinterface endDefaults : ()V
/*     */     //   1513: invokestatic isTraceInProgress : ()Z
/*     */     //   1516: ifeq -> 1530
/*     */     //   1519: ldc 255072762
/*     */     //   1521: iload #30
/*     */     //   1523: iload #31
/*     */     //   1525: ldc 'org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTree (BasicLazyTree.kt:95)'
/*     */     //   1527: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1530: iconst_0
/*     */     //   1531: istore #35
/*     */     //   1533: nop
/*     */     //   1534: iconst_0
/*     */     //   1535: istore #36
/*     */     //   1537: aload #25
/*     */     //   1539: ldc 773894976
/*     */     //   1541: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   1543: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1546: aload #25
/*     */     //   1548: astore #37
/*     */     //   1550: aload #25
/*     */     //   1552: ldc -954370320
/*     */     //   1554: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   1556: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1559: aload #25
/*     */     //   1561: astore #38
/*     */     //   1563: iconst_0
/*     */     //   1564: istore #39
/*     */     //   1566: iconst_0
/*     */     //   1567: istore #40
/*     */     //   1569: aload #38
/*     */     //   1571: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1576: astore #41
/*     */     //   1578: iconst_0
/*     */     //   1579: istore #42
/*     */     //   1581: aload #41
/*     */     //   1583: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1586: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1589: if_acmpne -> 1636
/*     */     //   1592: iconst_0
/*     */     //   1593: istore #43
/*     */     //   1595: iconst_0
/*     */     //   1596: istore #44
/*     */     //   1598: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   1601: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   1604: aload #37
/*     */     //   1606: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1609: astore #67
/*     */     //   1611: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1614: dup
/*     */     //   1615: aload #67
/*     */     //   1617: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   1620: astore #44
/*     */     //   1622: aload #38
/*     */     //   1624: aload #44
/*     */     //   1626: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1631: aload #44
/*     */     //   1633: goto -> 1638
/*     */     //   1636: aload #41
/*     */     //   1638: nop
/*     */     //   1639: nop
/*     */     //   1640: nop
/*     */     //   1641: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1644: astore #45
/*     */     //   1646: aload #25
/*     */     //   1648: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1651: aload #45
/*     */     //   1653: astore #46
/*     */     //   1655: aload #46
/*     */     //   1657: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1660: astore #45
/*     */     //   1662: aload #25
/*     */     //   1664: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1667: aload #45
/*     */     //   1669: nop
/*     */     //   1670: astore #33
/*     */     //   1672: aload #15
/*     */     //   1674: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*     */     //   1677: astore #35
/*     */     //   1679: aload #15
/*     */     //   1681: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   1684: astore #36
/*     */     //   1686: aload #25
/*     */     //   1688: ldc 948291752
/*     */     //   1690: invokeinterface startReplaceGroup : (I)V
/*     */     //   1695: aload #25
/*     */     //   1697: astore #38
/*     */     //   1699: aload #25
/*     */     //   1701: aload_0
/*     */     //   1702: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1707: aload #25
/*     */     //   1709: aload #35
/*     */     //   1711: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1716: ior
/*     */     //   1717: aload #25
/*     */     //   1719: aload #36
/*     */     //   1721: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1726: ior
/*     */     //   1727: istore #39
/*     */     //   1729: iconst_0
/*     */     //   1730: istore #40
/*     */     //   1732: aload #38
/*     */     //   1734: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1739: astore #41
/*     */     //   1741: iconst_0
/*     */     //   1742: istore #42
/*     */     //   1744: iload #39
/*     */     //   1746: ifne -> 1760
/*     */     //   1749: aload #41
/*     */     //   1751: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1754: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1757: if_acmpne -> 1878
/*     */     //   1760: iconst_0
/*     */     //   1761: istore #43
/*     */     //   1763: aload_0
/*     */     //   1764: invokevirtual getRoots : ()Ljava/util/List;
/*     */     //   1767: checkcast java/lang/Iterable
/*     */     //   1770: astore #44
/*     */     //   1772: iconst_0
/*     */     //   1773: istore #45
/*     */     //   1775: aload #44
/*     */     //   1777: astore #46
/*     */     //   1779: new java/util/ArrayList
/*     */     //   1782: dup
/*     */     //   1783: invokespecial <init> : ()V
/*     */     //   1786: checkcast java/util/Collection
/*     */     //   1789: astore #47
/*     */     //   1791: iconst_0
/*     */     //   1792: istore #48
/*     */     //   1794: aload #46
/*     */     //   1796: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1801: astore #49
/*     */     //   1803: aload #49
/*     */     //   1805: invokeinterface hasNext : ()Z
/*     */     //   1810: ifeq -> 1855
/*     */     //   1813: aload #49
/*     */     //   1815: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1820: astore #50
/*     */     //   1822: aload #50
/*     */     //   1824: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   1827: astore #51
/*     */     //   1829: iconst_0
/*     */     //   1830: istore #52
/*     */     //   1832: aload #51
/*     */     //   1834: aload #15
/*     */     //   1836: invokestatic flattenTree : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Ljava/util/List;
/*     */     //   1839: checkcast java/lang/Iterable
/*     */     //   1842: astore #51
/*     */     //   1844: aload #47
/*     */     //   1846: aload #51
/*     */     //   1848: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   1851: pop
/*     */     //   1852: goto -> 1803
/*     */     //   1855: aload #47
/*     */     //   1857: checkcast java/util/List
/*     */     //   1860: nop
/*     */     //   1861: nop
/*     */     //   1862: astore #53
/*     */     //   1864: aload #38
/*     */     //   1866: aload #53
/*     */     //   1868: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1873: aload #53
/*     */     //   1875: goto -> 1880
/*     */     //   1878: aload #41
/*     */     //   1880: nop
/*     */     //   1881: nop
/*     */     //   1882: nop
/*     */     //   1883: checkcast java/util/List
/*     */     //   1886: astore #37
/*     */     //   1888: aload #25
/*     */     //   1890: invokeinterface endReplaceGroup : ()V
/*     */     //   1895: aload #37
/*     */     //   1897: astore #34
/*     */     //   1899: aload #25
/*     */     //   1901: ldc_w 948295620
/*     */     //   1904: invokeinterface startReplaceGroup : (I)V
/*     */     //   1909: aload #25
/*     */     //   1911: astore #35
/*     */     //   1913: aload #25
/*     */     //   1915: aload_0
/*     */     //   1916: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1921: istore #36
/*     */     //   1923: iconst_0
/*     */     //   1924: istore #37
/*     */     //   1926: aload #35
/*     */     //   1928: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1933: astore #38
/*     */     //   1935: iconst_0
/*     */     //   1936: istore #39
/*     */     //   1938: iload #36
/*     */     //   1940: ifne -> 1954
/*     */     //   1943: aload #38
/*     */     //   1945: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1948: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1951: if_acmpne -> 2014
/*     */     //   1954: iconst_0
/*     */     //   1955: istore #40
/*     */     //   1957: aload #18
/*     */     //   1959: aload #34
/*     */     //   1961: checkcast java/lang/Iterable
/*     */     //   1964: invokestatic asSequence : (Ljava/lang/Iterable;)Lkotlin/sequences/Sequence;
/*     */     //   1967: aload #15
/*     */     //   1969: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1974: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   1977: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1982: invokestatic map : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   1985: invokestatic toList : (Lkotlin/sequences/Sequence;)Ljava/util/List;
/*     */     //   1988: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1993: pop
/*     */     //   1994: nop
/*     */     //   1995: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1998: astore #41
/*     */     //   2000: aload #35
/*     */     //   2002: aload #41
/*     */     //   2004: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2009: aload #41
/*     */     //   2011: goto -> 2016
/*     */     //   2014: aload #38
/*     */     //   2016: nop
/*     */     //   2017: nop
/*     */     //   2018: nop
/*     */     //   2019: pop
/*     */     //   2020: aload #25
/*     */     //   2022: invokeinterface endReplaceGroup : ()V
/*     */     //   2027: aload #15
/*     */     //   2029: invokevirtual getDelegate$foundation : ()Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   2032: astore #35
/*     */     //   2034: aload #25
/*     */     //   2036: ldc_w 948318371
/*     */     //   2039: invokeinterface startReplaceGroup : (I)V
/*     */     //   2044: aload #25
/*     */     //   2046: astore #38
/*     */     //   2048: iconst_0
/*     */     //   2049: istore #39
/*     */     //   2051: nop
/*     */     //   2052: iconst_0
/*     */     //   2053: istore #40
/*     */     //   2055: aload #38
/*     */     //   2057: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2062: astore #41
/*     */     //   2064: iconst_0
/*     */     //   2065: istore #42
/*     */     //   2067: aload #41
/*     */     //   2069: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2072: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2075: if_acmpne -> 2100
/*     */     //   2078: iconst_0
/*     */     //   2079: istore #43
/*     */     //   2081: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   2084: astore #43
/*     */     //   2086: aload #38
/*     */     //   2088: aload #43
/*     */     //   2090: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2095: aload #43
/*     */     //   2097: goto -> 2102
/*     */     //   2100: aload #41
/*     */     //   2102: nop
/*     */     //   2103: nop
/*     */     //   2104: nop
/*     */     //   2105: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   2108: astore #37
/*     */     //   2110: aload #25
/*     */     //   2112: invokeinterface endReplaceGroup : ()V
/*     */     //   2117: aload #37
/*     */     //   2119: astore #36
/*     */     //   2121: aload #16
/*     */     //   2123: aload_1
/*     */     //   2124: aload #35
/*     */     //   2126: aconst_null
/*     */     //   2127: iconst_0
/*     */     //   2128: aload #25
/*     */     //   2130: ldc_w 948314086
/*     */     //   2133: invokeinterface startReplaceGroup : (I)V
/*     */     //   2138: aload #25
/*     */     //   2140: astore #38
/*     */     //   2142: iload #31
/*     */     //   2144: ldc_w 458752
/*     */     //   2147: iand
/*     */     //   2148: ldc 131072
/*     */     //   2150: if_icmpne -> 2157
/*     */     //   2153: iconst_1
/*     */     //   2154: goto -> 2158
/*     */     //   2157: iconst_0
/*     */     //   2158: aload #25
/*     */     //   2160: aload #34
/*     */     //   2162: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2167: ior
/*     */     //   2168: istore #39
/*     */     //   2170: nop
/*     */     //   2171: iconst_0
/*     */     //   2172: istore #40
/*     */     //   2174: aload #38
/*     */     //   2176: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2181: astore #41
/*     */     //   2183: iconst_0
/*     */     //   2184: istore #42
/*     */     //   2186: iload #39
/*     */     //   2188: ifne -> 2202
/*     */     //   2191: aload #41
/*     */     //   2193: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2196: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2199: if_acmpne -> 2254
/*     */     //   2202: istore #58
/*     */     //   2204: astore #57
/*     */     //   2206: astore #56
/*     */     //   2208: astore #55
/*     */     //   2210: astore #54
/*     */     //   2212: iconst_0
/*     */     //   2213: istore #43
/*     */     //   2215: aload #18
/*     */     //   2217: aload #34
/*     */     //   2219: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   2224: astore #59
/*     */     //   2226: aload #54
/*     */     //   2228: aload #55
/*     */     //   2230: aload #56
/*     */     //   2232: aload #57
/*     */     //   2234: iload #58
/*     */     //   2236: aload #59
/*     */     //   2238: astore #44
/*     */     //   2240: aload #38
/*     */     //   2242: aload #44
/*     */     //   2244: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2249: aload #44
/*     */     //   2251: goto -> 2256
/*     */     //   2254: aload #41
/*     */     //   2256: nop
/*     */     //   2257: nop
/*     */     //   2258: nop
/*     */     //   2259: checkcast kotlin/jvm/functions/Function1
/*     */     //   2262: astore #37
/*     */     //   2264: aload #25
/*     */     //   2266: invokeinterface endReplaceGroup : ()V
/*     */     //   2271: aload #37
/*     */     //   2273: aconst_null
/*     */     //   2274: aconst_null
/*     */     //   2275: aconst_null
/*     */     //   2276: aload #21
/*     */     //   2278: aload #22
/*     */     //   2280: aload #36
/*     */     //   2282: aload #25
/*     */     //   2284: ldc_w 948323416
/*     */     //   2287: invokeinterface startReplaceGroup : (I)V
/*     */     //   2292: aload #25
/*     */     //   2294: astore #38
/*     */     //   2296: aload #25
/*     */     //   2298: aload #34
/*     */     //   2300: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2305: aload #25
/*     */     //   2307: aload #15
/*     */     //   2309: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2314: ior
/*     */     //   2315: iload #30
/*     */     //   2317: ldc_w 29360128
/*     */     //   2320: iand
/*     */     //   2321: ldc 8388608
/*     */     //   2323: if_icmpne -> 2330
/*     */     //   2326: iconst_1
/*     */     //   2327: goto -> 2331
/*     */     //   2330: iconst_0
/*     */     //   2331: ior
/*     */     //   2332: iload #31
/*     */     //   2334: bipush #14
/*     */     //   2336: iand
/*     */     //   2337: iconst_4
/*     */     //   2338: if_icmpne -> 2345
/*     */     //   2341: iconst_1
/*     */     //   2342: goto -> 2346
/*     */     //   2345: iconst_0
/*     */     //   2346: ior
/*     */     //   2347: iload #30
/*     */     //   2349: ldc_w 234881024
/*     */     //   2352: iand
/*     */     //   2353: ldc 67108864
/*     */     //   2355: if_icmpne -> 2362
/*     */     //   2358: iconst_1
/*     */     //   2359: goto -> 2363
/*     */     //   2362: iconst_0
/*     */     //   2363: ior
/*     */     //   2364: iload #30
/*     */     //   2366: ldc_w 57344
/*     */     //   2369: iand
/*     */     //   2370: sipush #16384
/*     */     //   2373: if_icmpne -> 2380
/*     */     //   2376: iconst_1
/*     */     //   2377: goto -> 2381
/*     */     //   2380: iconst_0
/*     */     //   2381: ior
/*     */     //   2382: iload #30
/*     */     //   2384: sipush #7168
/*     */     //   2387: iand
/*     */     //   2388: sipush #2048
/*     */     //   2391: if_icmpne -> 2398
/*     */     //   2394: iconst_1
/*     */     //   2395: goto -> 2399
/*     */     //   2398: iconst_0
/*     */     //   2399: ior
/*     */     //   2400: iload #30
/*     */     //   2402: ldc_w 458752
/*     */     //   2405: iand
/*     */     //   2406: ldc 131072
/*     */     //   2408: if_icmpne -> 2415
/*     */     //   2411: iconst_1
/*     */     //   2412: goto -> 2416
/*     */     //   2415: iconst_0
/*     */     //   2416: ior
/*     */     //   2417: iload #30
/*     */     //   2419: ldc_w 1879048192
/*     */     //   2422: iand
/*     */     //   2423: ldc 536870912
/*     */     //   2425: if_icmpne -> 2432
/*     */     //   2428: iconst_1
/*     */     //   2429: goto -> 2433
/*     */     //   2432: iconst_0
/*     */     //   2433: ior
/*     */     //   2434: iload #30
/*     */     //   2436: ldc_w 3670016
/*     */     //   2439: iand
/*     */     //   2440: ldc 1048576
/*     */     //   2442: if_icmpne -> 2449
/*     */     //   2445: iconst_1
/*     */     //   2446: goto -> 2450
/*     */     //   2449: iconst_0
/*     */     //   2450: ior
/*     */     //   2451: iload #31
/*     */     //   2453: ldc_w 234881024
/*     */     //   2456: iand
/*     */     //   2457: ldc 100663296
/*     */     //   2459: ixor
/*     */     //   2460: ldc 67108864
/*     */     //   2462: if_icmple -> 2477
/*     */     //   2465: aload #25
/*     */     //   2467: aload #22
/*     */     //   2469: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2474: ifne -> 2487
/*     */     //   2477: iload #31
/*     */     //   2479: ldc 100663296
/*     */     //   2481: iand
/*     */     //   2482: ldc 67108864
/*     */     //   2484: if_icmpne -> 2491
/*     */     //   2487: iconst_1
/*     */     //   2488: goto -> 2492
/*     */     //   2491: iconst_0
/*     */     //   2492: ior
/*     */     //   2493: aload #25
/*     */     //   2495: aload #33
/*     */     //   2497: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2502: ior
/*     */     //   2503: iload #31
/*     */     //   2505: ldc_w 3670016
/*     */     //   2508: iand
/*     */     //   2509: ldc 1572864
/*     */     //   2511: ixor
/*     */     //   2512: ldc 1048576
/*     */     //   2514: if_icmple -> 2529
/*     */     //   2517: aload #25
/*     */     //   2519: lload #19
/*     */     //   2521: invokeinterface changed : (J)Z
/*     */     //   2526: ifne -> 2539
/*     */     //   2529: iload #31
/*     */     //   2531: ldc 1572864
/*     */     //   2533: iand
/*     */     //   2534: ldc 1048576
/*     */     //   2536: if_icmpne -> 2543
/*     */     //   2539: iconst_1
/*     */     //   2540: goto -> 2544
/*     */     //   2543: iconst_0
/*     */     //   2544: ior
/*     */     //   2545: iload #30
/*     */     //   2547: sipush #896
/*     */     //   2550: iand
/*     */     //   2551: sipush #256
/*     */     //   2554: if_icmpne -> 2561
/*     */     //   2557: iconst_1
/*     */     //   2558: goto -> 2562
/*     */     //   2561: iconst_0
/*     */     //   2562: ior
/*     */     //   2563: iload #31
/*     */     //   2565: ldc_w 57344
/*     */     //   2568: iand
/*     */     //   2569: sipush #16384
/*     */     //   2572: if_icmpne -> 2579
/*     */     //   2575: iconst_1
/*     */     //   2576: goto -> 2580
/*     */     //   2579: iconst_0
/*     */     //   2580: ior
/*     */     //   2581: iload #31
/*     */     //   2583: ldc_w 1879048192
/*     */     //   2586: iand
/*     */     //   2587: ldc 536870912
/*     */     //   2589: if_icmpne -> 2596
/*     */     //   2592: iconst_1
/*     */     //   2593: goto -> 2597
/*     */     //   2596: iconst_0
/*     */     //   2597: ior
/*     */     //   2598: iload #31
/*     */     //   2600: bipush #112
/*     */     //   2602: iand
/*     */     //   2603: bipush #32
/*     */     //   2605: if_icmpne -> 2612
/*     */     //   2608: iconst_1
/*     */     //   2609: goto -> 2613
/*     */     //   2612: iconst_0
/*     */     //   2613: ior
/*     */     //   2614: iload #32
/*     */     //   2616: bipush #14
/*     */     //   2618: iand
/*     */     //   2619: iconst_4
/*     */     //   2620: if_icmpne -> 2627
/*     */     //   2623: iconst_1
/*     */     //   2624: goto -> 2628
/*     */     //   2627: iconst_0
/*     */     //   2628: ior
/*     */     //   2629: istore #39
/*     */     //   2631: nop
/*     */     //   2632: iconst_0
/*     */     //   2633: istore #40
/*     */     //   2635: aload #38
/*     */     //   2637: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2642: astore #41
/*     */     //   2644: iconst_0
/*     */     //   2645: istore #42
/*     */     //   2647: iload #39
/*     */     //   2649: ifne -> 2663
/*     */     //   2652: aload #41
/*     */     //   2654: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2657: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2660: if_acmpne -> 2773
/*     */     //   2663: astore #65
/*     */     //   2665: astore #64
/*     */     //   2667: astore #63
/*     */     //   2669: astore #62
/*     */     //   2671: astore #61
/*     */     //   2673: astore #60
/*     */     //   2675: astore #59
/*     */     //   2677: istore #58
/*     */     //   2679: astore #57
/*     */     //   2681: astore #56
/*     */     //   2683: astore #55
/*     */     //   2685: astore #54
/*     */     //   2687: iconst_0
/*     */     //   2688: istore #43
/*     */     //   2690: aload #34
/*     */     //   2692: aload #15
/*     */     //   2694: aload #10
/*     */     //   2696: fload #13
/*     */     //   2698: aload #11
/*     */     //   2700: lload #5
/*     */     //   2702: lload_3
/*     */     //   2703: lload #7
/*     */     //   2705: aload #12
/*     */     //   2707: fload #9
/*     */     //   2709: aload #22
/*     */     //   2711: aload #33
/*     */     //   2713: lload #19
/*     */     //   2715: aload_2
/*     */     //   2716: aload #17
/*     */     //   2718: fload #14
/*     */     //   2720: aload #24
/*     */     //   2722: aload #23
/*     */     //   2724: <illegal opcode> invoke : (Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Landroidx/compose/foundation/shape/CornerSize;FLandroidx/compose/foundation/layout/PaddingValues;JJJLandroidx/compose/foundation/layout/PaddingValues;FLorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lkotlinx/coroutines/CoroutineScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;)Lkotlin/jvm/functions/Function1;
/*     */     //   2729: astore #66
/*     */     //   2731: aload #54
/*     */     //   2733: aload #55
/*     */     //   2735: aload #56
/*     */     //   2737: aload #57
/*     */     //   2739: iload #58
/*     */     //   2741: aload #59
/*     */     //   2743: aload #60
/*     */     //   2745: aload #61
/*     */     //   2747: aload #62
/*     */     //   2749: aload #63
/*     */     //   2751: aload #64
/*     */     //   2753: aload #65
/*     */     //   2755: aload #66
/*     */     //   2757: astore #44
/*     */     //   2759: aload #38
/*     */     //   2761: aload #44
/*     */     //   2763: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2768: aload #44
/*     */     //   2770: goto -> 2775
/*     */     //   2773: aload #41
/*     */     //   2775: nop
/*     */     //   2776: nop
/*     */     //   2777: nop
/*     */     //   2778: checkcast kotlin/jvm/functions/Function1
/*     */     //   2781: astore #37
/*     */     //   2783: aload #25
/*     */     //   2785: invokeinterface endReplaceGroup : ()V
/*     */     //   2790: aload #37
/*     */     //   2792: aload #25
/*     */     //   2794: bipush #14
/*     */     //   2796: iload #31
/*     */     //   2798: bipush #9
/*     */     //   2800: ishr
/*     */     //   2801: iand
/*     */     //   2802: bipush #112
/*     */     //   2804: iload #30
/*     */     //   2806: iand
/*     */     //   2807: ior
/*     */     //   2808: ldc_w 1879048192
/*     */     //   2811: iload #31
/*     */     //   2813: bipush #6
/*     */     //   2815: ishl
/*     */     //   2816: iand
/*     */     //   2817: ior
/*     */     //   2818: bipush #48
/*     */     //   2820: bipush #14
/*     */     //   2822: iload #31
/*     */     //   2824: bipush #24
/*     */     //   2826: ishr
/*     */     //   2827: iand
/*     */     //   2828: ior
/*     */     //   2829: sipush #472
/*     */     //   2832: invokestatic SelectableLazyColumn : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
/*     */     //   2835: invokestatic isTraceInProgress : ()Z
/*     */     //   2838: ifeq -> 2854
/*     */     //   2841: invokestatic traceEventEnd : ()V
/*     */     //   2844: goto -> 2854
/*     */     //   2847: aload #25
/*     */     //   2849: invokeinterface skipToGroupEnd : ()V
/*     */     //   2854: aload #25
/*     */     //   2856: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2861: dup
/*     */     //   2862: ifnull -> 2924
/*     */     //   2865: aload_0
/*     */     //   2866: aload_1
/*     */     //   2867: aload_2
/*     */     //   2868: lload_3
/*     */     //   2869: lload #5
/*     */     //   2871: lload #7
/*     */     //   2873: fload #9
/*     */     //   2875: aload #10
/*     */     //   2877: aload #11
/*     */     //   2879: aload #12
/*     */     //   2881: fload #13
/*     */     //   2883: fload #14
/*     */     //   2885: aload #15
/*     */     //   2887: aload #16
/*     */     //   2889: aload #17
/*     */     //   2891: aload #18
/*     */     //   2893: lload #19
/*     */     //   2895: aload #21
/*     */     //   2897: aload #22
/*     */     //   2899: aload #23
/*     */     //   2901: aload #24
/*     */     //   2903: iload #26
/*     */     //   2905: iload #27
/*     */     //   2907: iload #28
/*     */     //   2909: iload #29
/*     */     //   2911: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lkotlin/jvm/functions/Function1;JJJFLandroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/PaddingValues;FFLorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;JLorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;IIII)Lkotlin/jvm/functions/Function2;
/*     */     //   2916: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2921: goto -> 2925
/*     */     //   2924: pop
/*     */     //   2925: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 61
/*     */     //   #76	-> 1221
/*     */     //   #87	-> 1234
/*     */     //   #88	-> 1262
/*     */     //   #91	-> 1278
/*     */     //   #92	-> 1308
/*     */     //   #93	-> 1333
/*     */     //   #325	-> 1352
/*     */     //   #326	-> 1364
/*     */     //   #327	-> 1375
/*     */     //   #93	-> 1378
/*     */     //   #327	-> 1387
/*     */     //   #328	-> 1389
/*     */     //   #329	-> 1398
/*     */     //   #330	-> 1403
/*     */     //   #326	-> 1405
/*     */     //   #325	-> 1406
/*     */     //   #325	-> 1407
/*     */     //   #93	-> 1408
/*     */     //   #96	-> 1527
/*     */     //   #97	-> 1533
/*     */     //   #331	-> 1543
/*     */     //   #332	-> 1546
/*     */     //   #334	-> 1548
/*     */     //   #335	-> 1556
/*     */     //   #336	-> 1569
/*     */     //   #337	-> 1581
/*     */     //   #338	-> 1592
/*     */     //   #339	-> 1595
/*     */     //   #340	-> 1595
/*     */     //   #341	-> 1598
/*     */     //   #340	-> 1601
/*     */     //   #339	-> 1609
/*     */     //   #338	-> 1620
/*     */     //   #342	-> 1622
/*     */     //   #343	-> 1631
/*     */     //   #344	-> 1636
/*     */     //   #337	-> 1638
/*     */     //   #336	-> 1639
/*     */     //   #336	-> 1640
/*     */     //   #335	-> 1641
/*     */     //   #345	-> 1655
/*     */     //   #331	-> 1664
/*     */     //   #345	-> 1669
/*     */     //   #97	-> 1670
/*     */     //   #100	-> 1672
/*     */     //   #346	-> 1732
/*     */     //   #347	-> 1744
/*     */     //   #348	-> 1760
/*     */     //   #100	-> 1763
/*     */     //   #349	-> 1775
/*     */     //   #350	-> 1794
/*     */     //   #351	-> 1822
/*     */     //   #100	-> 1832
/*     */     //   #351	-> 1842
/*     */     //   #352	-> 1844
/*     */     //   #354	-> 1855
/*     */     //   #349	-> 1860
/*     */     //   #100	-> 1861
/*     */     //   #348	-> 1862
/*     */     //   #355	-> 1864
/*     */     //   #356	-> 1873
/*     */     //   #357	-> 1878
/*     */     //   #347	-> 1880
/*     */     //   #346	-> 1881
/*     */     //   #346	-> 1882
/*     */     //   #100	-> 1883
/*     */     //   #99	-> 1897
/*     */     //   #102	-> 1915
/*     */     //   #358	-> 1926
/*     */     //   #359	-> 1938
/*     */     //   #360	-> 1954
/*     */     //   #103	-> 1957
/*     */     //   #104	-> 1959
/*     */     //   #105	-> 1964
/*     */     //   #106	-> 1967
/*     */     //   #107	-> 1982
/*     */     //   #108	-> 1985
/*     */     //   #103	-> 1988
/*     */     //   #110	-> 1994
/*     */     //   #360	-> 1998
/*     */     //   #361	-> 2000
/*     */     //   #362	-> 2009
/*     */     //   #363	-> 2014
/*     */     //   #359	-> 2016
/*     */     //   #358	-> 2017
/*     */     //   #358	-> 2018
/*     */     //   #114	-> 2027
/*     */     //   #121	-> 2051
/*     */     //   #364	-> 2055
/*     */     //   #365	-> 2067
/*     */     //   #366	-> 2078
/*     */     //   #121	-> 2081
/*     */     //   #366	-> 2084
/*     */     //   #367	-> 2086
/*     */     //   #368	-> 2095
/*     */     //   #369	-> 2100
/*     */     //   #365	-> 2102
/*     */     //   #364	-> 2103
/*     */     //   #364	-> 2104
/*     */     //   #121	-> 2105
/*     */     //   #113	-> 2121
/*     */     //   #115	-> 2123
/*     */     //   #114	-> 2124
/*     */     //   #118	-> 2170
/*     */     //   #370	-> 2174
/*     */     //   #371	-> 2186
/*     */     //   #372	-> 2202
/*     */     //   #118	-> 2215
/*     */     //   #372	-> 2238
/*     */     //   #373	-> 2240
/*     */     //   #374	-> 2249
/*     */     //   #375	-> 2254
/*     */     //   #371	-> 2256
/*     */     //   #370	-> 2257
/*     */     //   #370	-> 2258
/*     */     //   #118	-> 2259
/*     */     //   #116	-> 2276
/*     */     //   #117	-> 2278
/*     */     //   #121	-> 2280
/*     */     //   #122	-> 2631
/*     */     //   #376	-> 2635
/*     */     //   #377	-> 2647
/*     */     //   #378	-> 2663
/*     */     //   #122	-> 2690
/*     */     //   #378	-> 2757
/*     */     //   #379	-> 2759
/*     */     //   #380	-> 2768
/*     */     //   #381	-> 2773
/*     */     //   #377	-> 2775
/*     */     //   #376	-> 2776
/*     */     //   #376	-> 2777
/*     */     //   #122	-> 2778
/*     */     //   #112	-> 2832
/*     */     //   #191	-> 2847
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1378	9	39	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$1	I
/*     */     //   1389	11	40	value$iv	Ljava/lang/Object;
/*     */     //   1364	42	38	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1361	45	37	it$iv	Ljava/lang/Object;
/*     */     //   1352	56	36	$i$f$cache	I
/*     */     //   1349	59	34	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1349	59	35	invalid$iv	Z
/*     */     //   1598	3	44	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   1595	25	43	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   1622	11	44	value$iv$iv	Ljava/lang/Object;
/*     */     //   1581	58	42	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   1578	61	41	it$iv$iv	Ljava/lang/Object;
/*     */     //   1569	72	40	$i$f$cache	I
/*     */     //   1566	75	38	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1566	75	39	invalid$iv$iv	Z
/*     */     //   1537	133	36	$i$f$rememberCoroutineScope	I
/*     */     //   1550	120	37	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1655	15	46	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   1534	136	35	$changed$iv	I
/*     */     //   1832	10	52	$i$a$-flatMap-BasicLazyTreeKt$BasicLazyTree$flattenedTree$1$1	I
/*     */     //   1829	13	51	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   1844	8	51	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   1822	30	50	element$iv$iv	Ljava/lang/Object;
/*     */     //   1794	63	48	$i$f$flatMapTo	I
/*     */     //   1791	66	46	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1791	66	47	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1775	86	45	$i$f$flatMap	I
/*     */     //   1772	89	44	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   1763	99	43	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$flattenedTree$1	I
/*     */     //   1864	11	53	value$iv	Ljava/lang/Object;
/*     */     //   1744	137	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1741	140	41	it$iv	Ljava/lang/Object;
/*     */     //   1732	151	40	$i$f$cache	I
/*     */     //   1729	154	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1729	154	39	invalid$iv	Z
/*     */     //   1957	38	40	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$2	I
/*     */     //   2000	11	41	value$iv	Ljava/lang/Object;
/*     */     //   1938	79	39	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1935	82	38	it$iv	Ljava/lang/Object;
/*     */     //   1926	93	37	$i$f$cache	I
/*     */     //   1923	96	35	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1923	96	36	invalid$iv	Z
/*     */     //   2081	3	43	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$3	I
/*     */     //   2086	11	43	value$iv	Ljava/lang/Object;
/*     */     //   2067	36	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2064	39	41	it$iv	Ljava/lang/Object;
/*     */     //   2055	50	40	$i$f$cache	I
/*     */     //   2052	53	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2052	53	39	invalid$iv	Z
/*     */     //   2215	9	43	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$4	I
/*     */     //   2240	11	44	value$iv	Ljava/lang/Object;
/*     */     //   2186	71	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2183	74	41	it$iv	Ljava/lang/Object;
/*     */     //   2174	85	40	$i$f$cache	I
/*     */     //   2171	88	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2171	88	39	invalid$iv	Z
/*     */     //   2690	39	43	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5	I
/*     */     //   2759	11	44	value$iv	Ljava/lang/Object;
/*     */     //   2647	129	42	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2644	132	41	it$iv	Ljava/lang/Object;
/*     */     //   2635	143	40	$i$f$cache	I
/*     */     //   2632	146	38	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2632	146	39	invalid$iv	Z
/*     */     //   1672	1172	33	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1899	945	34	flattenedTree	Ljava/util/List;
/*     */     //   76	2850	30	$dirty	I
/*     */     //   80	2846	31	$dirty1	I
/*     */     //   84	2842	32	$dirty2	I
/*     */     //   0	2926	0	tree	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree;
/*     */     //   0	2926	1	selectionMode	Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   0	2926	2	onElementClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2926	3	elementBackgroundFocused	J
/*     */     //   0	2926	5	elementBackgroundSelectedFocused	J
/*     */     //   0	2926	7	elementBackgroundSelected	J
/*     */     //   0	2926	9	indentSize	F
/*     */     //   0	2926	10	elementBackgroundCornerSize	Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   0	2926	11	elementPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	2926	12	elementContentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	2926	13	elementMinHeight	F
/*     */     //   0	2926	14	chevronContentGap	F
/*     */     //   0	2926	15	treeState	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */     //   0	2926	16	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2926	17	onElementDoubleClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2926	18	onSelectionChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2926	19	platformDoubleClickDelay	J
/*     */     //   0	2926	21	keyActions	Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;
/*     */     //   0	2926	22	pointerEventScopedActions	Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */     //   0	2926	23	chevronContent	Lkotlin/jvm/functions/Function3;
/*     */     //   0	2926	24	nodeContent	Lkotlin/jvm/functions/Function4;
/*     */     //   0	2926	25	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2926	26	$changed	I
/*     */     //   0	2926	27	$changed1	I
/*     */     //   0	2926	28	$changed2	I
/*     */   }
/*     */   
/*     */   private static final boolean BasicLazyTree_orM9XXQ$lambda$5$lambda$3(TreeState $treeState, Tree.Element it) {
/* 106 */     Intrinsics.checkNotNullParameter(it, "it"); return $treeState.getDelegate$foundation().getSelectedKeys().contains(it.getId()); } private static final Tree.Element BasicLazyTree_orM9XXQ$lambda$5$lambda$4(Tree.Element element) {
/* 107 */     Intrinsics.checkNotNullParameter(element, "element"); return element;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit BasicLazyTree_orM9XXQ$lambda$9$lambda$8(Function1 $onSelectionChange, List $flattenedTree, List it) {
/* 119 */     Intrinsics.checkNotNullParameter(it, "it"); List list1 = it; Function1 function1 = $onSelectionChange; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 403 */     List list2 = list1; Collection<Tree.Element> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 404 */     for (Object item$iv$iv : list2) {
/* 405 */       int i = ((Number)item$iv$iv).intValue(); Collection<Tree.Element> collection = destination$iv$iv; int $i$a$-map-BasicLazyTreeKt$BasicLazyTree$4$1$1 = 0; Intrinsics.checkNotNull($flattenedTree.get(i), "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.tree.Tree.Element<T of org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTreeKt.BasicLazyTree>"); collection.add((Tree.Element)$flattenedTree.get(i));
/* 406 */     }  function1.invoke(destination$iv$iv);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   private static final Object BasicLazyTree_orM9XXQ$lambda$13$lambda$12$lambda$10(int paramInt, Tree.Element item) {
/*     */     Intrinsics.checkNotNullParameter(item, "item");
/*     */     return item.getId();
/*     */   }
/*     */   private static final Object BasicLazyTree_orM9XXQ$lambda$13$lambda$12$lambda$11(int paramInt, Tree.Element item) {
/*     */     Intrinsics.checkNotNullParameter(item, "item");
/*     */     return item.getData();
/*     */   }
/*     */   
/*     */   private static final Unit BasicLazyTree_orM9XXQ$lambda$13$lambda$12(List<? extends Tree.Element<?>> $flattenedTree, TreeState $treeState, CornerSize $elementBackgroundCornerSize, float $elementMinHeight, PaddingValues $elementPadding, long $elementBackgroundSelectedFocused, long $elementBackgroundFocused, long $elementBackgroundSelected, PaddingValues $elementContentPadding, float $indentSize, PointerEventActions $pointerEventScopedActions, CoroutineScope $scope, long $platformDoubleClickDelay, Function1<? super Tree.Element<T>, Unit> $onElementClick, Function1<? super Tree.Element<T>, Unit> $onElementDoubleClick, float $chevronContentGap, Function4<? super SelectableLazyItemScope, ? super Tree.Element<T>, ? super Composer, ? super Integer, Unit> $nodeContent, Function3<? super TreeElementState, ? super Composer, ? super Integer, Unit> $chevronContent, SelectableLazyListScope $this$SelectableLazyColumn) {
/*     */     Intrinsics.checkNotNullParameter($this$SelectableLazyColumn, "$this$SelectableLazyColumn");
/*     */     SelectableLazyListScopeKt.itemsIndexed$default($this$SelectableLazyColumn, $flattenedTree, BasicLazyTreeKt::BasicLazyTree_orM9XXQ$lambda$13$lambda$12$lambda$10, BasicLazyTreeKt::BasicLazyTree_orM9XXQ$lambda$13$lambda$12$lambda$11, null, (Function5)ComposableLambdaKt.composableLambdaInstance(-1276486766, true, new BasicLazyTreeKt$BasicLazyTree$5$1$3($flattenedTree, $treeState, $elementBackgroundCornerSize, $elementMinHeight, $elementPadding, $elementBackgroundSelectedFocused, $elementBackgroundFocused, $elementBackgroundSelected, $elementContentPadding, $indentSize, $pointerEventScopedActions, $scope, $platformDoubleClickDelay, $onElementClick, $onElementDoubleClick, $chevronContentGap, $nodeContent, $chevronContent)), 8, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nBasicLazyTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,324:1\n1#2:325\n1225#3,6:326\n1225#3,6:333\n1225#3,6:375\n1225#3,6:381\n169#4:332\n99#5:339\n96#5,6:340\n102#5:374\n106#5:430\n79#6,6:346\n86#6,4:361\n90#6,2:371\n79#6,6:394\n86#6,4:409\n90#6,2:419\n94#6:425\n94#6:429\n368#7,9:352\n377#7:373\n368#7,9:400\n377#7:421\n378#7,2:423\n378#7,2:427\n4034#8,6:365\n4034#8,6:413\n71#9:387\n68#9,6:388\n74#9:422\n78#9:426\n81#10:431\n*S KotlinDebug\n*F\n+ 1 BasicLazyTree.kt\norg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3\n*L\n133#1:326,6\n161#1:333,6\n176#1:375,6\n178#1:381,6\n160#1:332\n147#1:339\n147#1:340,6\n147#1:374\n147#1:430\n147#1:346,6\n147#1:361,4\n147#1:371,2\n173#1:394,6\n173#1:409,4\n173#1:419,2\n173#1:425\n147#1:429\n147#1:352,9\n147#1:373\n173#1:400,9\n173#1:421\n173#1:423,2\n147#1:427,2\n147#1:365,6\n173#1:413,6\n173#1:387\n173#1:388,6\n173#1:422\n173#1:426\n133#1:431\n*E\n"})
/*     */   static final class BasicLazyTreeKt$BasicLazyTree$5$1$3 implements Function5<SelectableLazyItemScope, Integer, Tree.Element<?>, Composer, Integer, Unit> { private static final RoundedCornerShape invoke$lambda$5(State $backgroundShape$delegate) {
/*     */       State state = $backgroundShape$delegate;
/*     */       Object object = null;
/*     */       KProperty property$iv = null;
/*     */       int $i$f$getValue = 0;
/* 431 */       return (RoundedCornerShape)state.getValue();
/*     */     }
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(SelectableLazyItemScope $this$itemsIndexed, int index, Tree.Element element, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$itemsIndexed'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_3
/*     */       //   7: ldc 'element'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: iload #5
/*     */       //   14: istore #6
/*     */       //   16: iload #5
/*     */       //   18: bipush #6
/*     */       //   20: iand
/*     */       //   21: ifne -> 45
/*     */       //   24: iload #6
/*     */       //   26: aload #4
/*     */       //   28: aload_1
/*     */       //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   34: ifeq -> 41
/*     */       //   37: iconst_4
/*     */       //   38: goto -> 42
/*     */       //   41: iconst_2
/*     */       //   42: ior
/*     */       //   43: istore #6
/*     */       //   45: iload #5
/*     */       //   47: bipush #48
/*     */       //   49: iand
/*     */       //   50: ifne -> 76
/*     */       //   53: iload #6
/*     */       //   55: aload #4
/*     */       //   57: iload_2
/*     */       //   58: invokeinterface changed : (I)Z
/*     */       //   63: ifeq -> 71
/*     */       //   66: bipush #32
/*     */       //   68: goto -> 73
/*     */       //   71: bipush #16
/*     */       //   73: ior
/*     */       //   74: istore #6
/*     */       //   76: iload #5
/*     */       //   78: sipush #384
/*     */       //   81: iand
/*     */       //   82: ifne -> 130
/*     */       //   85: iload #6
/*     */       //   87: iload #5
/*     */       //   89: sipush #512
/*     */       //   92: iand
/*     */       //   93: ifne -> 107
/*     */       //   96: aload #4
/*     */       //   98: aload_3
/*     */       //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   104: goto -> 115
/*     */       //   107: aload #4
/*     */       //   109: aload_3
/*     */       //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   115: ifeq -> 124
/*     */       //   118: sipush #256
/*     */       //   121: goto -> 127
/*     */       //   124: sipush #128
/*     */       //   127: ior
/*     */       //   128: istore #6
/*     */       //   130: iload #6
/*     */       //   132: sipush #1171
/*     */       //   135: iand
/*     */       //   136: sipush #1170
/*     */       //   139: if_icmpne -> 152
/*     */       //   142: aload #4
/*     */       //   144: invokeinterface getSkipping : ()Z
/*     */       //   149: ifne -> 2109
/*     */       //   152: invokestatic isTraceInProgress : ()Z
/*     */       //   155: ifeq -> 168
/*     */       //   158: ldc -1276486766
/*     */       //   160: iload #6
/*     */       //   162: iconst_m1
/*     */       //   163: ldc 'org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTree.<anonymous>.<anonymous>.<anonymous> (BasicLazyTree.kt:125)'
/*     */       //   165: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   168: getstatic org/jetbrains/jewel/foundation/lazy/tree/TreeElementState.Companion : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState$Companion;
/*     */       //   171: astore #9
/*     */       //   173: aload_1
/*     */       //   174: invokeinterface isActive : ()Z
/*     */       //   179: istore #10
/*     */       //   181: aload_1
/*     */       //   182: invokeinterface isSelected : ()Z
/*     */       //   187: istore #11
/*     */       //   189: aload_3
/*     */       //   190: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   193: ifeq -> 203
/*     */       //   196: aload_3
/*     */       //   197: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   200: goto -> 204
/*     */       //   203: aconst_null
/*     */       //   204: dup
/*     */       //   205: ifnull -> 242
/*     */       //   208: astore #15
/*     */       //   210: aload_0
/*     */       //   211: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   214: astore #16
/*     */       //   216: aload #15
/*     */       //   218: astore #17
/*     */       //   220: iconst_0
/*     */       //   221: istore #18
/*     */       //   223: aload #16
/*     */       //   225: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*     */       //   228: aload #17
/*     */       //   230: invokevirtual getId : ()Ljava/lang/Object;
/*     */       //   233: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   238: nop
/*     */       //   239: goto -> 244
/*     */       //   242: pop
/*     */       //   243: iconst_0
/*     */       //   244: istore #12
/*     */       //   246: aload #9
/*     */       //   248: iconst_0
/*     */       //   249: iconst_0
/*     */       //   250: iload #12
/*     */       //   252: iconst_0
/*     */       //   253: iconst_0
/*     */       //   254: iload #10
/*     */       //   256: iload #11
/*     */       //   258: bipush #27
/*     */       //   260: aconst_null
/*     */       //   261: invokestatic of-do3-xvo$default : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState$Companion;ZZZZZZZILjava/lang/Object;)J
/*     */       //   264: lstore #7
/*     */       //   266: aload #4
/*     */       //   268: ldc 1816165175
/*     */       //   270: invokeinterface startReplaceGroup : (I)V
/*     */       //   275: aload #4
/*     */       //   277: astore #11
/*     */       //   279: aload #4
/*     */       //   281: aload_0
/*     */       //   282: getfield $flattenedTree : Ljava/util/List;
/*     */       //   285: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   290: iload #6
/*     */       //   292: bipush #112
/*     */       //   294: iand
/*     */       //   295: bipush #32
/*     */       //   297: if_icmpne -> 304
/*     */       //   300: iconst_1
/*     */       //   301: goto -> 305
/*     */       //   304: iconst_0
/*     */       //   305: ior
/*     */       //   306: aload #4
/*     */       //   308: aload_0
/*     */       //   309: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   312: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   317: ior
/*     */       //   318: aload #4
/*     */       //   320: aload_0
/*     */       //   321: getfield $elementBackgroundCornerSize : Landroidx/compose/foundation/shape/CornerSize;
/*     */       //   324: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   329: ior
/*     */       //   330: istore #12
/*     */       //   332: aload_0
/*     */       //   333: getfield $flattenedTree : Ljava/util/List;
/*     */       //   336: astore #13
/*     */       //   338: aload_0
/*     */       //   339: getfield $elementBackgroundCornerSize : Landroidx/compose/foundation/shape/CornerSize;
/*     */       //   342: astore #14
/*     */       //   344: aload_0
/*     */       //   345: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   348: astore #15
/*     */       //   350: iconst_0
/*     */       //   351: istore #16
/*     */       //   353: aload #11
/*     */       //   355: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   360: astore #17
/*     */       //   362: iconst_0
/*     */       //   363: istore #18
/*     */       //   365: iload #12
/*     */       //   367: ifne -> 381
/*     */       //   370: aload #17
/*     */       //   372: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   375: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   378: if_acmpne -> 412
/*     */       //   381: iconst_0
/*     */       //   382: istore #19
/*     */       //   384: aload #13
/*     */       //   386: iload_2
/*     */       //   387: aload #14
/*     */       //   389: aload #15
/*     */       //   391: <illegal opcode> invoke : (Ljava/util/List;ILandroidx/compose/foundation/shape/CornerSize;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lkotlin/jvm/functions/Function0;
/*     */       //   396: astore #20
/*     */       //   398: aload #11
/*     */       //   400: aload #20
/*     */       //   402: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   407: aload #20
/*     */       //   409: goto -> 414
/*     */       //   412: aload #17
/*     */       //   414: nop
/*     */       //   415: nop
/*     */       //   416: nop
/*     */       //   417: checkcast kotlin/jvm/functions/Function0
/*     */       //   420: astore #10
/*     */       //   422: aload #4
/*     */       //   424: invokeinterface endReplaceGroup : ()V
/*     */       //   429: aload #10
/*     */       //   431: invokestatic derivedStateOf : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;
/*     */       //   434: astore #9
/*     */       //   436: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   439: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   442: astore #10
/*     */       //   444: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   447: checkcast androidx/compose/ui/Modifier
/*     */       //   450: fconst_0
/*     */       //   451: aload_0
/*     */       //   452: getfield $elementMinHeight : F
/*     */       //   455: iconst_1
/*     */       //   456: aconst_null
/*     */       //   457: invokestatic defaultMinSize-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   460: aload_0
/*     */       //   461: getfield $elementPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */       //   464: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */       //   467: lload #7
/*     */       //   469: aload_0
/*     */       //   470: getfield $elementBackgroundSelectedFocused : J
/*     */       //   473: aload_0
/*     */       //   474: getfield $elementBackgroundFocused : J
/*     */       //   477: aload_0
/*     */       //   478: getfield $elementBackgroundSelected : J
/*     */       //   481: aload #9
/*     */       //   483: invokestatic invoke$lambda$5 : (Landroidx/compose/runtime/State;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */       //   486: invokestatic access$elementBackground-61ZKQAw : (Landroidx/compose/ui/Modifier;JJJJLandroidx/compose/foundation/shape/RoundedCornerShape;)Landroidx/compose/ui/Modifier;
/*     */       //   489: aload_0
/*     */       //   490: getfield $elementContentPadding : Landroidx/compose/foundation/layout/PaddingValues;
/*     */       //   493: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */       //   496: aload_3
/*     */       //   497: invokeinterface getDepth : ()I
/*     */       //   502: i2f
/*     */       //   503: aload_0
/*     */       //   504: getfield $indentSize : F
/*     */       //   507: fmul
/*     */       //   508: fstore #12
/*     */       //   510: iconst_0
/*     */       //   511: istore #13
/*     */       //   513: fload #12
/*     */       //   515: invokestatic constructor-impl : (F)F
/*     */       //   518: fconst_0
/*     */       //   519: fconst_0
/*     */       //   520: fconst_0
/*     */       //   521: bipush #14
/*     */       //   523: aconst_null
/*     */       //   524: invokestatic padding-qDBjuR0$default : (Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   527: aload #4
/*     */       //   529: ldc_w 1816216064
/*     */       //   532: invokeinterface startReplaceGroup : (I)V
/*     */       //   537: aload #4
/*     */       //   539: astore #13
/*     */       //   541: iconst_0
/*     */       //   542: istore #14
/*     */       //   544: nop
/*     */       //   545: iconst_0
/*     */       //   546: istore #15
/*     */       //   548: aload #13
/*     */       //   550: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   555: astore #16
/*     */       //   557: iconst_0
/*     */       //   558: istore #17
/*     */       //   560: aload #16
/*     */       //   562: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   565: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   568: if_acmpne -> 598
/*     */       //   571: astore #76
/*     */       //   573: iconst_0
/*     */       //   574: istore #18
/*     */       //   576: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   579: aload #76
/*     */       //   581: swap
/*     */       //   582: astore #18
/*     */       //   584: aload #13
/*     */       //   586: aload #18
/*     */       //   588: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   593: aload #18
/*     */       //   595: goto -> 600
/*     */       //   598: aload #16
/*     */       //   600: nop
/*     */       //   601: nop
/*     */       //   602: nop
/*     */       //   603: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */       //   606: astore #12
/*     */       //   608: aload #4
/*     */       //   610: invokeinterface endReplaceGroup : ()V
/*     */       //   615: aload #12
/*     */       //   617: aconst_null
/*     */       //   618: iconst_0
/*     */       //   619: aconst_null
/*     */       //   620: aconst_null
/*     */       //   621: aload #4
/*     */       //   623: ldc_w 1816218567
/*     */       //   626: invokeinterface startReplaceGroup : (I)V
/*     */       //   631: aload #4
/*     */       //   633: astore #13
/*     */       //   635: aload #4
/*     */       //   637: aload_0
/*     */       //   638: getfield $pointerEventScopedActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */       //   641: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   646: aload #4
/*     */       //   648: aload_0
/*     */       //   649: getfield $flattenedTree : Ljava/util/List;
/*     */       //   652: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   657: ior
/*     */       //   658: iload #6
/*     */       //   660: bipush #112
/*     */       //   662: iand
/*     */       //   663: bipush #32
/*     */       //   665: if_icmpne -> 672
/*     */       //   668: iconst_1
/*     */       //   669: goto -> 673
/*     */       //   672: iconst_0
/*     */       //   673: ior
/*     */       //   674: aload #4
/*     */       //   676: aload_0
/*     */       //   677: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   680: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   685: ior
/*     */       //   686: aload #4
/*     */       //   688: aload_0
/*     */       //   689: getfield $platformDoubleClickDelay : J
/*     */       //   692: invokeinterface changed : (J)Z
/*     */       //   697: ior
/*     */       //   698: aload #4
/*     */       //   700: aload_0
/*     */       //   701: getfield $onElementClick : Lkotlin/jvm/functions/Function1;
/*     */       //   704: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   709: ior
/*     */       //   710: aload #4
/*     */       //   712: aload_0
/*     */       //   713: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */       //   716: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   721: ior
/*     */       //   722: aload #4
/*     */       //   724: aload_0
/*     */       //   725: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   728: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   733: ior
/*     */       //   734: istore #14
/*     */       //   736: aload_0
/*     */       //   737: getfield $pointerEventScopedActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */       //   740: astore #15
/*     */       //   742: aload_0
/*     */       //   743: getfield $flattenedTree : Ljava/util/List;
/*     */       //   746: astore #16
/*     */       //   748: aload_0
/*     */       //   749: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */       //   752: astore #17
/*     */       //   754: aload_0
/*     */       //   755: getfield $platformDoubleClickDelay : J
/*     */       //   758: lstore #18
/*     */       //   760: aload_0
/*     */       //   761: getfield $onElementClick : Lkotlin/jvm/functions/Function1;
/*     */       //   764: astore #20
/*     */       //   766: aload_0
/*     */       //   767: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */       //   770: astore #21
/*     */       //   772: aload_0
/*     */       //   773: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   776: astore #22
/*     */       //   778: iconst_0
/*     */       //   779: istore #23
/*     */       //   781: aload #13
/*     */       //   783: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   788: astore #24
/*     */       //   790: iconst_0
/*     */       //   791: istore #25
/*     */       //   793: iload #14
/*     */       //   795: ifne -> 809
/*     */       //   798: aload #24
/*     */       //   800: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   803: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   806: if_acmpne -> 876
/*     */       //   809: astore #81
/*     */       //   811: astore #80
/*     */       //   813: istore #79
/*     */       //   815: astore #78
/*     */       //   817: astore #77
/*     */       //   819: astore #76
/*     */       //   821: iconst_0
/*     */       //   822: istore #26
/*     */       //   824: aload #15
/*     */       //   826: aload #16
/*     */       //   828: iload_2
/*     */       //   829: aload #17
/*     */       //   831: lload #18
/*     */       //   833: aload #20
/*     */       //   835: aload #21
/*     */       //   837: aload #22
/*     */       //   839: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Ljava/util/List;ILkotlinx/coroutines/CoroutineScope;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Lkotlin/jvm/functions/Function0;
/*     */       //   844: astore #82
/*     */       //   846: aload #76
/*     */       //   848: aload #77
/*     */       //   850: aload #78
/*     */       //   852: iload #79
/*     */       //   854: aload #80
/*     */       //   856: aload #81
/*     */       //   858: aload #82
/*     */       //   860: astore #27
/*     */       //   862: aload #13
/*     */       //   864: aload #27
/*     */       //   866: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   871: aload #27
/*     */       //   873: goto -> 878
/*     */       //   876: aload #24
/*     */       //   878: nop
/*     */       //   879: nop
/*     */       //   880: nop
/*     */       //   881: checkcast kotlin/jvm/functions/Function0
/*     */       //   884: astore #12
/*     */       //   886: aload #4
/*     */       //   888: invokeinterface endReplaceGroup : ()V
/*     */       //   893: aload #12
/*     */       //   895: bipush #28
/*     */       //   897: aconst_null
/*     */       //   898: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   901: astore #11
/*     */       //   903: aload_0
/*     */       //   904: getfield $treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */       //   907: astore #13
/*     */       //   909: aload_0
/*     */       //   910: getfield $onElementDoubleClick : Lkotlin/jvm/functions/Function1;
/*     */       //   913: astore #14
/*     */       //   915: aload_0
/*     */       //   916: getfield $chevronContentGap : F
/*     */       //   919: fstore #15
/*     */       //   921: aload_0
/*     */       //   922: getfield $nodeContent : Lkotlin/jvm/functions/Function4;
/*     */       //   925: astore #16
/*     */       //   927: aload_0
/*     */       //   928: getfield $chevronContent : Lkotlin/jvm/functions/Function3;
/*     */       //   931: astore #17
/*     */       //   933: sipush #384
/*     */       //   936: istore #18
/*     */       //   938: iconst_0
/*     */       //   939: istore #19
/*     */       //   941: aload #4
/*     */       //   943: ldc_w 693286680
/*     */       //   946: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   949: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   952: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   955: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   958: astore #12
/*     */       //   960: aload #12
/*     */       //   962: aload #10
/*     */       //   964: aload #4
/*     */       //   966: bipush #14
/*     */       //   968: iload #18
/*     */       //   970: iconst_3
/*     */       //   971: ishr
/*     */       //   972: iand
/*     */       //   973: bipush #112
/*     */       //   975: iload #18
/*     */       //   977: iconst_3
/*     */       //   978: ishr
/*     */       //   979: iand
/*     */       //   980: ior
/*     */       //   981: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   984: astore #20
/*     */       //   986: bipush #112
/*     */       //   988: iload #18
/*     */       //   990: iconst_3
/*     */       //   991: ishl
/*     */       //   992: iand
/*     */       //   993: istore #21
/*     */       //   995: nop
/*     */       //   996: iconst_0
/*     */       //   997: istore #22
/*     */       //   999: aload #4
/*     */       //   1001: ldc_w -1323940314
/*     */       //   1004: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   1007: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1010: aload #4
/*     */       //   1012: iconst_0
/*     */       //   1013: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   1016: istore #23
/*     */       //   1018: aload #4
/*     */       //   1020: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1025: astore #24
/*     */       //   1027: aload #4
/*     */       //   1029: aload #11
/*     */       //   1031: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   1034: astore #25
/*     */       //   1036: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1039: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1042: astore #26
/*     */       //   1044: bipush #6
/*     */       //   1046: sipush #896
/*     */       //   1049: iload #21
/*     */       //   1051: bipush #6
/*     */       //   1053: ishl
/*     */       //   1054: iand
/*     */       //   1055: ior
/*     */       //   1056: istore #27
/*     */       //   1058: nop
/*     */       //   1059: iconst_0
/*     */       //   1060: istore #28
/*     */       //   1062: aload #4
/*     */       //   1064: ldc_w -692256719
/*     */       //   1067: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   1070: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1073: aload #4
/*     */       //   1075: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   1080: instanceof androidx/compose/runtime/Applier
/*     */       //   1083: ifne -> 1089
/*     */       //   1086: invokestatic invalidApplier : ()V
/*     */       //   1089: aload #4
/*     */       //   1091: invokeinterface startReusableNode : ()V
/*     */       //   1096: aload #4
/*     */       //   1098: invokeinterface getInserting : ()Z
/*     */       //   1103: ifeq -> 1118
/*     */       //   1106: aload #4
/*     */       //   1108: aload #26
/*     */       //   1110: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   1115: goto -> 1125
/*     */       //   1118: aload #4
/*     */       //   1120: invokeinterface useNode : ()V
/*     */       //   1125: aload #4
/*     */       //   1127: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   1130: astore #29
/*     */       //   1132: iconst_0
/*     */       //   1133: istore #30
/*     */       //   1135: aload #29
/*     */       //   1137: aload #20
/*     */       //   1139: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1142: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1145: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1148: aload #29
/*     */       //   1150: aload #24
/*     */       //   1152: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1155: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1158: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1161: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1164: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1167: astore #31
/*     */       //   1169: iconst_0
/*     */       //   1170: istore #32
/*     */       //   1172: aload #29
/*     */       //   1174: astore #33
/*     */       //   1176: iconst_0
/*     */       //   1177: istore #34
/*     */       //   1179: aload #33
/*     */       //   1181: invokeinterface getInserting : ()Z
/*     */       //   1186: ifne -> 1207
/*     */       //   1189: aload #33
/*     */       //   1191: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1196: iload #23
/*     */       //   1198: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1201: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1204: ifne -> 1233
/*     */       //   1207: aload #33
/*     */       //   1209: iload #23
/*     */       //   1211: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1214: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1219: aload #29
/*     */       //   1221: iload #23
/*     */       //   1223: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1226: aload #31
/*     */       //   1228: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1233: nop
/*     */       //   1234: nop
/*     */       //   1235: nop
/*     */       //   1236: aload #29
/*     */       //   1238: aload #25
/*     */       //   1240: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1243: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1246: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1249: nop
/*     */       //   1250: nop
/*     */       //   1251: aload #4
/*     */       //   1253: bipush #14
/*     */       //   1255: iload #27
/*     */       //   1257: bipush #6
/*     */       //   1259: ishr
/*     */       //   1260: iand
/*     */       //   1261: istore #35
/*     */       //   1263: astore #36
/*     */       //   1265: iconst_0
/*     */       //   1266: istore #37
/*     */       //   1268: aload #36
/*     */       //   1270: ldc_w -407840262
/*     */       //   1273: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   1276: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1279: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   1282: aload #36
/*     */       //   1284: bipush #6
/*     */       //   1286: bipush #112
/*     */       //   1288: iload #18
/*     */       //   1290: bipush #6
/*     */       //   1292: ishr
/*     */       //   1293: iand
/*     */       //   1294: ior
/*     */       //   1295: istore #38
/*     */       //   1297: astore #39
/*     */       //   1299: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   1302: astore #40
/*     */       //   1304: iconst_0
/*     */       //   1305: istore #41
/*     */       //   1307: aload #39
/*     */       //   1309: ldc_w -1690594694
/*     */       //   1312: invokeinterface startReplaceGroup : (I)V
/*     */       //   1317: aload_3
/*     */       //   1318: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */       //   1321: ifeq -> 2039
/*     */       //   1324: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   1327: checkcast androidx/compose/ui/Modifier
/*     */       //   1330: aload #39
/*     */       //   1332: ldc_w -1690589057
/*     */       //   1335: invokeinterface startReplaceGroup : (I)V
/*     */       //   1340: aload #39
/*     */       //   1342: astore #42
/*     */       //   1344: iconst_0
/*     */       //   1345: istore #43
/*     */       //   1347: nop
/*     */       //   1348: iconst_0
/*     */       //   1349: istore #44
/*     */       //   1351: aload #42
/*     */       //   1353: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1358: astore #45
/*     */       //   1360: iconst_0
/*     */       //   1361: istore #46
/*     */       //   1363: aload #45
/*     */       //   1365: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1368: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1371: if_acmpne -> 1401
/*     */       //   1374: astore #47
/*     */       //   1376: iconst_0
/*     */       //   1377: istore #48
/*     */       //   1379: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   1382: aload #47
/*     */       //   1384: swap
/*     */       //   1385: astore #48
/*     */       //   1387: aload #42
/*     */       //   1389: aload #48
/*     */       //   1391: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1396: aload #48
/*     */       //   1398: goto -> 1403
/*     */       //   1401: aload #45
/*     */       //   1403: nop
/*     */       //   1404: nop
/*     */       //   1405: nop
/*     */       //   1406: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */       //   1409: astore #49
/*     */       //   1411: aload #39
/*     */       //   1413: invokeinterface endReplaceGroup : ()V
/*     */       //   1418: aload #49
/*     */       //   1420: aconst_null
/*     */       //   1421: iconst_0
/*     */       //   1422: aconst_null
/*     */       //   1423: aconst_null
/*     */       //   1424: aload #39
/*     */       //   1426: ldc_w -1690585015
/*     */       //   1429: invokeinterface startReplaceGroup : (I)V
/*     */       //   1434: aload #39
/*     */       //   1436: astore #42
/*     */       //   1438: aload #4
/*     */       //   1440: aload #13
/*     */       //   1442: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   1447: iload #6
/*     */       //   1449: sipush #896
/*     */       //   1452: iand
/*     */       //   1453: sipush #256
/*     */       //   1456: if_icmpeq -> 1479
/*     */       //   1459: iload #6
/*     */       //   1461: sipush #512
/*     */       //   1464: iand
/*     */       //   1465: ifeq -> 1483
/*     */       //   1468: aload #4
/*     */       //   1470: aload_3
/*     */       //   1471: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   1476: ifeq -> 1483
/*     */       //   1479: iconst_1
/*     */       //   1480: goto -> 1484
/*     */       //   1483: iconst_0
/*     */       //   1484: ior
/*     */       //   1485: aload #4
/*     */       //   1487: aload #14
/*     */       //   1489: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   1494: ior
/*     */       //   1495: istore #43
/*     */       //   1497: nop
/*     */       //   1498: iconst_0
/*     */       //   1499: istore #44
/*     */       //   1501: aload #42
/*     */       //   1503: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1508: astore #45
/*     */       //   1510: iconst_0
/*     */       //   1511: istore #46
/*     */       //   1513: iload #43
/*     */       //   1515: ifne -> 1529
/*     */       //   1518: aload #45
/*     */       //   1520: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1523: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1526: if_acmpne -> 1586
/*     */       //   1529: astore #50
/*     */       //   1531: astore #51
/*     */       //   1533: istore #52
/*     */       //   1535: astore #53
/*     */       //   1537: astore #54
/*     */       //   1539: astore #47
/*     */       //   1541: iconst_0
/*     */       //   1542: istore #48
/*     */       //   1544: aload #13
/*     */       //   1546: aload_3
/*     */       //   1547: aload #14
/*     */       //   1549: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   1554: astore #55
/*     */       //   1556: aload #47
/*     */       //   1558: aload #54
/*     */       //   1560: aload #53
/*     */       //   1562: iload #52
/*     */       //   1564: aload #51
/*     */       //   1566: aload #50
/*     */       //   1568: aload #55
/*     */       //   1570: astore #56
/*     */       //   1572: aload #42
/*     */       //   1574: aload #56
/*     */       //   1576: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1581: aload #56
/*     */       //   1583: goto -> 1588
/*     */       //   1586: aload #45
/*     */       //   1588: nop
/*     */       //   1589: nop
/*     */       //   1590: nop
/*     */       //   1591: checkcast kotlin/jvm/functions/Function0
/*     */       //   1594: astore #49
/*     */       //   1596: aload #39
/*     */       //   1598: invokeinterface endReplaceGroup : ()V
/*     */       //   1603: aload #49
/*     */       //   1605: bipush #28
/*     */       //   1607: aconst_null
/*     */       //   1608: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   1611: astore #49
/*     */       //   1613: iconst_0
/*     */       //   1614: istore #44
/*     */       //   1616: nop
/*     */       //   1617: iconst_0
/*     */       //   1618: istore #45
/*     */       //   1620: aload #39
/*     */       //   1622: ldc_w 733328855
/*     */       //   1625: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   1628: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1631: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   1634: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   1637: astore #42
/*     */       //   1639: iconst_0
/*     */       //   1640: istore #43
/*     */       //   1642: aload #42
/*     */       //   1644: iload #43
/*     */       //   1646: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1649: astore #46
/*     */       //   1651: bipush #112
/*     */       //   1653: iload #44
/*     */       //   1655: iconst_3
/*     */       //   1656: ishl
/*     */       //   1657: iand
/*     */       //   1658: istore #48
/*     */       //   1660: nop
/*     */       //   1661: iconst_0
/*     */       //   1662: istore #56
/*     */       //   1664: aload #39
/*     */       //   1666: ldc_w -1323940314
/*     */       //   1669: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   1672: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1675: aload #39
/*     */       //   1677: iconst_0
/*     */       //   1678: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   1681: istore #57
/*     */       //   1683: aload #39
/*     */       //   1685: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1690: astore #58
/*     */       //   1692: aload #39
/*     */       //   1694: aload #49
/*     */       //   1696: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   1699: astore #59
/*     */       //   1701: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1704: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   1707: astore #60
/*     */       //   1709: bipush #6
/*     */       //   1711: sipush #896
/*     */       //   1714: iload #48
/*     */       //   1716: bipush #6
/*     */       //   1718: ishl
/*     */       //   1719: iand
/*     */       //   1720: ior
/*     */       //   1721: istore #61
/*     */       //   1723: nop
/*     */       //   1724: iconst_0
/*     */       //   1725: istore #62
/*     */       //   1727: aload #39
/*     */       //   1729: ldc_w -692256719
/*     */       //   1732: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   1735: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1738: aload #39
/*     */       //   1740: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   1745: instanceof androidx/compose/runtime/Applier
/*     */       //   1748: ifne -> 1754
/*     */       //   1751: invokestatic invalidApplier : ()V
/*     */       //   1754: aload #39
/*     */       //   1756: invokeinterface startReusableNode : ()V
/*     */       //   1761: aload #39
/*     */       //   1763: invokeinterface getInserting : ()Z
/*     */       //   1768: ifeq -> 1783
/*     */       //   1771: aload #39
/*     */       //   1773: aload #60
/*     */       //   1775: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   1780: goto -> 1790
/*     */       //   1783: aload #39
/*     */       //   1785: invokeinterface useNode : ()V
/*     */       //   1790: aload #39
/*     */       //   1792: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   1795: astore #63
/*     */       //   1797: iconst_0
/*     */       //   1798: istore #64
/*     */       //   1800: aload #63
/*     */       //   1802: aload #46
/*     */       //   1804: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1807: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1810: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1813: aload #63
/*     */       //   1815: aload #58
/*     */       //   1817: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1820: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1823: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1826: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1829: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1832: astore #65
/*     */       //   1834: iconst_0
/*     */       //   1835: istore #66
/*     */       //   1837: aload #63
/*     */       //   1839: astore #67
/*     */       //   1841: iconst_0
/*     */       //   1842: istore #68
/*     */       //   1844: aload #67
/*     */       //   1846: invokeinterface getInserting : ()Z
/*     */       //   1851: ifne -> 1872
/*     */       //   1854: aload #67
/*     */       //   1856: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1861: iload #57
/*     */       //   1863: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1866: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1869: ifne -> 1898
/*     */       //   1872: aload #67
/*     */       //   1874: iload #57
/*     */       //   1876: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1884: aload #63
/*     */       //   1886: iload #57
/*     */       //   1888: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1891: aload #65
/*     */       //   1893: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1898: nop
/*     */       //   1899: nop
/*     */       //   1900: nop
/*     */       //   1901: aload #63
/*     */       //   1903: aload #59
/*     */       //   1905: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   1908: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   1911: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   1914: nop
/*     */       //   1915: nop
/*     */       //   1916: aload #39
/*     */       //   1918: bipush #14
/*     */       //   1920: iload #61
/*     */       //   1922: bipush #6
/*     */       //   1924: ishr
/*     */       //   1925: iand
/*     */       //   1926: istore #69
/*     */       //   1928: astore #70
/*     */       //   1930: iconst_0
/*     */       //   1931: istore #71
/*     */       //   1933: aload #70
/*     */       //   1935: ldc_w -2146769399
/*     */       //   1938: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   1941: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   1944: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   1947: aload #70
/*     */       //   1949: bipush #6
/*     */       //   1951: bipush #112
/*     */       //   1953: iload #44
/*     */       //   1955: bipush #6
/*     */       //   1957: ishr
/*     */       //   1958: iand
/*     */       //   1959: ior
/*     */       //   1960: istore #72
/*     */       //   1962: astore #73
/*     */       //   1964: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   1967: astore #74
/*     */       //   1969: iconst_0
/*     */       //   1970: istore #75
/*     */       //   1972: aload #17
/*     */       //   1974: lload #7
/*     */       //   1976: invokestatic box-impl : (J)Lorg/jetbrains/jewel/foundation/lazy/tree/TreeElementState;
/*     */       //   1979: aload #73
/*     */       //   1981: iconst_0
/*     */       //   1982: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   1985: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   1990: pop
/*     */       //   1991: nop
/*     */       //   1992: aload #70
/*     */       //   1994: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1997: aload #39
/*     */       //   1999: invokeinterface endNode : ()V
/*     */       //   2004: aload #39
/*     */       //   2006: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2009: nop
/*     */       //   2010: aload #39
/*     */       //   2012: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2015: nop
/*     */       //   2016: aload #39
/*     */       //   2018: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2021: nop
/*     */       //   2022: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   2025: checkcast androidx/compose/ui/Modifier
/*     */       //   2028: fload #15
/*     */       //   2030: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */       //   2033: aload #39
/*     */       //   2035: iconst_0
/*     */       //   2036: invokestatic Spacer : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */       //   2039: aload #39
/*     */       //   2041: invokeinterface endReplaceGroup : ()V
/*     */       //   2046: aload #16
/*     */       //   2048: aload_1
/*     */       //   2049: aload_3
/*     */       //   2050: aload #39
/*     */       //   2052: bipush #14
/*     */       //   2054: iload #6
/*     */       //   2056: iand
/*     */       //   2057: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   2060: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   2065: pop
/*     */       //   2066: nop
/*     */       //   2067: aload #36
/*     */       //   2069: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2072: aload #4
/*     */       //   2074: invokeinterface endNode : ()V
/*     */       //   2079: aload #4
/*     */       //   2081: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2084: nop
/*     */       //   2085: aload #4
/*     */       //   2087: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2090: nop
/*     */       //   2091: aload #4
/*     */       //   2093: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   2096: nop
/*     */       //   2097: invokestatic isTraceInProgress : ()Z
/*     */       //   2100: ifeq -> 2116
/*     */       //   2103: invokestatic traceEventEnd : ()V
/*     */       //   2106: goto -> 2116
/*     */       //   2109: aload #4
/*     */       //   2111: invokeinterface skipToGroupEnd : ()V
/*     */       //   2116: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #126	-> 130
/*     */       //   #127	-> 168
/*     */       //   #128	-> 173
/*     */       //   #129	-> 181
/*     */       //   #130	-> 189
/*     */       //   #325	-> 220
/*     */       //   #130	-> 223
/*     */       //   #130	-> 238
/*     */       //   #130	-> 239
/*     */       //   #127	-> 246
/*     */       //   #130	-> 250
/*     */       //   #127	-> 252
/*     */       //   #128	-> 254
/*     */       //   #129	-> 256
/*     */       //   #127	-> 258
/*     */       //   #126	-> 264
/*     */       //   #133	-> 332
/*     */       //   #326	-> 353
/*     */       //   #327	-> 365
/*     */       //   #328	-> 381
/*     */       //   #133	-> 384
/*     */       //   #328	-> 396
/*     */       //   #329	-> 398
/*     */       //   #330	-> 407
/*     */       //   #331	-> 412
/*     */       //   #327	-> 414
/*     */       //   #326	-> 415
/*     */       //   #326	-> 416
/*     */       //   #133	-> 417
/*     */       //   #148	-> 436
/*     */       //   #150	-> 444
/*     */       //   #151	-> 460
/*     */       //   #153	-> 467
/*     */       //   #154	-> 469
/*     */       //   #155	-> 473
/*     */       //   #156	-> 477
/*     */       //   #157	-> 481
/*     */       //   #152	-> 486
/*     */       //   #159	-> 489
/*     */       //   #160	-> 496
/*     */       //   #332	-> 513
/*     */       //   #160	-> 518
/*     */       //   #161	-> 544
/*     */       //   #333	-> 548
/*     */       //   #334	-> 560
/*     */       //   #335	-> 571
/*     */       //   #161	-> 576
/*     */       //   #335	-> 582
/*     */       //   #336	-> 584
/*     */       //   #337	-> 593
/*     */       //   #338	-> 598
/*     */       //   #334	-> 600
/*     */       //   #333	-> 601
/*     */       //   #333	-> 602
/*     */       //   #161	-> 603
/*     */       //   #333	-> 781
/*     */       //   #334	-> 793
/*     */       //   #335	-> 809
/*     */       //   #161	-> 824
/*     */       //   #335	-> 860
/*     */       //   #336	-> 862
/*     */       //   #337	-> 871
/*     */       //   #338	-> 876
/*     */       //   #334	-> 878
/*     */       //   #333	-> 879
/*     */       //   #333	-> 880
/*     */       //   #161	-> 881
/*     */       //   #147	-> 903
/*     */       //   #339	-> 949
/*     */       //   #340	-> 952
/*     */       //   #344	-> 960
/*     */       //   #345	-> 995
/*     */       //   #346	-> 1007
/*     */       //   #347	-> 1013
/*     */       //   #348	-> 1020
/*     */       //   #349	-> 1029
/*     */       //   #351	-> 1036
/*     */       //   #350	-> 1058
/*     */       //   #352	-> 1070
/*     */       //   #353	-> 1073
/*     */       //   #354	-> 1091
/*     */       //   #355	-> 1096
/*     */       //   #356	-> 1108
/*     */       //   #358	-> 1120
/*     */       //   #360	-> 1125
/*     */       //   #361	-> 1135
/*     */       //   #362	-> 1148
/*     */       //   #364	-> 1161
/*     */       //   #365	-> 1172
/*     */       //   #366	-> 1179
/*     */       //   #367	-> 1207
/*     */       //   #368	-> 1219
/*     */       //   #370	-> 1233
/*     */       //   #365	-> 1234
/*     */       //   #370	-> 1235
/*     */       //   #371	-> 1236
/*     */       //   #372	-> 1249
/*     */       //   #360	-> 1250
/*     */       //   #373	-> 1251
/*     */       //   #374	-> 1276
/*     */       //   #172	-> 1317
/*     */       //   #175	-> 1324
/*     */       //   #176	-> 1347
/*     */       //   #375	-> 1351
/*     */       //   #376	-> 1363
/*     */       //   #377	-> 1374
/*     */       //   #176	-> 1379
/*     */       //   #377	-> 1385
/*     */       //   #378	-> 1387
/*     */       //   #379	-> 1396
/*     */       //   #380	-> 1401
/*     */       //   #376	-> 1403
/*     */       //   #375	-> 1404
/*     */       //   #375	-> 1405
/*     */       //   #176	-> 1406
/*     */       //   #177	-> 1420
/*     */       //   #175	-> 1421
/*     */       //   #178	-> 1497
/*     */       //   #381	-> 1501
/*     */       //   #382	-> 1513
/*     */       //   #383	-> 1529
/*     */       //   #178	-> 1544
/*     */       //   #383	-> 1570
/*     */       //   #384	-> 1572
/*     */       //   #385	-> 1581
/*     */       //   #386	-> 1586
/*     */       //   #382	-> 1588
/*     */       //   #381	-> 1589
/*     */       //   #381	-> 1590
/*     */       //   #178	-> 1591
/*     */       //   #175	-> 1605
/*     */       //   #173	-> 1616
/*     */       //   #387	-> 1628
/*     */       //   #388	-> 1631
/*     */       //   #389	-> 1639
/*     */       //   #392	-> 1642
/*     */       //   #393	-> 1660
/*     */       //   #394	-> 1672
/*     */       //   #395	-> 1678
/*     */       //   #396	-> 1685
/*     */       //   #397	-> 1694
/*     */       //   #399	-> 1701
/*     */       //   #398	-> 1723
/*     */       //   #400	-> 1735
/*     */       //   #401	-> 1738
/*     */       //   #402	-> 1756
/*     */       //   #403	-> 1761
/*     */       //   #404	-> 1773
/*     */       //   #406	-> 1785
/*     */       //   #408	-> 1790
/*     */       //   #409	-> 1800
/*     */       //   #410	-> 1813
/*     */       //   #412	-> 1826
/*     */       //   #413	-> 1837
/*     */       //   #414	-> 1844
/*     */       //   #415	-> 1872
/*     */       //   #416	-> 1884
/*     */       //   #418	-> 1898
/*     */       //   #413	-> 1899
/*     */       //   #418	-> 1900
/*     */       //   #419	-> 1901
/*     */       //   #420	-> 1914
/*     */       //   #408	-> 1915
/*     */       //   #421	-> 1916
/*     */       //   #422	-> 1941
/*     */       //   #183	-> 1972
/*     */       //   #184	-> 1991
/*     */       //   #422	-> 1992
/*     */       //   #421	-> 1997
/*     */       //   #423	-> 1999
/*     */       //   #400	-> 2006
/*     */       //   #424	-> 2009
/*     */       //   #394	-> 2012
/*     */       //   #425	-> 2015
/*     */       //   #387	-> 2018
/*     */       //   #426	-> 2021
/*     */       //   #185	-> 2022
/*     */       //   #187	-> 2046
/*     */       //   #188	-> 2066
/*     */       //   #374	-> 2067
/*     */       //   #373	-> 2072
/*     */       //   #427	-> 2074
/*     */       //   #352	-> 2081
/*     */       //   #428	-> 2084
/*     */       //   #346	-> 2087
/*     */       //   #429	-> 2090
/*     */       //   #339	-> 2093
/*     */       //   #430	-> 2096
/*     */       //   #188	-> 2109
/*     */       //   #189	-> 2116
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   223	15	18	$i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$elementState$1	I
/*     */       //   220	18	17	it	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;
/*     */       //   384	12	19	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2	I
/*     */       //   398	11	20	value$iv	Ljava/lang/Object;
/*     */       //   365	50	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   362	53	17	it$iv	Ljava/lang/Object;
/*     */       //   353	64	16	$i$f$cache	I
/*     */       //   350	67	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   350	67	12	invalid$iv	Z
/*     */       //   513	5	13	$i$f$getDp	I
/*     */       //   510	8	12	$this$dp$iv	F
/*     */       //   576	3	18	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$1	I
/*     */       //   584	11	18	value$iv	Ljava/lang/Object;
/*     */       //   560	41	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   557	44	16	it$iv	Ljava/lang/Object;
/*     */       //   548	55	15	$i$f$cache	I
/*     */       //   545	58	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   545	58	14	invalid$iv	Z
/*     */       //   824	20	26	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$2	I
/*     */       //   862	11	27	value$iv	Ljava/lang/Object;
/*     */       //   793	86	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   790	89	24	it$iv	Ljava/lang/Object;
/*     */       //   781	100	23	$i$f$cache	I
/*     */       //   778	103	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   778	103	14	invalid$iv	Z
/*     */       //   1379	3	48	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$1	I
/*     */       //   1387	11	48	value$iv	Ljava/lang/Object;
/*     */       //   1363	41	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1360	44	45	it$iv	Ljava/lang/Object;
/*     */       //   1351	55	44	$i$f$cache	I
/*     */       //   1348	58	42	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1348	58	43	invalid$iv	Z
/*     */       //   1544	10	48	$i$a$-cache-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$2	I
/*     */       //   1572	11	56	value$iv	Ljava/lang/Object;
/*     */       //   1513	76	46	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1510	79	45	it$iv	Ljava/lang/Object;
/*     */       //   1501	90	44	$i$f$cache	I
/*     */       //   1498	93	42	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1498	93	43	invalid$iv	Z
/*     */       //   1972	20	75	$i$a$-Box-BasicLazyTreeKt$BasicLazyTree$5$1$3$3$3	I
/*     */       //   1969	23	74	$this$invoke_u24lambda_u2413_u24lambda_u2412	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   1969	23	73	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   1969	23	72	$changed	I
/*     */       //   1933	64	71	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   1930	67	70	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1930	67	69	$changed$iv	I
/*     */       //   1844	55	68	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   1841	58	67	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1837	64	66	$i$f$set-impl	I
/*     */       //   1834	67	65	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   1800	115	64	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   1797	118	63	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1727	283	62	$i$f$ReusableComposeNode	I
/*     */       //   1724	286	60	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   1724	286	61	$changed$iv$iv$iv	I
/*     */       //   1664	352	56	$i$f$Layout	I
/*     */       //   1683	333	57	compositeKeyHash$iv$iv	I
/*     */       //   1692	324	58	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1701	315	59	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   1661	355	48	$changed$iv$iv	I
/*     */       //   1620	402	45	$i$f$Box	I
/*     */       //   1651	371	46	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   1617	405	49	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   1639	383	42	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   1642	380	43	propagateMinConstraints$iv	Z
/*     */       //   1617	405	44	$changed$iv	I
/*     */       //   1307	760	41	$i$a$-Row-BasicLazyTreeKt$BasicLazyTree$5$1$3$3	I
/*     */       //   1304	763	40	$this$invoke_u24lambda_u2413	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   1304	763	39	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   1304	763	38	$changed	I
/*     */       //   1268	804	37	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   1265	807	36	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1265	807	35	$changed$iv	I
/*     */       //   1179	55	34	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   1176	58	33	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1172	64	32	$i$f$set-impl	I
/*     */       //   1169	67	31	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   1135	115	30	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   1132	118	29	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1062	1023	28	$i$f$ReusableComposeNode	I
/*     */       //   1059	1026	26	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   1059	1026	27	$changed$iv$iv$iv	I
/*     */       //   999	1092	22	$i$f$Layout	I
/*     */       //   1018	1073	23	compositeKeyHash$iv$iv	I
/*     */       //   1027	1064	24	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   1036	1055	25	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   996	1095	21	$changed$iv$iv	I
/*     */       //   941	1156	19	$i$f$Row	I
/*     */       //   986	1111	20	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   960	1137	12	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   938	1159	18	$changed$iv	I
/*     */       //   266	1840	7	elementState	J
/*     */       //   436	1670	9	backgroundShape$delegate	Landroidx/compose/runtime/State;
/*     */       //   16	2101	6	$dirty	I
/*     */       //   0	2117	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/BasicLazyTreeKt$BasicLazyTree$5$1$3;
/*     */       //   0	2117	1	$this$itemsIndexed	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */       //   0	2117	2	index	I
/*     */       //   0	2117	3	element	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */       //   0	2117	4	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	2117	5	$changed	I
/*     */     }
/*     */     
/*     */     private static final RoundedCornerShape invoke$lambda$4$lambda$3(List $flattenedTree, int $index, CornerSize $elementBackgroundCornerSize, TreeState $treeState) {
/*     */       Object it = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId();
/*     */       int $i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2$1$hasRoundedTopCorners$1 = 0;
/*     */       ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId();
/*     */       boolean hasRoundedTopCorners = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1) != null && ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index - 1)).getId() != null) ? (!$treeState.getDelegate$foundation().getSelectedKeys().contains(it)) : true;
/*     */       Object object1 = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId();
/*     */       int $i$a$-let-BasicLazyTreeKt$BasicLazyTree$5$1$3$backgroundShape$2$1$hasRoundedBottomCorners$1 = 0;
/*     */       ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId();
/*     */       boolean hasRoundedBottomCorners = ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1) != null && ((Tree.Element)CollectionsKt.getOrNull($flattenedTree, $index + 1)).getId() != null) ? (!$treeState.getDelegate$foundation().getSelectedKeys().contains(object1)) : true;
/*     */       CornerSize topCornerSize = BasicLazyTreeKt.computerCornerSize(hasRoundedTopCorners, $elementBackgroundCornerSize);
/*     */       CornerSize bottomCornerSize = BasicLazyTreeKt.computerCornerSize(hasRoundedBottomCorners, $elementBackgroundCornerSize);
/*     */       return new RoundedCornerShape(topCornerSize, topCornerSize, bottomCornerSize, bottomCornerSize);
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$8$lambda$7(PointerEventActions $pointerEventScopedActions, List $flattenedTree, int $index, CoroutineScope $scope, long $platformDoubleClickDelay, Function1<? super Tree.Element<?>, Unit> $onElementClick, Function1<? super Tree.Element<?>, Unit> $onElementDoubleClick, TreeState $treeState) {
/*     */       if ((($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null) != null) {
/*     */         Intrinsics.checkNotNull($flattenedTree.get($index), "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.tree.Tree.Element<T of org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTreeKt.BasicLazyTree>");
/*     */         (($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null).notifyItemClicked((Tree.Element)$flattenedTree.get($index), $scope, Duration.getInWholeMilliseconds-impl($platformDoubleClickDelay), $onElementClick, $onElementDoubleClick);
/*     */       } else {
/*     */         ($pointerEventScopedActions instanceof DefaultTreeViewPointerEventAction) ? $pointerEventScopedActions : null;
/*     */       } 
/*     */       $treeState.getDelegate$foundation().setLastActiveItemIndex(Integer.valueOf($index));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$13$lambda$11$lambda$10(TreeState $treeState, Tree.Element $element, Function1 $onElementDoubleClick) {
/*     */       $treeState.toggleNode(((Tree.Element.Node)$element).getId());
/*     */       Intrinsics.checkNotNull($element, "null cannot be cast to non-null type org.jetbrains.jewel.foundation.lazy.tree.Tree.Element<T of org.jetbrains.jewel.foundation.lazy.tree.BasicLazyTreeKt.BasicLazyTree>");
/*     */       $onElementDoubleClick.invoke($element);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     BasicLazyTreeKt$BasicLazyTree$5$1$3(List<Tree.Element<?>> $flattenedTree, TreeState $treeState, CornerSize $elementBackgroundCornerSize, float $elementMinHeight, PaddingValues $elementPadding, long $elementBackgroundSelectedFocused, long $elementBackgroundFocused, long $elementBackgroundSelected, PaddingValues $elementContentPadding, float $indentSize, PointerEventActions $pointerEventScopedActions, CoroutineScope $scope, long $platformDoubleClickDelay, Function1<Tree.Element<T>, Unit> $onElementClick, Function1<Tree.Element<T>, Unit> $onElementDoubleClick, float $chevronContentGap, Function4<SelectableLazyItemScope, Tree.Element<T>, Composer, Integer, Unit> $nodeContent, Function3<TreeElementState, Composer, Integer, Unit> $chevronContent) {} }
/*     */ 
/*     */   
/*     */   private static final CornerSize computerCornerSize(boolean isRounded, CornerSize cornerSize) {
/*     */     int $this$dp$iv = 0, $i$f$getDp = 0;
/*     */     return isRounded ? cornerSize : CornerSizeKt.CornerSize-0680j_4(Dp.constructor-impl($this$dp$iv));
/*     */   }
/*     */   
/*     */   private static final Modifier elementBackground-61ZKQAw(Modifier $this$elementBackground_u2d61ZKQAw, long state, long selectedFocused, long focused, long selected, RoundedCornerShape backgroundShape) {
/*     */     return BackgroundKt.background-bw27NRU($this$elementBackground_u2d61ZKQAw, (TreeElementState.isActive-impl(state) && TreeElementState.isSelected-impl(state)) ? selectedFocused : ((TreeElementState.isActive-impl(state) && !TreeElementState.isSelected-impl(state)) ? focused : ((TreeElementState.isSelected-impl(state) && !TreeElementState.isActive-impl(state)) ? selected : Color.Companion.getUnspecified-0d7_KjU())), (Shape)backgroundShape);
/*     */   }
/*     */   
/*     */   private static final List<Tree.Element<?>> flattenTree(Tree.Element $this$flattenTree, TreeState state) {
/*     */     // Byte code:
/*     */     //   0: new java/util/ArrayList
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: checkcast java/util/List
/*     */     //   10: astore_2
/*     */     //   11: aload_0
/*     */     //   12: astore_3
/*     */     //   13: aload_3
/*     */     //   14: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   17: ifeq -> 360
/*     */     //   20: aload_1
/*     */     //   21: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   24: checkcast java/lang/Iterable
/*     */     //   27: astore #4
/*     */     //   29: iconst_0
/*     */     //   30: istore #5
/*     */     //   32: aload #4
/*     */     //   34: astore #6
/*     */     //   36: new java/util/ArrayList
/*     */     //   39: dup
/*     */     //   40: aload #4
/*     */     //   42: bipush #10
/*     */     //   44: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   47: invokespecial <init> : (I)V
/*     */     //   50: checkcast java/util/Collection
/*     */     //   53: astore #7
/*     */     //   55: iconst_0
/*     */     //   56: istore #8
/*     */     //   58: aload #6
/*     */     //   60: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   65: astore #9
/*     */     //   67: aload #9
/*     */     //   69: invokeinterface hasNext : ()Z
/*     */     //   74: ifeq -> 117
/*     */     //   77: aload #9
/*     */     //   79: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   84: astore #10
/*     */     //   86: aload #7
/*     */     //   88: aload #10
/*     */     //   90: checkcast kotlin/Pair
/*     */     //   93: astore #11
/*     */     //   95: astore #13
/*     */     //   97: iconst_0
/*     */     //   98: istore #12
/*     */     //   100: aload #11
/*     */     //   102: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   105: aload #13
/*     */     //   107: swap
/*     */     //   108: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   113: pop
/*     */     //   114: goto -> 67
/*     */     //   117: aload #7
/*     */     //   119: checkcast java/util/List
/*     */     //   122: nop
/*     */     //   123: aload_0
/*     */     //   124: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   127: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   130: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   135: ifne -> 166
/*     */     //   138: aload_1
/*     */     //   139: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*     */     //   142: aload_0
/*     */     //   143: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   146: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   149: aload_0
/*     */     //   150: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   153: invokevirtual getDepth : ()I
/*     */     //   156: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   159: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   162: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   165: pop
/*     */     //   166: aload_2
/*     */     //   167: aload_0
/*     */     //   168: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   173: pop
/*     */     //   174: aload_1
/*     */     //   175: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*     */     //   178: aload_0
/*     */     //   179: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   182: invokevirtual getId : ()Ljava/lang/Object;
/*     */     //   185: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   190: ifne -> 267
/*     */     //   193: aload_2
/*     */     //   194: astore #4
/*     */     //   196: aload #4
/*     */     //   198: astore #5
/*     */     //   200: iconst_0
/*     */     //   201: istore #6
/*     */     //   203: aload_0
/*     */     //   204: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   207: invokevirtual close : ()V
/*     */     //   210: aload_1
/*     */     //   211: aload_1
/*     */     //   212: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*     */     //   215: invokestatic createSetBuilder : ()Ljava/util/Set;
/*     */     //   218: astore #7
/*     */     //   220: aload #7
/*     */     //   222: astore #8
/*     */     //   224: astore #9
/*     */     //   226: astore #10
/*     */     //   228: iconst_0
/*     */     //   229: istore #11
/*     */     //   231: aload #8
/*     */     //   233: aload_0
/*     */     //   234: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   237: invokestatic getAllSubNodes : (Ljava/util/Set;Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node;)V
/*     */     //   240: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   243: astore #12
/*     */     //   245: aload #10
/*     */     //   247: aload #9
/*     */     //   249: aload #7
/*     */     //   251: invokestatic build : (Ljava/util/Set;)Ljava/util/Set;
/*     */     //   254: checkcast java/lang/Iterable
/*     */     //   257: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   260: invokevirtual setOpenNodes : (Ljava/util/Set;)V
/*     */     //   263: nop
/*     */     //   264: aload #4
/*     */     //   266: areturn
/*     */     //   267: aload_0
/*     */     //   268: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   271: iconst_1
/*     */     //   272: invokevirtual open : (Z)V
/*     */     //   275: aload_0
/*     */     //   276: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Node
/*     */     //   279: invokevirtual getChildren : ()Ljava/util/List;
/*     */     //   282: dup
/*     */     //   283: ifnull -> 356
/*     */     //   286: checkcast java/lang/Iterable
/*     */     //   289: astore #5
/*     */     //   291: iconst_0
/*     */     //   292: istore #6
/*     */     //   294: aload #5
/*     */     //   296: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   301: astore #7
/*     */     //   303: aload #7
/*     */     //   305: invokeinterface hasNext : ()Z
/*     */     //   310: ifeq -> 352
/*     */     //   313: aload #7
/*     */     //   315: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   320: astore #8
/*     */     //   322: aload #8
/*     */     //   324: checkcast org/jetbrains/jewel/foundation/lazy/tree/Tree$Element
/*     */     //   327: astore #9
/*     */     //   329: iconst_0
/*     */     //   330: istore #10
/*     */     //   332: aload_2
/*     */     //   333: aload #9
/*     */     //   335: aload_1
/*     */     //   336: invokestatic flattenTree : (Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)Ljava/util/List;
/*     */     //   339: checkcast java/util/Collection
/*     */     //   342: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   347: pop
/*     */     //   348: nop
/*     */     //   349: goto -> 303
/*     */     //   352: nop
/*     */     //   353: goto -> 386
/*     */     //   356: pop
/*     */     //   357: goto -> 386
/*     */     //   360: aload_3
/*     */     //   361: instanceof org/jetbrains/jewel/foundation/lazy/tree/Tree$Element$Leaf
/*     */     //   364: ifeq -> 378
/*     */     //   367: aload_2
/*     */     //   368: aload_0
/*     */     //   369: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   374: pop
/*     */     //   375: goto -> 386
/*     */     //   378: new kotlin/NoWhenBranchMatchedException
/*     */     //   381: dup
/*     */     //   382: invokespecial <init> : ()V
/*     */     //   385: athrow
/*     */     //   386: aload_2
/*     */     //   387: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #295	-> 0
/*     */     //   #295	-> 10
/*     */     //   #296	-> 11
/*     */     //   #297	-> 13
/*     */     //   #298	-> 20
/*     */     //   #383	-> 32
/*     */     //   #384	-> 58
/*     */     //   #385	-> 86
/*     */     //   #298	-> 100
/*     */     //   #385	-> 108
/*     */     //   #386	-> 117
/*     */     //   #383	-> 122
/*     */     //   #298	-> 123
/*     */     //   #308	-> 123
/*     */     //   #298	-> 127
/*     */     //   #308	-> 142
/*     */     //   #298	-> 146
/*     */     //   #308	-> 149
/*     */     //   #298	-> 153
/*     */     //   #299	-> 166
/*     */     //   #300	-> 174
/*     */     //   #308	-> 178
/*     */     //   #300	-> 182
/*     */     //   #301	-> 193
/*     */     //   #308	-> 203
/*     */     //   #302	-> 207
/*     */     //   #304	-> 210
/*     */     //   #387	-> 224
/*     */     //   #304	-> 231
/*     */     //   #304	-> 249
/*     */     //   #304	-> 257
/*     */     //   #305	-> 263
/*     */     //   #301	-> 264
/*     */     //   #301	-> 266
/*     */     //   #308	-> 267
/*     */     //   #307	-> 271
/*     */     //   #308	-> 275
/*     */     //   #388	-> 294
/*     */     //   #308	-> 332
/*     */     //   #388	-> 348
/*     */     //   #389	-> 352
/*     */     //   #308	-> 356
/*     */     //   #311	-> 360
/*     */     //   #312	-> 367
/*     */     //   #296	-> 378
/*     */     //   #315	-> 386
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   100	5	12	$i$a$-map-BasicLazyTreeKt$flattenTree$1	I
/*     */     //   97	8	11	it	Lkotlin/Pair;
/*     */     //   86	28	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   58	61	8	$i$f$mapTo	I
/*     */     //   55	64	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   55	64	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   32	91	5	$i$f$map	I
/*     */     //   29	94	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   231	9	11	$i$a$-buildSet-BasicLazyTreeKt$flattenTree$2$1	I
/*     */     //   228	12	8	$this$flattenTree_u24lambda_u2417_u24lambda_u2416	Ljava/util/Set;
/*     */     //   203	61	6	$i$a$-also-BasicLazyTreeKt$flattenTree$2	I
/*     */     //   200	64	5	it	Ljava/util/List;
/*     */     //   332	16	10	$i$a$-forEach-BasicLazyTreeKt$flattenTree$3	I
/*     */     //   329	19	9	child	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   322	27	8	element$iv	Ljava/lang/Object;
/*     */     //   294	59	6	$i$f$forEach	I
/*     */     //   291	62	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   11	377	2	orderedChildren	Ljava/util/List;
/*     */     //   0	388	0	$this$flattenTree	Lorg/jetbrains/jewel/foundation/lazy/tree/Tree$Element;
/*     */     //   0	388	1	state	Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*     */   }
/*     */   
/*     */   private static final void getAllSubNodes(Set<Object> $this$getAllSubNodes, Tree.Element.Node node) {
/*     */     Iterator iterator;
/*     */     if (node.getChildren() != null) {
/*     */       Iterable $this$filterIsInstance$iv = node.getChildren();
/*     */       int $i$f$filterIsInstance = 0;
/*     */       Iterable iterable1 = $this$filterIsInstance$iv;
/*     */       Collection<Object> destination$iv$iv = new ArrayList();
/*     */       int $i$f$filterIsInstanceTo = 0;
/*     */       for (Object element$iv$iv : iterable1) {
/*     */         if (element$iv$iv instanceof Tree.Element.Node)
/*     */           destination$iv$iv.add(element$iv$iv); 
/*     */       } 
/*     */       Iterable $this$forEach$iv = destination$iv$iv;
/*     */       int $i$f$forEach = 0;
/*     */       iterator = $this$forEach$iv.iterator();
/*     */     } else {
/*     */       node.getChildren();
/*     */       return;
/*     */     } 
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       Tree.Element.Node<?> it = (Tree.Element.Node)element$iv;
/*     */       int $i$a$-forEach-BasicLazyTreeKt$getAllSubNodes$1 = 0;
/*     */       $this$getAllSubNodes.add(it.getId());
/*     */       getAllSubNodes($this$getAllSubNodes, it);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Unit BasicLazyTree_orM9XXQ$lambda$14(Tree<?> $tree, SelectionMode $selectionMode, Function1<? super Tree.Element<?>, Unit> $onElementClick, long $elementBackgroundFocused, long $elementBackgroundSelectedFocused, long $elementBackgroundSelected, float $indentSize, CornerSize $elementBackgroundCornerSize, PaddingValues $elementPadding, PaddingValues $elementContentPadding, float $elementMinHeight, float $chevronContentGap, TreeState $treeState, Modifier $modifier, Function1<? super Tree.Element<?>, Unit> $onElementDoubleClick, Function1<? super List<? extends Tree.Element<?>>, Unit> $onSelectionChange, long $platformDoubleClickDelay, KeyActions $keyActions, PointerEventActions $pointerEventScopedActions, Function3<? super TreeElementState, ? super Composer, ? super Integer, Unit> $chevronContent, Function4<? super SelectableLazyItemScope, ? super Tree.Element<?>, ? super Composer, ? super Integer, Unit> $nodeContent, int $$changed, int $$changed1, int $$changed2, int $$default, Composer $composer, int $force) {
/*     */     BasicLazyTree-orM9XXQ($tree, $selectionMode, $onElementClick, $elementBackgroundFocused, $elementBackgroundSelectedFocused, $elementBackgroundSelected, $indentSize, $elementBackgroundCornerSize, $elementPadding, $elementContentPadding, $elementMinHeight, $chevronContentGap, $treeState, $modifier, $onElementDoubleClick, $onSelectionChange, $platformDoubleClickDelay, $keyActions, $pointerEventScopedActions, $chevronContent, $nodeContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), RecomposeScopeImplKt.updateChangedFlags($$changed2), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\BasicLazyTreeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */