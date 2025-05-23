/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.MutableState;
/*     */ import androidx.compose.runtime.State;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.PromptMode;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTaskChainPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$2$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,112:1\n1225#2,6:113\n*S KotlinDebug\n*F\n+ 1 TaskChainPage.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainPageKt$TaskChainLeftColumn$2$1\n*L\n83#1:113,6\n*E\n"})
/*     */ final class TaskChainPageKt$TaskChainLeftColumn$2$1
/*     */   implements Function2<Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(Composer $composer, int $changed) {
/*  79 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1948648313, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainLeftColumn.<anonymous>.<anonymous> (TaskChainPage.kt:78)"); 
/*  80 */       Map<Integer, TaskRecapModel> map1 = TaskChainPageKt.access$TaskChainLeftColumn$lambda$7(this.$taskMap$delegate);
/*  81 */       boolean bool = TaskChainPageKt.access$TaskChainLeftColumn$lambda$15$lambda$14(this.$isChainRunning$delegate);
/*  82 */       int i = TaskChainPageKt.access$TaskChainLeftColumn$lambda$9(this.$selectedIndex$delegate);
/*     */       
/*  84 */       PromptMode promptMode = (PromptMode)this.$model.getPromptMode().getValue();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       $composer.startReplaceGroup(1699848779);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       Composer composer = $composer;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       boolean bool1 = false;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       MutableState<Integer> mutableState = this.$selectedIndex$delegate;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */       
/* 113 */       Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       
/* 115 */       Map<Integer, TaskRecapModel> map2 = map1; ColumnScope columnScope = this.$this_Column; int $i$a$-cache-TaskChainPageKt$TaskChainLeftColumn$2$1$1 = 0; Function1 function11 = mutableState::invoke$lambda$1$lambda$0; Object value$iv = function11;
/* 116 */       composer.updateRememberedValue(value$iv);
/* 117 */       Function1<? super Integer, Unit> function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 118 */         (Function1)it$iv;
/*     */       $composer.endReplaceGroup();
/*     */       ChainRecapKt.TaskRecap(columnScope, map2, function1, i, bool, promptMode, $composer, 384);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   private static final Unit invoke$lambda$1$lambda$0(MutableState $selectedIndex$delegate, int it) {
/*     */     TaskChainPageKt.access$TaskChainLeftColumn$lambda$10($selectedIndex$delegate, it);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   TaskChainPageKt$TaskChainLeftColumn$2$1(TaskChainDetailsViewModel $model, ColumnScope $receiver, State<Map<Integer, TaskRecapModel>> $taskMap$delegate, State<Boolean> $isChainRunning$delegate, MutableState<Integer> $selectedIndex$delegate) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainPageKt$TaskChainLeftColumn$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */