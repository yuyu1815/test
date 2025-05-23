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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\000\n\000\b\002\030\0002\0020\001B\005¢\006\002\020\002J\030\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lkotlinx/atomicfu/TraceFormatThread;", "Lkotlinx/atomicfu/TraceFormat;", "()V", "format", "", "index", "", "event", "", "atomicfu"})
/*    */ final class TraceFormatThread
/*    */   extends TraceFormat
/*    */ {
/*    */   @NotNull
/*    */   public String format(int index, @NotNull Object event) {
/* 28 */     Intrinsics.checkNotNullParameter(event, "event"); return index + ": [" + Thread.currentThread().getName() + "] " + event;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\TraceFormatThread.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */