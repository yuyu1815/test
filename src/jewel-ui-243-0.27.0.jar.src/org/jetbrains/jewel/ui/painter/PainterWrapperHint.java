/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\bg\030\0002\0020\001J\024\020\002\032\0020\003*\0020\0042\006\020\005\032\0020\003H&¨\006\006"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterWrapperHint;", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "wrap", "Landroidx/compose/ui/graphics/painter/Painter;", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "painter", "ui"})
/*    */ @Immutable
/*    */ public interface PainterWrapperHint
/*    */   extends PainterHint
/*    */ {
/*    */   @NotNull
/*    */   Painter wrap(@NotNull PainterProviderScope paramPainterProviderScope, @NotNull Painter paramPainter);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static boolean canApply(@NotNull PainterWrapperHint $this, @NotNull PainterProviderScope $receiver) {
/* 75 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); return PainterHint.DefaultImpls.canApply($this, $receiver);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterWrapperHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */