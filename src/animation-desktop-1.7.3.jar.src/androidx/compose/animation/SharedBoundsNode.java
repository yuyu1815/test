/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*     */ import androidx.compose.ui.layout.ApproachMeasureScope;
/*     */ import androidx.compose.ui.layout.LayoutCoordinates;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalMap;
/*     */ import androidx.compose.ui.node.DelegatableNode;
/*     */ import androidx.compose.ui.node.DelegatableNodeKt;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\0022\0020\0032\0020\004B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\032\020\"\032\0020#2\006\020$\032\0020%H\026ø\001\000¢\006\004\b&\020'J\b\020(\032\0020)H\026J\b\020*\032\0020)H\026J\b\020+\032\0020)H\026J\b\020,\032\0020\026H\002J&\020-\032\0020.*\0020/2\006\0200\032\002012\006\0202\032\00203H\026ø\001\000¢\006\004\b4\0205J\f\0206\032\0020)*\00207H\026J&\0208\032\0020.*\002092\006\0200\032\002012\006\0202\032\00203H\026ø\001\000¢\006\004\b:\020;J\024\020<\032\0020.*\002092\006\020=\032\0020>H\002J\f\020?\032\0020)*\0020\026H\002R\024\020\b\032\0020\t8BX\004¢\006\006\032\004\b\n\020\013R\"\020\016\032\004\030\0010\r2\b\020\f\032\004\030\0010\r@BX\016¢\006\b\n\000\"\004\b\017\020\020R\024\020\021\032\0020\022X\004¢\006\b\n\000\032\004\b\023\020\024R\024\020\025\032\0020\0268BX\004¢\006\006\032\004\b\027\020\030R\024\020\031\032\0020\0268BX\004¢\006\006\032\004\b\032\020\030R\024\020\033\032\0020\0348BX\004¢\006\006\032\004\b\035\020\036R$\020\005\032\0020\0062\006\020\f\032\0020\006@@X\016¢\006\016\n\000\032\004\b\037\020 \"\004\b!\020\007\002\007\n\005\b¡\0360\001¨\006@"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "state", "Landroidx/compose/animation/SharedElementInternalState;", "(Landroidx/compose/animation/SharedElementInternalState;)V", "boundsAnimation", "Landroidx/compose/animation/BoundsAnimation;", "getBoundsAnimation", "()Landroidx/compose/animation/BoundsAnimation;", "value", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "setLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "providedValues", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "getProvidedValues", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "rootCoords", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getRootCoords", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "rootLookaheadCoords", "getRootLookaheadCoords", "sharedElement", "Landroidx/compose/animation/SharedElement;", "getSharedElement", "()Landroidx/compose/animation/SharedElement;", "getState", "()Landroidx/compose/animation/SharedElementInternalState;", "setState$animation", "isMeasurementApproachInProgress", "", "lookaheadSize", "Landroidx/compose/ui/unit/IntSize;", "isMeasurementApproachInProgress-ozmzZPI", "(J)Z", "onAttach", "", "onDetach", "onReset", "requireLookaheadLayoutCoordinates", "approachMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "approachMeasure-3p2s80s", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "measure", "Landroidx/compose/ui/layout/MeasureScope;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "place", "placeable", "Landroidx/compose/ui/layout/Placeable;", "updateCurrentBounds", "animation"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n56#3,4:278\n56#3,4:282\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n168#1:278,4\n224#1:282,4\n*E\n"})
/*     */ public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {
/*     */   @NotNull
/*     */   private SharedElementInternalState state;
/*     */   @Nullable
/*     */   private GraphicsLayer layer;
/*     */   @NotNull
/*     */   private final ModifierLocalMap providedValues;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private final LayoutCoordinates getRootCoords() {
/*     */     return getSharedElement().getScope().getRoot$animation();
/*     */   }
/*     */   
/*     */   private final LayoutCoordinates getRootLookaheadCoords() {
/*     */     return getSharedElement().getScope().getLookaheadRoot$animation();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SharedElementInternalState getState() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   public final void setState$animation(@NotNull SharedElementInternalState value) {
/*     */     Intrinsics.checkNotNullParameter(value, "value");
/*     */     if (!Intrinsics.areEqual(value, this.state)) {
/*     */       this.state = value;
/*     */       if (isAttached()) {
/*     */         provide((ModifierLocal)SharedContentNodeKt.getModifierLocalSharedElementInternalState(), value);
/*     */         this.state.setParentState((SharedElementInternalState)getCurrent((ModifierLocal)SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
/*     */         this.state.setLayer(this.layer);
/*     */         this.state.setLookaheadCoords(new SharedBoundsNode$state$1());
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"})
/*     */   static final class SharedBoundsNode$state$1 extends Lambda implements Function0<LayoutCoordinates> {
/*     */     SharedBoundsNode$state$1() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LayoutCoordinates invoke() {
/*     */       return SharedBoundsNode.this.requireLookaheadLayoutCoordinates();
/*     */     }
/*     */   }
/*     */   
/*  81 */   public SharedBoundsNode(@NotNull SharedElementInternalState state) { this.state = state;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     this.layer = state.getLayer();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(TuplesKt.to(SharedContentNodeKt.getModifierLocalSharedElementInternalState(), state)); }
/*     */   private final LayoutCoordinates requireLookaheadLayoutCoordinates() { SharedTransitionScopeImpl $this$requireLookaheadLayoutCoordinates_u24lambda_u240 = this.state.getSharedElement().getScope(); int $i$a$-with-SharedBoundsNode$requireLookaheadLayoutCoordinates$1 = 0; return $this$requireLookaheadLayoutCoordinates_u24lambda_u240.toLookaheadCoordinates(DelegatableNodeKt.requireLayoutCoordinates((DelegatableNode)this)); }
/*     */   private final BoundsAnimation getBoundsAnimation() { return this.state.getBoundsAnimation(); }
/* 119 */   private final void setLayer(GraphicsLayer value) { GraphicsLayer it = this.layer; int $i$a$-let-SharedBoundsNode$layer$1 = 0; DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).releaseGraphicsLayer(it); this.state.setLayer(value); this.layer = value; } private final SharedElement getSharedElement() { return this.state.getSharedElement(); } @NotNull public ModifierLocalMap getProvidedValues() { return this.providedValues; } public void onAttach() { super.onAttach();
/* 120 */     provide((ModifierLocal)SharedContentNodeKt.getModifierLocalSharedElementInternalState(), this.state);
/* 121 */     this.state.setParentState((SharedElementInternalState)getCurrent((ModifierLocal)SharedContentNodeKt.getModifierLocalSharedElementInternalState()));
/* 122 */     setLayer(DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).createGraphicsLayer());
/* 123 */     this.state.setLookaheadCoords(new SharedBoundsNode$onAttach$1()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}) static final class SharedBoundsNode$onAttach$1 extends Lambda implements Function0<LayoutCoordinates> { SharedBoundsNode$onAttach$1() { super(0); } @NotNull public final LayoutCoordinates invoke() { return SharedBoundsNode.this.requireLookaheadLayoutCoordinates(); }
/*     */      }
/*     */ 
/*     */   
/* 127 */   public void onDetach() { super.onDetach();
/* 128 */     setLayer((GraphicsLayer)null);
/* 129 */     this.state.setParentState(null);
/* 130 */     this.state.setLookaheadCoords(SharedBoundsNode$onDetach$1.INSTANCE); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\001\n\000\020\000\032\004\030\0010\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"}) static final class SharedBoundsNode$onDetach$1 extends Lambda implements Function0 { public static final SharedBoundsNode$onDetach$1 INSTANCE = new SharedBoundsNode$onDetach$1(); SharedBoundsNode$onDetach$1() { super(0); } @Nullable public final Void invoke() { return null; }
/*     */      }
/*     */ 
/*     */   
/* 134 */   public void onReset() { super.onReset();
/*     */     
/* 136 */     if (this.layer != null) { GraphicsLayer it = this.layer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 277 */       int $i$a$-let-SharedBoundsNode$onReset$1 = 0; DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).releaseGraphicsLayer(it); } else {  }  setLayer(DelegatableNodeKt.requireGraphicsContext((DelegatableNode)this).createGraphicsLayer()); } @NotNull public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) { Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); Placeable placeable = measurable.measure-BRTryo0(constraints); long lookaheadSize = SizeKt.Size(placeable.getWidth(), placeable.getHeight()); return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new SharedBoundsNode$measure$1(this, lookaheadSize), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) static final class SharedBoundsNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/* 278 */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); LayoutCoordinates layoutCoordinates1 = $this$layout.getCoordinates(); SharedBoundsNode sharedBoundsNode2 = SharedBoundsNode.this; long l2 = this.$lookaheadSize; LayoutCoordinates layoutCoordinates2 = layoutCoordinates1; int $i$a$-let-SharedBoundsNode$measure$1$topLeft$1 = 0; long l3 = sharedBoundsNode2.getRootLookaheadCoords().localPositionOf-R5De75A(layoutCoordinates2, Offset.Companion.getZero-F1C5BW0()), l4 = l3; int $i$a$-also-SharedBoundsNode$measure$1$topLeft$1$1 = 0; if (sharedBoundsNode2.getSharedElement().getCurrentBounds() == null) sharedBoundsNode2.getSharedElement().setCurrentBounds(RectKt.Rect-tz77jQw(l4, l2));  $this$layout.getCoordinates(); Offset topLeft = ($this$layout.getCoordinates() != null) ? Offset.box-impl(l3) : null; Placeable.PlacementScope.place$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null); Offset offset1 = topLeft; SharedBoundsNode sharedBoundsNode1 = SharedBoundsNode.this; long l1 = this.$lookaheadSize, it = offset1.unbox-impl(); int $i$a$-let-SharedBoundsNode$measure$1$1 = 0; sharedBoundsNode1.getSharedElement().onLookaheadResult-v_w8tDc(sharedBoundsNode1.getState(), l1, it); } SharedBoundsNode$measure$1(SharedBoundsNode $receiver, long $lookaheadSize) { super(1); } } private final MeasureResult place(MeasureScope $this$place, Placeable placeable) { long l = this.state.getPlaceHolderSize().calculateSize-JyjRU_E(requireLookaheadLayoutCoordinates().getSize-YbymL2g(), IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight())); int $i$f$component1-impl = 0, w = IntSize.getWidth-impl(l), $i$f$component2-impl = 0, h = 
/*     */ 
/*     */       
/* 281 */       IntSize.getHeight-impl(l); return MeasureScope.layout$default($this$place, w, h, null, new SharedBoundsNode$place$1(placeable), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) @SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode$place$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,276:1\n1#2:277\n70#3,4:278\n26#4:282\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode$place$1\n*L\n204#1:278,4\n205#1:282\n*E\n"}) static final class SharedBoundsNode$place$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); if (!SharedBoundsNode.this.getSharedElement().getFoundMatch()) { LayoutCoordinates layoutCoordinates = $this$layout.getCoordinates(); if (layoutCoordinates != null) SharedBoundsNode.this.updateCurrentBounds(layoutCoordinates);  Placeable.PlacementScope.place$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null); } else { if (SharedBoundsNode.this.getSharedElement().getTargetBounds() != null) { Intrinsics.checkNotNull(SharedBoundsNode.this.getSharedElement().getCurrentBounds()); Intrinsics.checkNotNull(SharedBoundsNode.this.getSharedElement().getTargetBounds()); SharedBoundsNode.this.getBoundsAnimation().animate(SharedBoundsNode.this.getSharedElement().getCurrentBounds(), SharedBoundsNode.this.getSharedElement().getTargetBounds()); }  Rect animatedBounds = SharedBoundsNode.this.getBoundsAnimation().getValue(); LayoutCoordinates layoutCoordinates1 = $this$layout.getCoordinates(); SharedBoundsNode sharedBoundsNode = SharedBoundsNode.this; LayoutCoordinates it = layoutCoordinates1; int $i$a$-let-SharedBoundsNode$place$1$positionInScope$1 = 0; $this$layout.getCoordinates(); Offset positionInScope = ($this$layout.getCoordinates() != null) ? Offset.box-impl(sharedBoundsNode.getRootCoords().localPositionOf-R5De75A(it, Offset.Companion.getZero-F1C5BW0())) : null; long topLeft = 0L; if (animatedBounds != null) { if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) SharedBoundsNode.this.getSharedElement().setCurrentBounds(animatedBounds);  topLeft = animatedBounds.getTopLeft-F1C5BW0(); } else { if (SharedBoundsNode.this.getBoundsAnimation().getTarget()) { LayoutCoordinates layoutCoordinates = $this$layout.getCoordinates(); if (layoutCoordinates != null) SharedBoundsNode.this.updateCurrentBounds(layoutCoordinates);  }  Intrinsics.checkNotNull(SharedBoundsNode.this.getSharedElement().getCurrentBounds()); topLeft = SharedBoundsNode.this.getSharedElement().getCurrentBounds().getTopLeft-F1C5BW0(); }  long l2 = positionInScope.unbox-impl(); int $i$a$-let-SharedBoundsNode$place$1$1 = 0; long l1 = (positionInScope != null) ? Offset.minus-MK-Hz9U(topLeft, l2) : Offset.Companion.getZero-F1C5BW0(); int $i$f$component1-impl = 0; float x = Offset.getX-impl(l1); int $i$f$component2-impl = 0; float y = Offset.getY-impl(l1); float $this$fastRoundToInt$iv = x; int $i$f$fastRoundToInt = 0; $this$fastRoundToInt$iv = y; $i$f$fastRoundToInt = 0;
/* 282 */         Placeable.PlacementScope.place$default($this$layout, this.$placeable, Math.round($this$fastRoundToInt$iv), Math.round($this$fastRoundToInt$iv), 0.0F, 4, null); }  } SharedBoundsNode$place$1(Placeable $placeable) { super(1); } } public boolean isMeasurementApproachInProgress-ozmzZPI(long lookaheadSize) { return (getSharedElement().getFoundMatch() && this.state.getSharedElement().getScope().isTransitionActive()); } @NotNull public MeasureResult approachMeasure-3p2s80s(@NotNull ApproachMeasureScope $this$approachMeasure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) { Intrinsics.checkNotNullParameter($this$approachMeasure_u2d3p2s80s, "$this$approachMeasure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); if (getBoundsAnimation().getValue() == null) getBoundsAnimation().getValue();  Rect it = getSharedElement().getCurrentBounds(); int $i$a$-let-SharedBoundsNode$approachMeasure$resolvedConstraints$1 = 0; long l1 = IntSizeKt.roundToIntSize-uvyYCjk(it.getSize-NH-jbRc()); int $i$f$component1-impl = 0, width = IntSize.getWidth-impl(l1), $i$f$component2-impl = 0, height = 
/*     */ 
/*     */       
/* 285 */       IntSize.getHeight-impl(l1);
/*     */     if (!((width != Integer.MAX_VALUE && height != Integer.MAX_VALUE) ? 1 : 0)) {
/*     */       int $i$a$-require-SharedBoundsNode$approachMeasure$resolvedConstraints$1$1 = 0;
/*     */       String str = "Error: Infinite width/height is invalid. animated bounds: " + getBoundsAnimation().getValue() + ", current bounds: " + getSharedElement().getCurrentBounds();
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     getSharedElement().getCurrentBounds();
/*     */     long resolvedConstraints = !getSharedElement().getFoundMatch() ? constraints : ((getSharedElement().getCurrentBounds() != null) ? Constraints.Companion.fixed-JhjzzOo(RangesKt.coerceAtLeast(width, 0), RangesKt.coerceAtLeast(height, 0)) : constraints);
/*     */     Placeable placeable = measurable.measure-BRTryo0(resolvedConstraints);
/*     */     return place((MeasureScope)$this$approachMeasure_u2d3p2s80s, placeable); }
/*     */ 
/*     */   
/*     */   private final void updateCurrentBounds(LayoutCoordinates $this$updateCurrentBounds) {
/*     */     getSharedElement().setCurrentBounds(RectKt.Rect-tz77jQw(getRootCoords().localPositionOf-R5De75A($this$updateCurrentBounds, Offset.Companion.getZero-F1C5BW0()), SizeKt.Size(IntSize.getWidth-impl($this$updateCurrentBounds.getSize-YbymL2g()), IntSize.getHeight-impl($this$updateCurrentBounds.getSize-YbymL2g()))));
/*     */   }
/*     */   
/*     */   public void draw(@NotNull ContentDrawScope $this$draw) {
/*     */     GraphicsLayer layer;
/*     */     Intrinsics.checkNotNullParameter($this$draw, "<this>");
/*     */     Intrinsics.checkNotNull(getSharedElement().getCurrentBounds());
/*     */     this.state.setClipPathInOverlay$animation(this.state.getOverlayClip().getClipPath(this.state.getUserState(), getSharedElement().getCurrentBounds(), $this$draw.getLayoutDirection(), DelegatableNodeKt.requireDensity((DelegatableNode)this)));
/*     */     if (this.state.getLayer() == null) {
/*     */       this.state.getLayer();
/*     */       int $i$a$-requireNotNull-SharedBoundsNode$draw$layer$1 = 0;
/*     */       String str = "Error: Layer is null when accessed for shared bounds/element : " + getSharedElement().getKey() + ",target: " + this.state.getBoundsAnimation().getTarget() + ", is attached: " + isAttached();
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     DrawScope.record-JVtK1S4$default((DrawScope)$this$draw, layer, 0L, new SharedBoundsNode$draw$1(this), 1, null);
/*     */     if (this.state.getShouldRenderInPlace())
/*     */       GraphicsLayerKt.drawLayer((DrawScope)$this$draw, layer); 
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"})
/*     */   static final class SharedBoundsNode$draw$1 extends Lambda implements Function1<DrawScope, Unit> {
/*     */     public final void invoke(@NotNull DrawScope $this$record) {
/*     */       Intrinsics.checkNotNullParameter($this$record, "$this$record");
/*     */       this.$this_draw.drawContent();
/*     */     }
/*     */     
/*     */     SharedBoundsNode$draw$1(SharedBoundsNode sharedBoundsNode) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SharedBoundsNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */