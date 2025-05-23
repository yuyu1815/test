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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\005\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004\"\027\020\005\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\006\020\004¨\006\007"}, d2 = {"LocalDefaultButtonStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/styling/ButtonStyle;", "getLocalDefaultButtonStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalOutlinedButtonStyle", "getLocalOutlinedButtonStyle", "ui"})
/*     */ public final class ButtonStylingKt
/*     */ {
/*     */   @NotNull
/* 114 */   private static final ProvidableCompositionLocal<ButtonStyle> LocalDefaultButtonStyle = CompositionLocalKt.staticCompositionLocalOf(ButtonStylingKt::LocalDefaultButtonStyle$lambda$0); @NotNull public static final ProvidableCompositionLocal<ButtonStyle> getLocalDefaultButtonStyle() { return LocalDefaultButtonStyle; } private static final ButtonStyle LocalDefaultButtonStyle$lambda$0() {
/* 115 */     throw new IllegalStateException("No default ButtonStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */   @NotNull
/* 118 */   private static final ProvidableCompositionLocal<ButtonStyle> LocalOutlinedButtonStyle = CompositionLocalKt.staticCompositionLocalOf(ButtonStylingKt::LocalOutlinedButtonStyle$lambda$1); @NotNull public static final ProvidableCompositionLocal<ButtonStyle> getLocalOutlinedButtonStyle() { return LocalOutlinedButtonStyle; } private static final ButtonStyle LocalOutlinedButtonStyle$lambda$1() {
/* 119 */     throw new IllegalStateException("No outlined ButtonStyle provided. Have you forgotten the theme?".toString());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\styling\ButtonStylingKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */