/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\b\005\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\033\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\024\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\rH\026R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\016"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/ColorBasedReplacementPainterSvgPatchHint;", "Lorg/jetbrains/jewel/ui/painter/PainterSvgPatchHint;", "map", "", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Ljava/util/Map;)V", "getMap", "()Ljava/util/Map;", "patch", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "element", "Lorg/w3c/dom/Element;", "ui"})
/*    */ @Immutable
/*    */ final class ColorBasedReplacementPainterSvgPatchHint implements PainterSvgPatchHint {
/* 13 */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) { return PainterSvgPatchHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/*    */   private final Map<Color, Color> map; public ColorBasedReplacementPainterSvgPatchHint(@NotNull Map<Color, Color> map) {
/* 15 */     this.map = map; } @NotNull public final Map<Color, Color> getMap() { return this.map; }
/*    */    public void patch(@NotNull PainterProviderScope $this$patch, @NotNull Element element) {
/* 17 */     Intrinsics.checkNotNullParameter($this$patch, "<this>"); Intrinsics.checkNotNullParameter(element, "element"); ColorBasedPaletteReplacementKt.patchPalette$default(element, this.map, null, 2, null);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ColorBasedReplacementPainterSvgPatchHint))
/*    */       return false; 
/*    */     ColorBasedReplacementPainterSvgPatchHint colorBasedReplacementPainterSvgPatchHint = (ColorBasedReplacementPainterSvgPatchHint)other;
/*    */     return !!Intrinsics.areEqual(this.map, colorBasedReplacementPainterSvgPatchHint.map);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.map.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ColorBasedReplacementPainterSvgPatchHint(map=" + this.map + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\ColorBasedReplacementPainterSvgPatchHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */