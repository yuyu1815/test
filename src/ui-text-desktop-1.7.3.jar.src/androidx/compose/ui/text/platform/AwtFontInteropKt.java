/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.text.ExperimentalTextApi;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontFamily_desktopKt;
/*     */ import java.awt.Font;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skiko.OS;
/*     */ import org.jetbrains.skiko.OsArch_jvmKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\032\f\020\000\032\0020\001*\0020\002H\007\032\016\020\003\032\004\030\0010\004*\0020\002H\007\032\016\020\005\032\004\030\0010\004*\0020\002H\001¨\006\006"}, d2 = {"asComposeFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "Ljava/awt/Font;", "composeFontFamilyNameOrNull", "", "fontFamilyNameOrNull", "ui-text"})
/*     */ public final class AwtFontInteropKt
/*     */ {
/*     */   @ExperimentalTextApi
/*     */   @NotNull
/*     */   public static final FontFamily asComposeFontFamily(@NotNull Font $this$asComposeFontFamily) {
/*  63 */     Intrinsics.checkNotNullParameter($this$asComposeFontFamily, "<this>"); if (composeFontFamilyNameOrNull($this$asComposeFontFamily) == null) composeFontFamilyNameOrNull($this$asComposeFontFamily);  String familyName = $this$asComposeFontFamily.getFamily();
/*  64 */     if (OsArch_jvmKt.getHostOs() == OS.MacOS) { Intrinsics.checkNotNull(familyName); if (StringsKt.startsWith(familyName, ".AppleSystemUI", true))
/*     */       {
/*     */         
/*  67 */         return (FontFamily)FontFamily.Companion.getDefault();
/*     */       } }
/*     */     
/*  70 */     Intrinsics.checkNotNull(familyName); if (FontFamily_desktopKt.EmbeddedFontFamily(familyName) == null) FontFamily_desktopKt.EmbeddedFontFamily(familyName);  return FontFamily_desktopKt.FontFamily(familyName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalTextApi
/*     */   @Nullable
/*     */   public static final String composeFontFamilyNameOrNull(@NotNull Font $this$composeFontFamilyNameOrNull) {
/*  90 */     Intrinsics.checkNotNullParameter($this$composeFontFamilyNameOrNull, "<this>"); if (fontFamilyNameOrNull($this$composeFontFamilyNameOrNull) == null) fontFamilyNameOrNull($this$composeFontFamilyNameOrNull);  String str = $this$composeFontFamilyNameOrNull.getFamily(); Intrinsics.checkNotNull(str); return fontFamilyNameOrNull($this$composeFontFamilyNameOrNull).resolvePhysicalFontFamilyNameOrNull(str, $this$composeFontFamilyNameOrNull.getStyle());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ExperimentalTextApi
/*     */   @Nullable
/*     */   public static final String fontFamilyNameOrNull(@NotNull Font $this$fontFamilyNameOrNull) {
/* 110 */     Intrinsics.checkNotNullParameter($this$fontFamilyNameOrNull, "<this>"); return AwtFontUtils.INSTANCE.getPreferredFontFamilyName($this$fontFamilyNameOrNull);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\AwtFontInteropKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */