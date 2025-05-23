/*     */ package androidx.compose.ui.unit;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\t\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\013\n\002\030\002\n\002\b\037\n\002\020\016\n\002\b\007\b\b\030\000 P2\0020\001:\001PB%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\t\0208\032\0020\003HÆ\003J\t\0209\032\0020\003HÆ\003J\t\020:\032\0020\003HÆ\003J\t\020;\032\0020\003HÆ\003J\030\020<\032\0020\0362\006\020=\032\0020\rø\001\000¢\006\004\b>\020?J1\020@\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\003HÆ\001J\020\020A\032\0020\0002\006\020B\032\0020\003H\007J\023\020C\032\0020\0362\b\020D\032\004\030\0010\001HÖ\003J\t\020E\032\0020\003HÖ\001J\020\020F\032\0020\0002\006\020B\032\0020\003H\007J\020\020G\032\0020\0002\006\020D\032\0020\000H\007J\016\020H\032\0020\0362\006\020D\032\0020\000J\b\020I\032\0020JH\026J\032\020K\032\0020\0002\006\020=\032\0020\rH\007ø\001\000¢\006\004\bL\020MJ\030\020K\032\0020\0002\006\020N\032\0020\0032\006\020O\032\0020\003H\007R\034\020\006\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\b\020\t\032\004\b\n\020\013R\027\020\f\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\016\020\017R\027\020\020\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\021\020\017R\027\020\022\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\023\020\017R\027\020\024\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\025\020\017R\027\020\026\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\027\020\017R\027\020\030\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b\031\020\017R\032\020\032\032\0020\0038FX\004¢\006\f\022\004\b\033\020\t\032\004\b\034\020\013R\032\020\035\032\0020\0368FX\004¢\006\f\022\004\b\037\020\t\032\004\b\035\020 R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b!\020\t\032\004\b\"\020\013R\021\020#\032\0020\0038F¢\006\006\032\004\b$\020\013R\021\020%\032\0020\0038F¢\006\006\032\004\b&\020\013R\034\020\005\032\0020\0038\006X\004¢\006\016\n\000\022\004\b'\020\t\032\004\b(\020\013R \020)\032\0020*8FX\004ø\001\000ø\001\001¢\006\f\022\004\b+\020\t\032\004\b,\020\017R\034\020\004\032\0020\0038\006X\004¢\006\016\n\000\022\004\b-\020\t\032\004\b.\020\013R\027\020/\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b0\020\017R\027\0201\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b2\020\017R\027\0203\032\0020\r8Fø\001\000ø\001\001¢\006\006\032\004\b4\020\017R\032\0205\032\0020\0038FX\004¢\006\f\022\004\b6\020\t\032\004\b7\020\013\002\013\n\005\b¡\0360\001\n\002\b!¨\006Q"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "left", "", "top", "right", "bottom", "(IIII)V", "getBottom$annotations", "()V", "getBottom", "()I", "bottomCenter", "Landroidx/compose/ui/unit/IntOffset;", "getBottomCenter-nOcc-ac", "()J", "bottomLeft", "getBottomLeft-nOcc-ac", "bottomRight", "getBottomRight-nOcc-ac", "center", "getCenter-nOcc-ac", "centerLeft", "getCenterLeft-nOcc-ac", "centerRight", "getCenterRight-nOcc-ac", "height", "getHeight$annotations", "getHeight", "isEmpty", "", "isEmpty$annotations", "()Z", "getLeft$annotations", "getLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight$annotations", "getRight", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$annotations", "getSize-YbymL2g", "getTop$annotations", "getTop", "topCenter", "getTopCenter-nOcc-ac", "topLeft", "getTopLeft-nOcc-ac", "topRight", "getTopRight-nOcc-ac", "width", "getWidth$annotations", "getWidth", "component1", "component2", "component3", "component4", "contains", "offset", "contains--gyyYBs", "(J)Z", "copy", "deflate", "delta", "equals", "other", "hashCode", "inflate", "intersect", "overlaps", "toString", "", "translate", "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translateX", "translateY", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ public final class IntRect
/*     */ {
/*     */   public final int getLeft() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final int getTop() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final int getRight() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public IntRect(int left, int top, int right, int bottom) {
/*  39 */     this.left = left;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  45 */     this.top = top;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     this.right = right;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     this.bottom = bottom; } public final int getBottom() {
/*  58 */     return this.bottom;
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "ui-unit"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/*  64 */     public final IntRect getZero() { return IntRect.Zero; } } @NotNull public static final Companion Companion = new Companion(null); private final int left; private final int top; @NotNull private static final IntRect Zero = new IntRect(0, 0, 0, 0);
/*     */   private final int right;
/*     */   private final int bottom;
/*     */   public static final int $stable;
/*     */   
/*     */   public final int getWidth() {
/*  70 */     return this.right - this.left;
/*     */   }
/*     */ 
/*     */   
/*     */   public final int getHeight() {
/*  75 */     return this.bottom - this.top;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getSize-YbymL2g() {
/*  83 */     return IntSizeKt.IntSize(getWidth(), getHeight());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isEmpty() {
/*  91 */     return (this.left >= this.right || this.top >= this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final IntRect translate--gyyYBs(long offset) {
/* 101 */     return new IntRect(this.left + IntOffset.getX-impl(offset), this.top + IntOffset.getY-impl(offset), this.right + IntOffset.getX-impl(offset), this.bottom + IntOffset.getY-impl(offset));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final IntRect translate(int translateX, int translateY) {
/* 110 */     return new IntRect(
/* 111 */         this.left + translateX, 
/* 112 */         this.top + translateY, 
/* 113 */         this.right + translateX, 
/* 114 */         this.bottom + translateY);
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final IntRect inflate(int delta) {
/* 121 */     return new IntRect(this.left - delta, this.top - delta, this.right + delta, this.bottom + delta);
/*     */   }
/*     */   @Stable
/*     */   @NotNull
/*     */   public final IntRect deflate(int delta) {
/* 126 */     return inflate(-delta);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final IntRect intersect(@NotNull IntRect other) {
/* 136 */     Intrinsics.checkNotNullParameter(other, "other"); return new IntRect(
/* 137 */         Math.max(this.left, other.left), 
/* 138 */         Math.max(this.top, other.top), 
/* 139 */         Math.min(this.right, other.right), 
/* 140 */         Math.min(this.bottom, other.bottom));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean overlaps(@NotNull IntRect other) {
/* 146 */     Intrinsics.checkNotNullParameter(other, "other"); if (this.right <= other.left || other.right <= this.left)
/* 147 */       return false; 
/* 148 */     if (this.bottom <= other.top || other.bottom <= this.top)
/* 149 */       return false; 
/* 150 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getMinDimension() {
/* 158 */     return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getMaxDimension() {
/* 165 */     return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopLeft-nOcc-ac() {
/* 171 */     return IntOffsetKt.IntOffset(this.left, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopCenter-nOcc-ac() {
/* 177 */     return IntOffsetKt.IntOffset(this.left + getWidth() / 2, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getTopRight-nOcc-ac() {
/* 183 */     return IntOffsetKt.IntOffset(this.right, this.top);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenterLeft-nOcc-ac() {
/* 189 */     return IntOffsetKt.IntOffset(this.left, this.top + getHeight() / 2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenter-nOcc-ac() {
/* 198 */     return IntOffsetKt.IntOffset(this.left + getWidth() / 2, this.top + getHeight() / 2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getCenterRight-nOcc-ac() {
/* 204 */     return IntOffsetKt.IntOffset(this.right, this.top + getHeight() / 2);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomLeft-nOcc-ac() {
/* 210 */     return IntOffsetKt.IntOffset(this.left, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomCenter-nOcc-ac() {
/* 216 */     return IntOffsetKt.IntOffset(this.left + getWidth() / 2, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBottomRight-nOcc-ac() {
/* 222 */     return IntOffsetKt.IntOffset(this.right, this.bottom);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean contains--gyyYBs(long offset) {
/* 233 */     return (IntOffset.getX-impl(offset) >= this.left && IntOffset.getX-impl(offset) < this.right && IntOffset.getY-impl(offset) >= this.top && IntOffset.getY-impl(offset) < this.bottom);
/*     */   } @NotNull
/*     */   public String toString() {
/* 236 */     return "IntRect.fromLTRB(" + 
/* 237 */       this.left + ", " + 
/* 238 */       this.top + ", " + 
/* 239 */       this.right + ", " + 
/* 240 */       this.bottom + ')';
/*     */   }
/*     */   
/*     */   public final int component1() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final int component2() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final int component3() {
/*     */     return this.right;
/*     */   }
/*     */   
/*     */   public final int component4() {
/*     */     return this.bottom;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final IntRect copy(int left, int top, int right, int bottom) {
/*     */     return new IntRect(left, top, right, bottom);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Integer.hashCode(this.left);
/*     */     result = result * 31 + Integer.hashCode(this.top);
/*     */     result = result * 31 + Integer.hashCode(this.right);
/*     */     return result * 31 + Integer.hashCode(this.bottom);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof IntRect))
/*     */       return false; 
/*     */     IntRect intRect = (IntRect)other;
/*     */     return (this.left != intRect.left) ? false : ((this.top != intRect.top) ? false : ((this.right != intRect.right) ? false : (!(this.bottom != intRect.bottom))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */