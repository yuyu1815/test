/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.ui.text.platform.FontLoader;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\001¨\006\004"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontResourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text"})
/*    */ public final class DelegatingFontLoaderForDeprecatedUsage_skikoKt
/*    */ {
/*    */   @Deprecated(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
/*    */   @NotNull
/*    */   public static final FontFamily.Resolver createFontFamilyResolver(@NotNull Font.ResourceLoader fontResourceLoader) {
/* 29 */     Intrinsics.checkNotNullParameter(fontResourceLoader, "fontResourceLoader"); if (!(fontResourceLoader instanceof FontLoader))
/* 30 */       throw new IllegalArgumentException("Unexpected type: " + fontResourceLoader + " must be FontLoader"); 
/* 31 */     return ((FontLoader)fontResourceLoader).getFontFamilyResolver$ui_text();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\DelegatingFontLoaderForDeprecatedUsage_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */