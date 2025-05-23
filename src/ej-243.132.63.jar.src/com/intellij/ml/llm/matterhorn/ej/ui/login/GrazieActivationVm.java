/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiEnterpriseActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AipLicenseAgreementAcceptStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.login.states.GrazieActivationState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.login.test.ActivationTestActionService;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\020\020\f\032\004\030\0010\003X\016¢\006\002\n\000R%\020\r\032\026\022\022\022\020\022\004\022\0020\020\022\004\022\0020\021\030\0010\0170\016¢\006\b\n\000\032\004\b\022\020\023R\021\020\024\032\0020\025¢\006\b\n\000\032\004\b\026\020\027R\027\020\030\032\b\022\004\022\0020\0210\016¢\006\b\n\000\032\004\b\031\020\023¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getProject", "()Lcom/intellij/openapi/project/Project;", "_currentStateScope", "debugMock", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "getDebugMock", "()Lkotlinx/coroutines/flow/StateFlow;", "authFacade", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "getAuthFacade", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "state", "getState", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nGrazieActivationVm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieActivationVm.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,225:1\n31#2,2:226\n49#3:228\n51#3:232\n46#4:229\n51#4:231\n105#5:230\n*S KotlinDebug\n*F\n+ 1 GrazieActivationVm.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm\n*L\n35#1:226,2\n50#1:228\n50#1:232\n50#1:229\n50#1:231\n50#1:230\n*E\n"})
/*     */ public final class GrazieActivationVm {
/*     */   public GrazieActivationVm(@NotNull CoroutineScope scope, @NotNull Project project) {
/*  29 */     this.scope = scope;
/*  30 */     this.project = project;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  35 */     ComponentManager $this$service$iv = (ComponentManager)this.project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     Class<ActivationTestActionService> serviceClass$iv = ActivationTestActionService.class;
/* 227 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ((GrazieActivationVm)$this$service$iv.getService(serviceClass$iv)).debugMock = CoroutineUtilKt.stateInNow(((ActivationTestActionService)$this$service$iv.getService(serviceClass$iv)).getDebugMockState(), this.scope, null); this.authFacade = GrazieAuthFacade.Companion.getInstance(); Flow flow1 = FlowKt.flowCombineTransform(FlowKt.flowCombineTransform((Flow)this.authFacade.getActivationState(), (Flow)this.authFacade.getOptimisticState(), new GrazieActivationVm$state$1(null)), (Flow)this.debugMock, new GrazieActivationVm$state$2(null)); int $i$f$map = 0;
/* 228 */     Flow $this$unsafeTransform$iv$iv = flow1; int $i$f$unsafeTransform = 0;
/* 229 */     int $i$f$unsafeFlow = 0;
/* 230 */     this.state = CoroutineUtilKt.stateInNow(new GrazieActivationVm$special$$inlined$map$1($this$unsafeTransform$iv$iv, this), this.scope, GrazieActivationState.Progressing.INSTANCE);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @Nullable
/*     */   private CoroutineScope _currentStateScope;
/*     */   @NotNull
/*     */   private final StateFlow<Pair<String, GrazieActivationState>> debugMock;
/*     */   @NotNull
/*     */   private final GrazieAuthFacade authFacade;
/*     */   @NotNull
/*     */   private final StateFlow<GrazieActivationState> state;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final CoroutineScope getScope() {
/*     */     return this.scope;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Project getProject() {
/*     */     return this.project;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<Pair<String, GrazieActivationState>> getDebugMock() {
/*     */     return this.debugMock;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final GrazieAuthFacade getAuthFacade() {
/*     */     return this.authFacade;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<GrazieActivationState> getState() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieActivationVm.kt", l = {41}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm$state$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\020\000\032\0020\001*\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0050\0030\0022\006\020\006\032\0020\0042\006\020\007\032\0020\005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "", "activation", "optimisticState"})
/*     */   static final class GrazieActivationVm$state$1 extends SuspendLambda implements Function4<FlowCollector<? super Pair<? extends AiaActivation, ? extends Boolean>>, AiaActivation, Boolean, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieActivationVm$state$1(Continuation $completion) {
/*     */       super(4, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FlowCollector $this$combineTransform;
/*     */       AiaActivation activation;
/*     */       boolean optimisticState;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$combineTransform = (FlowCollector)this.L$0;
/*     */           activation = (AiaActivation)this.L$1;
/*     */           optimisticState = this.Z$0;
/*     */           this.L$0 = null;
/*     */           this.label = 1;
/*     */           if ($this$combineTransform.emit(TuplesKt.to(activation, Boxing.boxBoolean(optimisticState)), (Continuation)this) == object)
/*     */             return object; 
/*     */           $this$combineTransform.emit(TuplesKt.to(activation, Boxing.boxBoolean(optimisticState)), (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(FlowCollector p1, AiaActivation p2, boolean p3, Continuation<? super GrazieActivationVm$state$1> p4) {
/*     */       GrazieActivationVm$state$1 grazieActivationVm$state$1 = new GrazieActivationVm$state$1(p4);
/*     */       grazieActivationVm$state$1.L$0 = p1;
/*     */       grazieActivationVm$state$1.L$1 = p2;
/*     */       grazieActivationVm$state$1.Z$0 = p3;
/*     */       return grazieActivationVm$state$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieActivationVm.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.GrazieActivationVm$state$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000'\n\000\n\002\020\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\013\n\000\n\002\020\016\n\002\030\002*\001\003\020\000\032\0020\001*\b\022\004\022\0020\0030\0022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\0052\024\020\b\032\020\022\004\022\0020\t\022\004\022\0020\n\030\0010\005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1", "value", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "", "mock", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;"})
/*     */   static final class GrazieActivationVm$state$2 extends SuspendLambda implements Function4<FlowCollector<? super GrazieActivationVm$state$2.null>, Pair<? extends AiaActivation, ? extends Boolean>, Pair<? extends String, ? extends GrazieActivationState>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieActivationVm$state$2(Continuation $completion) {
/*     */       super(4, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FlowCollector $this$combineTransform;
/*     */       Pair<? extends AiaActivation, Boolean> value;
/*     */       Pair<String, ? extends GrazieActivationState> mock;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$combineTransform = (FlowCollector)this.L$0;
/*     */           value = (Pair)this.L$1;
/*     */           mock = (Pair)this.L$2;
/*     */           this.L$0 = null;
/*     */           this.L$1 = null;
/*     */           this.label = 1;
/*     */           if ($this$combineTransform.emit(new Object(value, mock) {
/*     */                 private final AiaActivation activation;
/*     */                 private final boolean optimisticState;
/*     */                 private final GrazieActivationState mock;
/*     */                 
/*     */                 public final AiaActivation getActivation() {
/*     */                   return this.activation;
/*     */                 }
/*     */                 
/*     */                 public final boolean getOptimisticState() {
/*     */                   return this.optimisticState;
/*     */                 }
/*     */                 
/*     */                 public final GrazieActivationState getMock() {
/*     */                   return this.mock;
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           $this$combineTransform.emit(new Object(value, mock) {
/*     */                 private final AiaActivation activation;
/*     */                 private final boolean optimisticState;
/*     */                 private final GrazieActivationState mock;
/*     */                 
/*     */                 public final AiaActivation getActivation() {
/*     */                   return this.activation;
/*     */                 }
/*     */                 
/*     */                 public final boolean getOptimisticState() {
/*     */                   return this.optimisticState;
/*     */                 }
/*     */                 
/*     */                 public final GrazieActivationState getMock() {
/*     */                   return this.mock;
/*     */                 }
/*     */               }(Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(FlowCollector p1, Pair p2, Pair p3, Continuation<? super GrazieActivationVm$state$2> p4) {
/*     */       GrazieActivationVm$state$2 grazieActivationVm$state$2 = new GrazieActivationVm$state$2(p4);
/*     */       grazieActivationVm$state$2.L$0 = p1;
/*     */       grazieActivationVm$state$2.L$1 = p2;
/*     */       grazieActivationVm$state$2.L$2 = p3;
/*     */       return grazieActivationVm$state$2.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000#\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\004\020\005R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\b\020\tR\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/login/GrazieActivationVm$state$2$1", "", "activation", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "getActivation", "()Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "optimisticState", "", "getOptimisticState", "()Z", "mock", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "getMock", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "ej-ui"})
/*     */   public static final class null {
/*     */     private final AiaActivation activation;
/*     */     private final boolean optimisticState;
/*     */     private final GrazieActivationState mock;
/*     */     
/*     */     null(Pair $value, Pair $mock) {
/*     */       this.activation = (AiaActivation)$value.getFirst();
/*     */       this.optimisticState = ((Boolean)$value.getSecond()).booleanValue();
/*     */       this.mock = ($mock != null) ? (GrazieActivationState)$mock.getSecond() : null;
/*     */     }
/*     */     
/*     */     public final AiaActivation getActivation() {
/*     */       return this.activation;
/*     */     }
/*     */     
/*     */     public final boolean getOptimisticState() {
/*     */       return this.optimisticState;
/*     */     }
/*     */     
/*     */     public final GrazieActivationState getMock() {
/*     */       return this.mock;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$1 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getLicenseJourney() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep() != null) {
/*     */         (OpHandle)((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep().getOnLoadRequested().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$1(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$2 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getLicenseJourney() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep() != null) {
/*     */         (OpHandle)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnFetchRequested().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$2(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$3 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getGrazieCloudUrlStep() != null && ((AiProJbaActivation)this.$activation).getGrazieCloudUrlStep().getOnResolveRequested() != null) {
/*     */         (OpHandle)((AiProJbaActivation)this.$activation).getGrazieCloudUrlStep().getOnResolveRequested().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getGrazieCloudUrlStep().getOnResolveRequested();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$3(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$4 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep() != null && ((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested() != null) {
/*     */         (OpHandle)((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$4(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$5 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       GrazieActivationVm.this.getAuthFacade().relogin();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$6 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiEnterpriseActivation");
/*     */       if (((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep() != null && ((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities() != null) {
/*     */         (OpHandle)((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities().invoke();
/*     */       } else {
/*     */         ((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$6(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$7 implements Function0<Unit> {
/*     */     public static final GrazieActivationVm$state$3$7 INSTANCE = new GrazieActivationVm$state$3$7();
/*     */     
/*     */     public final void invoke() {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$8$1 implements Function0<Unit> {
/*     */     GrazieActivationVm$state$3$8$1(AipLicenseAgreementAcceptStep $agreementAcceptStep) {}
/*     */     
/*     */     public final void invoke() {
/*     */       this.$agreementAcceptStep.getOnAccepted().invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$9$1 implements Function0<Unit> {
/*     */     GrazieActivationVm$state$3$9$1(AipLicenseAgreementAcceptStep $agreementAcceptStep) {}
/*     */     
/*     */     public final void invoke() {
/*     */       this.$agreementAcceptStep.getOnAccepted().invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$10$1 implements Function0<Unit> {
/*     */     GrazieActivationVm$state$3$10$1(AipLicenseAgreementAcceptStep $agreementAcceptStep) {}
/*     */     
/*     */     public final void invoke() {
/*     */       this.$agreementAcceptStep.getOnAccepted().invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$11$1 implements Function0<Unit> {
/*     */     GrazieActivationVm$state$3$11$1(AipLicenseAgreementAcceptStep $agreementAcceptStep) {}
/*     */     
/*     */     public final void invoke() {
/*     */       this.$agreementAcceptStep.getOnAccepted().invoke();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$15 implements Function0<OpHandle<? extends AipLicenseRequestFailure>> {
/*     */     public final OpHandle<AipLicenseRequestFailure> invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnFetchRequested();
/*     */       return (((AiProJbaActivation)this.$activation).getLicenseJourney() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnFetchRequested() != null) ? (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnFetchRequested().invoke() : null;
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$15(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$12 implements Function0<OpHandle<? extends AipLicenseRequestFailure>> {
/*     */     public final OpHandle<AipLicenseRequestFailure> invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getLicenseJourney() == null || ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep() == null || ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested() == null || (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke() == null) {
/*     */         (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke();
/*     */         throw new IllegalStateException("Required step is null".toString());
/*     */       } 
/*     */       return (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke();
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$12(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$13 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getLicenseJourney() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementAcceptStep() != null) {
/*     */         ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementAcceptStep().getOnResetToInitial().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementAcceptStep();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$13(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$14 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       if (((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep() != null && ((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested() != null) {
/*     */         (OpHandle)((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested().invoke();
/*     */       } else {
/*     */         ((AiProJbaActivation)this.$activation).getGrazieJbaAuthStep().getOnAccessRequested();
/*     */       } 
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$14(AiaActivation $activation) {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieActivationVm$state$3$16 implements Function0<Unit> {
/*     */     public final void invoke() {
/*     */       Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation");
/*     */       ((AiProJbaActivation)this.$activation).getAiAllowanceStep().getOnVerifyRequested().invoke();
/*     */     }
/*     */     
/*     */     GrazieActivationVm$state$3$16(AiaActivation $activation) {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */