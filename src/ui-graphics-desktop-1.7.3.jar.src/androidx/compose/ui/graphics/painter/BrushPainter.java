/*    */ package androidx.compose.ui.graphics.painter;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\017\032\0020\0202\006\020\005\032\0020\006H\024J\022\020\021\032\0020\0202\b\020\t\032\004\030\0010\nH\024J\023\020\022\032\0020\0202\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\030H\026J\f\020\031\032\0020\032*\0020\033H\024R\016\020\005\032\0020\006X\016¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\032\020\013\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\r\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006\034"}, d2 = {"Landroidx/compose/ui/graphics/painter/BrushPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "brush", "Landroidx/compose/ui/graphics/Brush;", "(Landroidx/compose/ui/graphics/Brush;)V", "alpha", "", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics"})
/*    */ public final class BrushPainter
/*    */   extends Painter
/*    */ {
/*    */   @NotNull
/*    */   private final Brush brush;
/*    */   private float alpha;
/*    */   @Nullable
/*    */   private ColorFilter colorFilter;
/*    */   
/*    */   @NotNull
/*    */   public final Brush getBrush() {
/* 29 */     return this.brush; } public BrushPainter(@NotNull Brush brush) { this.brush = brush;
/*    */ 
/*    */     
/* 32 */     this.alpha = 1.0F; }
/*    */ 
/*    */   
/*    */   public long getIntrinsicSize-NH-jbRc() {
/* 36 */     return this.brush.getIntrinsicSize-NH-jbRc();
/*    */   }
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/* 39 */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>"); DrawScope.drawRect-AsUm42w$default($this$onDraw, this.brush, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
/*    */   }
/*    */   
/*    */   protected boolean applyAlpha(float alpha) {
/* 43 */     this.alpha = alpha;
/* 44 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
/* 48 */     this.colorFilter = colorFilter;
/* 49 */     return true;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 53 */     if (this == other) return true; 
/* 54 */     if (!(other instanceof BrushPainter)) return false;
/*    */     
/* 56 */     if (!Intrinsics.areEqual(this.brush, ((BrushPainter)other).brush)) return false;
/*    */     
/* 58 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 62 */     return this.brush.hashCode();
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 66 */     return "BrushPainter(brush=" + this.brush + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\painter\BrushPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */