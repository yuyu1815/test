/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login.states;
/*     */ 
/*     */ import kotlin.coroutines.Continuation;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\007\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\b\007\030\0002\0020\001:\002!\"BU\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005\022\f\020\b\032\b\022\004\022\0020\t0\005\022\f\020\n\032\b\022\004\022\0020\t0\005\022\024\020\013\032\020\022\f\022\n\022\004\022\0020\007\030\0010\0060\005¢\006\004\b\f\020\rJ\006\020\033\032\0020\tJ\006\020\034\032\0020\tJ\006\020\035\032\0020\tJ\006\020\036\032\0020\tJ\006\020\037\032\0020\tJ\006\020 \032\0020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\032\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\t0\005X\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\t0\005X\004¢\006\002\n\000R\034\020\013\032\020\022\f\022\n\022\004\022\0020\007\030\0010\0060\005X\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0220\021X\004¢\006\002\n\000R\027\020\023\032\b\022\004\022\0020\0220\024¢\006\b\n\000\032\004\b\025\020\026R\024\020\027\032\b\022\004\022\0020\0300\021X\004¢\006\002\n\000R\027\020\031\032\b\022\004\022\0020\0300\024¢\006\b\n\000\032\004\b\032\020\026¨\006#"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/GrazieActivationState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onRequestTrial", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;", "checkPersonalTos", "", "checkJba", "refreshLicenses", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "_refreshState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "refreshState", "Lkotlinx/coroutines/flow/StateFlow;", "getRefreshState", "()Lkotlinx/coroutines/flow/StateFlow;", "_trialRequestState", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "trialRequestState", "getTrialRequestState", "openTrialTermOfService", "navigateToPaymentMethod", "navigateToRegionSettings", "navigateToPurchase", "refreshLicenseList", "requestTrial", "TrialRequestState", "RefreshState", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nMissingAIPLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,225:1\n226#2,5:226\n226#2,5:231\n*S KotlinDebug\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense\n*L\n68#1:226,5\n87#1:231,5\n*E\n"})
/*     */ public final class MissingAIPLicense implements GrazieActivationState {
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final Function0<OpHandle<AipLicenseRequestFailure>> onRequestTrial;
/*     */   @NotNull
/*     */   private final Function0<Unit> checkPersonalTos;
/*     */   @NotNull
/*     */   private final Function0<Unit> checkJba;
/*     */   @NotNull
/*     */   private final Function0<OpHandle<AipLicenseRequestFailure>> refreshLicenses;
/*     */   
/*  20 */   public MissingAIPLicense(@NotNull CoroutineScope scope, @NotNull Function0<OpHandle<AipLicenseRequestFailure>> onRequestTrial, @NotNull Function0<Unit> checkPersonalTos, @NotNull Function0<Unit> checkJba, @NotNull Function0<OpHandle<AipLicenseRequestFailure>> refreshLicenses) { this.scope = scope;
/*  21 */     this.onRequestTrial = onRequestTrial;
/*  22 */     this.checkPersonalTos = checkPersonalTos;
/*  23 */     this.checkJba = checkJba;
/*  24 */     this.refreshLicenses = refreshLicenses;
/*     */ 
/*     */     
/*  27 */     this._refreshState = StateFlowKt.MutableStateFlow(RefreshState.Initial.INSTANCE);
/*  28 */     this.refreshState = (StateFlow<RefreshState>)this._refreshState;
/*     */     
/*  30 */     this._trialRequestState = StateFlowKt.MutableStateFlow(TrialRequestState.NotRequested.INSTANCE);
/*  31 */     this.trialRequestState = (StateFlow<TrialRequestState>)this._trialRequestState; } @NotNull private final MutableStateFlow<RefreshState> _refreshState; @NotNull private final StateFlow<RefreshState> refreshState; @NotNull private final MutableStateFlow<TrialRequestState> _trialRequestState; @NotNull private final StateFlow<TrialRequestState> trialRequestState; public static final int $stable = 8; @NotNull public final CoroutineScope getScope() { return this.scope; } @NotNull public final StateFlow<RefreshState> getRefreshState() { return this.refreshState; } @NotNull public final StateFlow<TrialRequestState> getTrialRequestState() { return this.trialRequestState; }
/*     */ 
/*     */   
/*  34 */   public final void openTrialTermOfService() { MissingAIPLicenseKt.access$getLogger().info("Opening trial term of service");
/*  35 */     BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$openTrialTermOfService$1(null), 3, null); } @DebugMetadata(f = "MissingAIPLicense.kt", l = {36, 36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$openTrialTermOfService$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MissingAIPLicense$openTrialTermOfService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; MissingAIPLicense$openTrialTermOfService$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String terms; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  36 */           this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getLicenseUrl((Continuation)this) == object) return object;  terms = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getLicenseUrl((Continuation)this);
/*  37 */           BrowserUtil.open(terms);
/*  38 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getLicenseUrl((Continuation)this) == object) return object;  terms = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getLicenseUrl((Continuation)this); BrowserUtil.open(terms); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); terms = (String)SYNTHETIC_LOCAL_VARIABLE_1; BrowserUtil.open(terms); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$openTrialTermOfService$1> $completion) { return (Continuation<Unit>)new MissingAIPLicense$openTrialTermOfService$1($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MissingAIPLicense$openTrialTermOfService$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  42 */   public final void navigateToPaymentMethod() { MissingAIPLicenseKt.access$getLogger().info("Navigate to payment method page");
/*  43 */     BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$navigateToPaymentMethod$1(null), 3, null); } @DebugMetadata(f = "MissingAIPLicense.kt", l = {44, 44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$navigateToPaymentMethod$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MissingAIPLicense$navigateToPaymentMethod$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; MissingAIPLicense$navigateToPaymentMethod$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String paymentMethodsUrl; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  44 */           this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPaymentMethodsUrl((Continuation)this) == object) return object;  paymentMethodsUrl = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPaymentMethodsUrl((Continuation)this);
/*  45 */           BrowserUtil.open(paymentMethodsUrl);
/*  46 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPaymentMethodsUrl((Continuation)this) == object) return object;  paymentMethodsUrl = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPaymentMethodsUrl((Continuation)this); BrowserUtil.open(paymentMethodsUrl); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); paymentMethodsUrl = (String)SYNTHETIC_LOCAL_VARIABLE_1; BrowserUtil.open(paymentMethodsUrl); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$navigateToPaymentMethod$1> $completion) { return (Continuation<Unit>)new MissingAIPLicense$navigateToPaymentMethod$1($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MissingAIPLicense$navigateToPaymentMethod$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  50 */   public final void navigateToRegionSettings() { MissingAIPLicenseKt.access$getLogger().info("Navigate to regional settings page");
/*  51 */     BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$navigateToRegionSettings$1(null), 3, null); } @DebugMetadata(f = "MissingAIPLicense.kt", l = {52, 52}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$navigateToRegionSettings$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MissingAIPLicense$navigateToRegionSettings$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; MissingAIPLicense$navigateToRegionSettings$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String regionalSettingsUrl; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  52 */           this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getManageAccountUrl((Continuation)this) == object) return object;  regionalSettingsUrl = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getManageAccountUrl((Continuation)this);
/*  53 */           BrowserUtil.open(regionalSettingsUrl);
/*  54 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getManageAccountUrl((Continuation)this) == object) return object;  regionalSettingsUrl = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getManageAccountUrl((Continuation)this); BrowserUtil.open(regionalSettingsUrl); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); regionalSettingsUrl = (String)SYNTHETIC_LOCAL_VARIABLE_1; BrowserUtil.open(regionalSettingsUrl); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$navigateToRegionSettings$1> $completion) { return (Continuation<Unit>)new MissingAIPLicense$navigateToRegionSettings$1($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MissingAIPLicense$navigateToRegionSettings$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  58 */   public final void navigateToPurchase() { MissingAIPLicenseKt.access$getLogger().info("Navigate to purchase page");
/*  59 */     BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$navigateToPurchase$1(null), 3, null); } @DebugMetadata(f = "MissingAIPLicense.kt", l = {60, 60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$navigateToPurchase$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class MissingAIPLicense$navigateToPurchase$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; MissingAIPLicense$navigateToPurchase$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { String purchaseUrl; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  60 */           this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this) == object) return object;  purchaseUrl = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this);
/*  61 */           BrowserUtil.open(purchaseUrl);
/*  62 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this) == object) return object;  purchaseUrl = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this); BrowserUtil.open(purchaseUrl); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); purchaseUrl = (String)SYNTHETIC_LOCAL_VARIABLE_1; BrowserUtil.open(purchaseUrl); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$navigateToPurchase$1> $completion) { return (Continuation<Unit>)new MissingAIPLicense$navigateToPurchase$1($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MissingAIPLicense$navigateToPurchase$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  66 */   public final void refreshLicenseList() { MissingAIPLicenseKt.access$getLogger().info("Refresh license list");
/*  67 */     if (!Intrinsics.areEqual(this._refreshState.getValue(), RefreshState.Progress.INSTANCE))
/*  68 */     { MutableStateFlow<RefreshState> $this$update$iv = this._refreshState; int $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       while (true)
/* 227 */       { Object prevValue$iv = $this$update$iv.getValue();
/* 228 */         RefreshState it = (RefreshState)prevValue$iv; int $i$a$-update-MissingAIPLicense$refreshLicenseList$1 = 0; Object nextValue$iv = RefreshState.Progress.INSTANCE;
/* 229 */         if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$refreshLicenseList$2(null), 3, null);  }  }  } @DebugMetadata(f = "MissingAIPLicense.kt", l = {71}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$refreshLicenseList$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nMissingAIPLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,225:1\n226#2,5:226\n226#2,5:231\n226#2,5:236\n*S KotlinDebug\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2\n*L\n73#1:226,5\n75#1:231,5\n78#1:236,5\n*E\n"}) static final class MissingAIPLicense$refreshLicenseList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label; MissingAIPLicense$refreshLicenseList$2(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #8
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 286, 0 -> 32, 1 -> 79
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: nop
/*     */       //   37: aload_0
/*     */       //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   41: invokestatic access$getRefreshLicenses$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
/*     */       //   44: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   49: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpHandle
/*     */       //   52: dup
/*     */       //   53: ifnull -> 91
/*     */       //   56: aload_0
/*     */       //   57: checkcast kotlin/coroutines/Continuation
/*     */       //   60: aload_0
/*     */       //   61: iconst_1
/*     */       //   62: putfield label : I
/*     */       //   65: invokeinterface awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   70: dup
/*     */       //   71: aload #8
/*     */       //   73: if_acmpne -> 85
/*     */       //   76: aload #8
/*     */       //   78: areturn
/*     */       //   79: nop
/*     */       //   80: aload_1
/*     */       //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   84: aload_1
/*     */       //   85: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*     */       //   88: goto -> 93
/*     */       //   91: pop
/*     */       //   92: aconst_null
/*     */       //   93: astore_2
/*     */       //   94: aload_2
/*     */       //   95: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*     */       //   98: ifeq -> 155
/*     */       //   101: aload_0
/*     */       //   102: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   105: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   108: astore_3
/*     */       //   109: iconst_0
/*     */       //   110: istore #4
/*     */       //   112: nop
/*     */       //   113: aload_3
/*     */       //   114: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   119: astore #5
/*     */       //   121: aload #5
/*     */       //   123: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   126: pop
/*     */       //   127: iconst_0
/*     */       //   128: istore #7
/*     */       //   130: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;
/*     */       //   133: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   136: astore #6
/*     */       //   138: aload_3
/*     */       //   139: aload #5
/*     */       //   141: aload #6
/*     */       //   143: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   148: ifeq -> 112
/*     */       //   151: nop
/*     */       //   152: goto -> 282
/*     */       //   155: aload_0
/*     */       //   156: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   159: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   162: astore_3
/*     */       //   163: iconst_0
/*     */       //   164: istore #4
/*     */       //   166: nop
/*     */       //   167: aload_3
/*     */       //   168: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   173: astore #5
/*     */       //   175: aload #5
/*     */       //   177: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   180: pop
/*     */       //   181: iconst_0
/*     */       //   182: istore #7
/*     */       //   184: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
/*     */       //   187: dup
/*     */       //   188: ldc 'Refresh failed'
/*     */       //   190: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   193: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   196: astore #6
/*     */       //   198: aload_3
/*     */       //   199: aload #5
/*     */       //   201: aload #6
/*     */       //   203: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   208: ifeq -> 166
/*     */       //   211: nop
/*     */       //   212: goto -> 282
/*     */       //   215: astore_2
/*     */       //   216: aload_0
/*     */       //   217: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   220: invokestatic access$get_refreshState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   223: astore_3
/*     */       //   224: iconst_0
/*     */       //   225: istore #4
/*     */       //   227: nop
/*     */       //   228: aload_3
/*     */       //   229: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   234: astore #5
/*     */       //   236: aload #5
/*     */       //   238: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   241: pop
/*     */       //   242: iconst_0
/*     */       //   243: istore #7
/*     */       //   245: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error
/*     */       //   248: dup
/*     */       //   249: aload_2
/*     */       //   250: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   253: dup
/*     */       //   254: ifnonnull -> 260
/*     */       //   257: pop
/*     */       //   258: ldc 'Unknown error'
/*     */       //   260: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   263: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState
/*     */       //   266: astore #6
/*     */       //   268: aload_3
/*     */       //   269: aload #5
/*     */       //   271: aload #6
/*     */       //   273: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   278: ifeq -> 227
/*     */       //   281: nop
/*     */       //   282: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   285: areturn
/*     */       //   286: new java/lang/IllegalStateException
/*     */       //   289: dup
/*     */       //   290: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   292: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   295: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #69	-> 3
/*     */       //   #70	-> 36
/*     */       //   #71	-> 37
/*     */       //   #69	-> 76
/*     */       //   #71	-> 85
/*     */       //   #72	-> 94
/*     */       //   #73	-> 101
/*     */       //   #226	-> 112
/*     */       //   #227	-> 113
/*     */       //   #228	-> 121
/*     */       //   #73	-> 130
/*     */       //   #228	-> 136
/*     */       //   #229	-> 138
/*     */       //   #230	-> 151
/*     */       //   #75	-> 155
/*     */       //   #231	-> 166
/*     */       //   #232	-> 167
/*     */       //   #233	-> 175
/*     */       //   #75	-> 184
/*     */       //   #233	-> 196
/*     */       //   #234	-> 198
/*     */       //   #235	-> 211
/*     */       //   #77	-> 215
/*     */       //   #78	-> 216
/*     */       //   #236	-> 227
/*     */       //   #237	-> 228
/*     */       //   #238	-> 236
/*     */       //   #78	-> 245
/*     */       //   #238	-> 266
/*     */       //   #239	-> 268
/*     */       //   #240	-> 281
/*     */       //   #80	-> 282
/*     */       //   #69	-> 286
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   94	7	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */       //   216	66	2	th	Ljava/lang/Throwable;
/*     */       //   109	43	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   163	49	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   224	58	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   121	31	5	prevValue$iv	Ljava/lang/Object;
/*     */       //   175	37	5	prevValue$iv	Ljava/lang/Object;
/*     */       //   236	46	5	prevValue$iv	Ljava/lang/Object;
/*     */       //   138	14	6	nextValue$iv	Ljava/lang/Object;
/*     */       //   198	14	6	nextValue$iv	Ljava/lang/Object;
/*     */       //   268	14	6	nextValue$iv	Ljava/lang/Object;
/*     */       //   130	6	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$1	I
/*     */       //   112	40	4	$i$f$update	I
/*     */       //   184	12	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$2	I
/*     */       //   166	46	4	$i$f$update	I
/*     */       //   245	21	7	$i$a$-update-MissingAIPLicense$refreshLicenseList$2$3	I
/*     */       //   227	55	4	$i$f$update	I
/*     */       //   0	296	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$refreshLicenseList$2;
/*     */       //   36	250	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   36	70	215	java/lang/Throwable
/*     */       //   79	212	215	java/lang/Throwable } public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$refreshLicenseList$2> $completion) { return (Continuation<Unit>)new MissingAIPLicense$refreshLicenseList$2($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((MissingAIPLicense$refreshLicenseList$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 232 */   public final void requestTrial() { MissingAIPLicenseKt.access$getLogger().info("Request trial"); if (!Intrinsics.areEqual(this._trialRequestState.getValue(), TrialRequestState.Progress.INSTANCE)) { MutableStateFlow<TrialRequestState> $this$update$iv = this._trialRequestState; int $i$f$update = 0; while (true) { Object prevValue$iv = $this$update$iv.getValue();
/* 233 */         TrialRequestState it = (TrialRequestState)prevValue$iv; int $i$a$-update-MissingAIPLicense$requestTrial$1 = 0; MissingAIPLicenseKt.access$getLogger().info("Request trial state: In Progress"); Object nextValue$iv = TrialRequestState.Progress.INSTANCE;
/* 234 */         if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */           BuildersKt.launch$default(this.scope, null, null, new MissingAIPLicense$requestTrial$2(null), 3, null);  }
/*     */        }
/*     */      }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "MissingAIPLicense.kt", l = {93}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.states.MissingAIPLicense$requestTrial$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nMissingAIPLicense.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,225:1\n226#2,5:226\n226#2,5:231\n226#2,5:236\n226#2,5:241\n226#2,5:246\n226#2,5:251\n226#2,5:256\n226#2,5:261\n226#2,5:266\n226#2,5:271\n226#2,5:276\n*S KotlinDebug\n*F\n+ 1 MissingAIPLicense.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2\n*L\n101#1:226,5\n108#1:231,5\n117#1:236,5\n124#1:241,5\n131#1:246,5\n138#1:251,5\n145#1:256,5\n152#1:261,5\n162#1:266,5\n176#1:271,5\n184#1:276,5\n*E\n"})
/*     */   static final class MissingAIPLicense$requestTrial$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     MissingAIPLicense$requestTrial$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #13
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 1163, 0 -> 32, 1 -> 75
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: nop
/*     */       //   37: aload_0
/*     */       //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   41: invokestatic access$getOnRequestTrial$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
/*     */       //   44: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   49: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpHandle
/*     */       //   52: aload_0
/*     */       //   53: checkcast kotlin/coroutines/Continuation
/*     */       //   56: aload_0
/*     */       //   57: iconst_1
/*     */       //   58: putfield label : I
/*     */       //   61: invokeinterface awaitOpResult : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   66: dup
/*     */       //   67: aload #13
/*     */       //   69: if_acmpne -> 81
/*     */       //   72: aload #13
/*     */       //   74: areturn
/*     */       //   75: nop
/*     */       //   76: aload_1
/*     */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   80: aload_1
/*     */       //   81: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult
/*     */       //   84: astore_2
/*     */       //   85: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   88: aload_2
/*     */       //   89: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;)Ljava/lang/String;
/*     */       //   94: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   97: aload_2
/*     */       //   98: astore_3
/*     */       //   99: aload_3
/*     */       //   100: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed
/*     */       //   103: ifeq -> 842
/*     */       //   106: aload_2
/*     */       //   107: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpFailed
/*     */       //   110: invokevirtual getFailure : ()Ljava/lang/Object;
/*     */       //   113: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure
/*     */       //   116: astore #4
/*     */       //   118: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   121: aload #4
/*     */       //   123: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;)Ljava/lang/String;
/*     */       //   128: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   131: aload #4
/*     */       //   133: astore #5
/*     */       //   135: aload #5
/*     */       //   137: getstatic com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$AuthRequired;
/*     */       //   140: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   143: ifeq -> 234
/*     */       //   146: aload_0
/*     */       //   147: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   150: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   153: astore #6
/*     */       //   155: aload_0
/*     */       //   156: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   159: astore #7
/*     */       //   161: iconst_0
/*     */       //   162: istore #8
/*     */       //   164: nop
/*     */       //   165: aload #6
/*     */       //   167: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   172: astore #9
/*     */       //   174: aload #9
/*     */       //   176: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   179: pop
/*     */       //   180: iconst_0
/*     */       //   181: istore #11
/*     */       //   183: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   186: ldc 'Auth required, check JBA'
/*     */       //   188: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   191: aload #7
/*     */       //   193: invokestatic access$getCheckJba$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
/*     */       //   196: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   201: pop
/*     */       //   202: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
/*     */       //   205: dup
/*     */       //   206: ldc 'Authentication failed'
/*     */       //   208: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   211: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   214: astore #10
/*     */       //   216: aload #6
/*     */       //   218: aload #9
/*     */       //   220: aload #10
/*     */       //   222: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   227: ifeq -> 164
/*     */       //   230: nop
/*     */       //   231: goto -> 1159
/*     */       //   234: aload #5
/*     */       //   236: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
/*     */       //   239: ifeq -> 330
/*     */       //   242: aload_0
/*     */       //   243: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   246: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   249: astore #6
/*     */       //   251: iconst_0
/*     */       //   252: istore #7
/*     */       //   254: nop
/*     */       //   255: aload #6
/*     */       //   257: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   262: astore #8
/*     */       //   264: aload #8
/*     */       //   266: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   269: pop
/*     */       //   270: iconst_0
/*     */       //   271: istore #10
/*     */       //   273: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   276: aload #4
/*     */       //   278: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
/*     */       //   281: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*     */       //   284: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   289: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   292: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
/*     */       //   295: dup
/*     */       //   296: aload #4
/*     */       //   298: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$ErrorResponse
/*     */       //   301: invokevirtual getErrorMessage : ()Ljava/lang/String;
/*     */       //   304: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   307: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   310: astore #9
/*     */       //   312: aload #6
/*     */       //   314: aload #8
/*     */       //   316: aload #9
/*     */       //   318: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   323: ifeq -> 254
/*     */       //   326: nop
/*     */       //   327: goto -> 1159
/*     */       //   330: aload #5
/*     */       //   332: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
/*     */       //   335: ifeq -> 834
/*     */       //   338: aload #4
/*     */       //   340: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
/*     */       //   343: invokevirtual getReason : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseDeniedReason;
/*     */       //   346: dup
/*     */       //   347: ifnonnull -> 355
/*     */       //   350: pop
/*     */       //   351: iconst_m1
/*     */       //   352: goto -> 363
/*     */       //   355: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */       //   358: swap
/*     */       //   359: invokevirtual ordinal : ()I
/*     */       //   362: iaload
/*     */       //   363: tableswitch default -> 746, 1 -> 396, 2 -> 486, 3 -> 551, 4 -> 616, 5 -> 681
/*     */       //   396: aload_0
/*     */       //   397: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   400: invokestatic access$getCheckPersonalTos$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlin/jvm/functions/Function0;
/*     */       //   403: invokeinterface invoke : ()Ljava/lang/Object;
/*     */       //   408: pop
/*     */       //   409: aload_0
/*     */       //   410: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   413: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   416: astore #8
/*     */       //   418: iconst_0
/*     */       //   419: istore #9
/*     */       //   421: nop
/*     */       //   422: aload #8
/*     */       //   424: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   429: astore #10
/*     */       //   431: aload #10
/*     */       //   433: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   436: pop
/*     */       //   437: iconst_0
/*     */       //   438: istore #12
/*     */       //   440: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   443: ldc 'Request trial state: TrialDenied'
/*     */       //   445: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   448: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied
/*     */       //   451: dup
/*     */       //   452: aload #4
/*     */       //   454: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
/*     */       //   457: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   460: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   463: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   466: astore #11
/*     */       //   468: aload #8
/*     */       //   470: aload #10
/*     */       //   472: aload #11
/*     */       //   474: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   479: ifeq -> 421
/*     */       //   482: nop
/*     */       //   483: goto -> 1159
/*     */       //   486: aload_0
/*     */       //   487: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   490: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   493: astore #8
/*     */       //   495: iconst_0
/*     */       //   496: istore #9
/*     */       //   498: nop
/*     */       //   499: aload #8
/*     */       //   501: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   506: astore #10
/*     */       //   508: aload #10
/*     */       //   510: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   513: pop
/*     */       //   514: iconst_0
/*     */       //   515: istore #12
/*     */       //   517: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   520: ldc 'Request trial state: TrialMaxCountExceeded'
/*     */       //   522: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   525: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;
/*     */       //   528: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   531: astore #11
/*     */       //   533: aload #8
/*     */       //   535: aload #10
/*     */       //   537: aload #11
/*     */       //   539: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   544: ifeq -> 498
/*     */       //   547: nop
/*     */       //   548: goto -> 1159
/*     */       //   551: aload_0
/*     */       //   552: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   555: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   558: astore #8
/*     */       //   560: iconst_0
/*     */       //   561: istore #9
/*     */       //   563: nop
/*     */       //   564: aload #8
/*     */       //   566: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   571: astore #10
/*     */       //   573: aload #10
/*     */       //   575: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   578: pop
/*     */       //   579: iconst_0
/*     */       //   580: istore #12
/*     */       //   582: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   585: ldc 'Request trial state: TrialNoLinkedPaymentMethod'
/*     */       //   587: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   590: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;
/*     */       //   593: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   596: astore #11
/*     */       //   598: aload #8
/*     */       //   600: aload #10
/*     */       //   602: aload #11
/*     */       //   604: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   609: ifeq -> 563
/*     */       //   612: nop
/*     */       //   613: goto -> 1159
/*     */       //   616: aload_0
/*     */       //   617: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   620: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   623: astore #8
/*     */       //   625: iconst_0
/*     */       //   626: istore #9
/*     */       //   628: nop
/*     */       //   629: aload #8
/*     */       //   631: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   636: astore #10
/*     */       //   638: aload #10
/*     */       //   640: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   643: pop
/*     */       //   644: iconst_0
/*     */       //   645: istore #12
/*     */       //   647: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   650: ldc 'Request trial state: CountryUnknown'
/*     */       //   652: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   655: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;
/*     */       //   658: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   661: astore #11
/*     */       //   663: aload #8
/*     */       //   665: aload #10
/*     */       //   667: aload #11
/*     */       //   669: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   674: ifeq -> 628
/*     */       //   677: nop
/*     */       //   678: goto -> 1159
/*     */       //   681: aload_0
/*     */       //   682: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   685: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   688: astore #8
/*     */       //   690: iconst_0
/*     */       //   691: istore #9
/*     */       //   693: nop
/*     */       //   694: aload #8
/*     */       //   696: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   701: astore #10
/*     */       //   703: aload #10
/*     */       //   705: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   708: pop
/*     */       //   709: iconst_0
/*     */       //   710: istore #12
/*     */       //   712: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   715: ldc 'Request trial state: CountryRestricted'
/*     */       //   717: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   720: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;
/*     */       //   723: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   726: astore #11
/*     */       //   728: aload #8
/*     */       //   730: aload #10
/*     */       //   732: aload #11
/*     */       //   734: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   739: ifeq -> 693
/*     */       //   742: nop
/*     */       //   743: goto -> 1159
/*     */       //   746: aload_0
/*     */       //   747: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   750: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   753: astore #8
/*     */       //   755: iconst_0
/*     */       //   756: istore #9
/*     */       //   758: nop
/*     */       //   759: aload #8
/*     */       //   761: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   766: astore #10
/*     */       //   768: aload #10
/*     */       //   770: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   773: pop
/*     */       //   774: iconst_0
/*     */       //   775: istore #12
/*     */       //   777: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   780: aload #4
/*     */       //   782: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
/*     */       //   785: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   788: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   793: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   796: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied
/*     */       //   799: dup
/*     */       //   800: aload #4
/*     */       //   802: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure$LicenseDenied
/*     */       //   805: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   808: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   811: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   814: astore #11
/*     */       //   816: aload #8
/*     */       //   818: aload #10
/*     */       //   820: aload #11
/*     */       //   822: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   827: ifeq -> 758
/*     */       //   830: nop
/*     */       //   831: goto -> 1159
/*     */       //   834: new kotlin/NoWhenBranchMatchedException
/*     */       //   837: dup
/*     */       //   838: invokespecial <init> : ()V
/*     */       //   841: athrow
/*     */       //   842: aload_3
/*     */       //   843: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*     */       //   846: ifeq -> 914
/*     */       //   849: aload_0
/*     */       //   850: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   853: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   856: astore #4
/*     */       //   858: iconst_0
/*     */       //   859: istore #5
/*     */       //   861: nop
/*     */       //   862: aload #4
/*     */       //   864: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   869: astore #6
/*     */       //   871: aload #6
/*     */       //   873: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   876: pop
/*     */       //   877: iconst_0
/*     */       //   878: istore #8
/*     */       //   880: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   883: ldc 'Request trial state, succeeded, progress'
/*     */       //   885: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   888: getstatic com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;
/*     */       //   891: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   894: astore #7
/*     */       //   896: aload #4
/*     */       //   898: aload #6
/*     */       //   900: aload #7
/*     */       //   902: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   907: ifeq -> 861
/*     */       //   910: nop
/*     */       //   911: goto -> 1159
/*     */       //   914: aload_3
/*     */       //   915: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated
/*     */       //   918: ifeq -> 1065
/*     */       //   921: aload_2
/*     */       //   922: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated
/*     */       //   925: astore #5
/*     */       //   927: aload #5
/*     */       //   929: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpCancellation
/*     */       //   932: ifeq -> 940
/*     */       //   935: ldc 'Request cancelled'
/*     */       //   937: goto -> 987
/*     */       //   940: aload #5
/*     */       //   942: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpNetworkFailure
/*     */       //   945: ifeq -> 953
/*     */       //   948: ldc 'Request failed'
/*     */       //   950: goto -> 987
/*     */       //   953: aload #5
/*     */       //   955: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpTimeout
/*     */       //   958: ifeq -> 966
/*     */       //   961: ldc 'Request timed out'
/*     */       //   963: goto -> 987
/*     */       //   966: aload #5
/*     */       //   968: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpTerminated$OpUnhandledException
/*     */       //   971: ifeq -> 979
/*     */       //   974: ldc 'Request failed'
/*     */       //   976: goto -> 987
/*     */       //   979: new kotlin/NoWhenBranchMatchedException
/*     */       //   982: dup
/*     */       //   983: invokespecial <init> : ()V
/*     */       //   986: athrow
/*     */       //   987: astore #4
/*     */       //   989: aload_0
/*     */       //   990: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   993: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   996: astore #5
/*     */       //   998: iconst_0
/*     */       //   999: istore #6
/*     */       //   1001: nop
/*     */       //   1002: aload #5
/*     */       //   1004: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   1009: astore #7
/*     */       //   1011: aload #7
/*     */       //   1013: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   1016: pop
/*     */       //   1017: iconst_0
/*     */       //   1018: istore #9
/*     */       //   1020: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   1023: aload #4
/*     */       //   1025: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1030: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   1033: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain
/*     */       //   1036: dup
/*     */       //   1037: aload #4
/*     */       //   1039: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1042: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   1045: astore #8
/*     */       //   1047: aload #5
/*     */       //   1049: aload #7
/*     */       //   1051: aload #8
/*     */       //   1053: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1058: ifeq -> 1001
/*     */       //   1061: nop
/*     */       //   1062: goto -> 1159
/*     */       //   1065: new kotlin/NoWhenBranchMatchedException
/*     */       //   1068: dup
/*     */       //   1069: invokespecial <init> : ()V
/*     */       //   1072: athrow
/*     */       //   1073: astore_3
/*     */       //   1074: aload_0
/*     */       //   1075: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;
/*     */       //   1078: invokestatic access$get_trialRequestState$p : (Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   1081: astore #4
/*     */       //   1083: iconst_0
/*     */       //   1084: istore #5
/*     */       //   1086: nop
/*     */       //   1087: aload #4
/*     */       //   1089: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   1094: astore #6
/*     */       //   1096: aload #6
/*     */       //   1098: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   1101: pop
/*     */       //   1102: iconst_0
/*     */       //   1103: istore #8
/*     */       //   1105: invokestatic access$getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   1108: aload_3
/*     */       //   1109: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1112: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1117: invokevirtual warn : (Ljava/lang/String;)V
/*     */       //   1120: new com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error
/*     */       //   1123: dup
/*     */       //   1124: aload_3
/*     */       //   1125: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1128: dup
/*     */       //   1129: ifnonnull -> 1136
/*     */       //   1132: pop
/*     */       //   1133: ldc_w 'Unknown error'
/*     */       //   1136: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1139: checkcast com/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState
/*     */       //   1142: astore #7
/*     */       //   1144: aload #4
/*     */       //   1146: aload #6
/*     */       //   1148: aload #7
/*     */       //   1150: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   1155: ifeq -> 1086
/*     */       //   1158: nop
/*     */       //   1159: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1162: areturn
/*     */       //   1163: new java/lang/IllegalStateException
/*     */       //   1166: dup
/*     */       //   1167: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   1170: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1173: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #91	-> 3
/*     */       //   #92	-> 36
/*     */       //   #93	-> 37
/*     */       //   #91	-> 72
/*     */       //   #94	-> 85
/*     */       //   #95	-> 97
/*     */       //   #96	-> 99
/*     */       //   #97	-> 106
/*     */       //   #98	-> 118
/*     */       //   #99	-> 131
/*     */       //   #100	-> 135
/*     */       //   #101	-> 146
/*     */       //   #226	-> 164
/*     */       //   #227	-> 165
/*     */       //   #228	-> 174
/*     */       //   #102	-> 183
/*     */       //   #103	-> 191
/*     */       //   #104	-> 202
/*     */       //   #228	-> 214
/*     */       //   #229	-> 216
/*     */       //   #230	-> 230
/*     */       //   #107	-> 234
/*     */       //   #108	-> 242
/*     */       //   #231	-> 254
/*     */       //   #232	-> 255
/*     */       //   #233	-> 264
/*     */       //   #109	-> 273
/*     */       //   #110	-> 292
/*     */       //   #233	-> 310
/*     */       //   #234	-> 312
/*     */       //   #235	-> 326
/*     */       //   #113	-> 330
/*     */       //   #114	-> 338
/*     */       //   #116	-> 396
/*     */       //   #117	-> 409
/*     */       //   #236	-> 421
/*     */       //   #237	-> 422
/*     */       //   #238	-> 431
/*     */       //   #118	-> 440
/*     */       //   #119	-> 448
/*     */       //   #238	-> 466
/*     */       //   #239	-> 468
/*     */       //   #240	-> 482
/*     */       //   #124	-> 486
/*     */       //   #241	-> 498
/*     */       //   #242	-> 499
/*     */       //   #243	-> 508
/*     */       //   #125	-> 517
/*     */       //   #126	-> 525
/*     */       //   #243	-> 531
/*     */       //   #244	-> 533
/*     */       //   #245	-> 547
/*     */       //   #131	-> 551
/*     */       //   #246	-> 563
/*     */       //   #247	-> 564
/*     */       //   #248	-> 573
/*     */       //   #132	-> 582
/*     */       //   #133	-> 590
/*     */       //   #248	-> 596
/*     */       //   #249	-> 598
/*     */       //   #250	-> 612
/*     */       //   #138	-> 616
/*     */       //   #251	-> 628
/*     */       //   #252	-> 629
/*     */       //   #253	-> 638
/*     */       //   #139	-> 647
/*     */       //   #140	-> 655
/*     */       //   #253	-> 661
/*     */       //   #254	-> 663
/*     */       //   #255	-> 677
/*     */       //   #145	-> 681
/*     */       //   #256	-> 693
/*     */       //   #257	-> 694
/*     */       //   #258	-> 703
/*     */       //   #146	-> 712
/*     */       //   #147	-> 720
/*     */       //   #258	-> 726
/*     */       //   #259	-> 728
/*     */       //   #260	-> 742
/*     */       //   #152	-> 746
/*     */       //   #261	-> 758
/*     */       //   #262	-> 759
/*     */       //   #263	-> 768
/*     */       //   #153	-> 777
/*     */       //   #154	-> 796
/*     */       //   #263	-> 814
/*     */       //   #264	-> 816
/*     */       //   #265	-> 830
/*     */       //   #99	-> 834
/*     */       //   #161	-> 842
/*     */       //   #162	-> 849
/*     */       //   #266	-> 861
/*     */       //   #267	-> 862
/*     */       //   #268	-> 871
/*     */       //   #163	-> 880
/*     */       //   #164	-> 888
/*     */       //   #268	-> 894
/*     */       //   #269	-> 896
/*     */       //   #270	-> 910
/*     */       //   #166	-> 911
/*     */       //   #169	-> 914
/*     */       //   #170	-> 921
/*     */       //   #171	-> 927
/*     */       //   #172	-> 940
/*     */       //   #173	-> 953
/*     */       //   #174	-> 966
/*     */       //   #170	-> 979
/*     */       //   #176	-> 989
/*     */       //   #271	-> 1001
/*     */       //   #272	-> 1002
/*     */       //   #273	-> 1011
/*     */       //   #177	-> 1020
/*     */       //   #178	-> 1033
/*     */       //   #273	-> 1045
/*     */       //   #274	-> 1047
/*     */       //   #275	-> 1061
/*     */       //   #95	-> 1065
/*     */       //   #183	-> 1073
/*     */       //   #184	-> 1074
/*     */       //   #276	-> 1086
/*     */       //   #277	-> 1087
/*     */       //   #278	-> 1096
/*     */       //   #185	-> 1105
/*     */       //   #186	-> 1120
/*     */       //   #278	-> 1142
/*     */       //   #279	-> 1144
/*     */       //   #280	-> 1158
/*     */       //   #189	-> 1159
/*     */       //   #91	-> 1163
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   85	33	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */       //   842	7	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */       //   914	13	2	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */       //   1074	85	3	th	Ljava/lang/Throwable;
/*     */       //   118	28	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   234	76	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   310	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   330	136	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   466	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   746	68	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   814	16	4	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseRequestFailure;
/*     */       //   858	53	4	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   989	73	4	status	Ljava/lang/String;
/*     */       //   1083	76	4	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   998	64	5	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   161	70	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   251	76	6	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   871	40	6	prevValue$iv	Ljava/lang/Object;
/*     */       //   1096	63	6	prevValue$iv	Ljava/lang/Object;
/*     */       //   896	15	7	nextValue$iv	Ljava/lang/Object;
/*     */       //   1011	51	7	prevValue$iv	Ljava/lang/Object;
/*     */       //   1144	15	7	nextValue$iv	Ljava/lang/Object;
/*     */       //   264	63	8	prevValue$iv	Ljava/lang/Object;
/*     */       //   418	65	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   495	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   560	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   625	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   690	53	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   755	76	8	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */       //   1047	15	8	nextValue$iv	Ljava/lang/Object;
/*     */       //   174	57	9	prevValue$iv	Ljava/lang/Object;
/*     */       //   312	15	9	nextValue$iv	Ljava/lang/Object;
/*     */       //   216	15	10	nextValue$iv	Ljava/lang/Object;
/*     */       //   431	52	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   508	40	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   573	40	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   638	40	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   703	40	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   768	63	10	prevValue$iv	Ljava/lang/Object;
/*     */       //   468	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   533	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   598	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   663	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   728	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   816	15	11	nextValue$iv	Ljava/lang/Object;
/*     */       //   183	31	11	$i$a$-update-MissingAIPLicense$requestTrial$2$1	I
/*     */       //   164	67	8	$i$f$update	I
/*     */       //   273	37	10	$i$a$-update-MissingAIPLicense$requestTrial$2$2	I
/*     */       //   254	73	7	$i$f$update	I
/*     */       //   440	26	12	$i$a$-update-MissingAIPLicense$requestTrial$2$3	I
/*     */       //   421	62	9	$i$f$update	I
/*     */       //   517	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$4	I
/*     */       //   498	50	9	$i$f$update	I
/*     */       //   582	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$5	I
/*     */       //   563	50	9	$i$f$update	I
/*     */       //   647	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$6	I
/*     */       //   628	50	9	$i$f$update	I
/*     */       //   712	14	12	$i$a$-update-MissingAIPLicense$requestTrial$2$7	I
/*     */       //   693	50	9	$i$f$update	I
/*     */       //   777	37	12	$i$a$-update-MissingAIPLicense$requestTrial$2$8	I
/*     */       //   758	73	9	$i$f$update	I
/*     */       //   880	14	8	$i$a$-update-MissingAIPLicense$requestTrial$2$9	I
/*     */       //   861	50	5	$i$f$update	I
/*     */       //   1020	25	9	$i$a$-update-MissingAIPLicense$requestTrial$2$10	I
/*     */       //   1001	61	6	$i$f$update	I
/*     */       //   1105	37	8	$i$a$-update-MissingAIPLicense$requestTrial$2$11	I
/*     */       //   1086	73	5	$i$f$update	I
/*     */       //   0	1174	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$requestTrial$2;
/*     */       //   36	1127	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   36	66	1073	java/lang/Throwable
/*     */       //   75	1073	1073	java/lang/Throwable
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super MissingAIPLicense$requestTrial$2> $completion) {
/*     */       return (Continuation<Unit>)new MissingAIPLicense$requestTrial$2($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((MissingAIPLicense$requestTrial$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\013\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\t\004\005\006\007\b\t\n\013\fB\t\b\004¢\006\004\b\002\020\003\001\t\r\016\017\020\021\022\023\024\025¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "", "<init>", "()V", "NotRequested", "Progress", "RequestFailedAndCanTryAgain", "TrialDenied", "TrialMaxCountExceeded", "TrialNoLinkedPaymentMethod", "CountryUnknown", "CountryRestricted", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$NotRequested;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static abstract class TrialRequestState {
/*     */     public static final int $stable;
/*     */     
/*     */     private TrialRequestState() {}
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$NotRequested;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class NotRequested extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final NotRequested INSTANCE = new NotRequested();
/*     */       public static final int $stable;
/*     */       
/*     */       private NotRequested() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Progress extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final Progress INSTANCE = new Progress();
/*     */       public static final int $stable;
/*     */       
/*     */       private Progress() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$RequestFailedAndCanTryAgain;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class RequestFailedAndCanTryAgain extends TrialRequestState {
/*     */       @NotNull
/*     */       private final String reason;
/*     */       public static final int $stable;
/*     */       
/*     */       public RequestFailedAndCanTryAgain(@NotNull String reason) {
/*     */         super(null);
/*     */         this.reason = reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getReason() {
/*     */         return this.reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final RequestFailedAndCanTryAgain copy(@NotNull String reason) {
/*     */         Intrinsics.checkNotNullParameter(reason, "reason");
/*     */         return new RequestFailedAndCanTryAgain(reason);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "RequestFailedAndCanTryAgain(reason=" + this.reason + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.reason.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof RequestFailedAndCanTryAgain))
/*     */           return false; 
/*     */         RequestFailedAndCanTryAgain requestFailedAndCanTryAgain = (RequestFailedAndCanTryAgain)other;
/*     */         return !!Intrinsics.areEqual(this.reason, requestFailedAndCanTryAgain.reason);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialDenied;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class TrialDenied extends TrialRequestState {
/*     */       @NotNull
/*     */       private final String reason;
/*     */       public static final int $stable;
/*     */       
/*     */       public TrialDenied(@NotNull String reason) {
/*     */         super(null);
/*     */         this.reason = reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getReason() {
/*     */         return this.reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.reason;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final TrialDenied copy(@NotNull String reason) {
/*     */         Intrinsics.checkNotNullParameter(reason, "reason");
/*     */         return new TrialDenied(reason);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "TrialDenied(reason=" + this.reason + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.reason.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof TrialDenied))
/*     */           return false; 
/*     */         TrialDenied trialDenied = (TrialDenied)other;
/*     */         return !!Intrinsics.areEqual(this.reason, trialDenied.reason);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialMaxCountExceeded;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class TrialMaxCountExceeded extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final TrialMaxCountExceeded INSTANCE = new TrialMaxCountExceeded();
/*     */       public static final int $stable;
/*     */       
/*     */       private TrialMaxCountExceeded() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$TrialNoLinkedPaymentMethod;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class TrialNoLinkedPaymentMethod extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final TrialNoLinkedPaymentMethod INSTANCE = new TrialNoLinkedPaymentMethod();
/*     */       public static final int $stable;
/*     */       
/*     */       private TrialNoLinkedPaymentMethod() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryUnknown;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class CountryUnknown extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final CountryUnknown INSTANCE = new CountryUnknown();
/*     */       public static final int $stable;
/*     */       
/*     */       private CountryUnknown() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$CountryRestricted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class CountryRestricted extends TrialRequestState {
/*     */       @NotNull
/*     */       public static final CountryRestricted INSTANCE = new CountryRestricted();
/*     */       public static final int $stable;
/*     */       
/*     */       private CountryRestricted() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Error extends TrialRequestState {
/*     */       @NotNull
/*     */       private final String message;
/*     */       public static final int $stable;
/*     */       
/*     */       public Error(@NotNull String message) {
/*     */         super(null);
/*     */         this.message = message;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getMessage() {
/*     */         return this.message;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.message;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Error copy(@NotNull String message) {
/*     */         Intrinsics.checkNotNullParameter(message, "message");
/*     */         return new Error(message);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Error(message=" + this.message + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.message.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Error))
/*     */           return false; 
/*     */         Error error = (Error)other;
/*     */         return !!Intrinsics.areEqual(this.message, error.message);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$NotRequested;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class NotRequested extends TrialRequestState {
/*     */     @NotNull
/*     */     public static final NotRequested INSTANCE = new NotRequested();
/*     */     public static final int $stable;
/*     */     
/*     */     private NotRequested() {
/*     */       super(null);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$TrialRequestState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Progress extends TrialRequestState {
/*     */     @NotNull
/*     */     public static final Progress INSTANCE = new Progress();
/*     */     public static final int $stable;
/*     */     
/*     */     private Progress() {
/*     */       super(null);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\004\005\006\007B\t\b\004¢\006\004\b\002\020\003\001\004\b\t\n\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "", "<init>", "()V", "Initial", "Done", "Progress", "Error", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Initial;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static abstract class RefreshState {
/*     */     public static final int $stable;
/*     */     
/*     */     private RefreshState() {}
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Initial;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Initial extends RefreshState {
/*     */       @NotNull
/*     */       public static final Initial INSTANCE = new Initial();
/*     */       public static final int $stable;
/*     */       
/*     */       private Initial() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Done;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Done extends RefreshState {
/*     */       @NotNull
/*     */       public static final Done INSTANCE = new Done();
/*     */       public static final int $stable;
/*     */       
/*     */       private Done() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Progress extends RefreshState {
/*     */       @NotNull
/*     */       public static final Progress INSTANCE = new Progress();
/*     */       public static final int $stable;
/*     */       
/*     */       private Progress() {
/*     */         super(null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Error;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "ej-ui"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class Error extends RefreshState {
/*     */       @NotNull
/*     */       private final String message;
/*     */       public static final int $stable;
/*     */       
/*     */       public Error(@NotNull String message) {
/*     */         super(null);
/*     */         this.message = message;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getMessage() {
/*     */         return this.message;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Initial;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Initial extends RefreshState {
/*     */     @NotNull
/*     */     public static final Initial INSTANCE = new Initial();
/*     */     public static final int $stable;
/*     */     
/*     */     private Initial() {
/*     */       super(null);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState$Progress;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/states/MissingAIPLicense$RefreshState;", "<init>", "()V", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class Progress extends RefreshState {
/*     */     @NotNull
/*     */     public static final Progress INSTANCE = new Progress();
/*     */     public static final int $stable;
/*     */     
/*     */     private Progress() {
/*     */       super(null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\states\MissingAIPLicense.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */