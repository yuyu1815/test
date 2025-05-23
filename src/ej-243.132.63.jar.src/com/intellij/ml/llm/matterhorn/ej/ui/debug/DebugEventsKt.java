/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*     */ 
/*     */ import androidx.compose.runtime.SnapshotStateKt;
/*     */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.EventType;
/*     */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContextFileLoggingListener;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import java.util.UUID;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\032\036\020\002\032\b\022\004\022\0020\0040\0032\020\020\005\032\f\022\b\022\0060\001j\002`\0070\006*\n\020\000\"\0020\0012\0020\001¨\006\b"}, d2 = {"LogEntry", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContextFileLoggingListener$LogEntry;", "buildEventTree", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "entries", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/LogEntry;", "ej-ui"})
/*     */ public final class DebugEventsKt
/*     */ {
/*     */   @NotNull
/*     */   public static final SnapshotStateList<EventNode> buildEventTree(@NotNull List entries) {
/*  46 */     Intrinsics.checkNotNullParameter(entries, "entries"); SnapshotStateList<EventNode> rootNodes = SnapshotStateKt.mutableStateListOf();
/*  47 */     List<Pair> stack = new ArrayList();
/*     */     
/*  49 */     for (RootExecutionContextFileLoggingListener.LogEntry entry : entries) {
/*  50 */       CustomArtifactEvent event = entry.getEventOrCastSerializedOrNull();
/*     */       
/*  52 */       CustomArtifactEvent customArtifactEvent1 = event;
/*  53 */       if (customArtifactEvent1 != null) {
/*  54 */         if (customArtifactEvent1 instanceof PairedGroupEvent) {
/*  55 */           String str; GroupEndNode groupEndNode; GroupStartNode groupStartNode; switch (WhenMappings.$EnumSwitchMapping$0[((PairedGroupEvent)event).getType().ordinal()]) {
/*     */             
/*     */             case 1:
/*  58 */               Intrinsics.checkNotNullExpressionValue(UUID.randomUUID().toString(), "toString(...)"); str = UUID.randomUUID().toString();
/*  59 */               groupStartNode = new GroupStartNode(
/*  60 */                   str, (
/*  61 */                   (PairedGroupEvent)event).getGroupKey(), 
/*  62 */                   (PairedGroupEvent)event, 
/*  63 */                   entry.getTimestampMs(), null, null, null, 112, null);
/*     */               
/*  65 */               (!stack.isEmpty()) ? (
/*     */                 
/*  67 */                 (GroupStartNode)((Pair)CollectionsKt.last(stack)).getFirst()).getChildren().add(groupStartNode) : 
/*     */ 
/*     */                 
/*  70 */                 rootNodes.add(groupStartNode);
/*     */ 
/*     */               
/*  73 */               stack.add(new Pair(groupStartNode, str));
/*     */               continue;
/*     */             
/*     */             case 2:
/*  77 */               groupEndNode = null;
/*  78 */               if (!stack.isEmpty()) {
/*  79 */                 Pair pair = stack.remove(stack.size() - 1); GroupStartNode startNode = (GroupStartNode)pair.component1(); String str1 = (String)pair.component2();
/*  80 */                 groupEndNode = new GroupEndNode(
/*  81 */                     str1, (
/*  82 */                     (PairedGroupEvent)event).getGroupKey(), 
/*  83 */                     (PairedGroupEvent)event, 
/*  84 */                     entry.getTimestampMs());
/*     */ 
/*     */                 
/*  87 */                 startNode.getEndNode().setValue(groupEndNode);
/*     */                 
/*     */                 continue;
/*     */               } 
/*     */               
/*  92 */               Intrinsics.checkNotNullExpressionValue(UUID.randomUUID().toString(), "toString(...)"); groupEndNode = new GroupEndNode(UUID.randomUUID().toString(), (
/*  93 */                   (PairedGroupEvent)event).getGroupKey(), 
/*  94 */                   (PairedGroupEvent)event, 
/*  95 */                   entry.getTimestampMs());
/*     */               
/*  97 */               rootNodes.add(groupEndNode);
/*     */               continue;
/*     */           } 
/*     */ 
/*     */           
/*     */           throw new NoWhenBranchMatchedException();
/*     */         } 
/* 104 */         String groupId = (!stack.isEmpty()) ? (String)((Pair)CollectionsKt.last(stack)).getSecond() : null;
/* 105 */         SimpleEventNode node = new SimpleEventNode(
/* 106 */             groupId, 
/* 107 */             event, 
/* 108 */             entry.getTimestampMs());
/*     */         
/* 110 */         (!stack.isEmpty()) ? (
/* 111 */           (GroupStartNode)((Pair)CollectionsKt.last(stack)).getFirst()).getChildren().add(node) : 
/*     */           
/* 113 */           rootNodes.add(node);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     while (!stack.isEmpty()) {
/* 121 */       GroupStartNode unmatchedStartNode = (GroupStartNode)((Pair)stack.remove(stack.size() - 1)).component1();
/* 122 */       rootNodes.add(unmatchedStartNode);
/*     */     } 
/*     */     
/* 125 */     return rootNodes;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */