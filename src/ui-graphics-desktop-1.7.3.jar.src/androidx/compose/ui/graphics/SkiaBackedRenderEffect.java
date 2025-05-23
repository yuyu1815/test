/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.ImageFilter;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\001\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\b\020\007\032\0020\003H\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\b"}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "imageFilter", "Lorg/jetbrains/skia/ImageFilter;", "(Lorg/jetbrains/skia/ImageFilter;)V", "getImageFilter", "()Lorg/jetbrains/skia/ImageFilter;", "createImageFilter", "ui-graphics"})
/*    */ @Immutable
/*    */ public final class SkiaBackedRenderEffect
/*    */   extends RenderEffect
/*    */ {
/*    */   @NotNull
/*    */   private final ImageFilter imageFilter;
/*    */   
/*    */   @NotNull
/*    */   public final ImageFilter getImageFilter() {
/* 53 */     return this.imageFilter;
/* 54 */   } public SkiaBackedRenderEffect(@NotNull ImageFilter imageFilter) { super(null);
/* 55 */     this.imageFilter = imageFilter; } @NotNull protected ImageFilter createImageFilter() { return this.imageFilter; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedRenderEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */