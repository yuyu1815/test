/*    */ package androidx.compose.runtime;
/*    */ 
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\020\t\n\002\b\002\bÂ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\005\032\002H\006\"\004\b\000\020\0062\022\020\007\032\016\022\004\022\0020\t\022\004\022\002H\0060\bH@¢\006\002\020\nR\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\013"}, d2 = {"Landroidx/compose/runtime/SixtyFpsMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "fps", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime"})
/*    */ final class SixtyFpsMonotonicFrameClock
/*    */   implements MonotonicFrameClock
/*    */ {
/*    */   @NotNull
/*    */   public static final SixtyFpsMonotonicFrameClock INSTANCE = new SixtyFpsMonotonicFrameClock();
/*    */   private static final int fps = 60;
/*    */   
/*    */   @NotNull
/*    */   public CoroutineContext plus(@NotNull CoroutineContext context) {
/* 69 */     return MonotonicFrameClock.DefaultImpls.plus(this, context); } @NotNull public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) { return MonotonicFrameClock.DefaultImpls.minusKey(this, key); } @Nullable public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) { return MonotonicFrameClock.DefaultImpls.get(this, key); } public <R> R fold(Object initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) { return MonotonicFrameClock.DefaultImpls.fold(this, (R)initial, operation); }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public <R> Object withFrameNanos(@NotNull Function1 onFrame, @NotNull Continuation<? super R> paramContinuation) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof androidx/compose/runtime/SixtyFpsMonotonicFrameClock$withFrameNanos$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast androidx/compose/runtime/SixtyFpsMonotonicFrameClock$withFrameNanos$1
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
/*    */     //   39: new androidx/compose/runtime/SixtyFpsMonotonicFrameClock$withFrameNanos$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Landroidx/compose/runtime/SixtyFpsMonotonicFrameClock;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 149, 0 -> 88, 1 -> 121
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: ldc2_w 16
/*    */     //   95: aload #4
/*    */     //   97: aload #4
/*    */     //   99: aload_1
/*    */     //   100: putfield L$0 : Ljava/lang/Object;
/*    */     //   103: aload #4
/*    */     //   105: iconst_1
/*    */     //   106: putfield label : I
/*    */     //   109: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   112: dup
/*    */     //   113: aload #5
/*    */     //   115: if_acmpne -> 135
/*    */     //   118: aload #5
/*    */     //   120: areturn
/*    */     //   121: aload #4
/*    */     //   123: getfield L$0 : Ljava/lang/Object;
/*    */     //   126: checkcast kotlin/jvm/functions/Function1
/*    */     //   129: astore_1
/*    */     //   130: aload_3
/*    */     //   131: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   134: aload_3
/*    */     //   135: pop
/*    */     //   136: aload_1
/*    */     //   137: invokestatic nanoTime : ()J
/*    */     //   140: invokestatic boxLong : (J)Ljava/lang/Long;
/*    */     //   143: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   148: areturn
/*    */     //   149: new java/lang/IllegalStateException
/*    */     //   152: dup
/*    */     //   153: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   155: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   158: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #72	-> 59
/*    */     //   #75	-> 92
/*    */     //   #72	-> 118
/*    */     //   #76	-> 135
/*    */     //   #72	-> 149
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	29	1	onFrame	Lkotlin/jvm/functions/Function1;
/*    */     //   130	19	1	onFrame	Lkotlin/jvm/functions/Function1;
/*    */     //   50	99	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	93	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ActualDesktop.desktop.kt", l = {75}, i = {0}, s = {"L$0"}, n = {"onFrame"}, m = "withFrameNanos", c = "androidx.compose.runtime.SixtyFpsMonotonicFrameClock")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*    */   static final class SixtyFpsMonotonicFrameClock$withFrameNanos$1<R> extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     SixtyFpsMonotonicFrameClock$withFrameNanos$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SixtyFpsMonotonicFrameClock.this.withFrameNanos(null, (Continuation)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\SixtyFpsMonotonicFrameClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */