/*     */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentObservation;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\013\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020$\n\000\n\002\020\"\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\022\032\004\030\0010\b2\006\020\023\032\0020\024J\032\020\025\032\b\022\004\022\0020\b0\0262\f\020\027\032\b\022\004\022\0020\0240\026J\032\020\030\032\b\022\004\022\0020\b0\0262\f\020\027\032\b\022\004\022\0020\0240\026J0\020\031\032\016\022\004\022\0020\b\022\004\022\0020\b0\0322\f\020\027\032\b\022\004\022\0020\0240\0262\016\b\002\020\033\032\b\022\004\022\0020\b0\034J\020\020\037\032\0020\0362\006\020\023\032\0020\024H\002R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000R\016\020\n\032\0020\bXT¢\006\002\n\000R\016\020\013\032\0020\bXT¢\006\002\n\000R\016\020\f\032\0020\bXT¢\006\002\n\000R\016\020\r\032\0020\bXT¢\006\002\n\000R\016\020\016\032\0020\bXT¢\006\002\n\000R\016\020\017\032\0020\bXT¢\006\002\n\000R\016\020\020\032\0020\bXT¢\006\002\n\000R\016\020\021\032\0020\bXT¢\006\002\n\000R\032\020\035\032\016\022\004\022\0020\b\022\004\022\0020\0360\032X\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;", "", "<init>", "()V", "MERGE_CODE_THRESHOLD", "", "NUM_MESSAGES_TO_SHOW", "HISTORY_PROCESSOR_PREFIX", "", "PROCESSED_SHOWN_CODE", "PROCESSED_CREATED_CODE", "PROCESSED_START", "PROCESSED_CHANGES", "PROCESSED_ISSUES", "PROCESSED_OTHER", "PROCESSOR_INITIAL_MESSAGE", "PROCESSOR_RESET_PLAN", "PROCESSOR_CREATED_CODE_MESSAGE", "extractCommand", "message", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "extractCreatedFilePaths", "", "messages", "extractEditedFilePaths", "extractProcessedOther", "", "newProcessedCommands", "", "actionToGroup", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;", "getActionGroup", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCompressHistoryProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,567:1\n774#2:568\n865#2,2:569\n1381#2:571\n1469#2,5:572\n774#2:577\n865#2,2:578\n1381#2:580\n1469#2,5:581\n774#2:586\n865#2,2:587\n1863#2:589\n1557#2:590\n1628#2,3:591\n774#2:594\n865#2,2:595\n1863#2,2:597\n1864#2:599\n1#3:600\n*S KotlinDebug\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion\n*L\n88#1:568\n88#1:569,2\n93#1:571\n93#1:572,5\n102#1:577\n102#1:578,2\n103#1:580\n103#1:581,5\n115#1:586\n115#1:587,2\n116#1:589\n118#1:590\n118#1:591,3\n119#1:594\n119#1:595,2\n120#1:597,2\n116#1:599\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @Nullable
/*     */   public final String extractCommand(@NotNull AgentObservation message) {
/*  80 */     Intrinsics.checkNotNullParameter(message, "message"); if (message.getElement().getKind() != MatterhornChatMessageKind.Assistant) return null; 
/*  81 */     String command = ExtractorUtilsKt.getTextByXMLTag(message.getElement().getContent(), "COMMAND");
/*  82 */     return StringsKt.isBlank(command) ? null : command;
/*     */   }
/*     */   
/*     */   @NotNull
/*  86 */   public final List<String> extractCreatedFilePaths(@NotNull List messages) { Intrinsics.checkNotNullParameter(messages, "messages"); Regex filePathRegex = new Regex("\\[File: ([^(]+).*");
/*  87 */     List list1 = messages;
/*  88 */     int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 568 */     List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 569 */     for (Object element$iv$iv : list2) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractCreatedFilePaths$1 = 0; if ((StringsKt.contains$default(it.getElement().getContent(), "File created.", false, 2, null) || StringsKt.contains$default(it.getElement().getContent(), "During the current session, you have created the following code:", false, 2, null))) collection.add(element$iv$iv);  }
/* 570 */      Iterable $this$filter$iv = collection; int $i$f$flatMapSequence = 0;
/* 571 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapSequenceTo = 0;
/* 572 */     for (Object element$iv$iv : $this$filterTo$iv$iv) {
/* 573 */       AgentObservation message = (AgentObservation)element$iv$iv; int $i$a$-flatMapSequence-CompressHistoryProcessor$Companion$extractCreatedFilePaths$2 = 0; Sequence list$iv$iv = SequencesKt.map(Regex.findAll$default(filePathRegex, message.getElement().getContent(), 0, 2, null), Companion::extractCreatedFilePaths$lambda$2$lambda$1);
/* 574 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */     } 
/* 576 */     return CollectionsKt.distinct(destination$iv$iv); } private static final String extractCreatedFilePaths$lambda$2$lambda$1(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.trim(it.getGroupValues().get(1)).toString(); }
/* 577 */   @NotNull public final List<String> extractEditedFilePaths(@NotNull List messages) { Intrinsics.checkNotNullParameter(messages, "messages"); Regex filePathRegex = new Regex("\\[File: ([^(]+).*"); List list1 = messages; int $i$f$filter = 0; List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 578 */     for (Object element$iv$iv : list2) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractEditedFilePaths$1 = 0; if (StringsKt.contains$default(it.getElement().getContent(), "File updated.", false, 2, null)) collection.add(element$iv$iv);  }
/* 579 */      Iterable $this$filter$iv = collection; int $i$f$flatMapSequence = 0;
/* 580 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapSequenceTo = 0;
/* 581 */     for (Object element$iv$iv : $this$filterTo$iv$iv) {
/* 582 */       AgentObservation message = (AgentObservation)element$iv$iv; int $i$a$-flatMapSequence-CompressHistoryProcessor$Companion$extractEditedFilePaths$2 = 0; Sequence list$iv$iv = SequencesKt.map(Regex.findAll$default(filePathRegex, message.getElement().getContent(), 0, 2, null), Companion::extractEditedFilePaths$lambda$5$lambda$4);
/* 583 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */     } 
/* 585 */     return CollectionsKt.distinct(destination$iv$iv); } @NotNull public final Map<String, String> extractProcessedOther(@NotNull List messages, @NotNull Set newProcessedCommands) { Intrinsics.checkNotNullParameter(messages, "messages"); Intrinsics.checkNotNullParameter(newProcessedCommands, "newProcessedCommands"); Map<Object, Object> result = new LinkedHashMap<>(); Iterable $this$filter$iv = messages; int $i$f$filter = 0;
/* 586 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 587 */     for (Object element$iv$iv : iterable1) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractProcessedOther$1 = 0; if (Intrinsics.areEqual(it.getAction(), "processed_other")) destination$iv$iv.add(element$iv$iv);  }
/* 588 */      $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 589 */     Iterator iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AgentObservation message = (AgentObservation)element$iv; int $i$a$-forEach-CompressHistoryProcessor$Companion$extractProcessedOther$2 = 0; List list1 = StringsKt.lines(message.getElement().getContent()); int $i$f$map = 0;
/* 590 */       List list2 = list1; Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 591 */       Iterator iterator1 = list2.iterator(); }
/*     */     
/*     */     return (Map)result; }
/*     */   private static final String extractEditedFilePaths$lambda$5$lambda$4(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it");
/*     */     return StringsKt.trim(it.getGroupValues().get(1)).toString(); } private final ActionGroup getActionGroup(AgentObservation message) {
/*     */     if (message.getAction() != null) {
/*     */       Intrinsics.checkNotNullExpressionValue(message.getAction().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */       if (message.getAction().toLowerCase(Locale.ROOT) != null) {
/*     */         String it = message.getAction().toLowerCase(Locale.ROOT);
/* 600 */         int $i$a$-let-CompressHistoryProcessor$Companion$getActionGroup$1 = 0;
/*     */         if ((ActionGroup)CompressHistoryProcessor.access$getActionToGroup$cp().get(it) == null) {
/*     */           (ActionGroup)CompressHistoryProcessor.access$getActionToGroup$cp().get(it);
/*     */           return ActionGroup.OTHER;
/*     */         } 
/*     */         return (ActionGroup)CompressHistoryProcessor.access$getActionToGroup$cp().get(it);
/*     */       } 
/*     */     } 
/*     */     (ActionGroup)CompressHistoryProcessor.access$getActionToGroup$cp().get(it);
/*     */     return ActionGroup.OTHER;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessor$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */