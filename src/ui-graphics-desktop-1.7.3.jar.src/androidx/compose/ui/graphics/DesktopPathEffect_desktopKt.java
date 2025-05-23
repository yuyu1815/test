/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skia.PathEffect;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\030\002\n\000\032\f\020\000\032\0020\001*\0020\002H\007¨\006\003"}, d2 = {"asDesktopPathEffect", "Lorg/jetbrains/skia/PathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "ui-graphics"})
/*    */ public final class DesktopPathEffect_desktopKt
/*    */ {
/*    */   @Deprecated(message = "Use asSkiaPathEffect()", replaceWith = @ReplaceWith(expression = "asSkiaPathEffect()", imports = {}))
/*    */   @NotNull
/*    */   public static final PathEffect asDesktopPathEffect(@NotNull PathEffect $this$asDesktopPathEffect) {
/* 25 */     Intrinsics.checkNotNullParameter($this$asDesktopPathEffect, "<this>"); return SkiaBackedPathEffect_skikoKt.asSkiaPathEffect($this$asDesktopPathEffect);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\DesktopPathEffect_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */