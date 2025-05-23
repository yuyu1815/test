/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.text.KeyboardActions;
/*     */ import androidx.compose.foundation.text.KeyboardOptions;
/*     */ import androidx.compose.foundation.text.input.InputTransformation;
/*     */ import androidx.compose.foundation.text.input.KeyboardActionHandler;
/*     */ import androidx.compose.foundation.text.input.OutputTransformation;
/*     */ import androidx.compose.foundation.text.input.TextFieldDecorator;
/*     */ import androidx.compose.foundation.text.input.TextFieldLineLimits;
/*     */ import androidx.compose.foundation.text.input.TextFieldState;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*     */ import androidx.compose.ui.text.TextLayoutResult;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.input.TextFieldValue;
/*     */ import androidx.compose.ui.text.input.VisualTransformation;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.DpSize;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.Outline;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000ì\001\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\032\002\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\0202\b\b\002\020\021\032\0020\02228\b\002\020\023\0322\022\004\022\0020\025\022\033\022\031\022\006\022\004\030\0010\0270\026¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\001\030\0010\024¢\006\002\b\0332\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\0372\b\b\002\020 \032\0020!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b#2\b\b\002\020$\032\0020\0052\n\b\002\020%\032\004\030\0010&2\b\b\002\020'\032\0020\0072\b\b\002\020(\032\0020)2\n\b\002\020*\032\004\030\0010+H\007¢\006\002\020,\032'\020-\032\0020.2\006\020\036\032\0020\0372\b\020*\032\004\030\0010+2\006\020(\032\0020)H\003¢\006\002\020/\032^\0200\032\0020.2\006\020\036\032\0020\0372\006\020\002\032\0020\0032\023\020\"\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b#2\006\020\013\032\0020\f2\006\020$\032\0020\0052\006\0201\032\002022\b\020*\032\004\030\0010+2\006\020(\032\0020)H\003¢\006\004\b3\0204\032;\0205\032\016\022\004\022\00207\022\004\022\00208062\b\020*\032\004\030\0010+2\006\020\036\032\0020\0372\006\020(\032\0020)2\006\0209\032\0020:H\003¢\006\002\020;\032Ø\001\020\000\032\0020\0012\006\020<\032\0020=2\022\020>\032\016\022\004\022\0020=\022\004\022\0020\0010?2\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020 \032\0020!2\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b#2\b\b\002\020'\032\0020\0072\b\b\002\020@\032\0020A2\b\b\002\020\r\032\0020\0162\b\b\002\020B\032\0020C2\b\b\002\020D\032\0020E2\024\b\002\020\023\032\016\022\004\022\0020\027\022\004\022\0020\0010?2\b\b\002\020\036\032\0020\0372\b\b\002\020\013\032\0020\f2\b\b\002\020\034\032\0020\0352\b\b\002\020$\032\0020\005H\007¢\006\002\020F\032Ø\001\020\000\032\0020\0012\006\020<\032\0020G2\022\020>\032\016\022\004\022\0020G\022\004\022\0020\0010?2\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\025\b\002\020\"\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b#2\b\b\002\020'\032\0020\0072\b\b\002\020 \032\0020!2\b\b\002\020@\032\0020A2\b\b\002\020\r\032\0020\0162\b\b\002\020B\032\0020C2\b\b\002\020D\032\0020E2\024\b\002\020\023\032\016\022\004\022\0020\027\022\004\022\0020\0010?2\b\b\002\020\036\032\0020\0372\b\b\002\020\013\032\0020\f2\b\b\002\020\034\032\0020\0352\b\b\002\020$\032\0020\005H\007¢\006\002\020H\032W\020I\032\0020\0012\021\020J\032\r\022\004\022\0020\0010\026¢\006\002\b#2\006\020\013\032\0020\f2\006\020\004\032\0020\0052\023\020\"\032\017\022\004\022\0020\001\030\0010\026¢\006\002\b#2\006\020K\032\0020L2\006\020M\032\0020\005H\003¢\006\004\bN\020O\032)\020P\032\0020E2\006\020Q\032\0020R2\b\020S\032\004\030\0010R2\006\020T\032\0020UH\002¢\006\004\bV\020W\032)\020X\032\0020E2\006\020Q\032\0020R2\b\020S\032\004\030\0010R2\006\020T\032\0020UH\002¢\006\004\bY\020W\"\016\020Z\032\0020=XT¢\006\002\n\000\"\016\020[\032\0020=XT¢\006\002\n\000¨\006\\²\006\n\020]\032\0020GX\002²\006\n\020^\032\0020=X\002"}, d2 = {"TextArea", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "style", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "outline", "Lorg/jetbrains/jewel/ui/Outline;", "placeholder", "Landroidx/compose/runtime/Composable;", "decorationBoxModifier", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "undecorated", "scrollState", "Landroidx/compose/foundation/ScrollState;", "scrollbarStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Lorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/input/OutputTransformation;ZLandroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/Composer;III)V", "NoTextAreaDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "(Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/input/TextFieldDecorator;", "TextAreaDecorator", "minSize", "Landroidx/compose/ui/unit/DpSize;", "TextAreaDecorator-zeTA2Uc", "(Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/input/TextFieldDecorator;", "calculatePaddings", "Lkotlin/Pair;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "value", "", "onValueChange", "Lkotlin/Function1;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "maxLines", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "TextAreaDecorationBox", "innerTextField", "placeholderTextColor", "Landroidx/compose/ui/graphics/Color;", "placeholderModifier", "TextAreaDecorationBox-yrwZFoE", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "calculateWidth", "textFieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "placeholderPlaceable", "incomingConstraints", "Landroidx/compose/ui/unit/Constraints;", "calculateWidth-3p2s80s", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I", "calculateHeight", "calculateHeight-3p2s80s", "PLACEHOLDER_ID", "TEXT_AREA_ID", "ui", "textFieldValueState", "lastTextValue"})
/*     */ @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,373:1\n1225#2,6:374\n1225#2,6:384\n1225#2,6:390\n1225#2,6:396\n1225#2,6:402\n1225#2,6:408\n1225#2,6:414\n1225#2,6:420\n1225#2,6:426\n149#3:380\n149#3:381\n149#3:383\n51#4:382\n79#5,6:432\n86#5,4:447\n90#5,2:457\n79#5,6:466\n86#5,4:481\n90#5,2:491\n94#5:497\n79#5,6:502\n86#5,4:517\n90#5,2:527\n94#5:533\n94#5:537\n368#6,9:438\n377#6:459\n368#6,9:472\n377#6:493\n378#6,2:495\n368#6,9:508\n377#6:529\n378#6,2:531\n378#6,2:535\n4034#7,6:451\n4034#7,6:485\n4034#7,6:521\n71#8:460\n69#8,5:461\n74#8:494\n78#8:498\n71#8,3:499\n74#8:530\n78#8:534\n81#9:538\n107#9,2:539\n81#9:541\n107#9,2:542\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt\n*L\n65#1:374,6\n208#1:384,6\n211#1:390,6\n214#1:396,6\n216#1:402,6\n221#1:408,6\n265#1:414,6\n268#1:420,6\n334#1:426,6\n177#1:380\n184#1:381\n189#1:383\n186#1:382\n313#1:432,6\n313#1:447,4\n313#1:457,2\n316#1:466,6\n316#1:481,4\n316#1:491,2\n316#1:497\n325#1:502,6\n325#1:517,4\n325#1:527,2\n325#1:533\n313#1:537\n313#1:438,9\n313#1:459\n316#1:472,9\n316#1:493\n316#1:495,2\n325#1:508,9\n325#1:529\n325#1:531,2\n313#1:535,2\n313#1:451,6\n316#1:485,6\n325#1:521,6\n316#1:460\n316#1:461,5\n316#1:494\n316#1:498\n325#1:499,3\n325#1:530\n325#1:534\n214#1:538\n214#1:539,2\n216#1:541\n216#1:542,2\n*E\n"})
/*     */ public final class TextAreaKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String PLACEHOLDER_ID = "Placeholder";
/*     */   @NotNull
/*     */   private static final String TEXT_AREA_ID = "TextField";
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
/*     */   public static final void TextArea(@NotNull TextFieldState state, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable InputTransformation inputTransformation, @Nullable TextStyle textStyle, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActionHandler onKeyboardAction, @Nullable TextFieldLineLimits lineLimits, @Nullable Function2 onTextLayout, @Nullable MutableInteractionSource interactionSource, @Nullable TextAreaStyle style, @Nullable Outline outline, @Nullable Function2 placeholder, @Nullable Modifier decorationBoxModifier, @Nullable OutputTransformation outputTransformation, boolean undecorated, @Nullable ScrollState scrollState, @Nullable ScrollbarStyle scrollbarStyle, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'state'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #19
/*     */     //   8: ldc -1415514962
/*     */     //   10: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   15: astore #19
/*     */     //   17: iload #20
/*     */     //   19: istore #23
/*     */     //   21: iload #21
/*     */     //   23: istore #24
/*     */     //   25: iload #22
/*     */     //   27: iconst_1
/*     */     //   28: iand
/*     */     //   29: ifeq -> 42
/*     */     //   32: iload #23
/*     */     //   34: bipush #6
/*     */     //   36: ior
/*     */     //   37: istore #23
/*     */     //   39: goto -> 71
/*     */     //   42: iload #20
/*     */     //   44: bipush #6
/*     */     //   46: iand
/*     */     //   47: ifne -> 71
/*     */     //   50: iload #23
/*     */     //   52: aload #19
/*     */     //   54: aload_0
/*     */     //   55: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 67
/*     */     //   63: iconst_4
/*     */     //   64: goto -> 68
/*     */     //   67: iconst_2
/*     */     //   68: ior
/*     */     //   69: istore #23
/*     */     //   71: iload #22
/*     */     //   73: iconst_2
/*     */     //   74: iand
/*     */     //   75: ifeq -> 88
/*     */     //   78: iload #23
/*     */     //   80: bipush #48
/*     */     //   82: ior
/*     */     //   83: istore #23
/*     */     //   85: goto -> 119
/*     */     //   88: iload #20
/*     */     //   90: bipush #48
/*     */     //   92: iand
/*     */     //   93: ifne -> 119
/*     */     //   96: iload #23
/*     */     //   98: aload #19
/*     */     //   100: aload_1
/*     */     //   101: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   106: ifeq -> 114
/*     */     //   109: bipush #32
/*     */     //   111: goto -> 116
/*     */     //   114: bipush #16
/*     */     //   116: ior
/*     */     //   117: istore #23
/*     */     //   119: iload #22
/*     */     //   121: iconst_4
/*     */     //   122: iand
/*     */     //   123: ifeq -> 137
/*     */     //   126: iload #23
/*     */     //   128: sipush #384
/*     */     //   131: ior
/*     */     //   132: istore #23
/*     */     //   134: goto -> 171
/*     */     //   137: iload #20
/*     */     //   139: sipush #384
/*     */     //   142: iand
/*     */     //   143: ifne -> 171
/*     */     //   146: iload #23
/*     */     //   148: aload #19
/*     */     //   150: iload_2
/*     */     //   151: invokeinterface changed : (Z)Z
/*     */     //   156: ifeq -> 165
/*     */     //   159: sipush #256
/*     */     //   162: goto -> 168
/*     */     //   165: sipush #128
/*     */     //   168: ior
/*     */     //   169: istore #23
/*     */     //   171: iload #22
/*     */     //   173: bipush #8
/*     */     //   175: iand
/*     */     //   176: ifeq -> 190
/*     */     //   179: iload #23
/*     */     //   181: sipush #3072
/*     */     //   184: ior
/*     */     //   185: istore #23
/*     */     //   187: goto -> 224
/*     */     //   190: iload #20
/*     */     //   192: sipush #3072
/*     */     //   195: iand
/*     */     //   196: ifne -> 224
/*     */     //   199: iload #23
/*     */     //   201: aload #19
/*     */     //   203: iload_3
/*     */     //   204: invokeinterface changed : (Z)Z
/*     */     //   209: ifeq -> 218
/*     */     //   212: sipush #2048
/*     */     //   215: goto -> 221
/*     */     //   218: sipush #1024
/*     */     //   221: ior
/*     */     //   222: istore #23
/*     */     //   224: iload #22
/*     */     //   226: bipush #16
/*     */     //   228: iand
/*     */     //   229: ifeq -> 243
/*     */     //   232: iload #23
/*     */     //   234: sipush #24576
/*     */     //   237: ior
/*     */     //   238: istore #23
/*     */     //   240: goto -> 278
/*     */     //   243: iload #20
/*     */     //   245: sipush #24576
/*     */     //   248: iand
/*     */     //   249: ifne -> 278
/*     */     //   252: iload #23
/*     */     //   254: aload #19
/*     */     //   256: aload #4
/*     */     //   258: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   263: ifeq -> 272
/*     */     //   266: sipush #16384
/*     */     //   269: goto -> 275
/*     */     //   272: sipush #8192
/*     */     //   275: ior
/*     */     //   276: istore #23
/*     */     //   278: iload #20
/*     */     //   280: ldc 196608
/*     */     //   282: iand
/*     */     //   283: ifne -> 318
/*     */     //   286: iload #23
/*     */     //   288: iload #22
/*     */     //   290: bipush #32
/*     */     //   292: iand
/*     */     //   293: ifne -> 313
/*     */     //   296: aload #19
/*     */     //   298: aload #5
/*     */     //   300: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   305: ifeq -> 313
/*     */     //   308: ldc 131072
/*     */     //   310: goto -> 315
/*     */     //   313: ldc 65536
/*     */     //   315: ior
/*     */     //   316: istore #23
/*     */     //   318: iload #22
/*     */     //   320: bipush #64
/*     */     //   322: iand
/*     */     //   323: ifeq -> 336
/*     */     //   326: iload #23
/*     */     //   328: ldc 1572864
/*     */     //   330: ior
/*     */     //   331: istore #23
/*     */     //   333: goto -> 368
/*     */     //   336: iload #20
/*     */     //   338: ldc 1572864
/*     */     //   340: iand
/*     */     //   341: ifne -> 368
/*     */     //   344: iload #23
/*     */     //   346: aload #19
/*     */     //   348: aload #6
/*     */     //   350: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   355: ifeq -> 363
/*     */     //   358: ldc 1048576
/*     */     //   360: goto -> 365
/*     */     //   363: ldc 524288
/*     */     //   365: ior
/*     */     //   366: istore #23
/*     */     //   368: iload #22
/*     */     //   370: sipush #128
/*     */     //   373: iand
/*     */     //   374: ifeq -> 387
/*     */     //   377: iload #23
/*     */     //   379: ldc 12582912
/*     */     //   381: ior
/*     */     //   382: istore #23
/*     */     //   384: goto -> 419
/*     */     //   387: iload #20
/*     */     //   389: ldc 12582912
/*     */     //   391: iand
/*     */     //   392: ifne -> 419
/*     */     //   395: iload #23
/*     */     //   397: aload #19
/*     */     //   399: aload #7
/*     */     //   401: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   406: ifeq -> 414
/*     */     //   409: ldc 8388608
/*     */     //   411: goto -> 416
/*     */     //   414: ldc 4194304
/*     */     //   416: ior
/*     */     //   417: istore #23
/*     */     //   419: iload #22
/*     */     //   421: sipush #256
/*     */     //   424: iand
/*     */     //   425: ifeq -> 438
/*     */     //   428: iload #23
/*     */     //   430: ldc 100663296
/*     */     //   432: ior
/*     */     //   433: istore #23
/*     */     //   435: goto -> 470
/*     */     //   438: iload #20
/*     */     //   440: ldc 100663296
/*     */     //   442: iand
/*     */     //   443: ifne -> 470
/*     */     //   446: iload #23
/*     */     //   448: aload #19
/*     */     //   450: aload #8
/*     */     //   452: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   457: ifeq -> 465
/*     */     //   460: ldc 67108864
/*     */     //   462: goto -> 467
/*     */     //   465: ldc 33554432
/*     */     //   467: ior
/*     */     //   468: istore #23
/*     */     //   470: iload #22
/*     */     //   472: sipush #512
/*     */     //   475: iand
/*     */     //   476: ifeq -> 489
/*     */     //   479: iload #23
/*     */     //   481: ldc 805306368
/*     */     //   483: ior
/*     */     //   484: istore #23
/*     */     //   486: goto -> 521
/*     */     //   489: iload #20
/*     */     //   491: ldc 805306368
/*     */     //   493: iand
/*     */     //   494: ifne -> 521
/*     */     //   497: iload #23
/*     */     //   499: aload #19
/*     */     //   501: aload #9
/*     */     //   503: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   508: ifeq -> 516
/*     */     //   511: ldc 536870912
/*     */     //   513: goto -> 518
/*     */     //   516: ldc 268435456
/*     */     //   518: ior
/*     */     //   519: istore #23
/*     */     //   521: iload #22
/*     */     //   523: sipush #1024
/*     */     //   526: iand
/*     */     //   527: ifeq -> 540
/*     */     //   530: iload #24
/*     */     //   532: bipush #6
/*     */     //   534: ior
/*     */     //   535: istore #24
/*     */     //   537: goto -> 570
/*     */     //   540: iload #21
/*     */     //   542: bipush #6
/*     */     //   544: iand
/*     */     //   545: ifne -> 570
/*     */     //   548: iload #24
/*     */     //   550: aload #19
/*     */     //   552: aload #10
/*     */     //   554: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   559: ifeq -> 566
/*     */     //   562: iconst_4
/*     */     //   563: goto -> 567
/*     */     //   566: iconst_2
/*     */     //   567: ior
/*     */     //   568: istore #24
/*     */     //   570: iload #21
/*     */     //   572: bipush #48
/*     */     //   574: iand
/*     */     //   575: ifne -> 611
/*     */     //   578: iload #24
/*     */     //   580: iload #22
/*     */     //   582: sipush #2048
/*     */     //   585: iand
/*     */     //   586: ifne -> 606
/*     */     //   589: aload #19
/*     */     //   591: aload #11
/*     */     //   593: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   598: ifeq -> 606
/*     */     //   601: bipush #32
/*     */     //   603: goto -> 608
/*     */     //   606: bipush #16
/*     */     //   608: ior
/*     */     //   609: istore #24
/*     */     //   611: iload #22
/*     */     //   613: sipush #4096
/*     */     //   616: iand
/*     */     //   617: ifeq -> 631
/*     */     //   620: iload #24
/*     */     //   622: sipush #384
/*     */     //   625: ior
/*     */     //   626: istore #24
/*     */     //   628: goto -> 666
/*     */     //   631: iload #21
/*     */     //   633: sipush #384
/*     */     //   636: iand
/*     */     //   637: ifne -> 666
/*     */     //   640: iload #24
/*     */     //   642: aload #19
/*     */     //   644: aload #12
/*     */     //   646: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   651: ifeq -> 660
/*     */     //   654: sipush #256
/*     */     //   657: goto -> 663
/*     */     //   660: sipush #128
/*     */     //   663: ior
/*     */     //   664: istore #24
/*     */     //   666: iload #22
/*     */     //   668: sipush #8192
/*     */     //   671: iand
/*     */     //   672: ifeq -> 686
/*     */     //   675: iload #24
/*     */     //   677: sipush #3072
/*     */     //   680: ior
/*     */     //   681: istore #24
/*     */     //   683: goto -> 721
/*     */     //   686: iload #21
/*     */     //   688: sipush #3072
/*     */     //   691: iand
/*     */     //   692: ifne -> 721
/*     */     //   695: iload #24
/*     */     //   697: aload #19
/*     */     //   699: aload #13
/*     */     //   701: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   706: ifeq -> 715
/*     */     //   709: sipush #2048
/*     */     //   712: goto -> 718
/*     */     //   715: sipush #1024
/*     */     //   718: ior
/*     */     //   719: istore #24
/*     */     //   721: iload #22
/*     */     //   723: sipush #16384
/*     */     //   726: iand
/*     */     //   727: ifeq -> 741
/*     */     //   730: iload #24
/*     */     //   732: sipush #24576
/*     */     //   735: ior
/*     */     //   736: istore #24
/*     */     //   738: goto -> 776
/*     */     //   741: iload #21
/*     */     //   743: sipush #24576
/*     */     //   746: iand
/*     */     //   747: ifne -> 776
/*     */     //   750: iload #24
/*     */     //   752: aload #19
/*     */     //   754: aload #14
/*     */     //   756: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   761: ifeq -> 770
/*     */     //   764: sipush #16384
/*     */     //   767: goto -> 773
/*     */     //   770: sipush #8192
/*     */     //   773: ior
/*     */     //   774: istore #24
/*     */     //   776: iload #22
/*     */     //   778: ldc 32768
/*     */     //   780: iand
/*     */     //   781: ifeq -> 794
/*     */     //   784: iload #24
/*     */     //   786: ldc 196608
/*     */     //   788: ior
/*     */     //   789: istore #24
/*     */     //   791: goto -> 826
/*     */     //   794: iload #21
/*     */     //   796: ldc 196608
/*     */     //   798: iand
/*     */     //   799: ifne -> 826
/*     */     //   802: iload #24
/*     */     //   804: aload #19
/*     */     //   806: aload #15
/*     */     //   808: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   813: ifeq -> 821
/*     */     //   816: ldc 131072
/*     */     //   818: goto -> 823
/*     */     //   821: ldc 65536
/*     */     //   823: ior
/*     */     //   824: istore #24
/*     */     //   826: iload #22
/*     */     //   828: ldc 65536
/*     */     //   830: iand
/*     */     //   831: ifeq -> 844
/*     */     //   834: iload #24
/*     */     //   836: ldc 1572864
/*     */     //   838: ior
/*     */     //   839: istore #24
/*     */     //   841: goto -> 876
/*     */     //   844: iload #21
/*     */     //   846: ldc 1572864
/*     */     //   848: iand
/*     */     //   849: ifne -> 876
/*     */     //   852: iload #24
/*     */     //   854: aload #19
/*     */     //   856: iload #16
/*     */     //   858: invokeinterface changed : (Z)Z
/*     */     //   863: ifeq -> 871
/*     */     //   866: ldc 1048576
/*     */     //   868: goto -> 873
/*     */     //   871: ldc 524288
/*     */     //   873: ior
/*     */     //   874: istore #24
/*     */     //   876: iload #21
/*     */     //   878: ldc 12582912
/*     */     //   880: iand
/*     */     //   881: ifne -> 916
/*     */     //   884: iload #24
/*     */     //   886: iload #22
/*     */     //   888: ldc 131072
/*     */     //   890: iand
/*     */     //   891: ifne -> 911
/*     */     //   894: aload #19
/*     */     //   896: aload #17
/*     */     //   898: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   903: ifeq -> 911
/*     */     //   906: ldc 8388608
/*     */     //   908: goto -> 913
/*     */     //   911: ldc 4194304
/*     */     //   913: ior
/*     */     //   914: istore #24
/*     */     //   916: iload #21
/*     */     //   918: ldc 100663296
/*     */     //   920: iand
/*     */     //   921: ifne -> 956
/*     */     //   924: iload #24
/*     */     //   926: iload #22
/*     */     //   928: ldc 262144
/*     */     //   930: iand
/*     */     //   931: ifne -> 951
/*     */     //   934: aload #19
/*     */     //   936: aload #18
/*     */     //   938: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   943: ifeq -> 951
/*     */     //   946: ldc 67108864
/*     */     //   948: goto -> 953
/*     */     //   951: ldc 33554432
/*     */     //   953: ior
/*     */     //   954: istore #24
/*     */     //   956: iload #23
/*     */     //   958: ldc 306783379
/*     */     //   960: iand
/*     */     //   961: ldc 306783378
/*     */     //   963: if_icmpne -> 986
/*     */     //   966: iload #24
/*     */     //   968: ldc 38347923
/*     */     //   970: iand
/*     */     //   971: ldc 38347922
/*     */     //   973: if_icmpne -> 986
/*     */     //   976: aload #19
/*     */     //   978: invokeinterface getSkipping : ()Z
/*     */     //   983: ifne -> 1804
/*     */     //   986: aload #19
/*     */     //   988: invokeinterface startDefaults : ()V
/*     */     //   993: iload #20
/*     */     //   995: iconst_1
/*     */     //   996: iand
/*     */     //   997: ifeq -> 1010
/*     */     //   1000: aload #19
/*     */     //   1002: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   1007: ifeq -> 1388
/*     */     //   1010: iload #22
/*     */     //   1012: iconst_2
/*     */     //   1013: iand
/*     */     //   1014: ifeq -> 1024
/*     */     //   1017: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1020: checkcast androidx/compose/ui/Modifier
/*     */     //   1023: astore_1
/*     */     //   1024: iload #22
/*     */     //   1026: iconst_4
/*     */     //   1027: iand
/*     */     //   1028: ifeq -> 1033
/*     */     //   1031: iconst_1
/*     */     //   1032: istore_2
/*     */     //   1033: iload #22
/*     */     //   1035: bipush #8
/*     */     //   1037: iand
/*     */     //   1038: ifeq -> 1043
/*     */     //   1041: iconst_0
/*     */     //   1042: istore_3
/*     */     //   1043: iload #22
/*     */     //   1045: bipush #16
/*     */     //   1047: iand
/*     */     //   1048: ifeq -> 1054
/*     */     //   1051: aconst_null
/*     */     //   1052: astore #4
/*     */     //   1054: iload #22
/*     */     //   1056: bipush #32
/*     */     //   1058: iand
/*     */     //   1059: ifeq -> 1081
/*     */     //   1062: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1065: aload #19
/*     */     //   1067: bipush #6
/*     */     //   1069: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1072: astore #5
/*     */     //   1074: iload #23
/*     */     //   1076: ldc -458753
/*     */     //   1078: iand
/*     */     //   1079: istore #23
/*     */     //   1081: iload #22
/*     */     //   1083: bipush #64
/*     */     //   1085: iand
/*     */     //   1086: ifeq -> 1097
/*     */     //   1089: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1092: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1095: astore #6
/*     */     //   1097: iload #22
/*     */     //   1099: sipush #128
/*     */     //   1102: iand
/*     */     //   1103: ifeq -> 1109
/*     */     //   1106: aconst_null
/*     */     //   1107: astore #7
/*     */     //   1109: iload #22
/*     */     //   1111: sipush #256
/*     */     //   1114: iand
/*     */     //   1115: ifeq -> 1134
/*     */     //   1118: new androidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine
/*     */     //   1121: dup
/*     */     //   1122: iconst_0
/*     */     //   1123: iconst_0
/*     */     //   1124: iconst_3
/*     */     //   1125: aconst_null
/*     */     //   1126: invokespecial <init> : (IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1129: checkcast androidx/compose/foundation/text/input/TextFieldLineLimits
/*     */     //   1132: astore #8
/*     */     //   1134: iload #22
/*     */     //   1136: sipush #512
/*     */     //   1139: iand
/*     */     //   1140: ifeq -> 1146
/*     */     //   1143: aconst_null
/*     */     //   1144: astore #9
/*     */     //   1146: iload #22
/*     */     //   1148: sipush #1024
/*     */     //   1151: iand
/*     */     //   1152: ifeq -> 1240
/*     */     //   1155: aload #19
/*     */     //   1157: ldc 950858527
/*     */     //   1159: invokeinterface startReplaceGroup : (I)V
/*     */     //   1164: aload #19
/*     */     //   1166: astore #26
/*     */     //   1168: iconst_0
/*     */     //   1169: istore #27
/*     */     //   1171: iconst_0
/*     */     //   1172: istore #28
/*     */     //   1174: aload #26
/*     */     //   1176: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1181: astore #29
/*     */     //   1183: iconst_0
/*     */     //   1184: istore #30
/*     */     //   1186: aload #29
/*     */     //   1188: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1191: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1194: if_acmpne -> 1219
/*     */     //   1197: iconst_0
/*     */     //   1198: istore #31
/*     */     //   1200: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1203: astore #31
/*     */     //   1205: aload #26
/*     */     //   1207: aload #31
/*     */     //   1209: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1214: aload #31
/*     */     //   1216: goto -> 1221
/*     */     //   1219: aload #29
/*     */     //   1221: nop
/*     */     //   1222: nop
/*     */     //   1223: nop
/*     */     //   1224: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1227: astore #25
/*     */     //   1229: aload #19
/*     */     //   1231: invokeinterface endReplaceGroup : ()V
/*     */     //   1236: aload #25
/*     */     //   1238: astore #10
/*     */     //   1240: iload #22
/*     */     //   1242: sipush #2048
/*     */     //   1245: iand
/*     */     //   1246: ifeq -> 1268
/*     */     //   1249: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1252: aload #19
/*     */     //   1254: bipush #6
/*     */     //   1256: invokestatic getTextAreaStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   1259: astore #11
/*     */     //   1261: iload #24
/*     */     //   1263: bipush #-113
/*     */     //   1265: iand
/*     */     //   1266: istore #24
/*     */     //   1268: iload #22
/*     */     //   1270: sipush #4096
/*     */     //   1273: iand
/*     */     //   1274: ifeq -> 1282
/*     */     //   1277: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   1280: astore #12
/*     */     //   1282: iload #22
/*     */     //   1284: sipush #8192
/*     */     //   1287: iand
/*     */     //   1288: ifeq -> 1294
/*     */     //   1291: aconst_null
/*     */     //   1292: astore #13
/*     */     //   1294: iload #22
/*     */     //   1296: sipush #16384
/*     */     //   1299: iand
/*     */     //   1300: ifeq -> 1311
/*     */     //   1303: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1306: checkcast androidx/compose/ui/Modifier
/*     */     //   1309: astore #14
/*     */     //   1311: iload #22
/*     */     //   1313: ldc 32768
/*     */     //   1315: iand
/*     */     //   1316: ifeq -> 1322
/*     */     //   1319: aconst_null
/*     */     //   1320: astore #15
/*     */     //   1322: iload #22
/*     */     //   1324: ldc 65536
/*     */     //   1326: iand
/*     */     //   1327: ifeq -> 1333
/*     */     //   1330: iconst_0
/*     */     //   1331: istore #16
/*     */     //   1333: iload #22
/*     */     //   1335: ldc 131072
/*     */     //   1337: iand
/*     */     //   1338: ifeq -> 1358
/*     */     //   1341: iconst_0
/*     */     //   1342: aload #19
/*     */     //   1344: iconst_0
/*     */     //   1345: iconst_1
/*     */     //   1346: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*     */     //   1349: astore #17
/*     */     //   1351: iload #24
/*     */     //   1353: ldc -29360129
/*     */     //   1355: iand
/*     */     //   1356: istore #24
/*     */     //   1358: iload #22
/*     */     //   1360: ldc 262144
/*     */     //   1362: iand
/*     */     //   1363: ifeq -> 1456
/*     */     //   1366: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1369: aload #19
/*     */     //   1371: bipush #6
/*     */     //   1373: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   1376: astore #18
/*     */     //   1378: iload #24
/*     */     //   1380: ldc -234881025
/*     */     //   1382: iand
/*     */     //   1383: istore #24
/*     */     //   1385: goto -> 1456
/*     */     //   1388: aload #19
/*     */     //   1390: invokeinterface skipToGroupEnd : ()V
/*     */     //   1395: iload #22
/*     */     //   1397: bipush #32
/*     */     //   1399: iand
/*     */     //   1400: ifeq -> 1410
/*     */     //   1403: iload #23
/*     */     //   1405: ldc -458753
/*     */     //   1407: iand
/*     */     //   1408: istore #23
/*     */     //   1410: iload #22
/*     */     //   1412: sipush #2048
/*     */     //   1415: iand
/*     */     //   1416: ifeq -> 1426
/*     */     //   1419: iload #24
/*     */     //   1421: bipush #-113
/*     */     //   1423: iand
/*     */     //   1424: istore #24
/*     */     //   1426: iload #22
/*     */     //   1428: ldc 131072
/*     */     //   1430: iand
/*     */     //   1431: ifeq -> 1441
/*     */     //   1434: iload #24
/*     */     //   1436: ldc -29360129
/*     */     //   1438: iand
/*     */     //   1439: istore #24
/*     */     //   1441: iload #22
/*     */     //   1443: ldc 262144
/*     */     //   1445: iand
/*     */     //   1446: ifeq -> 1456
/*     */     //   1449: iload #24
/*     */     //   1451: ldc -234881025
/*     */     //   1453: iand
/*     */     //   1454: istore #24
/*     */     //   1456: aload #19
/*     */     //   1458: invokeinterface endDefaults : ()V
/*     */     //   1463: invokestatic isTraceInProgress : ()Z
/*     */     //   1466: ifeq -> 1480
/*     */     //   1469: ldc -1415514962
/*     */     //   1471: iload #23
/*     */     //   1473: iload #24
/*     */     //   1475: ldc 'org.jetbrains.jewel.ui.component.TextArea (TextArea.kt:73)'
/*     */     //   1477: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1480: aload #11
/*     */     //   1482: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TextAreaMetrics;
/*     */     //   1485: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1488: lstore #25
/*     */     //   1490: aload_0
/*     */     //   1491: aload_1
/*     */     //   1492: iload_2
/*     */     //   1493: iload_3
/*     */     //   1494: aload #4
/*     */     //   1496: aload #5
/*     */     //   1498: aload #6
/*     */     //   1500: aload #7
/*     */     //   1502: aload #8
/*     */     //   1504: aload #9
/*     */     //   1506: aload #10
/*     */     //   1508: aload #11
/*     */     //   1510: checkcast org/jetbrains/jewel/ui/component/styling/InputFieldStyle
/*     */     //   1513: aload #12
/*     */     //   1515: aload #15
/*     */     //   1517: iload #16
/*     */     //   1519: ifeq -> 1582
/*     */     //   1522: aload #19
/*     */     //   1524: ldc -587117613
/*     */     //   1526: invokeinterface startReplaceGroup : (I)V
/*     */     //   1531: aload #11
/*     */     //   1533: aload #18
/*     */     //   1535: aload #17
/*     */     //   1537: aload #19
/*     */     //   1539: bipush #14
/*     */     //   1541: iload #24
/*     */     //   1543: iconst_3
/*     */     //   1544: ishr
/*     */     //   1545: iand
/*     */     //   1546: bipush #112
/*     */     //   1548: iload #24
/*     */     //   1550: bipush #21
/*     */     //   1552: ishr
/*     */     //   1553: iand
/*     */     //   1554: ior
/*     */     //   1555: sipush #896
/*     */     //   1558: iload #24
/*     */     //   1560: bipush #15
/*     */     //   1562: ishr
/*     */     //   1563: iand
/*     */     //   1564: ior
/*     */     //   1565: invokestatic NoTextAreaDecorator : (Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/input/TextFieldDecorator;
/*     */     //   1568: astore #27
/*     */     //   1570: aload #19
/*     */     //   1572: invokeinterface endReplaceGroup : ()V
/*     */     //   1577: aload #27
/*     */     //   1579: goto -> 1677
/*     */     //   1582: aload #19
/*     */     //   1584: ldc -587017917
/*     */     //   1586: invokeinterface startReplaceGroup : (I)V
/*     */     //   1591: aload #11
/*     */     //   1593: aload_0
/*     */     //   1594: aload #13
/*     */     //   1596: aload #5
/*     */     //   1598: aload #14
/*     */     //   1600: lload #25
/*     */     //   1602: aload #18
/*     */     //   1604: aload #17
/*     */     //   1606: aload #19
/*     */     //   1608: bipush #14
/*     */     //   1610: iload #24
/*     */     //   1612: iconst_3
/*     */     //   1613: ishr
/*     */     //   1614: iand
/*     */     //   1615: bipush #112
/*     */     //   1617: iload #23
/*     */     //   1619: iconst_3
/*     */     //   1620: ishl
/*     */     //   1621: iand
/*     */     //   1622: ior
/*     */     //   1623: sipush #896
/*     */     //   1626: iload #24
/*     */     //   1628: iconst_3
/*     */     //   1629: ishr
/*     */     //   1630: iand
/*     */     //   1631: ior
/*     */     //   1632: sipush #7168
/*     */     //   1635: iload #23
/*     */     //   1637: bipush #6
/*     */     //   1639: ishr
/*     */     //   1640: iand
/*     */     //   1641: ior
/*     */     //   1642: ldc 57344
/*     */     //   1644: iload #24
/*     */     //   1646: iand
/*     */     //   1647: ior
/*     */     //   1648: ldc 3670016
/*     */     //   1650: iload #24
/*     */     //   1652: bipush #6
/*     */     //   1654: ishr
/*     */     //   1655: iand
/*     */     //   1656: ior
/*     */     //   1657: ldc 29360128
/*     */     //   1659: iload #24
/*     */     //   1661: iand
/*     */     //   1662: ior
/*     */     //   1663: invokestatic TextAreaDecorator-zeTA2Uc : (Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;JLorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/input/TextFieldDecorator;
/*     */     //   1666: astore #27
/*     */     //   1668: aload #19
/*     */     //   1670: invokeinterface endReplaceGroup : ()V
/*     */     //   1675: aload #27
/*     */     //   1677: iload #16
/*     */     //   1679: aload #17
/*     */     //   1681: aload #19
/*     */     //   1683: bipush #14
/*     */     //   1685: iload #23
/*     */     //   1687: iand
/*     */     //   1688: bipush #112
/*     */     //   1690: iload #23
/*     */     //   1692: iand
/*     */     //   1693: ior
/*     */     //   1694: sipush #896
/*     */     //   1697: iload #23
/*     */     //   1699: iand
/*     */     //   1700: ior
/*     */     //   1701: sipush #7168
/*     */     //   1704: iload #23
/*     */     //   1706: iand
/*     */     //   1707: ior
/*     */     //   1708: ldc 57344
/*     */     //   1710: iload #23
/*     */     //   1712: iand
/*     */     //   1713: ior
/*     */     //   1714: ldc 458752
/*     */     //   1716: iload #23
/*     */     //   1718: iand
/*     */     //   1719: ior
/*     */     //   1720: ldc 3670016
/*     */     //   1722: iload #23
/*     */     //   1724: iand
/*     */     //   1725: ior
/*     */     //   1726: ldc 29360128
/*     */     //   1728: iload #23
/*     */     //   1730: iand
/*     */     //   1731: ior
/*     */     //   1732: ldc 234881024
/*     */     //   1734: iload #23
/*     */     //   1736: iand
/*     */     //   1737: ior
/*     */     //   1738: ldc 1879048192
/*     */     //   1740: iload #23
/*     */     //   1742: iand
/*     */     //   1743: ior
/*     */     //   1744: bipush #14
/*     */     //   1746: iload #24
/*     */     //   1748: iand
/*     */     //   1749: bipush #112
/*     */     //   1751: iload #24
/*     */     //   1753: iand
/*     */     //   1754: ior
/*     */     //   1755: sipush #896
/*     */     //   1758: iload #24
/*     */     //   1760: iand
/*     */     //   1761: ior
/*     */     //   1762: sipush #7168
/*     */     //   1765: iload #24
/*     */     //   1767: bipush #6
/*     */     //   1769: ishr
/*     */     //   1770: iand
/*     */     //   1771: ior
/*     */     //   1772: ldc 458752
/*     */     //   1774: iload #24
/*     */     //   1776: iconst_3
/*     */     //   1777: ishr
/*     */     //   1778: iand
/*     */     //   1779: ior
/*     */     //   1780: ldc 3670016
/*     */     //   1782: iload #24
/*     */     //   1784: iconst_3
/*     */     //   1785: ishr
/*     */     //   1786: iand
/*     */     //   1787: ior
/*     */     //   1788: iconst_0
/*     */     //   1789: invokestatic InputField : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Lorg/jetbrains/jewel/ui/Outline;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1792: invokestatic isTraceInProgress : ()Z
/*     */     //   1795: ifeq -> 1811
/*     */     //   1798: invokestatic traceEventEnd : ()V
/*     */     //   1801: goto -> 1811
/*     */     //   1804: aload #19
/*     */     //   1806: invokeinterface skipToGroupEnd : ()V
/*     */     //   1811: aload #19
/*     */     //   1813: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1818: dup
/*     */     //   1819: ifnull -> 1875
/*     */     //   1822: aload_0
/*     */     //   1823: aload_1
/*     */     //   1824: iload_2
/*     */     //   1825: iload_3
/*     */     //   1826: aload #4
/*     */     //   1828: aload #5
/*     */     //   1830: aload #6
/*     */     //   1832: aload #7
/*     */     //   1834: aload #8
/*     */     //   1836: aload #9
/*     */     //   1838: aload #10
/*     */     //   1840: aload #11
/*     */     //   1842: aload #12
/*     */     //   1844: aload #13
/*     */     //   1846: aload #14
/*     */     //   1848: aload #15
/*     */     //   1850: iload #16
/*     */     //   1852: aload #17
/*     */     //   1854: aload #18
/*     */     //   1856: iload #20
/*     */     //   1858: iload #21
/*     */     //   1860: iload #22
/*     */     //   1862: <illegal opcode> invoke : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Lorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/input/OutputTransformation;ZLandroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1867: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1872: goto -> 1876
/*     */     //   1875: pop
/*     */     //   1876: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 6
/*     */     //   #56	-> 1017
/*     */     //   #57	-> 1031
/*     */     //   #58	-> 1041
/*     */     //   #59	-> 1051
/*     */     //   #60	-> 1062
/*     */     //   #61	-> 1089
/*     */     //   #62	-> 1106
/*     */     //   #63	-> 1118
/*     */     //   #64	-> 1143
/*     */     //   #65	-> 1155
/*     */     //   #374	-> 1174
/*     */     //   #375	-> 1186
/*     */     //   #376	-> 1197
/*     */     //   #65	-> 1200
/*     */     //   #376	-> 1203
/*     */     //   #377	-> 1205
/*     */     //   #378	-> 1214
/*     */     //   #379	-> 1219
/*     */     //   #375	-> 1221
/*     */     //   #374	-> 1222
/*     */     //   #374	-> 1223
/*     */     //   #65	-> 1224
/*     */     //   #66	-> 1249
/*     */     //   #67	-> 1277
/*     */     //   #68	-> 1291
/*     */     //   #69	-> 1303
/*     */     //   #70	-> 1319
/*     */     //   #71	-> 1330
/*     */     //   #72	-> 1341
/*     */     //   #73	-> 1366
/*     */     //   #74	-> 1477
/*     */     //   #75	-> 1480
/*     */     //   #77	-> 1490
/*     */     //   #78	-> 1491
/*     */     //   #79	-> 1492
/*     */     //   #80	-> 1493
/*     */     //   #81	-> 1494
/*     */     //   #82	-> 1496
/*     */     //   #83	-> 1498
/*     */     //   #84	-> 1500
/*     */     //   #85	-> 1502
/*     */     //   #86	-> 1504
/*     */     //   #87	-> 1506
/*     */     //   #88	-> 1508
/*     */     //   #89	-> 1513
/*     */     //   #90	-> 1515
/*     */     //   #92	-> 1517
/*     */     //   #93	-> 1531
/*     */     //   #92	-> 1568
/*     */     //   #94	-> 1582
/*     */     //   #96	-> 1591
/*     */     //   #97	-> 1593
/*     */     //   #98	-> 1594
/*     */     //   #99	-> 1596
/*     */     //   #100	-> 1598
/*     */     //   #101	-> 1600
/*     */     //   #102	-> 1602
/*     */     //   #103	-> 1604
/*     */     //   #95	-> 1663
/*     */     //   #94	-> 1666
/*     */     //   #106	-> 1677
/*     */     //   #107	-> 1679
/*     */     //   #76	-> 1789
/*     */     //   #109	-> 1804
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1200	3	31	$i$a$-cache-TextAreaKt$TextArea$1	I
/*     */     //   1205	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1186	36	30	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1183	39	29	it$iv	Ljava/lang/Object;
/*     */     //   1174	50	28	$i$f$cache	I
/*     */     //   1171	53	26	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1171	53	27	invalid$iv	Z
/*     */     //   1490	311	25	minSize	J
/*     */     //   21	1856	23	$dirty	I
/*     */     //   25	1852	24	$dirty1	I
/*     */     //   0	1877	0	state	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	1877	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1877	2	enabled	Z
/*     */     //   0	1877	3	readOnly	Z
/*     */     //   0	1877	4	inputTransformation	Landroidx/compose/foundation/text/input/InputTransformation;
/*     */     //   0	1877	5	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1877	6	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1877	7	onKeyboardAction	Landroidx/compose/foundation/text/input/KeyboardActionHandler;
/*     */     //   0	1877	8	lineLimits	Landroidx/compose/foundation/text/input/TextFieldLineLimits;
/*     */     //   0	1877	9	onTextLayout	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1877	10	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1877	11	style	Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   0	1877	12	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1877	13	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1877	14	decorationBoxModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1877	15	outputTransformation	Landroidx/compose/foundation/text/input/OutputTransformation;
/*     */     //   0	1877	16	undecorated	Z
/*     */     //   0	1877	17	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   0	1877	18	scrollbarStyle	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	1877	19	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1877	20	$changed	I
/*     */     //   0	1877	21	$changed1	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final TextFieldDecorator NoTextAreaDecorator(TextAreaStyle style, ScrollbarStyle scrollbarStyle, ScrollState scrollState, Composer $composer, int $changed) {
/* 113 */     $composer.startReplaceGroup(-1831605180); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1831605180, $changed, -1, "org.jetbrains.jewel.ui.component.NoTextAreaDecorator (TextArea.kt:112)");  TextAreaKt$NoTextAreaDecorator$1 textAreaKt$NoTextAreaDecorator$1 = new TextAreaKt$NoTextAreaDecorator$1(scrollbarStyle, style, scrollState); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textAreaKt$NoTextAreaDecorator$1; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}) @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$NoTextAreaDecorator$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,373:1\n77#2:374\n71#3:375\n68#3,6:376\n74#3:410\n78#3:414\n79#4,6:382\n86#4,4:397\n90#4,2:407\n94#4:413\n368#5,9:388\n377#5:409\n378#5,2:411\n4034#6,6:401\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$NoTextAreaDecorator$1\n*L\n115#1:374\n125#1:375\n125#1:376,6\n125#1:410\n125#1:414\n125#1:382,6\n125#1:397,4\n125#1:407,2\n125#1:413\n125#1:388,9\n125#1:409\n125#1:411,2\n125#1:401,6\n*E\n"}) static final class TextAreaKt$NoTextAreaDecorator$1 implements TextFieldDecorator { TextAreaKt$NoTextAreaDecorator$1(ScrollbarStyle $scrollbarStyle, TextAreaStyle $style, ScrollState $scrollState) {} @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/* 114 */     public final void Decoration(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(-1456274028); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1456274028, $changed, -1, "org.jetbrains.jewel.ui.component.NoTextAreaDecorator.<no name provided>.Decoration (TextArea.kt:113)"); 
/* 115 */       CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 374 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Pair pair = TextAreaKt.calculatePaddings(this.$scrollbarStyle, this.$style, this.$scrollState, (LayoutDirection)object, $composer, 0); PaddingValues contentPadding = (PaddingValues)pair.component1(); float innerEndPadding = ((Dp)pair.component2()).unbox-impl(); if (this.$scrollbarStyle != null) { $composer.startReplaceGroup(1434390716); ScrollableContainerKt.TextAreaScrollableContainer(this.$scrollState, this.$scrollbarStyle, PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, this.$style.getMetrics().getBorderWidth-D9Ej5fM()), 0.0F, 0.0F, innerEndPadding, 0.0F, 11, null), (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(-1314689209, true, new TextAreaKt$NoTextAreaDecorator$1$Decoration$1(contentPadding, innerTextField), $composer, 54), $composer, 3072); $composer.endReplaceGroup(); }
/* 375 */       else { $composer.startReplaceGroup(1434734599); Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, contentPadding); int i = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 376 */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 377 */         boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */         
/* 380 */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & i << 3;
/* 381 */         int $i$f$Layout = 0;
/* 382 */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 383 */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 384 */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 385 */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */         
/* 387 */         Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 388 */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 389 */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 390 */           .startReusableNode();
/* 391 */         if ($composer.getInserting()) { $composer
/* 392 */             .createNode(function0); } else { $composer
/*     */             
/* 394 */             .useNode(); }
/*     */         
/* 396 */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 397 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 398 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */         
/* 400 */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 401 */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 402 */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 403 */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 404 */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */         } 
/*     */         
/* 407 */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */         
/* 409 */         int j = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 410 */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int k = 0x6 | 0x70 & i >> 6; Composer composer1 = $composer$iv; BoxScope $this$Decoration_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TextAreaKt$NoTextAreaDecorator$1$Decoration$2 = 0; innerTextField.invoke(composer1, Integer.valueOf(0xE & $changed)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 411 */         $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 412 */         ComposerKt.sourceInformationMarkerEnd($composer);
/* 413 */         ComposerKt.sourceInformationMarkerEnd($composer); $composer.endReplaceGroup(); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$NoTextAreaDecorator$1$Decoration$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,373:1\n71#2:374\n68#2,6:375\n74#2:409\n78#2:413\n79#3,6:381\n86#3,4:396\n90#3,2:406\n94#3:412\n368#4,9:387\n377#4:408\n378#4,2:410\n4034#5,6:400\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$NoTextAreaDecorator$1$Decoration$1\n*L\n122#1:374\n122#1:375,6\n122#1:409\n122#1:413\n122#1:381,6\n122#1:396,4\n122#1:406,2\n122#1:412\n122#1:387,9\n122#1:408\n122#1:410,2\n122#1:400,6\n*E\n"}) static final class TextAreaKt$NoTextAreaDecorator$1$Decoration$1 implements Function2<Composer, Integer, Unit> { TextAreaKt$NoTextAreaDecorator$1$Decoration$1(PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $innerTextField) {} @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1314689209, $changed, -1, "org.jetbrains.jewel.ui.component.NoTextAreaDecorator.<no name provided>.Decoration.<anonymous> (TextArea.kt:121)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$innerTextField; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TextAreaKt$NoTextAreaDecorator$1$Decoration$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } } } @Composable private static final TextFieldDecorator TextAreaDecorator-zeTA2Uc(TextAreaStyle style, TextFieldState state, Function2<? super Composer, ? super Integer, Unit> placeholder, TextStyle textStyle, Modifier decorationBoxModifier, long minSize, ScrollbarStyle scrollbarStyle, ScrollState scrollState, Composer $composer, int $changed) { $composer.startReplaceGroup(-354471298); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-354471298, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator (TextArea.kt:138)");  TextAreaKt$TextAreaDecorator$1 textAreaKt$TextAreaDecorator$1 = new TextAreaKt$TextAreaDecorator$1(scrollbarStyle, style, scrollState, textStyle, decorationBoxModifier, minSize, state, placeholder); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return textAreaKt$TextAreaDecorator$1; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"}) @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,373:1\n77#2:374\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1\n*L\n141#1:374\n*E\n"}) static final class TextAreaKt$TextAreaDecorator$1 implements TextFieldDecorator { TextAreaKt$TextAreaDecorator$1(ScrollbarStyle $scrollbarStyle, TextAreaStyle $style, ScrollState $scrollState, TextStyle $textStyle, Modifier $decorationBoxModifier, long $minSize, TextFieldState $state, Function2<Composer, Integer, Unit> $placeholder) {} @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public final void Decoration(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(-852752594); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-852752594, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator.<no name provided>.Decoration (TextArea.kt:139)");  CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Pair pair = TextAreaKt.calculatePaddings(this.$scrollbarStyle, this.$style, this.$scrollState, (LayoutDirection)object, $composer, 0); PaddingValues contentPadding = (PaddingValues)pair.component1(); float innerEndPadding = ((Dp)pair.component2()).unbox-impl(); TextAreaKt.TextAreaDecorationBox-yrwZFoE((Function2)ComposableLambdaKt.rememberComposableLambda(524440132, true, new TextAreaKt$TextAreaDecorator$1$Decoration$1(this.$scrollbarStyle, this.$scrollState, this.$style, innerEndPadding, contentPadding, innerTextField), $composer, 54), this.$textStyle, SizeKt.defaultMinSize-VpY3zN4(this.$decorationBoxModifier, DpSize.getWidth-D9Ej5fM(this.$minSize), DpSize.getHeight-D9Ej5fM(this.$minSize)), ((this.$state.getText().length() == 0)) ? this.$placeholder : null, this.$style.getColors().getPlaceholder-0d7_KjU(), PaddingKt.padding-3ABfNKs(PaddingKt.padding((Modifier)Modifier.Companion, contentPadding), this.$style.getMetrics().getBorderWidth-D9Ej5fM()), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1$Decoration$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,373:1\n71#2:374\n68#2,6:375\n74#2:409\n78#2:413\n79#3,6:381\n86#3,4:396\n90#3,2:406\n94#3:412\n368#4,9:387\n377#4:408\n378#4,2:410\n4034#5,6:400\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorator$1$Decoration$1\n*L\n153#1:374\n153#1:375,6\n153#1:409\n153#1:413\n153#1:381,6\n153#1:396,4\n153#1:406,2\n153#1:412\n153#1:387,9\n153#1:408\n153#1:410,2\n153#1:400,6\n*E\n"}) static final class TextAreaKt$TextAreaDecorator$1$Decoration$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(524440132, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator.<no name provided>.Decoration.<anonymous> (TextArea.kt:144)");  if (this.$scrollbarStyle != null) { $composer.startReplaceGroup(-1100203360); ScrollableContainerKt.TextAreaScrollableContainer(this.$scrollState, this.$scrollbarStyle, PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, this.$style.getMetrics().getBorderWidth-D9Ej5fM()), 0.0F, 0.0F, this.$innerEndPadding, 0.0F, 11, null), (Function2<? super Composer, ? super Integer, Unit>)ComposableLambdaKt.rememberComposableLambda(2000367927, true, new Function2<Composer, Integer, Unit>(this.$contentPadding, this.$innerTextField) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(2000367927, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaDecorator.<no name provided>.Decoration.<anonymous>.<anonymous> (TextArea.kt:149)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$innerTextField; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-TextAreaKt$TextAreaDecorator$1$Decoration$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();
/*     */                          }
/*     */                       else
/*     */                       { $composer.skipToGroupEnd(); }
/*     */                        }
/*     */                      }
/*     */                   $composer, 54), $composer, 3072);
/*     */             $composer.endReplaceGroup(); }
/*     */           else
/*     */           { $composer.startReplaceGroup(-1099832321);
/*     */             Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding);
/*     */             Function2<Composer, Integer, Unit> function2 = this.$innerTextField;
/*     */             int $changed$iv = 0, $i$f$Box = 0;
/*     */             ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */             Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */             boolean propagateMinConstraints$iv = false;
/*     */             MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*     */             int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*     */             int $i$f$Layout = 0;
/*     */             ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*     */             int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*     */             CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*     */             Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */             Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*     */             int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*     */             int $i$f$ReusableComposeNode = 0;
/*     */             ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*     */             if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
/*     */               ComposablesKt.invalidApplier();
/*     */             }
/*     */             $composer.startReusableNode();
/*     */             if ($composer.getInserting()) {
/*     */               $composer.createNode(function0);
/*     */             } else {
/*     */               $composer.useNode();
/*     */             } 
/*     */             Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*     */             int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*     */             Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*     */             Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */             Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*     */             int $i$f$set-impl = 0;
/*     */             Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*     */             int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*     */             if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*     */               $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*     */               $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */             } 
/*     */             Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */             int i = 0xE & $changed$iv$iv$iv >> 6;
/*     */             Composer $composer$iv = $composer;
/*     */             int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */             ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */             int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */             Composer composer1 = $composer$iv;
/*     */             BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */             int $i$a$-Box-TextAreaKt$TextAreaDecorator$1$Decoration$1$2 = 0;
/*     */             function2.invoke(composer1, Integer.valueOf(0));
/*     */             ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*     */             $composer.endNode();
/*     */             ComposerKt.sourceInformationMarkerEnd($composer);
/*     */             ComposerKt.sourceInformationMarkerEnd($composer);
/*     */             ComposerKt.sourceInformationMarkerEnd($composer);
/*     */             $composer.endReplaceGroup(); }
/*     */           
/*     */           if (ComposerKt.isTraceInProgress()) {
/*     */             ComposerKt.traceEventEnd();
/*     */           } }
/*     */         else
/*     */         { $composer.skipToGroupEnd(); }
/*     */          }
/*     */ 
/*     */ 
/*     */       
/*     */       TextAreaKt$TextAreaDecorator$1$Decoration$1(ScrollbarStyle $scrollbarStyle, ScrollState $scrollState, TextAreaStyle $style, float $innerEndPadding, PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $innerTextField) {} }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   private static final Pair<PaddingValues, Dp> calculatePaddings(ScrollbarStyle scrollbarStyle, TextAreaStyle style, ScrollState scrollState, LayoutDirection layoutDirection, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(1818316377);
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventStart(1818316377, $changed, -1, "org.jetbrains.jewel.ui.component.calculatePaddings (TextArea.kt:170)");
/*     */     }
/*     */     PaddingValues $this$calculatePaddings_u24lambda_u242 = style.getMetrics().getContentPadding();
/*     */     int $i$a$-with-TextAreaKt$calculatePaddings$1 = 0;
/*     */     int i = 0, j = 0;
/*     */     PaddingValues paddingValues = PaddingKt.PaddingValues-a9UjIt4(PaddingKt.calculateStartPadding($this$calculatePaddings_u24lambda_u242, layoutDirection), $this$calculatePaddings_u24lambda_u242.calculateTopPadding-D9Ej5fM(), Dp.constructor-impl(i), $this$calculatePaddings_u24lambda_u242.calculateBottomPadding-D9Ej5fM());
/*     */     $composer.startReplaceGroup(1418463626);
/*     */     int k = 0, m = 0;
/*     */     float f1 = (scrollState.getCanScrollForward() || scrollState.getCanScrollBackward()) ? ScrollableContainerKt.scrollbarContentSafePadding(scrollbarStyle, $composer, 0xE & $changed, 0) : Dp.constructor-impl(k);
/*     */     $composer.endReplaceGroup();
/*     */     float scrollbarExtraPadding = f1;
/*     */     float arg0$iv = PaddingKt.calculateEndPadding($this$calculatePaddings_u24lambda_u242, layoutDirection);
/*     */     int $i$f$plus-5rwHm24 = 0;
/*     */     int $this$dp$iv = 0, $i$f$getDp = 0;
/*     */     Pair<PaddingValues, Dp> pair = (scrollbarStyle != null) ? TuplesKt.to(paddingValues, Dp.box-impl(Dp.constructor-impl(arg0$iv + scrollbarExtraPadding))) : TuplesKt.to(style.getMetrics().getContentPadding(), Dp.box-impl(Dp.constructor-impl($this$dp$iv)));
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventEnd();
/*     */     }
/*     */     $composer.endReplaceGroup();
/*     */     return pair;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final Unit TextArea$lambda$4$lambda$3(TextLayoutResult it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Please use TextArea(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
/*     */   public static final void TextArea(@NotNull String value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable Outline outline, @Nullable Function2 placeholder, boolean undecorated, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, int maxLines, @Nullable Function1 onTextLayout, @Nullable TextAreaStyle style, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource interactionSource, @Nullable Modifier decorationBoxModifier, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onValueChange'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #17
/*     */     //   16: ldc_w -416399703
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
/*     */     //   418: iload #7
/*     */     //   420: invokeinterface changed : (Z)Z
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
/*     */     //   471: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   520: aload #9
/*     */     //   522: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   527: ifeq -> 535
/*     */     //   530: ldc 536870912
/*     */     //   532: goto -> 537
/*     */     //   535: ldc 268435456
/*     */     //   537: ior
/*     */     //   538: istore #21
/*     */     //   540: iload #19
/*     */     //   542: bipush #6
/*     */     //   544: iand
/*     */     //   545: ifne -> 579
/*     */     //   548: iload #22
/*     */     //   550: iload #20
/*     */     //   552: sipush #1024
/*     */     //   555: iand
/*     */     //   556: ifne -> 575
/*     */     //   559: aload #17
/*     */     //   561: aload #10
/*     */     //   563: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   568: ifeq -> 575
/*     */     //   571: iconst_4
/*     */     //   572: goto -> 576
/*     */     //   575: iconst_2
/*     */     //   576: ior
/*     */     //   577: istore #22
/*     */     //   579: iload #20
/*     */     //   581: sipush #2048
/*     */     //   584: iand
/*     */     //   585: ifeq -> 598
/*     */     //   588: iload #22
/*     */     //   590: bipush #48
/*     */     //   592: ior
/*     */     //   593: istore #22
/*     */     //   595: goto -> 630
/*     */     //   598: iload #19
/*     */     //   600: bipush #48
/*     */     //   602: iand
/*     */     //   603: ifne -> 630
/*     */     //   606: iload #22
/*     */     //   608: aload #17
/*     */     //   610: iload #11
/*     */     //   612: invokeinterface changed : (I)Z
/*     */     //   617: ifeq -> 625
/*     */     //   620: bipush #32
/*     */     //   622: goto -> 627
/*     */     //   625: bipush #16
/*     */     //   627: ior
/*     */     //   628: istore #22
/*     */     //   630: iload #20
/*     */     //   632: sipush #4096
/*     */     //   635: iand
/*     */     //   636: ifeq -> 650
/*     */     //   639: iload #22
/*     */     //   641: sipush #384
/*     */     //   644: ior
/*     */     //   645: istore #22
/*     */     //   647: goto -> 685
/*     */     //   650: iload #19
/*     */     //   652: sipush #384
/*     */     //   655: iand
/*     */     //   656: ifne -> 685
/*     */     //   659: iload #22
/*     */     //   661: aload #17
/*     */     //   663: aload #12
/*     */     //   665: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   670: ifeq -> 679
/*     */     //   673: sipush #256
/*     */     //   676: goto -> 682
/*     */     //   679: sipush #128
/*     */     //   682: ior
/*     */     //   683: istore #22
/*     */     //   685: iload #19
/*     */     //   687: sipush #3072
/*     */     //   690: iand
/*     */     //   691: ifne -> 729
/*     */     //   694: iload #22
/*     */     //   696: iload #20
/*     */     //   698: sipush #8192
/*     */     //   701: iand
/*     */     //   702: ifne -> 723
/*     */     //   705: aload #17
/*     */     //   707: aload #13
/*     */     //   709: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   714: ifeq -> 723
/*     */     //   717: sipush #2048
/*     */     //   720: goto -> 726
/*     */     //   723: sipush #1024
/*     */     //   726: ior
/*     */     //   727: istore #22
/*     */     //   729: iload #19
/*     */     //   731: sipush #24576
/*     */     //   734: iand
/*     */     //   735: ifne -> 773
/*     */     //   738: iload #22
/*     */     //   740: iload #20
/*     */     //   742: sipush #16384
/*     */     //   745: iand
/*     */     //   746: ifne -> 767
/*     */     //   749: aload #17
/*     */     //   751: aload #14
/*     */     //   753: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   758: ifeq -> 767
/*     */     //   761: sipush #16384
/*     */     //   764: goto -> 770
/*     */     //   767: sipush #8192
/*     */     //   770: ior
/*     */     //   771: istore #22
/*     */     //   773: iload #20
/*     */     //   775: ldc 32768
/*     */     //   777: iand
/*     */     //   778: ifeq -> 791
/*     */     //   781: iload #22
/*     */     //   783: ldc 196608
/*     */     //   785: ior
/*     */     //   786: istore #22
/*     */     //   788: goto -> 823
/*     */     //   791: iload #19
/*     */     //   793: ldc 196608
/*     */     //   795: iand
/*     */     //   796: ifne -> 823
/*     */     //   799: iload #22
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
/*     */     //   880: if_icmpne -> 905
/*     */     //   883: iload #22
/*     */     //   885: ldc_w 599187
/*     */     //   888: iand
/*     */     //   889: ldc_w 599186
/*     */     //   892: if_icmpne -> 905
/*     */     //   895: aload #17
/*     */     //   897: invokeinterface getSkipping : ()Z
/*     */     //   902: ifne -> 1934
/*     */     //   905: aload #17
/*     */     //   907: invokeinterface startDefaults : ()V
/*     */     //   912: iload #18
/*     */     //   914: iconst_1
/*     */     //   915: iand
/*     */     //   916: ifeq -> 929
/*     */     //   919: aload #17
/*     */     //   921: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   926: ifeq -> 1350
/*     */     //   929: iload #20
/*     */     //   931: iconst_4
/*     */     //   932: iand
/*     */     //   933: ifeq -> 943
/*     */     //   936: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   939: checkcast androidx/compose/ui/Modifier
/*     */     //   942: astore_2
/*     */     //   943: iload #20
/*     */     //   945: bipush #8
/*     */     //   947: iand
/*     */     //   948: ifeq -> 953
/*     */     //   951: iconst_1
/*     */     //   952: istore_3
/*     */     //   953: iload #20
/*     */     //   955: bipush #16
/*     */     //   957: iand
/*     */     //   958: ifeq -> 964
/*     */     //   961: iconst_0
/*     */     //   962: istore #4
/*     */     //   964: iload #20
/*     */     //   966: bipush #32
/*     */     //   968: iand
/*     */     //   969: ifeq -> 977
/*     */     //   972: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   975: astore #5
/*     */     //   977: iload #20
/*     */     //   979: bipush #64
/*     */     //   981: iand
/*     */     //   982: ifeq -> 988
/*     */     //   985: aconst_null
/*     */     //   986: astore #6
/*     */     //   988: iload #20
/*     */     //   990: sipush #128
/*     */     //   993: iand
/*     */     //   994: ifeq -> 1000
/*     */     //   997: iconst_0
/*     */     //   998: istore #7
/*     */     //   1000: iload #20
/*     */     //   1002: sipush #256
/*     */     //   1005: iand
/*     */     //   1006: ifeq -> 1017
/*     */     //   1009: getstatic androidx/compose/ui/text/input/VisualTransformation.Companion : Landroidx/compose/ui/text/input/VisualTransformation$Companion;
/*     */     //   1012: invokevirtual getNone : ()Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   1015: astore #8
/*     */     //   1017: iload #20
/*     */     //   1019: sipush #512
/*     */     //   1022: iand
/*     */     //   1023: ifeq -> 1034
/*     */     //   1026: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1029: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1032: astore #9
/*     */     //   1034: iload #20
/*     */     //   1036: sipush #1024
/*     */     //   1039: iand
/*     */     //   1040: ifeq -> 1068
/*     */     //   1043: new androidx/compose/foundation/text/KeyboardActions
/*     */     //   1046: dup
/*     */     //   1047: aconst_null
/*     */     //   1048: aconst_null
/*     */     //   1049: aconst_null
/*     */     //   1050: aconst_null
/*     */     //   1051: aconst_null
/*     */     //   1052: aconst_null
/*     */     //   1053: bipush #63
/*     */     //   1055: aconst_null
/*     */     //   1056: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1059: astore #10
/*     */     //   1061: iload #22
/*     */     //   1063: bipush #-15
/*     */     //   1065: iand
/*     */     //   1066: istore #22
/*     */     //   1068: iload #20
/*     */     //   1070: sipush #2048
/*     */     //   1073: iand
/*     */     //   1074: ifeq -> 1082
/*     */     //   1077: ldc_w 2147483647
/*     */     //   1080: istore #11
/*     */     //   1082: iload #20
/*     */     //   1084: sipush #4096
/*     */     //   1087: iand
/*     */     //   1088: ifeq -> 1179
/*     */     //   1091: aload #17
/*     */     //   1093: ldc_w 951033690
/*     */     //   1096: invokeinterface startReplaceGroup : (I)V
/*     */     //   1101: aload #17
/*     */     //   1103: astore #24
/*     */     //   1105: iconst_0
/*     */     //   1106: istore #25
/*     */     //   1108: iconst_0
/*     */     //   1109: istore #26
/*     */     //   1111: aload #24
/*     */     //   1113: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1118: astore #27
/*     */     //   1120: iconst_0
/*     */     //   1121: istore #28
/*     */     //   1123: aload #27
/*     */     //   1125: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1128: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1131: if_acmpne -> 1158
/*     */     //   1134: iconst_0
/*     */     //   1135: istore #29
/*     */     //   1137: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1142: astore #29
/*     */     //   1144: aload #24
/*     */     //   1146: aload #29
/*     */     //   1148: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1153: aload #29
/*     */     //   1155: goto -> 1160
/*     */     //   1158: aload #27
/*     */     //   1160: nop
/*     */     //   1161: nop
/*     */     //   1162: nop
/*     */     //   1163: checkcast kotlin/jvm/functions/Function1
/*     */     //   1166: astore #23
/*     */     //   1168: aload #17
/*     */     //   1170: invokeinterface endReplaceGroup : ()V
/*     */     //   1175: aload #23
/*     */     //   1177: astore #12
/*     */     //   1179: iload #20
/*     */     //   1181: sipush #8192
/*     */     //   1184: iand
/*     */     //   1185: ifeq -> 1208
/*     */     //   1188: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1191: aload #17
/*     */     //   1193: bipush #6
/*     */     //   1195: invokestatic getTextAreaStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   1198: astore #13
/*     */     //   1200: iload #22
/*     */     //   1202: sipush #-7169
/*     */     //   1205: iand
/*     */     //   1206: istore #22
/*     */     //   1208: iload #20
/*     */     //   1210: sipush #16384
/*     */     //   1213: iand
/*     */     //   1214: ifeq -> 1237
/*     */     //   1217: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1220: aload #17
/*     */     //   1222: bipush #6
/*     */     //   1224: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1227: astore #14
/*     */     //   1229: iload #22
/*     */     //   1231: ldc_w -57345
/*     */     //   1234: iand
/*     */     //   1235: istore #22
/*     */     //   1237: iload #20
/*     */     //   1239: ldc 32768
/*     */     //   1241: iand
/*     */     //   1242: ifeq -> 1331
/*     */     //   1245: aload #17
/*     */     //   1247: ldc_w 951038943
/*     */     //   1250: invokeinterface startReplaceGroup : (I)V
/*     */     //   1255: aload #17
/*     */     //   1257: astore #24
/*     */     //   1259: iconst_0
/*     */     //   1260: istore #25
/*     */     //   1262: iconst_0
/*     */     //   1263: istore #26
/*     */     //   1265: aload #24
/*     */     //   1267: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1272: astore #27
/*     */     //   1274: iconst_0
/*     */     //   1275: istore #28
/*     */     //   1277: aload #27
/*     */     //   1279: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1282: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1285: if_acmpne -> 1310
/*     */     //   1288: iconst_0
/*     */     //   1289: istore #29
/*     */     //   1291: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1294: astore #29
/*     */     //   1296: aload #24
/*     */     //   1298: aload #29
/*     */     //   1300: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1305: aload #29
/*     */     //   1307: goto -> 1312
/*     */     //   1310: aload #27
/*     */     //   1312: nop
/*     */     //   1313: nop
/*     */     //   1314: nop
/*     */     //   1315: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1318: astore #23
/*     */     //   1320: aload #17
/*     */     //   1322: invokeinterface endReplaceGroup : ()V
/*     */     //   1327: aload #23
/*     */     //   1329: astore #15
/*     */     //   1331: iload #20
/*     */     //   1333: ldc 65536
/*     */     //   1335: iand
/*     */     //   1336: ifeq -> 1407
/*     */     //   1339: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1342: checkcast androidx/compose/ui/Modifier
/*     */     //   1345: astore #16
/*     */     //   1347: goto -> 1407
/*     */     //   1350: aload #17
/*     */     //   1352: invokeinterface skipToGroupEnd : ()V
/*     */     //   1357: iload #20
/*     */     //   1359: sipush #1024
/*     */     //   1362: iand
/*     */     //   1363: ifeq -> 1373
/*     */     //   1366: iload #22
/*     */     //   1368: bipush #-15
/*     */     //   1370: iand
/*     */     //   1371: istore #22
/*     */     //   1373: iload #20
/*     */     //   1375: sipush #8192
/*     */     //   1378: iand
/*     */     //   1379: ifeq -> 1390
/*     */     //   1382: iload #22
/*     */     //   1384: sipush #-7169
/*     */     //   1387: iand
/*     */     //   1388: istore #22
/*     */     //   1390: iload #20
/*     */     //   1392: sipush #16384
/*     */     //   1395: iand
/*     */     //   1396: ifeq -> 1407
/*     */     //   1399: iload #22
/*     */     //   1401: ldc_w -57345
/*     */     //   1404: iand
/*     */     //   1405: istore #22
/*     */     //   1407: aload #17
/*     */     //   1409: invokeinterface endDefaults : ()V
/*     */     //   1414: invokestatic isTraceInProgress : ()Z
/*     */     //   1417: ifeq -> 1433
/*     */     //   1420: ldc_w -416399703
/*     */     //   1423: iload #21
/*     */     //   1425: iload #22
/*     */     //   1427: ldc_w 'org.jetbrains.jewel.ui.component.TextArea (TextArea.kt:212)'
/*     */     //   1430: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1433: aload #17
/*     */     //   1435: ldc_w 951042929
/*     */     //   1438: invokeinterface startReplaceGroup : (I)V
/*     */     //   1443: aload #17
/*     */     //   1445: astore #25
/*     */     //   1447: iconst_0
/*     */     //   1448: istore #26
/*     */     //   1450: nop
/*     */     //   1451: iconst_0
/*     */     //   1452: istore #27
/*     */     //   1454: aload #25
/*     */     //   1456: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1461: astore #28
/*     */     //   1463: iconst_0
/*     */     //   1464: istore #29
/*     */     //   1466: aload #28
/*     */     //   1468: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1471: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1474: if_acmpne -> 1515
/*     */     //   1477: iconst_0
/*     */     //   1478: istore #30
/*     */     //   1480: new androidx/compose/ui/text/input/TextFieldValue
/*     */     //   1483: dup
/*     */     //   1484: aload_0
/*     */     //   1485: lconst_0
/*     */     //   1486: aconst_null
/*     */     //   1487: bipush #6
/*     */     //   1489: aconst_null
/*     */     //   1490: invokespecial <init> : (Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1493: aconst_null
/*     */     //   1494: iconst_2
/*     */     //   1495: aconst_null
/*     */     //   1496: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1499: astore #31
/*     */     //   1501: aload #25
/*     */     //   1503: aload #31
/*     */     //   1505: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1510: aload #31
/*     */     //   1512: goto -> 1517
/*     */     //   1515: aload #28
/*     */     //   1517: nop
/*     */     //   1518: nop
/*     */     //   1519: nop
/*     */     //   1520: checkcast androidx/compose/runtime/MutableState
/*     */     //   1523: astore #24
/*     */     //   1525: aload #17
/*     */     //   1527: invokeinterface endReplaceGroup : ()V
/*     */     //   1532: aload #24
/*     */     //   1534: astore #23
/*     */     //   1536: aload #23
/*     */     //   1538: invokestatic TextArea$lambda$7 : (Landroidx/compose/runtime/MutableState;)Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1541: aload_0
/*     */     //   1542: lconst_0
/*     */     //   1543: aconst_null
/*     */     //   1544: bipush #6
/*     */     //   1546: aconst_null
/*     */     //   1547: invokestatic copy-3r_uNRQ$default : (Landroidx/compose/ui/text/input/TextFieldValue;Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;ILjava/lang/Object;)Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1550: astore #24
/*     */     //   1552: aload #17
/*     */     //   1554: ldc_w 951047617
/*     */     //   1557: invokeinterface startReplaceGroup : (I)V
/*     */     //   1562: aload #17
/*     */     //   1564: astore #27
/*     */     //   1566: iload #21
/*     */     //   1568: bipush #14
/*     */     //   1570: iand
/*     */     //   1571: iconst_4
/*     */     //   1572: if_icmpne -> 1579
/*     */     //   1575: iconst_1
/*     */     //   1576: goto -> 1580
/*     */     //   1579: iconst_0
/*     */     //   1580: istore #28
/*     */     //   1582: nop
/*     */     //   1583: iconst_0
/*     */     //   1584: istore #29
/*     */     //   1586: aload #27
/*     */     //   1588: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1593: astore #30
/*     */     //   1595: iconst_0
/*     */     //   1596: istore #31
/*     */     //   1598: iload #28
/*     */     //   1600: ifne -> 1614
/*     */     //   1603: aload #30
/*     */     //   1605: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1608: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1611: if_acmpne -> 1640
/*     */     //   1614: iconst_0
/*     */     //   1615: istore #32
/*     */     //   1617: aload_0
/*     */     //   1618: aconst_null
/*     */     //   1619: iconst_2
/*     */     //   1620: aconst_null
/*     */     //   1621: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   1624: astore #33
/*     */     //   1626: aload #27
/*     */     //   1628: aload #33
/*     */     //   1630: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1635: aload #33
/*     */     //   1637: goto -> 1642
/*     */     //   1640: aload #30
/*     */     //   1642: nop
/*     */     //   1643: nop
/*     */     //   1644: nop
/*     */     //   1645: checkcast androidx/compose/runtime/MutableState
/*     */     //   1648: astore #26
/*     */     //   1650: aload #17
/*     */     //   1652: invokeinterface endReplaceGroup : ()V
/*     */     //   1657: aload #26
/*     */     //   1659: astore #25
/*     */     //   1661: aload #24
/*     */     //   1663: aload #17
/*     */     //   1665: ldc_w 951052493
/*     */     //   1668: invokeinterface startReplaceGroup : (I)V
/*     */     //   1673: aload #17
/*     */     //   1675: astore #27
/*     */     //   1677: aload #17
/*     */     //   1679: aload #25
/*     */     //   1681: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   1686: iload #21
/*     */     //   1688: bipush #112
/*     */     //   1690: iand
/*     */     //   1691: bipush #32
/*     */     //   1693: if_icmpne -> 1700
/*     */     //   1696: iconst_1
/*     */     //   1697: goto -> 1701
/*     */     //   1700: iconst_0
/*     */     //   1701: ior
/*     */     //   1702: istore #28
/*     */     //   1704: nop
/*     */     //   1705: iconst_0
/*     */     //   1706: istore #29
/*     */     //   1708: aload #27
/*     */     //   1710: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1715: astore #30
/*     */     //   1717: iconst_0
/*     */     //   1718: istore #31
/*     */     //   1720: iload #28
/*     */     //   1722: ifne -> 1736
/*     */     //   1725: aload #30
/*     */     //   1727: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1730: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1733: if_acmpne -> 1770
/*     */     //   1736: astore #34
/*     */     //   1738: iconst_0
/*     */     //   1739: istore #32
/*     */     //   1741: aload_1
/*     */     //   1742: aload #23
/*     */     //   1744: aload #25
/*     */     //   1746: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   1751: aload #34
/*     */     //   1753: swap
/*     */     //   1754: astore #33
/*     */     //   1756: aload #27
/*     */     //   1758: aload #33
/*     */     //   1760: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1765: aload #33
/*     */     //   1767: goto -> 1772
/*     */     //   1770: aload #30
/*     */     //   1772: nop
/*     */     //   1773: nop
/*     */     //   1774: nop
/*     */     //   1775: checkcast kotlin/jvm/functions/Function1
/*     */     //   1778: astore #26
/*     */     //   1780: aload #17
/*     */     //   1782: invokeinterface endReplaceGroup : ()V
/*     */     //   1787: aload #26
/*     */     //   1789: aload_2
/*     */     //   1790: iload_3
/*     */     //   1791: iload #4
/*     */     //   1793: aload #6
/*     */     //   1795: iload #7
/*     */     //   1797: aload #5
/*     */     //   1799: aload #8
/*     */     //   1801: aload #9
/*     */     //   1803: aload #10
/*     */     //   1805: iload #11
/*     */     //   1807: aload #12
/*     */     //   1809: aload #13
/*     */     //   1811: aload #14
/*     */     //   1813: aload #15
/*     */     //   1815: aload #16
/*     */     //   1817: aload #17
/*     */     //   1819: sipush #896
/*     */     //   1822: iload #21
/*     */     //   1824: iand
/*     */     //   1825: sipush #7168
/*     */     //   1828: iload #21
/*     */     //   1830: iand
/*     */     //   1831: ior
/*     */     //   1832: ldc 57344
/*     */     //   1834: iload #21
/*     */     //   1836: iand
/*     */     //   1837: ior
/*     */     //   1838: ldc 458752
/*     */     //   1840: iload #21
/*     */     //   1842: iconst_3
/*     */     //   1843: ishr
/*     */     //   1844: iand
/*     */     //   1845: ior
/*     */     //   1846: ldc 3670016
/*     */     //   1848: iload #21
/*     */     //   1850: iconst_3
/*     */     //   1851: ishr
/*     */     //   1852: iand
/*     */     //   1853: ior
/*     */     //   1854: ldc 29360128
/*     */     //   1856: iload #21
/*     */     //   1858: bipush #6
/*     */     //   1860: ishl
/*     */     //   1861: iand
/*     */     //   1862: ior
/*     */     //   1863: ldc 234881024
/*     */     //   1865: iload #21
/*     */     //   1867: iand
/*     */     //   1868: ior
/*     */     //   1869: ldc 1879048192
/*     */     //   1871: iload #21
/*     */     //   1873: iand
/*     */     //   1874: ior
/*     */     //   1875: bipush #14
/*     */     //   1877: iload #22
/*     */     //   1879: iand
/*     */     //   1880: bipush #112
/*     */     //   1882: iload #22
/*     */     //   1884: iand
/*     */     //   1885: ior
/*     */     //   1886: sipush #896
/*     */     //   1889: iload #22
/*     */     //   1891: iand
/*     */     //   1892: ior
/*     */     //   1893: sipush #7168
/*     */     //   1896: iload #22
/*     */     //   1898: iand
/*     */     //   1899: ior
/*     */     //   1900: ldc 57344
/*     */     //   1902: iload #22
/*     */     //   1904: iand
/*     */     //   1905: ior
/*     */     //   1906: ldc 458752
/*     */     //   1908: iload #22
/*     */     //   1910: iand
/*     */     //   1911: ior
/*     */     //   1912: ldc 3670016
/*     */     //   1914: iload #22
/*     */     //   1916: iand
/*     */     //   1917: ior
/*     */     //   1918: iconst_0
/*     */     //   1919: invokestatic TextArea : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V
/*     */     //   1922: invokestatic isTraceInProgress : ()Z
/*     */     //   1925: ifeq -> 1941
/*     */     //   1928: invokestatic traceEventEnd : ()V
/*     */     //   1931: goto -> 1941
/*     */     //   1934: aload #17
/*     */     //   1936: invokeinterface skipToGroupEnd : ()V
/*     */     //   1941: aload #17
/*     */     //   1943: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1948: dup
/*     */     //   1949: ifnull -> 2001
/*     */     //   1952: aload_0
/*     */     //   1953: aload_1
/*     */     //   1954: aload_2
/*     */     //   1955: iload_3
/*     */     //   1956: iload #4
/*     */     //   1958: aload #5
/*     */     //   1960: aload #6
/*     */     //   1962: iload #7
/*     */     //   1964: aload #8
/*     */     //   1966: aload #9
/*     */     //   1968: aload #10
/*     */     //   1970: iload #11
/*     */     //   1972: aload #12
/*     */     //   1974: aload #13
/*     */     //   1976: aload #14
/*     */     //   1978: aload #15
/*     */     //   1980: aload #16
/*     */     //   1982: iload #18
/*     */     //   1984: iload #19
/*     */     //   1986: iload #20
/*     */     //   1988: <illegal opcode> invoke : (Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1993: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1998: goto -> 2002
/*     */     //   2001: pop
/*     */     //   2002: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #213	-> 14
/*     */     //   #198	-> 936
/*     */     //   #199	-> 951
/*     */     //   #200	-> 961
/*     */     //   #201	-> 972
/*     */     //   #202	-> 985
/*     */     //   #203	-> 997
/*     */     //   #204	-> 1009
/*     */     //   #205	-> 1026
/*     */     //   #206	-> 1043
/*     */     //   #207	-> 1077
/*     */     //   #208	-> 1091
/*     */     //   #384	-> 1111
/*     */     //   #385	-> 1123
/*     */     //   #386	-> 1134
/*     */     //   #386	-> 1142
/*     */     //   #387	-> 1144
/*     */     //   #388	-> 1153
/*     */     //   #389	-> 1158
/*     */     //   #385	-> 1160
/*     */     //   #384	-> 1161
/*     */     //   #384	-> 1162
/*     */     //   #208	-> 1163
/*     */     //   #209	-> 1188
/*     */     //   #210	-> 1217
/*     */     //   #211	-> 1245
/*     */     //   #390	-> 1265
/*     */     //   #391	-> 1277
/*     */     //   #392	-> 1288
/*     */     //   #211	-> 1291
/*     */     //   #392	-> 1294
/*     */     //   #393	-> 1296
/*     */     //   #394	-> 1305
/*     */     //   #395	-> 1310
/*     */     //   #391	-> 1312
/*     */     //   #390	-> 1313
/*     */     //   #390	-> 1314
/*     */     //   #211	-> 1315
/*     */     //   #212	-> 1339
/*     */     //   #213	-> 1430
/*     */     //   #214	-> 1450
/*     */     //   #396	-> 1454
/*     */     //   #397	-> 1466
/*     */     //   #398	-> 1477
/*     */     //   #214	-> 1480
/*     */     //   #398	-> 1499
/*     */     //   #399	-> 1501
/*     */     //   #400	-> 1510
/*     */     //   #401	-> 1515
/*     */     //   #397	-> 1517
/*     */     //   #396	-> 1518
/*     */     //   #396	-> 1519
/*     */     //   #214	-> 1520
/*     */     //   #215	-> 1536
/*     */     //   #216	-> 1582
/*     */     //   #402	-> 1586
/*     */     //   #403	-> 1598
/*     */     //   #404	-> 1614
/*     */     //   #216	-> 1617
/*     */     //   #404	-> 1624
/*     */     //   #405	-> 1626
/*     */     //   #406	-> 1635
/*     */     //   #407	-> 1640
/*     */     //   #403	-> 1642
/*     */     //   #402	-> 1643
/*     */     //   #402	-> 1644
/*     */     //   #216	-> 1645
/*     */     //   #220	-> 1661
/*     */     //   #221	-> 1704
/*     */     //   #408	-> 1708
/*     */     //   #409	-> 1720
/*     */     //   #410	-> 1736
/*     */     //   #221	-> 1741
/*     */     //   #410	-> 1754
/*     */     //   #411	-> 1756
/*     */     //   #412	-> 1765
/*     */     //   #413	-> 1770
/*     */     //   #409	-> 1772
/*     */     //   #408	-> 1773
/*     */     //   #408	-> 1774
/*     */     //   #221	-> 1775
/*     */     //   #231	-> 1789
/*     */     //   #232	-> 1790
/*     */     //   #233	-> 1791
/*     */     //   #235	-> 1793
/*     */     //   #236	-> 1795
/*     */     //   #234	-> 1797
/*     */     //   #237	-> 1799
/*     */     //   #238	-> 1801
/*     */     //   #239	-> 1803
/*     */     //   #240	-> 1805
/*     */     //   #241	-> 1807
/*     */     //   #242	-> 1809
/*     */     //   #243	-> 1811
/*     */     //   #244	-> 1813
/*     */     //   #245	-> 1815
/*     */     //   #219	-> 1919
/*     */     //   #247	-> 1934
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1137	5	29	$i$a$-cache-TextAreaKt$TextArea$3	I
/*     */     //   1144	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1123	38	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1120	41	27	it$iv	Ljava/lang/Object;
/*     */     //   1111	52	26	$i$f$cache	I
/*     */     //   1108	55	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1108	55	25	invalid$iv	Z
/*     */     //   1291	3	29	$i$a$-cache-TextAreaKt$TextArea$4	I
/*     */     //   1296	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1277	36	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1274	39	27	it$iv	Ljava/lang/Object;
/*     */     //   1265	50	26	$i$f$cache	I
/*     */     //   1262	53	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1262	53	25	invalid$iv	Z
/*     */     //   1480	19	30	$i$a$-cache-TextAreaKt$TextArea$textFieldValueState$2	I
/*     */     //   1501	11	31	value$iv	Ljava/lang/Object;
/*     */     //   1466	52	29	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1463	55	28	it$iv	Ljava/lang/Object;
/*     */     //   1454	66	27	$i$f$cache	I
/*     */     //   1451	69	25	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1451	69	26	invalid$iv	Z
/*     */     //   1617	7	32	$i$a$-cache-TextAreaKt$TextArea$lastTextValue$2	I
/*     */     //   1626	11	33	value$iv	Ljava/lang/Object;
/*     */     //   1598	45	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1595	48	30	it$iv	Ljava/lang/Object;
/*     */     //   1586	59	29	$i$f$cache	I
/*     */     //   1583	62	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1583	62	28	invalid$iv	Z
/*     */     //   1741	10	32	$i$a$-cache-TextAreaKt$TextArea$5	I
/*     */     //   1756	11	33	value$iv	Ljava/lang/Object;
/*     */     //   1720	53	31	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1717	56	30	it$iv	Ljava/lang/Object;
/*     */     //   1708	67	29	$i$f$cache	I
/*     */     //   1705	70	27	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1705	70	28	invalid$iv	Z
/*     */     //   1536	395	23	textFieldValueState$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   1552	379	24	textFieldValue	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   1661	270	25	lastTextValue$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   30	1973	21	$dirty	I
/*     */     //   34	1969	22	$dirty1	I
/*     */     //   0	2003	0	value	Ljava/lang/String;
/*     */     //   0	2003	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2003	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2003	3	enabled	Z
/*     */     //   0	2003	4	readOnly	Z
/*     */     //   0	2003	5	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	2003	6	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	2003	7	undecorated	Z
/*     */     //   0	2003	8	visualTransformation	Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   0	2003	9	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	2003	10	keyboardActions	Landroidx/compose/foundation/text/KeyboardActions;
/*     */     //   0	2003	11	maxLines	I
/*     */     //   0	2003	12	onTextLayout	Lkotlin/jvm/functions/Function1;
/*     */     //   0	2003	13	style	Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   0	2003	14	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	2003	15	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	2003	16	decorationBoxModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	2003	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	2003	18	$changed	I
/*     */     //   0	2003	19	$changed1	I
/*     */   }
/*     */   
/*     */   private static final TextFieldValue TextArea$lambda$7(MutableState $textFieldValueState$delegate) {
/*     */     State state = (State)$textFieldValueState$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 538 */     return (TextFieldValue)state.getValue(); } private static final void TextArea$lambda$8(MutableState $textFieldValueState$delegate, TextFieldValue <set-?>) { MutableState mutableState = $textFieldValueState$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 539 */     mutableState.setValue(<set-?>); } private static final String TextArea$lambda$10(MutableState $lastTextValue$delegate) { State state = (State)$lastTextValue$delegate; Object object = null; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 541 */     return (String)state.getValue(); } private static final void TextArea$lambda$11(MutableState $lastTextValue$delegate, String <set-?>) { MutableState mutableState = $lastTextValue$delegate; Object object = null; KProperty property$iv = null; int $i$f$setValue = 0;
/* 542 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   private static final Unit TextArea$lambda$13$lambda$12(Function1 $onValueChange, MutableState<TextFieldValue> $textFieldValueState$delegate, MutableState<String> $lastTextValue$delegate, TextFieldValue newTextFieldValueState) {
/*     */     Intrinsics.checkNotNullParameter(newTextFieldValueState, "newTextFieldValueState");
/*     */     TextArea$lambda$8($textFieldValueState$delegate, newTextFieldValueState);
/*     */     boolean stringChangedSinceLastInvocation = !Intrinsics.areEqual(TextArea$lambda$10($lastTextValue$delegate), newTextFieldValueState.getText());
/*     */     TextArea$lambda$11($lastTextValue$delegate, newTextFieldValueState.getText());
/*     */     if (stringChangedSinceLastInvocation)
/*     */       $onValueChange.invoke(newTextFieldValueState.getText()); 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextArea$lambda$16$lambda$15(TextLayoutResult it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Please use TextArea(state) instead. If you want to observe text changes, use snapshotFlow { state.text }")
/*     */   @ScheduledForRemoval(inVersion = "Before 1.0")
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
/*     */   public static final void TextArea(@NotNull TextFieldValue value, @NotNull Function1 onValueChange, @Nullable Modifier modifier, boolean enabled, boolean readOnly, @Nullable Function2 placeholder, boolean undecorated, @Nullable Outline outline, @Nullable VisualTransformation visualTransformation, @Nullable KeyboardOptions keyboardOptions, @Nullable KeyboardActions keyboardActions, int maxLines, @Nullable Function1 onTextLayout, @Nullable TextAreaStyle style, @Nullable TextStyle textStyle, @Nullable MutableInteractionSource interactionSource, @Nullable Modifier decorationBoxModifier, @Nullable Composer $composer, int $changed, int $changed1, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'value'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 'onValueChange'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: aload #17
/*     */     //   16: ldc_w -801535818
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
/*     */     //   319: invokeinterface changedInstance : (Ljava/lang/Object;)Z
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
/*     */     //   367: iload #6
/*     */     //   369: invokeinterface changed : (Z)Z
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
/*     */     //   420: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   471: invokeinterface changed : (Ljava/lang/Object;)Z
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
/*     */     //   520: aload #9
/*     */     //   522: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   527: ifeq -> 535
/*     */     //   530: ldc 536870912
/*     */     //   532: goto -> 537
/*     */     //   535: ldc 268435456
/*     */     //   537: ior
/*     */     //   538: istore #21
/*     */     //   540: iload #19
/*     */     //   542: bipush #6
/*     */     //   544: iand
/*     */     //   545: ifne -> 579
/*     */     //   548: iload #22
/*     */     //   550: iload #20
/*     */     //   552: sipush #1024
/*     */     //   555: iand
/*     */     //   556: ifne -> 575
/*     */     //   559: aload #17
/*     */     //   561: aload #10
/*     */     //   563: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   568: ifeq -> 575
/*     */     //   571: iconst_4
/*     */     //   572: goto -> 576
/*     */     //   575: iconst_2
/*     */     //   576: ior
/*     */     //   577: istore #22
/*     */     //   579: iload #20
/*     */     //   581: sipush #2048
/*     */     //   584: iand
/*     */     //   585: ifeq -> 598
/*     */     //   588: iload #22
/*     */     //   590: bipush #48
/*     */     //   592: ior
/*     */     //   593: istore #22
/*     */     //   595: goto -> 630
/*     */     //   598: iload #19
/*     */     //   600: bipush #48
/*     */     //   602: iand
/*     */     //   603: ifne -> 630
/*     */     //   606: iload #22
/*     */     //   608: aload #17
/*     */     //   610: iload #11
/*     */     //   612: invokeinterface changed : (I)Z
/*     */     //   617: ifeq -> 625
/*     */     //   620: bipush #32
/*     */     //   622: goto -> 627
/*     */     //   625: bipush #16
/*     */     //   627: ior
/*     */     //   628: istore #22
/*     */     //   630: iload #20
/*     */     //   632: sipush #4096
/*     */     //   635: iand
/*     */     //   636: ifeq -> 650
/*     */     //   639: iload #22
/*     */     //   641: sipush #384
/*     */     //   644: ior
/*     */     //   645: istore #22
/*     */     //   647: goto -> 685
/*     */     //   650: iload #19
/*     */     //   652: sipush #384
/*     */     //   655: iand
/*     */     //   656: ifne -> 685
/*     */     //   659: iload #22
/*     */     //   661: aload #17
/*     */     //   663: aload #12
/*     */     //   665: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   670: ifeq -> 679
/*     */     //   673: sipush #256
/*     */     //   676: goto -> 682
/*     */     //   679: sipush #128
/*     */     //   682: ior
/*     */     //   683: istore #22
/*     */     //   685: iload #19
/*     */     //   687: sipush #3072
/*     */     //   690: iand
/*     */     //   691: ifne -> 729
/*     */     //   694: iload #22
/*     */     //   696: iload #20
/*     */     //   698: sipush #8192
/*     */     //   701: iand
/*     */     //   702: ifne -> 723
/*     */     //   705: aload #17
/*     */     //   707: aload #13
/*     */     //   709: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   714: ifeq -> 723
/*     */     //   717: sipush #2048
/*     */     //   720: goto -> 726
/*     */     //   723: sipush #1024
/*     */     //   726: ior
/*     */     //   727: istore #22
/*     */     //   729: iload #19
/*     */     //   731: sipush #24576
/*     */     //   734: iand
/*     */     //   735: ifne -> 773
/*     */     //   738: iload #22
/*     */     //   740: iload #20
/*     */     //   742: sipush #16384
/*     */     //   745: iand
/*     */     //   746: ifne -> 767
/*     */     //   749: aload #17
/*     */     //   751: aload #14
/*     */     //   753: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   758: ifeq -> 767
/*     */     //   761: sipush #16384
/*     */     //   764: goto -> 770
/*     */     //   767: sipush #8192
/*     */     //   770: ior
/*     */     //   771: istore #22
/*     */     //   773: iload #20
/*     */     //   775: ldc 32768
/*     */     //   777: iand
/*     */     //   778: ifeq -> 791
/*     */     //   781: iload #22
/*     */     //   783: ldc 196608
/*     */     //   785: ior
/*     */     //   786: istore #22
/*     */     //   788: goto -> 823
/*     */     //   791: iload #19
/*     */     //   793: ldc 196608
/*     */     //   795: iand
/*     */     //   796: ifne -> 823
/*     */     //   799: iload #22
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
/*     */     //   880: if_icmpne -> 905
/*     */     //   883: iload #22
/*     */     //   885: ldc_w 599187
/*     */     //   888: iand
/*     */     //   889: ldc_w 599186
/*     */     //   892: if_icmpne -> 905
/*     */     //   895: aload #17
/*     */     //   897: invokeinterface getSkipping : ()Z
/*     */     //   902: ifne -> 1655
/*     */     //   905: aload #17
/*     */     //   907: invokeinterface startDefaults : ()V
/*     */     //   912: iload #18
/*     */     //   914: iconst_1
/*     */     //   915: iand
/*     */     //   916: ifeq -> 929
/*     */     //   919: aload #17
/*     */     //   921: invokeinterface getDefaultsInvalid : ()Z
/*     */     //   926: ifeq -> 1350
/*     */     //   929: iload #20
/*     */     //   931: iconst_4
/*     */     //   932: iand
/*     */     //   933: ifeq -> 943
/*     */     //   936: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   939: checkcast androidx/compose/ui/Modifier
/*     */     //   942: astore_2
/*     */     //   943: iload #20
/*     */     //   945: bipush #8
/*     */     //   947: iand
/*     */     //   948: ifeq -> 953
/*     */     //   951: iconst_1
/*     */     //   952: istore_3
/*     */     //   953: iload #20
/*     */     //   955: bipush #16
/*     */     //   957: iand
/*     */     //   958: ifeq -> 964
/*     */     //   961: iconst_0
/*     */     //   962: istore #4
/*     */     //   964: iload #20
/*     */     //   966: bipush #32
/*     */     //   968: iand
/*     */     //   969: ifeq -> 975
/*     */     //   972: aconst_null
/*     */     //   973: astore #5
/*     */     //   975: iload #20
/*     */     //   977: bipush #64
/*     */     //   979: iand
/*     */     //   980: ifeq -> 986
/*     */     //   983: iconst_0
/*     */     //   984: istore #6
/*     */     //   986: iload #20
/*     */     //   988: sipush #128
/*     */     //   991: iand
/*     */     //   992: ifeq -> 1000
/*     */     //   995: getstatic org/jetbrains/jewel/ui/Outline.None : Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   998: astore #7
/*     */     //   1000: iload #20
/*     */     //   1002: sipush #256
/*     */     //   1005: iand
/*     */     //   1006: ifeq -> 1017
/*     */     //   1009: getstatic androidx/compose/ui/text/input/VisualTransformation.Companion : Landroidx/compose/ui/text/input/VisualTransformation$Companion;
/*     */     //   1012: invokevirtual getNone : ()Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   1015: astore #8
/*     */     //   1017: iload #20
/*     */     //   1019: sipush #512
/*     */     //   1022: iand
/*     */     //   1023: ifeq -> 1034
/*     */     //   1026: getstatic androidx/compose/foundation/text/KeyboardOptions.Companion : Landroidx/compose/foundation/text/KeyboardOptions$Companion;
/*     */     //   1029: invokevirtual getDefault : ()Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   1032: astore #9
/*     */     //   1034: iload #20
/*     */     //   1036: sipush #1024
/*     */     //   1039: iand
/*     */     //   1040: ifeq -> 1068
/*     */     //   1043: new androidx/compose/foundation/text/KeyboardActions
/*     */     //   1046: dup
/*     */     //   1047: aconst_null
/*     */     //   1048: aconst_null
/*     */     //   1049: aconst_null
/*     */     //   1050: aconst_null
/*     */     //   1051: aconst_null
/*     */     //   1052: aconst_null
/*     */     //   1053: bipush #63
/*     */     //   1055: aconst_null
/*     */     //   1056: invokespecial <init> : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1059: astore #10
/*     */     //   1061: iload #22
/*     */     //   1063: bipush #-15
/*     */     //   1065: iand
/*     */     //   1066: istore #22
/*     */     //   1068: iload #20
/*     */     //   1070: sipush #2048
/*     */     //   1073: iand
/*     */     //   1074: ifeq -> 1082
/*     */     //   1077: ldc_w 2147483647
/*     */     //   1080: istore #11
/*     */     //   1082: iload #20
/*     */     //   1084: sipush #4096
/*     */     //   1087: iand
/*     */     //   1088: ifeq -> 1179
/*     */     //   1091: aload #17
/*     */     //   1093: ldc_w 951106394
/*     */     //   1096: invokeinterface startReplaceGroup : (I)V
/*     */     //   1101: aload #17
/*     */     //   1103: astore #24
/*     */     //   1105: iconst_0
/*     */     //   1106: istore #25
/*     */     //   1108: iconst_0
/*     */     //   1109: istore #26
/*     */     //   1111: aload #24
/*     */     //   1113: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1118: astore #27
/*     */     //   1120: iconst_0
/*     */     //   1121: istore #28
/*     */     //   1123: aload #27
/*     */     //   1125: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1128: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1131: if_acmpne -> 1158
/*     */     //   1134: iconst_0
/*     */     //   1135: istore #29
/*     */     //   1137: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1142: astore #29
/*     */     //   1144: aload #24
/*     */     //   1146: aload #29
/*     */     //   1148: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1153: aload #29
/*     */     //   1155: goto -> 1160
/*     */     //   1158: aload #27
/*     */     //   1160: nop
/*     */     //   1161: nop
/*     */     //   1162: nop
/*     */     //   1163: checkcast kotlin/jvm/functions/Function1
/*     */     //   1166: astore #23
/*     */     //   1168: aload #17
/*     */     //   1170: invokeinterface endReplaceGroup : ()V
/*     */     //   1175: aload #23
/*     */     //   1177: astore #12
/*     */     //   1179: iload #20
/*     */     //   1181: sipush #8192
/*     */     //   1184: iand
/*     */     //   1185: ifeq -> 1208
/*     */     //   1188: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1191: aload #17
/*     */     //   1193: bipush #6
/*     */     //   1195: invokestatic getTextAreaStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   1198: astore #13
/*     */     //   1200: iload #22
/*     */     //   1202: sipush #-7169
/*     */     //   1205: iand
/*     */     //   1206: istore #22
/*     */     //   1208: iload #20
/*     */     //   1210: sipush #16384
/*     */     //   1213: iand
/*     */     //   1214: ifeq -> 1237
/*     */     //   1217: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   1220: aload #17
/*     */     //   1222: bipush #6
/*     */     //   1224: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1227: astore #14
/*     */     //   1229: iload #22
/*     */     //   1231: ldc_w -57345
/*     */     //   1234: iand
/*     */     //   1235: istore #22
/*     */     //   1237: iload #20
/*     */     //   1239: ldc 32768
/*     */     //   1241: iand
/*     */     //   1242: ifeq -> 1331
/*     */     //   1245: aload #17
/*     */     //   1247: ldc_w 951111647
/*     */     //   1250: invokeinterface startReplaceGroup : (I)V
/*     */     //   1255: aload #17
/*     */     //   1257: astore #24
/*     */     //   1259: iconst_0
/*     */     //   1260: istore #25
/*     */     //   1262: iconst_0
/*     */     //   1263: istore #26
/*     */     //   1265: aload #24
/*     */     //   1267: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1272: astore #27
/*     */     //   1274: iconst_0
/*     */     //   1275: istore #28
/*     */     //   1277: aload #27
/*     */     //   1279: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   1282: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   1285: if_acmpne -> 1310
/*     */     //   1288: iconst_0
/*     */     //   1289: istore #29
/*     */     //   1291: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   1294: astore #29
/*     */     //   1296: aload #24
/*     */     //   1298: aload #29
/*     */     //   1300: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1305: aload #29
/*     */     //   1307: goto -> 1312
/*     */     //   1310: aload #27
/*     */     //   1312: nop
/*     */     //   1313: nop
/*     */     //   1314: nop
/*     */     //   1315: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   1318: astore #23
/*     */     //   1320: aload #17
/*     */     //   1322: invokeinterface endReplaceGroup : ()V
/*     */     //   1327: aload #23
/*     */     //   1329: astore #15
/*     */     //   1331: iload #20
/*     */     //   1333: ldc 65536
/*     */     //   1335: iand
/*     */     //   1336: ifeq -> 1407
/*     */     //   1339: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1342: checkcast androidx/compose/ui/Modifier
/*     */     //   1345: astore #16
/*     */     //   1347: goto -> 1407
/*     */     //   1350: aload #17
/*     */     //   1352: invokeinterface skipToGroupEnd : ()V
/*     */     //   1357: iload #20
/*     */     //   1359: sipush #1024
/*     */     //   1362: iand
/*     */     //   1363: ifeq -> 1373
/*     */     //   1366: iload #22
/*     */     //   1368: bipush #-15
/*     */     //   1370: iand
/*     */     //   1371: istore #22
/*     */     //   1373: iload #20
/*     */     //   1375: sipush #8192
/*     */     //   1378: iand
/*     */     //   1379: ifeq -> 1390
/*     */     //   1382: iload #22
/*     */     //   1384: sipush #-7169
/*     */     //   1387: iand
/*     */     //   1388: istore #22
/*     */     //   1390: iload #20
/*     */     //   1392: sipush #16384
/*     */     //   1395: iand
/*     */     //   1396: ifeq -> 1407
/*     */     //   1399: iload #22
/*     */     //   1401: ldc_w -57345
/*     */     //   1404: iand
/*     */     //   1405: istore #22
/*     */     //   1407: aload #17
/*     */     //   1409: invokeinterface endDefaults : ()V
/*     */     //   1414: invokestatic isTraceInProgress : ()Z
/*     */     //   1417: ifeq -> 1433
/*     */     //   1420: ldc_w -801535818
/*     */     //   1423: iload #21
/*     */     //   1425: iload #22
/*     */     //   1427: ldc_w 'org.jetbrains.jewel.ui.component.TextArea (TextArea.kt:269)'
/*     */     //   1430: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   1433: aload #13
/*     */     //   1435: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TextAreaMetrics;
/*     */     //   1438: invokevirtual getMinSize-MYxV2XQ : ()J
/*     */     //   1441: lstore #23
/*     */     //   1443: aload #13
/*     */     //   1445: invokevirtual getMetrics : ()Lorg/jetbrains/jewel/ui/component/styling/TextAreaMetrics;
/*     */     //   1448: invokevirtual getContentPadding : ()Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   1451: astore #25
/*     */     //   1453: aload_2
/*     */     //   1454: lload #23
/*     */     //   1456: invokestatic getWidth-D9Ej5fM : (J)F
/*     */     //   1459: lload #23
/*     */     //   1461: invokestatic getHeight-D9Ej5fM : (J)F
/*     */     //   1464: invokestatic defaultMinSize-VpY3zN4 : (Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;
/*     */     //   1467: astore #26
/*     */     //   1469: aload_0
/*     */     //   1470: aload_1
/*     */     //   1471: aload #26
/*     */     //   1473: iload_3
/*     */     //   1474: iload #4
/*     */     //   1476: aload #7
/*     */     //   1478: iload #6
/*     */     //   1480: aload #8
/*     */     //   1482: aload #9
/*     */     //   1484: aload #10
/*     */     //   1486: iconst_0
/*     */     //   1487: iload #11
/*     */     //   1489: aload #12
/*     */     //   1491: aload #15
/*     */     //   1493: aload #13
/*     */     //   1495: checkcast org/jetbrains/jewel/ui/component/styling/InputFieldStyle
/*     */     //   1498: aload #14
/*     */     //   1500: ldc_w -22959598
/*     */     //   1503: iconst_1
/*     */     //   1504: new org/jetbrains/jewel/ui/component/TextAreaKt$TextArea$9
/*     */     //   1507: dup
/*     */     //   1508: aload #14
/*     */     //   1510: aload #16
/*     */     //   1512: aload_0
/*     */     //   1513: aload #5
/*     */     //   1515: aload #13
/*     */     //   1517: aload #25
/*     */     //   1519: invokespecial <init> : (Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function2;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/layout/PaddingValues;)V
/*     */     //   1522: aload #17
/*     */     //   1524: bipush #54
/*     */     //   1526: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   1529: checkcast kotlin/jvm/functions/Function4
/*     */     //   1532: aload #17
/*     */     //   1534: bipush #14
/*     */     //   1536: iload #21
/*     */     //   1538: iand
/*     */     //   1539: bipush #112
/*     */     //   1541: iload #21
/*     */     //   1543: iand
/*     */     //   1544: ior
/*     */     //   1545: sipush #7168
/*     */     //   1548: iload #21
/*     */     //   1550: iand
/*     */     //   1551: ior
/*     */     //   1552: ldc 57344
/*     */     //   1554: iload #21
/*     */     //   1556: iand
/*     */     //   1557: ior
/*     */     //   1558: ldc 458752
/*     */     //   1560: iload #21
/*     */     //   1562: bipush #6
/*     */     //   1564: ishr
/*     */     //   1565: iand
/*     */     //   1566: ior
/*     */     //   1567: ldc 3670016
/*     */     //   1569: iload #21
/*     */     //   1571: iand
/*     */     //   1572: ior
/*     */     //   1573: ldc 29360128
/*     */     //   1575: iload #21
/*     */     //   1577: iconst_3
/*     */     //   1578: ishr
/*     */     //   1579: iand
/*     */     //   1580: ior
/*     */     //   1581: ldc 234881024
/*     */     //   1583: iload #21
/*     */     //   1585: iconst_3
/*     */     //   1586: ishr
/*     */     //   1587: iand
/*     */     //   1588: ior
/*     */     //   1589: ldc 1879048192
/*     */     //   1591: iload #22
/*     */     //   1593: bipush #27
/*     */     //   1595: ishl
/*     */     //   1596: iand
/*     */     //   1597: ior
/*     */     //   1598: ldc_w 1572870
/*     */     //   1601: bipush #112
/*     */     //   1603: iload #22
/*     */     //   1605: iand
/*     */     //   1606: ior
/*     */     //   1607: sipush #896
/*     */     //   1610: iload #22
/*     */     //   1612: iand
/*     */     //   1613: ior
/*     */     //   1614: sipush #7168
/*     */     //   1617: iload #22
/*     */     //   1619: bipush #6
/*     */     //   1621: ishr
/*     */     //   1622: iand
/*     */     //   1623: ior
/*     */     //   1624: ldc 57344
/*     */     //   1626: iload #22
/*     */     //   1628: iconst_3
/*     */     //   1629: ishl
/*     */     //   1630: iand
/*     */     //   1631: ior
/*     */     //   1632: ldc 458752
/*     */     //   1634: iload #22
/*     */     //   1636: iconst_3
/*     */     //   1637: ishl
/*     */     //   1638: iand
/*     */     //   1639: ior
/*     */     //   1640: invokestatic InputField : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLorg/jetbrains/jewel/ui/Outline;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/InputFieldStyle;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V
/*     */     //   1643: invokestatic isTraceInProgress : ()Z
/*     */     //   1646: ifeq -> 1662
/*     */     //   1649: invokestatic traceEventEnd : ()V
/*     */     //   1652: goto -> 1662
/*     */     //   1655: aload #17
/*     */     //   1657: invokeinterface skipToGroupEnd : ()V
/*     */     //   1662: aload #17
/*     */     //   1664: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1669: dup
/*     */     //   1670: ifnull -> 1722
/*     */     //   1673: aload_0
/*     */     //   1674: aload_1
/*     */     //   1675: aload_2
/*     */     //   1676: iload_3
/*     */     //   1677: iload #4
/*     */     //   1679: aload #5
/*     */     //   1681: iload #6
/*     */     //   1683: aload #7
/*     */     //   1685: aload #8
/*     */     //   1687: aload #9
/*     */     //   1689: aload #10
/*     */     //   1691: iload #11
/*     */     //   1693: aload #12
/*     */     //   1695: aload #13
/*     */     //   1697: aload #14
/*     */     //   1699: aload #15
/*     */     //   1701: aload #16
/*     */     //   1703: iload #18
/*     */     //   1705: iload #19
/*     */     //   1707: iload #20
/*     */     //   1709: <illegal opcode> invoke : (Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;ZLorg/jetbrains/jewel/ui/Outline;Landroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ILkotlin/jvm/functions/Function1;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;III)Lkotlin/jvm/functions/Function2;
/*     */     //   1714: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1719: goto -> 1723
/*     */     //   1722: pop
/*     */     //   1723: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 14
/*     */     //   #255	-> 936
/*     */     //   #256	-> 951
/*     */     //   #257	-> 961
/*     */     //   #258	-> 972
/*     */     //   #259	-> 983
/*     */     //   #260	-> 995
/*     */     //   #261	-> 1009
/*     */     //   #262	-> 1026
/*     */     //   #263	-> 1043
/*     */     //   #264	-> 1077
/*     */     //   #265	-> 1091
/*     */     //   #414	-> 1111
/*     */     //   #415	-> 1123
/*     */     //   #416	-> 1134
/*     */     //   #416	-> 1142
/*     */     //   #417	-> 1144
/*     */     //   #418	-> 1153
/*     */     //   #419	-> 1158
/*     */     //   #415	-> 1160
/*     */     //   #414	-> 1161
/*     */     //   #414	-> 1162
/*     */     //   #265	-> 1163
/*     */     //   #266	-> 1188
/*     */     //   #267	-> 1217
/*     */     //   #268	-> 1245
/*     */     //   #420	-> 1265
/*     */     //   #421	-> 1277
/*     */     //   #422	-> 1288
/*     */     //   #268	-> 1291
/*     */     //   #422	-> 1294
/*     */     //   #423	-> 1296
/*     */     //   #424	-> 1305
/*     */     //   #425	-> 1310
/*     */     //   #421	-> 1312
/*     */     //   #420	-> 1313
/*     */     //   #420	-> 1314
/*     */     //   #268	-> 1315
/*     */     //   #269	-> 1339
/*     */     //   #270	-> 1430
/*     */     //   #271	-> 1433
/*     */     //   #272	-> 1443
/*     */     //   #278	-> 1453
/*     */     //   #276	-> 1469
/*     */     //   #277	-> 1470
/*     */     //   #278	-> 1471
/*     */     //   #279	-> 1473
/*     */     //   #280	-> 1474
/*     */     //   #281	-> 1476
/*     */     //   #282	-> 1478
/*     */     //   #283	-> 1480
/*     */     //   #284	-> 1482
/*     */     //   #285	-> 1484
/*     */     //   #286	-> 1486
/*     */     //   #287	-> 1487
/*     */     //   #288	-> 1489
/*     */     //   #291	-> 1491
/*     */     //   #289	-> 1493
/*     */     //   #290	-> 1498
/*     */     //   #292	-> 1500
/*     */     //   #275	-> 1640
/*     */     //   #302	-> 1655
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   1137	5	29	$i$a$-cache-TextAreaKt$TextArea$7	I
/*     */     //   1144	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1123	38	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1120	41	27	it$iv	Ljava/lang/Object;
/*     */     //   1111	52	26	$i$f$cache	I
/*     */     //   1108	55	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1108	55	25	invalid$iv	Z
/*     */     //   1291	3	29	$i$a$-cache-TextAreaKt$TextArea$8	I
/*     */     //   1296	11	29	value$iv	Ljava/lang/Object;
/*     */     //   1277	36	28	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   1274	39	27	it$iv	Ljava/lang/Object;
/*     */     //   1265	50	26	$i$f$cache	I
/*     */     //   1262	53	24	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1262	53	25	invalid$iv	Z
/*     */     //   1443	209	23	minSize	J
/*     */     //   1453	199	25	contentPadding	Landroidx/compose/foundation/layout/PaddingValues;
/*     */     //   30	1694	21	$dirty	I
/*     */     //   34	1690	22	$dirty1	I
/*     */     //   0	1724	0	value	Landroidx/compose/ui/text/input/TextFieldValue;
/*     */     //   0	1724	1	onValueChange	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1724	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1724	3	enabled	Z
/*     */     //   0	1724	4	readOnly	Z
/*     */     //   0	1724	5	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1724	6	undecorated	Z
/*     */     //   0	1724	7	outline	Lorg/jetbrains/jewel/ui/Outline;
/*     */     //   0	1724	8	visualTransformation	Landroidx/compose/ui/text/input/VisualTransformation;
/*     */     //   0	1724	9	keyboardOptions	Landroidx/compose/foundation/text/KeyboardOptions;
/*     */     //   0	1724	10	keyboardActions	Landroidx/compose/foundation/text/KeyboardActions;
/*     */     //   0	1724	11	maxLines	I
/*     */     //   0	1724	12	onTextLayout	Lkotlin/jvm/functions/Function1;
/*     */     //   0	1724	13	style	Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   0	1724	14	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1724	15	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   0	1724	16	decorationBoxModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1724	17	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1724	18	$changed	I
/*     */     //   0	1724	19	$changed1	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class TextAreaKt$TextArea$9 implements Function4<Function2<? super Composer, ? super Integer, ? extends Unit>, InputFieldState, Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */     public final void invoke-NUF0VRY(Function2 innerTextField, long param1Long, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
/*     */       int $dirty = $changed;
/*     */       if (($changed & 0x6) == 0)
/*     */         $dirty |= $composer.changedInstance(innerTextField) ? 4 : 2; 
/*     */       if (($dirty & 0x83) != 130 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-22959598, $dirty, -1, "org.jetbrains.jewel.ui.component.TextArea.<anonymous> (TextArea.kt:292)"); 
/*     */         TextAreaKt.TextAreaDecorationBox-yrwZFoE(innerTextField, this.$textStyle, this.$decorationBoxModifier, ((((CharSequence)this.$value.getText()).length() == 0)) ? this.$placeholder : null, this.$style.getColors().getPlaceholder-0d7_KjU(), PaddingKt.padding-3ABfNKs(PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding), this.$style.getMetrics().getBorderWidth-D9Ej5fM()), $composer, 0xE & $dirty);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     TextAreaKt$TextArea$9(TextStyle $textStyle, Modifier $decorationBoxModifier, TextFieldValue $value, Function2<Composer, Integer, Unit> $placeholder, TextAreaStyle $style, PaddingValues $contentPadding) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   private static final void TextAreaDecorationBox-yrwZFoE(Function2 innerTextField, TextStyle textStyle, Modifier modifier, Function2 placeholder, long placeholderTextColor, Modifier placeholderModifier, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ldc_w -886242928
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #7
/*     */     //   12: iload #8
/*     */     //   14: istore #9
/*     */     //   16: iload #8
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #9
/*     */     //   26: aload #7
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #9
/*     */     //   45: iload #8
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #9
/*     */     //   55: aload #7
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #9
/*     */     //   76: iload #8
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #9
/*     */     //   87: aload #7
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #9
/*     */     //   110: iload #8
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #9
/*     */     //   121: aload #7
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #9
/*     */     //   144: iload #8
/*     */     //   146: sipush #24576
/*     */     //   149: iand
/*     */     //   150: ifne -> 179
/*     */     //   153: iload #9
/*     */     //   155: aload #7
/*     */     //   157: lload #4
/*     */     //   159: invokeinterface changed : (J)Z
/*     */     //   164: ifeq -> 173
/*     */     //   167: sipush #16384
/*     */     //   170: goto -> 176
/*     */     //   173: sipush #8192
/*     */     //   176: ior
/*     */     //   177: istore #9
/*     */     //   179: iload #8
/*     */     //   181: ldc 196608
/*     */     //   183: iand
/*     */     //   184: ifne -> 211
/*     */     //   187: iload #9
/*     */     //   189: aload #7
/*     */     //   191: aload #6
/*     */     //   193: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   198: ifeq -> 206
/*     */     //   201: ldc 131072
/*     */     //   203: goto -> 208
/*     */     //   206: ldc 65536
/*     */     //   208: ior
/*     */     //   209: istore #9
/*     */     //   211: iload #9
/*     */     //   213: ldc_w 74899
/*     */     //   216: iand
/*     */     //   217: ldc_w 74898
/*     */     //   220: if_icmpne -> 233
/*     */     //   223: aload #7
/*     */     //   225: invokeinterface getSkipping : ()Z
/*     */     //   230: ifne -> 1586
/*     */     //   233: invokestatic isTraceInProgress : ()Z
/*     */     //   236: ifeq -> 251
/*     */     //   239: ldc_w -886242928
/*     */     //   242: iload #9
/*     */     //   244: iconst_m1
/*     */     //   245: ldc_w 'org.jetbrains.jewel.ui.component.TextAreaDecorationBox (TextArea.kt:311)'
/*     */     //   248: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   251: aload #7
/*     */     //   253: ldc_w -1596833494
/*     */     //   256: invokeinterface startReplaceGroup : (I)V
/*     */     //   261: aload #7
/*     */     //   263: astore #11
/*     */     //   265: iconst_0
/*     */     //   266: istore #12
/*     */     //   268: nop
/*     */     //   269: iconst_0
/*     */     //   270: istore #13
/*     */     //   272: aload #11
/*     */     //   274: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   279: astore #14
/*     */     //   281: iconst_0
/*     */     //   282: istore #15
/*     */     //   284: aload #14
/*     */     //   286: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   289: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   292: if_acmpne -> 320
/*     */     //   295: iconst_0
/*     */     //   296: istore #16
/*     */     //   298: getstatic org/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1.INSTANCE : Lorg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1;
/*     */     //   301: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   304: astore #16
/*     */     //   306: aload #11
/*     */     //   308: aload #16
/*     */     //   310: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   315: aload #16
/*     */     //   317: goto -> 322
/*     */     //   320: aload #14
/*     */     //   322: nop
/*     */     //   323: nop
/*     */     //   324: nop
/*     */     //   325: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   328: astore #10
/*     */     //   330: aload #7
/*     */     //   332: invokeinterface endReplaceGroup : ()V
/*     */     //   337: aload #10
/*     */     //   339: astore #10
/*     */     //   341: sipush #384
/*     */     //   344: bipush #112
/*     */     //   346: iload #9
/*     */     //   348: iconst_3
/*     */     //   349: ishr
/*     */     //   350: iand
/*     */     //   351: ior
/*     */     //   352: istore #11
/*     */     //   354: nop
/*     */     //   355: iconst_0
/*     */     //   356: istore #12
/*     */     //   358: aload #7
/*     */     //   360: ldc_w -1323940314
/*     */     //   363: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   366: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   369: aload #7
/*     */     //   371: iconst_0
/*     */     //   372: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   375: istore #13
/*     */     //   377: aload #7
/*     */     //   379: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   384: astore #14
/*     */     //   386: aload #7
/*     */     //   388: aload_2
/*     */     //   389: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   392: astore #15
/*     */     //   394: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   397: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   400: astore #16
/*     */     //   402: bipush #6
/*     */     //   404: sipush #896
/*     */     //   407: iload #11
/*     */     //   409: bipush #6
/*     */     //   411: ishl
/*     */     //   412: iand
/*     */     //   413: ior
/*     */     //   414: istore #17
/*     */     //   416: nop
/*     */     //   417: iconst_0
/*     */     //   418: istore #18
/*     */     //   420: aload #7
/*     */     //   422: ldc_w -692256719
/*     */     //   425: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   428: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   431: aload #7
/*     */     //   433: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   438: instanceof androidx/compose/runtime/Applier
/*     */     //   441: ifne -> 447
/*     */     //   444: invokestatic invalidApplier : ()V
/*     */     //   447: aload #7
/*     */     //   449: invokeinterface startReusableNode : ()V
/*     */     //   454: aload #7
/*     */     //   456: invokeinterface getInserting : ()Z
/*     */     //   461: ifeq -> 476
/*     */     //   464: aload #7
/*     */     //   466: aload #16
/*     */     //   468: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   473: goto -> 483
/*     */     //   476: aload #7
/*     */     //   478: invokeinterface useNode : ()V
/*     */     //   483: aload #7
/*     */     //   485: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   488: astore #19
/*     */     //   490: iconst_0
/*     */     //   491: istore #20
/*     */     //   493: aload #19
/*     */     //   495: aload #10
/*     */     //   497: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   500: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   503: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   506: aload #19
/*     */     //   508: aload #14
/*     */     //   510: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   513: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   516: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   519: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   522: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   525: astore #21
/*     */     //   527: iconst_0
/*     */     //   528: istore #22
/*     */     //   530: aload #19
/*     */     //   532: astore #23
/*     */     //   534: iconst_0
/*     */     //   535: istore #24
/*     */     //   537: aload #23
/*     */     //   539: invokeinterface getInserting : ()Z
/*     */     //   544: ifne -> 565
/*     */     //   547: aload #23
/*     */     //   549: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   554: iload #13
/*     */     //   556: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   559: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   562: ifne -> 591
/*     */     //   565: aload #23
/*     */     //   567: iload #13
/*     */     //   569: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   572: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   577: aload #19
/*     */     //   579: iload #13
/*     */     //   581: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   584: aload #21
/*     */     //   586: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   591: nop
/*     */     //   592: nop
/*     */     //   593: nop
/*     */     //   594: aload #19
/*     */     //   596: aload #15
/*     */     //   598: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   601: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   604: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   607: nop
/*     */     //   608: nop
/*     */     //   609: aload #7
/*     */     //   611: bipush #14
/*     */     //   613: iload #17
/*     */     //   615: bipush #6
/*     */     //   617: ishr
/*     */     //   618: iand
/*     */     //   619: istore #25
/*     */     //   621: astore #26
/*     */     //   623: iconst_0
/*     */     //   624: istore #27
/*     */     //   626: aload #26
/*     */     //   628: ldc_w -1756383060
/*     */     //   631: invokeinterface startReplaceGroup : (I)V
/*     */     //   636: aload_3
/*     */     //   637: ifnull -> 1124
/*     */     //   640: aload #6
/*     */     //   642: ldc_w 'Placeholder'
/*     */     //   645: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   648: astore #28
/*     */     //   650: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   653: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   656: astore #29
/*     */     //   658: bipush #48
/*     */     //   660: istore #30
/*     */     //   662: iconst_0
/*     */     //   663: istore #31
/*     */     //   665: aload #26
/*     */     //   667: ldc_w 733328855
/*     */     //   670: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   673: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   676: iconst_0
/*     */     //   677: istore #32
/*     */     //   679: aload #29
/*     */     //   681: iload #32
/*     */     //   683: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   686: astore #33
/*     */     //   688: bipush #112
/*     */     //   690: iload #30
/*     */     //   692: iconst_3
/*     */     //   693: ishl
/*     */     //   694: iand
/*     */     //   695: istore #34
/*     */     //   697: nop
/*     */     //   698: iconst_0
/*     */     //   699: istore #35
/*     */     //   701: aload #26
/*     */     //   703: ldc_w -1323940314
/*     */     //   706: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   709: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   712: aload #26
/*     */     //   714: iconst_0
/*     */     //   715: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   718: istore #36
/*     */     //   720: aload #26
/*     */     //   722: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   727: astore #37
/*     */     //   729: aload #26
/*     */     //   731: aload #28
/*     */     //   733: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   736: astore #38
/*     */     //   738: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   741: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   744: astore #39
/*     */     //   746: bipush #6
/*     */     //   748: sipush #896
/*     */     //   751: iload #34
/*     */     //   753: bipush #6
/*     */     //   755: ishl
/*     */     //   756: iand
/*     */     //   757: ior
/*     */     //   758: istore #40
/*     */     //   760: nop
/*     */     //   761: iconst_0
/*     */     //   762: istore #41
/*     */     //   764: aload #26
/*     */     //   766: ldc_w -692256719
/*     */     //   769: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   772: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   775: aload #26
/*     */     //   777: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   782: instanceof androidx/compose/runtime/Applier
/*     */     //   785: ifne -> 791
/*     */     //   788: invokestatic invalidApplier : ()V
/*     */     //   791: aload #26
/*     */     //   793: invokeinterface startReusableNode : ()V
/*     */     //   798: aload #26
/*     */     //   800: invokeinterface getInserting : ()Z
/*     */     //   805: ifeq -> 820
/*     */     //   808: aload #26
/*     */     //   810: aload #39
/*     */     //   812: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   817: goto -> 827
/*     */     //   820: aload #26
/*     */     //   822: invokeinterface useNode : ()V
/*     */     //   827: aload #26
/*     */     //   829: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   832: astore #42
/*     */     //   834: iconst_0
/*     */     //   835: istore #43
/*     */     //   837: aload #42
/*     */     //   839: aload #33
/*     */     //   841: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   844: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   847: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   850: aload #42
/*     */     //   852: aload #37
/*     */     //   854: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   857: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   860: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   863: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   866: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   869: astore #44
/*     */     //   871: iconst_0
/*     */     //   872: istore #45
/*     */     //   874: aload #42
/*     */     //   876: astore #46
/*     */     //   878: iconst_0
/*     */     //   879: istore #47
/*     */     //   881: aload #46
/*     */     //   883: invokeinterface getInserting : ()Z
/*     */     //   888: ifne -> 909
/*     */     //   891: aload #46
/*     */     //   893: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   898: iload #36
/*     */     //   900: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   903: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   906: ifne -> 935
/*     */     //   909: aload #46
/*     */     //   911: iload #36
/*     */     //   913: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   916: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   921: aload #42
/*     */     //   923: iload #36
/*     */     //   925: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   928: aload #44
/*     */     //   930: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   935: nop
/*     */     //   936: nop
/*     */     //   937: nop
/*     */     //   938: aload #42
/*     */     //   940: aload #38
/*     */     //   942: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   945: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   948: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   951: nop
/*     */     //   952: nop
/*     */     //   953: aload #26
/*     */     //   955: bipush #14
/*     */     //   957: iload #40
/*     */     //   959: bipush #6
/*     */     //   961: ishr
/*     */     //   962: iand
/*     */     //   963: istore #48
/*     */     //   965: astore #49
/*     */     //   967: iconst_0
/*     */     //   968: istore #50
/*     */     //   970: aload #49
/*     */     //   972: ldc_w -2146769399
/*     */     //   975: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   978: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   981: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   984: aload #49
/*     */     //   986: bipush #6
/*     */     //   988: bipush #112
/*     */     //   990: iload #30
/*     */     //   992: bipush #6
/*     */     //   994: ishr
/*     */     //   995: iand
/*     */     //   996: ior
/*     */     //   997: istore #51
/*     */     //   999: astore #52
/*     */     //   1001: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1004: astore #53
/*     */     //   1006: iconst_0
/*     */     //   1007: istore #54
/*     */     //   1009: iconst_2
/*     */     //   1010: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   1013: astore #55
/*     */     //   1015: aload #55
/*     */     //   1017: iconst_0
/*     */     //   1018: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1021: aload_1
/*     */     //   1022: lload #4
/*     */     //   1024: lconst_0
/*     */     //   1025: aconst_null
/*     */     //   1026: aconst_null
/*     */     //   1027: aconst_null
/*     */     //   1028: aconst_null
/*     */     //   1029: aconst_null
/*     */     //   1030: lconst_0
/*     */     //   1031: aconst_null
/*     */     //   1032: aconst_null
/*     */     //   1033: aconst_null
/*     */     //   1034: lconst_0
/*     */     //   1035: aconst_null
/*     */     //   1036: aconst_null
/*     */     //   1037: aconst_null
/*     */     //   1038: iconst_0
/*     */     //   1039: iconst_0
/*     */     //   1040: lconst_0
/*     */     //   1041: aconst_null
/*     */     //   1042: aconst_null
/*     */     //   1043: aconst_null
/*     */     //   1044: iconst_0
/*     */     //   1045: iconst_0
/*     */     //   1046: aconst_null
/*     */     //   1047: ldc_w 16777214
/*     */     //   1050: aconst_null
/*     */     //   1051: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1054: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1057: aastore
/*     */     //   1058: aload #55
/*     */     //   1060: iconst_1
/*     */     //   1061: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1064: lload #4
/*     */     //   1066: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1069: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1072: aastore
/*     */     //   1073: aload #55
/*     */     //   1075: aload_3
/*     */     //   1076: aload #52
/*     */     //   1078: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1081: bipush #112
/*     */     //   1083: iload #9
/*     */     //   1085: bipush #6
/*     */     //   1087: ishr
/*     */     //   1088: iand
/*     */     //   1089: ior
/*     */     //   1090: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1093: nop
/*     */     //   1094: aload #49
/*     */     //   1096: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1099: aload #26
/*     */     //   1101: invokeinterface endNode : ()V
/*     */     //   1106: aload #26
/*     */     //   1108: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1111: nop
/*     */     //   1112: aload #26
/*     */     //   1114: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1117: nop
/*     */     //   1118: aload #26
/*     */     //   1120: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1123: nop
/*     */     //   1124: aload #26
/*     */     //   1126: invokeinterface endReplaceGroup : ()V
/*     */     //   1131: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1134: checkcast androidx/compose/ui/Modifier
/*     */     //   1137: ldc_w 'TextField'
/*     */     //   1140: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1143: astore #28
/*     */     //   1145: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1148: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1151: astore #29
/*     */     //   1153: iconst_1
/*     */     //   1154: istore #32
/*     */     //   1156: sipush #438
/*     */     //   1159: istore #30
/*     */     //   1161: nop
/*     */     //   1162: iconst_0
/*     */     //   1163: istore #31
/*     */     //   1165: aload #26
/*     */     //   1167: ldc_w 733328855
/*     */     //   1170: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1173: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1176: aload #29
/*     */     //   1178: iload #32
/*     */     //   1180: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1183: astore #33
/*     */     //   1185: bipush #112
/*     */     //   1187: iload #30
/*     */     //   1189: iconst_3
/*     */     //   1190: ishl
/*     */     //   1191: iand
/*     */     //   1192: istore #34
/*     */     //   1194: nop
/*     */     //   1195: iconst_0
/*     */     //   1196: istore #35
/*     */     //   1198: aload #26
/*     */     //   1200: ldc_w -1323940314
/*     */     //   1203: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1206: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1209: aload #26
/*     */     //   1211: iconst_0
/*     */     //   1212: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1215: istore #36
/*     */     //   1217: aload #26
/*     */     //   1219: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1224: astore #37
/*     */     //   1226: aload #26
/*     */     //   1228: aload #28
/*     */     //   1230: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1233: astore #38
/*     */     //   1235: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1238: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1241: astore #39
/*     */     //   1243: bipush #6
/*     */     //   1245: sipush #896
/*     */     //   1248: iload #34
/*     */     //   1250: bipush #6
/*     */     //   1252: ishl
/*     */     //   1253: iand
/*     */     //   1254: ior
/*     */     //   1255: istore #40
/*     */     //   1257: nop
/*     */     //   1258: iconst_0
/*     */     //   1259: istore #41
/*     */     //   1261: aload #26
/*     */     //   1263: ldc_w -692256719
/*     */     //   1266: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1269: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1272: aload #26
/*     */     //   1274: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1279: instanceof androidx/compose/runtime/Applier
/*     */     //   1282: ifne -> 1288
/*     */     //   1285: invokestatic invalidApplier : ()V
/*     */     //   1288: aload #26
/*     */     //   1290: invokeinterface startReusableNode : ()V
/*     */     //   1295: aload #26
/*     */     //   1297: invokeinterface getInserting : ()Z
/*     */     //   1302: ifeq -> 1317
/*     */     //   1305: aload #26
/*     */     //   1307: aload #39
/*     */     //   1309: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1314: goto -> 1324
/*     */     //   1317: aload #26
/*     */     //   1319: invokeinterface useNode : ()V
/*     */     //   1324: aload #26
/*     */     //   1326: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1329: astore #42
/*     */     //   1331: iconst_0
/*     */     //   1332: istore #43
/*     */     //   1334: aload #42
/*     */     //   1336: aload #33
/*     */     //   1338: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1341: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1344: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1347: aload #42
/*     */     //   1349: aload #37
/*     */     //   1351: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1354: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1357: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1360: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1363: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1366: astore #44
/*     */     //   1368: iconst_0
/*     */     //   1369: istore #45
/*     */     //   1371: aload #42
/*     */     //   1373: astore #46
/*     */     //   1375: iconst_0
/*     */     //   1376: istore #47
/*     */     //   1378: aload #46
/*     */     //   1380: invokeinterface getInserting : ()Z
/*     */     //   1385: ifne -> 1406
/*     */     //   1388: aload #46
/*     */     //   1390: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1395: iload #36
/*     */     //   1397: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1400: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1403: ifne -> 1432
/*     */     //   1406: aload #46
/*     */     //   1408: iload #36
/*     */     //   1410: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1413: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1418: aload #42
/*     */     //   1420: iload #36
/*     */     //   1422: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1425: aload #44
/*     */     //   1427: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1432: nop
/*     */     //   1433: nop
/*     */     //   1434: nop
/*     */     //   1435: aload #42
/*     */     //   1437: aload #38
/*     */     //   1439: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1442: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1445: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1448: nop
/*     */     //   1449: nop
/*     */     //   1450: aload #26
/*     */     //   1452: bipush #14
/*     */     //   1454: iload #40
/*     */     //   1456: bipush #6
/*     */     //   1458: ishr
/*     */     //   1459: iand
/*     */     //   1460: istore #48
/*     */     //   1462: astore #49
/*     */     //   1464: iconst_0
/*     */     //   1465: istore #50
/*     */     //   1467: aload #49
/*     */     //   1469: ldc_w -2146769399
/*     */     //   1472: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1475: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1478: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1481: aload #49
/*     */     //   1483: bipush #6
/*     */     //   1485: bipush #112
/*     */     //   1487: iload #30
/*     */     //   1489: bipush #6
/*     */     //   1491: ishr
/*     */     //   1492: iand
/*     */     //   1493: ior
/*     */     //   1494: istore #51
/*     */     //   1496: astore #52
/*     */     //   1498: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1501: astore #53
/*     */     //   1503: iconst_0
/*     */     //   1504: istore #54
/*     */     //   1506: aload_0
/*     */     //   1507: aload #52
/*     */     //   1509: bipush #14
/*     */     //   1511: iload #9
/*     */     //   1513: iand
/*     */     //   1514: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1517: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1522: pop
/*     */     //   1523: nop
/*     */     //   1524: aload #49
/*     */     //   1526: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1529: aload #26
/*     */     //   1531: invokeinterface endNode : ()V
/*     */     //   1536: aload #26
/*     */     //   1538: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1541: nop
/*     */     //   1542: aload #26
/*     */     //   1544: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1547: nop
/*     */     //   1548: aload #26
/*     */     //   1550: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1553: nop
/*     */     //   1554: nop
/*     */     //   1555: aload #7
/*     */     //   1557: invokeinterface endNode : ()V
/*     */     //   1562: aload #7
/*     */     //   1564: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1567: nop
/*     */     //   1568: aload #7
/*     */     //   1570: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1573: nop
/*     */     //   1574: invokestatic isTraceInProgress : ()Z
/*     */     //   1577: ifeq -> 1593
/*     */     //   1580: invokestatic traceEventEnd : ()V
/*     */     //   1583: goto -> 1593
/*     */     //   1586: aload #7
/*     */     //   1588: invokeinterface skipToGroupEnd : ()V
/*     */     //   1593: aload #7
/*     */     //   1595: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1600: dup
/*     */     //   1601: ifnull -> 1627
/*     */     //   1604: aload_0
/*     */     //   1605: aload_1
/*     */     //   1606: aload_2
/*     */     //   1607: aload_3
/*     */     //   1608: lload #4
/*     */     //   1610: aload #6
/*     */     //   1612: iload #8
/*     */     //   1614: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/Modifier;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1619: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1624: goto -> 1628
/*     */     //   1627: pop
/*     */     //   1628: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #312	-> 0
/*     */     //   #334	-> 268
/*     */     //   #426	-> 272
/*     */     //   #427	-> 284
/*     */     //   #428	-> 295
/*     */     //   #334	-> 298
/*     */     //   #428	-> 304
/*     */     //   #429	-> 306
/*     */     //   #430	-> 315
/*     */     //   #431	-> 320
/*     */     //   #427	-> 322
/*     */     //   #426	-> 323
/*     */     //   #426	-> 324
/*     */     //   #334	-> 325
/*     */     //   #313	-> 354
/*     */     //   #432	-> 366
/*     */     //   #433	-> 372
/*     */     //   #434	-> 379
/*     */     //   #435	-> 388
/*     */     //   #437	-> 394
/*     */     //   #436	-> 416
/*     */     //   #438	-> 428
/*     */     //   #439	-> 431
/*     */     //   #440	-> 449
/*     */     //   #441	-> 454
/*     */     //   #442	-> 466
/*     */     //   #444	-> 478
/*     */     //   #446	-> 483
/*     */     //   #447	-> 493
/*     */     //   #448	-> 506
/*     */     //   #450	-> 519
/*     */     //   #451	-> 530
/*     */     //   #452	-> 537
/*     */     //   #453	-> 565
/*     */     //   #454	-> 577
/*     */     //   #456	-> 591
/*     */     //   #451	-> 592
/*     */     //   #456	-> 593
/*     */     //   #457	-> 594
/*     */     //   #458	-> 607
/*     */     //   #446	-> 608
/*     */     //   #459	-> 609
/*     */     //   #315	-> 636
/*     */     //   #316	-> 640
/*     */     //   #460	-> 673
/*     */     //   #461	-> 676
/*     */     //   #464	-> 679
/*     */     //   #465	-> 697
/*     */     //   #466	-> 709
/*     */     //   #467	-> 715
/*     */     //   #468	-> 722
/*     */     //   #469	-> 731
/*     */     //   #471	-> 738
/*     */     //   #470	-> 760
/*     */     //   #472	-> 772
/*     */     //   #473	-> 775
/*     */     //   #474	-> 793
/*     */     //   #475	-> 798
/*     */     //   #476	-> 810
/*     */     //   #478	-> 822
/*     */     //   #480	-> 827
/*     */     //   #481	-> 837
/*     */     //   #482	-> 850
/*     */     //   #484	-> 863
/*     */     //   #485	-> 874
/*     */     //   #486	-> 881
/*     */     //   #487	-> 909
/*     */     //   #488	-> 921
/*     */     //   #490	-> 935
/*     */     //   #485	-> 936
/*     */     //   #490	-> 937
/*     */     //   #491	-> 938
/*     */     //   #492	-> 951
/*     */     //   #480	-> 952
/*     */     //   #493	-> 953
/*     */     //   #494	-> 978
/*     */     //   #318	-> 1009
/*     */     //   #319	-> 1061
/*     */     //   #318	-> 1073
/*     */     //   #320	-> 1075
/*     */     //   #317	-> 1090
/*     */     //   #322	-> 1093
/*     */     //   #494	-> 1094
/*     */     //   #493	-> 1099
/*     */     //   #495	-> 1101
/*     */     //   #472	-> 1108
/*     */     //   #496	-> 1111
/*     */     //   #466	-> 1114
/*     */     //   #497	-> 1117
/*     */     //   #460	-> 1120
/*     */     //   #498	-> 1123
/*     */     //   #326	-> 1131
/*     */     //   #327	-> 1145
/*     */     //   #328	-> 1153
/*     */     //   #325	-> 1161
/*     */     //   #499	-> 1173
/*     */     //   #500	-> 1176
/*     */     //   #501	-> 1194
/*     */     //   #502	-> 1206
/*     */     //   #503	-> 1212
/*     */     //   #504	-> 1219
/*     */     //   #505	-> 1228
/*     */     //   #507	-> 1235
/*     */     //   #506	-> 1257
/*     */     //   #508	-> 1269
/*     */     //   #509	-> 1272
/*     */     //   #510	-> 1290
/*     */     //   #511	-> 1295
/*     */     //   #512	-> 1307
/*     */     //   #514	-> 1319
/*     */     //   #516	-> 1324
/*     */     //   #517	-> 1334
/*     */     //   #518	-> 1347
/*     */     //   #520	-> 1360
/*     */     //   #521	-> 1371
/*     */     //   #522	-> 1378
/*     */     //   #523	-> 1406
/*     */     //   #524	-> 1418
/*     */     //   #526	-> 1432
/*     */     //   #521	-> 1433
/*     */     //   #526	-> 1434
/*     */     //   #527	-> 1435
/*     */     //   #528	-> 1448
/*     */     //   #516	-> 1449
/*     */     //   #529	-> 1450
/*     */     //   #530	-> 1475
/*     */     //   #330	-> 1506
/*     */     //   #331	-> 1523
/*     */     //   #530	-> 1524
/*     */     //   #529	-> 1529
/*     */     //   #531	-> 1531
/*     */     //   #508	-> 1538
/*     */     //   #532	-> 1541
/*     */     //   #502	-> 1544
/*     */     //   #533	-> 1547
/*     */     //   #499	-> 1550
/*     */     //   #534	-> 1553
/*     */     //   #332	-> 1554
/*     */     //   #459	-> 1555
/*     */     //   #535	-> 1557
/*     */     //   #438	-> 1564
/*     */     //   #536	-> 1567
/*     */     //   #432	-> 1570
/*     */     //   #537	-> 1573
/*     */     //   #354	-> 1586
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   298	6	16	$i$a$-cache-TextAreaKt$TextAreaDecorationBox$2	I
/*     */     //   306	11	16	value$iv	Ljava/lang/Object;
/*     */     //   284	39	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   281	42	14	it$iv	Ljava/lang/Object;
/*     */     //   272	53	13	$i$f$cache	I
/*     */     //   269	56	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   269	56	12	invalid$iv	Z
/*     */     //   1009	85	54	$i$a$-Box-TextAreaKt$TextAreaDecorationBox$1$1	I
/*     */     //   1006	88	53	$this$TextAreaDecorationBox_yrwZFoE_u24lambda_u2421_u24lambda_u2419	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1006	88	52	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1006	88	51	$changed	I
/*     */     //   970	129	50	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   967	132	49	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   967	132	48	$changed$iv	I
/*     */     //   881	55	47	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   878	58	46	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   874	64	45	$i$f$set-impl	I
/*     */     //   871	67	44	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   837	115	43	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   834	118	42	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   764	348	41	$i$f$ReusableComposeNode	I
/*     */     //   761	351	39	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   761	351	40	$changed$iv$iv$iv	I
/*     */     //   701	417	35	$i$f$Layout	I
/*     */     //   720	398	36	compositeKeyHash$iv$iv	I
/*     */     //   729	389	37	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   738	380	38	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   698	420	34	$changed$iv$iv	I
/*     */     //   665	459	31	$i$f$Box	I
/*     */     //   688	436	33	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   662	462	28	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   662	462	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   679	445	32	propagateMinConstraints$iv	Z
/*     */     //   662	462	30	$changed$iv	I
/*     */     //   1506	18	54	$i$a$-Box-TextAreaKt$TextAreaDecorationBox$1$2	I
/*     */     //   1503	21	53	$this$TextAreaDecorationBox_yrwZFoE_u24lambda_u2421_u24lambda_u2420	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1503	21	52	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1503	21	51	$changed	I
/*     */     //   1467	62	50	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1464	65	49	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1464	65	48	$changed$iv	I
/*     */     //   1378	55	47	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1375	58	46	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1371	64	45	$i$f$set-impl	I
/*     */     //   1368	67	44	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1334	115	43	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1331	118	42	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1261	281	41	$i$f$ReusableComposeNode	I
/*     */     //   1258	284	39	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1258	284	40	$changed$iv$iv$iv	I
/*     */     //   1198	350	35	$i$f$Layout	I
/*     */     //   1217	331	36	compositeKeyHash$iv$iv	I
/*     */     //   1226	322	37	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1235	313	38	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1195	353	34	$changed$iv$iv	I
/*     */     //   1165	389	31	$i$f$Box	I
/*     */     //   1185	369	33	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1162	392	28	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1162	392	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1162	392	32	propagateMinConstraints$iv	Z
/*     */     //   1162	392	30	$changed$iv	I
/*     */     //   626	929	27	$i$a$-Layout-TextAreaKt$TextAreaDecorationBox$1	I
/*     */     //   623	932	26	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   623	932	25	$changed	I
/*     */     //   537	55	24	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   534	58	23	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   530	64	22	$i$f$set-impl	I
/*     */     //   527	67	21	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   493	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   490	118	19	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   420	1148	18	$i$f$ReusableComposeNode	I
/*     */     //   417	1151	16	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   417	1151	17	$changed$iv$iv	I
/*     */     //   358	1216	12	$i$f$Layout	I
/*     */     //   377	1197	13	compositeKeyHash$iv	I
/*     */     //   386	1188	14	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   394	1180	15	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   355	1219	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   355	1219	11	$changed$iv	I
/*     */     //   16	1613	9	$dirty	I
/*     */     //   0	1629	0	innerTextField	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1629	1	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1629	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1629	3	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1629	4	placeholderTextColor	J
/*     */     //   0	1629	6	placeholderModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1629	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1629	8	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n618#2,12:374\n1#3:386\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1\n*L\n337#1:374,12\n*E\n"})
/*     */   static final class TextAreaKt$TextAreaDecorationBox$2$1 implements MeasurePolicy {
/*     */     public static final TextAreaKt$TextAreaDecorationBox$2$1 INSTANCE = new TextAreaKt$TextAreaDecorationBox$2$1();
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$Layout'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: lload_3
/*     */       //   13: iconst_0
/*     */       //   14: iconst_0
/*     */       //   15: iconst_0
/*     */       //   16: iconst_0
/*     */       //   17: bipush #11
/*     */       //   19: aconst_null
/*     */       //   20: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */       //   23: lstore #5
/*     */       //   25: aload_2
/*     */       //   26: checkcast java/lang/Iterable
/*     */       //   29: astore #8
/*     */       //   31: iconst_0
/*     */       //   32: istore #9
/*     */       //   34: aconst_null
/*     */       //   35: astore #10
/*     */       //   37: iconst_0
/*     */       //   38: istore #11
/*     */       //   40: aload #8
/*     */       //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   47: astore #12
/*     */       //   49: aload #12
/*     */       //   51: invokeinterface hasNext : ()Z
/*     */       //   56: ifeq -> 116
/*     */       //   59: aload #12
/*     */       //   61: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   66: astore #13
/*     */       //   68: aload #13
/*     */       //   70: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   73: astore #14
/*     */       //   75: iconst_0
/*     */       //   76: istore #15
/*     */       //   78: aload #14
/*     */       //   80: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   83: ldc 'TextField'
/*     */       //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   88: ifeq -> 49
/*     */       //   91: iload #11
/*     */       //   93: ifeq -> 106
/*     */       //   96: new java/lang/IllegalArgumentException
/*     */       //   99: dup
/*     */       //   100: ldc 'Collection contains more than one matching element.'
/*     */       //   102: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   105: athrow
/*     */       //   106: aload #13
/*     */       //   108: astore #10
/*     */       //   110: iconst_1
/*     */       //   111: istore #11
/*     */       //   113: goto -> 49
/*     */       //   116: iload #11
/*     */       //   118: ifne -> 131
/*     */       //   121: new java/util/NoSuchElementException
/*     */       //   124: dup
/*     */       //   125: ldc 'Collection contains no element matching the predicate.'
/*     */       //   127: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   130: athrow
/*     */       //   131: aload #10
/*     */       //   133: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   136: lload #5
/*     */       //   138: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   143: astore #7
/*     */       //   145: lload #5
/*     */       //   147: iconst_0
/*     */       //   148: iconst_0
/*     */       //   149: iconst_0
/*     */       //   150: iconst_0
/*     */       //   151: bipush #10
/*     */       //   153: aconst_null
/*     */       //   154: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */       //   157: lstore #8
/*     */       //   159: aload_2
/*     */       //   160: checkcast java/lang/Iterable
/*     */       //   163: astore #13
/*     */       //   165: aload #13
/*     */       //   167: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   172: astore #14
/*     */       //   174: aload #14
/*     */       //   176: invokeinterface hasNext : ()Z
/*     */       //   181: ifeq -> 221
/*     */       //   184: aload #14
/*     */       //   186: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   191: astore #15
/*     */       //   193: aload #15
/*     */       //   195: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   198: astore #16
/*     */       //   200: iconst_0
/*     */       //   201: istore #17
/*     */       //   203: aload #16
/*     */       //   205: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   208: ldc 'Placeholder'
/*     */       //   210: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   213: ifeq -> 174
/*     */       //   216: aload #15
/*     */       //   218: goto -> 222
/*     */       //   221: aconst_null
/*     */       //   222: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   225: dup
/*     */       //   226: ifnull -> 239
/*     */       //   229: lload #8
/*     */       //   231: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   236: goto -> 241
/*     */       //   239: pop
/*     */       //   240: aconst_null
/*     */       //   241: astore #10
/*     */       //   243: aload #7
/*     */       //   245: aload #10
/*     */       //   247: lload_3
/*     */       //   248: invokestatic access$calculateWidth-3p2s80s : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */       //   251: istore #11
/*     */       //   253: aload #7
/*     */       //   255: aload #10
/*     */       //   257: lload_3
/*     */       //   258: invokestatic access$calculateHeight-3p2s80s : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */       //   261: istore #12
/*     */       //   263: aload_1
/*     */       //   264: iload #11
/*     */       //   266: iload #12
/*     */       //   268: aconst_null
/*     */       //   269: aload #10
/*     */       //   271: aload #7
/*     */       //   273: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */       //   278: iconst_4
/*     */       //   279: aconst_null
/*     */       //   280: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   283: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #335	-> 12
/*     */       //   #337	-> 25
/*     */       //   #374	-> 34
/*     */       //   #375	-> 37
/*     */       //   #376	-> 40
/*     */       //   #377	-> 68
/*     */       //   #337	-> 78
/*     */       //   #377	-> 88
/*     */       //   #378	-> 91
/*     */       //   #379	-> 106
/*     */       //   #380	-> 110
/*     */       //   #383	-> 116
/*     */       //   #385	-> 131
/*     */       //   #337	-> 136
/*     */       //   #340	-> 145
/*     */       //   #341	-> 159
/*     */       //   #386	-> 200
/*     */       //   #341	-> 203
/*     */       //   #341	-> 213
/*     */       //   #341	-> 222
/*     */       //   #343	-> 243
/*     */       //   #344	-> 253
/*     */       //   #346	-> 263
/*     */       //   #352	-> 283
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   78	10	15	$i$a$-single-TextAreaKt$TextAreaDecorationBox$2$1$textAreaPlaceable$1	I
/*     */       //   75	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   68	45	13	element$iv	Ljava/lang/Object;
/*     */       //   34	99	9	$i$f$single	I
/*     */       //   37	96	10	single$iv	Ljava/lang/Object;
/*     */       //   40	93	11	found$iv	Z
/*     */       //   31	102	8	$this$single$iv	Ljava/lang/Iterable;
/*     */       //   203	10	17	$i$a$-find-TextAreaKt$TextAreaDecorationBox$2$1$placeholderPlaceable$1	I
/*     */       //   200	13	16	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   25	259	5	textAreaConstraints	J
/*     */       //   145	139	7	textAreaPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   159	125	8	placeholderConstraints	J
/*     */       //   243	41	10	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   253	31	11	width	I
/*     */       //   263	21	12	height	I
/*     */       //   0	284	0	this	Lorg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1;
/*     */       //   0	284	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	284	2	measurables	Ljava/util/List;
/*     */       //   0	284	3	incomingConstraints	J
/*     */     }
/*     */     
/*     */     private static final Unit measure_3p2s80s$lambda$2(Placeable $placeholderPlaceable, Placeable $textAreaPlaceable, Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       if ($placeholderPlaceable != null) {
/*     */         Placeable.PlacementScope.placeRelative$default($this$layout, $placeholderPlaceable, 0, 0, 0.0F, 4, null);
/*     */       } else {
/*     */       
/*     */       } 
/*     */       Placeable.PlacementScope.placeRelative$default($this$layout, $textAreaPlaceable, 0, 0, 0.0F, 4, null);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final int calculateWidth-3p2s80s(Placeable textFieldPlaceable, Placeable placeholderPlaceable, long incomingConstraints) {
/*     */     int i = textFieldPlaceable.getWidth();
/*     */     boolean bool = (placeholderPlaceable != null) ? placeholderPlaceable.getWidth() : false;
/*     */     return RangesKt.coerceAtLeast(Math.max(i, bool), Constraints.getMinWidth-impl(incomingConstraints));
/*     */   }
/*     */   
/*     */   private static final int calculateHeight-3p2s80s(Placeable textFieldPlaceable, Placeable placeholderPlaceable, long incomingConstraints) {
/*     */     int i = textFieldPlaceable.getHeight();
/*     */     boolean bool = (placeholderPlaceable != null) ? placeholderPlaceable.getHeight() : false;
/*     */     int textAreaHeight = Math.max(i, bool);
/*     */     return RangesKt.coerceAtLeast(textAreaHeight, Constraints.getMinHeight-impl(incomingConstraints));
/*     */   }
/*     */   
/*     */   private static final Unit TextArea$lambda$1(TextFieldState $state, Modifier $modifier, boolean $enabled, boolean $readOnly, InputTransformation $inputTransformation, TextStyle $textStyle, KeyboardOptions $keyboardOptions, KeyboardActionHandler $onKeyboardAction, TextFieldLineLimits $lineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> $onTextLayout, MutableInteractionSource $interactionSource, TextAreaStyle $style, Outline $outline, Function2<? super Composer, ? super Integer, Unit> $placeholder, Modifier $decorationBoxModifier, OutputTransformation $outputTransformation, boolean $undecorated, ScrollState $scrollState, ScrollbarStyle $scrollbarStyle, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextArea($state, $modifier, $enabled, $readOnly, $inputTransformation, $textStyle, $keyboardOptions, $onKeyboardAction, $lineLimits, $onTextLayout, $interactionSource, $style, $outline, $placeholder, $decorationBoxModifier, $outputTransformation, $undecorated, $scrollState, $scrollbarStyle, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextArea$lambda$14(String $value, Function1<? super String, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $readOnly, Outline $outline, Function2<? super Composer, ? super Integer, Unit> $placeholder, boolean $undecorated, VisualTransformation $visualTransformation, KeyboardOptions $keyboardOptions, KeyboardActions $keyboardActions, int $maxLines, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextAreaStyle $style, TextStyle $textStyle, MutableInteractionSource $interactionSource, Modifier $decorationBoxModifier, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextArea($value, $onValueChange, $modifier, $enabled, $readOnly, $outline, $placeholder, $undecorated, $visualTransformation, $keyboardOptions, $keyboardActions, $maxLines, $onTextLayout, $style, $textStyle, $interactionSource, $decorationBoxModifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextArea$lambda$18(TextFieldValue $value, Function1<? super TextFieldValue, Unit> $onValueChange, Modifier $modifier, boolean $enabled, boolean $readOnly, Function2<? super Composer, ? super Integer, Unit> $placeholder, boolean $undecorated, Outline $outline, VisualTransformation $visualTransformation, KeyboardOptions $keyboardOptions, KeyboardActions $keyboardActions, int $maxLines, Function1<? super TextLayoutResult, Unit> $onTextLayout, TextAreaStyle $style, TextStyle $textStyle, MutableInteractionSource $interactionSource, Modifier $decorationBoxModifier, int $$changed, int $$changed1, int $$default, Composer $composer, int $force) {
/*     */     TextArea($value, $onValueChange, $modifier, $enabled, $readOnly, $placeholder, $undecorated, $outline, $visualTransformation, $keyboardOptions, $keyboardActions, $maxLines, $onTextLayout, $style, $textStyle, $interactionSource, $decorationBoxModifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), RecomposeScopeImplKt.updateChangedFlags($$changed1), $$default);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextAreaDecorationBox_yrwZFoE$lambda$23(Function2<? super Composer, ? super Integer, Unit> $innerTextField, TextStyle $textStyle, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $placeholder, long $placeholderTextColor, Modifier $placeholderModifier, int $$changed, Composer $composer, int $force) {
/*     */     TextAreaDecorationBox-yrwZFoE($innerTextField, $textStyle, $modifier, $placeholder, $placeholderTextColor, $placeholderModifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextAreaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */