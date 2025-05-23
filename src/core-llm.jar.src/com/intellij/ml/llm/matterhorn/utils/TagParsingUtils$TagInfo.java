/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020!\n\002\b\021\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B/\022\006\020\002\032\0020\003\022\016\b\002\020\004\032\b\022\004\022\0020\0030\005\022\016\b\002\020\006\032\b\022\004\022\0020\0030\005¢\006\004\b\007\020\bJ\t\020\022\032\0020\003HÆ\003J\017\020\023\032\b\022\004\022\0020\0030\005HÆ\003J\017\020\024\032\b\022\004\022\0020\0030\005HÆ\003J3\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0030\0052\016\b\002\020\006\032\b\022\004\022\0020\0030\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\033HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\013\020\fR\027\020\006\032\b\022\004\022\0020\0030\005¢\006\b\n\000\032\004\b\r\020\fR\021\020\016\032\0020\0038F¢\006\006\032\004\b\017\020\nR\021\020\020\032\0020\0038F¢\006\006\032\004\b\021\020\n¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "", "tagLength", "", "openIndices", "", "closeIndices", "<init>", "(ILjava/util/List;Ljava/util/List;)V", "getTagLength", "()I", "getOpenIndices", "()Ljava/util/List;", "getCloseIndices", "openCount", "getOpenCount", "closeCount", "getCloseCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"})
/*    */ final class TagInfo {
/*    */   private final int tagLength;
/*    */   @NotNull
/*    */   private final List<Integer> openIndices;
/*    */   @NotNull
/*    */   private final List<Integer> closeIndices;
/*    */   
/* 16 */   public TagInfo(int tagLength, @NotNull List<Integer> openIndices, @NotNull List<Integer> closeIndices) { this.tagLength = tagLength;
/* 17 */     this.openIndices = openIndices;
/* 18 */     this.closeIndices = closeIndices; } public final int getTagLength() { return this.tagLength; } @NotNull public final List<Integer> getCloseIndices() { return this.closeIndices; }
/*    */   @NotNull
/* 20 */   public final List<Integer> getOpenIndices() { return this.openIndices; } public final int getOpenCount() { return this.openIndices.size(); } public final int getCloseCount() {
/* 21 */     return this.closeIndices.size();
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.tagLength;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Integer> component2() {
/*    */     return this.openIndices;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<Integer> component3() {
/*    */     return this.closeIndices;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TagInfo copy(int tagLength, @NotNull List<Integer> openIndices, @NotNull List<Integer> closeIndices) {
/*    */     Intrinsics.checkNotNullParameter(openIndices, "openIndices");
/*    */     Intrinsics.checkNotNullParameter(closeIndices, "closeIndices");
/*    */     return new TagInfo(tagLength, openIndices, closeIndices);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TagInfo(tagLength=" + this.tagLength + ", openIndices=" + this.openIndices + ", closeIndices=" + this.closeIndices + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.tagLength);
/*    */     result = result * 31 + this.openIndices.hashCode();
/*    */     return result * 31 + this.closeIndices.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TagInfo))
/*    */       return false; 
/*    */     TagInfo tagInfo = (TagInfo)other;
/*    */     return (this.tagLength != tagInfo.tagLength) ? false : (!Intrinsics.areEqual(this.openIndices, tagInfo.openIndices) ? false : (!!Intrinsics.areEqual(this.closeIndices, tagInfo.closeIndices)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\TagParsingUtils$TagInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */