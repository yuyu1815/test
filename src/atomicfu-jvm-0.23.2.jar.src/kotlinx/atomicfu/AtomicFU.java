/*    */ package kotlinx.atomicfu;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmName;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\t\n\000\032\037\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002¢\006\002\020\004\032)\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\0022\b\b\002\020\005\032\0020\006¢\006\002\020\007\032\016\020\000\032\0020\b2\006\020\003\032\0020\t\032\030\020\000\032\0020\b2\006\020\003\032\0020\t2\b\b\002\020\005\032\0020\006\032\016\020\000\032\0020\n2\006\020\003\032\0020\013\032\030\020\000\032\0020\n2\006\020\003\032\0020\0132\b\b\002\020\005\032\0020\006\032\016\020\000\032\0020\f2\006\020\003\032\0020\r\032\030\020\000\032\0020\f2\006\020\003\032\0020\r2\b\b\002\020\005\032\0020\006¨\006\016"}, d2 = {"atomic", "Lkotlinx/atomicfu/AtomicRef;", "T", "initial", "(Ljava/lang/Object;)Lkotlinx/atomicfu/AtomicRef;", "trace", "Lkotlinx/atomicfu/TraceBase;", "(Ljava/lang/Object;Lkotlinx/atomicfu/TraceBase;)Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/atomicfu/AtomicBoolean;", "", "Lkotlinx/atomicfu/AtomicInt;", "", "Lkotlinx/atomicfu/AtomicLong;", "", "atomicfu"})
/*    */ @JvmName(name = "AtomicFU")
/*    */ public final class AtomicFU
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> AtomicRef<T> atomic(Object initial, @NotNull TraceBase trace) {
/* 26 */     Intrinsics.checkNotNullParameter(trace, "trace"); return new AtomicRef<>((T)initial, trace); } @NotNull
/*    */   public static final <T> AtomicRef<T> atomic(Object initial) {
/* 28 */     return atomic((T)initial, TraceBase.None.INSTANCE);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AtomicInt atomic(int initial, @NotNull TraceBase trace) {
/* 39 */     Intrinsics.checkNotNullParameter(trace, "trace"); return new AtomicInt(initial, trace); } @NotNull
/*    */   public static final AtomicInt atomic(int initial) {
/* 41 */     return atomic(initial, TraceBase.None.INSTANCE);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AtomicLong atomic(long initial, @NotNull TraceBase trace) {
/* 52 */     Intrinsics.checkNotNullParameter(trace, "trace"); return new AtomicLong(initial, trace); } @NotNull
/*    */   public static final AtomicLong atomic(long initial) {
/* 54 */     return atomic(initial, TraceBase.None.INSTANCE);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final AtomicBoolean atomic(boolean initial, @NotNull TraceBase trace) {
/* 65 */     Intrinsics.checkNotNullParameter(trace, "trace"); return new AtomicBoolean(initial, trace); } @NotNull
/*    */   public static final AtomicBoolean atomic(boolean initial) {
/* 67 */     return atomic(initial, TraceBase.None.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\AtomicFU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */