/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "path", "", "testMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getTestMethod", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"})
/*    */ public final class SingleTest
/*    */   extends ActionLocationsExtractor.Query
/*    */ {
/*    */   @NotNull
/*    */   private final String path;
/*    */   @NotNull
/*    */   private final String testMethod;
/*    */   
/*    */   public SingleTest(@NotNull String path, @NotNull String testMethod) {
/* 35 */     super(null); this.path = path; this.testMethod = testMethod; } @NotNull public final String getPath() { return this.path; } @NotNull public final String getTestMethod() { return this.testMethod; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.path;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.testMethod;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SingleTest copy(@NotNull String path, @NotNull String testMethod) {
/*    */     Intrinsics.checkNotNullParameter(path, "path");
/*    */     Intrinsics.checkNotNullParameter(testMethod, "testMethod");
/*    */     return new SingleTest(path, testMethod);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SingleTest(path=" + this.path + ", testMethod=" + this.testMethod + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.path.hashCode();
/*    */     return result * 31 + this.testMethod.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SingleTest))
/*    */       return false; 
/*    */     SingleTest singleTest = (SingleTest)other;
/*    */     return !Intrinsics.areEqual(this.path, singleTest.path) ? false : (!!Intrinsics.areEqual(this.testMethod, singleTest.testMethod));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\ActionLocationsExtractor$Query$SingleTest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */