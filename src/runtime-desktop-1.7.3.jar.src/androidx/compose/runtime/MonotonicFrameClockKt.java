/*     */ package androidx.compose.runtime;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\007\0327\020\007\032\002H\b\"\004\b\000\020\b2!\020\t\032\035\022\023\022\0210\013¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\002H\b0\nH@¢\006\002\020\017\0327\020\020\032\002H\b\"\004\b\000\020\b2!\020\t\032\035\022\023\022\0210\013¢\006\f\b\f\022\b\b\r\022\004\b\b(\021\022\004\022\002H\b0\nH@¢\006\002\020\017\032=\020\007\032\002H\b\"\004\b\000\020\b*\0020\0012#\b\004\020\t\032\035\022\023\022\0210\013¢\006\f\b\f\022\b\b\r\022\004\b\b(\016\022\004\022\002H\b0\nHH¢\006\002\020\022\"\036\020\000\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\003\020\004\032\004\b\005\020\006¨\006\023"}, d2 = {"monotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "withFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "frameTimeNanos", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime"})
/*     */ @SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
/*     */ public final class MonotonicFrameClockKt
/*     */ {
/*     */   @Nullable
/*     */   public static final <R> Object withFrameMillis(@NotNull MonotonicFrameClock $this$withFrameMillis, @NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<?> $completion) {
/*  66 */     int $i$f$withFrameMillis = 0; return $this$withFrameMillis.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(onFrame), $completion); } private static final <R> Object withFrameMillis$$forInline(MonotonicFrameClock $this$withFrameMillis, Function1<? super Long, ? extends R> onFrame, Continuation<?> $completion) { int $i$f$withFrameMillis = 0; InlineMarker.mark(0); InlineMarker.mark(1); return $this$withFrameMillis.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(onFrame), $completion); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176, d1 = {"\000\f\n\002\b\003\n\002\020\t\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}) @SourceDebugExtension({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt$withFrameMillis$2\n*L\n1#1,120:1\n*E\n"}) public static final class MonotonicFrameClockKt$withFrameMillis$2 extends Lambda implements Function1<Long, R> { public final R invoke(long it) { return (R)this.$onFrame.invoke(Long.valueOf(it / 1000000L)); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public MonotonicFrameClockKt$withFrameMillis$2(Function1<Long, R> $onFrame) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final <R> Object withFrameNanos(@NotNull Function1<? super Long, ?> onFrame, @NotNull Continuation<?> $completion) {
/*  87 */     return getMonotonicFrameClock($completion.getContext()).withFrameNanos(onFrame, $completion);
/*     */   }
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
/*     */   @Nullable
/*     */   public static final <R> Object withFrameMillis(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<?> $completion) {
/* 108 */     MonotonicFrameClock $this$withFrameMillis$iv = getMonotonicFrameClock($completion.getContext()); int $i$f$withFrameMillis = 0; return 
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
/* 121 */       $this$withFrameMillis$iv.withFrameNanos(new MonotonicFrameClockKt$withFrameMillis$2(onFrame), $completion);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MonotonicFrameClock getMonotonicFrameClock(@NotNull CoroutineContext $this$monotonicFrameClock) {
/*     */     Intrinsics.checkNotNullParameter($this$monotonicFrameClock, "<this>");
/*     */     if ((MonotonicFrameClock)$this$monotonicFrameClock.get(MonotonicFrameClock.Key) == null) {
/*     */       (MonotonicFrameClock)$this$monotonicFrameClock.get(MonotonicFrameClock.Key);
/*     */       throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
/*     */     } 
/*     */     return (MonotonicFrameClock)$this$monotonicFrameClock.get(MonotonicFrameClock.Key);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\MonotonicFrameClockKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */