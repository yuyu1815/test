/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tests;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\030\0002\0020\001B\021\022\b\b\002\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\b\032\0020\tH\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tests/AgentActionExtension;", "humanInLoop", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoop;)V", "getHumanInLoop", "()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "buildContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "ej-core-test"})
/*    */ @SourceDebugExtension({"SMAP\nRealAgentActionExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealAgentActionExtension.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n*L\n1#1,66:1\n31#2,2:67\n117#3:69\n*S KotlinDebug\n*F\n+ 1 RealAgentActionExtension.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension\n*L\n19#1:67,2\n49#1:69\n*E\n"})
/*    */ public final class RealAgentActionExtension extends AgentActionExtension {
/* 17 */   public RealAgentActionExtension(@NotNull HumanInLoop humanInLoop) { this.humanInLoop = humanInLoop; } @NotNull private final HumanInLoop humanInLoop; @NotNull public final HumanInLoop getHumanInLoop() { return this.humanInLoop; } @NotNull
/*    */   protected ExecutionAgentContext buildContext() {
/* 19 */     ComponentManager $this$service$iv = (ComponentManager)getProject(); int $i$f$service = 0;
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
/* 67 */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/* 68 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ArtifactRequestExecutorService service = (ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv); RealAgentActionExtension$buildContext$propertyProvider$1 propertyProvider = new RealAgentActionExtension$buildContext$propertyProvider$1(); RootExecutionContext rootContext = new RootExecutionContext(service, new RealAgentActionExtension$buildContext$rootContext$1(), "AgentActionExtension", RealAgentActionExtension::buildContext$lambda$0, false, propertyProvider, this.humanInLoop, new RealAgentActionExtension$buildContext$rootContext$3(null)); ArtifactId artifactId = new ArtifactId("rootTest", new ArtifactType("", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), new RealAgentActionExtension$buildContext$request$1(), false, 8, null)); String str = "test"; int $i$f$artifactRequest = 0;
/* 69 */     MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple"); ArtifactRequest request = new ArtifactRequest(artifactId, str, SerializersKt.serializer(Reflection.typeOf(String.class)));
/*    */     ExecutionContext executionContext = new ExecutionContext(rootContext, null, request, null, null, 16, null);
/*    */     Intrinsics.checkNotNull(getProject().getBaseDir());
/*    */     return (ExecutionAgentContext)new SimpleExecutionAgentContext(new AgentContext(null, getProject().getBaseDir()), executionContext);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\004\030\0010\0032\006\020\004\032\0020\005H@¢\006\002\020\006¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension$buildContext$propertyProvider$1", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "getProperty", "", "property", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core-test"})
/*    */   public static final class RealAgentActionExtension$buildContext$propertyProvider$1 implements MatterhornPropertyProvider {
/*    */     public Object getProperty(MatterhornProperty property, Continuation $completion) {
/*    */       return null;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000A\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\000\n\002\b\002*\001\000\b\n\030\0002\0020\001J2\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH@¢\006\002\020\fJ2\020\r\032\0020\0032\"\020\016\032\036\b\001\022\004\022\0020\020\022\n\022\b\022\004\022\0020\0030\021\022\006\022\004\030\0010\0220\017H@¢\006\002\020\023¨\006\024"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension$buildContext$rootContext$1", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core-test"})
/*    */   public static final class RealAgentActionExtension$buildContext$rootContext$1 implements LLMProxy {
/*    */     public Object sendWithTracking(MatterhornChat chat, ModelParameters modelParameters, MatterhornPropertyProvider propertyProvider, Function4 request, Function1 eventHandler, Continuation $completion) {
/*    */       return LLMProxy.DefaultImpls.sendWithTracking(this, chat, modelParameters, propertyProvider, request, eventHandler, $completion);
/*    */     }
/*    */     
/*    */     public boolean getImagesSupported() {
/*    */       return LLMProxy.DefaultImpls.getImagesSupported(this);
/*    */     }
/*    */     
/*    */     public Object sendChat(MatterhornChat chat, ModelParameters modelParameters, Function1 eventHandler, Continuation $completion) {
/*    */       throw new IllegalStateException("LLM is not supported in tests".toString());
/*    */     }
/*    */     
/*    */     public Object sendWithRecovery(Function2 send, Continuation $completion) {
/*    */       throw new IllegalStateException("LLM is not supported in tests".toString());
/*    */     }
/*    */   }
/*    */   
/*    */   private static final ShellExecutor buildContext$lambda$0() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public RealAgentActionExtension() {
/*    */     this(null, 1, null);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "RealAgentActionExtension.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tests.RealAgentActionExtension$buildContext$rootContext$3")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
/*    */   static final class RealAgentActionExtension$buildContext$rootContext$3 extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> {
/*    */     int label;
/*    */     
/*    */     RealAgentActionExtension$buildContext$rootContext$3(Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       Path it;
/*    */       Function1 checker;
/*    */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*    */       switch (this.label) {
/*    */         case 0:
/*    */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */           it = (Path)this.L$0;
/*    */           checker = AiIgnoreUtilKt.obtainAIIgnoreChecker(RealAgentActionExtension.this.getProject());
/*    */           return checker.invoke(it);
/*    */       } 
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super RealAgentActionExtension$buildContext$rootContext$3> $completion) {
/*    */       RealAgentActionExtension$buildContext$rootContext$3 realAgentActionExtension$buildContext$rootContext$3 = new RealAgentActionExtension$buildContext$rootContext$3($completion);
/*    */       realAgentActionExtension$buildContext$rootContext$3.L$0 = value;
/*    */       return (Continuation<Unit>)realAgentActionExtension$buildContext$rootContext$3;
/*    */     }
/*    */     
/*    */     public final Object invoke(Path p1, Continuation<?> p2) {
/*    */       return ((RealAgentActionExtension$buildContext$rootContext$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\016\022\004\022\0020\002\022\004\022\0020\0020\001J$\020\003\032\b\022\004\022\0020\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/tests/RealAgentActionExtension$buildContext$request$1", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core-test"})
/*    */   public static final class RealAgentActionExtension$buildContext$request$1 implements ArtifactRequestExecutor<String, String> {
/*    */     public Object produceArtifact(String input, ExecutionContext context, Continuation $completion) {
/*    */       throw new IllegalStateException("Not supported in tests".toString());
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tests\RealAgentActionExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */