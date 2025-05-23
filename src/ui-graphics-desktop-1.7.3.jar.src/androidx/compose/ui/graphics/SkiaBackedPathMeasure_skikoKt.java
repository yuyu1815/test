/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.PathMeasure;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\006\020\000\032\0020\001\032\n\020\002\032\0020\001*\0020\003\032\n\020\004\032\0020\003*\0020\001¨\006\005"}, d2 = {"PathMeasure", "Landroidx/compose/ui/graphics/PathMeasure;", "asComposePathEffect", "Lorg/jetbrains/skia/PathMeasure;", "asSkiaPathMeasure", "ui-graphics"})
/*    */ public final class SkiaBackedPathMeasure_skikoKt
/*    */ {
/*    */   @NotNull
/*    */   public static final PathMeasure asComposePathEffect(@NotNull PathMeasure $this$asComposePathEffect) {
/* 23 */     Intrinsics.checkNotNullParameter($this$asComposePathEffect, "<this>"); return new SkiaBackedPathMeasure($this$asComposePathEffect);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final PathMeasure asSkiaPathMeasure(@NotNull PathMeasure $this$asSkiaPathMeasure) {
/* 29 */     Intrinsics.checkNotNullParameter($this$asSkiaPathMeasure, "<this>"); return ((SkiaBackedPathMeasure)$this$asSkiaPathMeasure).getSkia$ui_graphics();
/*    */   }
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
/*    */   @NotNull
/*    */   public static final PathMeasure PathMeasure() {
/* 78 */     return new SkiaBackedPathMeasure(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedPathMeasure_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */