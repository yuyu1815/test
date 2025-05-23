/*    */ package androidx.compose.ui.graphics.drawscope;
/*    */ 
/*    */ import androidx.compose.ui.geometry.OffsetKt;
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.ClipOp;
/*    */ import androidx.compose.ui.graphics.Path;
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
/*    */ @DrawScopeMarker
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\022\n\002\030\002\n\002\b\004\bg\030\0002\0020\001J$\020\t\032\0020\n2\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\016H&ø\001\000¢\006\004\b\017\020\020JD\020\021\032\0020\n2\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\0232\b\b\002\020\025\032\0020\0232\b\b\002\020\026\032\0020\0232\b\b\002\020\r\032\0020\016H&ø\001\000¢\006\004\b\027\020\030J(\020\031\032\0020\n2\006\020\022\032\0020\0232\006\020\024\032\0020\0232\006\020\025\032\0020\0232\006\020\026\032\0020\023H&J$\020\032\032\0020\n2\006\020\033\032\0020\0232\b\b\002\020\034\032\0020\003H&ø\001\000¢\006\004\b\035\020\036J,\020\037\032\0020\n2\006\020 \032\0020\0232\006\020!\032\0020\0232\b\b\002\020\034\032\0020\003H&ø\001\000¢\006\004\b\"\020#J\032\020$\032\0020\n2\006\020%\032\0020&H&ø\001\000¢\006\004\b'\020(J\034\020)\032\0020\n2\b\b\002\020\022\032\0020\0232\b\b\002\020\024\032\0020\023H&R\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005R\030\020\006\032\0020\007X¦\004ø\001\000ø\001\001¢\006\006\032\004\b\b\020\005ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006*À\006\003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "inset", "rotate", "degrees", "pivot", "rotate-Uv8p0NA", "(FJ)V", "scale", "scaleX", "scaleY", "scale-0AR0LA0", "(FFJ)V", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "ui-graphics"})
/*    */ public interface DrawTransform
/*    */ {
/*    */   default long getCenter-F1C5BW0() {
/* 94 */     return OffsetKt.Offset(Size.getWidth-impl(getSize-NH-jbRc()) / 2, Size.getHeight-impl(getSize-NH-jbRc()) / 2); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated public static long getCenter-F1C5BW0(@NotNull DrawTransform $this) { return $this.getCenter-F1C5BW0(); }
/*    */      }
/*    */ 
/*    */   
/*    */   long getSize-NH-jbRc();
/*    */   
/*    */   void inset(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */   
/*    */   void clipRect-N_I0leg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt);
/*    */   
/*    */   void clipPath-mtrdD-E(@NotNull Path paramPath, int paramInt);
/*    */   
/*    */   void translate(float paramFloat1, float paramFloat2);
/*    */   
/*    */   void rotate-Uv8p0NA(float paramFloat, long paramLong);
/*    */   
/*    */   void scale-0AR0LA0(float paramFloat1, float paramFloat2, long paramLong);
/*    */   
/*    */   void transform-58bKbWc(@NotNull float[] paramArrayOffloat);
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\DrawTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */