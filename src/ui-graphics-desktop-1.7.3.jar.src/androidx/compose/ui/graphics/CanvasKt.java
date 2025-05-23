/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\"\020\004\032\0020\005*\0020\0012\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007\032&\020\n\032\0020\005*\0020\0012\006\020\013\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\007\032,\020\f\032\0020\005*\0020\0012\006\020\r\032\0020\0072\b\b\002\020\016\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007\032\036\020\017\032\0020\005*\0020\0012\f\020\020\032\b\022\004\022\0020\0050\021H\bø\001\000\032.\020\022\032\0020\005*\0020\0012\006\020\023\032\0020\0242\006\020\025\032\0020\0262\f\020\020\032\b\022\004\022\0020\0050\021H\bø\001\000\002\007\n\005\b20\001¨\006\027"}, d2 = {"Canvas", "Landroidx/compose/ui/graphics/Canvas;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "rotate", "", "degrees", "", "pivotX", "pivotY", "rotateRad", "radians", "scale", "sx", "sy", "withSave", "block", "Lkotlin/Function0;", "withSaveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "paint", "Landroidx/compose/ui/graphics/Paint;", "ui-graphics"})
/*     */ public final class CanvasKt
/*     */ {
/*     */   @NotNull
/*     */   public static final Canvas Canvas(@NotNull ImageBitmap image) {
/*  29 */     Intrinsics.checkNotNullParameter(image, "image"); return SkiaBackedCanvas_skikoKt.ActualCanvas(image);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void withSave(@NotNull Canvas $this$withSave, @NotNull Function0 block) {
/*  47 */     Intrinsics.checkNotNullParameter($this$withSave, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withSave = 0; try {
/*  48 */       $this$withSave.save();
/*  49 */       block.invoke();
/*     */     } finally {
/*  51 */       InlineMarker.finallyStart(1); $this$withSave.restore(); InlineMarker.finallyEnd(1);
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void withSaveLayer(@NotNull Canvas $this$withSaveLayer, @NotNull Rect bounds, @NotNull Paint paint, @NotNull Function0 block) {
/* 111 */     Intrinsics.checkNotNullParameter($this$withSaveLayer, "<this>"); Intrinsics.checkNotNullParameter(bounds, "bounds"); Intrinsics.checkNotNullParameter(paint, "paint"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withSaveLayer = 0; try {
/* 112 */       $this$withSaveLayer.saveLayer(bounds, paint);
/* 113 */       block.invoke();
/*     */     } finally {
/* 115 */       InlineMarker.finallyStart(1); $this$withSaveLayer.restore(); InlineMarker.finallyEnd(1);
/*     */     } 
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
/*     */   public static final void rotate(@NotNull Canvas $this$rotate, float degrees, float pivotX, float pivotY) {
/* 128 */     Intrinsics.checkNotNullParameter($this$rotate, "<this>"); if ((degrees == 0.0F))
/* 129 */       return;  $this$rotate.translate(pivotX, pivotY);
/* 130 */     $this$rotate.rotate(degrees);
/* 131 */     $this$rotate.translate(-pivotX, -pivotY);
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
/*     */   public static final void rotateRad(@NotNull Canvas $this$rotateRad, float radians, float pivotX, float pivotY) {
/* 143 */     Intrinsics.checkNotNullParameter($this$rotateRad, "<this>"); rotate($this$rotateRad, DegreesKt.degrees(radians), pivotX, pivotY);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void scale(@NotNull Canvas $this$scale, float sx, float sy, float pivotX, float pivotY) {
/* 161 */     Intrinsics.checkNotNullParameter($this$scale, "<this>"); if (((sx == 1.0F)) && ((sy == 1.0F)))
/* 162 */       return;  $this$scale.translate(pivotX, pivotY);
/* 163 */     $this$scale.scale(sx, sy);
/* 164 */     $this$scale.translate(-pivotX, -pivotY);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\CanvasKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */