/*    */ package org.jetbrains.compose.resources;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.Data;
/*    */ import org.jetbrains.skia.Image;
/*    */ import org.jetbrains.skia.Paint;
/*    */ import org.jetbrains.skia.Rect;
/*    */ import org.jetbrains.skia.Surface;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\020\022\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\034\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\004H\000\032\f\020\006\032\0020\007*\0020\002H\000\032\024\020\b\032\0020\t*\0020\0072\006\020\n\032\0020\013H\000¨\006\f"}, d2 = {"toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "", "resourceDensity", "", "targetDensity", "toSvgElement", "Lorg/jetbrains/compose/resources/SvgElement;", "toSvgPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "density", "Landroidx/compose/ui/unit/Density;", "library"})
/*    */ @SourceDebugExtension({"SMAP\nImageResources.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.skiko.kt\norg/jetbrains/compose/resources/ImageResources_skikoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/*    */ public final class ImageResources_skikoKt {
/*    */   @NotNull
/*    */   public static final ImageBitmap toImageBitmap(@NotNull byte[] $this$toImageBitmap, int resourceDensity, int targetDensity) {
/* 16 */     Intrinsics.checkNotNullParameter($this$toImageBitmap, "<this>"); Image image = Image.Companion.makeFromEncoded($this$toImageBitmap);
/*    */     
/* 18 */     Image targetImage = null;
/*    */ 
/*    */ 
/*    */     
/* 22 */     if (resourceDensity > targetDensity) {
/* 23 */       float scale = targetDensity / resourceDensity;
/* 24 */       float targetH = image.getHeight() * scale;
/* 25 */       float targetW = image.getWidth() * scale;
/* 26 */       Rect srcRect = Rect.Companion.makeWH(image.getWidth(), image.getHeight());
/* 27 */       Rect dstRect = Rect.Companion.makeWH(targetW, targetH);
/*    */       
/* 29 */       Surface $this$toImageBitmap_u24lambda_u241 = Surface.Companion.makeRasterN32Premul((int)targetW, (int)targetH); int $i$a$-run-ImageResources_skikoKt$toImageBitmap$1 = 0;
/* 30 */       Paint paint1 = new Paint(), $this$toImageBitmap_u24lambda_u241_u24lambda_u240 = paint1;
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
/* 48 */       int $i$a$-apply-ImageResources_skikoKt$toImageBitmap$1$paint$1 = 0;
/*    */       $this$toImageBitmap_u24lambda_u241_u24lambda_u240.setAntiAlias(true);
/*    */       Paint paint = paint1;
/*    */       $this$toImageBitmap_u24lambda_u241.getCanvas().drawImageRect(image, srcRect, dstRect, SamplingMode.Companion.getLINEAR(), paint, true);
/*    */       targetImage = $this$toImageBitmap_u24lambda_u241.makeImageSnapshot();
/*    */     } else {
/*    */       targetImage = image;
/*    */     } 
/*    */     return SkiaImageAsset_skikoKt.toComposeImageBitmap(targetImage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final SvgElement toSvgElement(@NotNull byte[] $this$toSvgElement) {
/*    */     Intrinsics.checkNotNullParameter($this$toSvgElement, "<this>");
/*    */     return new SvgElement(new SVGDOM(Data.Companion.makeFromBytes$default(Data.Companion, $this$toSvgElement, 0, 0, 6, null)));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final Painter toSvgPainter(@NotNull SvgElement $this$toSvgPainter, @NotNull Density density) {
/*    */     Intrinsics.checkNotNullParameter($this$toSvgPainter, "<this>");
/*    */     Intrinsics.checkNotNullParameter(density, "density");
/*    */     return new SvgPainter($this$toSvgPainter.getSvgdom(), density);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageResources_skikoKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */