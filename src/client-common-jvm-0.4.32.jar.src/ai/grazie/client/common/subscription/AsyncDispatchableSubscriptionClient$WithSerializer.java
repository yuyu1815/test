/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\007\030\000*\004\b\002\020\001*\004\b\003\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003B1\022\022\020\004\032\016\022\004\022\0028\002\022\004\022\0020\0050\003\022\f\020\006\032\b\022\004\022\0028\0030\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ@\020\021\032\0020\0222\006\020\023\032\0028\0022(\020\024\032$\b\001\022\004\022\0028\002\022\004\022\0028\003\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\025H@¢\006\002\020\031J8\020\021\032\0020\0222(\020\032\032$\b\001\022\004\022\0028\002\022\004\022\0028\003\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\025H@¢\006\002\020\033J\026\020\034\032\0020\0272\006\020\035\032\0020\022H@¢\006\002\020\036R\035\020\004\032\016\022\004\022\0028\002\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\r\020\016R\027\020\006\032\b\022\004\022\0028\0030\007¢\006\b\n\000\032\004\b\017\020\020¨\006\037"}, d2 = {"Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient$WithSerializer;", "Id", "E", "Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient;", "inner", "", "serializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V", "getInner", "()Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "subscribe", "Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient$Session;", "id", "onEntity", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "body", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "session", "(Lai/grazie/client/common/subscription/AsyncDispatchableSubscriptionClient$Session;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class WithSerializer<Id, E> implements AsyncDispatchableSubscriptionClient<Id, E> {
/*    */   @NotNull
/*    */   private final AsyncDispatchableSubscriptionClient<Id, String> inner;
/*    */   @NotNull
/*    */   private final KSerializer<E> serializer;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   
/*    */   @NotNull
/*    */   public final AsyncDispatchableSubscriptionClient<Id, String> getInner() {
/*    */     return this.inner;
/*    */   }
/*    */   
/* 29 */   public WithSerializer(@NotNull AsyncDispatchableSubscriptionClient<Id, String> inner, @NotNull KSerializer<E> serializer, @NotNull JSON json) { this.inner = inner;
/* 30 */     this.serializer = serializer;
/* 31 */     this.json = json; } @NotNull public final KSerializer<E> getSerializer() { return this.serializer; } @NotNull public final JSON getJson() { return this.json; }
/*    */   
/*    */   @Nullable
/* 34 */   public Object subscribe(Object id, @NotNull Function3<? super Id, ? super E, ? super Continuation<? super Unit>, ? extends Object> onEntity, @NotNull Continuation<? super AsyncDispatchableSubscriptionClient.Session> $completion) { return this.inner.subscribe((Id)id, new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion); } @DebugMetadata(f = "AsyncDispatchableSubscriptionClient.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\004\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\002\"\004\b\003\020\0032\006\020\004\032\002H\0022\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "", "Id", "E", "myId", "entity", ""}) static final class AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2 extends SuspendLambda implements Function3<Id, String, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) { Object myId; String entity; Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); myId = this.L$0; entity = (String)this.L$1;
/* 35 */           this.L$0 = null; this.label = 1; if (this.$onEntity.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this) == object1) return object1;  this.$onEntity.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this);
/* 36 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2(AsyncDispatchableSubscriptionClient.WithSerializer<Id, E> $receiver, Continuation $completion) { super(3, $completion); } public final Object invoke(Object p1, String p2, Continuation<? super AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2> p3) { AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2 asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2 = new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2(AsyncDispatchableSubscriptionClient.WithSerializer.this, p3); asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.L$0 = p1; asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.L$1 = p2;
/*    */       return asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.invokeSuspend(Unit.INSTANCE); } }
/* 40 */    @Nullable public Object subscribe(@NotNull Function3<? super Id, ? super E, ? super Continuation<? super Unit>, ? extends Object> body, @NotNull Continuation<? super AsyncDispatchableSubscriptionClient.Session> $completion) { return this.inner.subscribe(new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4(this, null), $completion); } @DebugMetadata(f = "AsyncDispatchableSubscriptionClient.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\004\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\002\"\004\b\003\020\0032\006\020\004\032\002H\0022\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "", "Id", "E", "myId", "entity", ""}) static final class AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4 extends SuspendLambda implements Function3<Id, String, Continuation<? super Unit>, Object> { int label; AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4(AsyncDispatchableSubscriptionClient.WithSerializer<Id, E> $receiver, Continuation $completion) { super(3, $completion); } public final Object invokeSuspend(Object $result) { Object myId; String entity; Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); myId = this.L$0; entity = (String)this.L$1;
/* 41 */           this.L$0 = null; this.label = 1; if (this.$body.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this) == object1) return object1;  this.$body.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this);
/* 42 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(Object p1, String p2, Continuation<? super AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4> p3) { AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4 asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4 = new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$4(AsyncDispatchableSubscriptionClient.WithSerializer.this, p3); asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.L$0 = p1;
/*    */       asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.L$1 = p2;
/*    */       return asyncDispatchableSubscriptionClient$WithSerializer$subscribe$4.invokeSuspend(Unit.INSTANCE); } }
/* 46 */   @Nullable public Object unsubscribe(@NotNull AsyncDispatchableSubscriptionClient.Session session, @NotNull Continuation<? super Unit> $completion) { if (this.inner.unsubscribe(session, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.inner.unsubscribe(session, $completion);  this.inner.unsubscribe(session, $completion); return Unit.INSTANCE; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\AsyncDispatchableSubscriptionClient$WithSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */