/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAieProvisionRepository;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfigurationResult;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceDescriptor;
/*     */ import com.intellij.platform.ide.provisioner.endpoint.ServiceEndpoint;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.coroutines.flow.SharingStarted;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\021\032\0020\0222\006\020\023\032\0020\024H\026R\026\020\006\032\n\022\006\022\004\030\0010\b0\007X\004¢\006\002\n\000R\032\020\t\032\b\022\004\022\0020\0130\nX\004¢\006\b\n\000\032\004\b\f\020\rR\032\020\016\032\b\022\004\022\0020\0170\nX\004¢\006\b\n\000\032\004\b\020\020\r¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "configurationState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfigurationResult;", "authDataFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "getAuthDataFlow", "()Lkotlinx/coroutines/flow/Flow;", "provisionStatusFlow", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;", "getProvisionStatusFlow", "reportAuthFailure", "", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "data.impl.enterprise"})
/*     */ @SourceDebugExtension({"SMAP\nJunieAieProvisionRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,146:1\n189#2:147\n189#2:148\n49#3:149\n51#3:153\n46#4:150\n51#4:152\n105#5:151\n*S KotlinDebug\n*F\n+ 1 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl\n*L\n39#1:147\n52#1:148\n64#1:149\n64#1:153\n64#1:150\n64#1:152\n64#1:151\n*E\n"})
/*     */ final class JunieAieProvisionRepositoryImpl
/*     */   implements JunieAieProvisionRepository {
/*     */   @NotNull
/*     */   private final StateFlow<ProvisionedServiceConfigurationResult> configurationState;
/*     */   
/*     */   public JunieAieProvisionRepositoryImpl(@NotNull CoroutineScope cs) {
/*  36 */     Flow flow1 = FlowKt.onEach(JunieAieProvisionRepositoryImplKt.access$aiServiceDescriptorFlow(), new JunieAieProvisionRepositoryImpl$configurationState$1(null));
/*     */ 
/*     */     
/*  39 */     int $i$f$flatMapLatest = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.configurationState = FlowKt.stateIn(FlowKt.onEach(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 147 */           FlowKt.transformLatest(flow1, new JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1(null)), new JunieAieProvisionRepositoryImpl$configurationState$3(null)), cs, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), null); Flow $this$flatMapLatest$iv = (Flow)this.configurationState; $i$f$flatMapLatest = 0;
/* 148 */     this.authDataFlow = (Flow<AieAuthResult>)FlowKt.stateIn(FlowKt.transformLatest($this$flatMapLatest$iv, new JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2(null)), cs, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), AieAuthFailure.AieServiceUnavailable.INSTANCE); $this$flatMapLatest$iv = (Flow)this.configurationState; int $i$f$map = 0;
/* 149 */     Flow $this$unsafeTransform$iv$iv = $this$flatMapLatest$iv; int $i$f$unsafeTransform = 0;
/* 150 */     int $i$f$unsafeFlow = 0;
/* 151 */     this.provisionStatusFlow = (Flow<AieProvisionStatus>)FlowKt.stateIn(FlowKt.onEach(new JunieAieProvisionRepositoryImpl$special$$inlined$map$1($this$unsafeTransform$iv$iv), new JunieAieProvisionRepositoryImpl$provisionStatusFlow$2(null)), cs, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), AieProvisionStatus.AieInitializing.INSTANCE);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final Flow<AieAuthResult> authDataFlow;
/*     */   @NotNull
/*     */   private final Flow<AieProvisionStatus> provisionStatusFlow;
/*     */   
/*     */   @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$configurationState$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceDescriptor;"})
/*     */   static final class JunieAieProvisionRepositoryImpl$configurationState$1 extends SuspendLambda implements Function2<ProvisionedServiceDescriptor, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieAieProvisionRepositoryImpl$configurationState$1(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProvisionedServiceDescriptor it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (ProvisionedServiceDescriptor)this.L$0;
/*     */           JunieAieProvisionRepositoryImplKt.access$getLOG$p().debug("AI service descriptor: " + it);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieAieProvisionRepositoryImpl$configurationState$1> $completion) {
/*     */       JunieAieProvisionRepositoryImpl$configurationState$1 junieAieProvisionRepositoryImpl$configurationState$1 = new JunieAieProvisionRepositoryImpl$configurationState$1($completion);
/*     */       junieAieProvisionRepositoryImpl$configurationState$1.L$0 = value;
/*     */       return (Continuation<Unit>)junieAieProvisionRepositoryImpl$configurationState$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProvisionedServiceDescriptor p1, Continuation<?> p2) {
/*     */       return ((JunieAieProvisionRepositoryImpl$configurationState$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$configurationState$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/platform/ide/provisioner/ProvisionedServiceConfigurationResult;"})
/*     */   static final class JunieAieProvisionRepositoryImpl$configurationState$3 extends SuspendLambda implements Function2<ProvisionedServiceConfigurationResult, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieAieProvisionRepositoryImpl$configurationState$3(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       ProvisionedServiceConfigurationResult it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (ProvisionedServiceConfigurationResult)this.L$0;
/*     */           JunieAieProvisionRepositoryImplKt.access$getLOG$p().debug("AI service configuration: " + it);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieAieProvisionRepositoryImpl$configurationState$3> $completion) {
/*     */       JunieAieProvisionRepositoryImpl$configurationState$3 junieAieProvisionRepositoryImpl$configurationState$3 = new JunieAieProvisionRepositoryImpl$configurationState$3($completion);
/*     */       junieAieProvisionRepositoryImpl$configurationState$3.L$0 = value;
/*     */       return (Continuation<Unit>)junieAieProvisionRepositoryImpl$configurationState$3;
/*     */     }
/*     */     
/*     */     public final Object invoke(ProvisionedServiceConfigurationResult p1, Continuation<?> p2) {
/*     */       return ((JunieAieProvisionRepositoryImpl$configurationState$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Flow<AieAuthResult> getAuthDataFlow() {
/*     */     return this.authDataFlow;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Flow<AieProvisionStatus> getProvisionStatusFlow() {
/*     */     return this.provisionStatusFlow;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$provisionStatusFlow$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;"})
/*     */   static final class JunieAieProvisionRepositoryImpl$provisionStatusFlow$2 extends SuspendLambda implements Function2<AieProvisionStatus, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieAieProvisionRepositoryImpl$provisionStatusFlow$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       AieProvisionStatus it;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (AieProvisionStatus)this.L$0;
/*     */           JunieAieProvisionRepositoryImplKt.access$getLOG$p().debug("AI Enterprise state: " + it);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieAieProvisionRepositoryImpl$provisionStatusFlow$2> $completion) {
/*     */       JunieAieProvisionRepositoryImpl$provisionStatusFlow$2 junieAieProvisionRepositoryImpl$provisionStatusFlow$2 = new JunieAieProvisionRepositoryImpl$provisionStatusFlow$2($completion);
/*     */       junieAieProvisionRepositoryImpl$provisionStatusFlow$2.L$0 = value;
/*     */       return (Continuation<Unit>)junieAieProvisionRepositoryImpl$provisionStatusFlow$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(AieProvisionStatus p1, Continuation<?> p2) {
/*     */       return ((JunieAieProvisionRepositoryImpl$provisionStatusFlow$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public void reportAuthFailure(@NotNull GrazieAuthData authData) {
/*     */     ServiceEndpoint endpoint;
/*     */     Intrinsics.checkNotNullParameter(authData, "authData");
/*     */     if (JunieAieProvisionRepositoryImplKt.access$getEndpoint((ProvisionedServiceConfigurationResult)this.configurationState.getValue()) == null) {
/*     */       JunieAieProvisionRepositoryImplKt.access$getEndpoint((ProvisionedServiceConfigurationResult)this.configurationState.getValue());
/*     */       return;
/*     */     } 
/*     */     endpoint.reportAuthFailure(JunieAieProvisionRepositoryImplKt.access$toProvisionerAuthToken(authData));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\enterprise\JunieAieProvisionRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */