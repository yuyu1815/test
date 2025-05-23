/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAieProvisionRepository;
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
/*     */ @DebugMetadata(f = "AiaDataStore.kt", l = {189}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.data.AieProvisionStore$special$$inlined$invoke$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003*\b\022\004\022\002H\0030\0042\006\020\005\032\002H\002H@¨\006\007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt$invoke$$inlined$flatMapLatest$1"})
/*     */ @SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore\n*L\n1#1,214:1\n75#2:215\n53#3:216\n*E\n"})
/*     */ public final class AieProvisionStore$special$$inlined$invoke$1
/*     */   extends SuspendLambda
/*     */   implements Function3<FlowCollector<? super AieProvisionStatus>, JunieAieProvisionRepository, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   public AieProvisionStore$special$$inlined$invoke$1(Continuation $completion) {
/*     */     super(3, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object invokeSuspend(@NotNull Continuation $completion) {
/*     */     FlowCollector $this$transformLatest;
/*     */     Object it;
/*     */     FlowCollector flowCollector1;
/*     */     Object object2;
/*     */     int $i$a$-flatMapLatest-AiaDataStoreKt$invoke$1;
/*     */     JunieAieProvisionRepository $this$provisionStatusLazy_u24lambda_u240;
/*     */     int $i$a$-invoke-AieProvisionStore$provisionStatusLazy$1;
/*     */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */     switch (this.label) {
/*     */       case 0:
/*     */         ResultKt.throwOnFailure($completion);
/*     */         $this$transformLatest = (FlowCollector)this.L$0;
/*     */         it = this.L$1;
/* 189 */         flowCollector1 = $this$transformLatest; (Continuation)this; object2 = it; $i$a$-flatMapLatest-AiaDataStoreKt$invoke$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 215 */         $this$provisionStatusLazy_u24lambda_u240 = (JunieAieProvisionRepository)object2; $i$a$-invoke-AieProvisionStore$provisionStatusLazy$1 = 0; this.label = 1;
/* 216 */         if (FlowKt.emitAll(flowCollector1, $this$provisionStatusLazy_u24lambda_u240.getProvisionStatusFlow(), (Continuation)this) == object1) return object1;  FlowKt.emitAll(flowCollector1, $this$provisionStatusLazy_u24lambda_u240.getProvisionStatusFlow(), (Continuation)this);
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
/*     */     AieProvisionStore$special$$inlined$invoke$1 aieProvisionStore$special$$inlined$invoke$1 = new AieProvisionStore$special$$inlined$invoke$1(p3);
/*     */     aieProvisionStore$special$$inlined$invoke$1.L$0 = p1;
/*     */     aieProvisionStore$special$$inlined$invoke$1.L$1 = p2;
/*     */     return aieProvisionStore$special$$inlined$invoke$1.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AieProvisionStore$special$$inlined$invoke$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */