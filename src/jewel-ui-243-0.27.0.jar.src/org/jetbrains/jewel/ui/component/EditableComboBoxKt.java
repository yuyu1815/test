/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.gestures.ForEachGestureKt;
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.focus.FocusRequester;
/*     */ import androidx.compose.ui.focus.FocusState;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEventType;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertiesKt;
/*     */ import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.ComboBoxStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000j\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\032¶\001\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\016\b\002\020\021\032\b\022\004\022\0020\0010\0222\016\b\002\020\023\032\b\022\004\022\0020\0010\0222\016\b\002\020\024\032\b\022\004\022\0020\0010\0222\024\b\002\020\025\032\016\022\004\022\0020\006\022\004\022\0020\0010\0262\021\020\027\032\r\022\004\022\0020\0010\022¢\006\002\b\030H\007¢\006\002\020\031\032»\001\020\032\032\0020\0012\006\020\002\032\0020\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\033\032\0020\0062\006\020\034\032\0020\0352\006\020\r\032\0020\0162\006\020\036\032\0020\0062\006\020\017\032\0020\0202\006\020\037\032\0020\f2\f\020\021\032\b\022\004\022\0020\0010\0222\f\020\023\032\b\022\004\022\0020\0010\0222\f\020\024\032\b\022\004\022\0020\0010\0222\022\020 \032\016\022\004\022\0020\006\022\004\022\0020\0010\0262\022\020!\032\016\022\004\022\0020\006\022\004\022\0020\0010\0262\022\020\"\032\016\022\004\022\0020\006\022\004\022\0020\0010\026H\003¢\006\002\020#\032[\020$\032\0020\0012\006\020\005\032\0020\0062\006\020\r\032\0020\0162\006\020\013\032\0020\f2\022\020\"\032\016\022\004\022\0020\006\022\004\022\0020\0010\0262\022\020%\032\016\022\004\022\0020\006\022\004\022\0020\0010\0262\f\020&\032\b\022\004\022\0020\0010\022H\003¢\006\002\020'\032.\020(\032\0020\001*\0020)2\f\020*\032\b\022\004\022\0020\0010\0222\f\020+\032\b\022\004\022\0020\0010\022H@¢\006\002\020,¨\006-²\006\n\020\036\032\0020\006X\002²\006\n\020.\032\0020\006X\002²\006\n\020/\032\0020\006X\002²\006\n\0200\032\00201X\002²\006\n\0202\032\00203X\002²\006\n\0204\032\00205X\002"}, d2 = {"EditableComboBox", "", "modifier", "Landroidx/compose/ui/Modifier;", "menuModifier", "isEnabled", "", "inputTextFieldState", "Landroidx/compose/foundation/text/input/TextFieldState;", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "onArrowDownPress", "Lkotlin/Function0;", "onArrowUpPress", "onEnterPress", "onPopupStateChange", "Lkotlin/Function1;", "popupContent", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "TextInput", "isFocused", "textFieldFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "popupExpanded", "textFieldInteractionSource", "onSetPopupExpanded", "onFocusedChange", "onHoveredChange", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Chevron", "setPopupExpanded", "onPressWhenEnabled", "(ZLorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "detectPressAndCancel", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "onPress", "onCancel", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui", "chevronHovered", "textFieldHovered", "comboBoxState", "Lorg/jetbrains/jewel/ui/component/ComboBoxState;", "borderColor", "Landroidx/compose/ui/graphics/Color;", "comboBoxWidth", "Landroidx/compose/ui/unit/Dp;"})
/*     */ @SourceDebugExtension({"SMAP\nEditableComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 ModifierExtensions.kt\norg/jetbrains/jewel/ui/util/ModifierExtensionsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,400:1\n1225#2,6:401\n1225#2,6:407\n1225#2,6:413\n1225#2,6:419\n1225#2,6:425\n1225#2,6:431\n1225#2,6:437\n1225#2,6:443\n1225#2,6:449\n1225#2,6:455\n1225#2,6:461\n1225#2,6:467\n1225#2,6:473\n1225#2,6:479\n1225#2,6:485\n1225#2,6:493\n1225#2,6:534\n1225#2,6:540\n1225#2,6:546\n1225#2,6:556\n1225#2,6:562\n1225#2,6:568\n1225#2,6:575\n1225#2,6:581\n1225#2,6:587\n77#3:491\n10#4:492\n10#4:574\n71#5:499\n69#5,5:500\n74#5:533\n78#5:555\n71#5:593\n68#5,6:594\n74#5:628\n71#5:629\n69#5,5:630\n74#5:663\n78#5:667\n78#5:671\n79#6,6:505\n86#6,4:520\n90#6,2:530\n94#6:554\n79#6,6:600\n86#6,4:615\n90#6,2:625\n79#6,6:635\n86#6,4:650\n90#6,2:660\n94#6:666\n94#6:670\n368#7,9:511\n377#7:532\n378#7,2:552\n368#7,9:606\n377#7:627\n368#7,9:641\n377#7:662\n378#7,2:664\n378#7,2:668\n4034#8,6:524\n4034#8,6:619\n4034#8,6:654\n81#9:672\n107#9,2:673\n81#9:675\n107#9,2:676\n81#9:678\n107#9,2:679\n81#9:681\n107#9,2:682\n81#9:684\n81#9:685\n107#9,2:686\n1#10:688\n*S KotlinDebug\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt\n*L\n85#1:401,6\n88#1:407,6\n89#1:413,6\n90#1:419,6\n91#1:425,6\n94#1:431,6\n95#1:437,6\n96#1:443,6\n98#1:449,6\n99#1:455,6\n110#1:461,6\n115#1:467,6\n117#1:473,6\n119#1:479,6\n133#1:485,6\n157#1:493,6\n210#1:534,6\n212#1:540,6\n202#1:546,6\n248#1:556,6\n250#1:562,6\n284#1:568,6\n307#1:575,6\n308#1:581,6\n311#1:587,6\n134#1:491\n140#1:492\n306#1:574\n136#1:499\n136#1:500,5\n136#1:533\n136#1:555\n302#1:593\n302#1:594,6\n302#1:628\n331#1:629\n331#1:630,5\n331#1:663\n331#1:667\n302#1:671\n136#1:505,6\n136#1:520,4\n136#1:530,2\n136#1:554\n302#1:600,6\n302#1:615,4\n302#1:625,2\n331#1:635,6\n331#1:650,4\n331#1:660,2\n331#1:666\n302#1:670\n136#1:511,9\n136#1:532\n136#1:552,2\n302#1:606,9\n302#1:627\n331#1:641,9\n331#1:662\n331#1:664,2\n302#1:668,2\n136#1:524,6\n302#1:619,6\n331#1:654,6\n94#1:672\n94#1:673,2\n95#1:675\n95#1:676,2\n96#1:678\n96#1:679,2\n115#1:681\n115#1:682,2\n132#1:684\n133#1:685\n133#1:686,2\n*E\n"})
/*     */ public final class EditableComboBoxKt
/*     */ {
/*     */   private static final Unit EditableComboBox$lambda$2$lambda$1() {
/*  88 */     return Unit.INSTANCE;
/*  89 */   } private static final Unit EditableComboBox$lambda$4$lambda$3() { return Unit.INSTANCE; }
/*  90 */   private static final Unit EditableComboBox$lambda$6$lambda$5() { return Unit.INSTANCE; }
/*  91 */   private static final Unit EditableComboBox$lambda$8$lambda$7(boolean it) { return Unit.INSTANCE; } @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   public static final void EditableComboBox(@Nullable Modifier modifier, @Nullable Modifier menuModifier, boolean isEnabled, @Nullable TextFieldState inputTextFieldState, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable ComboBoxStyle style, @Nullable TextStyle textStyle, @Nullable Function0 onArrowDownPress, @Nullable Function0 onArrowUpPress, @Nullable Function0 onEnterPress, @Nullable Function1 onPopupStateChange, @NotNull Function2 popupContent, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload #12
/*     */     //   2: ldc 'popupContent'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload #13
/*     */     //   9: ldc 629754101
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
/*     */     //   120: iload #16
/*     */     //   122: iconst_4
/*     */     //   123: iand
/*     */     //   124: ifeq -> 138
/*     */     //   127: iload #17
/*     */     //   129: sipush #384
/*     */     //   132: ior
/*     */     //   133: istore #17
/*     */     //   135: goto -> 172
/*     */     //   138: iload #14
/*     */     //   140: sipush #384
/*     */     //   143: iand
/*     */     //   144: ifne -> 172
/*     */     //   147: iload #17
/*     */     //   149: aload #13
/*     */     //   151: iload_2
/*     */     //   152: invokeinterface changed : (Z)Z
/*     */     //   157: ifeq -> 166
/*     */     //   160: sipush #256
/*     */     //   163: goto -> 169
/*     */     //   166: sipush #128
/*     */     //   169: ior
/*     */     //   170: istore #17
/*     */     //   172: iload #14
/*     */     //   174: sipush #3072
/*     */     //   177: iand
/*     */     //   178: ifne -> 214
/*     */     //   181: iload #17
/*     */     //   183: iload #16
/*     */     //   185: bipush #8
/*     */     //   187: iand
/*     */     //   188: ifne -> 208
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
/*     */     //   246: aload #4
/*     */     //   248: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   300: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   358: iload #14
/*     */     //   360: ldc 12582912
/*     */     //   362: iand
/*     */     //   363: ifne -> 399
/*     */     //   366: iload #17
/*     */     //   368: iload #16
/*     */     //   370: sipush #128
/*     */     //   373: iand
/*     */     //   374: ifne -> 394
/*     */     //   377: aload #13
/*     */     //   379: aload #7
/*     */     //   381: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   386: ifeq -> 394
/*     */     //   389: ldc 8388608
/*     */     //   391: goto -> 396
/*     */     //   394: ldc 4194304
/*     */     //   396: ior
/*     */     //   397: istore #17
/*     */     //   399: iload #16
/*     */     //   401: sipush #256
/*     */     //   404: iand
/*     */     //   405: ifeq -> 418
/*     */     //   408: iload #17
/*     */     //   410: ldc 100663296
/*     */     //   412: ior
/*     */     //   413: istore #17
/*     */     //   415: goto -> 450
/*     */     //   418: iload #14
/*     */     //   420: ldc 100663296
/*     */     //   422: iand
/*     */     //   423: ifne -> 450
/*     */     //   426: iload #17
/*     */     //   428: aload #13
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   466: goto -> 501
/*     */     //   469: iload #14
/*     */     //   471: ldc 805306368
/*     */     //   473: iand
/*     */     //   474: ifne -> 501
/*     */     //   477: iload #17
/*     */     //   479: aload #13
/*     */     //   481: aload #9
/*     */     //   483: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   488: ifeq -> 496
/*     */     //   491: ldc 536870912
/*     */     //   493: goto -> 498
/*     */     //   496: ldc 268435456
/*     */     //   498: ior
/*     */     //   499: istore #17
/*     */     //   501: iload #16
/*     */     //   503: sipush #1024
/*     */     //   506: iand
/*     */     //   507: ifeq -> 520
/*     */     //   510: iload #18
/*     */     //   512: bipush #6
/*     */     //   514: ior
/*     */     //   515: istore #18
/*     */     //   517: goto -> 550
/*     */     //   520: iload #15
/*     */     //   522: bipush #6
/*     */     //   524: iand
/*     */     //   525: ifne -> 550
/*     */     //   528: iload #18
/*     */     //   530: aload #13
/*     */     //   532: aload #10
/*     */     //   534: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   539: ifeq -> 546
/*     */     //   542: iconst_4
/*     */     //   543: goto -> 547
/*     */     //   546: iconst_2
/*     */     //   547: ior
/*     */     //   548: istore #18
/*     */     //   550: iload #16
/*     */     //   552: sipush #2048
/*     */     //   555: iand
/*     */     //   556: ifeq -> 569
/*     */     //   559: iload #18
/*     */     //   561: bipush #48
/*     */     //   563: ior
/*     */     //   564: istore #18
/*     */     //   566: goto -> 601
/*     */     //   569: iload #15
/*     */     //   571: bipush #48
/*     */     //   573: iand
/*     */     //   574: ifne -> 601
/*     */     //   577: iload #18
/*     */     //   579: aload #13
/*     */     //   581: aload #11
/*     */     //   583: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   588: ifeq -> 596
/*     */     //   591: bipush #32
/*     */     //   593: goto -> 598
/*     */     //   596: bipush #16
/*     */     //   598: ior
/*     */     //   599: istore #18
/*     */     //   601: iload #16
/*     */     //   603: sipush #4096
/*     */     //   606: iand
/*     */     //   607: ifeq -> 621
/*     */     //   610: iload #18
/*     */     //   612: sipush #384
/*     */     //   615: ior
/*     */     //   616: istore #18
/*     */     //   618: goto -> 656
/*     */     //   621: iload #15
/*     */     //   623: sipush #384
/*     */     //   626: iand
/*     */     //   627: ifne -> 656
/*     */     //   630: iload #18
/*     */     //   632: aload #13
/*     */     //   634: aload #12
/*     */     //   636: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   641: ifeq -> 650
/*     */     //   644: sipush #256
/*     */     //   647: goto -> 653
/*     */     //   650: sipush #128
/*     */     //   653: ior
/*     */     //   654: istore #18
/*     */     //   656: iload #17
/*     */     //   658: ldc 306783379
/*     */     //   660: iand
/*     */     //   661: ldc 306783378
/*     */     //   663: if_icmpne -> 688
/*     */     //   666: iload #18
/*     */     //   668: sipush #147
/*     */     //   671: iand
/*     */     //   672: sipush #146
/*     */     //   675: if_icmpne -> 688
/*     */     //   678: aload #13
/*     */     //   680: invokeinterface getSkipping : ()Z
/*     */     //   685: ifne -> 3801
/*     */     //   688: aload #13
/*     */     //   690: invokeinterface startDefaults : ()V
/*     */     //   695: iload #14
/*     */     //   697: iconst_1
/*     */     //   698: iand
/*     */     //   699: ifeq -> 712
/*     */     //   702: aload #13
/*     */     //   704: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   709: ifeq -> 1323
/*     */     //   712: iload #16
/*     */     //   714: iconst_1
/*     */     //   715: iand
/*     */     //   716: ifeq -> 726
/*     */     //   719: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   722: checkcast androidx/compose/ui/Modifier
/*     */     //   725: astore_0
/*     */     //   726: iload #16
/*     */     //   728: iconst_2
/*     */     //   729: iand
/*     */     //   730: ifeq -> 740
/*     */     //   733: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   736: checkcast androidx/compose/ui/Modifier
/*     */     //   739: astore_1
/*     */     //   740: iload #16
/*     */     //   742: iconst_4
/*     */     //   743: iand
/*     */     //   744: ifeq -> 749
/*     */     //   747: iconst_1
/*     */     //   748: istore_2
/*     */     //   749: iload #16
/*     */     //   751: bipush #8
/*     */     //   753: iand
/*     */     //   754: ifeq -> 775
/*     */     //   757: aconst_null
/*     */     //   758: lconst_0
/*     */     //   759: aload #13
/*     */     //   761: iconst_0
/*     */     //   762: iconst_3
/*     */     //   763: invokestatic rememberTextFieldState-Le-punE : (Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   766: astore_3
/*     */     //   767: iload #17
/*     */     //   769: sipush #-7169
/*     */     //   772: iand
/*     */     //   773: istore #17
/*     */     //   775: iload #16
/*     */     //   777: bipush #16
/*     */     //   779: iand
/*     */     //   780: ifeq -> 788
/*     */     //   783: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   786: astore #4
/*     */     //   788: iload #16
/*     */     //   790: bipush #32
/*     */     //   792: iand
/*     */     //   793: ifeq -> 881
/*     */     //   796: aload #13
/*     */     //   798: ldc 1452050886
/*     */     //   800: invokeinterface startReplaceGroup : (I)V
/*     */     //   805: aload #13
/*     */     //   807: astore #20
/*     */     //   809: iconst_0
/*     */     //   810: istore #21
/*     */     //   812: iconst_0
/*     */     //   813: istore #22
/*     */     //   815: aload #20
/*     */     //   817: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   822: astore #23
/*     */     //   824: iconst_0
/*     */     //   825: istore #24
/*     */     //   827: aload #23
/*     */     //   829: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   832: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   835: if_acmpne -> 860
/*     */     //   838: iconst_0
/*     */     //   839: istore #25
/*     */     //   841: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   844: astore #25
/*     */     //   846: aload #20
/*     */     //   848: aload #25
/*     */     //   850: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   855: aload #25
/*     */     //   857: goto -> 862
/*     */     //   860: aload #23
/*     */     //   862: nop
/*     */     //   863: nop
/*     */     //   864: nop
/*     */     //   865: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   868: astore #19
/*     */     //   870: aload #13
/*     */     //   872: invokeinterface endReplaceGroup : ()V
/*     */     //   877: aload #19
/*     */     //   879: astore #5
/*     */     //   881: iload #16
/*     */     //   883: bipush #64
/*     */     //   885: iand
/*     */     //   886: ifeq -> 908
/*     */     //   889: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   892: aload #13
/*     */     //   894: bipush #6
/*     */     //   896: invokestatic getComboBoxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   899: astore #6
/*     */     //   901: iload #17
/*     */     //   903: ldc -3670017
/*     */     //   905: iand
/*     */     //   906: istore #17
/*     */     //   908: iload #16
/*     */     //   910: sipush #128
/*     */     //   913: iand
/*     */     //   914: ifeq -> 936
/*     */     //   917: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   920: aload #13
/*     */     //   922: bipush #6
/*     */     //   924: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   927: astore #7
/*     */     //   929: iload #17
/*     */     //   931: ldc -29360129
/*     */     //   933: iand
/*     */     //   934: istore #17
/*     */     //   936: iload #16
/*     */     //   938: sipush #256
/*     */     //   941: iand
/*     */     //   942: ifeq -> 1032
/*     */     //   945: aload #13
/*     */     //   947: ldc 1452056769
/*     */     //   949: invokeinterface startReplaceGroup : (I)V
/*     */     //   954: aload #13
/*     */     //   956: astore #20
/*     */     //   958: iconst_0
/*     */     //   959: istore #21
/*     */     //   961: iconst_0
/*     */     //   962: istore #22
/*     */     //   964: aload #20
/*     */     //   966: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   971: astore #23
/*     */     //   973: iconst_0
/*     */     //   974: istore #24
/*     */     //   976: aload #23
/*     */     //   978: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   981: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   984: if_acmpne -> 1011
/*     */     //   987: iconst_0
/*     */     //   988: istore #25
/*     */     //   990: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   995: astore #25
/*     */     //   997: aload #20
/*     */     //   999: aload #25
/*     */     //   1001: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1006: aload #25
/*     */     //   1008: goto -> 1013
/*     */     //   1011: aload #23
/*     */     //   1013: nop
/*     */     //   1014: nop
/*     */     //   1015: nop
/*     */     //   1016: checkcast kotlin/jvm/functions/Function0
/*     */     //   1019: astore #19
/*     */     //   1021: aload #13
/*     */     //   1023: invokeinterface endReplaceGroup : ()V
/*     */     //   1028: aload #19
/*     */     //   1030: astore #8
/*     */     //   1032: iload #16
/*     */     //   1034: sipush #512
/*     */     //   1037: iand
/*     */     //   1038: ifeq -> 1128
/*     */     //   1041: aload #13
/*     */     //   1043: ldc 1452057953
/*     */     //   1045: invokeinterface startReplaceGroup : (I)V
/*     */     //   1050: aload #13
/*     */     //   1052: astore #20
/*     */     //   1054: iconst_0
/*     */     //   1055: istore #21
/*     */     //   1057: iconst_0
/*     */     //   1058: istore #22
/*     */     //   1060: aload #20
/*     */     //   1062: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1067: astore #23
/*     */     //   1069: iconst_0
/*     */     //   1070: istore #24
/*     */     //   1072: aload #23
/*     */     //   1074: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1077: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1080: if_acmpne -> 1107
/*     */     //   1083: iconst_0
/*     */     //   1084: istore #25
/*     */     //   1086: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1091: astore #25
/*     */     //   1093: aload #20
/*     */     //   1095: aload #25
/*     */     //   1097: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1102: aload #25
/*     */     //   1104: goto -> 1109
/*     */     //   1107: aload #23
/*     */     //   1109: nop
/*     */     //   1110: nop
/*     */     //   1111: nop
/*     */     //   1112: checkcast kotlin/jvm/functions/Function0
/*     */     //   1115: astore #19
/*     */     //   1117: aload #13
/*     */     //   1119: invokeinterface endReplaceGroup : ()V
/*     */     //   1124: aload #19
/*     */     //   1126: astore #9
/*     */     //   1128: iload #16
/*     */     //   1130: sipush #1024
/*     */     //   1133: iand
/*     */     //   1134: ifeq -> 1224
/*     */     //   1137: aload #13
/*     */     //   1139: ldc 1452059073
/*     */     //   1141: invokeinterface startReplaceGroup : (I)V
/*     */     //   1146: aload #13
/*     */     //   1148: astore #20
/*     */     //   1150: iconst_0
/*     */     //   1151: istore #21
/*     */     //   1153: iconst_0
/*     */     //   1154: istore #22
/*     */     //   1156: aload #20
/*     */     //   1158: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1163: astore #23
/*     */     //   1165: iconst_0
/*     */     //   1166: istore #24
/*     */     //   1168: aload #23
/*     */     //   1170: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1173: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1176: if_acmpne -> 1203
/*     */     //   1179: iconst_0
/*     */     //   1180: istore #25
/*     */     //   1182: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1187: astore #25
/*     */     //   1189: aload #20
/*     */     //   1191: aload #25
/*     */     //   1193: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1198: aload #25
/*     */     //   1200: goto -> 1205
/*     */     //   1203: aload #23
/*     */     //   1205: nop
/*     */     //   1206: nop
/*     */     //   1207: nop
/*     */     //   1208: checkcast kotlin/jvm/functions/Function0
/*     */     //   1211: astore #19
/*     */     //   1213: aload #13
/*     */     //   1215: invokeinterface endReplaceGroup : ()V
/*     */     //   1220: aload #19
/*     */     //   1222: astore #10
/*     */     //   1224: iload #16
/*     */     //   1226: sipush #2048
/*     */     //   1229: iand
/*     */     //   1230: ifeq -> 1377
/*     */     //   1233: aload #13
/*     */     //   1235: ldc 1452060609
/*     */     //   1237: invokeinterface startReplaceGroup : (I)V
/*     */     //   1242: aload #13
/*     */     //   1244: astore #20
/*     */     //   1246: iconst_0
/*     */     //   1247: istore #21
/*     */     //   1249: iconst_0
/*     */     //   1250: istore #22
/*     */     //   1252: aload #20
/*     */     //   1254: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1259: astore #23
/*     */     //   1261: iconst_0
/*     */     //   1262: istore #24
/*     */     //   1264: aload #23
/*     */     //   1266: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1269: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1272: if_acmpne -> 1299
/*     */     //   1275: iconst_0
/*     */     //   1276: istore #25
/*     */     //   1278: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1283: astore #25
/*     */     //   1285: aload #20
/*     */     //   1287: aload #25
/*     */     //   1289: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1294: aload #25
/*     */     //   1296: goto -> 1301
/*     */     //   1299: aload #23
/*     */     //   1301: nop
/*     */     //   1302: nop
/*     */     //   1303: nop
/*     */     //   1304: checkcast kotlin/jvm/functions/Function1
/*     */     //   1307: astore #19
/*     */     //   1309: aload #13
/*     */     //   1311: invokeinterface endReplaceGroup : ()V
/*     */     //   1316: aload #19
/*     */     //   1318: astore #11
/*     */     //   1320: goto -> 1377
/*     */     //   1323: aload #13
/*     */     //   1325: invokeinterface skipToGroupEnd : ()V
/*     */     //   1330: iload #16
/*     */     //   1332: bipush #8
/*     */     //   1334: iand
/*     */     //   1335: ifeq -> 1346
/*     */     //   1338: iload #17
/*     */     //   1340: sipush #-7169
/*     */     //   1343: iand
/*     */     //   1344: istore #17
/*     */     //   1346: iload #16
/*     */     //   1348: bipush #64
/*     */     //   1350: iand
/*     */     //   1351: ifeq -> 1361
/*     */     //   1354: iload #17
/*     */     //   1356: ldc -3670017
/*     */     //   1358: iand
/*     */     //   1359: istore #17
/*     */     //   1361: iload #16
/*     */     //   1363: sipush #128
/*     */     //   1366: iand
/*     */     //   1367: ifeq -> 1377
/*     */     //   1370: iload #17
/*     */     //   1372: ldc -29360129
/*     */     //   1374: iand
/*     */     //   1375: istore #17
/*     */     //   1377: aload #13
/*     */     //   1379: invokeinterface endDefaults : ()V
/*     */     //   1384: invokestatic isTraceInProgress : ()Z
/*     */     //   1387: ifeq -> 1401
/*     */     //   1390: ldc 629754101
/*     */     //   1392: iload #17
/*     */     //   1394: iload #18
/*     */     //   1396: ldc 'org.jetbrains.jewel.ui.component.EditableComboBox (EditableComboBox.kt:92)'
/*     */     //   1398: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1401: aload #13
/*     */     //   1403: ldc 1452063041
/*     */     //   1405: invokeinterface startReplaceGroup : (I)V
/*     */     //   1410: aload #13
/*     */     //   1412: astore #21
/*     */     //   1414: iconst_0
/*     */     //   1415: istore #22
/*     */     //   1417: nop
/*     */     //   1418: iconst_0
/*     */     //   1419: istore #23
/*     */     //   1421: aload #21
/*     */     //   1423: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1428: astore #24
/*     */     //   1430: iconst_0
/*     */     //   1431: istore #25
/*     */     //   1433: aload #24
/*     */     //   1435: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1438: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1441: if_acmpne -> 1473
/*     */     //   1444: iconst_0
/*     */     //   1445: istore #26
/*     */     //   1447: iconst_0
/*     */     //   1448: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1451: aconst_null
/*     */     //   1452: iconst_2
/*     */     //   1453: aconst_null
/*     */     //   1454: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1457: astore #26
/*     */     //   1459: aload #21
/*     */     //   1461: aload #26
/*     */     //   1463: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1468: aload #26
/*     */     //   1470: goto -> 1475
/*     */     //   1473: aload #24
/*     */     //   1475: nop
/*     */     //   1476: nop
/*     */     //   1477: nop
/*     */     //   1478: checkcast androidx/compose/runtime/MutableState
/*     */     //   1481: astore #20
/*     */     //   1483: aload #13
/*     */     //   1485: invokeinterface endReplaceGroup : ()V
/*     */     //   1490: aload #20
/*     */     //   1492: astore #19
/*     */     //   1494: aload #13
/*     */     //   1496: ldc 1452064993
/*     */     //   1498: invokeinterface startReplaceGroup : (I)V
/*     */     //   1503: aload #13
/*     */     //   1505: astore #22
/*     */     //   1507: iconst_0
/*     */     //   1508: istore #23
/*     */     //   1510: nop
/*     */     //   1511: iconst_0
/*     */     //   1512: istore #24
/*     */     //   1514: aload #22
/*     */     //   1516: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1521: astore #25
/*     */     //   1523: iconst_0
/*     */     //   1524: istore #26
/*     */     //   1526: aload #25
/*     */     //   1528: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1531: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1534: if_acmpne -> 1566
/*     */     //   1537: iconst_0
/*     */     //   1538: istore #27
/*     */     //   1540: iconst_0
/*     */     //   1541: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1544: aconst_null
/*     */     //   1545: iconst_2
/*     */     //   1546: aconst_null
/*     */     //   1547: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1550: astore #27
/*     */     //   1552: aload #22
/*     */     //   1554: aload #27
/*     */     //   1556: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1561: aload #27
/*     */     //   1563: goto -> 1568
/*     */     //   1566: aload #25
/*     */     //   1568: nop
/*     */     //   1569: nop
/*     */     //   1570: nop
/*     */     //   1571: checkcast androidx/compose/runtime/MutableState
/*     */     //   1574: astore #21
/*     */     //   1576: aload #13
/*     */     //   1578: invokeinterface endReplaceGroup : ()V
/*     */     //   1583: aload #21
/*     */     //   1585: astore #20
/*     */     //   1587: aload #13
/*     */     //   1589: ldc 1452067009
/*     */     //   1591: invokeinterface startReplaceGroup : (I)V
/*     */     //   1596: aload #13
/*     */     //   1598: astore #23
/*     */     //   1600: iconst_0
/*     */     //   1601: istore #24
/*     */     //   1603: nop
/*     */     //   1604: iconst_0
/*     */     //   1605: istore #25
/*     */     //   1607: aload #23
/*     */     //   1609: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1614: astore #26
/*     */     //   1616: iconst_0
/*     */     //   1617: istore #27
/*     */     //   1619: aload #26
/*     */     //   1621: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1624: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1627: if_acmpne -> 1659
/*     */     //   1630: iconst_0
/*     */     //   1631: istore #28
/*     */     //   1633: iconst_0
/*     */     //   1634: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   1637: aconst_null
/*     */     //   1638: iconst_2
/*     */     //   1639: aconst_null
/*     */     //   1640: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1643: astore #28
/*     */     //   1645: aload #23
/*     */     //   1647: aload #28
/*     */     //   1649: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1654: aload #28
/*     */     //   1656: goto -> 1661
/*     */     //   1659: aload #26
/*     */     //   1661: nop
/*     */     //   1662: nop
/*     */     //   1663: nop
/*     */     //   1664: checkcast androidx/compose/runtime/MutableState
/*     */     //   1667: astore #22
/*     */     //   1669: aload #13
/*     */     //   1671: invokeinterface endReplaceGroup : ()V
/*     */     //   1676: aload #22
/*     */     //   1678: astore #21
/*     */     //   1680: aload #13
/*     */     //   1682: ldc 1452069350
/*     */     //   1684: invokeinterface startReplaceGroup : (I)V
/*     */     //   1689: aload #13
/*     */     //   1691: astore #24
/*     */     //   1693: iconst_0
/*     */     //   1694: istore #25
/*     */     //   1696: nop
/*     */     //   1697: iconst_0
/*     */     //   1698: istore #26
/*     */     //   1700: aload #24
/*     */     //   1702: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1707: astore #27
/*     */     //   1709: iconst_0
/*     */     //   1710: istore #28
/*     */     //   1712: aload #27
/*     */     //   1714: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1717: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1720: if_acmpne -> 1745
/*     */     //   1723: iconst_0
/*     */     //   1724: istore #29
/*     */     //   1726: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1729: astore #29
/*     */     //   1731: aload #24
/*     */     //   1733: aload #29
/*     */     //   1735: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1740: aload #29
/*     */     //   1742: goto -> 1747
/*     */     //   1745: aload #27
/*     */     //   1747: nop
/*     */     //   1748: nop
/*     */     //   1749: nop
/*     */     //   1750: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1753: astore #23
/*     */     //   1755: aload #13
/*     */     //   1757: invokeinterface endReplaceGroup : ()V
/*     */     //   1762: aload #23
/*     */     //   1764: astore #22
/*     */     //   1766: aload #13
/*     */     //   1768: ldc 1452071708
/*     */     //   1770: invokeinterface startReplaceGroup : (I)V
/*     */     //   1775: aload #13
/*     */     //   1777: astore #25
/*     */     //   1779: iconst_0
/*     */     //   1780: istore #26
/*     */     //   1782: nop
/*     */     //   1783: iconst_0
/*     */     //   1784: istore #27
/*     */     //   1786: aload #25
/*     */     //   1788: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1793: astore #28
/*     */     //   1795: iconst_0
/*     */     //   1796: istore #29
/*     */     //   1798: aload #28
/*     */     //   1800: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1803: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1806: if_acmpne -> 1835
/*     */     //   1809: iconst_0
/*     */     //   1810: istore #30
/*     */     //   1812: new androidx/compose/ui/focus/FocusRequester
/*     */     //   1815: dup
/*     */     //   1816: invokespecial <init> : ()V
/*     */     //   1819: astore #30
/*     */     //   1821: aload #25
/*     */     //   1823: aload #30
/*     */     //   1825: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1830: aload #30
/*     */     //   1832: goto -> 1837
/*     */     //   1835: aload #28
/*     */     //   1837: nop
/*     */     //   1838: nop
/*     */     //   1839: nop
/*     */     //   1840: checkcast androidx/compose/ui/focus/FocusRequester
/*     */     //   1843: astore #24
/*     */     //   1845: aload #13
/*     */     //   1847: invokeinterface endReplaceGroup : ()V
/*     */     //   1852: aload #24
/*     */     //   1854: astore #23
/*     */     //   1856: aload #13
/*     */     //   1858: ldc 1452079915
/*     */     //   1860: invokeinterface startReplaceGroup : (I)V
/*     */     //   1865: aload #13
/*     */     //   1867: astore #26
/*     */     //   1869: iload #18
/*     */     //   1871: bipush #112
/*     */     //   1873: iand
/*     */     //   1874: bipush #32
/*     */     //   1876: if_icmpne -> 1883
/*     */     //   1879: iconst_1
/*     */     //   1880: goto -> 1884
/*     */     //   1883: iconst_0
/*     */     //   1884: istore #27
/*     */     //   1886: nop
/*     */     //   1887: iconst_0
/*     */     //   1888: istore #28
/*     */     //   1890: aload #26
/*     */     //   1892: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1897: astore #29
/*     */     //   1899: iconst_0
/*     */     //   1900: istore #30
/*     */     //   1902: iload #27
/*     */     //   1904: ifne -> 1918
/*     */     //   1907: aload #29
/*     */     //   1909: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1912: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1915: if_acmpne -> 1948
/*     */     //   1918: iconst_0
/*     */     //   1919: istore #31
/*     */     //   1921: aload #23
/*     */     //   1923: aload #19
/*     */     //   1925: aload #11
/*     */     //   1927: <illegal opcode> invoke : (Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
/*     */     //   1932: astore #32
/*     */     //   1934: aload #26
/*     */     //   1936: aload #32
/*     */     //   1938: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1943: aload #32
/*     */     //   1945: goto -> 1950
/*     */     //   1948: aload #29
/*     */     //   1950: nop
/*     */     //   1951: nop
/*     */     //   1952: nop
/*     */     //   1953: checkcast kotlin/jvm/functions/Function0
/*     */     //   1956: astore #25
/*     */     //   1958: aload #13
/*     */     //   1960: invokeinterface endReplaceGroup : ()V
/*     */     //   1965: aload #25
/*     */     //   1967: astore #24
/*     */     //   1969: aload #13
/*     */     //   1971: ldc 1452083201
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
/*     */     //   2009: if_acmpne -> 2054
/*     */     //   2012: iconst_0
/*     */     //   2013: istore #32
/*     */     //   2015: getstatic org/jetbrains/jewel/ui/component/ComboBoxState.Companion : Lorg/jetbrains/jewel/ui/component/ComboBoxState$Companion;
/*     */     //   2018: iload_2
/*     */     //   2019: iconst_0
/*     */     //   2020: iconst_0
/*     */     //   2021: iconst_0
/*     */     //   2022: iconst_0
/*     */     //   2023: bipush #30
/*     */     //   2025: aconst_null
/*     */     //   2026: invokestatic of-b6bHBqw$default : (Lorg/jetbrains/jewel/ui/component/ComboBoxState$Companion;ZZZZZILjava/lang/Object;)J
/*     */     //   2029: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   2032: aconst_null
/*     */     //   2033: iconst_2
/*     */     //   2034: aconst_null
/*     */     //   2035: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   2038: astore #33
/*     */     //   2040: aload #27
/*     */     //   2042: aload #33
/*     */     //   2044: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2049: aload #33
/*     */     //   2051: goto -> 2056
/*     */     //   2054: aload #30
/*     */     //   2056: nop
/*     */     //   2057: nop
/*     */     //   2058: nop
/*     */     //   2059: checkcast androidx/compose/runtime/MutableState
/*     */     //   2062: astore #26
/*     */     //   2064: aload #13
/*     */     //   2066: invokeinterface endReplaceGroup : ()V
/*     */     //   2071: aload #26
/*     */     //   2073: astore #25
/*     */     //   2075: aload #13
/*     */     //   2077: ldc 1452085518
/*     */     //   2079: invokeinterface startReplaceGroup : (I)V
/*     */     //   2084: aload #13
/*     */     //   2086: astore #26
/*     */     //   2088: iload #17
/*     */     //   2090: sipush #896
/*     */     //   2093: iand
/*     */     //   2094: sipush #256
/*     */     //   2097: if_icmpne -> 2104
/*     */     //   2100: iconst_1
/*     */     //   2101: goto -> 2105
/*     */     //   2104: iconst_0
/*     */     //   2105: istore #27
/*     */     //   2107: nop
/*     */     //   2108: iconst_0
/*     */     //   2109: istore #28
/*     */     //   2111: aload #26
/*     */     //   2113: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2118: astore #29
/*     */     //   2120: iconst_0
/*     */     //   2121: istore #30
/*     */     //   2123: iload #27
/*     */     //   2125: ifne -> 2139
/*     */     //   2128: aload #29
/*     */     //   2130: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2133: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2136: if_acmpne -> 2182
/*     */     //   2139: iconst_0
/*     */     //   2140: istore #31
/*     */     //   2142: aload #25
/*     */     //   2144: aload #25
/*     */     //   2146: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2149: iload_2
/*     */     //   2150: iconst_0
/*     */     //   2151: iconst_0
/*     */     //   2152: iconst_0
/*     */     //   2153: iconst_0
/*     */     //   2154: bipush #30
/*     */     //   2156: aconst_null
/*     */     //   2157: invokestatic copy-b6bHBqw$default : (JZZZZZILjava/lang/Object;)J
/*     */     //   2160: invokestatic EditableComboBox$lambda$24 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   2163: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   2166: astore #32
/*     */     //   2168: aload #26
/*     */     //   2170: aload #32
/*     */     //   2172: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2177: aload #32
/*     */     //   2179: goto -> 2184
/*     */     //   2182: aload #29
/*     */     //   2184: nop
/*     */     //   2185: nop
/*     */     //   2186: nop
/*     */     //   2187: pop
/*     */     //   2188: aload #13
/*     */     //   2190: invokeinterface endReplaceGroup : ()V
/*     */     //   2195: aload #5
/*     */     //   2197: aload #13
/*     */     //   2199: ldc_w 1452089806
/*     */     //   2202: invokeinterface startReplaceGroup : (I)V
/*     */     //   2207: aload #13
/*     */     //   2209: astore #27
/*     */     //   2211: iload #17
/*     */     //   2213: ldc_w 458752
/*     */     //   2216: iand
/*     */     //   2217: ldc 131072
/*     */     //   2219: if_icmpne -> 2226
/*     */     //   2222: iconst_1
/*     */     //   2223: goto -> 2227
/*     */     //   2226: iconst_0
/*     */     //   2227: istore #28
/*     */     //   2229: iconst_0
/*     */     //   2230: istore #29
/*     */     //   2232: aload #27
/*     */     //   2234: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2239: astore #30
/*     */     //   2241: iconst_0
/*     */     //   2242: istore #31
/*     */     //   2244: iload #28
/*     */     //   2246: ifne -> 2260
/*     */     //   2249: aload #30
/*     */     //   2251: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2254: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2257: if_acmpne -> 2299
/*     */     //   2260: astore #75
/*     */     //   2262: iconst_0
/*     */     //   2263: istore #32
/*     */     //   2265: new org/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$7$1
/*     */     //   2268: dup
/*     */     //   2269: aload #5
/*     */     //   2271: aload #25
/*     */     //   2273: aconst_null
/*     */     //   2274: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   2277: checkcast kotlin/jvm/functions/Function2
/*     */     //   2280: aload #75
/*     */     //   2282: swap
/*     */     //   2283: astore #33
/*     */     //   2285: aload #27
/*     */     //   2287: aload #33
/*     */     //   2289: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2294: aload #33
/*     */     //   2296: goto -> 2301
/*     */     //   2299: aload #30
/*     */     //   2301: nop
/*     */     //   2302: nop
/*     */     //   2303: nop
/*     */     //   2304: checkcast kotlin/jvm/functions/Function2
/*     */     //   2307: astore #26
/*     */     //   2309: aload #13
/*     */     //   2311: invokeinterface endReplaceGroup : ()V
/*     */     //   2316: aload #26
/*     */     //   2318: aload #13
/*     */     //   2320: bipush #14
/*     */     //   2322: iload #17
/*     */     //   2324: bipush #15
/*     */     //   2326: ishr
/*     */     //   2327: iand
/*     */     //   2328: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2331: aload #6
/*     */     //   2333: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2336: invokevirtual getCornerSize : ()Landroidx/compose/foundation/shape/CornerSize;
/*     */     //   2339: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   2342: astore #26
/*     */     //   2344: aload #6
/*     */     //   2346: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   2349: aload #25
/*     */     //   2351: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2354: aload #13
/*     */     //   2356: iconst_0
/*     */     //   2357: invokevirtual borderFor-zWq4Sqo : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2360: astore #27
/*     */     //   2362: aload #13
/*     */     //   2364: ldc_w 1452111946
/*     */     //   2367: invokeinterface startReplaceGroup : (I)V
/*     */     //   2372: aload #13
/*     */     //   2374: astore #30
/*     */     //   2376: iconst_0
/*     */     //   2377: istore #31
/*     */     //   2379: nop
/*     */     //   2380: iconst_0
/*     */     //   2381: istore #32
/*     */     //   2383: aload #30
/*     */     //   2385: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2390: astore #33
/*     */     //   2392: iconst_0
/*     */     //   2393: istore #34
/*     */     //   2395: aload #33
/*     */     //   2397: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2400: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2403: if_acmpne -> 2440
/*     */     //   2406: iconst_0
/*     */     //   2407: istore #35
/*     */     //   2409: getstatic androidx/compose/ui/unit/Dp.Companion : Landroidx/compose/ui/unit/Dp$Companion;
/*     */     //   2412: invokevirtual getUnspecified-D9Ej5fM : ()F
/*     */     //   2415: invokestatic box-impl : (F)Landroidx/compose/ui/unit/Dp;
/*     */     //   2418: aconst_null
/*     */     //   2419: iconst_2
/*     */     //   2420: aconst_null
/*     */     //   2421: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   2424: astore #35
/*     */     //   2426: aload #30
/*     */     //   2428: aload #35
/*     */     //   2430: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2435: aload #35
/*     */     //   2437: goto -> 2442
/*     */     //   2440: aload #33
/*     */     //   2442: nop
/*     */     //   2443: nop
/*     */     //   2444: nop
/*     */     //   2445: checkcast androidx/compose/runtime/MutableState
/*     */     //   2448: astore #29
/*     */     //   2450: aload #13
/*     */     //   2452: invokeinterface endReplaceGroup : ()V
/*     */     //   2457: aload #29
/*     */     //   2459: astore #28
/*     */     //   2461: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2464: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   2467: astore #30
/*     */     //   2469: iconst_0
/*     */     //   2470: istore #31
/*     */     //   2472: iconst_0
/*     */     //   2473: istore #32
/*     */     //   2475: aload #13
/*     */     //   2477: ldc_w 2023513938
/*     */     //   2480: ldc_w 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   2483: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2486: aload #13
/*     */     //   2488: aload #30
/*     */     //   2490: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   2495: astore #33
/*     */     //   2497: aload #13
/*     */     //   2499: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2502: aload #33
/*     */     //   2504: checkcast androidx/compose/ui/unit/Density
/*     */     //   2507: astore #29
/*     */     //   2509: aload #13
/*     */     //   2511: ldc_w 1452120028
/*     */     //   2514: invokeinterface startReplaceGroup : (I)V
/*     */     //   2519: aload_0
/*     */     //   2520: aload #6
/*     */     //   2522: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   2525: aload #25
/*     */     //   2527: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2530: iconst_1
/*     */     //   2531: aload #13
/*     */     //   2533: bipush #48
/*     */     //   2535: invokevirtual backgroundFor-8sYwEIk : (JZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2538: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   2543: checkcast androidx/compose/ui/graphics/Color
/*     */     //   2546: invokevirtual unbox-impl : ()J
/*     */     //   2549: aload #26
/*     */     //   2551: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2554: invokestatic background-bw27NRU : (Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;
/*     */     //   2557: astore #31
/*     */     //   2559: aload #4
/*     */     //   2561: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   2564: if_acmpne -> 2571
/*     */     //   2567: iconst_1
/*     */     //   2568: goto -> 2572
/*     */     //   2571: iconst_0
/*     */     //   2572: istore #32
/*     */     //   2574: iconst_0
/*     */     //   2575: istore #33
/*     */     //   2577: iload #32
/*     */     //   2579: ifeq -> 2651
/*     */     //   2582: aload #31
/*     */     //   2584: astore #34
/*     */     //   2586: iconst_0
/*     */     //   2587: istore #35
/*     */     //   2589: aload #34
/*     */     //   2591: aload #25
/*     */     //   2593: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2596: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   2599: aload #26
/*     */     //   2601: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2604: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2607: fconst_0
/*     */     //   2608: fconst_0
/*     */     //   2609: aload #13
/*     */     //   2611: sipush #3072
/*     */     //   2614: bipush #24
/*     */     //   2616: invokestatic focusOutline-AGcomas : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   2619: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Inside : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2622: aload #6
/*     */     //   2624: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2627: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   2630: aload #27
/*     */     //   2632: invokestatic EditableComboBox$lambda$27 : (Landroidx/compose/runtime/State;)J
/*     */     //   2635: aload #26
/*     */     //   2637: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2640: fconst_0
/*     */     //   2641: bipush #16
/*     */     //   2643: aconst_null
/*     */     //   2644: invokestatic border-QWjY48E$default : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FJLandroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2647: nop
/*     */     //   2648: goto -> 2653
/*     */     //   2651: aload #31
/*     */     //   2653: astore #30
/*     */     //   2655: aload #13
/*     */     //   2657: invokeinterface endReplaceGroup : ()V
/*     */     //   2662: aload #30
/*     */     //   2664: aload #25
/*     */     //   2666: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2669: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/ComboBoxState;
/*     */     //   2672: aload #4
/*     */     //   2674: aload #26
/*     */     //   2676: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   2679: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   2682: fconst_0
/*     */     //   2683: aload #13
/*     */     //   2685: sipush #24576
/*     */     //   2688: sipush #896
/*     */     //   2691: iload #17
/*     */     //   2693: bipush #6
/*     */     //   2695: ishr
/*     */     //   2696: iand
/*     */     //   2697: ior
/*     */     //   2698: bipush #16
/*     */     //   2700: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   2703: aload #6
/*     */     //   2705: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2708: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   2711: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   2714: fconst_0
/*     */     //   2715: iconst_2
/*     */     //   2716: aconst_null
/*     */     //   2717: invokestatic widthIn-VpY3zN4$default : (Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2720: aload #6
/*     */     //   2722: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   2725: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   2728: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   2731: invokestatic height-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   2734: aload #13
/*     */     //   2736: ldc_w 1452145748
/*     */     //   2739: invokeinterface startReplaceGroup : (I)V
/*     */     //   2744: aload #13
/*     */     //   2746: astore #31
/*     */     //   2748: aload #13
/*     */     //   2750: aload #29
/*     */     //   2752: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   2757: istore #32
/*     */     //   2759: nop
/*     */     //   2760: iconst_0
/*     */     //   2761: istore #33
/*     */     //   2763: aload #31
/*     */     //   2765: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2770: astore #34
/*     */     //   2772: iconst_0
/*     */     //   2773: istore #35
/*     */     //   2775: iload #32
/*     */     //   2777: ifne -> 2791
/*     */     //   2780: aload #34
/*     */     //   2782: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   2785: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   2788: if_acmpne -> 2824
/*     */     //   2791: astore #75
/*     */     //   2793: iconst_0
/*     */     //   2794: istore #36
/*     */     //   2796: aload #29
/*     */     //   2798: aload #28
/*     */     //   2800: <illegal opcode> invoke : (Landroidx/compose/ui/unit/Density;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   2805: aload #75
/*     */     //   2807: swap
/*     */     //   2808: astore #37
/*     */     //   2810: aload #31
/*     */     //   2812: aload #37
/*     */     //   2814: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2819: aload #37
/*     */     //   2821: goto -> 2826
/*     */     //   2824: aload #34
/*     */     //   2826: nop
/*     */     //   2827: nop
/*     */     //   2828: nop
/*     */     //   2829: checkcast kotlin/jvm/functions/Function1
/*     */     //   2832: astore #30
/*     */     //   2834: aload #13
/*     */     //   2836: invokeinterface endReplaceGroup : ()V
/*     */     //   2841: aload #30
/*     */     //   2843: invokestatic onSizeChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   2846: astore #30
/*     */     //   2848: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2851: invokevirtual getCenterStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2854: astore #31
/*     */     //   2856: bipush #48
/*     */     //   2858: istore #33
/*     */     //   2860: nop
/*     */     //   2861: iconst_0
/*     */     //   2862: istore #34
/*     */     //   2864: aload #13
/*     */     //   2866: ldc_w 733328855
/*     */     //   2869: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2872: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2875: iconst_0
/*     */     //   2876: istore #32
/*     */     //   2878: aload #31
/*     */     //   2880: iload #32
/*     */     //   2882: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2885: astore #35
/*     */     //   2887: bipush #112
/*     */     //   2889: iload #33
/*     */     //   2891: iconst_3
/*     */     //   2892: ishl
/*     */     //   2893: iand
/*     */     //   2894: istore #36
/*     */     //   2896: nop
/*     */     //   2897: iconst_0
/*     */     //   2898: istore #37
/*     */     //   2900: aload #13
/*     */     //   2902: ldc_w -1323940314
/*     */     //   2905: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2908: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2911: aload #13
/*     */     //   2913: iconst_0
/*     */     //   2914: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2917: istore #38
/*     */     //   2919: aload #13
/*     */     //   2921: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2926: astore #39
/*     */     //   2928: aload #13
/*     */     //   2930: aload #30
/*     */     //   2932: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2935: astore #40
/*     */     //   2937: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2940: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2943: astore #41
/*     */     //   2945: bipush #6
/*     */     //   2947: sipush #896
/*     */     //   2950: iload #36
/*     */     //   2952: bipush #6
/*     */     //   2954: ishl
/*     */     //   2955: iand
/*     */     //   2956: ior
/*     */     //   2957: istore #42
/*     */     //   2959: nop
/*     */     //   2960: iconst_0
/*     */     //   2961: istore #43
/*     */     //   2963: aload #13
/*     */     //   2965: ldc_w -692256719
/*     */     //   2968: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2971: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2974: aload #13
/*     */     //   2976: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2981: instanceof androidx/compose/runtime/Applier
/*     */     //   2984: ifne -> 2990
/*     */     //   2987: invokestatic invalidApplier : ()V
/*     */     //   2990: aload #13
/*     */     //   2992: invokeinterface startReusableNode : ()V
/*     */     //   2997: aload #13
/*     */     //   2999: invokeinterface getInserting : ()Z
/*     */     //   3004: ifeq -> 3019
/*     */     //   3007: aload #13
/*     */     //   3009: aload #41
/*     */     //   3011: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   3016: goto -> 3026
/*     */     //   3019: aload #13
/*     */     //   3021: invokeinterface useNode : ()V
/*     */     //   3026: aload #13
/*     */     //   3028: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   3031: astore #44
/*     */     //   3033: iconst_0
/*     */     //   3034: istore #45
/*     */     //   3036: aload #44
/*     */     //   3038: aload #35
/*     */     //   3040: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3043: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3046: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3049: aload #44
/*     */     //   3051: aload #39
/*     */     //   3053: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3056: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3059: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3062: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3065: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3068: astore #46
/*     */     //   3070: iconst_0
/*     */     //   3071: istore #47
/*     */     //   3073: aload #44
/*     */     //   3075: astore #48
/*     */     //   3077: iconst_0
/*     */     //   3078: istore #49
/*     */     //   3080: aload #48
/*     */     //   3082: invokeinterface getInserting : ()Z
/*     */     //   3087: ifne -> 3108
/*     */     //   3090: aload #48
/*     */     //   3092: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3097: iload #38
/*     */     //   3099: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3102: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   3105: ifne -> 3134
/*     */     //   3108: aload #48
/*     */     //   3110: iload #38
/*     */     //   3112: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3115: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3120: aload #44
/*     */     //   3122: iload #38
/*     */     //   3124: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   3127: aload #46
/*     */     //   3129: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3134: nop
/*     */     //   3135: nop
/*     */     //   3136: nop
/*     */     //   3137: aload #44
/*     */     //   3139: aload #40
/*     */     //   3141: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   3144: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   3147: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   3150: nop
/*     */     //   3151: nop
/*     */     //   3152: aload #13
/*     */     //   3154: bipush #14
/*     */     //   3156: iload #42
/*     */     //   3158: bipush #6
/*     */     //   3160: ishr
/*     */     //   3161: iand
/*     */     //   3162: istore #50
/*     */     //   3164: astore #51
/*     */     //   3166: iconst_0
/*     */     //   3167: istore #52
/*     */     //   3169: aload #51
/*     */     //   3171: ldc_w -2146769399
/*     */     //   3174: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   3177: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   3180: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   3183: aload #51
/*     */     //   3185: bipush #6
/*     */     //   3187: bipush #112
/*     */     //   3189: iload #33
/*     */     //   3191: bipush #6
/*     */     //   3193: ishr
/*     */     //   3194: iand
/*     */     //   3195: ior
/*     */     //   3196: istore #53
/*     */     //   3198: astore #54
/*     */     //   3200: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   3203: astore #55
/*     */     //   3205: iconst_0
/*     */     //   3206: istore #56
/*     */     //   3208: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   3211: aload #6
/*     */     //   3213: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   3216: aload #25
/*     */     //   3218: invokestatic EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   3221: aload #54
/*     */     //   3223: iconst_0
/*     */     //   3224: invokevirtual contentFor-zWq4Sqo : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   3227: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   3232: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   3235: ldc_w 1562002875
/*     */     //   3238: iconst_1
/*     */     //   3239: new org/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1
/*     */     //   3242: dup
/*     */     //   3243: aload #11
/*     */     //   3245: aload #25
/*     */     //   3247: aload #19
/*     */     //   3249: iload_2
/*     */     //   3250: aload_3
/*     */     //   3251: aload #23
/*     */     //   3253: aload #6
/*     */     //   3255: aload #7
/*     */     //   3257: aload #22
/*     */     //   3259: aload #8
/*     */     //   3261: aload #9
/*     */     //   3263: aload #10
/*     */     //   3265: aload #5
/*     */     //   3267: aload #24
/*     */     //   3269: aload #21
/*     */     //   3271: aload #20
/*     */     //   3273: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;ZLandroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
/*     */     //   3276: aload #54
/*     */     //   3278: bipush #54
/*     */     //   3280: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   3283: checkcast kotlin/jvm/functions/Function2
/*     */     //   3286: aload #54
/*     */     //   3288: bipush #48
/*     */     //   3290: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   3293: ior
/*     */     //   3294: invokestatic CompositionLocalProvider : (Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   3297: aload #54
/*     */     //   3299: ldc_w -1659969851
/*     */     //   3302: invokeinterface startReplaceGroup : (I)V
/*     */     //   3307: aload #19
/*     */     //   3309: invokestatic EditableComboBox$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   3312: ifeq -> 3751
/*     */     //   3315: aload_1
/*     */     //   3316: ldc_w 'Jewel.ComboBox.PopupMenu'
/*     */     //   3319: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   3322: iconst_0
/*     */     //   3323: aload #54
/*     */     //   3325: ldc_w -1659957903
/*     */     //   3328: invokeinterface startReplaceGroup : (I)V
/*     */     //   3333: aload #54
/*     */     //   3335: astore #57
/*     */     //   3337: iconst_0
/*     */     //   3338: istore #58
/*     */     //   3340: iconst_0
/*     */     //   3341: istore #59
/*     */     //   3343: aload #57
/*     */     //   3345: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3350: astore #60
/*     */     //   3352: iconst_0
/*     */     //   3353: istore #61
/*     */     //   3355: aload #60
/*     */     //   3357: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3360: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3363: if_acmpne -> 3402
/*     */     //   3366: istore #62
/*     */     //   3368: astore #63
/*     */     //   3370: iconst_0
/*     */     //   3371: istore #64
/*     */     //   3373: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   3378: astore #65
/*     */     //   3380: aload #63
/*     */     //   3382: iload #62
/*     */     //   3384: aload #65
/*     */     //   3386: astore #64
/*     */     //   3388: aload #57
/*     */     //   3390: aload #64
/*     */     //   3392: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3397: aload #64
/*     */     //   3399: goto -> 3404
/*     */     //   3402: aload #60
/*     */     //   3404: nop
/*     */     //   3405: nop
/*     */     //   3406: nop
/*     */     //   3407: checkcast kotlin/jvm/functions/Function1
/*     */     //   3410: astore #66
/*     */     //   3412: aload #54
/*     */     //   3414: invokeinterface endReplaceGroup : ()V
/*     */     //   3419: aload #66
/*     */     //   3421: iconst_1
/*     */     //   3422: aconst_null
/*     */     //   3423: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3426: aload #28
/*     */     //   3428: invokestatic EditableComboBox$lambda$29 : (Landroidx/compose/runtime/MutableState;)F
/*     */     //   3431: invokestatic width-3ABfNKs : (Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
/*     */     //   3434: iconst_0
/*     */     //   3435: aconst_null
/*     */     //   3436: aconst_null
/*     */     //   3437: aconst_null
/*     */     //   3438: aconst_null
/*     */     //   3439: aload #54
/*     */     //   3441: ldc_w -1659953735
/*     */     //   3444: invokeinterface startReplaceGroup : (I)V
/*     */     //   3449: aload #54
/*     */     //   3451: astore #57
/*     */     //   3453: iload #18
/*     */     //   3455: bipush #112
/*     */     //   3457: iand
/*     */     //   3458: bipush #32
/*     */     //   3460: if_icmpne -> 3467
/*     */     //   3463: iconst_1
/*     */     //   3464: goto -> 3468
/*     */     //   3467: iconst_0
/*     */     //   3468: istore #58
/*     */     //   3470: iconst_0
/*     */     //   3471: istore #59
/*     */     //   3473: aload #57
/*     */     //   3475: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3480: astore #60
/*     */     //   3482: iconst_0
/*     */     //   3483: istore #61
/*     */     //   3485: iload #58
/*     */     //   3487: ifne -> 3501
/*     */     //   3490: aload #60
/*     */     //   3492: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3495: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3498: if_acmpne -> 3557
/*     */     //   3501: astore #67
/*     */     //   3503: astore #68
/*     */     //   3505: astore #69
/*     */     //   3507: astore #65
/*     */     //   3509: istore #62
/*     */     //   3511: astore #63
/*     */     //   3513: iconst_0
/*     */     //   3514: istore #64
/*     */     //   3516: aload #11
/*     */     //   3518: aload #19
/*     */     //   3520: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   3525: astore #70
/*     */     //   3527: aload #63
/*     */     //   3529: iload #62
/*     */     //   3531: aload #65
/*     */     //   3533: aload #69
/*     */     //   3535: aload #68
/*     */     //   3537: aload #67
/*     */     //   3539: aload #70
/*     */     //   3541: astore #71
/*     */     //   3543: aload #57
/*     */     //   3545: aload #71
/*     */     //   3547: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3552: aload #71
/*     */     //   3554: goto -> 3559
/*     */     //   3557: aload #60
/*     */     //   3559: nop
/*     */     //   3560: nop
/*     */     //   3561: nop
/*     */     //   3562: checkcast kotlin/jvm/functions/Function0
/*     */     //   3565: astore #66
/*     */     //   3567: aload #54
/*     */     //   3569: invokeinterface endReplaceGroup : ()V
/*     */     //   3574: aload #66
/*     */     //   3576: bipush #31
/*     */     //   3578: aconst_null
/*     */     //   3579: invokestatic onClick$default : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/PointerMatcher;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   3582: astore #72
/*     */     //   3584: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   3587: invokevirtual getStart : ()Landroidx/compose/ui/Alignment$Horizontal;
/*     */     //   3590: astore #66
/*     */     //   3592: new androidx/compose/ui/window/PopupProperties
/*     */     //   3595: dup
/*     */     //   3596: iconst_0
/*     */     //   3597: iconst_0
/*     */     //   3598: iconst_0
/*     */     //   3599: iconst_0
/*     */     //   3600: bipush #14
/*     */     //   3602: aconst_null
/*     */     //   3603: invokespecial <init> : (ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   3606: astore #57
/*     */     //   3608: aload #54
/*     */     //   3610: ldc_w -1659967753
/*     */     //   3613: invokeinterface startReplaceGroup : (I)V
/*     */     //   3618: aload #54
/*     */     //   3620: astore #59
/*     */     //   3622: iload #18
/*     */     //   3624: bipush #112
/*     */     //   3626: iand
/*     */     //   3627: bipush #32
/*     */     //   3629: if_icmpne -> 3636
/*     */     //   3632: iconst_1
/*     */     //   3633: goto -> 3637
/*     */     //   3636: iconst_0
/*     */     //   3637: istore #60
/*     */     //   3639: nop
/*     */     //   3640: iconst_0
/*     */     //   3641: istore #61
/*     */     //   3643: aload #59
/*     */     //   3645: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   3650: astore #64
/*     */     //   3652: iconst_0
/*     */     //   3653: istore #71
/*     */     //   3655: iload #60
/*     */     //   3657: ifne -> 3671
/*     */     //   3660: aload #64
/*     */     //   3662: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   3665: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   3668: if_acmpne -> 3703
/*     */     //   3671: iconst_0
/*     */     //   3672: istore #73
/*     */     //   3674: aload #20
/*     */     //   3676: aload #21
/*     */     //   3678: aload #11
/*     */     //   3680: aload #19
/*     */     //   3682: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   3687: astore #74
/*     */     //   3689: aload #59
/*     */     //   3691: aload #74
/*     */     //   3693: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   3698: aload #74
/*     */     //   3700: goto -> 3705
/*     */     //   3703: aload #64
/*     */     //   3705: nop
/*     */     //   3706: nop
/*     */     //   3707: nop
/*     */     //   3708: checkcast kotlin/jvm/functions/Function0
/*     */     //   3711: astore #58
/*     */     //   3713: aload #54
/*     */     //   3715: invokeinterface endReplaceGroup : ()V
/*     */     //   3720: aload #58
/*     */     //   3722: aload #66
/*     */     //   3724: aload #72
/*     */     //   3726: aconst_null
/*     */     //   3727: aload #57
/*     */     //   3729: aload #12
/*     */     //   3731: aload #54
/*     */     //   3733: sipush #24624
/*     */     //   3736: ldc_w 458752
/*     */     //   3739: iload #18
/*     */     //   3741: bipush #9
/*     */     //   3743: ishl
/*     */     //   3744: iand
/*     */     //   3745: ior
/*     */     //   3746: bipush #8
/*     */     //   3748: invokestatic PopupContainer : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/PopupContainerStyle;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
/*     */     //   3751: aload #54
/*     */     //   3753: invokeinterface endReplaceGroup : ()V
/*     */     //   3758: nop
/*     */     //   3759: aload #51
/*     */     //   3761: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3764: aload #13
/*     */     //   3766: invokeinterface endNode : ()V
/*     */     //   3771: aload #13
/*     */     //   3773: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3776: nop
/*     */     //   3777: aload #13
/*     */     //   3779: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3782: nop
/*     */     //   3783: aload #13
/*     */     //   3785: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   3788: nop
/*     */     //   3789: invokestatic isTraceInProgress : ()Z
/*     */     //   3792: ifeq -> 3808
/*     */     //   3795: invokestatic traceEventEnd : ()V
/*     */     //   3798: goto -> 3808
/*     */     //   3801: aload #13
/*     */     //   3803: invokeinterface skipToGroupEnd : ()V
/*     */     //   3808: aload #13
/*     */     //   3810: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   3815: dup
/*     */     //   3816: ifnull -> 3860
/*     */     //   3819: aload_0
/*     */     //   3820: aload_1
/*     */     //   3821: iload_2
/*     */     //   3822: aload_3
/*     */     //   3823: aload #4
/*     */     //   3825: aload #5
/*     */     //   3827: aload #6
/*     */     //   3829: aload #7
/*     */     //   3831: aload #8
/*     */     //   3833: aload #9
/*     */     //   3835: aload #10
/*     */     //   3837: aload #11
/*     */     //   3839: aload #12
/*     */     //   3841: iload #14
/*     */     //   3843: iload #15
/*     */     //   3845: iload #16
/*     */     //   3847: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;III)Lkotlin/jvm/functions/Function2;
/*     */     //   3852: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   3857: goto -> 3861
/*     */     //   3860: pop
/*     */     //   3861: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 7
/*     */     //   #80	-> 719
/*     */     //   #81	-> 733
/*     */     //   #82	-> 747
/*     */     //   #83	-> 757
/*     */     //   #84	-> 783
/*     */     //   #85	-> 796
/*     */     //   #401	-> 815
/*     */     //   #402	-> 827
/*     */     //   #403	-> 838
/*     */     //   #85	-> 841
/*     */     //   #403	-> 844
/*     */     //   #404	-> 846
/*     */     //   #405	-> 855
/*     */     //   #406	-> 860
/*     */     //   #402	-> 862
/*     */     //   #401	-> 863
/*     */     //   #401	-> 864
/*     */     //   #85	-> 865
/*     */     //   #86	-> 889
/*     */     //   #87	-> 917
/*     */     //   #88	-> 945
/*     */     //   #407	-> 964
/*     */     //   #408	-> 976
/*     */     //   #409	-> 987
/*     */     //   #409	-> 995
/*     */     //   #410	-> 997
/*     */     //   #411	-> 1006
/*     */     //   #412	-> 1011
/*     */     //   #408	-> 1013
/*     */     //   #407	-> 1014
/*     */     //   #407	-> 1015
/*     */     //   #88	-> 1016
/*     */     //   #89	-> 1041
/*     */     //   #413	-> 1060
/*     */     //   #414	-> 1072
/*     */     //   #415	-> 1083
/*     */     //   #415	-> 1091
/*     */     //   #416	-> 1093
/*     */     //   #417	-> 1102
/*     */     //   #418	-> 1107
/*     */     //   #414	-> 1109
/*     */     //   #413	-> 1110
/*     */     //   #413	-> 1111
/*     */     //   #89	-> 1112
/*     */     //   #90	-> 1137
/*     */     //   #419	-> 1156
/*     */     //   #420	-> 1168
/*     */     //   #421	-> 1179
/*     */     //   #421	-> 1187
/*     */     //   #422	-> 1189
/*     */     //   #423	-> 1198
/*     */     //   #424	-> 1203
/*     */     //   #420	-> 1205
/*     */     //   #419	-> 1206
/*     */     //   #419	-> 1207
/*     */     //   #90	-> 1208
/*     */     //   #91	-> 1233
/*     */     //   #425	-> 1252
/*     */     //   #426	-> 1264
/*     */     //   #427	-> 1275
/*     */     //   #427	-> 1283
/*     */     //   #428	-> 1285
/*     */     //   #429	-> 1294
/*     */     //   #430	-> 1299
/*     */     //   #426	-> 1301
/*     */     //   #425	-> 1302
/*     */     //   #425	-> 1303
/*     */     //   #91	-> 1304
/*     */     //   #93	-> 1398
/*     */     //   #94	-> 1417
/*     */     //   #431	-> 1421
/*     */     //   #432	-> 1433
/*     */     //   #433	-> 1444
/*     */     //   #94	-> 1447
/*     */     //   #433	-> 1457
/*     */     //   #434	-> 1459
/*     */     //   #435	-> 1468
/*     */     //   #436	-> 1473
/*     */     //   #432	-> 1475
/*     */     //   #431	-> 1476
/*     */     //   #431	-> 1477
/*     */     //   #94	-> 1478
/*     */     //   #95	-> 1510
/*     */     //   #437	-> 1514
/*     */     //   #438	-> 1526
/*     */     //   #439	-> 1537
/*     */     //   #95	-> 1540
/*     */     //   #439	-> 1550
/*     */     //   #440	-> 1552
/*     */     //   #441	-> 1561
/*     */     //   #442	-> 1566
/*     */     //   #438	-> 1568
/*     */     //   #437	-> 1569
/*     */     //   #437	-> 1570
/*     */     //   #95	-> 1571
/*     */     //   #96	-> 1603
/*     */     //   #443	-> 1607
/*     */     //   #444	-> 1619
/*     */     //   #445	-> 1630
/*     */     //   #96	-> 1633
/*     */     //   #445	-> 1643
/*     */     //   #446	-> 1645
/*     */     //   #447	-> 1654
/*     */     //   #448	-> 1659
/*     */     //   #444	-> 1661
/*     */     //   #443	-> 1662
/*     */     //   #443	-> 1663
/*     */     //   #96	-> 1664
/*     */     //   #98	-> 1696
/*     */     //   #449	-> 1700
/*     */     //   #450	-> 1712
/*     */     //   #451	-> 1723
/*     */     //   #98	-> 1726
/*     */     //   #451	-> 1729
/*     */     //   #452	-> 1731
/*     */     //   #453	-> 1740
/*     */     //   #454	-> 1745
/*     */     //   #450	-> 1747
/*     */     //   #449	-> 1748
/*     */     //   #449	-> 1749
/*     */     //   #98	-> 1750
/*     */     //   #99	-> 1782
/*     */     //   #455	-> 1786
/*     */     //   #456	-> 1798
/*     */     //   #457	-> 1809
/*     */     //   #99	-> 1812
/*     */     //   #457	-> 1819
/*     */     //   #458	-> 1821
/*     */     //   #459	-> 1830
/*     */     //   #460	-> 1835
/*     */     //   #456	-> 1837
/*     */     //   #455	-> 1838
/*     */     //   #455	-> 1839
/*     */     //   #99	-> 1840
/*     */     //   #110	-> 1886
/*     */     //   #461	-> 1890
/*     */     //   #462	-> 1902
/*     */     //   #463	-> 1918
/*     */     //   #110	-> 1921
/*     */     //   #463	-> 1932
/*     */     //   #464	-> 1934
/*     */     //   #465	-> 1943
/*     */     //   #466	-> 1948
/*     */     //   #462	-> 1950
/*     */     //   #461	-> 1951
/*     */     //   #461	-> 1952
/*     */     //   #110	-> 1953
/*     */     //   #115	-> 1985
/*     */     //   #467	-> 1989
/*     */     //   #468	-> 2001
/*     */     //   #469	-> 2012
/*     */     //   #115	-> 2015
/*     */     //   #469	-> 2038
/*     */     //   #470	-> 2040
/*     */     //   #471	-> 2049
/*     */     //   #472	-> 2054
/*     */     //   #468	-> 2056
/*     */     //   #467	-> 2057
/*     */     //   #467	-> 2058
/*     */     //   #115	-> 2059
/*     */     //   #117	-> 2107
/*     */     //   #473	-> 2111
/*     */     //   #474	-> 2123
/*     */     //   #475	-> 2139
/*     */     //   #117	-> 2142
/*     */     //   #475	-> 2166
/*     */     //   #476	-> 2168
/*     */     //   #477	-> 2177
/*     */     //   #478	-> 2182
/*     */     //   #474	-> 2184
/*     */     //   #473	-> 2185
/*     */     //   #473	-> 2186
/*     */     //   #119	-> 2195
/*     */     //   #479	-> 2232
/*     */     //   #480	-> 2244
/*     */     //   #481	-> 2260
/*     */     //   #119	-> 2265
/*     */     //   #481	-> 2283
/*     */     //   #482	-> 2285
/*     */     //   #483	-> 2294
/*     */     //   #484	-> 2299
/*     */     //   #480	-> 2301
/*     */     //   #479	-> 2302
/*     */     //   #479	-> 2303
/*     */     //   #119	-> 2304
/*     */     //   #131	-> 2331
/*     */     //   #132	-> 2344
/*     */     //   #133	-> 2379
/*     */     //   #485	-> 2383
/*     */     //   #486	-> 2395
/*     */     //   #487	-> 2406
/*     */     //   #133	-> 2409
/*     */     //   #487	-> 2424
/*     */     //   #488	-> 2426
/*     */     //   #489	-> 2435
/*     */     //   #490	-> 2440
/*     */     //   #486	-> 2442
/*     */     //   #485	-> 2443
/*     */     //   #485	-> 2444
/*     */     //   #133	-> 2445
/*     */     //   #134	-> 2461
/*     */     //   #491	-> 2483
/*     */     //   #134	-> 2504
/*     */     //   #138	-> 2519
/*     */     //   #139	-> 2520
/*     */     //   #140	-> 2559
/*     */     //   #492	-> 2577
/*     */     //   #141	-> 2589
/*     */     //   #143	-> 2619
/*     */     //   #144	-> 2622
/*     */     //   #145	-> 2630
/*     */     //   #146	-> 2635
/*     */     //   #142	-> 2640
/*     */     //   #147	-> 2647
/*     */     //   #492	-> 2648
/*     */     //   #140	-> 2653
/*     */     //   #150	-> 2664
/*     */     //   #151	-> 2672
/*     */     //   #152	-> 2674
/*     */     //   #153	-> 2679
/*     */     //   #149	-> 2700
/*     */     //   #155	-> 2703
/*     */     //   #156	-> 2720
/*     */     //   #157	-> 2759
/*     */     //   #493	-> 2763
/*     */     //   #494	-> 2775
/*     */     //   #495	-> 2791
/*     */     //   #157	-> 2796
/*     */     //   #495	-> 2808
/*     */     //   #496	-> 2810
/*     */     //   #497	-> 2819
/*     */     //   #498	-> 2824
/*     */     //   #494	-> 2826
/*     */     //   #493	-> 2827
/*     */     //   #493	-> 2828
/*     */     //   #157	-> 2829
/*     */     //   #158	-> 2848
/*     */     //   #136	-> 2860
/*     */     //   #499	-> 2872
/*     */     //   #500	-> 2875
/*     */     //   #503	-> 2878
/*     */     //   #504	-> 2896
/*     */     //   #505	-> 2908
/*     */     //   #506	-> 2914
/*     */     //   #507	-> 2921
/*     */     //   #508	-> 2930
/*     */     //   #510	-> 2937
/*     */     //   #509	-> 2959
/*     */     //   #511	-> 2971
/*     */     //   #512	-> 2974
/*     */     //   #513	-> 2992
/*     */     //   #514	-> 2997
/*     */     //   #515	-> 3009
/*     */     //   #517	-> 3021
/*     */     //   #519	-> 3026
/*     */     //   #520	-> 3036
/*     */     //   #521	-> 3049
/*     */     //   #523	-> 3062
/*     */     //   #524	-> 3073
/*     */     //   #525	-> 3080
/*     */     //   #526	-> 3108
/*     */     //   #527	-> 3120
/*     */     //   #529	-> 3134
/*     */     //   #524	-> 3135
/*     */     //   #529	-> 3136
/*     */     //   #530	-> 3137
/*     */     //   #531	-> 3150
/*     */     //   #519	-> 3151
/*     */     //   #532	-> 3152
/*     */     //   #533	-> 3177
/*     */     //   #160	-> 3208
/*     */     //   #200	-> 3307
/*     */     //   #208	-> 3315
/*     */     //   #209	-> 3316
/*     */     //   #210	-> 3322
/*     */     //   #534	-> 3343
/*     */     //   #535	-> 3355
/*     */     //   #536	-> 3366
/*     */     //   #536	-> 3386
/*     */     //   #537	-> 3388
/*     */     //   #538	-> 3397
/*     */     //   #539	-> 3402
/*     */     //   #535	-> 3404
/*     */     //   #534	-> 3405
/*     */     //   #534	-> 3406
/*     */     //   #210	-> 3407
/*     */     //   #211	-> 3426
/*     */     //   #212	-> 3434
/*     */     //   #540	-> 3473
/*     */     //   #541	-> 3485
/*     */     //   #542	-> 3501
/*     */     //   #212	-> 3516
/*     */     //   #542	-> 3541
/*     */     //   #543	-> 3543
/*     */     //   #544	-> 3552
/*     */     //   #545	-> 3557
/*     */     //   #541	-> 3559
/*     */     //   #540	-> 3560
/*     */     //   #540	-> 3561
/*     */     //   #212	-> 3562
/*     */     //   #213	-> 3584
/*     */     //   #214	-> 3592
/*     */     //   #202	-> 3639
/*     */     //   #546	-> 3643
/*     */     //   #547	-> 3655
/*     */     //   #548	-> 3671
/*     */     //   #202	-> 3674
/*     */     //   #548	-> 3687
/*     */     //   #549	-> 3689
/*     */     //   #550	-> 3698
/*     */     //   #551	-> 3703
/*     */     //   #547	-> 3705
/*     */     //   #546	-> 3706
/*     */     //   #546	-> 3707
/*     */     //   #202	-> 3708
/*     */     //   #213	-> 3722
/*     */     //   #212	-> 3724
/*     */     //   #214	-> 3727
/*     */     //   #215	-> 3729
/*     */     //   #201	-> 3748
/*     */     //   #218	-> 3758
/*     */     //   #533	-> 3759
/*     */     //   #532	-> 3764
/*     */     //   #552	-> 3766
/*     */     //   #511	-> 3773
/*     */     //   #553	-> 3776
/*     */     //   #505	-> 3779
/*     */     //   #554	-> 3782
/*     */     //   #499	-> 3785
/*     */     //   #555	-> 3788
/*     */     //   #219	-> 3801
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   841	3	25	$i$a$-cache-EditableComboBoxKt$EditableComboBox$1	I
/*     */     //   846	11	25	value$iv	Ljava/lang/Object;
/*     */     //   827	36	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   824	39	23	it$iv	Ljava/lang/Object;
/*     */     //   815	50	22	$i$f$cache	I
/*     */     //   812	53	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   812	53	21	invalid$iv	Z
/*     */     //   990	5	25	$i$a$-cache-EditableComboBoxKt$EditableComboBox$2	I
/*     */     //   997	11	25	value$iv	Ljava/lang/Object;
/*     */     //   976	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   973	41	23	it$iv	Ljava/lang/Object;
/*     */     //   964	52	22	$i$f$cache	I
/*     */     //   961	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   961	55	21	invalid$iv	Z
/*     */     //   1086	5	25	$i$a$-cache-EditableComboBoxKt$EditableComboBox$3	I
/*     */     //   1093	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1072	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1069	41	23	it$iv	Ljava/lang/Object;
/*     */     //   1060	52	22	$i$f$cache	I
/*     */     //   1057	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1057	55	21	invalid$iv	Z
/*     */     //   1182	5	25	$i$a$-cache-EditableComboBoxKt$EditableComboBox$4	I
/*     */     //   1189	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1168	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1165	41	23	it$iv	Ljava/lang/Object;
/*     */     //   1156	52	22	$i$f$cache	I
/*     */     //   1153	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1153	55	21	invalid$iv	Z
/*     */     //   1278	5	25	$i$a$-cache-EditableComboBoxKt$EditableComboBox$5	I
/*     */     //   1285	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1264	38	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1261	41	23	it$iv	Ljava/lang/Object;
/*     */     //   1252	52	22	$i$f$cache	I
/*     */     //   1249	55	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1249	55	21	invalid$iv	Z
/*     */     //   1447	10	26	$i$a$-cache-EditableComboBoxKt$EditableComboBox$popupExpanded$2	I
/*     */     //   1459	11	26	value$iv	Ljava/lang/Object;
/*     */     //   1433	43	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1430	46	24	it$iv	Ljava/lang/Object;
/*     */     //   1421	57	23	$i$f$cache	I
/*     */     //   1418	60	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1418	60	22	invalid$iv	Z
/*     */     //   1540	10	27	$i$a$-cache-EditableComboBoxKt$EditableComboBox$chevronHovered$2	I
/*     */     //   1552	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1526	43	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1523	46	25	it$iv	Ljava/lang/Object;
/*     */     //   1514	57	24	$i$f$cache	I
/*     */     //   1511	60	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1511	60	23	invalid$iv	Z
/*     */     //   1633	10	28	$i$a$-cache-EditableComboBoxKt$EditableComboBox$textFieldHovered$2	I
/*     */     //   1645	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1619	43	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1616	46	26	it$iv	Ljava/lang/Object;
/*     */     //   1607	57	25	$i$f$cache	I
/*     */     //   1604	60	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1604	60	24	invalid$iv	Z
/*     */     //   1726	3	29	$i$a$-cache-EditableComboBoxKt$EditableComboBox$textFieldInteractionSource$1	I
/*     */     //   1731	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1712	36	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1709	39	27	it$iv	Ljava/lang/Object;
/*     */     //   1700	50	26	$i$f$cache	I
/*     */     //   1697	53	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1697	53	25	invalid$iv	Z
/*     */     //   1812	7	30	$i$a$-cache-EditableComboBoxKt$EditableComboBox$textFieldFocusRequester$1	I
/*     */     //   1821	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1798	40	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1795	43	28	it$iv	Ljava/lang/Object;
/*     */     //   1786	54	27	$i$f$cache	I
/*     */     //   1783	57	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1783	57	26	invalid$iv	Z
/*     */     //   1921	11	31	$i$a$-cache-EditableComboBoxKt$EditableComboBox$onPressWhenEnabled$1	I
/*     */     //   1934	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1902	49	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1899	52	29	it$iv	Ljava/lang/Object;
/*     */     //   1890	63	28	$i$f$cache	I
/*     */     //   1887	66	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1887	66	27	invalid$iv	Z
/*     */     //   2015	23	32	$i$a$-cache-EditableComboBoxKt$EditableComboBox$comboBoxState$2	I
/*     */     //   2040	11	33	value$iv	Ljava/lang/Object;
/*     */     //   2001	56	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1998	59	30	it$iv	Ljava/lang/Object;
/*     */     //   1989	70	29	$i$f$cache	I
/*     */     //   1986	73	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1986	73	28	invalid$iv	Z
/*     */     //   2142	21	31	$i$a$-cache-EditableComboBoxKt$EditableComboBox$6	I
/*     */     //   2168	11	32	value$iv	Ljava/lang/Object;
/*     */     //   2123	62	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2120	65	29	it$iv	Ljava/lang/Object;
/*     */     //   2111	76	28	$i$f$cache	I
/*     */     //   2108	79	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2108	79	27	invalid$iv	Z
/*     */     //   2265	15	32	$i$a$-cache-EditableComboBoxKt$EditableComboBox$7	I
/*     */     //   2285	11	33	value$iv	Ljava/lang/Object;
/*     */     //   2244	58	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2241	61	30	it$iv	Ljava/lang/Object;
/*     */     //   2232	72	29	$i$f$cache	I
/*     */     //   2229	75	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2229	75	28	invalid$iv	Z
/*     */     //   2409	15	35	$i$a$-cache-EditableComboBoxKt$EditableComboBox$comboBoxWidth$2	I
/*     */     //   2426	11	35	value$iv	Ljava/lang/Object;
/*     */     //   2395	48	34	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2392	51	33	it$iv	Ljava/lang/Object;
/*     */     //   2383	62	32	$i$f$cache	I
/*     */     //   2380	65	30	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2380	65	31	invalid$iv	Z
/*     */     //   2475	29	32	$i$f$getCurrent	I
/*     */     //   2472	32	30	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   2472	32	31	$changed$iv	I
/*     */     //   2589	59	35	$i$a$-thenIf-EditableComboBoxKt$EditableComboBox$8	I
/*     */     //   2586	62	34	$this$EditableComboBox_u24lambda_u2431	Landroidx/compose/ui/Modifier;
/*     */     //   2577	76	33	$i$f$thenIf	I
/*     */     //   2574	79	31	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2574	79	32	precondition$iv	Z
/*     */     //   2796	9	36	$i$a$-cache-EditableComboBoxKt$EditableComboBox$9	I
/*     */     //   2810	11	37	value$iv	Ljava/lang/Object;
/*     */     //   2775	52	35	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   2772	55	34	it$iv	Ljava/lang/Object;
/*     */     //   2763	66	33	$i$f$cache	I
/*     */     //   2760	69	31	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2760	69	32	invalid$iv	Z
/*     */     //   3373	5	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$2	I
/*     */     //   3388	11	64	value$iv	Ljava/lang/Object;
/*     */     //   3355	50	61	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3352	53	60	it$iv	Ljava/lang/Object;
/*     */     //   3343	64	59	$i$f$cache	I
/*     */     //   3340	67	57	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3340	67	58	invalid$iv	Z
/*     */     //   3516	9	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$3	I
/*     */     //   3543	11	71	value$iv	Ljava/lang/Object;
/*     */     //   3485	75	61	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3482	78	60	it$iv	Ljava/lang/Object;
/*     */     //   3473	89	59	$i$f$cache	I
/*     */     //   3470	92	57	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3470	92	58	invalid$iv	Z
/*     */     //   3674	13	73	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$4	I
/*     */     //   3689	11	74	value$iv	Ljava/lang/Object;
/*     */     //   3655	51	71	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   3652	54	64	it$iv	Ljava/lang/Object;
/*     */     //   3643	65	61	$i$f$cache	I
/*     */     //   3640	68	59	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3640	68	60	invalid$iv	Z
/*     */     //   3208	551	56	$i$a$-Box-EditableComboBoxKt$EditableComboBox$10	I
/*     */     //   3205	554	55	$this$EditableComboBox_u24lambda_u2441	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   3205	554	54	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   3205	554	53	$changed	I
/*     */     //   3169	595	52	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   3166	598	51	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3166	598	50	$changed$iv	I
/*     */     //   3080	55	49	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   3077	58	48	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   3073	64	47	$i$f$set-impl	I
/*     */     //   3070	67	46	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   3036	115	45	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   3033	118	44	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2963	814	43	$i$f$ReusableComposeNode	I
/*     */     //   2960	817	41	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2960	817	42	$changed$iv$iv$iv	I
/*     */     //   2900	883	37	$i$f$Layout	I
/*     */     //   2919	864	38	compositeKeyHash$iv$iv	I
/*     */     //   2928	855	39	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2937	846	40	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2897	886	36	$changed$iv$iv	I
/*     */     //   2864	925	34	$i$f$Box	I
/*     */     //   2887	902	35	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2861	928	30	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2861	928	31	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2878	911	32	propagateMinConstraints$iv	Z
/*     */     //   2861	928	33	$changed$iv	I
/*     */     //   1494	2304	19	popupExpanded$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1587	2211	20	chevronHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1680	2118	21	textFieldHovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1766	2032	22	textFieldInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1856	1942	23	textFieldFocusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   1969	1829	24	onPressWhenEnabled	Lkotlin/jvm/functions/Function0;
/*     */     //   2075	1723	25	comboBoxState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   2344	1454	26	shape	Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   2362	1436	27	borderColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   2461	1337	28	comboBoxWidth$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   2509	1289	29	density	Landroidx/compose/ui/unit/Density;
/*     */     //   22	3840	17	$dirty	I
/*     */     //   26	3836	18	$dirty1	I
/*     */     //   0	3862	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	3862	1	menuModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	3862	2	isEnabled	Z
/*     */     //   0	3862	3	inputTextFieldState	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	3862	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	3862	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	3862	6	style	Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   0	3862	7	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	3862	8	onArrowDownPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3862	9	onArrowUpPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3862	10	onEnterPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3862	11	onPopupStateChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	3862	12	popupContent	Lkotlin/jvm/functions/Function2;
/*     */     //   0	3862	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	3862	14	$changed	I
/*     */     //   0	3862	15	$changed1	I }
/*  94 */   private static final boolean EditableComboBox$lambda$10(MutableState $popupExpanded$delegate) { State state = (State)$popupExpanded$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 672 */       (Boolean)state.getValue()).booleanValue(); } private static final void EditableComboBox$lambda$11(MutableState $popupExpanded$delegate, boolean <set-?>) { MutableState mutableState = $popupExpanded$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 673 */     mutableState.setValue(value$iv); } private static final boolean EditableComboBox$lambda$13(MutableState $chevronHovered$delegate) { State state = (State)$chevronHovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 675 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void EditableComboBox$lambda$14(MutableState $chevronHovered$delegate, boolean <set-?>) { MutableState mutableState = $chevronHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 676 */     mutableState.setValue(value$iv); } private static final boolean EditableComboBox$lambda$16(MutableState $textFieldHovered$delegate) { State state = (State)$textFieldHovered$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 678 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void EditableComboBox$lambda$17(MutableState $textFieldHovered$delegate, boolean <set-?>) { MutableState mutableState = $textFieldHovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 679 */     mutableState.setValue(value$iv); } private static final void EditableComboBox$setPopupExpanded(Function1 $onPopupStateChange, MutableState<Boolean> popupExpanded$delegate, boolean expanded) { EditableComboBox$lambda$11(popupExpanded$delegate, expanded); $onPopupStateChange.invoke(Boolean.valueOf(expanded)); } private static final void EditableComboBox$togglePopup(MutableState<Boolean> popupExpanded$delegate, Function1<? super Boolean, Unit> $onPopupStateChange) { EditableComboBox$setPopupExpanded($onPopupStateChange, popupExpanded$delegate, !EditableComboBox$lambda$10(popupExpanded$delegate)); }
/*     */   private static final Unit EditableComboBox$lambda$21$lambda$20(FocusRequester $textFieldFocusRequester, MutableState<Boolean> $popupExpanded$delegate, Function1<? super Boolean, Unit> $onPopupStateChange) { EditableComboBox$togglePopup($popupExpanded$delegate, $onPopupStateChange); $textFieldFocusRequester.requestFocus(); return Unit.INSTANCE; }
/* 681 */   private static final long EditableComboBox$lambda$23(MutableState $comboBoxState$delegate) { State state = (State)$comboBoxState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((ComboBoxState)state.getValue()).unbox-impl(); } private static final void EditableComboBox$lambda$24(MutableState $comboBoxState$delegate, long <set-?>) { MutableState mutableState = $comboBoxState$delegate; Object object1 = null, object2 = null; Object value$iv = ComboBoxState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 682 */     mutableState.setValue(value$iv); } private static final long EditableComboBox$lambda$27(State $borderColor$delegate) { State state = $borderColor$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 684 */     return ((Color)state.getValue()).unbox-impl(); } @DebugMetadata(f = "EditableComboBox.kt", l = {120}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.EditableComboBoxKt$EditableComboBox$7$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class EditableComboBoxKt$EditableComboBox$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/* 685 */     int label; EditableComboBoxKt$EditableComboBox$7$1(MutableInteractionSource $interactionSource, MutableState<ComboBoxState> $comboBoxState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$comboBoxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, true, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 27, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, true, false, 23, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { EditableComboBoxKt.EditableComboBox$lambda$24(this.$comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23(this.$comboBoxState$delegate), false, false, false, false, false, 23, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super EditableComboBoxKt$EditableComboBox$7$1> $completion) { return (Continuation<Unit>)new EditableComboBoxKt$EditableComboBox$7$1(this.$interactionSource, this.$comboBoxState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((EditableComboBoxKt$EditableComboBox$7$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final float EditableComboBox$lambda$29(MutableState $comboBoxWidth$delegate) { State state = (State)$comboBoxWidth$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Dp)state.getValue()).unbox-impl(); } private static final void EditableComboBox$lambda$30(MutableState $comboBoxWidth$delegate, float <set-?>) { MutableState mutableState = $comboBoxWidth$delegate; Object object1 = null, object2 = null; Object value$iv = Dp.box-impl(<set-?>); int $i$f$setValue = 0;
/* 686 */     mutableState.setValue(value$iv); } private static final Unit EditableComboBox$lambda$34$lambda$33(Density $density, MutableState<Dp> $comboBoxWidth$delegate, IntSize it) {
/*     */     Density density = $density;
/* 688 */     MutableState<Dp> mutableState = $comboBoxWidth$delegate; int $i$a$-with-EditableComboBoxKt$EditableComboBox$9$1$1 = 0;
/*     */     float f = density.toDp-u2uoSUM(IntSize.getWidth-impl(it.unbox-impl()));
/*     */     EditableComboBox$lambda$30(mutableState, f);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nEditableComboBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,400:1\n1225#2,6:401\n1225#2,6:443\n1225#2,6:449\n1225#2,6:455\n1225#2,6:461\n1225#2,6:467\n99#3:407\n96#3,6:408\n102#3:442\n106#3:476\n79#4,6:414\n86#4,4:429\n90#4,2:439\n94#4:475\n368#5,9:420\n377#5:441\n378#5,2:473\n4034#6,6:433\n*S KotlinDebug\n*F\n+ 1 EditableComboBox.kt\norg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1\n*L\n163#1:401,6\n183#1:443,6\n184#1:449,6\n185#1:455,6\n193#1:461,6\n194#1:467,6\n161#1:407\n161#1:408,6\n161#1:442\n161#1:476\n161#1:414,6\n161#1:429,4\n161#1:439,2\n161#1:475\n161#1:420,9\n161#1:441\n161#1:473,2\n161#1:433,6\n*E\n"})
/*     */   static final class EditableComboBoxKt$EditableComboBox$10$1 implements Function2<Composer, Integer, Unit> {
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
/*     */       //   13: ifne -> 1390
/*     */       //   16: invokestatic isTraceInProgress : ()Z
/*     */       //   19: ifeq -> 31
/*     */       //   22: ldc 1562002875
/*     */       //   24: iload_2
/*     */       //   25: iconst_m1
/*     */       //   26: ldc 'org.jetbrains.jewel.ui.component.EditableComboBox.<anonymous>.<anonymous> (EditableComboBox.kt:160)'
/*     */       //   28: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   31: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   34: checkcast androidx/compose/ui/Modifier
/*     */       //   37: aload_1
/*     */       //   38: ldc -1224362974
/*     */       //   40: invokeinterface startReplaceGroup : (I)V
/*     */       //   45: aload_1
/*     */       //   46: astore #4
/*     */       //   48: aload_1
/*     */       //   49: aload_0
/*     */       //   50: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */       //   53: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */       //   58: istore #5
/*     */       //   60: aload_0
/*     */       //   61: getfield $comboBoxState$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   64: astore #6
/*     */       //   66: aload_0
/*     */       //   67: getfield $onPopupStateChange : Lkotlin/jvm/functions/Function1;
/*     */       //   70: astore #7
/*     */       //   72: aload_0
/*     */       //   73: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   76: astore #8
/*     */       //   78: iconst_0
/*     */       //   79: istore #9
/*     */       //   81: aload #4
/*     */       //   83: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   88: astore #10
/*     */       //   90: iconst_0
/*     */       //   91: istore #11
/*     */       //   93: iload #5
/*     */       //   95: ifne -> 109
/*     */       //   98: aload #10
/*     */       //   100: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   103: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   106: if_acmpne -> 144
/*     */       //   109: astore #71
/*     */       //   111: iconst_0
/*     */       //   112: istore #12
/*     */       //   114: aload #6
/*     */       //   116: aload #7
/*     */       //   118: aload #8
/*     */       //   120: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   125: aload #71
/*     */       //   127: swap
/*     */       //   128: astore #13
/*     */       //   130: aload #4
/*     */       //   132: aload #13
/*     */       //   134: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   139: aload #13
/*     */       //   141: goto -> 146
/*     */       //   144: aload #10
/*     */       //   146: nop
/*     */       //   147: nop
/*     */       //   148: nop
/*     */       //   149: checkcast kotlin/jvm/functions/Function1
/*     */       //   152: astore_3
/*     */       //   153: aload_1
/*     */       //   154: invokeinterface endReplaceGroup : ()V
/*     */       //   159: aload_3
/*     */       //   160: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   163: astore_3
/*     */       //   164: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */       //   167: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   170: astore #5
/*     */       //   172: aload_0
/*     */       //   173: getfield $isEnabled : Z
/*     */       //   176: istore #6
/*     */       //   178: aload_0
/*     */       //   179: getfield $inputTextFieldState : Landroidx/compose/foundation/text/input/TextFieldState;
/*     */       //   182: astore #7
/*     */       //   184: aload_0
/*     */       //   185: getfield $textFieldFocusRequester : Landroidx/compose/ui/focus/FocusRequester;
/*     */       //   188: astore #8
/*     */       //   190: aload_0
/*     */       //   191: getfield $style : Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */       //   194: astore #9
/*     */       //   196: aload_0
/*     */       //   197: getfield $textStyle : Landroidx/compose/ui/text/TextStyle;
/*     */       //   200: astore #10
/*     */       //   202: aload_0
/*     */       //   203: getfield $textFieldInteractionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   206: astore #11
/*     */       //   208: aload_0
/*     */       //   209: getfield $onArrowDownPress : Lkotlin/jvm/functions/Function0;
/*     */       //   212: astore #12
/*     */       //   214: aload_0
/*     */       //   215: getfield $onArrowUpPress : Lkotlin/jvm/functions/Function0;
/*     */       //   218: astore #13
/*     */       //   220: aload_0
/*     */       //   221: getfield $onEnterPress : Lkotlin/jvm/functions/Function0;
/*     */       //   224: astore #14
/*     */       //   226: aload_0
/*     */       //   227: getfield $interactionSource : Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */       //   230: astore #15
/*     */       //   232: aload_0
/*     */       //   233: getfield $onPressWhenEnabled : Lkotlin/jvm/functions/Function0;
/*     */       //   236: astore #16
/*     */       //   238: aload_0
/*     */       //   239: getfield $comboBoxState$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   242: astore #17
/*     */       //   244: aload_0
/*     */       //   245: getfield $popupExpanded$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   248: astore #18
/*     */       //   250: aload_0
/*     */       //   251: getfield $textFieldHovered$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   254: astore #19
/*     */       //   256: aload_0
/*     */       //   257: getfield $chevronHovered$delegate : Landroidx/compose/runtime/MutableState;
/*     */       //   260: astore #20
/*     */       //   262: sipush #384
/*     */       //   265: istore #21
/*     */       //   267: iconst_0
/*     */       //   268: istore #22
/*     */       //   270: aload_1
/*     */       //   271: ldc 693286680
/*     */       //   273: ldc 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */       //   275: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   278: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */       //   281: invokevirtual getStart : ()Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   284: astore #4
/*     */       //   286: aload #4
/*     */       //   288: aload #5
/*     */       //   290: aload_1
/*     */       //   291: bipush #14
/*     */       //   293: iload #21
/*     */       //   295: iconst_3
/*     */       //   296: ishr
/*     */       //   297: iand
/*     */       //   298: bipush #112
/*     */       //   300: iload #21
/*     */       //   302: iconst_3
/*     */       //   303: ishr
/*     */       //   304: iand
/*     */       //   305: ior
/*     */       //   306: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   309: astore #23
/*     */       //   311: bipush #112
/*     */       //   313: iload #21
/*     */       //   315: iconst_3
/*     */       //   316: ishl
/*     */       //   317: iand
/*     */       //   318: istore #24
/*     */       //   320: nop
/*     */       //   321: iconst_0
/*     */       //   322: istore #25
/*     */       //   324: aload_1
/*     */       //   325: ldc -1323940314
/*     */       //   327: ldc 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */       //   329: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   332: aload_1
/*     */       //   333: iconst_0
/*     */       //   334: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */       //   337: istore #26
/*     */       //   339: aload_1
/*     */       //   340: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   345: astore #27
/*     */       //   347: aload_1
/*     */       //   348: aload_3
/*     */       //   349: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */       //   352: astore #28
/*     */       //   354: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   357: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */       //   360: astore #29
/*     */       //   362: bipush #6
/*     */       //   364: sipush #896
/*     */       //   367: iload #24
/*     */       //   369: bipush #6
/*     */       //   371: ishl
/*     */       //   372: iand
/*     */       //   373: ior
/*     */       //   374: istore #30
/*     */       //   376: nop
/*     */       //   377: iconst_0
/*     */       //   378: istore #31
/*     */       //   380: aload_1
/*     */       //   381: ldc -692256719
/*     */       //   383: ldc 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */       //   385: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   388: aload_1
/*     */       //   389: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */       //   394: instanceof androidx/compose/runtime/Applier
/*     */       //   397: ifne -> 403
/*     */       //   400: invokestatic invalidApplier : ()V
/*     */       //   403: aload_1
/*     */       //   404: invokeinterface startReusableNode : ()V
/*     */       //   409: aload_1
/*     */       //   410: invokeinterface getInserting : ()Z
/*     */       //   415: ifeq -> 429
/*     */       //   418: aload_1
/*     */       //   419: aload #29
/*     */       //   421: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */       //   426: goto -> 435
/*     */       //   429: aload_1
/*     */       //   430: invokeinterface useNode : ()V
/*     */       //   435: aload_1
/*     */       //   436: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */       //   439: astore #32
/*     */       //   441: iconst_0
/*     */       //   442: istore #33
/*     */       //   444: aload #32
/*     */       //   446: aload #23
/*     */       //   448: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   451: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */       //   454: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   457: aload #32
/*     */       //   459: aload #27
/*     */       //   461: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   464: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */       //   467: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   470: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   473: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */       //   476: astore #34
/*     */       //   478: iconst_0
/*     */       //   479: istore #35
/*     */       //   481: aload #32
/*     */       //   483: astore #36
/*     */       //   485: iconst_0
/*     */       //   486: istore #37
/*     */       //   488: aload #36
/*     */       //   490: invokeinterface getInserting : ()Z
/*     */       //   495: ifne -> 516
/*     */       //   498: aload #36
/*     */       //   500: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   505: iload #26
/*     */       //   507: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   510: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   513: ifne -> 542
/*     */       //   516: aload #36
/*     */       //   518: iload #26
/*     */       //   520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   523: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   528: aload #32
/*     */       //   530: iload #26
/*     */       //   532: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   535: aload #34
/*     */       //   537: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   542: nop
/*     */       //   543: nop
/*     */       //   544: nop
/*     */       //   545: aload #32
/*     */       //   547: aload #28
/*     */       //   549: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */       //   552: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */       //   555: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */       //   558: nop
/*     */       //   559: nop
/*     */       //   560: aload_1
/*     */       //   561: bipush #14
/*     */       //   563: iload #30
/*     */       //   565: bipush #6
/*     */       //   567: ishr
/*     */       //   568: iand
/*     */       //   569: istore #38
/*     */       //   571: astore #39
/*     */       //   573: iconst_0
/*     */       //   574: istore #40
/*     */       //   576: aload #39
/*     */       //   578: ldc_w -407840262
/*     */       //   581: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */       //   584: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   587: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */       //   590: aload #39
/*     */       //   592: bipush #6
/*     */       //   594: bipush #112
/*     */       //   596: iload #21
/*     */       //   598: bipush #6
/*     */       //   600: ishr
/*     */       //   601: iand
/*     */       //   602: ior
/*     */       //   603: istore #41
/*     */       //   605: astore #42
/*     */       //   607: checkcast androidx/compose/foundation/layout/RowScope
/*     */       //   610: astore #43
/*     */       //   612: iconst_0
/*     */       //   613: istore #44
/*     */       //   615: aload #17
/*     */       //   617: invokestatic access$EditableComboBox$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */       //   620: invokestatic isFocused-impl : (J)Z
/*     */       //   623: istore #45
/*     */       //   625: aload #18
/*     */       //   627: invokestatic access$EditableComboBox$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */       //   630: istore #46
/*     */       //   632: aload #43
/*     */       //   634: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */       //   637: checkcast androidx/compose/ui/Modifier
/*     */       //   640: fconst_0
/*     */       //   641: iconst_1
/*     */       //   642: aconst_null
/*     */       //   643: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   646: fconst_1
/*     */       //   647: iconst_0
/*     */       //   648: iconst_2
/*     */       //   649: aconst_null
/*     */       //   650: invokestatic weight$default : (Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */       //   653: iload #6
/*     */       //   655: aload #7
/*     */       //   657: iload #45
/*     */       //   659: aload #8
/*     */       //   661: aload #9
/*     */       //   663: iload #46
/*     */       //   665: aload #10
/*     */       //   667: aload #11
/*     */       //   669: aload #12
/*     */       //   671: aload #13
/*     */       //   673: aload #14
/*     */       //   675: aload #42
/*     */       //   677: ldc_w 455822354
/*     */       //   680: invokeinterface startReplaceGroup : (I)V
/*     */       //   685: aload #42
/*     */       //   687: astore #47
/*     */       //   689: iconst_0
/*     */       //   690: istore #48
/*     */       //   692: nop
/*     */       //   693: iconst_0
/*     */       //   694: istore #49
/*     */       //   696: aload #47
/*     */       //   698: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   703: astore #50
/*     */       //   705: iconst_0
/*     */       //   706: istore #51
/*     */       //   708: aload #50
/*     */       //   710: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   713: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   716: if_acmpne -> 797
/*     */       //   719: astore #52
/*     */       //   721: astore #53
/*     */       //   723: astore #54
/*     */       //   725: astore #55
/*     */       //   727: astore #56
/*     */       //   729: istore #57
/*     */       //   731: astore #58
/*     */       //   733: astore #59
/*     */       //   735: istore #60
/*     */       //   737: astore #61
/*     */       //   739: istore #62
/*     */       //   741: astore #63
/*     */       //   743: iconst_0
/*     */       //   744: istore #64
/*     */       //   746: aload #18
/*     */       //   748: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   753: astore #65
/*     */       //   755: aload #63
/*     */       //   757: iload #62
/*     */       //   759: aload #61
/*     */       //   761: iload #60
/*     */       //   763: aload #59
/*     */       //   765: aload #58
/*     */       //   767: iload #57
/*     */       //   769: aload #56
/*     */       //   771: aload #55
/*     */       //   773: aload #54
/*     */       //   775: aload #53
/*     */       //   777: aload #52
/*     */       //   779: aload #65
/*     */       //   781: astore #66
/*     */       //   783: aload #47
/*     */       //   785: aload #66
/*     */       //   787: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   792: aload #66
/*     */       //   794: goto -> 799
/*     */       //   797: aload #50
/*     */       //   799: nop
/*     */       //   800: nop
/*     */       //   801: nop
/*     */       //   802: checkcast kotlin/jvm/functions/Function1
/*     */       //   805: astore #67
/*     */       //   807: aload #42
/*     */       //   809: invokeinterface endReplaceGroup : ()V
/*     */       //   814: aload #67
/*     */       //   816: aload #42
/*     */       //   818: ldc_w 455824368
/*     */       //   821: invokeinterface startReplaceGroup : (I)V
/*     */       //   826: aload #42
/*     */       //   828: astore #47
/*     */       //   830: iconst_0
/*     */       //   831: istore #48
/*     */       //   833: nop
/*     */       //   834: iconst_0
/*     */       //   835: istore #49
/*     */       //   837: aload #47
/*     */       //   839: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   844: astore #50
/*     */       //   846: iconst_0
/*     */       //   847: istore #51
/*     */       //   849: aload #50
/*     */       //   851: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   854: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   857: if_acmpne -> 942
/*     */       //   860: astore #65
/*     */       //   862: astore #52
/*     */       //   864: astore #53
/*     */       //   866: astore #54
/*     */       //   868: astore #55
/*     */       //   870: astore #56
/*     */       //   872: istore #57
/*     */       //   874: astore #58
/*     */       //   876: astore #59
/*     */       //   878: istore #60
/*     */       //   880: astore #61
/*     */       //   882: istore #62
/*     */       //   884: astore #63
/*     */       //   886: iconst_0
/*     */       //   887: istore #64
/*     */       //   889: aload #17
/*     */       //   891: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   896: astore #68
/*     */       //   898: aload #63
/*     */       //   900: iload #62
/*     */       //   902: aload #61
/*     */       //   904: iload #60
/*     */       //   906: aload #59
/*     */       //   908: aload #58
/*     */       //   910: iload #57
/*     */       //   912: aload #56
/*     */       //   914: aload #55
/*     */       //   916: aload #54
/*     */       //   918: aload #53
/*     */       //   920: aload #52
/*     */       //   922: aload #65
/*     */       //   924: aload #68
/*     */       //   926: astore #66
/*     */       //   928: aload #47
/*     */       //   930: aload #66
/*     */       //   932: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   937: aload #66
/*     */       //   939: goto -> 944
/*     */       //   942: aload #50
/*     */       //   944: nop
/*     */       //   945: nop
/*     */       //   946: nop
/*     */       //   947: checkcast kotlin/jvm/functions/Function1
/*     */       //   950: astore #67
/*     */       //   952: aload #42
/*     */       //   954: invokeinterface endReplaceGroup : ()V
/*     */       //   959: aload #67
/*     */       //   961: aload #42
/*     */       //   963: ldc_w 455827285
/*     */       //   966: invokeinterface startReplaceGroup : (I)V
/*     */       //   971: aload #42
/*     */       //   973: astore #47
/*     */       //   975: iconst_0
/*     */       //   976: istore #48
/*     */       //   978: nop
/*     */       //   979: iconst_0
/*     */       //   980: istore #49
/*     */       //   982: aload #47
/*     */       //   984: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   989: astore #50
/*     */       //   991: iconst_0
/*     */       //   992: istore #51
/*     */       //   994: aload #50
/*     */       //   996: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   999: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1002: if_acmpne -> 1091
/*     */       //   1005: astore #68
/*     */       //   1007: astore #65
/*     */       //   1009: astore #52
/*     */       //   1011: astore #53
/*     */       //   1013: astore #54
/*     */       //   1015: astore #55
/*     */       //   1017: astore #56
/*     */       //   1019: istore #57
/*     */       //   1021: astore #58
/*     */       //   1023: astore #59
/*     */       //   1025: istore #60
/*     */       //   1027: astore #61
/*     */       //   1029: istore #62
/*     */       //   1031: astore #63
/*     */       //   1033: iconst_0
/*     */       //   1034: istore #64
/*     */       //   1036: aload #19
/*     */       //   1038: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   1043: astore #69
/*     */       //   1045: aload #63
/*     */       //   1047: iload #62
/*     */       //   1049: aload #61
/*     */       //   1051: iload #60
/*     */       //   1053: aload #59
/*     */       //   1055: aload #58
/*     */       //   1057: iload #57
/*     */       //   1059: aload #56
/*     */       //   1061: aload #55
/*     */       //   1063: aload #54
/*     */       //   1065: aload #53
/*     */       //   1067: aload #52
/*     */       //   1069: aload #65
/*     */       //   1071: aload #68
/*     */       //   1073: aload #69
/*     */       //   1075: astore #66
/*     */       //   1077: aload #47
/*     */       //   1079: aload #66
/*     */       //   1081: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1086: aload #66
/*     */       //   1088: goto -> 1093
/*     */       //   1091: aload #50
/*     */       //   1093: nop
/*     */       //   1094: nop
/*     */       //   1095: nop
/*     */       //   1096: checkcast kotlin/jvm/functions/Function1
/*     */       //   1099: astore #67
/*     */       //   1101: aload #42
/*     */       //   1103: invokeinterface endReplaceGroup : ()V
/*     */       //   1108: aload #67
/*     */       //   1110: aload #42
/*     */       //   1112: ldc_w 100687872
/*     */       //   1115: sipush #28032
/*     */       //   1118: invokestatic access$TextInput : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
/*     */       //   1121: iload #6
/*     */       //   1123: aload #9
/*     */       //   1125: aload #15
/*     */       //   1127: aload #42
/*     */       //   1129: ldc_w 455837299
/*     */       //   1132: invokeinterface startReplaceGroup : (I)V
/*     */       //   1137: aload #42
/*     */       //   1139: astore #46
/*     */       //   1141: iconst_0
/*     */       //   1142: istore #70
/*     */       //   1144: nop
/*     */       //   1145: iconst_0
/*     */       //   1146: istore #67
/*     */       //   1148: aload #46
/*     */       //   1150: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1155: astore #47
/*     */       //   1157: iconst_0
/*     */       //   1158: istore #48
/*     */       //   1160: aload #47
/*     */       //   1162: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1165: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1168: if_acmpne -> 1213
/*     */       //   1171: astore #61
/*     */       //   1173: astore #62
/*     */       //   1175: istore #63
/*     */       //   1177: iconst_0
/*     */       //   1178: istore #49
/*     */       //   1180: aload #20
/*     */       //   1182: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   1187: astore #60
/*     */       //   1189: iload #63
/*     */       //   1191: aload #62
/*     */       //   1193: aload #61
/*     */       //   1195: aload #60
/*     */       //   1197: astore #50
/*     */       //   1199: aload #46
/*     */       //   1201: aload #50
/*     */       //   1203: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1208: aload #50
/*     */       //   1210: goto -> 1215
/*     */       //   1213: aload #47
/*     */       //   1215: nop
/*     */       //   1216: nop
/*     */       //   1217: nop
/*     */       //   1218: checkcast kotlin/jvm/functions/Function1
/*     */       //   1221: astore #45
/*     */       //   1223: aload #42
/*     */       //   1225: invokeinterface endReplaceGroup : ()V
/*     */       //   1230: aload #45
/*     */       //   1232: aload #42
/*     */       //   1234: ldc_w 455839346
/*     */       //   1237: invokeinterface startReplaceGroup : (I)V
/*     */       //   1242: aload #42
/*     */       //   1244: astore #46
/*     */       //   1246: iconst_0
/*     */       //   1247: istore #70
/*     */       //   1249: nop
/*     */       //   1250: iconst_0
/*     */       //   1251: istore #67
/*     */       //   1253: aload #46
/*     */       //   1255: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   1260: astore #47
/*     */       //   1262: iconst_0
/*     */       //   1263: istore #48
/*     */       //   1265: aload #47
/*     */       //   1267: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   1270: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   1273: if_acmpne -> 1322
/*     */       //   1276: astore #60
/*     */       //   1278: astore #61
/*     */       //   1280: astore #62
/*     */       //   1282: istore #63
/*     */       //   1284: iconst_0
/*     */       //   1285: istore #49
/*     */       //   1287: aload #18
/*     */       //   1289: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */       //   1294: astore #59
/*     */       //   1296: iload #63
/*     */       //   1298: aload #62
/*     */       //   1300: aload #61
/*     */       //   1302: aload #60
/*     */       //   1304: aload #59
/*     */       //   1306: astore #50
/*     */       //   1308: aload #46
/*     */       //   1310: aload #50
/*     */       //   1312: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   1317: aload #50
/*     */       //   1319: goto -> 1324
/*     */       //   1322: aload #47
/*     */       //   1324: nop
/*     */       //   1325: nop
/*     */       //   1326: nop
/*     */       //   1327: checkcast kotlin/jvm/functions/Function1
/*     */       //   1330: astore #45
/*     */       //   1332: aload #42
/*     */       //   1334: invokeinterface endReplaceGroup : ()V
/*     */       //   1339: aload #45
/*     */       //   1341: aload #16
/*     */       //   1343: aload #42
/*     */       //   1345: sipush #27648
/*     */       //   1348: invokestatic access$Chevron : (ZLorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
/*     */       //   1351: nop
/*     */       //   1352: aload #39
/*     */       //   1354: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1357: aload_1
/*     */       //   1358: invokeinterface endNode : ()V
/*     */       //   1363: aload_1
/*     */       //   1364: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1367: nop
/*     */       //   1368: aload_1
/*     */       //   1369: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1372: nop
/*     */       //   1373: aload_1
/*     */       //   1374: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   1377: nop
/*     */       //   1378: invokestatic isTraceInProgress : ()Z
/*     */       //   1381: ifeq -> 1396
/*     */       //   1384: invokestatic traceEventEnd : ()V
/*     */       //   1387: goto -> 1396
/*     */       //   1390: aload_1
/*     */       //   1391: invokeinterface skipToGroupEnd : ()V
/*     */       //   1396: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #161	-> 0
/*     */       //   #163	-> 31
/*     */       //   #401	-> 81
/*     */       //   #402	-> 93
/*     */       //   #403	-> 109
/*     */       //   #163	-> 114
/*     */       //   #403	-> 128
/*     */       //   #404	-> 130
/*     */       //   #405	-> 139
/*     */       //   #406	-> 144
/*     */       //   #402	-> 146
/*     */       //   #401	-> 147
/*     */       //   #401	-> 148
/*     */       //   #163	-> 149
/*     */       //   #169	-> 164
/*     */       //   #161	-> 172
/*     */       //   #407	-> 275
/*     */       //   #408	-> 278
/*     */       //   #412	-> 286
/*     */       //   #413	-> 320
/*     */       //   #414	-> 329
/*     */       //   #415	-> 334
/*     */       //   #416	-> 340
/*     */       //   #417	-> 348
/*     */       //   #419	-> 354
/*     */       //   #418	-> 376
/*     */       //   #420	-> 385
/*     */       //   #421	-> 388
/*     */       //   #422	-> 404
/*     */       //   #423	-> 409
/*     */       //   #424	-> 419
/*     */       //   #426	-> 430
/*     */       //   #428	-> 435
/*     */       //   #429	-> 444
/*     */       //   #430	-> 457
/*     */       //   #432	-> 470
/*     */       //   #433	-> 481
/*     */       //   #434	-> 488
/*     */       //   #435	-> 516
/*     */       //   #436	-> 528
/*     */       //   #438	-> 542
/*     */       //   #433	-> 543
/*     */       //   #438	-> 544
/*     */       //   #439	-> 545
/*     */       //   #440	-> 558
/*     */       //   #428	-> 559
/*     */       //   #441	-> 560
/*     */       //   #442	-> 584
/*     */       //   #174	-> 615
/*     */       //   #177	-> 625
/*     */       //   #186	-> 632
/*     */       //   #172	-> 653
/*     */       //   #173	-> 655
/*     */       //   #174	-> 657
/*     */       //   #175	-> 659
/*     */       //   #176	-> 661
/*     */       //   #177	-> 663
/*     */       //   #178	-> 665
/*     */       //   #179	-> 667
/*     */       //   #180	-> 669
/*     */       //   #181	-> 671
/*     */       //   #182	-> 673
/*     */       //   #183	-> 692
/*     */       //   #443	-> 696
/*     */       //   #444	-> 708
/*     */       //   #445	-> 719
/*     */       //   #183	-> 746
/*     */       //   #445	-> 781
/*     */       //   #446	-> 783
/*     */       //   #447	-> 792
/*     */       //   #448	-> 797
/*     */       //   #444	-> 799
/*     */       //   #443	-> 800
/*     */       //   #443	-> 801
/*     */       //   #183	-> 802
/*     */       //   #184	-> 833
/*     */       //   #449	-> 837
/*     */       //   #450	-> 849
/*     */       //   #451	-> 860
/*     */       //   #184	-> 889
/*     */       //   #451	-> 926
/*     */       //   #452	-> 928
/*     */       //   #453	-> 937
/*     */       //   #454	-> 942
/*     */       //   #450	-> 944
/*     */       //   #449	-> 945
/*     */       //   #449	-> 946
/*     */       //   #184	-> 947
/*     */       //   #185	-> 978
/*     */       //   #455	-> 982
/*     */       //   #456	-> 994
/*     */       //   #457	-> 1005
/*     */       //   #185	-> 1036
/*     */       //   #457	-> 1075
/*     */       //   #458	-> 1077
/*     */       //   #459	-> 1086
/*     */       //   #460	-> 1091
/*     */       //   #456	-> 1093
/*     */       //   #455	-> 1094
/*     */       //   #455	-> 1095
/*     */       //   #185	-> 1096
/*     */       //   #171	-> 1118
/*     */       //   #190	-> 1121
/*     */       //   #191	-> 1123
/*     */       //   #192	-> 1125
/*     */       //   #193	-> 1144
/*     */       //   #461	-> 1148
/*     */       //   #462	-> 1160
/*     */       //   #463	-> 1171
/*     */       //   #193	-> 1180
/*     */       //   #463	-> 1197
/*     */       //   #464	-> 1199
/*     */       //   #465	-> 1208
/*     */       //   #466	-> 1213
/*     */       //   #462	-> 1215
/*     */       //   #461	-> 1216
/*     */       //   #461	-> 1217
/*     */       //   #193	-> 1218
/*     */       //   #194	-> 1249
/*     */       //   #467	-> 1253
/*     */       //   #468	-> 1265
/*     */       //   #469	-> 1276
/*     */       //   #194	-> 1287
/*     */       //   #469	-> 1306
/*     */       //   #470	-> 1308
/*     */       //   #471	-> 1317
/*     */       //   #472	-> 1322
/*     */       //   #468	-> 1324
/*     */       //   #467	-> 1325
/*     */       //   #467	-> 1326
/*     */       //   #194	-> 1327
/*     */       //   #195	-> 1341
/*     */       //   #189	-> 1348
/*     */       //   #197	-> 1351
/*     */       //   #442	-> 1352
/*     */       //   #441	-> 1357
/*     */       //   #473	-> 1358
/*     */       //   #420	-> 1364
/*     */       //   #474	-> 1367
/*     */       //   #414	-> 1369
/*     */       //   #475	-> 1372
/*     */       //   #407	-> 1374
/*     */       //   #476	-> 1377
/*     */       //   #197	-> 1390
/*     */       //   #198	-> 1396
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   114	11	12	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$1	I
/*     */       //   130	11	13	value$iv	Ljava/lang/Object;
/*     */       //   93	54	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   90	57	10	it$iv	Ljava/lang/Object;
/*     */       //   81	68	9	$i$f$cache	I
/*     */       //   78	71	4	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   78	71	5	invalid$iv	Z
/*     */       //   746	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$1	I
/*     */       //   783	11	66	value$iv	Ljava/lang/Object;
/*     */       //   708	92	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   705	95	50	it$iv	Ljava/lang/Object;
/*     */       //   696	106	49	$i$f$cache	I
/*     */       //   693	109	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   693	109	48	invalid$iv	Z
/*     */       //   889	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$2	I
/*     */       //   928	11	66	value$iv	Ljava/lang/Object;
/*     */       //   849	96	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   846	99	50	it$iv	Ljava/lang/Object;
/*     */       //   837	110	49	$i$f$cache	I
/*     */       //   834	113	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   834	113	48	invalid$iv	Z
/*     */       //   1036	7	64	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$3	I
/*     */       //   1077	11	66	value$iv	Ljava/lang/Object;
/*     */       //   994	100	51	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   991	103	50	it$iv	Ljava/lang/Object;
/*     */       //   982	114	49	$i$f$cache	I
/*     */       //   979	117	47	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   979	117	48	invalid$iv	Z
/*     */       //   1180	7	49	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$4	I
/*     */       //   1199	11	50	value$iv	Ljava/lang/Object;
/*     */       //   1160	56	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1157	59	47	it$iv	Ljava/lang/Object;
/*     */       //   1148	70	67	$i$f$cache	I
/*     */       //   1145	73	46	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1145	73	70	invalid$iv	Z
/*     */       //   1287	7	49	$i$a$-cache-EditableComboBoxKt$EditableComboBox$10$1$2$5	I
/*     */       //   1308	11	50	value$iv	Ljava/lang/Object;
/*     */       //   1265	60	48	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   1262	63	47	it$iv	Ljava/lang/Object;
/*     */       //   1253	74	67	$i$f$cache	I
/*     */       //   1250	77	46	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   1250	77	70	invalid$iv	Z
/*     */       //   615	737	44	$i$a$-Row-EditableComboBoxKt$EditableComboBox$10$1$2	I
/*     */       //   612	740	43	$this$invoke_u24lambda_u2412	Landroidx/compose/foundation/layout/RowScope;
/*     */       //   612	740	42	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   612	740	41	$changed	I
/*     */       //   576	781	40	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */       //   573	784	39	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */       //   573	784	38	$changed$iv	I
/*     */       //   488	55	37	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */       //   485	58	36	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   481	64	35	$i$f$set-impl	I
/*     */       //   478	67	34	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */       //   444	115	33	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */       //   441	118	32	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */       //   380	988	31	$i$f$ReusableComposeNode	I
/*     */       //   377	991	29	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */       //   377	991	30	$changed$iv$iv$iv	I
/*     */       //   324	1049	25	$i$f$Layout	I
/*     */       //   339	1034	26	compositeKeyHash$iv$iv	I
/*     */       //   347	1026	27	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */       //   354	1019	28	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */       //   321	1052	24	$changed$iv$iv	I
/*     */       //   270	1108	22	$i$f$Row	I
/*     */       //   311	1067	23	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */       //   267	1111	3	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */       //   286	1092	4	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */       //   267	1111	5	verticalAlignment$iv	Landroidx/compose/ui/Alignment$Vertical;
/*     */       //   267	1111	21	$changed$iv	I
/*     */       //   0	1397	0	this	Lorg/jetbrains/jewel/ui/component/EditableComboBoxKt$EditableComboBox$10$1;
/*     */       //   0	1397	1	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	1397	2	$changed	I
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$1$lambda$0(MutableState $comboBoxState$delegate, Function1 $onPopupStateChange, MutableState $popupExpanded$delegate, FocusState it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       EditableComboBoxKt.EditableComboBox$lambda$24($comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23($comboBoxState$delegate), false, it.isFocused(), false, false, false, 29, null));
/*     */       if (!it.isFocused())
/*     */         EditableComboBoxKt.EditableComboBox$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false); 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$12$lambda$3$lambda$2(MutableState $popupExpanded$delegate, boolean it) {
/*     */       EditableComboBoxKt.EditableComboBox$lambda$11($popupExpanded$delegate, it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$12$lambda$5$lambda$4(MutableState $comboBoxState$delegate, boolean it) {
/*     */       EditableComboBoxKt.EditableComboBox$lambda$24($comboBoxState$delegate, ComboBoxState.copy-b6bHBqw$default(EditableComboBoxKt.EditableComboBox$lambda$23($comboBoxState$delegate), false, it, false, false, false, 29, null));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$12$lambda$7$lambda$6(MutableState $textFieldHovered$delegate, boolean it) {
/*     */       EditableComboBoxKt.EditableComboBox$lambda$17($textFieldHovered$delegate, it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$12$lambda$9$lambda$8(MutableState $chevronHovered$delegate, boolean it) {
/*     */       EditableComboBoxKt.EditableComboBox$lambda$14($chevronHovered$delegate, it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final Unit invoke$lambda$12$lambda$11$lambda$10(MutableState $popupExpanded$delegate, boolean it) {
/*     */       EditableComboBoxKt.EditableComboBox$lambda$11($popupExpanded$delegate, it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     EditableComboBoxKt$EditableComboBox$10$1(Function1<Boolean, Unit> $onPopupStateChange, MutableState<ComboBoxState> $comboBoxState$delegate, MutableState<Boolean> $popupExpanded$delegate, boolean $isEnabled, TextFieldState $inputTextFieldState, FocusRequester $textFieldFocusRequester, ComboBoxStyle $style, TextStyle $textStyle, MutableInteractionSource $textFieldInteractionSource, Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress, MutableInteractionSource $interactionSource, Function0<Unit> $onPressWhenEnabled, MutableState<Boolean> $textFieldHovered$delegate, MutableState<Boolean> $chevronHovered$delegate) {}
/*     */   }
/*     */   
/*     */   private static final Unit EditableComboBox$lambda$41$lambda$40$lambda$39(MutableState<Boolean> $chevronHovered$delegate, MutableState<Boolean> $textFieldHovered$delegate, Function1<? super Boolean, Unit> $onPopupStateChange, MutableState<Boolean> $popupExpanded$delegate) {
/*     */     if (!EditableComboBox$lambda$13($chevronHovered$delegate) && !EditableComboBox$lambda$16($textFieldHovered$delegate))
/*     */       EditableComboBox$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EditableComboBox$lambda$41$lambda$36$lambda$35(SemanticsPropertyReceiver $this$semantics) {
/*     */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics");
/*     */     SemanticsPropertiesKt.setContentDescription($this$semantics, "Jewel.ComboBox.PopupMenu");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EditableComboBox$lambda$41$lambda$38$lambda$37(Function1<? super Boolean, Unit> $onPopupStateChange, MutableState<Boolean> $popupExpanded$delegate) {
/*     */     EditableComboBox$setPopupExpanded($onPopupStateChange, $popupExpanded$delegate, false);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void TextInput(Modifier modifier, boolean isEnabled, TextFieldState inputTextFieldState, boolean isFocused, FocusRequester textFieldFocusRequester, ComboBoxStyle style, boolean popupExpanded, TextStyle textStyle, MutableInteractionSource textFieldInteractionSource, Function0 onArrowDownPress, Function0 onArrowUpPress, Function0 onEnterPress, Function1 onSetPopupExpanded, Function1 onFocusedChange, Function1 onHoveredChange, Composer $composer, int $changed, int $changed1) {
/*     */     // Byte code:
/*     */     //   0: aload #15
/*     */     //   2: ldc_w 1623607823
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #15
/*     */     //   12: iload #16
/*     */     //   14: istore #18
/*     */     //   16: iload #17
/*     */     //   18: istore #19
/*     */     //   20: iload #16
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 49
/*     */     //   28: iload #18
/*     */     //   30: aload #15
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #18
/*     */     //   49: iload #16
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 80
/*     */     //   57: iload #18
/*     */     //   59: aload #15
/*     */     //   61: iload_1
/*     */     //   62: invokeinterface changed : (Z)Z
/*     */     //   67: ifeq -> 75
/*     */     //   70: bipush #32
/*     */     //   72: goto -> 77
/*     */     //   75: bipush #16
/*     */     //   77: ior
/*     */     //   78: istore #18
/*     */     //   80: iload #16
/*     */     //   82: sipush #384
/*     */     //   85: iand
/*     */     //   86: ifne -> 114
/*     */     //   89: iload #18
/*     */     //   91: aload #15
/*     */     //   93: aload_2
/*     */     //   94: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   99: ifeq -> 108
/*     */     //   102: sipush #256
/*     */     //   105: goto -> 111
/*     */     //   108: sipush #128
/*     */     //   111: ior
/*     */     //   112: istore #18
/*     */     //   114: iload #16
/*     */     //   116: sipush #24576
/*     */     //   119: iand
/*     */     //   120: ifne -> 149
/*     */     //   123: iload #18
/*     */     //   125: aload #15
/*     */     //   127: aload #4
/*     */     //   129: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   134: ifeq -> 143
/*     */     //   137: sipush #16384
/*     */     //   140: goto -> 146
/*     */     //   143: sipush #8192
/*     */     //   146: ior
/*     */     //   147: istore #18
/*     */     //   149: iload #16
/*     */     //   151: ldc 196608
/*     */     //   153: iand
/*     */     //   154: ifne -> 181
/*     */     //   157: iload #18
/*     */     //   159: aload #15
/*     */     //   161: aload #5
/*     */     //   163: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   168: ifeq -> 176
/*     */     //   171: ldc 131072
/*     */     //   173: goto -> 178
/*     */     //   176: ldc 65536
/*     */     //   178: ior
/*     */     //   179: istore #18
/*     */     //   181: iload #16
/*     */     //   183: ldc 1572864
/*     */     //   185: iand
/*     */     //   186: ifne -> 213
/*     */     //   189: iload #18
/*     */     //   191: aload #15
/*     */     //   193: iload #6
/*     */     //   195: invokeinterface changed : (Z)Z
/*     */     //   200: ifeq -> 208
/*     */     //   203: ldc 1048576
/*     */     //   205: goto -> 210
/*     */     //   208: ldc 524288
/*     */     //   210: ior
/*     */     //   211: istore #18
/*     */     //   213: iload #16
/*     */     //   215: ldc 12582912
/*     */     //   217: iand
/*     */     //   218: ifne -> 245
/*     */     //   221: iload #18
/*     */     //   223: aload #15
/*     */     //   225: aload #7
/*     */     //   227: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   232: ifeq -> 240
/*     */     //   235: ldc 8388608
/*     */     //   237: goto -> 242
/*     */     //   240: ldc 4194304
/*     */     //   242: ior
/*     */     //   243: istore #18
/*     */     //   245: iload #16
/*     */     //   247: ldc 100663296
/*     */     //   249: iand
/*     */     //   250: ifne -> 277
/*     */     //   253: iload #18
/*     */     //   255: aload #15
/*     */     //   257: aload #8
/*     */     //   259: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   264: ifeq -> 272
/*     */     //   267: ldc 67108864
/*     */     //   269: goto -> 274
/*     */     //   272: ldc 33554432
/*     */     //   274: ior
/*     */     //   275: istore #18
/*     */     //   277: iload #16
/*     */     //   279: ldc 805306368
/*     */     //   281: iand
/*     */     //   282: ifne -> 309
/*     */     //   285: iload #18
/*     */     //   287: aload #15
/*     */     //   289: aload #9
/*     */     //   291: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   296: ifeq -> 304
/*     */     //   299: ldc 536870912
/*     */     //   301: goto -> 306
/*     */     //   304: ldc 268435456
/*     */     //   306: ior
/*     */     //   307: istore #18
/*     */     //   309: iload #17
/*     */     //   311: bipush #6
/*     */     //   313: iand
/*     */     //   314: ifne -> 339
/*     */     //   317: iload #19
/*     */     //   319: aload #15
/*     */     //   321: aload #10
/*     */     //   323: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   328: ifeq -> 335
/*     */     //   331: iconst_4
/*     */     //   332: goto -> 336
/*     */     //   335: iconst_2
/*     */     //   336: ior
/*     */     //   337: istore #19
/*     */     //   339: iload #17
/*     */     //   341: bipush #48
/*     */     //   343: iand
/*     */     //   344: ifne -> 371
/*     */     //   347: iload #19
/*     */     //   349: aload #15
/*     */     //   351: aload #11
/*     */     //   353: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   358: ifeq -> 366
/*     */     //   361: bipush #32
/*     */     //   363: goto -> 368
/*     */     //   366: bipush #16
/*     */     //   368: ior
/*     */     //   369: istore #19
/*     */     //   371: iload #17
/*     */     //   373: sipush #384
/*     */     //   376: iand
/*     */     //   377: ifne -> 406
/*     */     //   380: iload #19
/*     */     //   382: aload #15
/*     */     //   384: aload #12
/*     */     //   386: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   391: ifeq -> 400
/*     */     //   394: sipush #256
/*     */     //   397: goto -> 403
/*     */     //   400: sipush #128
/*     */     //   403: ior
/*     */     //   404: istore #19
/*     */     //   406: iload #17
/*     */     //   408: sipush #3072
/*     */     //   411: iand
/*     */     //   412: ifne -> 441
/*     */     //   415: iload #19
/*     */     //   417: aload #15
/*     */     //   419: aload #13
/*     */     //   421: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   426: ifeq -> 435
/*     */     //   429: sipush #2048
/*     */     //   432: goto -> 438
/*     */     //   435: sipush #1024
/*     */     //   438: ior
/*     */     //   439: istore #19
/*     */     //   441: iload #17
/*     */     //   443: sipush #24576
/*     */     //   446: iand
/*     */     //   447: ifne -> 476
/*     */     //   450: iload #19
/*     */     //   452: aload #15
/*     */     //   454: aload #14
/*     */     //   456: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   461: ifeq -> 470
/*     */     //   464: sipush #16384
/*     */     //   467: goto -> 473
/*     */     //   470: sipush #8192
/*     */     //   473: ior
/*     */     //   474: istore #19
/*     */     //   476: iload #18
/*     */     //   478: ldc_w 306782355
/*     */     //   481: iand
/*     */     //   482: ldc_w 306782354
/*     */     //   485: if_icmpne -> 510
/*     */     //   488: iload #19
/*     */     //   490: sipush #9363
/*     */     //   493: iand
/*     */     //   494: sipush #9362
/*     */     //   497: if_icmpne -> 510
/*     */     //   500: aload #15
/*     */     //   502: invokeinterface getSkipping : ()Z
/*     */     //   507: ifne -> 1164
/*     */     //   510: invokestatic isTraceInProgress : ()Z
/*     */     //   513: ifeq -> 529
/*     */     //   516: ldc_w 1623607823
/*     */     //   519: iload #18
/*     */     //   521: iload #19
/*     */     //   523: ldc_w 'org.jetbrains.jewel.ui.component.TextInput (EditableComboBox.kt:238)'
/*     */     //   526: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   529: iload_1
/*     */     //   530: ifeq -> 544
/*     */     //   533: aload #5
/*     */     //   535: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   538: invokevirtual getContent-0d7_KjU : ()J
/*     */     //   541: goto -> 552
/*     */     //   544: aload #5
/*     */     //   546: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   549: invokevirtual getBorderDisabled-0d7_KjU : ()J
/*     */     //   552: lstore #20
/*     */     //   554: aload_0
/*     */     //   555: ldc_w 'Jewel.ComboBox.TextField'
/*     */     //   558: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   561: aload #5
/*     */     //   563: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   566: invokevirtual getContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   569: invokestatic padding : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;
/*     */     //   572: aload #15
/*     */     //   574: ldc_w 2110462752
/*     */     //   577: invokeinterface startReplaceGroup : (I)V
/*     */     //   582: aload #15
/*     */     //   584: astore #24
/*     */     //   586: iload #19
/*     */     //   588: sipush #7168
/*     */     //   591: iand
/*     */     //   592: sipush #2048
/*     */     //   595: if_icmpne -> 602
/*     */     //   598: iconst_1
/*     */     //   599: goto -> 603
/*     */     //   602: iconst_0
/*     */     //   603: istore #25
/*     */     //   605: nop
/*     */     //   606: iconst_0
/*     */     //   607: istore #26
/*     */     //   609: aload #24
/*     */     //   611: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   616: astore #27
/*     */     //   618: iconst_0
/*     */     //   619: istore #28
/*     */     //   621: iload #25
/*     */     //   623: ifne -> 637
/*     */     //   626: aload #27
/*     */     //   628: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   631: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   634: if_acmpne -> 668
/*     */     //   637: astore #31
/*     */     //   639: iconst_0
/*     */     //   640: istore #29
/*     */     //   642: aload #13
/*     */     //   644: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   649: aload #31
/*     */     //   651: swap
/*     */     //   652: astore #30
/*     */     //   654: aload #24
/*     */     //   656: aload #30
/*     */     //   658: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   663: aload #30
/*     */     //   665: goto -> 670
/*     */     //   668: aload #27
/*     */     //   670: nop
/*     */     //   671: nop
/*     */     //   672: nop
/*     */     //   673: checkcast kotlin/jvm/functions/Function1
/*     */     //   676: astore #23
/*     */     //   678: aload #15
/*     */     //   680: invokeinterface endReplaceGroup : ()V
/*     */     //   685: aload #23
/*     */     //   687: invokestatic onFocusChanged : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   690: aload #4
/*     */     //   692: invokestatic focusRequester : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;
/*     */     //   695: aload #15
/*     */     //   697: ldc_w 2110468174
/*     */     //   700: invokeinterface startReplaceGroup : (I)V
/*     */     //   705: aload #15
/*     */     //   707: astore #24
/*     */     //   709: iload #18
/*     */     //   711: ldc_w 3670016
/*     */     //   714: iand
/*     */     //   715: ldc 1048576
/*     */     //   717: if_icmpne -> 724
/*     */     //   720: iconst_1
/*     */     //   721: goto -> 725
/*     */     //   724: iconst_0
/*     */     //   725: iload #18
/*     */     //   727: ldc_w 1879048192
/*     */     //   730: iand
/*     */     //   731: ldc 536870912
/*     */     //   733: if_icmpne -> 740
/*     */     //   736: iconst_1
/*     */     //   737: goto -> 741
/*     */     //   740: iconst_0
/*     */     //   741: ior
/*     */     //   742: iload #19
/*     */     //   744: sipush #896
/*     */     //   747: iand
/*     */     //   748: sipush #256
/*     */     //   751: if_icmpne -> 758
/*     */     //   754: iconst_1
/*     */     //   755: goto -> 759
/*     */     //   758: iconst_0
/*     */     //   759: ior
/*     */     //   760: iload #18
/*     */     //   762: ldc_w 57344
/*     */     //   765: iand
/*     */     //   766: sipush #16384
/*     */     //   769: if_icmpne -> 776
/*     */     //   772: iconst_1
/*     */     //   773: goto -> 777
/*     */     //   776: iconst_0
/*     */     //   777: ior
/*     */     //   778: iload #19
/*     */     //   780: bipush #14
/*     */     //   782: iand
/*     */     //   783: iconst_4
/*     */     //   784: if_icmpne -> 791
/*     */     //   787: iconst_1
/*     */     //   788: goto -> 792
/*     */     //   791: iconst_0
/*     */     //   792: ior
/*     */     //   793: iload #19
/*     */     //   795: bipush #112
/*     */     //   797: iand
/*     */     //   798: bipush #32
/*     */     //   800: if_icmpne -> 807
/*     */     //   803: iconst_1
/*     */     //   804: goto -> 808
/*     */     //   807: iconst_0
/*     */     //   808: ior
/*     */     //   809: istore #25
/*     */     //   811: nop
/*     */     //   812: iconst_0
/*     */     //   813: istore #26
/*     */     //   815: aload #24
/*     */     //   817: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   822: astore #27
/*     */     //   824: iconst_0
/*     */     //   825: istore #28
/*     */     //   827: iload #25
/*     */     //   829: ifne -> 843
/*     */     //   832: aload #27
/*     */     //   834: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   837: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   840: if_acmpne -> 889
/*     */     //   843: astore #31
/*     */     //   845: iconst_0
/*     */     //   846: istore #29
/*     */     //   848: new org/jetbrains/jewel/ui/component/EditableComboBoxKt$TextInput$2$1
/*     */     //   851: dup
/*     */     //   852: iload #6
/*     */     //   854: aload #9
/*     */     //   856: aload #12
/*     */     //   858: aload #4
/*     */     //   860: aload #10
/*     */     //   862: aload #11
/*     */     //   864: invokespecial <init> : (ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
/*     */     //   867: checkcast kotlin/jvm/functions/Function1
/*     */     //   870: aload #31
/*     */     //   872: swap
/*     */     //   873: astore #30
/*     */     //   875: aload #24
/*     */     //   877: aload #30
/*     */     //   879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   884: aload #30
/*     */     //   886: goto -> 891
/*     */     //   889: aload #27
/*     */     //   891: nop
/*     */     //   892: nop
/*     */     //   893: nop
/*     */     //   894: checkcast kotlin/jvm/functions/Function1
/*     */     //   897: astore #23
/*     */     //   899: aload #15
/*     */     //   901: invokeinterface endReplaceGroup : ()V
/*     */     //   906: aload #23
/*     */     //   908: invokestatic onPreviewKeyEvent : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   911: aload #15
/*     */     //   913: ldc_w 2110513142
/*     */     //   916: invokeinterface startReplaceGroup : (I)V
/*     */     //   921: aload #15
/*     */     //   923: astore #24
/*     */     //   925: iload #19
/*     */     //   927: ldc_w 57344
/*     */     //   930: iand
/*     */     //   931: sipush #16384
/*     */     //   934: if_icmpne -> 941
/*     */     //   937: iconst_1
/*     */     //   938: goto -> 942
/*     */     //   941: iconst_0
/*     */     //   942: istore #25
/*     */     //   944: nop
/*     */     //   945: iconst_0
/*     */     //   946: istore #26
/*     */     //   948: aload #24
/*     */     //   950: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   955: astore #27
/*     */     //   957: iconst_0
/*     */     //   958: istore #28
/*     */     //   960: iload #25
/*     */     //   962: ifne -> 976
/*     */     //   965: aload #27
/*     */     //   967: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   970: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   973: if_acmpne -> 1007
/*     */     //   976: astore #31
/*     */     //   978: iconst_0
/*     */     //   979: istore #29
/*     */     //   981: aload #14
/*     */     //   983: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   988: aload #31
/*     */     //   990: swap
/*     */     //   991: astore #30
/*     */     //   993: aload #24
/*     */     //   995: aload #30
/*     */     //   997: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1002: aload #30
/*     */     //   1004: goto -> 1009
/*     */     //   1007: aload #27
/*     */     //   1009: nop
/*     */     //   1010: nop
/*     */     //   1011: nop
/*     */     //   1012: checkcast kotlin/jvm/functions/Function1
/*     */     //   1015: astore #23
/*     */     //   1017: aload #15
/*     */     //   1019: invokeinterface endReplaceGroup : ()V
/*     */     //   1024: aload #23
/*     */     //   1026: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   1029: astore #22
/*     */     //   1031: getstatic androidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine.INSTANCE : Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;
/*     */     //   1034: astore #23
/*     */     //   1036: aload #7
/*     */     //   1038: lload #20
/*     */     //   1040: lconst_0
/*     */     //   1041: aconst_null
/*     */     //   1042: aconst_null
/*     */     //   1043: aconst_null
/*     */     //   1044: aconst_null
/*     */     //   1045: aconst_null
/*     */     //   1046: lconst_0
/*     */     //   1047: aconst_null
/*     */     //   1048: aconst_null
/*     */     //   1049: aconst_null
/*     */     //   1050: lconst_0
/*     */     //   1051: aconst_null
/*     */     //   1052: aconst_null
/*     */     //   1053: aconst_null
/*     */     //   1054: iconst_0
/*     */     //   1055: iconst_0
/*     */     //   1056: lconst_0
/*     */     //   1057: aconst_null
/*     */     //   1058: aconst_null
/*     */     //   1059: aconst_null
/*     */     //   1060: iconst_0
/*     */     //   1061: iconst_0
/*     */     //   1062: aconst_null
/*     */     //   1063: ldc_w 16777214
/*     */     //   1066: aconst_null
/*     */     //   1067: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1070: astore #24
/*     */     //   1072: new androidx/compose/ui/graphics/SolidColor
/*     */     //   1075: dup
/*     */     //   1076: aload #5
/*     */     //   1078: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   1081: invokevirtual getContent-0d7_KjU : ()J
/*     */     //   1084: aconst_null
/*     */     //   1085: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1088: astore #25
/*     */     //   1090: aload_2
/*     */     //   1091: aload #22
/*     */     //   1093: iload_1
/*     */     //   1094: iconst_0
/*     */     //   1095: aconst_null
/*     */     //   1096: aload #24
/*     */     //   1098: aconst_null
/*     */     //   1099: aconst_null
/*     */     //   1100: aload #23
/*     */     //   1102: checkcast androidx/compose/foundation/text/input/TextFieldLineLimits
/*     */     //   1105: aconst_null
/*     */     //   1106: aload #8
/*     */     //   1108: aload #25
/*     */     //   1110: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   1113: aconst_null
/*     */     //   1114: aconst_null
/*     */     //   1115: aconst_null
/*     */     //   1116: aload #15
/*     */     //   1118: ldc 100663296
/*     */     //   1120: bipush #14
/*     */     //   1122: iload #18
/*     */     //   1124: bipush #6
/*     */     //   1126: ishr
/*     */     //   1127: iand
/*     */     //   1128: ior
/*     */     //   1129: sipush #896
/*     */     //   1132: iload #18
/*     */     //   1134: iconst_3
/*     */     //   1135: ishl
/*     */     //   1136: iand
/*     */     //   1137: ior
/*     */     //   1138: bipush #14
/*     */     //   1140: iload #18
/*     */     //   1142: bipush #24
/*     */     //   1144: ishr
/*     */     //   1145: iand
/*     */     //   1146: sipush #29400
/*     */     //   1149: invokestatic BasicTextField : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1152: invokestatic isTraceInProgress : ()Z
/*     */     //   1155: ifeq -> 1171
/*     */     //   1158: invokestatic traceEventEnd : ()V
/*     */     //   1161: goto -> 1171
/*     */     //   1164: aload #15
/*     */     //   1166: invokeinterface skipToGroupEnd : ()V
/*     */     //   1171: aload #15
/*     */     //   1173: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1178: dup
/*     */     //   1179: ifnull -> 1225
/*     */     //   1182: aload_0
/*     */     //   1183: iload_1
/*     */     //   1184: aload_2
/*     */     //   1185: iload_3
/*     */     //   1186: aload #4
/*     */     //   1188: aload #5
/*     */     //   1190: iload #6
/*     */     //   1192: aload #7
/*     */     //   1194: aload #8
/*     */     //   1196: aload #9
/*     */     //   1198: aload #10
/*     */     //   1200: aload #11
/*     */     //   1202: aload #12
/*     */     //   1204: aload #13
/*     */     //   1206: aload #14
/*     */     //   1208: iload #16
/*     */     //   1210: iload #17
/*     */     //   1212: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/TextFieldState;ZLandroidx/compose/ui/focus/FocusRequester;Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;ZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)Lkotlin/jvm/functions/Function2;
/*     */     //   1217: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1222: goto -> 1226
/*     */     //   1225: pop
/*     */     //   1226: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #239	-> 0
/*     */     //   #240	-> 529
/*     */     //   #245	-> 554
/*     */     //   #246	-> 555
/*     */     //   #247	-> 561
/*     */     //   #248	-> 605
/*     */     //   #556	-> 609
/*     */     //   #557	-> 621
/*     */     //   #558	-> 637
/*     */     //   #248	-> 642
/*     */     //   #558	-> 652
/*     */     //   #559	-> 654
/*     */     //   #560	-> 663
/*     */     //   #561	-> 668
/*     */     //   #557	-> 670
/*     */     //   #556	-> 671
/*     */     //   #556	-> 672
/*     */     //   #248	-> 673
/*     */     //   #249	-> 690
/*     */     //   #250	-> 811
/*     */     //   #562	-> 815
/*     */     //   #563	-> 827
/*     */     //   #564	-> 843
/*     */     //   #250	-> 848
/*     */     //   #564	-> 873
/*     */     //   #565	-> 875
/*     */     //   #566	-> 884
/*     */     //   #567	-> 889
/*     */     //   #563	-> 891
/*     */     //   #562	-> 892
/*     */     //   #562	-> 893
/*     */     //   #250	-> 894
/*     */     //   #284	-> 944
/*     */     //   #568	-> 948
/*     */     //   #569	-> 960
/*     */     //   #570	-> 976
/*     */     //   #284	-> 981
/*     */     //   #570	-> 991
/*     */     //   #571	-> 993
/*     */     //   #572	-> 1002
/*     */     //   #573	-> 1007
/*     */     //   #569	-> 1009
/*     */     //   #568	-> 1010
/*     */     //   #568	-> 1011
/*     */     //   #284	-> 1012
/*     */     //   #285	-> 1031
/*     */     //   #286	-> 1036
/*     */     //   #287	-> 1072
/*     */     //   #243	-> 1090
/*     */     //   #284	-> 1091
/*     */     //   #289	-> 1093
/*     */     //   #286	-> 1096
/*     */     //   #285	-> 1100
/*     */     //   #288	-> 1106
/*     */     //   #287	-> 1108
/*     */     //   #242	-> 1149
/*     */     //   #291	-> 1164
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   642	7	29	$i$a$-cache-EditableComboBoxKt$TextInput$1	I
/*     */     //   654	11	30	value$iv	Ljava/lang/Object;
/*     */     //   621	50	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   618	53	27	it$iv	Ljava/lang/Object;
/*     */     //   609	64	26	$i$f$cache	I
/*     */     //   606	67	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   606	67	25	invalid$iv	Z
/*     */     //   848	22	29	$i$a$-cache-EditableComboBoxKt$TextInput$2	I
/*     */     //   875	11	30	value$iv	Ljava/lang/Object;
/*     */     //   827	65	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   824	68	27	it$iv	Ljava/lang/Object;
/*     */     //   815	79	26	$i$f$cache	I
/*     */     //   812	82	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   812	82	25	invalid$iv	Z
/*     */     //   981	7	29	$i$a$-cache-EditableComboBoxKt$TextInput$3	I
/*     */     //   993	11	30	value$iv	Ljava/lang/Object;
/*     */     //   960	50	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   957	53	27	it$iv	Ljava/lang/Object;
/*     */     //   948	64	26	$i$f$cache	I
/*     */     //   945	67	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   945	67	25	invalid$iv	Z
/*     */     //   554	607	20	textColor	J
/*     */     //   16	1211	18	$dirty	I
/*     */     //   20	1207	19	$dirty1	I
/*     */     //   0	1227	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1227	1	isEnabled	Z
/*     */     //   0	1227	2	inputTextFieldState	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	1227	3	isFocused	Z
/*     */     //   0	1227	4	textFieldFocusRequester	Landroidx/compose/ui/focus/FocusRequester;
/*     */     //   0	1227	5	style	Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   0	1227	6	popupExpanded	Z
/*     */     //   0	1227	7	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1227	8	textFieldInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1227	9	onArrowDownPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1227	10	onArrowUpPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1227	11	onEnterPress	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1227	12	onSetPopupExpanded	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1227	13	onFocusedChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1227	14	onHoveredChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1227	15	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1227	16	$changed	I
/*     */     //   0	1227	17	$changed1	I
/*     */   }
/*     */   
/*     */   private static final Unit TextInput$lambda$44$lambda$43(Function1 $onFocusedChange, FocusState it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     $onFocusedChange.invoke(Boolean.valueOf(it.isFocused()));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class EditableComboBoxKt$TextInput$2$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       if (!KeyEventType.equals-impl0(KeyEvent_desktopKt.getType-ZmokQxo(it), KeyEventType.Companion.getKeyDown-CS__XNY()))
/*     */         return Boolean.valueOf(false); 
/*     */       if (this.$popupExpanded) {
/*     */         this.$onArrowDownPress.invoke();
/*     */       } else {
/*     */         this.$onSetPopupExpanded.invoke(Boolean.valueOf(true));
/*     */         this.$textFieldFocusRequester.requestFocus();
/*     */       } 
/*     */       if (this.$popupExpanded) {
/*     */         this.$onArrowUpPress.invoke();
/*     */       } else {
/*     */         this.$textFieldFocusRequester.requestFocus();
/*     */       } 
/*     */       if (this.$popupExpanded)
/*     */         this.$onSetPopupExpanded.invoke(Boolean.valueOf(false)); 
/*     */       this.$onEnterPress.invoke();
/*     */       this.$onSetPopupExpanded.invoke(Boolean.valueOf(false));
/*     */       return Boolean.valueOf(Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionDown-EK5gGoQ()) ? true : (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getDirectionUp-EK5gGoQ()) ? true : (Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEnter-EK5gGoQ()) ? true : ((Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(it), Key.Companion.getEscape-EK5gGoQ()) && this.$popupExpanded)))));
/*     */     }
/*     */     
/*     */     EditableComboBoxKt$TextInput$2$1(boolean $popupExpanded, Function0<Unit> $onArrowDownPress, Function1<Boolean, Unit> $onSetPopupExpanded, FocusRequester $textFieldFocusRequester, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress) {}
/*     */   }
/*     */   
/*     */   private static final Unit TextInput$lambda$47$lambda$46(Function1 $onHoveredChange, boolean it) {
/*     */     $onHoveredChange.invoke(Boolean.valueOf(it));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void Chevron(boolean isEnabled, ComboBoxStyle style, MutableInteractionSource interactionSource, Function1 onHoveredChange, Function1 setPopupExpanded, Function0 onPressWhenEnabled, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: ldc_w 1823740829
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #6
/*     */     //   12: iload #7
/*     */     //   14: istore #8
/*     */     //   16: iload #7
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #8
/*     */     //   26: aload #6
/*     */     //   28: iload_0
/*     */     //   29: invokeinterface changed : (Z)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #8
/*     */     //   45: iload #7
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #8
/*     */     //   55: aload #6
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #8
/*     */     //   76: iload #7
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #8
/*     */     //   87: aload #6
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #8
/*     */     //   110: iload #7
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #8
/*     */     //   121: aload #6
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #8
/*     */     //   144: iload #7
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #8
/*     */     //   155: aload #6
/*     */     //   157: aload #4
/*     */     //   159: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #8
/*     */     //   179: iload #7
/*     */     //   181: ldc 196608
/*     */     //   183: iand
/*     */     //   184: ifne -> 211
/*     */     //   187: iload #8
/*     */     //   189: aload #6
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   198: ifeq -> 206
/*     */     //   201: ldc 131072
/*     */     //   203: goto -> 208
/*     */     //   206: ldc 65536
/*     */     //   208: ior
/*     */     //   209: istore #8
/*     */     //   211: iload #8
/*     */     //   213: ldc_w 74899
/*     */     //   216: iand
/*     */     //   217: ldc_w 74898
/*     */     //   220: if_icmpne -> 233
/*     */     //   223: aload #6
/*     */     //   225: invokeinterface getSkipping : ()Z
/*     */     //   230: ifne -> 1668
/*     */     //   233: invokestatic isTraceInProgress : ()Z
/*     */     //   236: ifeq -> 251
/*     */     //   239: ldc_w 1823740829
/*     */     //   242: iload #8
/*     */     //   244: iconst_m1
/*     */     //   245: ldc_w 'org.jetbrains.jewel.ui.component.Chevron (EditableComboBox.kt:300)'
/*     */     //   248: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   251: aload #6
/*     */     //   253: ldc_w 383663047
/*     */     //   256: invokeinterface startReplaceGroup : (I)V
/*     */     //   261: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   264: checkcast androidx/compose/ui/Modifier
/*     */     //   267: ldc_w 'Jewel.ComboBox.ChevronContainer'
/*     */     //   270: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   273: aload_1
/*     */     //   274: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   277: invokevirtual getArrowAreaSize-MYxV2XQ : ()J
/*     */     //   280: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   283: astore #10
/*     */     //   285: nop
/*     */     //   286: iconst_0
/*     */     //   287: istore #11
/*     */     //   289: iload_0
/*     */     //   290: ifeq -> 698
/*     */     //   293: aload #10
/*     */     //   295: astore #12
/*     */     //   297: iconst_0
/*     */     //   298: istore #13
/*     */     //   300: aload #12
/*     */     //   302: aload #6
/*     */     //   304: ldc_w 233942483
/*     */     //   307: invokeinterface startReplaceGroup : (I)V
/*     */     //   312: aload #6
/*     */     //   314: astore #14
/*     */     //   316: iload #8
/*     */     //   318: sipush #7168
/*     */     //   321: iand
/*     */     //   322: sipush #2048
/*     */     //   325: if_icmpne -> 332
/*     */     //   328: iconst_1
/*     */     //   329: goto -> 333
/*     */     //   332: iconst_0
/*     */     //   333: istore #15
/*     */     //   335: iconst_0
/*     */     //   336: istore #16
/*     */     //   338: aload #14
/*     */     //   340: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   345: astore #17
/*     */     //   347: iconst_0
/*     */     //   348: istore #18
/*     */     //   350: iload #15
/*     */     //   352: ifne -> 366
/*     */     //   355: aload #17
/*     */     //   357: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   360: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   363: if_acmpne -> 396
/*     */     //   366: astore #19
/*     */     //   368: iconst_0
/*     */     //   369: istore #20
/*     */     //   371: aload_3
/*     */     //   372: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
/*     */     //   377: aload #19
/*     */     //   379: swap
/*     */     //   380: astore #21
/*     */     //   382: aload #14
/*     */     //   384: aload #21
/*     */     //   386: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   391: aload #21
/*     */     //   393: goto -> 398
/*     */     //   396: aload #17
/*     */     //   398: nop
/*     */     //   399: nop
/*     */     //   400: nop
/*     */     //   401: checkcast kotlin/jvm/functions/Function1
/*     */     //   404: astore #22
/*     */     //   406: aload #6
/*     */     //   408: invokeinterface endReplaceGroup : ()V
/*     */     //   413: aload #22
/*     */     //   415: invokestatic onHover : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   418: aload_2
/*     */     //   419: aload #6
/*     */     //   421: ldc_w 233945198
/*     */     //   424: invokeinterface startReplaceGroup : (I)V
/*     */     //   429: aload #6
/*     */     //   431: astore #14
/*     */     //   433: iload #8
/*     */     //   435: ldc_w 458752
/*     */     //   438: iand
/*     */     //   439: ldc 131072
/*     */     //   441: if_icmpne -> 448
/*     */     //   444: iconst_1
/*     */     //   445: goto -> 449
/*     */     //   448: iconst_0
/*     */     //   449: iload #8
/*     */     //   451: ldc_w 57344
/*     */     //   454: iand
/*     */     //   455: sipush #16384
/*     */     //   458: if_icmpne -> 465
/*     */     //   461: iconst_1
/*     */     //   462: goto -> 466
/*     */     //   465: iconst_0
/*     */     //   466: ior
/*     */     //   467: istore #15
/*     */     //   469: iconst_0
/*     */     //   470: istore #16
/*     */     //   472: aload #14
/*     */     //   474: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   479: astore #17
/*     */     //   481: iconst_0
/*     */     //   482: istore #18
/*     */     //   484: iload #15
/*     */     //   486: ifne -> 500
/*     */     //   489: aload #17
/*     */     //   491: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   494: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   497: if_acmpne -> 546
/*     */     //   500: astore #23
/*     */     //   502: astore #19
/*     */     //   504: iconst_0
/*     */     //   505: istore #20
/*     */     //   507: new org/jetbrains/jewel/ui/component/EditableComboBoxKt$Chevron$1$2$1
/*     */     //   510: dup
/*     */     //   511: aload #5
/*     */     //   513: aload #4
/*     */     //   515: aconst_null
/*     */     //   516: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   519: checkcast kotlin/jvm/functions/Function2
/*     */     //   522: astore #24
/*     */     //   524: aload #19
/*     */     //   526: aload #23
/*     */     //   528: aload #24
/*     */     //   530: astore #21
/*     */     //   532: aload #14
/*     */     //   534: aload #21
/*     */     //   536: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   541: aload #21
/*     */     //   543: goto -> 548
/*     */     //   546: aload #17
/*     */     //   548: nop
/*     */     //   549: nop
/*     */     //   550: nop
/*     */     //   551: checkcast kotlin/jvm/functions/Function2
/*     */     //   554: astore #22
/*     */     //   556: aload #6
/*     */     //   558: invokeinterface endReplaceGroup : ()V
/*     */     //   563: aload #22
/*     */     //   565: invokestatic pointerInput : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;
/*     */     //   568: iconst_0
/*     */     //   569: aload #6
/*     */     //   571: ldc_w 233951197
/*     */     //   574: invokeinterface startReplaceGroup : (I)V
/*     */     //   579: aload #6
/*     */     //   581: astore #14
/*     */     //   583: iload #8
/*     */     //   585: ldc_w 458752
/*     */     //   588: iand
/*     */     //   589: ldc 131072
/*     */     //   591: if_icmpne -> 598
/*     */     //   594: iconst_1
/*     */     //   595: goto -> 599
/*     */     //   598: iconst_0
/*     */     //   599: istore #15
/*     */     //   601: iconst_0
/*     */     //   602: istore #16
/*     */     //   604: aload #14
/*     */     //   606: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   611: astore #17
/*     */     //   613: iconst_0
/*     */     //   614: istore #18
/*     */     //   616: iload #15
/*     */     //   618: ifne -> 632
/*     */     //   621: aload #17
/*     */     //   623: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   626: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   629: if_acmpne -> 670
/*     */     //   632: istore #23
/*     */     //   634: astore #19
/*     */     //   636: iconst_0
/*     */     //   637: istore #20
/*     */     //   639: aload #5
/*     */     //   641: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*     */     //   646: astore #24
/*     */     //   648: aload #19
/*     */     //   650: iload #23
/*     */     //   652: aload #24
/*     */     //   654: astore #21
/*     */     //   656: aload #14
/*     */     //   658: aload #21
/*     */     //   660: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   665: aload #21
/*     */     //   667: goto -> 672
/*     */     //   670: aload #17
/*     */     //   672: nop
/*     */     //   673: nop
/*     */     //   674: nop
/*     */     //   675: checkcast kotlin/jvm/functions/Function1
/*     */     //   678: astore #22
/*     */     //   680: aload #6
/*     */     //   682: invokeinterface endReplaceGroup : ()V
/*     */     //   687: aload #22
/*     */     //   689: iconst_1
/*     */     //   690: aconst_null
/*     */     //   691: invokestatic semantics$default : (Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   694: nop
/*     */     //   695: goto -> 700
/*     */     //   698: aload #10
/*     */     //   700: astore #9
/*     */     //   702: aload #6
/*     */     //   704: invokeinterface endReplaceGroup : ()V
/*     */     //   709: aload #9
/*     */     //   711: astore #9
/*     */     //   713: iconst_0
/*     */     //   714: istore #12
/*     */     //   716: nop
/*     */     //   717: iconst_0
/*     */     //   718: istore #13
/*     */     //   720: aload #6
/*     */     //   722: ldc_w 733328855
/*     */     //   725: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   728: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   731: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   734: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   737: astore #10
/*     */     //   739: iconst_0
/*     */     //   740: istore #11
/*     */     //   742: aload #10
/*     */     //   744: iload #11
/*     */     //   746: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   749: astore #14
/*     */     //   751: bipush #112
/*     */     //   753: iload #12
/*     */     //   755: iconst_3
/*     */     //   756: ishl
/*     */     //   757: iand
/*     */     //   758: istore #15
/*     */     //   760: nop
/*     */     //   761: iconst_0
/*     */     //   762: istore #16
/*     */     //   764: aload #6
/*     */     //   766: ldc_w -1323940314
/*     */     //   769: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   772: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   775: aload #6
/*     */     //   777: iconst_0
/*     */     //   778: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   781: istore #17
/*     */     //   783: aload #6
/*     */     //   785: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   790: astore #18
/*     */     //   792: aload #6
/*     */     //   794: aload #9
/*     */     //   796: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   799: astore #19
/*     */     //   801: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   804: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   807: astore #20
/*     */     //   809: bipush #6
/*     */     //   811: sipush #896
/*     */     //   814: iload #15
/*     */     //   816: bipush #6
/*     */     //   818: ishl
/*     */     //   819: iand
/*     */     //   820: ior
/*     */     //   821: istore #21
/*     */     //   823: nop
/*     */     //   824: iconst_0
/*     */     //   825: istore #22
/*     */     //   827: aload #6
/*     */     //   829: ldc_w -692256719
/*     */     //   832: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   835: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   838: aload #6
/*     */     //   840: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   845: instanceof androidx/compose/runtime/Applier
/*     */     //   848: ifne -> 854
/*     */     //   851: invokestatic invalidApplier : ()V
/*     */     //   854: aload #6
/*     */     //   856: invokeinterface startReusableNode : ()V
/*     */     //   861: aload #6
/*     */     //   863: invokeinterface getInserting : ()Z
/*     */     //   868: ifeq -> 883
/*     */     //   871: aload #6
/*     */     //   873: aload #20
/*     */     //   875: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   880: goto -> 890
/*     */     //   883: aload #6
/*     */     //   885: invokeinterface useNode : ()V
/*     */     //   890: aload #6
/*     */     //   892: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   895: astore #23
/*     */     //   897: iconst_0
/*     */     //   898: istore #24
/*     */     //   900: aload #23
/*     */     //   902: aload #14
/*     */     //   904: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   907: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   910: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   913: aload #23
/*     */     //   915: aload #18
/*     */     //   917: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   920: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   923: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   926: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   929: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   932: astore #25
/*     */     //   934: iconst_0
/*     */     //   935: istore #26
/*     */     //   937: aload #23
/*     */     //   939: astore #27
/*     */     //   941: iconst_0
/*     */     //   942: istore #28
/*     */     //   944: aload #27
/*     */     //   946: invokeinterface getInserting : ()Z
/*     */     //   951: ifne -> 972
/*     */     //   954: aload #27
/*     */     //   956: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   961: iload #17
/*     */     //   963: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   966: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   969: ifne -> 998
/*     */     //   972: aload #27
/*     */     //   974: iload #17
/*     */     //   976: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   979: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   984: aload #23
/*     */     //   986: iload #17
/*     */     //   988: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   991: aload #25
/*     */     //   993: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   998: nop
/*     */     //   999: nop
/*     */     //   1000: nop
/*     */     //   1001: aload #23
/*     */     //   1003: aload #19
/*     */     //   1005: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1008: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1011: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1014: nop
/*     */     //   1015: nop
/*     */     //   1016: aload #6
/*     */     //   1018: bipush #14
/*     */     //   1020: iload #21
/*     */     //   1022: bipush #6
/*     */     //   1024: ishr
/*     */     //   1025: iand
/*     */     //   1026: istore #29
/*     */     //   1028: astore #30
/*     */     //   1030: iconst_0
/*     */     //   1031: istore #31
/*     */     //   1033: aload #30
/*     */     //   1035: ldc_w -2146769399
/*     */     //   1038: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1041: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1044: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1047: aload #30
/*     */     //   1049: bipush #6
/*     */     //   1051: bipush #112
/*     */     //   1053: iload #12
/*     */     //   1055: bipush #6
/*     */     //   1057: ishr
/*     */     //   1058: iand
/*     */     //   1059: ior
/*     */     //   1060: istore #32
/*     */     //   1062: astore #33
/*     */     //   1064: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1067: astore #34
/*     */     //   1069: iconst_0
/*     */     //   1070: istore #35
/*     */     //   1072: iload_0
/*     */     //   1073: ifeq -> 1086
/*     */     //   1076: aload_1
/*     */     //   1077: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   1080: invokevirtual getBorder-0d7_KjU : ()J
/*     */     //   1083: goto -> 1093
/*     */     //   1086: aload_1
/*     */     //   1087: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   1090: invokevirtual getBorderDisabled-0d7_KjU : ()J
/*     */     //   1093: lstore #36
/*     */     //   1095: iload_0
/*     */     //   1096: ifeq -> 1108
/*     */     //   1099: getstatic androidx/compose/ui/graphics/Color.Companion : Landroidx/compose/ui/graphics/Color$Companion;
/*     */     //   1102: invokevirtual getUnspecified-0d7_KjU : ()J
/*     */     //   1105: goto -> 1115
/*     */     //   1108: aload_1
/*     */     //   1109: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxColors;
/*     */     //   1112: invokevirtual getContentDisabled-0d7_KjU : ()J
/*     */     //   1115: lstore #38
/*     */     //   1117: getstatic org/jetbrains/jewel/ui/Orientation.Vertical : Lorg/jetbrains/jewel/ui/Orientation;
/*     */     //   1120: astore #40
/*     */     //   1122: aload_1
/*     */     //   1123: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxMetrics;
/*     */     //   1126: invokevirtual getBorderWidth-D9Ej5fM : ()F
/*     */     //   1129: fstore #41
/*     */     //   1131: aload #34
/*     */     //   1133: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1136: checkcast androidx/compose/ui/Modifier
/*     */     //   1139: ldc_w 'Jewel.ComboBox.Divider'
/*     */     //   1142: invokestatic testTag : (Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
/*     */     //   1145: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1148: invokevirtual getCenterStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1151: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   1156: fconst_0
/*     */     //   1157: iconst_1
/*     */     //   1158: aconst_null
/*     */     //   1159: invokestatic fillMaxHeight$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1162: astore #42
/*     */     //   1164: aload #40
/*     */     //   1166: aload #42
/*     */     //   1168: lload #36
/*     */     //   1170: fload #41
/*     */     //   1172: fconst_0
/*     */     //   1173: aconst_null
/*     */     //   1174: aload #33
/*     */     //   1176: bipush #6
/*     */     //   1178: bipush #48
/*     */     //   1180: invokestatic Divider-RLL6an4 : (Lorg/jetbrains/jewel/ui/Orientation;Landroidx/compose/ui/Modifier;JFFLorg/jetbrains/jewel/ui/component/styling/DividerStyle;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1183: aload #34
/*     */     //   1185: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1188: checkcast androidx/compose/ui/Modifier
/*     */     //   1191: fconst_0
/*     */     //   1192: iconst_1
/*     */     //   1193: aconst_null
/*     */     //   1194: invokestatic fillMaxWidth$default : (Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1197: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1200: invokevirtual getCenterEnd : ()Landroidx/compose/ui/Alignment;
/*     */     //   1203: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   1208: astore #40
/*     */     //   1210: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1213: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1216: astore #41
/*     */     //   1218: bipush #48
/*     */     //   1220: istore #43
/*     */     //   1222: iconst_0
/*     */     //   1223: istore #44
/*     */     //   1225: aload #33
/*     */     //   1227: ldc_w 733328855
/*     */     //   1230: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1233: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1236: iconst_0
/*     */     //   1237: istore #42
/*     */     //   1239: aload #41
/*     */     //   1241: iload #42
/*     */     //   1243: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1246: astore #45
/*     */     //   1248: bipush #112
/*     */     //   1250: iload #43
/*     */     //   1252: iconst_3
/*     */     //   1253: ishl
/*     */     //   1254: iand
/*     */     //   1255: istore #46
/*     */     //   1257: nop
/*     */     //   1258: iconst_0
/*     */     //   1259: istore #47
/*     */     //   1261: aload #33
/*     */     //   1263: ldc_w -1323940314
/*     */     //   1266: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1269: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1272: aload #33
/*     */     //   1274: iconst_0
/*     */     //   1275: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1278: istore #48
/*     */     //   1280: aload #33
/*     */     //   1282: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1287: astore #49
/*     */     //   1289: aload #33
/*     */     //   1291: aload #40
/*     */     //   1293: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1296: astore #50
/*     */     //   1298: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1301: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1304: astore #51
/*     */     //   1306: bipush #6
/*     */     //   1308: sipush #896
/*     */     //   1311: iload #46
/*     */     //   1313: bipush #6
/*     */     //   1315: ishl
/*     */     //   1316: iand
/*     */     //   1317: ior
/*     */     //   1318: istore #52
/*     */     //   1320: nop
/*     */     //   1321: iconst_0
/*     */     //   1322: istore #53
/*     */     //   1324: aload #33
/*     */     //   1326: ldc_w -692256719
/*     */     //   1329: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1332: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1335: aload #33
/*     */     //   1337: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1342: instanceof androidx/compose/runtime/Applier
/*     */     //   1345: ifne -> 1351
/*     */     //   1348: invokestatic invalidApplier : ()V
/*     */     //   1351: aload #33
/*     */     //   1353: invokeinterface startReusableNode : ()V
/*     */     //   1358: aload #33
/*     */     //   1360: invokeinterface getInserting : ()Z
/*     */     //   1365: ifeq -> 1380
/*     */     //   1368: aload #33
/*     */     //   1370: aload #51
/*     */     //   1372: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1377: goto -> 1387
/*     */     //   1380: aload #33
/*     */     //   1382: invokeinterface useNode : ()V
/*     */     //   1387: aload #33
/*     */     //   1389: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1392: astore #54
/*     */     //   1394: iconst_0
/*     */     //   1395: istore #55
/*     */     //   1397: aload #54
/*     */     //   1399: aload #45
/*     */     //   1401: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1404: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1407: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1410: aload #54
/*     */     //   1412: aload #49
/*     */     //   1414: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1417: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1420: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1423: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1426: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1429: astore #56
/*     */     //   1431: iconst_0
/*     */     //   1432: istore #57
/*     */     //   1434: aload #54
/*     */     //   1436: astore #58
/*     */     //   1438: iconst_0
/*     */     //   1439: istore #59
/*     */     //   1441: aload #58
/*     */     //   1443: invokeinterface getInserting : ()Z
/*     */     //   1448: ifne -> 1469
/*     */     //   1451: aload #58
/*     */     //   1453: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1458: iload #48
/*     */     //   1460: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1463: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1466: ifne -> 1495
/*     */     //   1469: aload #58
/*     */     //   1471: iload #48
/*     */     //   1473: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1476: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1481: aload #54
/*     */     //   1483: iload #48
/*     */     //   1485: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1488: aload #56
/*     */     //   1490: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1495: nop
/*     */     //   1496: nop
/*     */     //   1497: nop
/*     */     //   1498: aload #54
/*     */     //   1500: aload #50
/*     */     //   1502: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1505: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1508: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1511: nop
/*     */     //   1512: nop
/*     */     //   1513: aload #33
/*     */     //   1515: bipush #14
/*     */     //   1517: iload #52
/*     */     //   1519: bipush #6
/*     */     //   1521: ishr
/*     */     //   1522: iand
/*     */     //   1523: istore #60
/*     */     //   1525: astore #61
/*     */     //   1527: iconst_0
/*     */     //   1528: istore #62
/*     */     //   1530: aload #61
/*     */     //   1532: ldc_w -2146769399
/*     */     //   1535: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1538: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1541: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1544: aload #61
/*     */     //   1546: bipush #6
/*     */     //   1548: bipush #112
/*     */     //   1550: iload #43
/*     */     //   1552: bipush #6
/*     */     //   1554: ishr
/*     */     //   1555: iand
/*     */     //   1556: ior
/*     */     //   1557: istore #63
/*     */     //   1559: astore #64
/*     */     //   1561: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1564: astore #65
/*     */     //   1566: iconst_0
/*     */     //   1567: istore #66
/*     */     //   1569: aload_1
/*     */     //   1570: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/ComboBoxIcons;
/*     */     //   1573: invokevirtual getChevronDown : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   1576: aconst_null
/*     */     //   1577: aconst_null
/*     */     //   1578: aconst_null
/*     */     //   1579: lload #38
/*     */     //   1581: iconst_0
/*     */     //   1582: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   1585: aload #64
/*     */     //   1587: bipush #48
/*     */     //   1589: bipush #12
/*     */     //   1591: invokestatic Icon-FHprtrg : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Class;J[Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1594: nop
/*     */     //   1595: aload #61
/*     */     //   1597: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1600: aload #33
/*     */     //   1602: invokeinterface endNode : ()V
/*     */     //   1607: aload #33
/*     */     //   1609: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1612: nop
/*     */     //   1613: aload #33
/*     */     //   1615: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1618: nop
/*     */     //   1619: aload #33
/*     */     //   1621: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1624: nop
/*     */     //   1625: nop
/*     */     //   1626: aload #30
/*     */     //   1628: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1631: aload #6
/*     */     //   1633: invokeinterface endNode : ()V
/*     */     //   1638: aload #6
/*     */     //   1640: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1643: nop
/*     */     //   1644: aload #6
/*     */     //   1646: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1649: nop
/*     */     //   1650: aload #6
/*     */     //   1652: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1655: nop
/*     */     //   1656: invokestatic isTraceInProgress : ()Z
/*     */     //   1659: ifeq -> 1675
/*     */     //   1662: invokestatic traceEventEnd : ()V
/*     */     //   1665: goto -> 1675
/*     */     //   1668: aload #6
/*     */     //   1670: invokeinterface skipToGroupEnd : ()V
/*     */     //   1675: aload #6
/*     */     //   1677: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1682: dup
/*     */     //   1683: ifnull -> 1709
/*     */     //   1686: iload_0
/*     */     //   1687: aload_1
/*     */     //   1688: aload_2
/*     */     //   1689: aload_3
/*     */     //   1690: aload #4
/*     */     //   1692: aload #5
/*     */     //   1694: iload #7
/*     */     //   1696: <illegal opcode> invoke : (ZLorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1701: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1706: goto -> 1710
/*     */     //   1709: pop
/*     */     //   1710: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #301	-> 0
/*     */     //   #304	-> 261
/*     */     //   #305	-> 273
/*     */     //   #306	-> 285
/*     */     //   #574	-> 289
/*     */     //   #307	-> 300
/*     */     //   #575	-> 338
/*     */     //   #576	-> 350
/*     */     //   #577	-> 366
/*     */     //   #307	-> 371
/*     */     //   #577	-> 380
/*     */     //   #578	-> 382
/*     */     //   #579	-> 391
/*     */     //   #580	-> 396
/*     */     //   #576	-> 398
/*     */     //   #575	-> 399
/*     */     //   #575	-> 400
/*     */     //   #307	-> 401
/*     */     //   #308	-> 418
/*     */     //   #581	-> 472
/*     */     //   #582	-> 484
/*     */     //   #583	-> 500
/*     */     //   #308	-> 507
/*     */     //   #583	-> 530
/*     */     //   #584	-> 532
/*     */     //   #585	-> 541
/*     */     //   #586	-> 546
/*     */     //   #582	-> 548
/*     */     //   #581	-> 549
/*     */     //   #581	-> 550
/*     */     //   #308	-> 551
/*     */     //   #311	-> 568
/*     */     //   #587	-> 604
/*     */     //   #588	-> 616
/*     */     //   #589	-> 632
/*     */     //   #311	-> 639
/*     */     //   #589	-> 654
/*     */     //   #590	-> 656
/*     */     //   #591	-> 665
/*     */     //   #592	-> 670
/*     */     //   #588	-> 672
/*     */     //   #587	-> 673
/*     */     //   #587	-> 674
/*     */     //   #311	-> 675
/*     */     //   #319	-> 694
/*     */     //   #574	-> 695
/*     */     //   #306	-> 700
/*     */     //   #302	-> 716
/*     */     //   #593	-> 728
/*     */     //   #594	-> 731
/*     */     //   #595	-> 739
/*     */     //   #598	-> 742
/*     */     //   #599	-> 760
/*     */     //   #600	-> 772
/*     */     //   #601	-> 778
/*     */     //   #602	-> 785
/*     */     //   #603	-> 794
/*     */     //   #605	-> 801
/*     */     //   #604	-> 823
/*     */     //   #606	-> 835
/*     */     //   #607	-> 838
/*     */     //   #608	-> 856
/*     */     //   #609	-> 861
/*     */     //   #610	-> 873
/*     */     //   #612	-> 885
/*     */     //   #614	-> 890
/*     */     //   #615	-> 900
/*     */     //   #616	-> 913
/*     */     //   #618	-> 926
/*     */     //   #619	-> 937
/*     */     //   #620	-> 944
/*     */     //   #621	-> 972
/*     */     //   #622	-> 984
/*     */     //   #624	-> 998
/*     */     //   #619	-> 999
/*     */     //   #624	-> 1000
/*     */     //   #625	-> 1001
/*     */     //   #626	-> 1014
/*     */     //   #614	-> 1015
/*     */     //   #627	-> 1016
/*     */     //   #628	-> 1041
/*     */     //   #322	-> 1072
/*     */     //   #323	-> 1095
/*     */     //   #325	-> 1117
/*     */     //   #326	-> 1122
/*     */     //   #328	-> 1131
/*     */     //   #325	-> 1164
/*     */     //   #328	-> 1166
/*     */     //   #327	-> 1168
/*     */     //   #326	-> 1170
/*     */     //   #324	-> 1180
/*     */     //   #331	-> 1183
/*     */     //   #629	-> 1233
/*     */     //   #630	-> 1236
/*     */     //   #633	-> 1239
/*     */     //   #634	-> 1257
/*     */     //   #635	-> 1269
/*     */     //   #636	-> 1275
/*     */     //   #637	-> 1282
/*     */     //   #638	-> 1291
/*     */     //   #640	-> 1298
/*     */     //   #639	-> 1320
/*     */     //   #641	-> 1332
/*     */     //   #642	-> 1335
/*     */     //   #643	-> 1353
/*     */     //   #644	-> 1358
/*     */     //   #645	-> 1370
/*     */     //   #647	-> 1382
/*     */     //   #649	-> 1387
/*     */     //   #650	-> 1397
/*     */     //   #651	-> 1410
/*     */     //   #653	-> 1423
/*     */     //   #654	-> 1434
/*     */     //   #655	-> 1441
/*     */     //   #656	-> 1469
/*     */     //   #657	-> 1481
/*     */     //   #659	-> 1495
/*     */     //   #654	-> 1496
/*     */     //   #659	-> 1497
/*     */     //   #660	-> 1498
/*     */     //   #661	-> 1511
/*     */     //   #649	-> 1512
/*     */     //   #662	-> 1513
/*     */     //   #663	-> 1538
/*     */     //   #332	-> 1569
/*     */     //   #333	-> 1594
/*     */     //   #663	-> 1595
/*     */     //   #662	-> 1600
/*     */     //   #664	-> 1602
/*     */     //   #641	-> 1609
/*     */     //   #665	-> 1612
/*     */     //   #635	-> 1615
/*     */     //   #666	-> 1618
/*     */     //   #629	-> 1621
/*     */     //   #667	-> 1624
/*     */     //   #334	-> 1625
/*     */     //   #628	-> 1626
/*     */     //   #627	-> 1631
/*     */     //   #668	-> 1633
/*     */     //   #606	-> 1640
/*     */     //   #669	-> 1643
/*     */     //   #600	-> 1646
/*     */     //   #670	-> 1649
/*     */     //   #593	-> 1652
/*     */     //   #671	-> 1655
/*     */     //   #335	-> 1668
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   371	6	20	$i$a$-cache-EditableComboBoxKt$Chevron$1$1	I
/*     */     //   382	11	21	value$iv	Ljava/lang/Object;
/*     */     //   350	49	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   347	52	17	it$iv	Ljava/lang/Object;
/*     */     //   338	63	16	$i$f$cache	I
/*     */     //   335	66	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   335	66	15	invalid$iv	Z
/*     */     //   507	15	20	$i$a$-cache-EditableComboBoxKt$Chevron$1$2	I
/*     */     //   532	11	21	value$iv	Ljava/lang/Object;
/*     */     //   484	65	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   481	68	17	it$iv	Ljava/lang/Object;
/*     */     //   472	79	16	$i$f$cache	I
/*     */     //   469	82	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   469	82	15	invalid$iv	Z
/*     */     //   639	7	20	$i$a$-cache-EditableComboBoxKt$Chevron$1$3	I
/*     */     //   656	11	21	value$iv	Ljava/lang/Object;
/*     */     //   616	57	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   613	60	17	it$iv	Ljava/lang/Object;
/*     */     //   604	71	16	$i$f$cache	I
/*     */     //   601	74	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   601	74	15	invalid$iv	Z
/*     */     //   300	395	13	$i$a$-thenIf-EditableComboBoxKt$Chevron$1	I
/*     */     //   297	398	12	$this$Chevron_u24lambda_u2455	Landroidx/compose/ui/Modifier;
/*     */     //   289	411	11	$i$f$thenIf	I
/*     */     //   286	414	10	$this$thenIf$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1569	26	66	$i$a$-Box-EditableComboBoxKt$Chevron$2$1	I
/*     */     //   1566	29	65	$this$Chevron_u24lambda_u2457_u24lambda_u2456	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1566	29	64	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1566	29	63	$changed	I
/*     */     //   1530	70	62	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1527	73	61	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1527	73	60	$changed$iv	I
/*     */     //   1441	55	59	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1438	58	58	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1434	64	57	$i$f$set-impl	I
/*     */     //   1431	67	56	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1397	115	55	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1394	118	54	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1324	289	53	$i$f$ReusableComposeNode	I
/*     */     //   1321	292	51	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1321	292	52	$changed$iv$iv$iv	I
/*     */     //   1261	358	47	$i$f$Layout	I
/*     */     //   1280	339	48	compositeKeyHash$iv$iv	I
/*     */     //   1289	330	49	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1298	321	50	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1258	361	46	$changed$iv$iv	I
/*     */     //   1225	400	44	$i$f$Box	I
/*     */     //   1248	377	45	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1222	403	40	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1222	403	41	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1239	386	42	propagateMinConstraints$iv	Z
/*     */     //   1222	403	43	$changed$iv	I
/*     */     //   1072	554	35	$i$a$-Box-EditableComboBoxKt$Chevron$2	I
/*     */     //   1095	531	36	dividerColor	J
/*     */     //   1117	509	38	iconTint	J
/*     */     //   1069	557	34	$this$Chevron_u24lambda_u2457	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1069	557	33	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1069	557	32	$changed	I
/*     */     //   1033	598	31	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1030	601	30	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1030	601	29	$changed$iv	I
/*     */     //   944	55	28	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   941	58	27	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   937	64	26	$i$f$set-impl	I
/*     */     //   934	67	25	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   900	115	24	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   897	118	23	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   827	817	22	$i$f$ReusableComposeNode	I
/*     */     //   824	820	20	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   824	820	21	$changed$iv$iv$iv	I
/*     */     //   764	886	16	$i$f$Layout	I
/*     */     //   783	867	17	compositeKeyHash$iv$iv	I
/*     */     //   792	858	18	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   801	849	19	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   761	889	15	$changed$iv$iv	I
/*     */     //   720	936	13	$i$f$Box	I
/*     */     //   751	905	14	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   717	939	9	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   739	917	10	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   742	914	11	propagateMinConstraints$iv	Z
/*     */     //   717	939	12	$changed$iv	I
/*     */     //   16	1695	8	$dirty	I
/*     */     //   0	1711	0	isEnabled	Z
/*     */     //   0	1711	1	style	Lorg/jetbrains/jewel/ui/component/styling/ComboBoxStyle;
/*     */     //   0	1711	2	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1711	3	onHoveredChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1711	4	setPopupExpanded	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1711	5	onPressWhenEnabled	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1711	6	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1711	7	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Chevron$lambda$55$lambda$50$lambda$49(Function1 $onHoveredChange, boolean it) {
/*     */     $onHoveredChange.invoke(Boolean.valueOf(it));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditableComboBox.kt", l = {309}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.EditableComboBoxKt$Chevron$1$2$1")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */   static final class EditableComboBoxKt$Chevron$1$2$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     EditableComboBoxKt$Chevron$1$2$1(Function0<Unit> $onPressWhenEnabled, Function1<Boolean, Unit> $setPopupExpanded, Continuation $completion) {
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
/*     */           if (EditableComboBoxKt.detectPressAndCancel($this$pointerInput, this.$onPressWhenEnabled, this.$setPopupExpanded::invokeSuspend$lambda$0, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           EditableComboBoxKt.detectPressAndCancel($this$pointerInput, this.$onPressWhenEnabled, this.$setPopupExpanded::invokeSuspend$lambda$0, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super EditableComboBoxKt$Chevron$1$2$1> $completion) {
/*     */       EditableComboBoxKt$Chevron$1$2$1 editableComboBoxKt$Chevron$1$2$1 = new EditableComboBoxKt$Chevron$1$2$1(this.$onPressWhenEnabled, this.$setPopupExpanded, $completion);
/*     */       editableComboBoxKt$Chevron$1$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)editableComboBoxKt$Chevron$1$2$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */       return ((EditableComboBoxKt$Chevron$1$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(Function1 $setPopupExpanded) {
/*     */       $setPopupExpanded.invoke(Boolean.valueOf(false));
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit Chevron$lambda$55$lambda$54$lambda$53(Function0 $onPressWhenEnabled, SemanticsPropertyReceiver $this$semantics) {
/*     */     Intrinsics.checkNotNullParameter($this$semantics, "$this$semantics");
/*     */     SemanticsPropertiesKt.onClick($this$semantics, "Chevron", $onPressWhenEnabled::Chevron$lambda$55$lambda$54$lambda$53$lambda$52);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final boolean Chevron$lambda$55$lambda$54$lambda$53$lambda$52(Function0 $onPressWhenEnabled) {
/*     */     $onPressWhenEnabled.invoke();
/*     */     return true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object detectPressAndCancel(@NotNull PointerInputScope $this$detectPressAndCancel, @NotNull Function0<Unit> onPress, @NotNull Function0<Unit> onCancel, @NotNull Continuation $completion) {
/*     */     if (CoroutineScopeKt.coroutineScope(new EditableComboBoxKt$detectPressAndCancel$2($this$detectPressAndCancel, onPress, onCancel, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return CoroutineScopeKt.coroutineScope(new EditableComboBoxKt$detectPressAndCancel$2($this$detectPressAndCancel, onPress, onCancel, null), $completion); 
/*     */     CoroutineScopeKt.coroutineScope(new EditableComboBoxKt$detectPressAndCancel$2($this$detectPressAndCancel, onPress, onCancel, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit EditableComboBox$lambda$42(Modifier $modifier, Modifier $menuModifier, boolean $isEnabled, TextFieldState $inputTextFieldState, Outline $outline, MutableInteractionSource $interactionSource, ComboBoxStyle $style, TextStyle $textStyle, Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress, Function1<? super Boolean, Unit> $onPopupStateChange, Function2<? super Composer, ? super Integer, Unit> $popupContent, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     EditableComboBox($modifier, $menuModifier, $isEnabled, $inputTextFieldState, $outline, $interactionSource, $style, $textStyle, $onArrowDownPress, $onArrowUpPress, $onEnterPress, $onPopupStateChange, $popupContent, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextInput$lambda$48(Modifier $modifier, boolean $isEnabled, TextFieldState $inputTextFieldState, boolean $isFocused, FocusRequester $textFieldFocusRequester, ComboBoxStyle $style, boolean $popupExpanded, TextStyle $textStyle, MutableInteractionSource $textFieldInteractionSource, Function0<Unit> $onArrowDownPress, Function0<Unit> $onArrowUpPress, Function0<Unit> $onEnterPress, Function1<? super Boolean, Unit> $onSetPopupExpanded, Function1<? super Boolean, Unit> $onFocusedChange, Function1<? super Boolean, Unit> $onHoveredChange, int $$changed, int $$changed1, Composer $composer, int $force) {
/*     */     TextInput($modifier, $isEnabled, $inputTextFieldState, $isFocused, $textFieldFocusRequester, $style, $popupExpanded, $textStyle, $textFieldInteractionSource, $onArrowDownPress, $onArrowUpPress, $onEnterPress, $onSetPopupExpanded, $onFocusedChange, $onHoveredChange, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit Chevron$lambda$58(boolean $isEnabled, ComboBoxStyle $style, MutableInteractionSource $interactionSource, Function1<? super Boolean, Unit> $onHoveredChange, Function1<? super Boolean, Unit> $setPopupExpanded, Function0<Unit> $onPressWhenEnabled, int $$changed, Composer $composer, int $force) {
/*     */     Chevron($isEnabled, $style, $interactionSource, $onHoveredChange, $setPopupExpanded, $onPressWhenEnabled, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditableComboBox.kt", l = {387}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.EditableComboBoxKt$detectPressAndCancel$2")
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class EditableComboBoxKt$detectPressAndCancel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     EditableComboBoxKt$detectPressAndCancel$2(PointerInputScope $receiver, Function0<Unit> $onPress, Function0<Unit> $onCancel, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (ForEachGestureKt.awaitEachGesture(this.$this_detectPressAndCancel, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$onPress, this.$onCancel, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #6
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 182, 0 -> 36, 1 -> 79, 2 -> 148
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield L$0 : Ljava/lang/Object;
/*     */                   //   44: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   47: astore_2
/*     */                   //   48: aload_2
/*     */                   //   49: iconst_0
/*     */                   //   50: aconst_null
/*     */                   //   51: aload_0
/*     */                   //   52: checkcast kotlin/coroutines/Continuation
/*     */                   //   55: iconst_3
/*     */                   //   56: aconst_null
/*     */                   //   57: aload_0
/*     */                   //   58: aload_2
/*     */                   //   59: putfield L$0 : Ljava/lang/Object;
/*     */                   //   62: aload_0
/*     */                   //   63: iconst_1
/*     */                   //   64: putfield label : I
/*     */                   //   67: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   70: dup
/*     */                   //   71: aload #6
/*     */                   //   73: if_acmpne -> 92
/*     */                   //   76: aload #6
/*     */                   //   78: areturn
/*     */                   //   79: aload_0
/*     */                   //   80: getfield L$0 : Ljava/lang/Object;
/*     */                   //   83: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   86: astore_2
/*     */                   //   87: aload_1
/*     */                   //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   91: aload_1
/*     */                   //   92: astore_3
/*     */                   //   93: aload_3
/*     */                   //   94: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                   //   97: astore #4
/*     */                   //   99: iconst_0
/*     */                   //   100: istore #5
/*     */                   //   102: aload #4
/*     */                   //   104: invokevirtual consume : ()V
/*     */                   //   107: nop
/*     */                   //   108: aload_0
/*     */                   //   109: getfield $onPress : Lkotlin/jvm/functions/Function0;
/*     */                   //   112: invokeinterface invoke : ()Ljava/lang/Object;
/*     */                   //   117: pop
/*     */                   //   118: aload_2
/*     */                   //   119: aconst_null
/*     */                   //   120: aload_0
/*     */                   //   121: checkcast kotlin/coroutines/Continuation
/*     */                   //   124: iconst_1
/*     */                   //   125: aconst_null
/*     */                   //   126: aload_0
/*     */                   //   127: aconst_null
/*     */                   //   128: putfield L$0 : Ljava/lang/Object;
/*     */                   //   131: aload_0
/*     */                   //   132: iconst_2
/*     */                   //   133: putfield label : I
/*     */                   //   136: invokestatic waitForUpOrCancellation$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   139: dup
/*     */                   //   140: aload #6
/*     */                   //   142: if_acmpne -> 153
/*     */                   //   145: aload #6
/*     */                   //   147: areturn
/*     */                   //   148: aload_1
/*     */                   //   149: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   152: aload_1
/*     */                   //   153: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                   //   156: astore_3
/*     */                   //   157: aload_3
/*     */                   //   158: ifnonnull -> 174
/*     */                   //   161: aload_0
/*     */                   //   162: getfield $onCancel : Lkotlin/jvm/functions/Function0;
/*     */                   //   165: invokeinterface invoke : ()Ljava/lang/Object;
/*     */                   //   170: pop
/*     */                   //   171: goto -> 178
/*     */                   //   174: aload_3
/*     */                   //   175: invokevirtual consume : ()V
/*     */                   //   178: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   181: areturn
/*     */                   //   182: new java/lang/IllegalStateException
/*     */                   //   185: dup
/*     */                   //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   188: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   191: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #387	-> 3
/*     */                   //   #388	-> 48
/*     */                   //   #387	-> 76
/*     */                   //   #401	-> 99
/*     */                   //   #388	-> 102
/*     */                   //   #388	-> 107
/*     */                   //   #389	-> 108
/*     */                   //   #391	-> 118
/*     */                   //   #387	-> 145
/*     */                   //   #392	-> 157
/*     */                   //   #393	-> 161
/*     */                   //   #395	-> 174
/*     */                   //   #397	-> 178
/*     */                   //   #387	-> 182
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   48	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   87	20	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   107	1	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   108	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   157	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   174	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   99	8	4	it	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   102	5	5	$i$a$-also-EditableComboBoxKt$detectPressAndCancel$2$1$1	I
/*     */                   //   0	192	0	this	Lorg/jetbrains/jewel/ui/component/EditableComboBoxKt$detectPressAndCancel$2$1;
/*     */                   //   40	142	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$onPress, this.$onCancel, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           ForEachGestureKt.awaitEachGesture(this.$this_detectPressAndCancel, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(this.$onPress, this.$onCancel, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #6
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 182, 0 -> 36, 1 -> 79, 2 -> 148
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield L$0 : Ljava/lang/Object;
/*     */                   //   44: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   47: astore_2
/*     */                   //   48: aload_2
/*     */                   //   49: iconst_0
/*     */                   //   50: aconst_null
/*     */                   //   51: aload_0
/*     */                   //   52: checkcast kotlin/coroutines/Continuation
/*     */                   //   55: iconst_3
/*     */                   //   56: aconst_null
/*     */                   //   57: aload_0
/*     */                   //   58: aload_2
/*     */                   //   59: putfield L$0 : Ljava/lang/Object;
/*     */                   //   62: aload_0
/*     */                   //   63: iconst_1
/*     */                   //   64: putfield label : I
/*     */                   //   67: invokestatic awaitFirstDown$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   70: dup
/*     */                   //   71: aload #6
/*     */                   //   73: if_acmpne -> 92
/*     */                   //   76: aload #6
/*     */                   //   78: areturn
/*     */                   //   79: aload_0
/*     */                   //   80: getfield L$0 : Ljava/lang/Object;
/*     */                   //   83: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   86: astore_2
/*     */                   //   87: aload_1
/*     */                   //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   91: aload_1
/*     */                   //   92: astore_3
/*     */                   //   93: aload_3
/*     */                   //   94: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                   //   97: astore #4
/*     */                   //   99: iconst_0
/*     */                   //   100: istore #5
/*     */                   //   102: aload #4
/*     */                   //   104: invokevirtual consume : ()V
/*     */                   //   107: nop
/*     */                   //   108: aload_0
/*     */                   //   109: getfield $onPress : Lkotlin/jvm/functions/Function0;
/*     */                   //   112: invokeinterface invoke : ()Ljava/lang/Object;
/*     */                   //   117: pop
/*     */                   //   118: aload_2
/*     */                   //   119: aconst_null
/*     */                   //   120: aload_0
/*     */                   //   121: checkcast kotlin/coroutines/Continuation
/*     */                   //   124: iconst_1
/*     */                   //   125: aconst_null
/*     */                   //   126: aload_0
/*     */                   //   127: aconst_null
/*     */                   //   128: putfield L$0 : Ljava/lang/Object;
/*     */                   //   131: aload_0
/*     */                   //   132: iconst_2
/*     */                   //   133: putfield label : I
/*     */                   //   136: invokestatic waitForUpOrCancellation$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   139: dup
/*     */                   //   140: aload #6
/*     */                   //   142: if_acmpne -> 153
/*     */                   //   145: aload #6
/*     */                   //   147: areturn
/*     */                   //   148: aload_1
/*     */                   //   149: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   152: aload_1
/*     */                   //   153: checkcast androidx/compose/ui/input/pointer/PointerInputChange
/*     */                   //   156: astore_3
/*     */                   //   157: aload_3
/*     */                   //   158: ifnonnull -> 174
/*     */                   //   161: aload_0
/*     */                   //   162: getfield $onCancel : Lkotlin/jvm/functions/Function0;
/*     */                   //   165: invokeinterface invoke : ()Ljava/lang/Object;
/*     */                   //   170: pop
/*     */                   //   171: goto -> 178
/*     */                   //   174: aload_3
/*     */                   //   175: invokevirtual consume : ()V
/*     */                   //   178: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   181: areturn
/*     */                   //   182: new java/lang/IllegalStateException
/*     */                   //   185: dup
/*     */                   //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   188: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   191: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #387	-> 3
/*     */                   //   #388	-> 48
/*     */                   //   #387	-> 76
/*     */                   //   #401	-> 99
/*     */                   //   #388	-> 102
/*     */                   //   #388	-> 107
/*     */                   //   #389	-> 108
/*     */                   //   #391	-> 118
/*     */                   //   #387	-> 145
/*     */                   //   #392	-> 157
/*     */                   //   #393	-> 161
/*     */                   //   #395	-> 174
/*     */                   //   #397	-> 178
/*     */                   //   #387	-> 182
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   48	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   87	20	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   107	1	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   108	31	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   157	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   174	4	3	up	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   99	8	4	it	Landroidx/compose/ui/input/pointer/PointerInputChange;
/*     */                   //   102	5	5	$i$a$-also-EditableComboBoxKt$detectPressAndCancel$2$1$1	I
/*     */                   //   0	192	0	this	Lorg/jetbrains/jewel/ui/component/EditableComboBoxKt$detectPressAndCancel$2$1;
/*     */                   //   40	142	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$onPress, this.$onCancel, $completion);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super EditableComboBoxKt$detectPressAndCancel$2> $completion) {
/*     */       return (Continuation<Unit>)new EditableComboBoxKt$detectPressAndCancel$2(this.$this_detectPressAndCancel, this.$onPress, this.$onCancel, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((EditableComboBoxKt$detectPressAndCancel$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\EditableComboBoxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */