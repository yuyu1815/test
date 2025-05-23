/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.execution.lineMarker.RunLineMarkerContributor;
/*    */ import com.intellij.openapi.actionSystem.AnAction;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import com.intellij.testIntegration.TestRunLineMarkerProvider;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\032\020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/JvmTestRunActionLocationContributor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor;", "<init>", "()V", "provider", "Lcom/intellij/testIntegration/TestRunLineMarkerProvider;", "findActionLocation", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "name", "", "identifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "ej-idea"})
/*    */ public final class JvmTestRunActionLocationContributor
/*    */   implements TestRunActionLocationContributor
/*    */ {
/*    */   @NotNull
/* 32 */   private final TestRunLineMarkerProvider provider = new TestRunLineMarkerProvider(); @Nullable
/*    */   public ActionLocation findActionLocation(@NotNull String name, @NotNull PsiNameIdentifierOwner identifierOwner) { PsiElement identifyingElement;
/*    */     AnAction action;
/* 35 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(identifierOwner, "identifierOwner"); if (identifierOwner.getIdentifyingElement() == null) { identifierOwner.getIdentifyingElement(); return null; }
/* 36 */      if (TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, identifyingElement) == null) { TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, identifyingElement); return null; }
/* 37 */      return new PsiActionLocation(name, action, identifyingElement); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\JvmTestRunActionLocationContributor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */