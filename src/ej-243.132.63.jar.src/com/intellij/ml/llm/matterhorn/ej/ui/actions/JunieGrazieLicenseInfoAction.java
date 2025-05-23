/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.actions;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieAuthContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.ComposeDialogScope;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieLLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.LicenseData;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\000 \0162\0020\001:\001\016B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\020\020\n\032\0020\0072\006\020\b\032\0020\tH\026J\030\020\013\032\0020\0072\006\020\f\032\0020\r2\006\020\b\032\0020\tH\002¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction;", "Lcom/intellij/openapi/project/DumbAwareAction;", "<init>", "()V", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "update", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "actionPerformed", "showError", "service", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nJunieGrazieLicenseInfoAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieLicenseInfoAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,178:1\n31#2,2:179\n14#3:181\n*S KotlinDebug\n*F\n+ 1 JunieGrazieLicenseInfoAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction\n*L\n72#1:179,2\n37#1:181\n*E\n"})
/*     */ public final class JunieGrazieLicenseInfoAction extends DumbAwareAction {
/*  35 */   public JunieGrazieLicenseInfoAction() { super("License Info"); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*  37 */     public final Logger getLogger() { return JunieGrazieLicenseInfoAction.logger; } } @NotNull public static final Companion Companion = new Companion(null); public static final int $stable; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(JunieGrazieLicenseInfoAction.class), "getInstance(...)"); } @NotNull public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.BGT; } @NotNull private static final Logger logger = Logger.getInstance(JunieGrazieLicenseInfoAction.class);
/*     */   
/*     */   public void update(@NotNull AnActionEvent e) {
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     Project project = (Project)e.getData(CommonDataKeys.PROJECT);
/*     */     if (project == null) {
/*     */       e.getPresentation().setEnabledAndVisible(false);
/*     */       return;
/*     */     } 
/*     */     LLMProxy lLMProxy1 = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(project);
/*     */     JunieGrazieLLMProxy lLMProxy = (lLMProxy1 instanceof JunieGrazieLLMProxy) ? (JunieGrazieLLMProxy)lLMProxy1 : null;
/*     */     if (lLMProxy == null) {
/*     */       e.getPresentation().setEnabledAndVisible(false);
/*     */       return;
/*     */     } 
/*     */     GrazieAuthContext context = (GrazieAuthContext)Outcome.getOrNull-impl(((AiaActivation)lLMProxy.getAuthService().getAuthFacade().getActivationState().getValue()).getOutcome-07x5Wys());
/*     */     if (context == null) {
/*     */       e.getPresentation().setEnabledAndVisible(false);
/*     */       return;
/*     */     } 
/*     */     if (context.isEnterprise())
/*     */       e.getPresentation().setText("Enterprise License Info"); 
/*     */   }
/*     */   
/*     */   public void actionPerformed(@NotNull AnActionEvent e) {
/*     */     Object object;
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     EnvExtensionsKt.assertHasJbAI(BuildConfigKt.getConfig());
/*     */     Project project = (Project)e.getData(CommonDataKeys.PROJECT);
/*     */     if (project == null)
/*     */       return; 
/*     */     ComponentManager $this$service$iv = (ComponentManager)project;
/*     */     int $i$f$service = 0;
/*     */     Class<JunieGrazieQuota> serviceClass$iv = JunieGrazieQuota.class;
/*     */     if ($this$service$iv.getService(serviceClass$iv) == null) {
/*     */       $this$service$iv.getService(serviceClass$iv);
/*     */       throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv);
/*     */     } 
/*     */     JunieGrazieQuota service = (JunieGrazieQuota)$this$service$iv.getService(serviceClass$iv);
/*     */     LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(project);
/*     */     if (((lLMProxy instanceof JunieGrazieLLMProxy) ? lLMProxy : null) == null) {
/*     */       (lLMProxy instanceof JunieGrazieLLMProxy) ? lLMProxy : null;
/*     */       return;
/*     */     } 
/*     */     AiaActivation aiaActivation = (AiaActivation)object.getAuthService().getAuthFacade().getActivationState().getValue();
/*     */     GrazieAuthContext context = (GrazieAuthContext)Outcome.getOrNull-impl(aiaActivation.getOutcome-07x5Wys());
/*     */     if (context == null)
/*     */       return; 
/*     */     AiProJbaActivation pro = (aiaActivation instanceof AiProJbaActivation) ? (AiProJbaActivation)aiaActivation : null;
/*     */     if (pro == null)
/*     */       return; 
/*     */     pro.getActiveLicense();
/*     */     AipLicenseProductType productType = (pro.getActiveLicense() != null) ? pro.getActiveLicense().getProductType() : null;
/*     */     context.isEnterprise() ? BuildersKt.launch$default(service.getCs(), CoroutinesKt.getEDT(Dispatchers.INSTANCE), null, new JunieGrazieLicenseInfoAction$actionPerformed$1(e, null), 2, null) : BuildersKt.launch$default(service.getCs(), null, null, new JunieGrazieLicenseInfoAction$actionPerformed$2(service, e, project, pro, (JunieGrazieLLMProxy)object, productType, null), 3, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieLicenseInfoAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction$actionPerformed$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JunieGrazieLicenseInfoAction$actionPerformed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieGrazieLicenseInfoAction$actionPerformed$1(AnActionEvent $e, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Messages.showMessageDialog(this.$e.getProject(), "AI Enterprise is configured for your account.", "Junie", Messages.getInformationIcon());
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieGrazieLicenseInfoAction$actionPerformed$1> $completion) {
/*     */       return (Continuation<Unit>)new JunieGrazieLicenseInfoAction$actionPerformed$1(this.$e, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieGrazieLicenseInfoAction$actionPerformed$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieLicenseInfoAction.kt", l = {103, 129, 129}, i = {1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"lastQuota", "lastRefill", "activeLicense", "lastQuota", "lastRefill", "activeLicense"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction$actionPerformed$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nJunieGrazieLicenseInfoAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieLicenseInfoAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n31#2,2:179\n1#3:181\n*S KotlinDebug\n*F\n+ 1 JunieGrazieLicenseInfoAction.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2\n*L\n113#1:179,2\n*E\n"})
/*     */   static final class JunieGrazieLicenseInfoAction$actionPerformed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JunieGrazieLicenseInfoAction$actionPerformed$2(JunieGrazieQuota $service, AnActionEvent $e, Project $project, AiProJbaActivation $pro, JunieGrazieLLMProxy $proxy, AipLicenseProductType $productType, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #34
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 852, 0 -> 40, 1 -> 92, 2 -> 349, 3 -> 421
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: nop
/*     */       //   45: ldc2_w 10000
/*     */       //   48: new com/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2$1
/*     */       //   51: dup
/*     */       //   52: aload_0
/*     */       //   53: getfield $service : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */       //   56: aload_0
/*     */       //   57: getfield $proxy : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
/*     */       //   60: aload_0
/*     */       //   61: getfield $productType : Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   64: aconst_null
/*     */       //   65: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)V
/*     */       //   68: checkcast kotlin/jvm/functions/Function2
/*     */       //   71: aload_0
/*     */       //   72: checkcast kotlin/coroutines/Continuation
/*     */       //   75: aload_0
/*     */       //   76: iconst_1
/*     */       //   77: putfield label : I
/*     */       //   80: invokestatic withTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   83: dup
/*     */       //   84: aload #34
/*     */       //   86: if_acmpne -> 98
/*     */       //   89: aload #34
/*     */       //   91: areturn
/*     */       //   92: nop
/*     */       //   93: aload_1
/*     */       //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   97: aload_1
/*     */       //   98: pop
/*     */       //   99: goto -> 132
/*     */       //   102: astore_2
/*     */       //   103: getstatic com/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$Companion;
/*     */       //   106: invokevirtual getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   109: aload_2
/*     */       //   110: invokevirtual error : (Ljava/lang/Throwable;)V
/*     */       //   113: aload_0
/*     */       //   114: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction;
/*     */       //   117: aload_0
/*     */       //   118: getfield $service : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */       //   121: aload_0
/*     */       //   122: getfield $e : Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */       //   125: invokestatic access$showError : (Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;Lcom/intellij/openapi/actionSystem/AnActionEvent;)V
/*     */       //   128: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   131: areturn
/*     */       //   132: aload_0
/*     */       //   133: getfield $service : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */       //   136: invokevirtual getLastQuota : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */       //   139: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   144: checkcast ai/grazie/quota/Quota
/*     */       //   147: astore_2
/*     */       //   148: aload_0
/*     */       //   149: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   152: checkcast com/intellij/openapi/components/ComponentManager
/*     */       //   155: astore #4
/*     */       //   157: iconst_0
/*     */       //   158: istore #5
/*     */       //   160: ldc com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */       //   162: astore #6
/*     */       //   164: aload #4
/*     */       //   166: aload #6
/*     */       //   168: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   173: dup
/*     */       //   174: ifnonnull -> 186
/*     */       //   177: pop
/*     */       //   178: aload #4
/*     */       //   180: aload #6
/*     */       //   182: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */       //   185: athrow
/*     */       //   186: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */       //   189: invokevirtual getLastRefill : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */       //   192: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   197: checkcast ai/grazie/quota/QuotaRefill
/*     */       //   200: astore_3
/*     */       //   201: aload_0
/*     */       //   202: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   205: invokevirtual getActiveLicense : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   208: astore #4
/*     */       //   210: aload_2
/*     */       //   211: ifnull -> 223
/*     */       //   214: aload_3
/*     */       //   215: ifnull -> 223
/*     */       //   218: aload #4
/*     */       //   220: ifnonnull -> 242
/*     */       //   223: aload_0
/*     */       //   224: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction;
/*     */       //   227: aload_0
/*     */       //   228: getfield $service : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */       //   231: aload_0
/*     */       //   232: getfield $e : Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*     */       //   235: invokestatic access$showError : (Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction;Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;Lcom/intellij/openapi/actionSystem/AnActionEvent;)V
/*     */       //   238: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   241: areturn
/*     */       //   242: aload_0
/*     */       //   243: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   246: invokevirtual getActiveLicense : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   249: astore #6
/*     */       //   251: aload #6
/*     */       //   253: ifnull -> 301
/*     */       //   256: aload #6
/*     */       //   258: invokevirtual getProductType : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   261: astore #7
/*     */       //   263: aload #7
/*     */       //   265: ifnull -> 301
/*     */       //   268: aload #7
/*     */       //   270: astore #9
/*     */       //   272: iconst_0
/*     */       //   273: istore #10
/*     */       //   275: aload #9
/*     */       //   277: invokevirtual ordinal : ()I
/*     */       //   280: invokestatic getEntries : ()Lkotlin/enums/EnumEntries;
/*     */       //   283: checkcast java/util/List
/*     */       //   286: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   289: if_icmpeq -> 296
/*     */       //   292: iconst_1
/*     */       //   293: goto -> 297
/*     */       //   296: iconst_0
/*     */       //   297: nop
/*     */       //   298: goto -> 302
/*     */       //   301: iconst_0
/*     */       //   302: istore #5
/*     */       //   304: iload #5
/*     */       //   306: ifeq -> 466
/*     */       //   309: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository$Companion;
/*     */       //   312: aload_0
/*     */       //   313: checkcast kotlin/coroutines/Continuation
/*     */       //   316: aload_0
/*     */       //   317: aload_2
/*     */       //   318: putfield L$0 : Ljava/lang/Object;
/*     */       //   321: aload_0
/*     */       //   322: aload_3
/*     */       //   323: putfield L$1 : Ljava/lang/Object;
/*     */       //   326: aload_0
/*     */       //   327: aload #4
/*     */       //   329: putfield L$2 : Ljava/lang/Object;
/*     */       //   332: aload_0
/*     */       //   333: iconst_2
/*     */       //   334: putfield label : I
/*     */       //   337: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   340: dup
/*     */       //   341: aload #34
/*     */       //   343: if_acmpne -> 379
/*     */       //   346: aload #34
/*     */       //   348: areturn
/*     */       //   349: aload_0
/*     */       //   350: getfield L$2 : Ljava/lang/Object;
/*     */       //   353: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */       //   356: astore #4
/*     */       //   358: aload_0
/*     */       //   359: getfield L$1 : Ljava/lang/Object;
/*     */       //   362: checkcast ai/grazie/quota/QuotaRefill
/*     */       //   365: astore_3
/*     */       //   366: aload_0
/*     */       //   367: getfield L$0 : Ljava/lang/Object;
/*     */       //   370: checkcast ai/grazie/quota/Quota
/*     */       //   373: astore_2
/*     */       //   374: aload_1
/*     */       //   375: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   378: aload_1
/*     */       //   379: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository
/*     */       //   382: aload_0
/*     */       //   383: checkcast kotlin/coroutines/Continuation
/*     */       //   386: aload_0
/*     */       //   387: aload_2
/*     */       //   388: putfield L$0 : Ljava/lang/Object;
/*     */       //   391: aload_0
/*     */       //   392: aload_3
/*     */       //   393: putfield L$1 : Ljava/lang/Object;
/*     */       //   396: aload_0
/*     */       //   397: aload #4
/*     */       //   399: putfield L$2 : Ljava/lang/Object;
/*     */       //   402: aload_0
/*     */       //   403: iconst_3
/*     */       //   404: putfield label : I
/*     */       //   407: invokeinterface getPurchaseAipUrl : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   412: dup
/*     */       //   413: aload #34
/*     */       //   415: if_acmpne -> 451
/*     */       //   418: aload #34
/*     */       //   420: areturn
/*     */       //   421: aload_0
/*     */       //   422: getfield L$2 : Ljava/lang/Object;
/*     */       //   425: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicense
/*     */       //   428: astore #4
/*     */       //   430: aload_0
/*     */       //   431: getfield L$1 : Ljava/lang/Object;
/*     */       //   434: checkcast ai/grazie/quota/QuotaRefill
/*     */       //   437: astore_3
/*     */       //   438: aload_0
/*     */       //   439: getfield L$0 : Ljava/lang/Object;
/*     */       //   442: checkcast ai/grazie/quota/Quota
/*     */       //   445: astore_2
/*     */       //   446: aload_1
/*     */       //   447: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   450: aload_1
/*     */       //   451: checkcast java/lang/String
/*     */       //   454: astore #7
/*     */       //   456: aload #7
/*     */       //   458: <illegal opcode> invoke : (Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */       //   463: goto -> 467
/*     */       //   466: aconst_null
/*     */       //   467: astore #6
/*     */       //   469: nop
/*     */       //   470: aload #4
/*     */       //   472: invokevirtual isTrial : ()Z
/*     */       //   475: ifeq -> 494
/*     */       //   478: aload #4
/*     */       //   480: invokevirtual getProductType : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   483: invokevirtual getPresentableName : ()Ljava/lang/String;
/*     */       //   486: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   491: goto -> 502
/*     */       //   494: aload #4
/*     */       //   496: invokevirtual getProductType : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   499: invokevirtual getPresentableName : ()Ljava/lang/String;
/*     */       //   502: astore #7
/*     */       //   504: aload #7
/*     */       //   506: checkcast java/lang/CharSequence
/*     */       //   509: iconst_1
/*     */       //   510: anewarray java/lang/String
/*     */       //   513: astore #8
/*     */       //   515: aload #8
/*     */       //   517: iconst_0
/*     */       //   518: ldc ' '
/*     */       //   520: aastore
/*     */       //   521: aload #8
/*     */       //   523: iconst_0
/*     */       //   524: iconst_0
/*     */       //   525: bipush #6
/*     */       //   527: aconst_null
/*     */       //   528: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */       //   531: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */       //   534: pop
/*     */       //   535: aload_0
/*     */       //   536: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   539: invokevirtual getJbaAuthStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;
/*     */       //   542: invokevirtual getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */       //   545: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   548: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData
/*     */       //   551: dup
/*     */       //   552: ifnull -> 568
/*     */       //   555: invokevirtual getUser : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;
/*     */       //   558: dup
/*     */       //   559: ifnull -> 568
/*     */       //   562: invokevirtual getPresentableName : ()Ljava/lang/String;
/*     */       //   565: goto -> 570
/*     */       //   568: pop
/*     */       //   569: aconst_null
/*     */       //   570: aload_0
/*     */       //   571: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   574: invokevirtual getJbaAuthStep : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/JbaAuthStep;
/*     */       //   577: invokevirtual getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */       //   580: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   583: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData
/*     */       //   586: dup
/*     */       //   587: ifnull -> 603
/*     */       //   590: invokevirtual getUser : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaUser;
/*     */       //   593: dup
/*     */       //   594: ifnull -> 603
/*     */       //   597: invokevirtual getEmail : ()Ljava/lang/String;
/*     */       //   600: goto -> 605
/*     */       //   603: pop
/*     */       //   604: aconst_null
/*     */       //   605: aload #7
/*     */       //   607: aconst_null
/*     */       //   608: aload_0
/*     */       //   609: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   612: invokevirtual getActiveLicense : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   615: dup
/*     */       //   616: ifnull -> 625
/*     */       //   619: invokevirtual getLicensedTo : ()Ljava/lang/String;
/*     */       //   622: goto -> 627
/*     */       //   625: pop
/*     */       //   626: aconst_null
/*     */       //   627: aload_0
/*     */       //   628: getfield $pro : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiProJbaActivation;
/*     */       //   631: invokevirtual getActiveLicense : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   634: dup
/*     */       //   635: ifnull -> 644
/*     */       //   638: invokevirtual getExpiresOn : ()Lkotlinx/datetime/Instant;
/*     */       //   641: goto -> 646
/*     */       //   644: pop
/*     */       //   645: aconst_null
/*     */       //   646: aload_2
/*     */       //   647: invokevirtual getLicense : ()Lai/grazie/license/LicenseID;
/*     */       //   650: invokevirtual getId : ()Ljava/lang/String;
/*     */       //   653: aload_2
/*     */       //   654: invokevirtual getCurrent : ()Lai/grazie/utils/mpp/money/Credit;
/*     */       //   657: invokevirtual getAmount : ()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;
/*     */       //   660: invokevirtual asDouble : ()D
/*     */       //   663: invokestatic roundToInt : (D)I
/*     */       //   666: aload_2
/*     */       //   667: invokevirtual getMaximum : ()Lai/grazie/utils/mpp/money/Credit;
/*     */       //   670: invokevirtual getAmount : ()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;
/*     */       //   673: invokevirtual asDouble : ()D
/*     */       //   676: invokestatic roundToInt : (D)I
/*     */       //   679: aload_3
/*     */       //   680: invokevirtual getNext : ()Lai/grazie/utils/mpp/time/Timestamp;
/*     */       //   683: dup
/*     */       //   684: ifnull -> 747
/*     */       //   687: astore #10
/*     */       //   689: istore #20
/*     */       //   691: istore #19
/*     */       //   693: astore #18
/*     */       //   695: astore #17
/*     */       //   697: astore #16
/*     */       //   699: astore #15
/*     */       //   701: astore #14
/*     */       //   703: astore #13
/*     */       //   705: astore #12
/*     */       //   707: iconst_0
/*     */       //   708: istore #11
/*     */       //   710: getstatic kotlinx/datetime/Instant.Companion : Lkotlinx/datetime/Instant$Companion;
/*     */       //   713: aload #10
/*     */       //   715: invokevirtual getMillis : ()J
/*     */       //   718: invokevirtual fromEpochMilliseconds : (J)Lkotlinx/datetime/Instant;
/*     */       //   721: astore #21
/*     */       //   723: aload #12
/*     */       //   725: aload #13
/*     */       //   727: aload #14
/*     */       //   729: aload #15
/*     */       //   731: aload #16
/*     */       //   733: aload #17
/*     */       //   735: aload #18
/*     */       //   737: iload #19
/*     */       //   739: iload #20
/*     */       //   741: aload #21
/*     */       //   743: nop
/*     */       //   744: goto -> 749
/*     */       //   747: pop
/*     */       //   748: aconst_null
/*     */       //   749: bipush #8
/*     */       //   751: aconst_null
/*     */       //   752: astore #22
/*     */       //   754: istore #23
/*     */       //   756: astore #24
/*     */       //   758: istore #25
/*     */       //   760: istore #26
/*     */       //   762: astore #27
/*     */       //   764: astore #28
/*     */       //   766: astore #29
/*     */       //   768: astore #30
/*     */       //   770: astore #31
/*     */       //   772: astore #32
/*     */       //   774: astore #33
/*     */       //   776: new com/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData
/*     */       //   779: dup
/*     */       //   780: aload #33
/*     */       //   782: aload #32
/*     */       //   784: aload #31
/*     */       //   786: aload #30
/*     */       //   788: aload #29
/*     */       //   790: aload #28
/*     */       //   792: aload #27
/*     */       //   794: iload #26
/*     */       //   796: iload #25
/*     */       //   798: aload #24
/*     */       //   800: iload #23
/*     */       //   802: aload #22
/*     */       //   804: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Ljava/lang/String;IILkotlinx/datetime/Instant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   807: astore #8
/*     */       //   809: aload_0
/*     */       //   810: getfield $service : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */       //   813: invokevirtual getCs : ()Lkotlinx/coroutines/CoroutineScope;
/*     */       //   816: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */       //   819: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */       //   822: aconst_null
/*     */       //   823: new com/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2$2
/*     */       //   826: dup
/*     */       //   827: aload_0
/*     */       //   828: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   831: aload #8
/*     */       //   833: aload #6
/*     */       //   835: aconst_null
/*     */       //   836: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
/*     */       //   839: checkcast kotlin/jvm/functions/Function2
/*     */       //   842: iconst_2
/*     */       //   843: aconst_null
/*     */       //   844: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   847: pop
/*     */       //   848: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   851: areturn
/*     */       //   852: new java/lang/IllegalStateException
/*     */       //   855: dup
/*     */       //   856: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   859: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   862: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #101	-> 3
/*     */       //   #102	-> 44
/*     */       //   #103	-> 45
/*     */       //   #101	-> 89
/*     */       //   #103	-> 98
/*     */       //   #106	-> 102
/*     */       //   #107	-> 103
/*     */       //   #108	-> 113
/*     */       //   #109	-> 128
/*     */       //   #112	-> 132
/*     */       //   #113	-> 148
/*     */       //   #179	-> 160
/*     */       //   #180	-> 164
/*     */       //   #113	-> 189
/*     */       //   #115	-> 201
/*     */       //   #117	-> 210
/*     */       //   #118	-> 223
/*     */       //   #119	-> 238
/*     */       //   #123	-> 242
/*     */       //   #126	-> 242
/*     */       //   #123	-> 242
/*     */       //   #124	-> 246
/*     */       //   #125	-> 251
/*     */       //   #123	-> 256
/*     */       //   #125	-> 258
/*     */       //   #126	-> 263
/*     */       //   #123	-> 268
/*     */       //   #126	-> 270
/*     */       //   #181	-> 272
/*     */       //   #126	-> 275
/*     */       //   #126	-> 297
/*     */       //   #126	-> 298
/*     */       //   #123	-> 298
/*     */       //   #127	-> 301
/*     */       //   #123	-> 302
/*     */       //   #122	-> 302
/*     */       //   #128	-> 304
/*     */       //   #129	-> 309
/*     */       //   #101	-> 346
/*     */       //   #129	-> 379
/*     */       //   #101	-> 418
/*     */       //   #128	-> 456
/*     */       //   #131	-> 466
/*     */       //   #128	-> 467
/*     */       //   #132	-> 469
/*     */       //   #133	-> 470
/*     */       //   #134	-> 494
/*     */       //   #132	-> 502
/*     */       //   #136	-> 504
/*     */       //   #137	-> 535
/*     */       //   #138	-> 535
/*     */       //   #139	-> 570
/*     */       //   #140	-> 605
/*     */       //   #137	-> 607
/*     */       //   #141	-> 608
/*     */       //   #142	-> 627
/*     */       //   #143	-> 646
/*     */       //   #144	-> 653
/*     */       //   #145	-> 666
/*     */       //   #146	-> 679
/*     */       //   #181	-> 689
/*     */       //   #146	-> 710
/*     */       //   #146	-> 743
/*     */       //   #146	-> 747
/*     */       //   #137	-> 749
/*     */       //   #149	-> 809
/*     */       //   #164	-> 848
/*     */       //   #101	-> 852
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   103	29	2	th	Ljava/lang/Throwable;
/*     */       //   148	38	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   186	37	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   242	55	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   297	1	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   298	51	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   374	47	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   446	233	2	lastQuota	Lai/grazie/quota/Quota;
/*     */       //   201	22	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   242	55	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   297	1	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   298	51	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   366	55	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   438	245	3	lastRefill	Lai/grazie/quota/QuotaRefill;
/*     */       //   157	29	4	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */       //   210	13	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   242	55	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   297	1	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   298	51	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   358	63	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   430	64	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   494	8	4	activeLicense	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicense;
/*     */       //   304	5	5	canUpgradeLicense	Z
/*     */       //   164	22	6	serviceClass$iv	Ljava/lang/Class;
/*     */       //   469	252	6	onUpgradeClicked	Lkotlin/jvm/functions/Function0;
/*     */       //   721	23	6	onUpgradeClicked	Lkotlin/jvm/functions/Function0;
/*     */       //   744	108	6	onUpgradeClicked	Lkotlin/jvm/functions/Function0;
/*     */       //   456	7	7	url	Ljava/lang/String;
/*     */       //   504	103	7	licenseTypeFullName	Ljava/lang/String;
/*     */       //   809	43	8	licenseInfo	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/LicenseData;
/*     */       //   272	24	9	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */       //   689	32	10	it	Lai/grazie/utils/mpp/time/Timestamp;
/*     */       //   160	26	5	$i$f$service	I
/*     */       //   275	22	10	$i$a$-let-JunieGrazieLicenseInfoAction$actionPerformed$2$canUpgradeLicense$1	I
/*     */       //   710	11	11	$i$a$-let-JunieGrazieLicenseInfoAction$actionPerformed$2$licenseInfo$1	I
/*     */       //   0	863	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/actions/JunieGrazieLicenseInfoAction$actionPerformed$2;
/*     */       //   44	808	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   44	83	102	java/lang/Throwable
/*     */       //   92	99	102	java/lang/Throwable
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieGrazieLicenseInfoAction$actionPerformed$2> $completion) {
/*     */       return (Continuation<Unit>)new JunieGrazieLicenseInfoAction$actionPerformed$2(this.$service, this.$e, this.$project, this.$pro, this.$proxy, this.$productType, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieGrazieLicenseInfoAction$actionPerformed$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$1(String $url) {
/*     */       BrowserUtil.browse($url);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private final void showError(JunieGrazieQuota service, AnActionEvent e) {
/*     */     BuildersKt.launch$default(service.getCs(), CoroutinesKt.getEDT(Dispatchers.INSTANCE), null, new JunieGrazieLicenseInfoAction$showError$1(e, null), 2, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieLicenseInfoAction.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.actions.JunieGrazieLicenseInfoAction$showError$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JunieGrazieLicenseInfoAction$showError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieGrazieLicenseInfoAction$showError$1(AnActionEvent $e, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Messages.showErrorDialog(this.$e.getProject(), "Error fetching quota", "Junie");
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieGrazieLicenseInfoAction$showError$1> $completion) {
/*     */       return (Continuation<Unit>)new JunieGrazieLicenseInfoAction$showError$1(this.$e, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieGrazieLicenseInfoAction$showError$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\actions\JunieGrazieLicenseInfoAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */