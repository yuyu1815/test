/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$FunctionResponse;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "functionName", "", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "(Ljava/lang/String;Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;)V", "getFunctionName", "()Ljava/lang/String;", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class FunctionResponse
/*    */   extends VelocityModelMessage
/*    */ {
/*    */   @NotNull
/*    */   private final String functionName;
/*    */   @NotNull
/*    */   private final VelocityModelMessageContent content;
/*    */   
/*    */   public FunctionResponse(@NotNull String functionName, @NotNull VelocityModelMessageContent content) {
/* 20 */     super(null); this.functionName = functionName; this.content = content; } @NotNull public final String getFunctionName() { return this.functionName; } @NotNull public VelocityModelMessageContent getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.functionName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelMessageContent component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FunctionResponse copy(@NotNull String functionName, @NotNull VelocityModelMessageContent content) {
/*    */     Intrinsics.checkNotNullParameter(functionName, "functionName");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new FunctionResponse(functionName, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FunctionResponse(functionName=" + this.functionName + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.functionName.hashCode();
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FunctionResponse))
/*    */       return false; 
/*    */     FunctionResponse functionResponse = (FunctionResponse)other;
/*    */     return !Intrinsics.areEqual(this.functionName, functionResponse.functionName) ? false : (!!Intrinsics.areEqual(this.content, functionResponse.content));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessage$FunctionResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */