/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.ContextMenuItem;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.JuniePromptExampleTipsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.TaskExplorerTabs;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.explorer.Tip;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KFunction;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyListState;
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
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nNewTaskPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$ShowTaskExplorer$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,164:1\n1225#2,6:165\n1225#2,6:171\n149#3:177\n149#3:178\n*S KotlinDebug\n*F\n+ 1 NewTaskPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/NewTaskPageKt$ShowTaskExplorer$2\n*L\n149#1:165,6\n150#1:171,6\n151#1:177\n154#1:178\n*E\n"})
/*     */ final class NewTaskPageKt$ShowTaskExplorer$2
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/* 145 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { NewTaskViewModelImpl newTaskViewModelImpl; int $this$dp$iv; Modifier modifier1; KFunction kFunction1; int $i$f$getDp; int i; Composer composer1; Composer $this$cache$iv; int j; boolean invalid$iv; int $i$f$cache; Object it$iv; int $i$a$-let-ComposerKt$cache$1$iv; int $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$1; Object value$iv; Modifier modifier2; List<SortedRecentTaskChain> list; SelectableLazyListState selectableLazyListState; KFunction kFunction2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(766100948, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ShowTaskExplorer.<anonymous> (NewTaskPage.kt:144)");  switch (WhenMappings.$EnumSwitchMapping$0[((TaskExplorerTabs)this.$model.getTaskExplorerSelectedTab().getValue()).ordinal()]) { case 1:
/* 146 */           $composer.startReplaceGroup(-1558712792);
/*     */ 
/*     */           
/* 149 */           newTaskViewModelImpl = this.$model; $composer.startReplaceGroup(-1558708560); composer1 = $composer; invalid$iv = $composer.changedInstance(newTaskViewModelImpl); $i$f$cache = 0;
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
/* 165 */           it$iv = composer1.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */           
/* 167 */           selectableLazyListState = this.$model.getTaskListState(); list = this.$recentTasksList; modifier2 = null; $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$1 = 0; kFunction2 = (KFunction)new NewTaskPageKt$ShowTaskExplorer$2$1$1(newTaskViewModelImpl); value$iv = kFunction2;
/* 168 */           composer1.updateRememberedValue(value$iv);
/* 169 */           kFunction1 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (KFunction)value$iv : 
/* 170 */             (KFunction)it$iv; $composer.endReplaceGroup(); newTaskViewModelImpl = this.$model; $composer.startReplaceGroup(-1558707047); $this$cache$iv = $composer; invalid$iv = $composer.changedInstance(newTaskViewModelImpl); $i$f$cache = 0;
/* 171 */           it$iv = $this$cache$iv.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 172 */           if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 173 */             Function1<? super TaskChainId, Unit> function1 = (Function1)kFunction1; selectableLazyListState = selectableLazyListState; list = list; modifier2 = modifier2; int $i$a$-cache-NewTaskPageKt$ShowTaskExplorer$2$2 = 0; KFunction kFunction = (KFunction)new NewTaskPageKt$ShowTaskExplorer$2$2$1(newTaskViewModelImpl); value$iv = kFunction;
/* 174 */             $this$cache$iv.updateRememberedValue(value$iv);
/*     */           } 
/* 176 */           kFunction1 = (KFunction)it$iv; $composer.endReplaceGroup(); $this$dp$iv = 12; $i$f$getDp = 0;
/* 177 */           TaskListKt.TaskList-5IdfQCw(modifier2, list, selectableLazyListState, function1, (Function2<? super SortedRecentTaskChain, ? super Integer, ? extends List<? extends ContextMenuItem>>)kFunction1, 0L, Dp.constructor-impl($this$dp$iv), $composer, 0x180000 | SelectableLazyListState.$stable << 6, 33); $composer.endReplaceGroup(); break;
/* 178 */         case 2: $composer.startReplaceGroup(-1075155005); i = 12; j = 0; modifier1 = PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getBackgroundColor-0d7_KjU(), null, 2, null), Dp.constructor-impl(i), 0.0F, 2, null);
/*     */           JuniePromptExampleTipsKt.JuniePromptExampleTips-Zb7fWow(this.$tips, this.$onTipClick, null, modifier1, 0L, $composer, 0, 20);
/*     */           $composer.endReplaceGroup();
/*     */           break;
/*     */         default:
/*     */           $composer.startReplaceGroup(-1558715062);
/*     */           $composer.endReplaceGroup();
/*     */           throw new NoWhenBranchMatchedException(); }
/*     */       
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   NewTaskPageKt$ShowTaskExplorer$2(NewTaskViewModelImpl $model, List<SortedRecentTaskChain> $recentTasksList, List<Tip> $tips, Function1<String, Unit> $onTipClick) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\NewTaskPageKt$ShowTaskExplorer$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */