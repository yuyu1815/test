/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Shader;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\007\030\0002\0020\001BA\b\000\022\f\020\002\032\b\022\004\022\0020\0040\003\022\020\b\002\020\005\032\n\022\004\022\0020\006\030\0010\003\022\006\020\007\032\0020\b\022\006\020\t\032\0020\006\022\b\b\002\020\n\032\0020\013¢\006\002\020\fJ\036\020\023\032\0060\024j\002`\0252\006\020\026\032\0020\017H\026ø\001\000¢\006\004\b\027\020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034H\002J\b\020\035\032\0020\036H\026J\b\020\037\032\0020 H\026R\026\020\007\032\0020\bX\004ø\001\000ø\001\001¢\006\004\n\002\020\rR\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\032\020\016\032\0020\0178VX\004ø\001\000ø\001\001¢\006\006\032\004\b\020\020\021R\016\020\t\032\0020\006X\004¢\006\002\n\000R\026\020\005\032\n\022\004\022\0020\006\030\0010\003X\004¢\006\002\n\000R\026\020\n\032\0020\013X\004ø\001\000ø\001\001¢\006\004\n\002\020\022\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "I", "createShader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "createShader-uvyYCjk", "(J)Lorg/jetbrains/skia/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class RadialGradient
/*     */   extends ShaderBrush
/*     */ {
/*     */   @NotNull
/*     */   private final List<Color> colors;
/*     */   @Nullable
/*     */   private final List<Float> stops;
/*     */   private final long center;
/*     */   private final float radius;
/*     */   private final int tileMode;
/*     */   
/*     */   private RadialGradient(List<Color> colors, List<Float> stops, long center, float radius, int tileMode) {
/* 514 */     this.colors = colors;
/* 515 */     this.stops = stops;
/* 516 */     this.center = center;
/* 517 */     this.radius = radius;
/* 518 */     this.tileMode = tileMode;
/*     */   }
/*     */   
/*     */   public long getIntrinsicSize-NH-jbRc() {
/* 522 */     float f = this.radius; return ((!Float.isInfinite(f) && !Float.isNaN(f))) ? SizeKt.Size(this.radius * 2, this.radius * 2) : Size.Companion.getUnspecified-NH-jbRc();
/*     */   } @NotNull
/*     */   public Shader createShader-uvyYCjk(long size) {
/* 525 */     float centerX = 0.0F;
/* 526 */     float centerY = 0.0F;
/* 527 */     if (OffsetKt.isUnspecified-k-4lQ0M(this.center)) {
/* 528 */       long drawCenter = SizeKt.getCenter-uvyYCjk(size);
/* 529 */       centerX = Offset.getX-impl(drawCenter);
/* 530 */       centerY = Offset.getY-impl(drawCenter);
/*     */     } else {
/* 532 */       centerX = ((Offset.getX-impl(this.center) == Float.POSITIVE_INFINITY)) ? Size.getWidth-impl(size) : Offset.getX-impl(this.center);
/* 533 */       centerY = ((Offset.getY-impl(this.center) == Float.POSITIVE_INFINITY)) ? Size.getHeight-impl(size) : Offset.getY-impl(this.center);
/*     */     } 
/*     */ 
/*     */     
/* 537 */     List<Color> list = this.colors;
/* 538 */     List<Float> list1 = this.stops;
/* 539 */     long l = OffsetKt.Offset(centerX, centerY);
/* 540 */     float f1 = ((this.radius == Float.POSITIVE_INFINITY)) ? (Size.getMinDimension-impl(size) / 2) : this.radius;
/* 541 */     int i = this.tileMode; return ShaderKt.RadialGradientShader-8uybcMk(l, f1, list, list1, i);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 546 */     if (this == other) return true; 
/* 547 */     if (!(other instanceof RadialGradient)) return false;
/*     */     
/* 549 */     if (!Intrinsics.areEqual(this.colors, ((RadialGradient)other).colors)) return false; 
/* 550 */     if (!Intrinsics.areEqual(this.stops, ((RadialGradient)other).stops)) return false; 
/* 551 */     if (!Offset.equals-impl0(this.center, ((RadialGradient)other).center)) return false; 
/* 552 */     if (!((this.radius == ((RadialGradient)other).radius) ? 1 : 0)) return false; 
/* 553 */     if (!TileMode.equals-impl0(this.tileMode, ((RadialGradient)other).tileMode)) return false;
/*     */     
/* 555 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 559 */     int result = this.colors.hashCode();
/* 560 */     result = 31 * result + ((this.stops != null) ? this.stops.hashCode() : 0);
/* 561 */     result = 31 * result + Offset.hashCode-impl(this.center);
/* 562 */     result = 31 * result + Float.hashCode(this.radius);
/* 563 */     result = 31 * result + TileMode.hashCode-impl(this.tileMode);
/* 564 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 568 */     String centerValue = OffsetKt.isSpecified-k-4lQ0M(this.center) ? ("center=" + Offset.toString-impl(this.center) + ", ") : "";
/* 569 */     float f = this.radius; String radiusValue = ((!Float.isInfinite(f) && !Float.isNaN(f))) ? ("radius=" + this.radius + ", ") : "";
/* 570 */     return "RadialGradient(colors=" + 
/* 571 */       this.colors + ", stops=" + 
/* 572 */       this.stops + ", " + 
/* 573 */       centerValue + 
/* 574 */       radiusValue + 
/* 575 */       "tileMode=" + TileMode.toString-impl(this.tileMode) + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\RadialGradient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */