/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\013\020\n\032\004\030\0010\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\037\020\f\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$ResultContent;", "", "title", "", "output", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getOutput", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */ public final class ResultContent
/*     */ {
/*     */   @Nullable
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final String output;
/*     */   
/*     */   public ResultContent(@Nullable String title, @NotNull String output) {
/* 226 */     this.title = title; this.output = output; } @Nullable public final String getTitle() { return this.title; } @NotNull public final String getOutput() { return this.output; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.output;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ResultContent copy(@Nullable String title, @NotNull String output) {
/*     */     Intrinsics.checkNotNullParameter(output, "output");
/*     */     return new ResultContent(title, output);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ResultContent(title=" + this.title + ", output=" + this.output + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.title == null) ? 0 : this.title.hashCode();
/*     */     return result * 31 + this.output.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ResultContent))
/*     */       return false; 
/*     */     ResultContent resultContent = (ResultContent)other;
/*     */     return !Intrinsics.areEqual(this.title, resultContent.title) ? false : (!!Intrinsics.areEqual(this.output, resultContent.output));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractIssueAgentWorker$ResultContent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */