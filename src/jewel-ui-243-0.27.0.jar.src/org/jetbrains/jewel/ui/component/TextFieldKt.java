/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.text.KeyboardActions;
/*     */ import androidx.compose.foundation.text.KeyboardOptions;
/*     */ import androidx.compose.foundation.text.input.InputTransformation;
/*     */ import androidx.compose.foundation.text.input.KeyboardActionHandler;
/*     */ import androidx.compose.foundation.text.input.OutputTransformation;
/*     */ import androidx.compose.foundation.text.input.TextFieldDecorator;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.input.TextFieldValue;
/*     */ import androidx.compose.ui.text.input.VisualTransformation;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.comparisons.ComparisonsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextFieldStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000º\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\n\032\002\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\02028\b\002\020\021\0322\022\004\022\0020\023\022\033\022\031\022\006\022\004\030\0010\0250\024¢\006\f\b\026\022\b\b\027\022\004\b\b(\030\022\004\022\0020\001\030\0010\022¢\006\002\b\0312\b\b\002\020\032\032\0020\0332\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\0372\025\b\002\020 \032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020#\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\n\b\002\020$\032\004\030\0010%2\b\b\002\020&\032\0020\007H\007¢\006\002\020'\032è\001\020\000\032\0020\0012\006\020(\032\0020)2\022\020*\032\016\022\004\022\0020)\022\004\022\0020\0010+2\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\036\032\0020\0372\025\b\002\020 \032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020#\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\b\b\002\020&\032\0020\0072\b\b\002\020,\032\0020-2\b\b\002\020\r\032\0020\0162\b\b\002\020.\032\0020/2\024\b\002\020\021\032\016\022\004\022\0020\025\022\004\022\0020\0010+2\b\b\002\020\034\032\0020\0352\b\b\002\020\032\032\0020\033H\007¢\006\002\0200\032ò\001\020\000\032\0020\0012\006\020(\032\002012\022\020*\032\016\022\004\022\00201\022\004\022\0020\0010+2\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\036\032\0020\0372\025\b\002\020 \032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020#\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\b\b\002\020&\032\0020\0072\b\b\002\020,\032\0020-2\b\b\002\020\r\032\0020\0162\b\b\002\020.\032\0020/2\024\b\002\020\021\032\016\022\004\022\0020\025\022\004\022\0020\0010+2\b\b\002\020\034\032\0020\0352\b\b\002\020\013\032\0020\f2\b\b\002\020\032\032\0020\033H\007¢\006\002\0202\032\001\0203\032\0020\0012\b\b\002\020\004\032\0020\0052\021\0204\032\r\022\004\022\0020\0010\024¢\006\002\b!2\006\020\013\032\0020\f2\006\0205\032\002062\025\b\002\020 \032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!2\025\b\002\020#\032\017\022\004\022\0020\001\030\0010\024¢\006\002\b!H\003¢\006\004\b7\0208\0323\0209\032\0020:2\b\020;\032\004\030\0010<2\b\020=\032\004\030\0010<2\006\020>\032\0020<2\006\020?\032\0020@H\002¢\006\004\bA\020B\0323\020C\032\0020:2\b\020;\032\004\030\0010<2\b\020=\032\004\030\0010<2\006\020>\032\0020<2\006\020?\032\0020@H\002¢\006\004\bD\020B\032B\020E\032\0020\001*\0020F2\006\020G\032\0020:2\006\020H\032\0020:2\b\020;\032\004\030\0010<2\b\020=\032\004\030\0010<2\006\020>\032\0020<2\b\020I\032\004\030\0010<H\002\"\016\020J\032\0020)XT¢\006\002\n\000\"\016\020K\032\0020)XT¢\006\002\n\000\"\016\020L\032\0020)XT¢\006\002\n\000\"\016\020M\032\0020)XT¢\006\002\n\000¨\006N²\006\n\020O\032\00201X\002²\006\n\020P\032\0020)X\002"}, d2 = {"TextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "placeholder", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "undecorated", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/input/OutputTransformation;ZLandroidx/compose/runtime/Composer;III)V", "value", "", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "TextFieldDecorationBox", "innerTextField", "placeholderTextColor", "Landroidx/compose/ui/graphics/Color;", "TextFieldDecorationBox-hYmLsZ8", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "calculateWidth", "", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "constraints", "Landroidx/compose/ui/unit/Constraints;", "calculateWidth--hBUhpc", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I", "calculateHeight", "calculateHeight--hBUhpc", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "height", "width", "placeholderPlaceable", "PLACEHOLDER_ID", "TEXT_FIELD_ID", "TRAILING_ID", "LEADING_ID", "ui", "textFieldValueState", "lastTextValue"})
/*     */ @SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,345:1\n1225#2,6:346\n1225#2,6:352\n1225#2,6:358\n1225#2,6:364\n1225#2,6:370\n1225#2,6:376\n1225#2,6:382\n1225#2,6:388\n1225#2,6:394\n79#3,6:400\n86#3,4:415\n90#3,2:425\n79#3,6:434\n86#3,4:449\n90#3,2:459\n94#3:465\n79#3,6:473\n86#3,4:488\n90#3,2:498\n94#3:504\n79#3,6:512\n86#3,4:527\n90#3,2:537\n94#3:543\n79#3,6:552\n86#3,4:567\n90#3,2:577\n94#3:583\n94#3:587\n368#4,9:406\n377#4:427\n368#4,9:440\n377#4:461\n378#4,2:463\n368#4,9:479\n377#4:500\n378#4,2:502\n368#4,9:518\n377#4:539\n378#4,2:541\n368#4,9:558\n377#4:579\n378#4,2:581\n378#4,2:585\n4034#5,6:419\n4034#5,6:453\n4034#5,6:492\n4034#5,6:531\n4034#5,6:571\n71#6:428\n69#6,5:429\n74#6:462\n78#6:466\n71#6:467\n69#6,5:468\n74#6:501\n78#6:505\n71#6:506\n69#6,5:507\n74#6:540\n78#6:544\n71#6:545\n68#6,6:546\n74#6:580\n78#6:584\n81#7:588\n107#7,2:589\n81#7:591\n107#7,2:592\n*S KotlinDebug\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt\n*L\n56#1:346,6\n121#1:352,6\n123#1:358,6\n125#1:364,6\n127#1:370,6\n132#1:376,6\n177#1:382,6\n180#1:388,6\n248#1:394,6\n227#1:400,6\n227#1:415,4\n227#1:425,2\n231#1:434,6\n231#1:449,4\n231#1:459,2\n231#1:465\n234#1:473,6\n234#1:488,4\n234#1:498,2\n234#1:504\n237#1:512,6\n237#1:527,4\n237#1:537,2\n237#1:543\n246#1:552,6\n246#1:567,4\n246#1:577,2\n246#1:583\n227#1:587\n227#1:406,9\n227#1:427\n231#1:440,9\n231#1:461\n231#1:463,2\n234#1:479,9\n234#1:500\n234#1:502,2\n237#1:518,9\n237#1:539\n237#1:541,2\n246#1:558,9\n246#1:579\n246#1:581,2\n227#1:585,2\n227#1:419,6\n231#1:453,6\n234#1:492,6\n237#1:531,6\n246#1:571,6\n231#1:428\n231#1:429,5\n231#1:462\n231#1:466\n234#1:467\n234#1:468,5\n234#1:501\n234#1:505\n237#1:506\n237#1:507,5\n237#1:540\n237#1:544\n246#1:545\n246#1:546,6\n246#1:580\n246#1:584\n125#1:588\n125#1:589,2\n127#1:591\n127#1:592,2\n*E\n"})
/*     */ public final class TextFieldKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String PLACEHOLDER_ID = "Placeholder";
/*     */   @NotNull
/*     */   private static final String TEXT_FIELD_ID = "TextField";
/*     */   @NotNull
/*     */   private static final String TRAILING_ID = "Trailing";
/*     */   @NotNull
/*     */   private static final String LEADING_ID = "Leading";
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void TextField(@NotNull TextFieldState state, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler onKeyboardAction, @Nullable Function2 onTextLayout, @Nullable MutableInteractionSource interactionSource, @Nullable TextFieldStyle style, @Nullable Outline outline, @Nullable Function2 placeholder, @Nullable Function2 leadingIcon, @Nullable Function2 trailingIcon, @Nullable OutputTransformation outputTransformation, boolean undecorated, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'state'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #17
/*     */     //   8: ldc 1289451354
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #17
/*     */     //   17: iload #18
/*     */     //   19: istore #21
/*     */     //   21: iload #19
/*     */     //   23: istore #22
/*     */     //   25: iload #20
/*     */     //   27: iconst_1
/*     */     //   28: iand
/*     */     //   29: ifeq -> 42
/*     */     //   32: iload #21
/*     */     //   34: bipush #6
/*     */     //   36: ior
/*     */     //   37: istore #21
/*     */     //   39: goto -> 71
/*     */     //   42: iload #18
/*     */     //   44: bipush #6
/*     */     //   46: iand
/*     */     //   47: ifne -> 71
/*     */     //   50: iload #21
/*     */     //   52: aload #17
/*     */     //   54: aload_0
/*     */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #21
/*     */     //   71: iload #20
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #21
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #21
/*     */     //   85: goto -> 119
/*     */     //   88: iload #18
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 119
/*     */     //   96: iload #21
/*     */     //   98: aload #17
/*     */     //   100: aload_1
/*     */     //   101: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   106: ifeq -> 114
/*     */     //   109: bipush #32
/*     */     //   111: goto -> 116
/*     */     //   114: bipush #16
/*     */     //   116: ior
/*     */     //   117: istore #21
/*     */     //   119: iload #20
/*     */     //   121: iconst_4
/*     */     //   122: iand
/*     */     //   123: ifeq -> 137
/*     */     //   126: iload #21
/*     */     //   128: sipush #384
/*     */     //   131: ior
/*     */     //   132: istore #21
/*     */     //   134: goto -> 171
/*     */     //   137: iload #18
/*     */     //   139: sipush #384
/*     */     //   142: iand
/*     */     //   143: ifne -> 171
/*     */     //   146: iload #21
/*     */     //   148: aload #17
/*     */     //   150: iload_2
/*     */     //   151: invokeinterface changed : (Z)Z
/*     */     //   156: ifeq -> 165
/*     */     //   159: sipush #256
/*     */     //   162: goto -> 168
/*     */     //   165: sipush #128
/*     */     //   168: ior
/*     */     //   169: istore #21
/*     */     //   171: iload #20
/*     */     //   173: bipush #8
/*     */     //   175: iand
/*     */     //   176: ifeq -> 190
/*     */     //   179: iload #21
/*     */     //   181: sipush #3072
/*     */     //   184: ior
/*     */     //   185: istore #21
/*     */     //   187: goto -> 224
/*     */     //   190: iload #18
/*     */     //   192: sipush #3072
/*     */     //   195: iand
/*     */     //   196: ifne -> 224
/*     */     //   199: iload #21
/*     */     //   201: aload #17
/*     */     //   203: iload_3
/*     */     //   204: invokeinterface changed : (Z)Z
/*     */     //   209: ifeq -> 218
/*     */     //   212: sipush #2048
/*     */     //   215: goto -> 221
/*     */     //   218: sipush #1024
/*     */     //   221: ior
/*     */     //   222: istore #21
/*     */     //   224: iload #20
/*     */     //   226: bipush #16
/*     */     //   228: iand
/*     */     //   229: ifeq -> 243
/*     */     //   232: iload #21
/*     */     //   234: sipush #24576
/*     */     //   237: ior
/*     */     //   238: istore #21
/*     */     //   240: goto -> 278
/*     */     //   243: iload #18
/*     */     //   245: sipush #24576
/*     */     //   248: iand
/*     */     //   249: ifne -> 278
/*     */     //   252: iload #21
/*     */     //   254: aload #17
/*     */     //   256: aload #4
/*     */     //   258: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   263: ifeq -> 272
/*     */     //   266: sipush #16384
/*     */     //   269: goto -> 275
/*     */     //   272: sipush #8192
/*     */     //   275: ior
/*     */     //   276: istore #21
/*     */     //   278: iload #18
/*     */     //   280: ldc 196608
/*     */     //   282: iand
/*     */     //   283: ifne -> 318
/*     */     //   286: iload #21
/*     */     //   288: iload #20
/*     */     //   290: bipush #32
/*     */     //   292: iand
/*     */     //   293: ifne -> 313
/*     */     //   296: aload #17
/*     */     //   298: aload #5
/*     */     //   300: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   305: ifeq -> 313
/*     */     //   308: ldc 131072
/*     */     //   310: goto -> 315
/*     */     //   313: ldc 65536
/*     */     //   315: ior
/*     */     //   316: istore #21
/*     */     //   318: iload #20
/*     */     //   320: bipush #64
/*     */     //   322: iand
/*     */     //   323: ifeq -> 336
/*     */     //   326: iload #21
/*     */     //   328: ldc 1572864
/*     */     //   330: ior
/*     */     //   331: istore #21
/*     */     //   333: goto -> 368
/*     */     //   336: iload #18
/*     */     //   338: ldc 1572864
/*     */     //   340: iand
/*     */     //   341: ifne -> 368
/*     */     //   344: iload #21
/*     */     //   346: aload #17
/*     */     //   348: aload #6
/*     */     //   350: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   355: ifeq -> 363
/*     */     //   358: ldc 1048576
/*     */     //   360: goto -> 365
/*     */     //   363: ldc 524288
/*     */     //   365: ior
/*     */     //   366: istore #21
/*     */     //   368: iload #20
/*     */     //   370: sipush #128
/*     */     //   373: iand
/*     */     //   374: ifeq -> 387
/*     */     //   377: iload #21
/*     */     //   379: ldc 12582912
/*     */     //   381: ior
/*     */     //   382: istore #21
/*     */     //   384: goto -> 419
/*     */     //   387: iload #18
/*     */     //   389: ldc 12582912
/*     */     //   391: iand
/*     */     //   392: ifne -> 419
/*     */     //   395: iload #21
/*     */     //   397: aload #17
/*     */     //   399: aload #7
/*     */     //   401: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   406: ifeq -> 414
/*     */     //   409: ldc 8388608
/*     */     //   411: goto -> 416
/*     */     //   414: ldc 4194304
/*     */     //   416: ior
/*     */     //   417: istore #21
/*     */     //   419: iload #20
/*     */     //   421: sipush #256
/*     */     //   424: iand
/*     */     //   425: ifeq -> 438
/*     */     //   428: iload #21
/*     */     //   430: ldc 100663296
/*     */     //   432: ior
/*     */     //   433: istore #21
/*     */     //   435: goto -> 470
/*     */     //   438: iload #18
/*     */     //   440: ldc 100663296
/*     */     //   442: iand
/*     */     //   443: ifne -> 470
/*     */     //   446: iload #21
/*     */     //   448: aload #17
/*     */     //   450: aload #8
/*     */     //   452: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   457: ifeq -> 465
/*     */     //   460: ldc 67108864
/*     */     //   462: goto -> 467
/*     */     //   465: ldc 33554432
/*     */     //   467: ior
/*     */     //   468: istore #21
/*     */     //   470: iload #20
/*     */     //   472: sipush #512
/*     */     //   475: iand
/*     */     //   476: ifeq -> 489
/*     */     //   479: iload #21
/*     */     //   481: ldc 805306368
/*     */     //   483: ior
/*     */     //   484: istore #21
/*     */     //   486: goto -> 521
/*     */     //   489: iload #18
/*     */     //   491: ldc 805306368
/*     */     //   493: iand
/*     */     //   494: ifne -> 521
/*     */     //   497: iload #21
/*     */     //   499: aload #17
/*     */     //   501: aload #9
/*     */     //   503: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   508: ifeq -> 516
/*     */     //   511: ldc 536870912
/*     */     //   513: goto -> 518
/*     */     //   516: ldc 268435456
/*     */     //   518: ior
/*     */     //   519: istore #21
/*     */     //   521: iload #19
/*     */     //   523: bipush #6
/*     */     //   525: iand
/*     */     //   526: ifne -> 560
/*     */     //   529: iload #22
/*     */     //   531: iload #20
/*     */     //   533: sipush #1024
/*     */     //   536: iand
/*     */     //   537: ifne -> 556
/*     */     //   540: aload #17
/*     */     //   542: aload #10
/*     */     //   544: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   549: ifeq -> 556
/*     */     //   552: iconst_4
/*     */     //   553: goto -> 557
/*     */     //   556: iconst_2
/*     */     //   557: ior
/*     */     //   558: istore #22
/*     */     //   560: iload #20
/*     */     //   562: sipush #2048
/*     */     //   565: iand
/*     */     //   566: ifeq -> 579
/*     */     //   569: iload #22
/*     */     //   571: bipush #48
/*     */     //   573: ior
/*     */     //   574: istore #22
/*     */     //   576: goto -> 611
/*     */     //   579: iload #19
/*     */     //   581: bipush #48
/*     */     //   583: iand
/*     */     //   584: ifne -> 611
/*     */     //   587: iload #22
/*     */     //   589: aload #17
/*     */     //   591: aload #11
/*     */     //   593: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   598: ifeq -> 606
/*     */     //   601: bipush #32
/*     */     //   603: goto -> 608
/*     */     //   606: bipush #16
/*     */     //   608: ior
/*     */     //   609: istore #22
/*     */     //   611: iload #20
/*     */     //   613: sipush #4096
/*     */     //   616: iand
/*     */     //   617: ifeq -> 631
/*     */     //   620: iload #22
/*     */     //   622: sipush #384
/*     */     //   625: ior
/*     */     //   626: istore #22
/*     */     //   628: goto -> 666
/*     */     //   631: iload #19
/*     */     //   633: sipush #384
/*     */     //   636: iand
/*     */     //   637: ifne -> 666
/*     */     //   640: iload #22
/*     */     //   642: aload #17
/*     */     //   644: aload #12
/*     */     //   646: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   651: ifeq -> 660
/*     */     //   654: sipush #256
/*     */     //   657: goto -> 663
/*     */     //   660: sipush #128
/*     */     //   663: ior
/*     */     //   664: istore #22
/*     */     //   666: iload #20
/*     */     //   668: sipush #8192
/*     */     //   671: iand
/*     */     //   672: ifeq -> 686
/*     */     //   675: iload #22
/*     */     //   677: sipush #3072
/*     */     //   680: ior
/*     */     //   681: istore #22
/*     */     //   683: goto -> 721
/*     */     //   686: iload #19
/*     */     //   688: sipush #3072
/*     */     //   691: iand
/*     */     //   692: ifne -> 721
/*     */     //   695: iload #22
/*     */     //   697: aload #17
/*     */     //   699: aload #13
/*     */     //   701: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   706: ifeq -> 715
/*     */     //   709: sipush #2048
/*     */     //   712: goto -> 718
/*     */     //   715: sipush #1024
/*     */     //   718: ior
/*     */     //   719: istore #22
/*     */     //   721: iload #20
/*     */     //   723: sipush #16384
/*     */     //   726: iand
/*     */     //   727: ifeq -> 741
/*     */     //   730: iload #22
/*     */     //   732: sipush #24576
/*     */     //   735: ior
/*     */     //   736: istore #22
/*     */     //   738: goto -> 776
/*     */     //   741: iload #19
/*     */     //   743: sipush #24576
/*     */     //   746: iand
/*     */     //   747: ifne -> 776
/*     */     //   750: iload #22
/*     */     //   752: aload #17
/*     */     //   754: aload #14
/*     */     //   756: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   761: ifeq -> 770
/*     */     //   764: sipush #16384
/*     */     //   767: goto -> 773
/*     */     //   770: sipush #8192
/*     */     //   773: ior
/*     */     //   774: istore #22
/*     */     //   776: iload #20
/*     */     //   778: ldc 32768
/*     */     //   780: iand
/*     */     //   781: ifeq -> 794
/*     */     //   784: iload #22
/*     */     //   786: ldc 196608
/*     */     //   788: ior
/*     */     //   789: istore #22
/*     */     //   791: goto -> 826
/*     */     //   794: iload #19
/*     */     //   796: ldc 196608
/*     */     //   798: iand
/*     */     //   799: ifne -> 826
/*     */     //   802: iload #22
/*     */     //   804: aload #17
/*     */     //   806: aload #15
/*     */     //   808: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   813: ifeq -> 821
/*     */     //   816: ldc 131072
/*     */     //   818: goto -> 823
/*     */     //   821: ldc 65536
/*     */     //   823: ior
/*     */     //   824: istore #22
/*     */     //   826: iload #20
/*     */     //   828: ldc 65536
/*     */     //   830: iand
/*     */     //   831: ifeq -> 844
/*     */     //   834: iload #22
/*     */     //   836: ldc 1572864
/*     */     //   838: ior
/*     */     //   839: istore #22
/*     */     //   841: goto -> 876
/*     */     //   844: iload #19
/*     */     //   846: ldc 1572864
/*     */     //   848: iand
/*     */     //   849: ifne -> 876
/*     */     //   852: iload #22
/*     */     //   854: aload #17
/*     */     //   856: iload #16
/*     */     //   858: invokeinterface changed : (Z)Z
/*     */     //   863: ifeq -> 871
/*     */     //   866: ldc 1048576
/*     */     //   868: goto -> 873
/*     */     //   871: ldc 524288
/*     */     //   873: ior
/*     */     //   874: istore #22
/*     */     //   876: iload #21
/*     */     //   878: ldc 306783379
/*     */     //   880: iand
/*     */     //   881: ldc 306783378
/*     */     //   883: if_icmpne -> 906
/*     */     //   886: iload #22
/*     */     //   888: ldc 599187
/*     */     //   890: iand
/*     */     //   891: ldc 599186
/*     */     //   893: if_icmpne -> 906
/*     */     //   896: aload #17
/*     */     //   898: invokeinterface getSkipping : ()Z
/*     */     //   903: ifne -> 1484
/*     */     //   906: aload #17
/*     */     //   908: invokeinterface startDefaults : ()V
/*     */     //   913: iload #18
/*     */     //   915: iconst_1
/*     */     //   916: iand
/*     */     //   917: ifeq -> 930
/*     */     //   920: aload #17
/*     */     //   922: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   927: ifeq -> 1238
/*     */     //   930: iload #20
/*     */     //   932: iconst_2
/*     */     //   933: iand
/*     */     //   934: ifeq -> 944
/*     */     //   937: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   940: checkcast androidx/compose/ui/Modifier
/*     */     //   943: astore_1
/*     */     //   944: iload #20
/*     */     //   946: iconst_4
/*     */     //   947: iand
/*     */     //   948: ifeq -> 953
/*     */     //   951: iconst_1
/*     */     //   952: istore_2
/*     */     //   953: iload #20
/*     */     //   955: bipush #8
/*     */     //   957: iand
/*     */     //   958: ifeq -> 963
/*     */     //   961: iconst_0
/*     */     //   962: istore_3
/*     */     //   963: iload #20
/*     */     //   965: bipush #16
/*     */     //   967: iand
/*     */     //   968: ifeq -> 974
/*     */     //   971: aconst_null
/*     */     //   972: astore #4
/*     */     //   974: iload #20
/*     */     //   976: bipush #32
/*     */     //   978: iand
/*     */     //   979: ifeq -> 1001
/*     */     //   982: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   985: aload #17
/*     */     //   987: bipush #6
/*     */     //   989: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   992: astore #5
/*     */     //   994: iload #21
/*     */     //   996: ldc -458753
/*     */     //   998: iand
/*     */     //   999: istore #21
/*     */     //   1001: iload #20
/*     */     //   1003: bipush #64
/*     */     //   1005: iand
/*     */     //   1006: ifeq -> 1017
/*     */     //   1009: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1012: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1015: astore #6
/*     */     //   1017: iload #20
/*     */     //   1019: sipush #128
/*     */     //   1022: iand
/*     */     //   1023: ifeq -> 1029
/*     */     //   1026: aconst_null
/*     */     //   1027: astore #7
/*     */     //   1029: iload #20
/*     */     //   1031: sipush #256
/*     */     //   1034: iand
/*     */     //   1035: ifeq -> 1041
/*     */     //   1038: aconst_null
/*     */     //   1039: astore #8
/*     */     //   1041: iload #20
/*     */     //   1043: sipush #512
/*     */     //   1046: iand
/*     */     //   1047: ifeq -> 1135
/*     */     //   1050: aload #17
/*     */     //   1052: ldc -705893930
/*     */     //   1054: invokeinterface startReplaceGroup : (I)V
/*     */     //   1059: aload #17
/*     */     //   1061: astore #24
/*     */     //   1063: iconst_0
/*     */     //   1064: istore #25
/*     */     //   1066: iconst_0
/*     */     //   1067: istore #26
/*     */     //   1069: aload #24
/*     */     //   1071: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1076: astore #27
/*     */     //   1078: iconst_0
/*     */     //   1079: istore #28
/*     */     //   1081: aload #27
/*     */     //   1083: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1086: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1089: if_acmpne -> 1114
/*     */     //   1092: iconst_0
/*     */     //   1093: istore #29
/*     */     //   1095: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1098: astore #29
/*     */     //   1100: aload #24
/*     */     //   1102: aload #29
/*     */     //   1104: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1109: aload #29
/*     */     //   1111: goto -> 1116
/*     */     //   1114: aload #27
/*     */     //   1116: nop
/*     */     //   1117: nop
/*     */     //   1118: nop
/*     */     //   1119: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1122: astore #23
/*     */     //   1124: aload #17
/*     */     //   1126: invokeinterface endReplaceGroup : ()V
/*     */     //   1131: aload #23
/*     */     //   1133: astore #9
/*     */     //   1135: iload #20
/*     */     //   1137: sipush #1024
/*     */     //   1140: iand
/*     */     //   1141: ifeq -> 1163
/*     */     //   1144: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1147: aload #17
/*     */     //   1149: bipush #6
/*     */     //   1151: invokestatic getTextFieldStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   1154: astore #10
/*     */     //   1156: iload #22
/*     */     //   1158: bipush #-15
/*     */     //   1160: iand
/*     */     //   1161: istore #22
/*     */     //   1163: iload #20
/*     */     //   1165: sipush #2048
/*     */     //   1168: iand
/*     */     //   1169: ifeq -> 1177
/*     */     //   1172: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1175: astore #11
/*     */     //   1177: iload #20
/*     */     //   1179: sipush #4096
/*     */     //   1182: iand
/*     */     //   1183: ifeq -> 1189
/*     */     //   1186: aconst_null
/*     */     //   1187: astore #12
/*     */     //   1189: iload #20
/*     */     //   1191: sipush #8192
/*     */     //   1194: iand
/*     */     //   1195: ifeq -> 1201
/*     */     //   1198: aconst_null
/*     */     //   1199: astore #13
/*     */     //   1201: iload #20
/*     */     //   1203: sipush #16384
/*     */     //   1206: iand
/*     */     //   1207: ifeq -> 1213
/*     */     //   1210: aconst_null
/*     */     //   1211: astore #14
/*     */     //   1213: iload #20
/*     */     //   1215: ldc 32768
/*     */     //   1217: iand
/*     */     //   1218: ifeq -> 1224
/*     */     //   1221: aconst_null
/*     */     //   1222: astore #15
/*     */     //   1224: iload #20
/*     */     //   1226: ldc 65536
/*     */     //   1228: iand
/*     */     //   1229: ifeq -> 1276
/*     */     //   1232: iconst_0
/*     */     //   1233: istore #16
/*     */     //   1235: goto -> 1276
/*     */     //   1238: aload #17
/*     */     //   1240: invokeinterface skipToGroupEnd : ()V
/*     */     //   1245: iload #20
/*     */     //   1247: bipush #32
/*     */     //   1249: iand
/*     */     //   1250: ifeq -> 1260
/*     */     //   1253: iload #21
/*     */     //   1255: ldc -458753
/*     */     //   1257: iand
/*     */     //   1258: istore #21
/*     */     //   1260: iload #20
/*     */     //   1262: sipush #1024
/*     */     //   1265: iand
/*     */     //   1266: ifeq -> 1276
/*     */     //   1269: iload #22
/*     */     //   1271: bipush #-15
/*     */     //   1273: iand
/*     */     //   1274: istore #22
/*     */     //   1276: aload #17
/*     */     //   1278: invokeinterface endDefaults : ()V
/*     */     //   1283: invokestatic isTraceInProgress : ()Z
/*     */     //   1286: ifeq -> 1300
/*     */     //   1289: ldc 1289451354
/*     */     //   1291: iload #21
/*     */     //   1293: iload #22
/*     */     //   1295: ldc 'org.jetbrains.jewel.ui.component.TextField (TextField.kt:63)'
/*     */     //   1297: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1300: aload_0
/*     */     //   1301: aload_1
/*     */     //   1302: iload_2
/*     */     //   1303: iload_3
/*     */     //   1304: aload #4
/*     */     //   1306: aload #5
/*     */     //   1308: aload #6
/*     */     //   1310: aload #7
/*     */     //   1312: getstatic androidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine.INSTANCE : Landroidx/compose/foundation/text/input/TextFieldLineLimits$SingleLine;
/*     */     //   1315: checkcast androidx/compose/foundation/text/input/TextFieldLineLimits
/*     */     //   1318: aload #8
/*     */     //   1320: aload #9
/*     */     //   1322: aload #10
/*     */     //   1324: checkcast org/jetbrains/jewel/ui/component/styling/InputFieldStyle
/*     */     //   1327: aload #11
/*     */     //   1329: aload #15
/*     */     //   1331: iload #16
/*     */     //   1333: ifne -> 1360
/*     */     //   1336: new org/jetbrains/jewel/ui/component/TextFieldKt$TextField$2
/*     */     //   1339: dup
/*     */     //   1340: aload #10
/*     */     //   1342: aload #5
/*     */     //   1344: aload_0
/*     */     //   1345: aload #12
/*     */     //   1347: aload #13
/*     */     //   1349: aload #14
/*     */     //   1351: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1354: checkcast androidx/compose/foundation/text/input/TextFieldDecorator
/*     */     //   1357: goto -> 1361
/*     */     //   1360: aconst_null
/*     */     //   1361: iconst_0
/*     */     //   1362: iconst_0
/*     */     //   1363: aload #17
/*     */     //   1365: iconst_0
/*     */     //   1366: iconst_1
/*     */     //   1367: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*     */     //   1370: aload #17
/*     */     //   1372: ldc 100663296
/*     */     //   1374: bipush #14
/*     */     //   1376: iload #21
/*     */     //   1378: iand
/*     */     //   1379: ior
/*     */     //   1380: bipush #112
/*     */     //   1382: iload #21
/*     */     //   1384: iand
/*     */     //   1385: ior
/*     */     //   1386: sipush #896
/*     */     //   1389: iload #21
/*     */     //   1391: iand
/*     */     //   1392: ior
/*     */     //   1393: sipush #7168
/*     */     //   1396: iload #21
/*     */     //   1398: iand
/*     */     //   1399: ior
/*     */     //   1400: ldc 57344
/*     */     //   1402: iload #21
/*     */     //   1404: iand
/*     */     //   1405: ior
/*     */     //   1406: ldc 458752
/*     */     //   1408: iload #21
/*     */     //   1410: iand
/*     */     //   1411: ior
/*     */     //   1412: ldc 3670016
/*     */     //   1414: iload #21
/*     */     //   1416: iand
/*     */     //   1417: ior
/*     */     //   1418: ldc 29360128
/*     */     //   1420: iload #21
/*     */     //   1422: iand
/*     */     //   1423: ior
/*     */     //   1424: ldc 1879048192
/*     */     //   1426: iload #21
/*     */     //   1428: iconst_3
/*     */     //   1429: ishl
/*     */     //   1430: iand
/*     */     //   1431: ior
/*     */     //   1432: bipush #14
/*     */     //   1434: iload #21
/*     */     //   1436: bipush #27
/*     */     //   1438: ishr
/*     */     //   1439: iand
/*     */     //   1440: bipush #112
/*     */     //   1442: iload #22
/*     */     //   1444: iconst_3
/*     */     //   1445: ishl
/*     */     //   1446: iand
/*     */     //   1447: ior
/*     */     //   1448: sipush #896
/*     */     //   1451: iload #22
/*     */     //   1453: iconst_3
/*     */     //   1454: ishl
/*     */     //   1455: iand
/*     */     //   1456: ior
/*     */     //   1457: sipush #7168
/*     */     //   1460: iload #22
/*     */     //   1462: bipush #6
/*     */     //   1464: ishr
/*     */     //   1465: iand
/*     */     //   1466: ior
/*     */     //   1467: ldc 32768
/*     */     //   1469: invokestatic InputField : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1472: invokestatic isTraceInProgress : ()Z
/*     */     //   1475: ifeq -> 1491
/*     */     //   1478: invokestatic traceEventEnd : ()V
/*     */     //   1481: goto -> 1491
/*     */     //   1484: aload #17
/*     */     //   1486: invokeinterface skipToGroupEnd : ()V
/*     */     //   1491: aload #17
/*     */     //   1493: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1498: dup
/*     */     //   1499: ifnull -> 1551
/*     */     //   1502: aload_0
/*     */     //   1503: aload_1
/*     */     //   1504: iload_2
/*     */     //   1505: iload_3
/*     */     //   1506: aload #4
/*     */     //   1508: aload #5
/*     */     //   1510: aload #6
/*     */     //   1512: aload #7
/*     */     //   1514: aload #8
/*     */     //   1516: aload #9
/*     */     //   1518: aload #10
/*     */     //   1520: aload #11
/*     */     //   1522: aload #12
/*     */     //   1524: aload #13
/*     */     //   1526: aload #14
/*     */     //   1528: aload #15
/*     */     //   1530: iload #16
/*     */     //   1532: iload #18
/*     */     //   1534: iload #19
/*     */     //   1536: iload #20
/*     */     //   1538: <illegal opcode> invoke : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/text/input/OutputTransformation;ZIII)Lkotlin/jvm/functions/Function2;
/*     */     //   1543: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1548: goto -> 1552
/*     */     //   1551: pop
/*     */     //   1552: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #64	-> 6
/*     */     //   #48	-> 937
/*     */     //   #49	-> 951
/*     */     //   #50	-> 961
/*     */     //   #51	-> 971
/*     */     //   #52	-> 982
/*     */     //   #53	-> 1009
/*     */     //   #54	-> 1026
/*     */     //   #55	-> 1038
/*     */     //   #56	-> 1050
/*     */     //   #346	-> 1069
/*     */     //   #347	-> 1081
/*     */     //   #348	-> 1092
/*     */     //   #56	-> 1095
/*     */     //   #348	-> 1098
/*     */     //   #349	-> 1100
/*     */     //   #350	-> 1109
/*     */     //   #351	-> 1114
/*     */     //   #347	-> 1116
/*     */     //   #346	-> 1117
/*     */     //   #346	-> 1118
/*     */     //   #56	-> 1119
/*     */     //   #57	-> 1144
/*     */     //   #58	-> 1172
/*     */     //   #59	-> 1186
/*     */     //   #60	-> 1198
/*     */     //   #61	-> 1210
/*     */     //   #62	-> 1221
/*     */     //   #63	-> 1232
/*     */     //   #64	-> 1297
/*     */     //   #66	-> 1300
/*     */     //   #67	-> 1301
/*     */     //   #68	-> 1302
/*     */     //   #69	-> 1303
/*     */     //   #70	-> 1304
/*     */     //   #71	-> 1306
/*     */     //   #72	-> 1308
/*     */     //   #73	-> 1310
/*     */     //   #74	-> 1312
/*     */     //   #75	-> 1318
/*     */     //   #76	-> 1320
/*     */     //   #77	-> 1322
/*     */     //   #78	-> 1327
/*     */     //   #79	-> 1329
/*     */     //   #81	-> 1331
/*     */     //   #82	-> 1336
/*     */     //   #98	-> 1360
/*     */     //   #100	-> 1367
/*     */     //   #65	-> 1469
/*     */     //   #102	-> 1484
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1095	3	29	$i$a$-cache-TextFieldKt$TextField$1	I
/*     */     //   1100	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1081	36	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1078	39	27	it$iv	Ljava/lang/Object;
/*     */     //   1069	50	26	$i$f$cache	I
/*     */     //   1066	53	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1066	53	25	invalid$iv	Z
/*     */     //   21	1532	21	$dirty	I
/*     */     //   25	1528	22	$dirty1	I
/*     */     //   0	1553	0	state	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	1553	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1553	2	enabled	Z
/*     */     //   0	1553	3	readOnly	Z
/*     */     //   0	1553	4	inputTransformation	Landroidx/compose/foundation/text/input/InputTransformation;
/*     */     //   0	1553	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1553	6	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1553	7	onKeyboardAction	Landroidx/compose/foundation/text/input/KeyboardActionHandler;
/*     */     //   0	1553	8	onTextLayout	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1553	9	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1553	10	style	Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   0	1553	11	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1553	12	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1553	13	leadingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1553	14	trailingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1553	15	outputTransformation	Landroidx/compose/foundation/text/input/OutputTransformation;
/*     */     //   0	1553	16	undecorated	Z
/*     */     //   0	1553	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1553	18	$changed	I
/*     */     //   0	1553	19	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"})
/*     */   static final class TextFieldKt$TextField$2
/*     */     implements TextFieldDecorator
/*     */   {
/*     */     TextFieldKt$TextField$2(TextFieldStyle $style, TextStyle $textStyle, TextFieldState $state, Function2<Composer, Integer, Unit> $placeholder, Function2<Composer, Integer, Unit> $leadingIcon, Function2<Composer, Integer, Unit> $trailingIcon) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */     public final void Decoration(Function2 innerTextField, Composer $composer, int $changed) {
/*  83 */       Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(260656266); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(260656266, $changed, -1, "org.jetbrains.jewel.ui.component.TextField.<no name provided>.Decoration (TextField.kt:82)");  long minSize = this.$style.getMetrics().getMinSize-MYxV2XQ();
/*     */       
/*  85 */       TextFieldKt.TextFieldDecorationBox-hYmLsZ8(
/*     */ 
/*     */           
/*  88 */           PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(minSize), DpSize.getHeight-D9Ej5fM(minSize)), this.$style.getMetrics().getContentPadding()), 
/*  89 */           innerTextField, 
/*  90 */           this.$textStyle, 
/*  91 */           this.$style.getColors().getPlaceholder-0d7_KjU(), (
/*  92 */           (this.$state.getText().length() == 0)) ? this.$placeholder : null, 
/*  93 */           this.$leadingIcon, 
/*  94 */           this.$trailingIcon, $composer, 0x70 & $changed << 3, 0);
/*     */       if (ComposerKt.isTraceInProgress()) {
/*     */         ComposerKt.traceEventEnd();
/*     */       }
/*     */       $composer.endReplaceGroup();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Please use TextField(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void TextField(@NotNull String value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable Outline outline, @Nullable Function2 placeholder, @Nullable Function2 leadingIcon, @Nullable Function2 trailingIcon, boolean undecorated, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, @Nullable Function1 onTextLayout, @Nullable TextFieldStyle style, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onValueChange'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #16
/*     */     //   16: ldc_w -265030922
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #16
/*     */     //   26: iload #17
/*     */     //   28: istore #20
/*     */     //   30: iload #18
/*     */     //   32: istore #21
/*     */     //   34: iload #19
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #20
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #20
/*     */     //   48: goto -> 80
/*     */     //   51: iload #17
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #20
/*     */     //   61: aload #16
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #20
/*     */     //   80: iload #19
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #20
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #20
/*     */     //   94: goto -> 128
/*     */     //   97: iload #17
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #20
/*     */     //   107: aload #16
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #20
/*     */     //   128: iload #19
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #20
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #20
/*     */     //   143: goto -> 180
/*     */     //   146: iload #17
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #20
/*     */     //   157: aload #16
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #20
/*     */     //   180: iload #19
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #20
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #20
/*     */     //   196: goto -> 233
/*     */     //   199: iload #17
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #20
/*     */     //   210: aload #16
/*     */     //   212: iload_3
/*     */     //   213: invokeinterface changed : (Z)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #20
/*     */     //   233: iload #19
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #20
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #20
/*     */     //   249: goto -> 287
/*     */     //   252: iload #17
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #20
/*     */     //   263: aload #16
/*     */     //   265: iload #4
/*     */     //   267: invokeinterface changed : (Z)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #20
/*     */     //   287: iload #19
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #20
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #20
/*     */     //   302: goto -> 337
/*     */     //   305: iload #17
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #20
/*     */     //   315: aload #16
/*     */     //   317: aload #5
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #20
/*     */     //   337: iload #19
/*     */     //   339: bipush #64
/*     */     //   341: iand
/*     */     //   342: ifeq -> 355
/*     */     //   345: iload #20
/*     */     //   347: ldc 1572864
/*     */     //   349: ior
/*     */     //   350: istore #20
/*     */     //   352: goto -> 387
/*     */     //   355: iload #17
/*     */     //   357: ldc 1572864
/*     */     //   359: iand
/*     */     //   360: ifne -> 387
/*     */     //   363: iload #20
/*     */     //   365: aload #16
/*     */     //   367: aload #6
/*     */     //   369: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   374: ifeq -> 382
/*     */     //   377: ldc 1048576
/*     */     //   379: goto -> 384
/*     */     //   382: ldc 524288
/*     */     //   384: ior
/*     */     //   385: istore #20
/*     */     //   387: iload #19
/*     */     //   389: sipush #128
/*     */     //   392: iand
/*     */     //   393: ifeq -> 406
/*     */     //   396: iload #20
/*     */     //   398: ldc 12582912
/*     */     //   400: ior
/*     */     //   401: istore #20
/*     */     //   403: goto -> 438
/*     */     //   406: iload #17
/*     */     //   408: ldc 12582912
/*     */     //   410: iand
/*     */     //   411: ifne -> 438
/*     */     //   414: iload #20
/*     */     //   416: aload #16
/*     */     //   418: aload #7
/*     */     //   420: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   425: ifeq -> 433
/*     */     //   428: ldc 8388608
/*     */     //   430: goto -> 435
/*     */     //   433: ldc 4194304
/*     */     //   435: ior
/*     */     //   436: istore #20
/*     */     //   438: iload #19
/*     */     //   440: sipush #256
/*     */     //   443: iand
/*     */     //   444: ifeq -> 457
/*     */     //   447: iload #20
/*     */     //   449: ldc 100663296
/*     */     //   451: ior
/*     */     //   452: istore #20
/*     */     //   454: goto -> 489
/*     */     //   457: iload #17
/*     */     //   459: ldc 100663296
/*     */     //   461: iand
/*     */     //   462: ifne -> 489
/*     */     //   465: iload #20
/*     */     //   467: aload #16
/*     */     //   469: aload #8
/*     */     //   471: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   476: ifeq -> 484
/*     */     //   479: ldc 67108864
/*     */     //   481: goto -> 486
/*     */     //   484: ldc 33554432
/*     */     //   486: ior
/*     */     //   487: istore #20
/*     */     //   489: iload #19
/*     */     //   491: sipush #512
/*     */     //   494: iand
/*     */     //   495: ifeq -> 508
/*     */     //   498: iload #20
/*     */     //   500: ldc 805306368
/*     */     //   502: ior
/*     */     //   503: istore #20
/*     */     //   505: goto -> 540
/*     */     //   508: iload #17
/*     */     //   510: ldc 805306368
/*     */     //   512: iand
/*     */     //   513: ifne -> 540
/*     */     //   516: iload #20
/*     */     //   518: aload #16
/*     */     //   520: iload #9
/*     */     //   522: invokeinterface changed : (Z)Z
/*     */     //   527: ifeq -> 535
/*     */     //   530: ldc 536870912
/*     */     //   532: goto -> 537
/*     */     //   535: ldc 268435456
/*     */     //   537: ior
/*     */     //   538: istore #20
/*     */     //   540: iload #19
/*     */     //   542: sipush #1024
/*     */     //   545: iand
/*     */     //   546: ifeq -> 559
/*     */     //   549: iload #21
/*     */     //   551: bipush #6
/*     */     //   553: ior
/*     */     //   554: istore #21
/*     */     //   556: goto -> 589
/*     */     //   559: iload #18
/*     */     //   561: bipush #6
/*     */     //   563: iand
/*     */     //   564: ifne -> 589
/*     */     //   567: iload #21
/*     */     //   569: aload #16
/*     */     //   571: aload #10
/*     */     //   573: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   578: ifeq -> 585
/*     */     //   581: iconst_4
/*     */     //   582: goto -> 586
/*     */     //   585: iconst_2
/*     */     //   586: ior
/*     */     //   587: istore #21
/*     */     //   589: iload #19
/*     */     //   591: sipush #2048
/*     */     //   594: iand
/*     */     //   595: ifeq -> 608
/*     */     //   598: iload #21
/*     */     //   600: bipush #48
/*     */     //   602: ior
/*     */     //   603: istore #21
/*     */     //   605: goto -> 640
/*     */     //   608: iload #18
/*     */     //   610: bipush #48
/*     */     //   612: iand
/*     */     //   613: ifne -> 640
/*     */     //   616: iload #21
/*     */     //   618: aload #16
/*     */     //   620: aload #11
/*     */     //   622: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   627: ifeq -> 635
/*     */     //   630: bipush #32
/*     */     //   632: goto -> 637
/*     */     //   635: bipush #16
/*     */     //   637: ior
/*     */     //   638: istore #21
/*     */     //   640: iload #18
/*     */     //   642: sipush #384
/*     */     //   645: iand
/*     */     //   646: ifne -> 684
/*     */     //   649: iload #21
/*     */     //   651: iload #19
/*     */     //   653: sipush #4096
/*     */     //   656: iand
/*     */     //   657: ifne -> 678
/*     */     //   660: aload #16
/*     */     //   662: aload #12
/*     */     //   664: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   669: ifeq -> 678
/*     */     //   672: sipush #256
/*     */     //   675: goto -> 681
/*     */     //   678: sipush #128
/*     */     //   681: ior
/*     */     //   682: istore #21
/*     */     //   684: iload #19
/*     */     //   686: sipush #8192
/*     */     //   689: iand
/*     */     //   690: ifeq -> 704
/*     */     //   693: iload #21
/*     */     //   695: sipush #3072
/*     */     //   698: ior
/*     */     //   699: istore #21
/*     */     //   701: goto -> 739
/*     */     //   704: iload #18
/*     */     //   706: sipush #3072
/*     */     //   709: iand
/*     */     //   710: ifne -> 739
/*     */     //   713: iload #21
/*     */     //   715: aload #16
/*     */     //   717: aload #13
/*     */     //   719: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   724: ifeq -> 733
/*     */     //   727: sipush #2048
/*     */     //   730: goto -> 736
/*     */     //   733: sipush #1024
/*     */     //   736: ior
/*     */     //   737: istore #21
/*     */     //   739: iload #18
/*     */     //   741: sipush #24576
/*     */     //   744: iand
/*     */     //   745: ifne -> 783
/*     */     //   748: iload #21
/*     */     //   750: iload #19
/*     */     //   752: sipush #16384
/*     */     //   755: iand
/*     */     //   756: ifne -> 777
/*     */     //   759: aload #16
/*     */     //   761: aload #14
/*     */     //   763: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   768: ifeq -> 777
/*     */     //   771: sipush #16384
/*     */     //   774: goto -> 780
/*     */     //   777: sipush #8192
/*     */     //   780: ior
/*     */     //   781: istore #21
/*     */     //   783: iload #19
/*     */     //   785: ldc 32768
/*     */     //   787: iand
/*     */     //   788: ifeq -> 801
/*     */     //   791: iload #21
/*     */     //   793: ldc 196608
/*     */     //   795: ior
/*     */     //   796: istore #21
/*     */     //   798: goto -> 833
/*     */     //   801: iload #18
/*     */     //   803: ldc 196608
/*     */     //   805: iand
/*     */     //   806: ifne -> 833
/*     */     //   809: iload #21
/*     */     //   811: aload #16
/*     */     //   813: aload #15
/*     */     //   815: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   820: ifeq -> 828
/*     */     //   823: ldc 131072
/*     */     //   825: goto -> 830
/*     */     //   828: ldc 65536
/*     */     //   830: ior
/*     */     //   831: istore #21
/*     */     //   833: iload #20
/*     */     //   835: ldc 306783379
/*     */     //   837: iand
/*     */     //   838: ldc 306783378
/*     */     //   840: if_icmpne -> 865
/*     */     //   843: iload #21
/*     */     //   845: ldc_w 74899
/*     */     //   848: iand
/*     */     //   849: ldc_w 74898
/*     */     //   852: if_icmpne -> 865
/*     */     //   855: aload #16
/*     */     //   857: invokeinterface getSkipping : ()Z
/*     */     //   862: ifne -> 1834
/*     */     //   865: aload #16
/*     */     //   867: invokeinterface startDefaults : ()V
/*     */     //   872: iload #17
/*     */     //   874: iconst_1
/*     */     //   875: iand
/*     */     //   876: ifeq -> 889
/*     */     //   879: aload #16
/*     */     //   881: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   886: ifeq -> 1276
/*     */     //   889: iload #19
/*     */     //   891: iconst_4
/*     */     //   892: iand
/*     */     //   893: ifeq -> 903
/*     */     //   896: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   899: checkcast androidx/compose/ui/Modifier
/*     */     //   902: astore_2
/*     */     //   903: iload #19
/*     */     //   905: bipush #8
/*     */     //   907: iand
/*     */     //   908: ifeq -> 913
/*     */     //   911: iconst_1
/*     */     //   912: istore_3
/*     */     //   913: iload #19
/*     */     //   915: bipush #16
/*     */     //   917: iand
/*     */     //   918: ifeq -> 924
/*     */     //   921: iconst_0
/*     */     //   922: istore #4
/*     */     //   924: iload #19
/*     */     //   926: bipush #32
/*     */     //   928: iand
/*     */     //   929: ifeq -> 937
/*     */     //   932: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   935: astore #5
/*     */     //   937: iload #19
/*     */     //   939: bipush #64
/*     */     //   941: iand
/*     */     //   942: ifeq -> 948
/*     */     //   945: aconst_null
/*     */     //   946: astore #6
/*     */     //   948: iload #19
/*     */     //   950: sipush #128
/*     */     //   953: iand
/*     */     //   954: ifeq -> 960
/*     */     //   957: aconst_null
/*     */     //   958: astore #7
/*     */     //   960: iload #19
/*     */     //   962: sipush #256
/*     */     //   965: iand
/*     */     //   966: ifeq -> 972
/*     */     //   969: aconst_null
/*     */     //   970: astore #8
/*     */     //   972: iload #19
/*     */     //   974: sipush #512
/*     */     //   977: iand
/*     */     //   978: ifeq -> 984
/*     */     //   981: iconst_0
/*     */     //   982: istore #9
/*     */     //   984: iload #19
/*     */     //   986: sipush #1024
/*     */     //   989: iand
/*     */     //   990: ifeq -> 1001
/*     */     //   993: getstatic androidx/compose/ui/text/input/VisualTransformation.Companion : Landroidx/compose/ui/text/input/VisualTransformation$Companion;
/*     */     //   996: invokevirtual getNone : ()Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   999: astore #10
/*     */     //   1001: iload #19
/*     */     //   1003: sipush #2048
/*     */     //   1006: iand
/*     */     //   1007: ifeq -> 1018
/*     */     //   1010: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1013: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1016: astore #11
/*     */     //   1018: iload #19
/*     */     //   1020: sipush #4096
/*     */     //   1023: iand
/*     */     //   1024: ifeq -> 1053
/*     */     //   1027: new androidx/compose/foundation/text/KeyboardActions
/*     */     //   1030: dup
/*     */     //   1031: aconst_null
/*     */     //   1032: aconst_null
/*     */     //   1033: aconst_null
/*     */     //   1034: aconst_null
/*     */     //   1035: aconst_null
/*     */     //   1036: aconst_null
/*     */     //   1037: bipush #63
/*     */     //   1039: aconst_null
/*     */     //   1040: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1043: astore #12
/*     */     //   1045: iload #21
/*     */     //   1047: sipush #-897
/*     */     //   1050: iand
/*     */     //   1051: istore #21
/*     */     //   1053: iload #19
/*     */     //   1055: sipush #8192
/*     */     //   1058: iand
/*     */     //   1059: ifeq -> 1150
/*     */     //   1062: aload #16
/*     */     //   1064: ldc_w -705808271
/*     */     //   1067: invokeinterface startReplaceGroup : (I)V
/*     */     //   1072: aload #16
/*     */     //   1074: astore #23
/*     */     //   1076: iconst_0
/*     */     //   1077: istore #24
/*     */     //   1079: iconst_0
/*     */     //   1080: istore #25
/*     */     //   1082: aload #23
/*     */     //   1084: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1089: astore #26
/*     */     //   1091: iconst_0
/*     */     //   1092: istore #27
/*     */     //   1094: aload #26
/*     */     //   1096: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1099: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1102: if_acmpne -> 1129
/*     */     //   1105: iconst_0
/*     */     //   1106: istore #28
/*     */     //   1108: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1113: astore #28
/*     */     //   1115: aload #23
/*     */     //   1117: aload #28
/*     */     //   1119: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1124: aload #28
/*     */     //   1126: goto -> 1131
/*     */     //   1129: aload #26
/*     */     //   1131: nop
/*     */     //   1132: nop
/*     */     //   1133: nop
/*     */     //   1134: checkcast kotlin/jvm/functions/Function1
/*     */     //   1137: astore #22
/*     */     //   1139: aload #16
/*     */     //   1141: invokeinterface endReplaceGroup : ()V
/*     */     //   1146: aload #22
/*     */     //   1148: astore #13
/*     */     //   1150: iload #19
/*     */     //   1152: sipush #16384
/*     */     //   1155: iand
/*     */     //   1156: ifeq -> 1179
/*     */     //   1159: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1162: aload #16
/*     */     //   1164: bipush #6
/*     */     //   1166: invokestatic getTextFieldStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   1169: astore #14
/*     */     //   1171: iload #21
/*     */     //   1173: ldc_w -57345
/*     */     //   1176: iand
/*     */     //   1177: istore #21
/*     */     //   1179: iload #19
/*     */     //   1181: ldc 32768
/*     */     //   1183: iand
/*     */     //   1184: ifeq -> 1317
/*     */     //   1187: aload #16
/*     */     //   1189: ldc_w -705804746
/*     */     //   1192: invokeinterface startReplaceGroup : (I)V
/*     */     //   1197: aload #16
/*     */     //   1199: astore #23
/*     */     //   1201: iconst_0
/*     */     //   1202: istore #24
/*     */     //   1204: iconst_0
/*     */     //   1205: istore #25
/*     */     //   1207: aload #23
/*     */     //   1209: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1214: astore #26
/*     */     //   1216: iconst_0
/*     */     //   1217: istore #27
/*     */     //   1219: aload #26
/*     */     //   1221: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1224: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1227: if_acmpne -> 1252
/*     */     //   1230: iconst_0
/*     */     //   1231: istore #28
/*     */     //   1233: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1236: astore #28
/*     */     //   1238: aload #23
/*     */     //   1240: aload #28
/*     */     //   1242: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1247: aload #28
/*     */     //   1249: goto -> 1254
/*     */     //   1252: aload #26
/*     */     //   1254: nop
/*     */     //   1255: nop
/*     */     //   1256: nop
/*     */     //   1257: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1260: astore #22
/*     */     //   1262: aload #16
/*     */     //   1264: invokeinterface endReplaceGroup : ()V
/*     */     //   1269: aload #22
/*     */     //   1271: astore #15
/*     */     //   1273: goto -> 1317
/*     */     //   1276: aload #16
/*     */     //   1278: invokeinterface skipToGroupEnd : ()V
/*     */     //   1283: iload #19
/*     */     //   1285: sipush #4096
/*     */     //   1288: iand
/*     */     //   1289: ifeq -> 1300
/*     */     //   1292: iload #21
/*     */     //   1294: sipush #-897
/*     */     //   1297: iand
/*     */     //   1298: istore #21
/*     */     //   1300: iload #19
/*     */     //   1302: sipush #16384
/*     */     //   1305: iand
/*     */     //   1306: ifeq -> 1317
/*     */     //   1309: iload #21
/*     */     //   1311: ldc_w -57345
/*     */     //   1314: iand
/*     */     //   1315: istore #21
/*     */     //   1317: aload #16
/*     */     //   1319: invokeinterface endDefaults : ()V
/*     */     //   1324: invokestatic isTraceInProgress : ()Z
/*     */     //   1327: ifeq -> 1343
/*     */     //   1330: ldc_w -265030922
/*     */     //   1333: iload #20
/*     */     //   1335: iload #21
/*     */     //   1337: ldc_w 'org.jetbrains.jewel.ui.component.TextField (TextField.kt:123)'
/*     */     //   1340: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1343: aload #16
/*     */     //   1345: ldc_w -705802296
/*     */     //   1348: invokeinterface startReplaceGroup : (I)V
/*     */     //   1353: aload #16
/*     */     //   1355: astore #24
/*     */     //   1357: iconst_0
/*     */     //   1358: istore #25
/*     */     //   1360: nop
/*     */     //   1361: iconst_0
/*     */     //   1362: istore #26
/*     */     //   1364: aload #24
/*     */     //   1366: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1371: astore #27
/*     */     //   1373: iconst_0
/*     */     //   1374: istore #28
/*     */     //   1376: aload #27
/*     */     //   1378: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1381: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1384: if_acmpne -> 1425
/*     */     //   1387: iconst_0
/*     */     //   1388: istore #29
/*     */     //   1390: new androidx/compose/ui/text/input/TextFieldValue
/*     */     //   1393: dup
/*     */     //   1394: aload_0
/*     */     //   1395: lconst_0
/*     */     //   1396: aconst_null
/*     */     //   1397: bipush #6
/*     */     //   1399: aconst_null
/*     */     //   1400: invokespecial <init> : (Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1403: aconst_null
/*     */     //   1404: iconst_2
/*     */     //   1405: aconst_null
/*     */     //   1406: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1409: astore #30
/*     */     //   1411: aload #24
/*     */     //   1413: aload #30
/*     */     //   1415: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1420: aload #30
/*     */     //   1422: goto -> 1427
/*     */     //   1425: aload #27
/*     */     //   1427: nop
/*     */     //   1428: nop
/*     */     //   1429: nop
/*     */     //   1430: checkcast androidx/compose/runtime/MutableState
/*     */     //   1433: astore #23
/*     */     //   1435: aload #16
/*     */     //   1437: invokeinterface endReplaceGroup : ()V
/*     */     //   1442: aload #23
/*     */     //   1444: astore #22
/*     */     //   1446: aload #22
/*     */     //   1448: invokestatic TextField$lambda$6 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1451: aload_0
/*     */     //   1452: lconst_0
/*     */     //   1453: aconst_null
/*     */     //   1454: bipush #6
/*     */     //   1456: aconst_null
/*     */     //   1457: invokestatic copy-3r_uNRQ$default : (Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1460: astore #23
/*     */     //   1462: aload #16
/*     */     //   1464: ldc_w -705797608
/*     */     //   1467: invokeinterface startReplaceGroup : (I)V
/*     */     //   1472: aload #16
/*     */     //   1474: astore #26
/*     */     //   1476: iload #20
/*     */     //   1478: bipush #14
/*     */     //   1480: iand
/*     */     //   1481: iconst_4
/*     */     //   1482: if_icmpne -> 1489
/*     */     //   1485: iconst_1
/*     */     //   1486: goto -> 1490
/*     */     //   1489: iconst_0
/*     */     //   1490: istore #27
/*     */     //   1492: nop
/*     */     //   1493: iconst_0
/*     */     //   1494: istore #28
/*     */     //   1496: aload #26
/*     */     //   1498: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1503: astore #29
/*     */     //   1505: iconst_0
/*     */     //   1506: istore #30
/*     */     //   1508: iload #27
/*     */     //   1510: ifne -> 1524
/*     */     //   1513: aload #29
/*     */     //   1515: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1518: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1521: if_acmpne -> 1550
/*     */     //   1524: iconst_0
/*     */     //   1525: istore #31
/*     */     //   1527: aload_0
/*     */     //   1528: aconst_null
/*     */     //   1529: iconst_2
/*     */     //   1530: aconst_null
/*     */     //   1531: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1534: astore #32
/*     */     //   1536: aload #26
/*     */     //   1538: aload #32
/*     */     //   1540: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1545: aload #32
/*     */     //   1547: goto -> 1552
/*     */     //   1550: aload #29
/*     */     //   1552: nop
/*     */     //   1553: nop
/*     */     //   1554: nop
/*     */     //   1555: checkcast androidx/compose/runtime/MutableState
/*     */     //   1558: astore #25
/*     */     //   1560: aload #16
/*     */     //   1562: invokeinterface endReplaceGroup : ()V
/*     */     //   1567: aload #25
/*     */     //   1569: astore #24
/*     */     //   1571: aload #23
/*     */     //   1573: aload #16
/*     */     //   1575: ldc_w -705792700
/*     */     //   1578: invokeinterface startReplaceGroup : (I)V
/*     */     //   1583: aload #16
/*     */     //   1585: astore #26
/*     */     //   1587: aload #16
/*     */     //   1589: aload #24
/*     */     //   1591: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1596: iload #20
/*     */     //   1598: bipush #112
/*     */     //   1600: iand
/*     */     //   1601: bipush #32
/*     */     //   1603: if_icmpne -> 1610
/*     */     //   1606: iconst_1
/*     */     //   1607: goto -> 1611
/*     */     //   1610: iconst_0
/*     */     //   1611: ior
/*     */     //   1612: istore #27
/*     */     //   1614: nop
/*     */     //   1615: iconst_0
/*     */     //   1616: istore #28
/*     */     //   1618: aload #26
/*     */     //   1620: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1625: astore #29
/*     */     //   1627: iconst_0
/*     */     //   1628: istore #30
/*     */     //   1630: iload #27
/*     */     //   1632: ifne -> 1646
/*     */     //   1635: aload #29
/*     */     //   1637: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1640: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1643: if_acmpne -> 1680
/*     */     //   1646: astore #33
/*     */     //   1648: iconst_0
/*     */     //   1649: istore #31
/*     */     //   1651: aload_1
/*     */     //   1652: aload #22
/*     */     //   1654: aload #24
/*     */     //   1656: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1661: aload #33
/*     */     //   1663: swap
/*     */     //   1664: astore #32
/*     */     //   1666: aload #26
/*     */     //   1668: aload #32
/*     */     //   1670: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1675: aload #32
/*     */     //   1677: goto -> 1682
/*     */     //   1680: aload #29
/*     */     //   1682: nop
/*     */     //   1683: nop
/*     */     //   1684: nop
/*     */     //   1685: checkcast kotlin/jvm/functions/Function1
/*     */     //   1688: astore #25
/*     */     //   1690: aload #16
/*     */     //   1692: invokeinterface endReplaceGroup : ()V
/*     */     //   1697: aload #25
/*     */     //   1699: aload_2
/*     */     //   1700: iload_3
/*     */     //   1701: iload #4
/*     */     //   1703: aload #5
/*     */     //   1705: aload #6
/*     */     //   1707: aload #7
/*     */     //   1709: aload #8
/*     */     //   1711: iload #9
/*     */     //   1713: aload #10
/*     */     //   1715: aload #11
/*     */     //   1717: aload #12
/*     */     //   1719: aload #13
/*     */     //   1721: aload #14
/*     */     //   1723: aconst_null
/*     */     //   1724: aload #15
/*     */     //   1726: aload #16
/*     */     //   1728: sipush #896
/*     */     //   1731: iload #20
/*     */     //   1733: iand
/*     */     //   1734: sipush #7168
/*     */     //   1737: iload #20
/*     */     //   1739: iand
/*     */     //   1740: ior
/*     */     //   1741: ldc 57344
/*     */     //   1743: iload #20
/*     */     //   1745: iand
/*     */     //   1746: ior
/*     */     //   1747: ldc 458752
/*     */     //   1749: iload #20
/*     */     //   1751: iand
/*     */     //   1752: ior
/*     */     //   1753: ldc 3670016
/*     */     //   1755: iload #20
/*     */     //   1757: iand
/*     */     //   1758: ior
/*     */     //   1759: ldc 29360128
/*     */     //   1761: iload #20
/*     */     //   1763: iand
/*     */     //   1764: ior
/*     */     //   1765: ldc_w 234881024
/*     */     //   1768: iload #20
/*     */     //   1770: iand
/*     */     //   1771: ior
/*     */     //   1772: ldc 1879048192
/*     */     //   1774: iload #20
/*     */     //   1776: iand
/*     */     //   1777: ior
/*     */     //   1778: bipush #14
/*     */     //   1780: iload #21
/*     */     //   1782: iand
/*     */     //   1783: bipush #112
/*     */     //   1785: iload #21
/*     */     //   1787: iand
/*     */     //   1788: ior
/*     */     //   1789: sipush #896
/*     */     //   1792: iload #21
/*     */     //   1794: iand
/*     */     //   1795: ior
/*     */     //   1796: sipush #7168
/*     */     //   1799: iload #21
/*     */     //   1801: iand
/*     */     //   1802: ior
/*     */     //   1803: ldc 57344
/*     */     //   1805: iload #21
/*     */     //   1807: iand
/*     */     //   1808: ior
/*     */     //   1809: ldc 3670016
/*     */     //   1811: iload #21
/*     */     //   1813: iconst_3
/*     */     //   1814: ishl
/*     */     //   1815: iand
/*     */     //   1816: ior
/*     */     //   1817: ldc 32768
/*     */     //   1819: invokestatic TextField : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1822: invokestatic isTraceInProgress : ()Z
/*     */     //   1825: ifeq -> 1841
/*     */     //   1828: invokestatic traceEventEnd : ()V
/*     */     //   1831: goto -> 1841
/*     */     //   1834: aload #16
/*     */     //   1836: invokeinterface skipToGroupEnd : ()V
/*     */     //   1841: aload #16
/*     */     //   1843: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1848: dup
/*     */     //   1849: ifnull -> 1899
/*     */     //   1852: aload_0
/*     */     //   1853: aload_1
/*     */     //   1854: aload_2
/*     */     //   1855: iload_3
/*     */     //   1856: iload #4
/*     */     //   1858: aload #5
/*     */     //   1860: aload #6
/*     */     //   1862: aload #7
/*     */     //   1864: aload #8
/*     */     //   1866: iload #9
/*     */     //   1868: aload #10
/*     */     //   1870: aload #11
/*     */     //   1872: aload #12
/*     */     //   1874: aload #13
/*     */     //   1876: aload #14
/*     */     //   1878: aload #15
/*     */     //   1880: iload #17
/*     */     //   1882: iload #18
/*     */     //   1884: iload #19
/*     */     //   1886: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1891: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1896: goto -> 1900
/*     */     //   1899: pop
/*     */     //   1900: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 14
/*     */     //   #110	-> 896
/*     */     //   #111	-> 911
/*     */     //   #112	-> 921
/*     */     //   #113	-> 932
/*     */     //   #114	-> 945
/*     */     //   #115	-> 957
/*     */     //   #116	-> 969
/*     */     //   #117	-> 981
/*     */     //   #118	-> 993
/*     */     //   #119	-> 1010
/*     */     //   #120	-> 1027
/*     */     //   #121	-> 1062
/*     */     //   #352	-> 1082
/*     */     //   #353	-> 1094
/*     */     //   #354	-> 1105
/*     */     //   #354	-> 1113
/*     */     //   #355	-> 1115
/*     */     //   #356	-> 1124
/*     */     //   #357	-> 1129
/*     */     //   #353	-> 1131
/*     */     //   #352	-> 1132
/*     */     //   #352	-> 1133
/*     */     //   #121	-> 1134
/*     */     //   #122	-> 1159
/*     */     //   #123	-> 1187
/*     */     //   #358	-> 1207
/*     */     //   #359	-> 1219
/*     */     //   #360	-> 1230
/*     */     //   #123	-> 1233
/*     */     //   #360	-> 1236
/*     */     //   #361	-> 1238
/*     */     //   #362	-> 1247
/*     */     //   #363	-> 1252
/*     */     //   #359	-> 1254
/*     */     //   #358	-> 1255
/*     */     //   #358	-> 1256
/*     */     //   #123	-> 1257
/*     */     //   #124	-> 1340
/*     */     //   #125	-> 1360
/*     */     //   #364	-> 1364
/*     */     //   #365	-> 1376
/*     */     //   #366	-> 1387
/*     */     //   #125	-> 1390
/*     */     //   #366	-> 1409
/*     */     //   #367	-> 1411
/*     */     //   #368	-> 1420
/*     */     //   #369	-> 1425
/*     */     //   #365	-> 1427
/*     */     //   #364	-> 1428
/*     */     //   #364	-> 1429
/*     */     //   #125	-> 1430
/*     */     //   #126	-> 1446
/*     */     //   #127	-> 1492
/*     */     //   #370	-> 1496
/*     */     //   #371	-> 1508
/*     */     //   #372	-> 1524
/*     */     //   #127	-> 1527
/*     */     //   #372	-> 1534
/*     */     //   #373	-> 1536
/*     */     //   #374	-> 1545
/*     */     //   #375	-> 1550
/*     */     //   #371	-> 1552
/*     */     //   #370	-> 1553
/*     */     //   #370	-> 1554
/*     */     //   #127	-> 1555
/*     */     //   #131	-> 1571
/*     */     //   #132	-> 1614
/*     */     //   #376	-> 1618
/*     */     //   #377	-> 1630
/*     */     //   #378	-> 1646
/*     */     //   #132	-> 1651
/*     */     //   #378	-> 1664
/*     */     //   #379	-> 1666
/*     */     //   #380	-> 1675
/*     */     //   #381	-> 1680
/*     */     //   #377	-> 1682
/*     */     //   #376	-> 1683
/*     */     //   #376	-> 1684
/*     */     //   #132	-> 1685
/*     */     //   #142	-> 1699
/*     */     //   #143	-> 1700
/*     */     //   #144	-> 1701
/*     */     //   #145	-> 1703
/*     */     //   #146	-> 1705
/*     */     //   #148	-> 1707
/*     */     //   #147	-> 1709
/*     */     //   #149	-> 1711
/*     */     //   #150	-> 1713
/*     */     //   #151	-> 1715
/*     */     //   #152	-> 1717
/*     */     //   #153	-> 1719
/*     */     //   #154	-> 1721
/*     */     //   #155	-> 1724
/*     */     //   #130	-> 1819
/*     */     //   #157	-> 1834
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1108	5	28	$i$a$-cache-TextFieldKt$TextField$4	I
/*     */     //   1115	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1094	38	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1091	41	26	it$iv	Ljava/lang/Object;
/*     */     //   1082	52	25	$i$f$cache	I
/*     */     //   1079	55	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1079	55	24	invalid$iv	Z
/*     */     //   1233	3	28	$i$a$-cache-TextFieldKt$TextField$5	I
/*     */     //   1238	11	28	value$iv	Ljava/lang/Object;
/*     */     //   1219	36	27	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1216	39	26	it$iv	Ljava/lang/Object;
/*     */     //   1207	50	25	$i$f$cache	I
/*     */     //   1204	53	23	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1204	53	24	invalid$iv	Z
/*     */     //   1390	19	29	$i$a$-cache-TextFieldKt$TextField$textFieldValueState$2	I
/*     */     //   1411	11	30	value$iv	Ljava/lang/Object;
/*     */     //   1376	52	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1373	55	27	it$iv	Ljava/lang/Object;
/*     */     //   1364	66	26	$i$f$cache	I
/*     */     //   1361	69	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1361	69	25	invalid$iv	Z
/*     */     //   1527	7	31	$i$a$-cache-TextFieldKt$TextField$lastTextValue$2	I
/*     */     //   1536	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1508	45	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1505	48	29	it$iv	Ljava/lang/Object;
/*     */     //   1496	59	28	$i$f$cache	I
/*     */     //   1493	62	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1493	62	27	invalid$iv	Z
/*     */     //   1651	10	31	$i$a$-cache-TextFieldKt$TextField$6	I
/*     */     //   1666	11	32	value$iv	Ljava/lang/Object;
/*     */     //   1630	53	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1627	56	29	it$iv	Ljava/lang/Object;
/*     */     //   1618	67	28	$i$f$cache	I
/*     */     //   1615	70	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1615	70	27	invalid$iv	Z
/*     */     //   1446	385	22	textFieldValueState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1462	369	23	textFieldValue	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1571	260	24	lastTextValue$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   30	1871	20	$dirty	I
/*     */     //   34	1867	21	$dirty1	I
/*     */     //   0	1901	0	value	Ljava/lang/String;
/*     */     //   0	1901	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1901	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1901	3	enabled	Z
/*     */     //   0	1901	4	readOnly	Z
/*     */     //   0	1901	5	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1901	6	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1901	7	leadingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1901	8	trailingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1901	9	undecorated	Z
/*     */     //   0	1901	10	visualTransformation	Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   0	1901	11	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1901	12	keyboardActions	Landroidx/compose/foundation/text/KeyboardActions;
/*     */     //   0	1901	13	onTextLayout	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1901	14	style	Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   0	1901	15	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1901	16	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1901	17	$changed	I
/*     */     //   0	1901	18	$changed1	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit TextField$lambda$3$lambda$2(TextLayoutResult it) {
/* 121 */     Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final TextFieldValue TextField$lambda$6(MutableState $textFieldValueState$delegate) {
/* 125 */     State state = (State)$textFieldValueState$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 588 */       (TextFieldValue)state.getValue(); } private static final void TextField$lambda$7(MutableState $textFieldValueState$delegate, TextFieldValue <set-?>) { MutableState mutableState = $textFieldValueState$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 589 */     mutableState.setValue(<set-?>); } private static final String TextField$lambda$9(MutableState $lastTextValue$delegate) { State state = (State)$lastTextValue$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 591 */     return (String)state.getValue(); } private static final void TextField$lambda$10(MutableState $lastTextValue$delegate, String <set-?>) { MutableState mutableState = $lastTextValue$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 592 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private static final Unit TextField$lambda$12$lambda$11(Function1 $onValueChange, MutableState<TextFieldValue> $textFieldValueState$delegate, MutableState<String> $lastTextValue$delegate, TextFieldValue newTextFieldValueState) {
/*     */     Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
/*     */     TextField$lambda$7($textFieldValueState$delegate, newTextFieldValueState);
/*     */     boolean stringChangedSinceLastInvocation = !Intrinsics.areEqual(TextField$lambda$9($lastTextValue$delegate), newTextFieldValueState.getText());
/*     */     TextField$lambda$10($lastTextValue$delegate, newTextFieldValueState.getText());
/*     */     if (stringChangedSinceLastInvocation)
/*     */       $onValueChange.invoke(newTextFieldValueState.getText()); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextField$lambda$15$lambda$14(TextLayoutResult it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Please use TextField(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   public static final void TextField(@NotNull TextFieldValue value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable Outline outline, @Nullable Function2 placeholder, @Nullable Function2 leadingIcon, @Nullable Function2 trailingIcon, boolean undecorated, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, @Nullable Function1 onTextLayout, @Nullable TextFieldStyle style, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource interactionSource, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onValueChange'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #17
/*     */     //   16: ldc_w 142051665
/*     */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   24: astore #17
/*     */     //   26: iload #18
/*     */     //   28: istore #21
/*     */     //   30: iload #19
/*     */     //   32: istore #22
/*     */     //   34: iload #20
/*     */     //   36: iconst_1
/*     */     //   37: iand
/*     */     //   38: ifeq -> 51
/*     */     //   41: iload #21
/*     */     //   43: bipush #6
/*     */     //   45: ior
/*     */     //   46: istore #21
/*     */     //   48: goto -> 80
/*     */     //   51: iload #18
/*     */     //   53: bipush #6
/*     */     //   55: iand
/*     */     //   56: ifne -> 80
/*     */     //   59: iload #21
/*     */     //   61: aload #17
/*     */     //   63: aload_0
/*     */     //   64: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   69: ifeq -> 76
/*     */     //   72: iconst_4
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_2
/*     */     //   77: ior
/*     */     //   78: istore #21
/*     */     //   80: iload #20
/*     */     //   82: iconst_2
/*     */     //   83: iand
/*     */     //   84: ifeq -> 97
/*     */     //   87: iload #21
/*     */     //   89: bipush #48
/*     */     //   91: ior
/*     */     //   92: istore #21
/*     */     //   94: goto -> 128
/*     */     //   97: iload #18
/*     */     //   99: bipush #48
/*     */     //   101: iand
/*     */     //   102: ifne -> 128
/*     */     //   105: iload #21
/*     */     //   107: aload #17
/*     */     //   109: aload_1
/*     */     //   110: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   115: ifeq -> 123
/*     */     //   118: bipush #32
/*     */     //   120: goto -> 125
/*     */     //   123: bipush #16
/*     */     //   125: ior
/*     */     //   126: istore #21
/*     */     //   128: iload #20
/*     */     //   130: iconst_4
/*     */     //   131: iand
/*     */     //   132: ifeq -> 146
/*     */     //   135: iload #21
/*     */     //   137: sipush #384
/*     */     //   140: ior
/*     */     //   141: istore #21
/*     */     //   143: goto -> 180
/*     */     //   146: iload #18
/*     */     //   148: sipush #384
/*     */     //   151: iand
/*     */     //   152: ifne -> 180
/*     */     //   155: iload #21
/*     */     //   157: aload #17
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   165: ifeq -> 174
/*     */     //   168: sipush #256
/*     */     //   171: goto -> 177
/*     */     //   174: sipush #128
/*     */     //   177: ior
/*     */     //   178: istore #21
/*     */     //   180: iload #20
/*     */     //   182: bipush #8
/*     */     //   184: iand
/*     */     //   185: ifeq -> 199
/*     */     //   188: iload #21
/*     */     //   190: sipush #3072
/*     */     //   193: ior
/*     */     //   194: istore #21
/*     */     //   196: goto -> 233
/*     */     //   199: iload #18
/*     */     //   201: sipush #3072
/*     */     //   204: iand
/*     */     //   205: ifne -> 233
/*     */     //   208: iload #21
/*     */     //   210: aload #17
/*     */     //   212: iload_3
/*     */     //   213: invokeinterface changed : (Z)Z
/*     */     //   218: ifeq -> 227
/*     */     //   221: sipush #2048
/*     */     //   224: goto -> 230
/*     */     //   227: sipush #1024
/*     */     //   230: ior
/*     */     //   231: istore #21
/*     */     //   233: iload #20
/*     */     //   235: bipush #16
/*     */     //   237: iand
/*     */     //   238: ifeq -> 252
/*     */     //   241: iload #21
/*     */     //   243: sipush #24576
/*     */     //   246: ior
/*     */     //   247: istore #21
/*     */     //   249: goto -> 287
/*     */     //   252: iload #18
/*     */     //   254: sipush #24576
/*     */     //   257: iand
/*     */     //   258: ifne -> 287
/*     */     //   261: iload #21
/*     */     //   263: aload #17
/*     */     //   265: iload #4
/*     */     //   267: invokeinterface changed : (Z)Z
/*     */     //   272: ifeq -> 281
/*     */     //   275: sipush #16384
/*     */     //   278: goto -> 284
/*     */     //   281: sipush #8192
/*     */     //   284: ior
/*     */     //   285: istore #21
/*     */     //   287: iload #20
/*     */     //   289: bipush #32
/*     */     //   291: iand
/*     */     //   292: ifeq -> 305
/*     */     //   295: iload #21
/*     */     //   297: ldc 196608
/*     */     //   299: ior
/*     */     //   300: istore #21
/*     */     //   302: goto -> 337
/*     */     //   305: iload #18
/*     */     //   307: ldc 196608
/*     */     //   309: iand
/*     */     //   310: ifne -> 337
/*     */     //   313: iload #21
/*     */     //   315: aload #17
/*     */     //   317: aload #5
/*     */     //   319: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   324: ifeq -> 332
/*     */     //   327: ldc 131072
/*     */     //   329: goto -> 334
/*     */     //   332: ldc 65536
/*     */     //   334: ior
/*     */     //   335: istore #21
/*     */     //   337: iload #20
/*     */     //   339: bipush #64
/*     */     //   341: iand
/*     */     //   342: ifeq -> 355
/*     */     //   345: iload #21
/*     */     //   347: ldc 1572864
/*     */     //   349: ior
/*     */     //   350: istore #21
/*     */     //   352: goto -> 387
/*     */     //   355: iload #18
/*     */     //   357: ldc 1572864
/*     */     //   359: iand
/*     */     //   360: ifne -> 387
/*     */     //   363: iload #21
/*     */     //   365: aload #17
/*     */     //   367: aload #6
/*     */     //   369: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   374: ifeq -> 382
/*     */     //   377: ldc 1048576
/*     */     //   379: goto -> 384
/*     */     //   382: ldc 524288
/*     */     //   384: ior
/*     */     //   385: istore #21
/*     */     //   387: iload #20
/*     */     //   389: sipush #128
/*     */     //   392: iand
/*     */     //   393: ifeq -> 406
/*     */     //   396: iload #21
/*     */     //   398: ldc 12582912
/*     */     //   400: ior
/*     */     //   401: istore #21
/*     */     //   403: goto -> 438
/*     */     //   406: iload #18
/*     */     //   408: ldc 12582912
/*     */     //   410: iand
/*     */     //   411: ifne -> 438
/*     */     //   414: iload #21
/*     */     //   416: aload #17
/*     */     //   418: aload #7
/*     */     //   420: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   425: ifeq -> 433
/*     */     //   428: ldc 8388608
/*     */     //   430: goto -> 435
/*     */     //   433: ldc 4194304
/*     */     //   435: ior
/*     */     //   436: istore #21
/*     */     //   438: iload #20
/*     */     //   440: sipush #256
/*     */     //   443: iand
/*     */     //   444: ifeq -> 457
/*     */     //   447: iload #21
/*     */     //   449: ldc 100663296
/*     */     //   451: ior
/*     */     //   452: istore #21
/*     */     //   454: goto -> 489
/*     */     //   457: iload #18
/*     */     //   459: ldc 100663296
/*     */     //   461: iand
/*     */     //   462: ifne -> 489
/*     */     //   465: iload #21
/*     */     //   467: aload #17
/*     */     //   469: aload #8
/*     */     //   471: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   476: ifeq -> 484
/*     */     //   479: ldc 67108864
/*     */     //   481: goto -> 486
/*     */     //   484: ldc 33554432
/*     */     //   486: ior
/*     */     //   487: istore #21
/*     */     //   489: iload #20
/*     */     //   491: sipush #512
/*     */     //   494: iand
/*     */     //   495: ifeq -> 508
/*     */     //   498: iload #21
/*     */     //   500: ldc 805306368
/*     */     //   502: ior
/*     */     //   503: istore #21
/*     */     //   505: goto -> 540
/*     */     //   508: iload #18
/*     */     //   510: ldc 805306368
/*     */     //   512: iand
/*     */     //   513: ifne -> 540
/*     */     //   516: iload #21
/*     */     //   518: aload #17
/*     */     //   520: iload #9
/*     */     //   522: invokeinterface changed : (Z)Z
/*     */     //   527: ifeq -> 535
/*     */     //   530: ldc 536870912
/*     */     //   532: goto -> 537
/*     */     //   535: ldc 268435456
/*     */     //   537: ior
/*     */     //   538: istore #21
/*     */     //   540: iload #20
/*     */     //   542: sipush #1024
/*     */     //   545: iand
/*     */     //   546: ifeq -> 559
/*     */     //   549: iload #22
/*     */     //   551: bipush #6
/*     */     //   553: ior
/*     */     //   554: istore #22
/*     */     //   556: goto -> 589
/*     */     //   559: iload #19
/*     */     //   561: bipush #6
/*     */     //   563: iand
/*     */     //   564: ifne -> 589
/*     */     //   567: iload #22
/*     */     //   569: aload #17
/*     */     //   571: aload #10
/*     */     //   573: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   578: ifeq -> 585
/*     */     //   581: iconst_4
/*     */     //   582: goto -> 586
/*     */     //   585: iconst_2
/*     */     //   586: ior
/*     */     //   587: istore #22
/*     */     //   589: iload #20
/*     */     //   591: sipush #2048
/*     */     //   594: iand
/*     */     //   595: ifeq -> 608
/*     */     //   598: iload #22
/*     */     //   600: bipush #48
/*     */     //   602: ior
/*     */     //   603: istore #22
/*     */     //   605: goto -> 640
/*     */     //   608: iload #19
/*     */     //   610: bipush #48
/*     */     //   612: iand
/*     */     //   613: ifne -> 640
/*     */     //   616: iload #22
/*     */     //   618: aload #17
/*     */     //   620: aload #11
/*     */     //   622: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   627: ifeq -> 635
/*     */     //   630: bipush #32
/*     */     //   632: goto -> 637
/*     */     //   635: bipush #16
/*     */     //   637: ior
/*     */     //   638: istore #22
/*     */     //   640: iload #19
/*     */     //   642: sipush #384
/*     */     //   645: iand
/*     */     //   646: ifne -> 684
/*     */     //   649: iload #22
/*     */     //   651: iload #20
/*     */     //   653: sipush #4096
/*     */     //   656: iand
/*     */     //   657: ifne -> 678
/*     */     //   660: aload #17
/*     */     //   662: aload #12
/*     */     //   664: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   669: ifeq -> 678
/*     */     //   672: sipush #256
/*     */     //   675: goto -> 681
/*     */     //   678: sipush #128
/*     */     //   681: ior
/*     */     //   682: istore #22
/*     */     //   684: iload #20
/*     */     //   686: sipush #8192
/*     */     //   689: iand
/*     */     //   690: ifeq -> 704
/*     */     //   693: iload #22
/*     */     //   695: sipush #3072
/*     */     //   698: ior
/*     */     //   699: istore #22
/*     */     //   701: goto -> 739
/*     */     //   704: iload #19
/*     */     //   706: sipush #3072
/*     */     //   709: iand
/*     */     //   710: ifne -> 739
/*     */     //   713: iload #22
/*     */     //   715: aload #17
/*     */     //   717: aload #13
/*     */     //   719: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   724: ifeq -> 733
/*     */     //   727: sipush #2048
/*     */     //   730: goto -> 736
/*     */     //   733: sipush #1024
/*     */     //   736: ior
/*     */     //   737: istore #22
/*     */     //   739: iload #19
/*     */     //   741: sipush #24576
/*     */     //   744: iand
/*     */     //   745: ifne -> 783
/*     */     //   748: iload #22
/*     */     //   750: iload #20
/*     */     //   752: sipush #16384
/*     */     //   755: iand
/*     */     //   756: ifne -> 777
/*     */     //   759: aload #17
/*     */     //   761: aload #14
/*     */     //   763: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   768: ifeq -> 777
/*     */     //   771: sipush #16384
/*     */     //   774: goto -> 780
/*     */     //   777: sipush #8192
/*     */     //   780: ior
/*     */     //   781: istore #22
/*     */     //   783: iload #19
/*     */     //   785: ldc 196608
/*     */     //   787: iand
/*     */     //   788: ifne -> 823
/*     */     //   791: iload #22
/*     */     //   793: iload #20
/*     */     //   795: ldc 32768
/*     */     //   797: iand
/*     */     //   798: ifne -> 818
/*     */     //   801: aload #17
/*     */     //   803: aload #15
/*     */     //   805: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   810: ifeq -> 818
/*     */     //   813: ldc 131072
/*     */     //   815: goto -> 820
/*     */     //   818: ldc 65536
/*     */     //   820: ior
/*     */     //   821: istore #22
/*     */     //   823: iload #20
/*     */     //   825: ldc 65536
/*     */     //   827: iand
/*     */     //   828: ifeq -> 841
/*     */     //   831: iload #22
/*     */     //   833: ldc 1572864
/*     */     //   835: ior
/*     */     //   836: istore #22
/*     */     //   838: goto -> 873
/*     */     //   841: iload #19
/*     */     //   843: ldc 1572864
/*     */     //   845: iand
/*     */     //   846: ifne -> 873
/*     */     //   849: iload #22
/*     */     //   851: aload #17
/*     */     //   853: aload #16
/*     */     //   855: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   860: ifeq -> 868
/*     */     //   863: ldc 1048576
/*     */     //   865: goto -> 870
/*     */     //   868: ldc 524288
/*     */     //   870: ior
/*     */     //   871: istore #22
/*     */     //   873: iload #21
/*     */     //   875: ldc 306783379
/*     */     //   877: iand
/*     */     //   878: ldc 306783378
/*     */     //   880: if_icmpne -> 903
/*     */     //   883: iload #22
/*     */     //   885: ldc 599187
/*     */     //   887: iand
/*     */     //   888: ldc 599186
/*     */     //   890: if_icmpne -> 903
/*     */     //   893: aload #17
/*     */     //   895: invokeinterface getSkipping : ()Z
/*     */     //   900: ifne -> 1609
/*     */     //   903: aload #17
/*     */     //   905: invokeinterface startDefaults : ()V
/*     */     //   910: iload #18
/*     */     //   912: iconst_1
/*     */     //   913: iand
/*     */     //   914: ifeq -> 927
/*     */     //   917: aload #17
/*     */     //   919: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   924: ifeq -> 1341
/*     */     //   927: iload #20
/*     */     //   929: iconst_4
/*     */     //   930: iand
/*     */     //   931: ifeq -> 941
/*     */     //   934: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   937: checkcast androidx/compose/ui/Modifier
/*     */     //   940: astore_2
/*     */     //   941: iload #20
/*     */     //   943: bipush #8
/*     */     //   945: iand
/*     */     //   946: ifeq -> 951
/*     */     //   949: iconst_1
/*     */     //   950: istore_3
/*     */     //   951: iload #20
/*     */     //   953: bipush #16
/*     */     //   955: iand
/*     */     //   956: ifeq -> 962
/*     */     //   959: iconst_0
/*     */     //   960: istore #4
/*     */     //   962: iload #20
/*     */     //   964: bipush #32
/*     */     //   966: iand
/*     */     //   967: ifeq -> 975
/*     */     //   970: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   973: astore #5
/*     */     //   975: iload #20
/*     */     //   977: bipush #64
/*     */     //   979: iand
/*     */     //   980: ifeq -> 986
/*     */     //   983: aconst_null
/*     */     //   984: astore #6
/*     */     //   986: iload #20
/*     */     //   988: sipush #128
/*     */     //   991: iand
/*     */     //   992: ifeq -> 998
/*     */     //   995: aconst_null
/*     */     //   996: astore #7
/*     */     //   998: iload #20
/*     */     //   1000: sipush #256
/*     */     //   1003: iand
/*     */     //   1004: ifeq -> 1010
/*     */     //   1007: aconst_null
/*     */     //   1008: astore #8
/*     */     //   1010: iload #20
/*     */     //   1012: sipush #512
/*     */     //   1015: iand
/*     */     //   1016: ifeq -> 1022
/*     */     //   1019: iconst_0
/*     */     //   1020: istore #9
/*     */     //   1022: iload #20
/*     */     //   1024: sipush #1024
/*     */     //   1027: iand
/*     */     //   1028: ifeq -> 1039
/*     */     //   1031: getstatic androidx/compose/ui/text/input/VisualTransformation.Companion : Landroidx/compose/ui/text/input/VisualTransformation$Companion;
/*     */     //   1034: invokevirtual getNone : ()Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   1037: astore #10
/*     */     //   1039: iload #20
/*     */     //   1041: sipush #2048
/*     */     //   1044: iand
/*     */     //   1045: ifeq -> 1056
/*     */     //   1048: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1051: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1054: astore #11
/*     */     //   1056: iload #20
/*     */     //   1058: sipush #4096
/*     */     //   1061: iand
/*     */     //   1062: ifeq -> 1091
/*     */     //   1065: new androidx/compose/foundation/text/KeyboardActions
/*     */     //   1068: dup
/*     */     //   1069: aconst_null
/*     */     //   1070: aconst_null
/*     */     //   1071: aconst_null
/*     */     //   1072: aconst_null
/*     */     //   1073: aconst_null
/*     */     //   1074: aconst_null
/*     */     //   1075: bipush #63
/*     */     //   1077: aconst_null
/*     */     //   1078: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1081: astore #12
/*     */     //   1083: iload #22
/*     */     //   1085: sipush #-897
/*     */     //   1088: iand
/*     */     //   1089: istore #22
/*     */     //   1091: iload #20
/*     */     //   1093: sipush #8192
/*     */     //   1096: iand
/*     */     //   1097: ifeq -> 1188
/*     */     //   1100: aload #17
/*     */     //   1102: ldc_w -705735983
/*     */     //   1105: invokeinterface startReplaceGroup : (I)V
/*     */     //   1110: aload #17
/*     */     //   1112: astore #24
/*     */     //   1114: iconst_0
/*     */     //   1115: istore #25
/*     */     //   1117: iconst_0
/*     */     //   1118: istore #26
/*     */     //   1120: aload #24
/*     */     //   1122: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1127: astore #27
/*     */     //   1129: iconst_0
/*     */     //   1130: istore #28
/*     */     //   1132: aload #27
/*     */     //   1134: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1137: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1140: if_acmpne -> 1167
/*     */     //   1143: iconst_0
/*     */     //   1144: istore #29
/*     */     //   1146: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1151: astore #29
/*     */     //   1153: aload #24
/*     */     //   1155: aload #29
/*     */     //   1157: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1162: aload #29
/*     */     //   1164: goto -> 1169
/*     */     //   1167: aload #27
/*     */     //   1169: nop
/*     */     //   1170: nop
/*     */     //   1171: nop
/*     */     //   1172: checkcast kotlin/jvm/functions/Function1
/*     */     //   1175: astore #23
/*     */     //   1177: aload #17
/*     */     //   1179: invokeinterface endReplaceGroup : ()V
/*     */     //   1184: aload #23
/*     */     //   1186: astore #13
/*     */     //   1188: iload #20
/*     */     //   1190: sipush #16384
/*     */     //   1193: iand
/*     */     //   1194: ifeq -> 1217
/*     */     //   1197: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1200: aload #17
/*     */     //   1202: bipush #6
/*     */     //   1204: invokestatic getTextFieldStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   1207: astore #14
/*     */     //   1209: iload #22
/*     */     //   1211: ldc_w -57345
/*     */     //   1214: iand
/*     */     //   1215: istore #22
/*     */     //   1217: iload #20
/*     */     //   1219: ldc 32768
/*     */     //   1221: iand
/*     */     //   1222: ifeq -> 1244
/*     */     //   1225: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1228: aload #17
/*     */     //   1230: bipush #6
/*     */     //   1232: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1235: astore #15
/*     */     //   1237: iload #22
/*     */     //   1239: ldc -458753
/*     */     //   1241: iand
/*     */     //   1242: istore #22
/*     */     //   1244: iload #20
/*     */     //   1246: ldc 65536
/*     */     //   1248: iand
/*     */     //   1249: ifeq -> 1397
/*     */     //   1252: aload #17
/*     */     //   1254: ldc_w -705730666
/*     */     //   1257: invokeinterface startReplaceGroup : (I)V
/*     */     //   1262: aload #17
/*     */     //   1264: astore #24
/*     */     //   1266: iconst_0
/*     */     //   1267: istore #25
/*     */     //   1269: iconst_0
/*     */     //   1270: istore #26
/*     */     //   1272: aload #24
/*     */     //   1274: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1279: astore #27
/*     */     //   1281: iconst_0
/*     */     //   1282: istore #28
/*     */     //   1284: aload #27
/*     */     //   1286: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1289: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1292: if_acmpne -> 1317
/*     */     //   1295: iconst_0
/*     */     //   1296: istore #29
/*     */     //   1298: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1301: astore #29
/*     */     //   1303: aload #24
/*     */     //   1305: aload #29
/*     */     //   1307: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1312: aload #29
/*     */     //   1314: goto -> 1319
/*     */     //   1317: aload #27
/*     */     //   1319: nop
/*     */     //   1320: nop
/*     */     //   1321: nop
/*     */     //   1322: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1325: astore #23
/*     */     //   1327: aload #17
/*     */     //   1329: invokeinterface endReplaceGroup : ()V
/*     */     //   1334: aload #23
/*     */     //   1336: astore #16
/*     */     //   1338: goto -> 1397
/*     */     //   1341: aload #17
/*     */     //   1343: invokeinterface skipToGroupEnd : ()V
/*     */     //   1348: iload #20
/*     */     //   1350: sipush #4096
/*     */     //   1353: iand
/*     */     //   1354: ifeq -> 1365
/*     */     //   1357: iload #22
/*     */     //   1359: sipush #-897
/*     */     //   1362: iand
/*     */     //   1363: istore #22
/*     */     //   1365: iload #20
/*     */     //   1367: sipush #16384
/*     */     //   1370: iand
/*     */     //   1371: ifeq -> 1382
/*     */     //   1374: iload #22
/*     */     //   1376: ldc_w -57345
/*     */     //   1379: iand
/*     */     //   1380: istore #22
/*     */     //   1382: iload #20
/*     */     //   1384: ldc 32768
/*     */     //   1386: iand
/*     */     //   1387: ifeq -> 1397
/*     */     //   1390: iload #22
/*     */     //   1392: ldc -458753
/*     */     //   1394: iand
/*     */     //   1395: istore #22
/*     */     //   1397: aload #17
/*     */     //   1399: invokeinterface endDefaults : ()V
/*     */     //   1404: invokestatic isTraceInProgress : ()Z
/*     */     //   1407: ifeq -> 1423
/*     */     //   1410: ldc_w 142051665
/*     */     //   1413: iload #21
/*     */     //   1415: iload #22
/*     */     //   1417: ldc_w 'org.jetbrains.jewel.ui.component.TextField (TextField.kt:180)'
/*     */     //   1420: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1423: aload_0
/*     */     //   1424: aload_1
/*     */     //   1425: aload_2
/*     */     //   1426: iload_3
/*     */     //   1427: iload #4
/*     */     //   1429: aload #5
/*     */     //   1431: iload #9
/*     */     //   1433: aload #10
/*     */     //   1435: aload #11
/*     */     //   1437: aload #12
/*     */     //   1439: iconst_1
/*     */     //   1440: iconst_1
/*     */     //   1441: aload #13
/*     */     //   1443: aload #16
/*     */     //   1445: aload #14
/*     */     //   1447: checkcast org/jetbrains/jewel/ui/component/styling/InputFieldStyle
/*     */     //   1450: aload #15
/*     */     //   1452: ldc_w -1772625491
/*     */     //   1455: iconst_1
/*     */     //   1456: new org/jetbrains/jewel/ui/component/TextFieldKt$TextField$10
/*     */     //   1459: dup
/*     */     //   1460: aload #14
/*     */     //   1462: aload #15
/*     */     //   1464: aload_0
/*     */     //   1465: aload #6
/*     */     //   1467: aload #7
/*     */     //   1469: aload #8
/*     */     //   1471: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1474: aload #17
/*     */     //   1476: bipush #54
/*     */     //   1478: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1481: checkcast kotlin/jvm/functions/Function4
/*     */     //   1484: aload #17
/*     */     //   1486: bipush #14
/*     */     //   1488: iload #21
/*     */     //   1490: iand
/*     */     //   1491: bipush #112
/*     */     //   1493: iload #21
/*     */     //   1495: iand
/*     */     //   1496: ior
/*     */     //   1497: sipush #896
/*     */     //   1500: iload #21
/*     */     //   1502: iand
/*     */     //   1503: ior
/*     */     //   1504: sipush #7168
/*     */     //   1507: iload #21
/*     */     //   1509: iand
/*     */     //   1510: ior
/*     */     //   1511: ldc 57344
/*     */     //   1513: iload #21
/*     */     //   1515: iand
/*     */     //   1516: ior
/*     */     //   1517: ldc 458752
/*     */     //   1519: iload #21
/*     */     //   1521: iand
/*     */     //   1522: ior
/*     */     //   1523: ldc 3670016
/*     */     //   1525: iload #21
/*     */     //   1527: bipush #9
/*     */     //   1529: ishr
/*     */     //   1530: iand
/*     */     //   1531: ior
/*     */     //   1532: ldc 29360128
/*     */     //   1534: iload #22
/*     */     //   1536: bipush #21
/*     */     //   1538: ishl
/*     */     //   1539: iand
/*     */     //   1540: ior
/*     */     //   1541: ldc_w 234881024
/*     */     //   1544: iload #22
/*     */     //   1546: bipush #21
/*     */     //   1548: ishl
/*     */     //   1549: iand
/*     */     //   1550: ior
/*     */     //   1551: ldc 1879048192
/*     */     //   1553: iload #22
/*     */     //   1555: bipush #21
/*     */     //   1557: ishl
/*     */     //   1558: iand
/*     */     //   1559: ior
/*     */     //   1560: ldc_w 1572918
/*     */     //   1563: sipush #896
/*     */     //   1566: iload #22
/*     */     //   1568: iconst_3
/*     */     //   1569: ishr
/*     */     //   1570: iand
/*     */     //   1571: ior
/*     */     //   1572: sipush #7168
/*     */     //   1575: iload #22
/*     */     //   1577: bipush #9
/*     */     //   1579: ishr
/*     */     //   1580: iand
/*     */     //   1581: ior
/*     */     //   1582: ldc 57344
/*     */     //   1584: iload #22
/*     */     //   1586: iand
/*     */     //   1587: ior
/*     */     //   1588: ldc 458752
/*     */     //   1590: iload #22
/*     */     //   1592: iand
/*     */     //   1593: ior
/*     */     //   1594: invokestatic InputField : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1597: invokestatic isTraceInProgress : ()Z
/*     */     //   1600: ifeq -> 1616
/*     */     //   1603: invokestatic traceEventEnd : ()V
/*     */     //   1606: goto -> 1616
/*     */     //   1609: aload #17
/*     */     //   1611: invokeinterface skipToGroupEnd : ()V
/*     */     //   1616: aload #17
/*     */     //   1618: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1623: dup
/*     */     //   1624: ifnull -> 1676
/*     */     //   1627: aload_0
/*     */     //   1628: aload_1
/*     */     //   1629: aload_2
/*     */     //   1630: iload_3
/*     */     //   1631: iload #4
/*     */     //   1633: aload #5
/*     */     //   1635: aload #6
/*     */     //   1637: aload #7
/*     */     //   1639: aload #8
/*     */     //   1641: iload #9
/*     */     //   1643: aload #10
/*     */     //   1645: aload #11
/*     */     //   1647: aload #12
/*     */     //   1649: aload #13
/*     */     //   1651: aload #14
/*     */     //   1653: aload #15
/*     */     //   1655: aload #16
/*     */     //   1657: iload #18
/*     */     //   1659: iload #19
/*     */     //   1661: iload #20
/*     */     //   1663: <illegal opcode> invoke : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Lkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1668: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1673: goto -> 1677
/*     */     //   1676: pop
/*     */     //   1677: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #181	-> 14
/*     */     //   #166	-> 934
/*     */     //   #167	-> 949
/*     */     //   #168	-> 959
/*     */     //   #169	-> 970
/*     */     //   #170	-> 983
/*     */     //   #171	-> 995
/*     */     //   #172	-> 1007
/*     */     //   #173	-> 1019
/*     */     //   #174	-> 1031
/*     */     //   #175	-> 1048
/*     */     //   #176	-> 1065
/*     */     //   #177	-> 1100
/*     */     //   #382	-> 1120
/*     */     //   #383	-> 1132
/*     */     //   #384	-> 1143
/*     */     //   #384	-> 1151
/*     */     //   #385	-> 1153
/*     */     //   #386	-> 1162
/*     */     //   #387	-> 1167
/*     */     //   #383	-> 1169
/*     */     //   #382	-> 1170
/*     */     //   #382	-> 1171
/*     */     //   #177	-> 1172
/*     */     //   #178	-> 1197
/*     */     //   #179	-> 1225
/*     */     //   #180	-> 1252
/*     */     //   #388	-> 1272
/*     */     //   #389	-> 1284
/*     */     //   #390	-> 1295
/*     */     //   #180	-> 1298
/*     */     //   #390	-> 1301
/*     */     //   #391	-> 1303
/*     */     //   #392	-> 1312
/*     */     //   #393	-> 1317
/*     */     //   #389	-> 1319
/*     */     //   #388	-> 1320
/*     */     //   #388	-> 1321
/*     */     //   #180	-> 1322
/*     */     //   #181	-> 1420
/*     */     //   #184	-> 1423
/*     */     //   #185	-> 1424
/*     */     //   #186	-> 1425
/*     */     //   #187	-> 1426
/*     */     //   #188	-> 1427
/*     */     //   #189	-> 1429
/*     */     //   #190	-> 1431
/*     */     //   #191	-> 1433
/*     */     //   #192	-> 1435
/*     */     //   #193	-> 1437
/*     */     //   #194	-> 1439
/*     */     //   #195	-> 1440
/*     */     //   #196	-> 1441
/*     */     //   #199	-> 1443
/*     */     //   #197	-> 1445
/*     */     //   #198	-> 1450
/*     */     //   #200	-> 1452
/*     */     //   #183	-> 1594
/*     */     //   #215	-> 1609
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1146	5	29	$i$a$-cache-TextFieldKt$TextField$8	I
/*     */     //   1153	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1132	38	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1129	41	27	it$iv	Ljava/lang/Object;
/*     */     //   1120	52	26	$i$f$cache	I
/*     */     //   1117	55	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1117	55	25	invalid$iv	Z
/*     */     //   1298	3	29	$i$a$-cache-TextFieldKt$TextField$9	I
/*     */     //   1303	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1284	36	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1281	39	27	it$iv	Ljava/lang/Object;
/*     */     //   1272	50	26	$i$f$cache	I
/*     */     //   1269	53	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1269	53	25	invalid$iv	Z
/*     */     //   30	1648	21	$dirty	I
/*     */     //   34	1644	22	$dirty1	I
/*     */     //   0	1678	0	value	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   0	1678	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1678	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1678	3	enabled	Z
/*     */     //   0	1678	4	readOnly	Z
/*     */     //   0	1678	5	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1678	6	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1678	7	leadingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1678	8	trailingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1678	9	undecorated	Z
/*     */     //   0	1678	10	visualTransformation	Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   0	1678	11	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1678	12	keyboardActions	Landroidx/compose/foundation/text/KeyboardActions;
/*     */     //   0	1678	13	onTextLayout	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1678	14	style	Lorg/jetbrains/jewel/ui/component/styling/TextFieldStyle;
/*     */     //   0	1678	15	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1678	16	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1678	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1678	18	$changed	I
/*     */     //   0	1678	19	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class TextFieldKt$TextField$10 implements Function4<Function2<? super Composer, ? super Integer, ? extends Unit>, InputFieldState, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */     public final void invoke-NUF0VRY(Function2 innerTextField, long param1Long, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2; 
/*     */       if (($dirty & 0x83) != 130 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-1772625491, $dirty, -1, "org.jetbrains.jewel.ui.component.TextField.<anonymous> (TextField.kt:200)"); 
/*     */         long minSize = this.$style.getMetrics().getMinSize-MYxV2XQ();
/*     */         TextFieldKt.TextFieldDecorationBox-hYmLsZ8(PaddingKt.padding(SizeKt.defaultMinSize-VpY3zN4((Modifier)Modifier.Companion, DpSize.getWidth-D9Ej5fM(minSize), DpSize.getHeight-D9Ej5fM(minSize)), this.$style.getMetrics().getContentPadding()), innerTextField, this.$textStyle, this.$style.getColors().getPlaceholder-0d7_KjU(), ((((CharSequence)this.$value.getText()).length() == 0)) ? this.$placeholder : null, this.$leadingIcon, this.$trailingIcon, $composer, 0x70 & $dirty << 3, 0);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     TextFieldKt$TextField$10(TextFieldStyle $style, TextStyle $textStyle, TextFieldValue $value, Function2<Composer, Integer, Unit> $placeholder, Function2<Composer, Integer, Unit> $leadingIcon, Function2<Composer, Integer, Unit> $trailingIcon) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   private static final void TextFieldDecorationBox-hYmLsZ8(Modifier modifier, Function2 innerTextField, TextStyle textStyle, long placeholderTextColor, Function2 placeholder, Function2 leadingIcon, Function2 trailingIcon, Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload #8
/*     */     //   2: ldc_w -2110169619
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #8
/*     */     //   12: iload #9
/*     */     //   14: istore #11
/*     */     //   16: iload #10
/*     */     //   18: iconst_1
/*     */     //   19: iand
/*     */     //   20: ifeq -> 33
/*     */     //   23: iload #11
/*     */     //   25: bipush #6
/*     */     //   27: ior
/*     */     //   28: istore #11
/*     */     //   30: goto -> 62
/*     */     //   33: iload #9
/*     */     //   35: bipush #6
/*     */     //   37: iand
/*     */     //   38: ifne -> 62
/*     */     //   41: iload #11
/*     */     //   43: aload #8
/*     */     //   45: aload_0
/*     */     //   46: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   51: ifeq -> 58
/*     */     //   54: iconst_4
/*     */     //   55: goto -> 59
/*     */     //   58: iconst_2
/*     */     //   59: ior
/*     */     //   60: istore #11
/*     */     //   62: iload #10
/*     */     //   64: iconst_2
/*     */     //   65: iand
/*     */     //   66: ifeq -> 79
/*     */     //   69: iload #11
/*     */     //   71: bipush #48
/*     */     //   73: ior
/*     */     //   74: istore #11
/*     */     //   76: goto -> 110
/*     */     //   79: iload #9
/*     */     //   81: bipush #48
/*     */     //   83: iand
/*     */     //   84: ifne -> 110
/*     */     //   87: iload #11
/*     */     //   89: aload #8
/*     */     //   91: aload_1
/*     */     //   92: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   97: ifeq -> 105
/*     */     //   100: bipush #32
/*     */     //   102: goto -> 107
/*     */     //   105: bipush #16
/*     */     //   107: ior
/*     */     //   108: istore #11
/*     */     //   110: iload #10
/*     */     //   112: iconst_4
/*     */     //   113: iand
/*     */     //   114: ifeq -> 128
/*     */     //   117: iload #11
/*     */     //   119: sipush #384
/*     */     //   122: ior
/*     */     //   123: istore #11
/*     */     //   125: goto -> 162
/*     */     //   128: iload #9
/*     */     //   130: sipush #384
/*     */     //   133: iand
/*     */     //   134: ifne -> 162
/*     */     //   137: iload #11
/*     */     //   139: aload #8
/*     */     //   141: aload_2
/*     */     //   142: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   147: ifeq -> 156
/*     */     //   150: sipush #256
/*     */     //   153: goto -> 159
/*     */     //   156: sipush #128
/*     */     //   159: ior
/*     */     //   160: istore #11
/*     */     //   162: iload #10
/*     */     //   164: bipush #8
/*     */     //   166: iand
/*     */     //   167: ifeq -> 181
/*     */     //   170: iload #11
/*     */     //   172: sipush #3072
/*     */     //   175: ior
/*     */     //   176: istore #11
/*     */     //   178: goto -> 215
/*     */     //   181: iload #9
/*     */     //   183: sipush #3072
/*     */     //   186: iand
/*     */     //   187: ifne -> 215
/*     */     //   190: iload #11
/*     */     //   192: aload #8
/*     */     //   194: lload_3
/*     */     //   195: invokeinterface changed : (J)Z
/*     */     //   200: ifeq -> 209
/*     */     //   203: sipush #2048
/*     */     //   206: goto -> 212
/*     */     //   209: sipush #1024
/*     */     //   212: ior
/*     */     //   213: istore #11
/*     */     //   215: iload #10
/*     */     //   217: bipush #16
/*     */     //   219: iand
/*     */     //   220: ifeq -> 234
/*     */     //   223: iload #11
/*     */     //   225: sipush #24576
/*     */     //   228: ior
/*     */     //   229: istore #11
/*     */     //   231: goto -> 269
/*     */     //   234: iload #9
/*     */     //   236: sipush #24576
/*     */     //   239: iand
/*     */     //   240: ifne -> 269
/*     */     //   243: iload #11
/*     */     //   245: aload #8
/*     */     //   247: aload #5
/*     */     //   249: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   299: aload #6
/*     */     //   301: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   349: aload #7
/*     */     //   351: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   356: ifeq -> 364
/*     */     //   359: ldc 1048576
/*     */     //   361: goto -> 366
/*     */     //   364: ldc 524288
/*     */     //   366: ior
/*     */     //   367: istore #11
/*     */     //   369: iload #11
/*     */     //   371: ldc 599187
/*     */     //   373: iand
/*     */     //   374: ldc 599186
/*     */     //   376: if_icmpne -> 389
/*     */     //   379: aload #8
/*     */     //   381: invokeinterface getSkipping : ()Z
/*     */     //   386: ifne -> 2685
/*     */     //   389: iload #10
/*     */     //   391: iconst_1
/*     */     //   392: iand
/*     */     //   393: ifeq -> 403
/*     */     //   396: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   399: checkcast androidx/compose/ui/Modifier
/*     */     //   402: astore_0
/*     */     //   403: iload #10
/*     */     //   405: bipush #16
/*     */     //   407: iand
/*     */     //   408: ifeq -> 414
/*     */     //   411: aconst_null
/*     */     //   412: astore #5
/*     */     //   414: iload #10
/*     */     //   416: bipush #32
/*     */     //   418: iand
/*     */     //   419: ifeq -> 425
/*     */     //   422: aconst_null
/*     */     //   423: astore #6
/*     */     //   425: iload #10
/*     */     //   427: bipush #64
/*     */     //   429: iand
/*     */     //   430: ifeq -> 436
/*     */     //   433: aconst_null
/*     */     //   434: astore #7
/*     */     //   436: invokestatic isTraceInProgress : ()Z
/*     */     //   439: ifeq -> 454
/*     */     //   442: ldc_w -2110169619
/*     */     //   445: iload #11
/*     */     //   447: iconst_m1
/*     */     //   448: ldc_w 'org.jetbrains.jewel.ui.component.TextFieldDecorationBox (TextField.kt:225)'
/*     */     //   451: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   454: aload #8
/*     */     //   456: ldc_w -2055038631
/*     */     //   459: invokeinterface startReplaceGroup : (I)V
/*     */     //   464: aload #8
/*     */     //   466: astore #14
/*     */     //   468: iconst_0
/*     */     //   469: istore #15
/*     */     //   471: nop
/*     */     //   472: iconst_0
/*     */     //   473: istore #16
/*     */     //   475: aload #14
/*     */     //   477: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   482: astore #17
/*     */     //   484: iconst_0
/*     */     //   485: istore #18
/*     */     //   487: aload #17
/*     */     //   489: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   492: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   495: if_acmpne -> 523
/*     */     //   498: iconst_0
/*     */     //   499: istore #19
/*     */     //   501: getstatic org/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1;
/*     */     //   504: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   507: astore #19
/*     */     //   509: aload #14
/*     */     //   511: aload #19
/*     */     //   513: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   518: aload #19
/*     */     //   520: goto -> 525
/*     */     //   523: aload #17
/*     */     //   525: nop
/*     */     //   526: nop
/*     */     //   527: nop
/*     */     //   528: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   531: astore #13
/*     */     //   533: aload #8
/*     */     //   535: invokeinterface endReplaceGroup : ()V
/*     */     //   540: aload #13
/*     */     //   542: astore #12
/*     */     //   544: sipush #384
/*     */     //   547: bipush #112
/*     */     //   549: iload #11
/*     */     //   551: iconst_3
/*     */     //   552: ishl
/*     */     //   553: iand
/*     */     //   554: ior
/*     */     //   555: istore #13
/*     */     //   557: nop
/*     */     //   558: iconst_0
/*     */     //   559: istore #14
/*     */     //   561: aload #8
/*     */     //   563: ldc_w -1323940314
/*     */     //   566: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   569: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   572: aload #8
/*     */     //   574: iconst_0
/*     */     //   575: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   578: istore #15
/*     */     //   580: aload #8
/*     */     //   582: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   587: astore #16
/*     */     //   589: aload #8
/*     */     //   591: aload_0
/*     */     //   592: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   595: astore #17
/*     */     //   597: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   600: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   603: astore #18
/*     */     //   605: bipush #6
/*     */     //   607: sipush #896
/*     */     //   610: iload #13
/*     */     //   612: bipush #6
/*     */     //   614: ishl
/*     */     //   615: iand
/*     */     //   616: ior
/*     */     //   617: istore #19
/*     */     //   619: nop
/*     */     //   620: iconst_0
/*     */     //   621: istore #20
/*     */     //   623: aload #8
/*     */     //   625: ldc_w -692256719
/*     */     //   628: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   631: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   634: aload #8
/*     */     //   636: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   641: instanceof androidx/compose/runtime/Applier
/*     */     //   644: ifne -> 650
/*     */     //   647: invokestatic invalidApplier : ()V
/*     */     //   650: aload #8
/*     */     //   652: invokeinterface startReusableNode : ()V
/*     */     //   657: aload #8
/*     */     //   659: invokeinterface getInserting : ()Z
/*     */     //   664: ifeq -> 679
/*     */     //   667: aload #8
/*     */     //   669: aload #18
/*     */     //   671: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   676: goto -> 686
/*     */     //   679: aload #8
/*     */     //   681: invokeinterface useNode : ()V
/*     */     //   686: aload #8
/*     */     //   688: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   691: astore #21
/*     */     //   693: iconst_0
/*     */     //   694: istore #22
/*     */     //   696: aload #21
/*     */     //   698: aload #12
/*     */     //   700: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   703: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   706: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   709: aload #21
/*     */     //   711: aload #16
/*     */     //   713: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   716: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   719: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   722: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   725: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   728: astore #23
/*     */     //   730: iconst_0
/*     */     //   731: istore #24
/*     */     //   733: aload #21
/*     */     //   735: astore #25
/*     */     //   737: iconst_0
/*     */     //   738: istore #26
/*     */     //   740: aload #25
/*     */     //   742: invokeinterface getInserting : ()Z
/*     */     //   747: ifne -> 768
/*     */     //   750: aload #25
/*     */     //   752: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   757: iload #15
/*     */     //   759: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   762: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   765: ifne -> 794
/*     */     //   768: aload #25
/*     */     //   770: iload #15
/*     */     //   772: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   775: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   780: aload #21
/*     */     //   782: iload #15
/*     */     //   784: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   787: aload #23
/*     */     //   789: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   794: nop
/*     */     //   795: nop
/*     */     //   796: nop
/*     */     //   797: aload #21
/*     */     //   799: aload #17
/*     */     //   801: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   804: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   807: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   810: nop
/*     */     //   811: nop
/*     */     //   812: aload #8
/*     */     //   814: bipush #14
/*     */     //   816: iload #19
/*     */     //   818: bipush #6
/*     */     //   820: ishr
/*     */     //   821: iand
/*     */     //   822: istore #27
/*     */     //   824: astore #28
/*     */     //   826: iconst_0
/*     */     //   827: istore #29
/*     */     //   829: aload #28
/*     */     //   831: ldc_w 1335861096
/*     */     //   834: invokeinterface startReplaceGroup : (I)V
/*     */     //   839: aload #6
/*     */     //   841: ifnull -> 1268
/*     */     //   844: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   847: checkcast androidx/compose/ui/Modifier
/*     */     //   850: ldc_w 'Leading'
/*     */     //   853: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   856: astore #30
/*     */     //   858: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   861: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   864: astore #31
/*     */     //   866: bipush #54
/*     */     //   868: istore #32
/*     */     //   870: iconst_0
/*     */     //   871: istore #33
/*     */     //   873: aload #28
/*     */     //   875: ldc_w 733328855
/*     */     //   878: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   881: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   884: iconst_0
/*     */     //   885: istore #34
/*     */     //   887: aload #31
/*     */     //   889: iload #34
/*     */     //   891: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   894: astore #35
/*     */     //   896: bipush #112
/*     */     //   898: iload #32
/*     */     //   900: iconst_3
/*     */     //   901: ishl
/*     */     //   902: iand
/*     */     //   903: istore #36
/*     */     //   905: nop
/*     */     //   906: iconst_0
/*     */     //   907: istore #37
/*     */     //   909: aload #28
/*     */     //   911: ldc_w -1323940314
/*     */     //   914: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   917: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   920: aload #28
/*     */     //   922: iconst_0
/*     */     //   923: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   926: istore #38
/*     */     //   928: aload #28
/*     */     //   930: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   935: astore #39
/*     */     //   937: aload #28
/*     */     //   939: aload #30
/*     */     //   941: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   944: astore #40
/*     */     //   946: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   949: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   952: astore #41
/*     */     //   954: bipush #6
/*     */     //   956: sipush #896
/*     */     //   959: iload #36
/*     */     //   961: bipush #6
/*     */     //   963: ishl
/*     */     //   964: iand
/*     */     //   965: ior
/*     */     //   966: istore #42
/*     */     //   968: nop
/*     */     //   969: iconst_0
/*     */     //   970: istore #43
/*     */     //   972: aload #28
/*     */     //   974: ldc_w -692256719
/*     */     //   977: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   980: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   983: aload #28
/*     */     //   985: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   990: instanceof androidx/compose/runtime/Applier
/*     */     //   993: ifne -> 999
/*     */     //   996: invokestatic invalidApplier : ()V
/*     */     //   999: aload #28
/*     */     //   1001: invokeinterface startReusableNode : ()V
/*     */     //   1006: aload #28
/*     */     //   1008: invokeinterface getInserting : ()Z
/*     */     //   1013: ifeq -> 1028
/*     */     //   1016: aload #28
/*     */     //   1018: aload #41
/*     */     //   1020: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1025: goto -> 1035
/*     */     //   1028: aload #28
/*     */     //   1030: invokeinterface useNode : ()V
/*     */     //   1035: aload #28
/*     */     //   1037: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1040: astore #44
/*     */     //   1042: iconst_0
/*     */     //   1043: istore #45
/*     */     //   1045: aload #44
/*     */     //   1047: aload #35
/*     */     //   1049: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1052: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1055: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1058: aload #44
/*     */     //   1060: aload #39
/*     */     //   1062: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1065: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1068: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1071: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1074: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1077: astore #46
/*     */     //   1079: iconst_0
/*     */     //   1080: istore #47
/*     */     //   1082: aload #44
/*     */     //   1084: astore #48
/*     */     //   1086: iconst_0
/*     */     //   1087: istore #49
/*     */     //   1089: aload #48
/*     */     //   1091: invokeinterface getInserting : ()Z
/*     */     //   1096: ifne -> 1117
/*     */     //   1099: aload #48
/*     */     //   1101: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1106: iload #38
/*     */     //   1108: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1111: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1114: ifne -> 1143
/*     */     //   1117: aload #48
/*     */     //   1119: iload #38
/*     */     //   1121: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1124: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1129: aload #44
/*     */     //   1131: iload #38
/*     */     //   1133: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1136: aload #46
/*     */     //   1138: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1143: nop
/*     */     //   1144: nop
/*     */     //   1145: nop
/*     */     //   1146: aload #44
/*     */     //   1148: aload #40
/*     */     //   1150: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1153: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1156: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1159: nop
/*     */     //   1160: nop
/*     */     //   1161: aload #28
/*     */     //   1163: bipush #14
/*     */     //   1165: iload #42
/*     */     //   1167: bipush #6
/*     */     //   1169: ishr
/*     */     //   1170: iand
/*     */     //   1171: istore #50
/*     */     //   1173: astore #51
/*     */     //   1175: iconst_0
/*     */     //   1176: istore #52
/*     */     //   1178: aload #51
/*     */     //   1180: ldc_w -2146769399
/*     */     //   1183: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1186: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1189: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1192: aload #51
/*     */     //   1194: bipush #6
/*     */     //   1196: bipush #112
/*     */     //   1198: iload #32
/*     */     //   1200: bipush #6
/*     */     //   1202: ishr
/*     */     //   1203: iand
/*     */     //   1204: ior
/*     */     //   1205: istore #53
/*     */     //   1207: astore #54
/*     */     //   1209: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1212: astore #55
/*     */     //   1214: iconst_0
/*     */     //   1215: istore #56
/*     */     //   1217: aload #6
/*     */     //   1219: aload #54
/*     */     //   1221: bipush #14
/*     */     //   1223: iload #11
/*     */     //   1225: bipush #15
/*     */     //   1227: ishr
/*     */     //   1228: iand
/*     */     //   1229: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1232: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1237: pop
/*     */     //   1238: aload #51
/*     */     //   1240: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1243: aload #28
/*     */     //   1245: invokeinterface endNode : ()V
/*     */     //   1250: aload #28
/*     */     //   1252: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1255: nop
/*     */     //   1256: aload #28
/*     */     //   1258: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1261: nop
/*     */     //   1262: aload #28
/*     */     //   1264: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1267: nop
/*     */     //   1268: aload #28
/*     */     //   1270: invokeinterface endReplaceGroup : ()V
/*     */     //   1275: aload #28
/*     */     //   1277: ldc_w 1335866539
/*     */     //   1280: invokeinterface startReplaceGroup : (I)V
/*     */     //   1285: aload #7
/*     */     //   1287: ifnull -> 1714
/*     */     //   1290: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1293: checkcast androidx/compose/ui/Modifier
/*     */     //   1296: ldc_w 'Trailing'
/*     */     //   1299: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1302: astore #30
/*     */     //   1304: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1307: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1310: astore #31
/*     */     //   1312: bipush #54
/*     */     //   1314: istore #32
/*     */     //   1316: iconst_0
/*     */     //   1317: istore #33
/*     */     //   1319: aload #28
/*     */     //   1321: ldc_w 733328855
/*     */     //   1324: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1327: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1330: iconst_0
/*     */     //   1331: istore #34
/*     */     //   1333: aload #31
/*     */     //   1335: iload #34
/*     */     //   1337: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1340: astore #35
/*     */     //   1342: bipush #112
/*     */     //   1344: iload #32
/*     */     //   1346: iconst_3
/*     */     //   1347: ishl
/*     */     //   1348: iand
/*     */     //   1349: istore #36
/*     */     //   1351: nop
/*     */     //   1352: iconst_0
/*     */     //   1353: istore #37
/*     */     //   1355: aload #28
/*     */     //   1357: ldc_w -1323940314
/*     */     //   1360: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1363: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1366: aload #28
/*     */     //   1368: iconst_0
/*     */     //   1369: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1372: istore #38
/*     */     //   1374: aload #28
/*     */     //   1376: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1381: astore #39
/*     */     //   1383: aload #28
/*     */     //   1385: aload #30
/*     */     //   1387: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1390: astore #40
/*     */     //   1392: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1395: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1398: astore #41
/*     */     //   1400: bipush #6
/*     */     //   1402: sipush #896
/*     */     //   1405: iload #36
/*     */     //   1407: bipush #6
/*     */     //   1409: ishl
/*     */     //   1410: iand
/*     */     //   1411: ior
/*     */     //   1412: istore #42
/*     */     //   1414: nop
/*     */     //   1415: iconst_0
/*     */     //   1416: istore #43
/*     */     //   1418: aload #28
/*     */     //   1420: ldc_w -692256719
/*     */     //   1423: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1426: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1429: aload #28
/*     */     //   1431: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1436: instanceof androidx/compose/runtime/Applier
/*     */     //   1439: ifne -> 1445
/*     */     //   1442: invokestatic invalidApplier : ()V
/*     */     //   1445: aload #28
/*     */     //   1447: invokeinterface startReusableNode : ()V
/*     */     //   1452: aload #28
/*     */     //   1454: invokeinterface getInserting : ()Z
/*     */     //   1459: ifeq -> 1474
/*     */     //   1462: aload #28
/*     */     //   1464: aload #41
/*     */     //   1466: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1471: goto -> 1481
/*     */     //   1474: aload #28
/*     */     //   1476: invokeinterface useNode : ()V
/*     */     //   1481: aload #28
/*     */     //   1483: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1486: astore #44
/*     */     //   1488: iconst_0
/*     */     //   1489: istore #45
/*     */     //   1491: aload #44
/*     */     //   1493: aload #35
/*     */     //   1495: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1498: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1501: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1504: aload #44
/*     */     //   1506: aload #39
/*     */     //   1508: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1511: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1514: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1517: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1520: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1523: astore #46
/*     */     //   1525: iconst_0
/*     */     //   1526: istore #47
/*     */     //   1528: aload #44
/*     */     //   1530: astore #48
/*     */     //   1532: iconst_0
/*     */     //   1533: istore #49
/*     */     //   1535: aload #48
/*     */     //   1537: invokeinterface getInserting : ()Z
/*     */     //   1542: ifne -> 1563
/*     */     //   1545: aload #48
/*     */     //   1547: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1552: iload #38
/*     */     //   1554: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1557: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1560: ifne -> 1589
/*     */     //   1563: aload #48
/*     */     //   1565: iload #38
/*     */     //   1567: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1570: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1575: aload #44
/*     */     //   1577: iload #38
/*     */     //   1579: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1582: aload #46
/*     */     //   1584: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1589: nop
/*     */     //   1590: nop
/*     */     //   1591: nop
/*     */     //   1592: aload #44
/*     */     //   1594: aload #40
/*     */     //   1596: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1599: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1602: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1605: nop
/*     */     //   1606: nop
/*     */     //   1607: aload #28
/*     */     //   1609: bipush #14
/*     */     //   1611: iload #42
/*     */     //   1613: bipush #6
/*     */     //   1615: ishr
/*     */     //   1616: iand
/*     */     //   1617: istore #50
/*     */     //   1619: astore #51
/*     */     //   1621: iconst_0
/*     */     //   1622: istore #52
/*     */     //   1624: aload #51
/*     */     //   1626: ldc_w -2146769399
/*     */     //   1629: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1632: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1635: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1638: aload #51
/*     */     //   1640: bipush #6
/*     */     //   1642: bipush #112
/*     */     //   1644: iload #32
/*     */     //   1646: bipush #6
/*     */     //   1648: ishr
/*     */     //   1649: iand
/*     */     //   1650: ior
/*     */     //   1651: istore #53
/*     */     //   1653: astore #54
/*     */     //   1655: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1658: astore #55
/*     */     //   1660: iconst_0
/*     */     //   1661: istore #56
/*     */     //   1663: aload #7
/*     */     //   1665: aload #54
/*     */     //   1667: bipush #14
/*     */     //   1669: iload #11
/*     */     //   1671: bipush #18
/*     */     //   1673: ishr
/*     */     //   1674: iand
/*     */     //   1675: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1678: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1683: pop
/*     */     //   1684: aload #51
/*     */     //   1686: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1689: aload #28
/*     */     //   1691: invokeinterface endNode : ()V
/*     */     //   1696: aload #28
/*     */     //   1698: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1701: nop
/*     */     //   1702: aload #28
/*     */     //   1704: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1707: nop
/*     */     //   1708: aload #28
/*     */     //   1710: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1713: nop
/*     */     //   1714: aload #28
/*     */     //   1716: invokeinterface endReplaceGroup : ()V
/*     */     //   1721: aload #28
/*     */     //   1723: ldc_w 1335872360
/*     */     //   1726: invokeinterface startReplaceGroup : (I)V
/*     */     //   1731: aload #5
/*     */     //   1733: ifnull -> 2223
/*     */     //   1736: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1739: checkcast androidx/compose/ui/Modifier
/*     */     //   1742: ldc_w 'Placeholder'
/*     */     //   1745: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1748: astore #30
/*     */     //   1750: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1753: invokevirtual getCenter : ()Landroidx/compose/ui/Alignment;
/*     */     //   1756: astore #31
/*     */     //   1758: bipush #54
/*     */     //   1760: istore #32
/*     */     //   1762: iconst_0
/*     */     //   1763: istore #33
/*     */     //   1765: aload #28
/*     */     //   1767: ldc_w 733328855
/*     */     //   1770: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1773: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1776: iconst_0
/*     */     //   1777: istore #34
/*     */     //   1779: aload #31
/*     */     //   1781: iload #34
/*     */     //   1783: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1786: astore #35
/*     */     //   1788: bipush #112
/*     */     //   1790: iload #32
/*     */     //   1792: iconst_3
/*     */     //   1793: ishl
/*     */     //   1794: iand
/*     */     //   1795: istore #36
/*     */     //   1797: nop
/*     */     //   1798: iconst_0
/*     */     //   1799: istore #37
/*     */     //   1801: aload #28
/*     */     //   1803: ldc_w -1323940314
/*     */     //   1806: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1812: aload #28
/*     */     //   1814: iconst_0
/*     */     //   1815: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1818: istore #38
/*     */     //   1820: aload #28
/*     */     //   1822: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1827: astore #39
/*     */     //   1829: aload #28
/*     */     //   1831: aload #30
/*     */     //   1833: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1836: astore #40
/*     */     //   1838: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1841: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1844: astore #41
/*     */     //   1846: bipush #6
/*     */     //   1848: sipush #896
/*     */     //   1851: iload #36
/*     */     //   1853: bipush #6
/*     */     //   1855: ishl
/*     */     //   1856: iand
/*     */     //   1857: ior
/*     */     //   1858: istore #42
/*     */     //   1860: nop
/*     */     //   1861: iconst_0
/*     */     //   1862: istore #43
/*     */     //   1864: aload #28
/*     */     //   1866: ldc_w -692256719
/*     */     //   1869: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1872: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1875: aload #28
/*     */     //   1877: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1882: instanceof androidx/compose/runtime/Applier
/*     */     //   1885: ifne -> 1891
/*     */     //   1888: invokestatic invalidApplier : ()V
/*     */     //   1891: aload #28
/*     */     //   1893: invokeinterface startReusableNode : ()V
/*     */     //   1898: aload #28
/*     */     //   1900: invokeinterface getInserting : ()Z
/*     */     //   1905: ifeq -> 1920
/*     */     //   1908: aload #28
/*     */     //   1910: aload #41
/*     */     //   1912: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1917: goto -> 1927
/*     */     //   1920: aload #28
/*     */     //   1922: invokeinterface useNode : ()V
/*     */     //   1927: aload #28
/*     */     //   1929: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1932: astore #44
/*     */     //   1934: iconst_0
/*     */     //   1935: istore #45
/*     */     //   1937: aload #44
/*     */     //   1939: aload #35
/*     */     //   1941: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1944: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1947: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1950: aload #44
/*     */     //   1952: aload #39
/*     */     //   1954: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1957: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1960: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1963: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1966: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1969: astore #46
/*     */     //   1971: iconst_0
/*     */     //   1972: istore #47
/*     */     //   1974: aload #44
/*     */     //   1976: astore #48
/*     */     //   1978: iconst_0
/*     */     //   1979: istore #49
/*     */     //   1981: aload #48
/*     */     //   1983: invokeinterface getInserting : ()Z
/*     */     //   1988: ifne -> 2009
/*     */     //   1991: aload #48
/*     */     //   1993: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1998: iload #38
/*     */     //   2000: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2003: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2006: ifne -> 2035
/*     */     //   2009: aload #48
/*     */     //   2011: iload #38
/*     */     //   2013: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2016: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2021: aload #44
/*     */     //   2023: iload #38
/*     */     //   2025: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2028: aload #46
/*     */     //   2030: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2035: nop
/*     */     //   2036: nop
/*     */     //   2037: nop
/*     */     //   2038: aload #44
/*     */     //   2040: aload #40
/*     */     //   2042: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2045: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2048: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2051: nop
/*     */     //   2052: nop
/*     */     //   2053: aload #28
/*     */     //   2055: bipush #14
/*     */     //   2057: iload #42
/*     */     //   2059: bipush #6
/*     */     //   2061: ishr
/*     */     //   2062: iand
/*     */     //   2063: istore #50
/*     */     //   2065: astore #51
/*     */     //   2067: iconst_0
/*     */     //   2068: istore #52
/*     */     //   2070: aload #51
/*     */     //   2072: ldc_w -2146769399
/*     */     //   2075: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2078: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2081: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2084: aload #51
/*     */     //   2086: bipush #6
/*     */     //   2088: bipush #112
/*     */     //   2090: iload #32
/*     */     //   2092: bipush #6
/*     */     //   2094: ishr
/*     */     //   2095: iand
/*     */     //   2096: ior
/*     */     //   2097: istore #53
/*     */     //   2099: astore #54
/*     */     //   2101: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2104: astore #55
/*     */     //   2106: iconst_0
/*     */     //   2107: istore #56
/*     */     //   2109: iconst_2
/*     */     //   2110: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   2113: astore #57
/*     */     //   2115: aload #57
/*     */     //   2117: iconst_0
/*     */     //   2118: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2121: aload_2
/*     */     //   2122: lload_3
/*     */     //   2123: lconst_0
/*     */     //   2124: aconst_null
/*     */     //   2125: aconst_null
/*     */     //   2126: aconst_null
/*     */     //   2127: aconst_null
/*     */     //   2128: aconst_null
/*     */     //   2129: lconst_0
/*     */     //   2130: aconst_null
/*     */     //   2131: aconst_null
/*     */     //   2132: aconst_null
/*     */     //   2133: lconst_0
/*     */     //   2134: aconst_null
/*     */     //   2135: aconst_null
/*     */     //   2136: aconst_null
/*     */     //   2137: iconst_0
/*     */     //   2138: iconst_0
/*     */     //   2139: lconst_0
/*     */     //   2140: aconst_null
/*     */     //   2141: aconst_null
/*     */     //   2142: aconst_null
/*     */     //   2143: iconst_0
/*     */     //   2144: iconst_0
/*     */     //   2145: aconst_null
/*     */     //   2146: ldc_w 16777214
/*     */     //   2149: aconst_null
/*     */     //   2150: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   2153: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2156: aastore
/*     */     //   2157: aload #57
/*     */     //   2159: iconst_1
/*     */     //   2160: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   2163: lload_3
/*     */     //   2164: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   2167: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   2170: aastore
/*     */     //   2171: aload #57
/*     */     //   2173: aload #5
/*     */     //   2175: aload #54
/*     */     //   2177: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   2180: bipush #112
/*     */     //   2182: iload #11
/*     */     //   2184: bipush #9
/*     */     //   2186: ishr
/*     */     //   2187: iand
/*     */     //   2188: ior
/*     */     //   2189: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   2192: nop
/*     */     //   2193: aload #51
/*     */     //   2195: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2198: aload #28
/*     */     //   2200: invokeinterface endNode : ()V
/*     */     //   2205: aload #28
/*     */     //   2207: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2210: nop
/*     */     //   2211: aload #28
/*     */     //   2213: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2216: nop
/*     */     //   2217: aload #28
/*     */     //   2219: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2222: nop
/*     */     //   2223: aload #28
/*     */     //   2225: invokeinterface endReplaceGroup : ()V
/*     */     //   2230: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   2233: checkcast androidx/compose/ui/Modifier
/*     */     //   2236: ldc_w 'TextField'
/*     */     //   2239: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   2242: astore #30
/*     */     //   2244: iconst_1
/*     */     //   2245: istore #34
/*     */     //   2247: sipush #390
/*     */     //   2250: istore #32
/*     */     //   2252: iconst_0
/*     */     //   2253: istore #33
/*     */     //   2255: aload #28
/*     */     //   2257: ldc_w 733328855
/*     */     //   2260: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   2263: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2266: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   2269: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   2272: astore #31
/*     */     //   2274: aload #31
/*     */     //   2276: iload #34
/*     */     //   2278: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2281: astore #35
/*     */     //   2283: bipush #112
/*     */     //   2285: iload #32
/*     */     //   2287: iconst_3
/*     */     //   2288: ishl
/*     */     //   2289: iand
/*     */     //   2290: istore #36
/*     */     //   2292: nop
/*     */     //   2293: iconst_0
/*     */     //   2294: istore #37
/*     */     //   2296: aload #28
/*     */     //   2298: ldc_w -1323940314
/*     */     //   2301: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   2304: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2307: aload #28
/*     */     //   2309: iconst_0
/*     */     //   2310: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   2313: istore #38
/*     */     //   2315: aload #28
/*     */     //   2317: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2322: astore #39
/*     */     //   2324: aload #28
/*     */     //   2326: aload #30
/*     */     //   2328: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   2331: astore #40
/*     */     //   2333: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2336: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   2339: astore #41
/*     */     //   2341: bipush #6
/*     */     //   2343: sipush #896
/*     */     //   2346: iload #36
/*     */     //   2348: bipush #6
/*     */     //   2350: ishl
/*     */     //   2351: iand
/*     */     //   2352: ior
/*     */     //   2353: istore #42
/*     */     //   2355: nop
/*     */     //   2356: iconst_0
/*     */     //   2357: istore #43
/*     */     //   2359: aload #28
/*     */     //   2361: ldc_w -692256719
/*     */     //   2364: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   2367: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2370: aload #28
/*     */     //   2372: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   2377: instanceof androidx/compose/runtime/Applier
/*     */     //   2380: ifne -> 2386
/*     */     //   2383: invokestatic invalidApplier : ()V
/*     */     //   2386: aload #28
/*     */     //   2388: invokeinterface startReusableNode : ()V
/*     */     //   2393: aload #28
/*     */     //   2395: invokeinterface getInserting : ()Z
/*     */     //   2400: ifeq -> 2415
/*     */     //   2403: aload #28
/*     */     //   2405: aload #41
/*     */     //   2407: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   2412: goto -> 2422
/*     */     //   2415: aload #28
/*     */     //   2417: invokeinterface useNode : ()V
/*     */     //   2422: aload #28
/*     */     //   2424: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   2427: astore #44
/*     */     //   2429: iconst_0
/*     */     //   2430: istore #45
/*     */     //   2432: aload #44
/*     */     //   2434: aload #35
/*     */     //   2436: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2439: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2442: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2445: aload #44
/*     */     //   2447: aload #39
/*     */     //   2449: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2452: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2455: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2458: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2461: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2464: astore #46
/*     */     //   2466: iconst_0
/*     */     //   2467: istore #47
/*     */     //   2469: aload #44
/*     */     //   2471: astore #48
/*     */     //   2473: iconst_0
/*     */     //   2474: istore #49
/*     */     //   2476: aload #48
/*     */     //   2478: invokeinterface getInserting : ()Z
/*     */     //   2483: ifne -> 2504
/*     */     //   2486: aload #48
/*     */     //   2488: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   2493: iload #38
/*     */     //   2495: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2498: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2501: ifne -> 2530
/*     */     //   2504: aload #48
/*     */     //   2506: iload #38
/*     */     //   2508: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2511: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   2516: aload #44
/*     */     //   2518: iload #38
/*     */     //   2520: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2523: aload #46
/*     */     //   2525: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2530: nop
/*     */     //   2531: nop
/*     */     //   2532: nop
/*     */     //   2533: aload #44
/*     */     //   2535: aload #40
/*     */     //   2537: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   2540: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   2543: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   2546: nop
/*     */     //   2547: nop
/*     */     //   2548: aload #28
/*     */     //   2550: bipush #14
/*     */     //   2552: iload #42
/*     */     //   2554: bipush #6
/*     */     //   2556: ishr
/*     */     //   2557: iand
/*     */     //   2558: istore #50
/*     */     //   2560: astore #51
/*     */     //   2562: iconst_0
/*     */     //   2563: istore #52
/*     */     //   2565: aload #51
/*     */     //   2567: ldc_w -2146769399
/*     */     //   2570: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   2573: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   2576: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   2579: aload #51
/*     */     //   2581: bipush #6
/*     */     //   2583: bipush #112
/*     */     //   2585: iload #32
/*     */     //   2587: bipush #6
/*     */     //   2589: ishr
/*     */     //   2590: iand
/*     */     //   2591: ior
/*     */     //   2592: istore #53
/*     */     //   2594: astore #54
/*     */     //   2596: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   2599: astore #55
/*     */     //   2601: iconst_0
/*     */     //   2602: istore #56
/*     */     //   2604: aload_1
/*     */     //   2605: aload #54
/*     */     //   2607: bipush #14
/*     */     //   2609: iload #11
/*     */     //   2611: iconst_3
/*     */     //   2612: ishr
/*     */     //   2613: iand
/*     */     //   2614: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2617: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   2622: pop
/*     */     //   2623: aload #51
/*     */     //   2625: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2628: aload #28
/*     */     //   2630: invokeinterface endNode : ()V
/*     */     //   2635: aload #28
/*     */     //   2637: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2640: nop
/*     */     //   2641: aload #28
/*     */     //   2643: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2646: nop
/*     */     //   2647: aload #28
/*     */     //   2649: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2652: nop
/*     */     //   2653: nop
/*     */     //   2654: aload #8
/*     */     //   2656: invokeinterface endNode : ()V
/*     */     //   2661: aload #8
/*     */     //   2663: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2666: nop
/*     */     //   2667: aload #8
/*     */     //   2669: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   2672: nop
/*     */     //   2673: invokestatic isTraceInProgress : ()Z
/*     */     //   2676: ifeq -> 2692
/*     */     //   2679: invokestatic traceEventEnd : ()V
/*     */     //   2682: goto -> 2692
/*     */     //   2685: aload #8
/*     */     //   2687: invokeinterface skipToGroupEnd : ()V
/*     */     //   2692: aload #8
/*     */     //   2694: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   2699: dup
/*     */     //   2700: ifnull -> 2730
/*     */     //   2703: aload_0
/*     */     //   2704: aload_1
/*     */     //   2705: aload_2
/*     */     //   2706: lload_3
/*     */     //   2707: aload #5
/*     */     //   2709: aload #6
/*     */     //   2711: aload #7
/*     */     //   2713: iload #9
/*     */     //   2715: iload #10
/*     */     //   2717: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*     */     //   2722: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   2727: goto -> 2731
/*     */     //   2730: pop
/*     */     //   2731: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #226	-> 0
/*     */     //   #219	-> 396
/*     */     //   #223	-> 411
/*     */     //   #224	-> 422
/*     */     //   #225	-> 433
/*     */     //   #226	-> 451
/*     */     //   #248	-> 471
/*     */     //   #394	-> 475
/*     */     //   #395	-> 487
/*     */     //   #396	-> 498
/*     */     //   #248	-> 501
/*     */     //   #396	-> 507
/*     */     //   #397	-> 509
/*     */     //   #398	-> 518
/*     */     //   #399	-> 523
/*     */     //   #395	-> 525
/*     */     //   #394	-> 526
/*     */     //   #394	-> 527
/*     */     //   #248	-> 528
/*     */     //   #227	-> 557
/*     */     //   #400	-> 569
/*     */     //   #401	-> 575
/*     */     //   #402	-> 582
/*     */     //   #403	-> 591
/*     */     //   #405	-> 597
/*     */     //   #404	-> 619
/*     */     //   #406	-> 631
/*     */     //   #407	-> 634
/*     */     //   #408	-> 652
/*     */     //   #409	-> 657
/*     */     //   #410	-> 669
/*     */     //   #412	-> 681
/*     */     //   #414	-> 686
/*     */     //   #415	-> 696
/*     */     //   #416	-> 709
/*     */     //   #418	-> 722
/*     */     //   #419	-> 733
/*     */     //   #420	-> 740
/*     */     //   #421	-> 768
/*     */     //   #422	-> 780
/*     */     //   #424	-> 794
/*     */     //   #419	-> 795
/*     */     //   #424	-> 796
/*     */     //   #425	-> 797
/*     */     //   #426	-> 810
/*     */     //   #414	-> 811
/*     */     //   #427	-> 812
/*     */     //   #230	-> 839
/*     */     //   #231	-> 844
/*     */     //   #428	-> 881
/*     */     //   #429	-> 884
/*     */     //   #432	-> 887
/*     */     //   #433	-> 905
/*     */     //   #434	-> 917
/*     */     //   #435	-> 923
/*     */     //   #436	-> 930
/*     */     //   #437	-> 939
/*     */     //   #439	-> 946
/*     */     //   #438	-> 968
/*     */     //   #440	-> 980
/*     */     //   #441	-> 983
/*     */     //   #442	-> 1001
/*     */     //   #443	-> 1006
/*     */     //   #444	-> 1018
/*     */     //   #446	-> 1030
/*     */     //   #448	-> 1035
/*     */     //   #449	-> 1045
/*     */     //   #450	-> 1058
/*     */     //   #452	-> 1071
/*     */     //   #453	-> 1082
/*     */     //   #454	-> 1089
/*     */     //   #455	-> 1117
/*     */     //   #456	-> 1129
/*     */     //   #458	-> 1143
/*     */     //   #453	-> 1144
/*     */     //   #458	-> 1145
/*     */     //   #459	-> 1146
/*     */     //   #460	-> 1159
/*     */     //   #448	-> 1160
/*     */     //   #461	-> 1161
/*     */     //   #462	-> 1186
/*     */     //   #231	-> 1217
/*     */     //   #462	-> 1238
/*     */     //   #461	-> 1243
/*     */     //   #463	-> 1245
/*     */     //   #440	-> 1252
/*     */     //   #464	-> 1255
/*     */     //   #434	-> 1258
/*     */     //   #465	-> 1261
/*     */     //   #428	-> 1264
/*     */     //   #466	-> 1267
/*     */     //   #233	-> 1285
/*     */     //   #234	-> 1290
/*     */     //   #467	-> 1327
/*     */     //   #468	-> 1330
/*     */     //   #471	-> 1333
/*     */     //   #472	-> 1351
/*     */     //   #473	-> 1363
/*     */     //   #474	-> 1369
/*     */     //   #475	-> 1376
/*     */     //   #476	-> 1385
/*     */     //   #478	-> 1392
/*     */     //   #477	-> 1414
/*     */     //   #479	-> 1426
/*     */     //   #480	-> 1429
/*     */     //   #481	-> 1447
/*     */     //   #482	-> 1452
/*     */     //   #483	-> 1464
/*     */     //   #485	-> 1476
/*     */     //   #487	-> 1481
/*     */     //   #488	-> 1491
/*     */     //   #489	-> 1504
/*     */     //   #491	-> 1517
/*     */     //   #492	-> 1528
/*     */     //   #493	-> 1535
/*     */     //   #494	-> 1563
/*     */     //   #495	-> 1575
/*     */     //   #497	-> 1589
/*     */     //   #492	-> 1590
/*     */     //   #497	-> 1591
/*     */     //   #498	-> 1592
/*     */     //   #499	-> 1605
/*     */     //   #487	-> 1606
/*     */     //   #500	-> 1607
/*     */     //   #501	-> 1632
/*     */     //   #234	-> 1663
/*     */     //   #501	-> 1684
/*     */     //   #500	-> 1689
/*     */     //   #502	-> 1691
/*     */     //   #479	-> 1698
/*     */     //   #503	-> 1701
/*     */     //   #473	-> 1704
/*     */     //   #504	-> 1707
/*     */     //   #467	-> 1710
/*     */     //   #505	-> 1713
/*     */     //   #236	-> 1731
/*     */     //   #237	-> 1736
/*     */     //   #506	-> 1773
/*     */     //   #507	-> 1776
/*     */     //   #510	-> 1779
/*     */     //   #511	-> 1797
/*     */     //   #512	-> 1809
/*     */     //   #513	-> 1815
/*     */     //   #514	-> 1822
/*     */     //   #515	-> 1831
/*     */     //   #517	-> 1838
/*     */     //   #516	-> 1860
/*     */     //   #518	-> 1872
/*     */     //   #519	-> 1875
/*     */     //   #520	-> 1893
/*     */     //   #521	-> 1898
/*     */     //   #522	-> 1910
/*     */     //   #524	-> 1922
/*     */     //   #526	-> 1927
/*     */     //   #527	-> 1937
/*     */     //   #528	-> 1950
/*     */     //   #530	-> 1963
/*     */     //   #531	-> 1974
/*     */     //   #532	-> 1981
/*     */     //   #533	-> 2009
/*     */     //   #534	-> 2021
/*     */     //   #536	-> 2035
/*     */     //   #531	-> 2036
/*     */     //   #536	-> 2037
/*     */     //   #537	-> 2038
/*     */     //   #538	-> 2051
/*     */     //   #526	-> 2052
/*     */     //   #539	-> 2053
/*     */     //   #540	-> 2078
/*     */     //   #239	-> 2109
/*     */     //   #240	-> 2160
/*     */     //   #239	-> 2171
/*     */     //   #241	-> 2173
/*     */     //   #238	-> 2189
/*     */     //   #243	-> 2192
/*     */     //   #540	-> 2193
/*     */     //   #539	-> 2198
/*     */     //   #541	-> 2200
/*     */     //   #518	-> 2207
/*     */     //   #542	-> 2210
/*     */     //   #512	-> 2213
/*     */     //   #543	-> 2216
/*     */     //   #506	-> 2219
/*     */     //   #544	-> 2222
/*     */     //   #246	-> 2230
/*     */     //   #545	-> 2263
/*     */     //   #546	-> 2266
/*     */     //   #550	-> 2274
/*     */     //   #551	-> 2292
/*     */     //   #552	-> 2304
/*     */     //   #553	-> 2310
/*     */     //   #554	-> 2317
/*     */     //   #555	-> 2326
/*     */     //   #557	-> 2333
/*     */     //   #556	-> 2355
/*     */     //   #558	-> 2367
/*     */     //   #559	-> 2370
/*     */     //   #560	-> 2388
/*     */     //   #561	-> 2393
/*     */     //   #562	-> 2405
/*     */     //   #564	-> 2417
/*     */     //   #566	-> 2422
/*     */     //   #567	-> 2432
/*     */     //   #568	-> 2445
/*     */     //   #570	-> 2458
/*     */     //   #571	-> 2469
/*     */     //   #572	-> 2476
/*     */     //   #573	-> 2504
/*     */     //   #574	-> 2516
/*     */     //   #576	-> 2530
/*     */     //   #571	-> 2531
/*     */     //   #576	-> 2532
/*     */     //   #577	-> 2533
/*     */     //   #578	-> 2546
/*     */     //   #566	-> 2547
/*     */     //   #579	-> 2548
/*     */     //   #580	-> 2573
/*     */     //   #246	-> 2604
/*     */     //   #580	-> 2623
/*     */     //   #579	-> 2628
/*     */     //   #581	-> 2630
/*     */     //   #558	-> 2637
/*     */     //   #582	-> 2640
/*     */     //   #552	-> 2643
/*     */     //   #583	-> 2646
/*     */     //   #545	-> 2649
/*     */     //   #584	-> 2652
/*     */     //   #247	-> 2653
/*     */     //   #427	-> 2654
/*     */     //   #585	-> 2656
/*     */     //   #406	-> 2663
/*     */     //   #586	-> 2666
/*     */     //   #400	-> 2669
/*     */     //   #587	-> 2672
/*     */     //   #287	-> 2685
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   501	6	19	$i$a$-cache-TextFieldKt$TextFieldDecorationBox$1	I
/*     */     //   509	11	19	value$iv	Ljava/lang/Object;
/*     */     //   487	39	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   484	42	17	it$iv	Ljava/lang/Object;
/*     */     //   475	53	16	$i$f$cache	I
/*     */     //   472	56	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   472	56	15	invalid$iv	Z
/*     */     //   1217	21	56	$i$a$-Box-TextFieldKt$TextFieldDecorationBox$2$1	I
/*     */     //   1214	24	55	$this$TextFieldDecorationBox_hYmLsZ8_u24lambda_u2423_u24lambda_u2419	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1214	24	54	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1214	24	53	$changed	I
/*     */     //   1178	65	52	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1175	68	51	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1175	68	50	$changed$iv	I
/*     */     //   1089	55	49	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1086	58	48	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1082	64	47	$i$f$set-impl	I
/*     */     //   1079	67	46	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1045	115	45	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1042	118	44	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   972	284	43	$i$f$ReusableComposeNode	I
/*     */     //   969	287	41	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   969	287	42	$changed$iv$iv$iv	I
/*     */     //   909	353	37	$i$f$Layout	I
/*     */     //   928	334	38	compositeKeyHash$iv$iv	I
/*     */     //   937	325	39	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   946	316	40	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   906	356	36	$changed$iv$iv	I
/*     */     //   873	395	33	$i$f$Box	I
/*     */     //   896	372	35	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   870	398	30	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   870	398	31	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   887	381	34	propagateMinConstraints$iv	Z
/*     */     //   870	398	32	$changed$iv	I
/*     */     //   1663	21	56	$i$a$-Box-TextFieldKt$TextFieldDecorationBox$2$2	I
/*     */     //   1660	24	55	$this$TextFieldDecorationBox_hYmLsZ8_u24lambda_u2423_u24lambda_u2420	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1660	24	54	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1660	24	53	$changed	I
/*     */     //   1624	65	52	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1621	68	51	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1621	68	50	$changed$iv	I
/*     */     //   1535	55	49	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1532	58	48	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1528	64	47	$i$f$set-impl	I
/*     */     //   1525	67	46	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1491	115	45	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1488	118	44	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1418	284	43	$i$f$ReusableComposeNode	I
/*     */     //   1415	287	41	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1415	287	42	$changed$iv$iv$iv	I
/*     */     //   1355	353	37	$i$f$Layout	I
/*     */     //   1374	334	38	compositeKeyHash$iv$iv	I
/*     */     //   1383	325	39	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1392	316	40	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1352	356	36	$changed$iv$iv	I
/*     */     //   1319	395	33	$i$f$Box	I
/*     */     //   1342	372	35	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1316	398	30	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1316	398	31	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1333	381	34	propagateMinConstraints$iv	Z
/*     */     //   1316	398	32	$changed$iv	I
/*     */     //   2109	84	56	$i$a$-Box-TextFieldKt$TextFieldDecorationBox$2$3	I
/*     */     //   2106	87	55	$this$TextFieldDecorationBox_hYmLsZ8_u24lambda_u2423_u24lambda_u2421	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2106	87	54	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2106	87	53	$changed	I
/*     */     //   2070	128	52	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2067	131	51	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2067	131	50	$changed$iv	I
/*     */     //   1981	55	49	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1978	58	48	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1974	64	47	$i$f$set-impl	I
/*     */     //   1971	67	46	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1937	115	45	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1934	118	44	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1864	347	43	$i$f$ReusableComposeNode	I
/*     */     //   1861	350	41	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1861	350	42	$changed$iv$iv$iv	I
/*     */     //   1801	416	37	$i$f$Layout	I
/*     */     //   1820	397	38	compositeKeyHash$iv$iv	I
/*     */     //   1829	388	39	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1838	379	40	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1798	419	36	$changed$iv$iv	I
/*     */     //   1765	458	33	$i$f$Box	I
/*     */     //   1788	435	35	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1762	461	30	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1762	461	31	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1779	444	34	propagateMinConstraints$iv	Z
/*     */     //   1762	461	32	$changed$iv	I
/*     */     //   2604	19	56	$i$a$-Box-TextFieldKt$TextFieldDecorationBox$2$4	I
/*     */     //   2601	22	55	$this$TextFieldDecorationBox_hYmLsZ8_u24lambda_u2423_u24lambda_u2422	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   2601	22	54	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   2601	22	53	$changed	I
/*     */     //   2565	63	52	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   2562	66	51	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2562	66	50	$changed$iv	I
/*     */     //   2476	55	49	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   2473	58	48	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2469	64	47	$i$f$set-impl	I
/*     */     //   2466	67	46	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   2432	115	45	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   2429	118	44	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   2359	282	43	$i$f$ReusableComposeNode	I
/*     */     //   2356	285	41	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   2356	285	42	$changed$iv$iv$iv	I
/*     */     //   2296	351	37	$i$f$Layout	I
/*     */     //   2315	332	38	compositeKeyHash$iv$iv	I
/*     */     //   2324	323	39	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   2333	314	40	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2293	354	36	$changed$iv$iv	I
/*     */     //   2255	398	33	$i$f$Box	I
/*     */     //   2283	370	35	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   2252	401	30	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   2274	379	31	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   2252	401	34	propagateMinConstraints$iv	Z
/*     */     //   2252	401	32	$changed$iv	I
/*     */     //   829	1825	29	$i$a$-Layout-TextFieldKt$TextFieldDecorationBox$2	I
/*     */     //   826	1828	28	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   826	1828	27	$changed	I
/*     */     //   740	55	26	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   737	58	25	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   733	64	24	$i$f$set-impl	I
/*     */     //   730	67	23	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   696	115	22	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   693	118	21	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   623	2044	20	$i$f$ReusableComposeNode	I
/*     */     //   620	2047	18	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   620	2047	19	$changed$iv$iv	I
/*     */     //   561	2112	14	$i$f$Layout	I
/*     */     //   580	2093	15	compositeKeyHash$iv	I
/*     */     //   589	2084	16	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   597	2076	17	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   558	2115	13	$changed$iv	I
/*     */     //   16	2716	11	$dirty	I
/*     */     //   0	2732	0	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2732	1	innerTextField	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2732	2	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2732	3	placeholderTextColor	J
/*     */     //   0	2732	5	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2732	6	leadingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2732	7	trailingIcon	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2732	8	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2732	9	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n1#2:346\n618#3,12:347\n*S KotlinDebug\n*F\n+ 1 TextField.kt\norg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1\n*L\n262#1:347,12\n*E\n"})
/*     */   static final class TextFieldKt$TextFieldDecorationBox$1$1 implements MeasurePolicy {
/*     */     public static final TextFieldKt$TextFieldDecorationBox$1$1 INSTANCE = new TextFieldKt$TextFieldDecorationBox$1$1();
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$Layout'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: iconst_0
/*     */       //   13: istore #5
/*     */       //   15: lload_3
/*     */       //   16: iconst_0
/*     */       //   17: iconst_0
/*     */       //   18: iconst_0
/*     */       //   19: iconst_0
/*     */       //   20: bipush #10
/*     */       //   22: aconst_null
/*     */       //   23: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */       //   26: lstore #6
/*     */       //   28: aload_2
/*     */       //   29: checkcast java/lang/Iterable
/*     */       //   32: astore #11
/*     */       //   34: aload #11
/*     */       //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   41: astore #12
/*     */       //   43: aload #12
/*     */       //   45: invokeinterface hasNext : ()Z
/*     */       //   50: ifeq -> 90
/*     */       //   53: aload #12
/*     */       //   55: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   60: astore #13
/*     */       //   62: aload #13
/*     */       //   64: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   67: astore #14
/*     */       //   69: iconst_0
/*     */       //   70: istore #15
/*     */       //   72: aload #14
/*     */       //   74: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   77: ldc 'Trailing'
/*     */       //   79: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   82: ifeq -> 43
/*     */       //   85: aload #13
/*     */       //   87: goto -> 91
/*     */       //   90: aconst_null
/*     */       //   91: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   94: dup
/*     */       //   95: ifnull -> 108
/*     */       //   98: lload #6
/*     */       //   100: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   105: goto -> 110
/*     */       //   108: pop
/*     */       //   109: aconst_null
/*     */       //   110: astore #8
/*     */       //   112: aload_2
/*     */       //   113: checkcast java/lang/Iterable
/*     */       //   116: astore #12
/*     */       //   118: aload #12
/*     */       //   120: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   125: astore #13
/*     */       //   127: aload #13
/*     */       //   129: invokeinterface hasNext : ()Z
/*     */       //   134: ifeq -> 174
/*     */       //   137: aload #13
/*     */       //   139: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   144: astore #14
/*     */       //   146: aload #14
/*     */       //   148: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   151: astore #15
/*     */       //   153: iconst_0
/*     */       //   154: istore #16
/*     */       //   156: aload #15
/*     */       //   158: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   161: ldc 'Leading'
/*     */       //   163: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   166: ifeq -> 127
/*     */       //   169: aload #14
/*     */       //   171: goto -> 175
/*     */       //   174: aconst_null
/*     */       //   175: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   178: dup
/*     */       //   179: ifnull -> 192
/*     */       //   182: lload #6
/*     */       //   184: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   189: goto -> 194
/*     */       //   192: pop
/*     */       //   193: aconst_null
/*     */       //   194: astore #9
/*     */       //   196: iload #5
/*     */       //   198: aload #8
/*     */       //   200: dup
/*     */       //   201: ifnull -> 210
/*     */       //   204: invokevirtual getWidth : ()I
/*     */       //   207: goto -> 212
/*     */       //   210: pop
/*     */       //   211: iconst_0
/*     */       //   212: iadd
/*     */       //   213: istore #5
/*     */       //   215: iload #5
/*     */       //   217: aload #9
/*     */       //   219: dup
/*     */       //   220: ifnull -> 229
/*     */       //   223: invokevirtual getWidth : ()I
/*     */       //   226: goto -> 231
/*     */       //   229: pop
/*     */       //   230: iconst_0
/*     */       //   231: iadd
/*     */       //   232: istore #5
/*     */       //   234: lload_3
/*     */       //   235: iload #5
/*     */       //   237: ineg
/*     */       //   238: iconst_0
/*     */       //   239: iconst_2
/*     */       //   240: aconst_null
/*     */       //   241: invokestatic offset-NN6Ew-U$default : (JIIILjava/lang/Object;)J
/*     */       //   244: iconst_0
/*     */       //   245: iconst_0
/*     */       //   246: iconst_0
/*     */       //   247: iconst_0
/*     */       //   248: bipush #11
/*     */       //   250: aconst_null
/*     */       //   251: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */       //   254: lstore #10
/*     */       //   256: aload_2
/*     */       //   257: checkcast java/lang/Iterable
/*     */       //   260: astore #13
/*     */       //   262: iconst_0
/*     */       //   263: istore #14
/*     */       //   265: aconst_null
/*     */       //   266: astore #15
/*     */       //   268: iconst_0
/*     */       //   269: istore #16
/*     */       //   271: aload #13
/*     */       //   273: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   278: astore #17
/*     */       //   280: aload #17
/*     */       //   282: invokeinterface hasNext : ()Z
/*     */       //   287: ifeq -> 347
/*     */       //   290: aload #17
/*     */       //   292: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   297: astore #18
/*     */       //   299: aload #18
/*     */       //   301: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   304: astore #19
/*     */       //   306: iconst_0
/*     */       //   307: istore #20
/*     */       //   309: aload #19
/*     */       //   311: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   314: ldc 'TextField'
/*     */       //   316: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   319: ifeq -> 280
/*     */       //   322: iload #16
/*     */       //   324: ifeq -> 337
/*     */       //   327: new java/lang/IllegalArgumentException
/*     */       //   330: dup
/*     */       //   331: ldc 'Collection contains more than one matching element.'
/*     */       //   333: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   336: athrow
/*     */       //   337: aload #18
/*     */       //   339: astore #15
/*     */       //   341: iconst_1
/*     */       //   342: istore #16
/*     */       //   344: goto -> 280
/*     */       //   347: iload #16
/*     */       //   349: ifne -> 362
/*     */       //   352: new java/util/NoSuchElementException
/*     */       //   355: dup
/*     */       //   356: ldc 'Collection contains no element matching the predicate.'
/*     */       //   358: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   361: athrow
/*     */       //   362: aload #15
/*     */       //   364: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   367: lload #10
/*     */       //   369: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   374: astore #12
/*     */       //   376: lload #10
/*     */       //   378: iconst_0
/*     */       //   379: aload #12
/*     */       //   381: invokevirtual getWidth : ()I
/*     */       //   384: iconst_0
/*     */       //   385: aload #12
/*     */       //   387: invokevirtual getHeight : ()I
/*     */       //   390: iconst_4
/*     */       //   391: aconst_null
/*     */       //   392: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */       //   395: lstore #13
/*     */       //   397: aload_2
/*     */       //   398: checkcast java/lang/Iterable
/*     */       //   401: astore #18
/*     */       //   403: aload #18
/*     */       //   405: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   410: astore #19
/*     */       //   412: aload #19
/*     */       //   414: invokeinterface hasNext : ()Z
/*     */       //   419: ifeq -> 459
/*     */       //   422: aload #19
/*     */       //   424: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   429: astore #20
/*     */       //   431: aload #20
/*     */       //   433: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   436: astore #21
/*     */       //   438: iconst_0
/*     */       //   439: istore #22
/*     */       //   441: aload #21
/*     */       //   443: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   446: ldc 'Placeholder'
/*     */       //   448: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   451: ifeq -> 412
/*     */       //   454: aload #20
/*     */       //   456: goto -> 460
/*     */       //   459: aconst_null
/*     */       //   460: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   463: dup
/*     */       //   464: ifnull -> 477
/*     */       //   467: lload #13
/*     */       //   469: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   474: goto -> 479
/*     */       //   477: pop
/*     */       //   478: aconst_null
/*     */       //   479: astore #15
/*     */       //   481: aload #9
/*     */       //   483: aload #8
/*     */       //   485: aload #12
/*     */       //   487: lload_3
/*     */       //   488: invokestatic access$calculateWidth--hBUhpc : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */       //   491: istore #16
/*     */       //   493: aload #9
/*     */       //   495: aload #8
/*     */       //   497: aload #12
/*     */       //   499: lload_3
/*     */       //   500: invokestatic access$calculateHeight--hBUhpc : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */       //   503: istore #17
/*     */       //   505: aload_1
/*     */       //   506: iload #16
/*     */       //   508: iload #17
/*     */       //   510: aconst_null
/*     */       //   511: iload #17
/*     */       //   513: iload #16
/*     */       //   515: aload #9
/*     */       //   517: aload #8
/*     */       //   519: aload #12
/*     */       //   521: aload #15
/*     */       //   523: <illegal opcode> invoke : (IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */       //   528: iconst_4
/*     */       //   529: aconst_null
/*     */       //   530: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   533: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #250	-> 12
/*     */       //   #251	-> 15
/*     */       //   #254	-> 28
/*     */       //   #346	-> 69
/*     */       //   #254	-> 72
/*     */       //   #254	-> 82
/*     */       //   #254	-> 91
/*     */       //   #256	-> 112
/*     */       //   #346	-> 153
/*     */       //   #256	-> 156
/*     */       //   #256	-> 166
/*     */       //   #256	-> 175
/*     */       //   #257	-> 196
/*     */       //   #258	-> 215
/*     */       //   #261	-> 234
/*     */       //   #260	-> 254
/*     */       //   #262	-> 256
/*     */       //   #347	-> 265
/*     */       //   #348	-> 268
/*     */       //   #349	-> 271
/*     */       //   #350	-> 299
/*     */       //   #262	-> 309
/*     */       //   #350	-> 319
/*     */       //   #351	-> 322
/*     */       //   #352	-> 337
/*     */       //   #353	-> 341
/*     */       //   #356	-> 347
/*     */       //   #358	-> 362
/*     */       //   #262	-> 367
/*     */       //   #266	-> 376
/*     */       //   #267	-> 378
/*     */       //   #268	-> 379
/*     */       //   #266	-> 384
/*     */       //   #269	-> 385
/*     */       //   #266	-> 390
/*     */       //   #265	-> 395
/*     */       //   #271	-> 397
/*     */       //   #346	-> 438
/*     */       //   #271	-> 441
/*     */       //   #271	-> 451
/*     */       //   #271	-> 460
/*     */       //   #273	-> 481
/*     */       //   #274	-> 493
/*     */       //   #276	-> 505
/*     */       //   #285	-> 533
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   72	10	15	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$trailingPlaceable$1	I
/*     */       //   69	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   156	10	16	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$leadingPlaceable$1	I
/*     */       //   153	13	15	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   309	10	20	$i$a$-single-TextFieldKt$TextFieldDecorationBox$1$1$textFieldPlaceable$1	I
/*     */       //   306	13	19	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   299	45	18	element$iv	Ljava/lang/Object;
/*     */       //   265	99	14	$i$f$single	I
/*     */       //   268	96	15	single$iv	Ljava/lang/Object;
/*     */       //   271	93	16	found$iv	Z
/*     */       //   262	102	13	$this$single$iv	Ljava/lang/Iterable;
/*     */       //   441	10	22	$i$a$-find-TextFieldKt$TextFieldDecorationBox$1$1$placeholderPlaceable$1	I
/*     */       //   438	13	21	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   15	519	5	occupiedSpaceHorizontally	I
/*     */       //   28	506	6	iconConstraints	J
/*     */       //   112	422	8	trailingPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   196	338	9	leadingPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   256	278	10	textFieldConstraints	J
/*     */       //   376	158	12	textFieldPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   397	137	13	placeholderConstraints	J
/*     */       //   481	53	15	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   493	41	16	width	I
/*     */       //   505	29	17	height	I
/*     */       //   0	534	0	this	Lorg/jetbrains/jewel/ui/component/TextFieldKt$TextFieldDecorationBox$1$1;
/*     */       //   0	534	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	534	2	measurables	Ljava/util/List;
/*     */       //   0	534	3	incomingConstraints	J
/*     */     }
/*     */     
/*     */     private static final Unit measure_3p2s80s$lambda$4(int $height, int $width, Placeable $leadingPlaceable, Placeable $trailingPlaceable, Placeable $textFieldPlaceable, Placeable $placeholderPlaceable, Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       TextFieldKt.place($this$layout, $height, $width, $leadingPlaceable, $trailingPlaceable, $textFieldPlaceable, $placeholderPlaceable);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final int calculateWidth--hBUhpc(Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, long constraints) {
/*     */     int middleSection = textFieldPlaceable.getWidth();
/*     */     int wrappedWidth = middleSection + ((trailingPlaceable != null) ? trailingPlaceable.getWidth() : 0) + ((leadingPlaceable != null) ? leadingPlaceable.getWidth() : 0);
/*     */     return Math.max(wrappedWidth, Constraints.getMinWidth-impl(constraints));
/*     */   }
/*     */   
/*     */   private static final int calculateHeight--hBUhpc(Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, long constraints) {
/*     */     int[] arrayOfInt = new int[3];
/*     */     arrayOfInt[0] = (leadingPlaceable != null) ? leadingPlaceable.getHeight() : 0;
/*     */     arrayOfInt[1] = (trailingPlaceable != null) ? trailingPlaceable.getHeight() : 0;
/*     */     arrayOfInt[2] = Constraints.getMinHeight-impl(constraints);
/*     */     return ComparisonsKt.maxOf(textFieldPlaceable.getHeight(), arrayOfInt);
/*     */   }
/*     */   
/*     */   private static final void place(Placeable.PlacementScope $this$place, int height, int width, Placeable leadingPlaceable, Placeable trailingPlaceable, Placeable textFieldPlaceable, Placeable placeholderPlaceable) {
/*     */     if (leadingPlaceable != null) {
/*     */       Placeable.PlacementScope.placeRelative$default($this$place, leadingPlaceable, 0, Alignment.Companion.getCenterVertically().align(leadingPlaceable.getHeight(), height), 0.0F, 4, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (trailingPlaceable != null) {
/*     */       Placeable.PlacementScope.placeRelative$default($this$place, trailingPlaceable, width - trailingPlaceable.getWidth(), Alignment.Companion.getCenterVertically().align(trailingPlaceable.getHeight(), height), 0.0F, 4, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     if (placeholderPlaceable != null) {
/*     */       Placeable.PlacementScope.placeRelative$default($this$place, placeholderPlaceable, (leadingPlaceable != null) ? leadingPlaceable.getWidth() : 0, Alignment.Companion.getCenterVertically().align(placeholderPlaceable.getHeight(), height), 0.0F, 4, null);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     Placeable.PlacementScope.placeRelative$default($this$place, textFieldPlaceable, (leadingPlaceable != null) ? leadingPlaceable.getWidth() : 0, Alignment.Companion.getCenterVertically().align(textFieldPlaceable.getHeight(), height), 0.0F, 4, null);
/*     */   }
/*     */   
/*     */   private static final Unit TextField$lambda$1(TextFieldState $state, Modifier $modifier, boolean $enabled, boolean $readOnly, InputTransformation $inputTransformation, TextStyle $textStyle, KeyboardOptions $keyboardOptions, KeyboardActionHandler $onKeyboardAction, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> $onTextLayout, MutableInteractionSource $interactionSource, TextFieldStyle $style, Outline $outline, Function2<? super Composer, ? super Integer, Unit> $placeholder, Function2<? super Composer, ? super Integer, Unit> $leadingIcon, Function2<? super Composer, ? super Integer, Unit> $trailingIcon, OutputTransformation $outputTransformation, boolean $undecorated, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextField($state, $modifier, $enabled, $readOnly, $inputTransformation, $textStyle, $keyboardOptions, $onKeyboardAction, $onTextLayout, $interactionSource, $style, $outline, $placeholder, $leadingIcon, $trailingIcon, $outputTransformation, $undecorated, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextField$lambda$13(String $value, Function1<? super String, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $readOnly, Outline $outline, Function2<? super Composer, ? super Integer, Unit> $placeholder, Function2<? super Composer, ? super Integer, Unit> $leadingIcon, Function2<? super Composer, ? super Integer, Unit> $trailingIcon, boolean $undecorated, VisualTransformation $visualTransformation, KeyboardOptions $keyboardOptions, KeyboardActions $keyboardActions, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextFieldStyle $style, MutableInteractionSource $interactionSource, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextField($value, $onValueChange, $modifier, $enabled, $readOnly, $outline, $placeholder, $leadingIcon, $trailingIcon, $undecorated, $visualTransformation, $keyboardOptions, $keyboardActions, $onTextLayout, $style, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextField$lambda$17(TextFieldValue $value, Function1<? super TextFieldValue, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $readOnly, Outline $outline, Function2<? super Composer, ? super Integer, Unit> $placeholder, Function2<? super Composer, ? super Integer, Unit> $leadingIcon, Function2<? super Composer, ? super Integer, Unit> $trailingIcon, boolean $undecorated, VisualTransformation $visualTransformation, KeyboardOptions $keyboardOptions, KeyboardActions $keyboardActions, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextFieldStyle $style, TextStyle $textStyle, MutableInteractionSource $interactionSource, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextField($value, $onValueChange, $modifier, $enabled, $readOnly, $outline, $placeholder, $leadingIcon, $trailingIcon, $undecorated, $visualTransformation, $keyboardOptions, $keyboardActions, $onTextLayout, $style, $textStyle, $interactionSource, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextFieldDecorationBox_hYmLsZ8$lambda$24(Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $innerTextField, TextStyle $textStyle, long $placeholderTextColor, Function2<? super Composer, ? super Integer, Unit> $placeholder, Function2<? super Composer, ? super Integer, Unit> $leadingIcon, Function2<? super Composer, ? super Integer, Unit> $trailingIcon, int $$changed, int $$default, Composer $composer, int $force) {
/*     */     TextFieldDecorationBox-hYmLsZ8($modifier, $innerTextField, $textStyle, $placeholderTextColor, $placeholder, $leadingIcon, $trailingIcon, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextFieldKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */