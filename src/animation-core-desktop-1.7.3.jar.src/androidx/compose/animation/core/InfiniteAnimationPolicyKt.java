/*    */ package androidx.compose.animation.core;
/*    */ 
/*    */ import androidx.compose.runtime.MonotonicFrameClockKt;
/*    */ import androidx.compose.ui.platform.InfiniteAnimationPolicy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.InlineMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\024\n\002\b\003\n\002\030\002\n\002\020\t\n\002\030\002\n\002\b\006\0329\020\000\032\002H\001\"\004\b\000\020\0012#\b\004\020\002\032\035\022\023\022\0210\004¢\006\f\b\005\022\b\b\006\022\004\b\b(\007\022\004\022\002H\0010\003HH¢\006\002\020\b\0327\020\t\032\002H\001\"\004\b\000\020\0012!\020\002\032\035\022\023\022\0210\004¢\006\f\b\005\022\b\b\006\022\004\b\b(\n\022\004\022\002H\0010\003H@¢\006\002\020\b¨\006\013"}, d2 = {"withInfiniteAnimationFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withInfiniteAnimationFrameNanos", "frameTimeNanos", "animation-core"})
/*    */ public final class InfiniteAnimationPolicyKt
/*    */ {
/*    */   @Nullable
/*    */   public static final <R> Object withInfiniteAnimationFrameNanos(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation $completion) {
/* 29 */     InfiniteAnimationPolicy policy = (InfiniteAnimationPolicy)$completion.getContext().get((CoroutineContext.Key)InfiniteAnimationPolicy.Key);
/* 30 */     if (policy == null) return MonotonicFrameClockKt.withFrameNanos(onFrame, $completion); 
/* 31 */     return policy.onInfiniteOperation(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(onFrame, null), $completion); } @DebugMetadata(f = "InfiniteAnimationPolicy.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\004\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\001H@"}, d2 = {"<anonymous>", "R"}) static final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2 extends SuspendLambda implements Function1<Continuation<? super R>, Object> { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (MonotonicFrameClockKt.withFrameNanos(this.$onFrame, (Continuation)this) == object) ? object : MonotonicFrameClockKt.withFrameNanos(this.$onFrame, (Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(Function1<Long, R> $onFrame, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     } @NotNull
/*    */     public final Continuation<Unit> create(@NotNull Continuation<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> $completion) {
/*    */       return (Continuation<Unit>)new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.$onFrame, $completion);
/*    */     } @Nullable
/*    */     public final Object invoke(@Nullable Continuation<?> p1) {
/*    */       return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } } @Nullable
/*    */   public static final <R> Object withInfiniteAnimationFrameMillis(@NotNull Function1<? super Long, ? extends R> onFrame, @NotNull Continuation<?> $completion) {
/* 41 */     int $i$f$withInfiniteAnimationFrameMillis = 0; return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(onFrame), $completion); } private static final <R> Object withInfiniteAnimationFrameMillis$$forInline(Function1<? super Long, ? extends R> onFrame, Continuation<?> $completion) { int $i$f$withInfiniteAnimationFrameMillis = 0; InlineMarker.mark(0); InlineMarker.mark(1); return withInfiniteAnimationFrameNanos(new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(onFrame), $completion); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 176, d1 = {"\000\f\n\002\b\003\n\002\020\t\n\002\b\002\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}) @SourceDebugExtension({"SMAP\nInfiniteAnimationPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfiniteAnimationPolicy.kt\nandroidx/compose/animation/core/InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2\n*L\n1#1,42:1\n*E\n"}) public static final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2 extends Lambda implements Function1<Long, R> { public InfiniteAnimationPolicyKt$withInfiniteAnimationFrameMillis$2(Function1<Long, R> $onFrame) { super(1); } public final R invoke(long it) { return (R)this.$onFrame.invoke(Long.valueOf(it / 1000000L)); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\InfiniteAnimationPolicyKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */