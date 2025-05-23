/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.SmartPsiElementPointer;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B5\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\030\b\002\020\006\032\022\022\006\b\001\022\0020\b\030\0010\007j\004\030\001`\t¢\006\004\b\n\020\013J\t\020\022\032\0020\003HÆ\003J\013\020\023\032\004\030\0010\005HÆ\003J\031\020\024\032\022\022\006\b\001\022\0020\b\030\0010\007j\004\030\001`\tHÆ\003J9\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\030\b\002\020\006\032\022\022\006\b\001\022\0020\b\030\0010\007j\004\030\001`\tHÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\032HÖ\001J\t\020\033\032\0020\034HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\017R!\020\006\032\022\022\006\b\001\022\0020\b\030\0010\007j\004\030\001`\t¢\006\b\n\000\032\004\b\020\020\021¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultItem;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "content", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "pointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;Lcom/intellij/psi/SmartPsiElementPointer;)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getContent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "getPointer", "()Lcom/intellij/psi/SmartPsiElementPointer;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class SearchResultItem
/*    */ {
/*    */   @NotNull
/*    */   private final VirtualFile file;
/*    */   @Nullable
/*    */   private final SearchResultContent content;
/*    */   @Nullable
/*    */   private final SmartPsiElementPointer<? extends PsiElement> pointer;
/*    */   
/*    */   public SearchResultItem(@NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/* 41 */     this.file = file;
/* 42 */     this.content = content;
/* 43 */     this.pointer = pointer; } @Nullable public final SmartPsiElementPointer<? extends PsiElement> getPointer() { return this.pointer; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile getFile() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SearchResultContent getContent() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile component1() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SearchResultContent component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SmartPsiElementPointer<? extends PsiElement> component3() {
/*    */     return this.pointer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SearchResultItem copy(@NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     return new SearchResultItem(file, content, pointer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SearchResultItem(file=" + this.file + ", content=" + this.content + ", pointer=" + this.pointer + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.file.hashCode();
/*    */     result = result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*    */     return result * 31 + ((this.pointer == null) ? 0 : this.pointer.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SearchResultItem))
/*    */       return false; 
/*    */     SearchResultItem searchResultItem = (SearchResultItem)other;
/*    */     return !Intrinsics.areEqual(this.file, searchResultItem.file) ? false : (!Intrinsics.areEqual(this.content, searchResultItem.content) ? false : (!!Intrinsics.areEqual(this.pointer, searchResultItem.pointer)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\SearchResultItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */