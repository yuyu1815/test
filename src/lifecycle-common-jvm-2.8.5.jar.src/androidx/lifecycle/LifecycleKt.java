/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.SupervisorKt;
/*     */ import kotlinx.coroutines.channels.ProduceKt;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\033\020\005\032\b\022\004\022\0020\0070\006*\0020\0028F¢\006\006\032\004\b\b\020\t¨\006\n"}, d2 = {"coroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "Landroidx/lifecycle/Lifecycle;", "getCoroutineScope", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LifecycleCoroutineScope;", "eventFlow", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/Lifecycle$Event;", "getEventFlow", "(Landroidx/lifecycle/Lifecycle;)Lkotlinx/coroutines/flow/Flow;", "lifecycle-common"})
/*     */ public final class LifecycleKt
/*     */ {
/*     */   @NotNull
/*     */   public static final LifecycleCoroutineScope getCoroutineScope(@NotNull Lifecycle $this$coroutineScope) {
/* 322 */     Intrinsics.checkNotNullParameter($this$coroutineScope, "<this>"); while (true) {
/* 323 */       LifecycleCoroutineScopeImpl existing = (LifecycleCoroutineScopeImpl)$this$coroutineScope.getInternalScopeRef().get();
/* 324 */       if (existing != null) {
/* 325 */         return existing;
/*     */       }
/* 327 */       LifecycleCoroutineScopeImpl newScope = new LifecycleCoroutineScopeImpl(
/* 328 */           $this$coroutineScope, 
/* 329 */           SupervisorKt.SupervisorJob$default(null, 1, null).plus((CoroutineContext)Dispatchers.getMain().getImmediate()));
/*     */       
/* 331 */       if ($this$coroutineScope.getInternalScopeRef().compareAndSet(null, newScope)) {
/* 332 */         newScope.register();
/* 333 */         return newScope;
/*     */       } 
/*     */     } 
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
/*     */   @NotNull
/*     */   public static final Flow<Lifecycle.Event> getEventFlow(@NotNull Lifecycle $this$eventFlow)
/*     */   {
/* 383 */     Intrinsics.checkNotNullParameter($this$eventFlow, "<this>");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 389 */     return FlowKt.flowOn(FlowKt.callbackFlow(new LifecycleKt$eventFlow$1($this$eventFlow, null)), (CoroutineContext)Dispatchers.getMain().getImmediate()); } @DebugMetadata(f = "Lifecycle.kt", l = {388}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.LifecycleKt$eventFlow$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/lifecycle/Lifecycle$Event;"}) @SourceDebugExtension({"SMAP\nLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycle.kt\nandroidx/lifecycle/LifecycleKt$eventFlow$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,390:1\n1#2:391\n*E\n"}) static final class LifecycleKt$eventFlow$1 extends SuspendLambda implements Function2<ProducerScope<? super Lifecycle.Event>, Continuation<? super Unit>, Object> { @Nullable public final Object invokeSuspend(@NotNull Object $result) { ProducerScope $this$callbackFlow; LifecycleEventObserver observer, lifecycleEventObserver1; Lifecycle lifecycle; LifecycleEventObserver it; int $i$a$-also-LifecycleKt$eventFlow$1$observer$2; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) {
/*     */         case 0:
/* 391 */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0; lifecycleEventObserver1 = $this$callbackFlow::invokeSuspend$lambda$0; lifecycle = this.$this_eventFlow; it = lifecycleEventObserver1; $i$a$-also-LifecycleKt$eventFlow$1$observer$2 = 0;
/*     */           lifecycle.addObserver(it);
/*     */           observer = lifecycleEventObserver1;
/*     */           this.label = 1;
/*     */           if (ProduceKt.awaitClose($this$callbackFlow, new Function0<Unit>(this.$this_eventFlow, observer) {
/*     */                 public final void invoke() {
/*     */                   this.$this_eventFlow.removeObserver(this.$observer);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           ProduceKt.awaitClose($this$callbackFlow, new Function0<Unit>(this.$this_eventFlow, observer) {
/*     */                 public final void invoke() {
/*     */                   this.$this_eventFlow.removeObserver(this.$observer);
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     LifecycleKt$eventFlow$1(Lifecycle $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LifecycleKt$eventFlow$1> $completion) {
/*     */       LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, $completion);
/*     */       lifecycleKt$eventFlow$1.L$0 = value;
/*     */       return (Continuation<Unit>)lifecycleKt$eventFlow$1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ProducerScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((LifecycleKt$eventFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, LifecycleOwner param1LifecycleOwner, Lifecycle.Event event) {
/*     */       $$this$callbackFlow.trySend-JP2dKIU(event);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\LifecycleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */