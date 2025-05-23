/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\001¢\006\002\020\003J\006\020\t\032\0020\nJ\006\020\013\032\0020\nJ7\020\f\032\002H\r\"\004\b\000\020\r2!\020\016\032\035\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\004\022\002H\r0\017H@¢\006\002\020\024R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\004\032\0020\0058F¢\006\006\032\004\b\004\020\006R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\025"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "isPaused", "", "()Z", "latch", "Landroidx/compose/runtime/Latch;", "pause", "", "resume", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class PausableMonotonicFrameClock
/*    */   implements MonotonicFrameClock
/*    */ {
/*    */   @NotNull
/*    */   private final MonotonicFrameClock frameClock;
/*    */   @NotNull
/*    */   private final Latch latch;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public <R> R fold(Object initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
/*    */     return MonotonicFrameClock.DefaultImpls.fold(this, (R)initial, operation);
/*    */   }
/*    */   
/*    */   public PausableMonotonicFrameClock(@NotNull MonotonicFrameClock frameClock) {
/* 32 */     this.frameClock = frameClock;
/*    */     
/* 34 */     this.latch = new Latch();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean isPaused() {
/* 41 */     return !this.latch.isOpen();
/*    */   } @Nullable
/*    */   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
/*    */     return MonotonicFrameClock.DefaultImpls.get(this, key);
/*    */   } @NotNull
/*    */   public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
/*    */     return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
/*    */   }
/*    */   public final void pause() {
/* 50 */     this.latch.closeLatch();
/*    */   }
/*    */   @NotNull
/*    */   public CoroutineContext plus(@NotNull CoroutineContext context) {
/*    */     return MonotonicFrameClock.DefaultImpls.plus(this, context);
/*    */   }
/*    */   
/*    */   public final void resume() {
/* 58 */     this.latch.openLatch();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public <R> Object withFrameNanos(@NotNull Function1 onFrame, @NotNull Continuation<? super R> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof androidx/compose/runtime/PausableMonotonicFrameClock$withFrameNanos$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast androidx/compose/runtime/PausableMonotonicFrameClock$withFrameNanos$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new androidx/compose/runtime/PausableMonotonicFrameClock$withFrameNanos$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Landroidx/compose/runtime/PausableMonotonicFrameClock;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 201, 0 -> 92, 1 -> 132, 2 -> 195
/*    */     //   92: aload_3
/*    */     //   93: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   96: aload_0
/*    */     //   97: getfield latch : Landroidx/compose/runtime/Latch;
/*    */     //   100: aload #4
/*    */     //   102: aload #4
/*    */     //   104: aload_0
/*    */     //   105: putfield L$0 : Ljava/lang/Object;
/*    */     //   108: aload #4
/*    */     //   110: aload_1
/*    */     //   111: putfield L$1 : Ljava/lang/Object;
/*    */     //   114: aload #4
/*    */     //   116: iconst_1
/*    */     //   117: putfield label : I
/*    */     //   120: invokevirtual await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   123: dup
/*    */     //   124: aload #5
/*    */     //   126: if_acmpne -> 155
/*    */     //   129: aload #5
/*    */     //   131: areturn
/*    */     //   132: aload #4
/*    */     //   134: getfield L$1 : Ljava/lang/Object;
/*    */     //   137: checkcast kotlin/jvm/functions/Function1
/*    */     //   140: astore_1
/*    */     //   141: aload #4
/*    */     //   143: getfield L$0 : Ljava/lang/Object;
/*    */     //   146: checkcast androidx/compose/runtime/PausableMonotonicFrameClock
/*    */     //   149: astore_0
/*    */     //   150: aload_3
/*    */     //   151: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   154: aload_3
/*    */     //   155: pop
/*    */     //   156: aload_0
/*    */     //   157: getfield frameClock : Landroidx/compose/runtime/MonotonicFrameClock;
/*    */     //   160: aload_1
/*    */     //   161: aload #4
/*    */     //   163: aload #4
/*    */     //   165: aconst_null
/*    */     //   166: putfield L$0 : Ljava/lang/Object;
/*    */     //   169: aload #4
/*    */     //   171: aconst_null
/*    */     //   172: putfield L$1 : Ljava/lang/Object;
/*    */     //   175: aload #4
/*    */     //   177: iconst_2
/*    */     //   178: putfield label : I
/*    */     //   181: invokeinterface withFrameNanos : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   186: dup
/*    */     //   187: aload #5
/*    */     //   189: if_acmpne -> 200
/*    */     //   192: aload #5
/*    */     //   194: areturn
/*    */     //   195: aload_3
/*    */     //   196: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   199: aload_3
/*    */     //   200: areturn
/*    */     //   201: new java/lang/IllegalStateException
/*    */     //   204: dup
/*    */     //   205: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   207: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   210: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 59
/*    */     //   #62	-> 96
/*    */     //   #61	-> 129
/*    */     //   #63	-> 155
/*    */     //   #61	-> 192
/*    */     //   #63	-> 200
/*    */     //   #61	-> 201
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   96	36	0	this	Landroidx/compose/runtime/PausableMonotonicFrameClock;
/*    */     //   150	36	0	this	Landroidx/compose/runtime/PausableMonotonicFrameClock;
/*    */     //   96	36	1	onFrame	Lkotlin/jvm/functions/Function1;
/*    */     //   141	45	1	onFrame	Lkotlin/jvm/functions/Function1;
/*    */     //   50	151	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	145	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PausableMonotonicFrameClock.kt", l = {62, 63}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "onFrame"}, m = "withFrameNanos", c = "androidx.compose.runtime.PausableMonotonicFrameClock")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class PausableMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     PausableMonotonicFrameClock$withFrameNanos$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PausableMonotonicFrameClock.this.withFrameNanos(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\PausableMonotonicFrameClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */