/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\002\bÃ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\0020\005*\0020\006H\026J\b\020\007\032\0020\005H\026¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/SelectedImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "<init>", "()V", "suffix", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "toString", "ui"})
/*    */ @Immutable
/*    */ final class SelectedImpl extends PainterSuffixHint {
/*    */   @NotNull
/* 11 */   public String suffix(@NotNull PainterProviderScope $this$suffix) { Intrinsics.checkNotNullParameter($this$suffix, "<this>"); return "Selected"; } @NotNull
/*    */   public static final SelectedImpl INSTANCE = new SelectedImpl(); @NotNull
/* 13 */   public String toString() { return "Selected"; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\SelectedImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */