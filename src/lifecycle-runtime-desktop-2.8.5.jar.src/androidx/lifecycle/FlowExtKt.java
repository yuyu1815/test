/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ import kotlinx.coroutines.channels.SendChannel;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.FlowKt;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\032.\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\0012\006\020\003\032\0020\0042\b\b\002\020\005\032\0020\006¨\006\007"}, d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", "T", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime"})
/*    */ public final class FlowExtKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> Flow<T> flowWithLifecycle(@NotNull Flow<? extends T> $this$flowWithLifecycle, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minActiveState) {
/* 90 */     Intrinsics.checkNotNullParameter($this$flowWithLifecycle, "<this>"); Intrinsics.checkNotNullParameter(lifecycle, "lifecycle"); Intrinsics.checkNotNullParameter(minActiveState, "minActiveState"); return FlowKt.callbackFlow(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, $this$flowWithLifecycle, null)); } @DebugMetadata(f = "FlowExt.kt", l = {91}, i = {0}, s = {"L$0"}, n = {"$this$callbackFlow"}, m = "invokeSuspend", c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}) static final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> { int label; FlowExtKt$flowWithLifecycle$1(Lifecycle $lifecycle, Lifecycle.State $minActiveState, Flow<T> $receiver, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { ProducerScope<? super T> producerScope; ProducerScope $this$callbackFlow; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); producerScope = (ProducerScope)this.L$0;
/* 91 */           this.L$0 = producerScope; this.label = 1; if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$this_flowWithLifecycle, producerScope, null) { int label; @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$this_flowWithLifecycle, this.$$this$callbackFlow, $completion); } @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 92 */                       this.label = 1; if (this.$this_flowWithLifecycle.collect(new FlowCollector(this.$$this$callbackFlow) { @Nullable
/* 93 */                             public final Object emit(Object it, @NotNull Continuation $completion) { if (this.$$this$callbackFlow.send(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$$this$callbackFlow.send(it, $completion);  this.$$this$callbackFlow.send(it, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$this_flowWithLifecycle.collect(new FlowCollector(this.$$this$callbackFlow) { @Nullable public final Object emit(Object it, @NotNull Continuation $completion) { if (this.$$this$callbackFlow.send(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$$this$callbackFlow.send(it, $completion);  this.$$this$callbackFlow.send(it, $completion); return Unit.INSTANCE; } }
/*    */                           (Continuation)this);
/* 95 */                       return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation<? super Unit>)this) == object) return object;  RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$this_flowWithLifecycle, producerScope, null) { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (this.$this_flowWithLifecycle.collect(new FlowCollector(this.$$this$callbackFlow) { @Nullable public final Object emit(Object it, @NotNull Continuation $completion) { if (this.$$this$callbackFlow.send(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$$this$callbackFlow.send(it, $completion);  this.$$this$callbackFlow.send(it, $completion); return Unit.INSTANCE; } }(Continuation)this) == object) return object;  this.$this_flowWithLifecycle.collect(new FlowCollector(this.$$this$callbackFlow) { @Nullable public final Object emit(Object it, @NotNull Continuation $completion) { if (this.$$this$callbackFlow.send(it, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.$$this$callbackFlow.send(it, $completion);  this.$$this$callbackFlow.send(it, $completion); return Unit.INSTANCE; } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$this_flowWithLifecycle, this.$$this$callbackFlow, $completion); }
/* 96 */                 @Nullable public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation<? super Unit>)this); SendChannel.DefaultImpls.close$default((SendChannel)producerScope, null, 1, null);
/* 97 */           return Unit.INSTANCE;case 1: $this$callbackFlow = (ProducerScope)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); SendChannel.DefaultImpls.close$default((SendChannel)$this$callbackFlow, null, 1, null); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super FlowExtKt$flowWithLifecycle$1> $completion) {
/*    */       FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, $completion);
/*    */       flowExtKt$flowWithLifecycle$1.L$0 = value;
/*    */       return (Continuation<Unit>)flowExtKt$flowWithLifecycle$1;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull ProducerScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((FlowExtKt$flowWithLifecycle$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-runtime-desktop-2.8.5.jar!\androidx\lifecycle\FlowExtKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */