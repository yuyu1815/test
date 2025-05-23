/*     */ package androidx.lifecycle;
/*     */ 
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Dispatchers;
/*     */ import kotlinx.coroutines.Job;
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
/*     */ @Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\0000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\032A\020\000\032\002H\001\"\004\b\000\020\001*\0020\0022'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\t\032A\020\000\032\002H\001\"\004\b\000\020\001*\0020\n2'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\013\032A\020\f\032\002H\001\"\004\b\000\020\001*\0020\0022'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\t\032A\020\f\032\002H\001\"\004\b\000\020\001*\0020\n2'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\013\032A\020\r\032\002H\001\"\004\b\000\020\001*\0020\0022'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\t\032A\020\r\032\002H\001\"\004\b\000\020\001*\0020\n2'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\013\032I\020\016\032\002H\001\"\004\b\000\020\001*\0020\0022\006\020\017\032\0020\0202'\020\003\032#\b\001\022\004\022\0020\005\022\n\022\b\022\004\022\002H\0010\006\022\006\022\004\030\0010\0070\004¢\006\002\b\bH@¢\006\002\020\021¨\006\022"}, d2 = {"whenCreated", "T", "Landroidx/lifecycle/Lifecycle;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "whenResumed", "whenStarted", "whenStateAtLeast", "minState", "Landroidx/lifecycle/Lifecycle$State;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-common"})
/*     */ @JvmName(name = "PausingDispatcherKt")
/*     */ public final class PausingDispatcherKt
/*     */ {
/*     */   @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenCreated(@NotNull LifecycleOwner $this$whenCreated, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/*  42 */     return whenCreated($this$whenCreated.getLifecycle(), block, $completion);
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
/*     */   @Deprecated(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenCreated(@NotNull Lifecycle $this$whenCreated, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/*  56 */     return whenStateAtLeast($this$whenCreated, Lifecycle.State.CREATED, block, $completion);
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
/*     */   @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenStarted(@NotNull LifecycleOwner $this$whenStarted, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/*  72 */     return whenStarted($this$whenStarted.getLifecycle(), block, $completion);
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
/*     */   @Deprecated(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenStarted(@NotNull Lifecycle $this$whenStarted, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/*  86 */     return whenStateAtLeast($this$whenStarted, Lifecycle.State.STARTED, block, $completion);
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
/*     */   @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenResumed(@NotNull LifecycleOwner $this$whenResumed, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/* 102 */     return whenResumed($this$whenResumed.getLifecycle(), block, $completion);
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
/*     */   @Deprecated(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenResumed(@NotNull Lifecycle $this$whenResumed, @NotNull Function2<? super CoroutineScope, ? super Continuation<?>, ? extends Object> block, @NotNull Continuation<?> $completion) {
/* 116 */     return whenStateAtLeast($this$whenResumed, Lifecycle.State.RESUMED, block, $completion);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
/*     */   @Nullable
/*     */   public static final <T> Object whenStateAtLeast(@NotNull Lifecycle $this$whenStateAtLeast, @NotNull Lifecycle.State minState, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block, @NotNull Continuation $completion)
/*     */   {
/* 199 */     return BuildersKt.withContext((CoroutineContext)Dispatchers.getMain().getImmediate(), new PausingDispatcherKt$whenStateAtLeast$2($this$whenStateAtLeast, minState, block, null), $completion); } @DebugMetadata(f = "PausingDispatcher.jvm.kt", l = {205}, i = {0}, s = {"L$0"}, n = {"controller"}, m = "invokeSuspend", c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}) static final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> { @Nullable public final Object invokeSuspend(@NotNull Object $result) { CoroutineScope $this$withContext; Job job; PausingDispatcher dispatcher; LifecycleController controller; Object object1, object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$withContext = (CoroutineScope)this.L$0;
/* 200 */           if ((Job)$this$withContext.getCoroutineContext().get((CoroutineContext.Key)Job.Key) == null) { (Job)$this$withContext.getCoroutineContext().get((CoroutineContext.Key)Job.Key); throw new IllegalStateException("when[State] methods should have a parent job".toString()); }
/* 201 */            dispatcher = new PausingDispatcher();
/* 202 */           controller = 
/* 203 */             new LifecycleController(this.$this_whenStateAtLeast, this.$minState, dispatcher.dispatchQueue, job);
/*     */           
/* 205 */           try { this.L$0 = controller; this.label = 1; if (BuildersKt.withContext((CoroutineContext)dispatcher, this.$block, (Continuation)this) == object2) return object2;  object1 = BuildersKt.withContext((CoroutineContext)dispatcher, this.$block, (Continuation)this); }
/*     */           finally
/* 207 */           { controller.finish(); }  return object1;case 1: controller = (LifecycleController)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); object1 = SYNTHETIC_LOCAL_VARIABLE_1; controller.finish(); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     PausingDispatcherKt$whenStateAtLeast$2(Lifecycle $receiver, Lifecycle.State $minState, Function2<CoroutineScope, Continuation<? super T>, Object> $block, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super PausingDispatcherKt$whenStateAtLeast$2> $completion) {
/*     */       PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, $completion);
/*     */       pausingDispatcherKt$whenStateAtLeast$2.L$0 = value;
/*     */       return (Continuation<Unit>)pausingDispatcherKt$whenStateAtLeast$2;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((PausingDispatcherKt$whenStateAtLeast$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\PausingDispatcherKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */