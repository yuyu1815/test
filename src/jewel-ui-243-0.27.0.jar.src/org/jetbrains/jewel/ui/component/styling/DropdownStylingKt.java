/*     */ package org.jetbrains.jewel.ui.component.styling;
/*     */ 
/*     */ import androidx.compose.runtime.CompositionLocalKt;
/*     */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\005\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\027\020\005\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\006\020\004¨\006\007"}, d2 = {"LocalDefaultDropdownStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/styling/DropdownStyle;", "getLocalDefaultDropdownStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalUndecoratedDropdownStyle", "getLocalUndecoratedDropdownStyle", "ui"})
/*     */ public final class DropdownStylingKt
/*     */ {
/*     */   @NotNull
/* 127 */   private static final ProvidableCompositionLocal<DropdownStyle> LocalDefaultDropdownStyle = CompositionLocalKt.staticCompositionLocalOf(DropdownStylingKt::LocalDefaultDropdownStyle$lambda$0); @NotNull public static final ProvidableCompositionLocal<DropdownStyle> getLocalDefaultDropdownStyle() { return LocalDefaultDropdownStyle; } private static final DropdownStyle LocalDefaultDropdownStyle$lambda$0() {
/* 128 */     throw new IllegalStateException("No DefaultDropdownStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/* 131 */   private static final ProvidableCompositionLocal<DropdownStyle> LocalUndecoratedDropdownStyle = CompositionLocalKt.staticCompositionLocalOf(DropdownStylingKt::LocalUndecoratedDropdownStyle$lambda$1); @NotNull public static final ProvidableCompositionLocal<DropdownStyle> getLocalUndecoratedDropdownStyle() { return LocalUndecoratedDropdownStyle; } private static final DropdownStyle LocalUndecoratedDropdownStyle$lambda$1() {
/* 132 */     throw new IllegalStateException("No UndecoratedDropdownStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\DropdownStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */