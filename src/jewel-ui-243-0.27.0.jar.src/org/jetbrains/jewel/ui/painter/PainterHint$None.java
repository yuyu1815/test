/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\0020\005*\0020\006H\026J\b\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterHint$None;", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "<init>", "()V", "canApply", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "toString", "", "ui"})
/*    */ public final class None
/*    */   implements PainterHint
/*    */ {
/*    */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) {
/* 26 */     Intrinsics.checkNotNullParameter($this$canApply, "<this>"); return false; } @NotNull
/*    */   public String toString() {
/* 28 */     return "None";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterHint$None.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */