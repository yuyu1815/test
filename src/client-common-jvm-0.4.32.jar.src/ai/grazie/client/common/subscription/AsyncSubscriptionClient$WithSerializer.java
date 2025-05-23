/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\005\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B+\022\f\020\003\032\b\022\004\022\0020\0040\002\022\f\020\005\032\b\022\004\022\0028\0010\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJ2\020\020\032\0020\0212\"\020\022\032\036\b\001\022\004\022\0028\001\022\n\022\b\022\004\022\0020\0250\024\022\006\022\004\030\0010\0260\023H@¢\006\002\020\027J\026\020\030\032\0020\0252\006\020\031\032\0020\021H@¢\006\002\020\032R\027\020\003\032\b\022\004\022\0020\0040\002¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\027\020\005\032\b\022\004\022\0028\0010\006¢\006\b\n\000\032\004\b\016\020\017¨\006\033"}, d2 = {"Lai/grazie/client/common/subscription/AsyncSubscriptionClient$WithSerializer;", "E", "Lai/grazie/client/common/subscription/AsyncSubscriptionClient;", "inner", "", "serializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/subscription/AsyncSubscriptionClient;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V", "getInner", "()Lai/grazie/client/common/subscription/AsyncSubscriptionClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "subscribe", "Lai/grazie/client/common/subscription/AsyncSubscriptionClient$Session;", "onEntity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "session", "(Lai/grazie/client/common/subscription/AsyncSubscriptionClient$Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class WithSerializer<E> implements AsyncSubscriptionClient<E> {
/*    */   @NotNull
/*    */   private final AsyncSubscriptionClient<String> inner;
/*    */   @NotNull
/*    */   private final KSerializer<E> serializer;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   
/* 26 */   public WithSerializer(@NotNull AsyncSubscriptionClient<String> inner, @NotNull KSerializer<E> serializer, @NotNull JSON json) { this.inner = inner; this.serializer = serializer; this.json = json; } @NotNull public final AsyncSubscriptionClient<String> getInner() { return this.inner; } @NotNull public final KSerializer<E> getSerializer() { return this.serializer; } @NotNull public final JSON getJson() { return this.json; }
/*    */   
/*    */   @Nullable
/* 29 */   public Object subscribe(@NotNull Function2 onEntity, @NotNull Continuation<? super AsyncSubscriptionClient.Session> $completion) { return this.inner.subscribe(new AsyncSubscriptionClient$WithSerializer$subscribe$2(null), $completion); } @DebugMetadata(f = "AsyncSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncSubscriptionClient$WithSerializer$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "E", "it", ""}) static final class AsyncSubscriptionClient$WithSerializer$subscribe$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) { String it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0;
/* 30 */           AsyncSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncSubscriptionClient.WithSerializer.this.getSerializer(), it);
/* 31 */           return Unit.INSTANCE; }
/*    */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     AsyncSubscriptionClient$WithSerializer$subscribe$2(Continuation $completion) { super(2, $completion); }
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super AsyncSubscriptionClient$WithSerializer$subscribe$2> $completion) { AsyncSubscriptionClient$WithSerializer$subscribe$2 asyncSubscriptionClient$WithSerializer$subscribe$2 = new AsyncSubscriptionClient$WithSerializer$subscribe$2($completion); asyncSubscriptionClient$WithSerializer$subscribe$2.L$0 = value; return (Continuation<Unit>)asyncSubscriptionClient$WithSerializer$subscribe$2; } public final Object invoke(String p1, Continuation<?> p2) { return ((AsyncSubscriptionClient$WithSerializer$subscribe$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 35 */    @Nullable public Object unsubscribe(@NotNull AsyncSubscriptionClient.Session session, @NotNull Continuation<? super Unit> $completion) { if (this.inner.unsubscribe(session, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.inner.unsubscribe(session, $completion);  this.inner.unsubscribe(session, $completion); return Unit.INSTANCE; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\AsyncSubscriptionClient$WithSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */