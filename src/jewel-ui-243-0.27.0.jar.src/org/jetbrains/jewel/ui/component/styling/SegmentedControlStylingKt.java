/*    */ package org.jetbrains.jewel.ui.component.styling;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.component.SegmentedControlState;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\003\032A\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\002H\0012\006\020\004\032\002H\0012\006\020\005\032\002H\0012\006\020\006\032\002H\0012\006\020\007\032\002H\001H\003¢\006\004\b\b\020\t\"\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"chooseValueIgnoreCompat", "T", "Lorg/jetbrains/jewel/ui/component/SegmentedControlState;", "normal", "disabled", "pressed", "hovered", "active", "chooseValueIgnoreCompat-yXITNSw", "(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "LocalSegmentedControlStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/styling/SegmentedControlStyle;", "getLocalSegmentedControlStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui"})
/*    */ public final class SegmentedControlStylingKt
/*    */ {
/*    */   @Composable
/*    */   private static final <T> T chooseValueIgnoreCompat-yXITNSw(long $this$chooseValueIgnoreCompat_u2dyXITNSw, Object normal, Object disabled, Object pressed, Object hovered, Object active, Composer $composer, int $changed) {
/* 68 */     $composer.startReplaceGroup(1996734183); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1996734183, $changed, -1, "org.jetbrains.jewel.ui.component.styling.chooseValueIgnoreCompat (SegmentedControlStyling.kt:67)");  Object object = 
/* 69 */       !SegmentedControlState.isEnabled-impl($this$chooseValueIgnoreCompat_u2dyXITNSw) ? disabled : (
/* 70 */       SegmentedControlState.isPressed-impl($this$chooseValueIgnoreCompat_u2dyXITNSw) ? pressed : (
/* 71 */       SegmentedControlState.isHovered-impl($this$chooseValueIgnoreCompat_u2dyXITNSw) ? hovered : (
/* 72 */       SegmentedControlState.isActive-impl($this$chooseValueIgnoreCompat_u2dyXITNSw) ? active : 
/* 73 */       normal))); if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd(); 
/*    */     $composer.endReplaceGroup();
/* 76 */     return (T)object; } @NotNull private static final ProvidableCompositionLocal<SegmentedControlStyle> LocalSegmentedControlStyle = CompositionLocalKt.staticCompositionLocalOf(SegmentedControlStylingKt::LocalSegmentedControlStyle$lambda$0); @NotNull public static final ProvidableCompositionLocal<SegmentedControlStyle> getLocalSegmentedControlStyle() { return LocalSegmentedControlStyle; } private static final SegmentedControlStyle LocalSegmentedControlStyle$lambda$0() {
/* 77 */     throw new IllegalStateException("No LocalSegmentedControlStyle provided. Have you forgotten the theme?".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\SegmentedControlStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */