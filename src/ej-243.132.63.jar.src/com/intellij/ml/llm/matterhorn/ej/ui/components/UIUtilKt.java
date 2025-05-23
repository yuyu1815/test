/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*     */ 
/*     */ import androidx.compose.foundation.interaction.Interaction;
/*     */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.input.key.Key;
/*     */ import androidx.compose.ui.input.key.KeyEvent;
/*     */ import androidx.compose.ui.input.key.KeyEvent_desktopKt;
/*     */ import androidx.compose.ui.input.key.KeyInputModifierKt;
/*     */ import androidx.compose.ui.layout.LayoutCoordinates;
/*     */ import androidx.compose.ui.platform.InspectorInfo;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.SystemInfo;
/*     */ import com.intellij.openapi.wm.ToolWindowAnchor;
/*     */ import com.intellij.openapi.wm.ToolWindowManager;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.math.MathKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaColors;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\032\037\020\000\032\0020\001*\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\007¢\006\002\020\005\032)\020\006\032\0020\001*\0020\0012\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f¢\006\004\b\r\020\016\032*\020\017\032\0020\001*\0020\0012\027\020\002\032\023\022\004\022\0020\021\022\004\022\0020\0040\020¢\006\002\b\022H\007¢\006\002\020\023\032+\020\024\032\0020\0042\034\020\025\032\030\022\004\022\0020\026\022\004\022\0020\0040\020¢\006\002\b\027¢\006\002\b\022H\007¢\006\002\020\030\032\031\020\031\032\0020\032*\0020\0322\006\020\033\032\0020\f¢\006\004\b\034\020\035\032\031\020\031\032\0020\036*\0020\0362\006\020\033\032\0020\f¢\006\004\b\034\020\037\032\025\020 \032\0020!2\006\020\"\032\0020#H\007¢\006\002\020$¨\006%²\006\n\020&\032\0020\nX\002"}, d2 = {"copyEventAction", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "toolWindowBorder", "project", "Lcom/intellij/openapi/project/Project;", "isDarkTheme", "", "color", "Landroidx/compose/ui/graphics/Color;", "toolWindowBorder-g2O1Hgs", "(Landroidx/compose/ui/Modifier;Lcom/intellij/openapi/project/Project;ZJ)Landroidx/compose/ui/Modifier;", "clickableWithAwtCoordinates", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "ContainerWithHover", "content", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ContainerHoverScope;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "copy", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "caret", "copy-4WTKRHQ", "(Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;J)Lorg/jetbrains/jewel/ui/component/styling/TextAreaStyle;", "Lorg/jetbrains/jewel/ui/component/styling/TextAreaColors;", "(Lorg/jetbrains/jewel/ui/component/styling/TextAreaColors;J)Lorg/jetbrains/jewel/ui/component/styling/TextAreaColors;", "pxToDp", "Landroidx/compose/ui/unit/Dp;", "px", "", "(ILandroidx/compose/runtime/Composer;I)F", "ej-ui", "hovered"})
/*     */ @SourceDebugExtension({"SMAP\nUIUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,179:1\n1225#2,6:180\n1225#2,6:187\n1225#2,6:193\n1225#2,6:199\n1225#2,6:205\n1225#2,6:211\n1225#2,6:217\n1225#2,6:223\n77#3:186\n77#3:229\n1#4:230\n81#5:231\n107#5,2:232\n*S KotlinDebug\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt\n*L\n52#1:180,6\n96#1:187,6\n107#1:193,6\n109#1:199,6\n123#1:205,6\n124#1:211,6\n126#1:217,6\n137#1:223,6\n94#1:186\n177#1:229\n124#1:231\n124#1:232,2\n*E\n"})
/*     */ public final class UIUtilKt {
/*     */   @Composable
/*     */   @NotNull
/*  51 */   public static final Modifier copyEventAction(@NotNull Modifier $this$copyEventAction, @NotNull Function0<Unit> onClick, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$copyEventAction, "<this>"); Intrinsics.checkNotNullParameter(onClick, "onClick"); $composer.startReplaceGroup(-156650554); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-156650554, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.copyEventAction (UIUtil.kt:50)"); 
/*  52 */     $composer.startReplaceGroup(1859979947); Composer composer = $composer; boolean invalid$iv = ((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(onClick)) || ($changed & 0x30) == 32); int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 180 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 181 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 182 */       Modifier modifier1 = $this$copyEventAction; int $i$a$-cache-UIUtilKt$copyEventAction$1 = 0; Object value$iv = new UIUtilKt$copyEventAction$1$1(onClick);
/* 183 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 185 */     Function1 function1 = (Function1)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     Modifier modifier = KeyInputModifierKt.onKeyEvent(modifier1, function1);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return modifier; }
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class UIUtilKt$copyEventAction$1$1 implements Function1<KeyEvent, Boolean> {
/*     */     public final Boolean invoke-ZmokQxo(Object keyEvent) { Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
/*     */       boolean isMac = SystemInfo.isMac;
/*     */       boolean isKeyC = Key.equals-impl0(KeyEvent_desktopKt.getKey-ZmokQxo(keyEvent), Key.Companion.getC-EK5gGoQ());
/*     */       if ((isMac && KeyEvent_desktopKt.isMetaPressed-ZmokQxo(keyEvent) && isKeyC) || (!isMac && KeyEvent_desktopKt.isCtrlPressed-ZmokQxo(keyEvent) && isKeyC))
/*     */         this.$onClick.invoke(); 
/*     */       return Boolean.valueOf(false); }
/*     */     UIUtilKt$copyEventAction$1$1(Function0<Unit> $onClick) {} }
/*     */   @NotNull
/*     */   public static final Modifier toolWindowBorder-g2O1Hgs(@NotNull Modifier $this$toolWindowBorder_u2dg2O1Hgs, @NotNull Project project, boolean isDarkTheme, long color) { Intrinsics.checkNotNullParameter($this$toolWindowBorder_u2dg2O1Hgs, "$this$toolWindowBorder");
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     if (!isDarkTheme)
/*     */       return $this$toolWindowBorder_u2dg2O1Hgs; 
/*     */     ToolWindowManager.Companion.getInstance(project).getToolWindow("ElectroJunToolWindow");
/*     */     ToolWindowAnchor anchor = (ToolWindowManager.Companion.getInstance(project).getToolWindow("ElectroJunToolWindow") != null) ? ToolWindowManager.Companion.getInstance(project).getToolWindow("ElectroJunToolWindow").getAnchor() : null;
/*     */     if (Intrinsics.areEqual(anchor, ToolWindowAnchor.LEFT) || Intrinsics.areEqual(anchor, ToolWindowAnchor.RIGHT))
/*     */       return ComposedModifierKt.composed($this$toolWindowBorder_u2dg2O1Hgs, UIUtilKt::toolWindowBorder_g2O1Hgs$lambda$1, new UIUtilKt$toolWindowBorder$2(anchor, color)); 
/*     */     return $this$toolWindowBorder_u2dg2O1Hgs; } private static final Unit toolWindowBorder_g2O1Hgs$lambda$1(InspectorInfo $this$composed) {
/*     */     Intrinsics.checkNotNullParameter($this$composed, "$this$composed");
/*     */     return Unit.INSTANCE;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nUIUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,179:1\n77#2:180\n1#3:181\n149#4:182\n1225#5,6:183\n*S KotlinDebug\n*F\n+ 1 UIUtil.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2\n*L\n77#1:180\n77#1:182\n78#1:183,6\n*E\n"})
/*     */   static final class UIUtilKt$toolWindowBorder$2 implements Function3<Modifier, Composer, Integer, Modifier> {
/*     */     @Composable
/*     */     public final Modifier invoke(Modifier $this$composed, Composer $composer, int $changed) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$composed'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc -267914385
/*     */       //   9: invokeinterface startReplaceGroup : (I)V
/*     */       //   14: invokestatic isTraceInProgress : ()Z
/*     */       //   17: ifeq -> 29
/*     */       //   20: ldc -267914385
/*     */       //   22: iload_3
/*     */       //   23: iconst_m1
/*     */       //   24: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.toolWindowBorder.<anonymous> (UIUtil.kt:76)'
/*     */       //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */       //   29: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */       //   32: checkcast androidx/compose/runtime/CompositionLocal
/*     */       //   35: astore #5
/*     */       //   37: iconst_0
/*     */       //   38: istore #6
/*     */       //   40: iconst_0
/*     */       //   41: istore #7
/*     */       //   43: aload_2
/*     */       //   44: ldc 2023513938
/*     */       //   46: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */       //   48: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */       //   51: aload_2
/*     */       //   52: aload #5
/*     */       //   54: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */       //   59: astore #8
/*     */       //   61: aload_2
/*     */       //   62: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */       //   65: aload #8
/*     */       //   67: checkcast androidx/compose/ui/unit/Density
/*     */       //   70: astore #6
/*     */       //   72: iconst_0
/*     */       //   73: istore #7
/*     */       //   75: aload #6
/*     */       //   77: iconst_1
/*     */       //   78: istore #8
/*     */       //   80: iconst_0
/*     */       //   81: istore #9
/*     */       //   83: iload #8
/*     */       //   85: i2f
/*     */       //   86: invokestatic constructor-impl : (F)F
/*     */       //   89: invokeinterface toPx-0680j_4 : (F)F
/*     */       //   94: nop
/*     */       //   95: fstore #4
/*     */       //   97: aload_1
/*     */       //   98: aload_2
/*     */       //   99: ldc 1332290085
/*     */       //   101: invokeinterface startReplaceGroup : (I)V
/*     */       //   106: aload_2
/*     */       //   107: astore #7
/*     */       //   109: aload_2
/*     */       //   110: aload_0
/*     */       //   111: getfield $anchor : Lcom/intellij/openapi/wm/ToolWindowAnchor;
/*     */       //   114: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */       //   119: aload_2
/*     */       //   120: aload_0
/*     */       //   121: getfield $color : J
/*     */       //   124: invokeinterface changed : (J)Z
/*     */       //   129: ior
/*     */       //   130: aload_2
/*     */       //   131: fload #4
/*     */       //   133: invokeinterface changed : (F)Z
/*     */       //   138: ior
/*     */       //   139: istore #8
/*     */       //   141: aload_0
/*     */       //   142: getfield $anchor : Lcom/intellij/openapi/wm/ToolWindowAnchor;
/*     */       //   145: astore #9
/*     */       //   147: aload_0
/*     */       //   148: getfield $color : J
/*     */       //   151: lstore #10
/*     */       //   153: iconst_0
/*     */       //   154: istore #12
/*     */       //   156: aload #7
/*     */       //   158: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */       //   163: astore #13
/*     */       //   165: iconst_0
/*     */       //   166: istore #14
/*     */       //   168: iload #8
/*     */       //   170: ifne -> 184
/*     */       //   173: aload #13
/*     */       //   175: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */       //   178: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */       //   181: if_acmpne -> 219
/*     */       //   184: astore #17
/*     */       //   186: iconst_0
/*     */       //   187: istore #15
/*     */       //   189: aload #9
/*     */       //   191: lload #10
/*     */       //   193: fload #4
/*     */       //   195: <illegal opcode> invoke : (Lcom/intellij/openapi/wm/ToolWindowAnchor;JF)Lkotlin/jvm/functions/Function1;
/*     */       //   200: aload #17
/*     */       //   202: swap
/*     */       //   203: astore #16
/*     */       //   205: aload #7
/*     */       //   207: aload #16
/*     */       //   209: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */       //   214: aload #16
/*     */       //   216: goto -> 221
/*     */       //   219: aload #13
/*     */       //   221: nop
/*     */       //   222: nop
/*     */       //   223: nop
/*     */       //   224: checkcast kotlin/jvm/functions/Function1
/*     */       //   227: astore #6
/*     */       //   229: aload_2
/*     */       //   230: invokeinterface endReplaceGroup : ()V
/*     */       //   235: aload #6
/*     */       //   237: invokestatic drawBehind : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */       //   240: astore #5
/*     */       //   242: invokestatic isTraceInProgress : ()Z
/*     */       //   245: ifeq -> 251
/*     */       //   248: invokestatic traceEventEnd : ()V
/*     */       //   251: aload_2
/*     */       //   252: invokeinterface endReplaceGroup : ()V
/*     */       //   257: aload #5
/*     */       //   259: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #77	-> 26
/*     */       //   #180	-> 48
/*     */       //   #77	-> 67
/*     */       //   #181	-> 72
/*     */       //   #77	-> 75
/*     */       //   #182	-> 83
/*     */       //   #77	-> 89
/*     */       //   #77	-> 94
/*     */       //   #77	-> 95
/*     */       //   #78	-> 97
/*     */       //   #183	-> 156
/*     */       //   #184	-> 168
/*     */       //   #185	-> 184
/*     */       //   #78	-> 189
/*     */       //   #185	-> 203
/*     */       //   #186	-> 205
/*     */       //   #187	-> 214
/*     */       //   #188	-> 219
/*     */       //   #184	-> 221
/*     */       //   #183	-> 222
/*     */       //   #183	-> 223
/*     */       //   #78	-> 224
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   43	24	7	$i$f$getCurrent	I
/*     */       //   40	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */       //   40	27	6	$changed$iv	I
/*     */       //   83	6	9	$i$f$getDp	I
/*     */       //   80	9	8	$this$dp$iv	I
/*     */       //   75	19	7	$i$a$-run-UIUtilKt$toolWindowBorder$2$strokeWidth$1	I
/*     */       //   72	22	6	$this$invoke_u24lambda_u240	Landroidx/compose/ui/unit/Density;
/*     */       //   189	11	15	$i$a$-cache-UIUtilKt$toolWindowBorder$2$1	I
/*     */       //   205	11	16	value$iv	Ljava/lang/Object;
/*     */       //   168	54	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */       //   165	57	13	it$iv	Ljava/lang/Object;
/*     */       //   156	68	12	$i$f$cache	I
/*     */       //   153	71	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */       //   153	71	8	invalid$iv	Z
/*     */       //   97	163	4	strokeWidth	F
/*     */       //   0	260	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$toolWindowBorder$2;
/*     */       //   0	260	1	$this$composed	Landroidx/compose/ui/Modifier;
/*     */       //   0	260	2	$composer	Landroidx/compose/runtime/Composer;
/*     */       //   0	260	3	$changed	I
/*     */     } private static final Unit invoke$lambda$2$lambda$1(ToolWindowAnchor $anchor, long $color, float $strokeWidth, DrawScope $this$drawBehind) {
/*     */       Intrinsics.checkNotNullParameter($this$drawBehind, "$this$drawBehind");
/*     */       if (Intrinsics.areEqual($anchor, ToolWindowAnchor.LEFT)) {
/*     */         DrawScope.drawLine-NGM6Ib0$default($this$drawBehind, $color, OffsetKt.Offset(0.0F, 0.0F), OffsetKt.Offset(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()), 0.0F), $strokeWidth, 0, null, 0.0F, null, 0, 496, null);
/*     */       } else {
/*     */         DrawScope.drawLine-NGM6Ib0$default($this$drawBehind, $color, OffsetKt.Offset(0.0F, Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc())), OffsetKt.Offset(Size.getWidth-impl($this$drawBehind.getSize-NH-jbRc()), Size.getHeight-impl($this$drawBehind.getSize-NH-jbRc())), $strokeWidth, 0, null, 0.0F, null, 0, 496, null);
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     } UIUtilKt$toolWindowBorder$2(ToolWindowAnchor $anchor, long $color) {} } private static final boolean ContainerWithHover$lambda$10(MutableState $hovered$delegate) { State state = (State)$hovered$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 231 */     return ((Boolean)state.getValue()).booleanValue(); }
/*     */   @Composable @NotNull public static final Modifier clickableWithAwtCoordinates(@NotNull Modifier $this$clickableWithAwtCoordinates, @NotNull Function1 onClick, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'onClick'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 239893137
/*     */     //   15: invokeinterface startReplaceGroup : (I)V
/*     */     //   20: invokestatic isTraceInProgress : ()Z
/*     */     //   23: ifeq -> 35
/*     */     //   26: ldc 239893137
/*     */     //   28: iload_3
/*     */     //   29: iconst_m1
/*     */     //   30: ldc 'com.intellij.ml.llm.matterhorn.ej.ui.components.clickableWithAwtCoordinates (UIUtil.kt:92)'
/*     */     //   32: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   35: new com/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope
/*     */     //   38: dup
/*     */     //   39: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   42: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   45: astore #5
/*     */     //   47: iconst_0
/*     */     //   48: istore #6
/*     */     //   50: iconst_0
/*     */     //   51: istore #7
/*     */     //   53: aload_2
/*     */     //   54: ldc 2023513938
/*     */     //   56: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   58: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   61: aload_2
/*     */     //   62: aload #5
/*     */     //   64: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   69: astore #8
/*     */     //   71: aload_2
/*     */     //   72: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   75: aload #8
/*     */     //   77: checkcast androidx/compose/ui/unit/Density
/*     */     //   80: invokestatic getLocalComponent : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   83: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   86: astore #5
/*     */     //   88: iconst_0
/*     */     //   89: istore #6
/*     */     //   91: iconst_0
/*     */     //   92: istore #7
/*     */     //   94: aload_2
/*     */     //   95: ldc 2023513938
/*     */     //   97: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   99: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   102: aload_2
/*     */     //   103: aload #5
/*     */     //   105: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   110: astore #8
/*     */     //   112: aload_2
/*     */     //   113: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   116: aload #8
/*     */     //   118: checkcast javax/swing/JComponent
/*     */     //   121: aconst_null
/*     */     //   122: iconst_4
/*     */     //   123: aconst_null
/*     */     //   124: invokespecial <init> : (Landroidx/compose/ui/unit/Density;Ljavax/swing/JComponent;Ljava/awt/Rectangle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   127: astore #4
/*     */     //   129: aload_0
/*     */     //   130: aload_2
/*     */     //   131: ldc -1183415547
/*     */     //   133: invokeinterface startReplaceGroup : (I)V
/*     */     //   138: aload_2
/*     */     //   139: astore #7
/*     */     //   141: aload_2
/*     */     //   142: aload #4
/*     */     //   144: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   149: istore #8
/*     */     //   151: iconst_0
/*     */     //   152: istore #9
/*     */     //   154: aload #7
/*     */     //   156: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   161: astore #10
/*     */     //   163: iconst_0
/*     */     //   164: istore #11
/*     */     //   166: iload #8
/*     */     //   168: ifne -> 182
/*     */     //   171: aload #10
/*     */     //   173: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   176: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   179: if_acmpne -> 213
/*     */     //   182: astore #14
/*     */     //   184: iconst_0
/*     */     //   185: istore #12
/*     */     //   187: aload #4
/*     */     //   189: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope;)Lkotlin/jvm/functions/Function1;
/*     */     //   194: aload #14
/*     */     //   196: swap
/*     */     //   197: astore #13
/*     */     //   199: aload #7
/*     */     //   201: aload #13
/*     */     //   203: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   208: aload #13
/*     */     //   210: goto -> 215
/*     */     //   213: aload #10
/*     */     //   215: nop
/*     */     //   216: nop
/*     */     //   217: nop
/*     */     //   218: checkcast kotlin/jvm/functions/Function1
/*     */     //   221: astore #6
/*     */     //   223: aload_2
/*     */     //   224: invokeinterface endReplaceGroup : ()V
/*     */     //   229: aload #6
/*     */     //   231: invokestatic onGloballyPositioned : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*     */     //   234: aload_2
/*     */     //   235: ldc -1183404343
/*     */     //   237: invokeinterface startReplaceGroup : (I)V
/*     */     //   242: aload_2
/*     */     //   243: astore #7
/*     */     //   245: iconst_0
/*     */     //   246: istore #8
/*     */     //   248: nop
/*     */     //   249: iconst_0
/*     */     //   250: istore #9
/*     */     //   252: aload #7
/*     */     //   254: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   259: astore #10
/*     */     //   261: iconst_0
/*     */     //   262: istore #11
/*     */     //   264: aload #10
/*     */     //   266: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   269: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   272: if_acmpne -> 302
/*     */     //   275: astore #14
/*     */     //   277: iconst_0
/*     */     //   278: istore #12
/*     */     //   280: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   283: aload #14
/*     */     //   285: swap
/*     */     //   286: astore #12
/*     */     //   288: aload #7
/*     */     //   290: aload #12
/*     */     //   292: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   297: aload #12
/*     */     //   299: goto -> 304
/*     */     //   302: aload #10
/*     */     //   304: nop
/*     */     //   305: nop
/*     */     //   306: nop
/*     */     //   307: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   310: astore #6
/*     */     //   312: aload_2
/*     */     //   313: invokeinterface endReplaceGroup : ()V
/*     */     //   318: aload #6
/*     */     //   320: aconst_null
/*     */     //   321: iconst_0
/*     */     //   322: aconst_null
/*     */     //   323: aconst_null
/*     */     //   324: aload_2
/*     */     //   325: ldc -1183401861
/*     */     //   327: invokeinterface startReplaceGroup : (I)V
/*     */     //   332: aload_2
/*     */     //   333: astore #7
/*     */     //   335: iload_3
/*     */     //   336: bipush #112
/*     */     //   338: iand
/*     */     //   339: bipush #48
/*     */     //   341: ixor
/*     */     //   342: bipush #32
/*     */     //   344: if_icmple -> 357
/*     */     //   347: aload_2
/*     */     //   348: aload_1
/*     */     //   349: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   354: ifne -> 366
/*     */     //   357: iload_3
/*     */     //   358: bipush #48
/*     */     //   360: iand
/*     */     //   361: bipush #32
/*     */     //   363: if_icmpne -> 370
/*     */     //   366: iconst_1
/*     */     //   367: goto -> 371
/*     */     //   370: iconst_0
/*     */     //   371: aload_2
/*     */     //   372: aload #4
/*     */     //   374: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   379: ior
/*     */     //   380: istore #8
/*     */     //   382: nop
/*     */     //   383: iconst_0
/*     */     //   384: istore #9
/*     */     //   386: aload #7
/*     */     //   388: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   393: astore #10
/*     */     //   395: iconst_0
/*     */     //   396: istore #11
/*     */     //   398: iload #8
/*     */     //   400: ifne -> 414
/*     */     //   403: aload #10
/*     */     //   405: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   408: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   411: if_acmpne -> 469
/*     */     //   414: astore #19
/*     */     //   416: astore #18
/*     */     //   418: istore #17
/*     */     //   420: astore #16
/*     */     //   422: astore #15
/*     */     //   424: astore #14
/*     */     //   426: iconst_0
/*     */     //   427: istore #12
/*     */     //   429: aload_1
/*     */     //   430: aload #4
/*     */     //   432: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope;)Lkotlin/jvm/functions/Function0;
/*     */     //   437: astore #20
/*     */     //   439: aload #14
/*     */     //   441: aload #15
/*     */     //   443: aload #16
/*     */     //   445: iload #17
/*     */     //   447: aload #18
/*     */     //   449: aload #19
/*     */     //   451: aload #20
/*     */     //   453: astore #13
/*     */     //   455: aload #7
/*     */     //   457: aload #13
/*     */     //   459: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   464: aload #13
/*     */     //   466: goto -> 471
/*     */     //   469: aload #10
/*     */     //   471: nop
/*     */     //   472: nop
/*     */     //   473: nop
/*     */     //   474: checkcast kotlin/jvm/functions/Function0
/*     */     //   477: astore #6
/*     */     //   479: aload_2
/*     */     //   480: invokeinterface endReplaceGroup : ()V
/*     */     //   485: aload #6
/*     */     //   487: bipush #28
/*     */     //   489: aconst_null
/*     */     //   490: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   493: astore #5
/*     */     //   495: invokestatic isTraceInProgress : ()Z
/*     */     //   498: ifeq -> 504
/*     */     //   501: invokestatic traceEventEnd : ()V
/*     */     //   504: aload_2
/*     */     //   505: invokeinterface endReplaceGroup : ()V
/*     */     //   510: aload #5
/*     */     //   512: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 32
/*     */     //   #94	-> 35
/*     */     //   #186	-> 58
/*     */     //   #94	-> 80
/*     */     //   #186	-> 99
/*     */     //   #94	-> 121
/*     */     //   #96	-> 129
/*     */     //   #187	-> 154
/*     */     //   #188	-> 166
/*     */     //   #189	-> 182
/*     */     //   #96	-> 187
/*     */     //   #189	-> 197
/*     */     //   #190	-> 199
/*     */     //   #191	-> 208
/*     */     //   #192	-> 213
/*     */     //   #188	-> 215
/*     */     //   #187	-> 216
/*     */     //   #187	-> 217
/*     */     //   #96	-> 218
/*     */     //   #107	-> 248
/*     */     //   #193	-> 252
/*     */     //   #194	-> 264
/*     */     //   #195	-> 275
/*     */     //   #107	-> 280
/*     */     //   #195	-> 286
/*     */     //   #196	-> 288
/*     */     //   #197	-> 297
/*     */     //   #198	-> 302
/*     */     //   #194	-> 304
/*     */     //   #193	-> 305
/*     */     //   #193	-> 306
/*     */     //   #107	-> 307
/*     */     //   #108	-> 320
/*     */     //   #106	-> 321
/*     */     //   #109	-> 382
/*     */     //   #199	-> 386
/*     */     //   #200	-> 398
/*     */     //   #201	-> 414
/*     */     //   #109	-> 429
/*     */     //   #201	-> 453
/*     */     //   #202	-> 455
/*     */     //   #203	-> 464
/*     */     //   #204	-> 469
/*     */     //   #200	-> 471
/*     */     //   #199	-> 472
/*     */     //   #199	-> 473
/*     */     //   #109	-> 474
/*     */     //   #106	-> 487
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   53	24	7	$i$f$getCurrent	I
/*     */     //   50	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   50	27	6	$changed$iv	I
/*     */     //   94	24	7	$i$f$getCurrent	I
/*     */     //   91	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   91	27	6	$changed$iv	I
/*     */     //   187	7	12	$i$a$-cache-UIUtilKt$clickableWithAwtCoordinates$1	I
/*     */     //   199	11	13	value$iv	Ljava/lang/Object;
/*     */     //   166	50	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   163	53	10	it$iv	Ljava/lang/Object;
/*     */     //   154	64	9	$i$f$cache	I
/*     */     //   151	67	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   151	67	8	invalid$iv	Z
/*     */     //   280	3	12	$i$a$-cache-UIUtilKt$clickableWithAwtCoordinates$2	I
/*     */     //   288	11	12	value$iv	Ljava/lang/Object;
/*     */     //   264	41	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   261	44	10	it$iv	Ljava/lang/Object;
/*     */     //   252	55	9	$i$f$cache	I
/*     */     //   249	58	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   249	58	8	invalid$iv	Z
/*     */     //   429	8	12	$i$a$-cache-UIUtilKt$clickableWithAwtCoordinates$3	I
/*     */     //   455	11	13	value$iv	Ljava/lang/Object;
/*     */     //   398	74	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   395	77	10	it$iv	Ljava/lang/Object;
/*     */     //   386	88	9	$i$f$cache	I
/*     */     //   383	91	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   383	91	8	invalid$iv	Z
/*     */     //   129	384	4	scope	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/ComponentAwtScope;
/*     */     //   0	513	0	$this$clickableWithAwtCoordinates	Landroidx/compose/ui/Modifier;
/*     */     //   0	513	1	onClick	Lkotlin/jvm/functions/Function1;
/*     */     //   0	513	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	513	3	$changed	I } private static final Unit clickableWithAwtCoordinates$lambda$4$lambda$3(ComponentAwtScope $scope, LayoutCoordinates coordinates) { Intrinsics.checkNotNullParameter(coordinates, "coordinates"); Rect bounds = LayoutCoordinatesKt.boundsInRoot(coordinates); Density $this$clickableWithAwtCoordinates_u24lambda_u244_u24lambda_u243_u24lambda_u242 = $scope.getDensity$ej_ui(); int $i$a$-with-UIUtilKt$clickableWithAwtCoordinates$1$1$1 = 0; $scope.getBounds().setBounds(MathKt.roundToInt($this$clickableWithAwtCoordinates_u24lambda_u244_u24lambda_u243_u24lambda_u242.toDp-u2uoSUM(bounds.getLeft())), MathKt.roundToInt($this$clickableWithAwtCoordinates_u24lambda_u244_u24lambda_u243_u24lambda_u242.toDp-u2uoSUM(bounds.getTop())), MathKt.roundToInt($this$clickableWithAwtCoordinates_u24lambda_u244_u24lambda_u243_u24lambda_u242.toDp-u2uoSUM(bounds.getWidth())), MathKt.roundToInt($this$clickableWithAwtCoordinates_u24lambda_u244_u24lambda_u243_u24lambda_u242.toDp-u2uoSUM(bounds.getHeight()))); return Unit.INSTANCE; } private static final Unit clickableWithAwtCoordinates$lambda$7$lambda$6(Function1 $onClick, ComponentAwtScope $scope) { $onClick.invoke($scope); return Unit.INSTANCE; } @Composable @ComposableInferredTarget(scheme = "[0[0]]") public static final void ContainerWithHover(@NotNull Function3 content, @Nullable Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w 'content'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_1
/*     */     //   8: ldc_w 926617950
/*     */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*     */     //   16: astore_1
/*     */     //   17: iload_2
/*     */     //   18: istore_3
/*     */     //   19: iload_2
/*     */     //   20: bipush #6
/*     */     //   22: iand
/*     */     //   23: ifne -> 44
/*     */     //   26: iload_3
/*     */     //   27: aload_1
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   34: ifeq -> 41
/*     */     //   37: iconst_4
/*     */     //   38: goto -> 42
/*     */     //   41: iconst_2
/*     */     //   42: ior
/*     */     //   43: istore_3
/*     */     //   44: iload_3
/*     */     //   45: iconst_3
/*     */     //   46: iand
/*     */     //   47: iconst_2
/*     */     //   48: if_icmpne -> 60
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getSkipping : ()Z
/*     */     //   57: ifne -> 540
/*     */     //   60: invokestatic isTraceInProgress : ()Z
/*     */     //   63: ifeq -> 77
/*     */     //   66: ldc_w 926617950
/*     */     //   69: iload_3
/*     */     //   70: iconst_m1
/*     */     //   71: ldc_w 'com.intellij.ml.llm.matterhorn.ej.ui.components.ContainerWithHover (UIUtil.kt:121)'
/*     */     //   74: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   77: aload_1
/*     */     //   78: ldc_w 2116347359
/*     */     //   81: invokeinterface startReplaceGroup : (I)V
/*     */     //   86: aload_1
/*     */     //   87: astore #6
/*     */     //   89: iconst_0
/*     */     //   90: istore #7
/*     */     //   92: nop
/*     */     //   93: iconst_0
/*     */     //   94: istore #8
/*     */     //   96: aload #6
/*     */     //   98: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   103: astore #9
/*     */     //   105: iconst_0
/*     */     //   106: istore #10
/*     */     //   108: aload #9
/*     */     //   110: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   113: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   116: if_acmpne -> 141
/*     */     //   119: iconst_0
/*     */     //   120: istore #11
/*     */     //   122: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   125: astore #11
/*     */     //   127: aload #6
/*     */     //   129: aload #11
/*     */     //   131: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   136: aload #11
/*     */     //   138: goto -> 143
/*     */     //   141: aload #9
/*     */     //   143: nop
/*     */     //   144: nop
/*     */     //   145: nop
/*     */     //   146: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*     */     //   149: astore #5
/*     */     //   151: aload_1
/*     */     //   152: invokeinterface endReplaceGroup : ()V
/*     */     //   157: aload #5
/*     */     //   159: astore #4
/*     */     //   161: aload_1
/*     */     //   162: ldc_w 2116349178
/*     */     //   165: invokeinterface startReplaceGroup : (I)V
/*     */     //   170: aload_1
/*     */     //   171: astore #7
/*     */     //   173: iconst_0
/*     */     //   174: istore #8
/*     */     //   176: nop
/*     */     //   177: iconst_0
/*     */     //   178: istore #9
/*     */     //   180: aload #7
/*     */     //   182: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   187: astore #10
/*     */     //   189: iconst_0
/*     */     //   190: istore #11
/*     */     //   192: aload #10
/*     */     //   194: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   197: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   200: if_acmpne -> 232
/*     */     //   203: iconst_0
/*     */     //   204: istore #12
/*     */     //   206: iconst_0
/*     */     //   207: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   210: aconst_null
/*     */     //   211: iconst_2
/*     */     //   212: aconst_null
/*     */     //   213: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*     */     //   216: astore #12
/*     */     //   218: aload #7
/*     */     //   220: aload #12
/*     */     //   222: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   227: aload #12
/*     */     //   229: goto -> 234
/*     */     //   232: aload #10
/*     */     //   234: nop
/*     */     //   235: nop
/*     */     //   236: nop
/*     */     //   237: checkcast androidx/compose/runtime/MutableState
/*     */     //   240: astore #6
/*     */     //   242: aload_1
/*     */     //   243: invokeinterface endReplaceGroup : ()V
/*     */     //   248: aload #6
/*     */     //   250: astore #5
/*     */     //   252: aload #4
/*     */     //   254: aload_1
/*     */     //   255: ldc_w 2116351658
/*     */     //   258: invokeinterface startReplaceGroup : (I)V
/*     */     //   263: aload_1
/*     */     //   264: astore #7
/*     */     //   266: iconst_0
/*     */     //   267: istore #8
/*     */     //   269: iconst_0
/*     */     //   270: istore #9
/*     */     //   272: aload #7
/*     */     //   274: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   279: astore #10
/*     */     //   281: iconst_0
/*     */     //   282: istore #11
/*     */     //   284: aload #10
/*     */     //   286: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   289: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   292: if_acmpne -> 334
/*     */     //   295: astore #14
/*     */     //   297: iconst_0
/*     */     //   298: istore #12
/*     */     //   300: new com/intellij/ml/llm/matterhorn/ej/ui/components/UIUtilKt$ContainerWithHover$1$1
/*     */     //   303: dup
/*     */     //   304: aload #4
/*     */     //   306: aload #5
/*     */     //   308: aconst_null
/*     */     //   309: invokespecial <init> : (Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
/*     */     //   312: checkcast kotlin/jvm/functions/Function2
/*     */     //   315: aload #14
/*     */     //   317: swap
/*     */     //   318: astore #13
/*     */     //   320: aload #7
/*     */     //   322: aload #13
/*     */     //   324: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   329: aload #13
/*     */     //   331: goto -> 336
/*     */     //   334: aload #10
/*     */     //   336: nop
/*     */     //   337: nop
/*     */     //   338: nop
/*     */     //   339: checkcast kotlin/jvm/functions/Function2
/*     */     //   342: astore #6
/*     */     //   344: aload_1
/*     */     //   345: invokeinterface endReplaceGroup : ()V
/*     */     //   350: aload #6
/*     */     //   352: aload_1
/*     */     //   353: bipush #6
/*     */     //   355: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   358: aload_0
/*     */     //   359: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*     */     //   362: checkcast androidx/compose/ui/Modifier
/*     */     //   365: aload #4
/*     */     //   367: aconst_null
/*     */     //   368: iconst_0
/*     */     //   369: aconst_null
/*     */     //   370: aconst_null
/*     */     //   371: aload_1
/*     */     //   372: ldc_w 2116360986
/*     */     //   375: invokeinterface startReplaceGroup : (I)V
/*     */     //   380: aload_1
/*     */     //   381: astore #7
/*     */     //   383: iconst_0
/*     */     //   384: istore #8
/*     */     //   386: iconst_0
/*     */     //   387: istore #9
/*     */     //   389: aload #7
/*     */     //   391: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   396: astore #10
/*     */     //   398: iconst_0
/*     */     //   399: istore #11
/*     */     //   401: aload #10
/*     */     //   403: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   406: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   409: if_acmpne -> 468
/*     */     //   412: astore #20
/*     */     //   414: astore #19
/*     */     //   416: istore #18
/*     */     //   418: astore #17
/*     */     //   420: astore #16
/*     */     //   422: astore #15
/*     */     //   424: astore #14
/*     */     //   426: iconst_0
/*     */     //   427: istore #12
/*     */     //   429: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   434: astore #21
/*     */     //   436: aload #14
/*     */     //   438: aload #15
/*     */     //   440: aload #16
/*     */     //   442: aload #17
/*     */     //   444: iload #18
/*     */     //   446: aload #19
/*     */     //   448: aload #20
/*     */     //   450: aload #21
/*     */     //   452: astore #12
/*     */     //   454: aload #7
/*     */     //   456: aload #12
/*     */     //   458: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   463: aload #12
/*     */     //   465: goto -> 470
/*     */     //   468: aload #10
/*     */     //   470: nop
/*     */     //   471: nop
/*     */     //   472: nop
/*     */     //   473: checkcast kotlin/jvm/functions/Function0
/*     */     //   476: astore #6
/*     */     //   478: aload_1
/*     */     //   479: invokeinterface endReplaceGroup : ()V
/*     */     //   484: aload #6
/*     */     //   486: bipush #28
/*     */     //   488: aconst_null
/*     */     //   489: invokestatic clickable-O2vRcR0$default : (Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;
/*     */     //   492: aload #5
/*     */     //   494: invokestatic ContainerWithHover$lambda$10 : (Landroidx/compose/runtime/MutableState;)Z
/*     */     //   497: istore #22
/*     */     //   499: astore #23
/*     */     //   501: new com/intellij/ml/llm/matterhorn/ej/ui/components/ContainerHoverScopeDelegate
/*     */     //   504: dup
/*     */     //   505: aload #23
/*     */     //   507: iload #22
/*     */     //   509: invokespecial <init> : (Landroidx/compose/ui/Modifier;Z)V
/*     */     //   512: aload_1
/*     */     //   513: bipush #112
/*     */     //   515: iload_3
/*     */     //   516: iconst_3
/*     */     //   517: ishl
/*     */     //   518: iand
/*     */     //   519: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   522: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   527: pop
/*     */     //   528: invokestatic isTraceInProgress : ()Z
/*     */     //   531: ifeq -> 546
/*     */     //   534: invokestatic traceEventEnd : ()V
/*     */     //   537: goto -> 546
/*     */     //   540: aload_1
/*     */     //   541: invokeinterface skipToGroupEnd : ()V
/*     */     //   546: aload_1
/*     */     //   547: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*     */     //   552: dup
/*     */     //   553: ifnull -> 571
/*     */     //   556: aload_0
/*     */     //   557: iload_2
/*     */     //   558: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function3;I)Lkotlin/jvm/functions/Function2;
/*     */     //   563: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*     */     //   568: goto -> 572
/*     */     //   571: pop
/*     */     //   572: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #122	-> 7
/*     */     //   #123	-> 92
/*     */     //   #205	-> 96
/*     */     //   #206	-> 108
/*     */     //   #207	-> 119
/*     */     //   #123	-> 122
/*     */     //   #207	-> 125
/*     */     //   #208	-> 127
/*     */     //   #209	-> 136
/*     */     //   #210	-> 141
/*     */     //   #206	-> 143
/*     */     //   #205	-> 144
/*     */     //   #205	-> 145
/*     */     //   #123	-> 146
/*     */     //   #124	-> 176
/*     */     //   #211	-> 180
/*     */     //   #212	-> 192
/*     */     //   #213	-> 203
/*     */     //   #124	-> 206
/*     */     //   #213	-> 216
/*     */     //   #214	-> 218
/*     */     //   #215	-> 227
/*     */     //   #216	-> 232
/*     */     //   #212	-> 234
/*     */     //   #211	-> 235
/*     */     //   #211	-> 236
/*     */     //   #124	-> 237
/*     */     //   #126	-> 252
/*     */     //   #217	-> 272
/*     */     //   #218	-> 284
/*     */     //   #219	-> 295
/*     */     //   #126	-> 300
/*     */     //   #219	-> 318
/*     */     //   #220	-> 320
/*     */     //   #221	-> 329
/*     */     //   #222	-> 334
/*     */     //   #218	-> 336
/*     */     //   #217	-> 337
/*     */     //   #217	-> 338
/*     */     //   #126	-> 339
/*     */     //   #135	-> 358
/*     */     //   #136	-> 359
/*     */     //   #137	-> 359
/*     */     //   #223	-> 389
/*     */     //   #224	-> 401
/*     */     //   #225	-> 412
/*     */     //   #225	-> 452
/*     */     //   #226	-> 454
/*     */     //   #227	-> 463
/*     */     //   #228	-> 468
/*     */     //   #224	-> 470
/*     */     //   #223	-> 471
/*     */     //   #223	-> 472
/*     */     //   #137	-> 473
/*     */     //   #138	-> 492
/*     */     //   #136	-> 497
/*     */     //   #135	-> 522
/*     */     //   #141	-> 540
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   122	3	11	$i$a$-cache-UIUtilKt$ContainerWithHover$interactionSource$1	I
/*     */     //   127	11	11	value$iv	Ljava/lang/Object;
/*     */     //   108	36	10	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   105	39	9	it$iv	Ljava/lang/Object;
/*     */     //   96	50	8	$i$f$cache	I
/*     */     //   93	53	6	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   93	53	7	invalid$iv	Z
/*     */     //   206	10	12	$i$a$-cache-UIUtilKt$ContainerWithHover$hovered$2	I
/*     */     //   218	11	12	value$iv	Ljava/lang/Object;
/*     */     //   192	43	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   189	46	10	it$iv	Ljava/lang/Object;
/*     */     //   180	57	9	$i$f$cache	I
/*     */     //   177	60	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   177	60	8	invalid$iv	Z
/*     */     //   300	15	12	$i$a$-cache-UIUtilKt$ContainerWithHover$1	I
/*     */     //   320	11	13	value$iv	Ljava/lang/Object;
/*     */     //   284	53	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   281	56	10	it$iv	Ljava/lang/Object;
/*     */     //   272	67	9	$i$f$cache	I
/*     */     //   269	70	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   269	70	8	invalid$iv	Z
/*     */     //   429	5	12	$i$a$-cache-UIUtilKt$ContainerWithHover$2	I
/*     */     //   454	11	12	value$iv	Ljava/lang/Object;
/*     */     //   401	70	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   398	73	10	it$iv	Ljava/lang/Object;
/*     */     //   389	84	9	$i$f$cache	I
/*     */     //   386	87	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   386	87	8	invalid$iv	Z
/*     */     //   161	376	4	interactionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*     */     //   252	285	5	hovered$delegate	Landroidx/compose/runtime/MutableState;
/*     */     //   19	554	3	$dirty	I
/*     */     //   0	573	0	content	Lkotlin/jvm/functions/Function3;
/*     */     //   0	573	1	$composer	Landroidx/compose/runtime/Composer;
/* 232 */     //   0	573	2	$changed	I } private static final void ContainerWithHover$lambda$11(MutableState $hovered$delegate, boolean <set-?>) { MutableState mutableState = $hovered$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "UIUtil.kt", l = {127}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.components.UIUtilKt$ContainerWithHover$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class UIUtilKt$ContainerWithHover$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     UIUtilKt$ContainerWithHover$1$1(MutableInteractionSource $interactionSource, MutableState<Boolean> $hovered$delegate, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$interactionSource.getInteractions().collect(new FlowCollector(this.$hovered$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     UIUtilKt.ContainerWithHover$lambda$11(this.$hovered$delegate, true);
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     UIUtilKt.ContainerWithHover$lambda$11(this.$hovered$delegate, false);
/*     */                   } 
/*     */                   return Unit.INSTANCE;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           this.$interactionSource.getInteractions().collect(new FlowCollector(this.$hovered$delegate) {
/*     */                 public final Object emit(Interaction interaction, Continuation $completion) {
/*     */                   Interaction interaction1 = interaction;
/*     */                   if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
/*     */                     UIUtilKt.ContainerWithHover$lambda$11(this.$hovered$delegate, true);
/*     */                   } else if (interaction1 instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
/*     */                     UIUtilKt.ContainerWithHover$lambda$11(this.$hovered$delegate, false);
/*     */                   } 
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super UIUtilKt$ContainerWithHover$1$1> $completion) {
/*     */       return (Continuation<Unit>)new UIUtilKt$ContainerWithHover$1$1(this.$interactionSource, this.$hovered$delegate, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((UIUtilKt$ContainerWithHover$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit ContainerWithHover$lambda$14$lambda$13() {
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final TextAreaStyle copy-4WTKRHQ(@NotNull TextAreaStyle $this$copy_u2d4WTKRHQ, long caret) {
/*     */     Intrinsics.checkNotNullParameter($this$copy_u2d4WTKRHQ, "$this$copy");
/*     */     return new TextAreaStyle(copy-4WTKRHQ($this$copy_u2d4WTKRHQ.getColors(), caret), $this$copy_u2d4WTKRHQ.getMetrics());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final TextAreaColors copy-4WTKRHQ(@NotNull TextAreaColors $this$copy_u2d4WTKRHQ, long caret) {
/*     */     Intrinsics.checkNotNullParameter($this$copy_u2d4WTKRHQ, "$this$copy");
/*     */     return new TextAreaColors($this$copy_u2d4WTKRHQ.getBackground-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBackgroundDisabled-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBackgroundFocused-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBackgroundPressed-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBackgroundHovered-0d7_KjU(), $this$copy_u2d4WTKRHQ.getContent-0d7_KjU(), $this$copy_u2d4WTKRHQ.getContentDisabled-0d7_KjU(), $this$copy_u2d4WTKRHQ.getContentFocused-0d7_KjU(), $this$copy_u2d4WTKRHQ.getContentPressed-0d7_KjU(), $this$copy_u2d4WTKRHQ.getContentHovered-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBorder-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBorderDisabled-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBorderFocused-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBorderPressed-0d7_KjU(), $this$copy_u2d4WTKRHQ.getBorderHovered-0d7_KjU(), caret, $this$copy_u2d4WTKRHQ.getCaretDisabled-0d7_KjU(), caret, caret, caret, $this$copy_u2d4WTKRHQ.getPlaceholder-0d7_KjU(), null);
/*     */   }
/*     */   
/*     */   @Composable
/*     */   public static final float pxToDp(int px, @Nullable Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-47878637);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-47878637, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.pxToDp (UIUtil.kt:175)"); 
/*     */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity();
/*     */     int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */     Object object = $composer.consume(compositionLocal);
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     Density density = (Density)object;
/*     */     Density $this$pxToDp_u24lambda_u2416 = density;
/*     */     int $i$a$-with-UIUtilKt$pxToDp$1 = 0;
/*     */     float f = $this$pxToDp_u24lambda_u2416.toDp-u2uoSUM(px);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return f;
/*     */   }
/*     */   
/*     */   private static final Unit ContainerWithHover$lambda$15(Function3<? super ContainerHoverScope, ? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*     */     ContainerWithHover($content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\UIUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */