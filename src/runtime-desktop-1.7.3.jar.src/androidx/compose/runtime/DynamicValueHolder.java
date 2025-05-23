/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0000\004¢\006\002\020\005J\017\020\b\032\b\022\004\022\0028\0000\004HÆ\003J\037\020\t\032\b\022\004\022\0028\0000\0002\016\b\002\020\003\032\b\022\004\022\0028\0000\004HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\025\020\020\032\0028\0002\006\020\021\032\0020\022H\026¢\006\002\020\023J\034\020\024\032\b\022\004\022\0028\0000\0252\f\020\026\032\b\022\004\022\0028\0000\027H\026J\t\020\030\032\0020\031HÖ\001R\027\020\003\032\b\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\006\020\007¨\006\032"}, d2 = {"Landroidx/compose/runtime/DynamicValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "state", "Landroidx/compose/runtime/MutableState;", "(Landroidx/compose/runtime/MutableState;)V", "getState", "()Landroidx/compose/runtime/MutableState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 2)
/*    */ public final class DynamicValueHolder<T>
/*    */   implements ValueHolder<T>
/*    */ {
/*    */   @NotNull
/*    */   private final MutableState<T> state;
/*    */   public static final int $stable;
/*    */   
/*    */   public DynamicValueHolder(@NotNull MutableState<T> state) {
/* 70 */     this.state = state; } @NotNull public final MutableState<T> getState() { return this.state; }
/* 71 */   public T readValue(@NotNull PersistentCompositionLocalMap map) { Intrinsics.checkNotNullParameter(map, "map"); return this.state.getValue(); } @NotNull
/*    */   public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
/* 73 */     Intrinsics.checkNotNullParameter(local, "local"); return new ProvidedValue<>(
/* 74 */         local, 
/* 75 */         null, 
/* 76 */         false, 
/* 77 */         null, 
/* 78 */         this.state, 
/* 79 */         null, 
/* 80 */         true);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MutableState<T> component1() {
/*    */     return this.state;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DynamicValueHolder<T> copy(@NotNull MutableState<T> state) {
/*    */     Intrinsics.checkNotNullParameter(state, "state");
/*    */     return new DynamicValueHolder(state);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DynamicValueHolder(state=" + this.state + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.state.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DynamicValueHolder))
/*    */       return false; 
/*    */     DynamicValueHolder dynamicValueHolder = (DynamicValueHolder)other;
/*    */     return !!Intrinsics.areEqual(this.state, dynamicValueHolder.state);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DynamicValueHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */