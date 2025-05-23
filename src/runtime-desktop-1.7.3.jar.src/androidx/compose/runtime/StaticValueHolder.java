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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\b\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\016\020\b\032\0028\000HÆ\003¢\006\002\020\006J\036\020\t\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0028\000HÆ\001¢\006\002\020\nJ\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\025\020\021\032\0028\0002\006\020\022\032\0020\023H\026¢\006\002\020\024J\034\020\025\032\b\022\004\022\0028\0000\0262\f\020\027\032\b\022\004\022\0028\0000\030H\026J\t\020\031\032\0020\032HÖ\001R\023\020\003\032\0028\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\033"}, d2 = {"Landroidx/compose/runtime/StaticValueHolder;", "T", "Landroidx/compose/runtime/ValueHolder;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Landroidx/compose/runtime/StaticValueHolder;", "equals", "", "other", "", "hashCode", "", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "toString", "", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class StaticValueHolder<T>
/*    */   implements ValueHolder<T>
/*    */ {
/*    */   private final T value;
/*    */   public static final int $stable;
/*    */   
/*    */   public StaticValueHolder(Object value) {
/* 27 */     this.value = (T)value; } public final T getValue() { return this.value; }
/* 28 */   public T readValue(@NotNull PersistentCompositionLocalMap map) { Intrinsics.checkNotNullParameter(map, "map"); return this.value; } @NotNull
/*    */   public ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> local) {
/* 30 */     Intrinsics.checkNotNullParameter(local, "local"); return new ProvidedValue<>(
/* 31 */         local, 
/* 32 */         this.value, 
/* 33 */         (this.value == null), 
/* 34 */         null, 
/* 35 */         null, 
/* 36 */         null, 
/* 37 */         false);
/*    */   }
/*    */   
/*    */   public final T component1() {
/*    */     return this.value;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StaticValueHolder<T> copy(Object value) {
/*    */     return new StaticValueHolder((T)value);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StaticValueHolder(value=" + this.value + ')';
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return (this.value == null) ? 0 : this.value.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StaticValueHolder))
/*    */       return false; 
/*    */     StaticValueHolder staticValueHolder = (StaticValueHolder)other;
/*    */     return !!Intrinsics.areEqual(this.value, staticValueHolder.value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\StaticValueHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */