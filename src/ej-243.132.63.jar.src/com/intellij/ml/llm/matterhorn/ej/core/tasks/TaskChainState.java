/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\002\b\013\n\002\020\013\n\000\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003J\006\020\f\032\0020\rj\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "", "<init>", "(Ljava/lang/String;I)V", "Running", "WaitingUserInput", "WaitingSmartMode", "Finished", "Stopped", "Declined", "Done", "Failed", "isTerminal", "", "ej-core"})
/*    */ public enum TaskChainState
/*    */ {
/* 83 */   Running,
/* 84 */   WaitingUserInput,
/* 85 */   WaitingSmartMode,
/*    */ 
/*    */   
/* 88 */   Finished,
/* 89 */   Stopped,
/* 90 */   Declined,
/* 91 */   Done,
/* 92 */   Failed;
/*    */   
/* 94 */   public final boolean isTerminal() { return (this == Stopped || this == Failed || this == Declined || this == Finished || this == Done); } @NotNull
/* 95 */   public static EnumEntries<TaskChainState> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TaskChainState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */