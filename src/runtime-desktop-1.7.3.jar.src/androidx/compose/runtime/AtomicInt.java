/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020\002\n\000\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\007\032\0020\0032\006\020\b\032\0020\003J\026\020\t\032\0020\n2\006\020\013\032\0020\0032\006\020\f\032\0020\003J\006\020\r\032\0020\003J\016\020\016\032\0020\0172\006\020\002\032\0020\003R\t\020\005\032\0020\006X\004¨\006\020"}, d2 = {"Landroidx/compose/runtime/AtomicInt;", "", "value", "", "(I)V", "delegate", "Lkotlinx/atomicfu/AtomicInt;", "add", "amount", "compareAndSet", "", "expect", "newValue", "get", "set", "", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class AtomicInt
/*    */ {
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public AtomicInt(int value) {
/* 33 */     this.delegate$volatile = value; } public final int get() {
/* 34 */     return getDelegate$volatile$FU().get(this);
/*    */   } public final void set(int value) {
/* 36 */     getDelegate$volatile$FU().set(this, value);
/*    */   }
/* 38 */   public final int add(int amount) { return getDelegate$volatile$FU().addAndGet(this, amount); } public final boolean compareAndSet(int expect, int newValue) {
/* 39 */     return getDelegate$volatile$FU().compareAndSet(this, expect, newValue);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\AtomicInt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */