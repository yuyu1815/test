/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*    */ 
/*    */ import androidx.compose.foundation.layout.SizeKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.font.FontWeight;
/*    */ import androidx.compose.ui.unit.TextUnitKt;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ final class TaskHeaderKt$TaskHeader$1$1$2$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 51 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1558771137, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeader.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaskHeader.kt:50)"); 
/* 52 */       if (this.$state == null || this.$state.getTaskName() == null) this.$state.getTaskName();  String str = "";
/* 53 */       Modifier modifier = SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null);
/* 54 */       long l1 = TextUnitKt.getSp(18);
/* 55 */       FontWeight fontWeight = FontWeight.Companion.getW500();
/* 56 */       long l2 = TextUnitKt.getSp(25.2D);
/* 57 */       FontFamily fontFamily = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable);
/* 58 */       long l3 = MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getTaskTitleTextColor-0d7_KjU(); TextKt.Text-bAzTDeA(str, modifier, l3, l1, null, fontWeight, fontFamily, 0L, null, 0, l2, 0, false, 0, null, null, $composer, 199728, 6, 64400); if (ComposerKt.isTraceInProgress())
/* 59 */         ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   TaskHeaderKt$TaskHeader$1$1$2$1(TaskHeaderState $state) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderKt$TaskHeader$1$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */