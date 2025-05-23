/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composer;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\001\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/JunieAiaActivationManagerImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/state/manager/JunieAiaActivationManager;", "<init>", "()V", "createActivationState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class JunieAiaActivationManagerImpl implements JunieAiaActivationManager {
/*    */   @NotNull
/* 10 */   public StateFlow<AiaActivation> createActivationState(@NotNull CoroutineScope cs) { Intrinsics.checkNotNullParameter(cs, "cs"); return MoleculeKt.launchMolecule(cs, JunieAiaActivationManagerImpl$createActivationState$1.INSTANCE); } public static final int $stable; @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class JunieAiaActivationManagerImpl$createActivationState$1 implements Function2<Composer, Integer, AiaActivation> { public static final JunieAiaActivationManagerImpl$createActivationState$1 INSTANCE = new JunieAiaActivationManagerImpl$createActivationState$1(); @Composable
/* 11 */     public final AiaActivation invoke(Composer $composer, int $changed) { $composer.startReplaceGroup(201040615); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(201040615, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.JunieAiaActivationManagerImpl.createActivationState.<anonymous> (JunieAiaActivationManagerImpl.kt:10)");  AiaActivation aiaActivation = AiaActivationKt.aiaActivation(null, $composer, 0, 1); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return aiaActivation; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\JunieAiaActivationManagerImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */