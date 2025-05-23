/*    */ package ai.grazie.utils;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "KeyedLock.kt", l = {29}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.KeyedLock$withLock$result$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\003\n\002\020\000\020\000\032\002H\001\"\004\b\000\020\001\"\b\b\001\020\002*\0020\003H@"}, d2 = {"<anonymous>", "T", "KeyT", ""})
/*    */ final class KeyedLock$withLock$result$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super T>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   KeyedLock$withLock$result$1(Function2<KeyT, Continuation<? super T>, Object> $body, Object $key, Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 29 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; return (this.$body.invoke(this.$key, this) == object) ? object : this.$body.invoke(this.$key, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super KeyedLock$withLock$result$1> $completion) {
/*    */     return (Continuation<Unit>)new KeyedLock$withLock$result$1(this.$body, this.$key, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((KeyedLock$withLock$result$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\KeyedLock$withLock$result$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */