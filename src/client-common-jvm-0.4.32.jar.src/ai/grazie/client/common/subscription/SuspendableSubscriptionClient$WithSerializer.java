/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B+\022\f\020\003\032\b\022\004\022\0020\0040\002\022\f\020\005\032\b\022\004\022\0028\0010\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tJn\020\020\032\0020\0212\034\020\022\032\030\b\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\0232\034\020\026\032\030\b\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\0232\"\020\027\032\036\b\001\022\004\022\0028\001\022\n\022\b\022\004\022\0020\0210\024\022\006\022\004\030\0010\0250\030H@¢\006\002\020\031R\027\020\003\032\b\022\004\022\0020\0040\002¢\006\b\n\000\032\004\b\n\020\013R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\f\020\rR\027\020\005\032\b\022\004\022\0028\0010\006¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lai/grazie/client/common/subscription/SuspendableSubscriptionClient$WithSerializer;", "E", "Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "inner", "", "serializer", "Lkotlinx/serialization/KSerializer;", "json", "Lai/grazie/utils/json/JSON;", "(Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;Lkotlinx/serialization/KSerializer;Lai/grazie/utils/json/JSON;)V", "getInner", "()Lai/grazie/client/common/subscription/SuspendableSubscriptionClient;", "getJson", "()Lai/grazie/utils/json/JSON;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "subscribe", "", "onConnect", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "onClose", "onEntity", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class WithSerializer<E>
/*    */   implements SuspendableSubscriptionClient<E>
/*    */ {
/*    */   @NotNull
/*    */   private final SuspendableSubscriptionClient<String> inner;
/*    */   @NotNull
/*    */   private final KSerializer<E> serializer;
/*    */   @NotNull
/*    */   private final JSON json;
/*    */   
/*    */   public WithSerializer(@NotNull SuspendableSubscriptionClient<String> inner, @NotNull KSerializer<E> serializer, @NotNull JSON json) {
/* 50 */     this.inner = inner; this.serializer = serializer; this.json = json; } @NotNull public final SuspendableSubscriptionClient<String> getInner() { return this.inner; } @NotNull public final KSerializer<E> getSerializer() { return this.serializer; } @NotNull public final JSON getJson() { return this.json; }
/*    */   
/*    */   @Nullable
/* 53 */   public Object subscribe(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onConnect, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onClose, @NotNull Function2<? super E, ? super Continuation<? super Unit>, ? extends Object> onEntity, @NotNull Continuation<? super Unit> $completion) { if (this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion);  this.inner.subscribe(onConnect, onClose, new SuspendableSubscriptionClient$WithSerializer$subscribe$2(this, null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {54}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$WithSerializer$subscribe$2") @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "E", "it", ""}) static final class SuspendableSubscriptionClient$WithSerializer$subscribe$2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> { public final Object invokeSuspend(Object $result) { String it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0;
/* 54 */           this.label = 1; if (this.$onEntity.invoke(SuspendableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)SuspendableSubscriptionClient.WithSerializer.this.getSerializer(), it), this) == object) return object;  this.$onEntity.invoke(SuspendableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)SuspendableSubscriptionClient.WithSerializer.this.getSerializer(), it), this);
/* 55 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     int label;
/*    */     
/*    */     SuspendableSubscriptionClient$WithSerializer$subscribe$2(SuspendableSubscriptionClient.WithSerializer<E> $receiver, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super SuspendableSubscriptionClient$WithSerializer$subscribe$2> $completion) {
/*    */       SuspendableSubscriptionClient$WithSerializer$subscribe$2 suspendableSubscriptionClient$WithSerializer$subscribe$2 = new SuspendableSubscriptionClient$WithSerializer$subscribe$2(SuspendableSubscriptionClient.WithSerializer.this, $completion);
/*    */       suspendableSubscriptionClient$WithSerializer$subscribe$2.L$0 = value;
/*    */       return (Continuation<Unit>)suspendableSubscriptionClient$WithSerializer$subscribe$2;
/*    */     }
/*    */     
/*    */     public final Object invoke(String p1, Continuation<?> p2) {
/*    */       return ((SuspendableSubscriptionClient$WithSerializer$subscribe$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\SuspendableSubscriptionClient$WithSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */