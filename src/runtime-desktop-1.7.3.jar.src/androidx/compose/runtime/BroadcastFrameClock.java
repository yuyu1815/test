/*     */ package androidx.compose.runtime;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.CancellationException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CancellableContinuation;
/*     */ import kotlinx.coroutines.CancellableContinuationImpl;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\002\b\002\n\002\020!\n\002\030\002\n\000\n\002\020\003\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001:\001\"B\027\022\020\b\002\020\002\032\n\022\004\022\0020\004\030\0010\003¢\006\002\020\005J\024\020\024\032\0020\0042\f\b\002\020\025\032\0060\026j\002`\027J\020\020\030\032\0020\0042\006\020\031\032\0020\nH\002J\016\020\032\032\0020\0042\006\020\033\032\0020\034J(\020\035\032\002H\036\"\004\b\000\020\0362\022\020\037\032\016\022\004\022\0020\034\022\004\022\002H\0360 H@¢\006\002\020!R\030\020\006\032\f\022\b\022\006\022\002\b\0030\b0\007X\016¢\006\002\n\000R\020\020\t\032\004\030\0010\nX\016¢\006\002\n\000R\021\020\013\032\0020\f8F¢\006\006\032\004\b\r\020\016R\016\020\017\032\0020\020X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R\026\020\002\032\n\022\004\022\0020\004\030\0010\003X\004¢\006\002\n\000R\030\020\023\032\f\022\b\022\006\022\002\b\0030\b0\007X\016¢\006\002\n\000¨\006#"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "onNewAwaiters", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "awaiters", "", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "failureCause", "", "hasAwaiters", "", "getHasAwaiters", "()Z", "hasAwaitersUnlocked", "Landroidx/compose/runtime/AtomicInt;", "lock", "Landroidx/compose/runtime/SynchronizedObject;", "spareList", "cancel", "cancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fail", "cause", "sendFrame", "timeNanos", "", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "FrameAwaiter", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,139:1\n26#2:140\n26#2:150\n26#2:153\n310#3,9:141\n319#3,2:151\n33#4,6:154\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n66#1:140\n86#1:150\n118#1:153\n84#1:141,9\n84#1:151,2\n121#1:154,6\n*E\n"})
/*     */ public final class BroadcastFrameClock implements MonotonicFrameClock {
/*     */   @Nullable
/*     */   private final Function0<Unit> onNewAwaiters;
/*     */   @NotNull
/*     */   private final SynchronizedObject lock;
/*     */   @Nullable
/*     */   private Throwable failureCause;
/*     */   @NotNull
/*     */   private List<FrameAwaiter<?>> awaiters;
/*     */   @NotNull
/*     */   private List<FrameAwaiter<?>> spareList;
/*     */   @NotNull
/*     */   private final AtomicInt hasAwaitersUnlocked;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public BroadcastFrameClock(@Nullable Function0<Unit> onNewAwaiters) {
/*  37 */     this.onNewAwaiters = onNewAwaiters;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.lock = new SynchronizedObject();
/*     */     
/*  48 */     this.awaiters = new ArrayList<>();
/*  49 */     this.spareList = new ArrayList<>();
/*     */ 
/*     */ 
/*     */     
/*  53 */     this.hasAwaitersUnlocked = new AtomicInt(0);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public <R> R fold(Object initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
/*     */     return MonotonicFrameClock.DefaultImpls.fold(this, (R)initial, operation);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
/*     */     return MonotonicFrameClock.DefaultImpls.get(this, key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
/*     */     return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public CoroutineContext plus(@NotNull CoroutineContext context) {
/*     */     return MonotonicFrameClock.DefaultImpls.plus(this, context);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\020\t\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\b\002\030\000*\004\b\000\020\0012\0020\002B'\022\022\020\003\032\016\022\004\022\0020\005\022\004\022\0028\0000\004\022\f\020\006\032\b\022\004\022\0028\0000\007¢\006\002\020\bJ\016\020\r\032\0020\0162\006\020\017\032\0020\005R\027\020\006\032\b\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\t\020\nR\035\020\003\032\016\022\004\022\0020\005\022\004\022\0028\0000\004¢\006\b\n\000\032\004\b\013\020\f¨\006\020"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "R", "", "onFrame", "Lkotlin/Function1;", "", "continuation", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "getContinuation", "()Lkotlin/coroutines/Continuation;", "getOnFrame", "()Lkotlin/jvm/functions/Function1;", "resume", "", "timeNanos", "runtime"})
/*     */   @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/*     */   private static final class FrameAwaiter<R>
/*     */   {
/*     */     @NotNull
/*     */     private final Function1<Long, R> onFrame;
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     private final Continuation<R> continuation;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public FrameAwaiter(@NotNull Function1<Long, R> onFrame, @NotNull Continuation<R> continuation) {
/*     */       this.onFrame = onFrame;
/*     */       this.continuation = continuation;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Function1<Long, R> getOnFrame() {
/*     */       return this.onFrame;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<R> getContinuation() {
/*     */       return this.continuation;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final void resume(long timeNanos)
/*     */     {
/*     */       Object object;
/*     */       FrameAwaiter frameAwaiter = this;
/*     */       Continuation<R> continuation = this.continuation;
/*     */       
/*     */       try { FrameAwaiter $this$resume_u24lambda_u240 = frameAwaiter;
/* 140 */         int $i$a$-runCatching-BroadcastFrameClock$FrameAwaiter$resume$1 = 0; object = Result.constructor-impl($this$resume_u24lambda_u240.onFrame.invoke(Long.valueOf(timeNanos))); } catch (Throwable throwable) { object = Result.constructor-impl(ResultKt.createFailure(throwable)); }  continuation.resumeWith(object); } } public final void sendFrame(long timeNanos) { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-BroadcastFrameClock$sendFrame$1 = 0; List<FrameAwaiter<?>> toResume = this.awaiters; this.awaiters = this.spareList; this.spareList = toResume; this.hasAwaitersUnlocked.set(0); for (int i = 0, j = toResume.size(); i < j; i++) ((FrameAwaiter)toResume.get(i)).resume(timeNanos);  toResume.clear(); Unit unit = Unit.INSTANCE; }  }
/* 141 */   public final boolean getHasAwaiters() { return (this.hasAwaitersUnlocked.get() != 0); } @Nullable public <R> Object withFrameNanos(@NotNull Function1<? super Long, ?> onFrame, @NotNull Continuation $completion) { int $i$f$suspendCancellableCoroutine = 0; Continuation uCont$iv = $completion; int $i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv = 0;
/* 142 */     CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     cancellable$iv.initCancellability();
/* 149 */     CancellableContinuation co = (CancellableContinuation)cancellable$iv; int $i$a$-suspendCancellableCoroutine-BroadcastFrameClock$withFrameNanos$2 = 0; FrameAwaiter awaiter = new FrameAwaiter(onFrame, (Continuation)co); SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 150 */     synchronized (lock$iv) { int $i$a$-synchronized-BroadcastFrameClock$withFrameNanos$2$hasNewAwaiters$1 = 0; Throwable cause = this.failureCause; if (cause != null) { ((Continuation)co).resumeWith(Result.constructor-impl(ResultKt.createFailure(cause))); } else { boolean hadAwaiters = !this.awaiters.isEmpty(); this.awaiters.add(awaiter); if (!hadAwaiters) this.hasAwaitersUnlocked.set(1);  boolean bool = !hadAwaiters ? true : false; }  }
/* 151 */      if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended($completion);  return cancellable$iv.getResult(); } private final void fail(Throwable cause) { SynchronizedObject lock$iv = this.lock;
/*     */     int $i$f$synchronized = 0;
/* 153 */     synchronized (lock$iv) { int $i$a$-synchronized-BroadcastFrameClock$fail$1 = 0; if (this.failureCause != null)
/*     */         return;  this.failureCause = cause; List<FrameAwaiter<?>> $this$fastForEach$iv = this.awaiters; int $i$f$fastForEach = 0;
/* 155 */       int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 156 */         Object<?> item$iv = (Object<?>)$this$fastForEach$iv.get(index$iv);
/* 157 */         FrameAwaiter<R> awaiter = (FrameAwaiter)item$iv; int $i$a$-fastForEach-BroadcastFrameClock$fail$1$1 = 0;
/*     */         awaiter.getContinuation().resumeWith(Result.constructor-impl(ResultKt.createFailure(cause)));
/*     */       } 
/*     */       this.awaiters.clear();
/*     */       this.hasAwaitersUnlocked.set(0);
/*     */       Unit unit = Unit.INSTANCE; }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\b\002\n\002\020\003\n\000\020\000\032\0020\001\"\004\b\000\020\0022\b\020\003\032\004\030\0010\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,139:1\n26#2:140\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n99#1:140\n*E\n"})
/*     */   static final class BroadcastFrameClock$withFrameNanos$2$1 extends Lambda implements Function1<Throwable, Unit> {
/*     */     public final void invoke(@Nullable Throwable it) {
/*     */       SynchronizedObject synchronizedObject = BroadcastFrameClock.this.lock;
/*     */       BroadcastFrameClock broadcastFrameClock = BroadcastFrameClock.this;
/*     */       BroadcastFrameClock.FrameAwaiter<R> frameAwaiter = this.$awaiter;
/*     */       int $i$f$synchronized = 0;
/*     */       synchronized (synchronizedObject) {
/*     */         int $i$a$-synchronized-BroadcastFrameClock$withFrameNanos$2$1$1 = 0;
/*     */         broadcastFrameClock.awaiters.remove(frameAwaiter);
/*     */         if (broadcastFrameClock.awaiters.isEmpty())
/*     */           broadcastFrameClock.hasAwaitersUnlocked.set(0); 
/*     */         Unit unit = Unit.INSTANCE;
/*     */       } 
/*     */     }
/*     */     
/*     */     BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock.FrameAwaiter<R> $awaiter) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void cancel(@NotNull CancellationException cancellationException) {
/*     */     Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
/*     */     fail(cancellationException);
/*     */   }
/*     */   
/*     */   public BroadcastFrameClock() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\BroadcastFrameClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */