/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugProbesKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CancellableContinuation;
/*     */ import kotlinx.coroutines.CancellableContinuationImpl;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\013\n\000\n\002\020!\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\005¢\006\002\020\002J\016\020\016\032\0020\bH@¢\006\002\020\017J\006\020\020\032\0020\bJ\006\020\021\032\0020\bJ%\020\022\032\002H\023\"\004\b\000\020\0232\f\020\024\032\b\022\004\022\002H\0230\025H\bø\001\000¢\006\002\020\026R\016\020\003\032\0020\004X\016¢\006\002\n\000R\032\020\005\032\016\022\n\022\b\022\004\022\0020\b0\0070\006X\016¢\006\002\n\000R\021\020\t\032\0020\0048F¢\006\006\032\004\b\t\020\nR\016\020\013\032\0020\fX\004¢\006\002\n\000R\032\020\r\032\016\022\n\022\b\022\004\022\0020\b0\0070\006X\016¢\006\002\n\000\002\007\n\005\b20\001¨\006\027"}, d2 = {"Landroidx/compose/runtime/Latch;", "", "()V", "_isOpen", "", "awaiters", "", "Lkotlin/coroutines/Continuation;", "", "isOpen", "()Z", "lock", "Landroidx/compose/runtime/SynchronizedObject;", "spareList", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeLatch", "openLatch", "withClosed", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runtime"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n26#2:92\n26#2:93\n26#2:94\n26#2:104\n310#3,9:95\n319#3,2:105\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch\n*L\n39#1:92\n51#1:93\n57#1:94\n79#1:104\n78#1:95,9\n78#1:105,2\n*E\n"})
/*     */ public final class Latch
/*     */ {
/*     */   @NotNull
/*  34 */   private final SynchronizedObject lock = new SynchronizedObject(); @NotNull
/*  35 */   private List<Continuation<Unit>> awaiters = new ArrayList<>(); @NotNull
/*  36 */   private List<Continuation<Unit>> spareList = new ArrayList<>();
/*     */   private boolean _isOpen = true; public static final int $stable = 8; public final <R> R withClosed(@NotNull Function0 block) { Object object; Intrinsics.checkNotNullParameter(block, "block"); int $i$f$withClosed = 0; closeLatch(); try { object = block.invoke(); }
/*     */     finally { InlineMarker.finallyStart(1); openLatch(); InlineMarker.finallyEnd(1); }
/*  39 */      return (R)object; } public final boolean isOpen() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
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
/*  92 */     synchronized (lock$iv) { int $i$a$-synchronized-Latch$isOpen$1 = 0; boolean bool = this._isOpen; }  return bool; } public final void closeLatch() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/*  93 */     synchronized (lock$iv) { int $i$a$-synchronized-Latch$closeLatch$1 = 0; this._isOpen = false; Unit unit = Unit.INSTANCE; }
/*  94 */      } public final void openLatch() { SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0; synchronized (lock$iv) { int $i$a$-synchronized-Latch$openLatch$1 = 0; if (isOpen()) return;  List<Continuation<Unit>> toResume = this.awaiters; this.awaiters = this.spareList; this.spareList = toResume; this._isOpen = true; for (int i = 0, j = toResume.size(); i < j; i++) ((Continuation)toResume.get(i)).resumeWith(Result.constructor-impl(Unit.INSTANCE));  toResume.clear(); Unit unit = Unit.INSTANCE; }  } @Nullable public final Object await(@NotNull Continuation $completion) { if (isOpen())
/*  95 */       return Unit.INSTANCE;  int $i$f$suspendCancellableCoroutine = 0; Continuation uCont$iv = $completion; int $i$a$-suspendCoroutineUninterceptedOrReturn-CancellableContinuationKt$suspendCancellableCoroutine$2$iv = 0;
/*  96 */     CancellableContinuationImpl cancellable$iv = new CancellableContinuationImpl(IntrinsicsKt.intercepted(uCont$iv), 1);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     cancellable$iv.initCancellability();
/* 103 */     CancellableContinuation<? super Unit> co = (CancellableContinuation)cancellable$iv; int $i$a$-suspendCancellableCoroutine-Latch$await$2 = 0; SynchronizedObject lock$iv = this.lock; int $i$f$synchronized = 0;
/* 104 */     synchronized (lock$iv) { int $i$a$-synchronized-Latch$await$2$1 = 0; boolean bool = this.awaiters.add(co); }
/* 105 */      co.invokeOnCancellation(new Latch$await$2$2(co)); if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) DebugProbesKt.probeCoroutineSuspended($completion);  if (cancellable$iv.getResult() == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return cancellable$iv.getResult();  cancellable$iv.getResult();
/* 106 */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\003\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 SynchronizedObject.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt__SynchronizedObject_jvmKt\n*L\n1#1,91:1\n26#2:92\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:92\n*E\n"})
/*     */   static final class Latch$await$2$2 extends Lambda implements Function1<Throwable, Unit> {
/*     */     public final void invoke(@Nullable Throwable it) {
/*     */       SynchronizedObject synchronizedObject = Latch.this.lock;
/*     */       Latch latch = Latch.this;
/*     */       CancellableContinuation<Unit> cancellableContinuation = this.$co;
/*     */       int $i$f$synchronized = 0;
/*     */       synchronized (synchronizedObject) {
/*     */         int $i$a$-synchronized-Latch$await$2$2$1 = 0;
/*     */         latch.awaiters.remove(cancellableContinuation);
/*     */         Unit unit = Unit.INSTANCE;
/*     */       } 
/*     */     }
/*     */     
/*     */     Latch$await$2$2(CancellableContinuation<Unit> $co) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Latch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */