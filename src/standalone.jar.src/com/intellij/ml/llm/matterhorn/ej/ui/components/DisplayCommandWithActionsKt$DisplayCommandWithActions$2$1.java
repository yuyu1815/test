/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
/*    */ 
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.style.TextOverflow;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
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
/*    */ @SourceDebugExtension({"SMAP\nDisplayCommandWithActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,71:1\n149#2:72\n*S KotlinDebug\n*F\n+ 1 DisplayCommandWithActions.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1\n*L\n42#1:72\n*E\n"})
/*    */ final class DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 39 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1971677967, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActions.<anonymous>.<anonymous> (DisplayCommandWithActions.kt:38)");
/*    */ 
/*    */       
/* 42 */       int $this$dp$iv = 20, $i$f$getDp = 0;
/* 43 */       Modifier modifier = this.$this_Box.align(SizeKt.defaultMinSize-VpY3zN4$default((Modifier)Modifier.Companion, 0.0F, 
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
/* 72 */             Dp.constructor-impl($this$dp$iv), 1, null), Alignment.Companion.getCenterStart());
/*    */       FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, 0);
/*    */       $i$f$getDp = TextOverflow.Companion.getEllipsis-gIe3tQ8();
/*    */       TextKt.Text-bAzTDeA(this.$command, modifier, 0L, 0L, null, null, fontFamily, 0L, null, 0, 0L, $i$f$getDp, false, 0, null, null, $composer, 0, 48, 63420);
/*    */       if (ComposerKt.isTraceInProgress())
/*    */         ComposerKt.traceEventEnd();  }
/*    */     else
/*    */     { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1(BoxScope $receiver, String $command) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\DisplayCommandWithActionsKt$DisplayCommandWithActions$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */