/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.ContextMenuItem;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.ProvidedValue;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusManager;
/*     */ import androidx.compose.ui.input.InputMode;
/*     */ import androidx.compose.ui.input.InputModeManager;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.MenuStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000J\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\032X\020\000\032\0020\0012\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0052\b\b\002\020\t\032\0020\n2\027\020\013\032\023\022\004\022\0020\f\022\004\022\0020\0010\003¢\006\002\b\rH\001¢\006\002\020\016\032 \020\017\032\0020\001*\0020\f2\022\020\020\032\016\022\n\022\b\022\004\022\0020\0230\0220\021H\002¨\006\024²\006\f\020\025\032\004\030\0010\026X\002²\006\f\020\027\032\004\030\0010\030X\002"}, d2 = {"ContextMenu", "", "onDismissRequest", "Lkotlin/Function1;", "Landroidx/compose/ui/input/InputMode;", "", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "style", "Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;", "content", "Lorg/jetbrains/jewel/ui/component/MenuScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "contextItems", "items", "Lkotlin/Function0;", "", "Landroidx/compose/foundation/ContextMenuItem;", "ui", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "inputModeManager", "Landroidx/compose/ui/input/InputModeManager;"})
/*     */ @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,96:1\n1225#2,6:97\n1225#2,6:103\n1225#2,6:109\n1225#2,6:115\n1855#3,2:121\n81#4:123\n107#4,2:124\n81#4:126\n107#4,2:127\n*S KotlinDebug\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt\n*L\n54#1:97,6\n58#1:103,6\n60#1:109,6\n61#1:115,6\n77#1:121,2\n52#1:123\n52#1:124,2\n53#1:126\n53#1:127,2\n*E\n"})
/*     */ public final class ContextMenuKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void ContextMenu(@NotNull Function1 onDismissRequest, @Nullable Modifier modifier, boolean focusable, @Nullable MenuStyle style, @NotNull Function1 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'onDismissRequest'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #4
/*     */     //   8: ldc 'content'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #5
/*     */     //   15: ldc 192943743
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #5
/*     */     //   24: iload #6
/*     */     //   26: istore #8
/*     */     //   28: iload #7
/*     */     //   30: iconst_1
/*     */     //   31: iand
/*     */     //   32: ifeq -> 45
/*     */     //   35: iload #8
/*     */     //   37: bipush #6
/*     */     //   39: ior
/*     */     //   40: istore #8
/*     */     //   42: goto -> 74
/*     */     //   45: iload #6
/*     */     //   47: bipush #6
/*     */     //   49: iand
/*     */     //   50: ifne -> 74
/*     */     //   53: iload #8
/*     */     //   55: aload #5
/*     */     //   57: aload_0
/*     */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 70
/*     */     //   66: iconst_4
/*     */     //   67: goto -> 71
/*     */     //   70: iconst_2
/*     */     //   71: ior
/*     */     //   72: istore #8
/*     */     //   74: iload #7
/*     */     //   76: iconst_2
/*     */     //   77: iand
/*     */     //   78: ifeq -> 91
/*     */     //   81: iload #8
/*     */     //   83: bipush #48
/*     */     //   85: ior
/*     */     //   86: istore #8
/*     */     //   88: goto -> 122
/*     */     //   91: iload #6
/*     */     //   93: bipush #48
/*     */     //   95: iand
/*     */     //   96: ifne -> 122
/*     */     //   99: iload #8
/*     */     //   101: aload #5
/*     */     //   103: aload_1
/*     */     //   104: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   109: ifeq -> 117
/*     */     //   112: bipush #32
/*     */     //   114: goto -> 119
/*     */     //   117: bipush #16
/*     */     //   119: ior
/*     */     //   120: istore #8
/*     */     //   122: iload #7
/*     */     //   124: iconst_4
/*     */     //   125: iand
/*     */     //   126: ifeq -> 140
/*     */     //   129: iload #8
/*     */     //   131: sipush #384
/*     */     //   134: ior
/*     */     //   135: istore #8
/*     */     //   137: goto -> 174
/*     */     //   140: iload #6
/*     */     //   142: sipush #384
/*     */     //   145: iand
/*     */     //   146: ifne -> 174
/*     */     //   149: iload #8
/*     */     //   151: aload #5
/*     */     //   153: iload_2
/*     */     //   154: invokeinterface changed : (Z)Z
/*     */     //   159: ifeq -> 168
/*     */     //   162: sipush #256
/*     */     //   165: goto -> 171
/*     */     //   168: sipush #128
/*     */     //   171: ior
/*     */     //   172: istore #8
/*     */     //   174: iload #6
/*     */     //   176: sipush #3072
/*     */     //   179: iand
/*     */     //   180: ifne -> 216
/*     */     //   183: iload #8
/*     */     //   185: iload #7
/*     */     //   187: bipush #8
/*     */     //   189: iand
/*     */     //   190: ifne -> 210
/*     */     //   193: aload #5
/*     */     //   195: aload_3
/*     */     //   196: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   201: ifeq -> 210
/*     */     //   204: sipush #2048
/*     */     //   207: goto -> 213
/*     */     //   210: sipush #1024
/*     */     //   213: ior
/*     */     //   214: istore #8
/*     */     //   216: iload #7
/*     */     //   218: bipush #16
/*     */     //   220: iand
/*     */     //   221: ifeq -> 235
/*     */     //   224: iload #8
/*     */     //   226: sipush #24576
/*     */     //   229: ior
/*     */     //   230: istore #8
/*     */     //   232: goto -> 270
/*     */     //   235: iload #6
/*     */     //   237: sipush #24576
/*     */     //   240: iand
/*     */     //   241: ifne -> 270
/*     */     //   244: iload #8
/*     */     //   246: aload #5
/*     */     //   248: aload #4
/*     */     //   250: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   255: ifeq -> 264
/*     */     //   258: sipush #16384
/*     */     //   261: goto -> 267
/*     */     //   264: sipush #8192
/*     */     //   267: ior
/*     */     //   268: istore #8
/*     */     //   270: iload #8
/*     */     //   272: sipush #9363
/*     */     //   275: iand
/*     */     //   276: sipush #9362
/*     */     //   279: if_icmpne -> 292
/*     */     //   282: aload #5
/*     */     //   284: invokeinterface getSkipping : ()Z
/*     */     //   289: ifne -> 988
/*     */     //   292: aload #5
/*     */     //   294: invokeinterface startDefaults : ()V
/*     */     //   299: iload #6
/*     */     //   301: iconst_1
/*     */     //   302: iand
/*     */     //   303: ifeq -> 316
/*     */     //   306: aload #5
/*     */     //   308: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   313: ifeq -> 369
/*     */     //   316: iload #7
/*     */     //   318: iconst_2
/*     */     //   319: iand
/*     */     //   320: ifeq -> 330
/*     */     //   323: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   326: checkcast androidx/compose/ui/Modifier
/*     */     //   329: astore_1
/*     */     //   330: iload #7
/*     */     //   332: iconst_4
/*     */     //   333: iand
/*     */     //   334: ifeq -> 339
/*     */     //   337: iconst_1
/*     */     //   338: istore_2
/*     */     //   339: iload #7
/*     */     //   341: bipush #8
/*     */     //   343: iand
/*     */     //   344: ifeq -> 392
/*     */     //   347: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   350: aload #5
/*     */     //   352: bipush #6
/*     */     //   354: invokestatic getMenuStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*     */     //   357: astore_3
/*     */     //   358: iload #8
/*     */     //   360: sipush #-7169
/*     */     //   363: iand
/*     */     //   364: istore #8
/*     */     //   366: goto -> 392
/*     */     //   369: aload #5
/*     */     //   371: invokeinterface skipToGroupEnd : ()V
/*     */     //   376: iload #7
/*     */     //   378: bipush #8
/*     */     //   380: iand
/*     */     //   381: ifeq -> 392
/*     */     //   384: iload #8
/*     */     //   386: sipush #-7169
/*     */     //   389: iand
/*     */     //   390: istore #8
/*     */     //   392: aload #5
/*     */     //   394: invokeinterface endDefaults : ()V
/*     */     //   399: invokestatic isTraceInProgress : ()Z
/*     */     //   402: ifeq -> 415
/*     */     //   405: ldc 192943743
/*     */     //   407: iload #8
/*     */     //   409: iconst_m1
/*     */     //   410: ldc 'org.jetbrains.jewel.ui.component.ContextMenu (ContextMenu.kt:50)'
/*     */     //   412: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   415: aconst_null
/*     */     //   416: aconst_null
/*     */     //   417: iconst_2
/*     */     //   418: aconst_null
/*     */     //   419: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   422: astore #9
/*     */     //   424: aconst_null
/*     */     //   425: aconst_null
/*     */     //   426: iconst_2
/*     */     //   427: aconst_null
/*     */     //   428: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   431: astore #10
/*     */     //   433: aload #5
/*     */     //   435: ldc -1642348833
/*     */     //   437: invokeinterface startReplaceGroup : (I)V
/*     */     //   442: aload #5
/*     */     //   444: astore #13
/*     */     //   446: iload #8
/*     */     //   448: bipush #14
/*     */     //   450: iand
/*     */     //   451: iconst_4
/*     */     //   452: if_icmpne -> 459
/*     */     //   455: iconst_1
/*     */     //   456: goto -> 460
/*     */     //   459: iconst_0
/*     */     //   460: istore #14
/*     */     //   462: nop
/*     */     //   463: iconst_0
/*     */     //   464: istore #15
/*     */     //   466: aload #13
/*     */     //   468: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   473: astore #16
/*     */     //   475: iconst_0
/*     */     //   476: istore #17
/*     */     //   478: iload #14
/*     */     //   480: ifne -> 494
/*     */     //   483: aload #16
/*     */     //   485: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   488: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   491: if_acmpne -> 524
/*     */     //   494: iconst_0
/*     */     //   495: istore #18
/*     */     //   497: new org/jetbrains/jewel/ui/component/MenuManager
/*     */     //   500: dup
/*     */     //   501: aload_0
/*     */     //   502: aconst_null
/*     */     //   503: iconst_2
/*     */     //   504: aconst_null
/*     */     //   505: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/MenuManager;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   508: astore #19
/*     */     //   510: aload #13
/*     */     //   512: aload #19
/*     */     //   514: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   519: aload #19
/*     */     //   521: goto -> 526
/*     */     //   524: aload #16
/*     */     //   526: nop
/*     */     //   527: nop
/*     */     //   528: nop
/*     */     //   529: checkcast org/jetbrains/jewel/ui/component/MenuManager
/*     */     //   532: astore #12
/*     */     //   534: aload #5
/*     */     //   536: invokeinterface endReplaceGroup : ()V
/*     */     //   541: aload #12
/*     */     //   543: astore #11
/*     */     //   545: aload_3
/*     */     //   546: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/MenuMetrics;
/*     */     //   549: invokevirtual getOffset-RKDOV3M : ()J
/*     */     //   552: aconst_null
/*     */     //   553: fconst_0
/*     */     //   554: aload #5
/*     */     //   556: iconst_0
/*     */     //   557: bipush #6
/*     */     //   559: invokestatic rememberCursorPositionProvider-B5uucgQ : (JLandroidx/compose/ui/Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;
/*     */     //   562: aload #5
/*     */     //   564: ldc -1642342315
/*     */     //   566: invokeinterface startReplaceGroup : (I)V
/*     */     //   571: aload #5
/*     */     //   573: astore #13
/*     */     //   575: iload #8
/*     */     //   577: bipush #14
/*     */     //   579: iand
/*     */     //   580: iconst_4
/*     */     //   581: if_icmpne -> 588
/*     */     //   584: iconst_1
/*     */     //   585: goto -> 589
/*     */     //   588: iconst_0
/*     */     //   589: istore #14
/*     */     //   591: nop
/*     */     //   592: iconst_0
/*     */     //   593: istore #15
/*     */     //   595: aload #13
/*     */     //   597: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   602: astore #16
/*     */     //   604: iconst_0
/*     */     //   605: istore #17
/*     */     //   607: iload #14
/*     */     //   609: ifne -> 623
/*     */     //   612: aload #16
/*     */     //   614: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   617: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   620: if_acmpne -> 653
/*     */     //   623: astore #20
/*     */     //   625: iconst_0
/*     */     //   626: istore #18
/*     */     //   628: aload_0
/*     */     //   629: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   634: aload #20
/*     */     //   636: swap
/*     */     //   637: astore #19
/*     */     //   639: aload #13
/*     */     //   641: aload #19
/*     */     //   643: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   648: aload #19
/*     */     //   650: goto -> 655
/*     */     //   653: aload #16
/*     */     //   655: nop
/*     */     //   656: nop
/*     */     //   657: nop
/*     */     //   658: checkcast kotlin/jvm/functions/Function0
/*     */     //   661: astore #12
/*     */     //   663: aload #5
/*     */     //   665: invokeinterface endReplaceGroup : ()V
/*     */     //   670: aload #12
/*     */     //   672: new androidx/compose/ui/window/PopupProperties
/*     */     //   675: dup
/*     */     //   676: iload_2
/*     */     //   677: iconst_0
/*     */     //   678: iconst_0
/*     */     //   679: iconst_0
/*     */     //   680: bipush #14
/*     */     //   682: aconst_null
/*     */     //   683: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   686: aload #5
/*     */     //   688: ldc -1642338247
/*     */     //   690: invokeinterface startReplaceGroup : (I)V
/*     */     //   695: aload #5
/*     */     //   697: astore #13
/*     */     //   699: iconst_0
/*     */     //   700: istore #14
/*     */     //   702: nop
/*     */     //   703: iconst_0
/*     */     //   704: istore #15
/*     */     //   706: aload #13
/*     */     //   708: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   713: astore #16
/*     */     //   715: iconst_0
/*     */     //   716: istore #17
/*     */     //   718: aload #16
/*     */     //   720: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   723: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   726: if_acmpne -> 770
/*     */     //   729: astore #22
/*     */     //   731: astore #21
/*     */     //   733: astore #20
/*     */     //   735: iconst_0
/*     */     //   736: istore #18
/*     */     //   738: getstatic org/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$2$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$2$1;
/*     */     //   741: checkcast kotlin/jvm/functions/Function1
/*     */     //   744: astore #23
/*     */     //   746: aload #20
/*     */     //   748: aload #21
/*     */     //   750: aload #22
/*     */     //   752: aload #23
/*     */     //   754: astore #18
/*     */     //   756: aload #13
/*     */     //   758: aload #18
/*     */     //   760: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   765: aload #18
/*     */     //   767: goto -> 772
/*     */     //   770: aload #16
/*     */     //   772: nop
/*     */     //   773: nop
/*     */     //   774: nop
/*     */     //   775: checkcast kotlin/jvm/functions/Function1
/*     */     //   778: astore #12
/*     */     //   780: aload #5
/*     */     //   782: invokeinterface endReplaceGroup : ()V
/*     */     //   787: aload #12
/*     */     //   789: aload #5
/*     */     //   791: ldc -1642336906
/*     */     //   793: invokeinterface startReplaceGroup : (I)V
/*     */     //   798: aload #5
/*     */     //   800: astore #13
/*     */     //   802: aload #5
/*     */     //   804: aload #9
/*     */     //   806: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   811: aload #5
/*     */     //   813: aload #10
/*     */     //   815: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   820: ior
/*     */     //   821: aload #5
/*     */     //   823: aload #11
/*     */     //   825: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   830: ior
/*     */     //   831: istore #14
/*     */     //   833: nop
/*     */     //   834: iconst_0
/*     */     //   835: istore #15
/*     */     //   837: aload #13
/*     */     //   839: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   844: astore #16
/*     */     //   846: iconst_0
/*     */     //   847: istore #17
/*     */     //   849: iload #14
/*     */     //   851: ifne -> 865
/*     */     //   854: aload #16
/*     */     //   856: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   859: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   862: if_acmpne -> 920
/*     */     //   865: astore #23
/*     */     //   867: astore #22
/*     */     //   869: astore #21
/*     */     //   871: astore #20
/*     */     //   873: iconst_0
/*     */     //   874: istore #18
/*     */     //   876: new org/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$3$1
/*     */     //   879: dup
/*     */     //   880: aload #11
/*     */     //   882: aload #9
/*     */     //   884: aload #10
/*     */     //   886: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   889: checkcast kotlin/jvm/functions/Function1
/*     */     //   892: astore #24
/*     */     //   894: aload #20
/*     */     //   896: aload #21
/*     */     //   898: aload #22
/*     */     //   900: aload #23
/*     */     //   902: aload #24
/*     */     //   904: astore #19
/*     */     //   906: aload #13
/*     */     //   908: aload #19
/*     */     //   910: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   915: aload #19
/*     */     //   917: goto -> 922
/*     */     //   920: aload #16
/*     */     //   922: nop
/*     */     //   923: nop
/*     */     //   924: nop
/*     */     //   925: checkcast kotlin/jvm/functions/Function1
/*     */     //   928: astore #12
/*     */     //   930: aload #5
/*     */     //   932: invokeinterface endReplaceGroup : ()V
/*     */     //   937: aload #12
/*     */     //   939: ldc 694698659
/*     */     //   941: iconst_1
/*     */     //   942: new org/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$4
/*     */     //   945: dup
/*     */     //   946: aload #11
/*     */     //   948: aload #9
/*     */     //   950: aload #10
/*     */     //   952: aload_1
/*     */     //   953: aload #4
/*     */     //   955: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/MenuManager;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)V
/*     */     //   958: aload #5
/*     */     //   960: bipush #54
/*     */     //   962: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   965: checkcast kotlin/jvm/functions/Function2
/*     */     //   968: aload #5
/*     */     //   970: ldc 199680
/*     */     //   972: iconst_0
/*     */     //   973: invokestatic Popup : (Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   976: invokestatic isTraceInProgress : ()Z
/*     */     //   979: ifeq -> 995
/*     */     //   982: invokestatic traceEventEnd : ()V
/*     */     //   985: goto -> 995
/*     */     //   988: aload #5
/*     */     //   990: invokeinterface skipToGroupEnd : ()V
/*     */     //   995: aload #5
/*     */     //   997: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1002: dup
/*     */     //   1003: ifnull -> 1029
/*     */     //   1006: aload_0
/*     */     //   1007: aload_1
/*     */     //   1008: iload_2
/*     */     //   1009: aload_3
/*     */     //   1010: aload #4
/*     */     //   1012: iload #6
/*     */     //   1014: iload #7
/*     */     //   1016: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/component/styling/MenuStyle;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1021: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1026: goto -> 1030
/*     */     //   1029: pop
/*     */     //   1030: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #51	-> 13
/*     */     //   #47	-> 323
/*     */     //   #48	-> 337
/*     */     //   #49	-> 347
/*     */     //   #51	-> 412
/*     */     //   #52	-> 415
/*     */     //   #53	-> 424
/*     */     //   #54	-> 462
/*     */     //   #97	-> 466
/*     */     //   #98	-> 478
/*     */     //   #99	-> 494
/*     */     //   #54	-> 497
/*     */     //   #99	-> 508
/*     */     //   #100	-> 510
/*     */     //   #101	-> 519
/*     */     //   #102	-> 524
/*     */     //   #98	-> 526
/*     */     //   #97	-> 527
/*     */     //   #97	-> 528
/*     */     //   #54	-> 529
/*     */     //   #57	-> 545
/*     */     //   #58	-> 591
/*     */     //   #103	-> 595
/*     */     //   #104	-> 607
/*     */     //   #105	-> 623
/*     */     //   #58	-> 628
/*     */     //   #105	-> 637
/*     */     //   #106	-> 639
/*     */     //   #107	-> 648
/*     */     //   #108	-> 653
/*     */     //   #104	-> 655
/*     */     //   #103	-> 656
/*     */     //   #103	-> 657
/*     */     //   #58	-> 658
/*     */     //   #59	-> 672
/*     */     //   #60	-> 702
/*     */     //   #109	-> 706
/*     */     //   #110	-> 718
/*     */     //   #111	-> 729
/*     */     //   #60	-> 738
/*     */     //   #111	-> 754
/*     */     //   #112	-> 756
/*     */     //   #113	-> 765
/*     */     //   #114	-> 770
/*     */     //   #110	-> 772
/*     */     //   #109	-> 773
/*     */     //   #109	-> 774
/*     */     //   #60	-> 775
/*     */     //   #61	-> 833
/*     */     //   #115	-> 837
/*     */     //   #116	-> 849
/*     */     //   #117	-> 865
/*     */     //   #61	-> 876
/*     */     //   #117	-> 904
/*     */     //   #118	-> 906
/*     */     //   #119	-> 915
/*     */     //   #120	-> 920
/*     */     //   #116	-> 922
/*     */     //   #115	-> 923
/*     */     //   #115	-> 924
/*     */     //   #61	-> 925
/*     */     //   #66	-> 939
/*     */     //   #56	-> 973
/*     */     //   #74	-> 988
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   497	11	18	$i$a$-cache-ContextMenuKt$ContextMenu$menuManager$1	I
/*     */     //   510	11	19	value$iv	Ljava/lang/Object;
/*     */     //   478	49	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   475	52	16	it$iv	Ljava/lang/Object;
/*     */     //   466	63	15	$i$f$cache	I
/*     */     //   463	66	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   463	66	14	invalid$iv	Z
/*     */     //   628	6	18	$i$a$-cache-ContextMenuKt$ContextMenu$1	I
/*     */     //   639	11	19	value$iv	Ljava/lang/Object;
/*     */     //   607	49	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   604	52	16	it$iv	Ljava/lang/Object;
/*     */     //   595	63	15	$i$f$cache	I
/*     */     //   592	66	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   592	66	14	invalid$iv	Z
/*     */     //   738	6	18	$i$a$-cache-ContextMenuKt$ContextMenu$2	I
/*     */     //   756	11	18	value$iv	Ljava/lang/Object;
/*     */     //   718	55	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   715	58	16	it$iv	Ljava/lang/Object;
/*     */     //   706	69	15	$i$f$cache	I
/*     */     //   703	72	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   703	72	14	invalid$iv	Z
/*     */     //   876	16	18	$i$a$-cache-ContextMenuKt$ContextMenu$3	I
/*     */     //   906	11	19	value$iv	Ljava/lang/Object;
/*     */     //   849	74	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   846	77	16	it$iv	Ljava/lang/Object;
/*     */     //   837	88	15	$i$f$cache	I
/*     */     //   834	91	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   834	91	14	invalid$iv	Z
/*     */     //   424	561	9	focusManager$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   433	552	10	inputModeManager$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   545	440	11	menuManager	Lorg/jetbrains/jewel/ui/component/MenuManager;
/*     */     //   28	1003	8	$dirty	I
/*     */     //   0	1031	0	onDismissRequest	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1031	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1031	2	focusable	Z
/*     */     //   0	1031	3	style	Lorg/jetbrains/jewel/ui/component/styling/MenuStyle;
/*     */     //   0	1031	4	content	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1031	5	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1031	6	$changed	I
/*     */   }
/*     */   
/*     */   private static final FocusManager ContextMenu$lambda$0(MutableState $focusManager$delegate) {
/*  52 */     State state = (State)$focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 123 */       (FocusManager)state.getValue(); } private static final void ContextMenu$lambda$1(MutableState $focusManager$delegate, FocusManager <set-?>) { MutableState mutableState = $focusManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 124 */     mutableState.setValue(<set-?>); } private static final InputModeManager ContextMenu$lambda$2(MutableState $inputModeManager$delegate) { State state = (State)$inputModeManager$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 126 */     return (InputModeManager)state.getValue(); } private static final void ContextMenu$lambda$3(MutableState $inputModeManager$delegate, InputModeManager <set-?>) { MutableState mutableState = $inputModeManager$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 127 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private static final Unit ContextMenu$lambda$6$lambda$5(Function1 $onDismissRequest) {
/*     */     $onDismissRequest.invoke(InputMode.box-impl(InputMode.Companion.getTouch-aOaMEAU()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ContextMenuKt$ContextMenu$2$1 implements Function1<KeyEvent, Boolean> {
/*     */     public static final ContextMenuKt$ContextMenu$2$1 INSTANCE = new ContextMenuKt$ContextMenu$2$1();
/*     */     
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf(false);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/*     */   static final class ContextMenuKt$ContextMenu$3$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       FocusManager currentFocusManager;
/*     */       InputModeManager currentInputModeManager;
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (ContextMenuKt.ContextMenu$lambda$0(this.$focusManager$delegate) == null) {
/*     */         ContextMenuKt.ContextMenu$lambda$0(this.$focusManager$delegate);
/*     */         int $i$a$-checkNotNull-ContextMenuKt$ContextMenu$3$1$currentFocusManager$1 = 0;
/*     */         String str = "FocusManager must not be null";
/*     */         throw new IllegalStateException(str.toString());
/*     */       } 
/*     */       if (ContextMenuKt.ContextMenu$lambda$2(this.$inputModeManager$delegate) == null) {
/*     */         ContextMenuKt.ContextMenu$lambda$2(this.$inputModeManager$delegate);
/*     */         int $i$a$-checkNotNull-ContextMenuKt$ContextMenu$3$1$currentInputModeManager$1 = 0;
/*     */         String str = "InputModeManager must not be null";
/*     */         throw new IllegalStateException(str.toString());
/*     */       } 
/*     */       return Boolean.valueOf(PopupKt.handlePopupMenuOnKeyEvent-jhbQyNo(it, currentFocusManager, currentInputModeManager, this.$menuManager));
/*     */     }
/*     */     
/*     */     ContextMenuKt$ContextMenu$3$1(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nContextMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$4\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,96:1\n77#2:97\n77#2:98\n*S KotlinDebug\n*F\n+ 1 ContextMenu.kt\norg/jetbrains/jewel/ui/component/ContextMenuKt$ContextMenu$4\n*L\n67#1:97\n68#1:98\n*E\n"})
/*     */   static final class ContextMenuKt$ContextMenu$4 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(694698659, $changed, -1, "org.jetbrains.jewel.ui.component.ContextMenu.<anonymous> (ContextMenu.kt:66)"); 
/*     */         CompositionLocal compositionLocal1 = (CompositionLocal)CompositionLocalsKt.getLocalFocusManager();
/*     */         int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */         Object object = $composer.consume(compositionLocal1);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ContextMenuKt.ContextMenu$lambda$1(this.$focusManager$delegate, (FocusManager)object);
/*     */         CompositionLocal this_$iv = (CompositionLocal)CompositionLocalsKt.getLocalInputModeManager();
/*     */         $changed$iv = 0;
/*     */         $i$f$getCurrent = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */         object = $composer.consume(this_$iv);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ContextMenuKt.ContextMenu$lambda$3(this.$inputModeManager$delegate, (InputModeManager)object);
/*     */         CompositionLocalKt.CompositionLocalProvider(MenuManagerKt.getLocalMenuManager().provides(this.$menuManager), (Function2)ComposableLambdaKt.rememberComposableLambda(423315299, true, new Function2<Composer, Integer, Unit>(this.$modifier, this.$content) {
/*     */                 @Composable
/*     */                 @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */                 public final void invoke(Composer $composer, int $changed) {
/*     */                   if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                     if (ComposerKt.isTraceInProgress())
/*     */                       ComposerKt.traceEventStart(423315299, $changed, -1, "org.jetbrains.jewel.ui.component.ContextMenu.<anonymous>.<anonymous> (ContextMenu.kt:70)"); 
/*     */                     MenuKt.MenuContent(this.$modifier, null, this.$content, $composer, 0, 2);
/*     */                     if (ComposerKt.isTraceInProgress())
/*     */                       ComposerKt.traceEventEnd(); 
/*     */                   } else {
/*     */                     $composer.skipToGroupEnd();
/*     */                   } 
/*     */                 }
/*     */               }$composer, 54), $composer, 0x30 | ProvidedValue.$stable);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     ContextMenuKt$ContextMenu$4(MenuManager $menuManager, MutableState<FocusManager> $focusManager$delegate, MutableState<InputModeManager> $inputModeManager$delegate, Modifier $modifier, Function1<MenuScope, Unit> $content) {}
/*     */   }
/*     */   
/*     */   private static final void contextItems(MenuScope $this$contextItems, Function0 items) {
/*     */     Iterable $this$forEach$iv = (Iterable)items.invoke();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       ContextMenuItem item = (ContextMenuItem)element$iv;
/*     */       int $i$a$-forEach-ContextMenuKt$contextItems$1 = 0;
/*     */       ContextMenuItem contextMenuItem1 = item;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Unit contextItems$lambda$11$lambda$10(ContextMenuItem $item, MenuScope $this$submenu) {
/*     */     Intrinsics.checkNotNullParameter($this$submenu, "$this$submenu");
/*     */     contextItems($this$submenu, ((ContextSubmenu)$item).getSubmenu());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ContextMenu$lambda$9(Function1<? super InputMode, Boolean> $onDismissRequest, Modifier $modifier, boolean $focusable, MenuStyle $style, Function1<? super MenuScope, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     ContextMenu($onDismissRequest, $modifier, $focusable, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ContextMenuKt$contextItems$1$2 implements Function2<Composer, Integer, Unit> {
/*     */     ContextMenuKt$contextItems$1$2(ContextMenuItem $item) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1189390826, $changed, -1, "org.jetbrains.jewel.ui.component.contextItems.<anonymous>.<anonymous> (ContextMenu.kt:82)"); 
/*     */         TextKt.Text-bAzTDeA(this.$item.getLabel(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ContextMenuKt$contextItems$1$3 implements Function2<Composer, Integer, Unit> {
/*     */     ContextMenuKt$contextItems$1$3(ContextMenuItem $item) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1810151296, $changed, -1, "org.jetbrains.jewel.ui.component.contextItems.<anonymous>.<anonymous> (ContextMenu.kt:85)"); 
/*     */         TextKt.Text-bAzTDeA(this.$item.getLabel(), null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ContextMenuKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */