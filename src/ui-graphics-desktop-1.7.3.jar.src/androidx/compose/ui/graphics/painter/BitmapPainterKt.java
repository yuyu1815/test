/*    */ package androidx.compose.ui.graphics.painter;
/*    */ 
/*    */ import androidx.compose.ui.graphics.FilterQuality;
/*    */ import androidx.compose.ui.graphics.ImageBitmap;
/*    */ import androidx.compose.ui.unit.IntOffset;
/*    */ import androidx.compose.ui.unit.IntSizeKt;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\0326\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tø\001\000¢\006\004\b\n\020\013\002\007\n\005\b¡\0360\001¨\006\f"}, d2 = {"BitmapPainter", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "BitmapPainter-QZhYCtY", "(Landroidx/compose/ui/graphics/ImageBitmap;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics"})
/*    */ public final class BitmapPainterKt
/*    */ {
/*    */   @NotNull
/*    */   public static final BitmapPainter BitmapPainter-QZhYCtY(@NotNull ImageBitmap image, long srcOffset, long srcSize, int filterQuality) {
/* 53 */     Intrinsics.checkNotNullParameter(image, "image"); BitmapPainter bitmapPainter1 = new BitmapPainter(image, srcOffset, srcSize, null), $this$BitmapPainter_QZhYCtY_u24lambda_u240 = bitmapPainter1; int $i$a$-apply-BitmapPainterKt$BitmapPainter$1 = 0;
/* 54 */     $this$BitmapPainter_QZhYCtY_u24lambda_u240.setFilterQuality-vDHp3xo$ui_graphics(filterQuality);
/*    */     return bitmapPainter1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\painter\BitmapPainterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */