/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.collection.IntIntPair;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.MultiContentMeasurePolicy;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\033\n\002\020\000\n\002\b\003\n\002\020 \n\002\b\b\n\002\020\016\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\0002\0020\0012\0020\002BM\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f\022\006\020\r\032\0020\n\022\006\020\016\032\0020\017\022\006\020\020\032\0020\017\022\006\020\021\032\0020\022¢\006\002\020\023J\t\020(\032\0020\004HÆ\003J\t\020)\032\0020\006HÆ\003J\t\020*\032\0020\bHÆ\003J\026\020+\032\0020\nHÂ\003ø\001\001ø\001\000¢\006\004\b,\020-J\t\020.\032\0020\fHÆ\003J\026\020/\032\0020\nHÂ\003ø\001\001ø\001\000¢\006\004\b0\020-J\t\0201\032\0020\017HÂ\003J\t\0202\032\0020\017HÂ\003J\t\0203\032\0020\022HÂ\003Jm\0204\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\n2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0172\b\b\002\020\021\032\0020\022HÆ\001ø\001\000¢\006\004\b5\0206J\023\0207\032\0020\0042\b\0208\032\004\030\00109HÖ\003J\t\020:\032\0020\017HÖ\001JD\020;\032\0020\0172\f\020<\032\b\022\004\022\0020\0340=2\006\020>\032\0020\0172\006\020\t\032\0020\0172\006\020?\032\0020\0172\006\020\016\032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020\022J$\020@\032\0020\0172\f\020<\032\b\022\004\022\0020\0340=2\006\020A\032\0020\0172\006\020B\032\0020\017JD\020C\032\0020\0172\f\020<\032\b\022\004\022\0020\0340=2\006\020D\032\0020\0172\006\020\t\032\0020\0172\006\020?\032\0020\0172\006\020\016\032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020\022J\t\020E\032\0020FHÖ\001J(\020G\032\0020\017*\0020H2\022\020<\032\016\022\n\022\b\022\004\022\0020\0340=0=2\006\020I\032\0020\017H\026J(\020J\032\0020\017*\0020H2\022\020<\032\016\022\n\022\b\022\004\022\0020\0340=0=2\006\020A\032\0020\017H\026J2\020K\032\0020L*\0020M2\022\020<\032\016\022\n\022\b\022\004\022\0020N0=0=2\006\020O\032\0020PH\026ø\001\000¢\006\004\bQ\020RJ(\020S\032\0020\017*\0020H2\022\020<\032\016\022\n\022\b\022\004\022\0020\0340=0=2\006\020I\032\0020\017H\026J(\020T\032\0020\017*\0020H2\022\020<\032\016\022\n\022\b\022\004\022\0020\0340=0=2\006\020A\032\0020\017H\026R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\024\020\025R\026\020\r\032\0020\nX\004ø\001\000ø\001\001¢\006\004\n\002\020\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\027\020\030R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\003\020\031R\026\020\t\032\0020\nX\004ø\001\000ø\001\001¢\006\004\n\002\020\026R.\020\032\032\037\022\004\022\0020\034\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170\033¢\006\002\b\035¢\006\b\n\000\032\004\b\036\020\037R\016\020\016\032\0020\017X\004¢\006\002\n\000R\016\020\020\032\0020\017X\004¢\006\002\n\000R.\020 \032\037\022\004\022\0020\034\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170\033¢\006\002\b\035¢\006\b\n\000\032\004\b!\020\037R.\020\"\032\037\022\004\022\0020\034\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170\033¢\006\002\b\035¢\006\b\n\000\032\004\b#\020\037R.\020$\032\037\022\004\022\0020\034\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170\033¢\006\002\b\035¢\006\b\n\000\032\004\b%\020\037R\016\020\021\032\0020\022X\004¢\006\002\n\000R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b&\020'\002\013\n\005\b¡\0360\001\n\002\b!¨\006U"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "maxCrossAxisIntrinsicItemSize", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "Lkotlin/ExtensionFunctionType;", "getMaxCrossAxisIntrinsicItemSize", "()Lkotlin/jvm/functions/Function3;", "maxMainAxisIntrinsicItemSize", "getMaxMainAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "getMinMainAxisIntrinsicItemSize", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-QuyCDyQ", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "equals", "other", "", "hashCode", "intrinsicCrossAxisSize", "measurables", "", "mainAxisAvailable", "crossAxisSpacing", "maxIntrinsicMainAxisSize", "height", "arrangementSpacing", "minIntrinsicMainAxisSize", "crossAxisAvailable", "toString", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout"})
/*     */ final class FlowMeasurePolicy
/*     */   implements MultiContentMeasurePolicy, FlowLineMeasurePolicy
/*     */ {
/*     */   private final boolean isHorizontal;
/*     */   @NotNull
/*     */   private final Arrangement.Horizontal horizontalArrangement;
/*     */   @NotNull
/*     */   private final Arrangement.Vertical verticalArrangement;
/*     */   private final float mainAxisSpacing;
/*     */   @NotNull
/*     */   private final CrossAxisAlignment crossAxisAlignment;
/*     */   private final float crossAxisArrangementSpacing;
/*     */   private final int maxItemsInMainAxis;
/*     */   private final int maxLines;
/*     */   @NotNull
/*     */   private final FlowLayoutOverflowState overflow;
/*     */   @NotNull
/*     */   private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;
/*     */   @NotNull
/*     */   private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
/*     */   @NotNull
/*     */   private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;
/*     */   @NotNull
/*     */   private final Function3<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;
/*     */   
/*     */   public boolean isHorizontal() {
/*     */     return this.isHorizontal;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Arrangement.Horizontal getHorizontalArrangement() {
/*     */     return this.horizontalArrangement;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Arrangement.Vertical getVerticalArrangement() {
/*     */     return this.verticalArrangement;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public CrossAxisAlignment getCrossAxisAlignment() {
/*     */     return this.crossAxisAlignment;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List measurables, long constraints) {
/*     */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || measurables.isEmpty() || (Constraints.getMaxHeight-impl(constraints) == 0 && this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible))
/*     */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, FlowMeasurePolicy$measure$1.INSTANCE, 4, null); 
/*     */     List<? extends Measurable> list = (List)CollectionsKt.first(measurables);
/*     */     if (list.isEmpty())
/*     */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, FlowMeasurePolicy$measure$2.INSTANCE, 4, null); 
/*     */     (List)CollectionsKt.getOrNull(measurables, 1);
/*     */     Measurable seeMoreMeasurable = ((List)CollectionsKt.getOrNull(measurables, 1) != null) ? (Measurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 1)) : null;
/*     */     (List)CollectionsKt.getOrNull(measurables, 2);
/*     */     Measurable collapseMeasurable = ((List)CollectionsKt.getOrNull(measurables, 2) != null) ? (Measurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 2)) : null;
/*     */     this.overflow.setItemCount$foundation_layout(list.size());
/*     */     this.overflow.setOverflowMeasurables--hBUhpc$foundation_layout(this, seeMoreMeasurable, collapseMeasurable, constraints);
/*     */     return FlowLayoutKt.breakDownItems-di9J0FM($this$measure_u2d3p2s80s, this, list.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, OrientationIndependentConstraints.constructor-impl(constraints, isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class FlowMeasurePolicy$measure$1
/*     */     extends Lambda
/*     */     implements Function1<Placeable.PlacementScope, Unit>
/*     */   {
/*     */     public static final FlowMeasurePolicy$measure$1 INSTANCE = new FlowMeasurePolicy$measure$1();
/*     */     
/*     */     FlowMeasurePolicy$measure$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class FlowMeasurePolicy$measure$2
/*     */     extends Lambda
/*     */     implements Function1<Placeable.PlacementScope, Unit>
/*     */   {
/*     */     public static final FlowMeasurePolicy$measure$2 INSTANCE = new FlowMeasurePolicy$measure$2();
/*     */     
/*     */     FlowMeasurePolicy$measure$2() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     }
/*     */   }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull List measurables, int height) {
/*     */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     (List)CollectionsKt.getOrNull(measurables, 1);
/*     */     (List)CollectionsKt.getOrNull(measurables, 2);
/*     */     this.overflow.setOverflowMeasurables--hBUhpc$foundation_layout(((List)CollectionsKt.getOrNull(measurables, 1) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 1)) : null, ((List)CollectionsKt.getOrNull(measurables, 2) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 2)) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     List<? extends IntrinsicMeasurable> list = CollectionsKt.emptyList();
/*     */     int i = $this$minIntrinsicWidth.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     int j = $this$minIntrinsicWidth.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     int k = this.maxLines;
/*     */     int m = this.maxItemsInMainAxis;
/*     */     FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     list = CollectionsKt.emptyList();
/*     */     i = $this$minIntrinsicWidth.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     j = $this$minIntrinsicWidth.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     k = this.maxLines;
/*     */     m = this.maxItemsInMainAxis;
/*     */     flowLayoutOverflowState = this.overflow;
/*     */     return isHorizontal() ? minIntrinsicMainAxisSize(list, height, i, j, m, k, flowLayoutOverflowState) : intrinsicCrossAxisSize(list, height, i, j, m, k, flowLayoutOverflowState);
/*     */   }
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull List measurables, int width) {
/*     */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     (List)CollectionsKt.getOrNull(measurables, 1);
/*     */     (List)CollectionsKt.getOrNull(measurables, 2);
/*     */     this.overflow.setOverflowMeasurables--hBUhpc$foundation_layout(((List)CollectionsKt.getOrNull(measurables, 1) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 1)) : null, ((List)CollectionsKt.getOrNull(measurables, 2) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 2)) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     List<? extends IntrinsicMeasurable> list = CollectionsKt.emptyList();
/*     */     int i = $this$minIntrinsicHeight.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     int j = $this$minIntrinsicHeight.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     int k = this.maxLines;
/*     */     int m = this.maxItemsInMainAxis;
/*     */     FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     list = CollectionsKt.emptyList();
/*     */     i = $this$minIntrinsicHeight.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     j = $this$minIntrinsicHeight.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     k = this.maxLines;
/*     */     m = this.maxItemsInMainAxis;
/*     */     flowLayoutOverflowState = this.overflow;
/*     */     return isHorizontal() ? intrinsicCrossAxisSize(list, width, i, j, m, k, flowLayoutOverflowState) : minIntrinsicMainAxisSize(list, width, i, j, m, k, flowLayoutOverflowState);
/*     */   }
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull List measurables, int width) {
/*     */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     (List)CollectionsKt.getOrNull(measurables, 1);
/*     */     (List)CollectionsKt.getOrNull(measurables, 2);
/*     */     this.overflow.setOverflowMeasurables--hBUhpc$foundation_layout(((List)CollectionsKt.getOrNull(measurables, 1) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 1)) : null, ((List)CollectionsKt.getOrNull(measurables, 2) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 2)) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, width, 0, 0, 13, null));
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     List<? extends IntrinsicMeasurable> list = CollectionsKt.emptyList();
/*     */     int i = $this$maxIntrinsicHeight.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     int j = $this$maxIntrinsicHeight.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     int k = this.maxLines;
/*     */     int m = this.maxItemsInMainAxis;
/*     */     FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     return isHorizontal() ? intrinsicCrossAxisSize(list, width, i, j, m, k, flowLayoutOverflowState) : ((List)CollectionsKt.firstOrNull(measurables)).maxIntrinsicMainAxisSize(CollectionsKt.emptyList(), width, $this$maxIntrinsicHeight.roundToPx-0680j_4(this.mainAxisSpacing));
/*     */   }
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull List measurables, int height) {
/*     */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     (List)CollectionsKt.getOrNull(measurables, 1);
/*     */     (List)CollectionsKt.getOrNull(measurables, 2);
/*     */     this.overflow.setOverflowMeasurables--hBUhpc$foundation_layout(((List)CollectionsKt.getOrNull(measurables, 1) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 1)) : null, ((List)CollectionsKt.getOrNull(measurables, 2) != null) ? (IntrinsicMeasurable)CollectionsKt.firstOrNull((List)CollectionsKt.getOrNull(measurables, 2)) : null, isHorizontal(), ConstraintsKt.Constraints$default(0, 0, 0, height, 7, null));
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     if ((List)CollectionsKt.firstOrNull(measurables) == null)
/*     */       (List)CollectionsKt.firstOrNull(measurables); 
/*     */     List<? extends IntrinsicMeasurable> list = CollectionsKt.emptyList();
/*     */     int i = $this$maxIntrinsicWidth.roundToPx-0680j_4(this.mainAxisSpacing);
/*     */     int j = $this$maxIntrinsicWidth.roundToPx-0680j_4(this.crossAxisArrangementSpacing);
/*     */     int k = this.maxLines;
/*     */     int m = this.maxItemsInMainAxis;
/*     */     FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
/*     */     return isHorizontal() ? ((List)CollectionsKt.firstOrNull(measurables)).maxIntrinsicMainAxisSize(CollectionsKt.emptyList(), height, $this$maxIntrinsicWidth.roundToPx-0680j_4(this.mainAxisSpacing)) : intrinsicCrossAxisSize(list, height, i, j, m, k, flowLayoutOverflowState);
/*     */   }
/*     */   
/*     */   public final int minIntrinsicMainAxisSize(@NotNull List measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     Intrinsics.checkNotNullParameter(overflow, "overflow");
/*     */     return FlowLayoutKt.access$minIntrinsicMainAxisSize(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow);
/*     */   }
/*     */   
/*     */   public final int maxIntrinsicMainAxisSize(@NotNull List measurables, int height, int arrangementSpacing) {
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     return FlowLayoutKt.access$maxIntrinsicMainAxisSize(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.maxItemsInMainAxis);
/*     */   }
/*     */   
/*     */   public final int intrinsicCrossAxisSize(@NotNull List measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     Intrinsics.checkNotNullParameter(overflow, "overflow");
/*     */     Function3<IntrinsicMeasurable, Integer, Integer, Integer> function31 = this.minMainAxisIntrinsicItemSize;
/*     */     Function3<IntrinsicMeasurable, Integer, Integer, Integer> function32 = this.minCrossAxisIntrinsicItemSize;
/*     */     return IntIntPair.getFirst-impl(FlowLayoutKt.access$intrinsicCrossAxisSize(measurables, function31, function32, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
/*     */     return this.maxMainAxisIntrinsicItemSize;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "h", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1 INSTANCE = new FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int h) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.maxIntrinsicWidth(h));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2 INSTANCE = new FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int w) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.maxIntrinsicHeight(w));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
/*     */     return this.maxCrossAxisIntrinsicItemSize;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1 INSTANCE = new FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int w) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.maxIntrinsicHeight(w));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "h", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2 INSTANCE = new FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int h) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.maxIntrinsicWidth(h));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
/*     */     return this.minCrossAxisIntrinsicItemSize;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1 INSTANCE = new FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int w) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.minIntrinsicHeight(w));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "h", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2 INSTANCE = new FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int h) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.minIntrinsicWidth(h));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
/*     */     return this.minMainAxisIntrinsicItemSize;
/*     */   }
/*     */   
/*     */   public final boolean component1() {
/*     */     return this.isHorizontal;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Arrangement.Horizontal component2() {
/*     */     return this.horizontalArrangement;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Arrangement.Vertical component3() {
/*     */     return this.verticalArrangement;
/*     */   }
/*     */   
/*     */   private final float component4-D9Ej5fM() {
/*     */     return this.mainAxisSpacing;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final CrossAxisAlignment component5() {
/*     */     return this.crossAxisAlignment;
/*     */   }
/*     */   
/*     */   private final float component6-D9Ej5fM() {
/*     */     return this.crossAxisArrangementSpacing;
/*     */   }
/*     */   
/*     */   private final int component7() {
/*     */     return this.maxItemsInMainAxis;
/*     */   }
/*     */   
/*     */   private final int component8() {
/*     */     return this.maxLines;
/*     */   }
/*     */   
/*     */   private final FlowLayoutOverflowState component9() {
/*     */     return this.overflow;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FlowMeasurePolicy copy-QuyCDyQ(boolean isHorizontal, @NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, float mainAxisSpacing, @NotNull CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) {
/*     */     Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
/*     */     Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
/*     */     Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
/*     */     Intrinsics.checkNotNullParameter(overflow, "overflow");
/*     */     return new FlowMeasurePolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, maxItemsInMainAxis, maxLines, overflow, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + Dp.toString-impl(this.mainAxisSpacing) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + Dp.toString-impl(this.crossAxisArrangementSpacing) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.isHorizontal);
/*     */     result = result * 31 + this.horizontalArrangement.hashCode();
/*     */     result = result * 31 + this.verticalArrangement.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.mainAxisSpacing);
/*     */     result = result * 31 + this.crossAxisAlignment.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.crossAxisArrangementSpacing);
/*     */     result = result * 31 + Integer.hashCode(this.maxItemsInMainAxis);
/*     */     result = result * 31 + Integer.hashCode(this.maxLines);
/*     */     return result * 31 + this.overflow.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FlowMeasurePolicy))
/*     */       return false; 
/*     */     FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy)other;
/*     */     return (this.isHorizontal != flowMeasurePolicy.isHorizontal) ? false : (!Intrinsics.areEqual(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) ? false : (!Intrinsics.areEqual(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) ? false : (!Dp.equals-impl0(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) ? false : (!Intrinsics.areEqual(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) ? false : (!Dp.equals-impl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) ? false : ((this.maxItemsInMainAxis != flowMeasurePolicy.maxItemsInMainAxis) ? false : ((this.maxLines != flowMeasurePolicy.maxLines) ? false : (!!Intrinsics.areEqual(this.overflow, flowMeasurePolicy.overflow)))))))));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "h", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"})
/*     */   static final class FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1
/*     */     extends Lambda
/*     */     implements Function3<IntrinsicMeasurable, Integer, Integer, Integer>
/*     */   {
/*     */     public static final FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1 INSTANCE = new FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1();
/*     */     
/*     */     @NotNull
/*     */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int h) {
/*     */       Intrinsics.checkNotNullParameter($this$null, "$this$null");
/*     */       return Integer.valueOf($this$null.minIntrinsicWidth(h));
/*     */     }
/*     */     
/*     */     FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1() {
/*     */       super(3);
/*     */     }
/*     */   }
/*     */   
/*     */   private FlowMeasurePolicy(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
/* 635 */     this.isHorizontal = isHorizontal;
/* 636 */     this.horizontalArrangement = horizontalArrangement;
/* 637 */     this.verticalArrangement = verticalArrangement;
/* 638 */     this.mainAxisSpacing = mainAxisSpacing;
/* 639 */     this.crossAxisAlignment = crossAxisAlignment;
/* 640 */     this.crossAxisArrangementSpacing = crossAxisArrangementSpacing;
/* 641 */     this.maxItemsInMainAxis = maxItemsInMainAxis;
/* 642 */     this.maxLines = maxLines;
/* 643 */     this.overflow = overflow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 863 */     this.maxMainAxisIntrinsicItemSize = isHorizontal() ? FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1.INSTANCE : 
/*     */ 
/*     */       
/* 866 */       FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 871 */     this.maxCrossAxisIntrinsicItemSize = isHorizontal() ? FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1.INSTANCE : 
/*     */ 
/*     */       
/* 874 */       FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 879 */     this.minCrossAxisIntrinsicItemSize = isHorizontal() ? FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1.INSTANCE : 
/*     */ 
/*     */       
/* 882 */       FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 887 */     this.minMainAxisIntrinsicItemSize = isHorizontal() ? FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1.INSTANCE : 
/*     */ 
/*     */       
/* 890 */       FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2.INSTANCE; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "<anonymous parameter 0>", "w", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}) static final class FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> { @NotNull
/* 891 */     public final Integer invoke(@NotNull IntrinsicMeasurable $this$null, int param1Int1, int w) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); return Integer.valueOf($this$null.minIntrinsicHeight(w)); }
/*     */ 
/*     */     
/*     */     public static final FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2 INSTANCE = new FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2();
/*     */     
/*     */     FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2() {
/*     */       super(3);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */