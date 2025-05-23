/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.runtime.State;
/*     */ import androidx.compose.ui.layout.LayoutModifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.modifier.ModifierLocal;
/*     */ import androidx.compose.ui.modifier.ModifierLocalConsumer;
/*     */ import androidx.compose.ui.modifier.ModifierLocalReadScope;
/*     */ import androidx.compose.ui.platform.InspectorValueInfo;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\0012\0020\0022\0020\003BE\022\006\020\004\032\0020\005\022\027\020\006\032\023\022\004\022\0020\b\022\004\022\0020\t0\007¢\006\002\b\n\022\035\020\013\032\031\022\004\022\0020\005\022\004\022\0020\r\022\004\022\0020\0160\f¢\006\002\b\n¢\006\002\020\017J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\033H\002J\b\020\034\032\0020\016H\026J\020\020\035\032\0020\t2\006\020\036\032\0020\037H\026J&\020 \032\0020!*\0020\"2\006\020#\032\0020$2\006\020%\032\0020&H\026ø\001\000¢\006\004\b'\020(R%\020\013\032\031\022\004\022\0020\005\022\004\022\0020\r\022\004\022\0020\0160\f¢\006\002\b\nX\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R+\020\021\032\0020\0052\006\020\020\032\0020\0058B@BX\002¢\006\022\n\004\b\026\020\027\032\004\b\022\020\023\"\004\b\024\020\025\002\007\n\005\b¡\0360\001¨\006)"}, d2 = {"Landroidx/compose/foundation/layout/DerivedHeightModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "heightCalc", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "(Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "<set-?>", "unconsumedInsets", "getUnconsumedInsets", "()Landroidx/compose/foundation/layout/WindowInsets;", "setUnconsumedInsets", "(Landroidx/compose/foundation/layout/WindowInsets;)V", "unconsumedInsets$delegate", "Landroidx/compose/runtime/MutableState;", "equals", "", "other", "", "hashCode", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ @Stable
/*     */ @SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,214:1\n81#2:215\n107#2,2:216\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/DerivedHeightModifier\n*L\n180#1:215\n180#1:216,2\n*E\n"})
/*     */ final class DerivedHeightModifier
/*     */   extends InspectorValueInfo
/*     */   implements LayoutModifier, ModifierLocalConsumer
/*     */ {
/*     */   @NotNull
/*     */   private final WindowInsets insets;
/*     */   @NotNull
/*     */   private final Function2<WindowInsets, Density, Integer> heightCalc;
/*     */   @NotNull
/*     */   private final MutableState unconsumedInsets$delegate;
/*     */   
/*     */   public DerivedHeightModifier(@NotNull WindowInsets insets, @NotNull Function1 inspectorInfo, @NotNull Function2<WindowInsets, Density, Integer> heightCalc) {
/* 179 */     super(inspectorInfo); this.insets = insets; this.heightCalc = heightCalc;
/* 180 */     this.unconsumedInsets$delegate = SnapshotStateKt.mutableStateOf$default(this.insets, null, 2, null); } private final WindowInsets getUnconsumedInsets() { State state = (State)this.unconsumedInsets$delegate; KProperty property$iv = null; int $i$f$getValue = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 215 */       (WindowInsets)state.getValue(); } private final void setUnconsumedInsets(WindowInsets <set-?>) { MutableState mutableState = this.unconsumedInsets$delegate; KProperty property$iv = null; int $i$f$setValue = 0;
/* 216 */     mutableState.setValue(<set-?>); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/*     */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure");
/*     */     Intrinsics.checkNotNullParameter(measurable, "measurable");
/*     */     int height = ((Number)this.heightCalc.invoke(getUnconsumedInsets(), $this$measure_u2d3p2s80s)).intValue();
/*     */     if (height == 0)
/*     */       return MeasureScope.layout$default($this$measure_u2d3p2s80s, 0, 0, null, DerivedHeightModifier$measure$1.INSTANCE, 4, null); 
/*     */     long childConstraints = Constraints.copy-Zbe2FdA$default(constraints, 0, 0, height, height, 3, null);
/*     */     Placeable placeable = measurable.measure-BRTryo0(childConstraints);
/*     */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), height, null, new DerivedHeightModifier$measure$2(placeable), 4, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class DerivedHeightModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public static final DerivedHeightModifier$measure$1 INSTANCE = new DerivedHeightModifier$measure$1();
/*     */     
/*     */     DerivedHeightModifier$measure$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class DerivedHeightModifier$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       Placeable.PlacementScope.placeRelative$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null);
/*     */     }
/*     */     
/*     */     DerivedHeightModifier$measure$2(Placeable $placeable) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
/*     */     Intrinsics.checkNotNullParameter(scope, "scope");
/*     */     ModifierLocalReadScope $this$onModifierLocalsUpdated_u24lambda_u240 = scope;
/*     */     int $i$a$-with-DerivedHeightModifier$onModifierLocalsUpdated$1 = 0;
/*     */     setUnconsumedInsets(WindowInsetsKt.exclude(this.insets, (WindowInsets)$this$onModifierLocalsUpdated_u24lambda_u240.getCurrent((ModifierLocal)WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets())));
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof DerivedHeightModifier))
/*     */       return false; 
/*     */     return (Intrinsics.areEqual(this.insets, ((DerivedHeightModifier)other).insets) && this.heightCalc == ((DerivedHeightModifier)other).heightCalc);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return 31 * this.insets.hashCode() + this.heightCalc.hashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\DerivedHeightModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */