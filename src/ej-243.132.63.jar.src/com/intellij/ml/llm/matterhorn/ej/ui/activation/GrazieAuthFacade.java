/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ 
/*     */ @State(name = "GrazieAuthFacade", storages = {@Storage("GrazieAuthFacade.xml")})
/*     */ @Service({Service.Level.APP})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\b\007\030\000 !2\b\022\004\022\0020\0020\001:\001!B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006J\020\020\020\032\0020\0212\006\020\022\032\0020\002H\026J\006\020\030\032\0020\021J\020\020\031\032\004\030\0010\032H@¢\006\002\020\033J\024\020\034\032\0020\021*\0020\0002\006\020\035\032\0020\026H\002J\f\020\036\032\0020\013*\0020\026H\002J\f\020\037\032\0020\013*\0020\026H\002J\f\020 \032\0020\013*\0020\026H\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\002\n\000R\027\020\f\032\b\022\004\022\0020\0130\r¢\006\b\n\000\032\004\b\016\020\017R\024\020\023\032\b\022\004\022\0020\0240\nX\004¢\006\002\n\000R\027\020\025\032\b\022\004\022\0020\0260\r¢\006\b\n\000\032\004\b\027\020\017¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "Lcom/intellij/openapi/components/SimplePersistentStateComponent;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacadeState;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "getCs", "()Lkotlinx/coroutines/CoroutineScope;", "_optimisticState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "optimisticState", "Lkotlinx/coroutines/flow/StateFlow;", "getOptimisticState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadState", "", "state", "_loginSeed", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/LastSuccessfulState;", "activationState", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "getActivationState", "relogin", "getOrWaitGrazieAuthContext", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOptimisticActivationState", "activation", "isProgressing", "isSuccessful", "isUnsuccessful", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nGrazieAuthFacade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthFacade.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,107:1\n189#2:108\n*S KotlinDebug\n*F\n+ 1 GrazieAuthFacade.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade\n*L\n50#1:108\n*E\n"})
/*     */ public final class GrazieAuthFacade extends SimplePersistentStateComponent<GrazieAuthFacadeState> {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CoroutineScope cs;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Boolean> _optimisticState;
/*     */   
/*     */   @NotNull
/*  24 */   public final CoroutineScope getCs() { return this.cs; } @NotNull private final StateFlow<Boolean> optimisticState; @NotNull private final MutableStateFlow<LastSuccessfulState> _loginSeed; @NotNull
/*  25 */   private final StateFlow<AiaActivation> activationState; public static final int $stable = 8; public GrazieAuthFacade(@NotNull CoroutineScope cs) { super(new GrazieAuthFacadeState());
/*     */ 
/*     */     
/*     */     this.cs = cs;
/*     */ 
/*     */     
/*  31 */     MutableStateFlow<Boolean> mutableStateFlow1 = StateFlowKt.MutableStateFlow(Boolean.valueOf(((GrazieAuthFacadeState)getState()).getLoginSuccessful$ej_ui())), mutableStateFlow2 = mutableStateFlow1; GrazieAuthFacade grazieAuthFacade = this; int $i$a$-also-GrazieAuthFacade$_optimisticState$1 = 0;
/*  32 */     BuildersKt.launch$default(this.cs, null, null, new GrazieAuthFacade$_optimisticState$1$1(this, null), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     grazieAuthFacade._optimisticState = mutableStateFlow1;
/*     */     
/*  40 */     this.optimisticState = FlowKt.asStateFlow(this._optimisticState);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     this._loginSeed = StateFlowKt.MutableStateFlow(new LastSuccessfulState());
/*     */     
/*  50 */     Flow $this$flatMapLatest$iv = (Flow)this._loginSeed; int $i$f$flatMapLatest = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.activationState = FlowKt.stateIn(FlowKt.onEach(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 108 */           FlowKt.transformLatest($this$flatMapLatest$iv, new GrazieAuthFacade$special$$inlined$flatMapLatest$1(null)), new GrazieAuthFacade$activationState$2(null)), this.cs, SharingStarted.Companion.getEagerly(), new AiaActivation.AiaActivationTrackUnknown(Outcome.Companion.ofIncomplete-l12Rbqo(InitialProgressing.INSTANCE), null)); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$Companion;", "", "<init>", "()V", "getInstance", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;", "ej-ui"}) @SourceDebugExtension({"SMAP\nGrazieAuthFacade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieAuthFacade.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,107:1\n40#2,3:108\n*S KotlinDebug\n*F\n+ 1 GrazieAuthFacade.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$Companion\n*L\n28#1:108,3\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final GrazieAuthFacade getInstance() { int $i$f$service = 0; Class<GrazieAuthFacade> serviceClass$iv = GrazieAuthFacade.class;
/* 109 */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 110 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*     */       
/*     */       return (GrazieAuthFacade)ApplicationManager.getApplication().getService(serviceClass$iv); }
/*     */      }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthFacade.kt", l = {33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$_optimisticState$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieAuthFacade$_optimisticState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthFacade$_optimisticState$1$1(GrazieAuthFacade $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (FlowKt.collectLatest((Flow)this.$it, new Function2<Boolean, Continuation<? super Unit>, Object>(null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   boolean it;
/*     */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       it = this.Z$0;
/*     */                       GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state changed to: " + (it ? 1 : 0));
/*     */                       ((GrazieAuthFacadeState)GrazieAuthFacade.this.getState()).setLoginSuccessful$ej_ui(it);
/*     */                       return Unit.INSTANCE;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(GrazieAuthFacade.this, $completion);
/*     */                   function2.Z$0 = ((Boolean)value).booleanValue();
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(boolean p1, Continuation<?> p2) {
/*     */                   return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           FlowKt.collectLatest((Flow)this.$it, new Function2<Boolean, Continuation<? super Unit>, Object>(null) {
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   boolean it;
/*     */                   IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                   switch (this.label) {
/*     */                     case 0:
/*     */                       ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                       it = this.Z$0;
/*     */                       GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state changed to: " + (it ? 1 : 0));
/*     */                       ((GrazieAuthFacadeState)GrazieAuthFacade.this.getState()).setLoginSuccessful$ej_ui(it);
/*     */                       return Unit.INSTANCE;
/*     */                   } 
/*     */                   throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<Boolean, Continuation<? super Unit>, Object> function2 = new Function2<>(GrazieAuthFacade.this, $completion);
/*     */                   function2.Z$0 = ((Boolean)value).booleanValue();
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(boolean p1, Continuation<?> p2) {
/*     */                   return ((null)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$_optimisticState$1$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieAuthFacade$_optimisticState$1$1(GrazieAuthFacade.this, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((GrazieAuthFacade$_optimisticState$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<Boolean> getOptimisticState() {
/*     */     return this.optimisticState;
/*     */   }
/*     */   
/*     */   public void loadState(@NotNull GrazieAuthFacadeState state) {
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     super.loadState(state);
/*     */     GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state loaded");
/*     */     this._optimisticState.setValue(Boolean.valueOf(state.getLoginSuccessful$ej_ui()));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StateFlow<AiaActivation> getActivationState() {
/*     */     return this.activationState;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthFacade.kt", l = {60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$activationState$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*     */   static final class GrazieAuthFacade$activationState$1$1 extends SuspendLambda implements Function2<ProducerScope<? super AiaActivation>, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthFacade$activationState$1$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProducerScope<? super AiaActivation> $this$channelFlow;
/*     */       CoroutineScope subScope;
/*     */       StateFlow secondStateFlow;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$channelFlow = (ProducerScope)this.L$0;
/*     */           GrazieAuthFacadeKt.access$getLog$p().debug("Composing new activation flow");
/*     */           subScope = CoroutineScopeKt.CoroutineScope($this$channelFlow.getCoroutineContext().plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null)));
/*     */           secondStateFlow = JunieAiaActivationManager.Companion.syncInstance().createActivationState(subScope);
/*     */           FlowKt.launchIn(FlowKt.onEach((Flow)secondStateFlow, new Function2<AiaActivation, Continuation<? super Unit>, Object>($this$channelFlow, null) {
/*     */                   int label;
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     AiaActivation it;
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         it = (AiaActivation)this.L$0;
/*     */                         this.label = 1;
/*     */                         if (this.$$this$channelFlow.send(it, (Continuation)this) == object)
/*     */                           return object; 
/*     */                         this.$$this$channelFlow.send(it, (Continuation)this);
/*     */                         return Unit.INSTANCE;
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                     Function2<AiaActivation, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$$this$channelFlow, $completion);
/*     */                     function2.L$0 = value;
/*     */                     return (Continuation)function2;
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(AiaActivation p1, Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }), subScope);
/*     */           this.label = 1;
/*     */           if (ProduceKt.awaitClose($this$channelFlow, new Function0<Unit>(subScope) {
/*     */                 public final void invoke() {
/*     */                   GrazieAuthFacadeKt.access$getLog$p().debug("Activation flow closed");
/*     */                   CoroutineScopeKt.cancel$default(this.$subScope, null, 1, null);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           ProduceKt.awaitClose($this$channelFlow, new Function0<Unit>(subScope) {
/*     */                 public final void invoke() {
/*     */                   GrazieAuthFacadeKt.access$getLog$p().debug("Activation flow closed");
/*     */                   CoroutineScopeKt.cancel$default(this.$subScope, null, 1, null);
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
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$activationState$1$1> $completion) {
/*     */       GrazieAuthFacade$activationState$1$1 grazieAuthFacade$activationState$1$1 = new GrazieAuthFacade$activationState$1$1($completion);
/*     */       grazieAuthFacade$activationState$1$1.L$0 = value;
/*     */       return (Continuation<Unit>)grazieAuthFacade$activationState$1$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */       return ((GrazieAuthFacade$activationState$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthFacade.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$activationState$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*     */   static final class GrazieAuthFacade$activationState$2 extends SuspendLambda implements Function2<AiaActivation, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthFacade$activationState$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       AiaActivation it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (AiaActivation)this.L$0;
/*     */           GrazieAuthFacade.this.saveOptimisticActivationState(GrazieAuthFacade.this, it);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$activationState$2> $completion) {
/*     */       GrazieAuthFacade$activationState$2 grazieAuthFacade$activationState$2 = new GrazieAuthFacade$activationState$2($completion);
/*     */       grazieAuthFacade$activationState$2.L$0 = value;
/*     */       return (Continuation<Unit>)grazieAuthFacade$activationState$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(AiaActivation p1, Continuation<?> p2) {
/*     */       return ((GrazieAuthFacade$activationState$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void relogin() {
/*     */     this._loginSeed.setValue(new LastSuccessfulState());
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object getOrWaitGrazieAuthContext(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$getOrWaitGrazieAuthContext$1
/*     */     //   4: ifeq -> 36
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$getOrWaitGrazieAuthContext$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc -2147483648
/*     */     //   18: iand
/*     */     //   19: ifeq -> 36
/*     */     //   22: aload_3
/*     */     //   23: dup
/*     */     //   24: getfield label : I
/*     */     //   27: ldc -2147483648
/*     */     //   29: isub
/*     */     //   30: putfield label : I
/*     */     //   33: goto -> 46
/*     */     //   36: new com/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$getOrWaitGrazieAuthContext$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;Lkotlin/coroutines/Continuation;)V
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: getfield result : Ljava/lang/Object;
/*     */     //   50: astore_2
/*     */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: aload_3
/*     */     //   57: getfield label : I
/*     */     //   60: tableswitch default -> 181, 0 -> 84, 1 -> 138
/*     */     //   84: aload_2
/*     */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   88: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   91: ldc 'getOrWaitGrazieAuthContext: requesting not-progressing state'
/*     */     //   93: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   96: aload_0
/*     */     //   97: getfield activationState : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   100: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   103: new com/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade$getOrWaitGrazieAuthContext$2
/*     */     //   106: dup
/*     */     //   107: aload_0
/*     */     //   108: aconst_null
/*     */     //   109: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;Lkotlin/coroutines/Continuation;)V
/*     */     //   112: checkcast kotlin/jvm/functions/Function2
/*     */     //   115: aload_3
/*     */     //   116: aload_3
/*     */     //   117: aload_0
/*     */     //   118: putfield L$0 : Ljava/lang/Object;
/*     */     //   121: aload_3
/*     */     //   122: iconst_1
/*     */     //   123: putfield label : I
/*     */     //   126: invokestatic first : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   129: dup
/*     */     //   130: aload #4
/*     */     //   132: if_acmpne -> 151
/*     */     //   135: aload #4
/*     */     //   137: areturn
/*     */     //   138: aload_3
/*     */     //   139: getfield L$0 : Ljava/lang/Object;
/*     */     //   142: checkcast com/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade
/*     */     //   145: astore_0
/*     */     //   146: aload_2
/*     */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   150: aload_2
/*     */     //   151: pop
/*     */     //   152: invokestatic access$getLog$p : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   155: ldc 'getOrWaitGrazieAuthContext: requesting not-progressing state - done'
/*     */     //   157: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   160: aload_0
/*     */     //   161: getfield activationState : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   164: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation
/*     */     //   172: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   177: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   180: areturn
/*     */     //   181: new java/lang/IllegalStateException
/*     */     //   184: dup
/*     */     //   185: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   187: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   190: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #77	-> 54
/*     */     //   #78	-> 88
/*     */     //   #79	-> 96
/*     */     //   #77	-> 135
/*     */     //   #82	-> 151
/*     */     //   #83	-> 160
/*     */     //   #77	-> 181
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	50	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*     */     //   146	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/GrazieAuthFacade;
/*     */     //   0	191	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   46	135	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   51	130	2	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthFacade.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$getOrWaitGrazieAuthContext$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*     */   static final class GrazieAuthFacade$getOrWaitGrazieAuthContext$2 extends SuspendLambda implements Function2<AiaActivation, Continuation<? super Boolean>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieAuthFacade$getOrWaitGrazieAuthContext$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       AiaActivation it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (AiaActivation)this.L$0;
/*     */           return Boxing.boxBoolean(!GrazieAuthFacade.this.isProgressing(it));
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$getOrWaitGrazieAuthContext$2> $completion) {
/*     */       GrazieAuthFacade$getOrWaitGrazieAuthContext$2 grazieAuthFacade$getOrWaitGrazieAuthContext$2 = new GrazieAuthFacade$getOrWaitGrazieAuthContext$2($completion);
/*     */       grazieAuthFacade$getOrWaitGrazieAuthContext$2.L$0 = value;
/*     */       return (Continuation<Unit>)grazieAuthFacade$getOrWaitGrazieAuthContext$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(AiaActivation p1, Continuation<?> p2) {
/*     */       return ((GrazieAuthFacade$getOrWaitGrazieAuthContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final void saveOptimisticActivationState(GrazieAuthFacade $this$saveOptimisticActivationState, AiaActivation activation) {
/*     */     if ($this$saveOptimisticActivationState.isSuccessful(activation)) {
/*     */       GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state successful");
/*     */       $this$saveOptimisticActivationState._optimisticState.setValue(Boolean.valueOf(true));
/*     */     } else if ($this$saveOptimisticActivationState.isUnsuccessful(activation)) {
/*     */       GrazieAuthFacadeKt.access$getLog$p().debug("Optimistic state unsuccessful");
/*     */       $this$saveOptimisticActivationState._optimisticState.setValue(Boolean.valueOf(false));
/*     */     } 
/*     */   }
/*     */   
/*     */   private final boolean isProgressing(AiaActivation $this$isProgressing) {
/*     */     return Outcome.incompleteOrNull-impl($this$isProgressing.getOutcome-07x5Wys()) instanceof com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivationProgressing;
/*     */   }
/*     */   
/*     */   private final boolean isSuccessful(AiaActivation $this$isSuccessful) {
/*     */     return (Outcome.getOrNull-impl($this$isSuccessful.getOutcome-07x5Wys()) != null);
/*     */   }
/*     */   
/*     */   private final boolean isUnsuccessful(AiaActivation $this$isUnsuccessful) {
/*     */     return (!isSuccessful($this$isUnsuccessful) && !isProgressing($this$isUnsuccessful));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieAuthFacade.kt", l = {79}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getOrWaitGrazieAuthContext", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieAuthFacade$getOrWaitGrazieAuthContext$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     GrazieAuthFacade$getOrWaitGrazieAuthContext$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieAuthFacade.this.getOrWaitGrazieAuthContext((Continuation<? super GrazieAuthContext>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacade.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */