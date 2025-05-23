/*    */ package kotlinx.atomicfu;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\002\n\002\020\002\n\000\n\002\020\000\n\002\b\006\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\030\020\006\032\0020\0072\006\020\n\032\0020\t2\006\020\013\032\0020\tH\026J \020\006\032\0020\0072\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\tH\026J(\020\006\032\0020\0072\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\t2\006\020\r\032\0020\tH\026J\b\020\016\032\0020\004H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lkotlinx/atomicfu/NamedTrace;", "Lkotlinx/atomicfu/TraceBase;", "trace", "name", "", "(Lkotlinx/atomicfu/TraceBase;Ljava/lang/String;)V", "append", "", "event", "", "event1", "event2", "event3", "event4", "toString", "atomicfu"})
/*    */ final class NamedTrace
/*    */   extends TraceBase
/*    */ {
/*    */   @NotNull
/*    */   private final TraceBase trace;
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/*    */   public NamedTrace(@NotNull TraceBase trace, @NotNull String name) {
/* 32 */     this.trace = trace;
/* 33 */     this.name = name;
/*    */   } public void append(@NotNull Object event) {
/* 35 */     Intrinsics.checkNotNullParameter(event, "event"); this.trace.append(this.name + '.' + event);
/*    */   } public void append(@NotNull Object event1, @NotNull Object event2) {
/* 37 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); this.trace.append(this.name + '.' + event1, this.name + '.' + event2);
/*    */   }
/*    */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
/* 40 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3"); this.trace.append(this.name + '.' + event1, this.name + '.' + event2, this.name + '.' + event3);
/*    */   }
/*    */   
/* 43 */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) { Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3"); Intrinsics.checkNotNullParameter(event4, "event4"); this.trace.append(this.name + '.' + event1, this.name + '.' + event2, this.name + '.' + event3, this.name + '.' + event4); } @NotNull
/*    */   public String toString() {
/* 45 */     return this.trace.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\NamedTrace.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */