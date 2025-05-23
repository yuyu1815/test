/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.Bitmap;
/*    */ import org.jetbrains.skia.Canvas;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\020\007\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\032\020\020\r\032\0020\0032\006\020\016\032\0020\017H\000\032\n\020\020\032\0020\003*\0020\t\"(\020\002\032\0020\001*\0020\0032\006\020\000\032\0020\0018F@FX\016¢\006\f\032\004\b\004\020\005\"\004\b\006\020\007\"\031\020\b\032\0060\tj\002`\n*\0020\0038F¢\006\006\032\004\b\013\020\f*\n\020\021\"\0020\t2\0020\t¨\006\022"}, d2 = {"value", "", "alphaMultiplier", "Landroidx/compose/ui/graphics/Canvas;", "getAlphaMultiplier", "(Landroidx/compose/ui/graphics/Canvas;)F", "setAlphaMultiplier", "(Landroidx/compose/ui/graphics/Canvas;F)V", "nativeCanvas", "Lorg/jetbrains/skia/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Lorg/jetbrains/skia/Canvas;", "ActualCanvas", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "asComposeCanvas", "NativeCanvas", "ui-graphics"})
/*    */ public final class SkiaBackedCanvas_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Canvas ActualCanvas(@NotNull ImageBitmap image) {
/* 41 */     Intrinsics.checkNotNullParameter(image, "image"); Bitmap skiaBitmap = SkiaImageAsset_skikoKt.asSkiaBitmap(image);
/* 42 */     if (!(!skiaBitmap.isImmutable() ? 1 : 0)) { int $i$a$-require-SkiaBackedCanvas_skikoKt$ActualCanvas$1 = 0; String str = 
/* 43 */         "Cannot draw on immutable ImageBitmap"; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 45 */     return new SkiaBackedCanvas(new Canvas(skiaBitmap, null, 2, null));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Canvas asComposeCanvas(@NotNull Canvas $this$asComposeCanvas) {
/* 51 */     Intrinsics.checkNotNullParameter($this$asComposeCanvas, "<this>"); return new SkiaBackedCanvas($this$asComposeCanvas); } @NotNull
/*    */   public static final Canvas getNativeCanvas(@NotNull Canvas $this$nativeCanvas) {
/* 53 */     Intrinsics.checkNotNullParameter($this$nativeCanvas, "<this>"); return ((SkiaBackedCanvas)$this$nativeCanvas).getSkia();
/*    */   }
/*    */   
/* 56 */   public static final float getAlphaMultiplier(@NotNull Canvas $this$alphaMultiplier) { Intrinsics.checkNotNullParameter($this$alphaMultiplier, "<this>"); return ((SkiaBackedCanvas)$this$alphaMultiplier).getAlphaMultiplier$ui_graphics(); } public static final void setAlphaMultiplier(@NotNull Canvas $this$alphaMultiplier, float value) {
/* 57 */     Intrinsics.checkNotNullParameter($this$alphaMultiplier, "<this>"); ((SkiaBackedCanvas)$this$alphaMultiplier).setAlphaMultiplier$ui_graphics(value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedCanvas_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */