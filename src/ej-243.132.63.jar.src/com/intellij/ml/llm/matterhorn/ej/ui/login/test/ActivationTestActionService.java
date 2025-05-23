/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login.test;
/*    */ @Service({Service.Level.PROJECT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\020\013\n\002\b\005\n\002\030\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003\n\002\030\002\n\000\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\006\020 \032\0020!J\006\020\"\032\0020!J*\020#\032\016\022\004\022\0020\033\022\004\022\0020\0340\0322\006\020\004\032\0020\0052\006\020\026\032\0020\0252\006\020$\032\0020%R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\027\020\f\032\b\022\004\022\0020\0160\r¢\006\b\n\000\032\004\b\017\020\020R\027\020\021\032\b\022\004\022\0020\0160\r¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\b\022\004\022\0020\0250\024X\004¢\006\002\n\000R\027\020\026\032\b\022\004\022\0020\0250\r¢\006\b\n\000\032\004\b\027\020\020R%\020\030\032\026\022\022\022\020\022\004\022\0020\033\022\004\022\0020\034\030\0010\0320\031¢\006\b\n\000\032\004\b\035\020\036R\016\020\037\032\0020\025XD¢\006\002\n\000¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/test/ActivationTestActionService;", "", "project", "Lcom/intellij/openapi/project/Project;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "_mockRegistry", "Lkotlinx/coroutines/flow/StateFlow;", "", "get_mockRegistry", "()Lkotlinx/coroutines/flow/StateFlow;", "mockRegistry", "getMockRegistry", "_index", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "index", "getIndex", "debugMockState", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "getDebugMockState", "()Lkotlinx/coroutines/flow/Flow;", "total", "next", "", "back", "createVms", "la", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class ActivationTestActionService {
/*    */   @NotNull
/*    */   private final Project project;
/*    */   @NotNull
/*    */   private final CoroutineScope scope;
/*    */   @NotNull
/*    */   private final StateFlow<Boolean> _mockRegistry;
/*    */   @NotNull
/*    */   private final StateFlow<Boolean> mockRegistry;
/*    */   @NotNull
/*    */   private final MutableStateFlow<Integer> _index;
/*    */   @NotNull
/*    */   private final StateFlow<Integer> index;
/*    */   @NotNull
/*    */   private final Flow<Pair<String, GrazieActivationState>> debugMockState;
/*    */   private final int total;
/*    */   public static final int $stable = 8;
/*    */   
/* 23 */   public ActivationTestActionService(@NotNull Project project, @NotNull CoroutineScope scope) { this.project = project; this.scope = scope;
/*    */     
/* 25 */     this._mockRegistry = CoroutineUtilKt.stateInNow(RegistryKt.asBooleanFlow(Registry.Companion.get("matterhorn.debug.mock.activation")), this.scope, Boolean.valueOf(false));
/* 26 */     this.mockRegistry = this._mockRegistry;
/*    */     
/* 28 */     this._index = StateFlowKt.MutableStateFlow(Integer.valueOf(0));
/* 29 */     this.index = (StateFlow<Integer>)this._index;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     this.debugMockState = FlowKt.transformLatest((Flow)CoroutineUtilKt.combineState(this.mockRegistry, this.index, ActivationTestActionService::debugMockState$lambda$0), new ActivationTestActionService$debugMockState$2(null));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     this.total = 16; }
/*    */   @NotNull public final Project getProject() { return this.project; }
/*    */   @NotNull public final CoroutineScope getScope() { return this.scope; }
/* 49 */   @NotNull public final StateFlow<Boolean> get_mockRegistry() { return this._mockRegistry; } @NotNull public final StateFlow<Boolean> getMockRegistry() { return this.mockRegistry; } public final void next() { if (((Number)this._index.getValue()).intValue() < this.total - 1)
/* 50 */     { MutableStateFlow<Integer> mutableStateFlow = this._index; int i = ((Number)mutableStateFlow.getValue()).intValue(); mutableStateFlow.setValue(Integer.valueOf(i + 1)); }
/*    */     else
/* 52 */     { this._index.setValue(Integer.valueOf(0)); }  }
/*    */   @NotNull public final StateFlow<Integer> getIndex() { return this.index; }
/*    */   @NotNull public final Flow<Pair<String, GrazieActivationState>> getDebugMockState() { return this.debugMockState; }
/*    */   private static final Integer debugMockState$lambda$0(boolean mock, int index) { return !mock ? null : Integer.valueOf(index); }
/*    */   @DebugMetadata(f = "LoginTestAction.kt", l = {39, 41, 41, 42}, i = {1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"$this$transformLatest", "index", "$this$transformLatest", "index"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.test.ActivationTestActionService$debugMockState$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\034\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\b\020\000\032\0020\001*\026\022\022\022\020\022\004\022\0020\004\022\004\022\0020\005\030\0010\0030\0022\b\020\006\032\004\030\0010\007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "index", ""}) static final class ActivationTestActionService$debugMockState$2 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends String, ? extends GrazieActivationState>>, Integer, Continuation<? super Unit>, Object> {
/* 57 */     int label; ActivationTestActionService$debugMockState$2(Continuation $completion) { super(3, $completion); } public final Object invokeSuspend(Object $result) { FlowCollector $this$transformLatest; Integer index; AipLicenseAgreement la; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$transformLatest = (FlowCollector)this.L$0; index = (Integer)this.L$1; if (index == null) { this.L$0 = null; this.label = 1; if ($this$transformLatest.emit(null, (Continuation)this) == object) return object;  } else { this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 2; if (JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this) == object) return object;  this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 3; if (((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this) == object) return object;  }  ((JunieAipLicenseAgreementRepository)JunieAipLicenseAgreementRepository.Companion.instance((Continuation)this)).loadLocalAgreementDocument((Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE;case 2: index = (Integer)this.L$1; $this$transformLatest = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.L$0 = $this$transformLatest; this.L$1 = index; this.label = 3; if (((JunieAipLicenseAgreementRepository)SYNTHETIC_LOCAL_VARIABLE_1).loadLocalAgreementDocument((Continuation)this) == object) return object; case 3: index = (Integer)this.L$1; $this$transformLatest = (FlowCollector)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); la = (AipLicenseAgreement)SYNTHETIC_LOCAL_VARIABLE_1; this.L$0 = null; this.L$1 = null; this.label = 4; if ($this$transformLatest.emit(ActivationTestActionService.this.createVms(ActivationTestActionService.this.getScope(), index.intValue(), la), (Continuation)this) == object) return object;  $this$transformLatest.emit(ActivationTestActionService.this.createVms(ActivationTestActionService.this.getScope(), index.intValue(), la), (Continuation)this); return Unit.INSTANCE;case 4: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(FlowCollector p1, Integer p2, Continuation<? super ActivationTestActionService$debugMockState$2> p3) { ActivationTestActionService$debugMockState$2 activationTestActionService$debugMockState$2 = new ActivationTestActionService$debugMockState$2(p3); activationTestActionService$debugMockState$2.L$0 = p1; activationTestActionService$debugMockState$2.L$1 = p2; return activationTestActionService$debugMockState$2.invokeSuspend(Unit.INSTANCE); } } public final void back() { if (((Number)this._index.getValue()).intValue() > 0) {
/* 58 */       MutableStateFlow<Integer> mutableStateFlow = this._index; int i = ((Number)mutableStateFlow.getValue()).intValue(); mutableStateFlow.setValue(Integer.valueOf(i + -1));
/*    */     } else {
/* 60 */       this._index.setValue(Integer.valueOf(this.total - 1));
/*    */     }  }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Pair<String, GrazieActivationState> createVms(@NotNull CoroutineScope scope, int index, @NotNull AipLicenseAgreement la) {
/* 67 */     Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(la, "la"); Pair[] arrayOfPair = new Pair[16]; arrayOfPair[0] = TuplesKt.to("AIE Not Authorised", new AIEBlocked(AIEBlocked.Reason.NotAuthenticated)); arrayOfPair[1] = 
/* 68 */       TuplesKt.to("AIE Blocked Company policy", new AIEBlocked(AIEBlocked.Reason.DisabledByCompanyPolicy));
/* 69 */     arrayOfPair[2] = TuplesKt.to("AIP Prohibited in Organization", new AIPBlocked(
/* 70 */           AIPBlocked.Reason.ProhibitedInOrganization, ActivationTestActionService::createVms$lambda$1));
/*    */     
/* 72 */     arrayOfPair[3] = TuplesKt.to("AIP Blocked in Selected Region", new AIPBlocked(
/* 73 */           AIPBlocked.Reason.RegionalSettings, ActivationTestActionService::createVms$lambda$2));
/*    */     
/* 75 */     arrayOfPair[4] = TuplesKt.to("Unauthenticated", new JbaUnauthenticated(scope, this.project, false));
/* 76 */     arrayOfPair[5] = TuplesKt.to("Unauthenticated - Rejected", new JbaUnauthenticated(scope, this.project, true));
/* 77 */     arrayOfPair[6] = TuplesKt.to("Agreement - Accept Update", new LicenseAgreement(scope, LicenseAgreementKind.AcceptUpdate, la, ActivationTestActionService::createVms$lambda$3));
/* 78 */     arrayOfPair[7] = TuplesKt.to("Agreement - In Browser", new LicenseAgreement(scope, LicenseAgreementKind.AcceptInBrowser, la, ActivationTestActionService::createVms$lambda$4));
/* 79 */     arrayOfPair[8] = TuplesKt.to("Agreement - Accept First Time", new LicenseAgreement(scope, LicenseAgreementKind.AcceptFirstTime, la, ActivationTestActionService::createVms$lambda$5));
/* 80 */     arrayOfPair[9] = TuplesKt.to("Missing License", new MissingAIPLicense(scope, ActivationTestActionService::createVms$lambda$6, ActivationTestActionService::createVms$lambda$7, ActivationTestActionService::createVms$lambda$8, ActivationTestActionService::createVms$lambda$9));
/* 81 */     arrayOfPair[10] = TuplesKt.to("Progressing", GrazieActivationState.Progressing.INSTANCE);
/* 82 */     arrayOfPair[11] = TuplesKt.to("Step Fail: FailedToFetchLicense", new StepFail(
/* 83 */           (StepFail.Reason)StepFail.Reason.FailedToFetchLicense.INSTANCE, ActivationTestActionService::createVms$lambda$10));
/*    */     
/* 85 */     arrayOfPair[12] = TuplesKt.to("Step Fail: AuthFailed", new StepFail(
/* 86 */           (StepFail.Reason)StepFail.Reason.AuthFailed.INSTANCE, ActivationTestActionService::createVms$lambda$11));
/*    */     
/* 88 */     arrayOfPair[13] = TuplesKt.to("Step Fail: FailedToLoadAgreement", new StepFail(
/* 89 */           (StepFail.Reason)StepFail.Reason.FailedToLoadAgreement.INSTANCE, ActivationTestActionService::createVms$lambda$12));
/*    */     
/* 91 */     arrayOfPair[14] = TuplesKt.to("Step Fail: FailedToResolveCloudURL", new StepFail(
/* 92 */           (StepFail.Reason)StepFail.Reason.FailedToResolveCloudURL.INSTANCE, ActivationTestActionService::createVms$lambda$13));
/*    */     
/* 94 */     arrayOfPair[15] = TuplesKt.to("Step Fail: Generic Error", new StepFail(
/* 95 */           (StepFail.Reason)new StepFail.Reason.GenericError("Generic error"), ActivationTestActionService::createVms$lambda$14));
/*    */     
/*    */     List<Pair<String, GrazieActivationState>> vms = CollectionsKt.listOf((Object[])arrayOfPair);
/* 98 */     LoginTestActionKt.access$getLog$p().assertTrue((vms.size() == this.total), "" + vms.size() + " != " + vms.size());
/* 99 */     return vms.get(index);
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$1() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$2() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$3() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$4() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$5() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final OpHandle createVms$lambda$6() {
/*    */     throw new IllegalStateException("".toString());
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$7() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$8() {
/*    */     throw new IllegalStateException("".toString());
/*    */   }
/*    */   
/*    */   private static final OpHandle createVms$lambda$9() {
/*    */     throw new IllegalStateException("".toString());
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$10() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$11() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$12() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$13() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createVms$lambda$14() {
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\test\ActivationTestActionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */