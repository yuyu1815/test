/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\017\020\t\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\n\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\001HÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\021HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\022"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelChat;", "", "messages", "", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelMessage;", "<init>", "(Ljava/util/List;)V", "getMessages", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelChat {
/*    */   @NotNull
/*    */   private final List<VelocityModelMessage> messages;
/*    */   
/* 11 */   public VelocityModelChat(@NotNull List<VelocityModelMessage> messages) { this.messages = messages; } @NotNull public final List<VelocityModelMessage> getMessages() { return this.messages; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<VelocityModelMessage> component1() {
/*    */     return this.messages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelChat copy(@NotNull List<? extends VelocityModelMessage> messages) {
/*    */     Intrinsics.checkNotNullParameter(messages, "messages");
/*    */     return new VelocityModelChat(messages);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelChat(messages=" + this.messages + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.messages.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelChat))
/*    */       return false; 
/*    */     VelocityModelChat velocityModelChat = (VelocityModelChat)other;
/*    */     return !!Intrinsics.areEqual(this.messages, velocityModelChat.messages);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */