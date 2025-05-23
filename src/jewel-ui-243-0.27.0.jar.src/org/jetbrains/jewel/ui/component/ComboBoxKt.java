/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.FocusableKt;
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusProperties;
/*     */ import androidx.compose.ui.focus.FocusPropertiesKt;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.platform.TestTagKt;
/*     */ import androidx.compose.ui.semantics.Role;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertiesKt;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.IntSize;
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
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\\\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\000\032°\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\016\b\002\020\023\032\b\022\004\022\0020\0010\0242\016\b\002\020\025\032\b\022\004\022\0020\0010\0242\024\b\002\020\026\032\016\022\004\022\0020\b\022\004\022\0020\0010\0272\021\020\030\032\r\022\004\022\0020\0010\024¢\006\002\b\031H\007¢\006\004\b\032\020\033\032\035\020\034\032\0020\0012\006\020\017\032\0020\0202\006\020\007\032\0020\bH\003¢\006\002\020\035¨\006\036²\006\n\020\037\032\0020\bX\002²\006\n\020 \032\0020\bX\002²\006\n\020!\032\0020\"X\002²\006\n\020#\032\0020$X\002²\006\n\020%\032\0020\fX\002"}, d2 = {"ComboBox", "", "labelText", "", "modifier", "Landroidx/compose/ui/Modifier;", "menuModifier", "isEnabled", "", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "maxPopupHeight", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "onArrowDownPress", "Lkotlin/Function0;", "onArrowUpPress", "onPopupStateChange", "Lkotlin/Function1;", "popupContent", "Landroidx/compose/runtime/Composable;", "ComboBox-xYaah8o", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Chevron", "(Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZLandroidx/compose/runtime/Composer;I)V", "ui", "popupExpanded", "chevronHovered", "comboBoxState", "Lorg/jetbrains/jewel/ui/component/ComboBoxState;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "comboBoxWidth"})
/*     */ @SourceDebugExtension({"SMAP\nComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1225#2,6:234\n1225#2,6:240\n1225#2,6:246\n1225#2,6:252\n1225#2,6:258\n1225#2,6:264\n1225#2,6:270\n1225#2,6:276\n1225#2,6:282\n1225#2,6:288\n1225#2,6:294\n1225#2,6:301\n1225#2,6:308\n1225#2,6:314\n1225#2,6:320\n1225#2,6:326\n1225#2,6:333\n1225#2,6:374\n1225#2,6:380\n1225#2,6:386\n77#3:300\n10#4:307\n10#4:332\n71#5:339\n69#5,5:340\n74#5:373\n78#5:395\n71#5:396\n69#5,5:397\n74#5:430\n78#5:434\n79#6,6:345\n86#6,4:360\n90#6,2:370\n94#6:394\n79#6,6:402\n86#6,4:417\n90#6,2:427\n94#6:433\n368#7,9:351\n377#7:372\n378#7,2:392\n368#7,9:408\n377#7:429\n378#7,2:431\n4034#8,6:364\n4034#8,6:421\n81#9:435\n107#9,2:436\n81#9:438\n107#9,2:439\n81#9:441\n107#9,2:442\n81#9:444\n81#9:445\n107#9,2:446\n1#10:448\n*S KotlinDebug\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt\n*L\n70#1:234,6\n73#1:240,6\n74#1:246,6\n75#1:252,6\n78#1:258,6\n79#1:264,6\n86#1:270,6\n87#1:276,6\n89#1:282,6\n91#1:288,6\n105#1:294,6\n112#1:301,6\n120#1:308,6\n121#1:314,6\n130#1:320,6\n131#1:326,6\n169#1:333,6\n211#1:374,6\n214#1:380,6\n203#1:386,6\n106#1:300\n118#1:307\n152#1:332\n108#1:339\n108#1:340,5\n108#1:373\n108#1:395\n225#1:396\n225#1:397,5\n225#1:430\n225#1:434\n108#1:345,6\n108#1:360,4\n108#1:370,2\n108#1:394\n225#1:402,6\n225#1:417,4\n225#1:427,2\n225#1:433\n108#1:351,9\n108#1:372\n108#1:392,2\n225#1:408,9\n225#1:429\n225#1:431,2\n108#1:364,6\n225#1:421,6\n78#1:435\n78#1:436,2\n79#1:438\n79#1:439,2\n86#1:441\n86#1:442,2\n104#1:444\n105#1:445\n105#1:446,2\n*E\n"})
/*     */ public final class ComboBoxKt
/*     */ {
/*     */   private static final Unit ComboBox_xYaah8o$lambda$2$lambda$1() {
/*  73 */     return Unit.INSTANCE;
/*  74 */   } private static final Unit ComboBox_xYaah8o$lambda$4$lambda$3() { return Unit.INSTANCE; }
/*  75 */   private static final Unit ComboBox_xYaah8o$lambda$6$lambda$5(boolean it) { return Unit.INSTANCE; } @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void ComboBox-xYaah8o(@NotNull String labelText, @Nullable Modifier modifier, @Nullable Modifier menuModifier, boolean isEnabled, @Nullable Outline outline, float maxPopupHeight, @Nullable MutableInteractionSource interactionSource, @Nullable ComboBoxStyle style, @Nullable TextStyle textStyle, @Nullable Function0 onArrowDownPress, @Nullable Function0 onArrowUpPress, @Nullable Function1 onPopupStateChange, @NotNull Function2 popupContent, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'labelText'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #12
/*     */     //   8: ldc 'popupContent'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #13
/*     */     //   15: ldc -426350618
/*     */     //   17: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   22: astore #13
/*     */     //   24: iload #14
/*     */     //   26: istore #17
/*     */     //   28: iload #15
/*     */     //   30: istore #18
/*     */     //   32: iload #16
/*     */     //   34: iconst_1
/*     */     //   35: iand
/*     */     //   36: ifeq -> 49
/*     */     //   39: iload #17
/*     */     //   41: bipush #6
/*     */     //   43: ior
/*     */     //   44: istore #17
/*     */     //   46: goto -> 78
/*     */     //   49: iload #14
/*     */     //   51: bipush #6
/*     */     //   53: iand
/*     */     //   54: ifne -> 78
/*     */     //   57: iload #17
/*     */     //   59: aload #13
/*     */     //   61: aload_0
/*     */     //   62: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 74
/*     */     //   70: iconst_4
/*     */     //   71: goto -> 75
/*     */     //   74: iconst_2
/*     */     //   75: ior
/*     */     //   76: istore #17
/*     */     //   78: iload #16
/*     */     //   80: iconst_2
/*     */     //   81: iand
/*     */     //   82: ifeq -> 95
/*     */     //   85: iload #17
/*     */     //   87: bipush #48
/*     */     //   89: ior
/*     */     //   90: istore #17
/*     */     //   92: goto -> 126
/*     */     //   95: iload #14
/*     */     //   97: bipush #48
/*     */     //   99: iand
/*     */     //   100: ifne -> 126
/*     */     //   103: iload #17
/*     */     //   105: aload #13
/*     */     //   107: aload_1
/*     */     //   108: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   113: ifeq -> 121
/*     */     //   116: bipush #32
/*     */     //   118: goto -> 123
/*     */     //   121: bipush #16
/*     */     //   123: ior
/*     */     //   124: istore #17
/*     */     //   126: iload #16
/*     */     //   128: iconst_4
/*     */     //   129: iand
/*     */     //   130: ifeq -> 144
/*     */     //   133: iload #17
/*     */     //   135: sipush #384
/*     */     //   138: ior
/*     */     //   139: istore #17
/*     */     //   141: goto -> 178
/*     */     //   144: iload #14
/*     */     //   146: sipush #384
/*     */     //   149: iand
/*     */     //   150: ifne -> 178
/*     */     //   153: iload #17
/*     */     //   155: aload #13
/*     */     //   157: aload_2
/*     */     //   158: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   163: ifeq -> 172
/*     */     //   166: sipush #256
/*     */     //   169: goto -> 175
/*     */     //   172: sipush #128
/*     */     //   175: ior
/*     */     //   176: istore #17
/*     */     //   178: iload #16
/*     */     //   180: bipush #8
/*     */     //   182: iand
/*     */     //   183: ifeq -> 197
/*     */     //   186: iload #17
/*     */     //   188: sipush #3072
/*     */     //   191: ior
/*     */     //   192: istore #17
/*     */     //   194: goto -> 231
/*     */     //   197: iload #14
/*     */     //   199: sipush #3072
/*     */     //   202: iand
/*     */     //   203: ifne -> 231
/*     */     //   206: iload #17
/*     */     //   208: aload #13
/*     */     //   210: iload_3
/*     */     //   211: invokeinterface changed : (Z)Z
/*     */     //   216: ifeq -> 225
/*     */     //   219: sipush #2048
/*     */     //   222: goto -> 228
/*     */     //   225: sipush #1024
/*     */     //   228: ior
/*     */     //   229: istore #17
/*     */     //   231: iload #16
/*     */     //   233: bipush #16
/*     */     //   235: iand
/*     */     //   236: ifeq -> 250
/*     */     //   239: iload #17
/*     */     //   241: sipush #24576
/*     */     //   244: ior
/*     */     //   245: istore #17
/*     */     //   247: goto -> 285
/*     */     //   250: iload #14
/*     */     //   252: sipush #24576
/*     */     //   255: iand
/*     */     //   256: ifne -> 285
/*     */     //   259: iload #17
/*     */     //   261: aload #13
/*     */     //   263: aload #4
/*     */     //   265: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   270: ifeq -> 279
/*     */     //   273: sipush #16384
/*     */     //   276: goto -> 282
/*     */     //   279: sipush #8192
/*     */     //   282: ior
/*     */     //   283: istore #17
/*     */     //   285: iload #16
/*     */     //   287: bipush #32
/*     */     //   289: iand
/*     */     //   290: ifeq -> 303
/*     */     //   293: iload #17
/*     */     //   295: ldc 196608
/*     */     //   297: ior
/*     */     //   298: istore #17
/*     */     //   300: goto -> 335
/*     */     //   303: iload #14
/*     */     //   305: ldc 196608
/*     */     //   307: iand
/*     */     //   308: ifne -> 335
/*     */     //   311: iload #17
/*     */     //   313: aload #13
/*     */     //   315: fload #5
/*     */     //   317: invokeinterface changed : (F)Z
/*     */     //   322: ifeq -> 330
/*     */     //   325: ldc 131072
/*     */     //   327: goto -> 332
/*     */     //   330: ldc 65536
/*     */     //   332: ior
/*     */     //   333: istore #17
/*     */     //   335: iload #16
/*     */     //   337: bipush #64
/*     */     //   339: iand
/*     */     //   340: ifeq -> 353
/*     */     //   343: iload #17
/*     */     //   345: ldc 1572864
/*     */     //   347: ior
/*     */     //   348: istore #17
/*     */     //   350: goto -> 385
/*     */     //   353: iload #14
/*     */     //   355: ldc 1572864
/*     */     //   357: iand
/*     */     //   358: ifne -> 385
/*     */     //   361: iload #17
/*     */     //   363: aload #13
/*     */     //   365: aload #6
/*     */     //   367: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   372: ifeq -> 380
/*     */     //   375: ldc 1048576
/*     */     //   377: goto -> 382
/*     */     //   380: ldc 524288
/*     */     //   382: ior
/*     */     //   383: istore #17
/*     */     //   385: iload #14
/*     */     //   387: ldc 12582912
/*     */     //   389: iand
/*     */     //   390: ifne -> 426
/*     */     //   393: iload #17
/*     */     //   395: iload #16
/*     */     //   397: sipush #128
/*     */     //   400: iand
/*     */     //   401: ifne -> 421
/*     */     //   404: aload #13
/*     */     //   406: aload #7
/*     */     //   408: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   413: ifeq -> 421
/*     */     //   416: ldc 8388608
/*     */     //   418: goto -> 423
/*     */     //   421: ldc 4194304
/*     */     //   423: ior
/*     */     //   424: istore #17
/*     */     //   426: iload #14
/*     */     //   428: ldc 100663296
/*     */     //   430: iand
/*     */     //   431: ifne -> 467
/*     */     //   434: iload #17
/*     */     //   436: iload #16
/*     */     //   438: sipush #256
/*     */     //   441: iand
/*     */     //   442: ifne -> 462
/*     */     //   445: aload #13
/*     */     //   447: aload #8
/*     */     //   449: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   454: ifeq -> 462
/*     */     //   457: ldc 67108864
/*     */     //   459: goto -> 464
/*     */     //   462: ldc 33554432
/*     */     //   464: ior
/*     */     //   465: istore #17
/*     */     //   467: iload #16
/*     */     //   469: sipush #512
/*     */     //   472: iand
/*     */     //   473: ifeq -> 486
/*     */     //   476: iload #17
/*     */     //   478: ldc 805306368
/*     */     //   480: ior
/*     */     //   481: istore #17
/*     */     //   483: goto -> 518
/*     */     //   486: iload #14
/*     */     //   488: ldc 805306368
/*     */     //   490: iand
/*     */     //   491: ifne -> 518
/*     */     //   494: iload #17
/*     */     //   496: aload #13
/*     */     //   498: aload #9
/*     */     //   500: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   505: ifeq -> 513
/*     */     //   508: ldc 536870912
/*     */     //   510: goto -> 515
/*     */     //   513: ldc 268435456
/*     */     //   515: ior
/*     */     //   516: istore #17
/*     */     //   518: iload #16
/*     */     //   520: sipush #1024
/*     */     //   523: iand
/*     */     //   524: ifeq -> 537
/*     */     //   527: iload #18
/*     */     //   529: bipush #6
/*     */     //   531: ior
/*     */     //   532: istore #18
/*     */     //   534: goto -> 567
/*     */     //   537: iload #15
/*     */     //   539: bipush #6
/*     */     //   541: iand
/*     */     //   542: ifne -> 567
/*     */     //   545: iload #18
/*     */     //   547: aload #13
/*     */     //   549: aload #10
/*     */     //   551: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   556: ifeq -> 563
/*     */     //   559: iconst_4
/*     */     //   560: goto -> 564
/*     */     //   563: iconst_2
/*     */     //   564: ior
/*     */     //   565: istore #18
/*     */     //   567: iload #16
/*     */     //   569: sipush #2048
/*     */     //   572: iand
/*     */     //   573: ifeq -> 586
/*     */     //   576: iload #18
/*     */     //   578: bipush #48
/*     */     //   580: ior
/*     */     //   581: istore #18
/*     */     //   583: goto -> 618
/*     */     //   586: iload #15
/*     */     //   588: bipush #48
/*     */     //   590: iand
/*     */     //   591: ifne -> 618
/*     */     //   594: iload #18
/*     */     //   596: aload #13
/*     */     //   598: aload #11
/*     */     //   600: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   605: ifeq -> 613
/*     */     //   608: bipush #32
/*     */     //   610: goto -> 615
/*     */     //   613: bipush #16
/*     */     //   615: ior
/*     */     //   616: istore #18
/*     */     //   618: iload #16
/*     */     //   620: sipush #4096
/*     */     //   623: iand
/*     */     //   624: ifeq -> 638
/*     */     //   627: iload #18
/*     */     //   629: sipush #384
/*     */     //   632: ior
/*     */     //   633: istore #18
/*     */     //   635: goto -> 673
/*     */     //   638: iload #15
/*     */     //   640: sipush #384
/*     */     //   643: iand
/*     */     //   644: ifne -> 673
/*     */     //   647: iload #18
/*     */     //   649: aload #13
/*     */     //   651: aload #12
/*     */     //   653: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   658: ifeq -> 667
/*     */     //   661: sipush #256
/*     */     //   664: goto -> 670
/*     */     //   667: sipush #128
/*     */     //   670: ior
/*     */     //   671: istore #18
/*     */     //   673: iload #17
/*     */     //   675: ldc 306783379
/*     */     //   677: iand
/*     */     //   678: ldc 306783378
/*     */     //   680: if_icmpne -> 705
/*     */     //   683: iload #18
/*     */     //   685: sipush #147
/*     */     //   688: iand
/*     */     //   689: sipush #146
/*     */     //   692: if_icmpne -> 705
/*     */     //   695: aload #13
/*     */     //   697: invokeinterface getSkipping : ()Z
/*     */     //   702: ifne -> 4116
/*     */     //   705: aload #13
/*     */     //   707: invokeinterface startDefaults : ()V
/*     */     //   712: iload #14
/*     */     //   714: iconst_1
/*     */     //   715: iand
/*     */     //   716: ifeq -> 729
/*     */     //   719: aload #13
/*     */     //   721: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   726: ifeq -> 1236
/*     */     //   729: iload #16
/*     */     //   731: iconst_2
/*     */     //   732: iand
/*     */     //   733: ifeq -> 743
/*     */     //   736: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   739: checkcast androidx/compose/ui/Modifier
/*     */     //   742: astore_1
/*     */     //   743: iload #16
/*     */     //   745: iconst_4
/*     */     //   746: iand
/*     */     //   747: ifeq -> 757
/*     */     //   750: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   753: checkcast androidx/compose/ui/Modifier
/*     */     //   756: astore_2
/*     */     //   757: iload #16
/*     */     //   759: bipush #8
/*     */     //   761: iand
/*     */     //   762: ifeq -> 767
/*     */     //   765: iconst_1
/*     */     //   766: istore_3
/*     */     //   767: iload #16
/*     */     //   769: bipush #16
/*     */     //   771: iand
/*     */     //   772: ifeq -> 780
/*     */     //   775: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   778: astore #4
/*     */     //   780: iload #16
/*     */     //   782: bipush #32
/*     */     //   784: iand
/*     */     //   785: ifeq -> 796
/*     */     //   788: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   791: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   794: fstore #5
/*     */     //   796: iload #16
/*     */     //   798: bipush #64
/*     */     //   800: iand
/*     */     //   801: ifeq -> 889
/*     */     //   804: aload #13
/*     */     //   806: ldc -411365310
/*     */     //   808: invokeinterface startReplaceGroup : (I)V
/*     */     //   813: aload #13
/*     */     //   815: astore #20
/*     */     //   817: iconst_0
/*     */     //   818: istore #21
/*     */     //   820: iconst_0
/*     */     //   821: istore #22
/*     */     //   823: aload #20
/*     */     //   825: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   830: astore #23
/*     */     //   832: iconst_0
/*     */     //   833: istore #24
/*     */     //   835: aload #23
/*     */     //   837: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   840: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   843: if_acmpne -> 868
/*     */     //   846: iconst_0
/*     */     //   847: istore #25
/*     */     //   849: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   852: astore #25
/*     */     //   854: aload #20
/*     */     //   856: aload #25
/*     */     //   858: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   863: aload #25
/*     */     //   865: goto -> 870
/*     */     //   868: aload #23
/*     */     //   870: nop
/*     */     //   871: nop
/*     */     //   872: nop
/*     */     //   873: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   876: astore #19
/*     */     //   878: aload #13
/*     */     //   880: invokeinterface endReplaceGroup : ()V
/*     */     //   885: aload #19
/*     */     //   887: astore #6
/*     */     //   889: iload #16
/*     */     //   891: sipush #128
/*     */     //   894: iand
/*     */     //   895: ifeq -> 917
/*     */     //   898: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   901: aload #13
/*     */     //   903: bipush #6
/*     */     //   905: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   908: astore #7
/*     */     //   910: iload #17
/*     */     //   912: ldc -29360129
/*     */     //   914: iand
/*     */     //   915: istore #17
/*     */     //   917: iload #16
/*     */     //   919: sipush #256
/*     */     //   922: iand
/*     */     //   923: ifeq -> 945
/*     */     //   926: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   929: aload #13
/*     */     //   931: bipush #6
/*     */     //   933: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   936: astore #8
/*     */     //   938: iload #17
/*     */     //   940: ldc -234881025
/*     */     //   942: iand
/*     */     //   943: istore #17
/*     */     //   945: iload #16
/*     */     //   947: sipush #512
/*     */     //   950: iand
/*     */     //   951: ifeq -> 1041
/*     */     //   954: aload #13
/*     */     //   956: ldc -411359427
/*     */     //   958: invokeinterface startReplaceGroup : (I)V
/*     */     //   963: aload #13
/*     */     //   965: astore #20
/*     */     //   967: iconst_0
/*     */     //   968: istore #21
/*     */     //   970: iconst_0
/*     */     //   971: istore #22
/*     */     //   973: aload #20
/*     */     //   975: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   980: astore #23
/*     */     //   982: iconst_0
/*     */     //   983: istore #24
/*     */     //   985: aload #23
/*     */     //   987: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   990: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   993: if_acmpne -> 1020
/*     */     //   996: iconst_0
/*     */     //   997: istore #25
/*     */     //   999: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1004: astore #25
/*     */     //   1006: aload #20
/*     */     //   1008: aload #25
/*     */     //   1010: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1015: aload #25
/*     */     //   1017: goto -> 1022
/*     */     //   1020: aload #23
/*     */     //   1022: nop
/*     */     //   1023: nop
/*     */     //   1024: nop
/*     */     //   1025: checkcast kotlin/jvm/functions/Function0
/*     */     //   1028: astore #19
/*     */     //   1030: aload #13
/*     */     //   1032: invokeinterface endReplaceGroup : ()V
/*     */     //   1037: aload #19
/*     */     //   1039: astore #9
/*     */     //   1041: iload #16
/*     */     //   1043: sipush #1024
/*     */     //   1046: iand
/*     */     //   1047: ifeq -> 1137
/*     */     //   1050: aload #13
/*     */     //   1052: ldc -411358243
/*     */     //   1054: invokeinterface startReplaceGroup : (I)V
/*     */     //   1059: aload #13
/*     */     //   1061: astore #20
/*     */     //   1063: iconst_0
/*     */     //   1064: istore #21
/*     */     //   1066: iconst_0
/*     */     //   1067: istore #22
/*     */     //   1069: aload #20
/*     */     //   1071: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1076: astore #23
/*     */     //   1078: iconst_0
/*     */     //   1079: istore #24
/*     */     //   1081: aload #23
/*     */     //   1083: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1086: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1089: if_acmpne -> 1116
/*     */     //   1092: iconst_0
/*     */     //   1093: istore #25
/*     */     //   1095: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1100: astore #25
/*     */     //   1102: aload #20
/*     */     //   1104: aload #25
/*     */     //   1106: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1111: aload #25
/*     */     //   1113: goto -> 1118
/*     */     //   1116: aload #23
/*     */     //   1118: nop
/*     */     //   1119: nop
/*     */     //   1120: nop
/*     */     //   1121: checkcast kotlin/jvm/functions/Function0
/*     */     //   1124: astore #19
/*     */     //   1126: aload #13
/*     */     //   1128: invokeinterface endReplaceGroup : ()V
/*     */     //   1133: aload #19
/*     */     //   1135: astore #10
/*     */     //   1137: iload #16
/*     */     //   1139: sipush #2048
/*     */     //   1142: iand
/*     */     //   1143: ifeq -> 1275
/*     */     //   1146: aload #13
/*     */     //   1148: ldc -411356707
/*     */     //   1150: invokeinterface startReplaceGroup : (I)V
/*     */     //   1155: aload #13
/*     */     //   1157: astore #20
/*     */     //   1159: iconst_0
/*     */     //   1160: istore #21
/*     */     //   1162: iconst_0
/*     */     //   1163: istore #22
/*     */     //   1165: aload #20
/*     */     //   1167: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1172: astore #23
/*     */     //   1174: iconst_0
/*     */     //   1175: istore #24
/*     */     //   1177: aload #23
/*     */     //   1179: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1182: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1185: if_acmpne -> 1212
/*     */     //   1188: iconst_0
/*     */     //   1189: istore #25
/*     */     //   1191: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1196: astore #25
/*     */     //   1198: aload #20
/*     */     //   1200: aload #25
/*     */     //   1202: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1207: aload #25
/*     */     //   1209: goto -> 1214
/*     */     //   1212: aload #23
/*     */     //   1214: nop
/*     */     //   1215: nop
/*     */     //   1216: nop
/*     */     //   1217: checkcast kotlin/jvm/functions/Function1
/*     */     //   1220: astore #19
/*     */     //   1222: aload #13
/*     */     //   1224: invokeinterface endReplaceGroup : ()V
/*     */     //   1229: aload #19
/*     */     //   1231: astore #11
/*     */     //   1233: goto -> 1275
/*     */     //   1236: aload #13
/*     */     //   1238: invokeinterface skipToGroupEnd : ()V
/*     */     //   1243: iload #16
/*     */     //   1245: sipush #128
/*     */     //   1248: iand
/*     */     //   1249: ifeq -> 1259
/*     */     //   1252: iload #17
/*     */     //   1254: ldc -29360129
/*     */     //   1256: iand
/*     */     //   1257: istore #17
/*     */     //   1259: iload #16
/*     */     //   1261: sipush #256
/*     */     //   1264: iand
/*     */     //   1265: ifeq -> 1275
/*     */     //   1268: iload #17
/*     */     //   1270: ldc -234881025
/*     */     //   1272: iand
/*     */     //   1273: istore #17
/*     */     //   1275: aload #13
/*     */     //   1277: invokeinterface endDefaults : ()V
/*     */     //   1282: invokestatic isTraceInProgress : ()Z
/*     */     //   1285: ifeq -> 1299
/*     */     //   1288: ldc -426350618
/*     */     //   1290: iload #17
/*     */     //   1292: iload #18
/*     */     //   1294: ldc 'org.jetbrains.jewel.ui.component.ComboBox (ComboBox.kt:76)'
/*     */     //   1296: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1299: aload #13
/*     */     //   1301: ldc -411354275
/*     */     //   1303: invokeinterface startReplaceGroup : (I)V
/*     */     //   1308: aload #13
/*     */     //   1310: astore #21
/*     */     //   1312: iconst_0
/*     */     //   1313: istore #22
/*     */     //   1315: nop
/*     */     //   1316: iconst_0
/*     */     //   1317: istore #23
/*     */     //   1319: aload #21
/*     */     //   1321: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1326: astore #24
/*     */     //   1328: iconst_0
/*     */     //   1329: istore #25
/*     */     //   1331: aload #24
/*     */     //   1333: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1336: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1339: if_acmpne -> 1371
/*     */     //   1342: iconst_0
/*     */     //   1343: istore #26
/*     */     //   1345: iconst_0
/*     */     //   1346: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1349: aconst_null
/*     */     //   1350: iconst_2
/*     */     //   1351: aconst_null
/*     */     //   1352: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1355: astore #26
/*     */     //   1357: aload #21
/*     */     //   1359: aload #26
/*     */     //   1361: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1366: aload #26
/*     */     //   1368: goto -> 1373
/*     */     //   1371: aload #24
/*     */     //   1373: nop
/*     */     //   1374: nop
/*     */     //   1375: nop
/*     */     //   1376: checkcast androidx/compose/runtime/MutableState
/*     */     //   1379: astore #20
/*     */     //   1381: aload #13
/*     */     //   1383: invokeinterface endReplaceGroup : ()V
/*     */     //   1388: aload #20
/*     */     //   1390: astore #19
/*     */     //   1392: aload #13
/*     */     //   1394: ldc -411352323
/*     */     //   1396: invokeinterface startReplaceGroup : (I)V
/*     */     //   1401: aload #13
/*     */     //   1403: astore #22
/*     */     //   1405: iconst_0
/*     */     //   1406: istore #23
/*     */     //   1408: nop
/*     */     //   1409: iconst_0
/*     */     //   1410: istore #24
/*     */     //   1412: aload #22
/*     */     //   1414: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1419: astore #25
/*     */     //   1421: iconst_0
/*     */     //   1422: istore #26
/*     */     //   1424: aload #25
/*     */     //   1426: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1429: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1432: if_acmpne -> 1464
/*     */     //   1435: iconst_0
/*     */     //   1436: istore #27
/*     */     //   1438: iconst_0
/*     */     //   1439: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1442: aconst_null
/*     */     //   1443: iconst_2
/*     */     //   1444: aconst_null
/*     */     //   1445: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1448: astore #27
/*     */     //   1450: aload #22
/*     */     //   1452: aload #27
/*     */     //   1454: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1459: aload #27
/*     */     //   1461: goto -> 1466
/*     */     //   1464: aload #25
/*     */     //   1466: nop
/*     */     //   1467: nop
/*     */     //   1468: nop
/*     */     //   1469: checkcast androidx/compose/runtime/MutableState
/*     */     //   1472: astore #21
/*     */     //   1474: aload #13
/*     */     //   1476: invokeinterface endReplaceGroup : ()V
/*     */     //   1481: aload #21
/*     */     //   1483: astore #20
/*     */     //   1485: aload #13
/*     */     //   1487: ldc -411346403
/*     */     //   1489: invokeinterface startReplaceGroup : (I)V
/*     */     //   1494: aload #13
/*     */     //   1496: astore #23
/*     */     //   1498: iconst_0
/*     */     //   1499: istore #24
/*     */     //   1501: nop
/*     */     //   1502: iconst_0
/*     */     //   1503: istore #25
/*     */     //   1505: aload #23
/*     */     //   1507: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1512: astore #26
/*     */     //   1514: iconst_0
/*     */     //   1515: istore #27
/*     */     //   1517: aload #26
/*     */     //   1519: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1522: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1525: if_acmpne -> 1570
/*     */     //   1528: iconst_0
/*     */     //   1529: istore #28
/*     */     //   1531: getstatic org/jetbrains/jewel/ui/component/ComboBoxState.Companion : Lorg/jetbrains/jewel/ui/component/ComboBoxState$Companion;
/*     */     //   1534: iload_3
/*     */     //   1535: iconst_0
/*     */     //   1536: iconst_0
/*     */     //   1537: iconst_0
/*     */     //   1538: iconst_0
/*     */     //   1539: bipush #30
/*     */     //   1541: aconst_null
/*     */     //   1542: invokestatic of-b6bHBqw$default : (Lorg/jetbrains/jewel/ui/component/ComboBoxState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   1545: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   1548: aconst_null
/*     */     //   1549: iconst_2
/*     */     //   1550: aconst_null
/*     */     //   1551: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1554: astore #29
/*     */     //   1556: aload #23
/*     */     //   1558: aload #29
/*     */     //   1560: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1565: aload #29
/*     */     //   1567: goto -> 1572
/*     */     //   1570: aload #26
/*     */     //   1572: nop
/*     */     //   1573: nop
/*     */     //   1574: nop
/*     */     //   1575: checkcast androidx/compose/runtime/MutableState
/*     */     //   1578: astore #22
/*     */     //   1580: aload #13
/*     */     //   1582: invokeinterface endReplaceGroup : ()V
/*     */     //   1587: aload #22
/*     */     //   1589: astore #21
/*     */     //   1591: aload #13
/*     */     //   1593: ldc -411343240
/*     */     //   1595: invokeinterface startReplaceGroup : (I)V
/*     */     //   1600: aload #13
/*     */     //   1602: astore #24
/*     */     //   1604: iconst_0
/*     */     //   1605: istore #25
/*     */     //   1607: nop
/*     */     //   1608: iconst_0
/*     */     //   1609: istore #26
/*     */     //   1611: aload #24
/*     */     //   1613: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1618: astore #27
/*     */     //   1620: iconst_0
/*     */     //   1621: istore #28
/*     */     //   1623: aload #27
/*     */     //   1625: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1628: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1631: if_acmpne -> 1660
/*     */     //   1634: iconst_0
/*     */     //   1635: istore #29
/*     */     //   1637: new androidx/compose/ui/focus/FocusRequester
/*     */     //   1640: dup
/*     */     //   1641: invokespecial <init> : ()V
/*     */     //   1644: astore #29
/*     */     //   1646: aload #24
/*     */     //   1648: aload #29
/*     */     //   1650: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1655: aload #29
/*     */     //   1657: goto -> 1662
/*     */     //   1660: aload #27
/*     */     //   1662: nop
/*     */     //   1663: nop
/*     */     //   1664: nop
/*     */     //   1665: checkcast androidx/compose/ui/focus/FocusRequester
/*     */     //   1668: astore #23
/*     */     //   1670: aload #13
/*     */     //   1672: invokeinterface endReplaceGroup : ()V
/*     */     //   1677: aload #23
/*     */     //   1679: astore #22
/*     */     //   1681: aload #13
/*     */     //   1683: ldc -411342070
/*     */     //   1685: invokeinterface startReplaceGroup : (I)V
/*     */     //   1690: aload #13
/*     */     //   1692: astore #23
/*     */     //   1694: iload #17
/*     */     //   1696: sipush #7168
/*     */     //   1699: iand
/*     */     //   1700: sipush #2048
/*     */     //   1703: if_icmpne -> 1710
/*     */     //   1706: iconst_1
/*     */     //   1707: goto -> 1711
/*     */     //   1710: iconst_0
/*     */     //   1711: istore #24
/*     */     //   1713: nop
/*     */     //   1714: iconst_0
/*     */     //   1715: istore #25
/*     */     //   1717: aload #23
/*     */     //   1719: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1724: astore #26
/*     */     //   1726: iconst_0
/*     */     //   1727: istore #27
/*     */     //   1729: iload #24
/*     */     //   1731: ifne -> 1745
/*     */     //   1734: aload #26
/*     */     //   1736: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1739: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1742: if_acmpne -> 1788
/*     */     //   1745: iconst_0
/*     */     //   1746: istore #28
/*     */     //   1748: aload #21
/*     */     //   1750: aload #21
/*     */     //   1752: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1755: iload_3
/*     */     //   1756: iconst_0
/*     */     //   1757: iconst_0
/*     */     //   1758: iconst_0
/*     */     //   1759: iconst_0
/*     */     //   1760: bipush #30
/*     */     //   1762: aconst_null
/*     */     //   1763: invokestatic copy-b6bHBqw$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   1766: invokestatic ComboBox_xYaah8o$lambda$15 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   1769: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1772: astore #29
/*     */     //   1774: aload #23
/*     */     //   1776: aload #29
/*     */     //   1778: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1783: aload #29
/*     */     //   1785: goto -> 1790
/*     */     //   1788: aload #26
/*     */     //   1790: nop
/*     */     //   1791: nop
/*     */     //   1792: nop
/*     */     //   1793: pop
/*     */     //   1794: aload #13
/*     */     //   1796: invokeinterface endReplaceGroup : ()V
/*     */     //   1801: aload #6
/*     */     //   1803: aload #13
/*     */     //   1805: ldc_w -411337782
/*     */     //   1808: invokeinterface startReplaceGroup : (I)V
/*     */     //   1813: aload #13
/*     */     //   1815: astore #24
/*     */     //   1817: iload #17
/*     */     //   1819: ldc_w 3670016
/*     */     //   1822: iand
/*     */     //   1823: ldc 1048576
/*     */     //   1825: if_icmpne -> 1832
/*     */     //   1828: iconst_1
/*     */     //   1829: goto -> 1833
/*     */     //   1832: iconst_0
/*     */     //   1833: istore #25
/*     */     //   1835: iconst_0
/*     */     //   1836: istore #26
/*     */     //   1838: aload #24
/*     */     //   1840: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1845: astore #27
/*     */     //   1847: iconst_0
/*     */     //   1848: istore #28
/*     */     //   1850: iload #25
/*     */     //   1852: ifne -> 1866
/*     */     //   1855: aload #27
/*     */     //   1857: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1860: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1863: if_acmpne -> 1905
/*     */     //   1866: astore #73
/*     */     //   1868: iconst_0
/*     */     //   1869: istore #29
/*     */     //   1871: new org/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$6$1
/*     */     //   1874: dup
/*     */     //   1875: aload #6
/*     */     //   1877: aload #21
/*     */     //   1879: aconst_null
/*     */     //   1880: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   1883: checkcast kotlin/jvm/functions/Function2
/*     */     //   1886: aload #73
/*     */     //   1888: swap
/*     */     //   1889: astore #30
/*     */     //   1891: aload #24
/*     */     //   1893: aload #30
/*     */     //   1895: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1900: aload #30
/*     */     //   1902: goto -> 1907
/*     */     //   1905: aload #27
/*     */     //   1907: nop
/*     */     //   1908: nop
/*     */     //   1909: nop
/*     */     //   1910: checkcast kotlin/jvm/functions/Function2
/*     */     //   1913: astore #23
/*     */     //   1915: aload #13
/*     */     //   1917: invokeinterface endReplaceGroup : ()V
/*     */     //   1922: aload #23
/*     */     //   1924: aload #13
/*     */     //   1926: bipush #14
/*     */     //   1928: iload #17
/*     */     //   1930: bipush #18
/*     */     //   1932: ishr
/*     */     //   1933: iand
/*     */     //   1934: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1937: aload #7
/*     */     //   1939: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   1942: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   1945: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1948: astore #23
/*     */     //   1950: aload #7
/*     */     //   1952: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   1955: aload #21
/*     */     //   1957: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1960: aload #13
/*     */     //   1962: iconst_0
/*     */     //   1963: invokevirtual borderFor-zWq4Sqo : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1966: astore #24
/*     */     //   1968: aload #13
/*     */     //   1970: ldc_w -411315642
/*     */     //   1973: invokeinterface startReplaceGroup : (I)V
/*     */     //   1978: aload #13
/*     */     //   1980: astore #27
/*     */     //   1982: iconst_0
/*     */     //   1983: istore #28
/*     */     //   1985: nop
/*     */     //   1986: iconst_0
/*     */     //   1987: istore #29
/*     */     //   1989: aload #27
/*     */     //   1991: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1996: astore #30
/*     */     //   1998: iconst_0
/*     */     //   1999: istore #31
/*     */     //   2001: aload #30
/*     */     //   2003: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2006: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2009: if_acmpne -> 2046
/*     */     //   2012: iconst_0
/*     */     //   2013: istore #32
/*     */     //   2015: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   2018: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   2021: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   2024: aconst_null
/*     */     //   2025: iconst_2
/*     */     //   2026: aconst_null
/*     */     //   2027: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   2030: astore #32
/*     */     //   2032: aload #27
/*     */     //   2034: aload #32
/*     */     //   2036: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2041: aload #32
/*     */     //   2043: goto -> 2048
/*     */     //   2046: aload #30
/*     */     //   2048: nop
/*     */     //   2049: nop
/*     */     //   2050: nop
/*     */     //   2051: checkcast androidx/compose/runtime/MutableState
/*     */     //   2054: astore #26
/*     */     //   2056: aload #13
/*     */     //   2058: invokeinterface endReplaceGroup : ()V
/*     */     //   2063: aload #26
/*     */     //   2065: astore #25
/*     */     //   2067: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2070: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   2073: astore #27
/*     */     //   2075: iconst_0
/*     */     //   2076: istore #28
/*     */     //   2078: iconst_0
/*     */     //   2079: istore #29
/*     */     //   2081: aload #13
/*     */     //   2083: ldc_w 2023513938
/*     */     //   2086: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   2089: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2092: aload #13
/*     */     //   2094: aload #27
/*     */     //   2096: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   2101: astore #30
/*     */     //   2103: aload #13
/*     */     //   2105: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2108: aload #30
/*     */     //   2110: checkcast androidx/compose/ui/unit/Density
/*     */     //   2113: astore #26
/*     */     //   2115: aload #13
/*     */     //   2117: ldc_w -411240584
/*     */     //   2120: invokeinterface startReplaceGroup : (I)V
/*     */     //   2125: aload #13
/*     */     //   2127: ldc_w -411298643
/*     */     //   2130: invokeinterface startReplaceGroup : (I)V
/*     */     //   2135: aload_1
/*     */     //   2136: aload #22
/*     */     //   2138: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*     */     //   2141: aload #13
/*     */     //   2143: ldc_w -411308374
/*     */     //   2146: invokeinterface startReplaceGroup : (I)V
/*     */     //   2151: aload #13
/*     */     //   2153: astore #30
/*     */     //   2155: iload #18
/*     */     //   2157: bipush #112
/*     */     //   2159: iand
/*     */     //   2160: bipush #32
/*     */     //   2162: if_icmpne -> 2169
/*     */     //   2165: iconst_1
/*     */     //   2166: goto -> 2170
/*     */     //   2169: iconst_0
/*     */     //   2170: istore #31
/*     */     //   2172: nop
/*     */     //   2173: iconst_0
/*     */     //   2174: istore #32
/*     */     //   2176: aload #30
/*     */     //   2178: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2183: astore #33
/*     */     //   2185: iconst_0
/*     */     //   2186: istore #34
/*     */     //   2188: iload #31
/*     */     //   2190: ifne -> 2204
/*     */     //   2193: aload #33
/*     */     //   2195: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2198: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2201: if_acmpne -> 2239
/*     */     //   2204: astore #73
/*     */     //   2206: iconst_0
/*     */     //   2207: istore #35
/*     */     //   2209: aload #21
/*     */     //   2211: aload #11
/*     */     //   2213: aload #19
/*     */     //   2215: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2220: aload #73
/*     */     //   2222: swap
/*     */     //   2223: astore #36
/*     */     //   2225: aload #30
/*     */     //   2227: aload #36
/*     */     //   2229: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2234: aload #36
/*     */     //   2236: goto -> 2241
/*     */     //   2239: aload #33
/*     */     //   2241: nop
/*     */     //   2242: nop
/*     */     //   2243: nop
/*     */     //   2244: checkcast kotlin/jvm/functions/Function1
/*     */     //   2247: astore #29
/*     */     //   2249: aload #13
/*     */     //   2251: invokeinterface endReplaceGroup : ()V
/*     */     //   2256: aload #29
/*     */     //   2258: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2261: astore #29
/*     */     //   2263: nop
/*     */     //   2264: iconst_0
/*     */     //   2265: istore #30
/*     */     //   2267: iload_3
/*     */     //   2268: ifeq -> 2782
/*     */     //   2271: aload #29
/*     */     //   2273: astore #31
/*     */     //   2275: iconst_0
/*     */     //   2276: istore #32
/*     */     //   2278: aload #31
/*     */     //   2280: iconst_1
/*     */     //   2281: aload #6
/*     */     //   2283: invokestatic focusable : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;)Landroidx/compose/ui/Modifier;
/*     */     //   2286: aload #13
/*     */     //   2288: ldc_w -957141775
/*     */     //   2291: invokeinterface startReplaceGroup : (I)V
/*     */     //   2296: aload #13
/*     */     //   2298: astore #33
/*     */     //   2300: iconst_0
/*     */     //   2301: istore #34
/*     */     //   2303: nop
/*     */     //   2304: iconst_0
/*     */     //   2305: istore #35
/*     */     //   2307: aload #33
/*     */     //   2309: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2314: astore #36
/*     */     //   2316: iconst_0
/*     */     //   2317: istore #37
/*     */     //   2319: aload #36
/*     */     //   2321: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2324: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2327: if_acmpne -> 2361
/*     */     //   2330: astore #38
/*     */     //   2332: iconst_0
/*     */     //   2333: istore #39
/*     */     //   2335: aload #20
/*     */     //   2337: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2342: aload #38
/*     */     //   2344: swap
/*     */     //   2345: astore #40
/*     */     //   2347: aload #33
/*     */     //   2349: aload #40
/*     */     //   2351: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2356: aload #40
/*     */     //   2358: goto -> 2363
/*     */     //   2361: aload #36
/*     */     //   2363: nop
/*     */     //   2364: nop
/*     */     //   2365: nop
/*     */     //   2366: checkcast kotlin/jvm/functions/Function1
/*     */     //   2369: astore #41
/*     */     //   2371: aload #13
/*     */     //   2373: invokeinterface endReplaceGroup : ()V
/*     */     //   2378: aload #41
/*     */     //   2380: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2383: aload #6
/*     */     //   2385: aload #13
/*     */     //   2387: ldc_w -957138805
/*     */     //   2390: invokeinterface startReplaceGroup : (I)V
/*     */     //   2395: aload #13
/*     */     //   2397: astore #33
/*     */     //   2399: iload #18
/*     */     //   2401: bipush #112
/*     */     //   2403: iand
/*     */     //   2404: bipush #32
/*     */     //   2406: if_icmpne -> 2413
/*     */     //   2409: iconst_1
/*     */     //   2410: goto -> 2414
/*     */     //   2413: iconst_0
/*     */     //   2414: istore #34
/*     */     //   2416: iconst_0
/*     */     //   2417: istore #35
/*     */     //   2419: aload #33
/*     */     //   2421: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2426: astore #36
/*     */     //   2428: iconst_0
/*     */     //   2429: istore #37
/*     */     //   2431: iload #34
/*     */     //   2433: ifne -> 2447
/*     */     //   2436: aload #36
/*     */     //   2438: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2441: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2444: if_acmpne -> 2495
/*     */     //   2447: astore #42
/*     */     //   2449: astore #38
/*     */     //   2451: iconst_0
/*     */     //   2452: istore #39
/*     */     //   2454: new org/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$8$2$1
/*     */     //   2457: dup
/*     */     //   2458: aload #22
/*     */     //   2460: aload #19
/*     */     //   2462: aload #11
/*     */     //   2464: aconst_null
/*     */     //   2465: invokespecial <init> : (Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   2468: checkcast kotlin/jvm/functions/Function2
/*     */     //   2471: astore #43
/*     */     //   2473: aload #38
/*     */     //   2475: aload #42
/*     */     //   2477: aload #43
/*     */     //   2479: astore #40
/*     */     //   2481: aload #33
/*     */     //   2483: aload #40
/*     */     //   2485: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2490: aload #40
/*     */     //   2492: goto -> 2497
/*     */     //   2495: aload #36
/*     */     //   2497: nop
/*     */     //   2498: nop
/*     */     //   2499: nop
/*     */     //   2500: checkcast kotlin/jvm/functions/Function2
/*     */     //   2503: astore #41
/*     */     //   2505: aload #13
/*     */     //   2507: invokeinterface endReplaceGroup : ()V
/*     */     //   2512: aload #41
/*     */     //   2514: invokestatic pointerInput : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;
/*     */     //   2517: iconst_1
/*     */     //   2518: aload #13
/*     */     //   2520: ldc_w -957124394
/*     */     //   2523: invokeinterface startReplaceGroup : (I)V
/*     */     //   2528: aload #13
/*     */     //   2530: astore #33
/*     */     //   2532: iconst_0
/*     */     //   2533: istore #34
/*     */     //   2535: iconst_0
/*     */     //   2536: istore #35
/*     */     //   2538: aload #33
/*     */     //   2540: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2545: astore #36
/*     */     //   2547: iconst_0
/*     */     //   2548: istore #37
/*     */     //   2550: aload #36
/*     */     //   2552: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2555: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2558: if_acmpne -> 2597
/*     */     //   2561: istore #42
/*     */     //   2563: astore #38
/*     */     //   2565: iconst_0
/*     */     //   2566: istore #39
/*     */     //   2568: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   2573: astore #43
/*     */     //   2575: aload #38
/*     */     //   2577: iload #42
/*     */     //   2579: aload #43
/*     */     //   2581: astore #39
/*     */     //   2583: aload #33
/*     */     //   2585: aload #39
/*     */     //   2587: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2592: aload #39
/*     */     //   2594: goto -> 2599
/*     */     //   2597: aload #36
/*     */     //   2599: nop
/*     */     //   2600: nop
/*     */     //   2601: nop
/*     */     //   2602: checkcast kotlin/jvm/functions/Function1
/*     */     //   2605: astore #41
/*     */     //   2607: aload #13
/*     */     //   2609: invokeinterface endReplaceGroup : ()V
/*     */     //   2614: aload #41
/*     */     //   2616: invokestatic semantics : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2619: aload #13
/*     */     //   2621: ldc_w -957121113
/*     */     //   2624: invokeinterface startReplaceGroup : (I)V
/*     */     //   2629: aload #13
/*     */     //   2631: astore #33
/*     */     //   2633: iload #18
/*     */     //   2635: bipush #112
/*     */     //   2637: iand
/*     */     //   2638: bipush #32
/*     */     //   2640: if_icmpne -> 2647
/*     */     //   2643: iconst_1
/*     */     //   2644: goto -> 2648
/*     */     //   2647: iconst_0
/*     */     //   2648: iload #17
/*     */     //   2650: ldc_w 1879048192
/*     */     //   2653: iand
/*     */     //   2654: ldc 536870912
/*     */     //   2656: if_icmpne -> 2663
/*     */     //   2659: iconst_1
/*     */     //   2660: goto -> 2664
/*     */     //   2663: iconst_0
/*     */     //   2664: ior
/*     */     //   2665: iload #18
/*     */     //   2667: bipush #14
/*     */     //   2669: iand
/*     */     //   2670: iconst_4
/*     */     //   2671: if_icmpne -> 2678
/*     */     //   2674: iconst_1
/*     */     //   2675: goto -> 2679
/*     */     //   2678: iconst_0
/*     */     //   2679: ior
/*     */     //   2680: istore #34
/*     */     //   2682: nop
/*     */     //   2683: iconst_0
/*     */     //   2684: istore #35
/*     */     //   2686: aload #33
/*     */     //   2688: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2693: astore #36
/*     */     //   2695: iconst_0
/*     */     //   2696: istore #37
/*     */     //   2698: iload #34
/*     */     //   2700: ifne -> 2714
/*     */     //   2703: aload #36
/*     */     //   2705: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2708: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2711: if_acmpne -> 2756
/*     */     //   2714: astore #38
/*     */     //   2716: iconst_0
/*     */     //   2717: istore #39
/*     */     //   2719: new org/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$8$4$1
/*     */     //   2722: dup
/*     */     //   2723: aload #9
/*     */     //   2725: aload #10
/*     */     //   2727: aload #19
/*     */     //   2729: aload #11
/*     */     //   2731: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)V
/*     */     //   2734: checkcast kotlin/jvm/functions/Function1
/*     */     //   2737: aload #38
/*     */     //   2739: swap
/*     */     //   2740: astore #40
/*     */     //   2742: aload #33
/*     */     //   2744: aload #40
/*     */     //   2746: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2751: aload #40
/*     */     //   2753: goto -> 2758
/*     */     //   2756: aload #36
/*     */     //   2758: nop
/*     */     //   2759: nop
/*     */     //   2760: nop
/*     */     //   2761: checkcast kotlin/jvm/functions/Function1
/*     */     //   2764: astore #41
/*     */     //   2766: aload #13
/*     */     //   2768: invokeinterface endReplaceGroup : ()V
/*     */     //   2773: aload #41
/*     */     //   2775: invokestatic onPreviewKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2778: nop
/*     */     //   2779: goto -> 2784
/*     */     //   2782: aload #29
/*     */     //   2784: astore #28
/*     */     //   2786: aload #13
/*     */     //   2788: invokeinterface endReplaceGroup : ()V
/*     */     //   2793: aload #28
/*     */     //   2795: aload #7
/*     */     //   2797: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   2800: aload #21
/*     */     //   2802: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2805: iconst_0
/*     */     //   2806: aload #13
/*     */     //   2808: bipush #48
/*     */     //   2810: invokevirtual backgroundFor-8sYwEIk : (JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2813: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2818: checkcast androidx/compose/ui/graphics/Color
/*     */     //   2821: invokevirtual unbox-impl : ()J
/*     */     //   2824: aload #23
/*     */     //   2826: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2829: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   2832: astore #28
/*     */     //   2834: aload #4
/*     */     //   2836: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   2839: if_acmpne -> 2846
/*     */     //   2842: iconst_1
/*     */     //   2843: goto -> 2847
/*     */     //   2846: iconst_0
/*     */     //   2847: istore #29
/*     */     //   2849: iconst_0
/*     */     //   2850: istore #30
/*     */     //   2852: iload #29
/*     */     //   2854: ifeq -> 2926
/*     */     //   2857: aload #28
/*     */     //   2859: astore #31
/*     */     //   2861: iconst_0
/*     */     //   2862: istore #32
/*     */     //   2864: aload #31
/*     */     //   2866: aload #21
/*     */     //   2868: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2871: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   2874: aload #23
/*     */     //   2876: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2879: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2882: fconst_0
/*     */     //   2883: fconst_0
/*     */     //   2884: aload #13
/*     */     //   2886: sipush #3072
/*     */     //   2889: bipush #24
/*     */     //   2891: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   2894: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Inside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2897: aload #7
/*     */     //   2899: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2902: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   2905: aload #24
/*     */     //   2907: invokestatic ComboBox_xYaah8o$lambda$19 : (Landroidx/compose/runtime/State;)J
/*     */     //   2910: aload #23
/*     */     //   2912: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2915: fconst_0
/*     */     //   2916: bipush #16
/*     */     //   2918: aconst_null
/*     */     //   2919: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2922: nop
/*     */     //   2923: goto -> 2928
/*     */     //   2926: aload #28
/*     */     //   2928: astore #27
/*     */     //   2930: aload #13
/*     */     //   2932: invokeinterface endReplaceGroup : ()V
/*     */     //   2937: aload #27
/*     */     //   2939: aload #21
/*     */     //   2941: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2944: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   2947: aload #4
/*     */     //   2949: aload #23
/*     */     //   2951: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2954: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2957: fconst_0
/*     */     //   2958: aload #13
/*     */     //   2960: sipush #24576
/*     */     //   2963: sipush #896
/*     */     //   2966: iload #17
/*     */     //   2968: bipush #6
/*     */     //   2970: ishr
/*     */     //   2971: iand
/*     */     //   2972: ior
/*     */     //   2973: bipush #16
/*     */     //   2975: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   2978: aload #7
/*     */     //   2980: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2983: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   2986: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   2989: fconst_0
/*     */     //   2990: iconst_2
/*     */     //   2991: aconst_null
/*     */     //   2992: invokestatic widthIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2995: aload #7
/*     */     //   2997: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   3000: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   3003: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   3006: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   3009: aload #13
/*     */     //   3011: ldc_w -411214864
/*     */     //   3014: invokeinterface startReplaceGroup : (I)V
/*     */     //   3019: aload #13
/*     */     //   3021: astore #28
/*     */     //   3023: aload #13
/*     */     //   3025: aload #26
/*     */     //   3027: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   3032: istore #29
/*     */     //   3034: nop
/*     */     //   3035: iconst_0
/*     */     //   3036: istore #30
/*     */     //   3038: aload #28
/*     */     //   3040: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3045: astore #31
/*     */     //   3047: iconst_0
/*     */     //   3048: istore #32
/*     */     //   3050: iload #29
/*     */     //   3052: ifne -> 3066
/*     */     //   3055: aload #31
/*     */     //   3057: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3060: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3063: if_acmpne -> 3099
/*     */     //   3066: astore #73
/*     */     //   3068: iconst_0
/*     */     //   3069: istore #33
/*     */     //   3071: aload #26
/*     */     //   3073: aload #25
/*     */     //   3075: <illegal opcode> invoke : (Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   3080: aload #73
/*     */     //   3082: swap
/*     */     //   3083: astore #34
/*     */     //   3085: aload #28
/*     */     //   3087: aload #34
/*     */     //   3089: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3094: aload #34
/*     */     //   3096: goto -> 3101
/*     */     //   3099: aload #31
/*     */     //   3101: nop
/*     */     //   3102: nop
/*     */     //   3103: nop
/*     */     //   3104: checkcast kotlin/jvm/functions/Function1
/*     */     //   3107: astore #27
/*     */     //   3109: aload #13
/*     */     //   3111: invokeinterface endReplaceGroup : ()V
/*     */     //   3116: aload #27
/*     */     //   3118: invokestatic onSizeChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   3121: astore #27
/*     */     //   3123: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3126: invokevirtual getCenterStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   3129: astore #28
/*     */     //   3131: bipush #48
/*     */     //   3133: istore #30
/*     */     //   3135: nop
/*     */     //   3136: iconst_0
/*     */     //   3137: istore #31
/*     */     //   3139: aload #13
/*     */     //   3141: ldc_w 733328855
/*     */     //   3144: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   3147: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3150: iconst_0
/*     */     //   3151: istore #29
/*     */     //   3153: aload #28
/*     */     //   3155: iload #29
/*     */     //   3157: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3160: astore #32
/*     */     //   3162: bipush #112
/*     */     //   3164: iload #30
/*     */     //   3166: iconst_3
/*     */     //   3167: ishl
/*     */     //   3168: iand
/*     */     //   3169: istore #33
/*     */     //   3171: nop
/*     */     //   3172: iconst_0
/*     */     //   3173: istore #34
/*     */     //   3175: aload #13
/*     */     //   3177: ldc_w -1323940314
/*     */     //   3180: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   3183: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3186: aload #13
/*     */     //   3188: iconst_0
/*     */     //   3189: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   3192: istore #35
/*     */     //   3194: aload #13
/*     */     //   3196: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3201: astore #36
/*     */     //   3203: aload #13
/*     */     //   3205: aload #27
/*     */     //   3207: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   3210: astore #37
/*     */     //   3212: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3215: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   3218: astore #38
/*     */     //   3220: bipush #6
/*     */     //   3222: sipush #896
/*     */     //   3225: iload #33
/*     */     //   3227: bipush #6
/*     */     //   3229: ishl
/*     */     //   3230: iand
/*     */     //   3231: ior
/*     */     //   3232: istore #39
/*     */     //   3234: nop
/*     */     //   3235: iconst_0
/*     */     //   3236: istore #40
/*     */     //   3238: aload #13
/*     */     //   3240: ldc_w -692256719
/*     */     //   3243: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   3246: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3249: aload #13
/*     */     //   3251: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   3256: instanceof androidx/compose/runtime/Applier
/*     */     //   3259: ifne -> 3265
/*     */     //   3262: invokestatic invalidApplier : ()V
/*     */     //   3265: aload #13
/*     */     //   3267: invokeinterface startReusableNode : ()V
/*     */     //   3272: aload #13
/*     */     //   3274: invokeinterface getInserting : ()Z
/*     */     //   3279: ifeq -> 3294
/*     */     //   3282: aload #13
/*     */     //   3284: aload #38
/*     */     //   3286: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3291: goto -> 3301
/*     */     //   3294: aload #13
/*     */     //   3296: invokeinterface useNode : ()V
/*     */     //   3301: aload #13
/*     */     //   3303: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3306: astore #41
/*     */     //   3308: iconst_0
/*     */     //   3309: istore #42
/*     */     //   3311: aload #41
/*     */     //   3313: aload #32
/*     */     //   3315: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3318: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3321: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3324: aload #41
/*     */     //   3326: aload #36
/*     */     //   3328: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3331: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3334: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3337: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3340: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3343: astore #43
/*     */     //   3345: iconst_0
/*     */     //   3346: istore #44
/*     */     //   3348: aload #41
/*     */     //   3350: astore #45
/*     */     //   3352: iconst_0
/*     */     //   3353: istore #46
/*     */     //   3355: aload #45
/*     */     //   3357: invokeinterface getInserting : ()Z
/*     */     //   3362: ifne -> 3383
/*     */     //   3365: aload #45
/*     */     //   3367: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3372: iload #35
/*     */     //   3374: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3377: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3380: ifne -> 3409
/*     */     //   3383: aload #45
/*     */     //   3385: iload #35
/*     */     //   3387: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3390: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3395: aload #41
/*     */     //   3397: iload #35
/*     */     //   3399: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3402: aload #43
/*     */     //   3404: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3409: nop
/*     */     //   3410: nop
/*     */     //   3411: nop
/*     */     //   3412: aload #41
/*     */     //   3414: aload #37
/*     */     //   3416: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3419: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3422: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3425: nop
/*     */     //   3426: nop
/*     */     //   3427: aload #13
/*     */     //   3429: bipush #14
/*     */     //   3431: iload #39
/*     */     //   3433: bipush #6
/*     */     //   3435: ishr
/*     */     //   3436: iand
/*     */     //   3437: istore #47
/*     */     //   3439: astore #48
/*     */     //   3441: iconst_0
/*     */     //   3442: istore #49
/*     */     //   3444: aload #48
/*     */     //   3446: ldc_w -2146769399
/*     */     //   3449: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   3452: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3455: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   3458: aload #48
/*     */     //   3460: bipush #6
/*     */     //   3462: bipush #112
/*     */     //   3464: iload #30
/*     */     //   3466: bipush #6
/*     */     //   3468: ishr
/*     */     //   3469: iand
/*     */     //   3470: ior
/*     */     //   3471: istore #50
/*     */     //   3473: astore #51
/*     */     //   3475: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   3478: astore #52
/*     */     //   3480: iconst_0
/*     */     //   3481: istore #53
/*     */     //   3483: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   3486: aload #7
/*     */     //   3488: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   3491: aload #21
/*     */     //   3493: invokestatic ComboBox_xYaah8o$lambda$14 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   3496: aload #51
/*     */     //   3498: iconst_0
/*     */     //   3499: invokevirtual contentFor-zWq4Sqo : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   3502: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   3507: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   3510: ldc_w 692284384
/*     */     //   3513: iconst_1
/*     */     //   3514: new org/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$11$1
/*     */     //   3517: dup
/*     */     //   3518: iload_3
/*     */     //   3519: aload #7
/*     */     //   3521: aload #8
/*     */     //   3523: aload_0
/*     */     //   3524: invokespecial <init> : (ZLorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Ljava/lang/String;)V
/*     */     //   3527: aload #51
/*     */     //   3529: bipush #54
/*     */     //   3531: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   3534: checkcast kotlin/jvm/functions/Function2
/*     */     //   3537: aload #51
/*     */     //   3539: bipush #48
/*     */     //   3541: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   3544: ior
/*     */     //   3545: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   3548: aload #51
/*     */     //   3550: ldc_w -957024538
/*     */     //   3553: invokeinterface startReplaceGroup : (I)V
/*     */     //   3558: aload #19
/*     */     //   3560: invokestatic ComboBox_xYaah8o$lambda$8 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   3563: ifeq -> 4066
/*     */     //   3566: aload #51
/*     */     //   3568: ldc_w -957023277
/*     */     //   3571: invokeinterface startReplaceGroup : (I)V
/*     */     //   3576: fload #5
/*     */     //   3578: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   3581: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   3584: invokestatic equals-impl0 : (FF)Z
/*     */     //   3587: ifeq -> 3609
/*     */     //   3590: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   3593: aload #51
/*     */     //   3595: bipush #6
/*     */     //   3597: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   3600: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   3603: invokevirtual getMaxPopupHeight-D9Ej5fM : ()F
/*     */     //   3606: goto -> 3611
/*     */     //   3609: fload #5
/*     */     //   3611: fstore #54
/*     */     //   3613: aload #51
/*     */     //   3615: invokeinterface endReplaceGroup : ()V
/*     */     //   3620: fload #54
/*     */     //   3622: fstore #55
/*     */     //   3624: aload_2
/*     */     //   3625: ldc_w 'Jewel.ComboBox.PopupMenu'
/*     */     //   3628: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   3631: iconst_0
/*     */     //   3632: aload #51
/*     */     //   3634: ldc_w -957006131
/*     */     //   3637: invokeinterface startReplaceGroup : (I)V
/*     */     //   3642: aload #51
/*     */     //   3644: astore #56
/*     */     //   3646: iconst_0
/*     */     //   3647: istore #57
/*     */     //   3649: iconst_0
/*     */     //   3650: istore #58
/*     */     //   3652: aload #56
/*     */     //   3654: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3659: astore #59
/*     */     //   3661: iconst_0
/*     */     //   3662: istore #60
/*     */     //   3664: aload #59
/*     */     //   3666: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3669: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3672: if_acmpne -> 3711
/*     */     //   3675: istore #61
/*     */     //   3677: astore #62
/*     */     //   3679: iconst_0
/*     */     //   3680: istore #63
/*     */     //   3682: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   3687: astore #64
/*     */     //   3689: aload #62
/*     */     //   3691: iload #61
/*     */     //   3693: aload #64
/*     */     //   3695: astore #63
/*     */     //   3697: aload #56
/*     */     //   3699: aload #63
/*     */     //   3701: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3706: aload #63
/*     */     //   3708: goto -> 3713
/*     */     //   3711: aload #59
/*     */     //   3713: nop
/*     */     //   3714: nop
/*     */     //   3715: nop
/*     */     //   3716: checkcast kotlin/jvm/functions/Function1
/*     */     //   3719: astore #65
/*     */     //   3721: aload #51
/*     */     //   3723: invokeinterface endReplaceGroup : ()V
/*     */     //   3728: aload #65
/*     */     //   3730: iconst_1
/*     */     //   3731: aconst_null
/*     */     //   3732: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3735: fconst_0
/*     */     //   3736: fload #55
/*     */     //   3738: iconst_1
/*     */     //   3739: aconst_null
/*     */     //   3740: invokestatic heightIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3743: aload #25
/*     */     //   3745: invokestatic ComboBox_xYaah8o$lambda$21 : (Landroidx/compose/runtime/MutableState;)F
/*     */     //   3748: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   3751: iconst_0
/*     */     //   3752: aconst_null
/*     */     //   3753: aconst_null
/*     */     //   3754: aconst_null
/*     */     //   3755: aconst_null
/*     */     //   3756: aload #51
/*     */     //   3758: ldc_w -957000331
/*     */     //   3761: invokeinterface startReplaceGroup : (I)V
/*     */     //   3766: aload #51
/*     */     //   3768: astore #56
/*     */     //   3770: iload #18
/*     */     //   3772: bipush #112
/*     */     //   3774: iand
/*     */     //   3775: bipush #32
/*     */     //   3777: if_icmpne -> 3784
/*     */     //   3780: iconst_1
/*     */     //   3781: goto -> 3785
/*     */     //   3784: iconst_0
/*     */     //   3785: istore #57
/*     */     //   3787: iconst_0
/*     */     //   3788: istore #58
/*     */     //   3790: aload #56
/*     */     //   3792: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3797: astore #59
/*     */     //   3799: iconst_0
/*     */     //   3800: istore #60
/*     */     //   3802: iload #57
/*     */     //   3804: ifne -> 3818
/*     */     //   3807: aload #59
/*     */     //   3809: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3812: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3815: if_acmpne -> 3874
/*     */     //   3818: astore #66
/*     */     //   3820: astore #67
/*     */     //   3822: astore #68
/*     */     //   3824: astore #64
/*     */     //   3826: istore #61
/*     */     //   3828: astore #62
/*     */     //   3830: iconst_0
/*     */     //   3831: istore #63
/*     */     //   3833: aload #11
/*     */     //   3835: aload #19
/*     */     //   3837: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   3842: astore #69
/*     */     //   3844: aload #62
/*     */     //   3846: iload #61
/*     */     //   3848: aload #64
/*     */     //   3850: aload #68
/*     */     //   3852: aload #67
/*     */     //   3854: aload #66
/*     */     //   3856: aload #69
/*     */     //   3858: astore #70
/*     */     //   3860: aload #56
/*     */     //   3862: aload #70
/*     */     //   3864: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3869: aload #70
/*     */     //   3871: goto -> 3876
/*     */     //   3874: aload #59
/*     */     //   3876: nop
/*     */     //   3877: nop
/*     */     //   3878: nop
/*     */     //   3879: checkcast kotlin/jvm/functions/Function0
/*     */     //   3882: astore #65
/*     */     //   3884: aload #51
/*     */     //   3886: invokeinterface endReplaceGroup : ()V
/*     */     //   3891: aload #65
/*     */     //   3893: bipush #31
/*     */     //   3895: aconst_null
/*     */     //   3896: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3899: astore #54
/*     */     //   3901: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3904: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3907: astore #65
/*     */     //   3909: new androidx/compose/ui/window/PopupProperties
/*     */     //   3912: dup
/*     */     //   3913: iconst_0
/*     */     //   3914: iconst_0
/*     */     //   3915: iconst_0
/*     */     //   3916: iconst_0
/*     */     //   3917: bipush #14
/*     */     //   3919: aconst_null
/*     */     //   3920: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   3923: astore #56
/*     */     //   3925: aload #51
/*     */     //   3927: ldc_w -957015330
/*     */     //   3930: invokeinterface startReplaceGroup : (I)V
/*     */     //   3935: aload #51
/*     */     //   3937: astore #58
/*     */     //   3939: iload #18
/*     */     //   3941: bipush #112
/*     */     //   3943: iand
/*     */     //   3944: bipush #32
/*     */     //   3946: if_icmpne -> 3953
/*     */     //   3949: iconst_1
/*     */     //   3950: goto -> 3954
/*     */     //   3953: iconst_0
/*     */     //   3954: istore #59
/*     */     //   3956: nop
/*     */     //   3957: iconst_0
/*     */     //   3958: istore #60
/*     */     //   3960: aload #58
/*     */     //   3962: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3967: astore #63
/*     */     //   3969: iconst_0
/*     */     //   3970: istore #70
/*     */     //   3972: iload #59
/*     */     //   3974: ifne -> 3988
/*     */     //   3977: aload #63
/*     */     //   3979: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3982: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3985: if_acmpne -> 4018
/*     */     //   3988: iconst_0
/*     */     //   3989: istore #71
/*     */     //   3991: aload #20
/*     */     //   3993: aload #11
/*     */     //   3995: aload #19
/*     */     //   3997: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   4002: astore #72
/*     */     //   4004: aload #58
/*     */     //   4006: aload #72
/*     */     //   4008: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   4013: aload #72
/*     */     //   4015: goto -> 4020
/*     */     //   4018: aload #63
/*     */     //   4020: nop
/*     */     //   4021: nop
/*     */     //   4022: nop
/*     */     //   4023: checkcast kotlin/jvm/functions/Function0
/*     */     //   4026: astore #57
/*     */     //   4028: aload #51
/*     */     //   4030: invokeinterface endReplaceGroup : ()V
/*     */     //   4035: aload #57
/*     */     //   4037: aload #65
/*     */     //   4039: aload #54
/*     */     //   4041: aconst_null
/*     */     //   4042: aload #56
/*     */     //   4044: aload #12
/*     */     //   4046: aload #51
/*     */     //   4048: sipush #24624
/*     */     //   4051: ldc_w 458752
/*     */     //   4054: iload #18
/*     */     //   4056: bipush #9
/*     */     //   4058: ishl
/*     */     //   4059: iand
/*     */     //   4060: ior
/*     */     //   4061: bipush #8
/*     */     //   4063: invokestatic PopupContainer : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   4066: aload #51
/*     */     //   4068: invokeinterface endReplaceGroup : ()V
/*     */     //   4073: nop
/*     */     //   4074: aload #48
/*     */     //   4076: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4079: aload #13
/*     */     //   4081: invokeinterface endNode : ()V
/*     */     //   4086: aload #13
/*     */     //   4088: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4091: nop
/*     */     //   4092: aload #13
/*     */     //   4094: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4097: nop
/*     */     //   4098: aload #13
/*     */     //   4100: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   4103: nop
/*     */     //   4104: invokestatic isTraceInProgress : ()Z
/*     */     //   4107: ifeq -> 4123
/*     */     //   4110: invokestatic traceEventEnd : ()V
/*     */     //   4113: goto -> 4123
/*     */     //   4116: aload #13
/*     */     //   4118: invokeinterface skipToGroupEnd : ()V
/*     */     //   4123: aload #13
/*     */     //   4125: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   4130: dup
/*     */     //   4131: ifnull -> 4175
/*     */     //   4134: aload_0
/*     */     //   4135: aload_1
/*     */     //   4136: aload_2
/*     */     //   4137: iload_3
/*     */     //   4138: aload #4
/*     */     //   4140: fload #5
/*     */     //   4142: aload #6
/*     */     //   4144: aload #7
/*     */     //   4146: aload #8
/*     */     //   4148: aload #9
/*     */     //   4150: aload #10
/*     */     //   4152: aload #11
/*     */     //   4154: aload #12
/*     */     //   4156: iload #14
/*     */     //   4158: iload #15
/*     */     //   4160: iload #16
/*     */     //   4162: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   4167: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   4172: goto -> 4176
/*     */     //   4175: pop
/*     */     //   4176: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #77	-> 13
/*     */     //   #65	-> 736
/*     */     //   #66	-> 750
/*     */     //   #67	-> 765
/*     */     //   #68	-> 775
/*     */     //   #69	-> 788
/*     */     //   #70	-> 804
/*     */     //   #234	-> 823
/*     */     //   #235	-> 835
/*     */     //   #236	-> 846
/*     */     //   #70	-> 849
/*     */     //   #236	-> 852
/*     */     //   #237	-> 854
/*     */     //   #238	-> 863
/*     */     //   #239	-> 868
/*     */     //   #235	-> 870
/*     */     //   #234	-> 871
/*     */     //   #234	-> 872
/*     */     //   #70	-> 873
/*     */     //   #71	-> 898
/*     */     //   #72	-> 926
/*     */     //   #73	-> 954
/*     */     //   #240	-> 973
/*     */     //   #241	-> 985
/*     */     //   #242	-> 996
/*     */     //   #242	-> 1004
/*     */     //   #243	-> 1006
/*     */     //   #244	-> 1015
/*     */     //   #245	-> 1020
/*     */     //   #241	-> 1022
/*     */     //   #240	-> 1023
/*     */     //   #240	-> 1024
/*     */     //   #73	-> 1025
/*     */     //   #74	-> 1050
/*     */     //   #246	-> 1069
/*     */     //   #247	-> 1081
/*     */     //   #248	-> 1092
/*     */     //   #248	-> 1100
/*     */     //   #249	-> 1102
/*     */     //   #250	-> 1111
/*     */     //   #251	-> 1116
/*     */     //   #247	-> 1118
/*     */     //   #246	-> 1119
/*     */     //   #246	-> 1120
/*     */     //   #74	-> 1121
/*     */     //   #75	-> 1146
/*     */     //   #252	-> 1165
/*     */     //   #253	-> 1177
/*     */     //   #254	-> 1188
/*     */     //   #254	-> 1196
/*     */     //   #255	-> 1198
/*     */     //   #256	-> 1207
/*     */     //   #257	-> 1212
/*     */     //   #253	-> 1214
/*     */     //   #252	-> 1215
/*     */     //   #252	-> 1216
/*     */     //   #75	-> 1217
/*     */     //   #77	-> 1296
/*     */     //   #78	-> 1315
/*     */     //   #258	-> 1319
/*     */     //   #259	-> 1331
/*     */     //   #260	-> 1342
/*     */     //   #78	-> 1345
/*     */     //   #260	-> 1355
/*     */     //   #261	-> 1357
/*     */     //   #262	-> 1366
/*     */     //   #263	-> 1371
/*     */     //   #259	-> 1373
/*     */     //   #258	-> 1374
/*     */     //   #258	-> 1375
/*     */     //   #78	-> 1376
/*     */     //   #79	-> 1408
/*     */     //   #264	-> 1412
/*     */     //   #265	-> 1424
/*     */     //   #266	-> 1435
/*     */     //   #79	-> 1438
/*     */     //   #266	-> 1448
/*     */     //   #267	-> 1450
/*     */     //   #268	-> 1459
/*     */     //   #269	-> 1464
/*     */     //   #265	-> 1466
/*     */     //   #264	-> 1467
/*     */     //   #264	-> 1468
/*     */     //   #79	-> 1469
/*     */     //   #86	-> 1501
/*     */     //   #270	-> 1505
/*     */     //   #271	-> 1517
/*     */     //   #272	-> 1528
/*     */     //   #86	-> 1531
/*     */     //   #272	-> 1554
/*     */     //   #273	-> 1556
/*     */     //   #274	-> 1565
/*     */     //   #275	-> 1570
/*     */     //   #271	-> 1572
/*     */     //   #270	-> 1573
/*     */     //   #270	-> 1574
/*     */     //   #86	-> 1575
/*     */     //   #87	-> 1607
/*     */     //   #276	-> 1611
/*     */     //   #277	-> 1623
/*     */     //   #278	-> 1634
/*     */     //   #87	-> 1637
/*     */     //   #278	-> 1644
/*     */     //   #279	-> 1646
/*     */     //   #280	-> 1655
/*     */     //   #281	-> 1660
/*     */     //   #277	-> 1662
/*     */     //   #276	-> 1663
/*     */     //   #276	-> 1664
/*     */     //   #87	-> 1665
/*     */     //   #89	-> 1713
/*     */     //   #282	-> 1717
/*     */     //   #283	-> 1729
/*     */     //   #284	-> 1745
/*     */     //   #89	-> 1748
/*     */     //   #284	-> 1772
/*     */     //   #285	-> 1774
/*     */     //   #286	-> 1783
/*     */     //   #287	-> 1788
/*     */     //   #283	-> 1790
/*     */     //   #282	-> 1791
/*     */     //   #282	-> 1792
/*     */     //   #91	-> 1801
/*     */     //   #288	-> 1838
/*     */     //   #289	-> 1850
/*     */     //   #290	-> 1866
/*     */     //   #91	-> 1871
/*     */     //   #290	-> 1889
/*     */     //   #291	-> 1891
/*     */     //   #292	-> 1900
/*     */     //   #293	-> 1905
/*     */     //   #289	-> 1907
/*     */     //   #288	-> 1908
/*     */     //   #288	-> 1909
/*     */     //   #91	-> 1910
/*     */     //   #103	-> 1937
/*     */     //   #104	-> 1950
/*     */     //   #105	-> 1985
/*     */     //   #294	-> 1989
/*     */     //   #295	-> 2001
/*     */     //   #296	-> 2012
/*     */     //   #105	-> 2015
/*     */     //   #296	-> 2030
/*     */     //   #297	-> 2032
/*     */     //   #298	-> 2041
/*     */     //   #299	-> 2046
/*     */     //   #295	-> 2048
/*     */     //   #294	-> 2049
/*     */     //   #294	-> 2050
/*     */     //   #105	-> 2051
/*     */     //   #106	-> 2067
/*     */     //   #300	-> 2089
/*     */     //   #106	-> 2110
/*     */     //   #110	-> 2135
/*     */     //   #111	-> 2136
/*     */     //   #112	-> 2172
/*     */     //   #301	-> 2176
/*     */     //   #302	-> 2188
/*     */     //   #303	-> 2204
/*     */     //   #112	-> 2209
/*     */     //   #303	-> 2223
/*     */     //   #304	-> 2225
/*     */     //   #305	-> 2234
/*     */     //   #306	-> 2239
/*     */     //   #302	-> 2241
/*     */     //   #301	-> 2242
/*     */     //   #301	-> 2243
/*     */     //   #112	-> 2244
/*     */     //   #118	-> 2263
/*     */     //   #307	-> 2267
/*     */     //   #119	-> 2278
/*     */     //   #120	-> 2303
/*     */     //   #308	-> 2307
/*     */     //   #309	-> 2319
/*     */     //   #310	-> 2330
/*     */     //   #120	-> 2335
/*     */     //   #310	-> 2345
/*     */     //   #311	-> 2347
/*     */     //   #312	-> 2356
/*     */     //   #313	-> 2361
/*     */     //   #309	-> 2363
/*     */     //   #308	-> 2364
/*     */     //   #308	-> 2365
/*     */     //   #120	-> 2366
/*     */     //   #121	-> 2383
/*     */     //   #314	-> 2419
/*     */     //   #315	-> 2431
/*     */     //   #316	-> 2447
/*     */     //   #121	-> 2454
/*     */     //   #316	-> 2479
/*     */     //   #317	-> 2481
/*     */     //   #318	-> 2490
/*     */     //   #319	-> 2495
/*     */     //   #315	-> 2497
/*     */     //   #314	-> 2498
/*     */     //   #314	-> 2499
/*     */     //   #121	-> 2500
/*     */     //   #130	-> 2517
/*     */     //   #320	-> 2538
/*     */     //   #321	-> 2550
/*     */     //   #322	-> 2561
/*     */     //   #322	-> 2581
/*     */     //   #323	-> 2583
/*     */     //   #324	-> 2592
/*     */     //   #325	-> 2597
/*     */     //   #321	-> 2599
/*     */     //   #320	-> 2600
/*     */     //   #320	-> 2601
/*     */     //   #130	-> 2602
/*     */     //   #131	-> 2682
/*     */     //   #326	-> 2686
/*     */     //   #327	-> 2698
/*     */     //   #328	-> 2714
/*     */     //   #131	-> 2719
/*     */     //   #328	-> 2740
/*     */     //   #329	-> 2742
/*     */     //   #330	-> 2751
/*     */     //   #331	-> 2756
/*     */     //   #327	-> 2758
/*     */     //   #326	-> 2759
/*     */     //   #326	-> 2760
/*     */     //   #131	-> 2761
/*     */     //   #149	-> 2778
/*     */     //   #307	-> 2779
/*     */     //   #118	-> 2784
/*     */     //   #151	-> 2795
/*     */     //   #152	-> 2834
/*     */     //   #332	-> 2852
/*     */     //   #153	-> 2864
/*     */     //   #155	-> 2894
/*     */     //   #156	-> 2897
/*     */     //   #157	-> 2905
/*     */     //   #158	-> 2910
/*     */     //   #154	-> 2915
/*     */     //   #159	-> 2922
/*     */     //   #332	-> 2923
/*     */     //   #152	-> 2928
/*     */     //   #162	-> 2939
/*     */     //   #163	-> 2947
/*     */     //   #164	-> 2949
/*     */     //   #165	-> 2954
/*     */     //   #161	-> 2975
/*     */     //   #167	-> 2978
/*     */     //   #168	-> 2995
/*     */     //   #169	-> 3034
/*     */     //   #333	-> 3038
/*     */     //   #334	-> 3050
/*     */     //   #335	-> 3066
/*     */     //   #169	-> 3071
/*     */     //   #335	-> 3083
/*     */     //   #336	-> 3085
/*     */     //   #337	-> 3094
/*     */     //   #338	-> 3099
/*     */     //   #334	-> 3101
/*     */     //   #333	-> 3102
/*     */     //   #333	-> 3103
/*     */     //   #169	-> 3104
/*     */     //   #170	-> 3123
/*     */     //   #108	-> 3135
/*     */     //   #339	-> 3147
/*     */     //   #340	-> 3150
/*     */     //   #343	-> 3153
/*     */     //   #344	-> 3171
/*     */     //   #345	-> 3183
/*     */     //   #346	-> 3189
/*     */     //   #347	-> 3196
/*     */     //   #348	-> 3205
/*     */     //   #350	-> 3212
/*     */     //   #349	-> 3234
/*     */     //   #351	-> 3246
/*     */     //   #352	-> 3249
/*     */     //   #353	-> 3267
/*     */     //   #354	-> 3272
/*     */     //   #355	-> 3284
/*     */     //   #357	-> 3296
/*     */     //   #359	-> 3301
/*     */     //   #360	-> 3311
/*     */     //   #361	-> 3324
/*     */     //   #363	-> 3337
/*     */     //   #364	-> 3348
/*     */     //   #365	-> 3355
/*     */     //   #366	-> 3383
/*     */     //   #367	-> 3395
/*     */     //   #369	-> 3409
/*     */     //   #364	-> 3410
/*     */     //   #369	-> 3411
/*     */     //   #370	-> 3412
/*     */     //   #371	-> 3425
/*     */     //   #359	-> 3426
/*     */     //   #372	-> 3427
/*     */     //   #373	-> 3452
/*     */     //   #172	-> 3483
/*     */     //   #194	-> 3558
/*     */     //   #196	-> 3576
/*     */     //   #197	-> 3590
/*     */     //   #199	-> 3609
/*     */     //   #196	-> 3611
/*     */     //   #195	-> 3622
/*     */     //   #209	-> 3624
/*     */     //   #210	-> 3625
/*     */     //   #211	-> 3631
/*     */     //   #374	-> 3652
/*     */     //   #375	-> 3664
/*     */     //   #376	-> 3675
/*     */     //   #376	-> 3695
/*     */     //   #377	-> 3697
/*     */     //   #378	-> 3706
/*     */     //   #379	-> 3711
/*     */     //   #375	-> 3713
/*     */     //   #374	-> 3714
/*     */     //   #374	-> 3715
/*     */     //   #211	-> 3716
/*     */     //   #212	-> 3735
/*     */     //   #213	-> 3743
/*     */     //   #214	-> 3751
/*     */     //   #380	-> 3790
/*     */     //   #381	-> 3802
/*     */     //   #382	-> 3818
/*     */     //   #214	-> 3833
/*     */     //   #382	-> 3858
/*     */     //   #383	-> 3860
/*     */     //   #384	-> 3869
/*     */     //   #385	-> 3874
/*     */     //   #381	-> 3876
/*     */     //   #380	-> 3877
/*     */     //   #380	-> 3878
/*     */     //   #214	-> 3879
/*     */     //   #215	-> 3901
/*     */     //   #216	-> 3909
/*     */     //   #203	-> 3956
/*     */     //   #386	-> 3960
/*     */     //   #387	-> 3972
/*     */     //   #388	-> 3988
/*     */     //   #203	-> 3991
/*     */     //   #388	-> 4002
/*     */     //   #389	-> 4004
/*     */     //   #390	-> 4013
/*     */     //   #391	-> 4018
/*     */     //   #387	-> 4020
/*     */     //   #386	-> 4021
/*     */     //   #386	-> 4022
/*     */     //   #203	-> 4023
/*     */     //   #215	-> 4037
/*     */     //   #214	-> 4039
/*     */     //   #216	-> 4042
/*     */     //   #217	-> 4044
/*     */     //   #202	-> 4063
/*     */     //   #220	-> 4073
/*     */     //   #373	-> 4074
/*     */     //   #372	-> 4079
/*     */     //   #392	-> 4081
/*     */     //   #351	-> 4088
/*     */     //   #393	-> 4091
/*     */     //   #345	-> 4094
/*     */     //   #394	-> 4097
/*     */     //   #339	-> 4100
/*     */     //   #395	-> 4103
/*     */     //   #221	-> 4116
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   849	3	25	$i$a$-cache-ComboBoxKt$ComboBox$1	I
/*     */     //   854	11	25	value$iv	Ljava/lang/Object;
/*     */     //   835	36	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   832	39	23	it$iv	Ljava/lang/Object;
/*     */     //   823	50	22	$i$f$cache	I
/*     */     //   820	53	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   820	53	21	invalid$iv	Z
/*     */     //   999	5	25	$i$a$-cache-ComboBoxKt$ComboBox$2	I
/*     */     //   1006	11	25	value$iv	Ljava/lang/Object;
/*     */     //   985	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   982	41	23	it$iv	Ljava/lang/Object;
/*     */     //   973	52	22	$i$f$cache	I
/*     */     //   970	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   970	55	21	invalid$iv	Z
/*     */     //   1095	5	25	$i$a$-cache-ComboBoxKt$ComboBox$3	I
/*     */     //   1102	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1081	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1078	41	23	it$iv	Ljava/lang/Object;
/*     */     //   1069	52	22	$i$f$cache	I
/*     */     //   1066	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1066	55	21	invalid$iv	Z
/*     */     //   1191	5	25	$i$a$-cache-ComboBoxKt$ComboBox$4	I
/*     */     //   1198	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1177	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1174	41	23	it$iv	Ljava/lang/Object;
/*     */     //   1165	52	22	$i$f$cache	I
/*     */     //   1162	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1162	55	21	invalid$iv	Z
/*     */     //   1345	10	26	$i$a$-cache-ComboBoxKt$ComboBox$popupExpanded$2	I
/*     */     //   1357	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1331	43	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1328	46	24	it$iv	Ljava/lang/Object;
/*     */     //   1319	57	23	$i$f$cache	I
/*     */     //   1316	60	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1316	60	22	invalid$iv	Z
/*     */     //   1438	10	27	$i$a$-cache-ComboBoxKt$ComboBox$chevronHovered$2	I
/*     */     //   1450	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1424	43	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1421	46	25	it$iv	Ljava/lang/Object;
/*     */     //   1412	57	24	$i$f$cache	I
/*     */     //   1409	60	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1409	60	23	invalid$iv	Z
/*     */     //   1531	23	28	$i$a$-cache-ComboBoxKt$ComboBox$comboBoxState$2	I
/*     */     //   1556	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1517	56	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1514	59	26	it$iv	Ljava/lang/Object;
/*     */     //   1505	70	25	$i$f$cache	I
/*     */     //   1502	73	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1502	73	24	invalid$iv	Z
/*     */     //   1637	7	29	$i$a$-cache-ComboBoxKt$ComboBox$comboBoxFocusRequester$1	I
/*     */     //   1646	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1623	40	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1620	43	27	it$iv	Ljava/lang/Object;
/*     */     //   1611	54	26	$i$f$cache	I
/*     */     //   1608	57	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1608	57	25	invalid$iv	Z
/*     */     //   1748	21	28	$i$a$-cache-ComboBoxKt$ComboBox$5	I
/*     */     //   1774	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1729	62	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1726	65	26	it$iv	Ljava/lang/Object;
/*     */     //   1717	76	25	$i$f$cache	I
/*     */     //   1714	79	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1714	79	24	invalid$iv	Z
/*     */     //   1871	15	29	$i$a$-cache-ComboBoxKt$ComboBox$6	I
/*     */     //   1891	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1850	58	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1847	61	27	it$iv	Ljava/lang/Object;
/*     */     //   1838	72	26	$i$f$cache	I
/*     */     //   1835	75	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1835	75	25	invalid$iv	Z
/*     */     //   2015	15	32	$i$a$-cache-ComboBoxKt$ComboBox$comboBoxWidth$2	I
/*     */     //   2032	11	32	value$iv	Ljava/lang/Object;
/*     */     //   2001	48	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1998	51	30	it$iv	Ljava/lang/Object;
/*     */     //   1989	62	29	$i$f$cache	I
/*     */     //   1986	65	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1986	65	28	invalid$iv	Z
/*     */     //   2081	29	29	$i$f$getCurrent	I
/*     */     //   2078	32	27	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   2078	32	28	$changed$iv	I
/*     */     //   2209	11	35	$i$a$-cache-ComboBoxKt$ComboBox$7	I
/*     */     //   2225	11	36	value$iv	Ljava/lang/Object;
/*     */     //   2188	54	34	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2185	57	33	it$iv	Ljava/lang/Object;
/*     */     //   2176	68	32	$i$f$cache	I
/*     */     //   2173	71	30	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2173	71	31	invalid$iv	Z
/*     */     //   2335	7	39	$i$a$-cache-ComboBoxKt$ComboBox$8$1	I
/*     */     //   2347	11	40	value$iv	Ljava/lang/Object;
/*     */     //   2319	45	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2316	48	36	it$iv	Ljava/lang/Object;
/*     */     //   2307	59	35	$i$f$cache	I
/*     */     //   2304	62	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2304	62	34	invalid$iv	Z
/*     */     //   2454	17	39	$i$a$-cache-ComboBoxKt$ComboBox$8$2	I
/*     */     //   2481	11	40	value$iv	Ljava/lang/Object;
/*     */     //   2431	67	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2428	70	36	it$iv	Ljava/lang/Object;
/*     */     //   2419	81	35	$i$f$cache	I
/*     */     //   2416	84	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2416	84	34	invalid$iv	Z
/*     */     //   2568	5	39	$i$a$-cache-ComboBoxKt$ComboBox$8$3	I
/*     */     //   2583	11	39	value$iv	Ljava/lang/Object;
/*     */     //   2550	50	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2547	53	36	it$iv	Ljava/lang/Object;
/*     */     //   2538	64	35	$i$f$cache	I
/*     */     //   2535	67	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2535	67	34	invalid$iv	Z
/*     */     //   2719	18	39	$i$a$-cache-ComboBoxKt$ComboBox$8$4	I
/*     */     //   2742	11	40	value$iv	Ljava/lang/Object;
/*     */     //   2698	61	37	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2695	64	36	it$iv	Ljava/lang/Object;
/*     */     //   2686	75	35	$i$f$cache	I
/*     */     //   2683	78	33	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2683	78	34	invalid$iv	Z
/*     */     //   2278	501	32	$i$a$-thenIf-ComboBoxKt$ComboBox$8	I
/*     */     //   2275	504	31	$this$ComboBox_xYaah8o_u24lambda_u2431	Landroidx/compose/ui/Modifier;
/*     */     //   2267	517	30	$i$f$thenIf	I
/*     */     //   2264	520	29	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2864	59	32	$i$a$-thenIf-ComboBoxKt$ComboBox$9	I
/*     */     //   2861	62	31	$this$ComboBox_xYaah8o_u24lambda_u2432	Landroidx/compose/ui/Modifier;
/*     */     //   2852	76	30	$i$f$thenIf	I
/*     */     //   2849	79	28	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2849	79	29	precondition$iv	Z
/*     */     //   3071	9	33	$i$a$-cache-ComboBoxKt$ComboBox$10	I
/*     */     //   3085	11	34	value$iv	Ljava/lang/Object;
/*     */     //   3050	52	32	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3047	55	31	it$iv	Ljava/lang/Object;
/*     */     //   3038	66	30	$i$f$cache	I
/*     */     //   3035	69	28	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3035	69	29	invalid$iv	Z
/*     */     //   3682	5	63	$i$a$-cache-ComboBoxKt$ComboBox$11$2	I
/*     */     //   3697	11	63	value$iv	Ljava/lang/Object;
/*     */     //   3664	50	60	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3661	53	59	it$iv	Ljava/lang/Object;
/*     */     //   3652	64	58	$i$f$cache	I
/*     */     //   3649	67	56	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3649	67	57	invalid$iv	Z
/*     */     //   3833	9	63	$i$a$-cache-ComboBoxKt$ComboBox$11$3	I
/*     */     //   3860	11	70	value$iv	Ljava/lang/Object;
/*     */     //   3802	75	60	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3799	78	59	it$iv	Ljava/lang/Object;
/*     */     //   3790	89	58	$i$f$cache	I
/*     */     //   3787	92	56	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3787	92	57	invalid$iv	Z
/*     */     //   3991	11	71	$i$a$-cache-ComboBoxKt$ComboBox$11$4	I
/*     */     //   4004	11	72	value$iv	Ljava/lang/Object;
/*     */     //   3972	49	70	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3969	52	63	it$iv	Ljava/lang/Object;
/*     */     //   3960	63	60	$i$f$cache	I
/*     */     //   3957	66	58	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3957	66	59	invalid$iv	Z
/*     */     //   3624	442	55	maxHeight	F
/*     */     //   3483	591	53	$i$a$-Box-ComboBoxKt$ComboBox$11	I
/*     */     //   3480	594	52	$this$ComboBox_xYaah8o_u24lambda_u2442	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   3480	594	51	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3480	594	50	$changed	I
/*     */     //   3444	635	49	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   3441	638	48	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3441	638	47	$changed$iv	I
/*     */     //   3355	55	46	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3352	58	45	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3348	64	44	$i$f$set-impl	I
/*     */     //   3345	67	43	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3311	115	42	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3308	118	41	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3238	854	40	$i$f$ReusableComposeNode	I
/*     */     //   3235	857	38	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   3235	857	39	$changed$iv$iv$iv	I
/*     */     //   3175	923	34	$i$f$Layout	I
/*     */     //   3194	904	35	compositeKeyHash$iv$iv	I
/*     */     //   3203	895	36	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   3212	886	37	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3172	926	33	$changed$iv$iv	I
/*     */     //   3139	965	31	$i$f$Box	I
/*     */     //   3162	942	32	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   3136	968	27	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   3136	968	28	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   3153	951	29	propagateMinConstraints$iv	Z
/*     */     //   3136	968	30	$changed$iv	I
/*     */     //   1392	2721	19	popupExpanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1485	2628	20	chevronHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1591	2522	21	comboBoxState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1681	2432	22	comboBoxFocusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   1950	2163	23	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1968	2145	24	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   2067	2046	25	comboBoxWidth$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   2115	1998	26	density	Landroidx/compose/ui/unit/Density;
/*     */     //   28	4149	17	$dirty	I
/*     */     //   32	4145	18	$dirty1	I
/*     */     //   0	4177	0	labelText	Ljava/lang/String;
/*     */     //   0	4177	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	4177	2	menuModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	4177	3	isEnabled	Z
/*     */     //   0	4177	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	4177	5	maxPopupHeight	F
/*     */     //   0	4177	6	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	4177	7	style	Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   0	4177	8	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	4177	9	onArrowDownPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	4177	10	onArrowUpPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	4177	11	onPopupStateChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	4177	12	popupContent	Lkotlin/jvm/functions/Function2;
/*     */     //   0	4177	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	4177	14	$changed	I
/*     */     //   0	4177	15	$changed1	I }
/*  78 */   private static final boolean ComboBox_xYaah8o$lambda$8(MutableState $popupExpanded$delegate) { State state = (State)$popupExpanded$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 435 */       (Boolean)state.getValue()).booleanValue(); } private static final void ComboBox_xYaah8o$lambda$9(MutableState $popupExpanded$delegate, boolean <set-?>) { MutableState mutableState = $popupExpanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 436 */     mutableState.setValue(value$iv); } private static final boolean ComboBox_xYaah8o$lambda$11(MutableState $chevronHovered$delegate) { State state = (State)$chevronHovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 438 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void ComboBox_xYaah8o$lambda$12(MutableState $chevronHovered$delegate, boolean <set-?>) { MutableState mutableState = $chevronHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 439 */     mutableState.setValue(value$iv); } private static final void ComboBox_xYaah8o$setPopupExpanded(Function1 $onPopupStateChange, MutableState<Boolean> popupExpanded$delegate, boolean expanded) { ComboBox_xYaah8o$lambda$9(popupExpanded$delegate, expanded); $onPopupStateChange.invoke(Boolean.valueOf(expanded)); }
/*     */   private static final long ComboBox_xYaah8o$lambda$14(MutableState $comboBoxState$delegate) { State state = (State)$comboBoxState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 441 */     return ((ComboBoxState)state.getValue()).unbox-impl(); } private static final void ComboBox_xYaah8o$lambda$15(MutableState $comboBoxState$delegate, long <set-?>) { MutableState mutableState = $comboBoxState$delegate; Object object1 = null, object2 = null; Object value$iv = ComboBoxState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 442 */     mutableState.setValue(value$iv); } private static final long ComboBox_xYaah8o$lambda$19(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 444 */     return ((Color)state.getValue()).unbox-impl(); } @DebugMetadata(f = "ComboBox.kt", l = {92}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ComboBoxKt$ComboBox$6$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ComboBoxKt$ComboBox$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 445 */     int label; ComboBoxKt$ComboBox$6$1(MutableInteractionSource $interactionSource, MutableState<ComboBoxState> $comboBoxState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { ComboBoxKt.ComboBox_xYaah8o$lambda$15(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBoxKt.ComboBox_xYaah8o$lambda$14(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ComboBoxKt$ComboBox$6$1> $completion) { return (Continuation<Unit>)new ComboBoxKt$ComboBox$6$1(this.$interactionSource, this.$comboBoxState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((ComboBoxKt$ComboBox$6$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final float ComboBox_xYaah8o$lambda$21(MutableState $comboBoxWidth$delegate) { State state = (State)$comboBoxWidth$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Dp)state.getValue()).unbox-impl(); } private static final void ComboBox_xYaah8o$lambda$22(MutableState $comboBoxWidth$delegate, float <set-?>) { MutableState mutableState = $comboBoxWidth$delegate; Object object1 = null, object2 = null; Object value$iv = Dp.box-impl(<set-?>); int $i$f$setValue = 0;
/* 446 */     mutableState.setValue(value$iv); } private static final Unit ComboBox_xYaah8o$lambda$24$lambda$23(MutableState<ComboBoxState> $comboBoxState$delegate, Function1<? super Boolean, Unit> $onPopupStateChange, MutableState<Boolean> $popupExpanded$delegate, FocusState focusState) { Intrinsics.checkNotNullParameter(focusState, "focusState"); ComboBox_xYaah8o$lambda$15($comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(ComboBox_xYaah8o$lambda$14($comboBoxState$delegate), false, focusState.isFocused(), false, false, false, 29, null)); if (!focusState.isFocused()) ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false);  return Unit.INSTANCE; }
/*     */   private static final Unit ComboBox_xYaah8o$lambda$31$lambda$26$lambda$25(MutableState<Boolean> $chevronHovered$delegate, boolean it) { ComboBox_xYaah8o$lambda$12($chevronHovered$delegate, it); return Unit.INSTANCE; }
/* 448 */   private static final Unit ComboBox_xYaah8o$lambda$35$lambda$34(Density $density, MutableState<Dp> $comboBoxWidth$delegate, IntSize it) { Density density = $density; MutableState<Dp> mutableState = $comboBoxWidth$delegate; int $i$a$-with-ComboBoxKt$ComboBox$10$1$1 = 0;
/*     */     float f = density.toDp-u2uoSUM(IntSize.getWidth-impl(it.unbox-impl()));
/*     */     ComboBox_xYaah8o$lambda$22(mutableState, f);
/*     */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "ComboBox.kt", l = {122}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ComboBoxKt$ComboBox$8$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */   static final class ComboBoxKt$ComboBox$8$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     ComboBoxKt$ComboBox$8$2$1(FocusRequester $comboBoxFocusRequester, MutableState<Boolean> $popupExpanded$delegate, Function1<Boolean, Unit> $onPopupStateChange, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 104, 0 -> 32, 1 -> 94
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast androidx/compose/ui/input/pointer/PointerInputScope
/*     */       //   43: astore_2
/*     */       //   44: aload_2
/*     */       //   45: aload_0
/*     */       //   46: getfield $comboBoxFocusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */       //   49: aload_0
/*     */       //   50: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   53: aload_0
/*     */       //   54: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */       //   57: <illegal opcode> invoke : (Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */       //   62: aload_0
/*     */       //   63: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */       //   66: aload_0
/*     */       //   67: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   70: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */       //   75: aload_0
/*     */       //   76: checkcast kotlin/coroutines/Continuation
/*     */       //   79: aload_0
/*     */       //   80: iconst_1
/*     */       //   81: putfield label : I
/*     */       //   84: invokestatic detectPressAndCancel : (Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   87: dup
/*     */       //   88: aload_3
/*     */       //   89: if_acmpne -> 99
/*     */       //   92: aload_3
/*     */       //   93: areturn
/*     */       //   94: aload_1
/*     */       //   95: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   98: aload_1
/*     */       //   99: pop
/*     */       //   100: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   103: areturn
/*     */       //   104: new java/lang/IllegalStateException
/*     */       //   107: dup
/*     */       //   108: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   110: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   113: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #121	-> 3
/*     */       //   #122	-> 44
/*     */       //   #121	-> 92
/*     */       //   #129	-> 99
/*     */       //   #121	-> 104
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	43	2	$this$pointerInput	Landroidx/compose/ui/input/pointer/PointerInputScope;
/*     */       //   0	114	0	this	Lorg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$8$2$1;
/*     */       //   36	68	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ComboBoxKt$ComboBox$8$2$1> $completion) {
/*     */       ComboBoxKt$ComboBox$8$2$1 comboBoxKt$ComboBox$8$2$1 = new ComboBoxKt$ComboBox$8$2$1(this.$comboBoxFocusRequester, this.$popupExpanded$delegate, this.$onPopupStateChange, $completion);
/*     */       comboBoxKt$ComboBox$8$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)comboBoxKt$ComboBox$8$2$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */       return ((ComboBoxKt$ComboBox$8$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(FocusRequester $comboBoxFocusRequester, MutableState $popupExpanded$delegate, Function1 $onPopupStateChange) {
/*     */       ComboBoxKt.ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, !ComboBoxKt.ComboBox_xYaah8o$lambda$8($popupExpanded$delegate));
/*     */       $comboBoxFocusRequester.requestFocus();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1(Function1 $onPopupStateChange, MutableState $popupExpanded$delegate) {
/*     */       ComboBoxKt.ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit ComboBox_xYaah8o$lambda$31$lambda$29$lambda$28(SemanticsPropertyReceiver $this$semantics) {
/*     */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics");
/*     */     SemanticsPropertiesKt.setRole-kuIjeqM($this$semantics, Role.Companion.getDropdownList-o7Vup1c());
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ComboBoxKt$ComboBox$8$4$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getSpacebar-EK5gGoQ()))
/*     */         ComboBoxKt.ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, !ComboBoxKt.ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate)); 
/*     */       if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionDown-EK5gGoQ()))
/*     */         if (ComboBoxKt.ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate)) {
/*     */           this.$onArrowDownPress.invoke();
/*     */         } else {
/*     */           ComboBoxKt.ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, true);
/*     */         }  
/*     */       if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionUp-EK5gGoQ()) && ComboBoxKt.ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate))
/*     */         this.$onArrowUpPress.invoke(); 
/*     */       if (KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()) && Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEscape-EK5gGoQ()) && ComboBoxKt.ComboBox_xYaah8o$lambda$8(this.$popupExpanded$delegate))
/*     */         ComboBoxKt.ComboBox_xYaah8o$setPopupExpanded(this.$onPopupStateChange, this.$popupExpanded$delegate, false); 
/*     */       return Boolean.valueOf(false);
/*     */     }
/*     */     
/*     */     ComboBoxKt$ComboBox$8$4$1(Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, MutableState<Boolean> $popupExpanded$delegate, Function1<Boolean, Unit> $onPopupStateChange) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$11$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,233:1\n1225#2,6:234\n99#3:240\n96#3,6:241\n102#3:275\n106#3:279\n79#4,6:247\n86#4,4:262\n90#4,2:272\n94#4:278\n368#5,9:253\n377#5:274\n378#5,2:276\n4034#6,6:266\n*S KotlinDebug\n*F\n+ 1 ComboBox.kt\norg/jetbrains/jewel/ui/component/ComboBoxKt$ComboBox$11$1\n*L\n175#1:234,6\n173#1:240\n173#1:241,6\n173#1:275\n173#1:279\n173#1:247,6\n173#1:262,4\n173#1:272,2\n173#1:278\n173#1:253,9\n173#1:274\n173#1:276,2\n173#1:266,6\n*E\n"})
/*     */   static final class ComboBoxKt$ComboBox$11$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(692284384, $changed, -1, "org.jetbrains.jewel.ui.component.ComboBox.<anonymous>.<anonymous> (ComboBox.kt:172)"); 
/*     */         Alignment.Vertical vertical = Alignment.Companion.getCenterVertically();
/*     */         $composer.startReplaceGroup(844785325);
/*     */         Composer composer1 = $composer;
/*     */         boolean invalid$iv = false;
/*     */         int $i$f$cache = 0;
/*     */         Object it$iv = composer1.rememberedValue();
/*     */         int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */         Modifier modifier3 = FocusableKt.focusable$default((Modifier)Modifier.Companion, false, null, 2, null);
/*     */         int $i$a$-cache-ComboBoxKt$ComboBox$11$1$1 = 0;
/*     */         Object value$iv = ComboBoxKt$ComboBox$11$1::invoke$lambda$1$lambda$0;
/*     */         composer1.updateRememberedValue(value$iv);
/*     */         Function1 function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : (Function1)it$iv;
/*     */         $composer.endReplaceGroup();
/*     */         Modifier modifier1 = FocusPropertiesKt.focusProperties(modifier3, function1);
/*     */         boolean bool1 = this.$isEnabled;
/*     */         ComboBoxStyle comboBoxStyle = this.$style;
/*     */         TextStyle textStyle1 = this.$textStyle;
/*     */         it$iv = this.$labelText;
/*     */         int $changed$iv = 384, $i$f$Row = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*     */         Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
/*     */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, vertical, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
/*     */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */         int $i$f$Layout = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */         int $i$f$ReusableComposeNode = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*     */           ComposablesKt.invalidApplier(); 
/*     */         $composer.startReusableNode();
/*     */         if ($composer.getInserting()) {
/*     */           $composer.createNode(function0);
/*     */         } else {
/*     */           $composer.useNode();
/*     */         } 
/*     */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */         int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */         int $i$f$set-impl = 0;
/*     */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */         int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */         Composer $composer$iv = $composer;
/*     */         int $i$a$-Layout-RowKt$Row$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -407840262, "C101@5126L9:Row.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer2 = $composer$iv;
/*     */         RowScope $this$invoke_u24lambda_u242 = (RowScope)RowScopeInstance.INSTANCE;
/*     */         int $i$a$-Row-ComboBoxKt$ComboBox$11$1$2 = 0;
/*     */         long textColor = bool1 ? Color.Companion.getUnspecified-0d7_KjU() : comboBoxStyle.getColors().getBorderDisabled-0d7_KjU();
/*     */         TextStyle textStyle2 = TextStyle.copy-p1EtxEg$default(textStyle1, textColor, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
/*     */         int k = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/*     */         Modifier modifier2 = PaddingKt.padding(RowScope.weight$default($this$invoke_u24lambda_u242, SizeKt.fillMaxWidth$default(TestTagKt.testTag((Modifier)Modifier.Companion, "Jewel.ComboBox.NonEditableText"), 0.0F, 1, null), 1.0F, false, 2, null), comboBoxStyle.getMetrics().getContentPadding());
/*     */         TextKt.Text-bAzTDeA((String)it$iv, modifier2, 0L, 0L, null, null, null, 0L, null, 0, 0L, k, false, 1, null, textStyle2, composer2, 0, 3120, 22524);
/*     */         ComboBoxKt.Chevron(comboBoxStyle, bool1, composer2, 0);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */         $composer.endNode();
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         ComposerKt.sourceInformationMarkerEnd($composer);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(FocusProperties $this$focusProperties) {
/*     */       Intrinsics.checkNotNullParameter($this$focusProperties, "$this$focusProperties");
/*     */       $this$focusProperties.setCanFocus(false);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     ComboBoxKt$ComboBox$11$1(boolean $isEnabled, ComboBoxStyle $style, TextStyle $textStyle, String $labelText) {}
/*     */   }
/*     */   
/*     */   private static final Unit ComboBox_xYaah8o$lambda$42$lambda$41$lambda$40(MutableState<Boolean> $chevronHovered$delegate, Function1<? super Boolean, Unit> $onPopupStateChange, MutableState<Boolean> $popupExpanded$delegate) {
/*     */     if (!ComboBox_xYaah8o$lambda$11($chevronHovered$delegate))
/*     */       ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ComboBox_xYaah8o$lambda$42$lambda$37$lambda$36(SemanticsPropertyReceiver $this$semantics) {
/*     */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics");
/*     */     SemanticsPropertiesKt.setContentDescription($this$semantics, "Jewel.ComboBox.PopupMenu");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ComboBox_xYaah8o$lambda$42$lambda$39$lambda$38(Function1<? super Boolean, Unit> $onPopupStateChange, MutableState<Boolean> $popupExpanded$delegate) {
/*     */     ComboBox_xYaah8o$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void Chevron(ComboBoxStyle style, boolean isEnabled, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w -779798608
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_2
/*     */     //   10: iload_3
/*     */     //   11: istore #4
/*     */     //   13: iload_3
/*     */     //   14: bipush #6
/*     */     //   16: iand
/*     */     //   17: ifne -> 40
/*     */     //   20: iload #4
/*     */     //   22: aload_2
/*     */     //   23: aload_0
/*     */     //   24: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 36
/*     */     //   32: iconst_4
/*     */     //   33: goto -> 37
/*     */     //   36: iconst_2
/*     */     //   37: ior
/*     */     //   38: istore #4
/*     */     //   40: iload_3
/*     */     //   41: bipush #48
/*     */     //   43: iand
/*     */     //   44: ifne -> 69
/*     */     //   47: iload #4
/*     */     //   49: aload_2
/*     */     //   50: iload_1
/*     */     //   51: invokeinterface changed : (Z)Z
/*     */     //   56: ifeq -> 64
/*     */     //   59: bipush #32
/*     */     //   61: goto -> 66
/*     */     //   64: bipush #16
/*     */     //   66: ior
/*     */     //   67: istore #4
/*     */     //   69: iload #4
/*     */     //   71: bipush #19
/*     */     //   73: iand
/*     */     //   74: bipush #18
/*     */     //   76: if_icmpne -> 88
/*     */     //   79: aload_2
/*     */     //   80: invokeinterface getSkipping : ()Z
/*     */     //   85: ifne -> 563
/*     */     //   88: invokestatic isTraceInProgress : ()Z
/*     */     //   91: ifeq -> 106
/*     */     //   94: ldc_w -779798608
/*     */     //   97: iload #4
/*     */     //   99: iconst_m1
/*     */     //   100: ldc_w 'org.jetbrains.jewel.ui.component.Chevron (ComboBox.kt:223)'
/*     */     //   103: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   106: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   109: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   112: astore #5
/*     */     //   114: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   117: checkcast androidx/compose/ui/Modifier
/*     */     //   120: ldc_w 'Jewel.ComboBox.ChevronContainer'
/*     */     //   123: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   126: aload_0
/*     */     //   127: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   130: invokevirtual getArrowAreaSize-MYxV2XQ : ()J
/*     */     //   133: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   136: astore #6
/*     */     //   138: bipush #48
/*     */     //   140: istore #8
/*     */     //   142: nop
/*     */     //   143: iconst_0
/*     */     //   144: istore #9
/*     */     //   146: aload_2
/*     */     //   147: ldc_w 733328855
/*     */     //   150: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   153: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   156: iconst_0
/*     */     //   157: istore #7
/*     */     //   159: aload #5
/*     */     //   161: iload #7
/*     */     //   163: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   166: astore #10
/*     */     //   168: bipush #112
/*     */     //   170: iload #8
/*     */     //   172: iconst_3
/*     */     //   173: ishl
/*     */     //   174: iand
/*     */     //   175: istore #11
/*     */     //   177: nop
/*     */     //   178: iconst_0
/*     */     //   179: istore #12
/*     */     //   181: aload_2
/*     */     //   182: ldc_w -1323940314
/*     */     //   185: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   188: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   191: aload_2
/*     */     //   192: iconst_0
/*     */     //   193: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   196: istore #13
/*     */     //   198: aload_2
/*     */     //   199: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   204: astore #14
/*     */     //   206: aload_2
/*     */     //   207: aload #6
/*     */     //   209: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   212: astore #15
/*     */     //   214: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   217: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   220: astore #16
/*     */     //   222: bipush #6
/*     */     //   224: sipush #896
/*     */     //   227: iload #11
/*     */     //   229: bipush #6
/*     */     //   231: ishl
/*     */     //   232: iand
/*     */     //   233: ior
/*     */     //   234: istore #17
/*     */     //   236: nop
/*     */     //   237: iconst_0
/*     */     //   238: istore #18
/*     */     //   240: aload_2
/*     */     //   241: ldc_w -692256719
/*     */     //   244: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   247: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   250: aload_2
/*     */     //   251: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   256: instanceof androidx/compose/runtime/Applier
/*     */     //   259: ifne -> 265
/*     */     //   262: invokestatic invalidApplier : ()V
/*     */     //   265: aload_2
/*     */     //   266: invokeinterface startReusableNode : ()V
/*     */     //   271: aload_2
/*     */     //   272: invokeinterface getInserting : ()Z
/*     */     //   277: ifeq -> 291
/*     */     //   280: aload_2
/*     */     //   281: aload #16
/*     */     //   283: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   288: goto -> 297
/*     */     //   291: aload_2
/*     */     //   292: invokeinterface useNode : ()V
/*     */     //   297: aload_2
/*     */     //   298: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   301: astore #19
/*     */     //   303: iconst_0
/*     */     //   304: istore #20
/*     */     //   306: aload #19
/*     */     //   308: aload #10
/*     */     //   310: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   313: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   316: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   319: aload #19
/*     */     //   321: aload #14
/*     */     //   323: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   326: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   332: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   335: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   338: astore #21
/*     */     //   340: iconst_0
/*     */     //   341: istore #22
/*     */     //   343: aload #19
/*     */     //   345: astore #23
/*     */     //   347: iconst_0
/*     */     //   348: istore #24
/*     */     //   350: aload #23
/*     */     //   352: invokeinterface getInserting : ()Z
/*     */     //   357: ifne -> 378
/*     */     //   360: aload #23
/*     */     //   362: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   367: iload #13
/*     */     //   369: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   372: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   375: ifne -> 404
/*     */     //   378: aload #23
/*     */     //   380: iload #13
/*     */     //   382: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   385: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   390: aload #19
/*     */     //   392: iload #13
/*     */     //   394: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   397: aload #21
/*     */     //   399: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   404: nop
/*     */     //   405: nop
/*     */     //   406: nop
/*     */     //   407: aload #19
/*     */     //   409: aload #15
/*     */     //   411: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   414: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   417: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   420: nop
/*     */     //   421: nop
/*     */     //   422: aload_2
/*     */     //   423: bipush #14
/*     */     //   425: iload #17
/*     */     //   427: bipush #6
/*     */     //   429: ishr
/*     */     //   430: iand
/*     */     //   431: istore #25
/*     */     //   433: astore #26
/*     */     //   435: iconst_0
/*     */     //   436: istore #27
/*     */     //   438: aload #26
/*     */     //   440: ldc_w -2146769399
/*     */     //   443: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   446: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   449: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   452: aload #26
/*     */     //   454: bipush #6
/*     */     //   456: bipush #112
/*     */     //   458: iload #8
/*     */     //   460: bipush #6
/*     */     //   462: ishr
/*     */     //   463: iand
/*     */     //   464: ior
/*     */     //   465: istore #28
/*     */     //   467: astore #29
/*     */     //   469: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   472: astore #30
/*     */     //   474: iconst_0
/*     */     //   475: istore #31
/*     */     //   477: iload_1
/*     */     //   478: ifeq -> 490
/*     */     //   481: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   484: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   487: goto -> 497
/*     */     //   490: aload_0
/*     */     //   491: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   494: invokevirtual getBorderDisabled-0d7_KjU : ()J
/*     */     //   497: lstore #32
/*     */     //   499: aload_0
/*     */     //   500: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxIcons;
/*     */     //   503: invokevirtual getChevronDown : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   506: aconst_null
/*     */     //   507: aconst_null
/*     */     //   508: aconst_null
/*     */     //   509: lload #32
/*     */     //   511: iconst_0
/*     */     //   512: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   515: aload #29
/*     */     //   517: bipush #48
/*     */     //   519: bipush #12
/*     */     //   521: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   524: nop
/*     */     //   525: aload #26
/*     */     //   527: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   530: aload_2
/*     */     //   531: invokeinterface endNode : ()V
/*     */     //   536: aload_2
/*     */     //   537: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   540: nop
/*     */     //   541: aload_2
/*     */     //   542: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   545: nop
/*     */     //   546: aload_2
/*     */     //   547: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   550: nop
/*     */     //   551: invokestatic isTraceInProgress : ()Z
/*     */     //   554: ifeq -> 569
/*     */     //   557: invokestatic traceEventEnd : ()V
/*     */     //   560: goto -> 569
/*     */     //   563: aload_2
/*     */     //   564: invokeinterface skipToGroupEnd : ()V
/*     */     //   569: aload_2
/*     */     //   570: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   575: dup
/*     */     //   576: ifnull -> 595
/*     */     //   579: aload_0
/*     */     //   580: iload_1
/*     */     //   581: iload_3
/*     */     //   582: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZI)Lkotlin/jvm/functions/Function2;
/*     */     //   587: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   592: goto -> 596
/*     */     //   595: pop
/*     */     //   596: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 0
/*     */     //   #226	-> 106
/*     */     //   #227	-> 114
/*     */     //   #225	-> 142
/*     */     //   #396	-> 153
/*     */     //   #397	-> 156
/*     */     //   #400	-> 159
/*     */     //   #401	-> 177
/*     */     //   #402	-> 188
/*     */     //   #403	-> 193
/*     */     //   #404	-> 199
/*     */     //   #405	-> 207
/*     */     //   #407	-> 214
/*     */     //   #406	-> 236
/*     */     //   #408	-> 247
/*     */     //   #409	-> 250
/*     */     //   #410	-> 266
/*     */     //   #411	-> 271
/*     */     //   #412	-> 281
/*     */     //   #414	-> 292
/*     */     //   #416	-> 297
/*     */     //   #417	-> 306
/*     */     //   #418	-> 319
/*     */     //   #420	-> 332
/*     */     //   #421	-> 343
/*     */     //   #422	-> 350
/*     */     //   #423	-> 378
/*     */     //   #424	-> 390
/*     */     //   #426	-> 404
/*     */     //   #421	-> 405
/*     */     //   #426	-> 406
/*     */     //   #427	-> 407
/*     */     //   #428	-> 420
/*     */     //   #416	-> 421
/*     */     //   #429	-> 422
/*     */     //   #430	-> 446
/*     */     //   #229	-> 477
/*     */     //   #230	-> 499
/*     */     //   #231	-> 524
/*     */     //   #430	-> 525
/*     */     //   #429	-> 530
/*     */     //   #431	-> 531
/*     */     //   #408	-> 537
/*     */     //   #432	-> 540
/*     */     //   #402	-> 542
/*     */     //   #433	-> 545
/*     */     //   #396	-> 547
/*     */     //   #434	-> 550
/*     */     //   #232	-> 563
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   477	48	31	$i$a$-Box-ComboBoxKt$Chevron$1	I
/*     */     //   499	26	32	iconColor	J
/*     */     //   474	51	30	$this$Chevron_u24lambda_u2444	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   474	51	29	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   474	51	28	$changed	I
/*     */     //   438	92	27	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   435	95	26	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   435	95	25	$changed$iv	I
/*     */     //   350	55	24	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   347	58	23	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   343	64	22	$i$f$set-impl	I
/*     */     //   340	67	21	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   306	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   303	118	19	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   240	301	18	$i$f$ReusableComposeNode	I
/*     */     //   237	304	16	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   237	304	17	$changed$iv$iv$iv	I
/*     */     //   181	365	12	$i$f$Layout	I
/*     */     //   198	348	13	compositeKeyHash$iv$iv	I
/*     */     //   206	340	14	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   214	332	15	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   178	368	11	$changed$iv$iv	I
/*     */     //   146	405	9	$i$f$Box	I
/*     */     //   168	383	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   159	392	7	propagateMinConstraints$iv	Z
/*     */     //   143	408	8	$changed$iv	I
/*     */     //   13	584	4	$dirty	I
/*     */     //   0	597	0	style	Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   0	597	1	isEnabled	Z
/*     */     //   0	597	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	597	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit ComboBox_xYaah8o$lambda$43(String $labelText, Modifier $modifier, Modifier $menuModifier, boolean $isEnabled, Outline $outline, float $maxPopupHeight, MutableInteractionSource $interactionSource, ComboBoxStyle $style, TextStyle $textStyle, Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, Function1<? super Boolean, Unit> $onPopupStateChange, Function2<? super Composer, ? super Integer, Unit> $popupContent, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     ComboBox-xYaah8o($labelText, $modifier, $menuModifier, $isEnabled, $outline, $maxPopupHeight, $interactionSource, $style, $textStyle, $onArrowDownPress, $onArrowUpPress, $onPopupStateChange, $popupContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Chevron$lambda$45(ComboBoxStyle $style, boolean $isEnabled, int $$changed, Composer $composer, int $force) {
/*     */     Chevron($style, $isEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ComboBoxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */