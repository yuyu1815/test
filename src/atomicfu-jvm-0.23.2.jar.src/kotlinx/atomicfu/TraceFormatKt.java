/*    */ package kotlinx.atomicfu;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.internal.InlineOnly;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000$\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\016\n\000\032F\020\000\032\0020\00128\b\004\020\002\0322\022\023\022\0210\004¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\023\022\0210\b¢\006\f\b\005\022\b\b\006\022\004\b\b(\t\022\004\022\0020\n0\003H\bø\001\000\002\007\n\005\b20\001¨\006\013"}, d2 = {"TraceFormat", "Lkotlinx/atomicfu/TraceFormat;", "format", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "index", "", "event", "", "atomicfu"})
/*    */ public final class TraceFormatKt
/*    */ {
/*    */   @InlineOnly
/*    */   private static final TraceFormat TraceFormat(Function2<? super Integer, Object, String> format) {
/* 29 */     Intrinsics.checkNotNullParameter(format, "format"); return new TraceFormatKt$TraceFormat$1(format); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 176, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\000\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"kotlinx/atomicfu/TraceFormatKt$TraceFormat$1", "Lkotlinx/atomicfu/TraceFormat;", "format", "", "index", "", "event", "", "atomicfu"}) @SourceDebugExtension({"SMAP\nTraceFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceFormat.kt\nkotlinx/atomicfu/TraceFormatKt$TraceFormat$1\n*L\n1#1,31:1\n*E\n"}) public static final class TraceFormatKt$TraceFormat$1 extends TraceFormat { @NotNull
/* 30 */     public String format(int index, @NotNull Object event) { Intrinsics.checkNotNullParameter(event, "event"); return (String)this.$format.invoke(Integer.valueOf(index), event); }
/*    */ 
/*    */     
/*    */     public TraceFormatKt$TraceFormat$1(Function2<Integer, Object, String> $format) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\TraceFormatKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */