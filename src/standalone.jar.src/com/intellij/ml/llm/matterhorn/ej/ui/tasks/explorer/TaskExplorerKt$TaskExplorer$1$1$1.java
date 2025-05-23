/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocal;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.ui.component.TabData;
/*     */ import org.jetbrains.jewel.ui.component.TabStripKt;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStyle;
/*     */ import org.jetbrains.jewel.ui.component.styling.TabStylingKt;
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
/*     */ @SourceDebugExtension({"SMAP\nTaskExplorer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt$TaskExplorer$1$1$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,159:1\n77#2:160\n*S KotlinDebug\n*F\n+ 1 TaskExplorer.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/explorer/TaskExplorerKt$TaskExplorer$1$1$1\n*L\n66#1:160\n*E\n"})
/*     */ final class TaskExplorerKt$TaskExplorer$1$1$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  58 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-317946561, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorer.<anonymous>.<anonymous>.<anonymous> (TaskExplorer.kt:57)"); 
/*  59 */       Modifier modifier = BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getBackgroundColor-0d7_KjU(), null, 2, null);
/*     */       
/*  61 */       List<TabData.Default> list = TaskExplorerKt.buildTabsData(
/*  62 */           this.$selectedTab, 
/*  63 */           this.$onTabSelected, 
/*  64 */           this.$showHistoryTab);
/*     */       
/*  66 */       CompositionLocal compositionLocal = (CompositionLocal)TabStylingKt.getLocalDefaultTabStyle(); int $changed$iv = 0, $i$f$getCurrent = 0;
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
/* 160 */       ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); TabStyle tabStyle = (TabStyle)object;
/*     */       TabStripKt.TabStrip(list, tabStyle, modifier, false, $composer, 0, 8);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TaskExplorerKt$TaskExplorer$1$1$1(TaskExplorerTabs $selectedTab, Function1<TaskExplorerTabs, Unit> $onTabSelected, boolean $showHistoryTab) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\explorer\TaskExplorerKt$TaskExplorer$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */