/*    */ package ai.grazie.utils.cache;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Time;
/*    */ import java.util.Iterator;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCacheKt$standardSuspendableCache$1$put$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Key", "", "Value"})
/*    */ final class StandardSuspendableCacheKt$standardSuspendableCache$1$put$2
/*    */   extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   StandardSuspendableCacheKt$standardSuspendableCache$1$put$2(Object $key, Object $value, Integer $maxMillis, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 26 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 27 */         StandardSuspendableCacheKt$standardSuspendableCache$1.access$getData$p(StandardSuspendableCacheKt$standardSuspendableCache$1.this).remove(this.$key);
/* 28 */         StandardSuspendableCacheKt$standardSuspendableCache$1.access$getData$p(StandardSuspendableCacheKt$standardSuspendableCache$1.this).put(this.$key, new CacheValue.WithTime.Default(this.$value, 0L, 2, null));
/*    */         
/* 30 */         if (this.$maxMillis != null) {
/* 31 */           long now = Time.INSTANCE.epochMillis$utils_common();
/* 32 */           long border = now - this.$maxMillis.intValue();
/*    */           
/* 34 */           Iterator<Map.Entry> iterator = StandardSuspendableCacheKt$standardSuspendableCache$1.access$getData$p(StandardSuspendableCacheKt$standardSuspendableCache$1.this).entrySet().iterator();
/* 35 */           while (iterator.hasNext() && (
/* 36 */             (CacheValue.WithTime)((Map.Entry)iterator.next()).getValue()).getEpoch() < border) {
/* 37 */             iterator.remove();
/*    */           }
/*    */         } 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 44 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super StandardSuspendableCacheKt$standardSuspendableCache$1$put$2> $completion) {
/*    */     return (Continuation<Unit>)new StandardSuspendableCacheKt$standardSuspendableCache$1$put$2(this.$key, this.$value, this.$maxMillis, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((StandardSuspendableCacheKt$standardSuspendableCache$1$put$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCacheKt$standardSuspendableCache$1$put$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */