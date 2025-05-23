/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\004\b\006\020\007B\021\b\026\022\006\020\b\032\0020\t¢\006\004\b\006\020\nJ\t\020\020\032\0020\003HÆ\003J\020\020\021\032\004\030\0010\005HÆ\003¢\006\002\020\016J$\020\022\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005HÆ\001¢\006\002\020\023J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\005HÖ\001J\t\020\030\032\0020\031HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\025\020\004\032\004\030\0010\005¢\006\n\n\002\020\017\032\004\b\r\020\016¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$MergableSearchResultItem;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "line", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;)V", "searchResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getLine", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$MergableSearchResultItem;", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*     */ public final class MergableSearchResultItem
/*     */ {
/*     */   @NotNull
/*     */   private final VirtualFile file;
/*     */   @Nullable
/*     */   private final Integer line;
/*     */   
/*     */   public MergableSearchResultItem(@NotNull VirtualFile file, @Nullable Integer line) {
/* 238 */     this.file = file; this.line = line; } @NotNull public final VirtualFile getFile() { return this.file; } @Nullable public final Integer getLine() { return this.line; } public MergableSearchResultItem(@NotNull SearchResultItem searchResult) {
/* 239 */     this(searchResult.getFile(), (searchResult.getContent() != null) ? Integer.valueOf(searchResult.getContent().getStartLine()) : null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final VirtualFile component1() {
/*     */     return this.file;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Integer component2() {
/*     */     return this.line;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MergableSearchResultItem copy(@NotNull VirtualFile file, @Nullable Integer line) {
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     return new MergableSearchResultItem(file, line);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "MergableSearchResultItem(file=" + this.file + ", line=" + this.line + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.file.hashCode();
/*     */     return result * 31 + ((this.line == null) ? 0 : this.line.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof MergableSearchResultItem))
/*     */       return false; 
/*     */     MergableSearchResultItem mergableSearchResultItem = (MergableSearchResultItem)other;
/*     */     return !Intrinsics.areEqual(this.file, mergableSearchResultItem.file) ? false : (!!Intrinsics.areEqual(this.line, mergableSearchResultItem.line));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$MergableSearchResultItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */