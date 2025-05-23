/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0030\005\022\b\020\006\032\004\030\0010\003¢\006\004\b\007\020\bJ\t\020\016\032\0020\003HÆ\003J\017\020\017\032\b\022\004\022\0020\0030\005HÆ\003J\013\020\020\032\004\030\0010\003HÆ\003J/\020\021\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\n\b\002\020\006\032\004\030\0010\003HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\013\020\fR\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\r\020\n¨\006\030"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelFunction;", "", "name", "", "tagPriorities", "", "description", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getTagPriorities", "()Ljava/util/List;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelFunction {
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/* 10 */   public VelocityModelFunction(@NotNull String name, @NotNull List<String> tagPriorities, @Nullable String description) { this.name = name;
/* 11 */     this.tagPriorities = tagPriorities;
/* 12 */     this.description = description; } @NotNull private final List<String> tagPriorities; @Nullable private final String description; @Nullable public final String getDescription() { return this.description; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getTagPriorities() {
/*    */     return this.tagPriorities;
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
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelFunction copy(@NotNull String name, @NotNull List<String> tagPriorities, @Nullable String description) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(tagPriorities, "tagPriorities");
/*    */     return new VelocityModelFunction(name, tagPriorities, description);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelFunction(name=" + this.name + ", tagPriorities=" + this.tagPriorities + ", description=" + this.description + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.tagPriorities.hashCode();
/*    */     return result * 31 + ((this.description == null) ? 0 : this.description.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelFunction))
/*    */       return false; 
/*    */     VelocityModelFunction velocityModelFunction = (VelocityModelFunction)other;
/*    */     return !Intrinsics.areEqual(this.name, velocityModelFunction.name) ? false : (!Intrinsics.areEqual(this.tagPriorities, velocityModelFunction.tagPriorities) ? false : (!!Intrinsics.areEqual(this.description, velocityModelFunction.description)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelFunction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */