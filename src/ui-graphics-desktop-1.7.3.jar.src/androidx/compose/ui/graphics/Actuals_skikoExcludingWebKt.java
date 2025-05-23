/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.Bitmap;
/*    */ import org.jetbrains.skia.Canvas;
/*    */ import org.jetbrains.skia.ColorAlphaType;
/*    */ import org.jetbrains.skia.Image;
/*    */ import org.jetbrains.skia.ImageInfo;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\000¨\006\003"}, d2 = {"toBitmap", "Lorg/jetbrains/skia/Bitmap;", "Lorg/jetbrains/skia/Image;", "ui-graphics"})
/*    */ public final class Actuals_skikoExcludingWebKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Bitmap toBitmap(@NotNull Image $this$toBitmap) {
/* 33 */     Intrinsics.checkNotNullParameter($this$toBitmap, "<this>"); Bitmap bitmap = new Bitmap();
/* 34 */     bitmap.allocPixels(ImageInfo.Companion.makeN32($this$toBitmap.getWidth(), $this$toBitmap.getHeight(), ColorAlphaType.PREMUL));
/* 35 */     Canvas canvas = new Canvas(bitmap, null, 2, null);
/* 36 */     canvas.drawImage($this$toBitmap, 0.0F, 0.0F);
/* 37 */     bitmap.setImmutable();
/* 38 */     return bitmap;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Actuals_skikoExcludingWebKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */