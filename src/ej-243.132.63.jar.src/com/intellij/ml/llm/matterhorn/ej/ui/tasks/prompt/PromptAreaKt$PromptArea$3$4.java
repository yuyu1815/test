/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import org.jetbrains.jewel.foundation.theme.JewelTheme;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TextAreaStyle;
/*     */ import org.jetbrains.jewel.ui.theme.JewelThemeKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class PromptAreaKt$PromptArea$3$4
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 131 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1303348208, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptArea.<anonymous>.<anonymous> (PromptArea.kt:130)");  String text = (String)this.$placeholder.invoke(this.$currentPromptMode);
/* 132 */       if ((((CharSequence)text).length() > 0))
/* 133 */       { TextAreaStyle style = JewelThemeKt.getTextAreaStyle(JewelTheme.Companion, $composer, 6);
/* 134 */         TextKt.Text-bAzTDeA(
/* 135 */             text, null, 
/* 136 */             style.getColors().getPlaceholder-0d7_KjU(), 0L, null, null, 
/* 137 */             MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getMessageFont($composer, MatterhornThemeData.$stable), 0L, null, 0, 0L, 0, false, 0, null, null, $composer, 0, 0, 65466); }  if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/* 139 */     else { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   PromptAreaKt$PromptArea$3$4(Function1<PromptMode, String> $placeholder, PromptMode $currentPromptMode) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptAreaKt$PromptArea$3$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */