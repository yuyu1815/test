/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.layout.LayoutModifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalConsumer;
/*     */ import androidx.compose.ui.modifier.ModifierLocalProvider;
/*     */ import androidx.compose.ui.modifier.ModifierLocalReadScope;
/*     */ import androidx.compose.ui.modifier.ProvidableModifierLocal;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\000\030\0002\0020\0012\0020\0022\b\022\004\022\0020\0040\003B\r\022\006\020\005\032\0020\004¢\006\002\020\006J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033H\002J\b\020\034\032\0020\035H\026J\020\020\036\032\0020\0372\006\020 \032\0020!H\026J&\020\"\032\0020#*\0020$2\006\020%\032\0020&2\006\020'\032\0020(H\026ø\001\000¢\006\004\b)\020*R+\020\b\032\0020\0042\006\020\007\032\0020\0048B@BX\002¢\006\022\n\004\b\f\020\r\032\004\b\t\020\n\"\004\b\013\020\006R\016\020\005\032\0020\004X\004¢\006\002\n\000R\032\020\016\032\b\022\004\022\0020\0040\0178VX\004¢\006\006\032\004\b\020\020\021R+\020\022\032\0020\0042\006\020\007\032\0020\0048B@BX\002¢\006\022\n\004\b\025\020\r\032\004\b\023\020\n\"\004\b\024\020\006R\024\020\026\032\0020\0048VX\004¢\006\006\032\004\b\027\020\n\002\007\n\005\b¡\0360\001¨\006+"}, d2 = {"Landroidx/compose/foundation/layout/InsetsPaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/foundation/layout/WindowInsets;", "insets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "<set-?>", "consumedInsets", "getConsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setConsumedInsets", "consumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "unconsumedInsets", "getUnconsumedInsets", "setUnconsumedInsets", "unconsumedInsets$delegate", "value", "getValue", "equals", "", "other", "", "hashCode", "", "onModifierLocalsUpdated", "", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,490:1\n81#2:491\n107#2,2:492\n81#2:494\n107#2,2:495\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/InsetsPaddingModifier\n*L\n343#1:491\n343#1:492,2\n344#1:494\n344#1:495,2\n*E\n"})
/*     */ public final class InsetsPaddingModifier
/*     */   implements LayoutModifier, ModifierLocalConsumer, ModifierLocalProvider<WindowInsets>
/*     */ {
/*     */   @NotNull
/*     */   private final WindowInsets insets;
/*     */   @NotNull
/*     */   private final MutableState unconsumedInsets$delegate;
/*     */   @NotNull
/*     */   private final MutableState consumedInsets$delegate;
/*     */   public static final int $stable;
/*     */   
/*     */   public InsetsPaddingModifier(@NotNull WindowInsets insets) {
/* 340 */     this.insets = insets;
/*     */ 
/*     */     
/* 343 */     this.unconsumedInsets$delegate = SnapshotStateKt.mutableStateOf$default(this.insets, null, 2, null);
/* 344 */     this.consumedInsets$delegate = SnapshotStateKt.mutableStateOf$default(this.insets, null, 2, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final WindowInsets getUnconsumedInsets() {
/*     */     State state = (State)this.unconsumedInsets$delegate;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 491 */     return (WindowInsets)state.getValue(); } private final void setUnconsumedInsets(WindowInsets <set-?>) { MutableState mutableState = this.unconsumedInsets$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 492 */     mutableState.setValue(<set-?>); } private final WindowInsets getConsumedInsets() { State state = (State)this.consumedInsets$delegate; KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 494 */     return (WindowInsets)state.getValue(); } private final void setConsumedInsets(WindowInsets <set-?>) { MutableState mutableState = this.consumedInsets$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 495 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/*     */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure");
/*     */     Intrinsics.checkNotNullParameter(measurable, "measurable");
/*     */     int left = getUnconsumedInsets().getLeft((Density)$this$measure_u2d3p2s80s, $this$measure_u2d3p2s80s.getLayoutDirection());
/*     */     int top = getUnconsumedInsets().getTop((Density)$this$measure_u2d3p2s80s);
/*     */     int right = getUnconsumedInsets().getRight((Density)$this$measure_u2d3p2s80s, $this$measure_u2d3p2s80s.getLayoutDirection());
/*     */     int bottom = getUnconsumedInsets().getBottom((Density)$this$measure_u2d3p2s80s);
/*     */     int horizontal = left + right;
/*     */     int vertical = top + bottom;
/*     */     long childConstraints = ConstraintsKt.offset-NN6Ew-U(constraints, -horizontal, -vertical);
/*     */     Placeable placeable = measurable.measure-BRTryo0(childConstraints);
/*     */     int width = ConstraintsKt.constrainWidth-K40F9xA(constraints, placeable.getWidth() + horizontal);
/*     */     int height = ConstraintsKt.constrainHeight-K40F9xA(constraints, placeable.getHeight() + vertical);
/*     */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, width, height, null, new InsetsPaddingModifier$measure$1(placeable, left, top), 4, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class InsetsPaddingModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable.PlacementScope.place$default($this$layout, this.$placeable, this.$left, this.$top, 0.0F, 4, null);
/*     */     }
/*     */     
/*     */     InsetsPaddingModifier$measure$1(Placeable $placeable, int $left, int $top) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
/*     */     Intrinsics.checkNotNullParameter(scope, "scope");
/*     */     ModifierLocalReadScope $this$onModifierLocalsUpdated_u24lambda_u240 = scope;
/*     */     int $i$a$-with-InsetsPaddingModifier$onModifierLocalsUpdated$1 = 0;
/*     */     WindowInsets consumed = (WindowInsets)$this$onModifierLocalsUpdated_u24lambda_u240.getCurrent((ModifierLocal)WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
/*     */     setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, consumed));
/*     */     setConsumedInsets(WindowInsetsKt.union(consumed, this.insets));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ProvidableModifierLocal<WindowInsets> getKey() {
/*     */     return WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public WindowInsets getValue() {
/*     */     return getConsumedInsets();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof InsetsPaddingModifier))
/*     */       return false; 
/*     */     return Intrinsics.areEqual(((InsetsPaddingModifier)other).insets, this.insets);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return this.insets.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\InsetsPaddingModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */