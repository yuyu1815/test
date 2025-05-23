/*    */ package org.jetbrains.jewel.ui.painter.hints;
/*    */ 
/*    */ import androidx.compose.ui.graphics.painter.Painter;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.ui.painter.PainterProviderScope;
/*    */ import org.jetbrains.jewel.ui.painter.badge.BadgeShape;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\024\020\t\032\0020\n*\0020\0132\006\020\f\032\0020\nH\026R\020\020\002\032\0020\003X\004¢\006\004\n\002\020\bR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/hints/BadgeImpl;", "Lorg/jetbrains/jewel/ui/painter/PainterWrapperHint;", "color", "Landroidx/compose/ui/graphics/Color;", "shape", "Lorg/jetbrains/jewel/ui/painter/badge/BadgeShape;", "<init>", "(JLorg/jetbrains/jewel/ui/painter/badge/BadgeShape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "wrap", "Landroidx/compose/ui/graphics/painter/Painter;", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "painter", "ui"})
/*    */ final class BadgeImpl implements PainterWrapperHint {
/*    */   private final long color;
/*    */   
/* 14 */   public boolean canApply(@NotNull PainterProviderScope $this$canApply) { return PainterWrapperHint.DefaultImpls.canApply(this, $this$canApply); } @NotNull
/* 15 */   private final BadgeShape shape; private BadgeImpl(long color, BadgeShape shape) { this.color = color; this.shape = shape; } @NotNull
/* 16 */   public Painter wrap(@NotNull PainterProviderScope $this$wrap, @NotNull Painter painter) { Intrinsics.checkNotNullParameter($this$wrap, "<this>"); Intrinsics.checkNotNullParameter(painter, "painter"); return (Painter)new BadgePainter(painter, this.color, this.shape, null); }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BadgeImpl))
/*    */       return false; 
/*    */     BadgeImpl badgeImpl = (BadgeImpl)other;
/*    */     return !Color.equals-impl0(this.color, badgeImpl.color) ? false : (!!Intrinsics.areEqual(this.shape, badgeImpl.shape));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Color.hashCode-impl(this.color);
/*    */     return result * 31 + this.shape.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BadgeImpl(color=" + Color.toString-impl(this.color) + ", shape=" + this.shape + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\hints\BadgeImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */