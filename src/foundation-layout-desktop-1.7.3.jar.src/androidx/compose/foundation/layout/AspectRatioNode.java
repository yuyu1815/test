/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\000\n\002\020\013\n\002\b\n\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\020\b\002\030\0002\0020\0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\020\032\0020\021*\0020\022H\002ø\001\000¢\006\004\b\023\020\024J\034\020\025\032\0020\026*\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\026H\026J\034\020\033\032\0020\026*\0020\0272\006\020\030\032\0020\0312\006\020\034\032\0020\026H\026J&\020\035\032\0020\036*\0020\0372\006\020\030\032\0020 2\006\020!\032\0020\022H\026ø\001\000¢\006\004\b\"\020#J\034\020$\032\0020\026*\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\026H\026J\034\020%\032\0020\026*\0020\0272\006\020\030\032\0020\0312\006\020\034\032\0020\026H\026J \020&\032\0020\021*\0020\0222\b\b\002\020'\032\0020\006H\002ø\001\000¢\006\004\b(\020)J \020*\032\0020\021*\0020\0222\b\b\002\020'\032\0020\006H\002ø\001\000¢\006\004\b+\020)J \020,\032\0020\021*\0020\0222\b\b\002\020'\032\0020\006H\002ø\001\000¢\006\004\b-\020)J \020.\032\0020\021*\0020\0222\b\b\002\020'\032\0020\006H\002ø\001\000¢\006\004\b/\020)R\032\020\003\032\0020\004X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017\002\007\n\005\b¡\0360\001¨\0060"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "(FZ)V", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "getMatchHeightConstraintsFirst", "()Z", "setMatchHeightConstraintsFirst", "(Z)V", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,236:1\n26#2:237\n26#2:238\n26#2:239\n26#2:240\n26#2:242\n26#2:243\n26#2:244\n26#2:245\n1#3:241\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioNode\n*L\n129#1:237\n138#1:238\n147#1:239\n156#1:240\n187#1:242\n201#1:243\n214#1:244\n226#1:245\n*E\n"})
/*     */ final class AspectRatioNode
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   private float aspectRatio;
/*     */   private boolean matchHeightConstraintsFirst;
/*     */   
/*     */   public final float getAspectRatio() {
/* 106 */     return this.aspectRatio; } public final void setAspectRatio(float <set-?>) { this.aspectRatio = <set-?>; }
/* 107 */   public final boolean getMatchHeightConstraintsFirst() { return this.matchHeightConstraintsFirst; } public final void setMatchHeightConstraintsFirst(boolean <set-?>) { this.matchHeightConstraintsFirst = <set-?>; } public AspectRatioNode(float aspectRatio, boolean matchHeightConstraintsFirst) { this.aspectRatio = aspectRatio; this.matchHeightConstraintsFirst = matchHeightConstraintsFirst; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/* 113 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long size = findSize-ToXhtMw(constraints);
/* 114 */     long wrappedConstraints = !IntSize.equals-impl0(size, IntSize.Companion.getZero-YbymL2g()) ? 
/* 115 */       Constraints.Companion.fixed-JhjzzOo(IntSize.getWidth-impl(size), IntSize.getHeight-impl(size)) : 
/*     */       
/* 117 */       constraints;
/*     */     
/* 119 */     Placeable placeable = measurable.measure-BRTryo0(wrappedConstraints);
/* 120 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new AspectRatioNode$measure$1(placeable), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 121 */   static final class AspectRatioNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.placeRelative$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null); }
/*     */     
/*     */     AspectRatioNode$measure$1(Placeable $placeable) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/* 128 */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) { Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable");
/* 129 */     float $this$fastRoundToInt$iv = height * this.aspectRatio; int $i$f$fastRoundToInt = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 237 */     return (height != Integer.MAX_VALUE) ? Math.round($this$fastRoundToInt$iv) : measurable.minIntrinsicWidth(height); } public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) { Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); float $this$fastRoundToInt$iv = height * this.aspectRatio; int $i$f$fastRoundToInt = 0;
/* 238 */     return (height != Integer.MAX_VALUE) ? Math.round($this$fastRoundToInt$iv) : measurable.maxIntrinsicWidth(height); } public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) { Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); float $this$fastRoundToInt$iv = width / this.aspectRatio; int $i$f$fastRoundToInt = 0;
/* 239 */     return (width != Integer.MAX_VALUE) ? Math.round($this$fastRoundToInt$iv) : measurable.minIntrinsicHeight(width); } public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) { Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); float $this$fastRoundToInt$iv = width / this.aspectRatio; int $i$f$fastRoundToInt = 0;
/* 240 */     return (width != Integer.MAX_VALUE) ? Math.round($this$fastRoundToInt$iv) : measurable.maxIntrinsicHeight(width); } private final long findSize-ToXhtMw(long $this$findSize_u2dToXhtMw) { if (!this.matchHeightConstraintsFirst)
/* 241 */     { long l1 = tryMaxWidth-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null), it = l1; int $i$a$-also-AspectRatioNode$findSize$1 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxHeight-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$2 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinWidth-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$3 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinHeight-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$4 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxWidth-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$5 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxHeight-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$6 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinWidth-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$7 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinHeight-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$8 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  } else { long l1 = tryMaxHeight-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null), it = l1; int $i$a$-also-AspectRatioNode$findSize$9 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxWidth-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$10 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinHeight-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$11 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinWidth-JN-0ABg$default(this, $this$findSize_u2dToXhtMw, false, 1, null); int $i$a$-also-AspectRatioNode$findSize$12 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxHeight-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$13 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMaxWidth-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$14 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinHeight-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$15 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g())) return it;  it = l1 = tryMinWidth-JN-0ABg($this$findSize_u2dToXhtMw, false); int $i$a$-also-AspectRatioNode$findSize$16 = 0; if (!IntSize.equals-impl0(it, IntSize.Companion.getZero-YbymL2g()))
/* 242 */         return it;  }  return IntSize.Companion.getZero-YbymL2g(); } private final long tryMaxWidth-JN-0ABg(long $this$tryMaxWidth_u2dJN_u2d0ABg, boolean enforceConstraints) { int maxWidth = Constraints.getMaxWidth-impl($this$tryMaxWidth_u2dJN_u2d0ABg); if (maxWidth != Integer.MAX_VALUE) { float $this$fastRoundToInt$iv = maxWidth / this.aspectRatio; int $i$f$fastRoundToInt = 0, height = Math.round($this$fastRoundToInt$iv); if (height > 0) { long size = IntSizeKt.IntSize(maxWidth, height); if (!enforceConstraints || ConstraintsKt.isSatisfiedBy-4WqzIAM($this$tryMaxWidth_u2dJN_u2d0ABg, size))
/* 243 */           return size;  }  }  return IntSize.Companion.getZero-YbymL2g(); } private final long tryMaxHeight-JN-0ABg(long $this$tryMaxHeight_u2dJN_u2d0ABg, boolean enforceConstraints) { int maxHeight = Constraints.getMaxHeight-impl($this$tryMaxHeight_u2dJN_u2d0ABg); if (maxHeight != Integer.MAX_VALUE) { float $this$fastRoundToInt$iv = maxHeight * this.aspectRatio; int $i$f$fastRoundToInt = 0, width = Math.round($this$fastRoundToInt$iv); if (width > 0) { long size = IntSizeKt.IntSize(width, maxHeight); if (!enforceConstraints || ConstraintsKt.isSatisfiedBy-4WqzIAM($this$tryMaxHeight_u2dJN_u2d0ABg, size))
/* 244 */           return size;  }  }  return IntSize.Companion.getZero-YbymL2g(); } private final long tryMinWidth-JN-0ABg(long $this$tryMinWidth_u2dJN_u2d0ABg, boolean enforceConstraints) { int minWidth = Constraints.getMinWidth-impl($this$tryMinWidth_u2dJN_u2d0ABg); float $this$fastRoundToInt$iv = minWidth / this.aspectRatio; int $i$f$fastRoundToInt = 0, height = Math.round($this$fastRoundToInt$iv); if (height > 0) { long size = IntSizeKt.IntSize(minWidth, height); if (!enforceConstraints || ConstraintsKt.isSatisfiedBy-4WqzIAM($this$tryMinWidth_u2dJN_u2d0ABg, size))
/* 245 */         return size;  }  return IntSize.Companion.getZero-YbymL2g(); } private final long tryMinHeight-JN-0ABg(long $this$tryMinHeight_u2dJN_u2d0ABg, boolean enforceConstraints) { int minHeight = Constraints.getMinHeight-impl($this$tryMinHeight_u2dJN_u2d0ABg); float $this$fastRoundToInt$iv = minHeight * this.aspectRatio; int $i$f$fastRoundToInt = 0, width = Math.round($this$fastRoundToInt$iv);
/*     */     if (width > 0) {
/*     */       long size = IntSizeKt.IntSize(width, minHeight);
/*     */       if (!enforceConstraints || ConstraintsKt.isSatisfiedBy-4WqzIAM($this$tryMinHeight_u2dJN_u2d0ABg, size))
/*     */         return size; 
/*     */     } 
/*     */     return IntSize.Companion.getZero-YbymL2g(); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\AspectRatioNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */