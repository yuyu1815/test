/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\020\016\n\002\b\005\030\0002\b\022\004\022\0020\0020\001B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Failure;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "ej-core"})
/*    */ public final class Failure
/*    */   extends AgentResult
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/*    */   public Failure(@NotNull String text) {
/* 41 */     super(null); this.text = text; } @NotNull public final String getText() { return this.text; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentResult$Failure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */