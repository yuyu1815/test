/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001B\021\022\n\020\002\032\006\022\002\b\0030\003¢\006\002\020\004J\"\020\007\032\0020\b*\0020\t2\f\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\bH\026J\"\020\016\032\0020\b*\0020\t2\f\020\n\032\b\022\004\022\0020\f0\0132\006\020\017\032\0020\bH\026J,\020\020\032\0020\021*\0020\0222\f\020\n\032\b\022\004\022\0020\0230\0132\006\020\024\032\0020\025H\026ø\001\000¢\006\004\b\026\020\027J\"\020\030\032\0020\b*\0020\t2\f\020\n\032\b\022\004\022\0020\f0\0132\006\020\r\032\0020\bH\026J\"\020\031\032\0020\b*\0020\t2\f\020\n\032\b\022\004\022\0020\f0\0132\006\020\017\032\0020\bH\026R\025\020\002\032\006\022\002\b\0030\003¢\006\b\n\000\032\004\b\005\020\006\002\007\n\005\b¡\0360\001¨\006\032"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,899:1\n69#2,6:900\n69#2,6:906\n317#2,8:940\n317#2,8:948\n317#2,8:956\n317#2,8:964\n13896#3,14:912\n13896#3,14:926\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy\n*L\n833#1:900,6\n844#1:906,6\n882#1:940,8\n887#1:948,8\n892#1:956,8\n897#1:964,8\n852#1:912,14\n857#1:926,14\n*E\n"})
/*     */ final class AnimatedContentMeasurePolicy
/*     */   implements MeasurePolicy
/*     */ {
/*     */   @NotNull
/*     */   private final AnimatedContentTransitionScopeImpl<?> rootScope;
/*     */   
/*     */   public AnimatedContentMeasurePolicy(@NotNull AnimatedContentTransitionScopeImpl<?> rootScope) {
/* 824 */     this.rootScope = rootScope; } @NotNull public final AnimatedContentTransitionScopeImpl<?> getRootScope() { return this.rootScope; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List measurables, long constraints) {
/* 830 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurables, "measurables"); Placeable[] placeables = new Placeable[measurables.size()];
/* 831 */     long targetSize = 0L; targetSize = IntSize.Companion.getZero-YbymL2g();
/*     */     
/* 833 */     List $this$fastForEachIndexed$iv = measurables; int $i$f$fastForEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 901 */     int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i) {
/* 902 */       Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 903 */       Measurable measurable = (Measurable)item$iv; int index = index$iv, $i$a$-fastForEachIndexed-AnimatedContentMeasurePolicy$measure$1 = 0; Object object1 = measurable.getParentData();
/*     */     } 
/*     */     $this$fastForEachIndexed$iv = measurables;
/*     */     $i$f$fastForEachIndexed = 0;
/* 907 */     index$iv = 0; i = $this$fastForEachIndexed$iv.size(); if (index$iv < i) {
/* 908 */       Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 909 */       Measurable measurable = (Measurable)item$iv; int index = index$iv, $i$a$-fastForEachIndexed-AnimatedContentMeasurePolicy$measure$2 = 0; if (placeables[index] == null)
/*     */         placeables[index] = measurable.measure-BRTryo0(constraints); 
/*     */     }  if ($this$measure_u2d3p2s80s.isLookingAhead()) {  }
/*     */     else
/* 913 */     { Placeable[] arrayOfPlaceable = placeables; int $i$f$maxByOrNull = 0; Object maxElem$iv = arrayOfPlaceable[0];
/* 914 */       int lastIndex$iv = ArraysKt.getLastIndex((Object[])arrayOfPlaceable);
/* 915 */       if (lastIndex$iv == 0) {  }
/* 916 */       else { Object object = maxElem$iv; int $i$a$-maxByOrNull-AnimatedContentMeasurePolicy$measure$maxWidth$1 = 0; }
/*     */ 
/*     */       
/*     */       ((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getWidth() : 0); }
/*     */     
/*     */     int maxWidth = ((((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getWidth() : 0)) != null) ? (((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getWidth() : 0)).getWidth() : 0;
/*     */     if ($this$measure_u2d3p2s80s.isLookingAhead()) {
/*     */     
/*     */     } else {
/*     */       Placeable[] arrayOfPlaceable = placeables;
/*     */       int $i$f$maxByOrNull = 0;
/* 927 */       Object maxElem$iv = arrayOfPlaceable[0];
/* 928 */       int lastIndex$iv = ArraysKt.getLastIndex((Object[])arrayOfPlaceable);
/* 929 */       if (lastIndex$iv == 0) {  }
/* 930 */       else { Object object = maxElem$iv; int $i$a$-maxByOrNull-AnimatedContentMeasurePolicy$measure$maxHeight$1 = 0; }
/*     */       
/*     */       ((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getHeight() : 0);
/*     */     } 
/*     */     int maxHeight = ((((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getHeight() : 0)) != null) ? (((arrayOfPlaceable.length == 0)) ? null : ((object != null) ? object.getHeight() : 0)).getHeight() : 0;
/*     */     if (!$this$measure_u2d3p2s80s.isLookingAhead())
/*     */       this.rootScope.setMeasuredSize-ozmzZPI$animation(IntSizeKt.IntSize(maxWidth, maxHeight)); 
/*     */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, maxWidth, maxHeight, null, new AnimatedContentMeasurePolicy$measure$3(this, maxWidth, maxHeight), 4, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,899:1\n13309#2,2:900\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n866#1:900,2\n*E\n"})
/*     */   static final class AnimatedContentMeasurePolicy$measure$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable[] arrayOfPlaceable = this.$placeables;
/*     */       AnimatedContentMeasurePolicy animatedContentMeasurePolicy = AnimatedContentMeasurePolicy.this;
/*     */       int i = this.$maxWidth, j = this.$maxHeight, $i$f$forEach = 0;
/*     */       byte b = 0;
/*     */       int k = arrayOfPlaceable.length;
/*     */       if (b < k) {
/*     */         Object element$iv = arrayOfPlaceable[b], object1 = element$iv;
/*     */         int $i$a$-forEach-AnimatedContentMeasurePolicy$measure$3$1 = 0;
/*     */         Object object2 = object1;
/*     */         int $i$a$-let-AnimatedContentMeasurePolicy$measure$3$1$1 = 0;
/*     */         long offset = animatedContentMeasurePolicy.getRootScope().getContentAlignment().align-KFBX0sM(IntSizeKt.IntSize(object2.getWidth(), object2.getHeight()), IntSizeKt.IntSize(i, j), LayoutDirection.Ltr);
/*     */         Placeable.PlacementScope.place$default($this$layout, (Placeable)object2, IntOffset.getX-impl(offset), IntOffset.getY-impl(offset), 0.0F, 4, null);
/*     */       } 
/*     */     }
/*     */     
/*     */     AnimatedContentMeasurePolicy$measure$3(AnimatedContentMeasurePolicy $receiver, int $maxWidth, int $maxHeight) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull List<IntrinsicMeasurable> measurables, int height) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface minIntrinsicWidth : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface minIntrinsicWidth : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #882	-> 12
/*     */     //   #940	-> 18
/*     */     //   #941	-> 19
/*     */     //   #942	-> 33
/*     */     //   #882	-> 49
/*     */     //   #942	-> 60
/*     */     //   #943	-> 65
/*     */     //   #944	-> 82
/*     */     //   #882	-> 99
/*     */     //   #944	-> 110
/*     */     //   #945	-> 115
/*     */     //   #943	-> 131
/*     */     //   #947	-> 144
/*     */     //   #882	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$minIntrinsicWidth$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$minIntrinsicWidth$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedContentMeasurePolicy;
/*     */     //   0	162	1	$this$minIntrinsicWidth	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	height	I
/*     */   }
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull List<IntrinsicMeasurable> measurables, int width) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface minIntrinsicHeight : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface minIntrinsicHeight : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #887	-> 12
/*     */     //   #948	-> 18
/*     */     //   #949	-> 19
/*     */     //   #950	-> 33
/*     */     //   #887	-> 49
/*     */     //   #950	-> 60
/*     */     //   #951	-> 65
/*     */     //   #952	-> 82
/*     */     //   #887	-> 99
/*     */     //   #952	-> 110
/*     */     //   #953	-> 115
/*     */     //   #951	-> 131
/*     */     //   #955	-> 144
/*     */     //   #887	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$minIntrinsicHeight$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$minIntrinsicHeight$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedContentMeasurePolicy;
/*     */     //   0	162	1	$this$minIntrinsicHeight	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	width	I
/*     */   }
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull List<IntrinsicMeasurable> measurables, int height) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface maxIntrinsicWidth : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface maxIntrinsicWidth : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #892	-> 12
/*     */     //   #956	-> 18
/*     */     //   #957	-> 19
/*     */     //   #958	-> 33
/*     */     //   #892	-> 49
/*     */     //   #958	-> 60
/*     */     //   #959	-> 65
/*     */     //   #960	-> 82
/*     */     //   #892	-> 99
/*     */     //   #960	-> 110
/*     */     //   #961	-> 115
/*     */     //   #959	-> 131
/*     */     //   #963	-> 144
/*     */     //   #892	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$maxIntrinsicWidth$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$maxIntrinsicWidth$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedContentMeasurePolicy;
/*     */     //   0	162	1	$this$maxIntrinsicWidth	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	height	I
/*     */   }
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull List<IntrinsicMeasurable> measurables, int width) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: nop
/*     */     //   19: aload #4
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: aconst_null
/*     */     //   30: goto -> 146
/*     */     //   33: aload #4
/*     */     //   35: iconst_0
/*     */     //   36: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   41: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   44: astore #6
/*     */     //   46: iconst_0
/*     */     //   47: istore #7
/*     */     //   49: aload #6
/*     */     //   51: iload_3
/*     */     //   52: invokeinterface maxIntrinsicHeight : (I)I
/*     */     //   57: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   60: checkcast java/lang/Comparable
/*     */     //   63: astore #8
/*     */     //   65: iconst_1
/*     */     //   66: istore #6
/*     */     //   68: aload #4
/*     */     //   70: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */     //   73: istore #7
/*     */     //   75: iload #6
/*     */     //   77: iload #7
/*     */     //   79: if_icmpgt -> 144
/*     */     //   82: aload #4
/*     */     //   84: iload #6
/*     */     //   86: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   91: checkcast androidx/compose/ui/layout/IntrinsicMeasurable
/*     */     //   94: astore #9
/*     */     //   96: iconst_0
/*     */     //   97: istore #10
/*     */     //   99: aload #9
/*     */     //   101: iload_3
/*     */     //   102: invokeinterface maxIntrinsicHeight : (I)I
/*     */     //   107: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   110: checkcast java/lang/Comparable
/*     */     //   113: astore #9
/*     */     //   115: aload #9
/*     */     //   117: aload #8
/*     */     //   119: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   124: ifle -> 131
/*     */     //   127: aload #9
/*     */     //   129: astore #8
/*     */     //   131: iload #6
/*     */     //   133: iload #7
/*     */     //   135: if_icmpeq -> 144
/*     */     //   138: iinc #6, 1
/*     */     //   141: goto -> 82
/*     */     //   144: aload #8
/*     */     //   146: checkcast java/lang/Integer
/*     */     //   149: dup
/*     */     //   150: ifnull -> 159
/*     */     //   153: invokevirtual intValue : ()I
/*     */     //   156: goto -> 161
/*     */     //   159: pop
/*     */     //   160: iconst_0
/*     */     //   161: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #897	-> 12
/*     */     //   #964	-> 18
/*     */     //   #965	-> 19
/*     */     //   #966	-> 33
/*     */     //   #897	-> 49
/*     */     //   #966	-> 60
/*     */     //   #967	-> 65
/*     */     //   #968	-> 82
/*     */     //   #897	-> 99
/*     */     //   #968	-> 110
/*     */     //   #969	-> 115
/*     */     //   #967	-> 131
/*     */     //   #971	-> 144
/*     */     //   #897	-> 146
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   49	8	7	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$maxIntrinsicHeight$1	I
/*     */     //   46	11	6	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   99	8	10	$i$a$-fastMaxOfOrNull-AnimatedContentMeasurePolicy$maxIntrinsicHeight$1	I
/*     */     //   96	11	9	it	Landroidx/compose/ui/layout/IntrinsicMeasurable;
/*     */     //   115	16	9	v$iv	Ljava/lang/Comparable;
/*     */     //   68	76	6	i$iv	I
/*     */     //   18	128	5	$i$f$fastMaxOfOrNull	I
/*     */     //   65	81	8	maxValue$iv	Ljava/lang/Comparable;
/*     */     //   15	131	4	$this$fastMaxOfOrNull$iv	Ljava/util/List;
/*     */     //   0	162	0	this	Landroidx/compose/animation/AnimatedContentMeasurePolicy;
/*     */     //   0	162	1	$this$maxIntrinsicHeight	Landroidx/compose/ui/layout/IntrinsicMeasureScope;
/*     */     //   0	162	2	measurables	Ljava/util/List;
/*     */     //   0	162	3	width	I
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\AnimatedContentMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */