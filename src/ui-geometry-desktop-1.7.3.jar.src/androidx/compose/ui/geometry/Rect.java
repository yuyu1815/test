/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\017\n\002\030\002\n\002\b\033\n\002\020\b\n\002\b\b\n\002\020\016\n\002\b\007\b\b\030\000 Y2\0020\001:\001YB%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\t\020<\032\0020\003HÆ\003J\t\020=\032\0020\003HÆ\003J\t\020>\032\0020\003HÆ\003J\t\020?\032\0020\003HÆ\003J\033\020@\032\0020\0362\006\020A\032\0020\rH\002ø\001\000¢\006\004\bB\020CJ1\020D\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\003HÆ\001J\020\020E\032\0020\0002\006\020F\032\0020\003H\007J\023\020G\032\0020\0362\b\020H\032\004\030\0010\001HÖ\003J\t\020I\032\0020JHÖ\001J\020\020K\032\0020\0002\006\020F\032\0020\003H\007J\020\020L\032\0020\0002\006\020H\032\0020\000H\007J(\020L\032\0020\0002\006\020M\032\0020\0032\006\020N\032\0020\0032\006\020O\032\0020\0032\006\020P\032\0020\003H\007J\016\020Q\032\0020\0362\006\020H\032\0020\000J\b\020R\032\0020SH\026J\032\020T\032\0020\0002\006\020A\032\0020\rH\007ø\001\000¢\006\004\bU\020VJ\030\020T\032\0020\0002\006\020W\032\0020\0032\006\020X\032\0020\003H\007R\034\020\006\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\b\020\t\032\004\b\n\020\013R\027\020\f\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\016\020\017R\027\020\020\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\021\020\017R\027\020\022\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\023\020\017R\027\020\024\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\025\020\017R\027\020\026\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\027\020\017R\027\020\030\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\031\020\017R\032\020\032\032\0020\0038FX\004¢\006\f\022\004\b\033\020\t\032\004\b\034\020\013R\032\020\035\032\0020\0368FX\004¢\006\f\022\004\b\037\020\t\032\004\b\035\020 R\032\020!\032\0020\0368FX\004¢\006\f\022\004\b\"\020\t\032\004\b!\020 R\032\020#\032\0020\0368FX\004¢\006\f\022\004\b$\020\t\032\004\b#\020 R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b%\020\t\032\004\b&\020\013R\021\020'\032\0020\0038F¢\006\006\032\004\b(\020\013R\021\020)\032\0020\0038F¢\006\006\032\004\b*\020\013R\034\020\005\032\0020\0038\006X\004¢\006\016\n\000\022\004\b+\020\t\032\004\b,\020\013R \020-\032\0020.8FX\004ø\001\000ø\001\001¢\006\f\022\004\b/\020\t\032\004\b0\020\017R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b1\020\t\032\004\b2\020\013R\027\0203\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b4\020\017R\027\0205\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b6\020\017R\027\0207\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b8\020\017R\032\0209\032\0020\0038FX\004¢\006\f\022\004\b:\020\t\032\004\b;\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006Z"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom$annotations", "()V", "getBottom", "()F", "bottomCenter", "Landroidx/compose/ui/geometry/Offset;", "getBottomCenter-F1C5BW0", "()J", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "center", "getCenter-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "height", "getHeight$annotations", "getHeight", "isEmpty", "", "isEmpty$annotations", "()Z", "isFinite", "isFinite$annotations", "isInfinite", "isInfinite$annotations", "getLeft$annotations", "getLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight$annotations", "getRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc$annotations", "getSize-NH-jbRc", "getTop$annotations", "getTop", "topCenter", "getTopCenter-F1C5BW0", "topLeft", "getTopLeft-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "width", "getWidth$annotations", "getWidth", "component1", "component2", "component3", "component4", "contains", "offset", "contains-k-4lQ0M", "(J)Z", "copy", "deflate", "delta", "equals", "other", "hashCode", "", "inflate", "intersect", "otherLeft", "otherTop", "otherRight", "otherBottom", "overlaps", "toString", "", "translate", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translateX", "translateY", "Companion", "ui-geometry"})
/*     */ @Immutable
/*     */ public final class Rect
/*     */ {
/*     */   public final float getLeft() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final float getTop() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final float getRight() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public Rect(float left, float top, float right, float bottom) {
/*  36 */     this.left = left;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     this.top = top;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.right = right;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     this.bottom = bottom; } public final float getBottom() {
/*  55 */     return this.bottom;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*  62 */     public final Rect getZero() { return Rect.Zero; } } @NotNull public static final Companion Companion = new Companion(null); private final float left; private final float top; @NotNull private static final Rect Zero = new Rect(0.0F, 0.0F, 0.0F, 0.0F);
/*     */   private final float right;
/*     */   private final float bottom;
/*     */   public static final int $stable;
/*     */   
/*     */   public final float getWidth() {
/*  68 */     return this.right - this.left;
/*     */   }
/*     */ 
/*     */   
/*     */   public final float getHeight() {
/*  73 */     return this.bottom - this.top;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getSize-NH-jbRc() {
/*  81 */     return SizeKt.Size(getWidth(), getHeight());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isInfinite() {
/*  87 */     return (this.left >= Float.POSITIVE_INFINITY || 
/*  88 */       this.top >= Float.POSITIVE_INFINITY || 
/*  89 */       this.right >= Float.POSITIVE_INFINITY || 
/*  90 */       this.bottom >= Float.POSITIVE_INFINITY);
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean isFinite() {
/*  95 */     float f = this.left; if ((!Float.isInfinite(f) && !Float.isNaN(f)))
/*  96 */     { f = this.top; if ((!Float.isInfinite(f) && !Float.isNaN(f)))
/*  97 */       { f = this.right; if ((!Float.isInfinite(f) && !Float.isNaN(f)))
/*  98 */         { f = this.bottom; if ((!Float.isInfinite(f) && !Float.isNaN(f))); }  }  }  return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isEmpty() {
/* 106 */     return (this.left >= this.right || this.top >= this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect translate-k-4lQ0M(long offset) {
/* 116 */     return new Rect(this.left + Offset.getX-impl(offset), this.top + Offset.getY-impl(offset), this.right + Offset.getX-impl(offset), this.bottom + Offset.getY-impl(offset));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect translate(float translateX, float translateY) {
/* 125 */     return new Rect(
/* 126 */         this.left + translateX, 
/* 127 */         this.top + translateY, 
/* 128 */         this.right + translateX, 
/* 129 */         this.bottom + translateY);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect inflate(float delta) {
/* 136 */     return new Rect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
/*     */   }
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect deflate(float delta) {
/* 141 */     return inflate(-delta);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect intersect(@NotNull Rect other) {
/* 151 */     Intrinsics.checkNotNullParameter(other, "other"); return new Rect(
/* 152 */         Math.max(this.left, other.left), 
/* 153 */         Math.max(this.top, other.top), 
/* 154 */         Math.min(this.right, other.right), 
/* 155 */         Math.min(this.bottom, other.bottom));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final Rect intersect(float otherLeft, float otherTop, float otherRight, float otherBottom) {
/* 167 */     return new Rect(
/* 168 */         Math.max(this.left, otherLeft), 
/* 169 */         Math.max(this.top, otherTop), 
/* 170 */         Math.min(this.right, otherRight), 
/* 171 */         Math.min(this.bottom, otherBottom));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean overlaps(@NotNull Rect other) {
/* 177 */     Intrinsics.checkNotNullParameter(other, "other"); if (this.right <= other.left || other.right <= this.left)
/* 178 */       return false; 
/* 179 */     if (this.bottom <= other.top || other.bottom <= this.top)
/* 180 */       return false; 
/* 181 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getMinDimension() {
/* 189 */     return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getMaxDimension() {
/* 196 */     return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopLeft-F1C5BW0() {
/* 202 */     return OffsetKt.Offset(this.left, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopCenter-F1C5BW0() {
/* 208 */     return OffsetKt.Offset(this.left + getWidth() / 2.0F, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopRight-F1C5BW0() {
/* 214 */     return OffsetKt.Offset(this.right, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenterLeft-F1C5BW0() {
/* 220 */     return OffsetKt.Offset(this.left, this.top + getHeight() / 2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenter-F1C5BW0() {
/* 229 */     return OffsetKt.Offset(this.left + getWidth() / 2.0F, this.top + getHeight() / 2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenterRight-F1C5BW0() {
/* 235 */     return OffsetKt.Offset(this.right, this.top + getHeight() / 2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomLeft-F1C5BW0() {
/* 241 */     return OffsetKt.Offset(this.left, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomCenter-F1C5BW0() {
/* 247 */     return OffsetKt.Offset(this.left + getWidth() / 2.0F, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomRight-F1C5BW0() {
/* 253 */     return OffsetKt.Offset(this.right, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean contains-k-4lQ0M(long offset) {
/* 264 */     return (Offset.getX-impl(offset) >= this.left && Offset.getX-impl(offset) < this.right && Offset.getY-impl(offset) >= this.top && Offset.getY-impl(offset) < this.bottom);
/*     */   } @NotNull
/*     */   public String toString() {
/* 267 */     return "Rect.fromLTRB(" + 
/* 268 */       GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + 
/* 269 */       GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + 
/* 270 */       GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + 
/* 271 */       GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
/*     */   }
/*     */   
/*     */   public final float component1() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final float component2() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final float component3() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public final float component4() {
/*     */     return this.bottom;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Rect copy(float left, float top, float right, float bottom) {
/*     */     return new Rect(left, top, right, bottom);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Float.hashCode(this.left);
/*     */     result = result * 31 + Float.hashCode(this.top);
/*     */     result = result * 31 + Float.hashCode(this.right);
/*     */     return result * 31 + Float.hashCode(this.bottom);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Rect))
/*     */       return false; 
/*     */     Rect rect = (Rect)other;
/*     */     return (Float.compare(this.left, rect.left) != 0) ? false : ((Float.compare(this.top, rect.top) != 0) ? false : ((Float.compare(this.right, rect.right) != 0) ? false : (!(Float.compare(this.bottom, rect.bottom) != 0))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\Rect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */