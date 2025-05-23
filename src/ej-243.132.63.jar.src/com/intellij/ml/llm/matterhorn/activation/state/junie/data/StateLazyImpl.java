/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.DisposableEffectResult;
/*    */ import androidx.compose.runtime.DisposableEffectScope;
/*    */ import androidx.compose.runtime.EffectsKt;
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.SnapshotStateKt;
/*    */ import androidx.compose.runtime.State;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ import kotlinx.coroutines.flow.StateFlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\b\002\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002B%\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006\022\006\020\007\032\0028\000¢\006\004\b\b\020\tJ\023\020\017\032\b\022\004\022\0028\0000\020H\027¢\006\002\020\021R\024\020\n\032\b\022\004\022\0028\0000\013X\004¢\006\002\n\000R\024\020\f\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;", "T", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "flow", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)V", "sharedState", "Landroidx/compose/runtime/MutableState;", "subscriptionCount", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "observeState", "Landroidx/compose/runtime/State;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "state.junie.impl"})
/*    */ @SourceDebugExtension({"SMAP\nStateLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateLazy.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,69:1\n1225#2,6:70\n226#3,5:76\n63#4,5:81\n*S KotlinDebug\n*F\n+ 1 StateLazy.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl\n*L\n60#1:70,6\n61#1:76,5\n62#1:81,5\n*E\n"})
/*    */ final class StateLazyImpl<T> implements StateLazy<T> {
/*    */   @NotNull
/*    */   private final MutableState<T> sharedState;
/*    */   @NotNull
/*    */   private final MutableStateFlow<Integer> subscriptionCount;
/*    */   
/* 41 */   public StateLazyImpl(@NotNull CoroutineScope cs, @NotNull Flow<? extends T> flow, Object initialValue) { this.sharedState = SnapshotStateKt.mutableStateOf$default(initialValue, null, 2, null);
/* 42 */     this.subscriptionCount = StateFlowKt.MutableStateFlow(Integer.valueOf(0));
/*    */ 
/*    */     
/* 45 */     BuildersKt.launch$default(cs, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(flow, null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(StateLazyImpl.this, this.$flow, $completion); } public final Object invokeSuspend(Object $result) { Flow $this$map$iv; int $i$f$map; Flow $this$unsafeTransform$iv$iv; int $i$f$unsafeTransform, $i$f$unsafeFlow; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 46 */                 $this$map$iv = (Flow)StateLazyImpl.this.subscriptionCount; $i$f$map = 0;
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
/* 70 */                 $this$unsafeTransform$iv$iv = $this$map$iv; $i$f$unsafeTransform = 0;
/* 71 */                 $i$f$unsafeFlow = 0; this.label = 1;
/* 72 */                 if (FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateLazyImpl$1$invokeSuspend$$inlined$map$1($this$unsafeTransform$iv$iv)), new Function2<Boolean, Continuation<? super Unit>, Object>(StateLazyImpl.this, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                         //   3: astore_3
/*    */                         //   4: aload_0
/*    */                         //   5: getfield label : I
/*    */                         //   8: tableswitch default -> 94, 0 -> 32, 1 -> 84
/*    */                         //   32: aload_1
/*    */                         //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                         //   36: aload_0
/*    */                         //   37: getfield Z$0 : Z
/*    */                         //   40: istore_2
/*    */                         //   41: iload_2
/*    */                         //   42: ifeq -> 90
/*    */                         //   45: aload_0
/*    */                         //   46: getfield $flow : Lkotlinx/coroutines/flow/Flow;
/*    */                         //   49: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2$1
/*    */                         //   52: dup
/*    */                         //   53: aload_0
/*    */                         //   54: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;
/*    */                         //   57: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;)V
/*    */                         //   60: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */                         //   63: aload_0
/*    */                         //   64: checkcast kotlin/coroutines/Continuation
/*    */                         //   67: aload_0
/*    */                         //   68: iconst_1
/*    */                         //   69: putfield label : I
/*    */                         //   72: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                         //   77: dup
/*    */                         //   78: aload_3
/*    */                         //   79: if_acmpne -> 89
/*    */                         //   82: aload_3
/*    */                         //   83: areturn
/*    */                         //   84: aload_1
/*    */                         //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                         //   88: aload_1
/*    */                         //   89: pop
/*    */                         //   90: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                         //   93: areturn
/*    */                         //   94: new java/lang/IllegalStateException
/*    */                         //   97: dup
/*    */                         //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                         //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */                         //   103: athrow
/*    */                         // Line number table:
/*    */                         //   Java source line number -> byte code offset
/*    */                         //   #48	-> 3
/*    */                         //   #49	-> 41
/*    */                         //   #50	-> 45
/*    */                         //   #48	-> 82
/*    */                         //   #54	-> 89
/*    */                         //   #48	-> 94
/*    */                         // Local variable table:
/*    */                         //   start	length	slot	name	descriptor
/*    */                         //   41	4	2	hasSubscribers	Z
/*    */                         //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2;
/* 72 */                         //   36	58	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$flow, StateLazyImpl.this, $completion); function2.Z$0 = ((Boolean)value).booleanValue(); return (Continuation)function2; } public final Object invoke(boolean p1, Continuation<?> p2) { return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateLazyImpl$1$invokeSuspend$$inlined$map$1($this$unsafeTransform$iv$iv)), new Function2<Boolean, Continuation<? super Unit>, Object>(StateLazyImpl.this, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*    */                         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */                         //   3: astore_3
/*    */                         //   4: aload_0
/*    */                         //   5: getfield label : I
/*    */                         //   8: tableswitch default -> 94, 0 -> 32, 1 -> 84
/*    */                         //   32: aload_1
/*    */                         //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                         //   36: aload_0
/*    */                         //   37: getfield Z$0 : Z
/*    */                         //   40: istore_2
/*    */                         //   41: iload_2
/*    */                         //   42: ifeq -> 90
/*    */                         //   45: aload_0
/*    */                         //   46: getfield $flow : Lkotlinx/coroutines/flow/Flow;
/*    */                         //   49: new com/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2$1
/*    */                         //   52: dup
/*    */                         //   53: aload_0
/*    */                         //   54: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;
/*    */                         //   57: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl;)V
/*    */                         //   60: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */                         //   63: aload_0
/*    */                         //   64: checkcast kotlin/coroutines/Continuation
/*    */                         //   67: aload_0
/*    */                         //   68: iconst_1
/*    */                         //   69: putfield label : I
/*    */                         //   72: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */                         //   77: dup
/*    */                         //   78: aload_3
/*    */                         //   79: if_acmpne -> 89
/*    */                         //   82: aload_3
/*    */                         //   83: areturn
/*    */                         //   84: aload_1
/*    */                         //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */                         //   88: aload_1
/*    */                         //   89: pop
/*    */                         //   90: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */                         //   93: areturn
/*    */                         //   94: new java/lang/IllegalStateException
/*    */                         //   97: dup
/*    */                         //   98: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */                         //   100: invokespecial <init> : (Ljava/lang/String;)V
/*    */                         //   103: athrow
/*    */                         // Line number table:
/*    */                         //   Java source line number -> byte code offset
/*    */                         //   #48	-> 3
/*    */                         //   #49	-> 41
/*    */                         //   #50	-> 45
/*    */                         //   #48	-> 82
/*    */                         //   #54	-> 89
/*    */                         //   #48	-> 94
/*    */                         // Local variable table:
/*    */                         //   start	length	slot	name	descriptor
/*    */                         //   41	4	2	hasSubscribers	Z
/*    */                         //   0	104	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazyImpl$1$2;
/* 72 */                         //   36	58	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$flow, StateLazyImpl.this, $completion); function2.Z$0 = ((Boolean)value).booleanValue(); return (Continuation)function2; } public final Object invoke(boolean p1, Continuation<?> p2) { return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); } @Composable @NotNull public State<T> observeState(@Nullable Composer $composer, int $changed) { $composer.startReplaceGroup(-1014658464); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1014658464, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.data.StateLazyImpl.observeState (StateLazy.kt:58)");  $composer.startReplaceGroup(647475033); Composer composer = $composer; boolean invalid$iv = $composer.changedInstance(this); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0; StateLazyImpl stateLazyImpl = this; int $i$a$-cache-StateLazyImpl$observeState$1 = 0; Object value$iv = this::observeState$lambda$4$lambda$3;
/* 73 */     composer.updateRememberedValue(value$iv);
/* 74 */     Function1 function1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 75 */       (Function1)it$iv; $composer.endReplaceGroup(); EffectsKt.DisposableEffect(stateLazyImpl, function1, $composer, 0xE & $changed); MutableState<T> mutableState = this.sharedState; if (ComposerKt.isTraceInProgress())
/*    */       ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (State<T>)mutableState; } private static final DisposableEffectResult observeState$lambda$4$lambda$3(StateLazyImpl this$0, DisposableEffectScope $this$DisposableEffect) { Intrinsics.checkNotNullParameter($this$DisposableEffect, "$this$DisposableEffect"); MutableStateFlow<Integer> $this$update$iv = this$0.subscriptionCount; int $i$f$update = 0; while (true) {
/* 77 */       Object prevValue$iv = $this$update$iv.getValue();
/* 78 */       int it = ((Number)prevValue$iv).intValue(), $i$a$-update-StateLazyImpl$observeState$1$1$1 = 0; Object nextValue$iv = Integer.valueOf(it + 1);
/* 79 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) {
/*    */         DisposableEffectScope this_$iv = $this$DisposableEffect;
/*    */         int $i$f$onDispose = 0;
/*    */       } 
/*    */     }  }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\StateLazyImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */