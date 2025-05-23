/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\000*\006\b\000\020\001 \0012\0020\002:\002\005\006B\t\b\004¢\006\004\b\003\020\004\001\002\007\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "T", "", "<init>", "()V", "Success", "Failure", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Failure;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Success;", "ej-core"})
/*    */ public abstract class AgentResult<T>
/*    */ {
/*    */   private AgentResult() {}
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\030\002\n\002\b\007\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\017\022\006\020\003\032\0028\001¢\006\004\b\004\020\005R\023\020\003\032\0028\001¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Success;", "T", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "ej-core"})
/*    */   public static final class Success<T>
/*    */     extends AgentResult<T>
/*    */   {
/*    */     private final T value;
/*    */     
/*    */     public Success(Object value) {
/* 40 */       super(null); this.value = (T)value; } public final T getValue() { return this.value; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\020\001\n\000\n\002\020\016\n\002\b\005\030\0002\b\022\004\022\0020\0020\001B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult$Failure;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/AgentResult;", "", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "ej-core"})
/* 41 */   public static final class Failure extends AgentResult { public Failure(@NotNull String text) { super(null); this.text = text; } @NotNull private final String text; @NotNull public final String getText() { return this.text; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\AgentResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */