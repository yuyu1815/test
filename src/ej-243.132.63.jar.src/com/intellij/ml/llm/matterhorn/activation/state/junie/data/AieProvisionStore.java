/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAieProvisionRepository;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import com.intellij.openapi.components.Service;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\t\020\nR\027\020\013\032\b\022\004\022\0020\f0\007¢\006\b\n\000\032\004\b\r\020\n¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "provisionStatusLazy", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;", "getProvisionStatusLazy", "()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "authDataLazy", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "getAuthDataLazy", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nAiaDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,83:1\n75#2:84\n75#2:86\n189#3:85\n189#3:87\n*S KotlinDebug\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore\n*L\n53#1:84\n55#1:86\n53#1:85\n55#1:87\n*E\n"})
/*    */ public final class AieProvisionStore
/*    */   implements AiaDataStore
/*    */ {
/*    */   @NotNull
/*    */   private final StateLazy<AieProvisionStatus> provisionStatusLazy;
/*    */   @NotNull
/*    */   private final StateLazy<AieAuthResult> authDataLazy;
/*    */   public static final int $stable;
/*    */   
/*    */   public AieProvisionStore(@NotNull CoroutineScope cs) {
/* 53 */     AiaServiceSupport $this$invoke$iv = (AiaServiceSupport)JunieAieProvisionRepository.Companion; int $i$f$invoke = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 84 */     Flow $this$flatMapLatest$iv$iv = $this$invoke$iv.instanceFlow(); int $i$f$flatMapLatest = 0;
/* 85 */     this.provisionStatusLazy = StateLazyKt.stateLazyIn(FlowKt.transformLatest($this$flatMapLatest$iv$iv, new AieProvisionStore$special$$inlined$invoke$1(null)), cs, AieProvisionStatus.AieInitializing.INSTANCE); $this$invoke$iv = (AiaServiceSupport)JunieAieProvisionRepository.Companion; $i$f$invoke = 0;
/* 86 */     $this$flatMapLatest$iv$iv = $this$invoke$iv.instanceFlow(); $i$f$flatMapLatest = 0;
/* 87 */     this.authDataLazy = StateLazyKt.stateLazyIn(FlowKt.transformLatest($this$flatMapLatest$iv$iv, new AieProvisionStore$special$$inlined$invoke$2(null)), cs, AieAuthFailure.AieServiceUnavailable.INSTANCE);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StateLazy<AieProvisionStatus> getProvisionStatusLazy() {
/*    */     return this.provisionStatusLazy;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StateLazy<AieAuthResult> getAuthDataLazy() {
/*    */     return this.authDataLazy;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AieProvisionStore.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */