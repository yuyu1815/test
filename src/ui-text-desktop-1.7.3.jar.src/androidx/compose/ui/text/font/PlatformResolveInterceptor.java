/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b`\030\000 \0212\0020\001:\001\021J\024\020\002\032\004\030\0010\0032\b\020\004\032\004\030\0010\003H\026J\032\020\005\032\0020\0062\006\020\007\032\0020\006H\026ø\001\000¢\006\004\b\b\020\tJ\032\020\n\032\0020\0132\006\020\f\032\0020\013H\026ø\001\000¢\006\004\b\r\020\tJ\020\020\016\032\0020\0172\006\020\020\032\0020\017H\026ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "", "interceptFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "interceptFontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "interceptFontStyle-T2F_aPo", "(I)I", "interceptFontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "interceptFontSynthesis-Mscr08Y", "interceptFontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Companion", "ui-text"})
/*     */ public interface PlatformResolveInterceptor
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Nullable
/*     */   default FontFamily interceptFontFamily(@Nullable FontFamily fontFamily) {
/* 116 */     return fontFamily; } @NotNull
/*     */   default FontWeight interceptFontWeight(@NotNull FontWeight fontWeight) {
/* 118 */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight"); return fontWeight;
/*     */   } default int interceptFontStyle-T2F_aPo(int fontStyle) {
/* 120 */     return fontStyle;
/*     */   } default int interceptFontSynthesis-Mscr08Y(int fontSynthesis) {
/* 122 */     return fontSynthesis;
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/text/font/PlatformResolveInterceptor$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "getDefault$ui_text", "()Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text"})
/*     */   public static final class Companion { @NotNull
/* 126 */     private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor$Companion$Default$1(); @NotNull public final PlatformResolveInterceptor getDefault$ui_text() { return Default; }
/*     */ 
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001¨\006\002"}, d2 = {"androidx/compose/ui/text/font/PlatformResolveInterceptor$Companion$Default$1", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text"})
/*     */     public static final class PlatformResolveInterceptor$Companion$Default$1 implements PlatformResolveInterceptor {} }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\PlatformResolveInterceptor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */