/*    */ package com.intellij.ml.llm.matterhorn.ej.rustrover.relevance.extractors;
/*    */ 
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiFile;
/*    */ import com.intellij.psi.search.PsiElementProcessor;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.rust.lang.core.psi.RsUseSpeck;
/*    */ import org.rust.lang.core.psi.ext.PsiElementKt;
/*    */ import org.rust.lang.core.psi.ext.RsUseSpeckKt;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class RustElementProvider$getImports$1$1<T extends PsiElement>
/*    */   implements PsiElementProcessor
/*    */ {
/*    */   RustElementProvider$getImports$1$1(Set<PsiFile> $receiver) {}
/*    */   
/*    */   public final boolean execute(PsiElement element) {
/* 55 */     Intrinsics.checkNotNullParameter(element, "element"); if (element instanceof RsUseSpeck && ((RsUseSpeck)element).getUseGroup() == null)
/* 56 */       if (RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element) != null && RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference() != null && RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve() != null && PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()) != null) { PsiFile psiFile1 = PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()); Set<PsiFile> set = this.$this_buildSet; PsiFile it = psiFile1; int $i$a$-let-RustElementProvider$getImports$1$1$1 = 0;
/* 57 */         set.add(it); }
/*    */       else
/*    */       { PsiElementKt.getContextualFile((PsiElement)RsUseSpeckKt.getPathOrQualifier((RsUseSpeck)element).getReference().resolve()); }
/* 60 */         return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\relevance\extractors\RustElementProvider$getImports$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */