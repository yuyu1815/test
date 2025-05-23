/*    */ package kotlinx.atomicfu;
/*    */ 
/*    */ import java.util.concurrent.atomic.AtomicInteger;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\006\n\002\020\016\n\000\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\020\020\016\032\0020\0172\006\020\020\032\0020\fH\026J\030\020\016\032\0020\0172\006\020\021\032\0020\f2\006\020\022\032\0020\fH\026J \020\016\032\0020\0172\006\020\021\032\0020\f2\006\020\022\032\0020\f2\006\020\023\032\0020\fH\026J(\020\016\032\0020\0172\006\020\021\032\0020\f2\006\020\022\032\0020\f2\006\020\023\032\0020\f2\006\020\024\032\0020\fH\026J\b\020\025\032\0020\026H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\007\032\0020\bX\004¢\006\002\n\000R\016\020\t\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\030\020\n\032\n\022\006\022\004\030\0010\f0\013X\004¢\006\004\n\002\020\r¨\006\027"}, d2 = {"Lkotlinx/atomicfu/TraceImpl;", "Lkotlinx/atomicfu/TraceBase;", "size", "", "format", "Lkotlinx/atomicfu/TraceFormat;", "(ILkotlinx/atomicfu/TraceFormat;)V", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "mask", "trace", "", "", "[Ljava/lang/Object;", "append", "", "event", "event1", "event2", "event3", "event4", "toString", "", "atomicfu"})
/*    */ final class TraceImpl
/*    */   extends TraceBase
/*    */ {
/*    */   @NotNull
/*    */   private final TraceFormat format;
/*    */   private final int size;
/*    */   private final int mask;
/*    */   @NotNull
/*    */   private final Object[] trace;
/*    */   @NotNull
/*    */   private final AtomicInteger index;
/*    */   
/*    */   public TraceImpl(int size, @NotNull TraceFormat format) {
/* 48 */     this.format = format;
/* 49 */     if (!((size >= 1) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/* 50 */      this.size = Integer.highestOneBit((size << 1) - 1);
/* 51 */     this.mask = this.size - 1;
/* 52 */     this.trace = new Object[this.size];
/* 53 */     this.index = new AtomicInteger(0);
/*    */   }
/*    */   public void append(@NotNull Object event) {
/* 56 */     Intrinsics.checkNotNullParameter(event, "event"); int i = this.index.getAndIncrement();
/* 57 */     this.trace[i & this.mask] = event;
/*    */   }
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2) {
/* 61 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); int i = this.index.getAndAdd(2);
/* 62 */     this.trace[i & this.mask] = event1;
/* 63 */     this.trace[i + 1 & this.mask] = event2;
/*    */   }
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
/* 67 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3"); int i = this.index.getAndAdd(3);
/* 68 */     this.trace[i & this.mask] = event1;
/* 69 */     this.trace[i + 1 & this.mask] = event2;
/* 70 */     this.trace[i + 2 & this.mask] = event3;
/*    */   }
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) {
/* 74 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3"); Intrinsics.checkNotNullParameter(event4, "event4"); int i = this.index.getAndAdd(4);
/* 75 */     this.trace[i & this.mask] = event1;
/* 76 */     this.trace[i + 1 & this.mask] = event2;
/* 77 */     this.trace[i + 2 & this.mask] = event3;
/* 78 */     this.trace[i + 3 & this.mask] = event4;
/*    */   } @NotNull
/*    */   public String toString() {
/* 81 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-TraceImpl$toString$1 = 0;
/* 82 */     int index = this.index.get();
/* 83 */     int start = index & this.mask;
/* 84 */     int i = (index > this.size) ? (index - this.size) : 0;
/* 85 */     int pos = start;
/* 86 */     int cnt = 0;
/*    */     while (true) {
/* 88 */       Object s = this.trace[pos];
/* 89 */       if (s != null) {
/* 90 */         if (cnt++ > 0) $this$toString_u24lambda_u240.append('\n'); 
/* 91 */         $this$toString_u24lambda_u240.append(this.format.format(i, s));
/* 92 */         i++;
/*    */       } 
/* 94 */       pos = pos + 1 & this.mask;
/* 95 */       if (pos == start) {
/*    */         Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */         return stringBuilder1.toString();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\TraceImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */