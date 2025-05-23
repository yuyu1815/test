/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.platform.FontCache;
/*    */ import androidx.compose.ui.text.platform.FontLoadResult;
/*    */ import androidx.compose.ui.text.platform.PlatformFont;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Result;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.skia.paragraph.FontCollection;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\030\020\r\032\004\030\0010\0162\006\020\017\032\0020\020H@¢\006\002\020\021J\022\020\022\032\004\030\0010\0162\006\020\017\032\0020\020H\026J.\020\023\032\0020\0162\006\020\024\032\0020\0252\b\b\002\020\026\032\0020\0272\b\b\002\020\030\032\0020\031H\000ø\001\000¢\006\004\b\032\020\033R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\f\002\007\n\005\b¡\0360\001¨\006\034"}, d2 = {"Landroidx/compose/ui/text/font/SkiaFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "fontCache", "Landroidx/compose/ui/text/platform/FontCache;", "(Landroidx/compose/ui/text/platform/FontCache;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "fontCollection", "Lorg/jetbrains/skia/paragraph/FontCollection;", "getFontCollection", "()Lorg/jetbrains/skia/paragraph/FontCollection;", "awaitLoad", "Landroidx/compose/ui/text/platform/FontLoadResult;", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "loadPlatformTypes", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "loadPlatformTypes-RetOiIg$ui_text", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/platform/FontLoadResult;", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nSkiaFontLoader.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaFontLoader.skiko.kt\nandroidx/compose/ui/text/font/SkiaFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/*    */ public final class SkiaFontLoader implements PlatformFontLoader {
/*    */   @NotNull
/*    */   private final FontCache fontCache;
/*    */   @NotNull
/*    */   private final Object cacheKey;
/*    */   public static final int $stable = 8;
/*    */   
/* 28 */   public SkiaFontLoader(@NotNull FontCache fontCache) { this.fontCache = fontCache;
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
/* 66 */     this.cacheKey = this.fontCache; } @Nullable public FontLoadResult loadBlocking(@NotNull Font font) { Intrinsics.checkNotNullParameter(font, "font"); if (!(font instanceof PlatformFont)) { if (!FontLoadingStrategy.equals-impl0(font.getLoadingStrategy-PKNRLFQ(), FontLoadingStrategy.Companion.getOptionalLocal-PKNRLFQ()))
/*    */         throw new IllegalArgumentException("Unsupported font type: " + font);  return null; }
/*    */      int i = font.getLoadingStrategy-PKNRLFQ(); if (FontLoadingStrategy.equals-impl0(i, FontLoadingStrategy.Companion.getOptionalLocal-PKNRLFQ())) { try {
/* 69 */         int $i$a$-runCatching-SkiaFontLoader$loadBlocking$1 = 0;
/*    */         object = Result.constructor-impl(this.fontCache.load$ui_text((PlatformFont)font));
/*    */       } catch (Throwable throwable) {
/*    */         object = Result.constructor-impl(ResultKt.createFailure(throwable));
/*    */       } 
/*    */       Object object = object; }
/*    */     else
/*    */     { if (FontLoadingStrategy.equals-impl0(i, FontLoadingStrategy.Companion.getAsync-PKNRLFQ()))
/*    */         throw new UnsupportedOperationException("Unsupported Async font load path"); 
/*    */       throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.toString-impl(font.getLoadingStrategy-PKNRLFQ())); }
/*    */     
/*    */     return FontLoadingStrategy.equals-impl0(i, FontLoadingStrategy.Companion.getBlocking-PKNRLFQ()) ? this.fontCache.load$ui_text((PlatformFont)font) : (FontLoadResult)"JD-Core does not support Kotlin"; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final FontCollection getFontCollection() {
/*    */     return this.fontCache.getFonts$ui_text();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FontLoadResult loadPlatformTypes-RetOiIg$ui_text(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle) {
/*    */     Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
/*    */     Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
/*    */     return this.fontCache.loadPlatformTypes-RetOiIg$ui_text(fontFamily, fontWeight, fontStyle);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object awaitLoad(@NotNull Font font, @NotNull Continuation $completion) {
/*    */     return loadBlocking(font);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Object getCacheKey() {
/*    */     return this.cacheKey;
/*    */   }
/*    */   
/*    */   public SkiaFontLoader() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\SkiaFontLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */