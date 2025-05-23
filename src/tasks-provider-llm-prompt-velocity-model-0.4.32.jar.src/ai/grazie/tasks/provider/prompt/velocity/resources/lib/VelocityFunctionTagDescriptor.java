/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\013\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\b\020\n\032\0020\003H\026J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\003HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunctionTagDescriptor;", "", "functionName", "", "tagName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFunctionName", "()Ljava/lang/String;", "getTagName", "toString", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityFunctionTagDescriptor {
/*    */   @NotNull
/*    */   private final String functionName;
/*    */   
/* 10 */   public VelocityFunctionTagDescriptor(@NotNull String functionName, @NotNull String tagName) { this.functionName = functionName; this.tagName = tagName; } @NotNull private final String tagName; @NotNull public final String getFunctionName() { return this.functionName; } @NotNull public final String getTagName() { return this.tagName; } @NotNull
/* 11 */   public String toString() { return this.functionName + ":" + this.functionName; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.functionName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.tagName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityFunctionTagDescriptor copy(@NotNull String functionName, @NotNull String tagName) {
/*    */     Intrinsics.checkNotNullParameter(functionName, "functionName");
/*    */     Intrinsics.checkNotNullParameter(tagName, "tagName");
/*    */     return new VelocityFunctionTagDescriptor(functionName, tagName);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.functionName.hashCode();
/*    */     return result * 31 + this.tagName.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityFunctionTagDescriptor))
/*    */       return false; 
/*    */     VelocityFunctionTagDescriptor velocityFunctionTagDescriptor = (VelocityFunctionTagDescriptor)other;
/*    */     return !Intrinsics.areEqual(this.functionName, velocityFunctionTagDescriptor.functionName) ? false : (!!Intrinsics.areEqual(this.tagName, velocityFunctionTagDescriptor.tagName));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityFunctionTagDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */