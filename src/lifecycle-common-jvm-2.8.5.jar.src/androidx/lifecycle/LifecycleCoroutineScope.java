/*    */ package androidx.lifecycle;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.Job;
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
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\030\002\n\002\b\004\b&\030\0002\0020\001B\007\b\000¢\006\002\020\002J6\020\007\032\0020\b2'\020\t\032#\b\001\022\004\022\0020\001\022\n\022\b\022\004\022\0020\f0\013\022\006\022\004\030\0010\r0\n¢\006\002\b\016H\007¢\006\002\020\017J6\020\020\032\0020\b2'\020\t\032#\b\001\022\004\022\0020\001\022\n\022\b\022\004\022\0020\f0\013\022\006\022\004\030\0010\r0\n¢\006\002\b\016H\007¢\006\002\020\017J6\020\021\032\0020\b2'\020\t\032#\b\001\022\004\022\0020\001\022\n\022\b\022\004\022\0020\f0\013\022\006\022\004\030\0010\r0\n¢\006\002\b\016H\007¢\006\002\020\017R\022\020\003\032\0020\004X \004¢\006\006\032\004\b\005\020\006¨\006\022"}, d2 = {"Landroidx/lifecycle/LifecycleCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle$lifecycle_common", "()Landroidx/lifecycle/Lifecycle;", "launchWhenCreated", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "launchWhenResumed", "launchWhenStarted", "lifecycle-common"})
/*    */ public abstract class LifecycleCoroutineScope
/*    */   implements CoroutineScope
/*    */ {
/*    */   @NotNull
/*    */   public abstract Lifecycle getLifecycle$lifecycle_common();
/*    */   
/*    */   @Deprecated(message = "launchWhenCreated is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.CREATED.")
/*    */   @NotNull
/*    */   public final Job launchWhenCreated(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
/* 54 */     Intrinsics.checkNotNullParameter(block, "block"); return BuildersKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(block, null), 3, null); } @DebugMetadata(f = "Lifecycle.jvm.kt", l = {55}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LifecycleCoroutineScope$launchWhenCreated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; LifecycleCoroutineScope$launchWhenCreated$1(Function2<CoroutineScope, Continuation<? super Unit>, Object> $block, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 55 */           this.label = 1; if (PausingDispatcherKt.whenCreated(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this) == object) return object;  PausingDispatcherKt.whenCreated(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this);
/* 56 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LifecycleCoroutineScope$launchWhenCreated$1> $completion) {
/*    */       return (Continuation<Unit>)new LifecycleCoroutineScope$launchWhenCreated$1(this.$block, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((LifecycleCoroutineScope$launchWhenCreated$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   
/*    */   @Deprecated(message = "launchWhenStarted is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.STARTED.")
/*    */   @NotNull
/* 73 */   public final Job launchWhenStarted(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) { Intrinsics.checkNotNullParameter(block, "block"); return BuildersKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(block, null), 3, null); } @DebugMetadata(f = "Lifecycle.jvm.kt", l = {74}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LifecycleCoroutineScope$launchWhenStarted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 74 */           this.label = 1; if (PausingDispatcherKt.whenStarted(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this) == object) return object;  PausingDispatcherKt.whenStarted(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this);
/* 75 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */      LifecycleCoroutineScope$launchWhenStarted$1(Function2<CoroutineScope, Continuation<? super Unit>, Object> $block, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LifecycleCoroutineScope$launchWhenStarted$1> $completion) {
/*    */       return (Continuation<Unit>)new LifecycleCoroutineScope$launchWhenStarted$1(this.$block, $completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((LifecycleCoroutineScope$launchWhenStarted$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   @Deprecated(message = "launchWhenResumed is deprecated as it can lead to wasted resources in some cases. Replace with suspending repeatOnLifecycle to run the block whenever the Lifecycle state is at least Lifecycle.State.RESUMED.")
/*    */   @NotNull
/*    */   public final Job launchWhenResumed(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
/* 92 */     Intrinsics.checkNotNullParameter(block, "block"); return BuildersKt.launch$default(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(block, null), 3, null); } @DebugMetadata(f = "Lifecycle.jvm.kt", l = {93}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1") @Metadata(mv = {1, 8, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class LifecycleCoroutineScope$launchWhenResumed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; LifecycleCoroutineScope$launchWhenResumed$1(Function2<CoroutineScope, Continuation<? super Unit>, Object> $block, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 93 */           this.label = 1; if (PausingDispatcherKt.whenResumed(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this) == object) return object;  PausingDispatcherKt.whenResumed(LifecycleCoroutineScope.this.getLifecycle$lifecycle_common(), this.$block, (Continuation<? super Unit>)this);
/* 94 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super LifecycleCoroutineScope$launchWhenResumed$1> $completion) {
/*    */       return (Continuation<Unit>)new LifecycleCoroutineScope$launchWhenResumed$1(this.$block, $completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*    */       return ((LifecycleCoroutineScope$launchWhenResumed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\LifecycleCoroutineScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */