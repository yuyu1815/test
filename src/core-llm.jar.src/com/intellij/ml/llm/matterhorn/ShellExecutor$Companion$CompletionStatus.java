/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;", "", "agentMessage", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAgentMessage", "()Ljava/lang/String;", "COMPLETED", "SUSPENDED", "TIMED_OUT", "LINE_LIMIT_EXCEEDED", "core"})
/*    */ public enum CompletionStatus
/*    */ {
/* 72 */   COMPLETED(""),
/* 73 */   SUSPENDED("EXECUTION TIMED OUT AND SUSPENDED"),
/* 74 */   TIMED_OUT("EXECUTION TIMED OUT"),
/* 75 */   LINE_LIMIT_EXCEEDED("LINE LIMIT EXCEEDED"); @NotNull
/* 76 */   public static EnumEntries<CompletionStatus> getEntries() { return $ENTRIES; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final String agentMessage;
/*    */   
/*    */   CompletionStatus(String agentMessage) {
/*    */     this.agentMessage = agentMessage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getAgentMessage() {
/*    */     return this.agentMessage;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ShellExecutor$Companion$CompletionStatus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */