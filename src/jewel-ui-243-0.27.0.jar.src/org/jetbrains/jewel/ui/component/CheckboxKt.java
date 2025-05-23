/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.RowKt;
/*     */ import androidx.compose.foundation.layout.RowScope;
/*     */ import androidx.compose.foundation.layout.RowScopeInstance;
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
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.state.ToggleableState;
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
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxIcons;
/*     */ import org.jetbrains.jewel.ui.component.styling.CheckboxMetrics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\026H\007¢\006\002\020\027\032}\020\030\032\0020\0012\006\020\031\032\0020\0322\f\020\033\032\b\022\004\022\0020\0010\0342\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\026H\007¢\006\002\020\035\032\001\020\036\032\0020\0012\006\020\037\032\0020 2\006\020\031\032\0020\0322\f\020\033\032\b\022\004\022\0020\0010\0342\b\b\002\020\006\032\0020\0072\b\b\002\020!\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\026H\007¢\006\002\020\"\032\001\020#\032\0020\0012\006\020\037\032\0020 2\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020!\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\026H\007¢\006\002\020$\032¡\001\020#\032\0020\0012\006\020\002\032\0020\0032\022\020\004\032\016\022\004\022\0020\003\022\004\022\0020\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\034\020%\032\030\022\004\022\0020&\022\004\022\0020\0010\005¢\006\002\b'¢\006\002\b(H\007¢\006\002\020)\032\001\020\036\032\0020\0012\006\020\031\032\0020\0322\f\020\033\032\b\022\004\022\0020\0010\0342\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\034\020%\032\030\022\004\022\0020&\022\004\022\0020\0010\005¢\006\002\b'¢\006\002\b(H\007¢\006\002\020*\032\001\020+\032\0020\0012\006\020\031\032\0020\0322\f\020\033\032\b\022\004\022\0020\0010\0342\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\006\032\0020\0072\006\020,\032\0020\0072\006\020\b\032\0020\0032\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\023\032\0020\0242\006\020\025\032\0020\0262\036\020%\032\032\022\004\022\0020&\022\004\022\0020\001\030\0010\005¢\006\002\b'¢\006\002\b(H\003¢\006\002\020-\032\037\020.\032\0020\0012\006\020/\032\002002\b\b\002\020\006\032\0020\007H\003¢\006\002\0201¨\0062²\006\n\020\031\032\0020\032X\002²\006\n\020\031\032\0020\032X\002²\006\n\0203\032\00204X\002²\006\n\020/\032\00200X\002²\006\n\0205\032\00206X\002"}, d2 = {"Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;", "metrics", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;", "icons", "Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V", "TriStateCheckbox", "state", "Landroidx/compose/ui/state/ToggleableState;", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V", "TriStateCheckboxRow", "text", "", "textModifier", "(Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V", "CheckboxRow", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;III)V", "content", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CheckboxImpl", "contentModifier", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "CheckBoxImage", "checkboxPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ui", "checkboxState", "Lorg/jetbrains/jewel/ui/component/CheckboxState;", "contentColor", "Landroidx/compose/ui/graphics/Color;"})
/*     */ @SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\norg/jetbrains/jewel/ui/component/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,425:1\n1225#2,6:426\n1225#2,6:433\n1225#2,6:439\n1225#2,6:445\n1225#2,6:455\n1225#2,6:465\n1225#2,6:475\n1225#2,6:481\n1225#2,6:487\n1225#2,6:497\n1225#2,6:503\n1225#2,6:513\n1225#2,6:519\n1225#2,6:525\n1225#2,6:531\n77#3:432\n77#3:451\n77#3:452\n77#3:453\n77#3:454\n77#3:461\n77#3:462\n77#3:463\n77#3:464\n77#3:471\n77#3:472\n77#3:473\n77#3:474\n77#3:493\n77#3:494\n77#3:495\n77#3:496\n77#3:509\n77#3:510\n77#3:511\n77#3:512\n77#3:651\n71#4:537\n69#4,5:538\n74#4:571\n78#4:575\n71#4:608\n69#4,5:609\n74#4:642\n78#4:646\n79#5,6:543\n86#5,4:558\n90#5,2:568\n94#5:574\n79#5,6:579\n86#5,4:594\n90#5,2:604\n79#5,6:614\n86#5,4:629\n90#5,2:639\n94#5:645\n94#5:654\n368#6,9:549\n377#6:570\n378#6,2:572\n368#6,9:585\n377#6:606\n368#6,9:620\n377#6:641\n378#6,2:643\n378#6,2:652\n4034#7,6:562\n4034#7,6:598\n4034#7,6:633\n99#8,3:576\n102#8:607\n106#8:655\n708#9:647\n696#9:648\n708#9:649\n696#9:650\n81#10:656\n81#10:657\n81#10:658\n107#10,2:659\n81#10:661\n81#10:662\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\norg/jetbrains/jewel/ui/component/CheckboxKt\n*L\n65#1:426,6\n72#1:433,6\n75#1:439,6\n97#1:445,6\n130#1:455,6\n164#1:465,6\n171#1:475,6\n175#1:481,6\n198#1:487,6\n208#1:497,6\n230#1:503,6\n271#1:513,6\n273#1:519,6\n276#1:525,6\n294#1:531,6\n69#1:432\n98#1:451\n99#1:452\n100#1:453\n101#1:454\n131#1:461\n132#1:462\n133#1:463\n134#1:464\n165#1:471\n166#1:472\n167#1:473\n168#1:474\n199#1:493\n200#1:494\n201#1:495\n202#1:496\n231#1:509\n232#1:510\n233#1:511\n234#1:512\n346#1:651\n328#1:537\n328#1:538,5\n328#1:571\n328#1:575\n338#1:608\n338#1:609,5\n338#1:642\n338#1:646\n328#1:543,6\n328#1:558,4\n328#1:568,2\n328#1:574\n333#1:579,6\n333#1:594,4\n333#1:604,2\n338#1:614,6\n338#1:629,4\n338#1:639,2\n338#1:645\n333#1:654\n328#1:549,9\n328#1:570\n328#1:572,2\n333#1:585,9\n333#1:606\n338#1:620,9\n338#1:641\n338#1:643,2\n333#1:652,2\n328#1:562,6\n333#1:598,6\n338#1:633,6\n333#1:576,3\n333#1:607\n333#1:655\n345#1:647\n345#1:648\n346#1:649\n346#1:650\n72#1:656\n171#1:657\n271#1:658\n271#1:659,2\n315#1:661\n343#1:662\n*E\n"})
/*     */ public final class CheckboxKt
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public static final void Checkbox(boolean checked, @NotNull Function1 onCheckedChange, @Nullable Modifier modifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onCheckedChange'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #11
/*     */     //   8: ldc 1229629847
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #11
/*     */     //   17: iload #12
/*     */     //   19: istore #15
/*     */     //   21: iload #13
/*     */     //   23: istore #16
/*     */     //   25: iload #14
/*     */     //   27: iconst_1
/*     */     //   28: iand
/*     */     //   29: ifeq -> 42
/*     */     //   32: iload #15
/*     */     //   34: bipush #6
/*     */     //   36: ior
/*     */     //   37: istore #15
/*     */     //   39: goto -> 71
/*     */     //   42: iload #12
/*     */     //   44: bipush #6
/*     */     //   46: iand
/*     */     //   47: ifne -> 71
/*     */     //   50: iload #15
/*     */     //   52: aload #11
/*     */     //   54: iload_0
/*     */     //   55: invokeinterface changed : (Z)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #15
/*     */     //   71: iload #14
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #15
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #15
/*     */     //   85: goto -> 119
/*     */     //   88: iload #12
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 119
/*     */     //   96: iload #15
/*     */     //   98: aload #11
/*     */     //   100: aload_1
/*     */     //   101: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   106: ifeq -> 114
/*     */     //   109: bipush #32
/*     */     //   111: goto -> 116
/*     */     //   114: bipush #16
/*     */     //   116: ior
/*     */     //   117: istore #15
/*     */     //   119: iload #14
/*     */     //   121: iconst_4
/*     */     //   122: iand
/*     */     //   123: ifeq -> 137
/*     */     //   126: iload #15
/*     */     //   128: sipush #384
/*     */     //   131: ior
/*     */     //   132: istore #15
/*     */     //   134: goto -> 171
/*     */     //   137: iload #12
/*     */     //   139: sipush #384
/*     */     //   142: iand
/*     */     //   143: ifne -> 171
/*     */     //   146: iload #15
/*     */     //   148: aload #11
/*     */     //   150: aload_2
/*     */     //   151: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   156: ifeq -> 165
/*     */     //   159: sipush #256
/*     */     //   162: goto -> 168
/*     */     //   165: sipush #128
/*     */     //   168: ior
/*     */     //   169: istore #15
/*     */     //   171: iload #14
/*     */     //   173: bipush #8
/*     */     //   175: iand
/*     */     //   176: ifeq -> 190
/*     */     //   179: iload #15
/*     */     //   181: sipush #3072
/*     */     //   184: ior
/*     */     //   185: istore #15
/*     */     //   187: goto -> 224
/*     */     //   190: iload #12
/*     */     //   192: sipush #3072
/*     */     //   195: iand
/*     */     //   196: ifne -> 224
/*     */     //   199: iload #15
/*     */     //   201: aload #11
/*     */     //   203: iload_3
/*     */     //   204: invokeinterface changed : (Z)Z
/*     */     //   209: ifeq -> 218
/*     */     //   212: sipush #2048
/*     */     //   215: goto -> 221
/*     */     //   218: sipush #1024
/*     */     //   221: ior
/*     */     //   222: istore #15
/*     */     //   224: iload #14
/*     */     //   226: bipush #16
/*     */     //   228: iand
/*     */     //   229: ifeq -> 243
/*     */     //   232: iload #15
/*     */     //   234: sipush #24576
/*     */     //   237: ior
/*     */     //   238: istore #15
/*     */     //   240: goto -> 278
/*     */     //   243: iload #12
/*     */     //   245: sipush #24576
/*     */     //   248: iand
/*     */     //   249: ifne -> 278
/*     */     //   252: iload #15
/*     */     //   254: aload #11
/*     */     //   256: aload #4
/*     */     //   258: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   263: ifeq -> 272
/*     */     //   266: sipush #16384
/*     */     //   269: goto -> 275
/*     */     //   272: sipush #8192
/*     */     //   275: ior
/*     */     //   276: istore #15
/*     */     //   278: iload #14
/*     */     //   280: bipush #32
/*     */     //   282: iand
/*     */     //   283: ifeq -> 296
/*     */     //   286: iload #15
/*     */     //   288: ldc 196608
/*     */     //   290: ior
/*     */     //   291: istore #15
/*     */     //   293: goto -> 328
/*     */     //   296: iload #12
/*     */     //   298: ldc 196608
/*     */     //   300: iand
/*     */     //   301: ifne -> 328
/*     */     //   304: iload #15
/*     */     //   306: aload #11
/*     */     //   308: aload #5
/*     */     //   310: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   315: ifeq -> 323
/*     */     //   318: ldc 131072
/*     */     //   320: goto -> 325
/*     */     //   323: ldc 65536
/*     */     //   325: ior
/*     */     //   326: istore #15
/*     */     //   328: iload #12
/*     */     //   330: ldc 1572864
/*     */     //   332: iand
/*     */     //   333: ifne -> 368
/*     */     //   336: iload #15
/*     */     //   338: iload #14
/*     */     //   340: bipush #64
/*     */     //   342: iand
/*     */     //   343: ifne -> 363
/*     */     //   346: aload #11
/*     */     //   348: aload #6
/*     */     //   350: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   355: ifeq -> 363
/*     */     //   358: ldc 1048576
/*     */     //   360: goto -> 365
/*     */     //   363: ldc 524288
/*     */     //   365: ior
/*     */     //   366: istore #15
/*     */     //   368: iload #12
/*     */     //   370: ldc 12582912
/*     */     //   372: iand
/*     */     //   373: ifne -> 409
/*     */     //   376: iload #15
/*     */     //   378: iload #14
/*     */     //   380: sipush #128
/*     */     //   383: iand
/*     */     //   384: ifne -> 404
/*     */     //   387: aload #11
/*     */     //   389: aload #7
/*     */     //   391: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   396: ifeq -> 404
/*     */     //   399: ldc 8388608
/*     */     //   401: goto -> 406
/*     */     //   404: ldc 4194304
/*     */     //   406: ior
/*     */     //   407: istore #15
/*     */     //   409: iload #12
/*     */     //   411: ldc 100663296
/*     */     //   413: iand
/*     */     //   414: ifne -> 450
/*     */     //   417: iload #15
/*     */     //   419: iload #14
/*     */     //   421: sipush #256
/*     */     //   424: iand
/*     */     //   425: ifne -> 445
/*     */     //   428: aload #11
/*     */     //   430: aload #8
/*     */     //   432: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   437: ifeq -> 445
/*     */     //   440: ldc 67108864
/*     */     //   442: goto -> 447
/*     */     //   445: ldc 33554432
/*     */     //   447: ior
/*     */     //   448: istore #15
/*     */     //   450: iload #12
/*     */     //   452: ldc 805306368
/*     */     //   454: iand
/*     */     //   455: ifne -> 491
/*     */     //   458: iload #15
/*     */     //   460: iload #14
/*     */     //   462: sipush #512
/*     */     //   465: iand
/*     */     //   466: ifne -> 486
/*     */     //   469: aload #11
/*     */     //   471: aload #9
/*     */     //   473: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   478: ifeq -> 486
/*     */     //   481: ldc 536870912
/*     */     //   483: goto -> 488
/*     */     //   486: ldc 268435456
/*     */     //   488: ior
/*     */     //   489: istore #15
/*     */     //   491: iload #14
/*     */     //   493: sipush #1024
/*     */     //   496: iand
/*     */     //   497: ifeq -> 510
/*     */     //   500: iload #16
/*     */     //   502: bipush #6
/*     */     //   504: ior
/*     */     //   505: istore #16
/*     */     //   507: goto -> 540
/*     */     //   510: iload #13
/*     */     //   512: bipush #6
/*     */     //   514: iand
/*     */     //   515: ifne -> 540
/*     */     //   518: iload #16
/*     */     //   520: aload #11
/*     */     //   522: aload #10
/*     */     //   524: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   529: ifeq -> 536
/*     */     //   532: iconst_4
/*     */     //   533: goto -> 537
/*     */     //   536: iconst_2
/*     */     //   537: ior
/*     */     //   538: istore #16
/*     */     //   540: iload #15
/*     */     //   542: ldc 306783379
/*     */     //   544: iand
/*     */     //   545: ldc 306783378
/*     */     //   547: if_icmpne -> 568
/*     */     //   550: iload #16
/*     */     //   552: iconst_3
/*     */     //   553: iand
/*     */     //   554: iconst_2
/*     */     //   555: if_icmpne -> 568
/*     */     //   558: aload #11
/*     */     //   560: invokeinterface getSkipping : ()Z
/*     */     //   565: ifne -> 1368
/*     */     //   568: aload #11
/*     */     //   570: invokeinterface startDefaults : ()V
/*     */     //   575: iload #12
/*     */     //   577: iconst_1
/*     */     //   578: iand
/*     */     //   579: ifeq -> 592
/*     */     //   582: aload #11
/*     */     //   584: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   589: ifeq -> 896
/*     */     //   592: iload #14
/*     */     //   594: iconst_4
/*     */     //   595: iand
/*     */     //   596: ifeq -> 606
/*     */     //   599: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   602: checkcast androidx/compose/ui/Modifier
/*     */     //   605: astore_2
/*     */     //   606: iload #14
/*     */     //   608: bipush #8
/*     */     //   610: iand
/*     */     //   611: ifeq -> 616
/*     */     //   614: iconst_1
/*     */     //   615: istore_3
/*     */     //   616: iload #14
/*     */     //   618: bipush #16
/*     */     //   620: iand
/*     */     //   621: ifeq -> 629
/*     */     //   624: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   627: astore #4
/*     */     //   629: iload #14
/*     */     //   631: bipush #32
/*     */     //   633: iand
/*     */     //   634: ifeq -> 722
/*     */     //   637: aload #11
/*     */     //   639: ldc -899121240
/*     */     //   641: invokeinterface startReplaceGroup : (I)V
/*     */     //   646: aload #11
/*     */     //   648: astore #18
/*     */     //   650: iconst_0
/*     */     //   651: istore #19
/*     */     //   653: iconst_0
/*     */     //   654: istore #20
/*     */     //   656: aload #18
/*     */     //   658: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   663: astore #21
/*     */     //   665: iconst_0
/*     */     //   666: istore #22
/*     */     //   668: aload #21
/*     */     //   670: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   673: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   676: if_acmpne -> 701
/*     */     //   679: iconst_0
/*     */     //   680: istore #23
/*     */     //   682: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   685: astore #23
/*     */     //   687: aload #18
/*     */     //   689: aload #23
/*     */     //   691: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   696: aload #23
/*     */     //   698: goto -> 703
/*     */     //   701: aload #21
/*     */     //   703: nop
/*     */     //   704: nop
/*     */     //   705: nop
/*     */     //   706: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   709: astore #17
/*     */     //   711: aload #11
/*     */     //   713: invokeinterface endReplaceGroup : ()V
/*     */     //   718: aload #17
/*     */     //   720: astore #5
/*     */     //   722: iload #14
/*     */     //   724: bipush #64
/*     */     //   726: iand
/*     */     //   727: ifeq -> 752
/*     */     //   730: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   733: aload #11
/*     */     //   735: bipush #6
/*     */     //   737: invokestatic getCheckboxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;
/*     */     //   740: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   743: astore #6
/*     */     //   745: iload #15
/*     */     //   747: ldc -3670017
/*     */     //   749: iand
/*     */     //   750: istore #15
/*     */     //   752: iload #14
/*     */     //   754: sipush #128
/*     */     //   757: iand
/*     */     //   758: ifeq -> 783
/*     */     //   761: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   764: aload #11
/*     */     //   766: bipush #6
/*     */     //   768: invokestatic getCheckboxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;
/*     */     //   771: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   774: astore #7
/*     */     //   776: iload #15
/*     */     //   778: ldc -29360129
/*     */     //   780: iand
/*     */     //   781: istore #15
/*     */     //   783: iload #14
/*     */     //   785: sipush #256
/*     */     //   788: iand
/*     */     //   789: ifeq -> 814
/*     */     //   792: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   795: aload #11
/*     */     //   797: bipush #6
/*     */     //   799: invokestatic getCheckboxStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/CheckboxStyle;
/*     */     //   802: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   805: astore #8
/*     */     //   807: iload #15
/*     */     //   809: ldc -234881025
/*     */     //   811: iand
/*     */     //   812: istore #15
/*     */     //   814: iload #14
/*     */     //   816: sipush #512
/*     */     //   819: iand
/*     */     //   820: ifeq -> 876
/*     */     //   823: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   826: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   829: astore #17
/*     */     //   831: iconst_0
/*     */     //   832: istore #18
/*     */     //   834: iconst_0
/*     */     //   835: istore #19
/*     */     //   837: aload #11
/*     */     //   839: ldc 2023513938
/*     */     //   841: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   843: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   846: aload #11
/*     */     //   848: aload #17
/*     */     //   850: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   855: astore #20
/*     */     //   857: aload #11
/*     */     //   859: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   862: aload #20
/*     */     //   864: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   867: astore #9
/*     */     //   869: iload #15
/*     */     //   871: ldc -1879048193
/*     */     //   873: iand
/*     */     //   874: istore #15
/*     */     //   876: iload #14
/*     */     //   878: sipush #1024
/*     */     //   881: iand
/*     */     //   882: ifeq -> 966
/*     */     //   885: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   888: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   891: astore #10
/*     */     //   893: goto -> 966
/*     */     //   896: aload #11
/*     */     //   898: invokeinterface skipToGroupEnd : ()V
/*     */     //   903: iload #14
/*     */     //   905: bipush #64
/*     */     //   907: iand
/*     */     //   908: ifeq -> 918
/*     */     //   911: iload #15
/*     */     //   913: ldc -3670017
/*     */     //   915: iand
/*     */     //   916: istore #15
/*     */     //   918: iload #14
/*     */     //   920: sipush #128
/*     */     //   923: iand
/*     */     //   924: ifeq -> 934
/*     */     //   927: iload #15
/*     */     //   929: ldc -29360129
/*     */     //   931: iand
/*     */     //   932: istore #15
/*     */     //   934: iload #14
/*     */     //   936: sipush #256
/*     */     //   939: iand
/*     */     //   940: ifeq -> 950
/*     */     //   943: iload #15
/*     */     //   945: ldc -234881025
/*     */     //   947: iand
/*     */     //   948: istore #15
/*     */     //   950: iload #14
/*     */     //   952: sipush #512
/*     */     //   955: iand
/*     */     //   956: ifeq -> 966
/*     */     //   959: iload #15
/*     */     //   961: ldc -1879048193
/*     */     //   963: iand
/*     */     //   964: istore #15
/*     */     //   966: aload #11
/*     */     //   968: invokeinterface endDefaults : ()V
/*     */     //   973: invokestatic isTraceInProgress : ()Z
/*     */     //   976: ifeq -> 990
/*     */     //   979: ldc 1229629847
/*     */     //   981: iload #15
/*     */     //   983: iload #16
/*     */     //   985: ldc 'org.jetbrains.jewel.ui.component.Checkbox (Checkbox.kt:70)'
/*     */     //   987: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   990: aload #11
/*     */     //   992: ldc -899109345
/*     */     //   994: invokeinterface startReplaceGroup : (I)V
/*     */     //   999: aload #11
/*     */     //   1001: astore #19
/*     */     //   1003: iload #15
/*     */     //   1005: bipush #14
/*     */     //   1007: iand
/*     */     //   1008: iconst_4
/*     */     //   1009: if_icmpne -> 1016
/*     */     //   1012: iconst_1
/*     */     //   1013: goto -> 1017
/*     */     //   1016: iconst_0
/*     */     //   1017: istore #20
/*     */     //   1019: nop
/*     */     //   1020: iconst_0
/*     */     //   1021: istore #21
/*     */     //   1023: aload #19
/*     */     //   1025: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1030: astore #22
/*     */     //   1032: iconst_0
/*     */     //   1033: istore #23
/*     */     //   1035: iload #20
/*     */     //   1037: ifne -> 1051
/*     */     //   1040: aload #22
/*     */     //   1042: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1045: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1048: if_acmpne -> 1080
/*     */     //   1051: iconst_0
/*     */     //   1052: istore #24
/*     */     //   1054: iload_0
/*     */     //   1055: invokestatic ToggleableState : (Z)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1058: aconst_null
/*     */     //   1059: iconst_2
/*     */     //   1060: aconst_null
/*     */     //   1061: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1064: astore #25
/*     */     //   1066: aload #19
/*     */     //   1068: aload #25
/*     */     //   1070: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1075: aload #25
/*     */     //   1077: goto -> 1082
/*     */     //   1080: aload #22
/*     */     //   1082: nop
/*     */     //   1083: nop
/*     */     //   1084: nop
/*     */     //   1085: checkcast androidx/compose/runtime/MutableState
/*     */     //   1088: astore #18
/*     */     //   1090: aload #11
/*     */     //   1092: invokeinterface endReplaceGroup : ()V
/*     */     //   1097: aload #18
/*     */     //   1099: astore #17
/*     */     //   1101: aload #17
/*     */     //   1103: invokestatic Checkbox$lambda$2 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1106: astore #18
/*     */     //   1108: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1111: astore #19
/*     */     //   1113: aload #18
/*     */     //   1115: aload #11
/*     */     //   1117: ldc -899105467
/*     */     //   1119: invokeinterface startReplaceGroup : (I)V
/*     */     //   1124: aload #11
/*     */     //   1126: astore #21
/*     */     //   1128: iload #15
/*     */     //   1130: bipush #112
/*     */     //   1132: iand
/*     */     //   1133: bipush #32
/*     */     //   1135: if_icmpne -> 1142
/*     */     //   1138: iconst_1
/*     */     //   1139: goto -> 1143
/*     */     //   1142: iconst_0
/*     */     //   1143: iload #15
/*     */     //   1145: bipush #14
/*     */     //   1147: iand
/*     */     //   1148: iconst_4
/*     */     //   1149: if_icmpne -> 1156
/*     */     //   1152: iconst_1
/*     */     //   1153: goto -> 1157
/*     */     //   1156: iconst_0
/*     */     //   1157: ior
/*     */     //   1158: istore #22
/*     */     //   1160: nop
/*     */     //   1161: iconst_0
/*     */     //   1162: istore #23
/*     */     //   1164: aload #21
/*     */     //   1166: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1171: astore #24
/*     */     //   1173: iconst_0
/*     */     //   1174: istore #25
/*     */     //   1176: iload #22
/*     */     //   1178: ifne -> 1192
/*     */     //   1181: aload #24
/*     */     //   1183: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1186: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1189: if_acmpne -> 1223
/*     */     //   1192: astore #28
/*     */     //   1194: iconst_0
/*     */     //   1195: istore #26
/*     */     //   1197: aload_1
/*     */     //   1198: iload_0
/*     */     //   1199: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   1204: aload #28
/*     */     //   1206: swap
/*     */     //   1207: astore #27
/*     */     //   1209: aload #21
/*     */     //   1211: aload #27
/*     */     //   1213: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1218: aload #27
/*     */     //   1220: goto -> 1225
/*     */     //   1223: aload #24
/*     */     //   1225: nop
/*     */     //   1226: nop
/*     */     //   1227: nop
/*     */     //   1228: checkcast kotlin/jvm/functions/Function0
/*     */     //   1231: astore #20
/*     */     //   1233: aload #11
/*     */     //   1235: invokeinterface endReplaceGroup : ()V
/*     */     //   1240: aload #20
/*     */     //   1242: aload #6
/*     */     //   1244: aload #7
/*     */     //   1246: aload #8
/*     */     //   1248: aload_2
/*     */     //   1249: aload #19
/*     */     //   1251: checkcast androidx/compose/ui/Modifier
/*     */     //   1254: iload_3
/*     */     //   1255: aload #4
/*     */     //   1257: aload #5
/*     */     //   1259: aload #9
/*     */     //   1261: aload #10
/*     */     //   1263: aconst_null
/*     */     //   1264: aload #11
/*     */     //   1266: ldc 1572864
/*     */     //   1268: sipush #896
/*     */     //   1271: iload #15
/*     */     //   1273: bipush #12
/*     */     //   1275: ishr
/*     */     //   1276: iand
/*     */     //   1277: ior
/*     */     //   1278: sipush #7168
/*     */     //   1281: iload #15
/*     */     //   1283: bipush #12
/*     */     //   1285: ishr
/*     */     //   1286: iand
/*     */     //   1287: ior
/*     */     //   1288: ldc 57344
/*     */     //   1290: iload #15
/*     */     //   1292: bipush #12
/*     */     //   1294: ishr
/*     */     //   1295: iand
/*     */     //   1296: ior
/*     */     //   1297: ldc 458752
/*     */     //   1299: iload #15
/*     */     //   1301: bipush #9
/*     */     //   1303: ishl
/*     */     //   1304: iand
/*     */     //   1305: ior
/*     */     //   1306: ldc 29360128
/*     */     //   1308: iload #15
/*     */     //   1310: bipush #12
/*     */     //   1312: ishl
/*     */     //   1313: iand
/*     */     //   1314: ior
/*     */     //   1315: ldc 234881024
/*     */     //   1317: iload #15
/*     */     //   1319: bipush #12
/*     */     //   1321: ishl
/*     */     //   1322: iand
/*     */     //   1323: ior
/*     */     //   1324: ldc 1879048192
/*     */     //   1326: iload #15
/*     */     //   1328: bipush #12
/*     */     //   1330: ishl
/*     */     //   1331: iand
/*     */     //   1332: ior
/*     */     //   1333: sipush #384
/*     */     //   1336: bipush #14
/*     */     //   1338: iload #15
/*     */     //   1340: bipush #27
/*     */     //   1342: ishr
/*     */     //   1343: iand
/*     */     //   1344: ior
/*     */     //   1345: bipush #112
/*     */     //   1347: iload #16
/*     */     //   1349: iconst_3
/*     */     //   1350: ishl
/*     */     //   1351: iand
/*     */     //   1352: ior
/*     */     //   1353: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1356: invokestatic isTraceInProgress : ()Z
/*     */     //   1359: ifeq -> 1375
/*     */     //   1362: invokestatic traceEventEnd : ()V
/*     */     //   1365: goto -> 1375
/*     */     //   1368: aload #11
/*     */     //   1370: invokeinterface skipToGroupEnd : ()V
/*     */     //   1375: aload #11
/*     */     //   1377: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1382: dup
/*     */     //   1383: ifnull -> 1423
/*     */     //   1386: iload_0
/*     */     //   1387: aload_1
/*     */     //   1388: aload_2
/*     */     //   1389: iload_3
/*     */     //   1390: aload #4
/*     */     //   1392: aload #5
/*     */     //   1394: aload #6
/*     */     //   1396: aload #7
/*     */     //   1398: aload #8
/*     */     //   1400: aload #9
/*     */     //   1402: aload #10
/*     */     //   1404: iload #12
/*     */     //   1406: iload #13
/*     */     //   1408: iload #14
/*     */     //   1410: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1415: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1420: goto -> 1424
/*     */     //   1423: pop
/*     */     //   1424: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 6
/*     */     //   #62	-> 599
/*     */     //   #63	-> 614
/*     */     //   #64	-> 624
/*     */     //   #65	-> 637
/*     */     //   #426	-> 656
/*     */     //   #427	-> 668
/*     */     //   #428	-> 679
/*     */     //   #65	-> 682
/*     */     //   #428	-> 685
/*     */     //   #429	-> 687
/*     */     //   #430	-> 696
/*     */     //   #431	-> 701
/*     */     //   #427	-> 703
/*     */     //   #426	-> 704
/*     */     //   #426	-> 705
/*     */     //   #65	-> 706
/*     */     //   #66	-> 730
/*     */     //   #67	-> 761
/*     */     //   #68	-> 792
/*     */     //   #69	-> 823
/*     */     //   #432	-> 843
/*     */     //   #70	-> 885
/*     */     //   #71	-> 987
/*     */     //   #72	-> 1019
/*     */     //   #433	-> 1023
/*     */     //   #434	-> 1035
/*     */     //   #435	-> 1051
/*     */     //   #72	-> 1054
/*     */     //   #435	-> 1064
/*     */     //   #436	-> 1066
/*     */     //   #437	-> 1075
/*     */     //   #438	-> 1080
/*     */     //   #434	-> 1082
/*     */     //   #433	-> 1083
/*     */     //   #433	-> 1084
/*     */     //   #72	-> 1085
/*     */     //   #74	-> 1101
/*     */     //   #77	-> 1108
/*     */     //   #74	-> 1113
/*     */     //   #75	-> 1160
/*     */     //   #439	-> 1164
/*     */     //   #440	-> 1176
/*     */     //   #441	-> 1192
/*     */     //   #75	-> 1197
/*     */     //   #441	-> 1207
/*     */     //   #442	-> 1209
/*     */     //   #443	-> 1218
/*     */     //   #444	-> 1223
/*     */     //   #440	-> 1225
/*     */     //   #439	-> 1226
/*     */     //   #439	-> 1227
/*     */     //   #75	-> 1228
/*     */     //   #81	-> 1242
/*     */     //   #82	-> 1244
/*     */     //   #83	-> 1246
/*     */     //   #76	-> 1248
/*     */     //   #77	-> 1249
/*     */     //   #78	-> 1254
/*     */     //   #79	-> 1255
/*     */     //   #80	-> 1257
/*     */     //   #84	-> 1259
/*     */     //   #85	-> 1261
/*     */     //   #86	-> 1263
/*     */     //   #73	-> 1353
/*     */     //   #88	-> 1368
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   682	3	23	$i$a$-cache-CheckboxKt$Checkbox$1	I
/*     */     //   687	11	23	value$iv	Ljava/lang/Object;
/*     */     //   668	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   665	39	21	it$iv	Ljava/lang/Object;
/*     */     //   656	50	20	$i$f$cache	I
/*     */     //   653	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   653	53	19	invalid$iv	Z
/*     */     //   837	27	19	$i$f$getCurrent	I
/*     */     //   834	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   834	30	18	$changed$iv	I
/*     */     //   1054	10	24	$i$a$-cache-CheckboxKt$Checkbox$state$2	I
/*     */     //   1066	11	25	value$iv	Ljava/lang/Object;
/*     */     //   1035	48	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1032	51	22	it$iv	Ljava/lang/Object;
/*     */     //   1023	62	21	$i$f$cache	I
/*     */     //   1020	65	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1020	65	20	invalid$iv	Z
/*     */     //   1197	7	26	$i$a$-cache-CheckboxKt$Checkbox$2	I
/*     */     //   1209	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1176	50	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1173	53	24	it$iv	Ljava/lang/Object;
/*     */     //   1164	64	23	$i$f$cache	I
/*     */     //   1161	67	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1161	67	22	invalid$iv	Z
/*     */     //   1101	264	17	state$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   21	1404	15	$dirty	I
/*     */     //   25	1400	16	$dirty1	I
/*     */     //   0	1425	0	checked	Z
/*     */     //   0	1425	1	onCheckedChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1425	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1425	3	enabled	Z
/*     */     //   0	1425	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1425	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1425	6	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1425	7	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1425	8	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1425	9	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1425	10	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1425	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1425	12	$changed	I
/*     */     //   0	1425	13	$changed1	I
/*     */   }
/*     */   
/*     */   private static final ToggleableState Checkbox$lambda$2(MutableState $state$delegate) {
/*  72 */     State state = (State)$state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 656 */       (ToggleableState)state.getValue();
/*     */   } private static final Unit Checkbox$lambda$4$lambda$3(Function1 $onCheckedChange, boolean $checked) { $onCheckedChange.invoke(Boolean.valueOf(!$checked)); return Unit.INSTANCE; } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TriStateCheckbox(@NotNull ToggleableState state, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'state'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onClick'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #11
/*     */     //   16: ldc_w 1241799607
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #11
/*     */     //   26: iload #12
/*     */     //   28: istore #15
/*     */     //   30: iload #13
/*     */     //   32: istore #16
/*     */     //   34: iload #14
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #15
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #15
/*     */     //   48: goto -> 80
/*     */     //   51: iload #12
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #15
/*     */     //   61: aload #11
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #15
/*     */     //   80: iload #14
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #15
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #15
/*     */     //   94: goto -> 128
/*     */     //   97: iload #12
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #15
/*     */     //   107: aload #11
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #15
/*     */     //   128: iload #14
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #15
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #15
/*     */     //   143: goto -> 180
/*     */     //   146: iload #12
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #15
/*     */     //   157: aload #11
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #15
/*     */     //   180: iload #14
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #15
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #15
/*     */     //   196: goto -> 233
/*     */     //   199: iload #12
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #15
/*     */     //   210: aload #11
/*     */     //   212: iload_3
/*     */     //   213: invokeinterface changed : (Z)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #15
/*     */     //   233: iload #14
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #15
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #15
/*     */     //   249: goto -> 287
/*     */     //   252: iload #12
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #15
/*     */     //   263: aload #11
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #15
/*     */     //   287: iload #14
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #15
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #15
/*     */     //   302: goto -> 337
/*     */     //   305: iload #12
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #15
/*     */     //   315: aload #11
/*     */     //   317: aload #5
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #15
/*     */     //   337: iload #12
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 377
/*     */     //   345: iload #15
/*     */     //   347: iload #14
/*     */     //   349: bipush #64
/*     */     //   351: iand
/*     */     //   352: ifne -> 372
/*     */     //   355: aload #11
/*     */     //   357: aload #6
/*     */     //   359: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   364: ifeq -> 372
/*     */     //   367: ldc 1048576
/*     */     //   369: goto -> 374
/*     */     //   372: ldc 524288
/*     */     //   374: ior
/*     */     //   375: istore #15
/*     */     //   377: iload #12
/*     */     //   379: ldc 12582912
/*     */     //   381: iand
/*     */     //   382: ifne -> 418
/*     */     //   385: iload #15
/*     */     //   387: iload #14
/*     */     //   389: sipush #128
/*     */     //   392: iand
/*     */     //   393: ifne -> 413
/*     */     //   396: aload #11
/*     */     //   398: aload #7
/*     */     //   400: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   405: ifeq -> 413
/*     */     //   408: ldc 8388608
/*     */     //   410: goto -> 415
/*     */     //   413: ldc 4194304
/*     */     //   415: ior
/*     */     //   416: istore #15
/*     */     //   418: iload #12
/*     */     //   420: ldc 100663296
/*     */     //   422: iand
/*     */     //   423: ifne -> 459
/*     */     //   426: iload #15
/*     */     //   428: iload #14
/*     */     //   430: sipush #256
/*     */     //   433: iand
/*     */     //   434: ifne -> 454
/*     */     //   437: aload #11
/*     */     //   439: aload #8
/*     */     //   441: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   446: ifeq -> 454
/*     */     //   449: ldc 67108864
/*     */     //   451: goto -> 456
/*     */     //   454: ldc 33554432
/*     */     //   456: ior
/*     */     //   457: istore #15
/*     */     //   459: iload #12
/*     */     //   461: ldc 805306368
/*     */     //   463: iand
/*     */     //   464: ifne -> 500
/*     */     //   467: iload #15
/*     */     //   469: iload #14
/*     */     //   471: sipush #512
/*     */     //   474: iand
/*     */     //   475: ifne -> 495
/*     */     //   478: aload #11
/*     */     //   480: aload #9
/*     */     //   482: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   487: ifeq -> 495
/*     */     //   490: ldc 536870912
/*     */     //   492: goto -> 497
/*     */     //   495: ldc 268435456
/*     */     //   497: ior
/*     */     //   498: istore #15
/*     */     //   500: iload #14
/*     */     //   502: sipush #1024
/*     */     //   505: iand
/*     */     //   506: ifeq -> 519
/*     */     //   509: iload #16
/*     */     //   511: bipush #6
/*     */     //   513: ior
/*     */     //   514: istore #16
/*     */     //   516: goto -> 549
/*     */     //   519: iload #13
/*     */     //   521: bipush #6
/*     */     //   523: iand
/*     */     //   524: ifne -> 549
/*     */     //   527: iload #16
/*     */     //   529: aload #11
/*     */     //   531: aload #10
/*     */     //   533: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   538: ifeq -> 545
/*     */     //   541: iconst_4
/*     */     //   542: goto -> 546
/*     */     //   545: iconst_2
/*     */     //   546: ior
/*     */     //   547: istore #16
/*     */     //   549: iload #15
/*     */     //   551: ldc 306783379
/*     */     //   553: iand
/*     */     //   554: ldc 306783378
/*     */     //   556: if_icmpne -> 577
/*     */     //   559: iload #16
/*     */     //   561: iconst_3
/*     */     //   562: iand
/*     */     //   563: iconst_2
/*     */     //   564: if_icmpne -> 577
/*     */     //   567: aload #11
/*     */     //   569: invokeinterface getSkipping : ()Z
/*     */     //   574: ifne -> 1252
/*     */     //   577: aload #11
/*     */     //   579: invokeinterface startDefaults : ()V
/*     */     //   584: iload #12
/*     */     //   586: iconst_1
/*     */     //   587: iand
/*     */     //   588: ifeq -> 601
/*     */     //   591: aload #11
/*     */     //   593: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   598: ifeq -> 1011
/*     */     //   601: iload #14
/*     */     //   603: iconst_4
/*     */     //   604: iand
/*     */     //   605: ifeq -> 615
/*     */     //   608: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   611: checkcast androidx/compose/ui/Modifier
/*     */     //   614: astore_2
/*     */     //   615: iload #14
/*     */     //   617: bipush #8
/*     */     //   619: iand
/*     */     //   620: ifeq -> 625
/*     */     //   623: iconst_1
/*     */     //   624: istore_3
/*     */     //   625: iload #14
/*     */     //   627: bipush #16
/*     */     //   629: iand
/*     */     //   630: ifeq -> 638
/*     */     //   633: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   636: astore #4
/*     */     //   638: iload #14
/*     */     //   640: bipush #32
/*     */     //   642: iand
/*     */     //   643: ifeq -> 732
/*     */     //   646: aload #11
/*     */     //   648: ldc_w -1534600978
/*     */     //   651: invokeinterface startReplaceGroup : (I)V
/*     */     //   656: aload #11
/*     */     //   658: astore #18
/*     */     //   660: iconst_0
/*     */     //   661: istore #19
/*     */     //   663: iconst_0
/*     */     //   664: istore #20
/*     */     //   666: aload #18
/*     */     //   668: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   673: astore #21
/*     */     //   675: iconst_0
/*     */     //   676: istore #22
/*     */     //   678: aload #21
/*     */     //   680: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   683: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   686: if_acmpne -> 711
/*     */     //   689: iconst_0
/*     */     //   690: istore #23
/*     */     //   692: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   695: astore #23
/*     */     //   697: aload #18
/*     */     //   699: aload #23
/*     */     //   701: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   706: aload #23
/*     */     //   708: goto -> 713
/*     */     //   711: aload #21
/*     */     //   713: nop
/*     */     //   714: nop
/*     */     //   715: nop
/*     */     //   716: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   719: astore #17
/*     */     //   721: aload #11
/*     */     //   723: invokeinterface endReplaceGroup : ()V
/*     */     //   728: aload #17
/*     */     //   730: astore #5
/*     */     //   732: iload #14
/*     */     //   734: bipush #64
/*     */     //   736: iand
/*     */     //   737: ifeq -> 797
/*     */     //   740: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   743: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   746: astore #17
/*     */     //   748: bipush #6
/*     */     //   750: istore #18
/*     */     //   752: iconst_0
/*     */     //   753: istore #19
/*     */     //   755: aload #11
/*     */     //   757: ldc 2023513938
/*     */     //   759: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   761: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   764: aload #11
/*     */     //   766: aload #17
/*     */     //   768: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   773: astore #20
/*     */     //   775: aload #11
/*     */     //   777: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   780: aload #20
/*     */     //   782: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   785: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   788: astore #6
/*     */     //   790: iload #15
/*     */     //   792: ldc -3670017
/*     */     //   794: iand
/*     */     //   795: istore #15
/*     */     //   797: iload #14
/*     */     //   799: sipush #128
/*     */     //   802: iand
/*     */     //   803: ifeq -> 863
/*     */     //   806: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   809: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   812: astore #17
/*     */     //   814: bipush #6
/*     */     //   816: istore #18
/*     */     //   818: iconst_0
/*     */     //   819: istore #19
/*     */     //   821: aload #11
/*     */     //   823: ldc 2023513938
/*     */     //   825: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   827: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   830: aload #11
/*     */     //   832: aload #17
/*     */     //   834: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   839: astore #20
/*     */     //   841: aload #11
/*     */     //   843: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   846: aload #20
/*     */     //   848: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   851: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   854: astore #7
/*     */     //   856: iload #15
/*     */     //   858: ldc -29360129
/*     */     //   860: iand
/*     */     //   861: istore #15
/*     */     //   863: iload #14
/*     */     //   865: sipush #256
/*     */     //   868: iand
/*     */     //   869: ifeq -> 929
/*     */     //   872: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   875: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   878: astore #17
/*     */     //   880: bipush #6
/*     */     //   882: istore #18
/*     */     //   884: iconst_0
/*     */     //   885: istore #19
/*     */     //   887: aload #11
/*     */     //   889: ldc 2023513938
/*     */     //   891: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   893: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   896: aload #11
/*     */     //   898: aload #17
/*     */     //   900: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   905: astore #20
/*     */     //   907: aload #11
/*     */     //   909: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   912: aload #20
/*     */     //   914: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   917: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   920: astore #8
/*     */     //   922: iload #15
/*     */     //   924: ldc -234881025
/*     */     //   926: iand
/*     */     //   927: istore #15
/*     */     //   929: iload #14
/*     */     //   931: sipush #512
/*     */     //   934: iand
/*     */     //   935: ifeq -> 991
/*     */     //   938: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   941: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   944: astore #17
/*     */     //   946: iconst_0
/*     */     //   947: istore #18
/*     */     //   949: iconst_0
/*     */     //   950: istore #19
/*     */     //   952: aload #11
/*     */     //   954: ldc 2023513938
/*     */     //   956: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   958: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   961: aload #11
/*     */     //   963: aload #17
/*     */     //   965: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   970: astore #20
/*     */     //   972: aload #11
/*     */     //   974: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   977: aload #20
/*     */     //   979: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   982: astore #9
/*     */     //   984: iload #15
/*     */     //   986: ldc -1879048193
/*     */     //   988: iand
/*     */     //   989: istore #15
/*     */     //   991: iload #14
/*     */     //   993: sipush #1024
/*     */     //   996: iand
/*     */     //   997: ifeq -> 1081
/*     */     //   1000: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1003: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1006: astore #10
/*     */     //   1008: goto -> 1081
/*     */     //   1011: aload #11
/*     */     //   1013: invokeinterface skipToGroupEnd : ()V
/*     */     //   1018: iload #14
/*     */     //   1020: bipush #64
/*     */     //   1022: iand
/*     */     //   1023: ifeq -> 1033
/*     */     //   1026: iload #15
/*     */     //   1028: ldc -3670017
/*     */     //   1030: iand
/*     */     //   1031: istore #15
/*     */     //   1033: iload #14
/*     */     //   1035: sipush #128
/*     */     //   1038: iand
/*     */     //   1039: ifeq -> 1049
/*     */     //   1042: iload #15
/*     */     //   1044: ldc -29360129
/*     */     //   1046: iand
/*     */     //   1047: istore #15
/*     */     //   1049: iload #14
/*     */     //   1051: sipush #256
/*     */     //   1054: iand
/*     */     //   1055: ifeq -> 1065
/*     */     //   1058: iload #15
/*     */     //   1060: ldc -234881025
/*     */     //   1062: iand
/*     */     //   1063: istore #15
/*     */     //   1065: iload #14
/*     */     //   1067: sipush #512
/*     */     //   1070: iand
/*     */     //   1071: ifeq -> 1081
/*     */     //   1074: iload #15
/*     */     //   1076: ldc -1879048193
/*     */     //   1078: iand
/*     */     //   1079: istore #15
/*     */     //   1081: aload #11
/*     */     //   1083: invokeinterface endDefaults : ()V
/*     */     //   1088: invokestatic isTraceInProgress : ()Z
/*     */     //   1091: ifeq -> 1107
/*     */     //   1094: ldc_w 1241799607
/*     */     //   1097: iload #15
/*     */     //   1099: iload #16
/*     */     //   1101: ldc_w 'org.jetbrains.jewel.ui.component.TriStateCheckbox (Checkbox.kt:102)'
/*     */     //   1104: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1107: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1110: astore #17
/*     */     //   1112: aload_0
/*     */     //   1113: aload_1
/*     */     //   1114: aload #6
/*     */     //   1116: aload #7
/*     */     //   1118: aload #8
/*     */     //   1120: aload_2
/*     */     //   1121: aload #17
/*     */     //   1123: checkcast androidx/compose/ui/Modifier
/*     */     //   1126: iload_3
/*     */     //   1127: aload #4
/*     */     //   1129: aload #5
/*     */     //   1131: aload #9
/*     */     //   1133: aload #10
/*     */     //   1135: aconst_null
/*     */     //   1136: aload #11
/*     */     //   1138: ldc 1572864
/*     */     //   1140: bipush #14
/*     */     //   1142: iload #15
/*     */     //   1144: iand
/*     */     //   1145: ior
/*     */     //   1146: bipush #112
/*     */     //   1148: iload #15
/*     */     //   1150: iand
/*     */     //   1151: ior
/*     */     //   1152: sipush #896
/*     */     //   1155: iload #15
/*     */     //   1157: bipush #12
/*     */     //   1159: ishr
/*     */     //   1160: iand
/*     */     //   1161: ior
/*     */     //   1162: sipush #7168
/*     */     //   1165: iload #15
/*     */     //   1167: bipush #12
/*     */     //   1169: ishr
/*     */     //   1170: iand
/*     */     //   1171: ior
/*     */     //   1172: ldc 57344
/*     */     //   1174: iload #15
/*     */     //   1176: bipush #12
/*     */     //   1178: ishr
/*     */     //   1179: iand
/*     */     //   1180: ior
/*     */     //   1181: ldc 458752
/*     */     //   1183: iload #15
/*     */     //   1185: bipush #9
/*     */     //   1187: ishl
/*     */     //   1188: iand
/*     */     //   1189: ior
/*     */     //   1190: ldc 29360128
/*     */     //   1192: iload #15
/*     */     //   1194: bipush #12
/*     */     //   1196: ishl
/*     */     //   1197: iand
/*     */     //   1198: ior
/*     */     //   1199: ldc 234881024
/*     */     //   1201: iload #15
/*     */     //   1203: bipush #12
/*     */     //   1205: ishl
/*     */     //   1206: iand
/*     */     //   1207: ior
/*     */     //   1208: ldc 1879048192
/*     */     //   1210: iload #15
/*     */     //   1212: bipush #12
/*     */     //   1214: ishl
/*     */     //   1215: iand
/*     */     //   1216: ior
/*     */     //   1217: sipush #384
/*     */     //   1220: bipush #14
/*     */     //   1222: iload #15
/*     */     //   1224: bipush #27
/*     */     //   1226: ishr
/*     */     //   1227: iand
/*     */     //   1228: ior
/*     */     //   1229: bipush #112
/*     */     //   1231: iload #16
/*     */     //   1233: iconst_3
/*     */     //   1234: ishl
/*     */     //   1235: iand
/*     */     //   1236: ior
/*     */     //   1237: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1240: invokestatic isTraceInProgress : ()Z
/*     */     //   1243: ifeq -> 1259
/*     */     //   1246: invokestatic traceEventEnd : ()V
/*     */     //   1249: goto -> 1259
/*     */     //   1252: aload #11
/*     */     //   1254: invokeinterface skipToGroupEnd : ()V
/*     */     //   1259: aload #11
/*     */     //   1261: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1266: dup
/*     */     //   1267: ifnull -> 1307
/*     */     //   1270: aload_0
/*     */     //   1271: aload_1
/*     */     //   1272: aload_2
/*     */     //   1273: iload_3
/*     */     //   1274: aload #4
/*     */     //   1276: aload #5
/*     */     //   1278: aload #6
/*     */     //   1280: aload #7
/*     */     //   1282: aload #8
/*     */     //   1284: aload #9
/*     */     //   1286: aload #10
/*     */     //   1288: iload #12
/*     */     //   1290: iload #13
/*     */     //   1292: iload #14
/*     */     //   1294: <illegal opcode> invoke : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1299: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1304: goto -> 1308
/*     */     //   1307: pop
/*     */     //   1308: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 14
/*     */     //   #94	-> 608
/*     */     //   #95	-> 623
/*     */     //   #96	-> 633
/*     */     //   #97	-> 646
/*     */     //   #445	-> 666
/*     */     //   #446	-> 678
/*     */     //   #447	-> 689
/*     */     //   #97	-> 692
/*     */     //   #447	-> 695
/*     */     //   #448	-> 697
/*     */     //   #449	-> 706
/*     */     //   #450	-> 711
/*     */     //   #446	-> 713
/*     */     //   #445	-> 714
/*     */     //   #445	-> 715
/*     */     //   #97	-> 716
/*     */     //   #98	-> 740
/*     */     //   #451	-> 761
/*     */     //   #98	-> 785
/*     */     //   #99	-> 806
/*     */     //   #452	-> 827
/*     */     //   #99	-> 851
/*     */     //   #100	-> 872
/*     */     //   #453	-> 893
/*     */     //   #100	-> 917
/*     */     //   #101	-> 938
/*     */     //   #454	-> 958
/*     */     //   #102	-> 1000
/*     */     //   #103	-> 1104
/*     */     //   #108	-> 1107
/*     */     //   #105	-> 1112
/*     */     //   #106	-> 1113
/*     */     //   #112	-> 1114
/*     */     //   #113	-> 1116
/*     */     //   #114	-> 1118
/*     */     //   #107	-> 1120
/*     */     //   #108	-> 1121
/*     */     //   #109	-> 1126
/*     */     //   #110	-> 1127
/*     */     //   #111	-> 1129
/*     */     //   #115	-> 1131
/*     */     //   #116	-> 1133
/*     */     //   #117	-> 1135
/*     */     //   #104	-> 1237
/*     */     //   #119	-> 1252
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   692	3	23	$i$a$-cache-CheckboxKt$TriStateCheckbox$1	I
/*     */     //   697	11	23	value$iv	Ljava/lang/Object;
/*     */     //   678	36	22	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   675	39	21	it$iv	Ljava/lang/Object;
/*     */     //   666	50	20	$i$f$cache	I
/*     */     //   663	53	18	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   663	53	19	invalid$iv	Z
/*     */     //   755	27	19	$i$f$getCurrent	I
/*     */     //   752	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   752	30	18	$changed$iv	I
/*     */     //   821	27	19	$i$f$getCurrent	I
/*     */     //   818	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   818	30	18	$changed$iv	I
/*     */     //   887	27	19	$i$f$getCurrent	I
/*     */     //   884	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   884	30	18	$changed$iv	I
/*     */     //   952	27	19	$i$f$getCurrent	I
/*     */     //   949	30	17	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   949	30	18	$changed$iv	I
/*     */     //   30	1279	15	$dirty	I
/*     */     //   34	1275	16	$dirty1	I
/*     */     //   0	1309	0	state	Landroidx/compose/ui/state/ToggleableState;
/*     */     //   0	1309	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1309	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1309	3	enabled	Z
/*     */     //   0	1309	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1309	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1309	6	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1309	7	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1309	8	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1309	9	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1309	10	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1309	11	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1309	12	$changed	I
/*     */     //   0	1309	13	$changed1	I } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void TriStateCheckboxRow(@NotNull String text, @NotNull ToggleableState state, @NotNull Function0 onClick, @Nullable Modifier modifier, @Nullable Modifier textModifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'text'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'state'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload_2
/*     */     //   15: ldc_w 'onClick'
/*     */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   21: aload #13
/*     */     //   23: ldc_w -2131942069
/*     */     //   26: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   31: astore #13
/*     */     //   33: iload #14
/*     */     //   35: istore #17
/*     */     //   37: iload #15
/*     */     //   39: istore #18
/*     */     //   41: iload #16
/*     */     //   43: iconst_1
/*     */     //   44: iand
/*     */     //   45: ifeq -> 58
/*     */     //   48: iload #17
/*     */     //   50: bipush #6
/*     */     //   52: ior
/*     */     //   53: istore #17
/*     */     //   55: goto -> 87
/*     */     //   58: iload #14
/*     */     //   60: bipush #6
/*     */     //   62: iand
/*     */     //   63: ifne -> 87
/*     */     //   66: iload #17
/*     */     //   68: aload #13
/*     */     //   70: aload_0
/*     */     //   71: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   76: ifeq -> 83
/*     */     //   79: iconst_4
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_2
/*     */     //   84: ior
/*     */     //   85: istore #17
/*     */     //   87: iload #16
/*     */     //   89: iconst_2
/*     */     //   90: iand
/*     */     //   91: ifeq -> 104
/*     */     //   94: iload #17
/*     */     //   96: bipush #48
/*     */     //   98: ior
/*     */     //   99: istore #17
/*     */     //   101: goto -> 135
/*     */     //   104: iload #14
/*     */     //   106: bipush #48
/*     */     //   108: iand
/*     */     //   109: ifne -> 135
/*     */     //   112: iload #17
/*     */     //   114: aload #13
/*     */     //   116: aload_1
/*     */     //   117: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   122: ifeq -> 130
/*     */     //   125: bipush #32
/*     */     //   127: goto -> 132
/*     */     //   130: bipush #16
/*     */     //   132: ior
/*     */     //   133: istore #17
/*     */     //   135: iload #16
/*     */     //   137: iconst_4
/*     */     //   138: iand
/*     */     //   139: ifeq -> 153
/*     */     //   142: iload #17
/*     */     //   144: sipush #384
/*     */     //   147: ior
/*     */     //   148: istore #17
/*     */     //   150: goto -> 187
/*     */     //   153: iload #14
/*     */     //   155: sipush #384
/*     */     //   158: iand
/*     */     //   159: ifne -> 187
/*     */     //   162: iload #17
/*     */     //   164: aload #13
/*     */     //   166: aload_2
/*     */     //   167: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   172: ifeq -> 181
/*     */     //   175: sipush #256
/*     */     //   178: goto -> 184
/*     */     //   181: sipush #128
/*     */     //   184: ior
/*     */     //   185: istore #17
/*     */     //   187: iload #16
/*     */     //   189: bipush #8
/*     */     //   191: iand
/*     */     //   192: ifeq -> 206
/*     */     //   195: iload #17
/*     */     //   197: sipush #3072
/*     */     //   200: ior
/*     */     //   201: istore #17
/*     */     //   203: goto -> 240
/*     */     //   206: iload #14
/*     */     //   208: sipush #3072
/*     */     //   211: iand
/*     */     //   212: ifne -> 240
/*     */     //   215: iload #17
/*     */     //   217: aload #13
/*     */     //   219: aload_3
/*     */     //   220: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   225: ifeq -> 234
/*     */     //   228: sipush #2048
/*     */     //   231: goto -> 237
/*     */     //   234: sipush #1024
/*     */     //   237: ior
/*     */     //   238: istore #17
/*     */     //   240: iload #16
/*     */     //   242: bipush #16
/*     */     //   244: iand
/*     */     //   245: ifeq -> 259
/*     */     //   248: iload #17
/*     */     //   250: sipush #24576
/*     */     //   253: ior
/*     */     //   254: istore #17
/*     */     //   256: goto -> 294
/*     */     //   259: iload #14
/*     */     //   261: sipush #24576
/*     */     //   264: iand
/*     */     //   265: ifne -> 294
/*     */     //   268: iload #17
/*     */     //   270: aload #13
/*     */     //   272: aload #4
/*     */     //   274: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   279: ifeq -> 288
/*     */     //   282: sipush #16384
/*     */     //   285: goto -> 291
/*     */     //   288: sipush #8192
/*     */     //   291: ior
/*     */     //   292: istore #17
/*     */     //   294: iload #16
/*     */     //   296: bipush #32
/*     */     //   298: iand
/*     */     //   299: ifeq -> 312
/*     */     //   302: iload #17
/*     */     //   304: ldc 196608
/*     */     //   306: ior
/*     */     //   307: istore #17
/*     */     //   309: goto -> 344
/*     */     //   312: iload #14
/*     */     //   314: ldc 196608
/*     */     //   316: iand
/*     */     //   317: ifne -> 344
/*     */     //   320: iload #17
/*     */     //   322: aload #13
/*     */     //   324: iload #5
/*     */     //   326: invokeinterface changed : (Z)Z
/*     */     //   331: ifeq -> 339
/*     */     //   334: ldc 131072
/*     */     //   336: goto -> 341
/*     */     //   339: ldc 65536
/*     */     //   341: ior
/*     */     //   342: istore #17
/*     */     //   344: iload #16
/*     */     //   346: bipush #64
/*     */     //   348: iand
/*     */     //   349: ifeq -> 362
/*     */     //   352: iload #17
/*     */     //   354: ldc 1572864
/*     */     //   356: ior
/*     */     //   357: istore #17
/*     */     //   359: goto -> 394
/*     */     //   362: iload #14
/*     */     //   364: ldc 1572864
/*     */     //   366: iand
/*     */     //   367: ifne -> 394
/*     */     //   370: iload #17
/*     */     //   372: aload #13
/*     */     //   374: aload #6
/*     */     //   376: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   381: ifeq -> 389
/*     */     //   384: ldc 1048576
/*     */     //   386: goto -> 391
/*     */     //   389: ldc 524288
/*     */     //   391: ior
/*     */     //   392: istore #17
/*     */     //   394: iload #16
/*     */     //   396: sipush #128
/*     */     //   399: iand
/*     */     //   400: ifeq -> 413
/*     */     //   403: iload #17
/*     */     //   405: ldc 12582912
/*     */     //   407: ior
/*     */     //   408: istore #17
/*     */     //   410: goto -> 445
/*     */     //   413: iload #14
/*     */     //   415: ldc 12582912
/*     */     //   417: iand
/*     */     //   418: ifne -> 445
/*     */     //   421: iload #17
/*     */     //   423: aload #13
/*     */     //   425: aload #7
/*     */     //   427: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   432: ifeq -> 440
/*     */     //   435: ldc 8388608
/*     */     //   437: goto -> 442
/*     */     //   440: ldc 4194304
/*     */     //   442: ior
/*     */     //   443: istore #17
/*     */     //   445: iload #14
/*     */     //   447: ldc 100663296
/*     */     //   449: iand
/*     */     //   450: ifne -> 486
/*     */     //   453: iload #17
/*     */     //   455: iload #16
/*     */     //   457: sipush #256
/*     */     //   460: iand
/*     */     //   461: ifne -> 481
/*     */     //   464: aload #13
/*     */     //   466: aload #8
/*     */     //   468: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   473: ifeq -> 481
/*     */     //   476: ldc 67108864
/*     */     //   478: goto -> 483
/*     */     //   481: ldc 33554432
/*     */     //   483: ior
/*     */     //   484: istore #17
/*     */     //   486: iload #14
/*     */     //   488: ldc 805306368
/*     */     //   490: iand
/*     */     //   491: ifne -> 527
/*     */     //   494: iload #17
/*     */     //   496: iload #16
/*     */     //   498: sipush #512
/*     */     //   501: iand
/*     */     //   502: ifne -> 522
/*     */     //   505: aload #13
/*     */     //   507: aload #9
/*     */     //   509: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   514: ifeq -> 522
/*     */     //   517: ldc 536870912
/*     */     //   519: goto -> 524
/*     */     //   522: ldc 268435456
/*     */     //   524: ior
/*     */     //   525: istore #17
/*     */     //   527: iload #15
/*     */     //   529: bipush #6
/*     */     //   531: iand
/*     */     //   532: ifne -> 566
/*     */     //   535: iload #18
/*     */     //   537: iload #16
/*     */     //   539: sipush #1024
/*     */     //   542: iand
/*     */     //   543: ifne -> 562
/*     */     //   546: aload #13
/*     */     //   548: aload #10
/*     */     //   550: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   555: ifeq -> 562
/*     */     //   558: iconst_4
/*     */     //   559: goto -> 563
/*     */     //   562: iconst_2
/*     */     //   563: ior
/*     */     //   564: istore #18
/*     */     //   566: iload #15
/*     */     //   568: bipush #48
/*     */     //   570: iand
/*     */     //   571: ifne -> 607
/*     */     //   574: iload #18
/*     */     //   576: iload #16
/*     */     //   578: sipush #2048
/*     */     //   581: iand
/*     */     //   582: ifne -> 602
/*     */     //   585: aload #13
/*     */     //   587: aload #11
/*     */     //   589: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   594: ifeq -> 602
/*     */     //   597: bipush #32
/*     */     //   599: goto -> 604
/*     */     //   602: bipush #16
/*     */     //   604: ior
/*     */     //   605: istore #18
/*     */     //   607: iload #16
/*     */     //   609: sipush #4096
/*     */     //   612: iand
/*     */     //   613: ifeq -> 627
/*     */     //   616: iload #18
/*     */     //   618: sipush #384
/*     */     //   621: ior
/*     */     //   622: istore #18
/*     */     //   624: goto -> 662
/*     */     //   627: iload #15
/*     */     //   629: sipush #384
/*     */     //   632: iand
/*     */     //   633: ifne -> 662
/*     */     //   636: iload #18
/*     */     //   638: aload #13
/*     */     //   640: aload #12
/*     */     //   642: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   647: ifeq -> 656
/*     */     //   650: sipush #256
/*     */     //   653: goto -> 659
/*     */     //   656: sipush #128
/*     */     //   659: ior
/*     */     //   660: istore #18
/*     */     //   662: iload #17
/*     */     //   664: ldc 306783379
/*     */     //   666: iand
/*     */     //   667: ldc 306783378
/*     */     //   669: if_icmpne -> 694
/*     */     //   672: iload #18
/*     */     //   674: sipush #147
/*     */     //   677: iand
/*     */     //   678: sipush #146
/*     */     //   681: if_icmpne -> 694
/*     */     //   684: aload #13
/*     */     //   686: invokeinterface getSkipping : ()Z
/*     */     //   691: ifne -> 1414
/*     */     //   694: aload #13
/*     */     //   696: invokeinterface startDefaults : ()V
/*     */     //   701: iload #14
/*     */     //   703: iconst_1
/*     */     //   704: iand
/*     */     //   705: ifeq -> 718
/*     */     //   708: aload #13
/*     */     //   710: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   715: ifeq -> 1148
/*     */     //   718: iload #16
/*     */     //   720: bipush #8
/*     */     //   722: iand
/*     */     //   723: ifeq -> 733
/*     */     //   726: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   729: checkcast androidx/compose/ui/Modifier
/*     */     //   732: astore_3
/*     */     //   733: iload #16
/*     */     //   735: bipush #16
/*     */     //   737: iand
/*     */     //   738: ifeq -> 749
/*     */     //   741: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   744: checkcast androidx/compose/ui/Modifier
/*     */     //   747: astore #4
/*     */     //   749: iload #16
/*     */     //   751: bipush #32
/*     */     //   753: iand
/*     */     //   754: ifeq -> 760
/*     */     //   757: iconst_1
/*     */     //   758: istore #5
/*     */     //   760: iload #16
/*     */     //   762: bipush #64
/*     */     //   764: iand
/*     */     //   765: ifeq -> 773
/*     */     //   768: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   771: astore #6
/*     */     //   773: iload #16
/*     */     //   775: sipush #128
/*     */     //   778: iand
/*     */     //   779: ifeq -> 868
/*     */     //   782: aload #13
/*     */     //   784: ldc_w -1519690406
/*     */     //   787: invokeinterface startReplaceGroup : (I)V
/*     */     //   792: aload #13
/*     */     //   794: astore #20
/*     */     //   796: iconst_0
/*     */     //   797: istore #21
/*     */     //   799: iconst_0
/*     */     //   800: istore #22
/*     */     //   802: aload #20
/*     */     //   804: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   809: astore #23
/*     */     //   811: iconst_0
/*     */     //   812: istore #24
/*     */     //   814: aload #23
/*     */     //   816: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   819: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   822: if_acmpne -> 847
/*     */     //   825: iconst_0
/*     */     //   826: istore #25
/*     */     //   828: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   831: astore #25
/*     */     //   833: aload #20
/*     */     //   835: aload #25
/*     */     //   837: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   842: aload #25
/*     */     //   844: goto -> 849
/*     */     //   847: aload #23
/*     */     //   849: nop
/*     */     //   850: nop
/*     */     //   851: nop
/*     */     //   852: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   855: astore #19
/*     */     //   857: aload #13
/*     */     //   859: invokeinterface endReplaceGroup : ()V
/*     */     //   864: aload #19
/*     */     //   866: astore #7
/*     */     //   868: iload #16
/*     */     //   870: sipush #256
/*     */     //   873: iand
/*     */     //   874: ifeq -> 934
/*     */     //   877: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   880: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   883: astore #19
/*     */     //   885: bipush #6
/*     */     //   887: istore #20
/*     */     //   889: iconst_0
/*     */     //   890: istore #21
/*     */     //   892: aload #13
/*     */     //   894: ldc 2023513938
/*     */     //   896: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   898: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   901: aload #13
/*     */     //   903: aload #19
/*     */     //   905: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   910: astore #22
/*     */     //   912: aload #13
/*     */     //   914: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   917: aload #22
/*     */     //   919: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   922: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   925: astore #8
/*     */     //   927: iload #17
/*     */     //   929: ldc -234881025
/*     */     //   931: iand
/*     */     //   932: istore #17
/*     */     //   934: iload #16
/*     */     //   936: sipush #512
/*     */     //   939: iand
/*     */     //   940: ifeq -> 1000
/*     */     //   943: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   946: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   949: astore #19
/*     */     //   951: bipush #6
/*     */     //   953: istore #20
/*     */     //   955: iconst_0
/*     */     //   956: istore #21
/*     */     //   958: aload #13
/*     */     //   960: ldc 2023513938
/*     */     //   962: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   964: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   967: aload #13
/*     */     //   969: aload #19
/*     */     //   971: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   976: astore #22
/*     */     //   978: aload #13
/*     */     //   980: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   983: aload #22
/*     */     //   985: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   988: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   991: astore #9
/*     */     //   993: iload #17
/*     */     //   995: ldc -1879048193
/*     */     //   997: iand
/*     */     //   998: istore #17
/*     */     //   1000: iload #16
/*     */     //   1002: sipush #1024
/*     */     //   1005: iand
/*     */     //   1006: ifeq -> 1066
/*     */     //   1009: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1012: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1015: astore #19
/*     */     //   1017: bipush #6
/*     */     //   1019: istore #20
/*     */     //   1021: iconst_0
/*     */     //   1022: istore #21
/*     */     //   1024: aload #13
/*     */     //   1026: ldc 2023513938
/*     */     //   1028: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1030: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1033: aload #13
/*     */     //   1035: aload #19
/*     */     //   1037: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1042: astore #22
/*     */     //   1044: aload #13
/*     */     //   1046: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1049: aload #22
/*     */     //   1051: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   1054: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   1057: astore #10
/*     */     //   1059: iload #18
/*     */     //   1061: bipush #-15
/*     */     //   1063: iand
/*     */     //   1064: istore #18
/*     */     //   1066: iload #16
/*     */     //   1068: sipush #2048
/*     */     //   1071: iand
/*     */     //   1072: ifeq -> 1128
/*     */     //   1075: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1078: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1081: astore #19
/*     */     //   1083: iconst_0
/*     */     //   1084: istore #20
/*     */     //   1086: iconst_0
/*     */     //   1087: istore #21
/*     */     //   1089: aload #13
/*     */     //   1091: ldc 2023513938
/*     */     //   1093: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1095: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1098: aload #13
/*     */     //   1100: aload #19
/*     */     //   1102: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1107: astore #22
/*     */     //   1109: aload #13
/*     */     //   1111: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1114: aload #22
/*     */     //   1116: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1119: astore #11
/*     */     //   1121: iload #18
/*     */     //   1123: bipush #-113
/*     */     //   1125: iand
/*     */     //   1126: istore #18
/*     */     //   1128: iload #16
/*     */     //   1130: sipush #4096
/*     */     //   1133: iand
/*     */     //   1134: ifeq -> 1219
/*     */     //   1137: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1140: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1143: astore #12
/*     */     //   1145: goto -> 1219
/*     */     //   1148: aload #13
/*     */     //   1150: invokeinterface skipToGroupEnd : ()V
/*     */     //   1155: iload #16
/*     */     //   1157: sipush #256
/*     */     //   1160: iand
/*     */     //   1161: ifeq -> 1171
/*     */     //   1164: iload #17
/*     */     //   1166: ldc -234881025
/*     */     //   1168: iand
/*     */     //   1169: istore #17
/*     */     //   1171: iload #16
/*     */     //   1173: sipush #512
/*     */     //   1176: iand
/*     */     //   1177: ifeq -> 1187
/*     */     //   1180: iload #17
/*     */     //   1182: ldc -1879048193
/*     */     //   1184: iand
/*     */     //   1185: istore #17
/*     */     //   1187: iload #16
/*     */     //   1189: sipush #1024
/*     */     //   1192: iand
/*     */     //   1193: ifeq -> 1203
/*     */     //   1196: iload #18
/*     */     //   1198: bipush #-15
/*     */     //   1200: iand
/*     */     //   1201: istore #18
/*     */     //   1203: iload #16
/*     */     //   1205: sipush #2048
/*     */     //   1208: iand
/*     */     //   1209: ifeq -> 1219
/*     */     //   1212: iload #18
/*     */     //   1214: bipush #-113
/*     */     //   1216: iand
/*     */     //   1217: istore #18
/*     */     //   1219: aload #13
/*     */     //   1221: invokeinterface endDefaults : ()V
/*     */     //   1226: invokestatic isTraceInProgress : ()Z
/*     */     //   1229: ifeq -> 1245
/*     */     //   1232: ldc_w -2131942069
/*     */     //   1235: iload #17
/*     */     //   1237: iload #18
/*     */     //   1239: ldc_w 'org.jetbrains.jewel.ui.component.TriStateCheckboxRow (Checkbox.kt:135)'
/*     */     //   1242: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1245: aload_1
/*     */     //   1246: aload_2
/*     */     //   1247: aload #8
/*     */     //   1249: aload #9
/*     */     //   1251: aload #10
/*     */     //   1253: aload_3
/*     */     //   1254: aload #4
/*     */     //   1256: iload #5
/*     */     //   1258: aload #6
/*     */     //   1260: aload #7
/*     */     //   1262: aload #11
/*     */     //   1264: aload #12
/*     */     //   1266: ldc_w -69404246
/*     */     //   1269: iconst_1
/*     */     //   1270: new org/jetbrains/jewel/ui/component/CheckboxKt$TriStateCheckboxRow$2
/*     */     //   1273: dup
/*     */     //   1274: aload_0
/*     */     //   1275: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1278: aload #13
/*     */     //   1280: bipush #54
/*     */     //   1282: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1285: checkcast kotlin/jvm/functions/Function3
/*     */     //   1288: aload #13
/*     */     //   1290: bipush #14
/*     */     //   1292: iload #17
/*     */     //   1294: iconst_3
/*     */     //   1295: ishr
/*     */     //   1296: iand
/*     */     //   1297: bipush #112
/*     */     //   1299: iload #17
/*     */     //   1301: iconst_3
/*     */     //   1302: ishr
/*     */     //   1303: iand
/*     */     //   1304: ior
/*     */     //   1305: sipush #896
/*     */     //   1308: iload #17
/*     */     //   1310: bipush #18
/*     */     //   1312: ishr
/*     */     //   1313: iand
/*     */     //   1314: ior
/*     */     //   1315: sipush #7168
/*     */     //   1318: iload #17
/*     */     //   1320: bipush #18
/*     */     //   1322: ishr
/*     */     //   1323: iand
/*     */     //   1324: ior
/*     */     //   1325: ldc 57344
/*     */     //   1327: iload #18
/*     */     //   1329: bipush #12
/*     */     //   1331: ishl
/*     */     //   1332: iand
/*     */     //   1333: ior
/*     */     //   1334: ldc 458752
/*     */     //   1336: iload #17
/*     */     //   1338: bipush #6
/*     */     //   1340: ishl
/*     */     //   1341: iand
/*     */     //   1342: ior
/*     */     //   1343: ldc_w 3670016
/*     */     //   1346: iload #17
/*     */     //   1348: bipush #6
/*     */     //   1350: ishl
/*     */     //   1351: iand
/*     */     //   1352: ior
/*     */     //   1353: ldc 29360128
/*     */     //   1355: iload #17
/*     */     //   1357: bipush #6
/*     */     //   1359: ishl
/*     */     //   1360: iand
/*     */     //   1361: ior
/*     */     //   1362: ldc 234881024
/*     */     //   1364: iload #17
/*     */     //   1366: bipush #6
/*     */     //   1368: ishl
/*     */     //   1369: iand
/*     */     //   1370: ior
/*     */     //   1371: ldc 1879048192
/*     */     //   1373: iload #17
/*     */     //   1375: bipush #6
/*     */     //   1377: ishl
/*     */     //   1378: iand
/*     */     //   1379: ior
/*     */     //   1380: sipush #384
/*     */     //   1383: bipush #14
/*     */     //   1385: iload #18
/*     */     //   1387: iconst_3
/*     */     //   1388: ishr
/*     */     //   1389: iand
/*     */     //   1390: ior
/*     */     //   1391: bipush #112
/*     */     //   1393: iload #18
/*     */     //   1395: iconst_3
/*     */     //   1396: ishr
/*     */     //   1397: iand
/*     */     //   1398: ior
/*     */     //   1399: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1402: invokestatic isTraceInProgress : ()Z
/*     */     //   1405: ifeq -> 1421
/*     */     //   1408: invokestatic traceEventEnd : ()V
/*     */     //   1411: goto -> 1421
/*     */     //   1414: aload #13
/*     */     //   1416: invokeinterface skipToGroupEnd : ()V
/*     */     //   1421: aload #13
/*     */     //   1423: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1428: dup
/*     */     //   1429: ifnull -> 1473
/*     */     //   1432: aload_0
/*     */     //   1433: aload_1
/*     */     //   1434: aload_2
/*     */     //   1435: aload_3
/*     */     //   1436: aload #4
/*     */     //   1438: iload #5
/*     */     //   1440: aload #6
/*     */     //   1442: aload #7
/*     */     //   1444: aload #8
/*     */     //   1446: aload #9
/*     */     //   1448: aload #10
/*     */     //   1450: aload #11
/*     */     //   1452: aload #12
/*     */     //   1454: iload #14
/*     */     //   1456: iload #15
/*     */     //   1458: iload #16
/*     */     //   1460: <illegal opcode> invoke : (Ljava/lang/String;Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1465: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1470: goto -> 1474
/*     */     //   1473: pop
/*     */     //   1474: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 21
/*     */     //   #126	-> 726
/*     */     //   #127	-> 741
/*     */     //   #128	-> 757
/*     */     //   #129	-> 768
/*     */     //   #130	-> 782
/*     */     //   #455	-> 802
/*     */     //   #456	-> 814
/*     */     //   #457	-> 825
/*     */     //   #130	-> 828
/*     */     //   #457	-> 831
/*     */     //   #458	-> 833
/*     */     //   #459	-> 842
/*     */     //   #460	-> 847
/*     */     //   #456	-> 849
/*     */     //   #455	-> 850
/*     */     //   #455	-> 851
/*     */     //   #130	-> 852
/*     */     //   #131	-> 877
/*     */     //   #461	-> 898
/*     */     //   #131	-> 922
/*     */     //   #132	-> 943
/*     */     //   #462	-> 964
/*     */     //   #132	-> 988
/*     */     //   #133	-> 1009
/*     */     //   #463	-> 1030
/*     */     //   #133	-> 1054
/*     */     //   #134	-> 1075
/*     */     //   #464	-> 1095
/*     */     //   #135	-> 1137
/*     */     //   #136	-> 1242
/*     */     //   #138	-> 1245
/*     */     //   #139	-> 1246
/*     */     //   #145	-> 1247
/*     */     //   #146	-> 1249
/*     */     //   #147	-> 1251
/*     */     //   #140	-> 1253
/*     */     //   #141	-> 1254
/*     */     //   #142	-> 1256
/*     */     //   #143	-> 1258
/*     */     //   #144	-> 1260
/*     */     //   #148	-> 1262
/*     */     //   #149	-> 1264
/*     */     //   #150	-> 1266
/*     */     //   #137	-> 1399
/*     */     //   #153	-> 1414
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   828	3	25	$i$a$-cache-CheckboxKt$TriStateCheckboxRow$1	I
/*     */     //   833	11	25	value$iv	Ljava/lang/Object;
/*     */     //   814	36	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   811	39	23	it$iv	Ljava/lang/Object;
/*     */     //   802	50	22	$i$f$cache	I
/*     */     //   799	53	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   799	53	21	invalid$iv	Z
/*     */     //   892	27	21	$i$f$getCurrent	I
/*     */     //   889	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   889	30	20	$changed$iv	I
/*     */     //   958	27	21	$i$f$getCurrent	I
/*     */     //   955	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   955	30	20	$changed$iv	I
/*     */     //   1024	27	21	$i$f$getCurrent	I
/*     */     //   1021	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1021	30	20	$changed$iv	I
/*     */     //   1089	27	21	$i$f$getCurrent	I
/*     */     //   1086	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1086	30	20	$changed$iv	I
/*     */     //   37	1438	17	$dirty	I
/*     */     //   41	1434	18	$dirty1	I
/*     */     //   0	1475	0	text	Ljava/lang/String;
/*     */     //   0	1475	1	state	Landroidx/compose/ui/state/ToggleableState;
/*     */     //   0	1475	2	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1475	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1475	4	textModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1475	5	enabled	Z
/*     */     //   0	1475	6	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1475	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1475	8	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1475	9	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1475	10	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1475	11	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1475	12	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1475	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1475	14	$changed	I
/*     */     //   0	1475	15	$changed1	I } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class CheckboxKt$TriStateCheckboxRow$2 implements Function3<RowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$CheckboxImpl, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$CheckboxImpl, "$this$CheckboxImpl"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-69404246, $changed, -1, "org.jetbrains.jewel.ui.component.TriStateCheckboxRow.<anonymous> (Checkbox.kt:150)");  TextKt.Text-bAzTDeA(this.$text, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } CheckboxKt$TriStateCheckboxRow$2(String $text) {} } @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public static final void CheckboxRow(@NotNull String text, boolean checked, @NotNull Function1 onCheckedChange, @Nullable Modifier modifier, @Nullable Modifier textModifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'text'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc 'onCheckedChange'
/*     */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   13: aload #13
/*     */     //   15: ldc_w -1985724949
/*     */     //   18: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   23: astore #13
/*     */     //   25: iload #14
/*     */     //   27: istore #17
/*     */     //   29: iload #15
/*     */     //   31: istore #18
/*     */     //   33: iload #16
/*     */     //   35: iconst_1
/*     */     //   36: iand
/*     */     //   37: ifeq -> 50
/*     */     //   40: iload #17
/*     */     //   42: bipush #6
/*     */     //   44: ior
/*     */     //   45: istore #17
/*     */     //   47: goto -> 79
/*     */     //   50: iload #14
/*     */     //   52: bipush #6
/*     */     //   54: iand
/*     */     //   55: ifne -> 79
/*     */     //   58: iload #17
/*     */     //   60: aload #13
/*     */     //   62: aload_0
/*     */     //   63: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   68: ifeq -> 75
/*     */     //   71: iconst_4
/*     */     //   72: goto -> 76
/*     */     //   75: iconst_2
/*     */     //   76: ior
/*     */     //   77: istore #17
/*     */     //   79: iload #16
/*     */     //   81: iconst_2
/*     */     //   82: iand
/*     */     //   83: ifeq -> 96
/*     */     //   86: iload #17
/*     */     //   88: bipush #48
/*     */     //   90: ior
/*     */     //   91: istore #17
/*     */     //   93: goto -> 127
/*     */     //   96: iload #14
/*     */     //   98: bipush #48
/*     */     //   100: iand
/*     */     //   101: ifne -> 127
/*     */     //   104: iload #17
/*     */     //   106: aload #13
/*     */     //   108: iload_1
/*     */     //   109: invokeinterface changed : (Z)Z
/*     */     //   114: ifeq -> 122
/*     */     //   117: bipush #32
/*     */     //   119: goto -> 124
/*     */     //   122: bipush #16
/*     */     //   124: ior
/*     */     //   125: istore #17
/*     */     //   127: iload #16
/*     */     //   129: iconst_4
/*     */     //   130: iand
/*     */     //   131: ifeq -> 145
/*     */     //   134: iload #17
/*     */     //   136: sipush #384
/*     */     //   139: ior
/*     */     //   140: istore #17
/*     */     //   142: goto -> 179
/*     */     //   145: iload #14
/*     */     //   147: sipush #384
/*     */     //   150: iand
/*     */     //   151: ifne -> 179
/*     */     //   154: iload #17
/*     */     //   156: aload #13
/*     */     //   158: aload_2
/*     */     //   159: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #256
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #128
/*     */     //   176: ior
/*     */     //   177: istore #17
/*     */     //   179: iload #16
/*     */     //   181: bipush #8
/*     */     //   183: iand
/*     */     //   184: ifeq -> 198
/*     */     //   187: iload #17
/*     */     //   189: sipush #3072
/*     */     //   192: ior
/*     */     //   193: istore #17
/*     */     //   195: goto -> 232
/*     */     //   198: iload #14
/*     */     //   200: sipush #3072
/*     */     //   203: iand
/*     */     //   204: ifne -> 232
/*     */     //   207: iload #17
/*     */     //   209: aload #13
/*     */     //   211: aload_3
/*     */     //   212: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   217: ifeq -> 226
/*     */     //   220: sipush #2048
/*     */     //   223: goto -> 229
/*     */     //   226: sipush #1024
/*     */     //   229: ior
/*     */     //   230: istore #17
/*     */     //   232: iload #16
/*     */     //   234: bipush #16
/*     */     //   236: iand
/*     */     //   237: ifeq -> 251
/*     */     //   240: iload #17
/*     */     //   242: sipush #24576
/*     */     //   245: ior
/*     */     //   246: istore #17
/*     */     //   248: goto -> 286
/*     */     //   251: iload #14
/*     */     //   253: sipush #24576
/*     */     //   256: iand
/*     */     //   257: ifne -> 286
/*     */     //   260: iload #17
/*     */     //   262: aload #13
/*     */     //   264: aload #4
/*     */     //   266: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   271: ifeq -> 280
/*     */     //   274: sipush #16384
/*     */     //   277: goto -> 283
/*     */     //   280: sipush #8192
/*     */     //   283: ior
/*     */     //   284: istore #17
/*     */     //   286: iload #16
/*     */     //   288: bipush #32
/*     */     //   290: iand
/*     */     //   291: ifeq -> 304
/*     */     //   294: iload #17
/*     */     //   296: ldc 196608
/*     */     //   298: ior
/*     */     //   299: istore #17
/*     */     //   301: goto -> 336
/*     */     //   304: iload #14
/*     */     //   306: ldc 196608
/*     */     //   308: iand
/*     */     //   309: ifne -> 336
/*     */     //   312: iload #17
/*     */     //   314: aload #13
/*     */     //   316: iload #5
/*     */     //   318: invokeinterface changed : (Z)Z
/*     */     //   323: ifeq -> 331
/*     */     //   326: ldc 131072
/*     */     //   328: goto -> 333
/*     */     //   331: ldc 65536
/*     */     //   333: ior
/*     */     //   334: istore #17
/*     */     //   336: iload #16
/*     */     //   338: bipush #64
/*     */     //   340: iand
/*     */     //   341: ifeq -> 354
/*     */     //   344: iload #17
/*     */     //   346: ldc 1572864
/*     */     //   348: ior
/*     */     //   349: istore #17
/*     */     //   351: goto -> 386
/*     */     //   354: iload #14
/*     */     //   356: ldc 1572864
/*     */     //   358: iand
/*     */     //   359: ifne -> 386
/*     */     //   362: iload #17
/*     */     //   364: aload #13
/*     */     //   366: aload #6
/*     */     //   368: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   373: ifeq -> 381
/*     */     //   376: ldc 1048576
/*     */     //   378: goto -> 383
/*     */     //   381: ldc 524288
/*     */     //   383: ior
/*     */     //   384: istore #17
/*     */     //   386: iload #16
/*     */     //   388: sipush #128
/*     */     //   391: iand
/*     */     //   392: ifeq -> 405
/*     */     //   395: iload #17
/*     */     //   397: ldc 12582912
/*     */     //   399: ior
/*     */     //   400: istore #17
/*     */     //   402: goto -> 437
/*     */     //   405: iload #14
/*     */     //   407: ldc 12582912
/*     */     //   409: iand
/*     */     //   410: ifne -> 437
/*     */     //   413: iload #17
/*     */     //   415: aload #13
/*     */     //   417: aload #7
/*     */     //   419: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   424: ifeq -> 432
/*     */     //   427: ldc 8388608
/*     */     //   429: goto -> 434
/*     */     //   432: ldc 4194304
/*     */     //   434: ior
/*     */     //   435: istore #17
/*     */     //   437: iload #14
/*     */     //   439: ldc 100663296
/*     */     //   441: iand
/*     */     //   442: ifne -> 478
/*     */     //   445: iload #17
/*     */     //   447: iload #16
/*     */     //   449: sipush #256
/*     */     //   452: iand
/*     */     //   453: ifne -> 473
/*     */     //   456: aload #13
/*     */     //   458: aload #8
/*     */     //   460: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   465: ifeq -> 473
/*     */     //   468: ldc 67108864
/*     */     //   470: goto -> 475
/*     */     //   473: ldc 33554432
/*     */     //   475: ior
/*     */     //   476: istore #17
/*     */     //   478: iload #14
/*     */     //   480: ldc 805306368
/*     */     //   482: iand
/*     */     //   483: ifne -> 519
/*     */     //   486: iload #17
/*     */     //   488: iload #16
/*     */     //   490: sipush #512
/*     */     //   493: iand
/*     */     //   494: ifne -> 514
/*     */     //   497: aload #13
/*     */     //   499: aload #9
/*     */     //   501: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   506: ifeq -> 514
/*     */     //   509: ldc 536870912
/*     */     //   511: goto -> 516
/*     */     //   514: ldc 268435456
/*     */     //   516: ior
/*     */     //   517: istore #17
/*     */     //   519: iload #15
/*     */     //   521: bipush #6
/*     */     //   523: iand
/*     */     //   524: ifne -> 558
/*     */     //   527: iload #18
/*     */     //   529: iload #16
/*     */     //   531: sipush #1024
/*     */     //   534: iand
/*     */     //   535: ifne -> 554
/*     */     //   538: aload #13
/*     */     //   540: aload #10
/*     */     //   542: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   547: ifeq -> 554
/*     */     //   550: iconst_4
/*     */     //   551: goto -> 555
/*     */     //   554: iconst_2
/*     */     //   555: ior
/*     */     //   556: istore #18
/*     */     //   558: iload #15
/*     */     //   560: bipush #48
/*     */     //   562: iand
/*     */     //   563: ifne -> 599
/*     */     //   566: iload #18
/*     */     //   568: iload #16
/*     */     //   570: sipush #2048
/*     */     //   573: iand
/*     */     //   574: ifne -> 594
/*     */     //   577: aload #13
/*     */     //   579: aload #11
/*     */     //   581: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   586: ifeq -> 594
/*     */     //   589: bipush #32
/*     */     //   591: goto -> 596
/*     */     //   594: bipush #16
/*     */     //   596: ior
/*     */     //   597: istore #18
/*     */     //   599: iload #16
/*     */     //   601: sipush #4096
/*     */     //   604: iand
/*     */     //   605: ifeq -> 619
/*     */     //   608: iload #18
/*     */     //   610: sipush #384
/*     */     //   613: ior
/*     */     //   614: istore #18
/*     */     //   616: goto -> 654
/*     */     //   619: iload #15
/*     */     //   621: sipush #384
/*     */     //   624: iand
/*     */     //   625: ifne -> 654
/*     */     //   628: iload #18
/*     */     //   630: aload #13
/*     */     //   632: aload #12
/*     */     //   634: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   639: ifeq -> 648
/*     */     //   642: sipush #256
/*     */     //   645: goto -> 651
/*     */     //   648: sipush #128
/*     */     //   651: ior
/*     */     //   652: istore #18
/*     */     //   654: iload #17
/*     */     //   656: ldc 306783379
/*     */     //   658: iand
/*     */     //   659: ldc 306783378
/*     */     //   661: if_icmpne -> 686
/*     */     //   664: iload #18
/*     */     //   666: sipush #147
/*     */     //   669: iand
/*     */     //   670: sipush #146
/*     */     //   673: if_icmpne -> 686
/*     */     //   676: aload #13
/*     */     //   678: invokeinterface getSkipping : ()Z
/*     */     //   683: ifne -> 1637
/*     */     //   686: aload #13
/*     */     //   688: invokeinterface startDefaults : ()V
/*     */     //   693: iload #14
/*     */     //   695: iconst_1
/*     */     //   696: iand
/*     */     //   697: ifeq -> 710
/*     */     //   700: aload #13
/*     */     //   702: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   707: ifeq -> 1140
/*     */     //   710: iload #16
/*     */     //   712: bipush #8
/*     */     //   714: iand
/*     */     //   715: ifeq -> 725
/*     */     //   718: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   721: checkcast androidx/compose/ui/Modifier
/*     */     //   724: astore_3
/*     */     //   725: iload #16
/*     */     //   727: bipush #16
/*     */     //   729: iand
/*     */     //   730: ifeq -> 741
/*     */     //   733: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   736: checkcast androidx/compose/ui/Modifier
/*     */     //   739: astore #4
/*     */     //   741: iload #16
/*     */     //   743: bipush #32
/*     */     //   745: iand
/*     */     //   746: ifeq -> 752
/*     */     //   749: iconst_1
/*     */     //   750: istore #5
/*     */     //   752: iload #16
/*     */     //   754: bipush #64
/*     */     //   756: iand
/*     */     //   757: ifeq -> 765
/*     */     //   760: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   763: astore #6
/*     */     //   765: iload #16
/*     */     //   767: sipush #128
/*     */     //   770: iand
/*     */     //   771: ifeq -> 860
/*     */     //   774: aload #13
/*     */     //   776: ldc_w -1083285504
/*     */     //   779: invokeinterface startReplaceGroup : (I)V
/*     */     //   784: aload #13
/*     */     //   786: astore #20
/*     */     //   788: iconst_0
/*     */     //   789: istore #21
/*     */     //   791: iconst_0
/*     */     //   792: istore #22
/*     */     //   794: aload #20
/*     */     //   796: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   801: astore #23
/*     */     //   803: iconst_0
/*     */     //   804: istore #24
/*     */     //   806: aload #23
/*     */     //   808: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   811: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   814: if_acmpne -> 839
/*     */     //   817: iconst_0
/*     */     //   818: istore #25
/*     */     //   820: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   823: astore #25
/*     */     //   825: aload #20
/*     */     //   827: aload #25
/*     */     //   829: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   834: aload #25
/*     */     //   836: goto -> 841
/*     */     //   839: aload #23
/*     */     //   841: nop
/*     */     //   842: nop
/*     */     //   843: nop
/*     */     //   844: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   847: astore #19
/*     */     //   849: aload #13
/*     */     //   851: invokeinterface endReplaceGroup : ()V
/*     */     //   856: aload #19
/*     */     //   858: astore #7
/*     */     //   860: iload #16
/*     */     //   862: sipush #256
/*     */     //   865: iand
/*     */     //   866: ifeq -> 926
/*     */     //   869: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   872: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   875: astore #19
/*     */     //   877: bipush #6
/*     */     //   879: istore #20
/*     */     //   881: iconst_0
/*     */     //   882: istore #21
/*     */     //   884: aload #13
/*     */     //   886: ldc 2023513938
/*     */     //   888: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   890: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   893: aload #13
/*     */     //   895: aload #19
/*     */     //   897: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   902: astore #22
/*     */     //   904: aload #13
/*     */     //   906: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   909: aload #22
/*     */     //   911: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   914: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   917: astore #8
/*     */     //   919: iload #17
/*     */     //   921: ldc -234881025
/*     */     //   923: iand
/*     */     //   924: istore #17
/*     */     //   926: iload #16
/*     */     //   928: sipush #512
/*     */     //   931: iand
/*     */     //   932: ifeq -> 992
/*     */     //   935: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   938: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   941: astore #19
/*     */     //   943: bipush #6
/*     */     //   945: istore #20
/*     */     //   947: iconst_0
/*     */     //   948: istore #21
/*     */     //   950: aload #13
/*     */     //   952: ldc 2023513938
/*     */     //   954: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   956: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   959: aload #13
/*     */     //   961: aload #19
/*     */     //   963: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   968: astore #22
/*     */     //   970: aload #13
/*     */     //   972: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   975: aload #22
/*     */     //   977: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   980: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   983: astore #9
/*     */     //   985: iload #17
/*     */     //   987: ldc -1879048193
/*     */     //   989: iand
/*     */     //   990: istore #17
/*     */     //   992: iload #16
/*     */     //   994: sipush #1024
/*     */     //   997: iand
/*     */     //   998: ifeq -> 1058
/*     */     //   1001: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1004: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1007: astore #19
/*     */     //   1009: bipush #6
/*     */     //   1011: istore #20
/*     */     //   1013: iconst_0
/*     */     //   1014: istore #21
/*     */     //   1016: aload #13
/*     */     //   1018: ldc 2023513938
/*     */     //   1020: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1022: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1025: aload #13
/*     */     //   1027: aload #19
/*     */     //   1029: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1034: astore #22
/*     */     //   1036: aload #13
/*     */     //   1038: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1041: aload #22
/*     */     //   1043: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   1046: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   1049: astore #10
/*     */     //   1051: iload #18
/*     */     //   1053: bipush #-15
/*     */     //   1055: iand
/*     */     //   1056: istore #18
/*     */     //   1058: iload #16
/*     */     //   1060: sipush #2048
/*     */     //   1063: iand
/*     */     //   1064: ifeq -> 1120
/*     */     //   1067: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1070: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1073: astore #19
/*     */     //   1075: iconst_0
/*     */     //   1076: istore #20
/*     */     //   1078: iconst_0
/*     */     //   1079: istore #21
/*     */     //   1081: aload #13
/*     */     //   1083: ldc 2023513938
/*     */     //   1085: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1087: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1090: aload #13
/*     */     //   1092: aload #19
/*     */     //   1094: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1099: astore #22
/*     */     //   1101: aload #13
/*     */     //   1103: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1106: aload #22
/*     */     //   1108: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1111: astore #11
/*     */     //   1113: iload #18
/*     */     //   1115: bipush #-113
/*     */     //   1117: iand
/*     */     //   1118: istore #18
/*     */     //   1120: iload #16
/*     */     //   1122: sipush #4096
/*     */     //   1125: iand
/*     */     //   1126: ifeq -> 1211
/*     */     //   1129: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1132: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1135: astore #12
/*     */     //   1137: goto -> 1211
/*     */     //   1140: aload #13
/*     */     //   1142: invokeinterface skipToGroupEnd : ()V
/*     */     //   1147: iload #16
/*     */     //   1149: sipush #256
/*     */     //   1152: iand
/*     */     //   1153: ifeq -> 1163
/*     */     //   1156: iload #17
/*     */     //   1158: ldc -234881025
/*     */     //   1160: iand
/*     */     //   1161: istore #17
/*     */     //   1163: iload #16
/*     */     //   1165: sipush #512
/*     */     //   1168: iand
/*     */     //   1169: ifeq -> 1179
/*     */     //   1172: iload #17
/*     */     //   1174: ldc -1879048193
/*     */     //   1176: iand
/*     */     //   1177: istore #17
/*     */     //   1179: iload #16
/*     */     //   1181: sipush #1024
/*     */     //   1184: iand
/*     */     //   1185: ifeq -> 1195
/*     */     //   1188: iload #18
/*     */     //   1190: bipush #-15
/*     */     //   1192: iand
/*     */     //   1193: istore #18
/*     */     //   1195: iload #16
/*     */     //   1197: sipush #2048
/*     */     //   1200: iand
/*     */     //   1201: ifeq -> 1211
/*     */     //   1204: iload #18
/*     */     //   1206: bipush #-113
/*     */     //   1208: iand
/*     */     //   1209: istore #18
/*     */     //   1211: aload #13
/*     */     //   1213: invokeinterface endDefaults : ()V
/*     */     //   1218: invokestatic isTraceInProgress : ()Z
/*     */     //   1221: ifeq -> 1237
/*     */     //   1224: ldc_w -1985724949
/*     */     //   1227: iload #17
/*     */     //   1229: iload #18
/*     */     //   1231: ldc_w 'org.jetbrains.jewel.ui.component.CheckboxRow (Checkbox.kt:169)'
/*     */     //   1234: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1237: aload #13
/*     */     //   1239: ldc_w -1083273417
/*     */     //   1242: invokeinterface startReplaceGroup : (I)V
/*     */     //   1247: aload #13
/*     */     //   1249: astore #21
/*     */     //   1251: iload #17
/*     */     //   1253: bipush #112
/*     */     //   1255: iand
/*     */     //   1256: bipush #32
/*     */     //   1258: if_icmpne -> 1265
/*     */     //   1261: iconst_1
/*     */     //   1262: goto -> 1266
/*     */     //   1265: iconst_0
/*     */     //   1266: istore #22
/*     */     //   1268: nop
/*     */     //   1269: iconst_0
/*     */     //   1270: istore #23
/*     */     //   1272: aload #21
/*     */     //   1274: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1279: astore #24
/*     */     //   1281: iconst_0
/*     */     //   1282: istore #25
/*     */     //   1284: iload #22
/*     */     //   1286: ifne -> 1300
/*     */     //   1289: aload #24
/*     */     //   1291: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1294: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1297: if_acmpne -> 1329
/*     */     //   1300: iconst_0
/*     */     //   1301: istore #26
/*     */     //   1303: iload_1
/*     */     //   1304: invokestatic ToggleableState : (Z)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1307: aconst_null
/*     */     //   1308: iconst_2
/*     */     //   1309: aconst_null
/*     */     //   1310: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1313: astore #27
/*     */     //   1315: aload #21
/*     */     //   1317: aload #27
/*     */     //   1319: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1324: aload #27
/*     */     //   1326: goto -> 1331
/*     */     //   1329: aload #24
/*     */     //   1331: nop
/*     */     //   1332: nop
/*     */     //   1333: nop
/*     */     //   1334: checkcast androidx/compose/runtime/MutableState
/*     */     //   1337: astore #20
/*     */     //   1339: aload #13
/*     */     //   1341: invokeinterface endReplaceGroup : ()V
/*     */     //   1346: aload #20
/*     */     //   1348: astore #19
/*     */     //   1350: aload #19
/*     */     //   1352: invokestatic CheckboxRow$lambda$12 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1355: aload #13
/*     */     //   1357: ldc_w -1083269514
/*     */     //   1360: invokeinterface startReplaceGroup : (I)V
/*     */     //   1365: aload #13
/*     */     //   1367: astore #22
/*     */     //   1369: iload #17
/*     */     //   1371: sipush #896
/*     */     //   1374: iand
/*     */     //   1375: sipush #256
/*     */     //   1378: if_icmpne -> 1385
/*     */     //   1381: iconst_1
/*     */     //   1382: goto -> 1386
/*     */     //   1385: iconst_0
/*     */     //   1386: iload #17
/*     */     //   1388: bipush #112
/*     */     //   1390: iand
/*     */     //   1391: bipush #32
/*     */     //   1393: if_icmpne -> 1400
/*     */     //   1396: iconst_1
/*     */     //   1397: goto -> 1401
/*     */     //   1400: iconst_0
/*     */     //   1401: ior
/*     */     //   1402: istore #23
/*     */     //   1404: nop
/*     */     //   1405: iconst_0
/*     */     //   1406: istore #24
/*     */     //   1408: aload #22
/*     */     //   1410: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1415: astore #25
/*     */     //   1417: iconst_0
/*     */     //   1418: istore #26
/*     */     //   1420: iload #23
/*     */     //   1422: ifne -> 1436
/*     */     //   1425: aload #25
/*     */     //   1427: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1430: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1433: if_acmpne -> 1467
/*     */     //   1436: astore #29
/*     */     //   1438: iconst_0
/*     */     //   1439: istore #27
/*     */     //   1441: aload_2
/*     */     //   1442: iload_1
/*     */     //   1443: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   1448: aload #29
/*     */     //   1450: swap
/*     */     //   1451: astore #28
/*     */     //   1453: aload #22
/*     */     //   1455: aload #28
/*     */     //   1457: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1462: aload #28
/*     */     //   1464: goto -> 1469
/*     */     //   1467: aload #25
/*     */     //   1469: nop
/*     */     //   1470: nop
/*     */     //   1471: nop
/*     */     //   1472: checkcast kotlin/jvm/functions/Function0
/*     */     //   1475: astore #21
/*     */     //   1477: aload #13
/*     */     //   1479: invokeinterface endReplaceGroup : ()V
/*     */     //   1484: aload #21
/*     */     //   1486: aload #8
/*     */     //   1488: aload #9
/*     */     //   1490: aload #10
/*     */     //   1492: aload_3
/*     */     //   1493: aload #4
/*     */     //   1495: iload #5
/*     */     //   1497: aload #6
/*     */     //   1499: aload #7
/*     */     //   1501: aload #11
/*     */     //   1503: aload #12
/*     */     //   1505: ldc_w -995184566
/*     */     //   1508: iconst_1
/*     */     //   1509: new org/jetbrains/jewel/ui/component/CheckboxKt$CheckboxRow$3
/*     */     //   1512: dup
/*     */     //   1513: aload_0
/*     */     //   1514: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1517: aload #13
/*     */     //   1519: bipush #54
/*     */     //   1521: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1524: checkcast kotlin/jvm/functions/Function3
/*     */     //   1527: aload #13
/*     */     //   1529: sipush #896
/*     */     //   1532: iload #17
/*     */     //   1534: bipush #18
/*     */     //   1536: ishr
/*     */     //   1537: iand
/*     */     //   1538: sipush #7168
/*     */     //   1541: iload #17
/*     */     //   1543: bipush #18
/*     */     //   1545: ishr
/*     */     //   1546: iand
/*     */     //   1547: ior
/*     */     //   1548: ldc 57344
/*     */     //   1550: iload #18
/*     */     //   1552: bipush #12
/*     */     //   1554: ishl
/*     */     //   1555: iand
/*     */     //   1556: ior
/*     */     //   1557: ldc 458752
/*     */     //   1559: iload #17
/*     */     //   1561: bipush #6
/*     */     //   1563: ishl
/*     */     //   1564: iand
/*     */     //   1565: ior
/*     */     //   1566: ldc_w 3670016
/*     */     //   1569: iload #17
/*     */     //   1571: bipush #6
/*     */     //   1573: ishl
/*     */     //   1574: iand
/*     */     //   1575: ior
/*     */     //   1576: ldc 29360128
/*     */     //   1578: iload #17
/*     */     //   1580: bipush #6
/*     */     //   1582: ishl
/*     */     //   1583: iand
/*     */     //   1584: ior
/*     */     //   1585: ldc 234881024
/*     */     //   1587: iload #17
/*     */     //   1589: bipush #6
/*     */     //   1591: ishl
/*     */     //   1592: iand
/*     */     //   1593: ior
/*     */     //   1594: ldc 1879048192
/*     */     //   1596: iload #17
/*     */     //   1598: bipush #6
/*     */     //   1600: ishl
/*     */     //   1601: iand
/*     */     //   1602: ior
/*     */     //   1603: sipush #384
/*     */     //   1606: bipush #14
/*     */     //   1608: iload #18
/*     */     //   1610: iconst_3
/*     */     //   1611: ishr
/*     */     //   1612: iand
/*     */     //   1613: ior
/*     */     //   1614: bipush #112
/*     */     //   1616: iload #18
/*     */     //   1618: iconst_3
/*     */     //   1619: ishr
/*     */     //   1620: iand
/*     */     //   1621: ior
/*     */     //   1622: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1625: invokestatic isTraceInProgress : ()Z
/*     */     //   1628: ifeq -> 1644
/*     */     //   1631: invokestatic traceEventEnd : ()V
/*     */     //   1634: goto -> 1644
/*     */     //   1637: aload #13
/*     */     //   1639: invokeinterface skipToGroupEnd : ()V
/*     */     //   1644: aload #13
/*     */     //   1646: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1651: dup
/*     */     //   1652: ifnull -> 1696
/*     */     //   1655: aload_0
/*     */     //   1656: iload_1
/*     */     //   1657: aload_2
/*     */     //   1658: aload_3
/*     */     //   1659: aload #4
/*     */     //   1661: iload #5
/*     */     //   1663: aload #6
/*     */     //   1665: aload #7
/*     */     //   1667: aload #8
/*     */     //   1669: aload #9
/*     */     //   1671: aload #10
/*     */     //   1673: aload #11
/*     */     //   1675: aload #12
/*     */     //   1677: iload #14
/*     */     //   1679: iload #15
/*     */     //   1681: iload #16
/*     */     //   1683: <illegal opcode> invoke : (Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1688: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1693: goto -> 1697
/*     */     //   1696: pop
/*     */     //   1697: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #170	-> 13
/*     */     //   #160	-> 718
/*     */     //   #161	-> 733
/*     */     //   #162	-> 749
/*     */     //   #163	-> 760
/*     */     //   #164	-> 774
/*     */     //   #465	-> 794
/*     */     //   #466	-> 806
/*     */     //   #467	-> 817
/*     */     //   #164	-> 820
/*     */     //   #467	-> 823
/*     */     //   #468	-> 825
/*     */     //   #469	-> 834
/*     */     //   #470	-> 839
/*     */     //   #466	-> 841
/*     */     //   #465	-> 842
/*     */     //   #465	-> 843
/*     */     //   #164	-> 844
/*     */     //   #165	-> 869
/*     */     //   #471	-> 890
/*     */     //   #165	-> 914
/*     */     //   #166	-> 935
/*     */     //   #472	-> 956
/*     */     //   #166	-> 980
/*     */     //   #167	-> 1001
/*     */     //   #473	-> 1022
/*     */     //   #167	-> 1046
/*     */     //   #168	-> 1067
/*     */     //   #474	-> 1087
/*     */     //   #169	-> 1129
/*     */     //   #170	-> 1234
/*     */     //   #171	-> 1268
/*     */     //   #475	-> 1272
/*     */     //   #476	-> 1284
/*     */     //   #477	-> 1300
/*     */     //   #171	-> 1303
/*     */     //   #477	-> 1313
/*     */     //   #478	-> 1315
/*     */     //   #479	-> 1324
/*     */     //   #480	-> 1329
/*     */     //   #476	-> 1331
/*     */     //   #475	-> 1332
/*     */     //   #475	-> 1333
/*     */     //   #171	-> 1334
/*     */     //   #174	-> 1350
/*     */     //   #175	-> 1404
/*     */     //   #481	-> 1408
/*     */     //   #482	-> 1420
/*     */     //   #483	-> 1436
/*     */     //   #175	-> 1441
/*     */     //   #483	-> 1451
/*     */     //   #484	-> 1453
/*     */     //   #485	-> 1462
/*     */     //   #486	-> 1467
/*     */     //   #482	-> 1469
/*     */     //   #481	-> 1470
/*     */     //   #481	-> 1471
/*     */     //   #175	-> 1472
/*     */     //   #181	-> 1486
/*     */     //   #182	-> 1488
/*     */     //   #183	-> 1490
/*     */     //   #176	-> 1492
/*     */     //   #177	-> 1493
/*     */     //   #178	-> 1495
/*     */     //   #179	-> 1497
/*     */     //   #180	-> 1499
/*     */     //   #184	-> 1501
/*     */     //   #185	-> 1503
/*     */     //   #186	-> 1505
/*     */     //   #173	-> 1622
/*     */     //   #189	-> 1637
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   820	3	25	$i$a$-cache-CheckboxKt$CheckboxRow$1	I
/*     */     //   825	11	25	value$iv	Ljava/lang/Object;
/*     */     //   806	36	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   803	39	23	it$iv	Ljava/lang/Object;
/*     */     //   794	50	22	$i$f$cache	I
/*     */     //   791	53	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   791	53	21	invalid$iv	Z
/*     */     //   884	27	21	$i$f$getCurrent	I
/*     */     //   881	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   881	30	20	$changed$iv	I
/*     */     //   950	27	21	$i$f$getCurrent	I
/*     */     //   947	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   947	30	20	$changed$iv	I
/*     */     //   1016	27	21	$i$f$getCurrent	I
/*     */     //   1013	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1013	30	20	$changed$iv	I
/*     */     //   1081	27	21	$i$f$getCurrent	I
/*     */     //   1078	30	19	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1078	30	20	$changed$iv	I
/*     */     //   1303	10	26	$i$a$-cache-CheckboxKt$CheckboxRow$state$2	I
/*     */     //   1315	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1284	48	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1281	51	24	it$iv	Ljava/lang/Object;
/*     */     //   1272	62	23	$i$f$cache	I
/*     */     //   1269	65	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1269	65	22	invalid$iv	Z
/*     */     //   1441	7	27	$i$a$-cache-CheckboxKt$CheckboxRow$2	I
/*     */     //   1453	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1420	50	26	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1417	53	25	it$iv	Ljava/lang/Object;
/*     */     //   1408	64	24	$i$f$cache	I
/*     */     //   1405	67	22	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1405	67	23	invalid$iv	Z
/*     */     //   1350	284	19	state$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   29	1669	17	$dirty	I
/*     */     //   33	1665	18	$dirty1	I
/*     */     //   0	1698	0	text	Ljava/lang/String;
/*     */     //   0	1698	1	checked	Z
/*     */     //   0	1698	2	onCheckedChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1698	3	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1698	4	textModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1698	5	enabled	Z
/*     */     //   0	1698	6	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1698	7	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1698	8	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1698	9	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1698	10	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1698	11	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1698	12	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1698	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1698	14	$changed	I
/* 657 */     //   0	1698	15	$changed1	I } private static final ToggleableState CheckboxRow$lambda$12(MutableState $state$delegate) { State state = (State)$state$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (ToggleableState)state.getValue(); } private static final Unit CheckboxRow$lambda$14$lambda$13(Function1 $onCheckedChange, boolean $checked) { $onCheckedChange.invoke(Boolean.valueOf(!$checked)); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class CheckboxKt$CheckboxRow$3 implements Function3<RowScope, Composer, Integer, Unit> {
/*     */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(RowScope $this$CheckboxImpl, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$CheckboxImpl, "$this$CheckboxImpl"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-995184566, $changed, -1, "org.jetbrains.jewel.ui.component.CheckboxRow.<anonymous> (Checkbox.kt:186)");  TextKt.Text-bAzTDeA(this.$text, null, 0L, 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65534); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } CheckboxKt$CheckboxRow$3(String $text) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void CheckboxRow(boolean checked, @NotNull Function1 onCheckedChange, @Nullable Modifier modifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'onCheckedChange'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #11
/*     */     //   8: ldc_w 'content'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #12
/*     */     //   16: ldc_w -977830305
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #12
/*     */     //   26: iload #13
/*     */     //   28: istore #16
/*     */     //   30: iload #14
/*     */     //   32: istore #17
/*     */     //   34: iload #15
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #16
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #16
/*     */     //   48: goto -> 80
/*     */     //   51: iload #13
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #16
/*     */     //   61: aload #12
/*     */     //   63: iload_0
/*     */     //   64: invokeinterface changed : (Z)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #16
/*     */     //   80: iload #15
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #16
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #16
/*     */     //   94: goto -> 128
/*     */     //   97: iload #13
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #16
/*     */     //   107: aload #12
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #16
/*     */     //   128: iload #15
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #16
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #16
/*     */     //   143: goto -> 180
/*     */     //   146: iload #13
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #16
/*     */     //   157: aload #12
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #16
/*     */     //   180: iload #15
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #16
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #16
/*     */     //   196: goto -> 233
/*     */     //   199: iload #13
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #16
/*     */     //   210: aload #12
/*     */     //   212: iload_3
/*     */     //   213: invokeinterface changed : (Z)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #16
/*     */     //   233: iload #15
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #16
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #16
/*     */     //   249: goto -> 287
/*     */     //   252: iload #13
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #16
/*     */     //   263: aload #12
/*     */     //   265: aload #4
/*     */     //   267: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #16
/*     */     //   287: iload #15
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #16
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #16
/*     */     //   302: goto -> 337
/*     */     //   305: iload #13
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #16
/*     */     //   315: aload #12
/*     */     //   317: aload #5
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #16
/*     */     //   337: iload #13
/*     */     //   339: ldc 1572864
/*     */     //   341: iand
/*     */     //   342: ifne -> 377
/*     */     //   345: iload #16
/*     */     //   347: iload #15
/*     */     //   349: bipush #64
/*     */     //   351: iand
/*     */     //   352: ifne -> 372
/*     */     //   355: aload #12
/*     */     //   357: aload #6
/*     */     //   359: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   364: ifeq -> 372
/*     */     //   367: ldc 1048576
/*     */     //   369: goto -> 374
/*     */     //   372: ldc 524288
/*     */     //   374: ior
/*     */     //   375: istore #16
/*     */     //   377: iload #13
/*     */     //   379: ldc 12582912
/*     */     //   381: iand
/*     */     //   382: ifne -> 418
/*     */     //   385: iload #16
/*     */     //   387: iload #15
/*     */     //   389: sipush #128
/*     */     //   392: iand
/*     */     //   393: ifne -> 413
/*     */     //   396: aload #12
/*     */     //   398: aload #7
/*     */     //   400: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   405: ifeq -> 413
/*     */     //   408: ldc 8388608
/*     */     //   410: goto -> 415
/*     */     //   413: ldc 4194304
/*     */     //   415: ior
/*     */     //   416: istore #16
/*     */     //   418: iload #13
/*     */     //   420: ldc 100663296
/*     */     //   422: iand
/*     */     //   423: ifne -> 459
/*     */     //   426: iload #16
/*     */     //   428: iload #15
/*     */     //   430: sipush #256
/*     */     //   433: iand
/*     */     //   434: ifne -> 454
/*     */     //   437: aload #12
/*     */     //   439: aload #8
/*     */     //   441: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   446: ifeq -> 454
/*     */     //   449: ldc 67108864
/*     */     //   451: goto -> 456
/*     */     //   454: ldc 33554432
/*     */     //   456: ior
/*     */     //   457: istore #16
/*     */     //   459: iload #13
/*     */     //   461: ldc 805306368
/*     */     //   463: iand
/*     */     //   464: ifne -> 500
/*     */     //   467: iload #16
/*     */     //   469: iload #15
/*     */     //   471: sipush #512
/*     */     //   474: iand
/*     */     //   475: ifne -> 495
/*     */     //   478: aload #12
/*     */     //   480: aload #9
/*     */     //   482: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   487: ifeq -> 495
/*     */     //   490: ldc 536870912
/*     */     //   492: goto -> 497
/*     */     //   495: ldc 268435456
/*     */     //   497: ior
/*     */     //   498: istore #16
/*     */     //   500: iload #15
/*     */     //   502: sipush #1024
/*     */     //   505: iand
/*     */     //   506: ifeq -> 519
/*     */     //   509: iload #17
/*     */     //   511: bipush #6
/*     */     //   513: ior
/*     */     //   514: istore #17
/*     */     //   516: goto -> 549
/*     */     //   519: iload #14
/*     */     //   521: bipush #6
/*     */     //   523: iand
/*     */     //   524: ifne -> 549
/*     */     //   527: iload #17
/*     */     //   529: aload #12
/*     */     //   531: aload #10
/*     */     //   533: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   538: ifeq -> 545
/*     */     //   541: iconst_4
/*     */     //   542: goto -> 546
/*     */     //   545: iconst_2
/*     */     //   546: ior
/*     */     //   547: istore #17
/*     */     //   549: iload #15
/*     */     //   551: sipush #2048
/*     */     //   554: iand
/*     */     //   555: ifeq -> 568
/*     */     //   558: iload #17
/*     */     //   560: bipush #48
/*     */     //   562: ior
/*     */     //   563: istore #17
/*     */     //   565: goto -> 600
/*     */     //   568: iload #14
/*     */     //   570: bipush #48
/*     */     //   572: iand
/*     */     //   573: ifne -> 600
/*     */     //   576: iload #17
/*     */     //   578: aload #12
/*     */     //   580: aload #11
/*     */     //   582: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   587: ifeq -> 595
/*     */     //   590: bipush #32
/*     */     //   592: goto -> 597
/*     */     //   595: bipush #16
/*     */     //   597: ior
/*     */     //   598: istore #17
/*     */     //   600: iload #16
/*     */     //   602: ldc 306783379
/*     */     //   604: iand
/*     */     //   605: ldc 306783378
/*     */     //   607: if_icmpne -> 630
/*     */     //   610: iload #17
/*     */     //   612: bipush #19
/*     */     //   614: iand
/*     */     //   615: bipush #18
/*     */     //   617: if_icmpne -> 630
/*     */     //   620: aload #12
/*     */     //   622: invokeinterface getSkipping : ()Z
/*     */     //   627: ifne -> 1433
/*     */     //   630: aload #12
/*     */     //   632: invokeinterface startDefaults : ()V
/*     */     //   637: iload #13
/*     */     //   639: iconst_1
/*     */     //   640: iand
/*     */     //   641: ifeq -> 654
/*     */     //   644: aload #12
/*     */     //   646: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   651: ifeq -> 1064
/*     */     //   654: iload #15
/*     */     //   656: iconst_4
/*     */     //   657: iand
/*     */     //   658: ifeq -> 668
/*     */     //   661: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   664: checkcast androidx/compose/ui/Modifier
/*     */     //   667: astore_2
/*     */     //   668: iload #15
/*     */     //   670: bipush #8
/*     */     //   672: iand
/*     */     //   673: ifeq -> 678
/*     */     //   676: iconst_1
/*     */     //   677: istore_3
/*     */     //   678: iload #15
/*     */     //   680: bipush #16
/*     */     //   682: iand
/*     */     //   683: ifeq -> 691
/*     */     //   686: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   689: astore #4
/*     */     //   691: iload #15
/*     */     //   693: bipush #32
/*     */     //   695: iand
/*     */     //   696: ifeq -> 785
/*     */     //   699: aload #12
/*     */     //   701: ldc_w -1083249056
/*     */     //   704: invokeinterface startReplaceGroup : (I)V
/*     */     //   709: aload #12
/*     */     //   711: astore #19
/*     */     //   713: iconst_0
/*     */     //   714: istore #20
/*     */     //   716: iconst_0
/*     */     //   717: istore #21
/*     */     //   719: aload #19
/*     */     //   721: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   726: astore #22
/*     */     //   728: iconst_0
/*     */     //   729: istore #23
/*     */     //   731: aload #22
/*     */     //   733: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   736: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   739: if_acmpne -> 764
/*     */     //   742: iconst_0
/*     */     //   743: istore #24
/*     */     //   745: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   748: astore #24
/*     */     //   750: aload #19
/*     */     //   752: aload #24
/*     */     //   754: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   759: aload #24
/*     */     //   761: goto -> 766
/*     */     //   764: aload #22
/*     */     //   766: nop
/*     */     //   767: nop
/*     */     //   768: nop
/*     */     //   769: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   772: astore #18
/*     */     //   774: aload #12
/*     */     //   776: invokeinterface endReplaceGroup : ()V
/*     */     //   781: aload #18
/*     */     //   783: astore #5
/*     */     //   785: iload #15
/*     */     //   787: bipush #64
/*     */     //   789: iand
/*     */     //   790: ifeq -> 850
/*     */     //   793: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   796: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   799: astore #18
/*     */     //   801: bipush #6
/*     */     //   803: istore #19
/*     */     //   805: iconst_0
/*     */     //   806: istore #20
/*     */     //   808: aload #12
/*     */     //   810: ldc 2023513938
/*     */     //   812: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   814: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   817: aload #12
/*     */     //   819: aload #18
/*     */     //   821: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   826: astore #21
/*     */     //   828: aload #12
/*     */     //   830: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   833: aload #21
/*     */     //   835: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   838: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   841: astore #6
/*     */     //   843: iload #16
/*     */     //   845: ldc -3670017
/*     */     //   847: iand
/*     */     //   848: istore #16
/*     */     //   850: iload #15
/*     */     //   852: sipush #128
/*     */     //   855: iand
/*     */     //   856: ifeq -> 916
/*     */     //   859: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   862: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   865: astore #18
/*     */     //   867: bipush #6
/*     */     //   869: istore #19
/*     */     //   871: iconst_0
/*     */     //   872: istore #20
/*     */     //   874: aload #12
/*     */     //   876: ldc 2023513938
/*     */     //   878: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   880: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   883: aload #12
/*     */     //   885: aload #18
/*     */     //   887: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   892: astore #21
/*     */     //   894: aload #12
/*     */     //   896: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   899: aload #21
/*     */     //   901: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   904: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   907: astore #7
/*     */     //   909: iload #16
/*     */     //   911: ldc -29360129
/*     */     //   913: iand
/*     */     //   914: istore #16
/*     */     //   916: iload #15
/*     */     //   918: sipush #256
/*     */     //   921: iand
/*     */     //   922: ifeq -> 982
/*     */     //   925: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   928: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   931: astore #18
/*     */     //   933: bipush #6
/*     */     //   935: istore #19
/*     */     //   937: iconst_0
/*     */     //   938: istore #20
/*     */     //   940: aload #12
/*     */     //   942: ldc 2023513938
/*     */     //   944: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   946: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   949: aload #12
/*     */     //   951: aload #18
/*     */     //   953: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   958: astore #21
/*     */     //   960: aload #12
/*     */     //   962: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   965: aload #21
/*     */     //   967: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   970: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   973: astore #8
/*     */     //   975: iload #16
/*     */     //   977: ldc -234881025
/*     */     //   979: iand
/*     */     //   980: istore #16
/*     */     //   982: iload #15
/*     */     //   984: sipush #512
/*     */     //   987: iand
/*     */     //   988: ifeq -> 1044
/*     */     //   991: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   994: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   997: astore #18
/*     */     //   999: iconst_0
/*     */     //   1000: istore #19
/*     */     //   1002: iconst_0
/*     */     //   1003: istore #20
/*     */     //   1005: aload #12
/*     */     //   1007: ldc 2023513938
/*     */     //   1009: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1011: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1014: aload #12
/*     */     //   1016: aload #18
/*     */     //   1018: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1023: astore #21
/*     */     //   1025: aload #12
/*     */     //   1027: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1030: aload #21
/*     */     //   1032: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1035: astore #9
/*     */     //   1037: iload #16
/*     */     //   1039: ldc -1879048193
/*     */     //   1041: iand
/*     */     //   1042: istore #16
/*     */     //   1044: iload #15
/*     */     //   1046: sipush #1024
/*     */     //   1049: iand
/*     */     //   1050: ifeq -> 1134
/*     */     //   1053: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1056: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1059: astore #10
/*     */     //   1061: goto -> 1134
/*     */     //   1064: aload #12
/*     */     //   1066: invokeinterface skipToGroupEnd : ()V
/*     */     //   1071: iload #15
/*     */     //   1073: bipush #64
/*     */     //   1075: iand
/*     */     //   1076: ifeq -> 1086
/*     */     //   1079: iload #16
/*     */     //   1081: ldc -3670017
/*     */     //   1083: iand
/*     */     //   1084: istore #16
/*     */     //   1086: iload #15
/*     */     //   1088: sipush #128
/*     */     //   1091: iand
/*     */     //   1092: ifeq -> 1102
/*     */     //   1095: iload #16
/*     */     //   1097: ldc -29360129
/*     */     //   1099: iand
/*     */     //   1100: istore #16
/*     */     //   1102: iload #15
/*     */     //   1104: sipush #256
/*     */     //   1107: iand
/*     */     //   1108: ifeq -> 1118
/*     */     //   1111: iload #16
/*     */     //   1113: ldc -234881025
/*     */     //   1115: iand
/*     */     //   1116: istore #16
/*     */     //   1118: iload #15
/*     */     //   1120: sipush #512
/*     */     //   1123: iand
/*     */     //   1124: ifeq -> 1134
/*     */     //   1127: iload #16
/*     */     //   1129: ldc -1879048193
/*     */     //   1131: iand
/*     */     //   1132: istore #16
/*     */     //   1134: aload #12
/*     */     //   1136: invokeinterface endDefaults : ()V
/*     */     //   1141: invokestatic isTraceInProgress : ()Z
/*     */     //   1144: ifeq -> 1160
/*     */     //   1147: ldc_w -977830305
/*     */     //   1150: iload #16
/*     */     //   1152: iload #17
/*     */     //   1154: ldc_w 'org.jetbrains.jewel.ui.component.CheckboxRow (Checkbox.kt:204)'
/*     */     //   1157: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1160: iload_0
/*     */     //   1161: invokestatic ToggleableState : (Z)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1164: astore #18
/*     */     //   1166: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1169: astore #19
/*     */     //   1171: aload #18
/*     */     //   1173: aload #12
/*     */     //   1175: ldc_w -1083233578
/*     */     //   1178: invokeinterface startReplaceGroup : (I)V
/*     */     //   1183: aload #12
/*     */     //   1185: astore #21
/*     */     //   1187: iload #16
/*     */     //   1189: bipush #112
/*     */     //   1191: iand
/*     */     //   1192: bipush #32
/*     */     //   1194: if_icmpne -> 1201
/*     */     //   1197: iconst_1
/*     */     //   1198: goto -> 1202
/*     */     //   1201: iconst_0
/*     */     //   1202: iload #16
/*     */     //   1204: bipush #14
/*     */     //   1206: iand
/*     */     //   1207: iconst_4
/*     */     //   1208: if_icmpne -> 1215
/*     */     //   1211: iconst_1
/*     */     //   1212: goto -> 1216
/*     */     //   1215: iconst_0
/*     */     //   1216: ior
/*     */     //   1217: istore #22
/*     */     //   1219: nop
/*     */     //   1220: iconst_0
/*     */     //   1221: istore #23
/*     */     //   1223: aload #21
/*     */     //   1225: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1230: astore #24
/*     */     //   1232: iconst_0
/*     */     //   1233: istore #25
/*     */     //   1235: iload #22
/*     */     //   1237: ifne -> 1251
/*     */     //   1240: aload #24
/*     */     //   1242: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1245: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1248: if_acmpne -> 1282
/*     */     //   1251: astore #28
/*     */     //   1253: iconst_0
/*     */     //   1254: istore #26
/*     */     //   1256: aload_1
/*     */     //   1257: iload_0
/*     */     //   1258: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   1263: aload #28
/*     */     //   1265: swap
/*     */     //   1266: astore #27
/*     */     //   1268: aload #21
/*     */     //   1270: aload #27
/*     */     //   1272: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1277: aload #27
/*     */     //   1279: goto -> 1284
/*     */     //   1282: aload #24
/*     */     //   1284: nop
/*     */     //   1285: nop
/*     */     //   1286: nop
/*     */     //   1287: checkcast kotlin/jvm/functions/Function0
/*     */     //   1290: astore #20
/*     */     //   1292: aload #12
/*     */     //   1294: invokeinterface endReplaceGroup : ()V
/*     */     //   1299: aload #20
/*     */     //   1301: aload #6
/*     */     //   1303: aload #7
/*     */     //   1305: aload #8
/*     */     //   1307: aload_2
/*     */     //   1308: aload #19
/*     */     //   1310: checkcast androidx/compose/ui/Modifier
/*     */     //   1313: iload_3
/*     */     //   1314: aload #4
/*     */     //   1316: aload #5
/*     */     //   1318: aload #9
/*     */     //   1320: aload #10
/*     */     //   1322: aload #11
/*     */     //   1324: aload #12
/*     */     //   1326: ldc 1572864
/*     */     //   1328: sipush #896
/*     */     //   1331: iload #16
/*     */     //   1333: bipush #12
/*     */     //   1335: ishr
/*     */     //   1336: iand
/*     */     //   1337: ior
/*     */     //   1338: sipush #7168
/*     */     //   1341: iload #16
/*     */     //   1343: bipush #12
/*     */     //   1345: ishr
/*     */     //   1346: iand
/*     */     //   1347: ior
/*     */     //   1348: ldc 57344
/*     */     //   1350: iload #16
/*     */     //   1352: bipush #12
/*     */     //   1354: ishr
/*     */     //   1355: iand
/*     */     //   1356: ior
/*     */     //   1357: ldc 458752
/*     */     //   1359: iload #16
/*     */     //   1361: bipush #9
/*     */     //   1363: ishl
/*     */     //   1364: iand
/*     */     //   1365: ior
/*     */     //   1366: ldc 29360128
/*     */     //   1368: iload #16
/*     */     //   1370: bipush #12
/*     */     //   1372: ishl
/*     */     //   1373: iand
/*     */     //   1374: ior
/*     */     //   1375: ldc 234881024
/*     */     //   1377: iload #16
/*     */     //   1379: bipush #12
/*     */     //   1381: ishl
/*     */     //   1382: iand
/*     */     //   1383: ior
/*     */     //   1384: ldc 1879048192
/*     */     //   1386: iload #16
/*     */     //   1388: bipush #12
/*     */     //   1390: ishl
/*     */     //   1391: iand
/*     */     //   1392: ior
/*     */     //   1393: bipush #14
/*     */     //   1395: iload #16
/*     */     //   1397: bipush #27
/*     */     //   1399: ishr
/*     */     //   1400: iand
/*     */     //   1401: bipush #112
/*     */     //   1403: iload #17
/*     */     //   1405: iconst_3
/*     */     //   1406: ishl
/*     */     //   1407: iand
/*     */     //   1408: ior
/*     */     //   1409: sipush #896
/*     */     //   1412: iload #17
/*     */     //   1414: iconst_3
/*     */     //   1415: ishl
/*     */     //   1416: iand
/*     */     //   1417: ior
/*     */     //   1418: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1421: invokestatic isTraceInProgress : ()Z
/*     */     //   1424: ifeq -> 1440
/*     */     //   1427: invokestatic traceEventEnd : ()V
/*     */     //   1430: goto -> 1440
/*     */     //   1433: aload #12
/*     */     //   1435: invokeinterface skipToGroupEnd : ()V
/*     */     //   1440: aload #12
/*     */     //   1442: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1447: dup
/*     */     //   1448: ifnull -> 1490
/*     */     //   1451: iload_0
/*     */     //   1452: aload_1
/*     */     //   1453: aload_2
/*     */     //   1454: iload_3
/*     */     //   1455: aload #4
/*     */     //   1457: aload #5
/*     */     //   1459: aload #6
/*     */     //   1461: aload #7
/*     */     //   1463: aload #8
/*     */     //   1465: aload #9
/*     */     //   1467: aload #10
/*     */     //   1469: aload #11
/*     */     //   1471: iload #13
/*     */     //   1473: iload #14
/*     */     //   1475: iload #15
/*     */     //   1477: <illegal opcode> invoke : (ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1482: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1487: goto -> 1491
/*     */     //   1490: pop
/*     */     //   1491: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #205	-> 14
/*     */     //   #195	-> 661
/*     */     //   #196	-> 676
/*     */     //   #197	-> 686
/*     */     //   #198	-> 699
/*     */     //   #487	-> 719
/*     */     //   #488	-> 731
/*     */     //   #489	-> 742
/*     */     //   #198	-> 745
/*     */     //   #489	-> 748
/*     */     //   #490	-> 750
/*     */     //   #491	-> 759
/*     */     //   #492	-> 764
/*     */     //   #488	-> 766
/*     */     //   #487	-> 767
/*     */     //   #487	-> 768
/*     */     //   #198	-> 769
/*     */     //   #199	-> 793
/*     */     //   #493	-> 814
/*     */     //   #199	-> 838
/*     */     //   #200	-> 859
/*     */     //   #494	-> 880
/*     */     //   #200	-> 904
/*     */     //   #201	-> 925
/*     */     //   #495	-> 946
/*     */     //   #201	-> 970
/*     */     //   #202	-> 991
/*     */     //   #496	-> 1011
/*     */     //   #203	-> 1053
/*     */     //   #205	-> 1157
/*     */     //   #207	-> 1160
/*     */     //   #210	-> 1166
/*     */     //   #207	-> 1171
/*     */     //   #208	-> 1219
/*     */     //   #497	-> 1223
/*     */     //   #498	-> 1235
/*     */     //   #499	-> 1251
/*     */     //   #208	-> 1256
/*     */     //   #499	-> 1266
/*     */     //   #500	-> 1268
/*     */     //   #501	-> 1277
/*     */     //   #502	-> 1282
/*     */     //   #498	-> 1284
/*     */     //   #497	-> 1285
/*     */     //   #497	-> 1286
/*     */     //   #208	-> 1287
/*     */     //   #214	-> 1301
/*     */     //   #215	-> 1303
/*     */     //   #216	-> 1305
/*     */     //   #209	-> 1307
/*     */     //   #210	-> 1308
/*     */     //   #211	-> 1313
/*     */     //   #212	-> 1314
/*     */     //   #213	-> 1316
/*     */     //   #217	-> 1318
/*     */     //   #218	-> 1320
/*     */     //   #219	-> 1322
/*     */     //   #206	-> 1418
/*     */     //   #221	-> 1433
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   745	3	24	$i$a$-cache-CheckboxKt$CheckboxRow$5	I
/*     */     //   750	11	24	value$iv	Ljava/lang/Object;
/*     */     //   731	36	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   728	39	22	it$iv	Ljava/lang/Object;
/*     */     //   719	50	21	$i$f$cache	I
/*     */     //   716	53	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   716	53	20	invalid$iv	Z
/*     */     //   808	27	20	$i$f$getCurrent	I
/*     */     //   805	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   805	30	19	$changed$iv	I
/*     */     //   874	27	20	$i$f$getCurrent	I
/*     */     //   871	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   871	30	19	$changed$iv	I
/*     */     //   940	27	20	$i$f$getCurrent	I
/*     */     //   937	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   937	30	19	$changed$iv	I
/*     */     //   1005	27	20	$i$f$getCurrent	I
/*     */     //   1002	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1002	30	19	$changed$iv	I
/*     */     //   1256	7	26	$i$a$-cache-CheckboxKt$CheckboxRow$6	I
/*     */     //   1268	11	27	value$iv	Ljava/lang/Object;
/*     */     //   1235	50	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1232	53	24	it$iv	Ljava/lang/Object;
/*     */     //   1223	64	23	$i$f$cache	I
/*     */     //   1220	67	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1220	67	22	invalid$iv	Z
/*     */     //   30	1462	16	$dirty	I
/*     */     //   34	1458	17	$dirty1	I
/*     */     //   0	1492	0	checked	Z
/*     */     //   0	1492	1	onCheckedChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1492	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1492	3	enabled	Z
/*     */     //   0	1492	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1492	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1492	6	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1492	7	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1492	8	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1492	9	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1492	10	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1492	11	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	1492	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1492	13	$changed	I
/*     */     //   0	1492	14	$changed1	I } private static final Unit CheckboxRow$lambda$18$lambda$17(Function1 $onCheckedChange, boolean $checked) { $onCheckedChange.invoke(Boolean.valueOf(!$checked)); return Unit.INSTANCE; } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void TriStateCheckboxRow(@NotNull ToggleableState state, @NotNull Function0 onClick, @Nullable Modifier modifier, boolean enabled, @Nullable Outline outline, @Nullable MutableInteractionSource interactionSource, @Nullable CheckboxColors colors, @Nullable CheckboxMetrics metrics, @Nullable CheckboxIcons icons, @Nullable TextStyle textStyle, @Nullable Alignment.Vertical verticalAlignment, @NotNull Function3 content, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'state'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onClick'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #11
/*     */     //   16: ldc_w 'content'
/*     */     //   19: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   22: aload #12
/*     */     //   24: ldc_w -485658293
/*     */     //   27: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   32: astore #12
/*     */     //   34: iload #13
/*     */     //   36: istore #16
/*     */     //   38: iload #14
/*     */     //   40: istore #17
/*     */     //   42: iload #15
/*     */     //   44: iconst_1
/*     */     //   45: iand
/*     */     //   46: ifeq -> 59
/*     */     //   49: iload #16
/*     */     //   51: bipush #6
/*     */     //   53: ior
/*     */     //   54: istore #16
/*     */     //   56: goto -> 88
/*     */     //   59: iload #13
/*     */     //   61: bipush #6
/*     */     //   63: iand
/*     */     //   64: ifne -> 88
/*     */     //   67: iload #16
/*     */     //   69: aload #12
/*     */     //   71: aload_0
/*     */     //   72: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   77: ifeq -> 84
/*     */     //   80: iconst_4
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_2
/*     */     //   85: ior
/*     */     //   86: istore #16
/*     */     //   88: iload #15
/*     */     //   90: iconst_2
/*     */     //   91: iand
/*     */     //   92: ifeq -> 105
/*     */     //   95: iload #16
/*     */     //   97: bipush #48
/*     */     //   99: ior
/*     */     //   100: istore #16
/*     */     //   102: goto -> 136
/*     */     //   105: iload #13
/*     */     //   107: bipush #48
/*     */     //   109: iand
/*     */     //   110: ifne -> 136
/*     */     //   113: iload #16
/*     */     //   115: aload #12
/*     */     //   117: aload_1
/*     */     //   118: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   123: ifeq -> 131
/*     */     //   126: bipush #32
/*     */     //   128: goto -> 133
/*     */     //   131: bipush #16
/*     */     //   133: ior
/*     */     //   134: istore #16
/*     */     //   136: iload #15
/*     */     //   138: iconst_4
/*     */     //   139: iand
/*     */     //   140: ifeq -> 154
/*     */     //   143: iload #16
/*     */     //   145: sipush #384
/*     */     //   148: ior
/*     */     //   149: istore #16
/*     */     //   151: goto -> 188
/*     */     //   154: iload #13
/*     */     //   156: sipush #384
/*     */     //   159: iand
/*     */     //   160: ifne -> 188
/*     */     //   163: iload #16
/*     */     //   165: aload #12
/*     */     //   167: aload_2
/*     */     //   168: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   173: ifeq -> 182
/*     */     //   176: sipush #256
/*     */     //   179: goto -> 185
/*     */     //   182: sipush #128
/*     */     //   185: ior
/*     */     //   186: istore #16
/*     */     //   188: iload #15
/*     */     //   190: bipush #8
/*     */     //   192: iand
/*     */     //   193: ifeq -> 207
/*     */     //   196: iload #16
/*     */     //   198: sipush #3072
/*     */     //   201: ior
/*     */     //   202: istore #16
/*     */     //   204: goto -> 241
/*     */     //   207: iload #13
/*     */     //   209: sipush #3072
/*     */     //   212: iand
/*     */     //   213: ifne -> 241
/*     */     //   216: iload #16
/*     */     //   218: aload #12
/*     */     //   220: iload_3
/*     */     //   221: invokeinterface changed : (Z)Z
/*     */     //   226: ifeq -> 235
/*     */     //   229: sipush #2048
/*     */     //   232: goto -> 238
/*     */     //   235: sipush #1024
/*     */     //   238: ior
/*     */     //   239: istore #16
/*     */     //   241: iload #15
/*     */     //   243: bipush #16
/*     */     //   245: iand
/*     */     //   246: ifeq -> 260
/*     */     //   249: iload #16
/*     */     //   251: sipush #24576
/*     */     //   254: ior
/*     */     //   255: istore #16
/*     */     //   257: goto -> 295
/*     */     //   260: iload #13
/*     */     //   262: sipush #24576
/*     */     //   265: iand
/*     */     //   266: ifne -> 295
/*     */     //   269: iload #16
/*     */     //   271: aload #12
/*     */     //   273: aload #4
/*     */     //   275: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   280: ifeq -> 289
/*     */     //   283: sipush #16384
/*     */     //   286: goto -> 292
/*     */     //   289: sipush #8192
/*     */     //   292: ior
/*     */     //   293: istore #16
/*     */     //   295: iload #15
/*     */     //   297: bipush #32
/*     */     //   299: iand
/*     */     //   300: ifeq -> 313
/*     */     //   303: iload #16
/*     */     //   305: ldc 196608
/*     */     //   307: ior
/*     */     //   308: istore #16
/*     */     //   310: goto -> 345
/*     */     //   313: iload #13
/*     */     //   315: ldc 196608
/*     */     //   317: iand
/*     */     //   318: ifne -> 345
/*     */     //   321: iload #16
/*     */     //   323: aload #12
/*     */     //   325: aload #5
/*     */     //   327: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   332: ifeq -> 340
/*     */     //   335: ldc 131072
/*     */     //   337: goto -> 342
/*     */     //   340: ldc 65536
/*     */     //   342: ior
/*     */     //   343: istore #16
/*     */     //   345: iload #13
/*     */     //   347: ldc 1572864
/*     */     //   349: iand
/*     */     //   350: ifne -> 385
/*     */     //   353: iload #16
/*     */     //   355: iload #15
/*     */     //   357: bipush #64
/*     */     //   359: iand
/*     */     //   360: ifne -> 380
/*     */     //   363: aload #12
/*     */     //   365: aload #6
/*     */     //   367: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   372: ifeq -> 380
/*     */     //   375: ldc 1048576
/*     */     //   377: goto -> 382
/*     */     //   380: ldc 524288
/*     */     //   382: ior
/*     */     //   383: istore #16
/*     */     //   385: iload #13
/*     */     //   387: ldc 12582912
/*     */     //   389: iand
/*     */     //   390: ifne -> 426
/*     */     //   393: iload #16
/*     */     //   395: iload #15
/*     */     //   397: sipush #128
/*     */     //   400: iand
/*     */     //   401: ifne -> 421
/*     */     //   404: aload #12
/*     */     //   406: aload #7
/*     */     //   408: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   413: ifeq -> 421
/*     */     //   416: ldc 8388608
/*     */     //   418: goto -> 423
/*     */     //   421: ldc 4194304
/*     */     //   423: ior
/*     */     //   424: istore #16
/*     */     //   426: iload #13
/*     */     //   428: ldc 100663296
/*     */     //   430: iand
/*     */     //   431: ifne -> 467
/*     */     //   434: iload #16
/*     */     //   436: iload #15
/*     */     //   438: sipush #256
/*     */     //   441: iand
/*     */     //   442: ifne -> 462
/*     */     //   445: aload #12
/*     */     //   447: aload #8
/*     */     //   449: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   454: ifeq -> 462
/*     */     //   457: ldc 67108864
/*     */     //   459: goto -> 464
/*     */     //   462: ldc 33554432
/*     */     //   464: ior
/*     */     //   465: istore #16
/*     */     //   467: iload #13
/*     */     //   469: ldc 805306368
/*     */     //   471: iand
/*     */     //   472: ifne -> 508
/*     */     //   475: iload #16
/*     */     //   477: iload #15
/*     */     //   479: sipush #512
/*     */     //   482: iand
/*     */     //   483: ifne -> 503
/*     */     //   486: aload #12
/*     */     //   488: aload #9
/*     */     //   490: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   495: ifeq -> 503
/*     */     //   498: ldc 536870912
/*     */     //   500: goto -> 505
/*     */     //   503: ldc 268435456
/*     */     //   505: ior
/*     */     //   506: istore #16
/*     */     //   508: iload #15
/*     */     //   510: sipush #1024
/*     */     //   513: iand
/*     */     //   514: ifeq -> 527
/*     */     //   517: iload #17
/*     */     //   519: bipush #6
/*     */     //   521: ior
/*     */     //   522: istore #17
/*     */     //   524: goto -> 557
/*     */     //   527: iload #14
/*     */     //   529: bipush #6
/*     */     //   531: iand
/*     */     //   532: ifne -> 557
/*     */     //   535: iload #17
/*     */     //   537: aload #12
/*     */     //   539: aload #10
/*     */     //   541: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   546: ifeq -> 553
/*     */     //   549: iconst_4
/*     */     //   550: goto -> 554
/*     */     //   553: iconst_2
/*     */     //   554: ior
/*     */     //   555: istore #17
/*     */     //   557: iload #15
/*     */     //   559: sipush #2048
/*     */     //   562: iand
/*     */     //   563: ifeq -> 576
/*     */     //   566: iload #17
/*     */     //   568: bipush #48
/*     */     //   570: ior
/*     */     //   571: istore #17
/*     */     //   573: goto -> 608
/*     */     //   576: iload #14
/*     */     //   578: bipush #48
/*     */     //   580: iand
/*     */     //   581: ifne -> 608
/*     */     //   584: iload #17
/*     */     //   586: aload #12
/*     */     //   588: aload #11
/*     */     //   590: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   595: ifeq -> 603
/*     */     //   598: bipush #32
/*     */     //   600: goto -> 605
/*     */     //   603: bipush #16
/*     */     //   605: ior
/*     */     //   606: istore #17
/*     */     //   608: iload #16
/*     */     //   610: ldc 306783379
/*     */     //   612: iand
/*     */     //   613: ldc 306783378
/*     */     //   615: if_icmpne -> 638
/*     */     //   618: iload #17
/*     */     //   620: bipush #19
/*     */     //   622: iand
/*     */     //   623: bipush #18
/*     */     //   625: if_icmpne -> 638
/*     */     //   628: aload #12
/*     */     //   630: invokeinterface getSkipping : ()Z
/*     */     //   635: ifne -> 1319
/*     */     //   638: aload #12
/*     */     //   640: invokeinterface startDefaults : ()V
/*     */     //   645: iload #13
/*     */     //   647: iconst_1
/*     */     //   648: iand
/*     */     //   649: ifeq -> 662
/*     */     //   652: aload #12
/*     */     //   654: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   659: ifeq -> 1072
/*     */     //   662: iload #15
/*     */     //   664: iconst_4
/*     */     //   665: iand
/*     */     //   666: ifeq -> 676
/*     */     //   669: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   672: checkcast androidx/compose/ui/Modifier
/*     */     //   675: astore_2
/*     */     //   676: iload #15
/*     */     //   678: bipush #8
/*     */     //   680: iand
/*     */     //   681: ifeq -> 686
/*     */     //   684: iconst_1
/*     */     //   685: istore_3
/*     */     //   686: iload #15
/*     */     //   688: bipush #16
/*     */     //   690: iand
/*     */     //   691: ifeq -> 699
/*     */     //   694: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   697: astore #4
/*     */     //   699: iload #15
/*     */     //   701: bipush #32
/*     */     //   703: iand
/*     */     //   704: ifeq -> 793
/*     */     //   707: aload #12
/*     */     //   709: ldc_w -1519583206
/*     */     //   712: invokeinterface startReplaceGroup : (I)V
/*     */     //   717: aload #12
/*     */     //   719: astore #19
/*     */     //   721: iconst_0
/*     */     //   722: istore #20
/*     */     //   724: iconst_0
/*     */     //   725: istore #21
/*     */     //   727: aload #19
/*     */     //   729: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   734: astore #22
/*     */     //   736: iconst_0
/*     */     //   737: istore #23
/*     */     //   739: aload #22
/*     */     //   741: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   744: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   747: if_acmpne -> 772
/*     */     //   750: iconst_0
/*     */     //   751: istore #24
/*     */     //   753: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   756: astore #24
/*     */     //   758: aload #19
/*     */     //   760: aload #24
/*     */     //   762: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   767: aload #24
/*     */     //   769: goto -> 774
/*     */     //   772: aload #22
/*     */     //   774: nop
/*     */     //   775: nop
/*     */     //   776: nop
/*     */     //   777: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   780: astore #18
/*     */     //   782: aload #12
/*     */     //   784: invokeinterface endReplaceGroup : ()V
/*     */     //   789: aload #18
/*     */     //   791: astore #5
/*     */     //   793: iload #15
/*     */     //   795: bipush #64
/*     */     //   797: iand
/*     */     //   798: ifeq -> 858
/*     */     //   801: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   804: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   807: astore #18
/*     */     //   809: bipush #6
/*     */     //   811: istore #19
/*     */     //   813: iconst_0
/*     */     //   814: istore #20
/*     */     //   816: aload #12
/*     */     //   818: ldc 2023513938
/*     */     //   820: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   822: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   825: aload #12
/*     */     //   827: aload #18
/*     */     //   829: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   834: astore #21
/*     */     //   836: aload #12
/*     */     //   838: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   841: aload #21
/*     */     //   843: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   846: invokevirtual getColors : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   849: astore #6
/*     */     //   851: iload #16
/*     */     //   853: ldc -3670017
/*     */     //   855: iand
/*     */     //   856: istore #16
/*     */     //   858: iload #15
/*     */     //   860: sipush #128
/*     */     //   863: iand
/*     */     //   864: ifeq -> 924
/*     */     //   867: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   870: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   873: astore #18
/*     */     //   875: bipush #6
/*     */     //   877: istore #19
/*     */     //   879: iconst_0
/*     */     //   880: istore #20
/*     */     //   882: aload #12
/*     */     //   884: ldc 2023513938
/*     */     //   886: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   888: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   891: aload #12
/*     */     //   893: aload #18
/*     */     //   895: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   900: astore #21
/*     */     //   902: aload #12
/*     */     //   904: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   907: aload #21
/*     */     //   909: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   912: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   915: astore #7
/*     */     //   917: iload #16
/*     */     //   919: ldc -29360129
/*     */     //   921: iand
/*     */     //   922: istore #16
/*     */     //   924: iload #15
/*     */     //   926: sipush #256
/*     */     //   929: iand
/*     */     //   930: ifeq -> 990
/*     */     //   933: invokestatic getLocalCheckboxStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   936: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   939: astore #18
/*     */     //   941: bipush #6
/*     */     //   943: istore #19
/*     */     //   945: iconst_0
/*     */     //   946: istore #20
/*     */     //   948: aload #12
/*     */     //   950: ldc 2023513938
/*     */     //   952: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   954: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   957: aload #12
/*     */     //   959: aload #18
/*     */     //   961: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   966: astore #21
/*     */     //   968: aload #12
/*     */     //   970: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   973: aload #21
/*     */     //   975: checkcast org/jetbrains/jewel/ui/component/styling/CheckboxStyle
/*     */     //   978: invokevirtual getIcons : ()Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   981: astore #8
/*     */     //   983: iload #16
/*     */     //   985: ldc -234881025
/*     */     //   987: iand
/*     */     //   988: istore #16
/*     */     //   990: iload #15
/*     */     //   992: sipush #512
/*     */     //   995: iand
/*     */     //   996: ifeq -> 1052
/*     */     //   999: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1002: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   1005: astore #18
/*     */     //   1007: iconst_0
/*     */     //   1008: istore #19
/*     */     //   1010: iconst_0
/*     */     //   1011: istore #20
/*     */     //   1013: aload #12
/*     */     //   1015: ldc 2023513938
/*     */     //   1017: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   1019: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1022: aload #12
/*     */     //   1024: aload #18
/*     */     //   1026: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   1031: astore #21
/*     */     //   1033: aload #12
/*     */     //   1035: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1038: aload #21
/*     */     //   1040: checkcast androidx/compose/ui/text/TextStyle
/*     */     //   1043: astore #9
/*     */     //   1045: iload #16
/*     */     //   1047: ldc -1879048193
/*     */     //   1049: iand
/*     */     //   1050: istore #16
/*     */     //   1052: iload #15
/*     */     //   1054: sipush #1024
/*     */     //   1057: iand
/*     */     //   1058: ifeq -> 1142
/*     */     //   1061: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1064: invokevirtual getCenterVertically : ()Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   1067: astore #10
/*     */     //   1069: goto -> 1142
/*     */     //   1072: aload #12
/*     */     //   1074: invokeinterface skipToGroupEnd : ()V
/*     */     //   1079: iload #15
/*     */     //   1081: bipush #64
/*     */     //   1083: iand
/*     */     //   1084: ifeq -> 1094
/*     */     //   1087: iload #16
/*     */     //   1089: ldc -3670017
/*     */     //   1091: iand
/*     */     //   1092: istore #16
/*     */     //   1094: iload #15
/*     */     //   1096: sipush #128
/*     */     //   1099: iand
/*     */     //   1100: ifeq -> 1110
/*     */     //   1103: iload #16
/*     */     //   1105: ldc -29360129
/*     */     //   1107: iand
/*     */     //   1108: istore #16
/*     */     //   1110: iload #15
/*     */     //   1112: sipush #256
/*     */     //   1115: iand
/*     */     //   1116: ifeq -> 1126
/*     */     //   1119: iload #16
/*     */     //   1121: ldc -234881025
/*     */     //   1123: iand
/*     */     //   1124: istore #16
/*     */     //   1126: iload #15
/*     */     //   1128: sipush #512
/*     */     //   1131: iand
/*     */     //   1132: ifeq -> 1142
/*     */     //   1135: iload #16
/*     */     //   1137: ldc -1879048193
/*     */     //   1139: iand
/*     */     //   1140: istore #16
/*     */     //   1142: aload #12
/*     */     //   1144: invokeinterface endDefaults : ()V
/*     */     //   1149: invokestatic isTraceInProgress : ()Z
/*     */     //   1152: ifeq -> 1168
/*     */     //   1155: ldc_w -485658293
/*     */     //   1158: iload #16
/*     */     //   1160: iload #17
/*     */     //   1162: ldc_w 'org.jetbrains.jewel.ui.component.TriStateCheckboxRow (Checkbox.kt:236)'
/*     */     //   1165: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1168: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1171: astore #18
/*     */     //   1173: aload_0
/*     */     //   1174: aload_1
/*     */     //   1175: aload #6
/*     */     //   1177: aload #7
/*     */     //   1179: aload #8
/*     */     //   1181: aload_2
/*     */     //   1182: aload #18
/*     */     //   1184: checkcast androidx/compose/ui/Modifier
/*     */     //   1187: iload_3
/*     */     //   1188: aload #4
/*     */     //   1190: aload #5
/*     */     //   1192: aload #9
/*     */     //   1194: aload #10
/*     */     //   1196: aload #11
/*     */     //   1198: aload #12
/*     */     //   1200: ldc 1572864
/*     */     //   1202: bipush #14
/*     */     //   1204: iload #16
/*     */     //   1206: iand
/*     */     //   1207: ior
/*     */     //   1208: bipush #112
/*     */     //   1210: iload #16
/*     */     //   1212: iand
/*     */     //   1213: ior
/*     */     //   1214: sipush #896
/*     */     //   1217: iload #16
/*     */     //   1219: bipush #12
/*     */     //   1221: ishr
/*     */     //   1222: iand
/*     */     //   1223: ior
/*     */     //   1224: sipush #7168
/*     */     //   1227: iload #16
/*     */     //   1229: bipush #12
/*     */     //   1231: ishr
/*     */     //   1232: iand
/*     */     //   1233: ior
/*     */     //   1234: ldc 57344
/*     */     //   1236: iload #16
/*     */     //   1238: bipush #12
/*     */     //   1240: ishr
/*     */     //   1241: iand
/*     */     //   1242: ior
/*     */     //   1243: ldc 458752
/*     */     //   1245: iload #16
/*     */     //   1247: bipush #9
/*     */     //   1249: ishl
/*     */     //   1250: iand
/*     */     //   1251: ior
/*     */     //   1252: ldc 29360128
/*     */     //   1254: iload #16
/*     */     //   1256: bipush #12
/*     */     //   1258: ishl
/*     */     //   1259: iand
/*     */     //   1260: ior
/*     */     //   1261: ldc 234881024
/*     */     //   1263: iload #16
/*     */     //   1265: bipush #12
/*     */     //   1267: ishl
/*     */     //   1268: iand
/*     */     //   1269: ior
/*     */     //   1270: ldc 1879048192
/*     */     //   1272: iload #16
/*     */     //   1274: bipush #12
/*     */     //   1276: ishl
/*     */     //   1277: iand
/*     */     //   1278: ior
/*     */     //   1279: bipush #14
/*     */     //   1281: iload #16
/*     */     //   1283: bipush #27
/*     */     //   1285: ishr
/*     */     //   1286: iand
/*     */     //   1287: bipush #112
/*     */     //   1289: iload #17
/*     */     //   1291: iconst_3
/*     */     //   1292: ishl
/*     */     //   1293: iand
/*     */     //   1294: ior
/*     */     //   1295: sipush #896
/*     */     //   1298: iload #17
/*     */     //   1300: iconst_3
/*     */     //   1301: ishl
/*     */     //   1302: iand
/*     */     //   1303: ior
/*     */     //   1304: invokestatic CheckboxImpl : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1307: invokestatic isTraceInProgress : ()Z
/*     */     //   1310: ifeq -> 1326
/*     */     //   1313: invokestatic traceEventEnd : ()V
/*     */     //   1316: goto -> 1326
/*     */     //   1319: aload #12
/*     */     //   1321: invokeinterface skipToGroupEnd : ()V
/*     */     //   1326: aload #12
/*     */     //   1328: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1333: dup
/*     */     //   1334: ifnull -> 1376
/*     */     //   1337: aload_0
/*     */     //   1338: aload_1
/*     */     //   1339: aload_2
/*     */     //   1340: iload_3
/*     */     //   1341: aload #4
/*     */     //   1343: aload #5
/*     */     //   1345: aload #6
/*     */     //   1347: aload #7
/*     */     //   1349: aload #8
/*     */     //   1351: aload #9
/*     */     //   1353: aload #10
/*     */     //   1355: aload #11
/*     */     //   1357: iload #13
/*     */     //   1359: iload #14
/*     */     //   1361: iload #15
/*     */     //   1363: <illegal opcode> invoke : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1368: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1373: goto -> 1377
/*     */     //   1376: pop
/*     */     //   1377: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #237	-> 22
/*     */     //   #227	-> 669
/*     */     //   #228	-> 684
/*     */     //   #229	-> 694
/*     */     //   #230	-> 707
/*     */     //   #503	-> 727
/*     */     //   #504	-> 739
/*     */     //   #505	-> 750
/*     */     //   #230	-> 753
/*     */     //   #505	-> 756
/*     */     //   #506	-> 758
/*     */     //   #507	-> 767
/*     */     //   #508	-> 772
/*     */     //   #504	-> 774
/*     */     //   #503	-> 775
/*     */     //   #503	-> 776
/*     */     //   #230	-> 777
/*     */     //   #231	-> 801
/*     */     //   #509	-> 822
/*     */     //   #231	-> 846
/*     */     //   #232	-> 867
/*     */     //   #510	-> 888
/*     */     //   #232	-> 912
/*     */     //   #233	-> 933
/*     */     //   #511	-> 954
/*     */     //   #233	-> 978
/*     */     //   #234	-> 999
/*     */     //   #512	-> 1019
/*     */     //   #235	-> 1061
/*     */     //   #237	-> 1165
/*     */     //   #242	-> 1168
/*     */     //   #239	-> 1173
/*     */     //   #240	-> 1174
/*     */     //   #246	-> 1175
/*     */     //   #247	-> 1177
/*     */     //   #248	-> 1179
/*     */     //   #241	-> 1181
/*     */     //   #242	-> 1182
/*     */     //   #243	-> 1187
/*     */     //   #244	-> 1188
/*     */     //   #245	-> 1190
/*     */     //   #249	-> 1192
/*     */     //   #250	-> 1194
/*     */     //   #251	-> 1196
/*     */     //   #238	-> 1304
/*     */     //   #253	-> 1319
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   753	3	24	$i$a$-cache-CheckboxKt$TriStateCheckboxRow$4	I
/*     */     //   758	11	24	value$iv	Ljava/lang/Object;
/*     */     //   739	36	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   736	39	22	it$iv	Ljava/lang/Object;
/*     */     //   727	50	21	$i$f$cache	I
/*     */     //   724	53	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   724	53	20	invalid$iv	Z
/*     */     //   816	27	20	$i$f$getCurrent	I
/*     */     //   813	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   813	30	19	$changed$iv	I
/*     */     //   882	27	20	$i$f$getCurrent	I
/*     */     //   879	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   879	30	19	$changed$iv	I
/*     */     //   948	27	20	$i$f$getCurrent	I
/*     */     //   945	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   945	30	19	$changed$iv	I
/*     */     //   1013	27	20	$i$f$getCurrent	I
/*     */     //   1010	30	18	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   1010	30	19	$changed$iv	I
/*     */     //   38	1340	16	$dirty	I
/*     */     //   42	1336	17	$dirty1	I
/*     */     //   0	1378	0	state	Landroidx/compose/ui/state/ToggleableState;
/*     */     //   0	1378	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1378	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1378	3	enabled	Z
/*     */     //   0	1378	4	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1378	5	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1378	6	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	1378	7	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	1378	8	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	1378	9	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1378	10	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	1378	11	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	1378	12	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1378	13	$changed	I
/*     */     //   0	1378	14	$changed1	I } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") private static final void CheckboxImpl(ToggleableState state, Function0 onClick, CheckboxColors colors, CheckboxMetrics metrics, CheckboxIcons icons, Modifier modifier, Modifier contentModifier, boolean enabled, Outline outline, MutableInteractionSource interactionSource, TextStyle textStyle, Alignment.Vertical verticalAlignment, Function3 content, Composer $composer, int $changed, int $changed1) { // Byte code:
/*     */     //   0: aload #13
/*     */     //   2: ldc_w -66701872
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #13
/*     */     //   12: iload #14
/*     */     //   14: istore #16
/*     */     //   16: iload #15
/*     */     //   18: istore #17
/*     */     //   20: iload #14
/*     */     //   22: bipush #6
/*     */     //   24: iand
/*     */     //   25: ifne -> 49
/*     */     //   28: iload #16
/*     */     //   30: aload #13
/*     */     //   32: aload_0
/*     */     //   33: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   38: ifeq -> 45
/*     */     //   41: iconst_4
/*     */     //   42: goto -> 46
/*     */     //   45: iconst_2
/*     */     //   46: ior
/*     */     //   47: istore #16
/*     */     //   49: iload #14
/*     */     //   51: bipush #48
/*     */     //   53: iand
/*     */     //   54: ifne -> 80
/*     */     //   57: iload #16
/*     */     //   59: aload #13
/*     */     //   61: aload_1
/*     */     //   62: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   67: ifeq -> 75
/*     */     //   70: bipush #32
/*     */     //   72: goto -> 77
/*     */     //   75: bipush #16
/*     */     //   77: ior
/*     */     //   78: istore #16
/*     */     //   80: iload #14
/*     */     //   82: sipush #384
/*     */     //   85: iand
/*     */     //   86: ifne -> 114
/*     */     //   89: iload #16
/*     */     //   91: aload #13
/*     */     //   93: aload_2
/*     */     //   94: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   99: ifeq -> 108
/*     */     //   102: sipush #256
/*     */     //   105: goto -> 111
/*     */     //   108: sipush #128
/*     */     //   111: ior
/*     */     //   112: istore #16
/*     */     //   114: iload #14
/*     */     //   116: sipush #3072
/*     */     //   119: iand
/*     */     //   120: ifne -> 148
/*     */     //   123: iload #16
/*     */     //   125: aload #13
/*     */     //   127: aload_3
/*     */     //   128: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   133: ifeq -> 142
/*     */     //   136: sipush #2048
/*     */     //   139: goto -> 145
/*     */     //   142: sipush #1024
/*     */     //   145: ior
/*     */     //   146: istore #16
/*     */     //   148: iload #14
/*     */     //   150: sipush #24576
/*     */     //   153: iand
/*     */     //   154: ifne -> 183
/*     */     //   157: iload #16
/*     */     //   159: aload #13
/*     */     //   161: aload #4
/*     */     //   163: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   168: ifeq -> 177
/*     */     //   171: sipush #16384
/*     */     //   174: goto -> 180
/*     */     //   177: sipush #8192
/*     */     //   180: ior
/*     */     //   181: istore #16
/*     */     //   183: iload #14
/*     */     //   185: ldc 196608
/*     */     //   187: iand
/*     */     //   188: ifne -> 215
/*     */     //   191: iload #16
/*     */     //   193: aload #13
/*     */     //   195: aload #5
/*     */     //   197: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   202: ifeq -> 210
/*     */     //   205: ldc 131072
/*     */     //   207: goto -> 212
/*     */     //   210: ldc 65536
/*     */     //   212: ior
/*     */     //   213: istore #16
/*     */     //   215: iload #14
/*     */     //   217: ldc 1572864
/*     */     //   219: iand
/*     */     //   220: ifne -> 247
/*     */     //   223: iload #16
/*     */     //   225: aload #13
/*     */     //   227: aload #6
/*     */     //   229: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   234: ifeq -> 242
/*     */     //   237: ldc 1048576
/*     */     //   239: goto -> 244
/*     */     //   242: ldc 524288
/*     */     //   244: ior
/*     */     //   245: istore #16
/*     */     //   247: iload #14
/*     */     //   249: ldc 12582912
/*     */     //   251: iand
/*     */     //   252: ifne -> 279
/*     */     //   255: iload #16
/*     */     //   257: aload #13
/*     */     //   259: iload #7
/*     */     //   261: invokeinterface changed : (Z)Z
/*     */     //   266: ifeq -> 274
/*     */     //   269: ldc 8388608
/*     */     //   271: goto -> 276
/*     */     //   274: ldc 4194304
/*     */     //   276: ior
/*     */     //   277: istore #16
/*     */     //   279: iload #14
/*     */     //   281: ldc 100663296
/*     */     //   283: iand
/*     */     //   284: ifne -> 311
/*     */     //   287: iload #16
/*     */     //   289: aload #13
/*     */     //   291: aload #8
/*     */     //   293: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   298: ifeq -> 306
/*     */     //   301: ldc 67108864
/*     */     //   303: goto -> 308
/*     */     //   306: ldc 33554432
/*     */     //   308: ior
/*     */     //   309: istore #16
/*     */     //   311: iload #14
/*     */     //   313: ldc 805306368
/*     */     //   315: iand
/*     */     //   316: ifne -> 343
/*     */     //   319: iload #16
/*     */     //   321: aload #13
/*     */     //   323: aload #9
/*     */     //   325: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   330: ifeq -> 338
/*     */     //   333: ldc 536870912
/*     */     //   335: goto -> 340
/*     */     //   338: ldc 268435456
/*     */     //   340: ior
/*     */     //   341: istore #16
/*     */     //   343: iload #15
/*     */     //   345: bipush #6
/*     */     //   347: iand
/*     */     //   348: ifne -> 373
/*     */     //   351: iload #17
/*     */     //   353: aload #13
/*     */     //   355: aload #10
/*     */     //   357: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   362: ifeq -> 369
/*     */     //   365: iconst_4
/*     */     //   366: goto -> 370
/*     */     //   369: iconst_2
/*     */     //   370: ior
/*     */     //   371: istore #17
/*     */     //   373: iload #15
/*     */     //   375: bipush #48
/*     */     //   377: iand
/*     */     //   378: ifne -> 405
/*     */     //   381: iload #17
/*     */     //   383: aload #13
/*     */     //   385: aload #11
/*     */     //   387: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   392: ifeq -> 400
/*     */     //   395: bipush #32
/*     */     //   397: goto -> 402
/*     */     //   400: bipush #16
/*     */     //   402: ior
/*     */     //   403: istore #17
/*     */     //   405: iload #15
/*     */     //   407: sipush #384
/*     */     //   410: iand
/*     */     //   411: ifne -> 440
/*     */     //   414: iload #17
/*     */     //   416: aload #13
/*     */     //   418: aload #12
/*     */     //   420: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   425: ifeq -> 434
/*     */     //   428: sipush #256
/*     */     //   431: goto -> 437
/*     */     //   434: sipush #128
/*     */     //   437: ior
/*     */     //   438: istore #17
/*     */     //   440: iload #16
/*     */     //   442: ldc 306783379
/*     */     //   444: iand
/*     */     //   445: ldc 306783378
/*     */     //   447: if_icmpne -> 472
/*     */     //   450: iload #17
/*     */     //   452: sipush #147
/*     */     //   455: iand
/*     */     //   456: sipush #146
/*     */     //   459: if_icmpne -> 472
/*     */     //   462: aload #13
/*     */     //   464: invokeinterface getSkipping : ()Z
/*     */     //   469: ifne -> 2961
/*     */     //   472: invokestatic isTraceInProgress : ()Z
/*     */     //   475: ifeq -> 491
/*     */     //   478: ldc_w -66701872
/*     */     //   481: iload #16
/*     */     //   483: iload #17
/*     */     //   485: ldc_w 'org.jetbrains.jewel.ui.component.CheckboxImpl (Checkbox.kt:269)'
/*     */     //   488: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   491: aload #13
/*     */     //   493: ldc_w 512038746
/*     */     //   496: invokeinterface startReplaceGroup : (I)V
/*     */     //   501: aload #13
/*     */     //   503: astore #20
/*     */     //   505: iconst_0
/*     */     //   506: istore #21
/*     */     //   508: nop
/*     */     //   509: iconst_0
/*     */     //   510: istore #22
/*     */     //   512: aload #20
/*     */     //   514: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   519: astore #23
/*     */     //   521: iconst_0
/*     */     //   522: istore #24
/*     */     //   524: aload #23
/*     */     //   526: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   529: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   532: if_acmpne -> 579
/*     */     //   535: iconst_0
/*     */     //   536: istore #25
/*     */     //   538: getstatic org/jetbrains/jewel/ui/component/CheckboxState.Companion : Lorg/jetbrains/jewel/ui/component/CheckboxState$Companion;
/*     */     //   541: aload_0
/*     */     //   542: iload #7
/*     */     //   544: iconst_0
/*     */     //   545: iconst_0
/*     */     //   546: iconst_0
/*     */     //   547: iconst_0
/*     */     //   548: bipush #60
/*     */     //   550: aconst_null
/*     */     //   551: invokestatic of-oOgqrko$default : (Lorg/jetbrains/jewel/ui/component/CheckboxState$Companion;Landroidx/compose/ui/state/ToggleableState;ZZZZZILjava/lang/Object;)J
/*     */     //   554: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/CheckboxState;
/*     */     //   557: aconst_null
/*     */     //   558: iconst_2
/*     */     //   559: aconst_null
/*     */     //   560: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   563: astore #26
/*     */     //   565: aload #20
/*     */     //   567: aload #26
/*     */     //   569: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   574: aload #26
/*     */     //   576: goto -> 581
/*     */     //   579: aload #23
/*     */     //   581: nop
/*     */     //   582: nop
/*     */     //   583: nop
/*     */     //   584: checkcast androidx/compose/runtime/MutableState
/*     */     //   587: astore #19
/*     */     //   589: aload #13
/*     */     //   591: invokeinterface endReplaceGroup : ()V
/*     */     //   596: aload #19
/*     */     //   598: astore #18
/*     */     //   600: aload #13
/*     */     //   602: ldc_w 512041804
/*     */     //   605: invokeinterface startReplaceGroup : (I)V
/*     */     //   610: aload #13
/*     */     //   612: astore #19
/*     */     //   614: iload #16
/*     */     //   616: bipush #14
/*     */     //   618: iand
/*     */     //   619: iconst_4
/*     */     //   620: if_icmpne -> 627
/*     */     //   623: iconst_1
/*     */     //   624: goto -> 628
/*     */     //   627: iconst_0
/*     */     //   628: iload #16
/*     */     //   630: ldc 29360128
/*     */     //   632: iand
/*     */     //   633: ldc 8388608
/*     */     //   635: if_icmpne -> 642
/*     */     //   638: iconst_1
/*     */     //   639: goto -> 643
/*     */     //   642: iconst_0
/*     */     //   643: ior
/*     */     //   644: istore #20
/*     */     //   646: nop
/*     */     //   647: iconst_0
/*     */     //   648: istore #21
/*     */     //   650: aload #19
/*     */     //   652: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   657: astore #22
/*     */     //   659: iconst_0
/*     */     //   660: istore #23
/*     */     //   662: iload #20
/*     */     //   664: ifne -> 678
/*     */     //   667: aload #22
/*     */     //   669: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   672: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   675: if_acmpne -> 723
/*     */     //   678: iconst_0
/*     */     //   679: istore #24
/*     */     //   681: aload #18
/*     */     //   683: aload #18
/*     */     //   685: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   688: aload_0
/*     */     //   689: iload #7
/*     */     //   691: iconst_0
/*     */     //   692: iconst_0
/*     */     //   693: iconst_0
/*     */     //   694: iconst_0
/*     */     //   695: bipush #60
/*     */     //   697: aconst_null
/*     */     //   698: invokestatic copy-oOgqrko$default : (JLandroidx/compose/ui/state/ToggleableState;ZZZZZILjava/lang/Object;)J
/*     */     //   701: invokestatic CheckboxImpl$lambda$24 : (Landroidx/compose/runtime/MutableState;J)V
/*     */     //   704: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   707: astore #25
/*     */     //   709: aload #19
/*     */     //   711: aload #25
/*     */     //   713: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   718: aload #25
/*     */     //   720: goto -> 725
/*     */     //   723: aload #22
/*     */     //   725: nop
/*     */     //   726: nop
/*     */     //   727: nop
/*     */     //   728: pop
/*     */     //   729: aload #13
/*     */     //   731: invokeinterface endReplaceGroup : ()V
/*     */     //   736: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   739: aload #13
/*     */     //   741: bipush #6
/*     */     //   743: invokevirtual isSwingCompatMode : (Landroidx/compose/runtime/Composer;I)Z
/*     */     //   746: istore #19
/*     */     //   748: aload #9
/*     */     //   750: iload #19
/*     */     //   752: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   755: aload #13
/*     */     //   757: ldc_w 512049484
/*     */     //   760: invokeinterface startReplaceGroup : (I)V
/*     */     //   765: aload #13
/*     */     //   767: astore #21
/*     */     //   769: iload #16
/*     */     //   771: ldc 1879048192
/*     */     //   773: iand
/*     */     //   774: ldc 536870912
/*     */     //   776: if_icmpne -> 783
/*     */     //   779: iconst_1
/*     */     //   780: goto -> 784
/*     */     //   783: iconst_0
/*     */     //   784: aload #13
/*     */     //   786: iload #19
/*     */     //   788: invokeinterface changed : (Z)Z
/*     */     //   793: ior
/*     */     //   794: istore #22
/*     */     //   796: iconst_0
/*     */     //   797: istore #23
/*     */     //   799: aload #21
/*     */     //   801: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   806: astore #24
/*     */     //   808: iconst_0
/*     */     //   809: istore #25
/*     */     //   811: iload #22
/*     */     //   813: ifne -> 827
/*     */     //   816: aload #24
/*     */     //   818: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   821: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   824: if_acmpne -> 875
/*     */     //   827: astore #92
/*     */     //   829: astore #91
/*     */     //   831: iconst_0
/*     */     //   832: istore #26
/*     */     //   834: new org/jetbrains/jewel/ui/component/CheckboxKt$CheckboxImpl$2$1
/*     */     //   837: dup
/*     */     //   838: aload #9
/*     */     //   840: iload #19
/*     */     //   842: aload #18
/*     */     //   844: aconst_null
/*     */     //   845: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   848: checkcast kotlin/jvm/functions/Function2
/*     */     //   851: astore #93
/*     */     //   853: aload #91
/*     */     //   855: aload #92
/*     */     //   857: aload #93
/*     */     //   859: astore #27
/*     */     //   861: aload #21
/*     */     //   863: aload #27
/*     */     //   865: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   870: aload #27
/*     */     //   872: goto -> 877
/*     */     //   875: aload #24
/*     */     //   877: nop
/*     */     //   878: nop
/*     */     //   879: nop
/*     */     //   880: checkcast kotlin/jvm/functions/Function2
/*     */     //   883: astore #20
/*     */     //   885: aload #13
/*     */     //   887: invokeinterface endReplaceGroup : ()V
/*     */     //   892: aload #20
/*     */     //   894: aload #13
/*     */     //   896: bipush #14
/*     */     //   898: iload #16
/*     */     //   900: bipush #27
/*     */     //   902: ishr
/*     */     //   903: iand
/*     */     //   904: invokestatic LaunchedEffect : (Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   907: getstatic androidx/compose/ui/semantics/Role.Companion : Landroidx/compose/ui/semantics/Role$Companion;
/*     */     //   910: invokevirtual getCheckbox-o7Vup1c : ()I
/*     */     //   913: istore #21
/*     */     //   915: aload #5
/*     */     //   917: aload_0
/*     */     //   918: aload #9
/*     */     //   920: aconst_null
/*     */     //   921: iload #7
/*     */     //   923: iload #21
/*     */     //   925: invokestatic box-impl : (I)Landroidx/compose/ui/semantics/Role;
/*     */     //   928: aload #13
/*     */     //   930: ldc_w 512077344
/*     */     //   933: invokeinterface startReplaceGroup : (I)V
/*     */     //   938: aload #13
/*     */     //   940: astore #23
/*     */     //   942: iload #16
/*     */     //   944: bipush #112
/*     */     //   946: iand
/*     */     //   947: bipush #32
/*     */     //   949: if_icmpne -> 956
/*     */     //   952: iconst_1
/*     */     //   953: goto -> 957
/*     */     //   956: iconst_0
/*     */     //   957: iload #16
/*     */     //   959: bipush #14
/*     */     //   961: iand
/*     */     //   962: iconst_4
/*     */     //   963: if_icmpne -> 970
/*     */     //   966: iconst_1
/*     */     //   967: goto -> 971
/*     */     //   970: iconst_0
/*     */     //   971: ior
/*     */     //   972: istore #24
/*     */     //   974: nop
/*     */     //   975: iconst_0
/*     */     //   976: istore #25
/*     */     //   978: aload #23
/*     */     //   980: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   985: astore #26
/*     */     //   987: iconst_0
/*     */     //   988: istore #27
/*     */     //   990: iload #24
/*     */     //   992: ifne -> 1006
/*     */     //   995: aload #26
/*     */     //   997: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1000: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1003: if_acmpne -> 1060
/*     */     //   1006: astore #96
/*     */     //   1008: istore #95
/*     */     //   1010: astore #94
/*     */     //   1012: astore #93
/*     */     //   1014: astore #92
/*     */     //   1016: astore #91
/*     */     //   1018: iconst_0
/*     */     //   1019: istore #28
/*     */     //   1021: aload_1
/*     */     //   1022: aload_0
/*     */     //   1023: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/state/ToggleableState;)Lkotlin/jvm/functions/Function0;
/*     */     //   1028: astore #97
/*     */     //   1030: aload #91
/*     */     //   1032: aload #92
/*     */     //   1034: aload #93
/*     */     //   1036: aload #94
/*     */     //   1038: iload #95
/*     */     //   1040: aload #96
/*     */     //   1042: aload #97
/*     */     //   1044: astore #29
/*     */     //   1046: aload #23
/*     */     //   1048: aload #29
/*     */     //   1050: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1055: aload #29
/*     */     //   1057: goto -> 1062
/*     */     //   1060: aload #26
/*     */     //   1062: nop
/*     */     //   1063: nop
/*     */     //   1064: nop
/*     */     //   1065: checkcast kotlin/jvm/functions/Function0
/*     */     //   1068: astore #22
/*     */     //   1070: aload #13
/*     */     //   1072: invokeinterface endReplaceGroup : ()V
/*     */     //   1077: aload #22
/*     */     //   1079: invokestatic triStateToggleable-O2vRcR0 : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLandroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;
/*     */     //   1082: astore #20
/*     */     //   1084: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1087: checkcast androidx/compose/ui/Modifier
/*     */     //   1090: aload_3
/*     */     //   1091: aload #18
/*     */     //   1093: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1096: aload #13
/*     */     //   1098: bipush #112
/*     */     //   1100: iload #16
/*     */     //   1102: bipush #6
/*     */     //   1104: ishr
/*     */     //   1105: iand
/*     */     //   1106: invokevirtual outlineSizeFor-f7CD9uA : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1109: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1114: checkcast androidx/compose/ui/unit/DpSize
/*     */     //   1117: invokevirtual unbox-impl : ()J
/*     */     //   1120: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   1123: aload #18
/*     */     //   1125: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1128: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/CheckboxState;
/*     */     //   1131: aload #8
/*     */     //   1133: aload_3
/*     */     //   1134: aload #18
/*     */     //   1136: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1139: aload #13
/*     */     //   1141: bipush #112
/*     */     //   1143: iload #16
/*     */     //   1145: bipush #6
/*     */     //   1147: ishr
/*     */     //   1148: iand
/*     */     //   1149: invokevirtual outlineCornerSizeFor-f7CD9uA : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1152: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   1157: checkcast androidx/compose/foundation/shape/CornerSize
/*     */     //   1160: invokestatic RoundedCornerShape : (Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;
/*     */     //   1163: checkcast androidx/compose/ui/graphics/Shape
/*     */     //   1166: getstatic org/jetbrains/jewel/foundation/Stroke$Alignment.Center : Lorg/jetbrains/jewel/foundation/Stroke$Alignment;
/*     */     //   1169: fconst_0
/*     */     //   1170: aload #13
/*     */     //   1172: sipush #24576
/*     */     //   1175: sipush #896
/*     */     //   1178: iload #16
/*     */     //   1180: bipush #18
/*     */     //   1182: ishr
/*     */     //   1183: iand
/*     */     //   1184: ior
/*     */     //   1185: bipush #16
/*     */     //   1187: invokestatic outline-HYR8e34 : (Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/foundation/state/FocusableComponentState;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/graphics/Shape;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
/*     */     //   1190: astore #21
/*     */     //   1192: aload #4
/*     */     //   1194: invokevirtual getCheckbox : ()Lorg/jetbrains/jewel/ui/icon/IconKey;
/*     */     //   1197: aconst_null
/*     */     //   1198: aload #13
/*     */     //   1200: iconst_0
/*     */     //   1201: iconst_2
/*     */     //   1202: invokestatic rememberResourcePainterProvider : (Lorg/jetbrains/jewel/ui/icon/IconKey;Ljava/lang/Class;Landroidx/compose/runtime/Composer;II)Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   1205: astore #22
/*     */     //   1207: aload #22
/*     */     //   1209: iconst_3
/*     */     //   1210: anewarray org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   1213: astore #24
/*     */     //   1215: aload #24
/*     */     //   1217: iconst_0
/*     */     //   1218: aload #18
/*     */     //   1220: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1223: invokestatic getToggleableState-impl : (J)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1226: getstatic androidx/compose/ui/state/ToggleableState.Indeterminate : Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1229: if_acmpne -> 1241
/*     */     //   1232: getstatic org/jetbrains/jewel/ui/component/CheckBoxIndeterminate.INSTANCE : Lorg/jetbrains/jewel/ui/component/CheckBoxIndeterminate;
/*     */     //   1235: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   1238: goto -> 1247
/*     */     //   1241: getstatic org/jetbrains/jewel/ui/painter/PainterHint.None : Lorg/jetbrains/jewel/ui/painter/PainterHint$None;
/*     */     //   1244: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   1247: aastore
/*     */     //   1248: aload #24
/*     */     //   1250: iconst_1
/*     */     //   1251: aload #18
/*     */     //   1253: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1256: invokestatic getToggleableState-impl : (J)Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1259: getstatic androidx/compose/ui/state/ToggleableState.Off : Landroidx/compose/ui/state/ToggleableState;
/*     */     //   1262: if_acmpeq -> 1269
/*     */     //   1265: iconst_1
/*     */     //   1266: goto -> 1270
/*     */     //   1269: iconst_0
/*     */     //   1270: invokestatic Selected : (Z)Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   1273: aastore
/*     */     //   1274: aload #24
/*     */     //   1276: iconst_2
/*     */     //   1277: aload #18
/*     */     //   1279: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   1282: invokestatic box-impl : (J)Lorg/jetbrains/jewel/ui/component/CheckboxState;
/*     */     //   1285: invokestatic Stateful : (Lorg/jetbrains/jewel/foundation/state/InteractiveComponentState;)Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   1288: aastore
/*     */     //   1289: aload #24
/*     */     //   1291: aload #13
/*     */     //   1293: iconst_0
/*     */     //   1294: invokeinterface getPainter : ([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   1299: astore #23
/*     */     //   1301: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1304: checkcast androidx/compose/ui/Modifier
/*     */     //   1307: aload_3
/*     */     //   1308: invokevirtual getCheckboxSize-MYxV2XQ : ()J
/*     */     //   1311: invokestatic size-6HolHcs : (Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
/*     */     //   1314: astore #24
/*     */     //   1316: aload #12
/*     */     //   1318: ifnonnull -> 1776
/*     */     //   1321: aload #13
/*     */     //   1323: ldc_w -1304351860
/*     */     //   1326: invokeinterface startReplaceGroup : (I)V
/*     */     //   1331: aload #20
/*     */     //   1333: aload #24
/*     */     //   1335: invokeinterface then : (Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1340: astore #25
/*     */     //   1342: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1345: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1348: astore #26
/*     */     //   1350: bipush #48
/*     */     //   1352: istore #28
/*     */     //   1354: iconst_0
/*     */     //   1355: istore #29
/*     */     //   1357: aload #13
/*     */     //   1359: ldc_w 733328855
/*     */     //   1362: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1365: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1368: iconst_0
/*     */     //   1369: istore #27
/*     */     //   1371: aload #26
/*     */     //   1373: iload #27
/*     */     //   1375: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1378: astore #30
/*     */     //   1380: bipush #112
/*     */     //   1382: iload #28
/*     */     //   1384: iconst_3
/*     */     //   1385: ishl
/*     */     //   1386: iand
/*     */     //   1387: istore #31
/*     */     //   1389: nop
/*     */     //   1390: iconst_0
/*     */     //   1391: istore #32
/*     */     //   1393: aload #13
/*     */     //   1395: ldc_w -1323940314
/*     */     //   1398: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1401: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1404: aload #13
/*     */     //   1406: iconst_0
/*     */     //   1407: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1410: istore #33
/*     */     //   1412: aload #13
/*     */     //   1414: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1419: astore #34
/*     */     //   1421: aload #13
/*     */     //   1423: aload #25
/*     */     //   1425: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1428: astore #35
/*     */     //   1430: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1433: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1436: astore #36
/*     */     //   1438: bipush #6
/*     */     //   1440: sipush #896
/*     */     //   1443: iload #31
/*     */     //   1445: bipush #6
/*     */     //   1447: ishl
/*     */     //   1448: iand
/*     */     //   1449: ior
/*     */     //   1450: istore #37
/*     */     //   1452: nop
/*     */     //   1453: iconst_0
/*     */     //   1454: istore #38
/*     */     //   1456: aload #13
/*     */     //   1458: ldc_w -692256719
/*     */     //   1461: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1464: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1467: aload #13
/*     */     //   1469: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1474: instanceof androidx/compose/runtime/Applier
/*     */     //   1477: ifne -> 1483
/*     */     //   1480: invokestatic invalidApplier : ()V
/*     */     //   1483: aload #13
/*     */     //   1485: invokeinterface startReusableNode : ()V
/*     */     //   1490: aload #13
/*     */     //   1492: invokeinterface getInserting : ()Z
/*     */     //   1497: ifeq -> 1512
/*     */     //   1500: aload #13
/*     */     //   1502: aload #36
/*     */     //   1504: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1509: goto -> 1519
/*     */     //   1512: aload #13
/*     */     //   1514: invokeinterface useNode : ()V
/*     */     //   1519: aload #13
/*     */     //   1521: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1524: astore #39
/*     */     //   1526: iconst_0
/*     */     //   1527: istore #40
/*     */     //   1529: aload #39
/*     */     //   1531: aload #30
/*     */     //   1533: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1536: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1539: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1542: aload #39
/*     */     //   1544: aload #34
/*     */     //   1546: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1549: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1552: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1555: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1558: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1561: astore #41
/*     */     //   1563: iconst_0
/*     */     //   1564: istore #42
/*     */     //   1566: aload #39
/*     */     //   1568: astore #43
/*     */     //   1570: iconst_0
/*     */     //   1571: istore #44
/*     */     //   1573: aload #43
/*     */     //   1575: invokeinterface getInserting : ()Z
/*     */     //   1580: ifne -> 1601
/*     */     //   1583: aload #43
/*     */     //   1585: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1590: iload #33
/*     */     //   1592: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1595: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1598: ifne -> 1627
/*     */     //   1601: aload #43
/*     */     //   1603: iload #33
/*     */     //   1605: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1608: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1613: aload #39
/*     */     //   1615: iload #33
/*     */     //   1617: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1620: aload #41
/*     */     //   1622: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1627: nop
/*     */     //   1628: nop
/*     */     //   1629: nop
/*     */     //   1630: aload #39
/*     */     //   1632: aload #35
/*     */     //   1634: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1637: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1640: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1643: nop
/*     */     //   1644: nop
/*     */     //   1645: aload #13
/*     */     //   1647: bipush #14
/*     */     //   1649: iload #37
/*     */     //   1651: bipush #6
/*     */     //   1653: ishr
/*     */     //   1654: iand
/*     */     //   1655: istore #45
/*     */     //   1657: astore #46
/*     */     //   1659: iconst_0
/*     */     //   1660: istore #47
/*     */     //   1662: aload #46
/*     */     //   1664: ldc_w -2146769399
/*     */     //   1667: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1670: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1673: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1676: aload #46
/*     */     //   1678: bipush #6
/*     */     //   1680: bipush #112
/*     */     //   1682: iload #28
/*     */     //   1684: bipush #6
/*     */     //   1686: ishr
/*     */     //   1687: iand
/*     */     //   1688: ior
/*     */     //   1689: istore #48
/*     */     //   1691: astore #49
/*     */     //   1693: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1696: astore #50
/*     */     //   1698: iconst_0
/*     */     //   1699: istore #51
/*     */     //   1701: aload #23
/*     */     //   1703: invokestatic CheckboxImpl$lambda$29 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   1706: aconst_null
/*     */     //   1707: aload #49
/*     */     //   1709: iconst_0
/*     */     //   1710: iconst_2
/*     */     //   1711: invokestatic CheckBoxImage : (Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1714: aload #50
/*     */     //   1716: aload #21
/*     */     //   1718: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1721: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1724: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   1729: aload #49
/*     */     //   1731: iconst_0
/*     */     //   1732: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1735: nop
/*     */     //   1736: aload #46
/*     */     //   1738: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1741: aload #13
/*     */     //   1743: invokeinterface endNode : ()V
/*     */     //   1748: aload #13
/*     */     //   1750: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1753: nop
/*     */     //   1754: aload #13
/*     */     //   1756: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1759: nop
/*     */     //   1760: aload #13
/*     */     //   1762: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1765: nop
/*     */     //   1766: aload #13
/*     */     //   1768: invokeinterface endReplaceGroup : ()V
/*     */     //   1773: goto -> 2949
/*     */     //   1776: aload #13
/*     */     //   1778: ldc_w -1304116539
/*     */     //   1781: invokeinterface startReplaceGroup : (I)V
/*     */     //   1786: getstatic androidx/compose/foundation/layout/Arrangement.INSTANCE : Landroidx/compose/foundation/layout/Arrangement;
/*     */     //   1789: aload_3
/*     */     //   1790: invokevirtual getIconContentGap-D9Ej5fM : ()F
/*     */     //   1793: invokevirtual spacedBy-0680j_4 : (F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;
/*     */     //   1796: checkcast androidx/compose/foundation/layout/Arrangement$Horizontal
/*     */     //   1799: astore #25
/*     */     //   1801: sipush #896
/*     */     //   1804: iload #17
/*     */     //   1806: iconst_3
/*     */     //   1807: ishl
/*     */     //   1808: iand
/*     */     //   1809: istore #26
/*     */     //   1811: nop
/*     */     //   1812: iconst_0
/*     */     //   1813: istore #27
/*     */     //   1815: aload #13
/*     */     //   1817: ldc_w 693286680
/*     */     //   1820: ldc_w 'CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo'
/*     */     //   1823: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1826: aload #25
/*     */     //   1828: aload #11
/*     */     //   1830: aload #13
/*     */     //   1832: bipush #14
/*     */     //   1834: iload #26
/*     */     //   1836: iconst_3
/*     */     //   1837: ishr
/*     */     //   1838: iand
/*     */     //   1839: bipush #112
/*     */     //   1841: iload #26
/*     */     //   1843: iconst_3
/*     */     //   1844: ishr
/*     */     //   1845: iand
/*     */     //   1846: ior
/*     */     //   1847: invokestatic rowMeasurePolicy : (Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1850: astore #28
/*     */     //   1852: bipush #112
/*     */     //   1854: iload #26
/*     */     //   1856: iconst_3
/*     */     //   1857: ishl
/*     */     //   1858: iand
/*     */     //   1859: istore #29
/*     */     //   1861: nop
/*     */     //   1862: iconst_0
/*     */     //   1863: istore #30
/*     */     //   1865: aload #13
/*     */     //   1867: ldc_w -1323940314
/*     */     //   1870: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1873: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1876: aload #13
/*     */     //   1878: iconst_0
/*     */     //   1879: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1882: istore #31
/*     */     //   1884: aload #13
/*     */     //   1886: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1891: astore #32
/*     */     //   1893: aload #13
/*     */     //   1895: aload #20
/*     */     //   1897: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1900: astore #33
/*     */     //   1902: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1905: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1908: astore #34
/*     */     //   1910: bipush #6
/*     */     //   1912: sipush #896
/*     */     //   1915: iload #29
/*     */     //   1917: bipush #6
/*     */     //   1919: ishl
/*     */     //   1920: iand
/*     */     //   1921: ior
/*     */     //   1922: istore #35
/*     */     //   1924: nop
/*     */     //   1925: iconst_0
/*     */     //   1926: istore #36
/*     */     //   1928: aload #13
/*     */     //   1930: ldc_w -692256719
/*     */     //   1933: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1936: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1939: aload #13
/*     */     //   1941: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1946: instanceof androidx/compose/runtime/Applier
/*     */     //   1949: ifne -> 1955
/*     */     //   1952: invokestatic invalidApplier : ()V
/*     */     //   1955: aload #13
/*     */     //   1957: invokeinterface startReusableNode : ()V
/*     */     //   1962: aload #13
/*     */     //   1964: invokeinterface getInserting : ()Z
/*     */     //   1969: ifeq -> 1984
/*     */     //   1972: aload #13
/*     */     //   1974: aload #34
/*     */     //   1976: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1981: goto -> 1991
/*     */     //   1984: aload #13
/*     */     //   1986: invokeinterface useNode : ()V
/*     */     //   1991: aload #13
/*     */     //   1993: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1996: astore #37
/*     */     //   1998: iconst_0
/*     */     //   1999: istore #38
/*     */     //   2001: aload #37
/*     */     //   2003: aload #28
/*     */     //   2005: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2008: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2011: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2014: aload #37
/*     */     //   2016: aload #32
/*     */     //   2018: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2021: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2024: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2027: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2030: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2033: astore #39
/*     */     //   2035: iconst_0
/*     */     //   2036: istore #40
/*     */     //   2038: aload #37
/*     */     //   2040: astore #41
/*     */     //   2042: iconst_0
/*     */     //   2043: istore #42
/*     */     //   2045: aload #41
/*     */     //   2047: invokeinterface getInserting : ()Z
/*     */     //   2052: ifne -> 2073
/*     */     //   2055: aload #41
/*     */     //   2057: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2062: iload #31
/*     */     //   2064: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2067: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2070: ifne -> 2099
/*     */     //   2073: aload #41
/*     */     //   2075: iload #31
/*     */     //   2077: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2080: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2085: aload #37
/*     */     //   2087: iload #31
/*     */     //   2089: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2092: aload #39
/*     */     //   2094: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2099: nop
/*     */     //   2100: nop
/*     */     //   2101: nop
/*     */     //   2102: aload #37
/*     */     //   2104: aload #33
/*     */     //   2106: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2109: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2112: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2115: nop
/*     */     //   2116: nop
/*     */     //   2117: aload #13
/*     */     //   2119: bipush #14
/*     */     //   2121: iload #35
/*     */     //   2123: bipush #6
/*     */     //   2125: ishr
/*     */     //   2126: iand
/*     */     //   2127: istore #43
/*     */     //   2129: astore #44
/*     */     //   2131: iconst_0
/*     */     //   2132: istore #45
/*     */     //   2134: aload #44
/*     */     //   2136: ldc_w -407840262
/*     */     //   2139: ldc_w 'C101@5126L9:Row.kt#2w3rfo'
/*     */     //   2142: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2145: getstatic androidx/compose/foundation/layout/RowScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/RowScopeInstance;
/*     */     //   2148: aload #44
/*     */     //   2150: bipush #6
/*     */     //   2152: bipush #112
/*     */     //   2154: iload #26
/*     */     //   2156: bipush #6
/*     */     //   2158: ishr
/*     */     //   2159: iand
/*     */     //   2160: ior
/*     */     //   2161: istore #46
/*     */     //   2163: astore #47
/*     */     //   2165: checkcast androidx/compose/foundation/layout/RowScope
/*     */     //   2168: astore #48
/*     */     //   2170: iconst_0
/*     */     //   2171: istore #49
/*     */     //   2173: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2176: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2179: astore #50
/*     */     //   2181: bipush #48
/*     */     //   2183: istore #51
/*     */     //   2185: iconst_0
/*     */     //   2186: istore #52
/*     */     //   2188: aload #47
/*     */     //   2190: ldc_w 733328855
/*     */     //   2193: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2196: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2199: iconst_0
/*     */     //   2200: istore #53
/*     */     //   2202: aload #50
/*     */     //   2204: iload #53
/*     */     //   2206: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2209: astore #54
/*     */     //   2211: bipush #112
/*     */     //   2213: iload #51
/*     */     //   2215: iconst_3
/*     */     //   2216: ishl
/*     */     //   2217: iand
/*     */     //   2218: istore #55
/*     */     //   2220: nop
/*     */     //   2221: iconst_0
/*     */     //   2222: istore #56
/*     */     //   2224: aload #47
/*     */     //   2226: ldc_w -1323940314
/*     */     //   2229: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2232: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2235: aload #47
/*     */     //   2237: iconst_0
/*     */     //   2238: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2241: istore #57
/*     */     //   2243: aload #47
/*     */     //   2245: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2250: astore #58
/*     */     //   2252: aload #47
/*     */     //   2254: aload #24
/*     */     //   2256: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2259: astore #59
/*     */     //   2261: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2264: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2267: astore #60
/*     */     //   2269: bipush #6
/*     */     //   2271: sipush #896
/*     */     //   2274: iload #55
/*     */     //   2276: bipush #6
/*     */     //   2278: ishl
/*     */     //   2279: iand
/*     */     //   2280: ior
/*     */     //   2281: istore #61
/*     */     //   2283: nop
/*     */     //   2284: iconst_0
/*     */     //   2285: istore #62
/*     */     //   2287: aload #47
/*     */     //   2289: ldc_w -692256719
/*     */     //   2292: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2295: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2298: aload #47
/*     */     //   2300: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2305: instanceof androidx/compose/runtime/Applier
/*     */     //   2308: ifne -> 2314
/*     */     //   2311: invokestatic invalidApplier : ()V
/*     */     //   2314: aload #47
/*     */     //   2316: invokeinterface startReusableNode : ()V
/*     */     //   2321: aload #47
/*     */     //   2323: invokeinterface getInserting : ()Z
/*     */     //   2328: ifeq -> 2343
/*     */     //   2331: aload #47
/*     */     //   2333: aload #60
/*     */     //   2335: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2340: goto -> 2350
/*     */     //   2343: aload #47
/*     */     //   2345: invokeinterface useNode : ()V
/*     */     //   2350: aload #47
/*     */     //   2352: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2355: astore #63
/*     */     //   2357: iconst_0
/*     */     //   2358: istore #64
/*     */     //   2360: aload #63
/*     */     //   2362: aload #54
/*     */     //   2364: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2367: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2370: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2373: aload #63
/*     */     //   2375: aload #58
/*     */     //   2377: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2380: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2383: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2386: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2389: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2392: astore #65
/*     */     //   2394: iconst_0
/*     */     //   2395: istore #66
/*     */     //   2397: aload #63
/*     */     //   2399: astore #67
/*     */     //   2401: iconst_0
/*     */     //   2402: istore #68
/*     */     //   2404: aload #67
/*     */     //   2406: invokeinterface getInserting : ()Z
/*     */     //   2411: ifne -> 2432
/*     */     //   2414: aload #67
/*     */     //   2416: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2421: iload #57
/*     */     //   2423: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2426: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2429: ifne -> 2458
/*     */     //   2432: aload #67
/*     */     //   2434: iload #57
/*     */     //   2436: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2439: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2444: aload #63
/*     */     //   2446: iload #57
/*     */     //   2448: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2451: aload #65
/*     */     //   2453: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2458: nop
/*     */     //   2459: nop
/*     */     //   2460: nop
/*     */     //   2461: aload #63
/*     */     //   2463: aload #59
/*     */     //   2465: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2468: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2471: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2474: nop
/*     */     //   2475: nop
/*     */     //   2476: aload #47
/*     */     //   2478: bipush #14
/*     */     //   2480: iload #61
/*     */     //   2482: bipush #6
/*     */     //   2484: ishr
/*     */     //   2485: iand
/*     */     //   2486: istore #69
/*     */     //   2488: astore #70
/*     */     //   2490: iconst_0
/*     */     //   2491: istore #71
/*     */     //   2493: aload #70
/*     */     //   2495: ldc_w -2146769399
/*     */     //   2498: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2501: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2504: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2507: aload #70
/*     */     //   2509: bipush #6
/*     */     //   2511: bipush #112
/*     */     //   2513: iload #51
/*     */     //   2515: bipush #6
/*     */     //   2517: ishr
/*     */     //   2518: iand
/*     */     //   2519: ior
/*     */     //   2520: istore #72
/*     */     //   2522: astore #73
/*     */     //   2524: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2527: astore #74
/*     */     //   2529: iconst_0
/*     */     //   2530: istore #75
/*     */     //   2532: aload #23
/*     */     //   2534: invokestatic CheckboxImpl$lambda$29 : (Landroidx/compose/runtime/State;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   2537: aconst_null
/*     */     //   2538: aload #73
/*     */     //   2540: iconst_0
/*     */     //   2541: iconst_2
/*     */     //   2542: invokestatic CheckBoxImage : (Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
/*     */     //   2545: aload #74
/*     */     //   2547: aload #21
/*     */     //   2549: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2552: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   2555: invokeinterface align : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;
/*     */     //   2560: aload #73
/*     */     //   2562: iconst_0
/*     */     //   2563: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2566: nop
/*     */     //   2567: aload #70
/*     */     //   2569: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2572: aload #47
/*     */     //   2574: invokeinterface endNode : ()V
/*     */     //   2579: aload #47
/*     */     //   2581: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2584: nop
/*     */     //   2585: aload #47
/*     */     //   2587: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2590: nop
/*     */     //   2591: aload #47
/*     */     //   2593: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2596: nop
/*     */     //   2597: aload_2
/*     */     //   2598: aload #18
/*     */     //   2600: invokestatic CheckboxImpl$lambda$23 : (Landroidx/compose/runtime/MutableState;)J
/*     */     //   2603: aload #47
/*     */     //   2605: bipush #112
/*     */     //   2607: iload #16
/*     */     //   2609: iconst_3
/*     */     //   2610: ishr
/*     */     //   2611: iand
/*     */     //   2612: invokevirtual contentFor-f7CD9uA : (JLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   2615: astore #50
/*     */     //   2617: iconst_2
/*     */     //   2618: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   2621: astore #53
/*     */     //   2623: aload #53
/*     */     //   2625: iconst_0
/*     */     //   2626: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2629: aload #10
/*     */     //   2631: aload #50
/*     */     //   2633: invokestatic CheckboxImpl$lambda$35$lambda$32 : (Landroidx/compose/runtime/State;)J
/*     */     //   2636: lstore #76
/*     */     //   2638: iconst_0
/*     */     //   2639: istore #54
/*     */     //   2641: lload #76
/*     */     //   2643: lstore #78
/*     */     //   2645: iconst_0
/*     */     //   2646: istore #57
/*     */     //   2648: lload #78
/*     */     //   2650: ldc2_w 16
/*     */     //   2653: lcmp
/*     */     //   2654: ifeq -> 2661
/*     */     //   2657: iconst_1
/*     */     //   2658: goto -> 2662
/*     */     //   2661: iconst_0
/*     */     //   2662: ifeq -> 2670
/*     */     //   2665: lload #76
/*     */     //   2667: goto -> 2699
/*     */     //   2670: astore #80
/*     */     //   2672: astore #82
/*     */     //   2674: istore #83
/*     */     //   2676: astore #84
/*     */     //   2678: iconst_0
/*     */     //   2679: istore #58
/*     */     //   2681: aload #10
/*     */     //   2683: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   2686: lstore #85
/*     */     //   2688: aload #84
/*     */     //   2690: iload #83
/*     */     //   2692: aload #82
/*     */     //   2694: aload #80
/*     */     //   2696: lload #85
/*     */     //   2698: nop
/*     */     //   2699: lconst_0
/*     */     //   2700: aconst_null
/*     */     //   2701: aconst_null
/*     */     //   2702: aconst_null
/*     */     //   2703: aconst_null
/*     */     //   2704: aconst_null
/*     */     //   2705: lconst_0
/*     */     //   2706: aconst_null
/*     */     //   2707: aconst_null
/*     */     //   2708: aconst_null
/*     */     //   2709: lconst_0
/*     */     //   2710: aconst_null
/*     */     //   2711: aconst_null
/*     */     //   2712: aconst_null
/*     */     //   2713: iconst_0
/*     */     //   2714: iconst_0
/*     */     //   2715: lconst_0
/*     */     //   2716: aconst_null
/*     */     //   2717: aconst_null
/*     */     //   2718: aconst_null
/*     */     //   2719: iconst_0
/*     */     //   2720: iconst_0
/*     */     //   2721: aconst_null
/*     */     //   2722: ldc_w 16777214
/*     */     //   2725: aconst_null
/*     */     //   2726: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   2729: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2732: aastore
/*     */     //   2733: aload #53
/*     */     //   2735: iconst_1
/*     */     //   2736: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2739: aload #47
/*     */     //   2741: ldc_w 331542696
/*     */     //   2744: invokeinterface startReplaceGroup : (I)V
/*     */     //   2749: aload #50
/*     */     //   2751: invokestatic CheckboxImpl$lambda$35$lambda$32 : (Landroidx/compose/runtime/State;)J
/*     */     //   2754: lstore #87
/*     */     //   2756: iconst_0
/*     */     //   2757: istore #56
/*     */     //   2759: lload #87
/*     */     //   2761: lstore #89
/*     */     //   2763: iconst_0
/*     */     //   2764: istore #59
/*     */     //   2766: lload #89
/*     */     //   2768: ldc2_w 16
/*     */     //   2771: lcmp
/*     */     //   2772: ifeq -> 2779
/*     */     //   2775: iconst_1
/*     */     //   2776: goto -> 2780
/*     */     //   2779: iconst_0
/*     */     //   2780: ifeq -> 2788
/*     */     //   2783: lload #87
/*     */     //   2785: goto -> 2855
/*     */     //   2788: astore #82
/*     */     //   2790: istore #83
/*     */     //   2792: astore #84
/*     */     //   2794: iconst_0
/*     */     //   2795: istore #60
/*     */     //   2797: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2800: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   2803: astore #61
/*     */     //   2805: iconst_0
/*     */     //   2806: istore #62
/*     */     //   2808: iconst_0
/*     */     //   2809: istore #63
/*     */     //   2811: aload #47
/*     */     //   2813: ldc 2023513938
/*     */     //   2815: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   2817: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2820: aload #47
/*     */     //   2822: aload #61
/*     */     //   2824: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   2829: astore #64
/*     */     //   2831: aload #47
/*     */     //   2833: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2836: aload #64
/*     */     //   2838: checkcast androidx/compose/ui/graphics/Color
/*     */     //   2841: invokevirtual unbox-impl : ()J
/*     */     //   2844: lstore #80
/*     */     //   2846: aload #84
/*     */     //   2848: iload #83
/*     */     //   2850: aload #82
/*     */     //   2852: lload #80
/*     */     //   2854: nop
/*     */     //   2855: lstore #76
/*     */     //   2857: aload #47
/*     */     //   2859: invokeinterface endReplaceGroup : ()V
/*     */     //   2864: lload #76
/*     */     //   2866: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   2869: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2872: aastore
/*     */     //   2873: aload #53
/*     */     //   2875: ldc_w 1683537160
/*     */     //   2878: iconst_1
/*     */     //   2879: new org/jetbrains/jewel/ui/component/CheckboxKt$CheckboxImpl$4$4
/*     */     //   2882: dup
/*     */     //   2883: aload #6
/*     */     //   2885: aload #12
/*     */     //   2887: invokespecial <init> : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)V
/*     */     //   2890: aload #47
/*     */     //   2892: bipush #54
/*     */     //   2894: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   2897: checkcast kotlin/jvm/functions/Function2
/*     */     //   2900: aload #47
/*     */     //   2902: bipush #48
/*     */     //   2904: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   2907: ior
/*     */     //   2908: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2911: nop
/*     */     //   2912: aload #44
/*     */     //   2914: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2917: aload #13
/*     */     //   2919: invokeinterface endNode : ()V
/*     */     //   2924: aload #13
/*     */     //   2926: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2929: nop
/*     */     //   2930: aload #13
/*     */     //   2932: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2935: nop
/*     */     //   2936: aload #13
/*     */     //   2938: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2941: nop
/*     */     //   2942: aload #13
/*     */     //   2944: invokeinterface endReplaceGroup : ()V
/*     */     //   2949: invokestatic isTraceInProgress : ()Z
/*     */     //   2952: ifeq -> 2968
/*     */     //   2955: invokestatic traceEventEnd : ()V
/*     */     //   2958: goto -> 2968
/*     */     //   2961: aload #13
/*     */     //   2963: invokeinterface skipToGroupEnd : ()V
/*     */     //   2968: aload #13
/*     */     //   2970: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2975: dup
/*     */     //   2976: ifnull -> 3018
/*     */     //   2979: aload_0
/*     */     //   2980: aload_1
/*     */     //   2981: aload_2
/*     */     //   2982: aload_3
/*     */     //   2983: aload #4
/*     */     //   2985: aload #5
/*     */     //   2987: aload #6
/*     */     //   2989: iload #7
/*     */     //   2991: aload #8
/*     */     //   2993: aload #9
/*     */     //   2995: aload #10
/*     */     //   2997: aload #11
/*     */     //   2999: aload #12
/*     */     //   3001: iload #14
/*     */     //   3003: iload #15
/*     */     //   3005: <illegal opcode> invoke : (Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Alignment$Vertical;Lkotlin/jvm/functions/Function3;II)Lkotlin/jvm/functions/Function2;
/*     */     //   3010: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   3015: goto -> 3019
/*     */     //   3018: pop
/*     */     //   3019: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 0
/*     */     //   #271	-> 508
/*     */     //   #513	-> 512
/*     */     //   #514	-> 524
/*     */     //   #515	-> 535
/*     */     //   #271	-> 538
/*     */     //   #515	-> 563
/*     */     //   #516	-> 565
/*     */     //   #517	-> 574
/*     */     //   #518	-> 579
/*     */     //   #514	-> 581
/*     */     //   #513	-> 582
/*     */     //   #513	-> 583
/*     */     //   #271	-> 584
/*     */     //   #273	-> 646
/*     */     //   #519	-> 650
/*     */     //   #520	-> 662
/*     */     //   #521	-> 678
/*     */     //   #273	-> 681
/*     */     //   #521	-> 707
/*     */     //   #522	-> 709
/*     */     //   #523	-> 718
/*     */     //   #524	-> 723
/*     */     //   #520	-> 725
/*     */     //   #519	-> 726
/*     */     //   #519	-> 727
/*     */     //   #275	-> 736
/*     */     //   #276	-> 748
/*     */     //   #525	-> 799
/*     */     //   #526	-> 811
/*     */     //   #527	-> 827
/*     */     //   #276	-> 834
/*     */     //   #527	-> 859
/*     */     //   #528	-> 861
/*     */     //   #529	-> 870
/*     */     //   #530	-> 875
/*     */     //   #526	-> 877
/*     */     //   #525	-> 878
/*     */     //   #525	-> 879
/*     */     //   #276	-> 880
/*     */     //   #299	-> 907
/*     */     //   #292	-> 915
/*     */     //   #293	-> 917
/*     */     //   #300	-> 918
/*     */     //   #301	-> 920
/*     */     //   #298	-> 921
/*     */     //   #299	-> 923
/*     */     //   #294	-> 974
/*     */     //   #531	-> 978
/*     */     //   #532	-> 990
/*     */     //   #533	-> 1006
/*     */     //   #294	-> 1021
/*     */     //   #533	-> 1044
/*     */     //   #534	-> 1046
/*     */     //   #535	-> 1055
/*     */     //   #536	-> 1060
/*     */     //   #532	-> 1062
/*     */     //   #531	-> 1063
/*     */     //   #531	-> 1064
/*     */     //   #294	-> 1065
/*     */     //   #292	-> 1079
/*     */     //   #291	-> 1082
/*     */     //   #305	-> 1084
/*     */     //   #307	-> 1123
/*     */     //   #308	-> 1131
/*     */     //   #309	-> 1133
/*     */     //   #310	-> 1166
/*     */     //   #306	-> 1187
/*     */     //   #304	-> 1190
/*     */     //   #313	-> 1192
/*     */     //   #315	-> 1207
/*     */     //   #316	-> 1209
/*     */     //   #317	-> 1232
/*     */     //   #319	-> 1241
/*     */     //   #316	-> 1248
/*     */     //   #321	-> 1251
/*     */     //   #316	-> 1274
/*     */     //   #322	-> 1277
/*     */     //   #316	-> 1289
/*     */     //   #315	-> 1294
/*     */     //   #314	-> 1299
/*     */     //   #325	-> 1301
/*     */     //   #327	-> 1316
/*     */     //   #328	-> 1331
/*     */     //   #537	-> 1365
/*     */     //   #538	-> 1368
/*     */     //   #541	-> 1371
/*     */     //   #542	-> 1389
/*     */     //   #543	-> 1401
/*     */     //   #544	-> 1407
/*     */     //   #545	-> 1414
/*     */     //   #546	-> 1423
/*     */     //   #548	-> 1430
/*     */     //   #547	-> 1452
/*     */     //   #549	-> 1464
/*     */     //   #550	-> 1467
/*     */     //   #551	-> 1485
/*     */     //   #552	-> 1490
/*     */     //   #553	-> 1502
/*     */     //   #555	-> 1514
/*     */     //   #557	-> 1519
/*     */     //   #558	-> 1529
/*     */     //   #559	-> 1542
/*     */     //   #561	-> 1555
/*     */     //   #562	-> 1566
/*     */     //   #563	-> 1573
/*     */     //   #564	-> 1601
/*     */     //   #565	-> 1613
/*     */     //   #567	-> 1627
/*     */     //   #562	-> 1628
/*     */     //   #567	-> 1629
/*     */     //   #568	-> 1630
/*     */     //   #569	-> 1643
/*     */     //   #557	-> 1644
/*     */     //   #570	-> 1645
/*     */     //   #571	-> 1670
/*     */     //   #329	-> 1701
/*     */     //   #330	-> 1714
/*     */     //   #331	-> 1735
/*     */     //   #571	-> 1736
/*     */     //   #570	-> 1741
/*     */     //   #572	-> 1743
/*     */     //   #549	-> 1750
/*     */     //   #573	-> 1753
/*     */     //   #543	-> 1756
/*     */     //   #574	-> 1759
/*     */     //   #537	-> 1762
/*     */     //   #575	-> 1765
/*     */     //   #327	-> 1766
/*     */     //   #332	-> 1776
/*     */     //   #335	-> 1786
/*     */     //   #333	-> 1811
/*     */     //   #576	-> 1823
/*     */     //   #577	-> 1826
/*     */     //   #578	-> 1861
/*     */     //   #579	-> 1873
/*     */     //   #580	-> 1879
/*     */     //   #581	-> 1886
/*     */     //   #582	-> 1895
/*     */     //   #584	-> 1902
/*     */     //   #583	-> 1924
/*     */     //   #585	-> 1936
/*     */     //   #586	-> 1939
/*     */     //   #587	-> 1957
/*     */     //   #588	-> 1962
/*     */     //   #589	-> 1974
/*     */     //   #591	-> 1986
/*     */     //   #593	-> 1991
/*     */     //   #594	-> 2001
/*     */     //   #595	-> 2014
/*     */     //   #597	-> 2027
/*     */     //   #598	-> 2038
/*     */     //   #599	-> 2045
/*     */     //   #600	-> 2073
/*     */     //   #601	-> 2085
/*     */     //   #603	-> 2099
/*     */     //   #598	-> 2100
/*     */     //   #603	-> 2101
/*     */     //   #604	-> 2102
/*     */     //   #605	-> 2115
/*     */     //   #593	-> 2116
/*     */     //   #606	-> 2117
/*     */     //   #607	-> 2142
/*     */     //   #338	-> 2173
/*     */     //   #608	-> 2196
/*     */     //   #609	-> 2199
/*     */     //   #612	-> 2202
/*     */     //   #613	-> 2220
/*     */     //   #614	-> 2232
/*     */     //   #615	-> 2238
/*     */     //   #616	-> 2245
/*     */     //   #617	-> 2254
/*     */     //   #619	-> 2261
/*     */     //   #618	-> 2283
/*     */     //   #620	-> 2295
/*     */     //   #621	-> 2298
/*     */     //   #622	-> 2316
/*     */     //   #623	-> 2321
/*     */     //   #624	-> 2333
/*     */     //   #626	-> 2345
/*     */     //   #628	-> 2350
/*     */     //   #629	-> 2360
/*     */     //   #630	-> 2373
/*     */     //   #632	-> 2386
/*     */     //   #633	-> 2397
/*     */     //   #634	-> 2404
/*     */     //   #635	-> 2432
/*     */     //   #636	-> 2444
/*     */     //   #638	-> 2458
/*     */     //   #633	-> 2459
/*     */     //   #638	-> 2460
/*     */     //   #639	-> 2461
/*     */     //   #640	-> 2474
/*     */     //   #628	-> 2475
/*     */     //   #641	-> 2476
/*     */     //   #642	-> 2501
/*     */     //   #339	-> 2532
/*     */     //   #340	-> 2545
/*     */     //   #341	-> 2566
/*     */     //   #642	-> 2567
/*     */     //   #641	-> 2572
/*     */     //   #643	-> 2574
/*     */     //   #620	-> 2581
/*     */     //   #644	-> 2584
/*     */     //   #614	-> 2587
/*     */     //   #645	-> 2590
/*     */     //   #608	-> 2593
/*     */     //   #646	-> 2596
/*     */     //   #343	-> 2597
/*     */     //   #345	-> 2617
/*     */     //   #647	-> 2641
/*     */     //   #648	-> 2648
/*     */     //   #647	-> 2662
/*     */     //   #345	-> 2681
/*     */     //   #647	-> 2698
/*     */     //   #345	-> 2699
/*     */     //   #346	-> 2736
/*     */     //   #649	-> 2759
/*     */     //   #650	-> 2766
/*     */     //   #649	-> 2780
/*     */     //   #346	-> 2797
/*     */     //   #651	-> 2817
/*     */     //   #346	-> 2838
/*     */     //   #649	-> 2854
/*     */     //   #346	-> 2855
/*     */     //   #345	-> 2873
/*     */     //   #347	-> 2875
/*     */     //   #344	-> 2908
/*     */     //   #350	-> 2911
/*     */     //   #607	-> 2912
/*     */     //   #606	-> 2917
/*     */     //   #652	-> 2919
/*     */     //   #585	-> 2926
/*     */     //   #653	-> 2929
/*     */     //   #579	-> 2932
/*     */     //   #654	-> 2935
/*     */     //   #576	-> 2938
/*     */     //   #655	-> 2941
/*     */     //   #332	-> 2942
/*     */     //   #352	-> 2961
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   538	25	25	$i$a$-cache-CheckboxKt$CheckboxImpl$checkboxState$2	I
/*     */     //   565	11	26	value$iv	Ljava/lang/Object;
/*     */     //   524	58	24	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   521	61	23	it$iv	Ljava/lang/Object;
/*     */     //   512	72	22	$i$f$cache	I
/*     */     //   509	75	20	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   509	75	21	invalid$iv	Z
/*     */     //   681	23	24	$i$a$-cache-CheckboxKt$CheckboxImpl$1	I
/*     */     //   709	11	25	value$iv	Ljava/lang/Object;
/*     */     //   662	64	23	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   659	67	22	it$iv	Ljava/lang/Object;
/*     */     //   650	78	21	$i$f$cache	I
/*     */     //   647	81	19	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   647	81	20	invalid$iv	Z
/*     */     //   834	17	26	$i$a$-cache-CheckboxKt$CheckboxImpl$2	I
/*     */     //   861	11	27	value$iv	Ljava/lang/Object;
/*     */     //   811	67	25	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   808	70	24	it$iv	Ljava/lang/Object;
/*     */     //   799	81	23	$i$f$cache	I
/*     */     //   796	84	21	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   796	84	22	invalid$iv	Z
/*     */     //   1021	7	28	$i$a$-cache-CheckboxKt$CheckboxImpl$wrapperModifier$1	I
/*     */     //   1046	11	29	value$iv	Ljava/lang/Object;
/*     */     //   990	73	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   987	76	26	it$iv	Ljava/lang/Object;
/*     */     //   978	87	25	$i$f$cache	I
/*     */     //   975	90	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   975	90	24	invalid$iv	Z
/*     */     //   1701	35	51	$i$a$-Box-CheckboxKt$CheckboxImpl$3	I
/*     */     //   1698	38	50	$this$CheckboxImpl_u24lambda_u2430	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1698	38	49	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1698	38	48	$changed	I
/*     */     //   1662	79	47	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1659	82	46	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1659	82	45	$changed$iv	I
/*     */     //   1573	55	44	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1570	58	43	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1566	64	42	$i$f$set-impl	I
/*     */     //   1563	67	41	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1529	115	40	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1526	118	39	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1456	298	38	$i$f$ReusableComposeNode	I
/*     */     //   1453	301	36	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1453	301	37	$changed$iv$iv$iv	I
/*     */     //   1393	367	32	$i$f$Layout	I
/*     */     //   1412	348	33	compositeKeyHash$iv$iv	I
/*     */     //   1421	339	34	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1430	330	35	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1390	370	31	$changed$iv$iv	I
/*     */     //   1357	409	29	$i$f$Box	I
/*     */     //   1380	386	30	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1354	412	25	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1354	412	26	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1371	395	27	propagateMinConstraints$iv	Z
/*     */     //   1354	412	28	$changed$iv	I
/*     */     //   2532	35	75	$i$a$-Box-CheckboxKt$CheckboxImpl$4$1	I
/*     */     //   2529	38	74	$this$CheckboxImpl_u24lambda_u2435_u24lambda_u2431	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2529	38	73	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2529	38	72	$changed	I
/*     */     //   2493	79	71	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2490	82	70	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2490	82	69	$changed$iv	I
/*     */     //   2404	55	68	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2401	58	67	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2397	64	66	$i$f$set-impl	I
/*     */     //   2394	67	65	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2360	115	64	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2357	118	63	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2287	298	62	$i$f$ReusableComposeNode	I
/*     */     //   2284	301	60	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2284	301	61	$changed$iv$iv$iv	I
/*     */     //   2224	367	56	$i$f$Layout	I
/*     */     //   2243	348	57	compositeKeyHash$iv$iv	I
/*     */     //   2252	339	58	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2261	330	59	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2221	370	55	$changed$iv$iv	I
/*     */     //   2188	409	52	$i$f$Box	I
/*     */     //   2211	386	54	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2185	412	50	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2202	395	53	propagateMinConstraints$iv	Z
/*     */     //   2185	412	51	$changed$iv	I
/*     */     //   2681	5	58	$i$a$-takeOrElse-DxMtmZc-CheckboxKt$CheckboxImpl$4$2	I
/*     */     //   2648	14	57	$i$f$isSpecified-8_81llA	I
/*     */     //   2645	17	78	$this$isSpecified$iv$iv	J
/*     */     //   2641	58	54	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   2638	61	76	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   2811	27	63	$i$f$getCurrent	I
/*     */     //   2808	30	61	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   2808	30	62	$changed$iv	I
/*     */     //   2797	47	60	$i$a$-takeOrElse-DxMtmZc-CheckboxKt$CheckboxImpl$4$3	I
/*     */     //   2766	14	59	$i$f$isSpecified-8_81llA	I
/*     */     //   2763	17	89	$this$isSpecified$iv$iv	J
/*     */     //   2759	96	56	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   2756	99	87	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   2173	739	49	$i$a$-Row-CheckboxKt$CheckboxImpl$4	I
/*     */     //   2617	295	50	contentColor$delegate	Landroidx/compose/runtime/State;
/*     */     //   2170	742	48	$this$CheckboxImpl_u24lambda_u2435	Landroidx/compose/foundation/layout/RowScope;
/*     */     //   2170	742	47	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2170	742	46	$changed	I
/*     */     //   2134	783	45	$i$a$-Layout-RowKt$Row$1$iv	I
/*     */     //   2131	786	44	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2131	786	43	$changed$iv	I
/*     */     //   2045	55	42	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2042	58	41	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2038	64	40	$i$f$set-impl	I
/*     */     //   2035	67	39	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2001	115	38	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1998	118	37	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1928	1002	36	$i$f$ReusableComposeNode	I
/*     */     //   1925	1005	34	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1925	1005	35	$changed$iv$iv$iv	I
/*     */     //   1865	1071	30	$i$f$Layout	I
/*     */     //   1884	1052	31	compositeKeyHash$iv$iv	I
/*     */     //   1893	1043	32	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1902	1034	33	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1862	1074	29	$changed$iv$iv	I
/*     */     //   1815	1127	27	$i$f$Row	I
/*     */     //   1852	1090	28	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1812	1130	25	horizontalArrangement$iv	Landroidx/compose/foundation/layout/Arrangement$Horizontal;
/*     */     //   1812	1130	26	$changed$iv	I
/*     */     //   600	2358	18	checkboxState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   748	2210	19	swingCompatMode	Z
/*     */     //   1084	1874	20	wrapperModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1192	1766	21	outlineModifier	Landroidx/compose/ui/Modifier;
/*     */     //   1207	1751	22	painterProvider	Lorg/jetbrains/jewel/ui/painter/PainterProvider;
/*     */     //   1301	1657	23	checkboxPainter$delegate	Landroidx/compose/runtime/State;
/*     */     //   1316	1642	24	checkboxBoxModifier	Landroidx/compose/ui/Modifier;
/*     */     //   16	3004	16	$dirty	I
/*     */     //   20	3000	17	$dirty1	I
/*     */     //   0	3020	0	state	Landroidx/compose/ui/state/ToggleableState;
/*     */     //   0	3020	1	onClick	Lkotlin/jvm/functions/Function0;
/*     */     //   0	3020	2	colors	Lorg/jetbrains/jewel/ui/component/styling/CheckboxColors;
/*     */     //   0	3020	3	metrics	Lorg/jetbrains/jewel/ui/component/styling/CheckboxMetrics;
/*     */     //   0	3020	4	icons	Lorg/jetbrains/jewel/ui/component/styling/CheckboxIcons;
/*     */     //   0	3020	5	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	3020	6	contentModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	3020	7	enabled	Z
/*     */     //   0	3020	8	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	3020	9	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	3020	10	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	3020	11	verticalAlignment	Landroidx/compose/ui/Alignment$Vertical;
/*     */     //   0	3020	12	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	3020	13	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	3020	14	$changed	I
/* 658 */     //   0	3020	15	$changed1	I } private static final long CheckboxImpl$lambda$23(MutableState $checkboxState$delegate) { State state = (State)$checkboxState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((CheckboxState)state.getValue()).unbox-impl(); } private static final void CheckboxImpl$lambda$24(MutableState $checkboxState$delegate, long <set-?>) { MutableState mutableState = $checkboxState$delegate; Object object1 = null, object2 = null; Object value$iv = CheckboxState.box-impl(<set-?>); int $i$f$setValue = 0;
/* 659 */     mutableState.setValue(value$iv); } @DebugMetadata(f = "Checkbox.kt", l = {277}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.CheckboxKt$CheckboxImpl$2$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class CheckboxKt$CheckboxImpl$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; CheckboxKt$CheckboxImpl$2$1(MutableInteractionSource $interactionSource, boolean $swingCompatMode, MutableState<CheckboxState> $checkboxState$delegate, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$checkboxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, !this.$swingCompatMode, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, !this.$swingCompatMode, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }
/* 661 */               (Continuation)this) == object) return object;  this.$interactionSource.getInteractions().collect(new FlowCollector(this.$swingCompatMode, this.$checkboxState$delegate) { public final Object emit(Interaction interaction, Continuation $completion) { Interaction interaction1 = interaction; if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, !this.$swingCompatMode, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel || interaction1 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 55, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, !this.$swingCompatMode, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 47, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, true, false, false, false, 59, null)); } else if (interaction1 instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) { CheckboxKt.CheckboxImpl$lambda$24(this.$checkboxState$delegate, CheckboxState.copy-oOgqrko$default(CheckboxKt.CheckboxImpl$lambda$23(this.$checkboxState$delegate), null, false, false, false, false, false, 59, null)); }  return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super CheckboxKt$CheckboxImpl$2$1> $completion) { return (Continuation<Unit>)new CheckboxKt$CheckboxImpl$2$1(this.$interactionSource, this.$swingCompatMode, this.$checkboxState$delegate, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((CheckboxKt$CheckboxImpl$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } private static final Painter CheckboxImpl$lambda$29(State $checkboxPainter$delegate) { State state = $checkboxPainter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); }
/* 662 */   private static final Unit CheckboxImpl$lambda$28$lambda$27(Function0 $onClick, ToggleableState $state) { $onClick.invoke(); return Unit.INSTANCE; } private static final long CheckboxImpl$lambda$35$lambda$32(State $contentColor$delegate) { State state = $contentColor$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Color)state.getValue()).unbox-impl(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\norg/jetbrains/jewel/ui/component/CheckboxKt$CheckboxImpl$4$4\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,425:1\n99#2:426\n96#2,6:427\n102#2:461\n106#2:465\n79#3,6:433\n86#3,4:448\n90#3,2:458\n94#3:464\n368#4,9:439\n377#4:460\n378#4,2:462\n4034#5,6:452\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\norg/jetbrains/jewel/ui/component/CheckboxKt$CheckboxImpl$4$4\n*L\n348#1:426\n348#1:427,6\n348#1:461\n348#1:465\n348#1:433,6\n348#1:448,4\n348#1:458,2\n348#1:464\n348#1:439,9\n348#1:460\n348#1:462,2\n348#1:452,6\n*E\n"})
/*     */   static final class CheckboxKt$CheckboxImpl$4$4 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(1683537160, $changed, -1, "org.jetbrains.jewel.ui.component.CheckboxImpl.<anonymous>.<anonymous> (Checkbox.kt:347)"); 
/*     */         Modifier modifier1 = this.$contentModifier;
/*     */         Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
/*     */         int $changed$iv = 0, $i$f$Row = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
/*     */         Arrangement.Horizontal horizontalArrangement$iv = Arrangement.INSTANCE.getStart();
/*     */         Alignment.Vertical verticalAlignment$iv = Alignment.Companion.getTop();
/*     */         MeasurePolicy measurePolicy$iv = RowKt.rowMeasurePolicy(horizontalArrangement$iv, verticalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3);
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
/*     */         Composer composer1 = $composer$iv;
/*     */         RowScope $this$invoke_u24lambda_u240 = (RowScope)RowScopeInstance.INSTANCE;
/*     */         int $i$a$-Row-CheckboxKt$CheckboxImpl$4$4$1 = 0;
/*     */         function3.invoke($this$invoke_u24lambda_u240, composer1, Integer.valueOf(0xE & j));
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
/*     */     CheckboxKt$CheckboxImpl$4$4(Modifier $contentModifier, Function3<RowScope, Composer, Integer, Unit> $content) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   private static final void CheckBoxImage(Painter checkboxPainter, Modifier modifier, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 677535849
/*     */     //   4: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   9: astore_2
/*     */     //   10: iload_3
/*     */     //   11: istore #5
/*     */     //   13: iload #4
/*     */     //   15: iconst_1
/*     */     //   16: iand
/*     */     //   17: ifeq -> 30
/*     */     //   20: iload #5
/*     */     //   22: bipush #6
/*     */     //   24: ior
/*     */     //   25: istore #5
/*     */     //   27: goto -> 57
/*     */     //   30: iload_3
/*     */     //   31: bipush #6
/*     */     //   33: iand
/*     */     //   34: ifne -> 57
/*     */     //   37: iload #5
/*     */     //   39: aload_2
/*     */     //   40: aload_0
/*     */     //   41: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   46: ifeq -> 53
/*     */     //   49: iconst_4
/*     */     //   50: goto -> 54
/*     */     //   53: iconst_2
/*     */     //   54: ior
/*     */     //   55: istore #5
/*     */     //   57: iload #4
/*     */     //   59: iconst_2
/*     */     //   60: iand
/*     */     //   61: ifeq -> 74
/*     */     //   64: iload #5
/*     */     //   66: bipush #48
/*     */     //   68: ior
/*     */     //   69: istore #5
/*     */     //   71: goto -> 103
/*     */     //   74: iload_3
/*     */     //   75: bipush #48
/*     */     //   77: iand
/*     */     //   78: ifne -> 103
/*     */     //   81: iload #5
/*     */     //   83: aload_2
/*     */     //   84: aload_1
/*     */     //   85: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   90: ifeq -> 98
/*     */     //   93: bipush #32
/*     */     //   95: goto -> 100
/*     */     //   98: bipush #16
/*     */     //   100: ior
/*     */     //   101: istore #5
/*     */     //   103: iload #5
/*     */     //   105: bipush #19
/*     */     //   107: iand
/*     */     //   108: bipush #18
/*     */     //   110: if_icmpne -> 122
/*     */     //   113: aload_2
/*     */     //   114: invokeinterface getSkipping : ()Z
/*     */     //   119: ifne -> 189
/*     */     //   122: iload #4
/*     */     //   124: iconst_2
/*     */     //   125: iand
/*     */     //   126: ifeq -> 136
/*     */     //   129: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   132: checkcast androidx/compose/ui/Modifier
/*     */     //   135: astore_1
/*     */     //   136: invokestatic isTraceInProgress : ()Z
/*     */     //   139: ifeq -> 154
/*     */     //   142: ldc_w 677535849
/*     */     //   145: iload #5
/*     */     //   147: iconst_m1
/*     */     //   148: ldc_w 'org.jetbrains.jewel.ui.component.CheckBoxImage (Checkbox.kt:358)'
/*     */     //   151: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   154: aload_1
/*     */     //   155: aload_0
/*     */     //   156: iconst_0
/*     */     //   157: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   160: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   163: aconst_null
/*     */     //   164: fconst_0
/*     */     //   165: aconst_null
/*     */     //   166: bipush #58
/*     */     //   168: aconst_null
/*     */     //   169: invokestatic paint$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   172: aload_2
/*     */     //   173: iconst_0
/*     */     //   174: invokestatic Box : (Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
/*     */     //   177: invokestatic isTraceInProgress : ()Z
/*     */     //   180: ifeq -> 195
/*     */     //   183: invokestatic traceEventEnd : ()V
/*     */     //   186: goto -> 195
/*     */     //   189: aload_2
/*     */     //   190: invokeinterface skipToGroupEnd : ()V
/*     */     //   195: aload_2
/*     */     //   196: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   201: dup
/*     */     //   202: ifnull -> 223
/*     */     //   205: aload_0
/*     */     //   206: aload_1
/*     */     //   207: iload_3
/*     */     //   208: iload #4
/*     */     //   210: <illegal opcode> invoke : (Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;II)Lkotlin/jvm/functions/Function2;
/*     */     //   215: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   220: goto -> 224
/*     */     //   223: pop
/*     */     //   224: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #359	-> 0
/*     */     //   #360	-> 154
/*     */     //   #361	-> 189
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   13	212	5	$dirty	I
/*     */     //   0	225	0	checkboxPainter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	225	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	225	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	225	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit Checkbox$lambda$5(boolean $checked, Function1<? super Boolean, Unit> $onCheckedChange, Modifier $modifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     Checkbox($checked, $onCheckedChange, $modifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TriStateCheckbox$lambda$7(ToggleableState $state, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TriStateCheckbox($state, $onClick, $modifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TriStateCheckboxRow$lambda$9(String $text, ToggleableState $state, Function0<Unit> $onClick, Modifier $modifier, Modifier $textModifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TriStateCheckboxRow($text, $state, $onClick, $modifier, $textModifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CheckboxRow$lambda$15(String $text, boolean $checked, Function1<? super Boolean, Unit> $onCheckedChange, Modifier $modifier, Modifier $textModifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     CheckboxRow($text, $checked, $onCheckedChange, $modifier, $textModifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CheckboxRow$lambda$19(boolean $checked, Function1<? super Boolean, Unit> $onCheckedChange, Modifier $modifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     CheckboxRow($checked, $onCheckedChange, $modifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TriStateCheckboxRow$lambda$21(ToggleableState $state, Function0<Unit> $onClick, Modifier $modifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TriStateCheckboxRow($state, $onClick, $modifier, $enabled, $outline, $interactionSource, $colors, $metrics, $icons, $textStyle, $verticalAlignment, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CheckboxImpl$lambda$36(ToggleableState $state, Function0<Unit> $onClick, CheckboxColors $colors, CheckboxMetrics $metrics, CheckboxIcons $icons, Modifier $modifier, Modifier $contentModifier, boolean $enabled, Outline $outline, MutableInteractionSource $interactionSource, TextStyle $textStyle, Alignment.Vertical $verticalAlignment, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, int $$changed1, Composer $composer, int $force) {
/*     */     CheckboxImpl($state, $onClick, $colors, $metrics, $icons, $modifier, $contentModifier, $enabled, $outline, $interactionSource, $textStyle, $verticalAlignment, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit CheckBoxImage$lambda$37(Painter $checkboxPainter, Modifier $modifier, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     CheckBoxImage($checkboxPainter, $modifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\CheckboxKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */