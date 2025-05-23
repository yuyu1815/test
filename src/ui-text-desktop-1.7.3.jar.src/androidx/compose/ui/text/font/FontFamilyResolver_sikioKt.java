/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.ui.text.ExperimentalTextApi;
/*    */ import androidx.compose.ui.text.platform.FontCache;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\006\020\000\032\0020\001\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\000\032\020\020\000\032\0020\0012\006\020\004\032\0020\005H\007¨\006\006"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontCache", "Landroidx/compose/ui/text/platform/FontCache;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "ui-text"})
/*    */ @JvmName(name = "FontFamilyResolver_sikioKt")
/*    */ public final class FontFamilyResolver_sikioKt
/*    */ {
/*    */   @NotNull
/*    */   public static final FontFamily.Resolver createFontFamilyResolver() {
/* 37 */     return new FontFamilyResolverImpl(new SkiaFontLoader(null, 1, null), null, null, null, null, 30, null);
/*    */   }
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
/*    */   @ExperimentalTextApi
/*    */   @NotNull
/*    */   public static final FontFamily.Resolver createFontFamilyResolver(@NotNull CoroutineContext coroutineContext) {
/* 63 */     Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext"); return new FontFamilyResolverImpl(
/* 64 */         new SkiaFontLoader(null, 1, null), 
/* 65 */         PlatformResolveInterceptor.Companion.getDefault$ui_text(), 
/* 66 */         FontFamilyResolverKt.getGlobalTypefaceRequestCache(), 
/* 67 */         new FontListFontFamilyTypefaceAdapter(
/* 68 */           FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), 
/* 69 */           coroutineContext), null, 16, null);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final FontFamily.Resolver createFontFamilyResolver(@NotNull FontCache fontCache) {
/* 78 */     Intrinsics.checkNotNullParameter(fontCache, "fontCache"); return new FontFamilyResolverImpl(new SkiaFontLoader(fontCache), null, null, null, null, 30, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontFamilyResolver_sikioKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */