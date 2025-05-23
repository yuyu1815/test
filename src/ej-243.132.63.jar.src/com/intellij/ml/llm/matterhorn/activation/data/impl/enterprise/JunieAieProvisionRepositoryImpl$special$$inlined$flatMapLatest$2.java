/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfigurationResult;
/*     */ import com.intellij.platform.ide.provisioner.endpoint.ServiceEndpoint;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.flow.Flow;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {189}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\002H\0030\0042\006\020\005\032\002H\002H@¨\006\006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"})
/*     */ @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,214:1\n53#2,3:215\n58#2:223\n49#3:218\n51#3:222\n46#4:219\n51#4:221\n105#5:220\n*S KotlinDebug\n*F\n+ 1 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl\n*L\n55#1:218\n55#1:222\n55#1:219\n55#1:221\n55#1:220\n*E\n"})
/*     */ public final class JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2
/*     */   extends SuspendLambda
/*     */   implements Function3<FlowCollector<? super AieAuthResult>, ProvisionedServiceConfigurationResult, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   public JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2(Continuation $completion) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Continuation $completion) {
/*     */     FlowCollector $this$transformLatest;
/*     */     Object it;
/*     */     FlowCollector flowCollector1;
/*     */     ProvisionedServiceConfigurationResult configurationResult;
/*     */     int $i$a$-flatMapLatest-JunieAieProvisionRepositoryImpl$authDataFlow$1;
/*     */     ServiceEndpoint endpoint;
/*     */     Flow $this$map$iv;
/*     */     int $i$f$map;
/*     */     Flow $this$unsafeTransform$iv$iv;
/*     */     int $i$f$unsafeTransform;
/*     */     int $i$f$unsafeFlow;
/*     */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */     switch (this.label) {
/*     */       case 0:
/*     */         ResultKt.throwOnFailure($completion);
/*     */         $this$transformLatest = (FlowCollector)this.L$0;
/*     */         it = this.L$1;
/* 189 */         flowCollector1 = $this$transformLatest; (Continuation)this; configurationResult = (ProvisionedServiceConfigurationResult)it; $i$a$-flatMapLatest-JunieAieProvisionRepositoryImpl$authDataFlow$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 215 */         endpoint = JunieAieProvisionRepositoryImplKt.access$getEndpoint(configurationResult);
/*     */         
/* 217 */         $this$map$iv = endpoint.getAuthTokenFlow(); $i$f$map = 0;
/* 218 */         $this$unsafeTransform$iv$iv = $this$map$iv; $i$f$unsafeTransform = 0;
/* 219 */         $i$f$unsafeFlow = 0; this.label = 1;
/* 220 */         if (FlowKt.emitAll(flowCollector1, (endpoint == null) ? FlowKt.flowOf(AieAuthFailure.AieServiceUnavailable.INSTANCE) : new JunieAieProvisionRepositoryImpl$authDataFlow$lambda$2$$inlined$map$1($this$unsafeTransform$iv$iv), (Continuation)this) == object1) return object1;  FlowKt.emitAll(flowCollector1, (endpoint == null) ? FlowKt.flowOf(AieAuthFailure.AieServiceUnavailable.INSTANCE) : new JunieAieProvisionRepositoryImpl$authDataFlow$lambda$2$$inlined$map$1($this$unsafeTransform$iv$iv), (Continuation)this);
/*     */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure($completion);
/*     */         return Unit.INSTANCE;
/*     */     } 
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invoke(@NotNull FlowCollector p1, Object p2, @Nullable Continuation p3) {
/*     */     JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2 junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2 = new JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2(p3);
/*     */     junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2.L$0 = p1;
/*     */     junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2.L$1 = p2;
/*     */     return junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\enterprise\JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */