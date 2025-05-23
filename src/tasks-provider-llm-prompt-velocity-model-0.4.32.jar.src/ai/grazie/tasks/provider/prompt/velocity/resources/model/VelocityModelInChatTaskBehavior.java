/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\002\n\002\020 \n\002\020\016\n\002\b\016\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\006¢\006\004\b\b\020\tJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\003HÆ\003J\021\020\021\032\n\022\004\022\0020\007\030\0010\006HÆ\003J/\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\020\b\002\020\005\032\n\022\004\022\0020\007\030\0010\006HÆ\001J\023\020\023\032\0020\0032\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\026HÖ\001J\t\020\027\032\0020\007HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\f\020\013R\031\020\005\032\n\022\004\022\0020\007\030\0010\006¢\006\b\n\000\032\004\b\r\020\016¨\006\030"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelInChatTaskBehavior;", "", "dropChatTaskPrompt", "", "dropChatHistory", "functions", "", "", "<init>", "(ZZLjava/util/List;)V", "getDropChatTaskPrompt", "()Z", "getDropChatHistory", "getFunctions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "tasks-provider-llm-prompt-velocity-model"})
/*    */ public final class VelocityModelInChatTaskBehavior
/*    */ {
/*    */   private final boolean dropChatTaskPrompt;
/*    */   private final boolean dropChatHistory;
/*    */   @Nullable
/*    */   private final List<String> functions;
/*    */   
/*    */   public VelocityModelInChatTaskBehavior(boolean dropChatTaskPrompt, boolean dropChatHistory, @Nullable List<String> functions) {
/* 23 */     this.dropChatTaskPrompt = dropChatTaskPrompt;
/* 24 */     this.dropChatHistory = dropChatHistory;
/* 25 */     this.functions = functions; } @Nullable public final List<String> getFunctions() { return this.functions; }
/*    */ 
/*    */   
/*    */   public final boolean getDropChatTaskPrompt() {
/*    */     return this.dropChatTaskPrompt;
/*    */   }
/*    */   
/*    */   public final boolean getDropChatHistory() {
/*    */     return this.dropChatHistory;
/*    */   }
/*    */   
/*    */   public final boolean component1() {
/*    */     return this.dropChatTaskPrompt;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.dropChatHistory;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component3() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VelocityModelInChatTaskBehavior copy(boolean dropChatTaskPrompt, boolean dropChatHistory, @Nullable List<String> functions) {
/*    */     return new VelocityModelInChatTaskBehavior(dropChatTaskPrompt, dropChatHistory, functions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VelocityModelInChatTaskBehavior(dropChatTaskPrompt=" + this.dropChatTaskPrompt + ", dropChatHistory=" + this.dropChatHistory + ", functions=" + this.functions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Boolean.hashCode(this.dropChatTaskPrompt);
/*    */     result = result * 31 + Boolean.hashCode(this.dropChatHistory);
/*    */     return result * 31 + ((this.functions == null) ? 0 : this.functions.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VelocityModelInChatTaskBehavior))
/*    */       return false; 
/*    */     VelocityModelInChatTaskBehavior velocityModelInChatTaskBehavior = (VelocityModelInChatTaskBehavior)other;
/*    */     return (this.dropChatTaskPrompt != velocityModelInChatTaskBehavior.dropChatTaskPrompt) ? false : ((this.dropChatHistory != velocityModelInChatTaskBehavior.dropChatHistory) ? false : (!!Intrinsics.areEqual(this.functions, velocityModelInChatTaskBehavior.functions)));
/*    */   }
/*    */   
/*    */   public VelocityModelInChatTaskBehavior() {
/*    */     this(false, false, null, 7, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelInChatTaskBehavior.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */