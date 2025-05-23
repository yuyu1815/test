/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\b\001\030\000 \f*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002:\001\fB\033\022\022\020\003\032\016\022\n\022\b\022\004\022\0028\0000\0020\004¢\006\004\b\005\020\006J\030\020\007\032\f\022\004\022\0028\000\022\002\b\0030\bH@¢\006\002\020\tJ\b\020\n\032\0020\013H\026R\032\020\003\032\016\022\n\022\b\022\004\022\0028\0000\0020\004X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle;", "Err", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "handles", "", "<init>", "(Ljava/util/List;)V", "awaitOpResult", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "Companion", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nCompoundOpHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1863#2,2:35\n*S KotlinDebug\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle\n*L\n26#1:35,2\n*E\n"})
/*    */ public final class CompoundOpHandle<Err> implements OpHandle<Err> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 11 */   public CompoundOpHandle(@NotNull List<OpHandle<Err>> handles) { this.handles = handles; } @NotNull private final List<OpHandle<Err>> handles; public static final int $stable = 8; @Nullable public Object awaitOpResult(@NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_1
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 156, 0 -> 88, 1 -> 127
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: new com/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1
/*    */     //   95: dup
/*    */     //   96: aload_0
/*    */     //   97: aconst_null
/*    */     //   98: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle;Lkotlin/coroutines/Continuation;)V
/*    */     //   101: checkcast kotlin/jvm/functions/Function2
/*    */     //   104: invokestatic channelFlow : (Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   107: aload #4
/*    */     //   109: aload #4
/*    */     //   111: iconst_1
/*    */     //   112: putfield label : I
/*    */     //   115: invokestatic firstOrNull : (Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   118: dup
/*    */     //   119: aload #5
/*    */     //   121: if_acmpne -> 132
/*    */     //   124: aload #5
/*    */     //   126: areturn
/*    */     //   127: aload_3
/*    */     //   128: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   131: aload_3
/*    */     //   132: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*    */     //   135: astore_2
/*    */     //   136: aload_2
/*    */     //   137: dup
/*    */     //   138: ifnonnull -> 155
/*    */     //   141: pop
/*    */     //   142: new com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*    */     //   145: dup
/*    */     //   146: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   149: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   152: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*    */     //   155: areturn
/*    */     //   156: new java/lang/IllegalStateException
/*    */     //   159: dup
/*    */     //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   162: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   165: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 59
/*    */     //   #14	-> 92
/*    */     //   #21	-> 109
/*    */     //   #13	-> 124
/*    */     //   #14	-> 135
/*    */     //   #22	-> 136
/*    */     //   #13	-> 156
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	17	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle;
/*    */     //   136	5	2	firstErr	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*    */     //   0	166	1	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	106	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	100	3	$result	Ljava/lang/Object; } @DebugMetadata(f = "CompoundOpHandle.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.CompoundOpHandle$awaitOpResult$firstErr$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001\"\006\b\000\020\002 \001*\022\022\016\022\f\022\004\022\002H\002\022\002\b\0030\0040\003H\n"}, d2 = {"<anonymous>", "", "Err", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;"}) @SourceDebugExtension({"SMAP\nCompoundOpHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1863#2,2:35\n*S KotlinDebug\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$awaitOpResult$firstErr$1\n*L\n15#1:35,2\n*E\n"}) static final class CompoundOpHandle$awaitOpResult$firstErr$1 extends SuspendLambda implements Function2<ProducerScope<? super OpResult<? extends Err, ?>>, Continuation<? super Unit>, Object>
/*    */   {
/*    */     int label; CompoundOpHandle$awaitOpResult$firstErr$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { ProducerScope<? super OpResult<? extends Err, ?>> $this$channelFlow; Iterable $this$forEach$iv; int $i$f$forEach; Iterator iterator;
/* 14 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$channelFlow = (ProducerScope)this.L$0;
/* 15 */           $this$forEach$iv = CompoundOpHandle.this.handles; $i$f$forEach = 0;
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
/* 35 */           iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); OpHandle<? extends Err> handle = (OpHandle)element$iv; int $i$a$-forEach-CompoundOpHandle$awaitOpResult$firstErr$1$1 = 0; BuildersKt.launch$default((CoroutineScope)$this$channelFlow, null, null, new CompoundOpHandle$awaitOpResult$firstErr$1$1$1(handle, $this$channelFlow, null), 3, null); }  return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super CompoundOpHandle$awaitOpResult$firstErr$1> $completion) { CompoundOpHandle$awaitOpResult$firstErr$1 compoundOpHandle$awaitOpResult$firstErr$1 = new CompoundOpHandle$awaitOpResult$firstErr$1($completion); compoundOpHandle$awaitOpResult$firstErr$1.L$0 = value; return (Continuation<Unit>)compoundOpHandle$awaitOpResult$firstErr$1; } public final Object invoke(ProducerScope p1, Continuation<?> p2) { return ((CompoundOpHandle$awaitOpResult$firstErr$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } public void cancel() { Iterable<OpHandle<Err>> $this$forEach$iv = this.handles; int $i$f$forEach = 0; Iterator<OpHandle<Err>> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object<Err> element$iv = (Object<Err>)iterator.next(); OpHandle it = (OpHandle)element$iv; int $i$a$-forEach-CompoundOpHandle$cancel$1 = 0; it.cancel(); }  } @DebugMetadata(f = "CompoundOpHandle.kt", l = {21}, i = {}, s = {}, n = {}, m = "awaitOpResult", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.CompoundOpHandle") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class CompoundOpHandle$awaitOpResult$1 extends ContinuationImpl { int label; CompoundOpHandle$awaitOpResult$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return CompoundOpHandle.this.awaitOpResult((Continuation<? super OpResult<? extends Err, ?>>)this); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J7\020\004\032\b\022\004\022\002H\0060\005\"\004\b\001\020\0062\036\020\007\032\020\022\f\b\001\022\b\022\004\022\002H\0060\0050\b\"\b\022\004\022\002H\0060\005¢\006\002\020\tJI\020\n\032\016\022\n\022\b\022\004\022\002H\0060\0050\013\"\004\b\001\020\0062*\020\f\032\026\022\022\b\001\022\016\022\n\022\b\022\004\022\002H\0060\0050\0130\b\"\016\022\n\022\b\022\004\022\002H\0060\0050\013¢\006\002\020\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion;", "", "<init>", "()V", "of", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Err", "handles", "", "([Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "callableOf", "Lkotlin/Function0;", "callables", "([Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", "state.junie.impl"}) @SourceDebugExtension({"SMAP\nCompoundOpHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n11165#2:35\n11500#2,3:36\n*S KotlinDebug\n*F\n+ 1 CompoundOpHandle.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/activity/CompoundOpHandle$Companion\n*L\n31#1:35\n31#1:36,3\n*E\n"}) public static final class Companion { private Companion() {} private static final CompoundOpHandle callableOf$lambda$1(Function0[] $callables) { Function0[] arrayOfFunction01 = $callables; int $i$f$map = 0; Function0[] arrayOfFunction02 = arrayOfFunction01; Collection<OpHandle> destination$iv$iv = new ArrayList(arrayOfFunction01.length); int $i$f$mapTo = 0; byte b; int i;
/* 36 */       for (b = 0, i = arrayOfFunction02.length; b < i; ) { Object item$iv$iv = arrayOfFunction02[b];
/* 37 */         Object object1 = item$iv$iv; Collection<OpHandle> collection = destination$iv$iv; int $i$a$-map-CompoundOpHandle$Companion$callableOf$1$1 = 0; collection.add((OpHandle)object1.invoke()); }
/* 38 */        List<? extends OpHandle<?>> list = (List)destination$iv$iv;
/*    */       return new CompoundOpHandle(list); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final <Err> OpHandle<Err> of(@NotNull OpHandle... handles) {
/*    */       Intrinsics.checkNotNullParameter(handles, "handles");
/*    */       return new CompoundOpHandle<>(ArraysKt.toList((Object[])handles));
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final <Err> Function0<OpHandle<Err>> callableOf(@NotNull Function0... callables) {
/*    */       Intrinsics.checkNotNullParameter(callables, "callables");
/*    */       return callables::callableOf$lambda$1;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\CompoundOpHandle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */