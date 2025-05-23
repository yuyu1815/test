/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise;
/*     */ 
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceConfigurationResult;
/*     */ import com.intellij.platform.ide.provisioner.ProvisionedServiceDescriptor;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "JunieAieProvisionRepositoryImpl.kt", l = {189}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.enterprise.JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\002H\0030\0042\006\020\005\032\002H\002H@¨\006\006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"})
/*     */ @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 JunieAieProvisionRepositoryImpl.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/enterprise/JunieAieProvisionRepositoryImpl\n*L\n1#1,214:1\n40#2,4:215\n*E\n"})
/*     */ public final class JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1
/*     */   extends SuspendLambda
/*     */   implements Function3<FlowCollector<? super ProvisionedServiceConfigurationResult>, ProvisionedServiceDescriptor, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   public JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1(Continuation $completion) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Continuation $completion) {
/*     */     FlowCollector $this$transformLatest;
/*     */     Object it;
/*     */     FlowCollector flowCollector1;
/*     */     ProvisionedServiceDescriptor serviceDescriptor;
/*     */     int $i$a$-flatMapLatest-JunieAieProvisionRepositoryImpl$configurationState$2;
/*     */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */     switch (this.label) {
/*     */       case 0:
/*     */         ResultKt.throwOnFailure($completion);
/*     */         $this$transformLatest = (FlowCollector)this.L$0;
/*     */         it = this.L$1;
/* 189 */         flowCollector1 = $this$transformLatest; (Continuation)this; serviceDescriptor = (ProvisionedServiceDescriptor)it; $i$a$-flatMapLatest-JunieAieProvisionRepositoryImpl$configurationState$2 = 0; this.label = 1; if (FlowKt.emitAll(flowCollector1, 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 216 */             (serviceDescriptor == null) ? FlowKt.flowOf(null) : 
/* 217 */             serviceDescriptor.getConfigurationFlow(), (Continuation)this) == object1) return object1;  FlowKt.emitAll(flowCollector1, (serviceDescriptor == null) ? FlowKt.flowOf(null) : serviceDescriptor.getConfigurationFlow(), (Continuation)this);
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
/*     */     JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1 junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1 = new JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1(p3);
/*     */     junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1.L$0 = p1;
/*     */     junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1.L$1 = p2;
/*     */     return junieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\enterprise\JunieAieProvisionRepositoryImpl$special$$inlined$flatMapLatest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */