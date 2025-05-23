/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\002\030\002\n\000\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\f\020\f\032\0020\r*\0020\016H\024R\020\020\004\032\0020\005X\004¢\006\004\n\002\020\bR\024\020\t\032\0020\0058VX\004¢\006\006\032\004\b\n\020\013¨\006\017"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/ResizedPainter;", "Lorg/jetbrains/jewel/ui/painter/DelegatePainter;", "delegate", "Landroidx/compose/ui/graphics/painter/Painter;", "size", "Landroidx/compose/ui/geometry/Size;", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "intrinsicSize", "getIntrinsicSize-NH-jbRc", "()J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ResizedPainter extends DelegatePainter {
/*    */   private final long size;
/*    */   
/*    */   private ResizedPainter(Painter delegate, long size) {
/*  8 */     super(delegate); this.size = size;
/*    */   } public static final int $stable; public long getIntrinsicSize-NH-jbRc() {
/* 10 */     return this.size;
/*    */   }
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/* 13 */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>"); drawDelegate($this$onDraw);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\ResizedPainter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */