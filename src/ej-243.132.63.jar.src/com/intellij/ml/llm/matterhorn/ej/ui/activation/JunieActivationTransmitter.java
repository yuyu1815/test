/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ import com.intellij.ml.llm.activation.platform.JunieActivationStateListener;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieAuthContext;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.startup.ProjectActivity;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationTransmitter;", "Lcom/intellij/openapi/startup/ProjectActivity;", "<init>", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nJunieActivationTransmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieActivationTransmitter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationTransmitter\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,78:1\n31#2,2:79\n*S KotlinDebug\n*F\n+ 1 JunieActivationTransmitter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationTransmitter\n*L\n29#1:79,2\n*E\n"})
/*    */ public final class JunieActivationTransmitter implements ProjectActivity {
/*    */   @Nullable
/*    */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/* 27 */     LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(project); JunieGrazieLLMProxy grazieLLMProxy = (lLMProxy instanceof JunieGrazieLLMProxy) ? (JunieGrazieLLMProxy)lLMProxy : null;
/* 28 */     if (grazieLLMProxy != null) {
/* 29 */       ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 79 */       Class<JunieActivationTransmitterService> serviceClass$iv = JunieActivationTransmitterService.class;
/* 80 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  BuildersKt.launch$default(((JunieActivationTransmitterService)$this$service$iv.getService(serviceClass$iv)).getCoroutineScope(), null, null, new JunieActivationTransmitter$execute$2(grazieLLMProxy, project, null), 3, null);
/*    */     } 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */   
/*    */   @DebugMetadata(f = "JunieActivationTransmitter.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieActivationTransmitter$execute$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JunieActivationTransmitter$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JunieActivationTransmitter$execute$2(JunieGrazieLLMProxy $grazieLLMProxy, Project $project, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       StateFlow<AiaActivation> activationState;
/*    */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           activationState = this.$grazieLLMProxy.getAuthService().getAuthFacade().getActivationState();
/*    */           this.label = 1;
/*    */           if (activationState.collect(new FlowCollector(this.$project) {
/*    */                 public final Object emit(AiaActivation activation, Continuation $completion) {
/*    */                   try {
/*    */                     GrazieAuthContext complete = (GrazieAuthContext)Outcome.getOrNull-impl(activation.getOutcome-07x5Wys());
/*    */                     if (complete != null)
/*    */                       ((JunieActivationStateListener)this.$project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC())).productActivationStateChanged(JunieActivationTransmitterKt.access$getSenderJunie$p(), "activation_complete"); 
/*    */                   } catch (Throwable th) {
/*    */                     JunieActivationTransmitterKt.access$getLogger$p().error(th);
/*    */                   } 
/*    */                   return Unit.INSTANCE;
/*    */                 }
/*    */               }(Continuation)this) == object)
/*    */             return object; 
/*    */           activationState.collect(new FlowCollector(this.$project) {
/*    */                 public final Object emit(AiaActivation activation, Continuation $completion) {
/*    */                   try {
/*    */                     GrazieAuthContext complete = (GrazieAuthContext)Outcome.getOrNull-impl(activation.getOutcome-07x5Wys());
/*    */                     if (complete != null)
/*    */                       ((JunieActivationStateListener)this.$project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC())).productActivationStateChanged(JunieActivationTransmitterKt.access$getSenderJunie$p(), "activation_complete"); 
/*    */                   } catch (Throwable th) {
/*    */                     JunieActivationTransmitterKt.access$getLogger$p().error(th);
/*    */                   } 
/*    */                   return Unit.INSTANCE;
/*    */                 }
/*    */               }(Continuation)this);
/*    */           throw new KotlinNothingValueException();
/*    */         case 1:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           throw new KotlinNothingValueException();
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JunieActivationTransmitter$execute$2> $completion) {
/*    */       return (Continuation<Unit>)new JunieActivationTransmitter$execute$2(this.$grazieLLMProxy, this.$project, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JunieActivationTransmitter$execute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationTransmitter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */