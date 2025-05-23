/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\036\022\027\020\003\032\023\022\004\022\0020\005\022\004\022\0028\0000\004¢\006\002\b\006¢\006\002\020\007J\032\020\n\032\023\022\004\022\0020\005\022\004\022\0028\0000\004¢\006\002\b\006HÆ\003J*\020\013\032\b\022\004\022\0028\0000\0002\031\b\002\020\003\032\023\022\004\022\0020\005\022\004\022\0028\0000\004¢\006\002\b\006HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\025\020\022\032\0028\0002\006\020\023\032\0020\024H\026¢\006\002\020\025J\034\020\026\032\b\022\004\022\0028\0000\0272\f\020\030\032\b\022\004\022\0028\0000\031H\026J\t\020\032\032\0020\033HÖ\001R\"\020\003\032\023\022\004\022\0020\005\022\004\022\0028\0000\004¢\006\002\b\006¢\006\b\n\000\032\004\b\b\020\t¨\006\034"}, d2 = {"Landroidx/compose/runtime/ComputedValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "compute", "Lkotlin/Function1;", "Landroidx/compose/runtime/CompositionLocalAccessorScope;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getCompute", "()Lkotlin/jvm/functions/Function1;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 2)
/*    */ public final class ComputedValueHolder<T>
/*    */   implements ValueHolder<T>
/*    */ {
/*    */   @NotNull
/*    */   private final Function1<CompositionLocalAccessorScope, T> compute;
/*    */   public static final int $stable;
/*    */   
/*    */   public ComputedValueHolder(@NotNull Function1<CompositionLocalAccessorScope, T> compute) {
/* 54 */     this.compute = compute; } @NotNull public final Function1<CompositionLocalAccessorScope, T> getCompute() { return this.compute; }
/*    */ 
/*    */   
/* 57 */   public T readValue(@NotNull PersistentCompositionLocalMap map) { Intrinsics.checkNotNullParameter(map, "map"); return (T)this.compute.invoke(map); } @NotNull
/*    */   public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
/* 59 */     Intrinsics.checkNotNullParameter(local, "local"); return new ProvidedValue<>(
/* 60 */         local, 
/* 61 */         null, 
/* 62 */         false, 
/* 63 */         null, 
/* 64 */         null, 
/* 65 */         this.compute, 
/* 66 */         false);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Function1<CompositionLocalAccessorScope, T> component1() {
/*    */     return this.compute;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ComputedValueHolder<T> copy(@NotNull Function1<? super CompositionLocalAccessorScope, ? extends T> compute) {
/*    */     Intrinsics.checkNotNullParameter(compute, "compute");
/*    */     return new ComputedValueHolder(compute);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ComputedValueHolder(compute=" + this.compute + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.compute.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ComputedValueHolder))
/*    */       return false; 
/*    */     ComputedValueHolder computedValueHolder = (ComputedValueHolder)other;
/*    */     return !!Intrinsics.areEqual(this.compute, computedValueHolder.compute);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ComputedValueHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */