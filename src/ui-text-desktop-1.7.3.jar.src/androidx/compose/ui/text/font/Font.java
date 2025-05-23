/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\bg\030\000 \r2\0020\001:\002\r\016R\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005R\030\020\006\032\0020\007X¦\004ø\001\000ø\001\001¢\006\006\032\004\b\b\020\005R\022\020\t\032\0020\nX¦\004¢\006\006\032\004\b\013\020\fø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/Font;", "", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ", "()I", "style", "Landroidx/compose/ui/text/font/FontStyle;", "getStyle-_-LCdwA", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Companion", "ResourceLoader", "ui-text"})
/*    */ @Immutable
/*    */ public interface Font
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   public static final long MaximumAsyncTimeoutMillis = 15000L;
/*    */   
/*    */   @NotNull
/*    */   FontWeight getWeight();
/*    */   
/*    */   int getStyle-_-LCdwA();
/*    */   
/*    */   default int getLoadingStrategy-PKNRLFQ() {
/* 70 */     return FontLoadingStrategy.Companion.getBlocking-PKNRLFQ();
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2 = {"Landroidx/compose/ui/text/font/Font$Companion;", "", "()V", "MaximumAsyncTimeoutMillis", "", "ui-text"})
/*    */   public static final class Companion {
/*    */     public static final long MaximumAsyncTimeoutMillis = 15000L;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\bg\030\0002\0020\001J\020\020\002\032\0020\0012\006\020\003\032\0020\004H'ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/Font$ResourceLoader;", "", "load", "font", "Landroidx/compose/ui/text/font/Font;", "ui-text"})
/*    */   public static interface ResourceLoader {
/*    */     @Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
/*    */     @NotNull
/*    */     Object load(@NotNull Font param1Font);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\Font.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */