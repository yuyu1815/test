/*    */ package androidx.compose.ui.graphics.painter;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.graphics.ColorFilter;
/*    */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\002\n\002\030\002\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\017\032\0020\0202\006\020\005\032\0020\006H\024J\022\020\021\032\0020\0202\b\020\n\032\004\030\0010\013H\024J\023\020\022\032\0020\0202\b\020\023\032\004\030\0010\024H\002J\b\020\025\032\0020\026H\026J\b\020\027\032\0020\030H\026J\f\020\031\032\0020\032*\0020\033H\024R\016\020\005\032\0020\006X\016¢\006\002\n\000R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020\t\032\004\b\007\020\bR\020\020\n\032\004\030\0010\013X\016¢\006\002\n\000R\034\020\f\032\0020\rX\004ø\001\000ø\001\001¢\006\n\n\002\020\t\032\004\b\016\020\b\002\013\n\005\b¡\0360\001\n\002\b!¨\006\034"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "color", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "getColor-0d7_KjU", "()J", "J", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics"})
/*    */ public final class ColorPainter
/*    */   extends Painter
/*    */ {
/*    */   private final long color;
/*    */   private float alpha;
/*    */   @Nullable
/*    */   private ColorFilter colorFilter;
/*    */   private final long intrinsicSize;
/*    */   
/*    */   private ColorPainter(long color) {
/* 27 */     this.color = color;
/* 28 */     this.alpha = 1.0F;
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
/* 66 */     this.intrinsicSize = Size.Companion.getUnspecified-NH-jbRc(); } public long getIntrinsicSize-NH-jbRc() { return this.intrinsicSize; }
/*    */ 
/*    */   
/*    */   public final long getColor-0d7_KjU() {
/*    */     return this.color;
/*    */   }
/*    */   
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/*    */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>");
/*    */     DrawScope.drawRect-n-J9OG0$default($this$onDraw, this.color, 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
/*    */   }
/*    */   
/*    */   protected boolean applyAlpha(float alpha) {
/*    */     this.alpha = alpha;
/*    */     return true;
/*    */   }
/*    */   
/*    */   protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
/*    */     this.colorFilter = colorFilter;
/*    */     return true;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ColorPainter))
/*    */       return false; 
/*    */     if (!Color.equals-impl0(this.color, ((ColorPainter)other).color))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Color.hashCode-impl(this.color);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ColorPainter(color=" + Color.toString-impl(this.color) + ')';
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\painter\ColorPainter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */