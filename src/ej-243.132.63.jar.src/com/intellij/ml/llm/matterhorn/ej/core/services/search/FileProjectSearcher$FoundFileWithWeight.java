/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.SmartPsiElementPointer;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\t\020\022\032\0020\003HÆ\003J\025\020\023\032\016\022\006\b\001\022\0020\0060\005j\002`\007HÆ\003J\t\020\024\032\0020\tHÆ\003J3\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\024\b\002\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\tHÖ\001J\t\020\032\032\0020\033HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\035\020\004\032\016\022\006\b\001\022\0020\0060\005j\002`\007¢\006\b\n\000\032\004\b\016\020\017R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\020\020\021¨\006\034"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "psiPointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "weight", "", "<init>", "(Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/psi/SmartPsiElementPointer;I)V", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getPsiPointer", "()Lcom/intellij/psi/SmartPsiElementPointer;", "getWeight", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ej-core"})
/*    */ final class FoundFileWithWeight
/*    */ {
/*    */   @NotNull
/*    */   private final VirtualFile file;
/*    */   @NotNull
/*    */   private final SmartPsiElementPointer<? extends PsiElement> psiPointer;
/*    */   private final int weight;
/*    */   
/*    */   public FoundFileWithWeight(@NotNull VirtualFile file, @NotNull SmartPsiElementPointer<? extends PsiElement> psiPointer, int weight) {
/* 38 */     this.file = file; this.psiPointer = psiPointer; this.weight = weight; } @NotNull public final VirtualFile getFile() { return this.file; } @NotNull public final SmartPsiElementPointer<? extends PsiElement> getPsiPointer() { return this.psiPointer; } public final int getWeight() { return this.weight; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile component1() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SmartPsiElementPointer<? extends PsiElement> component2() {
/*    */     return this.psiPointer;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.weight;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FoundFileWithWeight copy(@NotNull VirtualFile file, @NotNull SmartPsiElementPointer<? extends PsiElement> psiPointer, int weight) {
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     Intrinsics.checkNotNullParameter(psiPointer, "psiPointer");
/*    */     return new FoundFileWithWeight(file, psiPointer, weight);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FoundFileWithWeight(file=" + this.file + ", psiPointer=" + this.psiPointer + ", weight=" + this.weight + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.file.hashCode();
/*    */     result = result * 31 + this.psiPointer.hashCode();
/*    */     return result * 31 + Integer.hashCode(this.weight);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FoundFileWithWeight))
/*    */       return false; 
/*    */     FoundFileWithWeight foundFileWithWeight = (FoundFileWithWeight)other;
/*    */     return !Intrinsics.areEqual(this.file, foundFileWithWeight.file) ? false : (!Intrinsics.areEqual(this.psiPointer, foundFileWithWeight.psiPointer) ? false : (!(this.weight != foundFileWithWeight.weight)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileProjectSearcher$FoundFileWithWeight.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */