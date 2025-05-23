/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import androidx.annotation.AnyThread;
/*     */ import androidx.annotation.MainThread;
/*     */ import java.util.ArrayDeque;
/*     */ import java.util.Queue;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\007\b\000\030\0002\0020\001B\005¢\006\002\020\002J\b\020\n\032\0020\004H\007J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\tH\007J\b\020\020\032\0020\fH\007J\020\020\021\032\0020\f2\006\020\017\032\0020\tH\003J\b\020\022\032\0020\fH\007J\b\020\023\032\0020\fH\007J\b\020\024\032\0020\fH\007R\016\020\003\032\0020\004X\016¢\006\002\n\000R\016\020\005\032\0020\004X\016¢\006\002\n\000R\016\020\006\032\0020\004X\016¢\006\002\n\000R\024\020\007\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/lifecycle/DispatchQueue;", "", "()V", "finished", "", "isDraining", "paused", "queue", "Ljava/util/Queue;", "Ljava/lang/Runnable;", "canRun", "dispatchAndEnqueue", "", "context", "Lkotlin/coroutines/CoroutineContext;", "runnable", "drainQueue", "enqueue", "finish", "pause", "resume", "lifecycle-common"})
/*     */ public final class DispatchQueue
/*     */ {
/*     */   private boolean paused = true;
/*     */   private boolean finished;
/*     */   private boolean isDraining;
/*     */   @NotNull
/*  37 */   private final Queue<Runnable> queue = new ArrayDeque<>();
/*     */   
/*     */   @MainThread
/*     */   public final void pause() {
/*  41 */     this.paused = true;
/*     */   }
/*     */   
/*     */   @MainThread
/*     */   public final void resume() {
/*  46 */     if (!this.paused) {
/*     */       return;
/*     */     }
/*  49 */     if (!(!this.finished ? 1 : 0)) { int $i$a$-check-DispatchQueue$resume$1 = 0; String str = 
/*  50 */         "Cannot resume a finished dispatcher"; throw new IllegalStateException(str.toString()); }
/*     */     
/*  52 */     this.paused = false;
/*  53 */     drainQueue();
/*     */   }
/*     */   
/*     */   @MainThread
/*     */   public final void finish() {
/*  58 */     this.finished = true;
/*  59 */     drainQueue();
/*     */   }
/*     */   
/*     */   @MainThread
/*     */   public final void drainQueue() {
/*  64 */     if (this.isDraining) {
/*     */       return;
/*     */     }
/*     */     
/*     */     try {
/*  69 */       this.isDraining = true;
/*  70 */       while ((!this.queue.isEmpty()) && 
/*  71 */         canRun()) {
/*     */ 
/*     */         
/*  74 */         if ((Runnable)this.queue.poll() != null) { ((Runnable)this.queue.poll()).run(); continue; }  (Runnable)this.queue.poll();
/*     */       } 
/*     */     } finally {
/*  77 */       this.isDraining = false;
/*     */     } 
/*     */   }
/*     */   @MainThread
/*     */   public final boolean canRun() {
/*  82 */     return (this.finished || !this.paused);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @AnyThread
/*     */   public final void dispatchAndEnqueue(@NotNull CoroutineContext context, @NotNull Runnable runnable) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'context'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'runnable'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: invokestatic getMain : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   15: invokevirtual getImmediate : ()Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   18: astore_3
/*     */     //   19: iconst_0
/*     */     //   20: istore #4
/*     */     //   22: aload_3
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual isDispatchNeeded : (Lkotlin/coroutines/CoroutineContext;)Z
/*     */     //   27: ifne -> 37
/*     */     //   30: aload_0
/*     */     //   31: invokevirtual canRun : ()Z
/*     */     //   34: ifeq -> 52
/*     */     //   37: aload_3
/*     */     //   38: aload_1
/*     */     //   39: aload_0
/*     */     //   40: aload_2
/*     */     //   41: <illegal opcode> run : (Landroidx/lifecycle/DispatchQueue;Ljava/lang/Runnable;)Ljava/lang/Runnable;
/*     */     //   46: invokevirtual dispatch : (Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
/*     */     //   49: goto -> 57
/*     */     //   52: aload_0
/*     */     //   53: aload_2
/*     */     //   54: invokespecial enqueue : (Ljava/lang/Runnable;)V
/*     */     //   57: nop
/*     */     //   58: nop
/*     */     //   59: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 12
/*     */     //   #98	-> 22
/*     */     //   #99	-> 37
/*     */     //   #101	-> 52
/*     */     //   #103	-> 57
/*     */     //   #87	-> 58
/*     */     //   #104	-> 59
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   22	36	4	$i$a$-with-DispatchQueue$dispatchAndEnqueue$1	I
/*     */     //   19	39	3	$this$dispatchAndEnqueue_u24lambda_u242	Lkotlinx/coroutines/MainCoroutineDispatcher;
/*     */     //   0	60	0	this	Landroidx/lifecycle/DispatchQueue;
/*     */     //   0	60	1	context	Lkotlin/coroutines/CoroutineContext;
/*     */     //   0	60	2	runnable	Ljava/lang/Runnable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue this$0, Runnable $runnable) {
/*  99 */     Intrinsics.checkNotNullParameter(this$0, "this$0"); Intrinsics.checkNotNullParameter($runnable, "$runnable"); this$0.enqueue($runnable);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @MainThread
/*     */   private final void enqueue(Runnable runnable) {
/* 108 */     if (!this.queue.offer(runnable)) { int $i$a$-check-DispatchQueue$enqueue$1 = 0; String str = 
/* 109 */         "cannot enqueue any more runnables"; throw new IllegalStateException(str.toString()); }
/*     */     
/* 111 */     drainQueue();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\DispatchQueue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */