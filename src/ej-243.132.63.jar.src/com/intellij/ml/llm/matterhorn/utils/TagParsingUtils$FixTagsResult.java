/*    */ package com.intellij.ml.llm.matterhorn.utils;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$FixTagsResult;", "", "content", "", "changed", "", "<init>", "(Ljava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getChanged", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core"})
/*    */ final class FixTagsResult
/*    */ {
/*    */   @NotNull
/*    */   private final String content;
/*    */   private final boolean changed;
/*    */   
/*    */   public FixTagsResult(@NotNull String content, boolean changed) {
/* 31 */     this.content = content;
/* 32 */     this.changed = changed; } public final boolean getChanged() { return this.changed; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.changed;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FixTagsResult copy(@NotNull String content, boolean changed) {
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new FixTagsResult(content, changed);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FixTagsResult(content=" + this.content + ", changed=" + this.changed + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.content.hashCode();
/*    */     return result * 31 + Boolean.hashCode(this.changed);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FixTagsResult))
/*    */       return false; 
/*    */     FixTagsResult fixTagsResult = (FixTagsResult)other;
/*    */     return !Intrinsics.areEqual(this.content, fixTagsResult.content) ? false : (!(this.changed != fixTagsResult.changed));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhor\\utils\TagParsingUtils$FixTagsResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */