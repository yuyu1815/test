/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.jewel.ui.component.TabState;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\030\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\005\032A\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\003\032\002H\0012\006\020\004\032\002H\0012\006\020\005\032\002H\0012\006\020\006\032\002H\0012\006\020\007\032\002H\001H\003¢\006\004\b\b\020\t\"\027\020\n\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\r\020\016\"\027\020\017\032\b\022\004\022\0020\f0\013¢\006\b\n\000\032\004\b\020\020\016¨\006\021"}, d2 = {"chooseValueIgnoreCompat", "T", "Lorg/jetbrains/jewel/ui/component/TabState;", "normal", "disabled", "pressed", "hovered", "active", "chooseValueIgnoreCompat-AU5ekdQ", "(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "LocalDefaultTabStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/styling/TabStyle;", "getLocalDefaultTabStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalEditorTabStyle", "getLocalEditorTabStyle", "ui"})
/*     */ public final class TabStylingKt
/*     */ {
/*     */   @Composable
/*     */   private static final <T> T chooseValueIgnoreCompat-AU5ekdQ(long $this$chooseValueIgnoreCompat_u2dAU5ekdQ, Object normal, Object disabled, Object pressed, Object hovered, Object active, Composer $composer, int $changed) {
/* 166 */     $composer.startReplaceGroup(-57937795); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-57937795, $changed, -1, "org.jetbrains.jewel.ui.component.styling.chooseValueIgnoreCompat (TabStyling.kt:165)");  Object object = 
/* 167 */       !TabState.isEnabled-impl($this$chooseValueIgnoreCompat_u2dAU5ekdQ) ? disabled : (
/* 168 */       TabState.isPressed-impl($this$chooseValueIgnoreCompat_u2dAU5ekdQ) ? pressed : (
/* 169 */       TabState.isHovered-impl($this$chooseValueIgnoreCompat_u2dAU5ekdQ) ? hovered : (
/* 170 */       TabState.isActive-impl($this$chooseValueIgnoreCompat_u2dAU5ekdQ) ? active : 
/* 171 */       normal))); if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/* 174 */     return (T)object; } @NotNull private static final ProvidableCompositionLocal<TabStyle> LocalDefaultTabStyle = CompositionLocalKt.staticCompositionLocalOf(TabStylingKt::LocalDefaultTabStyle$lambda$0); @NotNull public static final ProvidableCompositionLocal<TabStyle> getLocalDefaultTabStyle() { return LocalDefaultTabStyle; } private static final TabStyle LocalDefaultTabStyle$lambda$0() {
/* 175 */     throw new IllegalStateException("No LocalDefaultTabStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/* 178 */   private static final ProvidableCompositionLocal<TabStyle> LocalEditorTabStyle = CompositionLocalKt.staticCompositionLocalOf(TabStylingKt::LocalEditorTabStyle$lambda$1); @NotNull public static final ProvidableCompositionLocal<TabStyle> getLocalEditorTabStyle() { return LocalEditorTabStyle; } private static final TabStyle LocalEditorTabStyle$lambda$1() {
/* 179 */     throw new IllegalStateException("No LocalEditorTabStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\TabStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */