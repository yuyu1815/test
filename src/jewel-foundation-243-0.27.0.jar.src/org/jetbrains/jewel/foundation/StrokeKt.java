/*    */ package org.jetbrains.jewel.foundation;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Brush;
/*    */ import androidx.compose.ui.graphics.SolidColor;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\032/\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\003¢\006\004\b\t\020\n\032/\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\013\032\0020\f2\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\003¢\006\004\b\r\020\016¨\006\017"}, d2 = {"Stroke", "Lorg/jetbrains/jewel/foundation/Stroke;", "width", "Landroidx/compose/ui/unit/Dp;", "color", "Landroidx/compose/ui/graphics/Color;", "alignment", "Lorg/jetbrains/jewel/foundation/Stroke$Alignment;", "expand", "Stroke-nMwvq1g", "(FJLorg/jetbrains/jewel/foundation/Stroke$Alignment;F)Lorg/jetbrains/jewel/foundation/Stroke;", "brush", "Landroidx/compose/ui/graphics/Brush;", "Stroke-Ke5fDM4", "(FLandroidx/compose/ui/graphics/Brush;Lorg/jetbrains/jewel/foundation/Stroke$Alignment;F)Lorg/jetbrains/jewel/foundation/Stroke;", "foundation"})
/*    */ @SourceDebugExtension({"SMAP\nStroke.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Stroke.kt\norg/jetbrains/jewel/foundation/StrokeKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,63:1\n702#2:64\n702#2:65\n*S KotlinDebug\n*F\n+ 1 Stroke.kt\norg/jetbrains/jewel/foundation/StrokeKt\n*L\n45#1:64\n54#1:65\n*E\n"})
/*    */ public final class StrokeKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Stroke Stroke-nMwvq1g(float width, long color, @NotNull Stroke.Alignment alignment, float expand) {
/* 44 */     Intrinsics.checkNotNullParameter(alignment, "alignment"); if ((width == 0.0F)) return Stroke.None.INSTANCE; 
/* 45 */     long $this$isUnspecified$iv = color; int $i$f$isUnspecified-8_81llA = 0;
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
/* 64 */     if (($this$isUnspecified$iv == 16L)) return Stroke.None.INSTANCE;  return new Stroke.Solid(width, color, alignment, expand, null); } @NotNull public static final Stroke Stroke-Ke5fDM4(float width, @NotNull Brush brush, @NotNull Stroke.Alignment alignment, float expand) { Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(alignment, "alignment"); if ((width == 0.0F))
/* 65 */       return Stroke.None.INSTANCE;  long $this$isUnspecified$iv = ((SolidColor)brush).getValue-0d7_KjU(); int $i$f$isUnspecified-8_81llA = 0; return (brush instanceof SolidColor) ? ((($this$isUnspecified$iv == 16L)) ? Stroke.None.INSTANCE : new Stroke.Solid(width, ((SolidColor)brush).getValue-0d7_KjU(), alignment, expand, null)) : new Stroke.Brush(width, brush, alignment, expand, null); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\StrokeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */