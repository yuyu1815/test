/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\r\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\016\032\0020\003HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\021\032\0020\0052\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\025HÖ\001J\t\020\026\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\0038VX\004¢\006\006\032\004\b\r\020\t¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$RunTestsAction;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "testsQuery", "", "testFileUnderAIIgnore", "", "<init>", "(Ljava/lang/String;Z)V", "getTestsQuery", "()Ljava/lang/String;", "getTestFileUnderAIIgnore", "()Z", "allowListActionName", "getAllowListActionName", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "core"})
/*    */ public final class RunTestsAction
/*    */   extends HumanInLoopAction
/*    */ {
/*    */   @NotNull
/*    */   private final String testsQuery;
/*    */   private final boolean testFileUnderAIIgnore;
/*    */   
/*    */   public RunTestsAction(@NotNull String testsQuery, boolean testFileUnderAIIgnore) {
/* 95 */     super(ActionType.RunTests, null); this.testsQuery = testsQuery; this.testFileUnderAIIgnore = testFileUnderAIIgnore; } @NotNull public final String getTestsQuery() { return this.testsQuery; } public final boolean getTestFileUnderAIIgnore() { return this.testFileUnderAIIgnore; } @NotNull
/*    */   public String getAllowListActionName() {
/* 97 */     return this.testsQuery;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.testsQuery;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.testFileUnderAIIgnore;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RunTestsAction copy(@NotNull String testsQuery, boolean testFileUnderAIIgnore) {
/*    */     Intrinsics.checkNotNullParameter(testsQuery, "testsQuery");
/*    */     return new RunTestsAction(testsQuery, testFileUnderAIIgnore);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RunTestsAction(testsQuery=" + this.testsQuery + ", testFileUnderAIIgnore=" + this.testFileUnderAIIgnore + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.testsQuery.hashCode();
/*    */     return result * 31 + Boolean.hashCode(this.testFileUnderAIIgnore);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RunTestsAction))
/*    */       return false; 
/*    */     RunTestsAction runTestsAction = (RunTestsAction)other;
/*    */     return !Intrinsics.areEqual(this.testsQuery, runTestsAction.testsQuery) ? false : (!(this.testFileUnderAIIgnore != runTestsAction.testFileUnderAIIgnore));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\HumanInLoopAction$RunTestsAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */