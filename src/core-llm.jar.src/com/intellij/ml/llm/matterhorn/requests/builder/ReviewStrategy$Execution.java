/*    */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.enums.EnumEntries;
/*    */ import kotlin.enums.EnumEntriesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;", "", "<init>", "(Ljava/lang/String;I)V", "EVERY_TIME", "UNTIL_SUCCESS", "core"})
/*    */ public enum Execution
/*    */ {
/* 12 */   EVERY_TIME,
/* 13 */   UNTIL_SUCCESS; @NotNull
/* 14 */   public static EnumEntries<Execution> getEntries() { return $ENTRIES; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\ReviewStrategy$Execution.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */