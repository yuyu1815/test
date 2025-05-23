/*    */ package org.jetbrains.jewel.ui;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.ProvidedValue;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class ComponentStyling$with$1
/*    */   implements Function2<Composer, Integer, ProvidedValue<?>[]>
/*    */ {
/*    */   ComponentStyling$with$1(Function2<Composer, Integer, ComponentStyling> $styling) {}
/*    */   
/*    */   @Composable
/*    */   public final ProvidedValue<?>[] invoke(Composer $composer, int $changed) {
/* 21 */     $composer.startReplaceGroup(1678000287); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1678000287, $changed, -1, "org.jetbrains.jewel.ui.ComponentStyling.with.<anonymous> (ComponentStyling.kt:20)");  ProvidedValue[] arrayOfProvidedValue = (ProvidedValue[])((ComponentStyling)this.$styling.invoke($composer, Integer.valueOf(0))).styles($composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (ProvidedValue<?>[])arrayOfProvidedValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\ComponentStyling$with$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */