/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.DisposableEffectResult;
/*     */ import androidx.compose.runtime.DisposableEffectScope;
/*     */ import androidx.compose.runtime.EffectsKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.FloatCompanionObject;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0004\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\r\020\000\032\0020\001H\007¢\006\002\020\002\032\027\020\000\032\0020\0012\b\b\002\020\003\032\0020\004H\007¢\006\002\020\005\0325\020\006\032\b\022\004\022\0020\b0\007*\0020\0012\006\020\t\032\0020\b2\006\020\n\032\0020\b2\f\020\013\032\b\022\004\022\0020\b0\fH\007¢\006\002\020\r\032?\020\006\032\b\022\004\022\0020\b0\007*\0020\0012\006\020\t\032\0020\b2\006\020\n\032\0020\b2\f\020\013\032\b\022\004\022\0020\b0\f2\b\b\002\020\003\032\0020\004H\007¢\006\002\020\016\032Y\020\017\032\b\022\004\022\002H\0200\007\"\004\b\000\020\020\"\b\b\001\020\021*\0020\022*\0020\0012\006\020\t\032\002H\0202\006\020\n\032\002H\0202\022\020\023\032\016\022\004\022\002H\020\022\004\022\002H\0210\0242\f\020\013\032\b\022\004\022\002H\0200\fH\007¢\006\002\020\025\032c\020\017\032\b\022\004\022\002H\0200\007\"\004\b\000\020\020\"\b\b\001\020\021*\0020\022*\0020\0012\006\020\t\032\002H\0202\006\020\n\032\002H\0202\022\020\023\032\016\022\004\022\002H\020\022\004\022\002H\0210\0242\f\020\013\032\b\022\004\022\002H\0200\f2\b\b\002\020\003\032\0020\004H\007¢\006\002\020\026¨\006\027"}, d2 = {"rememberInfiniteTransition", "Landroidx/compose/animation/core/InfiniteTransition;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/InfiniteTransition;", "label", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/InfiniteTransition;", "animateFloat", "Landroidx/compose/runtime/State;", "", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;FFLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateValue", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "(Landroidx/compose/animation/core/InfiniteTransition;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core"})
/*     */ @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,364:1\n1225#2,6:365\n1225#2,6:371\n1225#2,6:377\n1225#2,6:383\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt\n*L\n46#1:365,6\n263#1:371,6\n269#1:377,6\n281#1:383,6\n*E\n"})
/*     */ public final class InfiniteTransitionKt
/*     */ {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final InfiniteTransition rememberInfiniteTransition(@Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  45 */     ComposerKt.sourceInformationMarkerStart($composer, 1013651573, "C(rememberInfiniteTransition)45@1981L38,46@2043L5:InfiniteTransition.kt#pdpnli"); if ((paramInt1 & 0x1) != 0) label = "InfiniteTransition";  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1013651573, $changed, -1, "androidx.compose.animation.core.rememberInfiniteTransition (InfiniteTransition.kt:44)"); 
/*  46 */     ComposerKt.sourceInformationMarkerStart($composer, -1916602784, "CC(remember):InfiniteTransition.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 366 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 367 */       int $i$a$-cache-InfiniteTransitionKt$rememberInfiniteTransition$infiniteTransition$1 = 0; Object value$iv = new InfiniteTransition(label);
/* 368 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 370 */     InfiniteTransition infiniteTransition1 = (InfiniteTransition)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); InfiniteTransition infiniteTransition = infiniteTransition1; infiniteTransition.run$animation_core($composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return infiniteTransition; } @Composable @NotNull public static final <T, V extends AnimationVector> State<T> animateValue(@NotNull InfiniteTransition $this$animateValue, Object initialValue, Object targetValue, @NotNull TwoWayConverter typeConverter, @NotNull InfiniteRepeatableSpec<T> animationSpec, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) { Intrinsics.checkNotNullParameter($this$animateValue, "<this>"); Intrinsics.checkNotNullParameter(typeConverter, "typeConverter"); Intrinsics.checkNotNullParameter(animationSpec, "animationSpec"); ComposerKt.sourceInformationMarkerStart($composer, -1062847727, "C(animateValue)P(1,3,4)262@10743L151,268@10911L346,268@10900L357,280@11301L128,280@11263L166:InfiniteTransition.kt#pdpnli"); if ((paramInt1 & 0x10) != 0) label = "ValueAnimation";  if (ComposerKt.isTraceInProgress())
/* 371 */       ComposerKt.traceEventStart(-1062847727, $changed, -1, "androidx.compose.animation.core.animateValue (InfiniteTransition.kt:260)");  ComposerKt.sourceInformationMarkerStart($composer, 1444224427, "CC(remember):InfiniteTransition.kt#9igjgp"); Composer composer1 = $composer; boolean bool1 = false; int $i$f$cache = 0; Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 372 */     if (it$iv == Composer.Companion.getEmpty()) {
/* 373 */       int $i$a$-cache-InfiniteTransitionKt$animateValue$transitionAnimation$1 = 0;
/*     */     }
/*     */     
/* 376 */     InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState1 = (InfiniteTransition.TransitionAnimationState)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); InfiniteTransition.TransitionAnimationState<T, V> transitionAnimation = transitionAnimationState1; ComposerKt.sourceInformationMarkerStart($composer, 1444229998, "CC(remember):InfiniteTransition.kt#9igjgp"); Composer $this$cache$iv = $composer; int i = (((($changed & 0x70 ^ 0x30) > 32 && $composer.changedInstance(initialValue)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changedInstance(targetValue)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0xE000 ^ 0x6000) > 16384 && $composer.changedInstance(animationSpec)) || ($changed & 0x6000) == 16384) ? 1 : 0); $i$f$cache = 0;
/* 377 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 378 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 379 */       int $i$a$-cache-InfiniteTransitionKt$animateValue$1 = 0; Object value$iv = new InfiniteTransitionKt$animateValue$1$1((T)initialValue, transitionAnimation, (T)targetValue, animationSpec);
/* 380 */       $this$cache$iv.updateRememberedValue(value$iv);
/*     */     } 
/* 382 */     Function0 function0 = (Function0)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); EffectsKt.SideEffect(function0, $composer, 0); ComposerKt.sourceInformationMarkerStart($composer, 1444242260, "CC(remember):InfiniteTransition.kt#9igjgp"); $this$cache$iv = $composer; boolean invalid$iv = $composer.changedInstance($this$animateValue); $i$f$cache = 0;
/* 383 */     it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 384 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 385 */       InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState = transitionAnimation; int $i$a$-cache-InfiniteTransitionKt$animateValue$2 = 0; Object value$iv = new InfiniteTransitionKt$animateValue$2$1($this$animateValue, transitionAnimation);
/* 386 */       $this$cache$iv.updateRememberedValue(value$iv);
/*     */     } 
/* 388 */     Function1 function1 = (Function1)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     EffectsKt.DisposableEffect(transitionAnimationState, function1, $composer, 6);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return transitionAnimation; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "invoke"})
/*     */   static final class InfiniteTransitionKt$animateValue$1$1 extends Lambda implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       if (!Intrinsics.areEqual(this.$initialValue, this.$transitionAnimation.getInitialValue$animation_core()) || !Intrinsics.areEqual(this.$targetValue, this.$transitionAnimation.getTargetValue$animation_core()))
/*     */         this.$transitionAnimation.updateValues$animation_core(this.$initialValue, this.$targetValue, this.$animationSpec); 
/*     */     }
/*     */     
/*     */     InfiniteTransitionKt$animateValue$1$1(Object $initialValue, InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation, Object $targetValue, InfiniteRepeatableSpec<T> $animationSpec) {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001\"\004\b\000\020\002\"\b\b\001\020\003*\0020\004*\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nInfiniteTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,364:1\n63#2,5:365\n*S KotlinDebug\n*F\n+ 1 InfiniteTransition.kt\nandroidx/compose/animation/core/InfiniteTransitionKt$animateValue$2$1\n*L\n283#1:365,5\n*E\n"})
/*     */   static final class InfiniteTransitionKt$animateValue$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
/*     */     @NotNull
/*     */     public final DisposableEffectResult invoke(@NotNull DisposableEffectScope $this$DisposableEffect) {
/*     */       Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect");
/*     */       this.$this_animateValue.addAnimation$animation_core(this.$transitionAnimation);
/*     */       DisposableEffectScope disposableEffectScope = $this$DisposableEffect;
/*     */       InfiniteTransition infiniteTransition = this.$this_animateValue;
/*     */       InfiniteTransition.TransitionAnimationState<T, V> transitionAnimationState = this.$transitionAnimation;
/*     */       int $i$f$onDispose = 0;
/*     */       return new InfiniteTransitionKt$animateValue$2$1$invoke$$inlined$onDispose$1(infiniteTransition, transitionAnimationState);
/*     */     }
/*     */     
/*     */     InfiniteTransitionKt$animateValue$2$1(InfiniteTransition $receiver, InfiniteTransition.TransitionAnimationState<T, V> $transitionAnimation) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final State<Float> animateFloat(@NotNull InfiniteTransition $this$animateFloat, float initialValue, float targetValue, @NotNull InfiniteRepeatableSpec<Float> animationSpec, @Nullable String label, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     Intrinsics.checkNotNullParameter($this$animateFloat, "<this>");
/*     */     Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
/*     */     ComposerKt.sourceInformationMarkerStart($composer, -644770905, "C(animateFloat)P(1,3)316@12588L84:InfiniteTransition.kt#pdpnli");
/*     */     if ((paramInt1 & 0x8) != 0)
/*     */       label = "FloatAnimation"; 
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-644770905, $changed, -1, "androidx.compose.animation.core.animateFloat (InfiniteTransition.kt:316)"); 
/*     */     State<Float> state = animateValue($this$animateFloat, Float.valueOf(initialValue), Float.valueOf(targetValue), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), animationSpec, label, $composer, 0xE & $changed | 0x70 & $changed | 0x380 & $changed | 0xE000 & $changed << 3 | 0x70000 & $changed << 3, 0);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\InfiniteTransitionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */