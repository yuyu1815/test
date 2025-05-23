/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.w3c.dom.Element;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\bg\030\0002\0020\001J\024\020\002\032\0020\003*\0020\0042\006\020\005\032\0020\006H&¨\006\007"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterSvgPatchHint;", "Lorg/jetbrains/jewel/ui/painter/SvgPainterHint;", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "element", "Lorg/w3c/dom/Element;", "ui"})
/*    */ @Immutable
/*    */ public interface PainterSvgPatchHint
/*    */   extends SvgPainterHint
/*    */ {
/*    */   void patch(@NotNull PainterProviderScope paramPainterProviderScope, @NotNull Element paramElement);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static boolean canApply(@NotNull PainterSvgPatchHint $this, @NotNull PainterProviderScope $receiver) {
/* 69 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); return SvgPainterHint.DefaultImpls.canApply($this, $receiver);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterSvgPatchHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */