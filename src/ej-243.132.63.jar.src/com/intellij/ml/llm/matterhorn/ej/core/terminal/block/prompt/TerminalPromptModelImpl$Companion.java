/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.HighlightingInfo;
/*     */ import com.intellij.openapi.editor.RangeMarker;
/*     */ import com.intellij.openapi.editor.ex.DocumentEx;
/*     */ import com.intellij.openapi.editor.markup.HighlighterTargetArea;
/*     */ import com.intellij.openapi.editor.markup.MarkupModel;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\037\020\004\032\0020\005*\0020\0062\f\020\007\032\b\022\004\022\0020\t0\bH\000¢\006\002\b\nJ\031\020\013\032\0020\005*\0020\0062\006\020\f\032\0020\tH\000¢\006\002\b\rJ\f\020\016\032\0020\005*\0020\017H\002¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion;", "", "<init>", "()V", "replaceHighlighters", "", "Lcom/intellij/openapi/editor/markup/MarkupModel;", "highlightings", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "replaceHighlighters$ej_core", "applyHighlighting", "highlighting", "applyHighlighting$ej_core", "clearGuardedBlocks", "Lcom/intellij/openapi/editor/ex/DocumentEx;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalPromptModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,186:1\n1863#2,2:187\n1863#2,2:189\n*S KotlinDebug\n*F\n+ 1 TerminalPromptModelImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptModelImpl$Companion\n*L\n172#1:187,2\n183#1:189,2\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   public final void replaceHighlighters$ej_core(@NotNull MarkupModel $this$replaceHighlighters, @NotNull List highlightings) {
/* 171 */     Intrinsics.checkNotNullParameter($this$replaceHighlighters, "<this>"); Intrinsics.checkNotNullParameter(highlightings, "highlightings"); $this$replaceHighlighters.removeAllHighlighters();
/* 172 */     Iterable $this$forEach$iv = highlightings; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 187 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); HighlightingInfo it = (HighlightingInfo)element$iv; int $i$a$-forEach-TerminalPromptModelImpl$Companion$replaceHighlighters$1 = 0; TerminalPromptModelImpl.Companion.applyHighlighting$ej_core($this$replaceHighlighters, it); }
/*     */      } private final void clearGuardedBlocks(DocumentEx $this$clearGuardedBlocks) { Intrinsics.checkNotNullExpressionValue($this$clearGuardedBlocks.getGuardedBlocks(), "getGuardedBlocks(...)"); Iterable $this$forEach$iv = $this$clearGuardedBlocks.getGuardedBlocks(); int $i$f$forEach = 0;
/* 189 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); RangeMarker it = (RangeMarker)element$iv; int $i$a$-forEach-TerminalPromptModelImpl$Companion$clearGuardedBlocks$1 = 0;
/*     */       $this$clearGuardedBlocks.removeGuardedBlock(it); }
/*     */      }
/*     */ 
/*     */   
/*     */   public final void applyHighlighting$ej_core(@NotNull MarkupModel $this$applyHighlighting, @NotNull HighlightingInfo highlighting) {
/*     */     Intrinsics.checkNotNullParameter($this$applyHighlighting, "<this>");
/*     */     Intrinsics.checkNotNullParameter(highlighting, "highlighting");
/*     */     $this$applyHighlighting.addRangeHighlighter(highlighting.getStartOffset(), highlighting.getEndOffset(), 1000, highlighting.getTextAttributesProvider().getTextAttributes(), HighlighterTargetArea.EXACT_RANGE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptModelImpl$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */