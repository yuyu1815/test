/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.geometry.OffsetKt;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\032,\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0032\b\b\002\020\005\032\0020\006H\007ø\001\000¢\006\004\b\007\020\b\032\030\020\t\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\003H\007\002\007\n\005\b¡\0360\001¨\006\r"}, d2 = {"BlurEffect", "Landroidx/compose/ui/graphics/BlurEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "BlurEffect-3YTHUZs", "(FFI)Landroidx/compose/ui/graphics/BlurEffect;", "OffsetEffect", "Landroidx/compose/ui/graphics/OffsetEffect;", "offsetX", "offsetY", "ui-graphics"})
/*    */ public final class RenderEffectKt
/*    */ {
/*    */   @Stable
/*    */   @NotNull
/*    */   public static final BlurEffect BlurEffect-3YTHUZs(float radiusX, float radiusY, int edgeTreatment) {
/* 47 */     return new BlurEffect(null, radiusX, radiusY, edgeTreatment, null);
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
/*    */   @Stable
/*    */   @NotNull
/*    */   public static final OffsetEffect OffsetEffect(float offsetX, float offsetY) {
/* 71 */     return new OffsetEffect(null, OffsetKt.Offset(offsetX, offsetY), null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\RenderEffectKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */