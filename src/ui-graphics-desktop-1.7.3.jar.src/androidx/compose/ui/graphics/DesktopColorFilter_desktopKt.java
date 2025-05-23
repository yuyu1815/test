/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.ColorFilter;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\032\f\020\000\032\0020\001*\0020\002H\007\032\f\020\003\032\0020\002*\0020\001H\007¨\006\004"}, d2 = {"asDesktopColorFilter", "Lorg/jetbrains/skia/ColorFilter;", "Landroidx/compose/ui/graphics/ColorFilter;", "toComposeColorFilter", "ui-graphics"})
/*    */ public final class DesktopColorFilter_desktopKt
/*    */ {
/*    */   @Deprecated(message = "Use asSkiaColorFilter()", replaceWith = @ReplaceWith(expression = "asSkiaColorFilter()", imports = {}))
/*    */   @NotNull
/*    */   public static final ColorFilter asDesktopColorFilter(@NotNull ColorFilter $this$asDesktopColorFilter) {
/* 25 */     Intrinsics.checkNotNullParameter($this$asDesktopColorFilter, "<this>"); return $this$asDesktopColorFilter.getNativeColorFilter$ui_graphics();
/*    */   }
/*    */   
/*    */   @Deprecated(message = "Use asComposeColorFilter()", replaceWith = @ReplaceWith(expression = "asComposeColorFilter()", imports = {}))
/*    */   @NotNull
/*    */   public static final ColorFilter toComposeColorFilter(@NotNull ColorFilter $this$toComposeColorFilter) {
/* 31 */     Intrinsics.checkNotNullParameter($this$toComposeColorFilter, "<this>"); return new ColorFilter($this$toComposeColorFilter);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\DesktopColorFilter_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */