/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.create;
/*     */ 
/*     */ import androidx.compose.foundation.BackgroundKt;
/*     */ import androidx.compose.foundation.ContextMenuItem;
/*     */ import androidx.compose.foundation.ContextMenuProvider_desktopKt;
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.PaddingKt;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.shape.RoundedCornerShapeKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.runtime.internal.ComposableLambdaKt;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.graphics.Shape;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeData;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.theming.MatterhornThemeDataKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.jewel.foundation.lazy.SelectableLazyItemScope;
/*     */ import org.jetbrains.jewel.ui.component.TextKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @SourceDebugExtension({"SMAP\nTaskList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,126:1\n149#2:127\n149#2:128\n149#2:129\n86#3:130\n83#3,6:131\n89#3:165\n93#3:175\n79#4,6:137\n86#4,4:152\n90#4,2:162\n94#4:174\n368#5,9:143\n377#5:164\n378#5,2:172\n4034#6,6:156\n1225#7,6:166\n*S KotlinDebug\n*F\n+ 1 TaskList.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/create/TaskListKt$TaskList$1$1$1$1$1\n*L\n68#1:127\n69#1:128\n70#1:129\n72#1:130\n72#1:131,6\n72#1:165\n72#1:175\n72#1:137,6\n72#1:152,4\n72#1:162,2\n72#1:174\n72#1:143,9\n72#1:164\n72#1:172,2\n72#1:156,6\n82#1:166,6\n*E\n"})
/*     */ final class TaskListKt$TaskList$1$1$1$1$1
/*     */   implements Function4<SelectableLazyItemScope, SortedRecentTaskChain, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(SelectableLazyItemScope $this$items, SortedRecentTaskChain sortedTask, Composer $composer, int $changed) {
/*  67 */     Intrinsics.checkNotNullParameter($this$items, "$this$items"); Intrinsics.checkNotNullParameter(sortedTask, "sortedTask"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-200270676, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.TaskList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaskList.kt:66)");  $composer.startReplaceGroup(1291543655);
/*  68 */     int $this$dp$iv = 6, $i$f$getDp = 0;
/*  69 */     $this$dp$iv = 8; $i$f$getDp = 0;
/*  70 */     $this$dp$iv = 8; $i$f$getDp = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     Modifier modifier1 = $this$items.isSelected() ? PaddingKt.padding-VpY3zN4$default(BackgroundKt.background-bw27NRU(SizeKt.fillMaxWidth$default((Modifier)Modifier.Companion, 0.0F, 1, null), MatterhornThemeDataKt.getMatterhornTheme($composer, 0).getListSelectionColor-0d7_KjU(), (Shape)RoundedCornerShapeKt.RoundedCornerShape-0680j_4(Dp.constructor-impl($this$dp$iv))), 
/* 128 */         Dp.constructor-impl($this$dp$iv), 0.0F, 2, null) : SizeKt.fillMaxWidth$default(PaddingKt.padding-VpY3zN4$default((Modifier)Modifier.Companion, 
/* 129 */           Dp.constructor-impl($this$dp$iv), 0.0F, 2, null), 0.0F, 1, null); $composer.endReplaceGroup(); Modifier modifier = modifier1; modifier1 = BackgroundKt.background-bw27NRU$default((Modifier)Modifier.Companion, this.$contentBackground, null, 2, null); Function2<SortedRecentTaskChain, Integer, List<ContextMenuItem>> function2 = this.$actionFactory; List<SortedRecentTaskChain> list = this.$recentTasks; Function1<TaskChainId, Unit> function1 = this.$onTaskDoubleClicked; int $changed$iv = 0, $i$f$Column = 0;
/* 130 */     ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 131 */     Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 132 */     Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */     
/* 135 */     MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 136 */     int $i$f$Layout = 0;
/* 137 */     ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 138 */     int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 139 */     CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 140 */     Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*     */     
/* 142 */     Function0 function01 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 143 */     ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 144 */     if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 145 */       .startReusableNode();
/* 146 */     if ($composer.getInserting()) { $composer
/* 147 */         .createNode(function01); } else { $composer
/*     */         
/* 149 */         .useNode(); }
/*     */     
/* 151 */     Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 152 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 153 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */     
/* 155 */     Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 156 */     Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 157 */     if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 158 */       $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 159 */       $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */     } 
/*     */     
/* 162 */     Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */     
/* 164 */     int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 165 */     ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u242 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-TaskListKt$TaskList$1$1$1$1$1$1 = 0; composer1.startReplaceGroup(1852042681); if (sortedTask.getPrettyDate() != null)
/* 166 */       TextKt.Text-bAzTDeA(sortedTask.getPrettyDate(), null, MatterhornThemeDataKt.getMatterhornTheme(composer1, 0).getInactiveTextColor(composer1, MatterhornThemeData.$stable), 0L, null, null, null, 0L, null, 0, 0L, 0, false, 0, null, null, composer1, 0, 0, 65530);  composer1.endReplaceGroup(); List actions = (List)function2.invoke(sortedTask, Integer.valueOf(list.size())); composer1.startReplaceGroup(1852052101); Composer composer2 = composer1; boolean invalid$iv = composer1.changedInstance(actions); int $i$f$cache = 0; Object it$iv = composer2.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 167 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 168 */       int $i$a$-cache-TaskListKt$TaskList$1$1$1$1$1$1$1 = 0; Object value$iv = actions::invoke$lambda$2$lambda$1$lambda$0;
/* 169 */       composer2.updateRememberedValue(value$iv);
/*     */     } 
/* 171 */     Function0 function02 = (Function0)it$iv; composer1.endReplaceGroup(); ContextMenuProvider_desktopKt.ContextMenuArea(function02, null, false, (Function2)ComposableLambdaKt.rememberComposableLambda(-111091601, true, new TaskListKt$TaskList$1$1$1$1$1$1$2(sortedTask, modifier, function1), composer1, 54), composer1, 3072, 6); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 172 */     $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 173 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 174 */     ComposerKt.sourceInformationMarkerEnd($composer);
/* 175 */     if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*     */   }
/*     */   
/*     */   private static final List invoke$lambda$2$lambda$1$lambda$0(List $actions) {
/*     */     return $actions;
/*     */   }
/*     */   
/*     */   TaskListKt$TaskList$1$1$1$1$1(long $contentBackground, Function2<SortedRecentTaskChain, Integer, List<ContextMenuItem>> $actionFactory, List<SortedRecentTaskChain> $recentTasks, Function1<TaskChainId, Unit> $onTaskDoubleClicked) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\create\TaskListKt$TaskList$1$1$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */