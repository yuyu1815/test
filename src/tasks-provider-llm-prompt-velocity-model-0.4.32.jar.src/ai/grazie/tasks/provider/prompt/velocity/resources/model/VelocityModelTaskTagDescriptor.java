/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\025\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BC\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\n\b\002\020\006\032\004\030\0010\007\022\b\b\002\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\013¢\006\004\b\f\020\rJ\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\003HÆ\003J\013\020\033\032\004\030\0010\007HÆ\003J\t\020\034\032\0020\tHÆ\003J\013\020\035\032\004\030\0010\013HÆ\003JI\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\013HÆ\001J\023\020\037\032\0020\t2\b\020 \032\004\030\0010!HÖ\003J\t\020\"\032\0020#HÖ\001J\t\020$\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\017R\024\020\005\032\0020\003X\004¢\006\b\n\000\032\004\b\021\020\017R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\022\020\023R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\024\020\025R\026\020\n\032\004\030\0010\013X\004¢\006\b\n\000\032\004\b\026\020\027¨\006%"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskTagDescriptor;", "tag", "", "model", "promptPath", "postProcessor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;", "experimental", "", "modelParameters", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;ZLai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;)V", "getTag", "()Ljava/lang/String;", "getModel", "getPromptPath", "getPostProcessor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelPostProcessorDescriptor;", "getExperimental", "()Z", "getModelParameters", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelTaskTagDescriptor implements VelocityModelBaseTaskTagDescriptor {
/*    */   @NotNull
/*    */   private final String tag;
/*    */   @NotNull
/*    */   private final String model;
/*    */   @NotNull
/*    */   private final String promptPath;
/*    */   
/* 18 */   public VelocityModelTaskTagDescriptor(@NotNull String tag, @NotNull String model, @NotNull String promptPath, @Nullable VelocityModelPostProcessorDescriptor postProcessor, boolean experimental, @Nullable VelocityModelModelParameters modelParameters) { this.tag = tag;
/* 19 */     this.model = model;
/* 20 */     this.promptPath = promptPath;
/* 21 */     this.postProcessor = postProcessor;
/* 22 */     this.experimental = experimental;
/* 23 */     this.modelParameters = modelParameters; } @Nullable private final VelocityModelPostProcessorDescriptor postProcessor; private final boolean experimental; @Nullable private final VelocityModelModelParameters modelParameters; @Nullable public VelocityModelModelParameters getModelParameters() { return this.modelParameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public String getTag() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getModel() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getPromptPath() {
/*    */     return this.promptPath;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelPostProcessorDescriptor getPostProcessor() {
/*    */     return this.postProcessor;
/*    */   }
/*    */   
/*    */   public boolean getExperimental() {
/*    */     return this.experimental;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.model;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.promptPath;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelPostProcessorDescriptor component4() {
/*    */     return this.postProcessor;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.experimental;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelModelParameters component6() {
/*    */     return this.modelParameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelTaskTagDescriptor copy(@NotNull String tag, @NotNull String model, @NotNull String promptPath, @Nullable VelocityModelPostProcessorDescriptor postProcessor, boolean experimental, @Nullable VelocityModelModelParameters modelParameters) {
/*    */     Intrinsics.checkNotNullParameter(tag, "tag");
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     Intrinsics.checkNotNullParameter(promptPath, "promptPath");
/*    */     return new VelocityModelTaskTagDescriptor(tag, model, promptPath, postProcessor, experimental, modelParameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelTaskTagDescriptor(tag=" + this.tag + ", model=" + this.model + ", promptPath=" + this.promptPath + ", postProcessor=" + this.postProcessor + ", experimental=" + this.experimental + ", modelParameters=" + this.modelParameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tag.hashCode();
/*    */     result = result * 31 + this.model.hashCode();
/*    */     result = result * 31 + this.promptPath.hashCode();
/*    */     result = result * 31 + ((this.postProcessor == null) ? 0 : this.postProcessor.hashCode());
/*    */     result = result * 31 + Boolean.hashCode(this.experimental);
/*    */     return result * 31 + ((this.modelParameters == null) ? 0 : this.modelParameters.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelTaskTagDescriptor))
/*    */       return false; 
/*    */     VelocityModelTaskTagDescriptor velocityModelTaskTagDescriptor = (VelocityModelTaskTagDescriptor)other;
/*    */     return !Intrinsics.areEqual(this.tag, velocityModelTaskTagDescriptor.tag) ? false : (!Intrinsics.areEqual(this.model, velocityModelTaskTagDescriptor.model) ? false : (!Intrinsics.areEqual(this.promptPath, velocityModelTaskTagDescriptor.promptPath) ? false : (!Intrinsics.areEqual(this.postProcessor, velocityModelTaskTagDescriptor.postProcessor) ? false : ((this.experimental != velocityModelTaskTagDescriptor.experimental) ? false : (!!Intrinsics.areEqual(this.modelParameters, velocityModelTaskTagDescriptor.modelParameters))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelTaskTagDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */