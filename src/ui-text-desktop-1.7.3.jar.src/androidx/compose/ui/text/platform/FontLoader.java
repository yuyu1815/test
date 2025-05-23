/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontFamilyResolver_sikioKt;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Typeface;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @ReplaceWith(expression = "PlatformFontLoader", imports = {}))
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\005¢\006\002\020\002J\020\020\013\032\0020\f2\006\020\r\032\0020\016H\027R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"Landroidx/compose/ui/text/platform/FontLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "()V", "fontCache", "Landroidx/compose/ui/text/platform/FontCache;", "getFontCache$ui_text", "()Landroidx/compose/ui/text/platform/FontCache;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver$ui_text", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "load", "Lorg/jetbrains/skia/Typeface;", "font", "Landroidx/compose/ui/text/font/Font;", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class FontLoader
/*     */   implements Font.ResourceLoader
/*     */ {
/*     */   @NotNull
/* 177 */   private final FontCache fontCache = new FontCache(); @NotNull public final FontCache getFontCache$ui_text() { return this.fontCache; } @NotNull
/* 178 */   private final FontFamily.Resolver fontFamilyResolver = FontFamilyResolver_sikioKt.createFontFamilyResolver(this.fontCache); @NotNull public final FontFamily.Resolver getFontFamilyResolver$ui_text() { return this.fontFamilyResolver; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
/*     */   @NotNull
/*     */   public Typeface load(@NotNull Font font) {
/* 190 */     Intrinsics.checkNotNullParameter(font, "font"); if (!(font instanceof PlatformFont)) {
/* 191 */       throw new IllegalArgumentException("Unsupported font type: " + font);
/*     */     }
/* 193 */     Intrinsics.checkNotNull(this.fontCache.load$ui_text((PlatformFont)font).getTypeface()); return this.fontCache.load$ui_text((PlatformFont)font).getTypeface();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\FontLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */