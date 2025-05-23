/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\002\030\002\n\002\020\006\n\000\n\002\030\002\n\002\020\007\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\020\t\n\000\032\022\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\007\032\022\020\004\032\0020\005*\b\022\004\022\0020\0060\002H\007\032\022\020\007\032\0020\b*\b\022\004\022\0020\t0\002H\007\032\022\020\n\032\0020\013*\b\022\004\022\0020\f0\002H\007¨\006\r"}, d2 = {"asDoubleState", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asIntState", "Landroidx/compose/runtime/IntState;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "runtime"})
/*     */ public final class SnapshotStateExtensionsKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntState asIntState(@NotNull State<Integer> $this$asIntState) {
/*  31 */     Intrinsics.checkNotNullParameter($this$asIntState, "<this>"); return ($this$asIntState instanceof IntState) ? (IntState)$this$asIntState : new UnboxedIntState($this$asIntState);
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final LongState asLongState(@NotNull State<Long> $this$asLongState) {
/*  57 */     Intrinsics.checkNotNullParameter($this$asLongState, "<this>"); return ($this$asLongState instanceof LongState) ? (LongState)$this$asLongState : new UnboxedLongState($this$asLongState);
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final FloatState asFloatState(@NotNull State<Float> $this$asFloatState) {
/*  83 */     Intrinsics.checkNotNullParameter($this$asFloatState, "<this>"); return ($this$asFloatState instanceof FloatState) ? (FloatState)$this$asFloatState : new UnboxedFloatState($this$asFloatState);
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final DoubleState asDoubleState(@NotNull State<Double> $this$asDoubleState) {
/* 109 */     Intrinsics.checkNotNullParameter($this$asDoubleState, "<this>"); return ($this$asDoubleState instanceof DoubleState) ? (DoubleState)$this$asDoubleState : new UnboxedDoubleState($this$asDoubleState);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SnapshotStateExtensionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */