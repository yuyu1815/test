/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Ref;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\006\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\007\032\0020\003HÂ\003J\t\020\b\032\0020\005HÂ\003J\035\020\t\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\n\032\0020\0052\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\020HÖ\001J,\020\021\032\0020\022*\0020\0232\f\020\024\032\b\022\004\022\0020\0260\0252\006\020\027\032\0020\030H\026ø\001\000¢\006\004\b\031\020\032R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"Landroidx/compose/foundation/layout/BoxMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "alignment", "Landroidx/compose/ui/Alignment;", "propagateMinConstraints", "", "(Landroidx/compose/ui/Alignment;Z)V", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,339:1\n69#2,6:340\n69#2,6:346\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n171#1:340,6\n191#1:346,6\n*E\n"})
/*     */ final class BoxMeasurePolicy
/*     */   implements MeasurePolicy
/*     */ {
/*     */   @NotNull
/*     */   private final Alignment alignment;
/*     */   private final boolean propagateMinConstraints;
/*     */   
/*     */   public BoxMeasurePolicy(@NotNull Alignment alignment, boolean propagateMinConstraints) {
/* 125 */     this.alignment = alignment;
/* 126 */     this.propagateMinConstraints = propagateMinConstraints;
/*     */   } @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List<Measurable> measurables, long constraints) {
/*     */     long matchParentSizeConstraints;
/*     */     List<Measurable> list1;
/*     */     int j, k;
/* 132 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurables, "measurables"); if (measurables.isEmpty()) {
/* 133 */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, 
/* 134 */           Constraints.getMinWidth-impl(constraints), 
/* 135 */           Constraints.getMinHeight-impl(constraints), null, BoxMeasurePolicy$measure$1.INSTANCE, 4, null);
/*     */     }
/*     */ 
/*     */     
/* 139 */     long contentConstraints = this.propagateMinConstraints ? 
/* 140 */       constraints : 
/*     */       
/* 142 */       Constraints.copy-Zbe2FdA$default(constraints, 0, 0, 0, 0, 10, null);
/*     */ 
/*     */     
/* 145 */     if (measurables.size() == 1) {
/* 146 */       Measurable measurable = measurables.get(0);
/* 147 */       int m = 0;
/* 148 */       int n = 0;
/* 149 */       Placeable placeable = null;
/* 150 */       if (!BoxKt.access$getMatchesParentSize(measurable)) {
/* 151 */         placeable = measurable.measure-BRTryo0(contentConstraints);
/* 152 */         m = Math.max(Constraints.getMinWidth-impl(constraints), placeable.getWidth());
/* 153 */         n = Math.max(Constraints.getMinHeight-impl(constraints), placeable.getHeight());
/*     */       } else {
/* 155 */         m = Constraints.getMinWidth-impl(constraints);
/* 156 */         n = Constraints.getMinHeight-impl(constraints);
/* 157 */         placeable = measurable.measure-BRTryo0(
/* 158 */             Constraints.Companion.fixed-JhjzzOo(Constraints.getMinWidth-impl(constraints), Constraints.getMinHeight-impl(constraints)));
/*     */       } 
/*     */       
/* 161 */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, m, n, null, new BoxMeasurePolicy$measure$2(measurable, $this$measure_u2d3p2s80s, m, n, this), 4, null);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 166 */     Placeable[] placeables = new Placeable[measurables.size()];
/*     */     
/* 168 */     boolean hasMatchParentSizeChildren = false;
/* 169 */     Ref.IntRef boxWidth = new Ref.IntRef(); boxWidth.element = Constraints.getMinWidth-impl(constraints);
/* 170 */     Ref.IntRef boxHeight = new Ref.IntRef(); boxHeight.element = Constraints.getMinHeight-impl(constraints);
/* 171 */     List<Measurable> $this$fastForEachIndexed$iv = measurables; int $i$f$fastForEachIndexed = 0;
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
/* 341 */     int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i) {
/* 342 */       Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 343 */       Measurable measurable = (Measurable)item$iv; int index = index$iv, $i$a$-fastForEachIndexed-BoxMeasurePolicy$measure$3 = 0; if (!BoxKt.access$getMatchesParentSize(measurable)) { Placeable placeable = measurable.measure-BRTryo0(contentConstraints); placeables[index] = placeable; boxWidth.element = Math.max(boxWidth.element, placeable.getWidth()); boxHeight.element = Math.max(boxHeight.element, placeable.getHeight()); }
/*     */       else { hasMatchParentSizeChildren = true; }
/*     */     
/*     */     }  if (hasMatchParentSizeChildren)
/* 347 */     { index$iv = (boxWidth.element != Integer.MAX_VALUE) ? boxWidth.element : 0; i = (boxHeight.element != Integer.MAX_VALUE) ? boxHeight.element : 0; int n = boxWidth.element; k = boxHeight.element; matchParentSizeConstraints = ConstraintsKt.Constraints(index$iv, n, i, k); list1 = measurables; int m = 0; j = 0; k = list1.size(); } else { return MeasureScope.layout$default($this$measure_u2d3p2s80s, boxWidth.element, boxHeight.element, null, new BoxMeasurePolicy$measure$5(measurables, $this$measure_u2d3p2s80s, boxWidth, boxHeight, this), 4, null); }  if (j < k) {
/* 348 */       Object item$iv = list1.get(j);
/* 349 */       Measurable measurable = (Measurable)item$iv; int index = j, $i$a$-fastForEachIndexed-BoxMeasurePolicy$measure$4 = 0;
/*     */       if (BoxKt.access$getMatchesParentSize(measurable))
/*     */         placeables[index] = measurable.measure-BRTryo0(matchParentSizeConstraints); 
/*     */     } 
/*     */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, boxWidth.element, boxHeight.element, null, new BoxMeasurePolicy$measure$5(measurables, $this$measure_u2d3p2s80s, boxWidth, boxHeight, this), 4, null);
/*     */   }
/*     */   
/*     */   private final Alignment component1() {
/*     */     return this.alignment;
/*     */   }
/*     */   
/*     */   private final boolean component2() {
/*     */     return this.propagateMinConstraints;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final BoxMeasurePolicy copy(@NotNull Alignment alignment, boolean propagateMinConstraints) {
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return new BoxMeasurePolicy(alignment, propagateMinConstraints);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.alignment.hashCode();
/*     */     return result * 31 + Boolean.hashCode(this.propagateMinConstraints);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof BoxMeasurePolicy))
/*     */       return false; 
/*     */     BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy)other;
/*     */     return !Intrinsics.areEqual(this.alignment, boxMeasurePolicy.alignment) ? false : (!(this.propagateMinConstraints != boxMeasurePolicy.propagateMinConstraints));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class BoxMeasurePolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public static final BoxMeasurePolicy$measure$1 INSTANCE = new BoxMeasurePolicy$measure$1();
/*     */     
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     }
/*     */     
/*     */     BoxMeasurePolicy$measure$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class BoxMeasurePolicy$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       BoxKt.access$placeInBox($this$layout, this.$placeable, this.$measurable, this.$this_measure.getLayoutDirection(), this.$boxWidth, this.$boxHeight, BoxMeasurePolicy.this.alignment);
/*     */     }
/*     */     
/*     */     BoxMeasurePolicy$measure$2(Measurable $measurable, MeasureScope $receiver, int $boxWidth, int $boxHeight, BoxMeasurePolicy boxMeasurePolicy) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,339:1\n13374#2,3:340\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy$measure$5\n*L\n200#1:340,3\n*E\n"})
/*     */   static final class BoxMeasurePolicy$measure$5 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable[] arrayOfPlaceable = this.$placeables;
/*     */       List<Measurable> list = this.$measurables;
/*     */       MeasureScope measureScope = this.$this_measure;
/*     */       Ref.IntRef intRef1 = this.$boxWidth, intRef2 = this.$boxHeight;
/*     */       BoxMeasurePolicy boxMeasurePolicy = BoxMeasurePolicy.this;
/*     */       int $i$f$forEachIndexed = 0;
/*     */       int index$iv = 0;
/*     */       byte b = 0;
/*     */       int i = arrayOfPlaceable.length;
/*     */       if (b < i) {
/*     */         Object item$iv = arrayOfPlaceable[b], object1 = item$iv;
/*     */         int index = index$iv++, $i$a$-forEachIndexed-BoxMeasurePolicy$measure$5$1 = 0;
/*     */         Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
/*     */         Measurable measurable = list.get(index);
/*     */         BoxKt.access$placeInBox($this$layout, (Placeable)object1, measurable, measureScope.getLayoutDirection(), intRef1.element, intRef2.element, boxMeasurePolicy.alignment);
/*     */       } 
/*     */     }
/*     */     
/*     */     BoxMeasurePolicy$measure$5(List<Measurable> $measurables, MeasureScope $receiver, Ref.IntRef $boxWidth, Ref.IntRef $boxHeight, BoxMeasurePolicy boxMeasurePolicy) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */