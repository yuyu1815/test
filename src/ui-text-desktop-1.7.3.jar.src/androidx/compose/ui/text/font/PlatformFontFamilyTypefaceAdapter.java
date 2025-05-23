/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.platform.FontLoadResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\020\000\n\000\b\000\030\0002\0020\001B\005¢\006\002\020\002JB\020\003\032\004\030\0010\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\022\020\t\032\016\022\004\022\0020\013\022\004\022\0020\f0\n2\022\020\r\032\016\022\004\022\0020\006\022\004\022\0020\0160\nH\026¨\006\017"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "()V", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "createDefaultTypeface", "", "ui-text"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class PlatformFontFamilyTypefaceAdapter
/*    */   implements FontFamilyTypefaceAdapter
/*    */ {
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/*    */   public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function1 onAsyncCompletion, @NotNull Function1 createDefaultTypeface) {
/* 28 */     Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest"); Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader"); Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion"); Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface"); if (typefaceRequest.getFontFamily() instanceof FontListFontFamily) return null; 
/* 29 */     SkiaFontLoader skiaFontLoader = (SkiaFontLoader)platformFontLoader;
/*    */     
/* 31 */     if (typefaceRequest.getFontFamily() == null) typefaceRequest.getFontFamily();  FontLoadResult result = typefaceRequest.getFontFamily().loadPlatformTypes-RetOiIg$ui_text(FontFamily.Companion.getDefault(), 
/* 32 */         typefaceRequest.getFontWeight(), 
/* 33 */         typefaceRequest.getFontStyle-_-LCdwA());
/*    */     
/* 35 */     return new TypefaceResult.Immutable(result, false, 2, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\PlatformFontFamilyTypefaceAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */