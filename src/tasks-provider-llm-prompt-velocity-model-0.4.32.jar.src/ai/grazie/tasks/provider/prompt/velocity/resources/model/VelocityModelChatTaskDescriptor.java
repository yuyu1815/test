/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\032\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001BW\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\006\020\006\032\0020\003\022\020\b\002\020\007\032\n\022\004\022\0020\003\030\0010\005\022\b\b\002\020\b\032\0020\t\022\b\b\002\020\n\032\0020\t\022\n\b\002\020\013\032\004\030\0010\003¢\006\004\b\f\020\rJ\t\020\032\032\0020\003HÆ\003J\017\020\033\032\b\022\004\022\0020\0030\005HÆ\003J\t\020\034\032\0020\003HÆ\003J\021\020\035\032\n\022\004\022\0020\003\030\0010\005HÆ\003J\t\020\036\032\0020\tHÆ\003J\t\020\037\032\0020\tHÆ\003J\013\020 \032\004\030\0010\003HÆ\003J_\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\b\b\002\020\006\032\0020\0032\020\b\002\020\007\032\n\022\004\022\0020\003\030\0010\0052\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\t2\n\b\002\020\013\032\004\030\0010\003HÆ\001J\023\020\"\032\0020\t2\b\020#\032\004\030\0010$HÖ\003J\t\020%\032\0020&HÖ\001J\t\020'\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\016\020\017R\032\020\004\032\b\022\004\022\0020\0030\005X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\006\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\017R\031\020\007\032\n\022\004\022\0020\003\030\0010\005¢\006\b\n\000\032\004\b\023\020\021R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\024\020\025R\034\020\n\032\0020\t8\026X\004¢\006\016\n\000\022\004\b\026\020\027\032\004\b\030\020\025R\026\020\013\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\031\020\017¨\006("}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChatTaskDescriptor;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskDescriptor;", "name", "", "tagPriorities", "", "description", "functions", "experimental", "", "deprecated", "deprecationMessage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTagPriorities", "()Ljava/util/List;", "getDescription", "getFunctions", "getExperimental", "()Z", "getDeprecated$annotations", "()V", "getDeprecated", "getDeprecationMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelChatTaskDescriptor implements VelocityModelBaseTaskDescriptor { @NotNull
/*    */   private final String name; @NotNull
/*    */   private final List<String> tagPriorities; @NotNull
/*    */   private final String description;
/*    */   
/*  8 */   public VelocityModelChatTaskDescriptor(@NotNull String name, @NotNull List<String> tagPriorities, @NotNull String description, @Nullable List<String> functions, boolean experimental, boolean deprecated, @Nullable String deprecationMessage) { this.name = name;
/*  9 */     this.tagPriorities = tagPriorities;
/* 10 */     this.description = description;
/* 11 */     this.functions = functions;
/* 12 */     this.experimental = experimental;
/* 13 */     this.deprecated = deprecated;
/*    */     
/* 15 */     this.deprecationMessage = deprecationMessage; } @Nullable private final List<String> functions; private final boolean experimental; private final boolean deprecated; @Nullable private final String deprecationMessage; @NotNull public String getName() { return this.name; } @Nullable public String getDeprecationMessage() { return this.deprecationMessage; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public List<String> getTagPriorities() {
/*    */     return this.tagPriorities;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> getFunctions() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   public boolean getExperimental() {
/*    */     return this.experimental;
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
/*    */   @Nullable
/*    */   public final List<String> component4() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.experimental;
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
/*    */   public final VelocityModelChatTaskDescriptor copy(@NotNull String name, @NotNull List<String> tagPriorities, @NotNull String description, @Nullable List<String> functions, boolean experimental, boolean deprecated, @Nullable String deprecationMessage) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(tagPriorities, "tagPriorities");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new VelocityModelChatTaskDescriptor(name, tagPriorities, description, functions, experimental, deprecated, deprecationMessage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelChatTaskDescriptor(name=" + this.name + ", tagPriorities=" + this.tagPriorities + ", description=" + this.description + ", functions=" + this.functions + ", experimental=" + this.experimental + ", deprecated=" + this.deprecated + ", deprecationMessage=" + this.deprecationMessage + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.tagPriorities.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     result = result * 31 + ((this.functions == null) ? 0 : this.functions.hashCode());
/*    */     result = result * 31 + Boolean.hashCode(this.experimental);
/*    */     result = result * 31 + Boolean.hashCode(this.deprecated);
/*    */     return result * 31 + ((this.deprecationMessage == null) ? 0 : this.deprecationMessage.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelChatTaskDescriptor))
/*    */       return false; 
/*    */     VelocityModelChatTaskDescriptor velocityModelChatTaskDescriptor = (VelocityModelChatTaskDescriptor)other;
/*    */     return !Intrinsics.areEqual(this.name, velocityModelChatTaskDescriptor.name) ? false : (!Intrinsics.areEqual(this.tagPriorities, velocityModelChatTaskDescriptor.tagPriorities) ? false : (!Intrinsics.areEqual(this.description, velocityModelChatTaskDescriptor.description) ? false : (!Intrinsics.areEqual(this.functions, velocityModelChatTaskDescriptor.functions) ? false : ((this.experimental != velocityModelChatTaskDescriptor.experimental) ? false : ((this.deprecated != velocityModelChatTaskDescriptor.deprecated) ? false : (!!Intrinsics.areEqual(this.deprecationMessage, velocityModelChatTaskDescriptor.deprecationMessage)))))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelChatTaskDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */