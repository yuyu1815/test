/*     */ package kotlinx.atomicfu;
/*     */ 
/*     */ import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\r\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\002\b\002\030\000 \0332\0020\001:\001\033B\027\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\026\020\020\032\0020\0032\006\020\021\032\0020\0032\006\020\022\032\0020\003J\016\020\023\032\0020\0032\006\020\013\032\0020\003J\037\020\f\032\0020\0032\b\020\024\032\004\030\0010\0012\n\020\025\032\006\022\002\b\0030\026H\nJ\016\020\027\032\0020\0302\006\020\013\032\0020\003J'\020\016\032\0020\0302\b\020\024\032\004\030\0010\0012\n\020\025\032\006\022\002\b\0030\0262\006\020\013\032\0020\003H\nJ\b\020\031\032\0020\032H\026R\016\020\007\032\0020\bX\016¢\006\002\n\000R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\nR$\020\013\032\0020\0032\006\020\013\032\0020\0038F@FX\016¢\006\f\032\004\b\f\020\r\"\004\b\016\020\017¨\006\034"}, d2 = {"Lkotlinx/atomicfu/AtomicBoolean;", "", "v", "", "trace", "Lkotlinx/atomicfu/TraceBase;", "(ZLkotlinx/atomicfu/TraceBase;)V", "_value", "", "getTrace", "()Lkotlinx/atomicfu/TraceBase;", "value", "getValue", "()Z", "setValue", "(Z)V", "compareAndSet", "expect", "update", "getAndSet", "thisRef", "property", "Lkotlin/reflect/KProperty;", "lazySet", "", "toString", "", "Companion", "atomicfu"})
/*     */ @SourceDebugExtension({"SMAP\nAtomicFU.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFU.kt\nkotlinx/atomicfu/AtomicBoolean\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
/*     */ public final class AtomicBoolean
/*     */ {
/*     */   public AtomicBoolean(boolean v, @NotNull TraceBase trace) {
/* 136 */     this.trace = trace;
/*     */ 
/*     */     
/* 139 */     this._value = v ? 1 : 0;
/*     */   } @NotNull
/*     */   public final TraceBase getTrace() { return this.trace; } @InlineOnly
/* 142 */   private final boolean getValue(Object thisRef, KProperty property) { Intrinsics.checkNotNullParameter(property, "property"); return getValue(); }
/*     */    @InlineOnly
/*     */   private final void setValue(Object thisRef, KProperty property, boolean value) {
/* 145 */     Intrinsics.checkNotNullParameter(property, "property"); setValue(value);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean getValue() {
/* 151 */     return (this._value != 0);
/*     */   }
/* 153 */   public final void setValue(boolean value) { this._value = value ? 1 : 0;
/* 154 */     if (this.trace != TraceBase.None.INSTANCE)
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 444 */       TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicBoolean$value$1 = 0; traceBase.append("set(" + value + ')'); }  } public final void lazySet(boolean value) { int v = value ? 1 : 0; FU.lazySet(this, v); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicBoolean$lazySet$1 = 0; traceBase.append("lazySet(" + value + ')'); }  } public final boolean compareAndSet(boolean expect, boolean update) { int e = expect ? 1 : 0; int u = update ? 1 : 0; boolean result = FU.compareAndSet(this, e, u); if (result && this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicBoolean$compareAndSet$1 = 0; traceBase.append("CAS(" + expect + ", " + update + ')'); }  return result; } public final boolean getAndSet(boolean value) { int v = value ? 1 : 0; int oldValue = FU.getAndSet(this, v); if (this.trace != TraceBase.None.INSTANCE) { TraceBase traceBase = this.trace; int $i$a$-invoke-AtomicBoolean$getAndSet$1 = 0;
/*     */       traceBase.append("getAndSet(" + value + "):" + oldValue); }
/*     */     
/*     */     return (oldValue == 1); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return String.valueOf(getValue());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R2\020\003\032&\022\f\022\n \006*\004\030\0010\0050\005 \006*\022\022\f\022\n \006*\004\030\0010\0050\005\030\0010\0040\004X\004¢\006\002\n\000¨\006\007"}, d2 = {"Lkotlinx/atomicfu/AtomicBoolean$Companion;", "", "()V", "FU", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Lkotlinx/atomicfu/AtomicBoolean;", "kotlin.jvm.PlatformType", "atomicfu"})
/*     */   private static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TraceBase trace;
/*     */   private volatile int _value;
/*     */   private static final AtomicIntegerFieldUpdater<AtomicBoolean> FU = AtomicIntegerFieldUpdater.newUpdater(AtomicBoolean.class, "_value");
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\AtomicBoolean.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */