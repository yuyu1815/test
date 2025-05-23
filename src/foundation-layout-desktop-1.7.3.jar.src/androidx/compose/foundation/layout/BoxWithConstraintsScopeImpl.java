/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\b\030\0002\0020\0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\025\032\0020\004HÂ\003J\026\020\026\032\0020\006HÆ\003ø\001\001ø\001\000¢\006\004\b\027\020\tJ'\020\030\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001ø\001\000¢\006\004\b\031\020\032J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\"HÖ\001J\025\020#\032\0020$*\0020$2\006\020%\032\0020&H\001J\r\020'\032\0020$*\0020$H\001R\034\020\005\032\0020\006X\004ø\001\000ø\001\001¢\006\n\n\002\020\n\032\004\b\b\020\tR\016\020\003\032\0020\004X\004¢\006\002\n\000R\032\020\013\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\r\020\016R\032\020\017\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\020\020\016R\032\020\021\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\022\020\016R\032\020\023\032\0020\f8VX\004ø\001\000ø\001\001¢\006\006\032\004\b\024\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006("}, d2 = {"Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "Landroidx/compose/foundation/layout/BoxScope;", "density", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConstraints-msEJaDk", "()J", "J", "maxHeight", "Landroidx/compose/ui/unit/Dp;", "getMaxHeight-D9Ej5fM", "()F", "maxWidth", "getMaxWidth-D9Ej5fM", "minHeight", "getMinHeight-D9Ej5fM", "minWidth", "getMinWidth-D9Ej5fM", "component1", "component2", "component2-msEJaDk", "copy", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl;", "equals", "", "other", "", "hashCode", "", "toString", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/*     */ final class BoxWithConstraintsScopeImpl
/*     */   implements BoxWithConstraintsScope, BoxScope
/*     */ {
/*     */   @NotNull
/*     */   private final Density density;
/*     */   private final long constraints;
/*     */   
/*     */   public long getConstraints-msEJaDk() {
/*     */     return this.constraints;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier align(@NotNull Modifier $this$align, @NotNull Alignment alignment) {
/*     */     Intrinsics.checkNotNullParameter($this$align, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return this.$$delegate_0.align($this$align, alignment);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier matchParentSize(@NotNull Modifier $this$matchParentSize) {
/*     */     Intrinsics.checkNotNullParameter($this$matchParentSize, "<this>");
/*     */     return this.$$delegate_0.matchParentSize($this$matchParentSize);
/*     */   }
/*     */   
/*     */   private BoxWithConstraintsScopeImpl(Density density, long constraints) {
/* 112 */     this.density = density;
/* 113 */     this.constraints = constraints;
/* 114 */     this.$$delegate_0 = BoxScopeInstance.INSTANCE; } public float getMinWidth-D9Ej5fM() {
/* 115 */     Density $this$getMinWidth_D9Ej5fM_u24lambda_u240 = this.density;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     int $i$a$-with-BoxWithConstraintsScopeImpl$minWidth$1 = 0; return $this$getMinWidth_D9Ej5fM_u24lambda_u240.toDp-u2uoSUM(Constraints.getMinWidth-impl(getConstraints-msEJaDk())); } public float getMinHeight-D9Ej5fM() { Density $this$getMinHeight_D9Ej5fM_u24lambda_u242 = this.density; int $i$a$-with-BoxWithConstraintsScopeImpl$minHeight$1 = 0;
/*     */     return $this$getMinHeight_D9Ej5fM_u24lambda_u242.toDp-u2uoSUM(Constraints.getMinHeight-impl(getConstraints-msEJaDk())); }
/*     */ 
/*     */   
/*     */   public float getMaxWidth-D9Ej5fM() {
/*     */     Density $this$getMaxWidth_D9Ej5fM_u24lambda_u241 = this.density;
/*     */     int $i$a$-with-BoxWithConstraintsScopeImpl$maxWidth$1 = 0;
/*     */     return Constraints.getHasBoundedWidth-impl(getConstraints-msEJaDk()) ? $this$getMaxWidth_D9Ej5fM_u24lambda_u241.toDp-u2uoSUM(Constraints.getMaxWidth-impl(getConstraints-msEJaDk())) : Dp.Companion.getInfinity-D9Ej5fM();
/*     */   }
/*     */   
/*     */   public float getMaxHeight-D9Ej5fM() {
/*     */     Density $this$getMaxHeight_D9Ej5fM_u24lambda_u243 = this.density;
/*     */     int $i$a$-with-BoxWithConstraintsScopeImpl$maxHeight$1 = 0;
/*     */     return Constraints.getHasBoundedHeight-impl(getConstraints-msEJaDk()) ? $this$getMaxHeight_D9Ej5fM_u24lambda_u243.toDp-u2uoSUM(Constraints.getMaxHeight-impl(getConstraints-msEJaDk())) : Dp.Companion.getInfinity-D9Ej5fM();
/*     */   }
/*     */   
/*     */   private final Density component1() {
/*     */     return this.density;
/*     */   }
/*     */   
/*     */   public final long component2-msEJaDk() {
/*     */     return this.constraints;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BoxWithConstraintsScopeImpl copy-0kLqBqw(@NotNull Density density, long constraints) {
/*     */     Intrinsics.checkNotNullParameter(density, "density");
/*     */     return new BoxWithConstraintsScopeImpl(density, constraints, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + Constraints.toString-impl(this.constraints) + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.density.hashCode();
/*     */     return result * 31 + Constraints.hashCode-impl(this.constraints);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BoxWithConstraintsScopeImpl))
/*     */       return false; 
/*     */     BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl)other;
/*     */     return !Intrinsics.areEqual(this.density, boxWithConstraintsScopeImpl.density) ? false : (!!Constraints.equals-impl0(this.constraints, boxWithConstraintsScopeImpl.constraints));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxWithConstraintsScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */