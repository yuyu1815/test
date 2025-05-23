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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\000*\b\b\000\020\001*\0020\0022\0020\003B\017\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\n\032\0020\005HÆ\003J\031\020\013\032\b\022\004\022\0028\0000\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\003HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\005HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\t¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "T", "Lcom/intellij/ml/llm/matterhorn/CustomContext;", "", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "core"})
/*    */ public final class ExecutionContextUserDataKey<T extends CustomContext>
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/*    */   public ExecutionContextUserDataKey(@NotNull String name) {
/* 31 */     this.name = name; } @NotNull public final String getName() { return this.name; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ExecutionContextUserDataKey<T> copy(@NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new ExecutionContextUserDataKey(name);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ExecutionContextUserDataKey(name=" + this.name + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.name.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ExecutionContextUserDataKey))
/*    */       return false; 
/*    */     ExecutionContextUserDataKey executionContextUserDataKey = (ExecutionContextUserDataKey)other;
/*    */     return !!Intrinsics.areEqual(this.name, executionContextUserDataKey.name);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContextUserDataKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */