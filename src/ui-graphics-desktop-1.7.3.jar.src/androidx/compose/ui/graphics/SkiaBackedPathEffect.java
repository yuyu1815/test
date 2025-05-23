/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.PathEffect;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "nativePathEffect", "Lorg/jetbrains/skia/PathEffect;", "(Lorg/jetbrains/skia/PathEffect;)V", "getNativePathEffect", "()Lorg/jetbrains/skia/PathEffect;", "ui-graphics"})
/*    */ public final class SkiaBackedPathEffect
/*    */   implements PathEffect
/*    */ {
/*    */   @NotNull
/*    */   private final PathEffect nativePathEffect;
/*    */   
/*    */   public SkiaBackedPathEffect(@NotNull PathEffect nativePathEffect) {
/* 21 */     this.nativePathEffect = nativePathEffect; } @NotNull public final PathEffect getNativePathEffect() { return this.nativePathEffect; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedPathEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */