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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001BE\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\030\b\002\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\r¢\006\004\b\016\020\017J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\007HÆ\003J\013\020\035\032\004\030\0010\tHÆ\003J\031\020\036\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\rHÆ\003JM\020\037\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\030\b\002\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\rHÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\005HÖ\001J\t\020$\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\026\020\027R!\020\n\032\022\022\006\b\001\022\0020\f\030\0010\013j\004\030\001`\r¢\006\b\n\000\032\004\b\030\020\031¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/AbstractSymbolProjectSearcher$FoundPsiItemWithWeight;", "", "name", "", "weight", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "content", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "pointer", "Lcom/intellij/psi/SmartPsiElementPointer;", "Lcom/intellij/psi/PsiElement;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/PsiElementPointer;", "<init>", "(Ljava/lang/String;ILcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;Lcom/intellij/psi/SmartPsiElementPointer;)V", "getName", "()Ljava/lang/String;", "getWeight", "()I", "getFile", "()Lcom/intellij/openapi/vfs/VirtualFile;", "getContent", "()Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchResultContent;", "getPointer", "()Lcom/intellij/psi/SmartPsiElementPointer;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ej-core"})
/*    */ final class FoundPsiItemWithWeight
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   private final int weight;
/*    */   @NotNull
/*    */   private final VirtualFile file;
/*    */   @Nullable
/*    */   private final SearchResultContent content;
/*    */   @Nullable
/*    */   private final SmartPsiElementPointer<? extends PsiElement> pointer;
/*    */   
/*    */   public FoundPsiItemWithWeight(@NotNull String name, int weight, @NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/* 79 */     this.name = name;
/* 80 */     this.weight = weight;
/* 81 */     this.file = file;
/* 82 */     this.content = content;
/* 83 */     this.pointer = pointer; } @Nullable public final SmartPsiElementPointer<? extends PsiElement> getPointer() { return this.pointer; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public final int getWeight() {
/*    */     return this.weight;
/*    */   }
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
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.weight;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VirtualFile component3() {
/*    */     return this.file;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SearchResultContent component4() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final SmartPsiElementPointer<? extends PsiElement> component5() {
/*    */     return this.pointer;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FoundPsiItemWithWeight copy(@NotNull String name, int weight, @NotNull VirtualFile file, @Nullable SearchResultContent content, @Nullable SmartPsiElementPointer<? extends PsiElement> pointer) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(file, "file");
/*    */     return new FoundPsiItemWithWeight(name, weight, file, content, pointer);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FoundPsiItemWithWeight(name=" + this.name + ", weight=" + this.weight + ", file=" + this.file + ", content=" + this.content + ", pointer=" + this.pointer + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.weight);
/*    */     result = result * 31 + this.file.hashCode();
/*    */     result = result * 31 + ((this.content == null) ? 0 : this.content.hashCode());
/*    */     return result * 31 + ((this.pointer == null) ? 0 : this.pointer.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FoundPsiItemWithWeight))
/*    */       return false; 
/*    */     FoundPsiItemWithWeight foundPsiItemWithWeight = (FoundPsiItemWithWeight)other;
/*    */     return !Intrinsics.areEqual(this.name, foundPsiItemWithWeight.name) ? false : ((this.weight != foundPsiItemWithWeight.weight) ? false : (!Intrinsics.areEqual(this.file, foundPsiItemWithWeight.file) ? false : (!Intrinsics.areEqual(this.content, foundPsiItemWithWeight.content) ? false : (!!Intrinsics.areEqual(this.pointer, foundPsiItemWithWeight.pointer)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\AbstractSymbolProjectSearcher$FoundPsiItemWithWeight.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */