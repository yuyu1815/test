/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class JunieAiaActivationManagerImpl$createActivationState$1 implements Function2<Composer, Integer, AiaActivation> {
/*    */   @Composable
/*    */   public final AiaActivation invoke(Composer $composer, int $changed) {
/* 11 */     $composer.startReplaceGroup(201040615); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(201040615, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.JunieAiaActivationManagerImpl.createActivationState.<anonymous> (JunieAiaActivationManagerImpl.kt:10)");  AiaActivation aiaActivation = AiaActivationKt.aiaActivation(null, $composer, 0, 1); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return aiaActivation;
/*    */   }
/*    */   
/*    */   public static final JunieAiaActivationManagerImpl$createActivationState$1 INSTANCE = new JunieAiaActivationManagerImpl$createActivationState$1();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\JunieAiaActivationManagerImpl$createActivationState$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */