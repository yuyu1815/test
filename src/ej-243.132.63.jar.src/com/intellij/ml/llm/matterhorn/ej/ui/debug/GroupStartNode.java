/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import androidx.compose.runtime.snapshots.SnapshotStateList;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\021\b\007\030\0002\0020\001B[\022\b\b\002\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\016\b\002\020\t\032\b\022\004\022\0020\0010\n\022\020\b\002\020\013\032\n\022\006\022\004\030\0010\r0\f\022\016\b\002\020\016\032\b\022\004\022\0020\0170\f¢\006\004\b\020\020\021R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\024\020\023R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\025\020\026R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\027\020\030R\027\020\t\032\b\022\004\022\0020\0010\n¢\006\b\n\000\032\004\b\031\020\032R\031\020\013\032\n\022\006\022\004\030\0010\r0\f¢\006\b\n\000\032\004\b\033\020\034R \020\016\032\b\022\004\022\0020\0170\fX\016¢\006\016\n\000\032\004\b\035\020\034\"\004\b\036\020\037¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupStartNode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "groupId", "", "groupKey", "event", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "timestamp", "", "children", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "endNode", "Landroidx/compose/runtime/MutableState;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode;", "expanded", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;JLandroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "getGroupId", "()Ljava/lang/String;", "getGroupKey", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "getTimestamp", "()J", "getChildren", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getEndNode", "()Landroidx/compose/runtime/MutableState;", "getExpanded", "setExpanded", "(Landroidx/compose/runtime/MutableState;)V", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class GroupStartNode extends EventNode {
/*    */   @NotNull
/*    */   private final String groupId;
/*    */   @NotNull
/*    */   private final String groupKey;
/*    */   @NotNull
/*    */   private final PairedGroupEvent event;
/*    */   private final long timestamp;
/*    */   
/*    */   @NotNull
/* 21 */   public String getGroupId() { return this.groupId; } @NotNull private final SnapshotStateList<EventNode> children; @NotNull private final MutableState<GroupEndNode> endNode; @NotNull private MutableState<Boolean> expanded; public static final int $stable = 8; @NotNull
/* 22 */   public final String getGroupKey() { return this.groupKey; } @NotNull
/* 23 */   public PairedGroupEvent getEvent() { return this.event; }
/* 24 */   public final long getTimestamp() { return this.timestamp; } @NotNull
/* 25 */   public final SnapshotStateList<EventNode> getChildren() { return this.children; } @NotNull
/* 26 */   public final MutableState<GroupEndNode> getEndNode() { return this.endNode; } @NotNull
/* 27 */   public final MutableState<Boolean> getExpanded() { return this.expanded; } public final void setExpanded(@NotNull MutableState<Boolean> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.expanded = <set-?>; } public GroupStartNode(@NotNull String groupId, @NotNull String groupKey, @NotNull PairedGroupEvent event, long timestamp, @NotNull SnapshotStateList<EventNode> children, @NotNull MutableState<GroupEndNode> endNode, @NotNull MutableState<Boolean> expanded) {
/* 28 */     super(null);
/*    */     this.groupId = groupId;
/*    */     this.groupKey = groupKey;
/*    */     this.event = event;
/*    */     this.timestamp = timestamp;
/*    */     this.children = children;
/*    */     this.endNode = endNode;
/*    */     this.expanded = expanded;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\GroupStartNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */