/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.FontEdging;
/*     */ import org.jetbrains.skia.FontHinting;
/*     */ import org.jetbrains.skia.paragraph.FontRastrSettings;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\000\032\f\020\003\032\0020\004*\0020\005H\000\032\f\020\006\032\0020\007*\0020\bH\000¨\006\t"}, d2 = {"toSkFontEdging", "Lorg/jetbrains/skia/FontEdging;", "Landroidx/compose/ui/text/FontSmoothing;", "toSkFontHinting", "Lorg/jetbrains/skia/FontHinting;", "Landroidx/compose/ui/text/FontHinting;", "toSkFontRastrSettings", "Lorg/jetbrains/skia/paragraph/FontRastrSettings;", "Landroidx/compose/ui/text/FontRasterizationSettings;", "ui-text"})
/*     */ public final class FontRasterizationSettings_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final FontEdging toSkFontEdging(@NotNull FontSmoothing $this$toSkFontEdging) {
/* 142 */     Intrinsics.checkNotNullParameter($this$toSkFontEdging, "<this>"); switch (WhenMappings.$EnumSwitchMapping$0[$this$toSkFontEdging.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3:
/* 145 */        }  throw new NoWhenBranchMatchedException();
/*     */   } @NotNull
/*     */   public static final FontHinting toSkFontHinting(@NotNull FontHinting $this$toSkFontHinting) {
/* 148 */     Intrinsics.checkNotNullParameter($this$toSkFontHinting, "<this>"); switch (WhenMappings.$EnumSwitchMapping$1[$this$toSkFontHinting.ordinal()]) { case 1: 
/*     */       case 2: 
/*     */       case 3: 
/*     */       case 4:
/* 152 */        }  throw new NoWhenBranchMatchedException();
/*     */   } @NotNull
/*     */   public static final FontRastrSettings toSkFontRastrSettings(@NotNull FontRasterizationSettings $this$toSkFontRastrSettings) {
/* 155 */     Intrinsics.checkNotNullParameter($this$toSkFontRastrSettings, "<this>"); return new FontRastrSettings(
/* 156 */         toSkFontEdging($this$toSkFontRastrSettings.getSmoothing()), 
/* 157 */         toSkFontHinting($this$toSkFontRastrSettings.getHinting()), 
/* 158 */         $this$toSkFontRastrSettings.getSubpixelPositioning());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\FontRasterizationSettings_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */