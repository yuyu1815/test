/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @JsonDeserialize(using = VelocityModelMessageDeserializer.class)
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\004\b\t\n\013B\t\b\004¢\006\004\b\002\020\003R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007\001\004\f\r\016\017¨\006\020"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "", "<init>", "()V", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "User", "Assistant", "System", "FunctionResponse", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$Assistant;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$FunctionResponse;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$System;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$User;", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public abstract class VelocityModelMessage {
/*    */   private VelocityModelMessage() {}
/*    */   
/*    */   @NotNull
/*    */   public abstract VelocityModelMessageContent getContent();
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$User;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;)V", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */   public static final class User extends VelocityModelMessage { @NotNull
/*    */     private final VelocityModelMessageContent content;
/*    */     
/* 17 */     public User(@NotNull VelocityModelMessageContent content) { super(null); this.content = content; } @NotNull public VelocityModelMessageContent getContent() { return this.content; } @NotNull public final VelocityModelMessageContent component1() { return this.content; } @NotNull public final User copy(@NotNull VelocityModelMessageContent content) { Intrinsics.checkNotNullParameter(content, "content"); return new User(content); } @NotNull public String toString() { return "User(content=" + this.content + ")"; } public int hashCode() { return this.content.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof User)) return false;  User user = (User)other; return !!Intrinsics.areEqual(this.content, user.content); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$Assistant;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;)V", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"}) public static final class Assistant extends VelocityModelMessage { @NotNull private final VelocityModelMessageContent content;
/* 18 */     public Assistant(@NotNull VelocityModelMessageContent content) { super(null); this.content = content; } @NotNull public VelocityModelMessageContent getContent() { return this.content; } @NotNull public final VelocityModelMessageContent component1() { return this.content; } @NotNull public final Assistant copy(@NotNull VelocityModelMessageContent content) { Intrinsics.checkNotNullParameter(content, "content"); return new Assistant(content); } @NotNull public String toString() { return "Assistant(content=" + this.content + ")"; } public int hashCode() { return this.content.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Assistant)) return false;  Assistant assistant = (Assistant)other; return !!Intrinsics.areEqual(this.content, assistant.content); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\022"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$System;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "(Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;)V", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"}) public static final class System extends VelocityModelMessage { @NotNull private final VelocityModelMessageContent content;
/* 19 */     public System(@NotNull VelocityModelMessageContent content) { super(null); this.content = content; } @NotNull public VelocityModelMessageContent getContent() { return this.content; } @NotNull public final VelocityModelMessageContent component1() { return this.content; } @NotNull public final System copy(@NotNull VelocityModelMessageContent content) { Intrinsics.checkNotNullParameter(content, "content"); return new System(content); } @NotNull public String toString() { return "System(content=" + this.content + ")"; } public int hashCode() { return this.content.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof System)) return false;  System system = (System)other; return !!Intrinsics.areEqual(this.content, system.content); } }
/* 20 */    @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage$FunctionResponse;", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "functionName", "", "content", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "<init>", "(Ljava/lang/String;Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;)V", "getFunctionName", "()Ljava/lang/String;", "getContent", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessageContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"}) public static final class FunctionResponse extends VelocityModelMessage { @NotNull private final String functionName; public FunctionResponse(@NotNull String functionName, @NotNull VelocityModelMessageContent content) { super(null); this.functionName = functionName; this.content = content; } @NotNull private final VelocityModelMessageContent content; @NotNull public final String getFunctionName() { return this.functionName; } @NotNull public VelocityModelMessageContent getContent() { return this.content; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.functionName;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final VelocityModelMessageContent component2() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final FunctionResponse copy(@NotNull String functionName, @NotNull VelocityModelMessageContent content) {
/*    */       Intrinsics.checkNotNullParameter(functionName, "functionName");
/*    */       Intrinsics.checkNotNullParameter(content, "content");
/*    */       return new FunctionResponse(functionName, content);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "FunctionResponse(functionName=" + this.functionName + ", content=" + this.content + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.functionName.hashCode();
/*    */       return result * 31 + this.content.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof FunctionResponse))
/*    */         return false; 
/*    */       FunctionResponse functionResponse = (FunctionResponse)other;
/*    */       return !Intrinsics.areEqual(this.functionName, functionResponse.functionName) ? false : (!!Intrinsics.areEqual(this.content, functionResponse.content));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */