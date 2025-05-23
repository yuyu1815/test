/*     */ package org.jetbrains.jewel.foundation.lazy;
/*     */ import androidx.compose.foundation.gestures.FlingBehavior;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.lazy.LazyItemScope;
/*     */ import androidx.compose.foundation.lazy.LazyListScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.foundation.lazy.tree.KeyActions;
/*     */ import org.jetbrains.jewel.foundation.lazy.tree.PointerEventActions;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020 \n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\032°\001\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\032\b\002\020\f\032\024\022\n\022\b\022\004\022\0020\0170\016\022\004\022\0020\0010\r2\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\0252\b\b\002\020\026\032\0020\0272\b\b\002\020\030\032\0020\0312\b\b\002\020\032\032\0020\0332\027\020\034\032\023\022\004\022\0020\035\022\004\022\0020\0010\r¢\006\002\b\036H\007¢\006\002\020\037\032f\020 \032\0020\001*\0020!2\006\020\"\032\0020#2\006\020\006\032\0020\0072\006\020$\032\0020\0132\f\020%\032\b\022\004\022\0020&0\0162\006\020'\032\0020(2\006\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\004\032\0020\0052\022\020)\032\016\022\004\022\0020*\022\004\022\0020\0130\rH\002\032N\020+\032\0020\003*\0020\0032\n\b\002\020,\032\004\030\0010(2\006\020-\032\0020.2\006\020/\032\0020\0312\006\020\004\032\0020\0052\006\0200\032\0020\0072\f\0201\032\b\022\004\022\0020&0\0162\006\0202\032\0020*H\002¨\0063²\006\n\020$\032\0020\013X\002"}, d2 = {"SelectableLazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectionMode", "Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "onSelectedIndexesChange", "Lkotlin/Function1;", "", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "keyActions", "Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;", "pointerEventActions", "Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "appendEntry", "Landroidx/compose/foundation/lazy/LazyListScope;", "entry", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;", "isFocused", "keys", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "isKeySelectable", "", "selectable", "requester", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "actionHandler", "selectableState", "allKeys", "itemKey", "foundation"})
/*     */ @SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n149#2:246\n1225#3,6:247\n1225#3,6:253\n1225#3,3:264\n1228#3,3:270\n1225#3,6:274\n1225#3,6:280\n1225#3,6:286\n1225#3,6:293\n1225#3,6:299\n1225#3,6:305\n1225#3,6:311\n481#4:259\n480#4,4:260\n484#4,2:267\n488#4:273\n480#5:269\n77#6:292\n81#7:317\n107#7,2:318\n1855#8,2:320\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt\n*L\n50#1:246\n52#1:247,6\n58#1:253,6\n61#1:264,3\n61#1:270,3\n64#1:274,6\n65#1:280,6\n68#1:286,6\n76#1:293,6\n80#1:299,6\n90#1:305,6\n112#1:311,6\n61#1:259\n61#1:260,4\n61#1:267,2\n61#1:273\n61#1:269\n75#1:292\n65#1:317\n65#1:318,2\n113#1:320,2\n*E\n"})
/*     */ public final class SelectableLazyColumnKt {
/*     */   private static final Unit SelectableLazyColumn$lambda$1$lambda$0(List it) {
/*  52 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void SelectableLazyColumn(@Nullable Modifier modifier, @Nullable SelectionMode selectionMode, @Nullable SelectableLazyListState state, @Nullable PaddingValues contentPadding, boolean reverseLayout, @Nullable Function1 onSelectedIndexesChange, @Nullable Arrangement.Vertical verticalArrangement, @Nullable Alignment.Horizontal horizontalAlignment, @Nullable FlingBehavior flingBehavior, @Nullable KeyActions keyActions, @Nullable PointerEventActions pointerEventActions, @Nullable MutableInteractionSource interactionSource, @NotNull Function1 content, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #12
/*     */     //   2: ldc 'content'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #13
/*     */     //   9: ldc -277543895
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore #13
/*     */     //   18: iload #14
/*     */     //   20: istore #17
/*     */     //   22: iload #15
/*     */     //   24: istore #18
/*     */     //   26: iload #16
/*     */     //   28: iconst_1
/*     */     //   29: iand
/*     */     //   30: ifeq -> 43
/*     */     //   33: iload #17
/*     */     //   35: bipush #6
/*     */     //   37: ior
/*     */     //   38: istore #17
/*     */     //   40: goto -> 72
/*     */     //   43: iload #14
/*     */     //   45: bipush #6
/*     */     //   47: iand
/*     */     //   48: ifne -> 72
/*     */     //   51: iload #17
/*     */     //   53: aload #13
/*     */     //   55: aload_0
/*     */     //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   61: ifeq -> 68
/*     */     //   64: iconst_4
/*     */     //   65: goto -> 69
/*     */     //   68: iconst_2
/*     */     //   69: ior
/*     */     //   70: istore #17
/*     */     //   72: iload #16
/*     */     //   74: iconst_2
/*     */     //   75: iand
/*     */     //   76: ifeq -> 89
/*     */     //   79: iload #17
/*     */     //   81: bipush #48
/*     */     //   83: ior
/*     */     //   84: istore #17
/*     */     //   86: goto -> 120
/*     */     //   89: iload #14
/*     */     //   91: bipush #48
/*     */     //   93: iand
/*     */     //   94: ifne -> 120
/*     */     //   97: iload #17
/*     */     //   99: aload #13
/*     */     //   101: aload_1
/*     */     //   102: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   107: ifeq -> 115
/*     */     //   110: bipush #32
/*     */     //   112: goto -> 117
/*     */     //   115: bipush #16
/*     */     //   117: ior
/*     */     //   118: istore #17
/*     */     //   120: iload #14
/*     */     //   122: sipush #384
/*     */     //   125: iand
/*     */     //   126: ifne -> 161
/*     */     //   129: iload #17
/*     */     //   131: iload #16
/*     */     //   133: iconst_4
/*     */     //   134: iand
/*     */     //   135: ifne -> 155
/*     */     //   138: aload #13
/*     */     //   140: aload_2
/*     */     //   141: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   146: ifeq -> 155
/*     */     //   149: sipush #256
/*     */     //   152: goto -> 158
/*     */     //   155: sipush #128
/*     */     //   158: ior
/*     */     //   159: istore #17
/*     */     //   161: iload #16
/*     */     //   163: bipush #8
/*     */     //   165: iand
/*     */     //   166: ifeq -> 180
/*     */     //   169: iload #17
/*     */     //   171: sipush #3072
/*     */     //   174: ior
/*     */     //   175: istore #17
/*     */     //   177: goto -> 214
/*     */     //   180: iload #14
/*     */     //   182: sipush #3072
/*     */     //   185: iand
/*     */     //   186: ifne -> 214
/*     */     //   189: iload #17
/*     */     //   191: aload #13
/*     */     //   193: aload_3
/*     */     //   194: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   199: ifeq -> 208
/*     */     //   202: sipush #2048
/*     */     //   205: goto -> 211
/*     */     //   208: sipush #1024
/*     */     //   211: ior
/*     */     //   212: istore #17
/*     */     //   214: iload #16
/*     */     //   216: bipush #16
/*     */     //   218: iand
/*     */     //   219: ifeq -> 233
/*     */     //   222: iload #17
/*     */     //   224: sipush #24576
/*     */     //   227: ior
/*     */     //   228: istore #17
/*     */     //   230: goto -> 268
/*     */     //   233: iload #14
/*     */     //   235: sipush #24576
/*     */     //   238: iand
/*     */     //   239: ifne -> 268
/*     */     //   242: iload #17
/*     */     //   244: aload #13
/*     */     //   246: iload #4
/*     */     //   248: invokeinterface changed : (Z)Z
/*     */     //   253: ifeq -> 262
/*     */     //   256: sipush #16384
/*     */     //   259: goto -> 265
/*     */     //   262: sipush #8192
/*     */     //   265: ior
/*     */     //   266: istore #17
/*     */     //   268: iload #16
/*     */     //   270: bipush #32
/*     */     //   272: iand
/*     */     //   273: ifeq -> 286
/*     */     //   276: iload #17
/*     */     //   278: ldc 196608
/*     */     //   280: ior
/*     */     //   281: istore #17
/*     */     //   283: goto -> 318
/*     */     //   286: iload #14
/*     */     //   288: ldc 196608
/*     */     //   290: iand
/*     */     //   291: ifne -> 318
/*     */     //   294: iload #17
/*     */     //   296: aload #13
/*     */     //   298: aload #5
/*     */     //   300: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   305: ifeq -> 313
/*     */     //   308: ldc 131072
/*     */     //   310: goto -> 315
/*     */     //   313: ldc 65536
/*     */     //   315: ior
/*     */     //   316: istore #17
/*     */     //   318: iload #14
/*     */     //   320: ldc 1572864
/*     */     //   322: iand
/*     */     //   323: ifne -> 358
/*     */     //   326: iload #17
/*     */     //   328: iload #16
/*     */     //   330: bipush #64
/*     */     //   332: iand
/*     */     //   333: ifne -> 353
/*     */     //   336: aload #13
/*     */     //   338: aload #6
/*     */     //   340: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   345: ifeq -> 353
/*     */     //   348: ldc 1048576
/*     */     //   350: goto -> 355
/*     */     //   353: ldc 524288
/*     */     //   355: ior
/*     */     //   356: istore #17
/*     */     //   358: iload #16
/*     */     //   360: sipush #128
/*     */     //   363: iand
/*     */     //   364: ifeq -> 377
/*     */     //   367: iload #17
/*     */     //   369: ldc 12582912
/*     */     //   371: ior
/*     */     //   372: istore #17
/*     */     //   374: goto -> 409
/*     */     //   377: iload #14
/*     */     //   379: ldc 12582912
/*     */     //   381: iand
/*     */     //   382: ifne -> 409
/*     */     //   385: iload #17
/*     */     //   387: aload #13
/*     */     //   389: aload #7
/*     */     //   391: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   396: ifeq -> 404
/*     */     //   399: ldc 8388608
/*     */     //   401: goto -> 406
/*     */     //   404: ldc 4194304
/*     */     //   406: ior
/*     */     //   407: istore #17
/*     */     //   409: iload #14
/*     */     //   411: ldc 100663296
/*     */     //   413: iand
/*     */     //   414: ifne -> 450
/*     */     //   417: iload #17
/*     */     //   419: iload #16
/*     */     //   421: sipush #256
/*     */     //   424: iand
/*     */     //   425: ifne -> 445
/*     */     //   428: aload #13
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   437: ifeq -> 445
/*     */     //   440: ldc 67108864
/*     */     //   442: goto -> 447
/*     */     //   445: ldc 33554432
/*     */     //   447: ior
/*     */     //   448: istore #17
/*     */     //   450: iload #16
/*     */     //   452: sipush #512
/*     */     //   455: iand
/*     */     //   456: ifeq -> 469
/*     */     //   459: iload #17
/*     */     //   461: ldc 805306368
/*     */     //   463: ior
/*     */     //   464: istore #17
/*     */     //   466: goto -> 521
/*     */     //   469: iload #14
/*     */     //   471: ldc 805306368
/*     */     //   473: iand
/*     */     //   474: ifne -> 521
/*     */     //   477: iload #17
/*     */     //   479: iload #14
/*     */     //   481: ldc 1073741824
/*     */     //   483: iand
/*     */     //   484: ifne -> 499
/*     */     //   487: aload #13
/*     */     //   489: aload #9
/*     */     //   491: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   496: goto -> 508
/*     */     //   499: aload #13
/*     */     //   501: aload #9
/*     */     //   503: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   508: ifeq -> 516
/*     */     //   511: ldc 536870912
/*     */     //   513: goto -> 518
/*     */     //   516: ldc 268435456
/*     */     //   518: ior
/*     */     //   519: istore #17
/*     */     //   521: iload #15
/*     */     //   523: bipush #6
/*     */     //   525: iand
/*     */     //   526: ifne -> 580
/*     */     //   529: iload #18
/*     */     //   531: iload #16
/*     */     //   533: sipush #1024
/*     */     //   536: iand
/*     */     //   537: ifne -> 576
/*     */     //   540: iload #15
/*     */     //   542: bipush #8
/*     */     //   544: iand
/*     */     //   545: ifne -> 560
/*     */     //   548: aload #13
/*     */     //   550: aload #10
/*     */     //   552: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   557: goto -> 569
/*     */     //   560: aload #13
/*     */     //   562: aload #10
/*     */     //   564: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   569: ifeq -> 576
/*     */     //   572: iconst_4
/*     */     //   573: goto -> 577
/*     */     //   576: iconst_2
/*     */     //   577: ior
/*     */     //   578: istore #18
/*     */     //   580: iload #16
/*     */     //   582: sipush #2048
/*     */     //   585: iand
/*     */     //   586: ifeq -> 599
/*     */     //   589: iload #18
/*     */     //   591: bipush #48
/*     */     //   593: ior
/*     */     //   594: istore #18
/*     */     //   596: goto -> 631
/*     */     //   599: iload #15
/*     */     //   601: bipush #48
/*     */     //   603: iand
/*     */     //   604: ifne -> 631
/*     */     //   607: iload #18
/*     */     //   609: aload #13
/*     */     //   611: aload #11
/*     */     //   613: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   618: ifeq -> 626
/*     */     //   621: bipush #32
/*     */     //   623: goto -> 628
/*     */     //   626: bipush #16
/*     */     //   628: ior
/*     */     //   629: istore #18
/*     */     //   631: iload #16
/*     */     //   633: sipush #4096
/*     */     //   636: iand
/*     */     //   637: ifeq -> 651
/*     */     //   640: iload #18
/*     */     //   642: sipush #384
/*     */     //   645: ior
/*     */     //   646: istore #18
/*     */     //   648: goto -> 686
/*     */     //   651: iload #15
/*     */     //   653: sipush #384
/*     */     //   656: iand
/*     */     //   657: ifne -> 686
/*     */     //   660: iload #18
/*     */     //   662: aload #13
/*     */     //   664: aload #12
/*     */     //   666: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   671: ifeq -> 680
/*     */     //   674: sipush #256
/*     */     //   677: goto -> 683
/*     */     //   680: sipush #128
/*     */     //   683: ior
/*     */     //   684: istore #18
/*     */     //   686: iload #17
/*     */     //   688: ldc 306783379
/*     */     //   690: iand
/*     */     //   691: ldc 306783378
/*     */     //   693: if_icmpne -> 718
/*     */     //   696: iload #18
/*     */     //   698: sipush #147
/*     */     //   701: iand
/*     */     //   702: sipush #146
/*     */     //   705: if_icmpne -> 718
/*     */     //   708: aload #13
/*     */     //   710: invokeinterface getSkipping : ()Z
/*     */     //   715: ifne -> 2635
/*     */     //   718: aload #13
/*     */     //   720: invokeinterface startDefaults : ()V
/*     */     //   725: iload #14
/*     */     //   727: iconst_1
/*     */     //   728: iand
/*     */     //   729: ifeq -> 742
/*     */     //   732: aload #13
/*     */     //   734: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   739: ifeq -> 1147
/*     */     //   742: iload #16
/*     */     //   744: iconst_1
/*     */     //   745: iand
/*     */     //   746: ifeq -> 756
/*     */     //   749: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   752: checkcast androidx/compose/ui/Modifier
/*     */     //   755: astore_0
/*     */     //   756: iload #16
/*     */     //   758: iconst_2
/*     */     //   759: iand
/*     */     //   760: ifeq -> 767
/*     */     //   763: getstatic org/jetbrains/jewel/foundation/lazy/SelectionMode.Multiple : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   766: astore_1
/*     */     //   767: iload #16
/*     */     //   769: iconst_4
/*     */     //   770: iand
/*     */     //   771: ifeq -> 792
/*     */     //   774: iconst_0
/*     */     //   775: iconst_0
/*     */     //   776: aload #13
/*     */     //   778: iconst_0
/*     */     //   779: iconst_3
/*     */     //   780: invokestatic rememberSelectableLazyListState : (IILandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   783: astore_2
/*     */     //   784: iload #17
/*     */     //   786: sipush #-897
/*     */     //   789: iand
/*     */     //   790: istore #17
/*     */     //   792: iload #16
/*     */     //   794: bipush #8
/*     */     //   796: iand
/*     */     //   797: ifeq -> 816
/*     */     //   800: iconst_0
/*     */     //   801: istore #19
/*     */     //   803: iconst_0
/*     */     //   804: istore #20
/*     */     //   806: iload #19
/*     */     //   808: i2f
/*     */     //   809: invokestatic constructor-impl : (F)F
/*     */     //   812: invokestatic PaddingValues-0680j_4 : (F)Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   815: astore_3
/*     */     //   816: iload #16
/*     */     //   818: bipush #16
/*     */     //   820: iand
/*     */     //   821: ifeq -> 827
/*     */     //   824: iconst_0
/*     */     //   825: istore #4
/*     */     //   827: iload #16
/*     */     //   829: bipush #32
/*     */     //   831: iand
/*     */     //   832: ifeq -> 922
/*     */     //   835: aload #13
/*     */     //   837: ldc 101034286
/*     */     //   839: invokeinterface startReplaceGroup : (I)V
/*     */     //   844: aload #13
/*     */     //   846: astore #20
/*     */     //   848: iconst_0
/*     */     //   849: istore #21
/*     */     //   851: iconst_0
/*     */     //   852: istore #22
/*     */     //   854: aload #20
/*     */     //   856: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   861: astore #23
/*     */     //   863: iconst_0
/*     */     //   864: istore #24
/*     */     //   866: aload #23
/*     */     //   868: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   871: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   874: if_acmpne -> 901
/*     */     //   877: iconst_0
/*     */     //   878: istore #25
/*     */     //   880: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   885: astore #25
/*     */     //   887: aload #20
/*     */     //   889: aload #25
/*     */     //   891: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   896: aload #25
/*     */     //   898: goto -> 903
/*     */     //   901: aload #23
/*     */     //   903: nop
/*     */     //   904: nop
/*     */     //   905: nop
/*     */     //   906: checkcast kotlin/jvm/functions/Function1
/*     */     //   909: astore #19
/*     */     //   911: aload #13
/*     */     //   913: invokeinterface endReplaceGroup : ()V
/*     */     //   918: aload #19
/*     */     //   920: astore #5
/*     */     //   922: iload #16
/*     */     //   924: bipush #64
/*     */     //   926: iand
/*     */     //   927: ifeq -> 959
/*     */     //   930: iload #4
/*     */     //   932: ifne -> 944
/*     */     //   935: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   938: invokevirtual getTop : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   941: goto -> 950
/*     */     //   944: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   947: invokevirtual getBottom : ()Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   950: astore #6
/*     */     //   952: iload #17
/*     */     //   954: ldc -3670017
/*     */     //   956: iand
/*     */     //   957: istore #17
/*     */     //   959: iload #16
/*     */     //   961: sipush #128
/*     */     //   964: iand
/*     */     //   965: ifeq -> 976
/*     */     //   968: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   971: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   974: astore #7
/*     */     //   976: iload #16
/*     */     //   978: sipush #256
/*     */     //   981: iand
/*     */     //   982: ifeq -> 1005
/*     */     //   985: getstatic androidx/compose/foundation/gestures/ScrollableDefaults.INSTANCE : Landroidx/compose/foundation/gestures/ScrollableDefaults;
/*     */     //   988: aload #13
/*     */     //   990: getstatic androidx/compose/foundation/gestures/ScrollableDefaults.$stable : I
/*     */     //   993: invokevirtual flingBehavior : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/FlingBehavior;
/*     */     //   996: astore #8
/*     */     //   998: iload #17
/*     */     //   1000: ldc -234881025
/*     */     //   1002: iand
/*     */     //   1003: istore #17
/*     */     //   1005: iload #16
/*     */     //   1007: sipush #512
/*     */     //   1010: iand
/*     */     //   1011: ifeq -> 1022
/*     */     //   1014: getstatic org/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions.Companion : Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnKeyActions$Companion;
/*     */     //   1017: checkcast org/jetbrains/jewel/foundation/lazy/tree/KeyActions
/*     */     //   1020: astore #9
/*     */     //   1022: iload #16
/*     */     //   1024: sipush #1024
/*     */     //   1027: iand
/*     */     //   1028: ifeq -> 1050
/*     */     //   1031: new org/jetbrains/jewel/foundation/lazy/tree/DefaultSelectableLazyColumnEventAction
/*     */     //   1034: dup
/*     */     //   1035: invokespecial <init> : ()V
/*     */     //   1038: checkcast org/jetbrains/jewel/foundation/lazy/tree/PointerEventActions
/*     */     //   1041: astore #10
/*     */     //   1043: iload #18
/*     */     //   1045: bipush #-15
/*     */     //   1047: iand
/*     */     //   1048: istore #18
/*     */     //   1050: iload #16
/*     */     //   1052: sipush #2048
/*     */     //   1055: iand
/*     */     //   1056: ifeq -> 1216
/*     */     //   1059: aload #13
/*     */     //   1061: ldc 101048915
/*     */     //   1063: invokeinterface startReplaceGroup : (I)V
/*     */     //   1068: aload #13
/*     */     //   1070: astore #20
/*     */     //   1072: iconst_0
/*     */     //   1073: istore #21
/*     */     //   1075: iconst_0
/*     */     //   1076: istore #22
/*     */     //   1078: aload #20
/*     */     //   1080: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1085: astore #23
/*     */     //   1087: iconst_0
/*     */     //   1088: istore #24
/*     */     //   1090: aload #23
/*     */     //   1092: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1095: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1098: if_acmpne -> 1123
/*     */     //   1101: iconst_0
/*     */     //   1102: istore #25
/*     */     //   1104: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1107: astore #25
/*     */     //   1109: aload #20
/*     */     //   1111: aload #25
/*     */     //   1113: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1118: aload #25
/*     */     //   1120: goto -> 1125
/*     */     //   1123: aload #23
/*     */     //   1125: nop
/*     */     //   1126: nop
/*     */     //   1127: nop
/*     */     //   1128: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1131: astore #19
/*     */     //   1133: aload #13
/*     */     //   1135: invokeinterface endReplaceGroup : ()V
/*     */     //   1140: aload #19
/*     */     //   1142: astore #11
/*     */     //   1144: goto -> 1216
/*     */     //   1147: aload #13
/*     */     //   1149: invokeinterface skipToGroupEnd : ()V
/*     */     //   1154: iload #16
/*     */     //   1156: iconst_4
/*     */     //   1157: iand
/*     */     //   1158: ifeq -> 1169
/*     */     //   1161: iload #17
/*     */     //   1163: sipush #-897
/*     */     //   1166: iand
/*     */     //   1167: istore #17
/*     */     //   1169: iload #16
/*     */     //   1171: bipush #64
/*     */     //   1173: iand
/*     */     //   1174: ifeq -> 1184
/*     */     //   1177: iload #17
/*     */     //   1179: ldc -3670017
/*     */     //   1181: iand
/*     */     //   1182: istore #17
/*     */     //   1184: iload #16
/*     */     //   1186: sipush #256
/*     */     //   1189: iand
/*     */     //   1190: ifeq -> 1200
/*     */     //   1193: iload #17
/*     */     //   1195: ldc -234881025
/*     */     //   1197: iand
/*     */     //   1198: istore #17
/*     */     //   1200: iload #16
/*     */     //   1202: sipush #1024
/*     */     //   1205: iand
/*     */     //   1206: ifeq -> 1216
/*     */     //   1209: iload #18
/*     */     //   1211: bipush #-15
/*     */     //   1213: iand
/*     */     //   1214: istore #18
/*     */     //   1216: aload #13
/*     */     //   1218: invokeinterface endDefaults : ()V
/*     */     //   1223: invokestatic isTraceInProgress : ()Z
/*     */     //   1226: ifeq -> 1240
/*     */     //   1229: ldc -277543895
/*     */     //   1231: iload #17
/*     */     //   1233: iload #18
/*     */     //   1235: ldc 'org.jetbrains.jewel.foundation.lazy.SelectableLazyColumn (SelectableLazyColumn.kt:59)'
/*     */     //   1237: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1240: iconst_0
/*     */     //   1241: istore #21
/*     */     //   1243: nop
/*     */     //   1244: iconst_0
/*     */     //   1245: istore #22
/*     */     //   1247: aload #13
/*     */     //   1249: ldc 773894976
/*     */     //   1251: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   1253: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1256: aload #13
/*     */     //   1258: astore #23
/*     */     //   1260: aload #13
/*     */     //   1262: ldc -954370320
/*     */     //   1264: ldc 'CC(remember):Effects.kt#9igjgp'
/*     */     //   1266: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1269: aload #13
/*     */     //   1271: astore #24
/*     */     //   1273: iconst_0
/*     */     //   1274: istore #25
/*     */     //   1276: iconst_0
/*     */     //   1277: istore #26
/*     */     //   1279: aload #24
/*     */     //   1281: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1286: astore #27
/*     */     //   1288: iconst_0
/*     */     //   1289: istore #28
/*     */     //   1291: aload #27
/*     */     //   1293: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1296: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1299: if_acmpne -> 1346
/*     */     //   1302: iconst_0
/*     */     //   1303: istore #29
/*     */     //   1305: iconst_0
/*     */     //   1306: istore #30
/*     */     //   1308: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   1311: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   1314: aload #23
/*     */     //   1316: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1319: astore #43
/*     */     //   1321: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1324: dup
/*     */     //   1325: aload #43
/*     */     //   1327: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   1330: astore #30
/*     */     //   1332: aload #24
/*     */     //   1334: aload #30
/*     */     //   1336: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1341: aload #30
/*     */     //   1343: goto -> 1348
/*     */     //   1346: aload #27
/*     */     //   1348: nop
/*     */     //   1349: nop
/*     */     //   1350: nop
/*     */     //   1351: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   1354: astore #31
/*     */     //   1356: aload #13
/*     */     //   1358: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1361: aload #31
/*     */     //   1363: astore #32
/*     */     //   1365: aload #32
/*     */     //   1367: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1370: astore #31
/*     */     //   1372: aload #13
/*     */     //   1374: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1377: aload #31
/*     */     //   1379: nop
/*     */     //   1380: astore #19
/*     */     //   1382: new org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer
/*     */     //   1385: dup
/*     */     //   1386: invokespecial <init> : ()V
/*     */     //   1389: astore #21
/*     */     //   1391: aload #12
/*     */     //   1393: aload #21
/*     */     //   1395: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1400: pop
/*     */     //   1401: aload #21
/*     */     //   1403: astore #20
/*     */     //   1405: aload #13
/*     */     //   1407: ldc_w 101055991
/*     */     //   1410: invokeinterface startReplaceGroup : (I)V
/*     */     //   1415: aload #13
/*     */     //   1417: astore #23
/*     */     //   1419: aload #13
/*     */     //   1421: aload #20
/*     */     //   1423: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1428: istore #24
/*     */     //   1430: iconst_0
/*     */     //   1431: istore #25
/*     */     //   1433: aload #23
/*     */     //   1435: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1440: astore #26
/*     */     //   1442: iconst_0
/*     */     //   1443: istore #27
/*     */     //   1445: iload #24
/*     */     //   1447: ifne -> 1461
/*     */     //   1450: aload #26
/*     */     //   1452: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1455: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1458: if_acmpne -> 1485
/*     */     //   1461: iconst_0
/*     */     //   1462: istore #28
/*     */     //   1464: aload #20
/*     */     //   1466: invokevirtual getKeys : ()Ljava/util/List;
/*     */     //   1469: astore #29
/*     */     //   1471: aload #23
/*     */     //   1473: aload #29
/*     */     //   1475: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1480: aload #29
/*     */     //   1482: goto -> 1487
/*     */     //   1485: aload #26
/*     */     //   1487: nop
/*     */     //   1488: nop
/*     */     //   1489: nop
/*     */     //   1490: checkcast java/util/List
/*     */     //   1493: astore #22
/*     */     //   1495: aload #13
/*     */     //   1497: invokeinterface endReplaceGroup : ()V
/*     */     //   1502: aload #22
/*     */     //   1504: astore #21
/*     */     //   1506: aload #13
/*     */     //   1508: ldc_w 101058062
/*     */     //   1511: invokeinterface startReplaceGroup : (I)V
/*     */     //   1516: aload #13
/*     */     //   1518: astore #24
/*     */     //   1520: iconst_0
/*     */     //   1521: istore #25
/*     */     //   1523: nop
/*     */     //   1524: iconst_0
/*     */     //   1525: istore #26
/*     */     //   1527: aload #24
/*     */     //   1529: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1534: astore #27
/*     */     //   1536: iconst_0
/*     */     //   1537: istore #28
/*     */     //   1539: aload #27
/*     */     //   1541: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1544: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1547: if_acmpne -> 1579
/*     */     //   1550: iconst_0
/*     */     //   1551: istore #29
/*     */     //   1553: iconst_0
/*     */     //   1554: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1557: aconst_null
/*     */     //   1558: iconst_2
/*     */     //   1559: aconst_null
/*     */     //   1560: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1563: astore #29
/*     */     //   1565: aload #24
/*     */     //   1567: aload #29
/*     */     //   1569: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1574: aload #29
/*     */     //   1576: goto -> 1581
/*     */     //   1579: aload #27
/*     */     //   1581: nop
/*     */     //   1582: nop
/*     */     //   1583: nop
/*     */     //   1584: checkcast androidx/compose/runtime/MutableState
/*     */     //   1587: astore #23
/*     */     //   1589: aload #13
/*     */     //   1591: invokeinterface endReplaceGroup : ()V
/*     */     //   1596: aload #23
/*     */     //   1598: astore #22
/*     */     //   1600: aload #5
/*     */     //   1602: aload #13
/*     */     //   1604: bipush #14
/*     */     //   1606: iload #17
/*     */     //   1608: bipush #15
/*     */     //   1610: ishr
/*     */     //   1611: iand
/*     */     //   1612: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1615: astore #23
/*     */     //   1617: aload_2
/*     */     //   1618: aload #20
/*     */     //   1620: aload #13
/*     */     //   1622: ldc_w 101063413
/*     */     //   1625: invokeinterface startReplaceGroup : (I)V
/*     */     //   1630: aload #13
/*     */     //   1632: astore #25
/*     */     //   1634: aload #13
/*     */     //   1636: aload_2
/*     */     //   1637: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1642: aload #13
/*     */     //   1644: aload #20
/*     */     //   1646: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1651: ior
/*     */     //   1652: aload #13
/*     */     //   1654: aload #23
/*     */     //   1656: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1661: ior
/*     */     //   1662: istore #26
/*     */     //   1664: iconst_0
/*     */     //   1665: istore #27
/*     */     //   1667: aload #25
/*     */     //   1669: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1674: astore #28
/*     */     //   1676: iconst_0
/*     */     //   1677: istore #29
/*     */     //   1679: iload #26
/*     */     //   1681: ifne -> 1695
/*     */     //   1684: aload #28
/*     */     //   1686: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1689: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1692: if_acmpne -> 1742
/*     */     //   1695: astore #35
/*     */     //   1697: astore #34
/*     */     //   1699: iconst_0
/*     */     //   1700: istore #30
/*     */     //   1702: new org/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$SelectableLazyColumn$3$1
/*     */     //   1705: dup
/*     */     //   1706: aload_2
/*     */     //   1707: aload #23
/*     */     //   1709: aload #20
/*     */     //   1711: aconst_null
/*     */     //   1712: invokespecial <init> : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/runtime/State;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer;Lkotlin/coroutines/Continuation;)V
/*     */     //   1715: checkcast kotlin/jvm/functions/Function2
/*     */     //   1718: astore #36
/*     */     //   1720: aload #34
/*     */     //   1722: aload #35
/*     */     //   1724: aload #36
/*     */     //   1726: astore #31
/*     */     //   1728: aload #25
/*     */     //   1730: aload #31
/*     */     //   1732: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1737: aload #31
/*     */     //   1739: goto -> 1744
/*     */     //   1742: aload #28
/*     */     //   1744: nop
/*     */     //   1745: nop
/*     */     //   1746: nop
/*     */     //   1747: checkcast kotlin/jvm/functions/Function2
/*     */     //   1750: astore #24
/*     */     //   1752: aload #13
/*     */     //   1754: invokeinterface endReplaceGroup : ()V
/*     */     //   1759: aload #24
/*     */     //   1761: aload #13
/*     */     //   1763: bipush #14
/*     */     //   1765: iload #17
/*     */     //   1767: bipush #6
/*     */     //   1769: ishr
/*     */     //   1770: iand
/*     */     //   1771: invokestatic LaunchedEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1774: invokestatic getLocalFocusManager : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1777: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1780: astore #25
/*     */     //   1782: iconst_0
/*     */     //   1783: istore #26
/*     */     //   1785: iconst_0
/*     */     //   1786: istore #27
/*     */     //   1788: aload #13
/*     */     //   1790: ldc_w 2023513938
/*     */     //   1793: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1796: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1799: aload #13
/*     */     //   1801: aload #25
/*     */     //   1803: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1808: astore #28
/*     */     //   1810: aload #13
/*     */     //   1812: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1815: aload #28
/*     */     //   1817: checkcast androidx/compose/ui/focus/FocusManager
/*     */     //   1820: astore #24
/*     */     //   1822: aload #13
/*     */     //   1824: ldc_w 101074057
/*     */     //   1827: invokeinterface startReplaceGroup : (I)V
/*     */     //   1832: aload #13
/*     */     //   1834: astore #27
/*     */     //   1836: iconst_0
/*     */     //   1837: istore #28
/*     */     //   1839: nop
/*     */     //   1840: iconst_0
/*     */     //   1841: istore #29
/*     */     //   1843: aload #27
/*     */     //   1845: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1850: astore #30
/*     */     //   1852: iconst_0
/*     */     //   1853: istore #31
/*     */     //   1855: aload #30
/*     */     //   1857: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1860: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1863: if_acmpne -> 1892
/*     */     //   1866: iconst_0
/*     */     //   1867: istore #32
/*     */     //   1869: new androidx/compose/ui/focus/FocusRequester
/*     */     //   1872: dup
/*     */     //   1873: invokespecial <init> : ()V
/*     */     //   1876: astore #32
/*     */     //   1878: aload #27
/*     */     //   1880: aload #32
/*     */     //   1882: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1887: aload #32
/*     */     //   1889: goto -> 1894
/*     */     //   1892: aload #30
/*     */     //   1894: nop
/*     */     //   1895: nop
/*     */     //   1896: nop
/*     */     //   1897: checkcast androidx/compose/ui/focus/FocusRequester
/*     */     //   1900: astore #26
/*     */     //   1902: aload #13
/*     */     //   1904: invokeinterface endReplaceGroup : ()V
/*     */     //   1909: aload #26
/*     */     //   1911: astore #25
/*     */     //   1913: aload_0
/*     */     //   1914: aload #13
/*     */     //   1916: ldc_w 101078124
/*     */     //   1919: invokeinterface startReplaceGroup : (I)V
/*     */     //   1924: aload #13
/*     */     //   1926: astore #27
/*     */     //   1928: aload #13
/*     */     //   1930: aload_2
/*     */     //   1931: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1936: iload #17
/*     */     //   1938: ldc_w 1879048192
/*     */     //   1941: iand
/*     */     //   1942: ldc 536870912
/*     */     //   1944: if_icmpeq -> 1967
/*     */     //   1947: iload #17
/*     */     //   1949: ldc 1073741824
/*     */     //   1951: iand
/*     */     //   1952: ifeq -> 1971
/*     */     //   1955: aload #13
/*     */     //   1957: aload #9
/*     */     //   1959: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1964: ifeq -> 1971
/*     */     //   1967: iconst_1
/*     */     //   1968: goto -> 1972
/*     */     //   1971: iconst_0
/*     */     //   1972: ior
/*     */     //   1973: aload #13
/*     */     //   1975: aload #21
/*     */     //   1977: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   1982: ior
/*     */     //   1983: istore #28
/*     */     //   1985: nop
/*     */     //   1986: iconst_0
/*     */     //   1987: istore #29
/*     */     //   1989: aload #27
/*     */     //   1991: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1996: astore #30
/*     */     //   1998: iconst_0
/*     */     //   1999: istore #31
/*     */     //   2001: iload #28
/*     */     //   2003: ifne -> 2017
/*     */     //   2006: aload #30
/*     */     //   2008: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2011: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2014: if_acmpne -> 2053
/*     */     //   2017: astore #34
/*     */     //   2019: iconst_0
/*     */     //   2020: istore #32
/*     */     //   2022: aload_2
/*     */     //   2023: aload #22
/*     */     //   2025: aload #9
/*     */     //   2027: aload #21
/*     */     //   2029: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/runtime/MutableState;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Ljava/util/List;)Lkotlin/jvm/functions/Function1;
/*     */     //   2034: aload #34
/*     */     //   2036: swap
/*     */     //   2037: astore #33
/*     */     //   2039: aload #27
/*     */     //   2041: aload #33
/*     */     //   2043: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2048: aload #33
/*     */     //   2050: goto -> 2055
/*     */     //   2053: aload #30
/*     */     //   2055: nop
/*     */     //   2056: nop
/*     */     //   2057: nop
/*     */     //   2058: checkcast kotlin/jvm/functions/Function1
/*     */     //   2061: astore #26
/*     */     //   2063: aload #13
/*     */     //   2065: invokeinterface endReplaceGroup : ()V
/*     */     //   2070: aload #26
/*     */     //   2072: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2075: aload #25
/*     */     //   2077: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*     */     //   2080: iconst_0
/*     */     //   2081: aload #11
/*     */     //   2083: iconst_1
/*     */     //   2084: aconst_null
/*     */     //   2085: invokestatic focusable$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2088: aload #13
/*     */     //   2090: ldc_w 101093755
/*     */     //   2093: invokeinterface startReplaceGroup : (I)V
/*     */     //   2098: aload #13
/*     */     //   2100: astore #27
/*     */     //   2102: aload #13
/*     */     //   2104: aload #24
/*     */     //   2106: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2111: aload #13
/*     */     //   2113: aload_2
/*     */     //   2114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2119: ior
/*     */     //   2120: iload #17
/*     */     //   2122: ldc_w 1879048192
/*     */     //   2125: iand
/*     */     //   2126: ldc 536870912
/*     */     //   2128: if_icmpeq -> 2151
/*     */     //   2131: iload #17
/*     */     //   2133: ldc 1073741824
/*     */     //   2135: iand
/*     */     //   2136: ifeq -> 2155
/*     */     //   2139: aload #13
/*     */     //   2141: aload #9
/*     */     //   2143: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2148: ifeq -> 2155
/*     */     //   2151: iconst_1
/*     */     //   2152: goto -> 2156
/*     */     //   2155: iconst_0
/*     */     //   2156: ior
/*     */     //   2157: aload #13
/*     */     //   2159: aload #21
/*     */     //   2161: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2166: ior
/*     */     //   2167: iload #17
/*     */     //   2169: bipush #112
/*     */     //   2171: iand
/*     */     //   2172: bipush #32
/*     */     //   2174: if_icmpne -> 2181
/*     */     //   2177: iconst_1
/*     */     //   2178: goto -> 2182
/*     */     //   2181: iconst_0
/*     */     //   2182: ior
/*     */     //   2183: aload #13
/*     */     //   2185: aload #19
/*     */     //   2187: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2192: ior
/*     */     //   2193: istore #28
/*     */     //   2195: nop
/*     */     //   2196: iconst_0
/*     */     //   2197: istore #29
/*     */     //   2199: aload #27
/*     */     //   2201: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2206: astore #30
/*     */     //   2208: iconst_0
/*     */     //   2209: istore #31
/*     */     //   2211: iload #28
/*     */     //   2213: ifne -> 2227
/*     */     //   2216: aload #30
/*     */     //   2218: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2221: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2224: if_acmpne -> 2271
/*     */     //   2227: astore #34
/*     */     //   2229: iconst_0
/*     */     //   2230: istore #32
/*     */     //   2232: new org/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$SelectableLazyColumn$5$1
/*     */     //   2235: dup
/*     */     //   2236: aload #24
/*     */     //   2238: aload_2
/*     */     //   2239: aload #9
/*     */     //   2241: aload #21
/*     */     //   2243: aload_1
/*     */     //   2244: aload #19
/*     */     //   2246: invokespecial <init> : (Landroidx/compose/ui/focus/FocusManager;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Ljava/util/List;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   2249: checkcast kotlin/jvm/functions/Function1
/*     */     //   2252: aload #34
/*     */     //   2254: swap
/*     */     //   2255: astore #33
/*     */     //   2257: aload #27
/*     */     //   2259: aload #33
/*     */     //   2261: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2266: aload #33
/*     */     //   2268: goto -> 2273
/*     */     //   2271: aload #30
/*     */     //   2273: nop
/*     */     //   2274: nop
/*     */     //   2275: nop
/*     */     //   2276: checkcast kotlin/jvm/functions/Function1
/*     */     //   2279: astore #26
/*     */     //   2281: aload #13
/*     */     //   2283: invokeinterface endReplaceGroup : ()V
/*     */     //   2288: aload #26
/*     */     //   2290: invokestatic onPreviewKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2293: aload_2
/*     */     //   2294: invokevirtual getLazyListState : ()Landroidx/compose/foundation/lazy/LazyListState;
/*     */     //   2297: aload_3
/*     */     //   2298: iload #4
/*     */     //   2300: aload #6
/*     */     //   2302: aload #7
/*     */     //   2304: aload #8
/*     */     //   2306: iconst_0
/*     */     //   2307: aload #13
/*     */     //   2309: ldc_w 101130881
/*     */     //   2312: invokeinterface startReplaceGroup : (I)V
/*     */     //   2317: aload #13
/*     */     //   2319: astore #27
/*     */     //   2321: aload #13
/*     */     //   2323: aload #20
/*     */     //   2325: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2330: aload #13
/*     */     //   2332: aload_2
/*     */     //   2333: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2338: ior
/*     */     //   2339: aload #13
/*     */     //   2341: aload #21
/*     */     //   2343: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2348: ior
/*     */     //   2349: iload #17
/*     */     //   2351: ldc_w 1879048192
/*     */     //   2354: iand
/*     */     //   2355: ldc 536870912
/*     */     //   2357: if_icmpeq -> 2380
/*     */     //   2360: iload #17
/*     */     //   2362: ldc 1073741824
/*     */     //   2364: iand
/*     */     //   2365: ifeq -> 2384
/*     */     //   2368: aload #13
/*     */     //   2370: aload #9
/*     */     //   2372: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2377: ifeq -> 2384
/*     */     //   2380: iconst_1
/*     */     //   2381: goto -> 2385
/*     */     //   2384: iconst_0
/*     */     //   2385: ior
/*     */     //   2386: iload #18
/*     */     //   2388: bipush #14
/*     */     //   2390: iand
/*     */     //   2391: bipush #6
/*     */     //   2393: ixor
/*     */     //   2394: iconst_4
/*     */     //   2395: if_icmple -> 2410
/*     */     //   2398: aload #13
/*     */     //   2400: aload #10
/*     */     //   2402: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   2407: ifne -> 2419
/*     */     //   2410: iload #18
/*     */     //   2412: bipush #6
/*     */     //   2414: iand
/*     */     //   2415: iconst_4
/*     */     //   2416: if_icmpne -> 2423
/*     */     //   2419: iconst_1
/*     */     //   2420: goto -> 2424
/*     */     //   2423: iconst_0
/*     */     //   2424: ior
/*     */     //   2425: iload #17
/*     */     //   2427: bipush #112
/*     */     //   2429: iand
/*     */     //   2430: bipush #32
/*     */     //   2432: if_icmpne -> 2439
/*     */     //   2435: iconst_1
/*     */     //   2436: goto -> 2440
/*     */     //   2439: iconst_0
/*     */     //   2440: ior
/*     */     //   2441: istore #28
/*     */     //   2443: nop
/*     */     //   2444: iconst_0
/*     */     //   2445: istore #29
/*     */     //   2447: aload #27
/*     */     //   2449: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2454: astore #30
/*     */     //   2456: iconst_0
/*     */     //   2457: istore #31
/*     */     //   2459: iload #28
/*     */     //   2461: ifne -> 2475
/*     */     //   2464: aload #30
/*     */     //   2466: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2469: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2472: if_acmpne -> 2549
/*     */     //   2475: istore #41
/*     */     //   2477: astore #40
/*     */     //   2479: astore #39
/*     */     //   2481: astore #38
/*     */     //   2483: istore #37
/*     */     //   2485: astore #36
/*     */     //   2487: astore #35
/*     */     //   2489: astore #34
/*     */     //   2491: iconst_0
/*     */     //   2492: istore #32
/*     */     //   2494: aload #20
/*     */     //   2496: aload_2
/*     */     //   2497: aload #21
/*     */     //   2499: aload #25
/*     */     //   2501: aload #9
/*     */     //   2503: aload #10
/*     */     //   2505: aload_1
/*     */     //   2506: aload #22
/*     */     //   2508: <illegal opcode> invoke : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Ljava/util/List;Landroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2513: astore #42
/*     */     //   2515: aload #34
/*     */     //   2517: aload #35
/*     */     //   2519: aload #36
/*     */     //   2521: iload #37
/*     */     //   2523: aload #38
/*     */     //   2525: aload #39
/*     */     //   2527: aload #40
/*     */     //   2529: iload #41
/*     */     //   2531: aload #42
/*     */     //   2533: astore #33
/*     */     //   2535: aload #27
/*     */     //   2537: aload #33
/*     */     //   2539: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2544: aload #33
/*     */     //   2546: goto -> 2551
/*     */     //   2549: aload #30
/*     */     //   2551: nop
/*     */     //   2552: nop
/*     */     //   2553: nop
/*     */     //   2554: checkcast kotlin/jvm/functions/Function1
/*     */     //   2557: astore #26
/*     */     //   2559: aload #13
/*     */     //   2561: invokeinterface endReplaceGroup : ()V
/*     */     //   2566: aload #26
/*     */     //   2568: aload #13
/*     */     //   2570: sipush #896
/*     */     //   2573: iload #17
/*     */     //   2575: iconst_3
/*     */     //   2576: ishr
/*     */     //   2577: iand
/*     */     //   2578: sipush #7168
/*     */     //   2581: iload #17
/*     */     //   2583: iconst_3
/*     */     //   2584: ishr
/*     */     //   2585: iand
/*     */     //   2586: ior
/*     */     //   2587: ldc_w 57344
/*     */     //   2590: iload #17
/*     */     //   2592: bipush #6
/*     */     //   2594: ishr
/*     */     //   2595: iand
/*     */     //   2596: ior
/*     */     //   2597: ldc_w 458752
/*     */     //   2600: iload #17
/*     */     //   2602: bipush #6
/*     */     //   2604: ishr
/*     */     //   2605: iand
/*     */     //   2606: ior
/*     */     //   2607: ldc_w 3670016
/*     */     //   2610: iload #17
/*     */     //   2612: bipush #6
/*     */     //   2614: ishr
/*     */     //   2615: iand
/*     */     //   2616: ior
/*     */     //   2617: sipush #128
/*     */     //   2620: invokestatic LazyColumn : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2623: invokestatic isTraceInProgress : ()Z
/*     */     //   2626: ifeq -> 2642
/*     */     //   2629: invokestatic traceEventEnd : ()V
/*     */     //   2632: goto -> 2642
/*     */     //   2635: aload #13
/*     */     //   2637: invokeinterface skipToGroupEnd : ()V
/*     */     //   2642: aload #13
/*     */     //   2644: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2649: dup
/*     */     //   2650: ifnull -> 2694
/*     */     //   2653: aload_0
/*     */     //   2654: aload_1
/*     */     //   2655: aload_2
/*     */     //   2656: aload_3
/*     */     //   2657: iload #4
/*     */     //   2659: aload #5
/*     */     //   2661: aload #6
/*     */     //   2663: aload #7
/*     */     //   2665: aload #8
/*     */     //   2667: aload #9
/*     */     //   2669: aload #10
/*     */     //   2671: aload #11
/*     */     //   2673: aload #12
/*     */     //   2675: iload #14
/*     */     //   2677: iload #15
/*     */     //   2679: iload #16
/*     */     //   2681: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;III)Lkotlin/jvm/functions/Function2;
/*     */     //   2686: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2691: goto -> 2695
/*     */     //   2694: pop
/*     */     //   2695: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 7
/*     */     //   #47	-> 749
/*     */     //   #48	-> 763
/*     */     //   #49	-> 774
/*     */     //   #50	-> 800
/*     */     //   #246	-> 806
/*     */     //   #50	-> 812
/*     */     //   #51	-> 824
/*     */     //   #52	-> 835
/*     */     //   #247	-> 854
/*     */     //   #248	-> 866
/*     */     //   #249	-> 877
/*     */     //   #249	-> 885
/*     */     //   #250	-> 887
/*     */     //   #251	-> 896
/*     */     //   #252	-> 901
/*     */     //   #248	-> 903
/*     */     //   #247	-> 904
/*     */     //   #247	-> 905
/*     */     //   #52	-> 906
/*     */     //   #53	-> 930
/*     */     //   #54	-> 968
/*     */     //   #55	-> 985
/*     */     //   #56	-> 1014
/*     */     //   #57	-> 1031
/*     */     //   #58	-> 1059
/*     */     //   #253	-> 1078
/*     */     //   #254	-> 1090
/*     */     //   #255	-> 1101
/*     */     //   #58	-> 1104
/*     */     //   #255	-> 1107
/*     */     //   #256	-> 1109
/*     */     //   #257	-> 1118
/*     */     //   #258	-> 1123
/*     */     //   #254	-> 1125
/*     */     //   #253	-> 1126
/*     */     //   #253	-> 1127
/*     */     //   #58	-> 1128
/*     */     //   #60	-> 1237
/*     */     //   #61	-> 1243
/*     */     //   #259	-> 1253
/*     */     //   #260	-> 1256
/*     */     //   #262	-> 1258
/*     */     //   #263	-> 1266
/*     */     //   #264	-> 1279
/*     */     //   #265	-> 1291
/*     */     //   #266	-> 1302
/*     */     //   #267	-> 1305
/*     */     //   #268	-> 1305
/*     */     //   #269	-> 1308
/*     */     //   #268	-> 1311
/*     */     //   #267	-> 1319
/*     */     //   #266	-> 1330
/*     */     //   #270	-> 1332
/*     */     //   #271	-> 1341
/*     */     //   #272	-> 1346
/*     */     //   #265	-> 1348
/*     */     //   #264	-> 1349
/*     */     //   #264	-> 1350
/*     */     //   #263	-> 1351
/*     */     //   #273	-> 1365
/*     */     //   #259	-> 1374
/*     */     //   #273	-> 1379
/*     */     //   #61	-> 1380
/*     */     //   #62	-> 1382
/*     */     //   #62	-> 1403
/*     */     //   #64	-> 1421
/*     */     //   #274	-> 1433
/*     */     //   #275	-> 1445
/*     */     //   #276	-> 1461
/*     */     //   #64	-> 1464
/*     */     //   #276	-> 1469
/*     */     //   #277	-> 1471
/*     */     //   #278	-> 1480
/*     */     //   #279	-> 1485
/*     */     //   #275	-> 1487
/*     */     //   #274	-> 1488
/*     */     //   #274	-> 1489
/*     */     //   #64	-> 1490
/*     */     //   #65	-> 1523
/*     */     //   #280	-> 1527
/*     */     //   #281	-> 1539
/*     */     //   #282	-> 1550
/*     */     //   #65	-> 1553
/*     */     //   #282	-> 1563
/*     */     //   #283	-> 1565
/*     */     //   #284	-> 1574
/*     */     //   #285	-> 1579
/*     */     //   #281	-> 1581
/*     */     //   #280	-> 1582
/*     */     //   #280	-> 1583
/*     */     //   #65	-> 1584
/*     */     //   #67	-> 1600
/*     */     //   #68	-> 1617
/*     */     //   #286	-> 1667
/*     */     //   #287	-> 1679
/*     */     //   #288	-> 1695
/*     */     //   #68	-> 1702
/*     */     //   #288	-> 1726
/*     */     //   #289	-> 1728
/*     */     //   #290	-> 1737
/*     */     //   #291	-> 1742
/*     */     //   #287	-> 1744
/*     */     //   #286	-> 1745
/*     */     //   #286	-> 1746
/*     */     //   #68	-> 1747
/*     */     //   #75	-> 1774
/*     */     //   #292	-> 1796
/*     */     //   #75	-> 1817
/*     */     //   #76	-> 1839
/*     */     //   #293	-> 1843
/*     */     //   #294	-> 1855
/*     */     //   #295	-> 1866
/*     */     //   #76	-> 1869
/*     */     //   #295	-> 1876
/*     */     //   #296	-> 1878
/*     */     //   #297	-> 1887
/*     */     //   #298	-> 1892
/*     */     //   #294	-> 1894
/*     */     //   #293	-> 1895
/*     */     //   #293	-> 1896
/*     */     //   #76	-> 1897
/*     */     //   #79	-> 1913
/*     */     //   #80	-> 1985
/*     */     //   #299	-> 1989
/*     */     //   #300	-> 2001
/*     */     //   #301	-> 2017
/*     */     //   #80	-> 2022
/*     */     //   #301	-> 2037
/*     */     //   #302	-> 2039
/*     */     //   #303	-> 2048
/*     */     //   #304	-> 2053
/*     */     //   #300	-> 2055
/*     */     //   #299	-> 2056
/*     */     //   #299	-> 2057
/*     */     //   #80	-> 2058
/*     */     //   #88	-> 2075
/*     */     //   #89	-> 2080
/*     */     //   #90	-> 2195
/*     */     //   #305	-> 2199
/*     */     //   #306	-> 2211
/*     */     //   #307	-> 2227
/*     */     //   #90	-> 2232
/*     */     //   #307	-> 2255
/*     */     //   #308	-> 2257
/*     */     //   #309	-> 2266
/*     */     //   #310	-> 2271
/*     */     //   #306	-> 2273
/*     */     //   #305	-> 2274
/*     */     //   #305	-> 2275
/*     */     //   #90	-> 2276
/*     */     //   #106	-> 2293
/*     */     //   #107	-> 2297
/*     */     //   #108	-> 2298
/*     */     //   #109	-> 2300
/*     */     //   #110	-> 2302
/*     */     //   #111	-> 2304
/*     */     //   #112	-> 2443
/*     */     //   #311	-> 2447
/*     */     //   #312	-> 2459
/*     */     //   #313	-> 2475
/*     */     //   #112	-> 2494
/*     */     //   #313	-> 2533
/*     */     //   #314	-> 2535
/*     */     //   #315	-> 2544
/*     */     //   #316	-> 2549
/*     */     //   #312	-> 2551
/*     */     //   #311	-> 2552
/*     */     //   #311	-> 2553
/*     */     //   #112	-> 2554
/*     */     //   #77	-> 2620
/*     */     //   #127	-> 2635
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   806	6	20	$i$f$getDp	I
/*     */     //   803	9	19	$this$dp$iv	I
/*     */     //   880	5	25	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$1	I
/*     */     //   887	11	25	value$iv	Ljava/lang/Object;
/*     */     //   866	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   863	41	23	it$iv	Ljava/lang/Object;
/*     */     //   854	52	22	$i$f$cache	I
/*     */     //   851	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   851	55	21	invalid$iv	Z
/*     */     //   1104	3	25	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$2	I
/*     */     //   1109	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1090	36	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1087	39	23	it$iv	Ljava/lang/Object;
/*     */     //   1078	50	22	$i$f$cache	I
/*     */     //   1075	53	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1075	53	21	invalid$iv	Z
/*     */     //   1308	3	30	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   1305	25	29	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   1332	11	30	value$iv$iv	Ljava/lang/Object;
/*     */     //   1291	58	28	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   1288	61	27	it$iv$iv	Ljava/lang/Object;
/*     */     //   1279	72	26	$i$f$cache	I
/*     */     //   1276	75	24	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1276	75	25	invalid$iv$iv	Z
/*     */     //   1247	133	22	$i$f$rememberCoroutineScope	I
/*     */     //   1260	120	23	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1365	15	32	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   1244	136	21	$changed$iv	I
/*     */     //   1464	5	28	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$keys$1	I
/*     */     //   1471	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1445	43	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1442	46	26	it$iv	Ljava/lang/Object;
/*     */     //   1433	57	25	$i$f$cache	I
/*     */     //   1430	60	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1430	60	24	invalid$iv	Z
/*     */     //   1553	10	29	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$isFocused$2	I
/*     */     //   1565	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1539	43	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1536	46	27	it$iv	Ljava/lang/Object;
/*     */     //   1527	57	26	$i$f$cache	I
/*     */     //   1524	60	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1524	60	25	invalid$iv	Z
/*     */     //   1702	16	30	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$3	I
/*     */     //   1728	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1679	66	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1676	69	28	it$iv	Ljava/lang/Object;
/*     */     //   1667	80	27	$i$f$cache	I
/*     */     //   1664	83	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1664	83	26	invalid$iv	Z
/*     */     //   1788	29	27	$i$f$getCurrent	I
/*     */     //   1785	32	25	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1785	32	26	$changed$iv	I
/*     */     //   1869	7	32	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$focusRequester$1	I
/*     */     //   1878	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1855	40	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1852	43	30	it$iv	Ljava/lang/Object;
/*     */     //   1843	54	29	$i$f$cache	I
/*     */     //   1840	57	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1840	57	28	invalid$iv	Z
/*     */     //   2022	12	32	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$4	I
/*     */     //   2039	11	33	value$iv	Ljava/lang/Object;
/*     */     //   2001	55	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1998	58	30	it$iv	Ljava/lang/Object;
/*     */     //   1989	69	29	$i$f$cache	I
/*     */     //   1986	72	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1986	72	28	invalid$iv	Z
/*     */     //   2232	20	32	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$5	I
/*     */     //   2257	11	33	value$iv	Ljava/lang/Object;
/*     */     //   2211	63	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2208	66	30	it$iv	Ljava/lang/Object;
/*     */     //   2199	77	29	$i$f$cache	I
/*     */     //   2196	80	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2196	80	28	invalid$iv	Z
/*     */     //   2494	19	32	$i$a$-cache-SelectableLazyColumnKt$SelectableLazyColumn$6	I
/*     */     //   2535	11	33	value$iv	Ljava/lang/Object;
/*     */     //   2459	93	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2456	96	30	it$iv	Ljava/lang/Object;
/*     */     //   2447	107	29	$i$f$cache	I
/*     */     //   2444	110	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2444	110	28	invalid$iv	Z
/*     */     //   1382	1250	19	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1405	1227	20	container	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer;
/*     */     //   1506	1126	21	keys	Ljava/util/List;
/*     */     //   1600	1032	22	isFocused$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1617	1015	23	latestOnSelectedIndexesChanged	Landroidx/compose/runtime/State;
/*     */     //   1822	810	24	focusManager	Landroidx/compose/ui/focus/FocusManager;
/*     */     //   1913	719	25	focusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   22	2674	17	$dirty	I
/*     */     //   26	2670	18	$dirty1	I
/*     */     //   0	2696	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2696	1	selectionMode	Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */     //   0	2696	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     //   0	2696	3	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   0	2696	4	reverseLayout	Z
/*     */     //   0	2696	5	onSelectedIndexesChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2696	6	verticalArrangement	Landroidx/compose/foundation/layout/Arrangement$Vertical;
/*     */     //   0	2696	7	horizontalAlignment	Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   0	2696	8	flingBehavior	Landroidx/compose/foundation/gestures/FlingBehavior;
/*     */     //   0	2696	9	keyActions	Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;
/*     */     //   0	2696	10	pointerEventActions	Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */     //   0	2696	11	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2696	12	content	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2696	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2696	14	$changed	I
/*     */     //   0	2696	15	$changed1	I
/*     */   }
/*     */ 
/*     */   
/*     */   private static final boolean SelectableLazyColumn$lambda$5(MutableState $isFocused$delegate)
/*     */   {
/*  65 */     State state = (State)$isFocused$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 317 */       (Boolean)state.getValue()).booleanValue(); } private static final void SelectableLazyColumn$lambda$6(MutableState $isFocused$delegate, boolean <set-?>) { MutableState mutableState = $isFocused$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 318 */     mutableState.setValue(value$iv); } private static final Unit SelectableLazyColumn$lambda$15$lambda$14(SelectableLazyListScopeContainer $container, SelectableLazyListState $state, List $keys, FocusRequester $focusRequester, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, MutableState $isFocused$delegate, LazyListScope $this$LazyColumn) { Intrinsics.checkNotNullParameter($this$LazyColumn, "$this$LazyColumn"); Iterable<SelectableLazyListScopeContainer.Entry> $this$forEach$iv = $container.getEntries();
/*     */     int $i$f$forEach = 0;
/* 320 */     Iterator<SelectableLazyListScopeContainer.Entry> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); SelectableLazyListScopeContainer.Entry entry = (SelectableLazyListScopeContainer.Entry)element$iv; int $i$a$-forEach-SelectableLazyColumnKt$SelectableLazyColumn$6$1$1 = 0; }
/*     */     
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "SelectableLazyColumn.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.SelectableLazyColumnKt$SelectableLazyColumn$3$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class SelectableLazyColumnKt$SelectableLazyColumn$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SelectableLazyColumnKt$SelectableLazyColumn$3$1(SelectableLazyListState $state, State<Function1<List<Integer>, Unit>> $latestOnSelectedIndexesChanged, SelectableLazyListScopeContainer $container, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (SnapshotStateKt.snapshotFlow(this.$state::invokeSuspend$lambda$0).collect(new FlowCollector(this.$latestOnSelectedIndexesChanged, this.$container) {
/*     */                 public final Object emit(Set selectedKeys, Continuation $completion) {
/*     */                   Set set1 = selectedKeys;
/*     */                   SelectableLazyListScopeContainer selectableLazyListScopeContainer = this.$container;
/*     */                   int $i$f$mapNotNull = 0;
/*     */                   Set set2 = set1;
/*     */                   Collection destination$iv$iv = new ArrayList();
/*     */                   int $i$f$mapNotNullTo = 0;
/*     */                   Iterable $this$forEach$iv$iv$iv = set2;
/*     */                   int $i$f$forEach = 0;
/*     */                   Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */                   if (iterator.hasNext()) {
/*     */                     Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */                     int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */                     Object key = element$iv$iv;
/*     */                     int $i$a$-mapNotNull-SelectableLazyColumnKt$SelectableLazyColumn$3$1$2$indices$1 = 0;
/*     */                   } 
/*     */                   List indices = (List)destination$iv$iv;
/*     */                   ((Function1)this.$latestOnSelectedIndexesChanged.getValue()).invoke(indices);
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           SnapshotStateKt.snapshotFlow(this.$state::invokeSuspend$lambda$0).collect(new FlowCollector(this.$latestOnSelectedIndexesChanged, this.$container) {
/*     */                 public final Object emit(Set selectedKeys, Continuation $completion) {
/*     */                   Set set1 = selectedKeys;
/*     */                   SelectableLazyListScopeContainer selectableLazyListScopeContainer = this.$container;
/*     */                   int $i$f$mapNotNull = 0;
/*     */                   Set set2 = set1;
/*     */                   Collection destination$iv$iv = new ArrayList();
/*     */                   int $i$f$mapNotNullTo = 0;
/*     */                   Iterable $this$forEach$iv$iv$iv = set2;
/*     */                   int $i$f$forEach = 0;
/*     */                   Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */                   if (iterator.hasNext()) {
/*     */                     Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */                     int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */                     Object key = element$iv$iv;
/*     */                     int $i$a$-mapNotNull-SelectableLazyColumnKt$SelectableLazyColumn$3$1$2$indices$1 = 0;
/*     */                   } 
/*     */                   List indices = (List)destination$iv$iv;
/*     */                   ((Function1)this.$latestOnSelectedIndexesChanged.getValue()).invoke(indices);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SelectableLazyColumnKt$SelectableLazyColumn$3$1> $completion) {
/*     */       return (Continuation<Unit>)new SelectableLazyColumnKt$SelectableLazyColumn$3$1(this.$state, this.$latestOnSelectedIndexesChanged, this.$container, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((SelectableLazyColumnKt$SelectableLazyColumn$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Set invokeSuspend$lambda$0(SelectableLazyListState $state) {
/*     */       return $state.getSelectedKeys();
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit SelectableLazyColumn$lambda$11$lambda$10(SelectableLazyListState $state, MutableState<Boolean> $isFocused$delegate, KeyActions $keyActions, List<? extends SelectableLazyListKey> $keys, FocusState it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     SelectableLazyColumn$lambda$6($isFocused$delegate, it.getHasFocus());
/*     */     SelectableLazyListState $this$SelectableLazyColumn_u24lambda_u2411_u24lambda_u2410_u24lambda_u249 = $state;
/*     */     int $i$a$-with-SelectableLazyColumnKt$SelectableLazyColumn$4$1$1 = 0;
/*     */     if (SelectableLazyColumn$lambda$5($isFocused$delegate) && $this$SelectableLazyColumn_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.getLastActiveItemIndex() == null && $this$SelectableLazyColumn_u24lambda_u2411_u24lambda_u2410_u24lambda_u249.getSelectedKeys().isEmpty())
/*     */       $keyActions.getActions().onSelectFirstItem($keys, $this$SelectableLazyColumn_u24lambda_u2411_u24lambda_u2410_u24lambda_u249); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class SelectableLazyColumnKt$SelectableLazyColumn$5$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object event) {
/*     */       Intrinsics.checkNotNullParameter(event, "event");
/*     */       if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(event), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(event), Key.Companion.getTab-EK5gGoQ())) {
/*     */         int focusDirection = KeyEvent_desktopKt.isShiftPressed-ZmokQxo(event) ? FocusDirection.Companion.getPrevious-dhqQ-8s() : FocusDirection.Companion.getNext-dhqQ-8s();
/*     */         this.$focusManager.moveFocus-3ESFkO8(focusDirection);
/*     */         return Boolean.valueOf(true);
/*     */       } 
/*     */       if (this.$state.getLastActiveItemIndex() != null) {
/*     */         boolean actionHandled = ((Boolean)this.$keyActions.handleOnKeyEvent-jhbQyNo(event, this.$keys, this.$state, this.$selectionMode).invoke(KeyEvent.box-impl(event))).booleanValue();
/*     */         if (actionHandled)
/*     */           BuildersKt.launch$default(this.$scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$state, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #6
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 108, 0 -> 32, 1 -> 91
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                   //   40: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */                   //   43: dup
/*     */                   //   44: ifnull -> 103
/*     */                   //   47: astore_2
/*     */                   //   48: aload_0
/*     */                   //   49: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                   //   52: astore_3
/*     */                   //   53: aload_2
/*     */                   //   54: checkcast java/lang/Number
/*     */                   //   57: invokevirtual intValue : ()I
/*     */                   //   60: istore #4
/*     */                   //   62: iconst_0
/*     */                   //   63: istore #5
/*     */                   //   65: aload_3
/*     */                   //   66: iload #4
/*     */                   //   68: iconst_0
/*     */                   //   69: iconst_0
/*     */                   //   70: aload_0
/*     */                   //   71: bipush #6
/*     */                   //   73: aconst_null
/*     */                   //   74: aload_0
/*     */                   //   75: iconst_1
/*     */                   //   76: putfield label : I
/*     */                   //   79: invokestatic scrollToItem$default : (Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;IZILkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   82: dup
/*     */                   //   83: aload #6
/*     */                   //   85: if_acmpne -> 99
/*     */                   //   88: aload #6
/*     */                   //   90: areturn
/*     */                   //   91: iconst_0
/*     */                   //   92: istore #5
/*     */                   //   94: aload_1
/*     */                   //   95: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   98: aload_1
/*     */                   //   99: pop
/*     */                   //   100: goto -> 104
/*     */                   //   103: pop
/*     */                   //   104: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   107: areturn
/*     */                   //   108: new java/lang/IllegalStateException
/*     */                   //   111: dup
/*     */                   //   112: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   114: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   117: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #100	-> 3
/*     */                   //   #100	-> 36
/*     */                   //   #246	-> 62
/*     */                   //   #100	-> 65
/*     */                   //   #100	-> 88
/*     */                   //   #100	-> 99
/*     */                   //   #100	-> 100
/*     */                   //   #100	-> 103
/*     */                   //   #100	-> 108
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   62	20	4	it	I
/*     */                   //   65	26	5	$i$a$-let-SelectableLazyColumnKt$SelectableLazyColumn$5$1$1$1	I
/*     */                   //   0	118	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$SelectableLazyColumn$5$1$1;
/*     */                   //   36	72	1	$result	Ljava/lang/Object;
/*     */                   //   94	6	5	$i$a$-let-SelectableLazyColumnKt$SelectableLazyColumn$5$1$1$1	I
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$state, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }3, null); 
/*     */         return Boolean.valueOf(actionHandled);
/*     */       } 
/*     */       return Boolean.valueOf(false);
/*     */     }
/*     */     
/*     */     SelectableLazyColumnKt$SelectableLazyColumn$5$1(FocusManager $focusManager, SelectableLazyListState $state, KeyActions $keyActions, List<SelectableLazyListKey> $keys, SelectionMode $selectionMode, CoroutineScope $scope) {}
/*     */   }
/*     */   
/*     */   private static final void appendEntry(LazyListScope $this$appendEntry, SelectableLazyListScopeContainer.Entry entry, SelectableLazyListState state, boolean isFocused, List<? extends SelectableLazyListKey> keys, FocusRequester focusRequester, KeyActions keyActions, PointerEventActions pointerEventActions, SelectionMode selectionMode, Function1<Object, Boolean> isKeySelectable) {
/*     */     SelectableLazyListScopeContainer.Entry entry1 = entry;
/*     */     if (entry1 instanceof SelectableLazyListScopeContainer.Entry.Item) {
/*     */       $this$appendEntry.item(((SelectableLazyListScopeContainer.Entry.Item)entry).getKey(), ((SelectableLazyListScopeContainer.Entry.Item)entry).getContentType(), (Function3)ComposableLambdaKt.composableLambdaInstance(1060296196, true, new SelectableLazyColumnKt$appendEntry$1(state, entry, isFocused, isKeySelectable, focusRequester, keyActions, pointerEventActions, selectionMode, keys)));
/*     */     } else if (entry1 instanceof SelectableLazyListScopeContainer.Entry.Items) {
/*     */       $this$appendEntry.items(((SelectableLazyListScopeContainer.Entry.Items)entry).getCount(), entry::appendEntry$lambda$17, entry::appendEntry$lambda$18, (Function4)ComposableLambdaKt.composableLambdaInstance(-884262318, true, new SelectableLazyColumnKt$appendEntry$4(entry, state, isFocused, isKeySelectable, focusRequester, keyActions, pointerEventActions, selectionMode, keys)));
/*     */     } else if (entry1 instanceof SelectableLazyListScopeContainer.Entry.StickyHeader) {
/*     */       $this$appendEntry.stickyHeader(((SelectableLazyListScopeContainer.Entry.StickyHeader)entry).getKey(), ((SelectableLazyListScopeContainer.Entry.StickyHeader)entry).getContentType(), (Function3)ComposableLambdaKt.composableLambdaInstance(-182811687, true, new SelectableLazyColumnKt$appendEntry$5(state, entry, isFocused, isKeySelectable, keyActions, pointerEventActions, selectionMode, keys)));
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n71#2:246\n68#2,6:247\n74#2:281\n78#2:285\n79#3,6:253\n86#3,4:268\n90#3,2:278\n94#3:284\n368#4,9:259\n377#4:280\n378#4,2:282\n4034#5,6:272\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$1\n*L\n146#1:246\n146#1:247,6\n146#1:281\n146#1:285\n146#1:253,6\n146#1:268,4\n146#1:278,2\n146#1:284\n146#1:259,9\n146#1:280\n146#1:282,2\n146#1:272,6\n*E\n"})
/*     */   static final class SelectableLazyColumnKt$appendEntry$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(LazyItemScope $this$item, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$item, "$this$item");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changed($this$item) ? 4 : 2; 
/*     */       if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1060296196, $dirty, -1, "org.jetbrains.jewel.foundation.lazy.appendEntry.<anonymous> (SelectableLazyColumn.kt:142)"); 
/*     */         SelectableLazyItemScope itemScope = SelectableLazyListScopeKt.SelectableLazyItemScope($this$item, this.$state.getSelectedKeys().contains(((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey()), this.$isFocused, $composer, 0xE & $dirty, 0);
/*     */         if (((Boolean)this.$isKeySelectable.invoke(((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey())).booleanValue()) {
/*     */           $composer.startReplaceGroup(-1957364625);
/*     */           Modifier modifier1 = SelectableLazyColumnKt.selectable((Modifier)Modifier.Companion, this.$focusRequester, this.$keyActions.getKeybindings(), this.$pointerEventActions, this.$selectionMode, this.$state, this.$keys, ((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getKey());
/*     */           SelectableLazyListScopeContainer.Entry entry = this.$entry;
/*     */           int $changed$iv = 0, $i$f$Box = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */           Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */           boolean propagateMinConstraints$iv = false;
/*     */           MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */           int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */           int $i$f$Layout = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */           int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */           CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */           Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */           Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */           int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */           int $i$f$ReusableComposeNode = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */           if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */             ComposablesKt.invalidApplier(); 
/*     */           $composer.startReusableNode();
/*     */           if ($composer.getInserting()) {
/*     */             $composer.createNode(function0);
/*     */           } else {
/*     */             $composer.useNode();
/*     */           } 
/*     */           Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */           int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */           int $i$f$set-impl = 0;
/*     */           Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */           int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */           if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */             $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */             $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */           } 
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */           int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */           Composer $composer$iv = $composer;
/*     */           int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */           int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */           Composer composer1 = $composer$iv;
/*     */           BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */           int $i$a$-Box-SelectableLazyColumnKt$appendEntry$1$1 = 0;
/*     */           ((SelectableLazyListScopeContainer.Entry.Item)entry).getContent().invoke(itemScope, composer1, Integer.valueOf(0));
/*     */           ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */           $composer.endNode();
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           $composer.endReplaceGroup();
/*     */         } else {
/*     */           $composer.startReplaceGroup(-1956702992);
/*     */           ((SelectableLazyListScopeContainer.Entry.Item)this.$entry).getContent().invoke(itemScope, $composer, Integer.valueOf(0));
/*     */           $composer.endReplaceGroup();
/*     */         } 
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     SelectableLazyColumnKt$appendEntry$1(SelectableLazyListState $state, SelectableLazyListScopeContainer.Entry $entry, boolean $isFocused, Function1<Object, Boolean> $isKeySelectable, FocusRequester $focusRequester, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, List<SelectableLazyListKey> $keys) {}
/*     */   }
/*     */   
/*     */   private static final Object appendEntry$lambda$17(SelectableLazyListScopeContainer.Entry $entry, int it) {
/*     */     return ((SelectableLazyListScopeContainer.Entry.Items)$entry).getKey().invoke(Integer.valueOf(it));
/*     */   }
/*     */   
/*     */   private static final Object appendEntry$lambda$18(SelectableLazyListScopeContainer.Entry $entry, int it) {
/*     */     return ((SelectableLazyListScopeContainer.Entry.Items)$entry).getContentType().invoke(Integer.valueOf(it));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n1225#2,6:246\n71#3:252\n68#3,6:253\n74#3:287\n78#3:291\n79#4,6:259\n86#4,4:274\n90#4,2:284\n94#4:290\n368#5,9:265\n377#5:286\n378#5,2:288\n4034#6,6:278\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4\n*L\n167#1:246,6\n170#1:252\n170#1:253,6\n170#1:287\n170#1:291\n170#1:259,6\n170#1:274,4\n170#1:284,2\n170#1:290\n170#1:265,9\n170#1:286\n170#1:288,2\n170#1:278,6\n*E\n"})
/*     */   static final class SelectableLazyColumnKt$appendEntry$4 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(LazyItemScope $this$items, int index, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$items'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: iload #4
/*     */       //   8: istore #5
/*     */       //   10: iload #4
/*     */       //   12: bipush #6
/*     */       //   14: iand
/*     */       //   15: ifne -> 38
/*     */       //   18: iload #5
/*     */       //   20: aload_3
/*     */       //   21: aload_1
/*     */       //   22: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   27: ifeq -> 34
/*     */       //   30: iconst_4
/*     */       //   31: goto -> 35
/*     */       //   34: iconst_2
/*     */       //   35: ior
/*     */       //   36: istore #5
/*     */       //   38: iload #4
/*     */       //   40: bipush #48
/*     */       //   42: iand
/*     */       //   43: ifne -> 68
/*     */       //   46: iload #5
/*     */       //   48: aload_3
/*     */       //   49: iload_2
/*     */       //   50: invokeinterface changed : (I)Z
/*     */       //   55: ifeq -> 63
/*     */       //   58: bipush #32
/*     */       //   60: goto -> 65
/*     */       //   63: bipush #16
/*     */       //   65: ior
/*     */       //   66: istore #5
/*     */       //   68: iload #5
/*     */       //   70: sipush #147
/*     */       //   73: iand
/*     */       //   74: sipush #146
/*     */       //   77: if_icmpne -> 89
/*     */       //   80: aload_3
/*     */       //   81: invokeinterface getSkipping : ()Z
/*     */       //   86: ifne -> 828
/*     */       //   89: invokestatic isTraceInProgress : ()Z
/*     */       //   92: ifeq -> 105
/*     */       //   95: ldc -884262318
/*     */       //   97: iload #5
/*     */       //   99: iconst_m1
/*     */       //   100: ldc 'org.jetbrains.jewel.foundation.lazy.appendEntry.<anonymous> (SelectableLazyColumn.kt:166)'
/*     */       //   102: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   105: aload_0
/*     */       //   106: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
/*     */       //   109: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
/*     */       //   112: astore #7
/*     */       //   114: aload_3
/*     */       //   115: ldc 1460909334
/*     */       //   117: invokeinterface startReplaceGroup : (I)V
/*     */       //   122: aload_3
/*     */       //   123: astore #9
/*     */       //   125: aload_3
/*     */       //   126: aload #7
/*     */       //   128: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   133: iload #5
/*     */       //   135: bipush #112
/*     */       //   137: iand
/*     */       //   138: bipush #32
/*     */       //   140: if_icmpne -> 147
/*     */       //   143: iconst_1
/*     */       //   144: goto -> 148
/*     */       //   147: iconst_0
/*     */       //   148: ior
/*     */       //   149: istore #10
/*     */       //   151: aload_0
/*     */       //   152: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
/*     */       //   155: astore #11
/*     */       //   157: iconst_0
/*     */       //   158: istore #12
/*     */       //   160: aload #9
/*     */       //   162: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   167: astore #13
/*     */       //   169: iconst_0
/*     */       //   170: istore #14
/*     */       //   172: iload #10
/*     */       //   174: ifne -> 188
/*     */       //   177: aload #13
/*     */       //   179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   182: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   185: if_acmpne -> 224
/*     */       //   188: iconst_0
/*     */       //   189: istore #15
/*     */       //   191: aload #11
/*     */       //   193: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
/*     */       //   196: invokevirtual getKey : ()Lkotlin/jvm/functions/Function1;
/*     */       //   199: iload_2
/*     */       //   200: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   203: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   208: astore #16
/*     */       //   210: aload #9
/*     */       //   212: aload #16
/*     */       //   214: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   219: aload #16
/*     */       //   221: goto -> 226
/*     */       //   224: aload #13
/*     */       //   226: nop
/*     */       //   227: nop
/*     */       //   228: nop
/*     */       //   229: astore #8
/*     */       //   231: aload_3
/*     */       //   232: invokeinterface endReplaceGroup : ()V
/*     */       //   237: aload #8
/*     */       //   239: astore #6
/*     */       //   241: aload_1
/*     */       //   242: aload_0
/*     */       //   243: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */       //   246: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   249: aload #6
/*     */       //   251: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */       //   256: aload_0
/*     */       //   257: getfield $isFocused : Z
/*     */       //   260: aload_3
/*     */       //   261: bipush #14
/*     */       //   263: iload #5
/*     */       //   265: iand
/*     */       //   266: iconst_0
/*     */       //   267: invokestatic SelectableLazyItemScope : (Landroidx/compose/foundation/lazy/LazyItemScope;ZZLandroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */       //   270: astore #7
/*     */       //   272: aload_0
/*     */       //   273: getfield $isKeySelectable : Lkotlin/jvm/functions/Function1;
/*     */       //   276: aload #6
/*     */       //   278: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   283: checkcast java/lang/Boolean
/*     */       //   286: invokevirtual booleanValue : ()Z
/*     */       //   289: ifeq -> 770
/*     */       //   292: aload_3
/*     */       //   293: ldc -1956252035
/*     */       //   295: invokeinterface startReplaceGroup : (I)V
/*     */       //   300: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   303: checkcast androidx/compose/ui/Modifier
/*     */       //   306: aload_0
/*     */       //   307: getfield $focusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */       //   310: aload_0
/*     */       //   311: getfield $keyActions : Lorg/jetbrains/jewel/foundation/lazy/tree/KeyActions;
/*     */       //   314: invokeinterface getKeybindings : ()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
/*     */       //   319: aload_0
/*     */       //   320: getfield $pointerEventActions : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */       //   323: aload_0
/*     */       //   324: getfield $selectionMode : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */       //   327: aload_0
/*     */       //   328: getfield $state : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */       //   331: aload_0
/*     */       //   332: getfield $keys : Ljava/util/List;
/*     */       //   335: aload_0
/*     */       //   336: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
/*     */       //   339: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
/*     */       //   342: invokevirtual getKey : ()Lkotlin/jvm/functions/Function1;
/*     */       //   345: iload_2
/*     */       //   346: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   349: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   354: invokestatic access$selectable : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Ljava/util/List;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   357: astore #8
/*     */       //   359: aload_0
/*     */       //   360: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
/*     */       //   363: astore #11
/*     */       //   365: iconst_0
/*     */       //   366: istore #12
/*     */       //   368: iconst_0
/*     */       //   369: istore #13
/*     */       //   371: aload_3
/*     */       //   372: ldc 733328855
/*     */       //   374: ldc 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */       //   376: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   379: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   382: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */       //   385: astore #9
/*     */       //   387: iconst_0
/*     */       //   388: istore #10
/*     */       //   390: aload #9
/*     */       //   392: iload #10
/*     */       //   394: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   397: astore #14
/*     */       //   399: bipush #112
/*     */       //   401: iload #12
/*     */       //   403: iconst_3
/*     */       //   404: ishl
/*     */       //   405: iand
/*     */       //   406: istore #15
/*     */       //   408: nop
/*     */       //   409: iconst_0
/*     */       //   410: istore #16
/*     */       //   412: aload_3
/*     */       //   413: ldc -1323940314
/*     */       //   415: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   417: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   420: aload_3
/*     */       //   421: iconst_0
/*     */       //   422: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   425: istore #17
/*     */       //   427: aload_3
/*     */       //   428: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   433: astore #18
/*     */       //   435: aload_3
/*     */       //   436: aload #8
/*     */       //   438: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   441: astore #19
/*     */       //   443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   446: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   449: astore #20
/*     */       //   451: bipush #6
/*     */       //   453: sipush #896
/*     */       //   456: iload #15
/*     */       //   458: bipush #6
/*     */       //   460: ishl
/*     */       //   461: iand
/*     */       //   462: ior
/*     */       //   463: istore #21
/*     */       //   465: nop
/*     */       //   466: iconst_0
/*     */       //   467: istore #22
/*     */       //   469: aload_3
/*     */       //   470: ldc -692256719
/*     */       //   472: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   474: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   477: aload_3
/*     */       //   478: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   483: instanceof androidx/compose/runtime/Applier
/*     */       //   486: ifne -> 492
/*     */       //   489: invokestatic invalidApplier : ()V
/*     */       //   492: aload_3
/*     */       //   493: invokeinterface startReusableNode : ()V
/*     */       //   498: aload_3
/*     */       //   499: invokeinterface getInserting : ()Z
/*     */       //   504: ifeq -> 518
/*     */       //   507: aload_3
/*     */       //   508: aload #20
/*     */       //   510: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   515: goto -> 524
/*     */       //   518: aload_3
/*     */       //   519: invokeinterface useNode : ()V
/*     */       //   524: aload_3
/*     */       //   525: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   528: astore #23
/*     */       //   530: iconst_0
/*     */       //   531: istore #24
/*     */       //   533: aload #23
/*     */       //   535: aload #14
/*     */       //   537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   540: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   546: aload #23
/*     */       //   548: aload #18
/*     */       //   550: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   553: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   556: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   559: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   562: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   565: astore #25
/*     */       //   567: iconst_0
/*     */       //   568: istore #26
/*     */       //   570: aload #23
/*     */       //   572: astore #27
/*     */       //   574: iconst_0
/*     */       //   575: istore #28
/*     */       //   577: aload #27
/*     */       //   579: invokeinterface getInserting : ()Z
/*     */       //   584: ifne -> 605
/*     */       //   587: aload #27
/*     */       //   589: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   594: iload #17
/*     */       //   596: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   599: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   602: ifne -> 631
/*     */       //   605: aload #27
/*     */       //   607: iload #17
/*     */       //   609: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   612: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   617: aload #23
/*     */       //   619: iload #17
/*     */       //   621: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   624: aload #25
/*     */       //   626: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   631: nop
/*     */       //   632: nop
/*     */       //   633: nop
/*     */       //   634: aload #23
/*     */       //   636: aload #19
/*     */       //   638: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   641: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   644: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   647: nop
/*     */       //   648: nop
/*     */       //   649: aload_3
/*     */       //   650: bipush #14
/*     */       //   652: iload #21
/*     */       //   654: bipush #6
/*     */       //   656: ishr
/*     */       //   657: iand
/*     */       //   658: istore #29
/*     */       //   660: astore #30
/*     */       //   662: iconst_0
/*     */       //   663: istore #31
/*     */       //   665: aload #30
/*     */       //   667: ldc_w -2146769399
/*     */       //   670: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */       //   673: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   676: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */       //   679: aload #30
/*     */       //   681: bipush #6
/*     */       //   683: bipush #112
/*     */       //   685: iload #12
/*     */       //   687: bipush #6
/*     */       //   689: ishr
/*     */       //   690: iand
/*     */       //   691: ior
/*     */       //   692: istore #32
/*     */       //   694: astore #33
/*     */       //   696: checkcast androidx/compose/foundation/layout/BoxScope
/*     */       //   699: astore #34
/*     */       //   701: iconst_0
/*     */       //   702: istore #35
/*     */       //   704: aload #11
/*     */       //   706: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
/*     */       //   709: invokevirtual getItemContent : ()Lkotlin/jvm/functions/Function4;
/*     */       //   712: aload #7
/*     */       //   714: iload_2
/*     */       //   715: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   718: aload #33
/*     */       //   720: bipush #112
/*     */       //   722: iload #5
/*     */       //   724: iand
/*     */       //   725: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   728: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   733: pop
/*     */       //   734: nop
/*     */       //   735: aload #30
/*     */       //   737: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   740: aload_3
/*     */       //   741: invokeinterface endNode : ()V
/*     */       //   746: aload_3
/*     */       //   747: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   750: nop
/*     */       //   751: aload_3
/*     */       //   752: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   755: nop
/*     */       //   756: aload_3
/*     */       //   757: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   760: nop
/*     */       //   761: aload_3
/*     */       //   762: invokeinterface endReplaceGroup : ()V
/*     */       //   767: goto -> 816
/*     */       //   770: aload_3
/*     */       //   771: ldc_w -1955572763
/*     */       //   774: invokeinterface startReplaceGroup : (I)V
/*     */       //   779: aload_0
/*     */       //   780: getfield $entry : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry;
/*     */       //   783: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListScopeContainer$Entry$Items
/*     */       //   786: invokevirtual getItemContent : ()Lkotlin/jvm/functions/Function4;
/*     */       //   789: aload #7
/*     */       //   791: iload_2
/*     */       //   792: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   795: aload_3
/*     */       //   796: bipush #112
/*     */       //   798: iload #5
/*     */       //   800: iand
/*     */       //   801: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   804: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   809: pop
/*     */       //   810: aload_3
/*     */       //   811: invokeinterface endReplaceGroup : ()V
/*     */       //   816: invokestatic isTraceInProgress : ()Z
/*     */       //   819: ifeq -> 834
/*     */       //   822: invokestatic traceEventEnd : ()V
/*     */       //   825: goto -> 834
/*     */       //   828: aload_3
/*     */       //   829: invokeinterface skipToGroupEnd : ()V
/*     */       //   834: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #167	-> 68
/*     */       //   #246	-> 160
/*     */       //   #247	-> 172
/*     */       //   #248	-> 188
/*     */       //   #167	-> 191
/*     */       //   #248	-> 208
/*     */       //   #249	-> 210
/*     */       //   #250	-> 219
/*     */       //   #251	-> 224
/*     */       //   #247	-> 226
/*     */       //   #246	-> 227
/*     */       //   #246	-> 228
/*     */       //   #167	-> 229
/*     */       //   #168	-> 241
/*     */       //   #169	-> 272
/*     */       //   #172	-> 300
/*     */       //   #173	-> 306
/*     */       //   #174	-> 310
/*     */       //   #175	-> 319
/*     */       //   #176	-> 323
/*     */       //   #177	-> 327
/*     */       //   #178	-> 331
/*     */       //   #179	-> 335
/*     */       //   #172	-> 354
/*     */       //   #170	-> 359
/*     */       //   #252	-> 376
/*     */       //   #253	-> 379
/*     */       //   #254	-> 387
/*     */       //   #257	-> 390
/*     */       //   #258	-> 408
/*     */       //   #259	-> 417
/*     */       //   #260	-> 422
/*     */       //   #261	-> 428
/*     */       //   #262	-> 436
/*     */       //   #264	-> 443
/*     */       //   #263	-> 465
/*     */       //   #265	-> 474
/*     */       //   #266	-> 477
/*     */       //   #267	-> 493
/*     */       //   #268	-> 498
/*     */       //   #269	-> 508
/*     */       //   #271	-> 519
/*     */       //   #273	-> 524
/*     */       //   #274	-> 533
/*     */       //   #275	-> 546
/*     */       //   #277	-> 559
/*     */       //   #278	-> 570
/*     */       //   #279	-> 577
/*     */       //   #280	-> 605
/*     */       //   #281	-> 617
/*     */       //   #283	-> 631
/*     */       //   #278	-> 632
/*     */       //   #283	-> 633
/*     */       //   #284	-> 634
/*     */       //   #285	-> 647
/*     */       //   #273	-> 648
/*     */       //   #286	-> 649
/*     */       //   #287	-> 673
/*     */       //   #182	-> 704
/*     */       //   #183	-> 734
/*     */       //   #287	-> 735
/*     */       //   #286	-> 740
/*     */       //   #288	-> 741
/*     */       //   #265	-> 747
/*     */       //   #289	-> 750
/*     */       //   #259	-> 752
/*     */       //   #290	-> 755
/*     */       //   #252	-> 757
/*     */       //   #291	-> 760
/*     */       //   #169	-> 761
/*     */       //   #184	-> 770
/*     */       //   #185	-> 779
/*     */       //   #184	-> 810
/*     */       //   #186	-> 828
/*     */       //   #187	-> 834
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   191	17	15	$i$a$-cache-SelectableLazyColumnKt$appendEntry$4$key$1	I
/*     */       //   210	11	16	value$iv	Ljava/lang/Object;
/*     */       //   172	55	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   169	58	13	it$iv	Ljava/lang/Object;
/*     */       //   160	69	12	$i$f$cache	I
/*     */       //   157	72	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   157	72	10	invalid$iv	Z
/*     */       //   704	31	35	$i$a$-Box-SelectableLazyColumnKt$appendEntry$4$1	I
/*     */       //   701	34	34	$this$invoke_u24lambda_u241	Landroidx/compose/foundation/layout/BoxScope;
/*     */       //   701	34	33	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   701	34	32	$changed	I
/*     */       //   665	75	31	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */       //   662	78	30	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   662	78	29	$changed$iv	I
/*     */       //   577	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   574	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   570	64	26	$i$f$set-impl	I
/*     */       //   567	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   533	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   530	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   469	282	22	$i$f$ReusableComposeNode	I
/*     */       //   466	285	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   466	285	21	$changed$iv$iv$iv	I
/*     */       //   412	344	16	$i$f$Layout	I
/*     */       //   427	329	17	compositeKeyHash$iv$iv	I
/*     */       //   435	321	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   443	313	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   409	347	15	$changed$iv$iv	I
/*     */       //   371	390	13	$i$f$Box	I
/*     */       //   399	362	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   368	393	8	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   387	374	9	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */       //   390	371	10	propagateMinConstraints$iv	Z
/*     */       //   368	393	12	$changed$iv	I
/*     */       //   241	584	6	key	Ljava/lang/Object;
/*     */       //   272	553	7	itemScope	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyItemScope;
/*     */       //   10	825	5	$dirty	I
/*     */       //   0	835	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$4;
/*     */       //   0	835	1	$this$items	Landroidx/compose/foundation/lazy/LazyItemScope;
/*     */       //   0	835	2	index	I
/*     */       //   0	835	3	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	835	4	$changed	I
/*     */     }
/*     */     
/*     */     SelectableLazyColumnKt$appendEntry$4(SelectableLazyListScopeContainer.Entry $entry, SelectableLazyListState $state, boolean $isFocused, Function1<Object, Boolean> $isKeySelectable, FocusRequester $focusRequester, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, List<SelectableLazyListKey> $keys) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSelectableLazyColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$5\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,245:1\n71#2:246\n68#2,6:247\n74#2:281\n78#2:285\n79#3,6:253\n86#3,4:268\n90#3,2:278\n94#3:284\n368#4,9:259\n377#4:280\n378#4,2:282\n4034#5,6:272\n*S KotlinDebug\n*F\n+ 1 SelectableLazyColumn.kt\norg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$appendEntry$5\n*L\n194#1:246\n194#1:247,6\n194#1:281\n194#1:285\n194#1:253,6\n194#1:268,4\n194#1:278,2\n194#1:284\n194#1:259,9\n194#1:280\n194#1:282,2\n194#1:272,6\n*E\n"})
/*     */   static final class SelectableLazyColumnKt$appendEntry$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(LazyItemScope $this$stickyHeader, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter($this$stickyHeader, "$this$stickyHeader");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changed($this$stickyHeader) ? 4 : 2; 
/*     */       if (($dirty & 0x13) != 18 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-182811687, $dirty, -1, "org.jetbrains.jewel.foundation.lazy.appendEntry.<anonymous> (SelectableLazyColumn.kt:190)"); 
/*     */         SelectableLazyItemScope itemScope = SelectableLazyListScopeKt.SelectableLazyItemScope($this$stickyHeader, this.$state.getSelectedKeys().contains(((SelectableLazyListScopeContainer.Entry.StickyHeader)this.$entry).getKey()), this.$isFocused, $composer, 0xE & $dirty, 0);
/*     */         if (((Boolean)this.$isKeySelectable.invoke(((SelectableLazyListScopeContainer.Entry.StickyHeader)this.$entry).getKey())).booleanValue()) {
/*     */           $composer.startReplaceGroup(-1955221781);
/*     */           Modifier modifier1 = SelectableLazyColumnKt.selectable$default((Modifier)Modifier.Companion, null, this.$keyActions.getKeybindings(), this.$pointerEventActions, this.$selectionMode, this.$state, this.$keys, ((SelectableLazyListScopeContainer.Entry.StickyHeader)this.$entry).getKey(), 1, null);
/*     */           SelectableLazyListScopeContainer.Entry entry = this.$entry;
/*     */           int $changed$iv = 0, $i$f$Box = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */           Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */           boolean propagateMinConstraints$iv = false;
/*     */           MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */           int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */           int $i$f$Layout = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */           int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */           CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */           Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */           Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */           int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */           int $i$f$ReusableComposeNode = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */           if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */             ComposablesKt.invalidApplier(); 
/*     */           $composer.startReusableNode();
/*     */           if ($composer.getInserting()) {
/*     */             $composer.createNode(function0);
/*     */           } else {
/*     */             $composer.useNode();
/*     */           } 
/*     */           Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */           int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */           Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */           int $i$f$set-impl = 0;
/*     */           Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */           int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */           if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */             $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */             $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */           } 
/*     */           Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */           int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */           Composer $composer$iv = $composer;
/*     */           int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */           ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */           int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */           Composer composer1 = $composer$iv;
/*     */           BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */           int $i$a$-Box-SelectableLazyColumnKt$appendEntry$5$1 = 0;
/*     */           ((SelectableLazyListScopeContainer.Entry.StickyHeader)entry).getContent().invoke(itemScope, composer1, Integer.valueOf(0));
/*     */           ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */           $composer.endNode();
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           ComposerKt.sourceInformationMarkerEnd($composer);
/*     */           $composer.endReplaceGroup();
/*     */         } else {
/*     */           $composer.startReplaceGroup(-1954614026);
/*     */           SelectableLazyItemScope selectableLazyItemScope2 = SelectableLazyListScopeKt.SelectableLazyItemScope($this$stickyHeader, this.$state.getSelectedKeys().contains(((SelectableLazyListScopeContainer.Entry.StickyHeader)this.$entry).getKey()), this.$isFocused, $composer, 0xE & $dirty, 0);
/*     */           SelectableLazyListScopeContainer.Entry entry = this.$entry;
/*     */           SelectableLazyItemScope $this$invoke_u24lambda_u241 = selectableLazyItemScope2;
/*     */           int $i$a$-apply-SelectableLazyColumnKt$appendEntry$5$2 = 0;
/*     */           ((SelectableLazyListScopeContainer.Entry.StickyHeader)entry).getContent().invoke(itemScope, $composer, Integer.valueOf(0));
/*     */           SelectableLazyItemScope selectableLazyItemScope1 = selectableLazyItemScope2;
/*     */           $composer.endReplaceGroup();
/*     */         } 
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     SelectableLazyColumnKt$appendEntry$5(SelectableLazyListState $state, SelectableLazyListScopeContainer.Entry $entry, boolean $isFocused, Function1<Object, Boolean> $isKeySelectable, KeyActions $keyActions, PointerEventActions $pointerEventActions, SelectionMode $selectionMode, List<SelectableLazyListKey> $keys) {}
/*     */   }
/*     */   
/*     */   private static final Modifier selectable(Modifier $this$selectable, FocusRequester requester, SelectableColumnKeybindings keybindings, PointerEventActions actionHandler, SelectionMode selectionMode, SelectableLazyListState selectableState, List<? extends SelectableLazyListKey> allKeys, Object itemKey) {
/*     */     return SuspendingPointerInputFilterKt.pointerInput($this$selectable, allKeys, itemKey, new SelectableLazyColumnKt$selectable$1(requester, actionHandler, keybindings, selectableState, selectionMode, allKeys, itemKey, null));
/*     */   }
/*     */   
/*     */   private static final Unit SelectableLazyColumn$lambda$16(Modifier $modifier, SelectionMode $selectionMode, SelectableLazyListState $state, PaddingValues $contentPadding, boolean $reverseLayout, Function1<? super List<Integer>, Unit> $onSelectedIndexesChange, Arrangement.Vertical $verticalArrangement, Alignment.Horizontal $horizontalAlignment, FlingBehavior $flingBehavior, KeyActions $keyActions, PointerEventActions $pointerEventActions, MutableInteractionSource $interactionSource, Function1<? super SelectableLazyListScope, Unit> $content, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     SelectableLazyColumn($modifier, $selectionMode, $state, $contentPadding, $reverseLayout, $onSelectedIndexesChange, $verticalArrangement, $horizontalAlignment, $flingBehavior, $keyActions, $pointerEventActions, $interactionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "SelectableLazyColumn.kt", l = {226}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.foundation.lazy.SelectableLazyColumnKt$selectable$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */   static final class SelectableLazyColumnKt$selectable$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SelectableLazyColumnKt$selectable$1(FocusRequester $requester, PointerEventActions $actionHandler, SelectableColumnKeybindings $keybindings, SelectableLazyListState $selectableState, SelectionMode $selectionMode, List<SelectableLazyListKey> $allKeys, Object $itemKey, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       PointerInputScope $this$pointerInput;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$pointerInput = (PointerInputScope)this.L$0;
/*     */           this.label = 1;
/*     */           if ($this$pointerInput.awaitPointerEventScope(new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #4
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 156, 0 -> 32, 1 -> 75
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   43: astore_2
/*     */                   //   44: nop
/*     */                   //   45: aload_2
/*     */                   //   46: aconst_null
/*     */                   //   47: aload_0
/*     */                   //   48: checkcast kotlin/coroutines/Continuation
/*     */                   //   51: iconst_1
/*     */                   //   52: aconst_null
/*     */                   //   53: aload_0
/*     */                   //   54: aload_2
/*     */                   //   55: putfield L$0 : Ljava/lang/Object;
/*     */                   //   58: aload_0
/*     */                   //   59: iconst_1
/*     */                   //   60: putfield label : I
/*     */                   //   63: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   66: dup
/*     */                   //   67: aload #4
/*     */                   //   69: if_acmpne -> 88
/*     */                   //   72: aload #4
/*     */                   //   74: areturn
/*     */                   //   75: aload_0
/*     */                   //   76: getfield L$0 : Ljava/lang/Object;
/*     */                   //   79: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   82: astore_2
/*     */                   //   83: aload_1
/*     */                   //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   87: aload_1
/*     */                   //   88: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                   //   91: astore_3
/*     */                   //   92: aload_3
/*     */                   //   93: invokevirtual getType-7fucELk : ()I
/*     */                   //   96: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                   //   99: invokevirtual getPress-7fucELk : ()I
/*     */                   //   102: invokestatic equals-impl0 : (II)Z
/*     */                   //   105: ifeq -> 44
/*     */                   //   108: aload_0
/*     */                   //   109: getfield $requester : Landroidx/compose/ui/focus/FocusRequester;
/*     */                   //   112: dup
/*     */                   //   113: ifnull -> 122
/*     */                   //   116: invokevirtual requestFocus : ()V
/*     */                   //   119: goto -> 123
/*     */                   //   122: pop
/*     */                   //   123: aload_0
/*     */                   //   124: getfield $actionHandler : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */                   //   127: aload_3
/*     */                   //   128: aload_0
/*     */                   //   129: getfield $keybindings : Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
/*     */                   //   132: aload_0
/*     */                   //   133: getfield $selectableState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                   //   136: aload_0
/*     */                   //   137: getfield $selectionMode : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */                   //   140: aload_0
/*     */                   //   141: getfield $allKeys : Ljava/util/List;
/*     */                   //   144: aload_0
/*     */                   //   145: getfield $itemKey : Ljava/lang/Object;
/*     */                   //   148: invokeinterface handlePointerEventPress : (Landroidx/compose/ui/input/pointer/PointerEvent;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Ljava/util/List;Ljava/lang/Object;)V
/*     */                   //   153: goto -> 44
/*     */                   //   156: new java/lang/IllegalStateException
/*     */                   //   159: dup
/*     */                   //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   162: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   165: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #226	-> 3
/*     */                   //   #227	-> 44
/*     */                   //   #228	-> 45
/*     */                   //   #226	-> 72
/*     */                   //   #229	-> 92
/*     */                   //   #230	-> 96
/*     */                   //   #231	-> 108
/*     */                   //   #232	-> 123
/*     */                   //   #233	-> 127
/*     */                   //   #234	-> 128
/*     */                   //   #235	-> 132
/*     */                   //   #236	-> 136
/*     */                   //   #237	-> 140
/*     */                   //   #238	-> 144
/*     */                   //   #232	-> 148
/*     */                   //   #226	-> 156
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	31	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   83	73	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   92	36	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                   //   0	166	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$selectable$1$1;
/*     */                   //   36	120	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           $this$pointerInput.awaitPointerEventScope(new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #4
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 156, 0 -> 32, 1 -> 75
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   43: astore_2
/*     */                   //   44: nop
/*     */                   //   45: aload_2
/*     */                   //   46: aconst_null
/*     */                   //   47: aload_0
/*     */                   //   48: checkcast kotlin/coroutines/Continuation
/*     */                   //   51: iconst_1
/*     */                   //   52: aconst_null
/*     */                   //   53: aload_0
/*     */                   //   54: aload_2
/*     */                   //   55: putfield L$0 : Ljava/lang/Object;
/*     */                   //   58: aload_0
/*     */                   //   59: iconst_1
/*     */                   //   60: putfield label : I
/*     */                   //   63: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   66: dup
/*     */                   //   67: aload #4
/*     */                   //   69: if_acmpne -> 88
/*     */                   //   72: aload #4
/*     */                   //   74: areturn
/*     */                   //   75: aload_0
/*     */                   //   76: getfield L$0 : Ljava/lang/Object;
/*     */                   //   79: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   82: astore_2
/*     */                   //   83: aload_1
/*     */                   //   84: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   87: aload_1
/*     */                   //   88: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                   //   91: astore_3
/*     */                   //   92: aload_3
/*     */                   //   93: invokevirtual getType-7fucELk : ()I
/*     */                   //   96: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                   //   99: invokevirtual getPress-7fucELk : ()I
/*     */                   //   102: invokestatic equals-impl0 : (II)Z
/*     */                   //   105: ifeq -> 44
/*     */                   //   108: aload_0
/*     */                   //   109: getfield $requester : Landroidx/compose/ui/focus/FocusRequester;
/*     */                   //   112: dup
/*     */                   //   113: ifnull -> 122
/*     */                   //   116: invokevirtual requestFocus : ()V
/*     */                   //   119: goto -> 123
/*     */                   //   122: pop
/*     */                   //   123: aload_0
/*     */                   //   124: getfield $actionHandler : Lorg/jetbrains/jewel/foundation/lazy/tree/PointerEventActions;
/*     */                   //   127: aload_3
/*     */                   //   128: aload_0
/*     */                   //   129: getfield $keybindings : Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;
/*     */                   //   132: aload_0
/*     */                   //   133: getfield $selectableState : Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */                   //   136: aload_0
/*     */                   //   137: getfield $selectionMode : Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;
/*     */                   //   140: aload_0
/*     */                   //   141: getfield $allKeys : Ljava/util/List;
/*     */                   //   144: aload_0
/*     */                   //   145: getfield $itemKey : Ljava/lang/Object;
/*     */                   //   148: invokeinterface handlePointerEventPress : (Landroidx/compose/ui/input/pointer/PointerEvent;Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;Lorg/jetbrains/jewel/foundation/lazy/SelectionMode;Ljava/util/List;Ljava/lang/Object;)V
/*     */                   //   153: goto -> 44
/*     */                   //   156: new java/lang/IllegalStateException
/*     */                   //   159: dup
/*     */                   //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   162: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   165: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #226	-> 3
/*     */                   //   #227	-> 44
/*     */                   //   #228	-> 45
/*     */                   //   #226	-> 72
/*     */                   //   #229	-> 92
/*     */                   //   #230	-> 96
/*     */                   //   #231	-> 108
/*     */                   //   #232	-> 123
/*     */                   //   #233	-> 127
/*     */                   //   #234	-> 128
/*     */                   //   #235	-> 132
/*     */                   //   #236	-> 136
/*     */                   //   #237	-> 140
/*     */                   //   #238	-> 144
/*     */                   //   #232	-> 148
/*     */                   //   #226	-> 156
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	31	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   83	73	2	$this$awaitPointerEventScope	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   92	36	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                   //   0	166	0	this	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyColumnKt$selectable$1$1;
/*     */                   //   36	120	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super SelectableLazyColumnKt$selectable$1> $completion) {
/*     */       SelectableLazyColumnKt$selectable$1 selectableLazyColumnKt$selectable$1 = new SelectableLazyColumnKt$selectable$1(this.$requester, this.$actionHandler, this.$keybindings, this.$selectableState, this.$selectionMode, this.$allKeys, this.$itemKey, $completion);
/*     */       selectableLazyColumnKt$selectable$1.L$0 = value;
/*     */       return (Continuation<Unit>)selectableLazyColumnKt$selectable$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */       return ((SelectableLazyColumnKt$selectable$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableLazyColumnKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */