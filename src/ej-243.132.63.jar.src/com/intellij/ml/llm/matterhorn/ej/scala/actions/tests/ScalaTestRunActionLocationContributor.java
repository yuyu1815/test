/*    */ package com.intellij.ml.llm.matterhorn.ej.scala.actions.tests;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocation;
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.TestRunActionLocationContributor;
/*    */ import com.intellij.psi.PsiElement;
/*    */ import com.intellij.psi.PsiNameIdentifierOwner;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\032\020\006\032\004\030\0010\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/scala/actions/tests/ScalaTestRunActionLocationContributor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor;", "<init>", "()V", "provider", "Lorg/jetbrains/plugins/scala/testingSupport/test/ui/ScalaTestRunLineMarkerProvider;", "findActionLocation", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "name", "", "identifierOwner", "Lcom/intellij/psi/PsiNameIdentifierOwner;", "ej-scala"})
/*    */ public final class ScalaTestRunActionLocationContributor implements TestRunActionLocationContributor {
/*    */   @NotNull
/* 11 */   private final ScalaTestRunLineMarkerProvider provider = new ScalaTestRunLineMarkerProvider(); @Nullable
/*    */   public ActionLocation findActionLocation(@NotNull String name, @NotNull PsiNameIdentifierOwner identifierOwner) { PsiElement identifyingElement;
/*    */     AnAction action;
/* 14 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(identifierOwner, "identifierOwner"); if (identifierOwner.getIdentifyingElement() == null) { identifierOwner.getIdentifyingElement(); return null; }
/* 15 */      if (TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, identifyingElement) == null) { TestRunActionLocationContributor.Companion.findFirstRunAction((RunLineMarkerContributor)this.provider, identifyingElement); return null; }
/* 16 */      return (ActionLocation)new PsiActionLocation(name, action, identifyingElement); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\scala\actions\tests\ScalaTestRunActionLocationContributor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */