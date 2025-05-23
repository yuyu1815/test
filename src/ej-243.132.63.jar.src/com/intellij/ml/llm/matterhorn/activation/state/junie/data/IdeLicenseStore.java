/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieIdeLicenseRepository;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore;", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "aiFlagLazy", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;", "getAiFlagLazy", "()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nAiaDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,83:1\n75#2:84\n189#3:85\n*S KotlinDebug\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/IdeLicenseStore\n*L\n61#1:84\n61#1:85\n*E\n"})
/*    */ public final class IdeLicenseStore
/*    */   implements AiaDataStore
/*    */ {
/*    */   @NotNull
/*    */   private final StateLazy<IdeLicenseAiFlag> aiFlagLazy;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public IdeLicenseStore(@NotNull CoroutineScope cs) {
/* 61 */     AiaServiceSupport $this$invoke$iv = (AiaServiceSupport)JunieIdeLicenseRepository.Companion; int $i$f$invoke = 0;
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
/* 85 */     this.aiFlagLazy = StateLazyKt.stateLazyIn(FlowKt.transformLatest($this$flatMapLatest$iv$iv, new IdeLicenseStore$special$$inlined$invoke$1(null)), cs, IdeLicenseAiFlag.LicenseAiUnknown);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StateLazy<IdeLicenseAiFlag> getAiFlagLazy() {
/*    */     return this.aiFlagLazy;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\IdeLicenseStore.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */