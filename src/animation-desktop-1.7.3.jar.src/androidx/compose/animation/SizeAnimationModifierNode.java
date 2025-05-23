/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.animation.core.Animatable;
/*     */ import androidx.compose.animation.core.AnimationSpec;
/*     */ import androidx.compose.animation.core.AnimationVector2D;
/*     */ import androidx.compose.animation.core.VectorConvertersKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\013\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\002\030\0002\0020\001:\001>BY\022\f\020\002\032\b\022\004\022\0020\0040\003\022\b\b\002\020\005\032\0020\006\022:\b\002\020\007\0324\022\023\022\0210\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\023\022\0210\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\f\022\004\022\0020\r\030\0010\b¢\006\002\020\016J\030\020-\032\0020\0042\006\020.\032\0020\004ø\001\000¢\006\004\b/\0200J\b\0201\032\0020\rH\026J\b\0202\032\0020\rH\026J\032\0203\032\0020%2\006\0204\032\0020%H\002ø\001\000¢\006\004\b5\0200J&\0206\032\00207*\002082\006\0209\032\0020:2\006\020;\032\0020%H\026ø\001\000¢\006\004\b<\020=R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R/\020\025\032\004\030\0010\0242\b\020\023\032\004\030\0010\0248F@FX\002¢\006\022\n\004\b\032\020\033\032\004\b\026\020\027\"\004\b\030\020\031R \020\002\032\b\022\004\022\0020\0040\003X\016¢\006\016\n\000\032\004\b\034\020\035\"\004\b\036\020\037RL\020\007\0324\022\023\022\0210\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\013\022\023\022\0210\004¢\006\f\b\t\022\b\b\n\022\004\b\b(\f\022\004\022\0020\r\030\0010\bX\016¢\006\016\n\000\032\004\b \020!\"\004\b\"\020#R&\020&\032\0020%2\006\020$\032\0020%@BX\016ø\001\000ø\001\001¢\006\n\n\002\020)\"\004\b'\020(R\016\020*\032\0020+X\016¢\006\002\n\000R\026\020,\032\0020\004X\016ø\001\000ø\001\001¢\006\004\n\002\020)\002\013\n\005\b¡\0360\001\n\002\b!¨\006?"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode;", "Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "alignment", "Landroidx/compose/ui/Alignment;", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startSize", "endSize", "", "(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function2;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "<set-?>", "Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "animData", "getAnimData", "()Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "setAnimData", "(Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;)V", "animData$delegate", "Landroidx/compose/runtime/MutableState;", "getAnimationSpec", "()Landroidx/compose/animation/core/AnimationSpec;", "setAnimationSpec", "(Landroidx/compose/animation/core/AnimationSpec;)V", "getListener", "()Lkotlin/jvm/functions/Function2;", "setListener", "(Lkotlin/jvm/functions/Function2;)V", "value", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "setLookaheadConstraints-BRTryo0", "(J)V", "J", "lookaheadConstraintsAvailable", "", "lookaheadSize", "animateTo", "targetSize", "animateTo-mzRDjE0", "(J)J", "onAttach", "onReset", "targetConstraints", "default", "targetConstraints-ZezNO4M", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "AnimData", "animation"})
/*     */ @SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,290:1\n81#2:291\n107#2,2:292\n56#3,4:294\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifierNode\n*L\n170#1:291\n170#1:292,2\n198#1:294,4\n*E\n"})
/*     */ final class SizeAnimationModifierNode
/*     */   extends LayoutModifierNodeWithPassThroughIntrinsics
/*     */ {
/*     */   @NotNull
/*     */   private AnimationSpec<IntSize> animationSpec;
/*     */   @NotNull
/*     */   private Alignment alignment;
/*     */   @Nullable
/*     */   private Function2<? super IntSize, ? super IntSize, Unit> listener;
/*     */   private long lookaheadSize;
/*     */   private long lookaheadConstraints;
/*     */   private boolean lookaheadConstraintsAvailable;
/*     */   @NotNull
/*     */   private final MutableState animData$delegate;
/*     */   
/*     */   @NotNull
/*     */   public final AnimationSpec<IntSize> getAnimationSpec() {
/* 146 */     return this.animationSpec; } public final void setAnimationSpec(@NotNull AnimationSpec<IntSize> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.animationSpec = <set-?>; } @NotNull
/* 147 */   public final Alignment getAlignment() { return this.alignment; } public final void setAlignment(@NotNull Alignment <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.alignment = <set-?>; } @Nullable
/* 148 */   public final Function2<IntSize, IntSize, Unit> getListener() { return (Function2)this.listener; } public final void setListener(@Nullable Function2<? super IntSize, ? super IntSize, Unit> <set-?>) { this.listener = <set-?>; } public SizeAnimationModifierNode(@NotNull AnimationSpec<IntSize> animationSpec, @NotNull Alignment alignment, @Nullable Function2<? super IntSize, ? super IntSize, Unit> listener) { this.animationSpec = animationSpec; this.alignment = alignment; this.listener = listener;
/*     */     
/* 150 */     this.lookaheadSize = AnimationModifierKt.getInvalidSize();
/* 151 */     this.lookaheadConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 170 */     this.animData$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null); } private final void setLookaheadConstraints-BRTryo0(long value) { this.lookaheadConstraints = value; this.lookaheadConstraintsAvailable = true; } private final long targetConstraints-ZezNO4M(long default) { return this.lookaheadConstraintsAvailable ? this.lookaheadConstraints : default; } @Nullable public final AnimData getAnimData() { State state = (State)this.animData$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 291 */       (AnimData)state.getValue(); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B!\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\006\020\006\032\0020\004¢\006\002\020\007J\025\020\017\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\026\020\020\032\0020\004HÆ\003ø\001\001ø\001\000¢\006\004\b\021\020\013J3\020\022\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\b\b\002\020\006\032\0020\004HÆ\001ø\001\000¢\006\004\b\023\020\024J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\031HÖ\001J\t\020\032\032\0020\033HÖ\001R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\b\020\tR\"\020\006\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\016\032\004\b\n\020\013\"\004\b\f\020\r\002\013\n\005\b¡\0360\001\n\002\b!¨\006\034"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "", "anim", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "startSize", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "getStartSize-YbymL2g", "()J", "setStartSize-ozmzZPI", "(J)V", "J", "component1", "component2", "component2-YbymL2g", "copy", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;", "equals", "", "other", "hashCode", "", "toString", "", "animation"}) @StabilityInferred(parameters = 0) public static final class AnimData {
/* 292 */     @NotNull private final Animatable<IntSize, AnimationVector2D> anim; private long startSize; public static final int $stable = 8; private AnimData(Animatable<IntSize, AnimationVector2D> anim, long startSize) { this.anim = anim; this.startSize = startSize; } @NotNull public final Animatable<IntSize, AnimationVector2D> getAnim() { return this.anim; } public final long getStartSize-YbymL2g() { return this.startSize; } public final void setStartSize-ozmzZPI(long <set-?>) { this.startSize = <set-?>; } @NotNull public final Animatable<IntSize, AnimationVector2D> component1() { return this.anim; } public final long component2-YbymL2g() { return this.startSize; } @NotNull public final AnimData copy-O0kMr_c(@NotNull Animatable anim, long startSize) { Intrinsics.checkNotNullParameter(anim, "anim"); return new AnimData(anim, startSize, null); } @NotNull public String toString() { return "AnimData(anim=" + this.anim + ", startSize=" + IntSize.toString-impl(this.startSize) + ')'; } public int hashCode() { result = this.anim.hashCode(); return result * 31 + IntSize.hashCode-impl(this.startSize); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof AnimData)) return false;  AnimData animData = (AnimData)other; return !Intrinsics.areEqual(this.anim, animData.anim) ? false : (!!IntSize.equals-impl0(this.startSize, animData.startSize)); } } public final void setAnimData(@Nullable AnimData <set-?>) { MutableState mutableState = this.animData$delegate; KProperty property$iv = null; int $i$f$setValue = 0; mutableState.setValue(<set-?>); } public void onReset() { super.onReset(); setAnimData(null); }
/*     */   public void onAttach() { super.onAttach(); this.lookaheadSize = AnimationModifierKt.getInvalidSize(); this.lookaheadConstraintsAvailable = false; }
/* 294 */   @NotNull public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) { Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); setLookaheadConstraints-BRTryo0(constraints); Placeable placeable = $this$measure_u2d3p2s80s.isLookingAhead() ? measurable.measure-BRTryo0(constraints) : measurable.measure-BRTryo0(targetConstraints-ZezNO4M(constraints)); long measuredSize = IntSizeKt.IntSize(placeable.getWidth(), placeable.getHeight()); this.lookaheadSize = measuredSize; long it = animateTo-mzRDjE0(AnimationModifierKt.isValid-ozmzZPI(this.lookaheadSize) ? this.lookaheadSize : measuredSize); int $i$a$-let-SizeAnimationModifierNode$measure$1 = 0; long l1 = $this$measure_u2d3p2s80s.isLookingAhead() ? measuredSize : ConstraintsKt.constrain-4WqzIAM(constraints, it); int $i$f$component1-impl = 0, width = IntSize.getWidth-impl(l1), $i$f$component2-impl = 0, height = 
/*     */ 
/*     */       
/* 297 */       IntSize.getHeight-impl(l1);
/*     */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new SizeAnimationModifierNode$measure$2(measuredSize, width, height, $this$measure_u2d3p2s80s, placeable), 4, null); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class SizeAnimationModifierNode$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       long offset = SizeAnimationModifierNode.this.getAlignment().align-KFBX0sM(this.$measuredSize, IntSizeKt.IntSize(this.$width, this.$height), this.$this_measure.getLayoutDirection());
/*     */       Placeable.PlacementScope.place-70tqf50$default($this$layout, this.$placeable, offset, 0.0F, 2, null);
/*     */     }
/*     */     
/*     */     SizeAnimationModifierNode$measure$2(long $measuredSize, int $width, int $height, MeasureScope measureScope, Placeable $placeable) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public final long animateTo-mzRDjE0(long targetSize) {
/*     */     AnimData animData1 = getAnimData(), $this$animateTo_mzRDjE0_u24lambda_u241 = animData1;
/*     */     int $i$a$-apply-SizeAnimationModifierNode$animateTo$data$1 = 0;
/*     */     boolean wasInterrupted = (!IntSize.equals-impl0(targetSize, ((IntSize)$this$animateTo_mzRDjE0_u24lambda_u241.getAnim().getValue()).unbox-impl()) && !$this$animateTo_mzRDjE0_u24lambda_u241.getAnim().isRunning());
/*     */     if (!IntSize.equals-impl0(targetSize, ((IntSize)$this$animateTo_mzRDjE0_u24lambda_u241.getAnim().getTargetValue()).unbox-impl()) || wasInterrupted) {
/*     */       $this$animateTo_mzRDjE0_u24lambda_u241.setStartSize-ozmzZPI(((IntSize)$this$animateTo_mzRDjE0_u24lambda_u241.getAnim().getValue()).unbox-impl());
/*     */       BuildersKt.launch$default(getCoroutineScope(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(targetSize, this, null), 3, null);
/*     */     } 
/*     */     getAnimData();
/*     */     AnimData data = (getAnimData() != null) ? animData1 : new AnimData(new Animatable(IntSize.box-impl(targetSize), VectorConvertersKt.getVectorConverter(IntSize.Companion), IntSize.box-impl(IntSizeKt.IntSize(1, 1)), null, 8, null), targetSize, null);
/*     */     setAnimData(data);
/*     */     return ((IntSize)data.getAnim().getValue()).unbox-impl();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AnimationModifier.kt", l = {228}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     SizeAnimationModifierNode$animateTo$data$1$1(long $targetSize, SizeAnimationModifierNode sizeAnimationModifierNode, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 142, 0 -> 32, 1 -> 81
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $this_apply : Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;
/*     */       //   40: invokevirtual getAnim : ()Landroidx/compose/animation/core/Animatable;
/*     */       //   43: aload_0
/*     */       //   44: getfield $targetSize : J
/*     */       //   47: invokestatic box-impl : (J)Landroidx/compose/ui/unit/IntSize;
/*     */       //   50: aload_0
/*     */       //   51: getfield this$0 : Landroidx/compose/animation/SizeAnimationModifierNode;
/*     */       //   54: invokevirtual getAnimationSpec : ()Landroidx/compose/animation/core/AnimationSpec;
/*     */       //   57: aconst_null
/*     */       //   58: aconst_null
/*     */       //   59: aload_0
/*     */       //   60: checkcast kotlin/coroutines/Continuation
/*     */       //   63: bipush #12
/*     */       //   65: aconst_null
/*     */       //   66: aload_0
/*     */       //   67: iconst_1
/*     */       //   68: putfield label : I
/*     */       //   71: invokestatic animateTo$default : (Landroidx/compose/animation/core/Animatable;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   74: dup
/*     */       //   75: aload_3
/*     */       //   76: if_acmpne -> 86
/*     */       //   79: aload_3
/*     */       //   80: areturn
/*     */       //   81: aload_1
/*     */       //   82: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   85: aload_1
/*     */       //   86: checkcast androidx/compose/animation/core/AnimationResult
/*     */       //   89: astore_2
/*     */       //   90: aload_2
/*     */       //   91: invokevirtual getEndReason : ()Landroidx/compose/animation/core/AnimationEndReason;
/*     */       //   94: getstatic androidx/compose/animation/core/AnimationEndReason.Finished : Landroidx/compose/animation/core/AnimationEndReason;
/*     */       //   97: if_acmpne -> 138
/*     */       //   100: aload_0
/*     */       //   101: getfield this$0 : Landroidx/compose/animation/SizeAnimationModifierNode;
/*     */       //   104: invokevirtual getListener : ()Lkotlin/jvm/functions/Function2;
/*     */       //   107: dup
/*     */       //   108: ifnull -> 137
/*     */       //   111: aload_0
/*     */       //   112: getfield $this_apply : Landroidx/compose/animation/SizeAnimationModifierNode$AnimData;
/*     */       //   115: invokevirtual getStartSize-YbymL2g : ()J
/*     */       //   118: invokestatic box-impl : (J)Landroidx/compose/ui/unit/IntSize;
/*     */       //   121: aload_2
/*     */       //   122: invokevirtual getEndState : ()Landroidx/compose/animation/core/AnimationState;
/*     */       //   125: invokevirtual getValue : ()Ljava/lang/Object;
/*     */       //   128: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   133: pop
/*     */       //   134: goto -> 138
/*     */       //   137: pop
/*     */       //   138: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   141: areturn
/*     */       //   142: new java/lang/IllegalStateException
/*     */       //   145: dup
/*     */       //   146: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   148: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   151: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #227	-> 3
/*     */       //   #228	-> 36
/*     */       //   #227	-> 79
/*     */       //   #229	-> 90
/*     */       //   #230	-> 100
/*     */       //   #232	-> 138
/*     */       //   #227	-> 142
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   90	47	2	result	Landroidx/compose/animation/core/AnimationResult;
/*     */       //   36	106	0	this	Landroidx/compose/animation/SizeAnimationModifierNode$animateTo$data$1$1;
/*     */       //   36	106	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super SizeAnimationModifierNode$animateTo$data$1$1> $completion) {
/*     */       return (Continuation<Unit>)new SizeAnimationModifierNode$animateTo$data$1$1(this.$targetSize, SizeAnimationModifierNode.this, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((SizeAnimationModifierNode$animateTo$data$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SizeAnimationModifierNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */