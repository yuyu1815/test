/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\032\022\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\000\032 \020\004\032\b\022\004\022\0020\0050\002*\b\022\004\022\0020\0050\0022\006\020\006\032\0020\007H\000¨\006\b"}, d2 = {"toTextWithHighlightings", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithHighlightings;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TextWithAttributes;", "rebase", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/HighlightingInfo;", "adjustmentValue", "", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalTextHighlighter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalTextHighlighter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1557#2:110\n1628#2,3:111\n*S KotlinDebug\n*F\n+ 1 TerminalTextHighlighter.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalTextHighlighterKt\n*L\n61#1:110\n61#1:111,3\n*E\n"})
/*     */ public final class TerminalTextHighlighterKt
/*     */ {
/*     */   @NotNull
/*     */   public static final TextWithHighlightings toTextWithHighlightings(@NotNull List $this$toTextWithHighlightings) {
/*  49 */     Intrinsics.checkNotNullParameter($this$toTextWithHighlightings, "<this>"); StringBuilder builder = new StringBuilder();
/*  50 */     List<HighlightingInfo> highlightings = new ArrayList();
/*  51 */     for (TextWithAttributes component : $this$toTextWithHighlightings) {
/*  52 */       int startOffset = builder.length();
/*  53 */       builder.append(component.getText());
/*  54 */       highlightings.add(new HighlightingInfo(startOffset, builder.length(), component.getAttributes()));
/*     */     } 
/*  56 */     Intrinsics.checkNotNullExpressionValue(builder.toString(), "toString(...)"); return new TextWithHighlightings(builder.toString(), highlightings);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final List<HighlightingInfo> rebase(@NotNull List $this$rebase, int adjustmentValue) {
/*  61 */     Intrinsics.checkNotNullParameter($this$rebase, "<this>"); Iterable $this$map$iv = $this$rebase; int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     Iterable iterable1 = $this$map$iv; Collection<HighlightingInfo> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 111 */     for (Object item$iv$iv : iterable1) {
/* 112 */       HighlightingInfo highlightingInfo = (HighlightingInfo)item$iv$iv; Collection<HighlightingInfo> collection = destination$iv$iv; int $i$a$-map-TerminalTextHighlighterKt$rebase$1 = 0; collection.add(new HighlightingInfo(adjustmentValue + highlightingInfo.getStartOffset(), adjustmentValue + highlightingInfo.getEndOffset(), highlightingInfo.getTextAttributesProvider()));
/* 113 */     }  return (List<HighlightingInfo>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalTextHighlighterKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */