/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.services.search.SearchResultItem;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.List;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\017\020\030\032\b\022\004\022\0020\n0\tHÆ\003J7\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\036HÖ\001J\t\020\037\032\0020\007HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\021\020\022R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\023\020\024¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction$FileGroup;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "weight", "", "title", "", "results", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;DLjava/lang/String;Ljava/util/List;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getWeight", "()D", "getTitle", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */ public final class FileGroup
/*     */ {
/*     */   @NotNull
/*     */   private final VirtualFile file;
/*     */   private final double weight;
/*     */   @NotNull
/*     */   private final String title;
/*     */   @NotNull
/*     */   private final List<SearchResultItem> results;
/*     */   
/*     */   public FileGroup(@NotNull VirtualFile file, double weight, @NotNull String title, @NotNull List<SearchResultItem> results) {
/* 237 */     this.file = file; this.weight = weight; this.title = title; this.results = results; } @NotNull public final VirtualFile getFile() { return this.file; } public final double getWeight() { return this.weight; } @NotNull public final String getTitle() { return this.title; } @NotNull public final List<SearchResultItem> getResults() { return this.results; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final VirtualFile component1() {
/*     */     return this.file;
/*     */   }
/*     */   
/*     */   public final double component2() {
/*     */     return this.weight;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.title;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<SearchResultItem> component4() {
/*     */     return this.results;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FileGroup copy(@NotNull VirtualFile file, double weight, @NotNull String title, @NotNull List<SearchResultItem> results) {
/*     */     Intrinsics.checkNotNullParameter(file, "file");
/*     */     Intrinsics.checkNotNullParameter(title, "title");
/*     */     Intrinsics.checkNotNullParameter(results, "results");
/*     */     return new FileGroup(file, weight, title, results);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FileGroup(file=" + this.file + ", weight=" + this.weight + ", title=" + this.title + ", results=" + this.results + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.file.hashCode();
/*     */     result = result * 31 + Double.hashCode(this.weight);
/*     */     result = result * 31 + this.title.hashCode();
/*     */     return result * 31 + this.results.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FileGroup))
/*     */       return false; 
/*     */     FileGroup fileGroup = (FileGroup)other;
/*     */     return !Intrinsics.areEqual(this.file, fileGroup.file) ? false : ((Double.compare(this.weight, fileGroup.weight) != 0) ? false : (!Intrinsics.areEqual(this.title, fileGroup.title) ? false : (!!Intrinsics.areEqual(this.results, fileGroup.results))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$FileGroup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */