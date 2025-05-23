/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\022\b\007\030\0002\0020\001B]\b\000\022\016\020\002\032\n\022\006\022\004\030\0010\0010\003\022\b\020\004\032\004\030\0010\001\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\032\020\013\032\026\022\022\022\020\022\004\022\0020\016\022\006\022\004\030\0010\0010\r0\f\022\006\020\017\032\0020\020¢\006\002\020\021R\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\024\020\025R\034\020\002\032\n\022\006\022\004\030\0010\0010\003X\004¢\006\b\n\000\032\004\b\026\020\027R.\020\013\032\026\022\022\022\020\022\004\022\0020\016\022\006\022\004\030\0010\0010\r0\fX\016¢\006\016\n\000\032\004\b\030\020\031\"\004\b\032\020\033R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\034\020\035R\026\020\004\032\004\030\0010\001X\004¢\006\b\n\000\032\004\b\036\020\037R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b \020!¨\006\""}, d2 = {"Landroidx/compose/runtime/MovableContentStateReference;", "", "content", "Landroidx/compose/runtime/MovableContent;", "parameter", "composition", "Landroidx/compose/runtime/ControlledComposition;", "slotTable", "Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "invalidations", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "locals", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;Ljava/util/List;Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "getAnchor$runtime", "()Landroidx/compose/runtime/Anchor;", "getComposition$runtime", "()Landroidx/compose/runtime/ControlledComposition;", "getContent$runtime", "()Landroidx/compose/runtime/MovableContent;", "getInvalidations$runtime", "()Ljava/util/List;", "setInvalidations$runtime", "(Ljava/util/List;)V", "getLocals$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getParameter$runtime", "()Ljava/lang/Object;", "getSlotTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "runtime"})
/*     */ @InternalComposeApi
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class MovableContentStateReference
/*     */ {
/*     */   @NotNull
/*     */   private final MovableContent<Object> content;
/*     */   @Nullable
/*     */   private final Object parameter;
/*     */   @NotNull
/*     */   private final ControlledComposition composition;
/*     */   @NotNull
/*     */   private final SlotTable slotTable;
/*     */   @NotNull
/*     */   private final Anchor anchor;
/*     */   @NotNull
/*     */   private List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations;
/*     */   @NotNull
/*     */   private final PersistentCompositionLocalMap locals;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public MovableContentStateReference(@NotNull MovableContent<Object> content, @Nullable Object parameter, @NotNull ControlledComposition composition, @NotNull SlotTable slotTable, @NotNull Anchor anchor, @NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> invalidations, @NotNull PersistentCompositionLocalMap locals) {
/* 385 */     this.content = content;
/* 386 */     this.parameter = parameter;
/* 387 */     this.composition = composition;
/* 388 */     this.slotTable = slotTable;
/* 389 */     this.anchor = anchor;
/* 390 */     this.invalidations = invalidations;
/* 391 */     this.locals = locals; } @NotNull public final PersistentCompositionLocalMap getLocals$runtime() { return this.locals; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final MovableContent<Object> getContent$runtime() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getParameter$runtime() {
/*     */     return this.parameter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ControlledComposition getComposition$runtime() {
/*     */     return this.composition;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final SlotTable getSlotTable$runtime() {
/*     */     return this.slotTable;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Anchor getAnchor$runtime() {
/*     */     return this.anchor;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Pair<RecomposeScopeImpl, Object>> getInvalidations$runtime() {
/*     */     return (List)this.invalidations;
/*     */   }
/*     */   
/*     */   public final void setInvalidations$runtime(@NotNull List<? extends Pair<RecomposeScopeImpl, ? extends Object>> <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.invalidations = <set-?>;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MovableContentStateReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */