/*    */ package androidx.compose.animation;
/*    */ 
/*    */ import androidx.compose.animation.core.DecayAnimationSpec;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\020\007\n\002\b\002\032\023\020\000\032\b\022\004\022\0020\0020\001H\007¢\006\002\020\003¨\006\004"}, d2 = {"defaultDecayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/DecayAnimationSpec;", "animation"})
/*    */ public final class DesktopActualDefaultDecayAnimationSpec_desktopKt
/*    */ {
/*    */   @Deprecated(message = "Replace with rememberSplineBasedDecay<Float>")
/*    */   @Composable
/*    */   @NotNull
/*    */   public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(@Nullable Composer $composer, int $changed) {
/* 24 */     ComposerKt.sourceInformationMarkerStart($composer, 400012310, "C(defaultDecayAnimationSpec)24@906L26:DesktopActualDefaultDecayAnimationSpec.desktop.kt#xbi5r1"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(400012310, $changed, -1, "androidx.compose.animation.defaultDecayAnimationSpec (DesktopActualDefaultDecayAnimationSpec.desktop.kt:23)"); 
/* 25 */     DecayAnimationSpec<?> decayAnimationSpec = SplineBasedDecayAnimationSpec_desktopKt.rememberSplineBasedDecay($composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer);
/*    */     return (DecayAnimationSpec)decayAnimationSpec;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\DesktopActualDefaultDecayAnimationSpec_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */