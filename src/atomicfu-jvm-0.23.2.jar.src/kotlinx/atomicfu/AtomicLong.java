/*     */ package kotlinx.atomicfu;
/*     */ 
/*     */ import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.internal.InlineOnly;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KProperty;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\t\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\002\030\000 \"2\0020\001:\001\"B\027\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\r\032\0020\0032\006\020\016\032\0020\003J\026\020\017\032\0020\0202\006\020\021\032\0020\0032\006\020\022\032\0020\003J\006\020\023\032\0020\003J\016\020\024\032\0020\0032\006\020\016\032\0020\003J\006\020\025\032\0020\003J\006\020\026\032\0020\003J\016\020\027\032\0020\0032\006\020\002\032\0020\003J\037\020\t\032\0020\0032\b\020\030\032\004\030\0010\0012\n\020\031\032\006\022\002\b\0030\032H\nJ\006\020\033\032\0020\003J\016\020\034\032\0020\0352\006\020\002\032\0020\003J\021\020\036\032\0020\0352\006\020\016\032\0020\003H\nJ\021\020\037\032\0020\0352\006\020\016\032\0020\003H\nJ'\020\013\032\0020\0352\b\020\030\032\004\030\0010\0012\n\020\031\032\006\022\002\b\0030\0322\006\020\002\032\0020\003H\nJ\b\020 \032\0020!H\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR$\020\002\032\0020\0032\006\020\002\032\0020\003@FX\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\f¨\006#"}, d2 = {"Lkotlinx/atomicfu/AtomicLong;", "", "value", "", "trace", "Lkotlinx/atomicfu/TraceBase;", "(JLkotlinx/atomicfu/TraceBase;)V", "getTrace", "()Lkotlinx/atomicfu/TraceBase;", "getValue", "()J", "setValue", "(J)V", "addAndGet", "delta", "compareAndSet", "", "expect", "update", "decrementAndGet", "getAndAdd", "getAndDecrement", "getAndIncrement", "getAndSet", "thisRef", "property", "Lkotlin/reflect/KProperty;", "incrementAndGet", "lazySet", "", "minusAssign", "plusAssign", "toString", "", "Companion", "atomicfu"})
/*     */ @SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicLong\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/*     */ public final class AtomicLong
/*     */ {
/*     */   public AtomicLong(long value, @NotNull TraceBase trace) {
/* 326 */     this.trace = trace;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 331 */     this.value = value; } @NotNull public final TraceBase getTrace() { return this.trace; } public final long getValue() { return this.value; }
/*     */   @InlineOnly private final long getValue(Object thisRef, KProperty property) { Intrinsics.checkNotNullParameter(property, "property");
/* 333 */     return getValue(); } public final void setValue(long value) { this.value = value;
/* 334 */     if (this.trace != TraceBase.None.INSTANCE)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 444 */       TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$value$1 = 0; traceBase.append("set(" + value + ')'); }  } @InlineOnly private final void setValue(Object thisRef, KProperty property, long value) { Intrinsics.checkNotNullParameter(property, "property"); setValue(value); } public final void lazySet(long value) { FU.lazySet(this, value); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$lazySet$1 = 0; traceBase.append("lazySet(" + value + ')'); }  } public final boolean compareAndSet(long expect, long update) { boolean result = FU.compareAndSet(this, expect, update); if (result && this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$compareAndSet$1 = 0; traceBase.append("CAS(" + expect + ", " + update + ')'); }  return result; } public final long getAndSet(long value) { long oldValue = FU.getAndSet(this, value); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$getAndSet$1 = 0; traceBase.append("getAndSet(" + value + "):" + oldValue); }  return oldValue; } public final long getAndIncrement() { long oldValue = FU.getAndIncrement(this); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$getAndIncrement$1 = 0; traceBase.append("getAndInc():" + oldValue); }  return oldValue; } public final long getAndDecrement() { long oldValue = FU.getAndDecrement(this); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$getAndDecrement$1 = 0; traceBase.append("getAndDec():" + oldValue); }  return oldValue; } public final long getAndAdd(long delta) { long oldValue = FU.getAndAdd(this, delta); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$getAndAdd$1 = 0; traceBase.append("getAndAdd(" + delta + "):" + oldValue); }  return oldValue; } public final long addAndGet(long delta) { long newValue = FU.addAndGet(this, delta); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$addAndGet$1 = 0; traceBase.append("addAndGet(" + delta + "):" + newValue); }  return newValue; } public final long incrementAndGet() { long newValue = FU.incrementAndGet(this); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$incrementAndGet$1 = 0; traceBase.append("incAndGet():" + newValue); }  return newValue; } public final long decrementAndGet() { long newValue = FU.decrementAndGet(this); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicLong$decrementAndGet$1 = 0;
/*     */       traceBase.append("decAndGet():" + newValue); }
/*     */     
/*     */     return newValue; }
/*     */ 
/*     */   
/*     */   public final void plusAssign(long delta) {
/*     */     int $i$f$plusAssign = 0;
/*     */     getAndAdd(delta);
/*     */   }
/*     */   
/*     */   public final void minusAssign(long delta) {
/*     */     int $i$f$minusAssign = 0;
/*     */     getAndAdd(-delta);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return String.valueOf(this.value);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032&\022\f\022\n \006*\004\030\0010\0050\005 \006*\022\022\f\022\n \006*\004\030\0010\0050\005\030\0010\0040\004X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lkotlinx/atomicfu/AtomicLong$Companion;", "", "()V", "FU", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Lkotlinx/atomicfu/AtomicLong;", "kotlin.jvm.PlatformType", "atomicfu"})
/*     */   private static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TraceBase trace;
/*     */   private volatile long value;
/*     */   private static final AtomicLongFieldUpdater<AtomicLong> FU = AtomicLongFieldUpdater.newUpdater(AtomicLong.class, "value");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\AtomicLong.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */