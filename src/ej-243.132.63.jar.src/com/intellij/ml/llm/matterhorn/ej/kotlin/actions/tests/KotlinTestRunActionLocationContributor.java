/*    */ package com.intellij.ml.llm.matterhorn.ej.kotlin.actions.tests;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.TestRunActionLocationContributor;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.kotlin.asJava.LightClassUtilsKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\032\020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/kotlin/actions/tests/KotlinTestRunActionLocationContributor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor;", "<init>", "()V", "provider", "Lorg/jetbrains/kotlin/idea/highlighter/KotlinTestRunLineMarkerContributor;", "findActionLocation", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "name", "", "identifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "ej-kotlin"})
/*    */ @SourceDebugExtension({"SMAP\nKotlinTestRunActionLocationContributor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTestRunActionLocationContributor.kt\ncom/intellij/ml/llm/matterhorn/ej/kotlin/actions/tests/KotlinTestRunActionLocationContributor\n+ 2 psiUtils.kt\norg/jetbrains/kotlin/psi/psiUtil/PsiUtilsKt\n*L\n1#1,23:1\n133#2:24\n*S KotlinDebug\n*F\n+ 1 KotlinTestRunActionLocationContributor.kt\ncom/intellij/ml/llm/matterhorn/ej/kotlin/actions/tests/KotlinTestRunActionLocationContributor\n*L\n19#1:24\n*E\n"})
/*    */ public final class KotlinTestRunActionLocationContributor implements TestRunActionLocationContributor {
/*    */   @NotNull
/* 14 */   private final KotlinTestRunLineMarkerContributor provider = new KotlinTestRunLineMarkerContributor(); @Nullable
/*    */   public ActionLocation findActionLocation(@NotNull String name, @NotNull PsiNameIdentifierOwner identifierOwner) { PsiElement identifyingElement;
/*    */     AnAction action;
/* 17 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(identifierOwner, "identifierOwner"); if (identifierOwner.getIdentifyingElement() == null) { identifierOwner.getIdentifyingElement(); return null; }
/* 18 */      if (LightClassUtilsKt.getUnwrapped(identifyingElement) == null) LightClassUtilsKt.getUnwrapped(identifyingElement);  PsiElement unwrappedElement = identifyingElement;
/* 19 */     PsiElement psiElement1 = unwrappedElement; boolean strict$iv = false; int $i$f$getParentOfType = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     if (PsiTreeUtil.getParentOfType(psiElement1, KtElement.class, strict$iv) == null)
/*    */       return null; 
/*    */     if (TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, unwrappedElement) == null) {
/*    */       TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, unwrappedElement);
/*    */       return null;
/*    */     } 
/*    */     return (ActionLocation)new PsiActionLocation(name, action, unwrappedElement); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\kotlin\actions\tests\KotlinTestRunActionLocationContributor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */