/*    */ package org.jetbrains.jewel.ui.painter;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\004\n\002\020\002\n\002\030\002\n\002\b\002\b\027\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J\020\020\033\032\0020\0342\006\020\t\032\0020\nH\024J\022\020\035\032\0020\0342\b\020\036\032\004\030\0010\020H\024J\020\020\037\032\0020\0342\006\020\025\032\0020\026H\024J\f\020 \032\0020!*\0020\"H\004J\f\020#\032\0020!*\0020\"H\024R\016\020\002\032\0020\001X\004¢\006\002\n\000R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\bR\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\034\020\017\032\004\030\0010\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R\032\020\025\032\0020\026X\016¢\006\016\n\000\032\004\b\027\020\030\"\004\b\031\020\032¨\006$"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/DelegatePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "delegate", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "filter", "Landroidx/compose/ui/graphics/ColorFilter;", "getFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "applyAlpha", "", "applyColorFilter", "colorFilter", "applyLayoutDirection", "drawDelegate", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nDelegatePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatePainter.kt\norg/jetbrains/jewel/ui/painter/DelegatePainter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
/*    */ public class DelegatePainter extends Painter { @NotNull
/*    */   private final Painter delegate;
/*    */   private float alpha;
/*    */   @Nullable
/*    */   private ColorFilter filter;
/*    */   @NotNull
/*    */   private LayoutDirection layoutDirection;
/*    */   public static final int $stable = 8;
/*    */   
/* 13 */   public DelegatePainter(@NotNull Painter delegate) { this.delegate = delegate;
/*    */ 
/*    */ 
/*    */     
/* 17 */     this.alpha = 1.0F;
/*    */ 
/*    */ 
/*    */     
/* 21 */     this.layoutDirection = LayoutDirection.Ltr; } public long getIntrinsicSize-NH-jbRc() { return this.delegate.getIntrinsicSize-NH-jbRc(); } protected final float getAlpha() { return this.alpha; } @NotNull protected final LayoutDirection getLayoutDirection() { return this.layoutDirection; } protected final void setAlpha(float <set-?>) { this.alpha = <set-?>; } @Nullable protected final ColorFilter getFilter() { return this.filter; } protected final void setFilter(@Nullable ColorFilter <set-?>) { this.filter = <set-?>; } protected final void setLayoutDirection(@NotNull LayoutDirection <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.layoutDirection = <set-?>; }
/*    */   
/*    */   protected boolean applyAlpha(float alpha) {
/* 24 */     this.alpha = alpha;
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
/* 29 */     this.filter = colorFilter;
/* 30 */     return true;
/*    */   }
/*    */   
/*    */   protected boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
/* 34 */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); this.layoutDirection = layoutDirection;
/* 35 */     return true;
/*    */   }
/*    */   
/*    */   protected final void drawDelegate(@NotNull DrawScope $this$drawDelegate) {
/* 39 */     Intrinsics.checkNotNullParameter($this$drawDelegate, "<this>"); Painter $this$drawDelegate_u24lambda_u240 = this.delegate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     int $i$a$-with-DelegatePainter$drawDelegate$1 = 0;
/*    */     $this$drawDelegate_u24lambda_u240.draw-x_KDEd0($this$drawDelegate, $this$drawDelegate.getSize-NH-jbRc(), this.alpha, this.filter);
/*    */   }
/*    */   
/*    */   protected void onDraw(@NotNull DrawScope $this$onDraw) {
/*    */     Intrinsics.checkNotNullParameter($this$onDraw, "<this>");
/*    */     drawDelegate($this$onDraw);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\DelegatePainter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */