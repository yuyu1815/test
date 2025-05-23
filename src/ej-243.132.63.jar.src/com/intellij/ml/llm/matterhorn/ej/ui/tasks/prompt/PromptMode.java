/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\007\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "", "displayText", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayText", "()Ljava/lang/String;", "Chat", "Agent", "ej-ui"})
/*    */ public enum PromptMode
/*    */ {
/* 21 */   Chat("Ask"), Agent("Code"); @NotNull
/* 22 */   public static EnumEntries<PromptMode> getEntries() { return $ENTRIES; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final String displayText;
/*    */   
/*    */   PromptMode(String displayText) {
/*    */     this.displayText = displayText;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplayText() {
/*    */     return this.displayText;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptMode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */