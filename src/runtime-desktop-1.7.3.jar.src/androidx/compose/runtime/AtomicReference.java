/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\002\b\b\n\002\020\002\n\000\b\000\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004J\033\020\007\032\0020\b2\006\020\t\032\0028\0002\006\020\n\032\0028\000¢\006\002\020\013J\013\020\f\032\0028\000¢\006\002\020\rJ\023\020\016\032\0028\0002\006\020\003\032\0028\000¢\006\002\020\017J\023\020\020\032\0020\0212\006\020\003\032\0028\000¢\006\002\020\004R\017\020\005\032\b\022\004\022\0028\0000\006X\004¨\006\022"}, d2 = {"Landroidx/compose/runtime/AtomicReference;", "V", "", "value", "(Ljava/lang/Object;)V", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "compareAndSet", "", "expect", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "get", "()Ljava/lang/Object;", "getAndSet", "(Ljava/lang/Object;)Ljava/lang/Object;", "set", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class AtomicReference<V>
/*    */ {
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public AtomicReference(Object value) {
/* 23 */     this.delegate$volatile = value; } public final V get() {
/* 24 */     return getDelegate$volatile$FU().get(this);
/*    */   } public final void set(Object value) {
/* 26 */     getDelegate$volatile$FU().set(this, value);
/*    */   }
/* 28 */   public final V getAndSet(Object value) { return getDelegate$volatile$FU().getAndSet(this, (V)value); } public final boolean compareAndSet(Object expect, Object newValue) {
/* 29 */     return getDelegate$volatile$FU().compareAndSet(this, expect, newValue);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\AtomicReference.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */