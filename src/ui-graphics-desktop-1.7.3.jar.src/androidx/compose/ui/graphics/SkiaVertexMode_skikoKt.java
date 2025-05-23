/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.VertexMode;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\032\026\020\000\032\0020\001*\0020\002H\000ø\001\000¢\006\004\b\003\020\004\002\007\n\005\b¡\0360\001¨\006\005"}, d2 = {"toSkiaVertexMode", "Lorg/jetbrains/skia/VertexMode;", "Landroidx/compose/ui/graphics/VertexMode;", "toSkiaVertexMode-JOOmi9M", "(I)Lorg/jetbrains/skia/VertexMode;", "ui-graphics"})
/*    */ public final class SkiaVertexMode_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final VertexMode toSkiaVertexMode-JOOmi9M(int $this$toSkiaVertexMode_u2dJOOmi9M) {
/* 21 */     int i = $this$toSkiaVertexMode_u2dJOOmi9M;
/* 22 */     return VertexMode.equals-impl0(i, VertexMode.Companion.getTriangles-c2xauaI()) ? VertexMode.TRIANGLES : (
/* 23 */       VertexMode.equals-impl0(i, VertexMode.Companion.getTriangleStrip-c2xauaI()) ? VertexMode.TRIANGLE_STRIP : (
/* 24 */       VertexMode.equals-impl0(i, VertexMode.Companion.getTriangleFan-c2xauaI()) ? VertexMode.TRIANGLE_FAN : 
/* 25 */       VertexMode.TRIANGLES));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaVertexMode_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */