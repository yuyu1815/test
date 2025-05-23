/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/ProjectSearchAllService$FoundPsiItemResult;", "", "item", "Lcom/intellij/psi/PsiElement;", "file", "Lcom/intellij/psi/PsiFile;", "<init>", "(Lcom/intellij/psi/PsiElement;Lcom/intellij/psi/PsiFile;)V", "getItem", "()Lcom/intellij/psi/PsiElement;", "getFile", "()Lcom/intellij/psi/PsiFile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ final class FoundPsiItemResult
/*    */ {
/*    */   @NotNull
/*    */   private final PsiElement item;
/*    */   @NotNull
/*    */   private final PsiFile file;
/*    */   
/*    */   public FoundPsiItemResult(@NotNull PsiElement item, @NotNull PsiFile file) {
/* 44 */     this.item = item; this.file = file; } @NotNull public final PsiElement getItem() { return this.item; } @NotNull public final PsiFile getFile() { return this.file; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final PsiElement component1() {
/*    */     return this.item;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PsiFile component2() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FoundPsiItemResult copy(@NotNull PsiElement item, @NotNull PsiFile file) {
/*    */     Intrinsics.checkNotNullParameter(item, "item");
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     return new FoundPsiItemResult(item, file);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FoundPsiItemResult(item=" + this.item + ", file=" + this.file + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.item.hashCode();
/*    */     return result * 31 + this.file.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FoundPsiItemResult))
/*    */       return false; 
/*    */     FoundPsiItemResult foundPsiItemResult = (FoundPsiItemResult)other;
/*    */     return !Intrinsics.areEqual(this.item, foundPsiItemResult.item) ? false : (!!Intrinsics.areEqual(this.file, foundPsiItemResult.file));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\ProjectSearchAllService$FoundPsiItemResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */