/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;
/*    */ import androidx.compose.foundation.layout.BoxKt;
/*    */ import androidx.compose.foundation.layout.BoxScope;
/*    */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*    */ import androidx.compose.foundation.layout.FlowRowScope;
/*    */ import androidx.compose.foundation.layout.PaddingKt;
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.ComposablesKt;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.runtime.CompositionLocalMap;
/*    */ import androidx.compose.runtime.Updater;
/*    */ import androidx.compose.ui.Alignment;
/*    */ import androidx.compose.ui.ComposedModifierKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import androidx.compose.ui.layout.MeasurePolicy;
/*    */ import androidx.compose.ui.node.ComposeUiNode;
/*    */ import androidx.compose.ui.unit.Dp;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFile;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.jewel.ui.component.TextKt;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ @SourceDebugExtension({"SMAP\nPrompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1872#2,3:56\n*S KotlinDebug\n*F\n+ 1 Prompt.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/PromptKt$showFileAttachments$1\n*L\n41#1:56,3\n*E\n"})
/*    */ final class PromptKt$showFileAttachments$1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(FlowRowScope $this$FlowRow, Composer $composer, int $changed) {
/*    */     int index$iv;
/*    */     Iterator<AttachedFile> iterator;
/* 41 */     Intrinsics.checkNotNullParameter($this$FlowRow, "$this$FlowRow"); if (($changed & 0x11) != 16 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1721144753, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.showFileAttachments.<anonymous> (Prompt.kt:40)");  Iterable<AttachedFile> $this$forEachIndexed$iv = this.$attachedFiles; int $i$f$forEachIndexed = 0;
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
/* 56 */       index$iv = 0;
/* 57 */       iterator = $this$forEachIndexed$iv.iterator(); } else { $composer.skipToGroupEnd(); return; }  if (iterator.hasNext()) { Object item$iv = iterator.next(); int i = index$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  AttachedFile attachedFile = (AttachedFile)item$iv; int index = i, $i$a$-forEachIndexed-PromptKt$showFileAttachments$1$1 = 0; }
/* 58 */      if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd(); 
/*    */   }
/*    */   
/*    */   PromptKt$showFileAttachments$1(List<AttachedFile> $attachedFiles) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\PromptKt$showFileAttachments$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */