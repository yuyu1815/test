/*    */ package com.intellij.ml.llm.matterhorn.utils;
/*    */ 
/*    */ import java.util.Map;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B/\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005¢\006\004\b\b\020\tJ\025\020\017\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\013\020\020\032\004\030\0010\005HÆ\003J\013\020\021\032\004\030\0010\005HÆ\003J7\020\022\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\005HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\027HÖ\001J\t\020\030\032\0020\004HÖ\001R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\n\020\013R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\f\020\rR\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\r¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$MainTagsState;", "", "tagInfos", "", "", "Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "thoughtInfo", "commandInfo", "<init>", "(Ljava/util/Map;Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;)V", "getTagInfos", "()Ljava/util/Map;", "getThoughtInfo", "()Lcom/intellij/ml/llm/matterhorn/utils/TagParsingUtils$TagInfo;", "getCommandInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core"})
/*    */ final class MainTagsState
/*    */ {
/*    */   @NotNull
/*    */   private final Map<String, TagParsingUtils.TagInfo> tagInfos;
/*    */   @Nullable
/*    */   private final TagParsingUtils.TagInfo thoughtInfo;
/*    */   @Nullable
/*    */   private final TagParsingUtils.TagInfo commandInfo;
/*    */   
/*    */   public MainTagsState(@NotNull Map<String, TagParsingUtils.TagInfo> tagInfos, @Nullable TagParsingUtils.TagInfo thoughtInfo, @Nullable TagParsingUtils.TagInfo commandInfo) {
/* 25 */     this.tagInfos = tagInfos;
/* 26 */     this.thoughtInfo = thoughtInfo;
/* 27 */     this.commandInfo = commandInfo; } @Nullable public final TagParsingUtils.TagInfo getCommandInfo() { return this.commandInfo; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, TagParsingUtils.TagInfo> getTagInfos() {
/*    */     return this.tagInfos;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TagParsingUtils.TagInfo getThoughtInfo() {
/*    */     return this.thoughtInfo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Map<String, TagParsingUtils.TagInfo> component1() {
/*    */     return this.tagInfos;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TagParsingUtils.TagInfo component2() {
/*    */     return this.thoughtInfo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TagParsingUtils.TagInfo component3() {
/*    */     return this.commandInfo;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MainTagsState copy(@NotNull Map<String, TagParsingUtils.TagInfo> tagInfos, @Nullable TagParsingUtils.TagInfo thoughtInfo, @Nullable TagParsingUtils.TagInfo commandInfo) {
/*    */     Intrinsics.checkNotNullParameter(tagInfos, "tagInfos");
/*    */     return new MainTagsState(tagInfos, thoughtInfo, commandInfo);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MainTagsState(tagInfos=" + this.tagInfos + ", thoughtInfo=" + this.thoughtInfo + ", commandInfo=" + this.commandInfo + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tagInfos.hashCode();
/*    */     result = result * 31 + ((this.thoughtInfo == null) ? 0 : this.thoughtInfo.hashCode());
/*    */     return result * 31 + ((this.commandInfo == null) ? 0 : this.commandInfo.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MainTagsState))
/*    */       return false; 
/*    */     MainTagsState mainTagsState = (MainTagsState)other;
/*    */     return !Intrinsics.areEqual(this.tagInfos, mainTagsState.tagInfos) ? false : (!Intrinsics.areEqual(this.thoughtInfo, mainTagsState.thoughtInfo) ? false : (!!Intrinsics.areEqual(this.commandInfo, mainTagsState.commandInfo)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhor\\utils\TagParsingUtils$MainTagsState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */