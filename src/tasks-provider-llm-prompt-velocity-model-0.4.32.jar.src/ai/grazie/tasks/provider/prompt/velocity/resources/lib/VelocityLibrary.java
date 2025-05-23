/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B;\022\026\020\002\032\022\022\004\022\0020\004\022\004\022\0020\0050\003j\002`\006\022\f\020\007\032\b\022\004\022\0020\t0\b\022\f\020\n\032\b\022\004\022\0020\0130\b¢\006\004\b\f\020\rJ\031\020\023\032\022\022\004\022\0020\004\022\004\022\0020\0050\003j\002`\006HÆ\003J\017\020\024\032\b\022\004\022\0020\t0\bHÆ\003J\017\020\025\032\b\022\004\022\0020\0130\bHÆ\003JC\020\026\032\0020\0002\030\b\002\020\002\032\022\022\004\022\0020\004\022\004\022\0020\0050\003j\002`\0062\016\b\002\020\007\032\b\022\004\022\0020\t0\b2\016\b\002\020\n\032\b\022\004\022\0020\0130\bHÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\004HÖ\001R!\020\002\032\022\022\004\022\0020\004\022\004\022\0020\0050\003j\002`\006¢\006\b\n\000\032\004\b\016\020\017R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\020\020\021R\027\020\n\032\b\022\004\022\0020\0130\b¢\006\b\n\000\032\004\b\022\020\021¨\006\035"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityLibrary;", "", "functions", "", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctions;", "tasks", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask;", "chatTasks", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask;", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "getFunctions", "()Ljava/util/Map;", "getTasks", "()Ljava/util/List;", "getChatTasks", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityLibrary {
/*    */   @NotNull
/*    */   private final Map<String, VelocityFunction> functions;
/*    */   
/*  8 */   public VelocityLibrary(@NotNull Map<String, VelocityFunction> functions, @NotNull List<VelocityTask> tasks, @NotNull List<VelocityChatTask> chatTasks) { this.functions = functions;
/*  9 */     this.tasks = tasks;
/* 10 */     this.chatTasks = chatTasks; } @NotNull private final List<VelocityTask> tasks; @NotNull private final List<VelocityChatTask> chatTasks; @NotNull public final Map<String, VelocityFunction> getFunctions() { return this.functions; } @NotNull public final List<VelocityChatTask> getChatTasks() { return this.chatTasks; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<VelocityTask> getTasks() {
/*    */     return this.tasks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, VelocityFunction> component1() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<VelocityTask> component2() {
/*    */     return this.tasks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<VelocityChatTask> component3() {
/*    */     return this.chatTasks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityLibrary copy(@NotNull Map<String, VelocityFunction> functions, @NotNull List<VelocityTask> tasks, @NotNull List<VelocityChatTask> chatTasks) {
/*    */     Intrinsics.checkNotNullParameter(functions, "functions");
/*    */     Intrinsics.checkNotNullParameter(tasks, "tasks");
/*    */     Intrinsics.checkNotNullParameter(chatTasks, "chatTasks");
/*    */     return new VelocityLibrary(functions, tasks, chatTasks);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityLibrary(functions=" + this.functions + ", tasks=" + this.tasks + ", chatTasks=" + this.chatTasks + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.functions.hashCode();
/*    */     result = result * 31 + this.tasks.hashCode();
/*    */     return result * 31 + this.chatTasks.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityLibrary))
/*    */       return false; 
/*    */     VelocityLibrary velocityLibrary = (VelocityLibrary)other;
/*    */     return !Intrinsics.areEqual(this.functions, velocityLibrary.functions) ? false : (!Intrinsics.areEqual(this.tasks, velocityLibrary.tasks) ? false : (!!Intrinsics.areEqual(this.chatTasks, velocityLibrary.chatTasks)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityLibrary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */