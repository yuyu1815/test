/*    */ package androidx.compose.ui.unit;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005J\t\020\t\032\0020\003HÆ\003J\t\020\n\032\0020\003HÆ\003J\035\020\013\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\007¨\006\024"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "(FF)V", "getDensity", "()F", "getFontScale", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-unit"})
/*    */ final class DensityImpl
/*    */   implements Density
/*    */ {
/*    */   private final float density;
/*    */   private final float fontScale;
/*    */   
/*    */   public DensityImpl(float density, float fontScale) {
/* 38 */     this.density = density;
/* 39 */     this.fontScale = fontScale; } public float getFontScale() { return this.fontScale; }
/*    */ 
/*    */   
/*    */   public float getDensity() {
/*    */     return this.density;
/*    */   }
/*    */   
/*    */   public final float component1() {
/*    */     return this.density;
/*    */   }
/*    */   
/*    */   public final float component2() {
/*    */     return this.fontScale;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DensityImpl copy(float density, float fontScale) {
/*    */     return new DensityImpl(density, fontScale);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DensityImpl(density=" + this.density + ", fontScale=" + this.fontScale + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Float.hashCode(this.density);
/*    */     return result * 31 + Float.hashCode(this.fontScale);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DensityImpl))
/*    */       return false; 
/*    */     DensityImpl densityImpl = (DensityImpl)other;
/*    */     return (Float.compare(this.density, densityImpl.density) != 0) ? false : (!(Float.compare(this.fontScale, densityImpl.fontScale) != 0));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\DensityImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */