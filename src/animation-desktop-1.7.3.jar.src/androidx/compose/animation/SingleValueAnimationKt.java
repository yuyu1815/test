/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.Animatable;
/*     */ import androidx.compose.animation.core.AnimateAsStateKt;
/*     */ import androidx.compose.animation.core.AnimationSpec;
/*     */ import androidx.compose.animation.core.AnimationSpecKt;
/*     */ import androidx.compose.animation.core.AnimationVector4D;
/*     */ import androidx.compose.animation.core.SpringSpec;
/*     */ import androidx.compose.animation.core.TwoWayConverter;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.colorspace.ColorSpace;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\003\032$\020\003\032\016\022\004\022\0020\002\022\004\022\0020\0050\0042\006\020\006\032\0020\002ø\001\000¢\006\004\b\007\020\b\032H\020\t\032\b\022\004\022\0020\0020\n2\006\020\013\032\0020\0022\016\b\002\020\f\032\b\022\004\022\0020\0020\r2\026\b\002\020\016\032\020\022\004\022\0020\002\022\004\022\0020\020\030\0010\017H\007ø\001\000¢\006\004\b\021\020\022\032R\020\t\032\b\022\004\022\0020\0020\n2\006\020\013\032\0020\0022\016\b\002\020\f\032\b\022\004\022\0020\0020\r2\b\b\002\020\023\032\0020\0242\026\b\002\020\016\032\020\022\004\022\0020\002\022\004\022\0020\020\030\0010\017H\007ø\001\000¢\006\004\b\025\020\026\"\024\020\000\032\b\022\004\022\0020\0020\001X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\027"}, d2 = {"colorDefaultSpring", "Landroidx/compose/animation/core/SpringSpec;", "Landroidx/compose/ui/graphics/Color;", "Animatable", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector4D;", "initialValue", "Animatable-8_81llA", "(J)Landroidx/compose/animation/core/Animatable;", "animateColorAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateColorAsState-KTwxG1Y", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateColorAsState-euL9pac", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,111:1\n1225#2,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:112,6\n*E\n"})
/*     */ public final class SingleValueAnimationKt
/*     */ {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final State<Color> animateColorAsState-euL9pac(long targetValue, @Nullable AnimationSpec animationSpec, @Nullable String label, @Nullable Function1 finishedListener, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  62 */     ComposerKt.sourceInformationMarkerStart($composer, -451899108, "C(animateColorAsState)P(3:c#ui.graphics.Color!1,2)62@2847L96,65@2955L124:SingleValueAnimation.kt#xbi5r1"); if ((paramInt1 & 0x2) != 0) animationSpec = (AnimationSpec)colorDefaultSpring;  if ((paramInt1 & 0x4) != 0) label = "ColorAnimation";  if ((paramInt1 & 0x8) != 0) finishedListener = null;  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-451899108, $changed, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)"); 
/*  63 */     ColorSpace colorSpace = Color.getColorSpace-impl(targetValue); ComposerKt.sourceInformationMarkerStart($composer, -1018619694, "CC(remember):SingleValueAnimation.kt#9igjgp"); Composer composer = $composer; boolean invalid$iv = $composer.changed(colorSpace); int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 113 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 114 */       int $i$a$-cache-SingleValueAnimationKt$animateColorAsState$converter$1 = 0; Object value$iv = ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.getColorSpace-impl(targetValue));
/* 115 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 117 */     TwoWayConverter twoWayConverter1 = (TwoWayConverter)it$iv;
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     TwoWayConverter converter = twoWayConverter1;
/*     */     State<Color> state = AnimateAsStateKt.animateValueAsState(Color.box-impl(targetValue), converter, animationSpec, null, label, finishedListener, $composer, 0xE & $changed | 0x380 & $changed << 3 | 0xE000 & $changed << 6 | 0x70000 & $changed << 6, 8);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     return state;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final SpringSpec<Color> colorDefaultSpring = AnimationSpecKt.spring$default(0.0F, 0.0F, null, 7, null);
/*     */   
/*     */   @NotNull
/*     */   public static final Animatable<Color, AnimationVector4D> Animatable-8_81llA(long initialValue) {
/*     */     return new Animatable(Color.box-impl(initialValue), (TwoWayConverter)ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(Color.getColorSpace-impl(initialValue)), null, null, 12, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SingleValueAnimationKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */