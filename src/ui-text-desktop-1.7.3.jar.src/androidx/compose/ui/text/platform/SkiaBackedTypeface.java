/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.Typeface;
/*     */ import kotlin.Metadata;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\027\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\026\020\t\032\004\030\0010\nX\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Landroidx/compose/ui/text/platform/SkiaBackedTypeface;", "Landroidx/compose/ui/text/font/Typeface;", "alias", "", "nativeTypeface", "Lorg/jetbrains/skia/Typeface;", "(Ljava/lang/String;Lorg/jetbrains/skia/Typeface;)V", "getAlias", "()Ljava/lang/String;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getNativeTypeface", "()Lorg/jetbrains/skia/Typeface;", "ui-text"})
/*     */ final class SkiaBackedTypeface
/*     */   implements Typeface
/*     */ {
/*     */   @NotNull
/*     */   private final Typeface nativeTypeface;
/*     */   @NotNull
/*     */   private final String alias;
/*     */   @Nullable
/*     */   private final FontFamily fontFamily;
/*     */   
/*     */   @NotNull
/*     */   public final Typeface getNativeTypeface() {
/*     */     return this.nativeTypeface;
/*     */   }
/*     */   
/*     */   public SkiaBackedTypeface(@Nullable String alias, @NotNull Typeface nativeTypeface) {
/* 130 */     this.nativeTypeface = nativeTypeface;
/*     */     
/* 132 */     if (alias == null); ((SkiaBackedTypeface)alias).alias = this.nativeTypeface.getFamilyName(); } @NotNull public final String getAlias() { return this.alias; } @Nullable
/* 133 */   public FontFamily getFontFamily() { return this.fontFamily; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaBackedTypeface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */