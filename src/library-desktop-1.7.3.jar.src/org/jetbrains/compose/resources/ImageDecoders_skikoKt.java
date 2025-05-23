/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\002\020\022\n\000\n\002\030\002\n\000\032\024\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\007¨\006\005"}, d2 = {"decodeToSvgPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "", "density", "Landroidx/compose/ui/unit/Density;", "library"})
/*    */ public final class ImageDecoders_skikoKt
/*    */ {
/*    */   @ExperimentalResourceApi
/*    */   @NotNull
/*    */   public static final Painter decodeToSvgPainter(@NotNull byte[] $this$decodeToSvgPainter, @NotNull Density density) {
/* 16 */     Intrinsics.checkNotNullParameter($this$decodeToSvgPainter, "<this>"); Intrinsics.checkNotNullParameter(density, "density"); return ImageResources_skikoKt.toSvgPainter(ImageResources_skikoKt.toSvgElement($this$decodeToSvgPainter), density);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageDecoders_skikoKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */