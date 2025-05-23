/*    */ package com.intellij.ml.llm.matterhorn.llm;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\t\b\002\030\0002\b\022\004\022\0020\0000\001B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;", "", "typeName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeName", "()Ljava/lang/String;", "INTEGER", "STRING", "BOOLEAN", "INTEGER_ARRAY", "core"})
/*    */ public enum ArgumentType
/*    */ {
/* 30 */   INTEGER("integer"),
/* 31 */   STRING("string"),
/* 32 */   BOOLEAN("bool"),
/*    */ 
/*    */ 
/*    */   
/* 36 */   INTEGER_ARRAY("integer[]"); @NotNull
/* 37 */   public static EnumEntries<ArgumentType> getEntries() { return $ENTRIES; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private final String typeName;
/*    */   
/*    */   ArgumentType(String typeName) {
/*    */     this.typeName = typeName;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getTypeName() {
/*    */     return this.typeName;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\ArgumentType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */