/*    */ package androidx.compose.ui.graphics.colorspace;
/*    */ 
/*    */ import androidx.annotation.Size;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\024\n\002\b\002\b\b\030\0002\0020\001B\037\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006B'\b\022\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\007\032\0020\003¢\006\002\020\bB\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\tJ\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J\035\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001J\r\020\027\032\0020\030H\001¢\006\002\b\031R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\013¨\006\032"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "x", "", "y", "z", "(FFF)V", "sum", "(FFFF)V", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toXyz", "", "toXyz$ui_graphics", "ui-graphics"})
/*    */ public final class WhitePoint
/*    */ {
/*    */   private final float x;
/*    */   private final float y;
/*    */   
/*    */   public WhitePoint(float x, float y) {
/* 28 */     this.x = x; this.y = y; } public final float getX() { return this.x; } public final float getY() { return this.y; }
/*    */ 
/*    */   
/*    */   public WhitePoint(float x, float y, float z) {
/* 32 */     this(x, y, z, x + y + z);
/*    */   }
/*    */   private WhitePoint(float x, float y, float z, float sum) {
/* 35 */     this(x / sum, y / sum);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Size(3L)
/*    */   @NotNull
/*    */   public final float[] toXyz$ui_graphics() {
/* 45 */     float[] arrayOfFloat = new float[3]; arrayOfFloat[0] = this.x / this.y; arrayOfFloat[1] = 1.0F; arrayOfFloat[2] = (1.0F - this.x - this.y) / this.y; return arrayOfFloat;
/*    */   }
/*    */   
/*    */   public final float component1() {
/*    */     return this.x;
/*    */   }
/*    */   
/*    */   public final float component2() {
/*    */     return this.y;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final WhitePoint copy(float x, float y) {
/*    */     return new WhitePoint(x, y);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "WhitePoint(x=" + this.x + ", y=" + this.y + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Float.hashCode(this.x);
/*    */     return result * 31 + Float.hashCode(this.y);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof WhitePoint))
/*    */       return false; 
/*    */     WhitePoint whitePoint = (WhitePoint)other;
/*    */     return (Float.compare(this.x, whitePoint.x) != 0) ? false : (!(Float.compare(this.y, whitePoint.y) != 0));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\colorspace\WhitePoint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */