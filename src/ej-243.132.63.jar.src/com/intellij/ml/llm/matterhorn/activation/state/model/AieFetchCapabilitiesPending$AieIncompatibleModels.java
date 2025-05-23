/*    */ package com.intellij.ml.llm.matterhorn.activation.state.model;
/*    */ 
/*    */ import com.intellij.ml.llm.activation.data.model.LlmModelId;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\0012\0020\002B#\022\f\020\003\032\b\022\004\022\0020\0050\004\022\f\020\006\032\b\022\004\022\0020\0050\004¢\006\004\b\007\020\bJ\017\020\f\032\b\022\004\022\0020\0050\004HÆ\003J\017\020\r\032\b\022\004\022\0020\0050\004HÆ\003J)\020\016\032\0020\0002\016\b\002\020\003\032\b\022\004\022\0020\0050\0042\016\b\002\020\006\032\b\022\004\022\0020\0050\004HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\027\020\003\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\t\020\nR\027\020\006\032\b\022\004\022\0020\0050\004¢\006\b\n\000\032\004\b\013\020\n¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieIncompatibleModels;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;", "availableModels", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "requiredModels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAvailableModels", "()Ljava/util/List;", "getRequiredModels", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "state.model"})
/*    */ public final class AieIncompatibleModels
/*    */   extends AiaActivationRoadblocked
/*    */   implements AieFetchCapabilitiesPending
/*    */ {
/*    */   @NotNull
/*    */   private final List<LlmModelId> availableModels;
/*    */   @NotNull
/*    */   private final List<LlmModelId> requiredModels;
/*    */   
/*    */   @NotNull
/*    */   public final List<LlmModelId> getAvailableModels() {
/* 45 */     return this.availableModels; } @NotNull
/* 46 */   public final List<LlmModelId> getRequiredModels() { return this.requiredModels; } public AieIncompatibleModels(@NotNull List<LlmModelId> availableModels, @NotNull List<LlmModelId> requiredModels) {
/* 47 */     super(null);
/*    */     this.availableModels = availableModels;
/*    */     this.requiredModels = requiredModels;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<LlmModelId> component1() {
/*    */     return this.availableModels;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<LlmModelId> component2() {
/*    */     return this.requiredModels;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AieIncompatibleModels copy(@NotNull List<LlmModelId> availableModels, @NotNull List<LlmModelId> requiredModels) {
/*    */     Intrinsics.checkNotNullParameter(availableModels, "availableModels");
/*    */     Intrinsics.checkNotNullParameter(requiredModels, "requiredModels");
/*    */     return new AieIncompatibleModels(availableModels, requiredModels);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AieIncompatibleModels(availableModels=" + this.availableModels + ", requiredModels=" + this.requiredModels + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.availableModels.hashCode();
/*    */     return result * 31 + this.requiredModels.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AieIncompatibleModels))
/*    */       return false; 
/*    */     AieIncompatibleModels aieIncompatibleModels = (AieIncompatibleModels)other;
/*    */     return !Intrinsics.areEqual(this.availableModels, aieIncompatibleModels.availableModels) ? false : (!!Intrinsics.areEqual(this.requiredModels, aieIncompatibleModels.requiredModels));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\AieFetchCapabilitiesPending$AieIncompatibleModels.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */