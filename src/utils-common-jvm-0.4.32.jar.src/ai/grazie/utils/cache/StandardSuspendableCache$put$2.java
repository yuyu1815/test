/*    */ package ai.grazie.utils.cache;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @DebugMetadata(f = "StandardSuspendableCache.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.cache.StandardSuspendableCache$put$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\000\n\000\020\000\032\0020\001\"\b\b\000\020\002*\0020\003\"\b\b\001\020\004*\0020\003H@"}, d2 = {"<anonymous>", "", "Key", "", "Value"})
/*    */ @SourceDebugExtension({"SMAP\nStandardSuspendableCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache$put$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1863#2,2:49\n*S KotlinDebug\n*F\n+ 1 StandardSuspendableCache.kt\nai/grazie/utils/cache/StandardSuspendableCache$put$2\n*L\n22#1:49,2\n*E\n"})
/*    */ final class StandardSuspendableCache$put$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Set toRemove, set1;
/*    */     StandardSuspendableCache<Key, Value> standardSuspendableCache;
/*    */     int $i$f$forEach;
/*    */     Iterator iterator;
/* 19 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 20 */         StandardSuspendableCache.access$getData$p(StandardSuspendableCache.this).put(this.$key, new CacheValue.WithTime.Default(this.$value, 0L, 2, null));
/* 21 */         toRemove = StandardSuspendableCache.this.getCondition().toFilterOut(StandardSuspendableCache.access$getData$p(StandardSuspendableCache.this), SetsKt.emptySet());
/* 22 */         set1 = toRemove; standardSuspendableCache = StandardSuspendableCache.this; $i$f$forEach = 0;
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
/* 49 */         for (iterator = set1.iterator(); iterator.hasNext(); StandardSuspendableCache.access$getData$p(standardSuspendableCache).remove(it)) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-StandardSuspendableCache$put$2$1 = 0; }
/*    */         
/*    */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   int label;
/*    */   
/*    */   StandardSuspendableCache$put$2(Object $key, Object $value, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super StandardSuspendableCache$put$2> $completion) {
/*    */     return (Continuation<Unit>)new StandardSuspendableCache$put$2(this.$key, this.$value, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((StandardSuspendableCache$put$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\StandardSuspendableCache$put$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */