/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import androidx.compose.animation.core.DecayAnimationSpec;
/*    */ import androidx.compose.animation.core.DecayAnimationSpecKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocal;
/*    */ import androidx.compose.ui.platform.CompositionLocalsKt;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\032\031\020\004\032\b\022\004\022\002H\0060\005\"\004\b\000\020\006H\007¢\006\002\020\007\"\024\020\000\032\0020\001XD¢\006\b\n\000\032\004\b\002\020\003¨\006\b"}, d2 = {"platformFlingScrollFriction", "", "getPlatformFlingScrollFriction", "()F", "rememberSplineBasedDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation"})
/*    */ @SourceDebugExtension({"SMAP\nSplineBasedDecayAnimationSpec.desktop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplineBasedDecayAnimationSpec.desktop.kt\nandroidx/compose/animation/SplineBasedDecayAnimationSpec_desktopKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,36:1\n77#2:37\n1225#3,6:38\n*S KotlinDebug\n*F\n+ 1 SplineBasedDecayAnimationSpec.desktop.kt\nandroidx/compose/animation/SplineBasedDecayAnimationSpec_desktopKt\n*L\n31#1:37\n32#1:38,6\n*E\n"})
/*    */ public final class SplineBasedDecayAnimationSpec_desktopKt
/*    */ {
/* 25 */   private static final float platformFlingScrollFriction = 0.015F; public static final float getPlatformFlingScrollFriction() { return platformFlingScrollFriction; } @Composable
/*    */   @NotNull
/*    */   public static final <T> DecayAnimationSpec<T> rememberSplineBasedDecay(@Nullable Composer $composer, int $changed) {
/* 28 */     ComposerKt.sourceInformationMarkerStart($composer, 141723902, "C(rememberSplineBasedDecay)30@1256L7,31@1275L114:SplineBasedDecayAnimationSpec.desktop.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(141723902, $changed, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedDecayAnimationSpec.desktop.kt:27)");
/*    */ 
/*    */     
/* 31 */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Density density = (Density)object1; float f = density.getDensity(); ComposerKt.sourceInformationMarkerStart($composer, 2068402978, "CC(remember):SplineBasedDecayAnimationSpec.desktop.kt#9igjgp"); object1 = $composer; boolean invalid$iv = $composer.changed(f); int $i$f$cache = 0;
/* 38 */     Object it$iv = object1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 39 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 40 */       int $i$a$-cache-SplineBasedDecayAnimationSpec_desktopKt$rememberSplineBasedDecay$1 = 0; Object value$iv = DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
/* 41 */       object1.updateRememberedValue(value$iv);
/*    */     } 
/* 43 */     DecayAnimationSpec<T> decayAnimationSpec2 = (DecayAnimationSpec)it$iv;
/*    */     ComposerKt.sourceInformationMarkerEnd($composer);
/*    */     DecayAnimationSpec<T> decayAnimationSpec1 = decayAnimationSpec2;
/*    */     if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     ComposerKt.sourceInformationMarkerEnd($composer);
/*    */     return decayAnimationSpec1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SplineBasedDecayAnimationSpec_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */