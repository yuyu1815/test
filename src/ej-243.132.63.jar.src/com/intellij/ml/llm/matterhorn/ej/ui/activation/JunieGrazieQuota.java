/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*     */ 
/*     */ import ai.grazie.quota.Quota;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieAuthContext;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Service({Service.Level.PROJECT})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\006\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\016\020)\032\0020*2\006\020+\032\0020\016J\026\020,\032\0020*2\006\020-\032\0020 2\006\020.\032\0020\016J \020/\032\0020*2\006\020+\032\0020\0162\b\0200\032\004\030\00101H@¢\006\002\0202J\022\0203\032\0020*2\b\0200\032\004\030\00101H\002J\032\020'\032\004\030\0010%2\006\0204\032\0020 2\b\0200\032\004\030\00101R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\b\022\004\022\0020\0160\rX\004¢\006\002\n\000R\024\020\017\032\b\022\004\022\0020\0210\020X\004¢\006\002\n\000R\027\020\022\032\b\022\004\022\0020\0240\023¢\006\b\n\000\032\004\b\025\020\026R\026\020\027\032\n\022\006\022\004\030\0010\0300\020X\004¢\006\002\n\000R\"\020\031\032\n\022\006\022\004\030\0010\0300\032X\016¢\006\016\n\000\032\004\b\033\020\034\"\004\b\035\020\036R\026\020\037\032\n\022\006\022\004\030\0010 0\020X\004¢\006\002\n\000R\"\020!\032\n\022\006\022\004\030\0010 0\032X\016¢\006\016\n\000\032\004\b\"\020\034\"\004\b#\020\036R\026\020$\032\n\022\006\022\004\030\0010%0\020X\004¢\006\002\n\000R\"\020&\032\n\022\006\022\004\030\0010%0\032X\016¢\006\016\n\000\032\004\b'\020\034\"\004\b(\020\036¨\0065"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;", "", "project", "Lcom/intellij/openapi/project/Project;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "getCs", "()Lkotlinx/coroutines/CoroutineScope;", "refreshChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;", "_hideWarning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "exceededQuotaDebugLicenseId", "Lkotlinx/coroutines/flow/Flow;", "", "getExceededQuotaDebugLicenseId", "()Lkotlinx/coroutines/flow/Flow;", "_lastRefill", "Lai/grazie/quota/QuotaRefill;", "lastRefill", "Lkotlinx/coroutines/flow/StateFlow;", "getLastRefill", "()Lkotlinx/coroutines/flow/StateFlow;", "setLastRefill", "(Lkotlinx/coroutines/flow/StateFlow;)V", "_lastQuota", "Lai/grazie/quota/Quota;", "lastQuota", "getLastQuota", "setLastQuota", "_quotaWarning", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieQuotaWarning;", "quotaWarning", "getQuotaWarning", "setQuotaWarning", "updateQuotaAndRefill", "", "proxy", "reportQuota", "updated", "grazieLLMProxy", "refresh", "productType", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuotaWarning", "quota", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJunieGrazieQuota.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieGrazieQuota.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,212:1\n28#2:213\n24#3:214\n80#4:215\n*S KotlinDebug\n*F\n+ 1 JunieGrazieQuota.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota\n*L\n129#1:213\n129#1:214\n129#1:215\n*E\n"})
/*     */ public final class JunieGrazieQuota {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final CoroutineScope cs;
/*     */   @NotNull
/*     */   private final Channel<JunieGrazieLLMProxy> refreshChannel;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Boolean> _hideWarning;
/*     */   @NotNull
/*     */   private final Flow<String> exceededQuotaDebugLicenseId;
/*     */   @NotNull
/*     */   private final MutableStateFlow<QuotaRefill> _lastRefill;
/*     */   @NotNull
/*     */   private StateFlow<QuotaRefill> lastRefill;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Quota> _lastQuota;
/*     */   @NotNull
/*     */   private StateFlow<Quota> lastQuota;
/*     */   @NotNull
/*     */   private final MutableStateFlow<GrazieQuotaWarning> _quotaWarning;
/*     */   @NotNull
/*     */   private StateFlow<GrazieQuotaWarning> quotaWarning;
/*     */   public static final int $stable = 8;
/*     */   
/*  44 */   public JunieGrazieQuota(@NotNull Project project, @NotNull CoroutineScope cs) { this.project = project; this.cs = cs;
/*     */     
/*  46 */     this.refreshChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
/*  47 */     this._hideWarning = StateFlowKt.MutableStateFlow(Boolean.valueOf(false));
/*  48 */     this.exceededQuotaDebugLicenseId = RegistryKt.asStringFlow(Registry.Companion.get("matterhorn.debug.quota.exceeded.license.id"));
/*     */     
/*  50 */     this._lastRefill = StateFlowKt.MutableStateFlow(null);
/*  51 */     this.lastRefill = FlowKt.asStateFlow(this._lastRefill);
/*     */     
/*  53 */     this._lastQuota = StateFlowKt.MutableStateFlow(null);
/*  54 */     this.lastQuota = FlowKt.asStateFlow(this._lastQuota);
/*     */     
/*  56 */     this._quotaWarning = StateFlowKt.MutableStateFlow(null);
/*  57 */     this.quotaWarning = FlowKt.asStateFlow(this._quotaWarning);
/*     */ 
/*     */     
/*  60 */     LLMProxy lLMProxy = JuniePluginLLMProxyProvider.INSTANCE.createLLMProxy(this.project); JunieGrazieLLMProxy grazieLLMProxy = (lLMProxy instanceof JunieGrazieLLMProxy) ? (JunieGrazieLLMProxy)lLMProxy : null;
/*  61 */     if (grazieLLMProxy != null)
/*  62 */     { StateFlow<AiaActivation> activationState = grazieLLMProxy.getAuthService().getAuthFacade().getActivationState();
/*     */       
/*  64 */       Flow<JunieGrazieQuota$refreshFlow$2.null> refreshFlow = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  72 */         FlowKt.conflate(FlowKt.combine(FlowKt.debounceDuration((Flow)FlowKt.stateIn(FlowKt.consumeAsFlow((ReceiveChannel)this.refreshChannel), this.cs, SharingStarted.Companion.getEagerly(), grazieLLMProxy), JunieGrazieQuota::_init_$lambda$0), this.exceededQuotaDebugLicenseId, (Flow)activationState, new JunieGrazieQuota$refreshFlow$2(null)));
/*     */       
/*  74 */       BuildersKt.launch$default(this.cs, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, grazieLLMProxy, null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  75 */                   this.label = 1; if (this.$refreshFlow.collect(new FlowCollector(this.$grazieLLMProxy) {  }(Continuation)this) == object) return object;  this.$refreshFlow.collect(new FlowCollector(this.$grazieLLMProxy) {  }(Continuation)this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*  82 */                   return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */             public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$refreshFlow, JunieGrazieQuota.this, this.$grazieLLMProxy, $completion); }
/*     */             public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null); }  }
/*     */   @NotNull public final Project getProject() { return this.project; }
/*     */   @NotNull public final CoroutineScope getCs() { return this.cs; }
/*  87 */   @NotNull public final Flow<String> getExceededQuotaDebugLicenseId() { return this.exceededQuotaDebugLicenseId; } @NotNull public final StateFlow<QuotaRefill> getLastRefill() { return this.lastRefill; } public final void setLastRefill(@NotNull StateFlow<QuotaRefill> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.lastRefill = <set-?>; } public final void updateQuotaAndRefill(@NotNull JunieGrazieLLMProxy proxy) { Intrinsics.checkNotNullParameter(proxy, "proxy"); this.refreshChannel.trySend-JP2dKIU(proxy); }
/*     */   @NotNull public final StateFlow<Quota> getLastQuota() { return this.lastQuota; } public final void setLastQuota(@NotNull StateFlow<Quota> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.lastQuota = <set-?>; } @NotNull public final StateFlow<GrazieQuotaWarning> getQuotaWarning() { return this.quotaWarning; } public final void setQuotaWarning(@NotNull StateFlow<GrazieQuotaWarning> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.quotaWarning = <set-?>; } private static final Duration _init_$lambda$0(JunieGrazieLLMProxy it) { Intrinsics.checkNotNullParameter(it, "it"); return Duration.box-impl(DurationKt.toDuration(2, DurationUnit.MINUTES)); } @DebugMetadata(f = "JunieGrazieQuota.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota$refreshFlow$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\031\n\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002*\001\001\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n"}, d2 = {"<anonymous>", "com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota$refreshFlow$2$1", "refresh", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;", "exceededQuotaDebugLicenseId", "", "activationState", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"}) static final class JunieGrazieQuota$refreshFlow$2 extends SuspendLambda implements Function4<JunieGrazieLLMProxy, String, AiaActivation, Continuation<? super JunieGrazieQuota$refreshFlow$2.null>, Object> {
/*     */     int label; JunieGrazieQuota$refreshFlow$2(Continuation $completion) { super(4, $completion); } public final Object invokeSuspend(Object $result) { AiaActivation activationState; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); activationState = (AiaActivation)this.L$0; return new Object(activationState) { private final AiaActivation activationState; public final AiaActivation getActivationState() { return this.activationState; } }
/*     */             ; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(JunieGrazieLLMProxy p1, String p2, AiaActivation p3, Continuation<? super JunieGrazieQuota$refreshFlow$2> p4) { JunieGrazieQuota$refreshFlow$2 junieGrazieQuota$refreshFlow$2 = new JunieGrazieQuota$refreshFlow$2(p4); junieGrazieQuota$refreshFlow$2.L$0 = p3; return junieGrazieQuota$refreshFlow$2.invokeSuspend(Unit.INSTANCE); }
/*  91 */   } public final void reportQuota(@NotNull Quota updated, @NotNull JunieGrazieLLMProxy grazieLLMProxy) { Intrinsics.checkNotNullParameter(updated, "updated"); Intrinsics.checkNotNullParameter(grazieLLMProxy, "grazieLLMProxy"); this._lastQuota.setValue(updated);
/*  92 */     (GrazieAuthContext)Outcome.getOrNull-impl(((AiaActivation)grazieLLMProxy.getAuthService().getAuthFacade().getActivationState().getValue()).getOutcome-07x5Wys()); AipLicenseProductType productType = ((GrazieAuthContext)Outcome.getOrNull-impl(((AiaActivation)grazieLLMProxy.getAuthService().getAuthFacade().getActivationState().getValue()).getOutcome-07x5Wys()) != null) ? ((GrazieAuthContext)Outcome.getOrNull-impl(((AiaActivation)grazieLLMProxy.getAuthService().getAuthFacade().getActivationState().getValue()).getOutcome-07x5Wys())).getProductType() : null;
/*  93 */     updateQuotaWarning(productType); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object refresh(@NotNull JunieGrazieLLMProxy proxy, @Nullable AipLicenseProductType productType, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota$refresh$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota$refresh$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #9
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota$refresh$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload_3
/*     */     //   47: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #9
/*     */     //   52: aload #9
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #8
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #10
/*     */     //   64: aload #9
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 584, 0 -> 104, 1 -> 164, 2 -> 276, 3 -> 373, 4 -> 458
/*     */     //   104: aload #8
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   112: ldc_w 'Starting quota refresh'
/*     */     //   115: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   118: nop
/*     */     //   119: aload_1
/*     */     //   120: invokevirtual getAuthService : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*     */     //   123: invokevirtual getAuthFacade : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*     */     //   126: aload #9
/*     */     //   128: aload #9
/*     */     //   130: aload_0
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload #9
/*     */     //   136: aload_1
/*     */     //   137: putfield L$1 : Ljava/lang/Object;
/*     */     //   140: aload #9
/*     */     //   142: aload_2
/*     */     //   143: putfield L$2 : Ljava/lang/Object;
/*     */     //   146: aload #9
/*     */     //   148: iconst_1
/*     */     //   149: putfield label : I
/*     */     //   152: invokevirtual getOrWaitGrazieAuthContext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   155: dup
/*     */     //   156: aload #10
/*     */     //   158: if_acmpne -> 199
/*     */     //   161: aload #10
/*     */     //   163: areturn
/*     */     //   164: aload #9
/*     */     //   166: getfield L$2 : Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   172: astore_2
/*     */     //   173: aload #9
/*     */     //   175: getfield L$1 : Ljava/lang/Object;
/*     */     //   178: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy
/*     */     //   181: astore_1
/*     */     //   182: aload #9
/*     */     //   184: getfield L$0 : Ljava/lang/Object;
/*     */     //   187: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */     //   190: astore_0
/*     */     //   191: nop
/*     */     //   192: aload #8
/*     */     //   194: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   197: aload #8
/*     */     //   199: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext
/*     */     //   202: astore #4
/*     */     //   204: aload #4
/*     */     //   206: ifnull -> 217
/*     */     //   209: aload #4
/*     */     //   211: invokevirtual isEnterprise : ()Z
/*     */     //   214: ifeq -> 234
/*     */     //   217: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   220: astore #5
/*     */     //   222: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   225: ldc_w 'Quota is updated'
/*     */     //   228: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   231: aload #5
/*     */     //   233: areturn
/*     */     //   234: aload_1
/*     */     //   235: invokevirtual getAuthService : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieAuthService;
/*     */     //   238: aload #9
/*     */     //   240: aload #9
/*     */     //   242: aload_0
/*     */     //   243: putfield L$0 : Ljava/lang/Object;
/*     */     //   246: aload #9
/*     */     //   248: aload_2
/*     */     //   249: putfield L$1 : Ljava/lang/Object;
/*     */     //   252: aload #9
/*     */     //   254: aconst_null
/*     */     //   255: putfield L$2 : Ljava/lang/Object;
/*     */     //   258: aload #9
/*     */     //   260: iconst_2
/*     */     //   261: putfield label : I
/*     */     //   264: invokevirtual getClient : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   267: dup
/*     */     //   268: aload #10
/*     */     //   270: if_acmpne -> 302
/*     */     //   273: aload #10
/*     */     //   275: areturn
/*     */     //   276: aload #9
/*     */     //   278: getfield L$1 : Ljava/lang/Object;
/*     */     //   281: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   284: astore_2
/*     */     //   285: aload #9
/*     */     //   287: getfield L$0 : Ljava/lang/Object;
/*     */     //   290: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */     //   293: astore_0
/*     */     //   294: nop
/*     */     //   295: aload #8
/*     */     //   297: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   300: aload #8
/*     */     //   302: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*     */     //   305: astore #5
/*     */     //   307: aload #5
/*     */     //   309: ifnonnull -> 329
/*     */     //   312: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   315: astore #6
/*     */     //   317: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   320: ldc_w 'Quota is updated'
/*     */     //   323: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   326: aload #6
/*     */     //   328: areturn
/*     */     //   329: aload #5
/*     */     //   331: invokevirtual quota : ()Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*     */     //   334: aload #9
/*     */     //   336: aload #9
/*     */     //   338: aload_0
/*     */     //   339: putfield L$0 : Ljava/lang/Object;
/*     */     //   342: aload #9
/*     */     //   344: aload_2
/*     */     //   345: putfield L$1 : Ljava/lang/Object;
/*     */     //   348: aload #9
/*     */     //   350: aload #5
/*     */     //   352: putfield L$2 : Ljava/lang/Object;
/*     */     //   355: aload #9
/*     */     //   357: iconst_3
/*     */     //   358: putfield label : I
/*     */     //   361: invokevirtual get : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   364: dup
/*     */     //   365: aload #10
/*     */     //   367: if_acmpne -> 409
/*     */     //   370: aload #10
/*     */     //   372: areturn
/*     */     //   373: aload #9
/*     */     //   375: getfield L$2 : Ljava/lang/Object;
/*     */     //   378: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*     */     //   381: astore #5
/*     */     //   383: aload #9
/*     */     //   385: getfield L$1 : Ljava/lang/Object;
/*     */     //   388: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   391: astore_2
/*     */     //   392: aload #9
/*     */     //   394: getfield L$0 : Ljava/lang/Object;
/*     */     //   397: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */     //   400: astore_0
/*     */     //   401: nop
/*     */     //   402: aload #8
/*     */     //   404: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   407: aload #8
/*     */     //   409: checkcast ai/grazie/quota/Quota
/*     */     //   412: astore #6
/*     */     //   414: aload #5
/*     */     //   416: invokevirtual quota : ()Lai/grazie/api/gateway/client/api/QuotaAPIClient;
/*     */     //   419: aload #9
/*     */     //   421: aload #9
/*     */     //   423: aload_0
/*     */     //   424: putfield L$0 : Ljava/lang/Object;
/*     */     //   427: aload #9
/*     */     //   429: aload_2
/*     */     //   430: putfield L$1 : Ljava/lang/Object;
/*     */     //   433: aload #9
/*     */     //   435: aload #6
/*     */     //   437: putfield L$2 : Ljava/lang/Object;
/*     */     //   440: aload #9
/*     */     //   442: iconst_4
/*     */     //   443: putfield label : I
/*     */     //   446: invokevirtual refill : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   449: dup
/*     */     //   450: aload #10
/*     */     //   452: if_acmpne -> 494
/*     */     //   455: aload #10
/*     */     //   457: areturn
/*     */     //   458: aload #9
/*     */     //   460: getfield L$2 : Ljava/lang/Object;
/*     */     //   463: checkcast ai/grazie/quota/Quota
/*     */     //   466: astore #6
/*     */     //   468: aload #9
/*     */     //   470: getfield L$1 : Ljava/lang/Object;
/*     */     //   473: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType
/*     */     //   476: astore_2
/*     */     //   477: aload #9
/*     */     //   479: getfield L$0 : Ljava/lang/Object;
/*     */     //   482: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota
/*     */     //   485: astore_0
/*     */     //   486: nop
/*     */     //   487: aload #8
/*     */     //   489: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   492: aload #8
/*     */     //   494: checkcast ai/grazie/quota/QuotaRefill
/*     */     //   497: astore #7
/*     */     //   499: aload_0
/*     */     //   500: getfield _lastQuota : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   503: aload #6
/*     */     //   505: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   510: aload_0
/*     */     //   511: getfield _lastRefill : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   514: aload #7
/*     */     //   516: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   521: aload_0
/*     */     //   522: aload_2
/*     */     //   523: invokespecial updateQuotaWarning : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;)V
/*     */     //   526: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   529: ldc_w 'Quota is updated'
/*     */     //   532: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   535: goto -> 580
/*     */     //   538: astore #4
/*     */     //   540: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   543: ldc_w 'Failed to refresh quotas'
/*     */     //   546: aload #4
/*     */     //   548: checkcast java/lang/Throwable
/*     */     //   551: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   554: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   557: ldc_w 'Quota is updated'
/*     */     //   560: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   563: goto -> 580
/*     */     //   566: astore #4
/*     */     //   568: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   571: ldc_w 'Quota is updated'
/*     */     //   574: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   577: aload #4
/*     */     //   579: athrow
/*     */     //   580: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   583: areturn
/*     */     //   584: new java/lang/IllegalStateException
/*     */     //   587: dup
/*     */     //   588: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   591: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   594: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 62
/*     */     //   #101	-> 109
/*     */     //   #102	-> 118
/*     */     //   #104	-> 119
/*     */     //   #97	-> 161
/*     */     //   #105	-> 204
/*     */     //   #106	-> 217
/*     */     //   #123	-> 222
/*     */     //   #106	-> 233
/*     */     //   #109	-> 234
/*     */     //   #97	-> 273
/*     */     //   #110	-> 307
/*     */     //   #111	-> 312
/*     */     //   #123	-> 317
/*     */     //   #111	-> 328
/*     */     //   #113	-> 329
/*     */     //   #97	-> 370
/*     */     //   #114	-> 414
/*     */     //   #97	-> 455
/*     */     //   #116	-> 499
/*     */     //   #117	-> 510
/*     */     //   #119	-> 521
/*     */     //   #123	-> 526
/*     */     //   #124	-> 535
/*     */     //   #120	-> 538
/*     */     //   #121	-> 540
/*     */     //   #123	-> 554
/*     */     //   #124	-> 563
/*     */     //   #123	-> 566
/*     */     //   #125	-> 580
/*     */     //   #97	-> 584
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   191	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   234	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   294	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   401	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   486	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota;
/*     */     //   109	55	1	proxy	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
/*     */     //   182	35	1	proxy	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
/*     */     //   234	33	1	proxy	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;
/*     */     //   109	55	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   173	44	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   234	42	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   285	88	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   392	66	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   477	49	2	productType	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;
/*     */     //   204	13	4	context	Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;
/*     */     //   540	14	4	ex	Ljava/lang/Exception;
/*     */     //   307	10	5	client	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   329	44	5	client	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   383	66	5	client	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   414	44	6	curQuota	Lai/grazie/quota/Quota;
/*     */     //   468	58	6	curQuota	Lai/grazie/quota/Quota;
/*     */     //   499	27	7	curRefill	Lai/grazie/quota/QuotaRefill;
/*     */     //   0	595	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	532	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	525	8	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   118	155	538	java/lang/Exception
/*     */     //   118	155	566	finally
/*     */     //   191	222	538	java/lang/Exception
/*     */     //   191	222	566	finally
/*     */     //   234	267	538	java/lang/Exception
/*     */     //   234	267	566	finally
/*     */     //   294	317	538	java/lang/Exception
/*     */     //   294	317	566	finally
/*     */     //   329	364	538	java/lang/Exception
/*     */     //   329	364	566	finally
/*     */     //   401	449	538	java/lang/Exception
/*     */     //   401	449	566	finally
/*     */     //   486	526	538	java/lang/Exception
/*     */     //   486	526	566	finally
/*     */     //   538	554	566	finally
/*     */     //   566	568	566	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void updateQuotaWarning(AipLicenseProductType productType) {
/*     */     Quota curQuota;
/*     */     QuotaRefill curRefill;
/* 128 */     if ((Quota)this._lastQuota.getValue() == null) { (Quota)this._lastQuota.getValue(); return; }
/* 129 */      JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     int $i$f$serializer = 0;
/* 214 */     KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer(Reflection.typeOf(Quota.class)); int $i$f$cast = 0;
/* 215 */     Intrinsics.checkNotNull($this$cast$iv$iv$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>"); String quota = this_$iv.string((SerializationStrategy)$this$cast$iv$iv$iv, curQuota);
/*     */     ((JunieActivationStateListener)this.project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC())).productActivationStateChanged("junie", "quota_update:" + quota);
/*     */     if ((QuotaRefill)this._lastRefill.getValue() == null) {
/*     */       (QuotaRefill)this._lastRefill.getValue();
/*     */       return;
/*     */     } 
/*     */     GrazieQuotaWarning quotaWarning = getQuotaWarning(curQuota, productType);
/*     */     if (quotaWarning != null && quotaWarning.isOver()) {
/*     */       ((AipLicenseChoiceService)ApplicationKt.getApplication().getService(AipLicenseChoiceService.class)).addQuotaExceededLicenseId(curQuota.getLicense().getId());
/*     */     } else {
/*     */       ((AipLicenseChoiceService)ApplicationKt.getApplication().getService(AipLicenseChoiceService.class)).removeQuotaExceededLicenseId(curQuota.getLicense().getId());
/*     */     } 
/*     */     this._quotaWarning.setValue(quotaWarning);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final GrazieQuotaWarning getQuotaWarning(@NotNull Quota quota, @Nullable AipLicenseProductType productType) {
/*     */     Intrinsics.checkNotNullParameter(quota, "quota");
/*     */     String exceededQuotaDebugLicenseId = Registry.Companion.get("matterhorn.debug.quota.exceeded.license.id").asString();
/*     */     String license = quota.getLicense().getId();
/*     */     int current = (int)quota.getCurrent().getAmount().asDouble();
/*     */     int maximum = (int)quota.getMaximum().getAmount().asDouble();
/*     */     if (maximum - current > 100000 && !Intrinsics.areEqual(license, exceededQuotaDebugLicenseId))
/*     */       return null; 
/*     */     boolean isOver = (maximum - current <= 0 || Intrinsics.areEqual(license, exceededQuotaDebugLicenseId));
/*     */     return new GrazieQuotaWarning(isOver, productType, license, current, maximum, quota.getUntil(), (StateFlow<Boolean>)this._hideWarning, this::getQuotaWarning$lambda$1, this::getQuotaWarning$lambda$2, this::getQuotaWarning$lambda$3);
/*     */   }
/*     */   
/*     */   private static final Unit getQuotaWarning$lambda$1(JunieGrazieQuota this$0) {
/*     */     this$0._hideWarning.setValue(Boolean.valueOf(true));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit getQuotaWarning$lambda$2(JunieGrazieQuota this$0) {
/*     */     BuildersKt.launch$default(this$0.cs, null, null, new JunieGrazieQuota$getQuotaWarning$2$1(null), 3, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieQuota.kt", l = {172, 172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota$getQuotaWarning$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JunieGrazieQuota$getQuotaWarning$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieGrazieQuota$getQuotaWarning$2$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       String purchaseUrl;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object)
/*     */             return object; 
/*     */           this.label = 2;
/*     */           if (((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this) == object)
/*     */             return object; 
/*     */           purchaseUrl = (String)((JunieAipLicenseRepository)JunieAipLicenseRepository.Companion.instance((Continuation)this)).getPurchaseAipUrl((Continuation)this);
/*     */           BrowserUtil.open(purchaseUrl);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 2;
/*     */           if (((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this) == object)
/*     */             return object; 
/*     */           purchaseUrl = (String)((JunieAipLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1).getPurchaseAipUrl((Continuation)this);
/*     */           BrowserUtil.open(purchaseUrl);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           purchaseUrl = (String)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           BrowserUtil.open(purchaseUrl);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieGrazieQuota$getQuotaWarning$2$1> $completion) {
/*     */       return (Continuation<Unit>)new JunieGrazieQuota$getQuotaWarning$2$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieGrazieQuota$getQuotaWarning$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit getQuotaWarning$lambda$3(JunieGrazieQuota this$0) {
/*     */     BuildersKt.launch$default(this$0.cs, CoroutinesKt.getEDT(Dispatchers.INSTANCE), null, new JunieGrazieQuota$getQuotaWarning$3$1(null), 2, null);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieQuota.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota$getQuotaWarning$3$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class JunieGrazieQuota$getQuotaWarning$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieGrazieQuota$getQuotaWarning$3$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       JunieFeedbackDialog dialog;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           dialog = new JunieFeedbackDialog(JunieGrazieQuota.this.getProject());
/*     */           dialog.show();
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieGrazieQuota$getQuotaWarning$3$1> $completion) {
/*     */       return (Continuation<Unit>)new JunieGrazieQuota$getQuotaWarning$3$1($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((JunieGrazieQuota$getQuotaWarning$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieGrazieQuota.kt", l = {104, 109, 113, 114}, i = {0, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "proxy", "productType", "this", "productType", "this", "productType", "client", "this", "productType", "curQuota"}, m = "refresh", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieGrazieQuota$refresh$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JunieGrazieQuota$refresh$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieGrazieQuota.this.refresh(null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieGrazieQuota.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */