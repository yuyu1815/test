/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\t\n\002\020\016\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\0002\b\022\004\022\0020\0020\001:\001\"B%\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0020\0020\006\022\006\020\007\032\0020\b¢\006\004\b\t\020\nJ\t\020\027\032\0020\004HÆ\003J\017\020\030\032\b\022\004\022\0020\0020\006HÆ\003J\t\020\031\032\0020\bHÆ\003J-\020\032\032\0020\0002\b\b\002\020\003\032\0020\0042\016\b\002\020\005\032\b\022\004\022\0020\0020\0062\b\b\002\020\007\032\0020\bHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\036HÖ\003J\t\020\037\032\0020 HÖ\001J\t\020!\032\0020\022HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\013\020\fR\032\020\005\032\b\022\004\022\0020\0020\006X\004¢\006\b\n\000\032\004\b\r\020\016R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\017\020\020R\024\020\021\032\0020\0228VX\004¢\006\006\032\004\b\023\020\024R\032\020\025\032\b\022\004\022\0020\0220\0068VX\004¢\006\006\032\004\b\026\020\016¨\006#"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask$Tag;", "descriptor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;", "tagPriorities", "", "parameters", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;Ljava/util/List;Lcom/fasterxml/jackson/databind/JsonNode;)V", "getDescriptor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskDescriptor;", "getTagPriorities", "()Ljava/util/List;", "getParameters", "()Lcom/fasterxml/jackson/databind/JsonNode;", "entityName", "", "getEntityName", "()Ljava/lang/String;", "registeredTags", "getRegisteredTags", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Tag", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityTask implements TaggedEntity<VelocityTask.Tag> {
/*    */   @NotNull
/*    */   private final VelocityModelTaskDescriptor descriptor;
/*    */   @NotNull
/*    */   private final List<Tag> tagPriorities;
/*    */   @NotNull
/*    */   private final JsonNode parameters;
/*    */   
/* 14 */   public VelocityTask(@NotNull VelocityModelTaskDescriptor descriptor, @NotNull List<Tag> tagPriorities, @NotNull JsonNode parameters) { this.descriptor = descriptor;
/* 15 */     this.tagPriorities = tagPriorities;
/* 16 */     this.parameters = parameters; } @NotNull public final VelocityModelTaskDescriptor getDescriptor() { return this.descriptor; } @NotNull public List<Tag> getTagPriorities() { return this.tagPriorities; } @NotNull public final JsonNode getParameters() { return this.parameters; } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\005HÆ\003J\035\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\030HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\rHÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\r8VX\004¢\006\006\032\004\b\016\020\017R\024\020\020\032\0020\r8VX\004¢\006\006\032\004\b\021\020\017¨\006\034"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask$Tag;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "descriptor", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "promptPath", "Ljava/nio/file/Path;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;Ljava/nio/file/Path;)V", "getDescriptor", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelTaskTagDescriptor;", "getPromptPath", "()Ljava/nio/file/Path;", "tagName", "", "getTagName", "()Ljava/lang/String;", "model", "getModel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */   public static final class Tag implements EntityTag { @NotNull
/*    */     private final VelocityModelTaskTagDescriptor descriptor; @NotNull
/*    */     private final Path promptPath;
/* 20 */     public Tag(@NotNull VelocityModelTaskTagDescriptor descriptor, @NotNull Path promptPath) { this.descriptor = descriptor;
/* 21 */       this.promptPath = promptPath; } @NotNull public final VelocityModelTaskTagDescriptor getDescriptor() { return this.descriptor; } @NotNull public final Path getPromptPath() { return this.promptPath; }
/*    */     
/*    */     @NotNull
/* 24 */     public String getTagName() { return this.descriptor.getTag(); }
/*    */     @NotNull public final VelocityModelTaskTagDescriptor component1() { return this.descriptor; }
/*    */     @NotNull public final Path component2() { return this.promptPath; }
/* 27 */     @NotNull public final Tag copy(@NotNull VelocityModelTaskTagDescriptor descriptor, @NotNull Path promptPath) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(promptPath, "promptPath"); return new Tag(descriptor, promptPath); } @NotNull public String getModel() { return this.descriptor.getModel(); }
/*    */     @NotNull public String toString() { return "Tag(descriptor=" + this.descriptor + ", promptPath=" + this.promptPath + ")"; }
/*    */     public int hashCode() { result = this.descriptor.hashCode(); return result * 31 + this.promptPath.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Tag))
/*    */         return false;  Tag tag = (Tag)other; return !Intrinsics.areEqual(this.descriptor, tag.descriptor) ? false : (!!Intrinsics.areEqual(this.promptPath, tag.promptPath)); } }
/* 31 */    @NotNull public String getEntityName() { return this.descriptor.getName(); } @NotNull
/*    */   public List<String> getRegisteredTags() {
/* 33 */     return this.descriptor.getTagPriorities();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelTaskDescriptor component1() {
/*    */     return this.descriptor;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Tag> component2() {
/*    */     return this.tagPriorities;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JsonNode component3() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityTask copy(@NotNull VelocityModelTaskDescriptor descriptor, @NotNull List<Tag> tagPriorities, @NotNull JsonNode parameters) {
/*    */     Intrinsics.checkNotNullParameter(descriptor, "descriptor");
/*    */     Intrinsics.checkNotNullParameter(tagPriorities, "tagPriorities");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new VelocityTask(descriptor, tagPriorities, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityTask(descriptor=" + this.descriptor + ", tagPriorities=" + this.tagPriorities + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.descriptor.hashCode();
/*    */     result = result * 31 + this.tagPriorities.hashCode();
/*    */     return result * 31 + this.parameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityTask))
/*    */       return false; 
/*    */     VelocityTask velocityTask = (VelocityTask)other;
/*    */     return !Intrinsics.areEqual(this.descriptor, velocityTask.descriptor) ? false : (!Intrinsics.areEqual(this.tagPriorities, velocityTask.tagPriorities) ? false : (!!Intrinsics.areEqual(this.parameters, velocityTask.parameters)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */