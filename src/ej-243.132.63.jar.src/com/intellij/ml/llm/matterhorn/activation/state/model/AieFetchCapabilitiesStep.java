/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B1\022\024\020\004\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\005\022\022\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\t¢\006\004\b\n\020\013J\027\020\021\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\005HÆ\003J\034\020\022\032\016\022\004\022\0020\002\022\004\022\0020\0030\tHÆ\003¢\006\004\b\023\020\017J>\020\024\032\0020\0002\026\b\002\020\004\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\0052\024\b\002\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\tHÆ\001¢\006\004\b\025\020\026J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\034HÖ\001J\t\020\035\032\0020\036HÖ\001R\037\020\004\032\020\022\n\022\b\022\004\022\0020\0070\006\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\"\020\b\032\016\022\004\022\0020\002\022\004\022\0020\0030\tX\004¢\006\n\n\002\020\020\032\004\b\016\020\017¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending;", "", "onFetchCapabilities", "Lkotlin/Function0;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;", "outcome", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getOnFetchCapabilities", "()Lkotlin/jvm/functions/Function0;", "getOutcome-07x5Wys", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-07x5Wys", "copy", "copy-9rsLeOw", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AieFetchCapabilitiesStep
/*    */   implements Journey<AieFetchCapabilitiesPending, Unit>
/*    */ {
/*    */   @Nullable
/*    */   private final Function0<OpHandle<GrazieResult.GrazieFailure>> onFetchCapabilities;
/*    */   @NotNull
/*    */   private final Object outcome;
/*    */   
/*    */   private AieFetchCapabilitiesStep(Function0<OpHandle<GrazieResult.GrazieFailure>> onFetchCapabilities, Object outcome) {
/* 37 */     this.onFetchCapabilities = onFetchCapabilities;
/* 38 */     this.outcome = outcome; } @NotNull public Object getOutcome-07x5Wys() { return this.outcome; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final Function0<OpHandle<GrazieResult.GrazieFailure>> getOnFetchCapabilities() {
/*    */     return this.onFetchCapabilities;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Function0<OpHandle<GrazieResult.GrazieFailure>> component1() {
/*    */     return this.onFetchCapabilities;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Object component2-07x5Wys() {
/*    */     return this.outcome;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AieFetchCapabilitiesStep copy-9rsLeOw(@Nullable Function0 onFetchCapabilities, @NotNull Object outcome) {
/*    */     return new AieFetchCapabilitiesStep(onFetchCapabilities, outcome, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AieFetchCapabilitiesStep(onFetchCapabilities=" + this.onFetchCapabilities + ", outcome=" + Outcome.toString-impl(this.outcome) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.onFetchCapabilities == null) ? 0 : this.onFetchCapabilities.hashCode();
/*    */     return result * 31 + Outcome.hashCode-impl(this.outcome);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AieFetchCapabilitiesStep))
/*    */       return false; 
/*    */     AieFetchCapabilitiesStep aieFetchCapabilitiesStep = (AieFetchCapabilitiesStep)other;
/*    */     return !Intrinsics.areEqual(this.onFetchCapabilities, aieFetchCapabilitiesStep.onFetchCapabilities) ? false : (!!Outcome.equals-impl0(this.outcome, aieFetchCapabilitiesStep.outcome));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AieFetchCapabilitiesStep.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */