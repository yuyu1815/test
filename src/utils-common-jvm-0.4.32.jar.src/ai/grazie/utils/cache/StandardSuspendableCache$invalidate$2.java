/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$invalidate$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\b\002\n\002\020\000\020\000\032\n\022\004\022\002H\002\030\0010\001\"\b\b\000\020\003*\0020\004\"\b\b\001\020\002*\0020\004H@"}, d2 = {"<anonymous>", "Lai/grazie/utils/cache/CacheValue$WithTime$Default;", "Value", "Key", ""})
/*    */ final class StandardSuspendableCache$invalidate$2
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super CacheValue.WithTime.Default<Value>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   StandardSuspendableCache$invalidate$2(Object $key, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 27 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 28 */         return StandardSuspendableCache.access$getData$p(StandardSuspendableCache.this).remove(this.$key); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$invalidate$2> $completion) {
/*    */     return (Continuation<Unit>)new StandardSuspendableCache$invalidate$2(this.$key, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((StandardSuspendableCache$invalidate$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCache$invalidate$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */