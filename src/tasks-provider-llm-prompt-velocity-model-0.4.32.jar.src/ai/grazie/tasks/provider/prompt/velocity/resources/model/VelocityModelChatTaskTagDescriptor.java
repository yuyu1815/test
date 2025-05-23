/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\025\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BI\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\020\b\002\020\005\032\n\022\004\022\0020\003\030\0010\006\022\b\b\002\020\007\032\0020\003\022\b\b\002\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\013¢\006\004\b\f\020\rJ\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\021\020\032\032\n\022\004\022\0020\003\030\0010\006HÆ\003J\t\020\033\032\0020\003HÆ\003J\t\020\034\032\0020\tHÆ\003J\013\020\035\032\004\030\0010\013HÆ\003JO\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\020\b\002\020\005\032\n\022\004\022\0020\003\030\0010\0062\b\b\002\020\007\032\0020\0032\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\013HÆ\001J\023\020\037\032\0020\t2\b\020 \032\004\030\0010!HÖ\003J\t\020\"\032\0020#HÖ\001J\t\020$\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\020\020\017R\031\020\005\032\n\022\004\022\0020\003\030\0010\006¢\006\b\n\000\032\004\b\021\020\022R\024\020\007\032\0020\003X\004¢\006\b\n\000\032\004\b\023\020\017R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\024\020\025R\026\020\n\032\004\030\0010\013X\004¢\006\b\n\000\032\004\b\026\020\027¨\006%"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskTagDescriptor;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskTagDescriptor;", "tag", "", "model", "functions", "", "promptPath", "experimental", "", "modelParameters", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;)V", "getTag", "()Ljava/lang/String;", "getModel", "getFunctions", "()Ljava/util/List;", "getPromptPath", "getExperimental", "()Z", "getModelParameters", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelChatTaskTagDescriptor implements VelocityModelBaseTaskTagDescriptor {
/*    */   @NotNull
/*    */   private final String tag;
/*    */   @NotNull
/*    */   private final String model;
/*    */   @Nullable
/*    */   private final List<String> functions;
/*    */   @NotNull
/*    */   private final String promptPath;
/*    */   private final boolean experimental;
/*    */   @Nullable
/*    */   private final VelocityModelModelParameters modelParameters;
/*    */   
/* 24 */   public VelocityModelChatTaskTagDescriptor(@NotNull String tag, @NotNull String model, @Nullable List<String> functions, @NotNull String promptPath, boolean experimental, @Nullable VelocityModelModelParameters modelParameters) { this.tag = tag;
/* 25 */     this.model = model;
/* 26 */     this.functions = functions;
/* 27 */     this.promptPath = promptPath;
/* 28 */     this.experimental = experimental;
/* 29 */     this.modelParameters = modelParameters; } @Nullable public VelocityModelModelParameters getModelParameters() { return this.modelParameters; }
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
/*    */   @Nullable
/*    */   public final List<String> getFunctions() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getPromptPath() {
/*    */     return this.promptPath;
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
/*    */   @Nullable
/*    */   public final List<String> component3() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.promptPath;
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
/*    */   public final VelocityModelChatTaskTagDescriptor copy(@NotNull String tag, @NotNull String model, @Nullable List<String> functions, @NotNull String promptPath, boolean experimental, @Nullable VelocityModelModelParameters modelParameters) {
/*    */     Intrinsics.checkNotNullParameter(tag, "tag");
/*    */     Intrinsics.checkNotNullParameter(model, "model");
/*    */     Intrinsics.checkNotNullParameter(promptPath, "promptPath");
/*    */     return new VelocityModelChatTaskTagDescriptor(tag, model, functions, promptPath, experimental, modelParameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelChatTaskTagDescriptor(tag=" + this.tag + ", model=" + this.model + ", functions=" + this.functions + ", promptPath=" + this.promptPath + ", experimental=" + this.experimental + ", modelParameters=" + this.modelParameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tag.hashCode();
/*    */     result = result * 31 + this.model.hashCode();
/*    */     result = result * 31 + ((this.functions == null) ? 0 : this.functions.hashCode());
/*    */     result = result * 31 + this.promptPath.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.experimental);
/*    */     return result * 31 + ((this.modelParameters == null) ? 0 : this.modelParameters.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelChatTaskTagDescriptor))
/*    */       return false; 
/*    */     VelocityModelChatTaskTagDescriptor velocityModelChatTaskTagDescriptor = (VelocityModelChatTaskTagDescriptor)other;
/*    */     return !Intrinsics.areEqual(this.tag, velocityModelChatTaskTagDescriptor.tag) ? false : (!Intrinsics.areEqual(this.model, velocityModelChatTaskTagDescriptor.model) ? false : (!Intrinsics.areEqual(this.functions, velocityModelChatTaskTagDescriptor.functions) ? false : (!Intrinsics.areEqual(this.promptPath, velocityModelChatTaskTagDescriptor.promptPath) ? false : ((this.experimental != velocityModelChatTaskTagDescriptor.experimental) ? false : (!!Intrinsics.areEqual(this.modelParameters, velocityModelChatTaskTagDescriptor.modelParameters))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelChatTaskTagDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */