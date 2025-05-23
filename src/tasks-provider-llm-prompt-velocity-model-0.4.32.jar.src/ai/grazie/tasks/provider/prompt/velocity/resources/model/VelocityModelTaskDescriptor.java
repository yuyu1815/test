/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\033\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BQ\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\006\020\006\032\0020\003\022\b\b\002\020\007\032\0020\b\022\n\b\002\020\t\032\004\030\0010\n\022\b\b\002\020\013\032\0020\b\022\n\b\002\020\f\032\004\030\0010\003¢\006\004\b\r\020\016J\t\020\034\032\0020\003HÆ\003J\017\020\035\032\b\022\004\022\0020\0030\005HÆ\003J\t\020\036\032\0020\003HÆ\003J\t\020\037\032\0020\bHÆ\003J\013\020 \032\004\030\0010\nHÆ\003J\t\020!\032\0020\bHÆ\003J\013\020\"\032\004\030\0010\003HÆ\003JY\020#\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\b2\n\b\002\020\t\032\004\030\0010\n2\b\b\002\020\013\032\0020\b2\n\b\002\020\f\032\004\030\0010\003HÆ\001J\023\020$\032\0020\b2\b\020%\032\004\030\0010&HÖ\003J\t\020'\032\0020(HÖ\001J\t\020)\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\004\032\b\022\004\022\0020\0030\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\006\032\0020\003X\004¢\006\b\n\000\032\004\b\023\020\020R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\024\020\025R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\026\020\027R\034\020\013\032\0020\b8\026X\004¢\006\016\n\000\022\004\b\030\020\031\032\004\b\032\020\025R\026\020\f\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\033\020\020¨\006*"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskDescriptor;", "name", "", "tagPriorities", "", "description", "experimental", "", "inChatTaskBehavior", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;", "deprecated", "deprecationMessage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;ZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTagPriorities", "()Ljava/util/List;", "getDescription", "getExperimental", "()Z", "getInChatTaskBehavior", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;", "getDeprecated$annotations", "()V", "getDeprecated", "getDeprecationMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelTaskDescriptor implements VelocityModelBaseTaskDescriptor { @NotNull
/*    */   private final String name; @NotNull
/*    */   private final List<String> tagPriorities; @NotNull
/*    */   private final String description;
/*  7 */   public VelocityModelTaskDescriptor(@NotNull String name, @NotNull List<String> tagPriorities, @NotNull String description, boolean experimental, @Nullable VelocityModelInChatTaskBehavior inChatTaskBehavior, boolean deprecated, @Nullable String deprecationMessage) { this.name = name;
/*  8 */     this.tagPriorities = tagPriorities;
/*  9 */     this.description = description;
/* 10 */     this.experimental = experimental;
/* 11 */     this.inChatTaskBehavior = inChatTaskBehavior;
/* 12 */     this.deprecated = deprecated;
/*    */     
/* 14 */     this.deprecationMessage = deprecationMessage; } private final boolean experimental; @Nullable private final VelocityModelInChatTaskBehavior inChatTaskBehavior; private final boolean deprecated; @Nullable private final String deprecationMessage; @NotNull public String getName() { return this.name; } @NotNull public List<String> getTagPriorities() { return this.tagPriorities; } @NotNull public String getDescription() { return this.description; } @Nullable public String getDeprecationMessage() { return this.deprecationMessage; }
/*    */ 
/*    */   
/*    */   public boolean getExperimental() {
/*    */     return this.experimental;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelInChatTaskBehavior getInChatTaskBehavior() {
/*    */     return this.inChatTaskBehavior;
/*    */   }
/*    */   
/*    */   public boolean getDeprecated() {
/*    */     return this.deprecated;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.tagPriorities;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.experimental;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final VelocityModelInChatTaskBehavior component5() {
/*    */     return this.inChatTaskBehavior;
/*    */   }
/*    */   
/*    */   public final boolean component6() {
/*    */     return this.deprecated;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.deprecationMessage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelTaskDescriptor copy(@NotNull String name, @NotNull List<String> tagPriorities, @NotNull String description, boolean experimental, @Nullable VelocityModelInChatTaskBehavior inChatTaskBehavior, boolean deprecated, @Nullable String deprecationMessage) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(tagPriorities, "tagPriorities");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new VelocityModelTaskDescriptor(name, tagPriorities, description, experimental, inChatTaskBehavior, deprecated, deprecationMessage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelTaskDescriptor(name=" + this.name + ", tagPriorities=" + this.tagPriorities + ", description=" + this.description + ", experimental=" + this.experimental + ", inChatTaskBehavior=" + this.inChatTaskBehavior + ", deprecated=" + this.deprecated + ", deprecationMessage=" + this.deprecationMessage + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.tagPriorities.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.experimental);
/*    */     result = result * 31 + ((this.inChatTaskBehavior == null) ? 0 : this.inChatTaskBehavior.hashCode());
/*    */     result = result * 31 + Boolean.hashCode(this.deprecated);
/*    */     return result * 31 + ((this.deprecationMessage == null) ? 0 : this.deprecationMessage.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelTaskDescriptor))
/*    */       return false; 
/*    */     VelocityModelTaskDescriptor velocityModelTaskDescriptor = (VelocityModelTaskDescriptor)other;
/*    */     return !Intrinsics.areEqual(this.name, velocityModelTaskDescriptor.name) ? false : (!Intrinsics.areEqual(this.tagPriorities, velocityModelTaskDescriptor.tagPriorities) ? false : (!Intrinsics.areEqual(this.description, velocityModelTaskDescriptor.description) ? false : ((this.experimental != velocityModelTaskDescriptor.experimental) ? false : (!Intrinsics.areEqual(this.inChatTaskBehavior, velocityModelTaskDescriptor.inChatTaskBehavior) ? false : ((this.deprecated != velocityModelTaskDescriptor.deprecated) ? false : (!!Intrinsics.areEqual(this.deprecationMessage, velocityModelTaskDescriptor.deprecationMessage)))))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelTaskDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */