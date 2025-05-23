/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.ImageFilter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007¨\006\003"}, d2 = {"asDesktopImageFilter", "Lorg/jetbrains/skia/ImageFilter;", "Landroidx/compose/ui/graphics/RenderEffect;", "ui-graphics"})
/*    */ public final class RenderEffect_desktopKt
/*    */ {
/*    */   @Deprecated(message = "Use asSkiaImageFilter()", replaceWith = @ReplaceWith(expression = "asSkiaImageFilter()", imports = {}))
/*    */   @NotNull
/*    */   public static final ImageFilter asDesktopImageFilter(@NotNull RenderEffect $this$asDesktopImageFilter) {
/* 22 */     Intrinsics.checkNotNullParameter($this$asDesktopImageFilter, "<this>"); return $this$asDesktopImageFilter.asSkiaImageFilter();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\RenderEffect_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */