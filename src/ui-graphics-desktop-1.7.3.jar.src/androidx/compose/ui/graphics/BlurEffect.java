/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.ImageFilter;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\b\007\030\000 \0242\0020\001:\001\024B+\022\b\020\002\032\004\030\0010\001\022\006\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022\b\b\002\020\006\032\0020\007¢\006\002\020\bJ\b\020\n\032\0020\013H\024J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017H\002J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026R\026\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\004\n\002\020\tR\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\004X\004¢\006\002\n\000R\020\020\002\032\004\030\0010\001X\004¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006\025"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "(Landroidx/compose/ui/graphics/RenderEffect;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "I", "createImageFilter", "Lorg/jetbrains/skia/ImageFilter;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui-graphics"})
/*     */ @Immutable
/*     */ public final class BlurEffect
/*     */   extends RenderEffect
/*     */ {
/*     */   private BlurEffect(RenderEffect renderEffect, float radiusX, float radiusY, int edgeTreatment) {
/*  64 */     super((DefaultConstructorMarker)null); this.renderEffect = renderEffect;
/*     */     this.radiusX = radiusX;
/*     */     this.radiusY = radiusY;
/*  67 */     this.edgeTreatment = edgeTreatment; } @NotNull protected ImageFilter createImageFilter() { return (this.renderEffect == null) ? 
/*  68 */       ImageFilter.Companion.makeBlur$default(ImageFilter.Companion, 
/*  69 */         Companion.convertRadiusToSigma(this.radiusX), 
/*  70 */         Companion.convertRadiusToSigma(this.radiusY), 
/*  71 */         SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(this.edgeTreatment), null, null, 24, null) : 
/*     */ 
/*     */       
/*  74 */       ImageFilter.Companion.makeBlur(
/*  75 */         Companion.convertRadiusToSigma(this.radiusX), 
/*  76 */         Companion.convertRadiusToSigma(this.radiusY), 
/*  77 */         SkiaTileMode_skikoKt.toSkiaTileMode-0vamqd0(this.edgeTreatment), 
/*  78 */         this.renderEffect.asSkiaImageFilter(), 
/*  79 */         null); }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*  84 */     if (this == other) return true; 
/*  85 */     if (!(other instanceof BlurEffect)) return false;
/*     */     
/*  87 */     if (!((this.radiusX == ((BlurEffect)other).radiusX) ? 1 : 0)) return false; 
/*  88 */     if (!((this.radiusY == ((BlurEffect)other).radiusY) ? 1 : 0)) return false; 
/*  89 */     if (!TileMode.equals-impl0(this.edgeTreatment, ((BlurEffect)other).edgeTreatment)) return false; 
/*  90 */     if (!Intrinsics.areEqual(this.renderEffect, ((BlurEffect)other).renderEffect)) return false;
/*     */     
/*  92 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  96 */     int result = (this.renderEffect != null) ? this.renderEffect.hashCode() : 0;
/*  97 */     result = 31 * result + Float.hashCode(this.radiusX);
/*  98 */     result = 31 * result + Float.hashCode(this.radiusY);
/*  99 */     result = 31 * result + TileMode.hashCode-impl(this.edgeTreatment);
/* 100 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 104 */     return "BlurEffect(renderEffect=" + this.renderEffect + ", radiusX=" + this.radiusX + ", radiusY=" + this.radiusY + ", edgeTreatment=" + TileMode.toString-impl(
/* 105 */         this.edgeTreatment) + ')';
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\007\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\0042\006\020\b\032\0020\004R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Landroidx/compose/ui/graphics/BlurEffect$Companion;", "", "()V", "BlurSigmaScale", "", "getBlurSigmaScale", "()F", "convertRadiusToSigma", "radius", "ui-graphics"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     public final float getBlurSigmaScale() {
/* 114 */       return BlurEffect.BlurSigmaScale;
/*     */     }
/*     */     public final float convertRadiusToSigma(float radius) {
/* 117 */       return (radius > 0.0F) ? (
/* 118 */         getBlurSigmaScale() * radius + 0.5F) : 
/*     */         
/* 120 */         0.0F;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @Nullable
/*     */   private final RenderEffect renderEffect;
/*     */   private final float radiusX;
/*     */   private final float radiusY;
/*     */   private final int edgeTreatment;
/*     */   private static final float BlurSigmaScale = 0.57735F;
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\BlurEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */