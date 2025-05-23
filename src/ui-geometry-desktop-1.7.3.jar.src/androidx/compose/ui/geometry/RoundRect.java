/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\004\n\002\030\002\n\002\b!\n\002\020\013\n\000\n\002\030\002\n\002\b\b\n\002\020\b\n\002\b\007\n\002\020\016\n\002\b\002\b\b\030\000 >2\0020\001:\001>BM\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\b\022\b\b\002\020\n\032\0020\b\022\b\b\002\020\013\032\0020\b¢\006\002\020\fJ\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\003HÆ\003J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\003HÆ\003J\026\020!\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b\"\020\021J\026\020#\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b$\020\021J\026\020%\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b&\020\021J\026\020'\032\0020\bHÆ\003ø\001\001ø\001\000¢\006\004\b(\020\021J\033\020)\032\0020*2\006\020+\032\0020,H\002ø\001\000¢\006\004\b-\020.Jc\020/\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\b2\b\b\002\020\n\032\0020\b2\b\b\002\020\013\032\0020\bHÆ\001ø\001\000¢\006\004\b0\0201J\023\0202\032\0020*2\b\0203\032\004\030\0010\001HÖ\003J\t\0204\032\00205HÖ\001J(\0206\032\0020\0032\006\0207\032\0020\0032\006\0208\032\0020\0032\006\0209\032\0020\0032\006\020:\032\0020\003H\002J\b\020;\032\0020\000H\002J\b\020<\032\0020=H\026R\020\020\r\032\004\030\0010\000X\016¢\006\002\n\000R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\031\020\013\032\0020\bø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\020\020\021R\031\020\n\032\0020\bø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\023\020\021R\021\020\024\032\0020\0038F¢\006\006\032\004\b\025\020\017R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\026\020\017R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\027\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\030\020\017R\031\020\007\032\0020\bø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\031\020\021R\031\020\t\032\0020\bø\001\000ø\001\001¢\006\n\n\002\020\022\032\004\b\032\020\021R\021\020\033\032\0020\0038F¢\006\006\032\004\b\034\020\017\002\013\n\005\b¡\0360\001\n\002\b!¨\006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry"})
/*     */ @Immutable
/*     */ public final class RoundRect
/*     */ {
/*     */   public final float getLeft() {
/*     */     return this.left;
/*     */   }
/*     */   
/*     */   public final float getTop() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   private RoundRect(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
/*  31 */     this.left = left;
/*     */     
/*  33 */     this.top = top;
/*     */     
/*  35 */     this.right = right;
/*     */     
/*  37 */     this.bottom = bottom;
/*     */     
/*  39 */     this.topLeftCornerRadius = topLeftCornerRadius;
/*     */ 
/*     */     
/*  42 */     this.topRightCornerRadius = topRightCornerRadius;
/*     */ 
/*     */     
/*  45 */     this.bottomRightCornerRadius = bottomRightCornerRadius;
/*     */ 
/*     */     
/*  48 */     this.bottomLeftCornerRadius = bottomLeftCornerRadius; } public final float getRight() { return this.right; } public final long getBottomLeftCornerRadius-kKHJgLs() { return this.bottomLeftCornerRadius; }
/*     */   public final float getBottom() { return this.bottom; }
/*     */   public final long getTopLeftCornerRadius-kKHJgLs() {
/*     */     return this.topLeftCornerRadius;
/*  52 */   } public final float getWidth() { return this.right - this.left; }
/*     */   public final long getTopRightCornerRadius-kKHJgLs() { return this.topRightCornerRadius; } public final long getBottomRightCornerRadius-kKHJgLs() {
/*     */     return this.bottomRightCornerRadius;
/*     */   } public final float getHeight() {
/*  56 */     return this.bottom - this.top;
/*     */   }
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
/*     */   private final RoundRect scaledRadiiRect() {
/*  69 */     if (this._scaledRadiiRect == null) { RoundRect $this$scaledRadiiRect_u24lambda_u240 = this; int $i$a$-run-RoundRect$scaledRadiiRect$1 = 0;
/*  70 */       float scale = 1.0F;
/*  71 */       scale = $this$scaledRadiiRect_u24lambda_u240.minRadius(scale, CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.bottomLeftCornerRadius), CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.topLeftCornerRadius), $this$scaledRadiiRect_u24lambda_u240.getHeight());
/*  72 */       scale = $this$scaledRadiiRect_u24lambda_u240.minRadius(scale, CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.topLeftCornerRadius), CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.topRightCornerRadius), $this$scaledRadiiRect_u24lambda_u240.getWidth());
/*  73 */       scale = $this$scaledRadiiRect_u24lambda_u240.minRadius(scale, CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.topRightCornerRadius), CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.bottomRightCornerRadius), $this$scaledRadiiRect_u24lambda_u240.getHeight());
/*  74 */       scale = $this$scaledRadiiRect_u24lambda_u240.minRadius(scale, CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.bottomRightCornerRadius), CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.bottomLeftCornerRadius), $this$scaledRadiiRect_u24lambda_u240.getWidth());
/*     */       
/*  76 */       RoundRect roundRect1 = new RoundRect(
/*  77 */           $this$scaledRadiiRect_u24lambda_u240.left * scale, 
/*  78 */           $this$scaledRadiiRect_u24lambda_u240.top * scale, 
/*  79 */           $this$scaledRadiiRect_u24lambda_u240.right * scale, 
/*  80 */           $this$scaledRadiiRect_u24lambda_u240.bottom * scale, 
/*  81 */           CornerRadiusKt.CornerRadius(
/*  82 */             CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.topLeftCornerRadius) * scale, 
/*  83 */             CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.topLeftCornerRadius) * scale), 
/*     */           
/*  85 */           CornerRadiusKt.CornerRadius(
/*  86 */             CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.topRightCornerRadius) * scale, 
/*  87 */             CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.topRightCornerRadius) * scale), 
/*     */           
/*  89 */           CornerRadiusKt.CornerRadius(
/*  90 */             CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.bottomRightCornerRadius) * scale, 
/*  91 */             CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.bottomRightCornerRadius) * scale), 
/*     */           
/*  93 */           CornerRadiusKt.CornerRadius(
/*  94 */             CornerRadius.getX-impl($this$scaledRadiiRect_u24lambda_u240.bottomLeftCornerRadius) * scale, 
/*  95 */             CornerRadius.getY-impl($this$scaledRadiiRect_u24lambda_u240.bottomLeftCornerRadius) * scale), null);
/*     */ 
/*     */       
/*  98 */       RoundRect it = roundRect1; int $i$a$-also-RoundRect$scaledRadiiRect$2 = 0;
/*     */       
/* 100 */       this._scaledRadiiRect = it; }
/*     */     
/*     */     return roundRect1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final float minRadius(float min, float radius1, float radius2, float limit) {
/* 108 */     float sum = radius1 + radius2;
/* 109 */     return (sum > limit && !((sum == 0.0F) ? 1 : 0)) ? 
/* 110 */       Math.min(min, limit / sum) : 
/*     */       
/* 112 */       min;
/*     */   }
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
/*     */   public final boolean contains-k-4lQ0M(long point) {
/* 126 */     if (Offset.getX-impl(point) < this.left || Offset.getX-impl(point) >= this.right || Offset.getY-impl(point) < this.top || Offset.getY-impl(point) >= this.bottom) {
/* 127 */       return false;
/*     */     }
/*     */     
/* 130 */     RoundRect scaled = scaledRadiiRect();
/*     */     
/* 132 */     float x = 0.0F;
/* 133 */     float y = 0.0F;
/* 134 */     float radiusX = 0.0F;
/* 135 */     float radiusY = 0.0F;
/*     */ 
/*     */     
/* 138 */     if (Offset.getX-impl(point) < this.left + CornerRadius.getX-impl(scaled.topLeftCornerRadius) && 
/* 139 */       Offset.getY-impl(point) < this.top + CornerRadius.getY-impl(scaled.topLeftCornerRadius)) {
/*     */       
/* 141 */       x = Offset.getX-impl(point) - this.left - CornerRadius.getX-impl(scaled.topLeftCornerRadius);
/* 142 */       y = Offset.getY-impl(point) - this.top - CornerRadius.getY-impl(scaled.topLeftCornerRadius);
/* 143 */       radiusX = CornerRadius.getX-impl(scaled.topLeftCornerRadius);
/* 144 */       radiusY = CornerRadius.getY-impl(scaled.topLeftCornerRadius);
/* 145 */     } else if (Offset.getX-impl(point) > this.right - CornerRadius.getX-impl(scaled.topRightCornerRadius) && 
/* 146 */       Offset.getY-impl(point) < this.top + CornerRadius.getY-impl(scaled.topRightCornerRadius)) {
/*     */       
/* 148 */       x = Offset.getX-impl(point) - this.right + CornerRadius.getX-impl(scaled.topRightCornerRadius);
/* 149 */       y = Offset.getY-impl(point) - this.top - CornerRadius.getY-impl(scaled.topRightCornerRadius);
/* 150 */       radiusX = CornerRadius.getX-impl(scaled.topRightCornerRadius);
/* 151 */       radiusY = CornerRadius.getY-impl(scaled.topRightCornerRadius);
/* 152 */     } else if (Offset.getX-impl(point) > this.right - CornerRadius.getX-impl(scaled.bottomRightCornerRadius) && 
/* 153 */       Offset.getY-impl(point) > this.bottom - CornerRadius.getY-impl(scaled.bottomRightCornerRadius)) {
/*     */       
/* 155 */       x = Offset.getX-impl(point) - this.right + CornerRadius.getX-impl(scaled.bottomRightCornerRadius);
/* 156 */       y = Offset.getY-impl(point) - this.bottom + CornerRadius.getY-impl(scaled.bottomRightCornerRadius);
/* 157 */       radiusX = CornerRadius.getX-impl(scaled.bottomRightCornerRadius);
/* 158 */       radiusY = CornerRadius.getY-impl(scaled.bottomRightCornerRadius);
/* 159 */     } else if (Offset.getX-impl(point) < this.left + CornerRadius.getX-impl(scaled.bottomLeftCornerRadius) && 
/* 160 */       Offset.getY-impl(point) > this.bottom - CornerRadius.getY-impl(scaled.bottomLeftCornerRadius)) {
/*     */       
/* 162 */       x = Offset.getX-impl(point) - this.left - CornerRadius.getX-impl(scaled.bottomLeftCornerRadius);
/* 163 */       y = Offset.getY-impl(point) - this.bottom + CornerRadius.getY-impl(scaled.bottomLeftCornerRadius);
/* 164 */       radiusX = CornerRadius.getX-impl(scaled.bottomLeftCornerRadius);
/* 165 */       radiusY = CornerRadius.getY-impl(scaled.bottomLeftCornerRadius);
/*     */     } else {
/* 167 */       return true;
/*     */     } 
/*     */     
/* 170 */     float newX = x / radiusX;
/* 171 */     float newY = y / radiusY;
/*     */ 
/*     */     
/* 174 */     return (newX * newX + newY * newY <= 1.0F);
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 178 */     long tlRadius = this.topLeftCornerRadius;
/* 179 */     long trRadius = this.topRightCornerRadius;
/* 180 */     long brRadius = this.bottomRightCornerRadius;
/* 181 */     long blRadius = this.bottomLeftCornerRadius;
/* 182 */     String rect = 
/* 183 */       GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + 
/* 184 */       GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + 
/* 185 */       GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + 
/* 186 */       GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
/* 187 */     if (CornerRadius.equals-impl0(tlRadius, trRadius) && 
/* 188 */       CornerRadius.equals-impl0(trRadius, brRadius) && 
/* 189 */       CornerRadius.equals-impl0(brRadius, blRadius)) {
/*     */       
/* 191 */       if ((CornerRadius.getX-impl(tlRadius) == CornerRadius.getY-impl(tlRadius))) {
/* 192 */         return "RoundRect(rect=" + rect + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(tlRadius), 1) + ')';
/*     */       }
/* 194 */       return "RoundRect(rect=" + rect + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(tlRadius), 1) + ", y=" + 
/* 195 */         GeometryUtilsKt.toStringAsFixed(CornerRadius.getY-impl(tlRadius), 1) + ')';
/*     */     } 
/* 197 */     return "RoundRect(rect=" + 
/* 198 */       rect + ", topLeft=" + CornerRadius.toString-impl(
/* 199 */         tlRadius) + ", topRight=" + CornerRadius.toString-impl(
/* 200 */         trRadius) + ", bottomRight=" + CornerRadius.toString-impl(
/* 201 */         brRadius) + ", bottomLeft=" + CornerRadius.toString-impl(
/* 202 */         blRadius) + ')';
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry"})
/*     */   public static final class Companion { private Companion() {}
/*     */     
/*     */     @NotNull
/* 208 */     public final RoundRect getZero() { return RoundRect.Zero; } } @NotNull public static final Companion Companion = new Companion(null); private final float left; private final float top; private final float right; private final float bottom; private final long topLeftCornerRadius; private final long topRightCornerRadius; private final long bottomRightCornerRadius; private final long bottomLeftCornerRadius; @Nullable private RoundRect _scaledRadiiRect; public static final int $stable; @NotNull private static final RoundRect Zero = RoundRectKt.RoundRect-gG7oq9Y(0.0F, 0.0F, 0.0F, 0.0F, CornerRadius.Companion.getZero-kKHJgLs());
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
/*     */   public final long component5-kKHJgLs() {
/*     */     return this.topLeftCornerRadius;
/*     */   }
/*     */   
/*     */   public final long component6-kKHJgLs() {
/*     */     return this.topRightCornerRadius;
/*     */   }
/*     */   
/*     */   public final long component7-kKHJgLs() {
/*     */     return this.bottomRightCornerRadius;
/*     */   }
/*     */   
/*     */   public final long component8-kKHJgLs() {
/*     */     return this.bottomLeftCornerRadius;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RoundRect copy-MDFrsts(float left, float top, float right, float bottom, long topLeftCornerRadius, long topRightCornerRadius, long bottomRightCornerRadius, long bottomLeftCornerRadius) {
/*     */     return new RoundRect(left, top, right, bottom, topLeftCornerRadius, topRightCornerRadius, bottomRightCornerRadius, bottomLeftCornerRadius, null);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Float.hashCode(this.left);
/*     */     result = result * 31 + Float.hashCode(this.top);
/*     */     result = result * 31 + Float.hashCode(this.right);
/*     */     result = result * 31 + Float.hashCode(this.bottom);
/*     */     result = result * 31 + CornerRadius.hashCode-impl(this.topLeftCornerRadius);
/*     */     result = result * 31 + CornerRadius.hashCode-impl(this.topRightCornerRadius);
/*     */     result = result * 31 + CornerRadius.hashCode-impl(this.bottomRightCornerRadius);
/*     */     return result * 31 + CornerRadius.hashCode-impl(this.bottomLeftCornerRadius);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RoundRect))
/*     */       return false; 
/*     */     RoundRect roundRect = (RoundRect)other;
/*     */     return (Float.compare(this.left, roundRect.left) != 0) ? false : ((Float.compare(this.top, roundRect.top) != 0) ? false : ((Float.compare(this.right, roundRect.right) != 0) ? false : ((Float.compare(this.bottom, roundRect.bottom) != 0) ? false : (!CornerRadius.equals-impl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) ? false : (!CornerRadius.equals-impl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) ? false : (!CornerRadius.equals-impl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) ? false : (!!CornerRadius.equals-impl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius))))))));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final RoundRect getZero() {
/*     */     return Companion.getZero();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\RoundRect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */