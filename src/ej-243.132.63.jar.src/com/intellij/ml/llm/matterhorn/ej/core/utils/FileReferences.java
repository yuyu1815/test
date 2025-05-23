/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bJ\t\020\r\032\0020\003HÆ\003J\017\020\016\032\b\022\004\022\0020\0060\005HÆ\003J#\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\026HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/utils/FileReferences;", "", "file", "Lcom/intellij/psi/PsiFile;", "references", "", "Lcom/intellij/psi/PsiElement;", "<init>", "(Lcom/intellij/psi/PsiFile;Ljava/util/List;)V", "getFile", "()Lcom/intellij/psi/PsiFile;", "getReferences", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"})
/*    */ public final class FileReferences
/*    */ {
/*    */   @NotNull
/*    */   private final PsiFile file;
/*    */   @NotNull
/*    */   private final List<PsiElement> references;
/*    */   
/*    */   public FileReferences(@NotNull PsiFile file, @NotNull List<PsiElement> references) {
/* 21 */     this.file = file; this.references = references; } @NotNull public final PsiFile getFile() { return this.file; } @NotNull public final List<PsiElement> getReferences() { return this.references; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final PsiFile component1() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<PsiElement> component2() {
/*    */     return this.references;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FileReferences copy(@NotNull PsiFile file, @NotNull List<? extends PsiElement> references) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     Intrinsics.checkNotNullParameter(references, "references");
/*    */     return new FileReferences(file, references);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FileReferences(file=" + this.file + ", references=" + this.references + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.file.hashCode();
/*    */     return result * 31 + this.references.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FileReferences))
/*    */       return false; 
/*    */     FileReferences fileReferences = (FileReferences)other;
/*    */     return !Intrinsics.areEqual(this.file, fileReferences.file) ? false : (!!Intrinsics.areEqual(this.references, fileReferences.references));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\FileReferences.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */