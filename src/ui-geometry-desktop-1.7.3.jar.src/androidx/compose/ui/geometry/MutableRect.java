/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\013\n\002\020\013\n\002\b\006\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\020\016\n\000\b\007\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007J\033\020\035\032\0020\0172\006\020\036\032\0020\037H\002ø\001\000¢\006\004\b \020!J(\020\"\032\0020#2\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\006\032\0020\003H\007J&\020$\032\0020#2\006\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\0032\006\020\006\032\0020\003J\b\020%\032\0020&H\026R\032\020\006\032\0020\003X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\022\020\f\032\0020\0038Æ\002¢\006\006\032\004\b\r\020\tR\021\020\016\032\0020\0178F¢\006\006\032\004\b\016\020\020R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\021\020\t\"\004\b\022\020\013R\032\020\005\032\0020\003X\016¢\006\016\n\000\032\004\b\023\020\t\"\004\b\024\020\013R\027\020\025\032\0020\0268Fø\001\000ø\001\001¢\006\006\032\004\b\027\020\030R\032\020\004\032\0020\003X\016¢\006\016\n\000\032\004\b\031\020\t\"\004\b\032\020\013R\022\020\033\032\0020\0038Æ\002¢\006\006\032\004\b\034\020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006'"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "height", "getHeight", "isEmpty", "", "()Z", "getLeft", "setLeft", "getRight", "setRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getTop", "setTop", "width", "getWidth", "contains", "offset", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "intersect", "", "set", "toString", "", "ui-geometry"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nMutableRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n1#1,102:1\n40#1,5:103\n*S KotlinDebug\n*F\n+ 1 MutableRect.kt\nandroidx/compose/ui/geometry/MutableRect\n*L\n51#1:103,5\n*E\n"})
/*     */ public final class MutableRect {
/*     */   private float left;
/*     */   private float top;
/*     */   private float right;
/*     */   private float bottom;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public final float getLeft() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final void setLeft(float <set-?>) {
/*     */     this.left = <set-?>;
/*     */   }
/*     */   
/*     */   public final float getTop() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public final void setTop(float <set-?>) {
/*     */     this.top = <set-?>;
/*     */   }
/*     */   
/*     */   public final float getRight() {
/*     */     return this.right;
/*     */   }
/*     */   
/*  33 */   public MutableRect(float left, float top, float right, float bottom) { this.left = left;
/*  34 */     this.top = top;
/*  35 */     this.right = right;
/*  36 */     this.bottom = bottom; } public final float getBottom() { return this.bottom; } public final void setRight(float <set-?>) { this.right = <set-?>; } public final void setBottom(float <set-?>) { this.bottom = <set-?>; }
/*     */ 
/*     */   
/*     */   public final float getWidth() {
/*  40 */     int $i$f$getWidth = 0; return getRight() - getLeft();
/*     */   }
/*     */   
/*     */   public final float getHeight() {
/*  44 */     int $i$f$getHeight = 0; return getBottom() - getTop();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getSize-NH-jbRc() {
/*  51 */     MutableRect this_$iv = this; int $i$f$getWidth = 0; this_$iv = this; int $i$f$getHeight = 0; return SizeKt.Size(
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
/*     */ 
/*     */ 
/*     */         
/* 103 */         this_$iv.getRight() - this_$iv.getLeft(), 
/*     */ 
/*     */ 
/*     */         
/* 107 */         this_$iv.getBottom() - this_$iv.getTop());
/*     */   }
/*     */   
/*     */   public final boolean isEmpty() {
/*     */     return (this.left >= this.right || this.top >= this.bottom);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public final void intersect(float left, float top, float right, float bottom) {
/*     */     this.left = Math.max(left, this.left);
/*     */     this.top = Math.max(top, this.top);
/*     */     this.right = Math.min(right, this.right);
/*     */     this.bottom = Math.min(bottom, this.bottom);
/*     */   }
/*     */   
/*     */   public final boolean contains-k-4lQ0M(long offset) {
/*     */     return (Offset.getX-impl(offset) >= this.left && Offset.getX-impl(offset) < this.right && Offset.getY-impl(offset) >= this.top && Offset.getY-impl(offset) < this.bottom);
/*     */   }
/*     */   
/*     */   public final void set(float left, float top, float right, float bottom) {
/*     */     this.left = left;
/*     */     this.top = top;
/*     */     this.right = right;
/*     */     this.bottom = bottom;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\MutableRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */