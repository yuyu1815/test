/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps;
/*     */ 
/*     */ import androidx.compose.foundation.layout.Arrangement;
/*     */ import androidx.compose.foundation.layout.ColumnKt;
/*     */ import androidx.compose.foundation.layout.ColumnScope;
/*     */ import androidx.compose.foundation.layout.ColumnScopeInstance;
/*     */ import androidx.compose.foundation.layout.SizeKt;
/*     */ import androidx.compose.foundation.layout.SpacerKt;
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.ComposableTarget;
/*     */ import androidx.compose.runtime.ComposablesKt;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.CompositionLocalMap;
/*     */ import androidx.compose.runtime.Updater;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.ComposedModifierKt;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.node.ComposeUiNode;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.DisplayCommandWithActionsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.TextContainerKt;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function3;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTerminalStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,104:1\n86#2:105\n82#2,7:106\n89#2:141\n93#2:146\n79#3,6:113\n86#3,4:128\n90#3,2:138\n94#3:145\n368#4,9:119\n377#4:140\n378#4,2:143\n4034#5,6:132\n149#6:142\n*S KotlinDebug\n*F\n+ 1 TerminalStep.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/steps/TerminalStepKt$TerminalStep$4\n*L\n88#1:105\n88#1:106,7\n88#1:141\n88#1:146\n88#1:113,6\n88#1:128,4\n88#1:138,2\n88#1:145\n88#1:119,9\n88#1:140\n88#1:143,2\n88#1:132,6\n94#1:142\n*E\n"})
/*     */ final class TerminalStepKt$TerminalStep$4
/*     */   implements Function3<ColumnScope, Composer, Integer, Unit>
/*     */ {
/*     */   @Composable
/*     */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*     */   public final void invoke(ColumnScope $this$StepCard, Composer $composer, int $changed) {
/*  88 */     Intrinsics.checkNotNullParameter($this$StepCard, "$this$StepCard"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(181515142, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.steps.TerminalStep.<anonymous> (TerminalStep.kt:87)");  String str1 = this.$command; List<String> list = this.$actionNames; Function1<Integer, Unit> function1 = this.$onActionClick; String str2 = this.$description; int $changed$iv = 0, $i$f$Column = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
/* 106 */       Modifier modifier$iv = (Modifier)Modifier.Companion;
/* 107 */       Arrangement.Vertical verticalArrangement$iv = Arrangement.INSTANCE.getTop();
/* 108 */       Alignment.Horizontal horizontalAlignment$iv = Alignment.Companion.getStart();
/*     */ 
/*     */       
/* 111 */       MeasurePolicy measurePolicy$iv = ColumnKt.columnMeasurePolicy(verticalArrangement$iv, horizontalAlignment$iv, $composer, 0xE & $changed$iv >> 3 | 0x70 & $changed$iv >> 3); int $changed$iv$iv = 0x70 & $changed$iv << 3;
/* 112 */       int $i$f$Layout = 0;
/* 113 */       ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/* 114 */       int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/* 115 */       CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/* 116 */       Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier$iv);
/*     */       
/* 118 */       Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0;
/* 119 */       ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/* 120 */       if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer
/* 121 */         .startReusableNode();
/* 122 */       if ($composer.getInserting()) { $composer
/* 123 */           .createNode(function0); } else { $composer
/*     */           
/* 125 */           .useNode(); }
/*     */       
/* 127 */       Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/* 128 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/* 129 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*     */       
/* 131 */       Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0;
/* 132 */       Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/* 133 */       if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/* 134 */         $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/* 135 */         $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*     */       } 
/*     */       
/* 138 */       Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*     */       
/* 140 */       int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-ColumnKt$Column$1$iv = 0;
/* 141 */       ComposerKt.sourceInformationMarkerStart($composer$iv, -384784025, "C88@4444L9:Column.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; ColumnScope $this$invoke_u24lambda_u240 = (ColumnScope)ColumnScopeInstance.INSTANCE; int $i$a$-Column-TerminalStepKt$TerminalStep$4$1 = 0; DisplayCommandWithActionsKt.DisplayCommandWithActions(str1, null, list, function1, composer1, 0, 2); int $this$dp$iv = 8, $i$f$getDp = 0;
/* 142 */       SpacerKt.Spacer(SizeKt.height-3ABfNKs((Modifier)Modifier.Companion, Dp.constructor-impl($this$dp$iv)), composer1, 6); TextContainerKt.TextContainer(str2, composer1, 0); ComposerKt.sourceInformationMarkerEnd($composer$iv);
/* 143 */       $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer);
/* 144 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 145 */       ComposerKt.sourceInformationMarkerEnd($composer);
/* 146 */       if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*     */     else
/*     */     { $composer.skipToGroupEnd(); }
/*     */   
/*     */   }
/*     */   
/*     */   TerminalStepKt$TerminalStep$4(String $command, List<String> $actionNames, Function1<Integer, Unit> $onActionClick, String $description) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\standalone.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\steps\TerminalStepKt$TerminalStep$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */