/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.ui.graphics.ImageBitmap;
/*    */ import androidx.compose.ui.graphics.vector.ImageVector;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.compose.resources.vector.XmlVectorParserKt;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007\032\024\020\003\032\0020\004*\0020\0022\006\020\005\032\0020\006H\007¨\006\007"}, d2 = {"decodeToImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "", "decodeToImageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "density", "Landroidx/compose/ui/unit/Density;", "library"})
/*    */ public final class ImageDecodersKt
/*    */ {
/*    */   @ExperimentalResourceApi
/*    */   @NotNull
/*    */   public static final ImageBitmap decodeToImageBitmap(@NotNull byte[] $this$decodeToImageBitmap) {
/* 17 */     Intrinsics.checkNotNullParameter($this$decodeToImageBitmap, "<this>"); int dumbDensity = 0;
/* 18 */     return ImageResources_skikoKt.toImageBitmap($this$decodeToImageBitmap, dumbDensity, dumbDensity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ExperimentalResourceApi
/*    */   @NotNull
/*    */   public static final ImageVector decodeToImageVector(@NotNull byte[] $this$decodeToImageVector, @NotNull Density density) {
/* 30 */     Intrinsics.checkNotNullParameter($this$decodeToImageVector, "<this>"); Intrinsics.checkNotNullParameter(density, "density"); return XmlVectorParserKt.toImageVector(ImageResources_jvmAndAndroidKt.toXmlElement($this$decodeToImageVector), density);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageDecodersKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */