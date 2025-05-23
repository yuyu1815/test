/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.Map;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\033\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\004\b\006\020\007J\024\020\n\032\0020\013*\0020\f2\006\020\r\032\0020\016H\026R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\b\020\t¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/KeyBasedReplacementPainterSvgPatchHint;", "Lorg/jetbrains/jewel/ui/painter/PainterSvgPatchHint;", "map", "", "", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "element", "Lorg/w3c/dom/Element;", "ui"})
/*    */ @Immutable
/*    */ final class KeyBasedReplacementPainterSvgPatchHint implements PainterSvgPatchHint {
/* 12 */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) { return PainterSvgPatchHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/*    */   private final Map<String, Color> map; public KeyBasedReplacementPainterSvgPatchHint(@NotNull Map<String, Color> map) {
/* 14 */     this.map = map; } @NotNull public final Map<String, Color> getMap() { return this.map; }
/*    */    public void patch(@NotNull PainterProviderScope $this$patch, @NotNull Element element) {
/* 16 */     Intrinsics.checkNotNullParameter($this$patch, "<this>"); Intrinsics.checkNotNullParameter(element, "element"); KeyBasedPaletteReplacementKt.access$patchPalette(element, this.map);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof KeyBasedReplacementPainterSvgPatchHint))
/*    */       return false; 
/*    */     KeyBasedReplacementPainterSvgPatchHint keyBasedReplacementPainterSvgPatchHint = (KeyBasedReplacementPainterSvgPatchHint)other;
/*    */     return !!Intrinsics.areEqual(this.map, keyBasedReplacementPainterSvgPatchHint.map);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.map.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "KeyBasedReplacementPainterSvgPatchHint(map=" + this.map + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\KeyBasedReplacementPainterSvgPatchHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */