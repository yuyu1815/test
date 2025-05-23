/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.ScrollState;
/*     */ import androidx.compose.foundation.layout.BoxKt;
/*     */ import androidx.compose.foundation.layout.BoxScope;
/*     */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.PaddingValues;
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
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*     */ import androidx.compose.ui.input.pointer.PointerInputScope;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.DelayKt;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000v\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\0328\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\021\020\b\032\r\022\004\022\0020\0010\t¢\006\002\b\nH\001¢\006\002\020\013\032;\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0170\r2\b\020\020\032\004\030\0010\0212\006\020\004\032\0020\0052\006\020\022\032\0020\0232\006\020\024\032\0020\025H\003¢\006\002\020\026\0328\020\027\032\0020\0012\006\020\022\032\0020\0232\006\020\004\032\0020\0212\006\020\006\032\0020\0072\021\020\030\032\r\022\004\022\0020\0010\t¢\006\002\b\nH\003¢\006\002\020\031\032E\020\032\032\0020\0012\023\020\033\032\017\022\004\022\0020\001\030\0010\t¢\006\002\b\n2\006\020\006\032\0020\0072\006\020\020\032\0020\0212\021\020\030\032\r\022\004\022\0020\0010\t¢\006\002\b\nH\003¢\006\002\020\034\0327\020\035\032\0020\007*\0020\0072\006\020\036\032\0020\0372\006\020 \032\0020!2\022\020\"\032\016\022\004\022\0020$\022\004\022\0020\0010#H\002¢\006\004\b%\020&\032W\020'\032\0020\0012\021\020(\032\r\022\004\022\0020\0010\t¢\006\002\b\n2\006\020)\032\0020*2\006\020\006\032\0020\0072\023\020\b\032\017\022\004\022\0020\001\030\0010\t¢\006\002\b\n2\006\020+\032\0020,2\006\020-\032\0020\007H\003¢\006\004\b.\020/\"\016\0200\032\00201XT¢\006\002\n\000\"\016\0202\032\00201XT¢\006\002\n\000¨\0063²\006\n\0204\032\0020$X\002"}, d2 = {"HeightAutoSizingTextArea", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "style", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "modifier", "Landroidx/compose/ui/Modifier;", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculatePaddings", "Lkotlin/Pair;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/Dp;", "scrollbarStyle", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "TextAreaScrollableContainer", "content", "(Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableContainerImpl", "verticalScrollbar", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "withKeepVisible", "lingerDuration", "Lkotlin/time/Duration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onKeepVisibleChange", "Lkotlin/Function1;", "", "withKeepVisible-dWUq8MI", "(Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "TextAreaDecorationBox", "innerTextField", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "placeholderTextColor", "Landroidx/compose/ui/graphics/Color;", "placeholderModifier", "TextAreaDecorationBox-yrwZFoE", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "PLACEHOLDER_ID", "", "TEXT_AREA_ID", "ej-ui", "keepVisible"})
/*     */ @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,306:1\n1225#2,6:307\n1225#2,6:317\n1225#2,3:328\n1228#2,3:334\n1225#2,6:338\n1225#2,6:344\n1225#2,6:421\n149#3:313\n149#3:314\n149#3:316\n51#4:315\n481#5:323\n480#5,4:324\n484#5,2:331\n488#5:337\n480#6:333\n79#7,6:350\n86#7,4:365\n90#7,2:375\n79#7,6:385\n86#7,4:400\n90#7,2:410\n94#7:416\n94#7:420\n79#7,6:427\n86#7,4:442\n90#7,2:452\n79#7,6:461\n86#7,4:476\n90#7,2:486\n94#7:492\n79#7,6:497\n86#7,4:512\n90#7,2:522\n94#7:528\n94#7:532\n368#8,9:356\n377#8:377\n368#8,9:391\n377#8:412\n378#8,2:414\n378#8,2:418\n368#8,9:433\n377#8:454\n368#8,9:467\n377#8:488\n378#8,2:490\n368#8,9:503\n377#8:524\n378#8,2:526\n378#8,2:530\n4034#9,6:369\n4034#9,6:404\n4034#9,6:446\n4034#9,6:480\n4034#9,6:516\n71#10:378\n68#10,6:379\n74#10:413\n78#10:417\n71#10:455\n69#10,5:456\n74#10:489\n78#10:493\n71#10,3:494\n74#10:525\n78#10:529\n81#11:533\n107#11,2:534\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt\n*L\n66#1:307,6\n140#1:317,6\n141#1:328,3\n141#1:334,3\n153#1:338,6\n178#1:344,6\n279#1:421,6\n118#1:313\n125#1:314\n130#1:316\n127#1:315\n141#1:323\n141#1:324,4\n141#1:331,2\n141#1:337\n141#1:333\n169#1:350,6\n169#1:365,4\n169#1:375,2\n174#1:385,6\n174#1:400,4\n174#1:410,2\n174#1:416\n169#1:420\n255#1:427,6\n255#1:442,4\n255#1:452,2\n258#1:461,6\n258#1:476,4\n258#1:486,2\n258#1:492\n270#1:497,6\n270#1:512,4\n270#1:522,2\n270#1:528\n255#1:532\n169#1:356,9\n169#1:377\n174#1:391,9\n174#1:412\n174#1:414,2\n169#1:418,2\n255#1:433,9\n255#1:454\n258#1:467,9\n258#1:488\n258#1:490,2\n270#1:503,9\n270#1:524\n270#1:526,2\n255#1:530,2\n169#1:369,6\n174#1:404,6\n255#1:446,6\n258#1:480,6\n270#1:516,6\n174#1:378\n174#1:379,6\n174#1:413\n174#1:417\n258#1:455\n258#1:456,5\n258#1:489\n258#1:493\n270#1:494,3\n270#1:525\n270#1:529\n140#1:533\n140#1:534,2\n*E\n"})
/*     */ public final class HeightAutoSizingTextAreaKt {
/*     */   @NotNull
/*     */   private static final String PLACEHOLDER_ID = "Placeholder";
/*     */   @NotNull
/*     */   private static final String TEXT_AREA_ID = "TextField";
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
/*     */   public static final void HeightAutoSizingTextArea(@NotNull TextFieldState state, @NotNull TextAreaStyle style, @NotNull Modifier modifier, @NotNull Function2 placeholder, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'state'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'style'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'modifier'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'placeholder'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload #4
/*     */     //   26: ldc 262830054
/*     */     //   28: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   33: astore #4
/*     */     //   35: iload #5
/*     */     //   37: istore #6
/*     */     //   39: iload #5
/*     */     //   41: bipush #6
/*     */     //   43: iand
/*     */     //   44: ifne -> 68
/*     */     //   47: iload #6
/*     */     //   49: aload #4
/*     */     //   51: aload_0
/*     */     //   52: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   57: ifeq -> 64
/*     */     //   60: iconst_4
/*     */     //   61: goto -> 65
/*     */     //   64: iconst_2
/*     */     //   65: ior
/*     */     //   66: istore #6
/*     */     //   68: iload #5
/*     */     //   70: bipush #48
/*     */     //   72: iand
/*     */     //   73: ifne -> 99
/*     */     //   76: iload #6
/*     */     //   78: aload #4
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   86: ifeq -> 94
/*     */     //   89: bipush #32
/*     */     //   91: goto -> 96
/*     */     //   94: bipush #16
/*     */     //   96: ior
/*     */     //   97: istore #6
/*     */     //   99: iload #5
/*     */     //   101: sipush #384
/*     */     //   104: iand
/*     */     //   105: ifne -> 133
/*     */     //   108: iload #6
/*     */     //   110: aload #4
/*     */     //   112: aload_2
/*     */     //   113: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 127
/*     */     //   121: sipush #256
/*     */     //   124: goto -> 130
/*     */     //   127: sipush #128
/*     */     //   130: ior
/*     */     //   131: istore #6
/*     */     //   133: iload #5
/*     */     //   135: sipush #3072
/*     */     //   138: iand
/*     */     //   139: ifne -> 167
/*     */     //   142: iload #6
/*     */     //   144: aload #4
/*     */     //   146: aload_3
/*     */     //   147: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: sipush #2048
/*     */     //   158: goto -> 164
/*     */     //   161: sipush #1024
/*     */     //   164: ior
/*     */     //   165: istore #6
/*     */     //   167: iload #6
/*     */     //   169: sipush #1171
/*     */     //   172: iand
/*     */     //   173: sipush #1170
/*     */     //   176: if_icmpne -> 189
/*     */     //   179: aload #4
/*     */     //   181: invokeinterface getSkipping : ()Z
/*     */     //   186: ifne -> 434
/*     */     //   189: invokestatic isTraceInProgress : ()Z
/*     */     //   192: ifeq -> 205
/*     */     //   195: ldc 262830054
/*     */     //   197: iload #6
/*     */     //   199: iconst_m1
/*     */     //   200: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea (HeightAutoSizingTextArea.kt:61)'
/*     */     //   202: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   205: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*     */     //   208: aload #4
/*     */     //   210: bipush #6
/*     */     //   212: invokevirtual getDefaultTextStyle : (Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;
/*     */     //   215: astore #7
/*     */     //   217: iconst_0
/*     */     //   218: aload #4
/*     */     //   220: iconst_0
/*     */     //   221: iconst_1
/*     */     //   222: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*     */     //   225: astore #8
/*     */     //   227: aload #7
/*     */     //   229: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   232: lstore #9
/*     */     //   234: aload #4
/*     */     //   236: ldc -1845434112
/*     */     //   238: invokeinterface startReplaceGroup : (I)V
/*     */     //   243: aload #4
/*     */     //   245: astore #13
/*     */     //   247: aload #4
/*     */     //   249: lload #9
/*     */     //   251: invokeinterface changed : (J)Z
/*     */     //   256: istore #14
/*     */     //   258: iconst_0
/*     */     //   259: istore #15
/*     */     //   261: aload #13
/*     */     //   263: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   268: astore #16
/*     */     //   270: iconst_0
/*     */     //   271: istore #17
/*     */     //   273: iload #14
/*     */     //   275: ifne -> 289
/*     */     //   278: aload #16
/*     */     //   280: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   283: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   286: if_acmpne -> 318
/*     */     //   289: iconst_0
/*     */     //   290: istore #18
/*     */     //   292: new androidx/compose/ui/graphics/SolidColor
/*     */     //   295: dup
/*     */     //   296: lload #9
/*     */     //   298: aconst_null
/*     */     //   299: invokespecial <init> : (JLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   302: astore #19
/*     */     //   304: aload #13
/*     */     //   306: aload #19
/*     */     //   308: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   313: aload #19
/*     */     //   315: goto -> 320
/*     */     //   318: aload #16
/*     */     //   320: nop
/*     */     //   321: nop
/*     */     //   322: nop
/*     */     //   323: checkcast androidx/compose/ui/graphics/SolidColor
/*     */     //   326: astore #12
/*     */     //   328: aload #4
/*     */     //   330: invokeinterface endReplaceGroup : ()V
/*     */     //   335: aload #12
/*     */     //   337: astore #11
/*     */     //   339: new androidx/compose/foundation/text/input/TextFieldLineLimits$MultiLine
/*     */     //   342: dup
/*     */     //   343: iconst_2
/*     */     //   344: bipush #20
/*     */     //   346: invokespecial <init> : (II)V
/*     */     //   349: astore #12
/*     */     //   351: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1
/*     */     //   354: dup
/*     */     //   355: aload_1
/*     */     //   356: aload #8
/*     */     //   358: aload #7
/*     */     //   360: aload_2
/*     */     //   361: aload_0
/*     */     //   362: aload_3
/*     */     //   363: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/input/TextFieldState;Lkotlin/jvm/functions/Function2;)V
/*     */     //   366: checkcast androidx/compose/foundation/text/input/TextFieldDecorator
/*     */     //   369: astore #13
/*     */     //   371: aload_0
/*     */     //   372: aload_2
/*     */     //   373: iconst_0
/*     */     //   374: iconst_0
/*     */     //   375: aconst_null
/*     */     //   376: aload #7
/*     */     //   378: aconst_null
/*     */     //   379: aconst_null
/*     */     //   380: aload #12
/*     */     //   382: checkcast androidx/compose/foundation/text/input/TextFieldLineLimits
/*     */     //   385: aconst_null
/*     */     //   386: aconst_null
/*     */     //   387: aload #11
/*     */     //   389: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   392: aconst_null
/*     */     //   393: aload #13
/*     */     //   395: aload #8
/*     */     //   397: aload #4
/*     */     //   399: ldc 100663296
/*     */     //   401: bipush #14
/*     */     //   403: iload #6
/*     */     //   405: iand
/*     */     //   406: ior
/*     */     //   407: bipush #112
/*     */     //   409: iload #6
/*     */     //   411: iconst_3
/*     */     //   412: ishr
/*     */     //   413: iand
/*     */     //   414: ior
/*     */     //   415: iconst_0
/*     */     //   416: sipush #5852
/*     */     //   419: invokestatic BasicTextField : (Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V
/*     */     //   422: invokestatic isTraceInProgress : ()Z
/*     */     //   425: ifeq -> 441
/*     */     //   428: invokestatic traceEventEnd : ()V
/*     */     //   431: goto -> 441
/*     */     //   434: aload #4
/*     */     //   436: invokeinterface skipToGroupEnd : ()V
/*     */     //   441: aload #4
/*     */     //   443: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   448: dup
/*     */     //   449: ifnull -> 471
/*     */     //   452: aload_0
/*     */     //   453: aload_1
/*     */     //   454: aload_2
/*     */     //   455: aload_3
/*     */     //   456: iload #5
/*     */     //   458: <illegal opcode> invoke : (Landroidx/compose/foundation/text/input/TextFieldState;Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   463: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   468: goto -> 472
/*     */     //   471: pop
/*     */     //   472: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 24
/*     */     //   #63	-> 205
/*     */     //   #64	-> 222
/*     */     //   #65	-> 227
/*     */     //   #66	-> 249
/*     */     //   #307	-> 261
/*     */     //   #308	-> 273
/*     */     //   #309	-> 289
/*     */     //   #66	-> 292
/*     */     //   #309	-> 302
/*     */     //   #310	-> 304
/*     */     //   #311	-> 313
/*     */     //   #312	-> 318
/*     */     //   #308	-> 320
/*     */     //   #307	-> 321
/*     */     //   #307	-> 322
/*     */     //   #66	-> 323
/*     */     //   #74	-> 339
/*     */     //   #76	-> 351
/*     */     //   #69	-> 371
/*     */     //   #70	-> 372
/*     */     //   #71	-> 376
/*     */     //   #74	-> 380
/*     */     //   #72	-> 387
/*     */     //   #76	-> 393
/*     */     //   #73	-> 395
/*     */     //   #68	-> 419
/*     */     //   #103	-> 434
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   292	10	18	$i$a$-cache-HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$cursorBrush$1	I
/*     */     //   304	11	19	value$iv	Ljava/lang/Object;
/*     */     //   273	48	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   270	51	16	it$iv	Ljava/lang/Object;
/*     */     //   261	62	15	$i$f$cache	I
/*     */     //   258	65	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   258	65	14	invalid$iv	Z
/*     */     //   217	214	7	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   227	204	8	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   234	197	9	caretColor	J
/*     */     //   339	92	11	cursorBrush	Landroidx/compose/ui/graphics/SolidColor;
/*     */     //   39	434	6	$dirty	I
/*     */     //   0	473	0	state	Landroidx/compose/foundation/text/input/TextFieldState;
/*     */     //   0	473	1	style	Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;
/*     */     //   0	473	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	473	3	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	473	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	473	5	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\0012\021\020\002\032\r\022\004\022\0020\0010\003¢\006\002\b\004H\n"}, d2 = {"<anonymous>", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;"})
/*     */   @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,306:1\n77#2:307\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1\n*L\n82#1:307\n*E\n"})
/*     */   static final class HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1 implements TextFieldDecorator {
/*     */     HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1(TextAreaStyle $style, ScrollState $scrollState, TextStyle $textStyle, Modifier $modifier, TextFieldState $state, Function2<Composer, Integer, Unit> $placeholder) {}
/*     */     
/*     */     @Composable
/*     */     @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*  77 */     public final void Decoration(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(innerTextField, "innerTextField"); $composer.startReplaceGroup(1993299779); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1993299779, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration (HeightAutoSizingTextArea.kt:76)");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  82 */       CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalLayoutDirection(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 307 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Pair pair = HeightAutoSizingTextAreaKt.calculatePaddings(JewelThemeKt.getScrollbarStyle(JewelTheme.Companion, $composer, 6), this.$style, this.$scrollState, (LayoutDirection)object, $composer, 0); PaddingValues contentPadding = (PaddingValues)pair.component1(); float innerEndPadding = ((Dp)pair.component2()).unbox-impl(); HeightAutoSizingTextAreaKt.TextAreaDecorationBox-yrwZFoE((Function2)ComposableLambdaKt.rememberComposableLambda(98062701, true, new HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1(this.$scrollState, this.$style, innerEndPadding, contentPadding, innerTextField), $composer, 54), this.$textStyle, this.$modifier, ((this.$state.getText().length() == 0)) ? this.$placeholder : null, this.$style.getColors().getPlaceholder-0d7_KjU(), PaddingKt.padding-3ABfNKs(PaddingKt.padding((Modifier)Modifier.Companion, contentPadding), this.$style.getMetrics().getBorderWidth-D9Ej5fM()), $composer, 6); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1 implements Function2<Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(98062701, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration.<anonymous> (HeightAutoSizingTextArea.kt:86)");  HeightAutoSizingTextAreaKt.TextAreaScrollableContainer(this.$scrollState, JewelThemeKt.getScrollbarStyle(JewelTheme.Companion, $composer, 6), PaddingKt.padding-qDBjuR0$default(PaddingKt.padding-3ABfNKs((Modifier)Modifier.Companion, this.$style.getMetrics().getBorderWidth-D9Ej5fM()), 0.0F, 0.0F, this.$innerEndPadding, 0.0F, 11, null), (Function2)ComposableLambdaKt.rememberComposableLambda(-1045344641, true, new Function2<Composer, Integer, Unit>(this.$contentPadding, this.$innerTextField) { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1045344641, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextArea.<no name provided>.Decoration.<anonymous>.<anonymous> (HeightAutoSizingTextArea.kt:91)");  Modifier modifier1 = PaddingKt.padding((Modifier)Modifier.Companion, this.$contentPadding); Function2<Composer, Integer, Unit> function2 = this.$innerTextField; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/* 308 */                       Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/* 309 */                       boolean propagateMinConstraints$iv = false;
/*     */ 
/*     */                       
/* 312 */                       MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 313 */                       int $i$f$Layout = 0;
/* 314 */                       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 315 */                       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 316 */                       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 317 */                       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */                       
/* 319 */                       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 320 */                       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 321 */                       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 322 */                         .startReusableNode();
/* 323 */                       if ($composer.getInserting()) { $composer
/* 324 */                           .createNode(function0); } else { $composer
/*     */                           
/* 326 */                           .useNode(); }
/*     */                       
/* 328 */                       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 329 */                       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 330 */                       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */                       
/* 332 */                       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 333 */                       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 334 */                       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 335 */                         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 336 */                         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */                       } 
/*     */                       
/* 339 */                       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */                       
/* 341 */                       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/* 342 */                       ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1$1$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 343 */                       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 344 */                       ComposerKt.sourceInformationMarkerEnd($composer);
/* 345 */                       ComposerKt.sourceInformationMarkerEnd($composer);
/* 346 */                       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();
/*     */                        }
/*     */                     else
/*     */                     { $composer.skipToGroupEnd(); }
/*     */                      }
/*     */                    }
/*     */                 $composer, 54), $composer, 3072);
/*     */           if (ComposerKt.isTraceInProgress()) {
/*     */             ComposerKt.traceEventEnd();
/*     */           } }
/*     */         else
/*     */         { $composer.skipToGroupEnd(); }
/*     */          }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       HeightAutoSizingTextAreaKt$HeightAutoSizingTextArea$1$Decoration$1(ScrollState $scrollState, TextAreaStyle $style, float $innerEndPadding, PaddingValues $contentPadding, Function2<Composer, Integer, Unit> $innerTextField) {} }
/*     */   
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   private static final Pair<PaddingValues, Dp> calculatePaddings(ScrollbarStyle scrollbarStyle, TextAreaStyle style, ScrollState scrollState, LayoutDirection layoutDirection, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(908779598);
/*     */     if (ComposerKt.isTraceInProgress()) {
/*     */       ComposerKt.traceEventStart(908779598, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.calculatePaddings (HeightAutoSizingTextArea.kt:111)");
/*     */     }
/*     */     PaddingValues $this$calculatePaddings_u24lambda_u242 = style.getMetrics().getContentPadding();
/*     */     int $i$a$-with-HeightAutoSizingTextAreaKt$calculatePaddings$1 = 0;
/*     */     int i = 0, j = 0;
/*     */     PaddingValues paddingValues = PaddingKt.PaddingValues-a9UjIt4(PaddingKt.calculateStartPadding($this$calculatePaddings_u24lambda_u242, layoutDirection), $this$calculatePaddings_u24lambda_u242.calculateTopPadding-D9Ej5fM(), Dp.constructor-impl(i), $this$calculatePaddings_u24lambda_u242.calculateBottomPadding-D9Ej5fM());
/*     */     $composer.startReplaceGroup(458988339);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*     */   private static final void TextAreaScrollableContainer(ScrollState scrollState, ScrollbarStyle style, Modifier modifier, Function2 content, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w 336993240
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #4
/*     */     //   12: iload #5
/*     */     //   14: istore #6
/*     */     //   16: iload #5
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #6
/*     */     //   26: aload #4
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #6
/*     */     //   45: iload #5
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #6
/*     */     //   55: aload #4
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #6
/*     */     //   76: iload #5
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #6
/*     */     //   87: aload #4
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #6
/*     */     //   110: iload #5
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #6
/*     */     //   121: aload #4
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #6
/*     */     //   144: iload #6
/*     */     //   146: sipush #1171
/*     */     //   149: iand
/*     */     //   150: sipush #1170
/*     */     //   153: if_icmpne -> 166
/*     */     //   156: aload #4
/*     */     //   158: invokeinterface getSkipping : ()Z
/*     */     //   163: ifne -> 630
/*     */     //   166: invokestatic isTraceInProgress : ()Z
/*     */     //   169: ifeq -> 184
/*     */     //   172: ldc_w 336993240
/*     */     //   175: iload #6
/*     */     //   177: iconst_m1
/*     */     //   178: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextAreaScrollableContainer (HeightAutoSizingTextArea.kt:138)'
/*     */     //   181: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   184: aload #4
/*     */     //   186: ldc_w 1338787167
/*     */     //   189: invokeinterface startReplaceGroup : (I)V
/*     */     //   194: aload #4
/*     */     //   196: astore #9
/*     */     //   198: iconst_0
/*     */     //   199: istore #10
/*     */     //   201: nop
/*     */     //   202: iconst_0
/*     */     //   203: istore #11
/*     */     //   205: aload #9
/*     */     //   207: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   212: astore #12
/*     */     //   214: iconst_0
/*     */     //   215: istore #13
/*     */     //   217: aload #12
/*     */     //   219: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   222: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   225: if_acmpne -> 257
/*     */     //   228: iconst_0
/*     */     //   229: istore #14
/*     */     //   231: iconst_0
/*     */     //   232: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   235: aconst_null
/*     */     //   236: iconst_2
/*     */     //   237: aconst_null
/*     */     //   238: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   241: astore #14
/*     */     //   243: aload #9
/*     */     //   245: aload #14
/*     */     //   247: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   252: aload #14
/*     */     //   254: goto -> 259
/*     */     //   257: aload #12
/*     */     //   259: nop
/*     */     //   260: nop
/*     */     //   261: nop
/*     */     //   262: checkcast androidx/compose/runtime/MutableState
/*     */     //   265: astore #8
/*     */     //   267: aload #4
/*     */     //   269: invokeinterface endReplaceGroup : ()V
/*     */     //   274: aload #8
/*     */     //   276: astore #7
/*     */     //   278: iconst_0
/*     */     //   279: istore #10
/*     */     //   281: nop
/*     */     //   282: iconst_0
/*     */     //   283: istore #11
/*     */     //   285: aload #4
/*     */     //   287: ldc_w 773894976
/*     */     //   290: ldc_w 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*     */     //   293: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   296: aload #4
/*     */     //   298: astore #12
/*     */     //   300: aload #4
/*     */     //   302: ldc_w -954370320
/*     */     //   305: ldc_w 'CC(remember):Effects.kt#9igjgp'
/*     */     //   308: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   311: aload #4
/*     */     //   313: astore #13
/*     */     //   315: iconst_0
/*     */     //   316: istore #14
/*     */     //   318: iconst_0
/*     */     //   319: istore #15
/*     */     //   321: aload #13
/*     */     //   323: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   328: astore #16
/*     */     //   330: iconst_0
/*     */     //   331: istore #17
/*     */     //   333: aload #16
/*     */     //   335: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   338: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   341: if_acmpne -> 388
/*     */     //   344: iconst_0
/*     */     //   345: istore #18
/*     */     //   347: iconst_0
/*     */     //   348: istore #19
/*     */     //   350: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*     */     //   353: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   356: aload #12
/*     */     //   358: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   361: astore #28
/*     */     //   363: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   366: dup
/*     */     //   367: aload #28
/*     */     //   369: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   372: astore #19
/*     */     //   374: aload #13
/*     */     //   376: aload #19
/*     */     //   378: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   383: aload #19
/*     */     //   385: goto -> 390
/*     */     //   388: aload #16
/*     */     //   390: nop
/*     */     //   391: nop
/*     */     //   392: nop
/*     */     //   393: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*     */     //   396: astore #20
/*     */     //   398: aload #4
/*     */     //   400: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   403: aload #20
/*     */     //   405: astore #21
/*     */     //   407: aload #21
/*     */     //   409: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*     */     //   412: astore #20
/*     */     //   414: aload #4
/*     */     //   416: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   419: aload #20
/*     */     //   421: nop
/*     */     //   422: astore #8
/*     */     //   424: ldc_w -801367353
/*     */     //   427: iconst_1
/*     */     //   428: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$1
/*     */     //   431: dup
/*     */     //   432: aload_0
/*     */     //   433: aload_1
/*     */     //   434: aload #7
/*     */     //   436: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*     */     //   439: aload #4
/*     */     //   441: bipush #54
/*     */     //   443: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   446: checkcast kotlin/jvm/functions/Function2
/*     */     //   449: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   452: checkcast androidx/compose/ui/Modifier
/*     */     //   455: aload_1
/*     */     //   456: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */     //   459: invokeinterface getLingerDuration-UwyO8pc : ()J
/*     */     //   464: aload #8
/*     */     //   466: aload #4
/*     */     //   468: ldc_w 1338800703
/*     */     //   471: invokeinterface startReplaceGroup : (I)V
/*     */     //   476: aload #4
/*     */     //   478: astore #10
/*     */     //   480: iconst_0
/*     */     //   481: istore #11
/*     */     //   483: iconst_0
/*     */     //   484: istore #12
/*     */     //   486: aload #10
/*     */     //   488: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   493: astore #13
/*     */     //   495: iconst_0
/*     */     //   496: istore #14
/*     */     //   498: aload #13
/*     */     //   500: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   503: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   506: if_acmpne -> 555
/*     */     //   509: astore #26
/*     */     //   511: lstore #24
/*     */     //   513: astore #23
/*     */     //   515: astore #22
/*     */     //   517: iconst_0
/*     */     //   518: istore #15
/*     */     //   520: aload #7
/*     */     //   522: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*     */     //   527: astore #27
/*     */     //   529: aload #22
/*     */     //   531: aload #23
/*     */     //   533: lload #24
/*     */     //   535: aload #26
/*     */     //   537: aload #27
/*     */     //   539: astore #16
/*     */     //   541: aload #10
/*     */     //   543: aload #16
/*     */     //   545: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   550: aload #16
/*     */     //   552: goto -> 557
/*     */     //   555: aload #13
/*     */     //   557: nop
/*     */     //   558: nop
/*     */     //   559: nop
/*     */     //   560: checkcast kotlin/jvm/functions/Function1
/*     */     //   563: astore #9
/*     */     //   565: aload #4
/*     */     //   567: invokeinterface endReplaceGroup : ()V
/*     */     //   572: aload #9
/*     */     //   574: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   577: aload_1
/*     */     //   578: ldc_w 35617892
/*     */     //   581: iconst_1
/*     */     //   582: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3
/*     */     //   585: dup
/*     */     //   586: aload_2
/*     */     //   587: aload_3
/*     */     //   588: invokespecial <init> : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)V
/*     */     //   591: aload #4
/*     */     //   593: bipush #54
/*     */     //   595: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*     */     //   598: checkcast kotlin/jvm/functions/Function2
/*     */     //   601: aload #4
/*     */     //   603: sipush #3078
/*     */     //   606: sipush #896
/*     */     //   609: iload #6
/*     */     //   611: iconst_3
/*     */     //   612: ishl
/*     */     //   613: iand
/*     */     //   614: ior
/*     */     //   615: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   618: invokestatic isTraceInProgress : ()Z
/*     */     //   621: ifeq -> 637
/*     */     //   624: invokestatic traceEventEnd : ()V
/*     */     //   627: goto -> 637
/*     */     //   630: aload #4
/*     */     //   632: invokeinterface skipToGroupEnd : ()V
/*     */     //   637: aload #4
/*     */     //   639: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   644: dup
/*     */     //   645: ifnull -> 667
/*     */     //   648: aload_0
/*     */     //   649: aload_1
/*     */     //   650: aload_2
/*     */     //   651: aload_3
/*     */     //   652: iload #5
/*     */     //   654: <illegal opcode> invoke : (Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   659: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   664: goto -> 668
/*     */     //   667: pop
/*     */     //   668: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 0
/*     */     //   #140	-> 201
/*     */     //   #317	-> 205
/*     */     //   #318	-> 217
/*     */     //   #319	-> 228
/*     */     //   #140	-> 231
/*     */     //   #319	-> 241
/*     */     //   #320	-> 243
/*     */     //   #321	-> 252
/*     */     //   #322	-> 257
/*     */     //   #318	-> 259
/*     */     //   #317	-> 260
/*     */     //   #317	-> 261
/*     */     //   #140	-> 262
/*     */     //   #141	-> 281
/*     */     //   #323	-> 293
/*     */     //   #324	-> 296
/*     */     //   #326	-> 298
/*     */     //   #327	-> 308
/*     */     //   #328	-> 321
/*     */     //   #329	-> 333
/*     */     //   #330	-> 344
/*     */     //   #331	-> 347
/*     */     //   #332	-> 347
/*     */     //   #333	-> 350
/*     */     //   #332	-> 353
/*     */     //   #331	-> 361
/*     */     //   #330	-> 372
/*     */     //   #334	-> 374
/*     */     //   #335	-> 383
/*     */     //   #336	-> 388
/*     */     //   #329	-> 390
/*     */     //   #328	-> 391
/*     */     //   #328	-> 392
/*     */     //   #327	-> 393
/*     */     //   #337	-> 407
/*     */     //   #323	-> 416
/*     */     //   #337	-> 421
/*     */     //   #141	-> 422
/*     */     //   #144	-> 424
/*     */     //   #153	-> 449
/*     */     //   #338	-> 486
/*     */     //   #339	-> 498
/*     */     //   #340	-> 509
/*     */     //   #153	-> 520
/*     */     //   #340	-> 539
/*     */     //   #341	-> 541
/*     */     //   #342	-> 550
/*     */     //   #343	-> 555
/*     */     //   #339	-> 557
/*     */     //   #338	-> 558
/*     */     //   #338	-> 559
/*     */     //   #153	-> 560
/*     */     //   #156	-> 577
/*     */     //   #157	-> 578
/*     */     //   #143	-> 615
/*     */     //   #160	-> 630
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   231	10	14	$i$a$-cache-HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$keepVisible$2	I
/*     */     //   243	11	14	value$iv	Ljava/lang/Object;
/*     */     //   217	43	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   214	46	12	it$iv	Ljava/lang/Object;
/*     */     //   205	57	11	$i$f$cache	I
/*     */     //   202	60	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   202	60	10	invalid$iv	Z
/*     */     //   350	3	19	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*     */     //   347	25	18	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*     */     //   374	11	19	value$iv$iv	Ljava/lang/Object;
/*     */     //   333	58	17	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*     */     //   330	61	16	it$iv$iv	Ljava/lang/Object;
/*     */     //   321	72	15	$i$f$cache	I
/*     */     //   318	75	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   318	75	14	invalid$iv$iv	Z
/*     */     //   285	137	11	$i$f$rememberCoroutineScope	I
/*     */     //   300	122	12	composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   407	15	21	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*     */     //   282	140	10	$changed$iv	I
/*     */     //   520	7	15	$i$a$-cache-HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$2	I
/*     */     //   541	11	16	value$iv	Ljava/lang/Object;
/*     */     //   498	60	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   495	63	13	it$iv	Ljava/lang/Object;
/*     */     //   486	74	12	$i$f$cache	I
/*     */     //   483	77	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   483	77	11	invalid$iv	Z
/*     */     //   278	349	7	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   424	203	8	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   16	653	6	$dirty	I
/*     */     //   0	669	0	scrollState	Landroidx/compose/foundation/ScrollState;
/*     */     //   0	669	1	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	669	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	669	3	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	669	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	669	5	$changed	I
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean TextAreaScrollableContainer$lambda$4(MutableState $keepVisible$delegate) {
/*     */     State state = (State)$keepVisible$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 533 */     return ((Boolean)state.getValue()).booleanValue(); } private static final void TextAreaScrollableContainer$lambda$5(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 534 */     mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n149#2:307\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$1\n*L\n148#1:307\n*E\n"})
/*     */   static final class HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$1 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(-801367353, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.TextAreaScrollableContainer.<anonymous> (HeightAutoSizingTextArea.kt:144)"); 
/*     */         int $this$dp$iv = 1, $i$f$getDp = 0;
/*     */         Modifier modifier = PaddingKt.padding-3ABfNKs(PointerIconKt.pointerHoverIcon$default((Modifier)Modifier.Companion, PointerIcon.Companion.getDefault(), false, 2, null), Dp.constructor-impl($this$dp$iv));
/*     */         boolean bool = HeightAutoSizingTextAreaKt.TextAreaScrollableContainer$lambda$4(this.$keepVisible$delegate);
/*     */         ScrollbarKt.VerticalScrollbar((ScrollableState)this.$scrollState, modifier, false, false, null, this.$style, bool, $composer, 0, 28);
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventEnd(); 
/*     */       } else {
/*     */         $composer.skipToGroupEnd();
/*     */       } 
/*     */     }
/*     */     
/*     */     HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$1(ScrollState $scrollState, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {}
/*     */   }
/*     */   
/*     */   private static final Unit TextAreaScrollableContainer$lambda$7$lambda$6(MutableState<Boolean> $keepVisible$delegate, boolean it) {
/*     */     TextAreaScrollableContainer$lambda$5($keepVisible$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,306:1\n71#2:307\n68#2,6:308\n74#2:342\n78#2:346\n79#3,6:314\n86#3,4:329\n90#3,2:339\n94#3:345\n368#4,9:320\n377#4:341\n378#4,2:343\n4034#5,6:333\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3\n*L\n158#1:307\n158#1:308,6\n158#1:342\n158#1:346\n158#1:314,6\n158#1:329,4\n158#1:339,2\n158#1:345\n158#1:320,9\n158#1:341\n158#1:343,2\n158#1:333,6\n*E\n"})
/*     */   static final class HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3 implements Function2<Composer, Integer, Unit> {
/*     */     @Composable
/*     */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */     public final void invoke(Composer $composer, int $changed) {
/*     */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */         if (ComposerKt.isTraceInProgress())
/*     */           ComposerKt.traceEventStart(35617892, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.TextAreaScrollableContainer.<anonymous> (HeightAutoSizingTextArea.kt:157)"); 
/*     */         Modifier modifier1 = LayoutIdKt.layoutId(this.$modifier, "ID_CONTENT");
/*     */         Function2<Composer, Integer, Unit> function2 = this.$content;
/*     */         int $changed$iv = 0, $i$f$Box = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*     */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*     */         boolean propagateMinConstraints$iv = false;
/*     */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
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
/*     */         int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*     */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*     */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*     */         Composer composer1 = $composer$iv;
/*     */         BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*     */         int $i$a$-Box-HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3$1 = 0;
/*     */         function2.invoke(composer1, Integer.valueOf(0));
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
/*     */     HeightAutoSizingTextAreaKt$TextAreaScrollableContainer$3(Modifier $modifier, Function2<Composer, Integer, Unit> $content) {}
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   private static final void ScrollableContainerImpl(Function2 verticalScrollbar, Modifier modifier, ScrollbarStyle scrollbarStyle, Function2 content, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: ldc_w -1714140287
/*     */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   10: astore #4
/*     */     //   12: iload #5
/*     */     //   14: istore #6
/*     */     //   16: iload #5
/*     */     //   18: bipush #6
/*     */     //   20: iand
/*     */     //   21: ifne -> 45
/*     */     //   24: iload #6
/*     */     //   26: aload #4
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore #6
/*     */     //   45: iload #5
/*     */     //   47: bipush #48
/*     */     //   49: iand
/*     */     //   50: ifne -> 76
/*     */     //   53: iload #6
/*     */     //   55: aload #4
/*     */     //   57: aload_1
/*     */     //   58: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   63: ifeq -> 71
/*     */     //   66: bipush #32
/*     */     //   68: goto -> 73
/*     */     //   71: bipush #16
/*     */     //   73: ior
/*     */     //   74: istore #6
/*     */     //   76: iload #5
/*     */     //   78: sipush #384
/*     */     //   81: iand
/*     */     //   82: ifne -> 110
/*     */     //   85: iload #6
/*     */     //   87: aload #4
/*     */     //   89: aload_2
/*     */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 104
/*     */     //   98: sipush #256
/*     */     //   101: goto -> 107
/*     */     //   104: sipush #128
/*     */     //   107: ior
/*     */     //   108: istore #6
/*     */     //   110: iload #5
/*     */     //   112: sipush #3072
/*     */     //   115: iand
/*     */     //   116: ifne -> 144
/*     */     //   119: iload #6
/*     */     //   121: aload #4
/*     */     //   123: aload_3
/*     */     //   124: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   129: ifeq -> 138
/*     */     //   132: sipush #2048
/*     */     //   135: goto -> 141
/*     */     //   138: sipush #1024
/*     */     //   141: ior
/*     */     //   142: istore #6
/*     */     //   144: iload #6
/*     */     //   146: sipush #1171
/*     */     //   149: iand
/*     */     //   150: sipush #1170
/*     */     //   153: if_icmpne -> 166
/*     */     //   156: aload #4
/*     */     //   158: invokeinterface getSkipping : ()Z
/*     */     //   163: ifne -> 1072
/*     */     //   166: invokestatic isTraceInProgress : ()Z
/*     */     //   169: ifeq -> 184
/*     */     //   172: ldc_w -1714140287
/*     */     //   175: iload #6
/*     */     //   177: iconst_m1
/*     */     //   178: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.ScrollableContainerImpl (HeightAutoSizingTextArea.kt:167)'
/*     */     //   181: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   184: aload #4
/*     */     //   186: ldc_w 1679966316
/*     */     //   189: invokeinterface startReplaceGroup : (I)V
/*     */     //   194: aload #4
/*     */     //   196: astore #8
/*     */     //   198: iload #6
/*     */     //   200: sipush #896
/*     */     //   203: iand
/*     */     //   204: sipush #256
/*     */     //   207: if_icmpne -> 214
/*     */     //   210: iconst_1
/*     */     //   211: goto -> 215
/*     */     //   214: iconst_0
/*     */     //   215: istore #9
/*     */     //   217: nop
/*     */     //   218: iconst_0
/*     */     //   219: istore #10
/*     */     //   221: aload #8
/*     */     //   223: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   228: astore #11
/*     */     //   230: iconst_0
/*     */     //   231: istore #12
/*     */     //   233: iload #9
/*     */     //   235: ifne -> 249
/*     */     //   238: aload #11
/*     */     //   240: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   243: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   246: if_acmpne -> 279
/*     */     //   249: iconst_0
/*     */     //   250: istore #13
/*     */     //   252: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1
/*     */     //   255: dup
/*     */     //   256: aload_2
/*     */     //   257: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;)V
/*     */     //   260: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   263: astore #14
/*     */     //   265: aload #8
/*     */     //   267: aload #14
/*     */     //   269: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   274: aload #14
/*     */     //   276: goto -> 281
/*     */     //   279: aload #11
/*     */     //   281: nop
/*     */     //   282: nop
/*     */     //   283: nop
/*     */     //   284: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   287: astore #7
/*     */     //   289: aload #4
/*     */     //   291: invokeinterface endReplaceGroup : ()V
/*     */     //   296: aload #7
/*     */     //   298: astore #7
/*     */     //   300: bipush #112
/*     */     //   302: iload #6
/*     */     //   304: iand
/*     */     //   305: istore #8
/*     */     //   307: nop
/*     */     //   308: iconst_0
/*     */     //   309: istore #9
/*     */     //   311: aload #4
/*     */     //   313: ldc_w -1323940314
/*     */     //   316: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   319: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   322: aload #4
/*     */     //   324: iconst_0
/*     */     //   325: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   328: istore #10
/*     */     //   330: aload #4
/*     */     //   332: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   337: astore #11
/*     */     //   339: aload #4
/*     */     //   341: aload_1
/*     */     //   342: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   345: astore #12
/*     */     //   347: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   350: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   353: astore #13
/*     */     //   355: bipush #6
/*     */     //   357: sipush #896
/*     */     //   360: iload #8
/*     */     //   362: bipush #6
/*     */     //   364: ishl
/*     */     //   365: iand
/*     */     //   366: ior
/*     */     //   367: istore #14
/*     */     //   369: nop
/*     */     //   370: iconst_0
/*     */     //   371: istore #15
/*     */     //   373: aload #4
/*     */     //   375: ldc_w -692256719
/*     */     //   378: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   381: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   384: aload #4
/*     */     //   386: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   391: instanceof androidx/compose/runtime/Applier
/*     */     //   394: ifne -> 400
/*     */     //   397: invokestatic invalidApplier : ()V
/*     */     //   400: aload #4
/*     */     //   402: invokeinterface startReusableNode : ()V
/*     */     //   407: aload #4
/*     */     //   409: invokeinterface getInserting : ()Z
/*     */     //   414: ifeq -> 429
/*     */     //   417: aload #4
/*     */     //   419: aload #13
/*     */     //   421: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   426: goto -> 436
/*     */     //   429: aload #4
/*     */     //   431: invokeinterface useNode : ()V
/*     */     //   436: aload #4
/*     */     //   438: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   441: astore #16
/*     */     //   443: iconst_0
/*     */     //   444: istore #17
/*     */     //   446: aload #16
/*     */     //   448: aload #7
/*     */     //   450: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   453: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   456: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   459: aload #16
/*     */     //   461: aload #11
/*     */     //   463: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   466: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   469: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   472: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   475: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   478: astore #18
/*     */     //   480: iconst_0
/*     */     //   481: istore #19
/*     */     //   483: aload #16
/*     */     //   485: astore #20
/*     */     //   487: iconst_0
/*     */     //   488: istore #21
/*     */     //   490: aload #20
/*     */     //   492: invokeinterface getInserting : ()Z
/*     */     //   497: ifne -> 518
/*     */     //   500: aload #20
/*     */     //   502: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   507: iload #10
/*     */     //   509: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   512: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   515: ifne -> 544
/*     */     //   518: aload #20
/*     */     //   520: iload #10
/*     */     //   522: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   525: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   530: aload #16
/*     */     //   532: iload #10
/*     */     //   534: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   537: aload #18
/*     */     //   539: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   544: nop
/*     */     //   545: nop
/*     */     //   546: nop
/*     */     //   547: aload #16
/*     */     //   549: aload #12
/*     */     //   551: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   554: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   557: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   560: nop
/*     */     //   561: nop
/*     */     //   562: aload #4
/*     */     //   564: bipush #14
/*     */     //   566: iload #14
/*     */     //   568: bipush #6
/*     */     //   570: ishr
/*     */     //   571: iand
/*     */     //   572: istore #22
/*     */     //   574: astore #23
/*     */     //   576: iconst_0
/*     */     //   577: istore #24
/*     */     //   579: aload_3
/*     */     //   580: aload #23
/*     */     //   582: bipush #14
/*     */     //   584: iload #6
/*     */     //   586: bipush #9
/*     */     //   588: ishr
/*     */     //   589: iand
/*     */     //   590: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   593: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   598: pop
/*     */     //   599: aload #23
/*     */     //   601: ldc_w 661884846
/*     */     //   604: invokeinterface startReplaceGroup : (I)V
/*     */     //   609: aload_0
/*     */     //   610: ifnull -> 1033
/*     */     //   613: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   616: checkcast androidx/compose/ui/Modifier
/*     */     //   619: ldc_w 'ID_VERTICAL_SCROLLBAR'
/*     */     //   622: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   625: astore #25
/*     */     //   627: bipush #6
/*     */     //   629: istore #26
/*     */     //   631: iconst_0
/*     */     //   632: istore #27
/*     */     //   634: aload #23
/*     */     //   636: ldc_w 733328855
/*     */     //   639: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   642: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   645: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   648: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   651: astore #28
/*     */     //   653: iconst_0
/*     */     //   654: istore #29
/*     */     //   656: aload #28
/*     */     //   658: iload #29
/*     */     //   660: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   663: astore #30
/*     */     //   665: bipush #112
/*     */     //   667: iload #26
/*     */     //   669: iconst_3
/*     */     //   670: ishl
/*     */     //   671: iand
/*     */     //   672: istore #31
/*     */     //   674: nop
/*     */     //   675: iconst_0
/*     */     //   676: istore #32
/*     */     //   678: aload #23
/*     */     //   680: ldc_w -1323940314
/*     */     //   683: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   686: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   689: aload #23
/*     */     //   691: iconst_0
/*     */     //   692: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   695: istore #33
/*     */     //   697: aload #23
/*     */     //   699: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   704: astore #34
/*     */     //   706: aload #23
/*     */     //   708: aload #25
/*     */     //   710: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   713: astore #35
/*     */     //   715: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   718: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   721: astore #36
/*     */     //   723: bipush #6
/*     */     //   725: sipush #896
/*     */     //   728: iload #31
/*     */     //   730: bipush #6
/*     */     //   732: ishl
/*     */     //   733: iand
/*     */     //   734: ior
/*     */     //   735: istore #37
/*     */     //   737: nop
/*     */     //   738: iconst_0
/*     */     //   739: istore #38
/*     */     //   741: aload #23
/*     */     //   743: ldc_w -692256719
/*     */     //   746: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   749: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   752: aload #23
/*     */     //   754: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   759: instanceof androidx/compose/runtime/Applier
/*     */     //   762: ifne -> 768
/*     */     //   765: invokestatic invalidApplier : ()V
/*     */     //   768: aload #23
/*     */     //   770: invokeinterface startReusableNode : ()V
/*     */     //   775: aload #23
/*     */     //   777: invokeinterface getInserting : ()Z
/*     */     //   782: ifeq -> 797
/*     */     //   785: aload #23
/*     */     //   787: aload #36
/*     */     //   789: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   794: goto -> 804
/*     */     //   797: aload #23
/*     */     //   799: invokeinterface useNode : ()V
/*     */     //   804: aload #23
/*     */     //   806: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   809: astore #39
/*     */     //   811: iconst_0
/*     */     //   812: istore #40
/*     */     //   814: aload #39
/*     */     //   816: aload #30
/*     */     //   818: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   821: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   824: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   827: aload #39
/*     */     //   829: aload #34
/*     */     //   831: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   834: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   837: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   840: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   843: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   846: astore #41
/*     */     //   848: iconst_0
/*     */     //   849: istore #42
/*     */     //   851: aload #39
/*     */     //   853: astore #43
/*     */     //   855: iconst_0
/*     */     //   856: istore #44
/*     */     //   858: aload #43
/*     */     //   860: invokeinterface getInserting : ()Z
/*     */     //   865: ifne -> 886
/*     */     //   868: aload #43
/*     */     //   870: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   875: iload #33
/*     */     //   877: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   880: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   883: ifne -> 912
/*     */     //   886: aload #43
/*     */     //   888: iload #33
/*     */     //   890: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   893: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   898: aload #39
/*     */     //   900: iload #33
/*     */     //   902: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   905: aload #41
/*     */     //   907: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   912: nop
/*     */     //   913: nop
/*     */     //   914: nop
/*     */     //   915: aload #39
/*     */     //   917: aload #35
/*     */     //   919: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   922: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   925: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   928: nop
/*     */     //   929: nop
/*     */     //   930: aload #23
/*     */     //   932: bipush #14
/*     */     //   934: iload #37
/*     */     //   936: bipush #6
/*     */     //   938: ishr
/*     */     //   939: iand
/*     */     //   940: istore #45
/*     */     //   942: astore #46
/*     */     //   944: iconst_0
/*     */     //   945: istore #47
/*     */     //   947: aload #46
/*     */     //   949: ldc_w -2146769399
/*     */     //   952: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   955: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   958: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   961: aload #46
/*     */     //   963: bipush #6
/*     */     //   965: bipush #112
/*     */     //   967: iload #26
/*     */     //   969: bipush #6
/*     */     //   971: ishr
/*     */     //   972: iand
/*     */     //   973: ior
/*     */     //   974: istore #48
/*     */     //   976: astore #49
/*     */     //   978: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   981: astore #50
/*     */     //   983: iconst_0
/*     */     //   984: istore #51
/*     */     //   986: aload_0
/*     */     //   987: aload #49
/*     */     //   989: bipush #14
/*     */     //   991: iload #6
/*     */     //   993: iand
/*     */     //   994: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   997: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1002: pop
/*     */     //   1003: aload #46
/*     */     //   1005: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1008: aload #23
/*     */     //   1010: invokeinterface endNode : ()V
/*     */     //   1015: aload #23
/*     */     //   1017: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1020: nop
/*     */     //   1021: aload #23
/*     */     //   1023: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1026: nop
/*     */     //   1027: aload #23
/*     */     //   1029: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1032: nop
/*     */     //   1033: aload #23
/*     */     //   1035: invokeinterface endReplaceGroup : ()V
/*     */     //   1040: nop
/*     */     //   1041: aload #4
/*     */     //   1043: invokeinterface endNode : ()V
/*     */     //   1048: aload #4
/*     */     //   1050: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1053: nop
/*     */     //   1054: aload #4
/*     */     //   1056: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1059: nop
/*     */     //   1060: invokestatic isTraceInProgress : ()Z
/*     */     //   1063: ifeq -> 1079
/*     */     //   1066: invokestatic traceEventEnd : ()V
/*     */     //   1069: goto -> 1079
/*     */     //   1072: aload #4
/*     */     //   1074: invokeinterface skipToGroupEnd : ()V
/*     */     //   1079: aload #4
/*     */     //   1081: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1086: dup
/*     */     //   1087: ifnull -> 1109
/*     */     //   1090: aload_0
/*     */     //   1091: aload_1
/*     */     //   1092: aload_2
/*     */     //   1093: aload_3
/*     */     //   1094: iload #5
/*     */     //   1096: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1101: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1106: goto -> 1110
/*     */     //   1109: pop
/*     */     //   1110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #168	-> 0
/*     */     //   #178	-> 217
/*     */     //   #344	-> 221
/*     */     //   #345	-> 233
/*     */     //   #346	-> 249
/*     */     //   #178	-> 252
/*     */     //   #346	-> 263
/*     */     //   #347	-> 265
/*     */     //   #348	-> 274
/*     */     //   #349	-> 279
/*     */     //   #345	-> 281
/*     */     //   #344	-> 282
/*     */     //   #344	-> 283
/*     */     //   #178	-> 284
/*     */     //   #169	-> 307
/*     */     //   #350	-> 319
/*     */     //   #351	-> 325
/*     */     //   #352	-> 332
/*     */     //   #353	-> 341
/*     */     //   #355	-> 347
/*     */     //   #354	-> 369
/*     */     //   #356	-> 381
/*     */     //   #357	-> 384
/*     */     //   #358	-> 402
/*     */     //   #359	-> 407
/*     */     //   #360	-> 419
/*     */     //   #362	-> 431
/*     */     //   #364	-> 436
/*     */     //   #365	-> 446
/*     */     //   #366	-> 459
/*     */     //   #368	-> 472
/*     */     //   #369	-> 483
/*     */     //   #370	-> 490
/*     */     //   #371	-> 518
/*     */     //   #372	-> 530
/*     */     //   #374	-> 544
/*     */     //   #369	-> 545
/*     */     //   #374	-> 546
/*     */     //   #375	-> 547
/*     */     //   #376	-> 560
/*     */     //   #364	-> 561
/*     */     //   #377	-> 562
/*     */     //   #171	-> 579
/*     */     //   #173	-> 609
/*     */     //   #174	-> 613
/*     */     //   #378	-> 642
/*     */     //   #379	-> 645
/*     */     //   #380	-> 653
/*     */     //   #383	-> 656
/*     */     //   #384	-> 674
/*     */     //   #385	-> 686
/*     */     //   #386	-> 692
/*     */     //   #387	-> 699
/*     */     //   #388	-> 708
/*     */     //   #390	-> 715
/*     */     //   #389	-> 737
/*     */     //   #391	-> 749
/*     */     //   #392	-> 752
/*     */     //   #393	-> 770
/*     */     //   #394	-> 775
/*     */     //   #395	-> 787
/*     */     //   #397	-> 799
/*     */     //   #399	-> 804
/*     */     //   #400	-> 814
/*     */     //   #401	-> 827
/*     */     //   #403	-> 840
/*     */     //   #404	-> 851
/*     */     //   #405	-> 858
/*     */     //   #406	-> 886
/*     */     //   #407	-> 898
/*     */     //   #409	-> 912
/*     */     //   #404	-> 913
/*     */     //   #409	-> 914
/*     */     //   #410	-> 915
/*     */     //   #411	-> 928
/*     */     //   #399	-> 929
/*     */     //   #412	-> 930
/*     */     //   #413	-> 955
/*     */     //   #174	-> 986
/*     */     //   #413	-> 1003
/*     */     //   #412	-> 1008
/*     */     //   #414	-> 1010
/*     */     //   #391	-> 1017
/*     */     //   #415	-> 1020
/*     */     //   #385	-> 1023
/*     */     //   #416	-> 1026
/*     */     //   #378	-> 1029
/*     */     //   #417	-> 1032
/*     */     //   #176	-> 1040
/*     */     //   #377	-> 1041
/*     */     //   #418	-> 1043
/*     */     //   #356	-> 1050
/*     */     //   #419	-> 1053
/*     */     //   #350	-> 1056
/*     */     //   #420	-> 1059
/*     */     //   #223	-> 1072
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   252	11	13	$i$a$-cache-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2	I
/*     */     //   265	11	14	value$iv	Ljava/lang/Object;
/*     */     //   233	49	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   230	52	11	it$iv	Ljava/lang/Object;
/*     */     //   221	63	10	$i$f$cache	I
/*     */     //   218	66	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   218	66	9	invalid$iv	Z
/*     */     //   986	17	51	$i$a$-Box-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$1$1	I
/*     */     //   983	20	50	$this$ScrollableContainerImpl_u24lambda_u2410_u24lambda_u249	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   983	20	49	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   983	20	48	$changed	I
/*     */     //   947	61	47	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   944	64	46	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   944	64	45	$changed$iv	I
/*     */     //   858	55	44	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   855	58	43	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   851	64	42	$i$f$set-impl	I
/*     */     //   848	67	41	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   814	115	40	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   811	118	39	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   741	280	38	$i$f$ReusableComposeNode	I
/*     */     //   738	283	36	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   738	283	37	$changed$iv$iv$iv	I
/*     */     //   678	349	32	$i$f$Layout	I
/*     */     //   697	330	33	compositeKeyHash$iv$iv	I
/*     */     //   706	321	34	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   715	312	35	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   675	352	31	$changed$iv$iv	I
/*     */     //   634	399	27	$i$f$Box	I
/*     */     //   665	368	30	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   631	402	25	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   653	380	28	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   656	377	29	propagateMinConstraints$iv	Z
/*     */     //   631	402	26	$changed$iv	I
/*     */     //   579	462	24	$i$a$-Layout-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$1	I
/*     */     //   576	465	23	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   576	465	22	$changed	I
/*     */     //   490	55	21	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   487	58	20	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   483	64	19	$i$f$set-impl	I
/*     */     //   480	67	18	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   446	115	17	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   443	118	16	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   373	681	15	$i$f$ReusableComposeNode	I
/*     */     //   370	684	13	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   370	684	14	$changed$iv$iv	I
/*     */     //   311	749	9	$i$f$Layout	I
/*     */     //   330	730	10	compositeKeyHash$iv	I
/*     */     //   339	721	11	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   347	713	12	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   308	752	7	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   308	752	8	$changed$iv	I
/*     */     //   16	1095	6	$dirty	I
/*     */     //   0	1111	0	verticalScrollbar	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1111	1	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1111	2	scrollbarStyle	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */     //   0	1111	3	content	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1111	4	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1111	5	$changed	I
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
/*     */   static final class HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1 implements MeasurePolicy {
/*     */     HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1(ScrollbarStyle $scrollbarStyle) {}
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$Layout'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: checkcast java/lang/Iterable
/*     */       //   16: astore #8
/*     */       //   18: aload #8
/*     */       //   20: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   25: astore #9
/*     */       //   27: aload #9
/*     */       //   29: invokeinterface hasNext : ()Z
/*     */       //   34: ifeq -> 74
/*     */       //   37: aload #9
/*     */       //   39: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   44: astore #10
/*     */       //   46: aload #10
/*     */       //   48: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   51: astore #11
/*     */       //   53: iconst_0
/*     */       //   54: istore #12
/*     */       //   56: aload #11
/*     */       //   58: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   61: ldc 'ID_VERTICAL_SCROLLBAR'
/*     */       //   63: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   66: ifeq -> 27
/*     */       //   69: aload #10
/*     */       //   71: goto -> 75
/*     */       //   74: aconst_null
/*     */       //   75: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   78: dup
/*     */       //   79: ifnonnull -> 96
/*     */       //   82: pop
/*     */       //   83: new java/lang/IllegalStateException
/*     */       //   86: dup
/*     */       //   87: ldc 'The vertical scrollbar is missing'
/*     */       //   89: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   92: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   95: athrow
/*     */       //   96: astore #5
/*     */       //   98: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*     */       //   101: lload_3
/*     */       //   102: invokestatic getMaxHeight-impl : (J)I
/*     */       //   105: invokevirtual fixedHeight-OenEA2s : (I)J
/*     */       //   108: lstore #6
/*     */       //   110: aload #5
/*     */       //   112: lload #6
/*     */       //   114: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   119: astore #8
/*     */       //   121: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*     */       //   124: getstatic org/jetbrains/skiko/OS.MacOS : Lorg/jetbrains/skiko/OS;
/*     */       //   127: if_acmpne -> 134
/*     */       //   130: iconst_1
/*     */       //   131: goto -> 135
/*     */       //   134: iconst_0
/*     */       //   135: istore #9
/*     */       //   137: aload_2
/*     */       //   138: checkcast java/lang/Iterable
/*     */       //   141: astore #13
/*     */       //   143: aload #13
/*     */       //   145: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   150: astore #14
/*     */       //   152: aload #14
/*     */       //   154: invokeinterface hasNext : ()Z
/*     */       //   159: ifeq -> 199
/*     */       //   162: aload #14
/*     */       //   164: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   169: astore #15
/*     */       //   171: aload #15
/*     */       //   173: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   176: astore #16
/*     */       //   178: iconst_0
/*     */       //   179: istore #17
/*     */       //   181: aload #16
/*     */       //   183: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   186: ldc 'ID_CONTENT'
/*     */       //   188: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   191: ifeq -> 152
/*     */       //   194: aload #15
/*     */       //   196: goto -> 200
/*     */       //   199: aconst_null
/*     */       //   200: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   203: dup
/*     */       //   204: ifnonnull -> 221
/*     */       //   207: pop
/*     */       //   208: new java/lang/IllegalStateException
/*     */       //   211: dup
/*     */       //   212: ldc 'Content not provided'
/*     */       //   214: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   217: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   220: athrow
/*     */       //   221: astore #10
/*     */       //   223: aload_0
/*     */       //   224: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*     */       //   227: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*     */       //   230: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*     */       //   233: istore #11
/*     */       //   235: iload #9
/*     */       //   237: ifeq -> 245
/*     */       //   240: iload #11
/*     */       //   242: ifeq -> 253
/*     */       //   245: aload #8
/*     */       //   247: invokevirtual getWidth : ()I
/*     */       //   250: goto -> 254
/*     */       //   253: iconst_0
/*     */       //   254: istore #12
/*     */       //   256: lload_3
/*     */       //   257: invokestatic getMaxWidth-impl : (J)I
/*     */       //   260: iload #12
/*     */       //   262: isub
/*     */       //   263: istore #13
/*     */       //   265: iload #13
/*     */       //   267: iload #13
/*     */       //   269: lload_3
/*     */       //   270: invokestatic getMinHeight-impl : (J)I
/*     */       //   273: lload_3
/*     */       //   274: invokestatic getMaxHeight-impl : (J)I
/*     */       //   277: invokestatic Constraints : (IIII)J
/*     */       //   280: lstore #14
/*     */       //   282: aload #10
/*     */       //   284: lload #14
/*     */       //   286: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   291: astore #16
/*     */       //   293: aload #16
/*     */       //   295: invokevirtual getWidth : ()I
/*     */       //   298: iload #12
/*     */       //   300: iadd
/*     */       //   301: istore #17
/*     */       //   303: aload #16
/*     */       //   305: invokevirtual getHeight : ()I
/*     */       //   308: istore #18
/*     */       //   310: aload_1
/*     */       //   311: iload #17
/*     */       //   313: iload #18
/*     */       //   315: aconst_null
/*     */       //   316: aload #16
/*     */       //   318: aload #8
/*     */       //   320: iload #17
/*     */       //   322: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;I)Lkotlin/jvm/functions/Function1;
/*     */       //   327: iconst_4
/*     */       //   328: aconst_null
/*     */       //   329: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   332: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #180	-> 12
/*     */       //   #307	-> 53
/*     */       //   #180	-> 56
/*     */       //   #180	-> 66
/*     */       //   #180	-> 75
/*     */       //   #181	-> 87
/*     */       //   #180	-> 96
/*     */       //   #179	-> 96
/*     */       //   #183	-> 98
/*     */       //   #185	-> 110
/*     */       //   #184	-> 119
/*     */       //   #187	-> 121
/*     */       //   #189	-> 137
/*     */       //   #307	-> 178
/*     */       //   #189	-> 181
/*     */       //   #189	-> 191
/*     */       //   #189	-> 200
/*     */       //   #188	-> 221
/*     */       //   #191	-> 223
/*     */       //   #193	-> 235
/*     */       //   #196	-> 245
/*     */       //   #198	-> 253
/*     */       //   #193	-> 254
/*     */       //   #192	-> 254
/*     */       //   #201	-> 256
/*     */       //   #204	-> 265
/*     */       //   #205	-> 267
/*     */       //   #206	-> 269
/*     */       //   #207	-> 273
/*     */       //   #203	-> 277
/*     */       //   #202	-> 280
/*     */       //   #209	-> 282
/*     */       //   #210	-> 293
/*     */       //   #212	-> 303
/*     */       //   #214	-> 310
/*     */       //   #221	-> 332
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   56	10	12	$i$a$-find-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1$verticalScrollbarMeasurable$1	I
/*     */       //   53	13	11	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   181	10	17	$i$a$-find-HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1$contentMeasurable$1	I
/*     */       //   178	13	16	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   98	235	5	verticalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */       //   110	223	6	verticalScrollbarConstraints	J
/*     */       //   121	212	8	verticalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   137	196	9	isMacOs	Z
/*     */       //   223	110	10	contentMeasurable	Landroidx/compose/ui/layout/Measurable;
/*     */       //   235	98	11	isAlwaysVisible	Z
/*     */       //   256	77	12	vScrollbarWidth	I
/*     */       //   265	68	13	contentWidth	I
/*     */       //   282	51	14	contentConstraints	J
/*     */       //   293	40	16	contentPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   303	30	17	width	I
/*     */       //   310	23	18	height	I
/*     */       //   0	333	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$ScrollableContainerImpl$2$1;
/*     */       //   0	333	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	333	2	measurables	Ljava/util/List;
/*     */       //   0	333	3	incomingConstraints	J
/*     */     }
/*     */     
/*     */     private static final Unit measure_3p2s80s$lambda$2(Placeable $contentPlaceable, Placeable $verticalScrollbarPlaceable, int $width, Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       $this$layout.placeRelative($contentPlaceable, 0, 0, 0.0F);
/*     */       $this$layout.placeRelative($verticalScrollbarPlaceable, $width - $verticalScrollbarPlaceable.getWidth(), 0, 1.0F);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Modifier withKeepVisible-dWUq8MI(Modifier $this$withKeepVisible_u2ddWUq8MI, long lingerDuration, CoroutineScope scope, Function1<? super Boolean, Unit> onKeepVisibleChange) {
/*     */     return SuspendingPointerInputFilterKt.pointerInput($this$withKeepVisible_u2ddWUq8MI, scope, new HeightAutoSizingTextAreaKt$withKeepVisible$1(onKeepVisibleChange, scope, lingerDuration, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "HeightAutoSizingTextArea.kt", l = {232}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.HeightAutoSizingTextAreaKt$withKeepVisible$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*     */   static final class HeightAutoSizingTextAreaKt$withKeepVisible$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     HeightAutoSizingTextAreaKt$withKeepVisible$1(Function1<Boolean, Unit> $onKeepVisibleChange, CoroutineScope $scope, long $lingerDuration, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       PointerInputScope $this$pointerInput;
/*     */       Ref.ObjectRef<Job> delayJob;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$pointerInput = (PointerInputScope)this.L$0;
/*     */           delayJob = new Ref.ObjectRef();
/*     */           this.label = 1;
/*     */           if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #4
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   43: astore_2
/*     */                   //   44: aload_2
/*     */                   //   45: aconst_null
/*     */                   //   46: aload_0
/*     */                   //   47: checkcast kotlin/coroutines/Continuation
/*     */                   //   50: iconst_1
/*     */                   //   51: aconst_null
/*     */                   //   52: aload_0
/*     */                   //   53: iconst_1
/*     */                   //   54: putfield label : I
/*     */                   //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   60: dup
/*     */                   //   61: aload #4
/*     */                   //   63: if_acmpne -> 74
/*     */                   //   66: aload #4
/*     */                   //   68: areturn
/*     */                   //   69: aload_1
/*     */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   73: aload_1
/*     */                   //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                   //   77: astore_3
/*     */                   //   78: aload_3
/*     */                   //   79: invokevirtual getType-7fucELk : ()I
/*     */                   //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                   //   85: invokevirtual getMove-7fucELk : ()I
/*     */                   //   88: invokestatic equals-impl0 : (II)Z
/*     */                   //   91: ifeq -> 169
/*     */                   //   94: aload_0
/*     */                   //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   98: getfield element : Ljava/lang/Object;
/*     */                   //   101: checkcast kotlinx/coroutines/Job
/*     */                   //   104: dup
/*     */                   //   105: ifnull -> 117
/*     */                   //   108: aconst_null
/*     */                   //   109: iconst_1
/*     */                   //   110: aconst_null
/*     */                   //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   114: goto -> 118
/*     */                   //   117: pop
/*     */                   //   118: aload_0
/*     */                   //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                   //   122: iconst_1
/*     */                   //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                   //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */                   //   131: pop
/*     */                   //   132: aload_0
/*     */                   //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   136: aload_0
/*     */                   //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */                   //   140: aconst_null
/*     */                   //   141: aconst_null
/*     */                   //   142: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1$1
/*     */                   //   145: dup
/*     */                   //   146: aload_0
/*     */                   //   147: getfield $lingerDuration : J
/*     */                   //   150: aload_0
/*     */                   //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                   //   154: aconst_null
/*     */                   //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */                   //   158: checkcast kotlin/jvm/functions/Function2
/*     */                   //   161: iconst_3
/*     */                   //   162: aconst_null
/*     */                   //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */                   //   166: putfield element : Ljava/lang/Object;
/*     */                   //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   172: areturn
/*     */                   //   173: new java/lang/IllegalStateException
/*     */                   //   176: dup
/*     */                   //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   179: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   182: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #232	-> 3
/*     */                   //   #233	-> 44
/*     */                   //   #232	-> 66
/*     */                   //   #234	-> 78
/*     */                   //   #235	-> 94
/*     */                   //   #236	-> 118
/*     */                   //   #237	-> 132
/*     */                   //   #238	-> 136
/*     */                   //   #237	-> 166
/*     */                   //   #243	-> 169
/*     */                   //   #232	-> 173
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                   //   0	183	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1;
/*     */                   //   36	137	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #4
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*     */                   //   43: astore_2
/*     */                   //   44: aload_2
/*     */                   //   45: aconst_null
/*     */                   //   46: aload_0
/*     */                   //   47: checkcast kotlin/coroutines/Continuation
/*     */                   //   50: iconst_1
/*     */                   //   51: aconst_null
/*     */                   //   52: aload_0
/*     */                   //   53: iconst_1
/*     */                   //   54: putfield label : I
/*     */                   //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */                   //   60: dup
/*     */                   //   61: aload #4
/*     */                   //   63: if_acmpne -> 74
/*     */                   //   66: aload #4
/*     */                   //   68: areturn
/*     */                   //   69: aload_1
/*     */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   73: aload_1
/*     */                   //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*     */                   //   77: astore_3
/*     */                   //   78: aload_3
/*     */                   //   79: invokevirtual getType-7fucELk : ()I
/*     */                   //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*     */                   //   85: invokevirtual getMove-7fucELk : ()I
/*     */                   //   88: invokestatic equals-impl0 : (II)Z
/*     */                   //   91: ifeq -> 169
/*     */                   //   94: aload_0
/*     */                   //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   98: getfield element : Ljava/lang/Object;
/*     */                   //   101: checkcast kotlinx/coroutines/Job
/*     */                   //   104: dup
/*     */                   //   105: ifnull -> 117
/*     */                   //   108: aconst_null
/*     */                   //   109: iconst_1
/*     */                   //   110: aconst_null
/*     */                   //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */                   //   114: goto -> 118
/*     */                   //   117: pop
/*     */                   //   118: aload_0
/*     */                   //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                   //   122: iconst_1
/*     */                   //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                   //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */                   //   131: pop
/*     */                   //   132: aload_0
/*     */                   //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */                   //   136: aload_0
/*     */                   //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*     */                   //   140: aconst_null
/*     */                   //   141: aconst_null
/*     */                   //   142: new com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1$1
/*     */                   //   145: dup
/*     */                   //   146: aload_0
/*     */                   //   147: getfield $lingerDuration : J
/*     */                   //   150: aload_0
/*     */                   //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*     */                   //   154: aconst_null
/*     */                   //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */                   //   158: checkcast kotlin/jvm/functions/Function2
/*     */                   //   161: iconst_3
/*     */                   //   162: aconst_null
/*     */                   //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */                   //   166: putfield element : Ljava/lang/Object;
/*     */                   //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */                   //   172: areturn
/*     */                   //   173: new java/lang/IllegalStateException
/*     */                   //   176: dup
/*     */                   //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   179: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   182: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #232	-> 3
/*     */                   //   #233	-> 44
/*     */                   //   #232	-> 66
/*     */                   //   #234	-> 78
/*     */                   //   #235	-> 94
/*     */                   //   #236	-> 118
/*     */                   //   #237	-> 132
/*     */                   //   #238	-> 136
/*     */                   //   #237	-> 166
/*     */                   //   #243	-> 169
/*     */                   //   #232	-> 173
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*     */                   //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*     */                   //   0	183	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$withKeepVisible$1$1;
/*     */                   //   36	137	1	$result	Ljava/lang/Object;
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super HeightAutoSizingTextAreaKt$withKeepVisible$1> $completion) {
/*     */       HeightAutoSizingTextAreaKt$withKeepVisible$1 heightAutoSizingTextAreaKt$withKeepVisible$1 = new HeightAutoSizingTextAreaKt$withKeepVisible$1(this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*     */       heightAutoSizingTextAreaKt$withKeepVisible$1.L$0 = value;
/*     */       return (Continuation<Unit>)heightAutoSizingTextAreaKt$withKeepVisible$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*     */       return ((HeightAutoSizingTextAreaKt$withKeepVisible$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*     */   private static final void TextAreaDecorationBox-yrwZFoE(Function2 innerTextField, TextStyle textStyle, Modifier modifier, Function2 placeholder, long placeholderTextColor, Modifier placeholderModifier, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: ldc_w -1123645897
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
/*     */     //   181: ldc_w 196608
/*     */     //   184: iand
/*     */     //   185: ifne -> 214
/*     */     //   188: iload #9
/*     */     //   190: aload #7
/*     */     //   192: aload #6
/*     */     //   194: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   199: ifeq -> 208
/*     */     //   202: ldc_w 131072
/*     */     //   205: goto -> 211
/*     */     //   208: ldc_w 65536
/*     */     //   211: ior
/*     */     //   212: istore #9
/*     */     //   214: iload #9
/*     */     //   216: ldc_w 74899
/*     */     //   219: iand
/*     */     //   220: ldc_w 74898
/*     */     //   223: if_icmpne -> 236
/*     */     //   226: aload #7
/*     */     //   228: invokeinterface getSkipping : ()Z
/*     */     //   233: ifne -> 1590
/*     */     //   236: invokestatic isTraceInProgress : ()Z
/*     */     //   239: ifeq -> 254
/*     */     //   242: ldc_w -1123645897
/*     */     //   245: iload #9
/*     */     //   247: iconst_m1
/*     */     //   248: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.TextAreaDecorationBox (HeightAutoSizingTextArea.kt:253)'
/*     */     //   251: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   254: aload #7
/*     */     //   256: ldc_w 2008802573
/*     */     //   259: invokeinterface startReplaceGroup : (I)V
/*     */     //   264: aload #7
/*     */     //   266: astore #11
/*     */     //   268: iconst_0
/*     */     //   269: istore #12
/*     */     //   271: nop
/*     */     //   272: iconst_0
/*     */     //   273: istore #13
/*     */     //   275: aload #11
/*     */     //   277: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   282: astore #14
/*     */     //   284: iconst_0
/*     */     //   285: istore #15
/*     */     //   287: aload #14
/*     */     //   289: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   292: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   295: if_acmpne -> 323
/*     */     //   298: iconst_0
/*     */     //   299: istore #16
/*     */     //   301: getstatic com/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1;
/*     */     //   304: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   307: astore #16
/*     */     //   309: aload #11
/*     */     //   311: aload #16
/*     */     //   313: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   318: aload #16
/*     */     //   320: goto -> 325
/*     */     //   323: aload #14
/*     */     //   325: nop
/*     */     //   326: nop
/*     */     //   327: nop
/*     */     //   328: checkcast androidx/compose/ui/layout/MeasurePolicy
/*     */     //   331: astore #10
/*     */     //   333: aload #7
/*     */     //   335: invokeinterface endReplaceGroup : ()V
/*     */     //   340: aload #10
/*     */     //   342: astore #10
/*     */     //   344: sipush #384
/*     */     //   347: bipush #112
/*     */     //   349: iload #9
/*     */     //   351: iconst_3
/*     */     //   352: ishr
/*     */     //   353: iand
/*     */     //   354: ior
/*     */     //   355: istore #11
/*     */     //   357: nop
/*     */     //   358: iconst_0
/*     */     //   359: istore #12
/*     */     //   361: aload #7
/*     */     //   363: ldc_w -1323940314
/*     */     //   366: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   369: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   372: aload #7
/*     */     //   374: iconst_0
/*     */     //   375: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   378: istore #13
/*     */     //   380: aload #7
/*     */     //   382: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   387: astore #14
/*     */     //   389: aload #7
/*     */     //   391: aload_2
/*     */     //   392: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   395: astore #15
/*     */     //   397: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   400: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   403: astore #16
/*     */     //   405: bipush #6
/*     */     //   407: sipush #896
/*     */     //   410: iload #11
/*     */     //   412: bipush #6
/*     */     //   414: ishl
/*     */     //   415: iand
/*     */     //   416: ior
/*     */     //   417: istore #17
/*     */     //   419: nop
/*     */     //   420: iconst_0
/*     */     //   421: istore #18
/*     */     //   423: aload #7
/*     */     //   425: ldc_w -692256719
/*     */     //   428: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   431: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   434: aload #7
/*     */     //   436: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   441: instanceof androidx/compose/runtime/Applier
/*     */     //   444: ifne -> 450
/*     */     //   447: invokestatic invalidApplier : ()V
/*     */     //   450: aload #7
/*     */     //   452: invokeinterface startReusableNode : ()V
/*     */     //   457: aload #7
/*     */     //   459: invokeinterface getInserting : ()Z
/*     */     //   464: ifeq -> 479
/*     */     //   467: aload #7
/*     */     //   469: aload #16
/*     */     //   471: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   476: goto -> 486
/*     */     //   479: aload #7
/*     */     //   481: invokeinterface useNode : ()V
/*     */     //   486: aload #7
/*     */     //   488: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   491: astore #19
/*     */     //   493: iconst_0
/*     */     //   494: istore #20
/*     */     //   496: aload #19
/*     */     //   498: aload #10
/*     */     //   500: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   503: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   506: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   509: aload #19
/*     */     //   511: aload #14
/*     */     //   513: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   516: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   519: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   522: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   525: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   528: astore #21
/*     */     //   530: iconst_0
/*     */     //   531: istore #22
/*     */     //   533: aload #19
/*     */     //   535: astore #23
/*     */     //   537: iconst_0
/*     */     //   538: istore #24
/*     */     //   540: aload #23
/*     */     //   542: invokeinterface getInserting : ()Z
/*     */     //   547: ifne -> 568
/*     */     //   550: aload #23
/*     */     //   552: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   557: iload #13
/*     */     //   559: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   562: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   565: ifne -> 594
/*     */     //   568: aload #23
/*     */     //   570: iload #13
/*     */     //   572: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   575: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   580: aload #19
/*     */     //   582: iload #13
/*     */     //   584: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   587: aload #21
/*     */     //   589: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   594: nop
/*     */     //   595: nop
/*     */     //   596: nop
/*     */     //   597: aload #19
/*     */     //   599: aload #15
/*     */     //   601: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   604: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   607: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   610: nop
/*     */     //   611: nop
/*     */     //   612: aload #7
/*     */     //   614: bipush #14
/*     */     //   616: iload #17
/*     */     //   618: bipush #6
/*     */     //   620: ishr
/*     */     //   621: iand
/*     */     //   622: istore #25
/*     */     //   624: astore #26
/*     */     //   626: iconst_0
/*     */     //   627: istore #27
/*     */     //   629: aload #26
/*     */     //   631: ldc_w -2084431496
/*     */     //   634: invokeinterface startReplaceGroup : (I)V
/*     */     //   639: aload_3
/*     */     //   640: ifnull -> 1128
/*     */     //   643: aload #6
/*     */     //   645: ldc_w 'Placeholder'
/*     */     //   648: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   651: astore #28
/*     */     //   653: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   656: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   659: astore #29
/*     */     //   661: bipush #48
/*     */     //   663: istore #30
/*     */     //   665: nop
/*     */     //   666: iconst_0
/*     */     //   667: istore #31
/*     */     //   669: aload #26
/*     */     //   671: ldc_w 733328855
/*     */     //   674: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   677: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   680: iconst_0
/*     */     //   681: istore #32
/*     */     //   683: aload #29
/*     */     //   685: iload #32
/*     */     //   687: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   690: astore #33
/*     */     //   692: bipush #112
/*     */     //   694: iload #30
/*     */     //   696: iconst_3
/*     */     //   697: ishl
/*     */     //   698: iand
/*     */     //   699: istore #34
/*     */     //   701: nop
/*     */     //   702: iconst_0
/*     */     //   703: istore #35
/*     */     //   705: aload #26
/*     */     //   707: ldc_w -1323940314
/*     */     //   710: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   713: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   716: aload #26
/*     */     //   718: iconst_0
/*     */     //   719: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   722: istore #36
/*     */     //   724: aload #26
/*     */     //   726: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   731: astore #37
/*     */     //   733: aload #26
/*     */     //   735: aload #28
/*     */     //   737: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   740: astore #38
/*     */     //   742: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   745: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   748: astore #39
/*     */     //   750: bipush #6
/*     */     //   752: sipush #896
/*     */     //   755: iload #34
/*     */     //   757: bipush #6
/*     */     //   759: ishl
/*     */     //   760: iand
/*     */     //   761: ior
/*     */     //   762: istore #40
/*     */     //   764: nop
/*     */     //   765: iconst_0
/*     */     //   766: istore #41
/*     */     //   768: aload #26
/*     */     //   770: ldc_w -692256719
/*     */     //   773: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   776: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   779: aload #26
/*     */     //   781: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   786: instanceof androidx/compose/runtime/Applier
/*     */     //   789: ifne -> 795
/*     */     //   792: invokestatic invalidApplier : ()V
/*     */     //   795: aload #26
/*     */     //   797: invokeinterface startReusableNode : ()V
/*     */     //   802: aload #26
/*     */     //   804: invokeinterface getInserting : ()Z
/*     */     //   809: ifeq -> 824
/*     */     //   812: aload #26
/*     */     //   814: aload #39
/*     */     //   816: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   821: goto -> 831
/*     */     //   824: aload #26
/*     */     //   826: invokeinterface useNode : ()V
/*     */     //   831: aload #26
/*     */     //   833: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   836: astore #42
/*     */     //   838: iconst_0
/*     */     //   839: istore #43
/*     */     //   841: aload #42
/*     */     //   843: aload #33
/*     */     //   845: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   848: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   851: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   854: aload #42
/*     */     //   856: aload #37
/*     */     //   858: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   861: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   864: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   867: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   870: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   873: astore #44
/*     */     //   875: iconst_0
/*     */     //   876: istore #45
/*     */     //   878: aload #42
/*     */     //   880: astore #46
/*     */     //   882: iconst_0
/*     */     //   883: istore #47
/*     */     //   885: aload #46
/*     */     //   887: invokeinterface getInserting : ()Z
/*     */     //   892: ifne -> 913
/*     */     //   895: aload #46
/*     */     //   897: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   902: iload #36
/*     */     //   904: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   907: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   910: ifne -> 939
/*     */     //   913: aload #46
/*     */     //   915: iload #36
/*     */     //   917: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   920: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   925: aload #42
/*     */     //   927: iload #36
/*     */     //   929: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   932: aload #44
/*     */     //   934: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   939: nop
/*     */     //   940: nop
/*     */     //   941: nop
/*     */     //   942: aload #42
/*     */     //   944: aload #38
/*     */     //   946: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   949: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   952: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   955: nop
/*     */     //   956: nop
/*     */     //   957: aload #26
/*     */     //   959: bipush #14
/*     */     //   961: iload #40
/*     */     //   963: bipush #6
/*     */     //   965: ishr
/*     */     //   966: iand
/*     */     //   967: istore #48
/*     */     //   969: astore #49
/*     */     //   971: iconst_0
/*     */     //   972: istore #50
/*     */     //   974: aload #49
/*     */     //   976: ldc_w -2146769399
/*     */     //   979: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   982: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   985: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   988: aload #49
/*     */     //   990: bipush #6
/*     */     //   992: bipush #112
/*     */     //   994: iload #30
/*     */     //   996: bipush #6
/*     */     //   998: ishr
/*     */     //   999: iand
/*     */     //   1000: ior
/*     */     //   1001: istore #51
/*     */     //   1003: astore #52
/*     */     //   1005: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1008: astore #53
/*     */     //   1010: iconst_0
/*     */     //   1011: istore #54
/*     */     //   1013: iconst_2
/*     */     //   1014: anewarray androidx/compose/runtime/ProvidedValue
/*     */     //   1017: astore #55
/*     */     //   1019: aload #55
/*     */     //   1021: iconst_0
/*     */     //   1022: invokestatic getLocalTextStyle : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1025: aload_1
/*     */     //   1026: lload #4
/*     */     //   1028: lconst_0
/*     */     //   1029: aconst_null
/*     */     //   1030: aconst_null
/*     */     //   1031: aconst_null
/*     */     //   1032: aconst_null
/*     */     //   1033: aconst_null
/*     */     //   1034: lconst_0
/*     */     //   1035: aconst_null
/*     */     //   1036: aconst_null
/*     */     //   1037: aconst_null
/*     */     //   1038: lconst_0
/*     */     //   1039: aconst_null
/*     */     //   1040: aconst_null
/*     */     //   1041: aconst_null
/*     */     //   1042: iconst_0
/*     */     //   1043: iconst_0
/*     */     //   1044: lconst_0
/*     */     //   1045: aconst_null
/*     */     //   1046: aconst_null
/*     */     //   1047: aconst_null
/*     */     //   1048: iconst_0
/*     */     //   1049: iconst_0
/*     */     //   1050: aconst_null
/*     */     //   1051: ldc_w 16777214
/*     */     //   1054: aconst_null
/*     */     //   1055: invokestatic copy-p1EtxEg$default : (Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   1058: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1061: aastore
/*     */     //   1062: aload #55
/*     */     //   1064: iconst_1
/*     */     //   1065: invokestatic getLocalContentColor : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   1068: lload #4
/*     */     //   1070: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   1073: invokevirtual provides : (Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;
/*     */     //   1076: aastore
/*     */     //   1077: aload #55
/*     */     //   1079: aload_3
/*     */     //   1080: aload #52
/*     */     //   1082: getstatic androidx/compose/runtime/ProvidedValue.$stable : I
/*     */     //   1085: bipush #112
/*     */     //   1087: iload #9
/*     */     //   1089: bipush #6
/*     */     //   1091: ishr
/*     */     //   1092: iand
/*     */     //   1093: ior
/*     */     //   1094: invokestatic CompositionLocalProvider : ([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   1097: nop
/*     */     //   1098: aload #49
/*     */     //   1100: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1103: aload #26
/*     */     //   1105: invokeinterface endNode : ()V
/*     */     //   1110: aload #26
/*     */     //   1112: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1115: nop
/*     */     //   1116: aload #26
/*     */     //   1118: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1121: nop
/*     */     //   1122: aload #26
/*     */     //   1124: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1127: nop
/*     */     //   1128: aload #26
/*     */     //   1130: invokeinterface endReplaceGroup : ()V
/*     */     //   1135: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   1138: checkcast androidx/compose/ui/Modifier
/*     */     //   1141: ldc_w 'TextField'
/*     */     //   1144: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   1147: astore #28
/*     */     //   1149: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*     */     //   1152: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*     */     //   1155: astore #29
/*     */     //   1157: iconst_1
/*     */     //   1158: istore #32
/*     */     //   1160: sipush #438
/*     */     //   1163: istore #30
/*     */     //   1165: nop
/*     */     //   1166: iconst_0
/*     */     //   1167: istore #31
/*     */     //   1169: aload #26
/*     */     //   1171: ldc_w 733328855
/*     */     //   1174: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*     */     //   1177: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1180: aload #29
/*     */     //   1182: iload #32
/*     */     //   1184: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1187: astore #33
/*     */     //   1189: bipush #112
/*     */     //   1191: iload #30
/*     */     //   1193: iconst_3
/*     */     //   1194: ishl
/*     */     //   1195: iand
/*     */     //   1196: istore #34
/*     */     //   1198: nop
/*     */     //   1199: iconst_0
/*     */     //   1200: istore #35
/*     */     //   1202: aload #26
/*     */     //   1204: ldc_w -1323940314
/*     */     //   1207: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*     */     //   1210: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1213: aload #26
/*     */     //   1215: iconst_0
/*     */     //   1216: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*     */     //   1219: istore #36
/*     */     //   1221: aload #26
/*     */     //   1223: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1228: astore #37
/*     */     //   1230: aload #26
/*     */     //   1232: aload #28
/*     */     //   1234: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*     */     //   1237: astore #38
/*     */     //   1239: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1242: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*     */     //   1245: astore #39
/*     */     //   1247: bipush #6
/*     */     //   1249: sipush #896
/*     */     //   1252: iload #34
/*     */     //   1254: bipush #6
/*     */     //   1256: ishl
/*     */     //   1257: iand
/*     */     //   1258: ior
/*     */     //   1259: istore #40
/*     */     //   1261: nop
/*     */     //   1262: iconst_0
/*     */     //   1263: istore #41
/*     */     //   1265: aload #26
/*     */     //   1267: ldc_w -692256719
/*     */     //   1270: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*     */     //   1273: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1276: aload #26
/*     */     //   1278: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*     */     //   1283: instanceof androidx/compose/runtime/Applier
/*     */     //   1286: ifne -> 1292
/*     */     //   1289: invokestatic invalidApplier : ()V
/*     */     //   1292: aload #26
/*     */     //   1294: invokeinterface startReusableNode : ()V
/*     */     //   1299: aload #26
/*     */     //   1301: invokeinterface getInserting : ()Z
/*     */     //   1306: ifeq -> 1321
/*     */     //   1309: aload #26
/*     */     //   1311: aload #39
/*     */     //   1313: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*     */     //   1318: goto -> 1328
/*     */     //   1321: aload #26
/*     */     //   1323: invokeinterface useNode : ()V
/*     */     //   1328: aload #26
/*     */     //   1330: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*     */     //   1333: astore #42
/*     */     //   1335: iconst_0
/*     */     //   1336: istore #43
/*     */     //   1338: aload #42
/*     */     //   1340: aload #33
/*     */     //   1342: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1345: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1348: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1351: aload #42
/*     */     //   1353: aload #37
/*     */     //   1355: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1358: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1361: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1364: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1367: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1370: astore #44
/*     */     //   1372: iconst_0
/*     */     //   1373: istore #45
/*     */     //   1375: aload #42
/*     */     //   1377: astore #46
/*     */     //   1379: iconst_0
/*     */     //   1380: istore #47
/*     */     //   1382: aload #46
/*     */     //   1384: invokeinterface getInserting : ()Z
/*     */     //   1389: ifne -> 1410
/*     */     //   1392: aload #46
/*     */     //   1394: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   1399: iload #36
/*     */     //   1401: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1404: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1407: ifne -> 1436
/*     */     //   1410: aload #46
/*     */     //   1412: iload #36
/*     */     //   1414: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1417: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   1422: aload #42
/*     */     //   1424: iload #36
/*     */     //   1426: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1429: aload #44
/*     */     //   1431: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1436: nop
/*     */     //   1437: nop
/*     */     //   1438: nop
/*     */     //   1439: aload #42
/*     */     //   1441: aload #38
/*     */     //   1443: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*     */     //   1446: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*     */     //   1449: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*     */     //   1452: nop
/*     */     //   1453: nop
/*     */     //   1454: aload #26
/*     */     //   1456: bipush #14
/*     */     //   1458: iload #40
/*     */     //   1460: bipush #6
/*     */     //   1462: ishr
/*     */     //   1463: iand
/*     */     //   1464: istore #48
/*     */     //   1466: astore #49
/*     */     //   1468: iconst_0
/*     */     //   1469: istore #50
/*     */     //   1471: aload #49
/*     */     //   1473: ldc_w -2146769399
/*     */     //   1476: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*     */     //   1479: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   1482: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*     */     //   1485: aload #49
/*     */     //   1487: bipush #6
/*     */     //   1489: bipush #112
/*     */     //   1491: iload #30
/*     */     //   1493: bipush #6
/*     */     //   1495: ishr
/*     */     //   1496: iand
/*     */     //   1497: ior
/*     */     //   1498: istore #51
/*     */     //   1500: astore #52
/*     */     //   1502: checkcast androidx/compose/foundation/layout/BoxScope
/*     */     //   1505: astore #53
/*     */     //   1507: iconst_0
/*     */     //   1508: istore #54
/*     */     //   1510: aload_0
/*     */     //   1511: aload #52
/*     */     //   1513: bipush #14
/*     */     //   1515: iload #9
/*     */     //   1517: iand
/*     */     //   1518: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1521: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1526: pop
/*     */     //   1527: nop
/*     */     //   1528: aload #49
/*     */     //   1530: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1533: aload #26
/*     */     //   1535: invokeinterface endNode : ()V
/*     */     //   1540: aload #26
/*     */     //   1542: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1545: nop
/*     */     //   1546: aload #26
/*     */     //   1548: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1551: nop
/*     */     //   1552: aload #26
/*     */     //   1554: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1557: nop
/*     */     //   1558: nop
/*     */     //   1559: aload #7
/*     */     //   1561: invokeinterface endNode : ()V
/*     */     //   1566: aload #7
/*     */     //   1568: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1571: nop
/*     */     //   1572: aload #7
/*     */     //   1574: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   1577: nop
/*     */     //   1578: invokestatic isTraceInProgress : ()Z
/*     */     //   1581: ifeq -> 1597
/*     */     //   1584: invokestatic traceEventEnd : ()V
/*     */     //   1587: goto -> 1597
/*     */     //   1590: aload #7
/*     */     //   1592: invokeinterface skipToGroupEnd : ()V
/*     */     //   1597: aload #7
/*     */     //   1599: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   1604: dup
/*     */     //   1605: ifnull -> 1631
/*     */     //   1608: aload_0
/*     */     //   1609: aload_1
/*     */     //   1610: aload_2
/*     */     //   1611: aload_3
/*     */     //   1612: lload #4
/*     */     //   1614: aload #6
/*     */     //   1616: iload #8
/*     */     //   1618: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JLandroidx/compose/ui/Modifier;I)Lkotlin/jvm/functions/Function2;
/*     */     //   1623: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   1628: goto -> 1632
/*     */     //   1631: pop
/*     */     //   1632: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #254	-> 0
/*     */     //   #279	-> 271
/*     */     //   #421	-> 275
/*     */     //   #422	-> 287
/*     */     //   #423	-> 298
/*     */     //   #279	-> 301
/*     */     //   #423	-> 307
/*     */     //   #424	-> 309
/*     */     //   #425	-> 318
/*     */     //   #426	-> 323
/*     */     //   #422	-> 325
/*     */     //   #421	-> 326
/*     */     //   #421	-> 327
/*     */     //   #279	-> 328
/*     */     //   #255	-> 357
/*     */     //   #427	-> 369
/*     */     //   #428	-> 375
/*     */     //   #429	-> 382
/*     */     //   #430	-> 391
/*     */     //   #432	-> 397
/*     */     //   #431	-> 419
/*     */     //   #433	-> 431
/*     */     //   #434	-> 434
/*     */     //   #435	-> 452
/*     */     //   #436	-> 457
/*     */     //   #437	-> 469
/*     */     //   #439	-> 481
/*     */     //   #441	-> 486
/*     */     //   #442	-> 496
/*     */     //   #443	-> 509
/*     */     //   #445	-> 522
/*     */     //   #446	-> 533
/*     */     //   #447	-> 540
/*     */     //   #448	-> 568
/*     */     //   #449	-> 580
/*     */     //   #451	-> 594
/*     */     //   #446	-> 595
/*     */     //   #451	-> 596
/*     */     //   #452	-> 597
/*     */     //   #453	-> 610
/*     */     //   #441	-> 611
/*     */     //   #454	-> 612
/*     */     //   #257	-> 639
/*     */     //   #259	-> 643
/*     */     //   #260	-> 653
/*     */     //   #258	-> 665
/*     */     //   #455	-> 677
/*     */     //   #456	-> 680
/*     */     //   #459	-> 683
/*     */     //   #460	-> 701
/*     */     //   #461	-> 713
/*     */     //   #462	-> 719
/*     */     //   #463	-> 726
/*     */     //   #464	-> 735
/*     */     //   #466	-> 742
/*     */     //   #465	-> 764
/*     */     //   #467	-> 776
/*     */     //   #468	-> 779
/*     */     //   #469	-> 797
/*     */     //   #470	-> 802
/*     */     //   #471	-> 814
/*     */     //   #473	-> 826
/*     */     //   #475	-> 831
/*     */     //   #476	-> 841
/*     */     //   #477	-> 854
/*     */     //   #479	-> 867
/*     */     //   #480	-> 878
/*     */     //   #481	-> 885
/*     */     //   #482	-> 913
/*     */     //   #483	-> 925
/*     */     //   #485	-> 939
/*     */     //   #480	-> 940
/*     */     //   #485	-> 941
/*     */     //   #486	-> 942
/*     */     //   #487	-> 955
/*     */     //   #475	-> 956
/*     */     //   #488	-> 957
/*     */     //   #489	-> 982
/*     */     //   #263	-> 1013
/*     */     //   #264	-> 1065
/*     */     //   #263	-> 1077
/*     */     //   #265	-> 1079
/*     */     //   #262	-> 1094
/*     */     //   #267	-> 1097
/*     */     //   #489	-> 1098
/*     */     //   #488	-> 1103
/*     */     //   #490	-> 1105
/*     */     //   #467	-> 1112
/*     */     //   #491	-> 1115
/*     */     //   #461	-> 1118
/*     */     //   #492	-> 1121
/*     */     //   #455	-> 1124
/*     */     //   #493	-> 1127
/*     */     //   #271	-> 1135
/*     */     //   #272	-> 1149
/*     */     //   #273	-> 1157
/*     */     //   #270	-> 1165
/*     */     //   #494	-> 1177
/*     */     //   #495	-> 1180
/*     */     //   #496	-> 1198
/*     */     //   #497	-> 1210
/*     */     //   #498	-> 1216
/*     */     //   #499	-> 1223
/*     */     //   #500	-> 1232
/*     */     //   #502	-> 1239
/*     */     //   #501	-> 1261
/*     */     //   #503	-> 1273
/*     */     //   #504	-> 1276
/*     */     //   #505	-> 1294
/*     */     //   #506	-> 1299
/*     */     //   #507	-> 1311
/*     */     //   #509	-> 1323
/*     */     //   #511	-> 1328
/*     */     //   #512	-> 1338
/*     */     //   #513	-> 1351
/*     */     //   #515	-> 1364
/*     */     //   #516	-> 1375
/*     */     //   #517	-> 1382
/*     */     //   #518	-> 1410
/*     */     //   #519	-> 1422
/*     */     //   #521	-> 1436
/*     */     //   #516	-> 1437
/*     */     //   #521	-> 1438
/*     */     //   #522	-> 1439
/*     */     //   #523	-> 1452
/*     */     //   #511	-> 1453
/*     */     //   #524	-> 1454
/*     */     //   #525	-> 1479
/*     */     //   #275	-> 1510
/*     */     //   #276	-> 1527
/*     */     //   #525	-> 1528
/*     */     //   #524	-> 1533
/*     */     //   #526	-> 1535
/*     */     //   #503	-> 1542
/*     */     //   #527	-> 1545
/*     */     //   #497	-> 1548
/*     */     //   #528	-> 1551
/*     */     //   #494	-> 1554
/*     */     //   #529	-> 1557
/*     */     //   #277	-> 1558
/*     */     //   #454	-> 1559
/*     */     //   #530	-> 1561
/*     */     //   #433	-> 1568
/*     */     //   #531	-> 1571
/*     */     //   #427	-> 1574
/*     */     //   #532	-> 1577
/*     */     //   #303	-> 1590
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   301	6	16	$i$a$-cache-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2	I
/*     */     //   309	11	16	value$iv	Ljava/lang/Object;
/*     */     //   287	39	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   284	42	14	it$iv	Ljava/lang/Object;
/*     */     //   275	53	13	$i$f$cache	I
/*     */     //   272	56	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   272	56	12	invalid$iv	Z
/*     */     //   1013	85	54	$i$a$-Box-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$1$1	I
/*     */     //   1010	88	53	$this$TextAreaDecorationBox_yrwZFoE_u24lambda_u2415_u24lambda_u2413	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1010	88	52	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1010	88	51	$changed	I
/*     */     //   974	129	50	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   971	132	49	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   971	132	48	$changed$iv	I
/*     */     //   885	55	47	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   882	58	46	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   878	64	45	$i$f$set-impl	I
/*     */     //   875	67	44	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   841	115	43	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   838	118	42	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   768	348	41	$i$f$ReusableComposeNode	I
/*     */     //   765	351	39	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   765	351	40	$changed$iv$iv$iv	I
/*     */     //   705	417	35	$i$f$Layout	I
/*     */     //   724	398	36	compositeKeyHash$iv$iv	I
/*     */     //   733	389	37	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   742	380	38	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   702	420	34	$changed$iv$iv	I
/*     */     //   669	459	31	$i$f$Box	I
/*     */     //   692	436	33	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   666	462	28	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   666	462	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   683	445	32	propagateMinConstraints$iv	Z
/*     */     //   666	462	30	$changed$iv	I
/*     */     //   1510	18	54	$i$a$-Box-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$1$2	I
/*     */     //   1507	21	53	$this$TextAreaDecorationBox_yrwZFoE_u24lambda_u2415_u24lambda_u2414	Landroidx/compose/foundation/layout/BoxScope;
/*     */     //   1507	21	52	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   1507	21	51	$changed	I
/*     */     //   1471	62	50	$i$a$-Layout-BoxKt$Box$1$iv	I
/*     */     //   1468	65	49	$composer$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1468	65	48	$changed$iv	I
/*     */     //   1382	55	47	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*     */     //   1379	58	46	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1375	64	45	$i$f$set-impl	I
/*     */     //   1372	67	44	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   1338	115	43	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*     */     //   1335	118	42	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   1265	281	41	$i$f$ReusableComposeNode	I
/*     */     //   1262	284	39	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   1262	284	40	$changed$iv$iv$iv	I
/*     */     //   1202	350	35	$i$f$Layout	I
/*     */     //   1221	331	36	compositeKeyHash$iv$iv	I
/*     */     //   1230	322	37	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   1239	313	38	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1199	353	34	$changed$iv$iv	I
/*     */     //   1169	389	31	$i$f$Box	I
/*     */     //   1189	369	33	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   1166	392	28	modifier$iv	Landroidx/compose/ui/Modifier;
/*     */     //   1166	392	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*     */     //   1166	392	32	propagateMinConstraints$iv	Z
/*     */     //   1166	392	30	$changed$iv	I
/*     */     //   629	930	27	$i$a$-Layout-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$1	I
/*     */     //   626	933	26	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   626	933	25	$changed	I
/*     */     //   540	55	24	$i$a$-with-Updater$set$1$iv$iv	I
/*     */     //   537	58	23	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*     */     //   533	64	22	$i$f$set-impl	I
/*     */     //   530	67	21	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*     */     //   496	115	20	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*     */     //   493	118	19	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*     */     //   423	1149	18	$i$f$ReusableComposeNode	I
/*     */     //   420	1152	16	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*     */     //   420	1152	17	$changed$iv$iv	I
/*     */     //   361	1217	12	$i$f$Layout	I
/*     */     //   380	1198	13	compositeKeyHash$iv	I
/*     */     //   389	1189	14	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*     */     //   397	1181	15	materialized$iv	Landroidx/compose/ui/Modifier;
/*     */     //   358	1220	10	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*     */     //   358	1220	11	$changed$iv	I
/*     */     //   16	1617	9	$dirty	I
/*     */     //   0	1633	0	innerTextField	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1633	1	textStyle	Landroidx/compose/ui/text/TextStyle;
/*     */     //   0	1633	2	modifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1633	3	placeholder	Lkotlin/jvm/functions/Function2;
/*     */     //   0	1633	4	placeholderTextColor	J
/*     */     //   0	1633	6	placeholderModifier	Landroidx/compose/ui/Modifier;
/*     */     //   0	1633	7	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	1633	8	$changed	I
/*     */   }
/*     */   
/*     */   private static final Unit HeightAutoSizingTextArea$lambda$1(TextFieldState $state, TextAreaStyle $style, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $placeholder, int $$changed, Composer $composer, int $force) {
/*     */     HeightAutoSizingTextArea($state, $style, $modifier, $placeholder, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextAreaScrollableContainer$lambda$8(ScrollState $scrollState, ScrollbarStyle $style, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     TextAreaScrollableContainer($scrollState, $style, $modifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit ScrollableContainerImpl$lambda$12(Function2<? super Composer, ? super Integer, Unit> $verticalScrollbar, Modifier $modifier, ScrollbarStyle $scrollbarStyle, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     ScrollableContainerImpl($verticalScrollbar, $modifier, $scrollbarStyle, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit TextAreaDecorationBox_yrwZFoE$lambda$17(Function2<? super Composer, ? super Integer, Unit> $innerTextField, TextStyle $textStyle, Modifier $modifier, Function2<? super Composer, ? super Integer, Unit> $placeholder, long $placeholderTextColor, Modifier $placeholderModifier, int $$changed, Composer $composer, int $force) {
/*     */     TextAreaDecorationBox-yrwZFoE($innerTextField, $textStyle, $modifier, $placeholder, $placeholderTextColor, $placeholderModifier, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n626#2,12:307\n1#3:319\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1\n*L\n281#1:307,12\n*E\n"})
/*     */   static final class HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1 implements MeasurePolicy {
/*     */     public static final HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1 INSTANCE = new HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1();
/*     */     
/*     */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$Layout'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'measurables'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: checkcast java/lang/Iterable
/*     */       //   16: astore #6
/*     */       //   18: iconst_0
/*     */       //   19: istore #7
/*     */       //   21: aconst_null
/*     */       //   22: astore #8
/*     */       //   24: iconst_0
/*     */       //   25: istore #9
/*     */       //   27: aload #6
/*     */       //   29: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   34: astore #10
/*     */       //   36: aload #10
/*     */       //   38: invokeinterface hasNext : ()Z
/*     */       //   43: ifeq -> 103
/*     */       //   46: aload #10
/*     */       //   48: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   53: astore #11
/*     */       //   55: aload #11
/*     */       //   57: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   60: astore #12
/*     */       //   62: iconst_0
/*     */       //   63: istore #13
/*     */       //   65: aload #12
/*     */       //   67: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   70: ldc 'TextField'
/*     */       //   72: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   75: ifeq -> 36
/*     */       //   78: iload #9
/*     */       //   80: ifeq -> 93
/*     */       //   83: new java/lang/IllegalArgumentException
/*     */       //   86: dup
/*     */       //   87: ldc 'Collection contains more than one matching element.'
/*     */       //   89: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   92: athrow
/*     */       //   93: aload #11
/*     */       //   95: astore #8
/*     */       //   97: iconst_1
/*     */       //   98: istore #9
/*     */       //   100: goto -> 36
/*     */       //   103: iload #9
/*     */       //   105: ifne -> 118
/*     */       //   108: new java/util/NoSuchElementException
/*     */       //   111: dup
/*     */       //   112: ldc 'Collection contains no element matching the predicate.'
/*     */       //   114: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   117: athrow
/*     */       //   118: aload #8
/*     */       //   120: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   123: lload_3
/*     */       //   124: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   129: astore #5
/*     */       //   131: iconst_0
/*     */       //   132: aload #5
/*     */       //   134: invokevirtual getWidth : ()I
/*     */       //   137: aload #5
/*     */       //   139: invokevirtual getHeight : ()I
/*     */       //   142: aload #5
/*     */       //   144: invokevirtual getHeight : ()I
/*     */       //   147: invokestatic Constraints : (IIII)J
/*     */       //   150: lstore #6
/*     */       //   152: aload_2
/*     */       //   153: checkcast java/lang/Iterable
/*     */       //   156: astore #11
/*     */       //   158: aload #11
/*     */       //   160: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   165: astore #12
/*     */       //   167: aload #12
/*     */       //   169: invokeinterface hasNext : ()Z
/*     */       //   174: ifeq -> 214
/*     */       //   177: aload #12
/*     */       //   179: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   184: astore #13
/*     */       //   186: aload #13
/*     */       //   188: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   191: astore #14
/*     */       //   193: iconst_0
/*     */       //   194: istore #15
/*     */       //   196: aload #14
/*     */       //   198: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */       //   201: ldc 'Placeholder'
/*     */       //   203: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   206: ifeq -> 167
/*     */       //   209: aload #13
/*     */       //   211: goto -> 215
/*     */       //   214: aconst_null
/*     */       //   215: checkcast androidx/compose/ui/layout/Measurable
/*     */       //   218: dup
/*     */       //   219: ifnull -> 232
/*     */       //   222: lload #6
/*     */       //   224: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */       //   229: goto -> 234
/*     */       //   232: pop
/*     */       //   233: aconst_null
/*     */       //   234: astore #8
/*     */       //   236: aload_1
/*     */       //   237: aload #5
/*     */       //   239: invokevirtual getWidth : ()I
/*     */       //   242: aload #5
/*     */       //   244: invokevirtual getHeight : ()I
/*     */       //   247: aconst_null
/*     */       //   248: aload #8
/*     */       //   250: aload #5
/*     */       //   252: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */       //   257: iconst_4
/*     */       //   258: aconst_null
/*     */       //   259: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */       //   262: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #281	-> 12
/*     */       //   #307	-> 21
/*     */       //   #308	-> 24
/*     */       //   #309	-> 27
/*     */       //   #310	-> 55
/*     */       //   #281	-> 65
/*     */       //   #310	-> 75
/*     */       //   #311	-> 78
/*     */       //   #312	-> 93
/*     */       //   #313	-> 97
/*     */       //   #316	-> 103
/*     */       //   #318	-> 118
/*     */       //   #281	-> 123
/*     */       //   #280	-> 129
/*     */       //   #287	-> 131
/*     */       //   #288	-> 132
/*     */       //   #289	-> 137
/*     */       //   #290	-> 142
/*     */       //   #286	-> 147
/*     */       //   #285	-> 150
/*     */       //   #293	-> 152
/*     */       //   #319	-> 193
/*     */       //   #293	-> 196
/*     */       //   #293	-> 206
/*     */       //   #293	-> 215
/*     */       //   #292	-> 234
/*     */       //   #295	-> 236
/*     */       //   #301	-> 262
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   65	10	13	$i$a$-single-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1$textAreaPlaceable$1	I
/*     */       //   62	13	12	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   55	45	11	element$iv	Ljava/lang/Object;
/*     */       //   21	99	7	$i$f$single	I
/*     */       //   24	96	8	single$iv	Ljava/lang/Object;
/*     */       //   27	93	9	found$iv	Z
/*     */       //   18	102	6	$this$single$iv	Ljava/lang/Iterable;
/*     */       //   196	10	15	$i$a$-find-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1$placeholderPlaceable$1	I
/*     */       //   193	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */       //   131	132	5	textAreaPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   152	111	6	placeholderConstraints	J
/*     */       //   236	27	8	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */       //   0	263	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1;
/*     */       //   0	263	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */       //   0	263	2	measurables	Ljava/util/List;
/*     */       //   0	263	3	incomingConstraints	J
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
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\HeightAutoSizingTextAreaKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */