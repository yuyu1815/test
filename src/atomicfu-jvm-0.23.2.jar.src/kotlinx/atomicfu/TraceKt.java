/*    */ package kotlinx.atomicfu;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.internal.InlineOnly;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\004\032\034\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\001H\007\032\022\020\t\032\004\030\0010\n2\006\020\013\032\0020\nH\002\032\022\020\f\032\0020\005*\0020\0052\006\020\r\032\0020\n\"\021\020\000\032\0020\001¢\006\b\n\000\032\004\b\002\020\003¨\006\016"}, d2 = {"traceFormatDefault", "Lkotlinx/atomicfu/TraceFormat;", "getTraceFormatDefault", "()Lkotlinx/atomicfu/TraceFormat;", "Trace", "Lkotlinx/atomicfu/TraceBase;", "size", "", "format", "getSystemProperty", "", "key", "named", "name", "atomicfu"})
/*    */ public final class TraceKt
/*    */ {
/*    */   @InlineOnly
/*    */   @NotNull
/*    */   public static final TraceBase Trace(int size, @NotNull TraceFormat format) {
/* 15 */     Intrinsics.checkNotNullParameter(format, "format"); return new TraceImpl(size, format);
/*    */   }
/*    */   @NotNull
/* 18 */   public static final TraceBase named(@NotNull TraceBase $this$named, @NotNull String name) { Intrinsics.checkNotNullParameter($this$named, "<this>"); Intrinsics.checkNotNullParameter(name, "name"); return ($this$named == TraceBase.None.INSTANCE) ? $this$named : new NamedTrace($this$named, name); }
/*    */   private static final String getSystemProperty(String key) { String str;
/*    */     
/* 21 */     try { str = System.getProperty(key); } catch (SecurityException e) { str = null; }  return str; }
/*    */   @NotNull
/* 23 */   public static final TraceFormat getTraceFormatDefault() { return traceFormatDefault; } @NotNull
/* 24 */   private static final TraceFormat traceFormatDefault = (getSystemProperty("kotlinx.atomicfu.trace.thread") != null) ? new TraceFormatThread() : new TraceFormat();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\TraceKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */