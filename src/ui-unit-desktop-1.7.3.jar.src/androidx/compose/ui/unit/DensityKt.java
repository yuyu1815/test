/*    */ package androidx.compose.ui.unit;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\032\032\020\000\032\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\003H\007¨\006\005"}, d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "ui-unit"})
/*    */ public final class DensityKt
/*    */ {
/*    */   @Stable
/*    */   @NotNull
/*    */   public static final Density Density(float density, float fontScale) {
/* 35 */     return new DensityImpl(density, fontScale);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\DensityKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */