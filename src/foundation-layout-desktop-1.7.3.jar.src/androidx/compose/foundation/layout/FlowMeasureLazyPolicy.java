/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.layout.SubcomposeMeasureScope;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000|\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b \n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\005\b\b\030\0002\0020\001B«\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\t\022\006\020\r\032\0020\016\022\006\020\017\032\0020\016\022\006\020\020\032\0020\016\022\006\020\021\032\0020\022\022\027\020\023\032\023\022\017\022\r\022\004\022\0020\0260\025¢\006\002\b\0270\024\022;\020\030\0327\022\023\022\0210\016¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\0210\035¢\006\f\b\032\022\b\b\033\022\004\b\b(\036\022\004\022\0020\0260\031¢\006\002\b\027¢\006\002\020\037J\t\020)\032\0020\003HÆ\003J\t\020*\032\0020\022HÂ\003J\032\020+\032\023\022\017\022\r\022\004\022\0020\0260\025¢\006\002\b\0270\024HÂ\003JC\020,\0327\022\023\022\0210\016¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\0210\035¢\006\f\b\032\022\b\b\033\022\004\b\b(\036\022\004\022\0020\0260\031¢\006\002\b\027HÂ\003¢\006\002\020-J\t\020.\032\0020\005HÆ\003J\t\020/\032\0020\007HÆ\003J\026\0200\032\0020\tHÂ\003ø\001\001ø\001\000¢\006\004\b1\0202J\t\0203\032\0020\013HÆ\003J\026\0204\032\0020\tHÂ\003ø\001\001ø\001\000¢\006\004\b5\0202J\t\0206\032\0020\016HÂ\003J\t\0207\032\0020\016HÂ\003J\t\0208\032\0020\016HÂ\003JÑ\001\0209\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\t2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0162\b\b\002\020\021\032\0020\0222\031\b\002\020\023\032\023\022\017\022\r\022\004\022\0020\0260\025¢\006\002\b\0270\0242=\b\002\020\030\0327\022\023\022\0210\016¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\0210\035¢\006\f\b\032\022\b\b\033\022\004\b\b(\036\022\004\022\0020\0260\031¢\006\002\b\027HÆ\001ø\001\000¢\006\004\b:\020;J\023\020<\032\0020\0032\b\020=\032\004\030\0010>HÖ\003J\030\020?\032\024\022\004\022\0020@\022\004\022\0020A\022\004\022\0020B0\031J\t\020C\032\0020\016HÖ\001J\t\020D\032\0020EHÖ\001J\036\020F\032\0020B*\0020@2\006\020G\032\0020AH\002ø\001\000¢\006\004\bH\020IR\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b \020!R\026\020\f\032\0020\tX\004ø\001\000ø\001\001¢\006\004\n\002\020\"RE\020\030\0327\022\023\022\0210\016¢\006\f\b\032\022\b\b\033\022\004\b\b(\034\022\023\022\0210\035¢\006\f\b\032\022\b\b\033\022\004\b\b(\036\022\004\022\0020\0260\031¢\006\002\b\027X\004¢\006\004\n\002\020#R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b$\020%R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\002\020&R\016\020\r\032\0020\016X\004¢\006\002\n\000R\026\020\b\032\0020\tX\004ø\001\000ø\001\001¢\006\004\n\002\020\"R\016\020\020\032\0020\016X\004¢\006\002\n\000R\016\020\017\032\0020\016X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\037\020\023\032\023\022\017\022\r\022\004\022\0020\0260\025¢\006\002\b\0270\024X\004¢\006\002\n\000R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b'\020(\002\013\n\005\b¡\0360\001\n\002\b!¨\006J"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "isHorizontal", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "mainAxisSpacing", "Landroidx/compose/ui/unit/Dp;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisArrangementSpacing", "itemCount", "", "maxLines", "maxItemsInMainAxis", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getComposable", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "F", "Lkotlin/jvm/functions/Function4;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "()Z", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component1", "component10", "component11", "component12", "()Lkotlin/jvm/functions/Function4;", "component2", "component3", "component4", "component4-D9Ej5fM", "()F", "component5", "component6", "component6-D9Ej5fM", "component7", "component8", "component9", "copy", "copy-E4Q9ldg", "(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;Lkotlin/jvm/functions/Function4;)Landroidx/compose/foundation/layout/FlowMeasureLazyPolicy;", "equals", "other", "", "getMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "hashCode", "toString", "", "measure", "constraints", "measure-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ final class FlowMeasureLazyPolicy
/*     */   implements FlowLineMeasurePolicy
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
/*     */   private final int itemCount;
/*     */   private final int maxLines;
/*     */   private final int maxItemsInMainAxis;
/*     */   @NotNull
/*     */   private final FlowLayoutOverflowState overflow;
/*     */   @NotNull
/*     */   private final List<Function2<Composer, Integer, Unit>> overflowComposables;
/*     */   @NotNull
/*     */   private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable;
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
/*     */   private FlowMeasureLazyPolicy(boolean isHorizontal, Arrangement.Horizontal horizontalArrangement, Arrangement.Vertical verticalArrangement, float mainAxisSpacing, CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int itemCount, int maxLines, int maxItemsInMainAxis, FlowLayoutOverflowState overflow, List<Function2<Composer, Integer, Unit>> overflowComposables, Function4<Integer, FlowLineInfo, Composer, Integer, Unit> getComposable) {
/* 415 */     this.isHorizontal = isHorizontal;
/* 416 */     this.horizontalArrangement = horizontalArrangement;
/* 417 */     this.verticalArrangement = verticalArrangement;
/* 418 */     this.mainAxisSpacing = mainAxisSpacing;
/* 419 */     this.crossAxisAlignment = crossAxisAlignment;
/* 420 */     this.crossAxisArrangementSpacing = crossAxisArrangementSpacing;
/* 421 */     this.itemCount = itemCount;
/* 422 */     this.maxLines = maxLines;
/* 423 */     this.maxItemsInMainAxis = maxItemsInMainAxis;
/* 424 */     this.overflow = overflow;
/* 425 */     this.overflowComposables = overflowComposables;
/* 426 */     this.getComposable = getComposable;
/*     */   } @NotNull
/*     */   public CrossAxisAlignment getCrossAxisAlignment() {
/*     */     return this.crossAxisAlignment;
/*     */   }
/*     */   @NotNull
/*     */   public final Function2<SubcomposeMeasureScope, Constraints, MeasureResult> getMeasurePolicy() {
/* 433 */     return new FlowMeasureLazyPolicy$getMeasurePolicy$1(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\004\b\006\020\007"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "measureScope", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/SubcomposeMeasureScope;J)Landroidx/compose/ui/layout/MeasureResult;"}) static final class FlowMeasureLazyPolicy$getMeasurePolicy$1 extends Lambda implements Function2<SubcomposeMeasureScope, Constraints, MeasureResult> { @NotNull
/* 434 */     public final MeasureResult invoke-0kLqBqw(@NotNull SubcomposeMeasureScope measureScope, long constraints) { Intrinsics.checkNotNullParameter(measureScope, "measureScope"); return FlowMeasureLazyPolicy.this.measure-0kLqBqw(measureScope, constraints); }
/*     */     
/*     */     FlowMeasureLazyPolicy$getMeasurePolicy$1() {
/*     */       super(2);
/*     */     } }
/*     */   
/*     */   private final MeasureResult measure-0kLqBqw(SubcomposeMeasureScope $this$measure_u2d0kLqBqw, long constraints) {
/* 441 */     if (this.itemCount <= 0 || 
/* 442 */       this.maxLines == 0 || 
/* 443 */       this.maxItemsInMainAxis == 0 || (
/* 444 */       Constraints.getMaxHeight-impl(constraints) == 0 && 
/* 445 */       this.overflow.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.Visible))
/*     */     {
/* 447 */       return MeasureScope.layout$default((MeasureScope)$this$measure_u2d0kLqBqw, 0, 0, null, FlowMeasureLazyPolicy$measure$1.INSTANCE, 4, null);
/*     */     }
/* 449 */     ContextualFlowItemIterator measurablesIterator = new ContextualFlowItemIterator(
/* 450 */         this.itemCount, new FlowMeasureLazyPolicy$measure$measurablesIterator$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 456 */     this.overflow.setItemCount$foundation_layout(this.itemCount);
/* 457 */     this.overflow.setOverflowMeasurables-VKLhPVY$foundation_layout(
/* 458 */         this, 
/* 459 */         constraints, new FlowMeasureLazyPolicy$measure$2($this$measure_u2d0kLqBqw));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 468 */     return FlowLayoutKt.breakDownItems-di9J0FM((MeasureScope)$this$measure_u2d0kLqBqw, 
/* 469 */         this, 
/* 470 */         measurablesIterator, 
/* 471 */         this.mainAxisSpacing, 
/* 472 */         this.crossAxisArrangementSpacing, 
/* 473 */         OrientationIndependentConstraints.constructor-impl(
/* 474 */           constraints, isHorizontal() ? 
/* 475 */           LayoutOrientation.Horizontal : 
/*     */           
/* 477 */           LayoutOrientation.Vertical), 
/*     */ 
/*     */         
/* 480 */         this.maxItemsInMainAxis, 
/* 481 */         this.maxLines, 
/* 482 */         this.overflow);
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
/*     */     return this.itemCount;
/*     */   }
/*     */   
/*     */   private final int component8() {
/*     */     return this.maxLines;
/*     */   }
/*     */   
/*     */   private final int component9() {
/*     */     return this.maxItemsInMainAxis;
/*     */   }
/*     */   
/*     */   private final FlowLayoutOverflowState component10() {
/*     */     return this.overflow;
/*     */   }
/*     */   
/*     */   private final List<Function2<Composer, Integer, Unit>> component11() {
/*     */     return this.overflowComposables;
/*     */   }
/*     */   
/*     */   private final Function4<Integer, FlowLineInfo, Composer, Integer, Unit> component12() {
/*     */     return this.getComposable;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FlowMeasureLazyPolicy copy-E4Q9ldg(boolean isHorizontal, @NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, float mainAxisSpacing, @NotNull CrossAxisAlignment crossAxisAlignment, float crossAxisArrangementSpacing, int itemCount, int maxLines, int maxItemsInMainAxis, @NotNull FlowLayoutOverflowState overflow, @NotNull List overflowComposables, @NotNull Function4 getComposable) {
/*     */     Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
/*     */     Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
/*     */     Intrinsics.checkNotNullParameter(crossAxisAlignment, "crossAxisAlignment");
/*     */     Intrinsics.checkNotNullParameter(overflow, "overflow");
/*     */     Intrinsics.checkNotNullParameter(overflowComposables, "overflowComposables");
/*     */     Intrinsics.checkNotNullParameter(getComposable, "getComposable");
/*     */     return new FlowMeasureLazyPolicy(isHorizontal, horizontalArrangement, verticalArrangement, mainAxisSpacing, crossAxisAlignment, crossAxisArrangementSpacing, itemCount, maxLines, maxItemsInMainAxis, overflow, overflowComposables, getComposable, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     stringBuilder.append("FlowMeasureLazyPolicy(isHorizontal=").append(this.isHorizontal).append(", horizontalArrangement=").append(this.horizontalArrangement).append(", verticalArrangement=").append(this.verticalArrangement).append(", mainAxisSpacing=").append(Dp.toString-impl(this.mainAxisSpacing)).append(", crossAxisAlignment=").append(this.crossAxisAlignment).append(", crossAxisArrangementSpacing=").append(Dp.toString-impl(this.crossAxisArrangementSpacing)).append(", itemCount=").append(this.itemCount).append(", maxLines=").append(this.maxLines).append(", maxItemsInMainAxis=").append(this.maxItemsInMainAxis).append(", overflow=").append(this.overflow).append(", overflowComposables=").append(this.overflowComposables).append(", getComposable=");
/*     */     stringBuilder.append(this.getComposable).append(')');
/*     */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = Boolean.hashCode(this.isHorizontal);
/*     */     result = result * 31 + this.horizontalArrangement.hashCode();
/*     */     result = result * 31 + this.verticalArrangement.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.mainAxisSpacing);
/*     */     result = result * 31 + this.crossAxisAlignment.hashCode();
/*     */     result = result * 31 + Dp.hashCode-impl(this.crossAxisArrangementSpacing);
/*     */     result = result * 31 + Integer.hashCode(this.itemCount);
/*     */     result = result * 31 + Integer.hashCode(this.maxLines);
/*     */     result = result * 31 + Integer.hashCode(this.maxItemsInMainAxis);
/*     */     result = result * 31 + this.overflow.hashCode();
/*     */     result = result * 31 + this.overflowComposables.hashCode();
/*     */     return result * 31 + this.getComposable.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FlowMeasureLazyPolicy))
/*     */       return false; 
/*     */     FlowMeasureLazyPolicy flowMeasureLazyPolicy = (FlowMeasureLazyPolicy)other;
/*     */     return (this.isHorizontal != flowMeasureLazyPolicy.isHorizontal) ? false : (!Intrinsics.areEqual(this.horizontalArrangement, flowMeasureLazyPolicy.horizontalArrangement) ? false : (!Intrinsics.areEqual(this.verticalArrangement, flowMeasureLazyPolicy.verticalArrangement) ? false : (!Dp.equals-impl0(this.mainAxisSpacing, flowMeasureLazyPolicy.mainAxisSpacing) ? false : (!Intrinsics.areEqual(this.crossAxisAlignment, flowMeasureLazyPolicy.crossAxisAlignment) ? false : (!Dp.equals-impl0(this.crossAxisArrangementSpacing, flowMeasureLazyPolicy.crossAxisArrangementSpacing) ? false : ((this.itemCount != flowMeasureLazyPolicy.itemCount) ? false : ((this.maxLines != flowMeasureLazyPolicy.maxLines) ? false : ((this.maxItemsInMainAxis != flowMeasureLazyPolicy.maxItemsInMainAxis) ? false : (!Intrinsics.areEqual(this.overflow, flowMeasureLazyPolicy.overflow) ? false : (!Intrinsics.areEqual(this.overflowComposables, flowMeasureLazyPolicy.overflowComposables) ? false : (!!Intrinsics.areEqual(this.getComposable, flowMeasureLazyPolicy.getComposable))))))))))));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class FlowMeasureLazyPolicy$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public static final FlowMeasureLazyPolicy$measure$1 INSTANCE = new FlowMeasureLazyPolicy$measure$1();
/*     */     
/*     */     FlowMeasureLazyPolicy$measure$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n¢\006\002\b\007"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Measurable;", "index", "", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "invoke"})
/*     */   static final class FlowMeasureLazyPolicy$measure$measurablesIterator$1 extends Lambda implements Function2<Integer, FlowLineInfo, List<? extends Measurable>> {
/*     */     @NotNull
/*     */     public final List<Measurable> invoke(int index, @NotNull FlowLineInfo info) {
/*     */       Intrinsics.checkNotNullParameter(info, "info");
/*     */       return this.$this_measure.subcompose(Integer.valueOf(index), (Function2)ComposableLambdaKt.composableLambdaInstance(-195060736, true, new Function2<Composer, Integer, Unit>(index, info) {
/*     */               @Composable
/*     */               public final void invoke(@Nullable Composer $composer, int $changed) {
/*     */                 ComposerKt.sourceInformation($composer, "C452@17604L26:ContextualFlowLayout.kt#2w3rfo");
/*     */                 if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventStart(-195060736, $changed, -1, "androidx.compose.foundation.layout.FlowMeasureLazyPolicy.measure.<anonymous>.<anonymous> (ContextualFlowLayout.kt:452)"); 
/*     */                   FlowMeasureLazyPolicy.this.getComposable.invoke(Integer.valueOf(this.$index), this.$info, $composer, Integer.valueOf(0));
/*     */                   if (ComposerKt.isTraceInProgress())
/*     */                     ComposerKt.traceEventEnd(); 
/*     */                 } else {
/*     */                   $composer.skipToGroupEnd();
/*     */                 } 
/*     */               }
/*     */             }));
/*     */     }
/*     */     
/*     */     FlowMeasureLazyPolicy$measure$measurablesIterator$1(FlowMeasureLazyPolicy flowMeasureLazyPolicy) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/Measurable;", "canExpand", "", "noOfItemsShown", "", "invoke"})
/*     */   static final class FlowMeasureLazyPolicy$measure$2 extends Lambda implements Function2<Boolean, Integer, Measurable> {
/*     */     @Nullable
/*     */     public final Measurable invoke(boolean canExpand, int noOfItemsShown) {
/*     */       int composableIndex = canExpand ? 0 : 1;
/*     */       Function2 function21 = (Function2)CollectionsKt.getOrNull(FlowMeasureLazyPolicy.this.overflowComposables, composableIndex);
/*     */       SubcomposeMeasureScope subcomposeMeasureScope = this.$this_measure;
/*     */       FlowMeasureLazyPolicy flowMeasureLazyPolicy = FlowMeasureLazyPolicy.this;
/*     */       Function2 $this$invoke_u24lambda_u240 = function21;
/*     */       int $i$a$-run-FlowMeasureLazyPolicy$measure$2$1 = 0;
/*     */       (Function2)CollectionsKt.getOrNull(FlowMeasureLazyPolicy.this.overflowComposables, composableIndex);
/*     */       return ((Function2)CollectionsKt.getOrNull(FlowMeasureLazyPolicy.this.overflowComposables, composableIndex) != null) ? (Measurable)CollectionsKt.getOrNull(subcomposeMeasureScope.subcompose(canExpand + flowMeasureLazyPolicy.itemCount + noOfItemsShown, $this$invoke_u24lambda_u240), 0) : null;
/*     */     }
/*     */     
/*     */     FlowMeasureLazyPolicy$measure$2(SubcomposeMeasureScope subcomposeMeasureScope) {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowMeasureLazyPolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */