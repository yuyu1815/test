/*    */ package kotlinx.atomicfu;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.internal.InlineOnly;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\002\b\027\030\0002\0020\001:\001\fB\007\b\000¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\001H\027J\030\020\003\032\0020\0042\006\020\006\032\0020\0012\006\020\007\032\0020\001H\027J \020\003\032\0020\0042\006\020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\001H\027J(\020\003\032\0020\0042\006\020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\0012\006\020\t\032\0020\001H\027J\032\020\n\032\0020\0042\f\020\005\032\b\022\004\022\0020\0010\013H\nø\001\000\002\007\n\005\b20\001¨\006\r"}, d2 = {"Lkotlinx/atomicfu/TraceBase;", "", "()V", "append", "", "event", "event1", "event2", "event3", "event4", "invoke", "Lkotlin/Function0;", "None", "atomicfu"})
/*    */ public class TraceBase
/*    */ {
/*    */   public void append(@NotNull Object event) {
/* 74 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2) {
/* 80 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3) {
/* 86 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void append(@NotNull Object event1, @NotNull Object event2, @NotNull Object event3, @NotNull Object event4) {
/* 92 */     Intrinsics.checkNotNullParameter(event1, "event1"); Intrinsics.checkNotNullParameter(event2, "event2"); Intrinsics.checkNotNullParameter(event3, "event3"); Intrinsics.checkNotNullParameter(event4, "event4");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @InlineOnly
/*    */   private final void invoke(Function0 event) {
/* 99 */     Intrinsics.checkNotNullParameter(event, "event"); append(event.invoke());
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lkotlinx/atomicfu/TraceBase$None;", "Lkotlinx/atomicfu/TraceBase;", "()V", "atomicfu"})
/*    */   public static final class None extends TraceBase {
/*    */     @NotNull
/*    */     public static final None INSTANCE = new None();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\TraceBase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */