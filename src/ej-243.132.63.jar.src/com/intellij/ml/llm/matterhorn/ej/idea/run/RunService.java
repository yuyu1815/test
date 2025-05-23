/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ import com.intellij.execution.actions.ConfigurationContext;
/*     */ import com.intellij.execution.process.ProcessEvent;
/*     */ import com.intellij.execution.process.ProcessHandler;
/*     */ import com.intellij.execution.runners.ExecutionEnvironment;
/*     */ import com.intellij.ml.llm.matterhorn.CoroutinesKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.idea.run.tests.TestConfigurationPopupInterceptor;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.DataContext;
/*     */ import com.intellij.openapi.actionSystem.PlatformCoreDataKeys;
/*     */ import com.intellij.openapi.application.AccessToken;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.module.Module;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.Key;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.ui.UiInterceptors;
/*     */ import com.intellij.util.messages.MessageBusConnection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CompletableDeferredKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\013\n\002\b\007\030\000 !2\0020\001:\001!B\007¢\006\004\b\002\020\003J.\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\020J9\020\021\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2#\020\r\032\037\022\n\022\b\022\004\022\0020\b0\023\022\004\022\0020\024\022\004\022\0020\0250\022¢\006\002\b\026J\024\020\027\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\nJ\006\020\030\032\0020\025J(\020\031\032\b\022\004\022\0020\0330\032*\b\022\004\022\0020\b0\0232\006\020\t\032\0020\n2\006\020\034\032\0020\024H\002J6\020\035\032\b\022\004\022\0020\0250\032*\b\022\004\022\0020\b0\0232\006\020\t\032\0020\n2\006\020\034\032\0020\0242\f\020\036\032\b\022\004\022\0020\0330\032H\002J\032\020\037\032\0020\025*\b\022\004\022\0020\b0\0232\006\020 \032\0020\bH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "run", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;", "project", "Lcom/intellij/openapi/project/Project;", "element", "Lcom/intellij/psi/PsiElement;", "action", "Lcom/intellij/openapi/actionSystem/AnAction;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "doRun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/openapi/Disposable;", "", "Lkotlin/ExtensionFunctionType;", "build", "close", "setupBuildListeners", "Lkotlinx/coroutines/CompletableDeferred;", "", "disposable", "setupLaunchListeners", "buildFinished", "sendEvent", "event", "Companion", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nRunService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunService.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/RunService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,253:1\n1#2:254\n14#3:255\n*S KotlinDebug\n*F\n+ 1 RunService.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/RunService\n*L\n43#1:255\n*E\n"})
/*     */ public final class RunService {
/*     */   @NotNull
/*  43 */   public static final Companion Companion = new Companion(null); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-idea"}) public static final class Companion { private Companion() {} } static { int $i$f$logger = 0;
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
/* 255 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(RunService.class), "getInstance(...)"); } @NotNull private final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus((CoroutineContext)new CoroutineName("RunService"))); @NotNull private static final Logger logger = Logger.getInstance(RunService.class);
/*     */   
/*     */   @NotNull
/*     */   public final Flow<RunEvent> run(@NotNull Project project, @NotNull PsiElement element, @NotNull AnAction action, @Nullable ExecutionAgentContext context) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'project'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'element'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_3
/*     */     //   13: ldc 'action'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_0
/*     */     //   19: aload_1
/*     */     //   20: aload_2
/*     */     //   21: aload_1
/*     */     //   22: aload_3
/*     */     //   23: <illegal opcode> invoke : (Lcom/intellij/psi/PsiElement;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/actionSystem/AnAction;)Lkotlin/jvm/functions/Function2;
/*     */     //   28: invokevirtual doRun : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   31: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #52	-> 18
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	32	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*     */     //   0	32	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	32	2	element	Lcom/intellij/psi/PsiElement;
/*     */     //   0	32	3	action	Lcom/intellij/openapi/actionSystem/AnAction;
/*     */     //   0	32	4	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */   }
/*     */   
/*     */   private static final Unit run$lambda$1(PsiElement $element, Project $project, AnAction $action, ProducerScope $this$doRun, Disposable channelDisposable) {
/*     */     Module mod;
/*     */     Intrinsics.checkNotNullParameter($this$doRun, "$this$doRun");
/*     */     Intrinsics.checkNotNullParameter(channelDisposable, "channelDisposable");
/*     */     if (ModuleUtilCore.findModuleForPsiElement($element) == null) {
/*     */       ModuleUtilCore.findModuleForPsiElement($element);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     PsiElement[] arrayOfPsiElement = new PsiElement[1];
/*     */     arrayOfPsiElement[0] = $element;
/*     */     Intrinsics.checkNotNullExpressionValue(SimpleDataContext.builder().add(PlatformCoreDataKeys.MODULE, mod).add(PlatformCoreDataKeys.PROJECT, $project).add(LangDataKeys.PSI_ELEMENT_ARRAY, arrayOfPsiElement).build(), "build(...)");
/*     */     DataContext dataContext = SimpleDataContext.builder().add(PlatformCoreDataKeys.MODULE, mod).add(PlatformCoreDataKeys.PROJECT, $project).add(LangDataKeys.PSI_ELEMENT_ARRAY, arrayOfPsiElement).build();
/*     */     AnActionEvent event = new AnActionEvent(dataContext, $action.getTemplatePresentation().clone(), "RunTestAction", ActionUiKind.NONE, null, 0, ActionManager.getInstance());
/*     */     Intrinsics.checkNotNullExpressionValue(ConfigurationContext.getFromContext(dataContext, event.getPlace()), "getFromContext(...)");
/*     */     ConfigurationContext context = ConfigurationContext.getFromContext(dataContext, event.getPlace());
/*     */     TestConfigurationPopupInterceptor interceptor = TestConfigurationPopupInterceptor.Companion.getInterceptor(context);
/*     */     if (interceptor != null) {
/*     */       TestConfigurationPopupInterceptor it = interceptor;
/*     */       int $i$a$-let-RunService$run$1$1 = 0;
/*     */       UiInterceptors.registerPersistent(channelDisposable, (UiInterceptors.PersistentUiInterceptor)it);
/*     */     } else {
/*     */     
/*     */     } 
/*     */     BuildersKt.launch$default((CoroutineScope)$this$doRun, CoroutinesKt.getEDT(Dispatchers.INSTANCE), null, new RunService$run$1$2($action, event, null), 2, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunService.kt", l = {75}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$run$1$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class RunService$run$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_2
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 78, 0 -> 32, 1 -> 68
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield $action : Lcom/intellij/openapi/actionSystem/AnAction;
/*     */       //   40: aload_0
/*     */       //   41: getfield $event : Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */       //   44: <illegal opcode> invoke : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lkotlin/jvm/functions/Function0;
/*     */       //   49: aload_0
/*     */       //   50: checkcast kotlin/coroutines/Continuation
/*     */       //   53: aload_0
/*     */       //   54: iconst_1
/*     */       //   55: putfield label : I
/*     */       //   58: invokestatic writeIntentReadAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   61: dup
/*     */       //   62: aload_2
/*     */       //   63: if_acmpne -> 73
/*     */       //   66: aload_2
/*     */       //   67: areturn
/*     */       //   68: aload_1
/*     */       //   69: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   72: aload_1
/*     */       //   73: pop
/*     */       //   74: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   77: areturn
/*     */       //   78: new java/lang/IllegalStateException
/*     */       //   81: dup
/*     */       //   82: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   84: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   87: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #74	-> 3
/*     */       //   #75	-> 36
/*     */       //   #74	-> 66
/*     */       //   #82	-> 73
/*     */       //   #74	-> 78
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	88	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService$run$1$2;
/*     */       //   36	42	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$2(AnAction $action, AnActionEvent $event) {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: aload_1
/*     */       //   2: aload_0
/*     */       //   3: aload_1
/*     */       //   4: <illegal opcode> run : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;)Ljava/lang/Runnable;
/*     */       //   9: invokestatic performDumbAwareWithCallbacks : (Lcom/intellij/openapi/actionSystem/AnAction;Lcom/intellij/openapi/actionSystem/AnActionEvent;Ljava/lang/Runnable;)V
/*     */       //   12: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   15: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #76	-> 0
/*     */       //   #81	-> 12
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	16	0	$action	Lcom/intellij/openapi/actionSystem/AnAction;
/*     */       //   0	16	1	$event	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */     }
/*     */     
/*     */     private static final void invokeSuspend$lambda$2$lambda$1(AnAction $action, AnActionEvent $event) {
/*     */       AutoCloseable autoCloseable = (AutoCloseable)ThreadContext.installThreadContext(ThreadContext.currentThreadContext().plus((CoroutineContext)TestConfigurationPopupInterceptor.Marker.INSTANCE), true);
/*     */       Throwable throwable = null;
/*     */       try {
/*     */         AccessToken it = (AccessToken)autoCloseable;
/*     */         int $i$a$-use-RunService$run$1$2$1$1$1 = 0;
/*     */         $action.actionPerformed($event);
/*     */         Unit unit = Unit.INSTANCE;
/*     */       } catch (Throwable throwable1) {
/*     */         throwable = throwable1 = null;
/*     */         throw throwable1;
/*     */       } finally {
/*     */         AutoCloseableKt.closeFinally(autoCloseable, throwable);
/*     */       } 
/*     */     }
/*     */     
/*     */     RunService$run$1$2(AnAction $action, AnActionEvent $event, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RunService$run$1$2> $completion) {
/*     */       return (Continuation<Unit>)new RunService$run$1$2(this.$action, this.$event, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((RunService$run$1$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Flow<RunEvent> doRun(@NotNull Project project, @NotNull Function2<? super ProducerScope<? super RunEvent>, ? super Disposable, Unit> action) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     return FlowKt.buffer$default(FlowKt.channelFlow(new RunService$doRun$1(project, action, null)), 2147483647, null, 2, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunService.kt", l = {91, 97, 102, 104}, i = {0, 1, 1, 2}, s = {"L$0", "L$0", "L$1", "L$0"}, n = {"$this$channelFlow", "buildFinished", "testsFinished", "testsFinished"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$doRun$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;"})
/*     */   static final class RunService$doRun$1 extends SuspendLambda implements Function2<ProducerScope<? super RunEvent>, Continuation<? super Unit>, Object> {
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RunService$doRun$1(Project $project, Function2<ProducerScope<? super RunEvent>, Disposable, Unit> $action, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 327, 0 -> 44, 1 -> 102, 2 -> 200, 3 -> 260, 4 -> 317
/*     */       //   44: aload_1
/*     */       //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   48: aload_0
/*     */       //   49: getfield L$0 : Ljava/lang/Object;
/*     */       //   52: checkcast kotlinx/coroutines/channels/ProducerScope
/*     */       //   55: astore_2
/*     */       //   56: aload_2
/*     */       //   57: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   60: aload_0
/*     */       //   61: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*     */       //   64: invokestatic access$getScope$p : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;)Lkotlinx/coroutines/CoroutineScope;
/*     */       //   67: invokestatic attachAsChildTo : (Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineScope;)V
/*     */       //   70: aload_2
/*     */       //   71: getstatic com/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent;
/*     */       //   74: aload_0
/*     */       //   75: checkcast kotlin/coroutines/Continuation
/*     */       //   78: aload_0
/*     */       //   79: aload_2
/*     */       //   80: putfield L$0 : Ljava/lang/Object;
/*     */       //   83: aload_0
/*     */       //   84: iconst_1
/*     */       //   85: putfield label : I
/*     */       //   88: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   93: dup
/*     */       //   94: aload #7
/*     */       //   96: if_acmpne -> 115
/*     */       //   99: aload #7
/*     */       //   101: areturn
/*     */       //   102: aload_0
/*     */       //   103: getfield L$0 : Ljava/lang/Object;
/*     */       //   106: checkcast kotlinx/coroutines/channels/ProducerScope
/*     */       //   109: astore_2
/*     */       //   110: aload_1
/*     */       //   111: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   114: aload_1
/*     */       //   115: pop
/*     */       //   116: aload_2
/*     */       //   117: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   120: invokestatic nestedDisposable : (Lkotlinx/coroutines/CoroutineScope;)Lcom/intellij/openapi/Disposable;
/*     */       //   123: astore_3
/*     */       //   124: aload_0
/*     */       //   125: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*     */       //   128: aload_2
/*     */       //   129: aload_0
/*     */       //   130: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   133: aload_3
/*     */       //   134: invokestatic access$setupBuildListeners : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   137: astore #4
/*     */       //   139: aload_0
/*     */       //   140: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*     */       //   143: aload_2
/*     */       //   144: aload_0
/*     */       //   145: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   148: aload_3
/*     */       //   149: aload #4
/*     */       //   151: invokestatic access$setupLaunchListeners : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;Lkotlinx/coroutines/CompletableDeferred;)Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   154: astore #5
/*     */       //   156: aload_0
/*     */       //   157: getfield $action : Lkotlin/jvm/functions/Function2;
/*     */       //   160: aload_2
/*     */       //   161: aload_3
/*     */       //   162: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/Disposable;)Lkotlin/jvm/functions/Function0;
/*     */       //   167: aload_0
/*     */       //   168: checkcast kotlin/coroutines/Continuation
/*     */       //   171: aload_0
/*     */       //   172: aload #4
/*     */       //   174: putfield L$0 : Ljava/lang/Object;
/*     */       //   177: aload_0
/*     */       //   178: aload #5
/*     */       //   180: putfield L$1 : Ljava/lang/Object;
/*     */       //   183: aload_0
/*     */       //   184: iconst_2
/*     */       //   185: putfield label : I
/*     */       //   188: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   191: dup
/*     */       //   192: aload #7
/*     */       //   194: if_acmpne -> 223
/*     */       //   197: aload #7
/*     */       //   199: areturn
/*     */       //   200: aload_0
/*     */       //   201: getfield L$1 : Ljava/lang/Object;
/*     */       //   204: checkcast kotlinx/coroutines/CompletableDeferred
/*     */       //   207: astore #5
/*     */       //   209: aload_0
/*     */       //   210: getfield L$0 : Ljava/lang/Object;
/*     */       //   213: checkcast kotlinx/coroutines/CompletableDeferred
/*     */       //   216: astore #4
/*     */       //   218: aload_1
/*     */       //   219: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   222: aload_1
/*     */       //   223: pop
/*     */       //   224: aload #4
/*     */       //   226: aload_0
/*     */       //   227: checkcast kotlin/coroutines/Continuation
/*     */       //   230: aload_0
/*     */       //   231: aload #5
/*     */       //   233: putfield L$0 : Ljava/lang/Object;
/*     */       //   236: aload_0
/*     */       //   237: aconst_null
/*     */       //   238: putfield L$1 : Ljava/lang/Object;
/*     */       //   241: aload_0
/*     */       //   242: iconst_3
/*     */       //   243: putfield label : I
/*     */       //   246: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   251: dup
/*     */       //   252: aload #7
/*     */       //   254: if_acmpne -> 274
/*     */       //   257: aload #7
/*     */       //   259: areturn
/*     */       //   260: aload_0
/*     */       //   261: getfield L$0 : Ljava/lang/Object;
/*     */       //   264: checkcast kotlinx/coroutines/CompletableDeferred
/*     */       //   267: astore #5
/*     */       //   269: aload_1
/*     */       //   270: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   273: aload_1
/*     */       //   274: checkcast java/lang/Boolean
/*     */       //   277: invokevirtual booleanValue : ()Z
/*     */       //   280: istore #6
/*     */       //   282: iload #6
/*     */       //   284: ifeq -> 323
/*     */       //   287: aload #5
/*     */       //   289: aload_0
/*     */       //   290: checkcast kotlin/coroutines/Continuation
/*     */       //   293: aload_0
/*     */       //   294: aconst_null
/*     */       //   295: putfield L$0 : Ljava/lang/Object;
/*     */       //   298: aload_0
/*     */       //   299: iconst_4
/*     */       //   300: putfield label : I
/*     */       //   303: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   308: dup
/*     */       //   309: aload #7
/*     */       //   311: if_acmpne -> 322
/*     */       //   314: aload #7
/*     */       //   316: areturn
/*     */       //   317: aload_1
/*     */       //   318: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   321: aload_1
/*     */       //   322: pop
/*     */       //   323: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   326: areturn
/*     */       //   327: new java/lang/IllegalStateException
/*     */       //   330: dup
/*     */       //   331: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   333: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   336: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #88	-> 3
/*     */       //   #89	-> 56
/*     */       //   #91	-> 70
/*     */       //   #88	-> 99
/*     */       //   #92	-> 115
/*     */       //   #94	-> 124
/*     */       //   #95	-> 139
/*     */       //   #97	-> 156
/*     */       //   #88	-> 197
/*     */       //   #102	-> 223
/*     */       //   #88	-> 257
/*     */       //   #102	-> 274
/*     */       //   #103	-> 282
/*     */       //   #104	-> 287
/*     */       //   #88	-> 314
/*     */       //   #106	-> 322
/*     */       //   #88	-> 327
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   56	46	2	$this$channelFlow	Lkotlinx/coroutines/channels/ProducerScope;
/*     */       //   110	81	2	$this$channelFlow	Lkotlinx/coroutines/channels/ProducerScope;
/*     */       //   124	67	3	channelDisposable	Lcom/intellij/openapi/Disposable;
/*     */       //   139	61	4	buildFinished	Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   218	33	4	buildFinished	Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   156	44	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   209	51	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   269	39	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   282	5	6	buildOk	Z
/*     */       //   0	337	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService$doRun$1;
/*     */       //   48	279	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RunService$doRun$1> $completion) {
/*     */       RunService$doRun$1 runService$doRun$1 = new RunService$doRun$1(this.$project, this.$action, $completion);
/*     */       runService$doRun$1.L$0 = value;
/*     */       return (Continuation<Unit>)runService$doRun$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */       return ((RunService$doRun$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(Function2 $action, ProducerScope $$this$channelFlow, Disposable $channelDisposable) {
/*     */       $action.invoke($$this$channelFlow, $channelDisposable);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Flow<RunEvent> build(@NotNull Project project) {
/*     */     Intrinsics.checkNotNullParameter(project, "project");
/*     */     return FlowKt.buffer$default(FlowKt.channelFlow(new RunService$build$1(project, null)), 2147483647, null, 2, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RunService.kt", l = {113, 119}, i = {0}, s = {"L$0"}, n = {"$this$channelFlow"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$build$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;"})
/*     */   static final class RunService$build$1 extends SuspendLambda implements Function2<ProducerScope<? super RunEvent>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     RunService$build$1(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProducerScope $this$channelFlow;
/*     */       CompletableDeferred buildFinished;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$channelFlow = (ProducerScope)this.L$0;
/*     */           CoroutineScopeKt.attachAsChildTo((CoroutineScope)$this$channelFlow, RunService.this.scope);
/*     */           this.L$0 = $this$channelFlow;
/*     */           this.label = 1;
/*     */           if ($this$channelFlow.send(RunStartedEvent.INSTANCE, (Continuation)this) == object)
/*     */             return object; 
/*     */           $this$channelFlow.send(RunStartedEvent.INSTANCE, (Continuation)this);
/*     */           buildFinished = RunService.this.setupBuildListeners($this$channelFlow, this.$project, CoroutinesKt.nestedDisposable((CoroutineScope)$this$channelFlow));
/*     */           ProjectTaskManager.getInstance(this.$project).buildAllModules();
/*     */           this.L$0 = null;
/*     */           this.label = 2;
/*     */           if (buildFinished.await((Continuation)this) == object)
/*     */             return object; 
/*     */           buildFinished.await((Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           $this$channelFlow = (ProducerScope)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           buildFinished = RunService.this.setupBuildListeners($this$channelFlow, this.$project, CoroutinesKt.nestedDisposable((CoroutineScope)$this$channelFlow));
/*     */           ProjectTaskManager.getInstance(this.$project).buildAllModules();
/*     */           this.L$0 = null;
/*     */           this.label = 2;
/*     */           if (buildFinished.await((Continuation)this) == object)
/*     */             return object; 
/*     */           buildFinished.await((Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super RunService$build$1> $completion) {
/*     */       RunService$build$1 runService$build$1 = new RunService$build$1(this.$project, $completion);
/*     */       runService$build$1.L$0 = value;
/*     */       return (Continuation<Unit>)runService$build$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */       return ((RunService$build$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void close() {
/*     */     CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
/*     */   }
/*     */   
/*     */   private final CompletableDeferred<Boolean> setupBuildListeners(ProducerScope<? super RunEvent> $this$setupBuildListeners, Project project, Disposable disposable) {
/*     */     CompletableDeferred<Boolean> buildPromise = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
/*     */     RunService$setupBuildListeners$buildListener$1 buildListener = new RunService$setupBuildListeners$buildListener$1($this$setupBuildListeners, buildPromise);
/*     */     BuildListenerRegistrar.Companion.register(project, disposable, buildListener);
/*     */     return buildPromise;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupBuildListeners$buildListener$1", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;", "onBuildError", "", "errorEvent", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent;", "onBuildFinished", "hasErrors", "", "ej-idea"})
/*     */   public static final class RunService$setupBuildListeners$buildListener$1 implements BuildListener {
/*     */     RunService$setupBuildListeners$buildListener$1(ProducerScope<RunEvent> producerScope, CompletableDeferred<Boolean> $buildPromise) {}
/*     */     
/*     */     public void onBuildError(BuildErrorEvent errorEvent) {
/*     */       Intrinsics.checkNotNullParameter(errorEvent, "errorEvent");
/*     */       RunService.this.sendEvent(this.$this_setupBuildListeners, errorEvent);
/*     */     }
/*     */     
/*     */     public void onBuildFinished(boolean hasErrors) {
/*     */       this.$buildPromise.complete(Boolean.valueOf(!hasErrors));
/*     */     }
/*     */   }
/*     */   
/*     */   private final CompletableDeferred<Unit> setupLaunchListeners(ProducerScope<? super RunEvent> $this$setupLaunchListeners, Project project, Disposable disposable, CompletableDeferred<Boolean> buildFinished) {
/*     */     CompletableDeferred<Unit> testsPromise = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
/*     */     MessageBusConnection connection = project.getMessageBus().connect(disposable);
/*     */     RunService$setupLaunchListeners$executionListener$1 executionListener = new RunService$setupLaunchListeners$executionListener$1($this$setupLaunchListeners, testsPromise);
/*     */     connection.subscribe(ExecutionManager.EXECUTION_TOPIC, executionListener);
/*     */     RunService$setupLaunchListeners$testListener$1 testListener = new RunService$setupLaunchListeners$testListener$1(this, $this$setupLaunchListeners, testsPromise);
/*     */     TestListenerRegistrar.Companion.register(project, disposable, testListener);
/*     */     return testsPromise;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0003\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\003\n\000*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026J(\020\n\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\013\032\0020\fH\026J\030\020\r\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\"\020\r\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\016\032\004\030\0010\017H\026¨\006\020"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$executionListener$1", "Lcom/intellij/execution/ExecutionListener;", "processStarting", "", "executorId", "", "env", "Lcom/intellij/execution/runners/ExecutionEnvironment;", "handler", "Lcom/intellij/execution/process/ProcessHandler;", "processTerminated", "exitCode", "", "processNotStarted", "cause", "", "ej-idea"})
/*     */   public static final class RunService$setupLaunchListeners$executionListener$1 implements ExecutionListener {
/*     */     RunService$setupLaunchListeners$executionListener$1(ProducerScope<RunEvent> producerScope, CompletableDeferred<Unit> $testsPromise) {}
/*     */     
/*     */     public void processStarting(String executorId, ExecutionEnvironment env, ProcessHandler handler) {
/*     */       Intrinsics.checkNotNullParameter(executorId, "executorId");
/*     */       Intrinsics.checkNotNullParameter(env, "env");
/*     */       Intrinsics.checkNotNullParameter(handler, "handler");
/*     */       handler.addProcessListener(new RunService$setupLaunchListeners$executionListener$1$processStarting$1(this.$this_setupLaunchListeners));
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\034\020\002\032\0020\0032\006\020\004\032\0020\0052\n\020\006\032\006\022\002\b\0030\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$executionListener$1$processStarting$1", "Lcom/intellij/execution/process/ProcessListener;", "onTextAvailable", "", "event", "Lcom/intellij/execution/process/ProcessEvent;", "outputType", "Lcom/intellij/openapi/util/Key;", "ej-idea"})
/*     */     public static final class RunService$setupLaunchListeners$executionListener$1$processStarting$1 implements ProcessListener {
/*     */       RunService$setupLaunchListeners$executionListener$1$processStarting$1(ProducerScope<RunEvent> producerScope) {}
/*     */       
/*     */       public void onTextAvailable(ProcessEvent event, Key outputType) {
/*     */         Intrinsics.checkNotNullParameter(event, "event");
/*     */         Intrinsics.checkNotNullParameter(outputType, "outputType");
/*     */         if (ProcessOutputType.isStderr(outputType)) {
/*     */           Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)");
/*     */           RunService.this.sendEvent(this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stderr));
/*     */         } else if (ProcessOutputType.isStdout(outputType)) {
/*     */           Intrinsics.checkNotNullExpressionValue(event.getText(), "getText(...)");
/*     */           RunService.this.sendEvent(this.$this_setupLaunchListeners, new OutputEvent(event.getText(), OutputType.Stdout));
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/*     */     public void processTerminated(String executorId, ExecutionEnvironment env, ProcessHandler handler, int exitCode) {
/*     */       Intrinsics.checkNotNullParameter(executorId, "executorId");
/*     */       Intrinsics.checkNotNullParameter(env, "env");
/*     */       Intrinsics.checkNotNullParameter(handler, "handler");
/*     */       RunService.logger.info("Process terminated: executorId: " + executorId + ", env: " + env + ", exitCode: " + exitCode);
/*     */       RunService.this.sendEvent(this.$this_setupLaunchListeners, new RunFinishedEvent(ResultStatus.Normally));
/*     */       this.$testsPromise.complete(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     public void processNotStarted(String executorId, ExecutionEnvironment env) {
/*     */       Intrinsics.checkNotNullParameter(executorId, "executorId");
/*     */       Intrinsics.checkNotNullParameter(env, "env");
/*     */       throw new IllegalStateException("Unexpected: processNotStarted: executorId: " + executorId + ", env: " + env);
/*     */     }
/*     */     
/*     */     public void processNotStarted(String executorId, ExecutionEnvironment env, Throwable cause) {
/*     */       Intrinsics.checkNotNullParameter(executorId, "executorId");
/*     */       Intrinsics.checkNotNullParameter(env, "env");
/*     */       RunService.logger.warn("processNotStarted: executorId: " + executorId + ", env: " + env + ", cause: " + cause);
/*     */       RunService.this.sendEvent(this.$this_setupLaunchListeners, new RunFinishedEvent(ResultStatus.WithTimeout));
/*     */       this.$testsPromise.complete(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\b\020\007\032\0020\003H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/RunService$setupLaunchListeners$testListener$1", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "onBuildFinished", "", "onTestFinished", "testEvent", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "onTestingFinished", "ej-idea"})
/*     */   public static final class RunService$setupLaunchListeners$testListener$1 implements TestListener {
/*     */     RunService$setupLaunchListeners$testListener$1(RunService $receiver, ProducerScope<RunEvent> producerScope, CompletableDeferred<Unit> $testsPromise) {}
/*     */     
/*     */     public void onBuildFinished() {
/*     */       RunService.logger.info("Build finished");
/*     */       this.$buildFinished.complete(Boolean.valueOf(true));
/*     */     }
/*     */     
/*     */     public void onTestFinished(TestEvent testEvent) {
/*     */       Intrinsics.checkNotNullParameter(testEvent, "testEvent");
/*     */       RunService.logger.info("Test finished: " + testEvent.getName() + " " + testEvent.getText() + " " + testEvent.getStackTrace() + " " + testEvent.getErrorMessage() + " " + testEvent.getTestResult() + " ");
/*     */       RunService.this.sendEvent(this.$this_setupLaunchListeners, testEvent);
/*     */     }
/*     */     
/*     */     public void onTestingFinished() {
/*     */       RunService.logger.info("Testing is finished");
/*     */       this.$testsPromise.complete(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void sendEvent(ProducerScope $this$sendEvent, RunEvent event) {
/*     */     $this$sendEvent.trySend-JP2dKIU(event);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */