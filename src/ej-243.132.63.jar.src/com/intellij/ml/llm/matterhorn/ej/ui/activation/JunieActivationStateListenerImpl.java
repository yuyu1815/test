/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import ai.grazie.quota.Quota;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.activation.platform.JunieActivationStateListener;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.coroutines.BuildersKt;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializersKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\020\016\n\002\b\002\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\013H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationStateListenerImpl;", "Lcom/intellij/ml/llm/activation/platform/JunieActivationStateListener;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "productActivationStateChanged", "", "sender", "", "message", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nJunieActivationTransmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieActivationTransmitter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationStateListenerImpl\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n+ 4 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,78:1\n31#2,2:79\n31#2,2:84\n66#3:81\n24#4:82\n80#5:83\n*S KotlinDebug\n*F\n+ 1 JunieActivationTransmitter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationStateListenerImpl\n*L\n49#1:79,2\n70#1:84,2\n69#1:81\n69#1:82\n69#1:83\n*E\n"})
/*    */ public final class JunieActivationStateListenerImpl
/*    */   implements JunieActivationStateListener
/*    */ {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public JunieActivationStateListenerImpl(@NotNull Project project) {
/* 47 */     this.project = project; } @NotNull public final Project getProject() { return this.project; }
/*    */    public void productActivationStateChanged(@NotNull String sender, @NotNull String message) {
/* 49 */     Intrinsics.checkNotNullParameter(sender, "sender"); Intrinsics.checkNotNullParameter(message, "message"); ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
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
/* 79 */     Class<JunieActivationTransmitterService> serviceClass$iv = JunieActivationTransmitterService.class;
/* 80 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  CoroutineScope scope = ((JunieActivationTransmitterService)$this$service$iv.getService(serviceClass$iv)).getCoroutineScope(); LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(this.project); JunieGrazieLLMProxy grazieLLMProxy = (lLMProxy instanceof JunieGrazieLLMProxy) ? (JunieGrazieLLMProxy)lLMProxy : null; if (grazieLLMProxy != null && !Intrinsics.areEqual(sender, JunieActivationTransmitterKt.access$getSenderJunie$p())) { JunieActivationTransmitterKt.access$getLog$p().info("Received message: " + message + " from " + sender + "."); if (Intrinsics.areEqual(message, JunieActivationTransmitterKt.access$getActivation_complete$p())) { BuildersKt.launch$default(scope, null, null, new JunieActivationStateListenerImpl$productActivationStateChanged$1(grazieLLMProxy, null), 3, null); }
/* 81 */       else if (StringsKt.startsWith$default(message, JunieActivationTransmitterKt.access$getQuota_update$p(), false, 2, null)) { String quotaText = StringsKt.substringAfter$default(message, JunieActivationTransmitterKt.access$getQuota_update$p(), null, 2, null); JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$parse = 0; int $i$f$serializer = 0;
/* 82 */         KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(Quota.class)); int $i$f$cast = 0;
/* 83 */         Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); Quota quota = (Quota)this_$iv.parse((DeserializationStrategy)$this$cast$iv$iv$iv, quotaText); ComponentManager componentManager = (ComponentManager)this.project; int i = 0;
/* 84 */         Class<JunieGrazieQuota> clazz = JunieGrazieQuota.class;
/* 85 */         if (componentManager.getService(clazz) == null) { componentManager.getService(clazz); throw ServicesKt.serviceNotFoundError(componentManager, clazz); }  ((JunieGrazieQuota)componentManager.getService(clazz)).reportQuota(quota, grazieLLMProxy); }
/*    */       else
/*    */       { JunieActivationTransmitterKt.access$getLogger$p().warn("Unknown message: " + message + " from " + sender + ", ignoring."); }
/*    */        }
/*    */   
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "JunieActivationTransmitter.kt", l = {57}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieActivationStateListenerImpl$productActivationStateChanged$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class JunieActivationStateListenerImpl$productActivationStateChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */     int label;
/*    */     
/*    */     JunieActivationStateListenerImpl$productActivationStateChanged$1(JunieGrazieLLMProxy $grazieLLMProxy, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #5
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 117, 0 -> 32, 1 -> 60
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: ldc2_w 3000
/*    */       //   39: aload_0
/*    */       //   40: checkcast kotlin/coroutines/Continuation
/*    */       //   43: aload_0
/*    */       //   44: iconst_1
/*    */       //   45: putfield label : I
/*    */       //   48: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   51: dup
/*    */       //   52: aload #5
/*    */       //   54: if_acmpne -> 65
/*    */       //   57: aload #5
/*    */       //   59: areturn
/*    */       //   60: aload_1
/*    */       //   61: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   64: aload_1
/*    */       //   65: pop
/*    */       //   66: aload_0
/*    */       //   67: getfield $grazieLLMProxy : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
/*    */       //   70: invokevirtual getAuthService : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*    */       //   73: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*    */       //   76: astore_2
/*    */       //   77: aload_2
/*    */       //   78: invokevirtual getActivationState : ()Lkotlinx/coroutines/flow/StateFlow;
/*    */       //   81: invokeinterface getValue : ()Ljava/lang/Object;
/*    */       //   86: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation
/*    */       //   89: astore_3
/*    */       //   90: aload_3
/*    */       //   91: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*    */       //   96: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */       //   99: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending
/*    */       //   102: astore #4
/*    */       //   104: aload #4
/*    */       //   106: ifnull -> 113
/*    */       //   109: aload_2
/*    */       //   110: invokevirtual relogin : ()V
/*    */       //   113: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */       //   116: areturn
/*    */       //   117: new java/lang/IllegalStateException
/*    */       //   120: dup
/*    */       //   121: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   123: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   126: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #56	-> 3
/*    */       //   #57	-> 36
/*    */       //   #56	-> 57
/*    */       //   #58	-> 65
/*    */       //   #59	-> 77
/*    */       //   #60	-> 90
/*    */       //   #61	-> 104
/*    */       //   #62	-> 109
/*    */       //   #64	-> 113
/*    */       //   #56	-> 117
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   77	36	2	authFacade	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*    */       //   90	14	3	activation	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;
/*    */       //   104	5	4	activationPending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationPending;
/*    */       //   0	127	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieActivationStateListenerImpl$productActivationStateChanged$1;
/*    */       //   36	81	1	$result	Ljava/lang/Object;
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super JunieActivationStateListenerImpl$productActivationStateChanged$1> $completion) {
/*    */       return (Continuation<Unit>)new JunieActivationStateListenerImpl$productActivationStateChanged$1(this.$grazieLLMProxy, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((JunieActivationStateListenerImpl$productActivationStateChanged$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationStateListenerImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */