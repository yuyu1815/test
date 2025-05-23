/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\bg\030\0002\0020\001J\f\020\002\032\0020\003*\0020\004H&¨\006\005"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "ui"})
/*    */ @Immutable
/*    */ public interface PainterPathHint
/*    */   extends PainterHint
/*    */ {
/*    */   @NotNull
/*    */   String patch(@NotNull PainterProviderScope paramPainterProviderScope);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static boolean canApply(@NotNull PainterPathHint $this, @NotNull PainterProviderScope $receiver) {
/* 59 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); return PainterHint.DefaultImpls.canApply($this, $receiver);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterPathHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */