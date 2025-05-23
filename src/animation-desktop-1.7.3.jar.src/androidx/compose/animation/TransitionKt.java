/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.FiniteAnimationSpec;
/*     */ import androidx.compose.animation.core.InfiniteRepeatableSpec;
/*     */ import androidx.compose.animation.core.InfiniteTransition;
/*     */ import androidx.compose.animation.core.InfiniteTransitionKt;
/*     */ import androidx.compose.animation.core.SpringSpec;
/*     */ import androidx.compose.animation.core.Transition;
/*     */ import androidx.compose.animation.core.TransitionKt;
/*     */ import androidx.compose.animation.core.TwoWayConverter;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableInferredTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032:\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\006\020\004\032\0020\0022\006\020\005\032\0020\0022\f\020\006\032\b\022\004\022\0020\0020\007H\007ø\001\000¢\006\004\b\b\020\t\032D\020\000\032\b\022\004\022\0020\0020\001*\0020\0032\006\020\004\032\0020\0022\006\020\005\032\0020\0022\f\020\006\032\b\022\004\022\0020\0020\0072\b\b\002\020\n\032\0020\013H\007ø\001\000¢\006\004\b\f\020\r\032\001\020\000\032\b\022\004\022\0020\0020\001\"\004\b\000\020\016*\b\022\004\022\002H\0160\0172*\b\n\020\020\032$\022\n\022\b\022\004\022\002H\0160\022\022\n\022\b\022\004\022\0020\0020\0230\021¢\006\002\b\024¢\006\002\b\0252\b\b\002\020\n\032\0020\0132&\020\026\032\"\022\023\022\021H\016¢\006\f\b\027\022\b\b\030\022\004\b\b(\031\022\004\022\0020\0020\021¢\006\002\b\024H\bø\001\001¢\006\002\020\032\002\016\n\005\b¡\0360\001\n\005\b20\001¨\006\033"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "label", "", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n*L\n1#1,124:1\n1225#2,6:125\n1225#2,6:138\n1885#3,7:131\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt\n*L\n70#1:125,6\n103#1:138,6\n74#1:131,7\n*E\n"})
/*     */ public final class TransitionKt
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 176)
/*     */   @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/TransitionKt$animateColor$1\n*L\n1#1,124:1\n*E\n"})
/*     */   public static final class TransitionKt$animateColor$1
/*     */     extends Lambda
/*     */     implements Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>
/*     */   {
/*     */     public static final TransitionKt$animateColor$1 INSTANCE = new TransitionKt$animateColor$1();
/*     */     
/*     */     public TransitionKt$animateColor$1() {
/*     */       super(3);
/*     */     }
/*     */     
/*     */     @Composable
/*     */     @NotNull
/*     */     public final SpringSpec<Color> invoke(@NotNull Transition.Segment $this$null, @Nullable Composer $composer, int $changed) {
/*  65 */       Intrinsics.checkNotNullParameter($this$null, "$this$null"); $composer.startReplaceGroup(-1457805428); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1457805428, $changed, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");  SpringSpec<Color> springSpec = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return springSpec; } } @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0][0]]")
/*     */   @NotNull
/*  68 */   public static final <S> State<Color> animateColor(@NotNull Transition $this$animateColor, @Nullable Function3 transitionSpec, @Nullable String label, @NotNull Function3 targetValueByState, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateColor, "<this>"); Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState"); int $i$f$animateColor = 0; ComposerKt.sourceInformationMarkerStart($composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1"); if ((paramInt1 & 0x1) != 0) transitionSpec = TransitionKt$animateColor$1.INSTANCE;  if ((paramInt1 & 0x2) != 0)
/*  69 */       label = "ColorAnimation";  ColorSpace colorSpace = Color.getColorSpace-impl(((Color)targetValueByState.invoke($this$animateColor.getTargetState(), $composer, Integer.valueOf(0x70 & $changed >> 6))).unbox-impl());
/*  70 */     ComposerKt.sourceInformationMarkerStart($composer, 1918408083, "CC(remember):Transition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(colorSpace); int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 126 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 127 */       int $i$a$-cache-TransitionKt$animateColor$typeConverter$1 = 0; Object value$iv = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(colorSpace);
/* 128 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 130 */     TwoWayConverter twoWayConverter1 = (TwoWayConverter)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); TwoWayConverter typeConverter = twoWayConverter1; Transition transition = $this$animateColor; int $changed$iv = 0xE & $changed | 0x380 & $changed << 3 | 0x1C00 & $changed << 3 | 0xE000 & $changed << 3, $i$f$animateValue = 0;
/* 131 */     ComposerKt.sourceInformationMarkerStart($composer, -142660079, "CC(animateValue)P(3,2)1886@77187L32,1887@77242L31,1888@77298L23,1890@77334L89:Transition.kt#pdpnli");
/*     */     
/* 133 */     Object initialValue$iv = targetValueByState.invoke(transition.getCurrentState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 134 */     Object targetValue$iv = targetValueByState.invoke(transition.getTargetState(), $composer, Integer.valueOf(0x70 & $changed$iv >> 9));
/* 135 */     FiniteAnimationSpec animationSpec$iv = (FiniteAnimationSpec)transitionSpec.invoke(transition.getSegment(), $composer, Integer.valueOf(0x70 & $changed$iv >> 3));
/*     */     
/* 137 */     State<Color> state2 = TransitionKt.createTransitionAnimation(transition, initialValue$iv, targetValue$iv, animationSpec$iv, typeConverter, label, $composer, 0xE & $changed$iv | 0xE000 & $changed$iv << 9 | 0x70000 & $changed$iv << 6); ComposerKt.sourceInformationMarkerEnd($composer); State<Color> state1 = state2; ComposerKt.sourceInformationMarkerEnd($composer); return state1; } @Composable @NotNull public static final State<Color> animateColor-DTcfvLk(@NotNull InfiniteTransition $this$animateColor_u2dDTcfvLk, long initialValue, long targetValue, @NotNull InfiniteRepeatableSpec animationSpec, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateColor_u2dDTcfvLk, "$this$animateColor"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); ComposerKt.sourceInformationMarkerStart($composer, 1901963533, "C(animateColor)P(1:c#ui.graphics.Color,3:c#ui.graphics.Color)102@4596L72,105@4680L72:Transition.kt#xbi5r1"); if ((paramInt1 & 0x8) != 0) label = "ColorAnimation";  if (ComposerKt.isTraceInProgress())
/* 138 */       ComposerKt.traceEventStart(1901963533, $changed, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");  ComposerKt.sourceInformationMarkerStart($composer, 1918449973, "CC(remember):Transition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 139 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 140 */       int $i$a$-cache-TransitionKt$animateColor$converter$1 = 0; Object value$iv = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.getColorSpace-impl(targetValue));
/* 141 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 143 */     TwoWayConverter twoWayConverter1 = (TwoWayConverter)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     TwoWayConverter converter = twoWayConverter1;
/*     */     State<Color> state = InfiniteTransitionKt.animateValue($this$animateColor_u2dDTcfvLk, Color.box-impl(initialValue), Color.box-impl(targetValue), converter, animationSpec, label, $composer, InfiniteTransition.$stable | 0xE & $changed | 0x70 & $changed | 0x380 & $changed | InfiniteRepeatableSpec.$stable << 12 | 0xE000 & $changed << 3 | 0x70000 & $changed << 3, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\TransitionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */