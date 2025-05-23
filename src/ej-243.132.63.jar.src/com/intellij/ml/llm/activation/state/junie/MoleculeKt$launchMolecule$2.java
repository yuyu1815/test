/*    */ package com.intellij.ml.llm.activation.state.junie;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Ref;
/*    */ import kotlinx.coroutines.flow.MutableStateFlow;
/*    */ import kotlinx.coroutines.flow.StateFlowKt;
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
/*    */ final class MoleculeKt$launchMolecule$2
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 40 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1440870263, $changed, -1, "com.intellij.ml.llm.activation.state.junie.launchMolecule.<anonymous> (Molecule.kt:39)");  Object value = this.$body.invoke($composer, Integer.valueOf(0));
/* 41 */       MutableStateFlow outputFlow = (MutableStateFlow)this.$flow.element;
/* 42 */       if (outputFlow != null)
/* 43 */       { outputFlow.setValue(value); }
/*    */       else
/* 45 */       { this.$flow.element = StateFlowKt.MutableStateFlow(value); }  if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/* 46 */     else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   MoleculeKt$launchMolecule$2(Function2<Composer, Integer, T> $body, Ref.ObjectRef<MutableStateFlow<T>> $flow) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\state\junie\MoleculeKt$launchMolecule$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */