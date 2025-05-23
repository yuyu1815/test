/*    */ package org.jetbrains.jewel.foundation;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\003\b\t\n¨\006\013"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke;", "", "<init>", "()V", "None", "Solid", "Brush", "Alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Brush;", "Lorg/jetbrains/jewel/foundation/Stroke$None;", "Lorg/jetbrains/jewel/foundation/Stroke$Solid;", "foundation"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public abstract class Stroke { public static final int $stable;
/*    */   private Stroke() {}
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke$None;", "Lorg/jetbrains/jewel/foundation/Stroke;", "<init>", "()V", "toString", "", "foundation"})
/*    */   @Immutable
/*    */   public static final class None extends Stroke { @NotNull
/*    */     public static final None INSTANCE = new None();
/*    */     public static final int $stable;
/*    */     
/* 12 */     private None() { super(null); } @NotNull
/* 13 */     public String toString() { return "None"; }
/*    */      }
/*    */   @GenerateDataFunctions
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001B)\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003¢\006\004\b\t\020\nR\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\023\020\004\032\0020\005¢\006\n\n\002\020\020\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\023\020\f¨\006\024"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke$Solid;", "Lorg/jetbrains/jewel/foundation/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "expand", "<init>", "(FJLorg/jetbrains/jewel/foundation/Stroke$Alignment;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getColor-0d7_KjU", "()J", "J", "getAlignment", "()Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "getExpand-D9Ej5fM", "foundation"})
/*    */   @Immutable
/*    */   public static final class Solid extends Stroke { private final float width; private final long color; @NotNull
/*    */     private final Stroke.Alignment alignment; private final float expand; public static final int $stable;
/* 20 */     public final float getWidth-D9Ej5fM() { return this.width; }
/* 21 */     public final long getColor-0d7_KjU() { return this.color; } @NotNull
/* 22 */     public final Stroke.Alignment getAlignment() { return this.alignment; }
/* 23 */     public final float getExpand-D9Ej5fM() { return this.expand; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Solid)) return false;  Solid solid = (Solid)other; return !Dp.equals-impl0(this.width, solid.width) ? false : (!Color.equals-impl0(this.color, solid.color) ? false : ((this.alignment != solid.alignment) ? false : (!!Dp.equals-impl0(this.expand, solid.expand)))); } public int hashCode() { result = Dp.hashCode-impl(this.width); result = result * 31 + Color.hashCode-impl(this.color); result = result * 31 + this.alignment.hashCode(); return result * 31 + Dp.hashCode-impl(this.expand); }
/* 24 */     private Solid(float width, long color, Stroke.Alignment alignment, float expand) { super(null);
/*    */       this.width = width;
/*    */       this.color = color;
/*    */       this.alignment = alignment;
/*    */       this.expand = expand; } @NotNull public String toString() { return "Solid(width=" + Dp.toString-impl(this.width) + ", color=" + Color.toString-impl(this.color) + ", alignment=" + this.alignment + ", expand=" + Dp.toString-impl(this.expand) + ")"; } } @GenerateDataFunctions @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\b\007\030\0002\0020\001B)\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003¢\006\004\b\t\020\nR\023\020\002\032\0020\003¢\006\n\n\002\020\r\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\b\032\0020\003¢\006\n\n\002\020\r\032\004\b\022\020\f¨\006\023"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke$Brush;", "Lorg/jetbrains/jewel/foundation/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "expand", "<init>", "(FLandroidx/compose/ui/graphics/Brush;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getWidth-D9Ej5fM", "()F", "F", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getAlignment", "()Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "getExpand-D9Ej5fM", "foundation"}) @Immutable public static final class Brush extends Stroke { private final float width; @NotNull private final androidx.compose.ui.graphics.Brush brush; @NotNull
/*    */     private final Stroke.Alignment alignment; private final float expand; public static final int $stable;
/* 30 */     public final float getWidth-D9Ej5fM() { return this.width; } @NotNull
/* 31 */     public final androidx.compose.ui.graphics.Brush getBrush() { return this.brush; } @NotNull
/* 32 */     public final Stroke.Alignment getAlignment() { return this.alignment; }
/* 33 */     public final float getExpand-D9Ej5fM() { return this.expand; }
/* 34 */     public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Brush)) return false;  Brush brush = (Brush)other; return !Dp.equals-impl0(this.width, brush.width) ? false : (!Intrinsics.areEqual(this.brush, brush.brush) ? false : ((this.alignment != brush.alignment) ? false : (!!Dp.equals-impl0(this.expand, brush.expand)))); } public int hashCode() { result = Dp.hashCode-impl(this.width); result = result * 31 + this.brush.hashCode(); result = result * 31 + this.alignment.hashCode(); return result * 31 + Dp.hashCode-impl(this.expand); } private Brush(float width, androidx.compose.ui.graphics.Brush brush, Stroke.Alignment alignment, float expand) { super(null); this.width = width; this.brush = brush;
/*    */       this.alignment = alignment;
/*    */       this.expand = expand; } @NotNull public String toString() { return "Brush(width=" + Dp.toString-impl(this.width) + ", brush=" + this.brush + ", alignment=" + this.alignment + ", expand=" + Dp.toString-impl(this.expand) + ")"; } }
/* 37 */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005j\002\b\006¨\006\007"}, d2 = {"Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "Inside", "Center", "Outside", "foundation"}) public enum Alignment { Inside,
/* 38 */     Center,
/* 39 */     Outside; @NotNull
/* 40 */     public static EnumEntries<Alignment> getEntries() { return $ENTRIES; }
/*    */      }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\Stroke.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */