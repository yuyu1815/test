/*    */ package ai.grazie.utils.mpp.time;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\t\n\000\032\022\020\000\032\0020\001*\0020\002H@¢\006\002\020\003\032\022\020\004\032\0020\001*\0020\002H@¢\006\002\020\003\032\n\020\005\032\0020\006*\0020\007¨\006\b"}, d2 = {"delay", "", "Lai/grazie/utils/mpp/time/Duration;", "(Lai/grazie/utils/mpp/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delayInTests", "toTimestamp", "Lai/grazie/utils/mpp/time/Timestamp;", "", "utils-common"})
/*    */ public final class ExtensionsKt {
/*    */   @NotNull
/*  6 */   public static final Timestamp toTimestamp(long $this$toTimestamp) { return new Timestamp($this$toTimestamp); } @Nullable
/*    */   public static final Object delay(@NotNull Duration $this$delay, @NotNull Continuation $completion) {
/*  8 */     if (DelayKt.delay($this$delay.getMillis(), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return DelayKt.delay($this$delay.getMillis(), $completion);  DelayKt.delay($this$delay.getMillis(), $completion); return Unit.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final Object delayInTests(@NotNull Duration $this$delayInTests, @NotNull Continuation $completion) {
/* 15 */     long millis = $this$delayInTests.getMillis();
/* 16 */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new ExtensionsKt$delayInTests$2(millis, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new ExtensionsKt$delayInTests$2(millis, null), $completion);  BuildersKt.withContext((CoroutineContext)Dispatchers.getDefault(), new ExtensionsKt$delayInTests$2(millis, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "Extensions.kt", l = {17}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.mpp.time.ExtensionsKt$delayInTests$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class ExtensionsKt$delayInTests$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; ExtensionsKt$delayInTests$2(long $millis, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 17 */           this.label = 1; if (DelayKt.delay(this.$millis, (Continuation)this) == object) return object;  DelayKt.delay(this.$millis, (Continuation)this);
/* 18 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super ExtensionsKt$delayInTests$2> $completion) {
/*    */       return (Continuation<Unit>)new ExtensionsKt$delayInTests$2(this.$millis, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((ExtensionsKt$delayInTests$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\time\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */