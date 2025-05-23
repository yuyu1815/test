/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\0012\0020\0022\0020\003B\027\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\004\b\007\020\bJ\f\020\t\032\0020\n*\0020\013H\026J\024\020\f\032\0020\r*\0020\0132\006\020\016\032\0020\rH\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/SizeImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterSuffixHint;", "Lorg/jetbrains/jewel/ui/painter/PainterWrapperHint;", "Lorg/jetbrains/jewel/ui/painter/SvgPainterHint;", "width", "", "height", "<init>", "(II)V", "suffix", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "wrap", "Landroidx/compose/ui/graphics/painter/Painter;", "painter", "ui"})
/*    */ @Immutable
/*    */ @SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\norg/jetbrains/jewel/ui/painter/hints/SizeImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,73:1\n149#2:74\n*S KotlinDebug\n*F\n+ 1 Size.kt\norg/jetbrains/jewel/ui/painter/hints/SizeImpl\n*L\n28#1:74\n*E\n"})
/*    */ final class SizeImpl extends PainterSuffixHint implements PainterWrapperHint, SvgPainterHint {
/*    */   private final int width;
/*    */   
/*    */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) {
/* 14 */     return SvgPainterHint.DefaultImpls.canApply(this, $this$canApply);
/*    */   } private final int height; public SizeImpl(int width, int height) {
/* 16 */     this.width = width; this.height = height; }
/*    */   @NotNull
/* 18 */   public String suffix(@NotNull PainterProviderScope $this$suffix) { Intrinsics.checkNotNullParameter($this$suffix, "<this>"); StringBuilder stringBuilder1 = new StringBuilder(), $this$suffix_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-SizeImpl$suffix$1 = 0;
/* 19 */     $this$suffix_u24lambda_u240.append("@");
/* 20 */     $this$suffix_u24lambda_u240.append(this.width);
/* 21 */     $this$suffix_u24lambda_u240.append("x");
/* 22 */     $this$suffix_u24lambda_u240.append(this.height);
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString(); } @NotNull
/*    */   public Painter wrap(@NotNull PainterProviderScope $this$wrap, @NotNull Painter painter) {
/* 26 */     Intrinsics.checkNotNullParameter($this$wrap, "<this>"); Intrinsics.checkNotNullParameter(painter, "painter"); if (StringsKt.contains$default($this$wrap.getPath(), suffix($this$wrap), false, 2, null)) return painter;
/*    */     
/* 28 */     int $this$dp$iv = this.width, $i$f$getDp = 0; $this$dp$iv = this.height; $i$f$getDp = 0; return (Painter)new ResizedPainter(painter, SizeKt.Size($this$wrap.toPx-0680j_4(
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
/* 74 */             Dp.constructor-impl($this$dp$iv)), $this$wrap.toPx-0680j_4(Dp.constructor-impl($this$dp$iv))), null);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SizeImpl))
/*    */       return false; 
/*    */     SizeImpl sizeImpl = (SizeImpl)other;
/*    */     return (this.width != sizeImpl.width) ? false : (!(this.height != sizeImpl.height));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.width;
/*    */     return result * 31 + this.height;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SizeImpl(width=" + this.width + ", height=" + this.height + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\SizeImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */