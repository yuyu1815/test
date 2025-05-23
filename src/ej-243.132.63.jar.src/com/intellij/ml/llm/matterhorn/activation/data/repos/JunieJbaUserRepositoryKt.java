/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaUser;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.JbaUserLoginResult;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.JobKt;
/*     */ import kotlinx.coroutines.channels.ProduceKt;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\032\030\020\002\032\0020\003*\b\022\004\022\0020\0050\004H@¢\006\002\020\006\032\f\020\002\032\0020\003*\0020\005H\002\032\n\020\007\032\0020\b*\0020\t\032\024\020\n\032\n\022\006\022\004\030\0010\t0\013*\0020\fH\002\"\016\020\000\032\0020\001X\004¢\006\002\n\000¨\006\r"}, d2 = {"LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "toJbaUserLoginResult", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/JbaUserLoginResult;", "Lkotlin/Result;", "Lcom/intellij/ui/JBAccountInfoService$LoginResult;", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toJbaUser", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;", "Lcom/intellij/ui/JBAccountInfoService$JBAData;", "jbaAuthUpdates", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/openapi/components/ComponentManager;", "data.repos"})
/*     */ @SourceDebugExtension({"SMAP\nJunieJbaUserRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,117:1\n326#2:118\n58#3:119\n36#3,2:120\n*S KotlinDebug\n*F\n+ 1 JunieJbaUserRepository.kt\ncom/intellij/ml/llm/matterhorn/activation/data/repos/JunieJbaUserRepositoryKt\n*L\n81#1:118\n29#1:119\n29#1:120,2\n*E\n"})
/*     */ public final class JunieJbaUserRepositoryKt {
/*     */   static {
/*  29 */     int $i$f$fileLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     int $i$f$currentClassLogger = 0;
/* 120 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 121 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   private static final Object toJbaUserLoginResult(Object $this$toJbaUserLoginResult, Continuation $completion) {
/*     */     Throwable e;
/*     */     Object object3, object1 = $this$toJbaUserLoginResult, object2 = object1;
/*     */     try {
/*     */       object3 = object2;
/*     */       JBAccountInfoService.LoginResult it = (JBAccountInfoService.LoginResult)object3;
/*     */       int $i$a$-mapCatching-JunieJbaUserRepositoryKt$toJbaUserLoginResult$2 = 0;
/*     */       object3 = Result.constructor-impl(toJbaUserLoginResult(it));
/*     */     } catch (Throwable throwable) {
/*     */       object3 = Result.constructor-impl(ResultKt.createFailure(throwable));
/*     */     } 
/*     */     object1 = Result.isSuccess-impl(object1) ? object3 : Result.constructor-impl(object1);
/*     */     Result.exceptionOrNull-impl(object1);
/*     */     int $i$a$-getOrElse-JunieJbaUserRepositoryKt$toJbaUserLoginResult$3 = 0;
/*     */     Continuation continuation = $completion;
/*     */     int $i$f$currentCoroutineContext = 0;
/*     */     JobKt.ensureActive($completion.getContext());
/*     */     LOG.error(e);
/*     */     return (Result.exceptionOrNull-impl(object1) == null) ? object1 : ((e instanceof java.util.concurrent.CancellationException) ? JbaUserLoginResult.Cancellation.INSTANCE : new JbaUserLoginResult.Failure.Internal(e));
/*     */   }
/*     */   
/*     */   private static final JbaUserLoginResult toJbaUserLoginResult(JBAccountInfoService.LoginResult $this$toJbaUserLoginResult) {
/*     */     JBAccountInfoService.LoginResult loginResult = $this$toJbaUserLoginResult;
/*     */     Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LoginResult.LoginFailed)$this$toJbaUserLoginResult).errorMessage(), "errorMessage(...)");
/*     */     if (loginResult instanceof JBAccountInfoService.LoginResult.LoginSuccessful) {
/*     */       Intrinsics.checkNotNullExpressionValue(((JBAccountInfoService.LoginResult.LoginSuccessful)$this$toJbaUserLoginResult).jbaUser(), "jbaUser(...)");
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (loginResult instanceof JBAccountInfoService.LoginResult.LoginFailed) ? (JbaUserLoginResult)new JbaUserLoginResult.Failure.ErrorResponse(((JBAccountInfoService.LoginResult.LoginFailed)$this$toJbaUserLoginResult).errorMessage()) : (JbaUserLoginResult)"JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final JbaUser toJbaUser(@NotNull JBAccountInfoService.JBAData $this$toJbaUser) {
/*     */     Intrinsics.checkNotNullParameter($this$toJbaUser, "<this>");
/*     */     Intrinsics.checkNotNullExpressionValue($this$toJbaUser.id, "id");
/*     */     if ($this$toJbaUser.loginName == null);
/*     */     super($this$toJbaUser.loginName, "", $this$toJbaUser.email, $this$toJbaUser.presentableName, null);
/*     */     return new JbaUser();
/*     */   }
/*     */   
/*     */   private static final Flow<JBAccountInfoService.JBAData> jbaAuthUpdates(ComponentManager $this$jbaAuthUpdates) {
/*     */     return FlowKt.conflate(FlowKt.callbackFlow(new JunieJbaUserRepositoryKt$jbaAuthUpdates$1($this$jbaAuthUpdates, null)));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {114}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryKt$jbaAuthUpdates$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\n\022\006\022\004\030\0010\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ui/JBAccountInfoService$JBAData;"})
/*     */   static final class JunieJbaUserRepositoryKt$jbaAuthUpdates$1 extends SuspendLambda implements Function2<ProducerScope<? super JBAccountInfoService.JBAData>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieJbaUserRepositoryKt$jbaAuthUpdates$1(ComponentManager $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProducerScope $this$callbackFlow;
/*     */       SimpleMessageBusConnection connection;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$callbackFlow = (ProducerScope)this.L$0;
/*     */           connection = this.$this_jbaAuthUpdates.getMessageBus().connect((CoroutineScope)$this$callbackFlow);
/*     */           Intrinsics.checkNotNullExpressionValue(JBAccountInfoService.AuthStateListener.TOPIC, "TOPIC");
/*     */           connection.subscribe(JBAccountInfoService.AuthStateListener.TOPIC, $this$callbackFlow::invokeSuspend$lambda$0);
/*     */           this.label = 1;
/*     */           if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$1, (Continuation)this) == object)
/*     */             return object; 
/*     */           ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$1, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieJbaUserRepositoryKt$jbaAuthUpdates$1> $completion) {
/*     */       JunieJbaUserRepositoryKt$jbaAuthUpdates$1 junieJbaUserRepositoryKt$jbaAuthUpdates$1 = new JunieJbaUserRepositoryKt$jbaAuthUpdates$1(this.$this_jbaAuthUpdates, $completion);
/*     */       junieJbaUserRepositoryKt$jbaAuthUpdates$1.L$0 = value;
/*     */       return (Continuation<Unit>)junieJbaUserRepositoryKt$jbaAuthUpdates$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */       return ((JunieJbaUserRepositoryKt$jbaAuthUpdates$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, JBAccountInfoService.JBAData authState) {
/*     */       $$this$callbackFlow.trySend-JP2dKIU(authState);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1(SimpleMessageBusConnection $connection) {
/*     */       $connection.disconnect();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */