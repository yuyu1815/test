/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001B)\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003¢\006\004\b\t\020\nR\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\023\020\004\032\0020\005¢\006\n\n\002\020\020\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\023\020\f¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke$Solid;", "Lorg/jetbrains/jewel/foundation/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "expand", "<init>", "(FJLorg/jetbrains/jewel/foundation/Stroke$Alignment;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getColor-0d7_KjU", "()J", "J", "getAlignment", "()Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "getExpand-D9Ej5fM", "foundation"})
/*    */ @Immutable
/*    */ public final class Solid extends Stroke {
/*    */   private final float width;
/*    */   private final long color;
/*    */   @NotNull
/*    */   private final Stroke.Alignment alignment;
/*    */   private final float expand;
/*    */   public static final int $stable;
/*    */   
/* 20 */   public final float getWidth-D9Ej5fM() { return this.width; }
/* 21 */   public final long getColor-0d7_KjU() { return this.color; } @NotNull
/* 22 */   public final Stroke.Alignment getAlignment() { return this.alignment; }
/* 23 */   public final float getExpand-D9Ej5fM() { return this.expand; } private Solid(float width, long color, Stroke.Alignment alignment, float expand) {
/* 24 */     super(null);
/*    */     this.width = width;
/*    */     this.color = color;
/*    */     this.alignment = alignment;
/*    */     this.expand = expand;
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Solid))
/*    */       return false; 
/*    */     Solid solid = (Solid)other;
/*    */     return !Dp.equals-impl0(this.width, solid.width) ? false : (!Color.equals-impl0(this.color, solid.color) ? false : ((this.alignment != solid.alignment) ? false : (!!Dp.equals-impl0(this.expand, solid.expand))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Dp.hashCode-impl(this.width);
/*    */     result = result * 31 + Color.hashCode-impl(this.color);
/*    */     result = result * 31 + this.alignment.hashCode();
/*    */     return result * 31 + Dp.hashCode-impl(this.expand);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Solid(width=" + Dp.toString-impl(this.width) + ", color=" + Color.toString-impl(this.color) + ", alignment=" + this.alignment + ", expand=" + Dp.toString-impl(this.expand) + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\Stroke$Solid.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */