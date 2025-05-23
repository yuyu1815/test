/*    */ package kotlinx.atomicfu.locks;
/*    */ import java.util.concurrent.locks.ReentrantLock;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\032\r\020\000\032\0060\001j\002`\002H\b\0321\020\003\032\002H\004\"\004\b\000\020\0042\n\020\005\032\0060\006j\002`\0072\f\020\b\032\b\022\004\022\002H\0040\tH\bø\001\000¢\006\002\020\n\032-\020\013\032\002H\004\"\004\b\000\020\004*\0060\001j\002`\0022\f\020\b\032\b\022\004\022\002H\0040\tH\bø\001\000¢\006\002\020\f*\n\020\r\"\0020\0012\0020\001*\n\020\016\"\0020\0062\0020\006\002\007\n\005\b20\001¨\006\017"}, d2 = {"reentrantLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/ReentrantLock;", "synchronized", "T", "lock", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ReentrantLock", "SynchronizedObject", "atomicfu"})
/*    */ public final class SynchronizedKt {
/*    */   @InlineOnly
/*    */   private static final ReentrantLock reentrantLock() {
/* 10 */     return new ReentrantLock();
/*    */   }
/*    */ 
/*    */   
/*    */   @InlineOnly
/*    */   private static final <T> T withLock(ReentrantLock $this$withLock, Function0 block) {
/* 16 */     Intrinsics.checkNotNullParameter($this$withLock, "<this>"); Intrinsics.checkNotNullParameter(block, "block"); $this$withLock.lock();
/*    */     try {
/* 18 */       return (T)block.invoke();
/*    */     } finally {
/* 20 */       InlineMarker.finallyStart(1); $this$withLock.unlock(); InlineMarker.finallyEnd(1);
/*    */     } 
/*    */   }
/*    */   
/*    */   @InlineOnly
/*    */   private static final <T> T synchronized(Object lock, Function0 block) {
/* 26 */     Intrinsics.checkNotNullParameter(lock, "lock"); Intrinsics.checkNotNullParameter(block, "block"); Object object = lock; /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ try { Object object1 = block.invoke(); } finally { InlineMarker.finallyStart(1); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ InlineMarker.finallyEnd(1); }  return (T)object1;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\atomicfu-jvm-0.23.2.jar!\kotlinx\atomicfu\locks\SynchronizedKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */