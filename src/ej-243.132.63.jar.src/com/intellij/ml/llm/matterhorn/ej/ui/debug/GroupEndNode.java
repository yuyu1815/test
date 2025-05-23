/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.PairedGroupEvent;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\b\n\b\007\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\004\b\t\020\nR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/GroupEndNode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "groupId", "", "groupKey", "event", "Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;J)V", "getGroupId", "()Ljava/lang/String;", "getGroupKey", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/PairedGroupEvent;", "getTimestamp", "()J", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class GroupEndNode
/*    */   extends EventNode
/*    */ {
/*    */   @NotNull
/*    */   private final String groupId;
/*    */   @NotNull
/*    */   private final String groupKey;
/*    */   @NotNull
/*    */   private final PairedGroupEvent event;
/*    */   private final long timestamp;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public String getGroupId() {
/* 31 */     return this.groupId; } @NotNull
/* 32 */   public final String getGroupKey() { return this.groupKey; } @NotNull
/* 33 */   public PairedGroupEvent getEvent() { return this.event; }
/* 34 */   public final long getTimestamp() { return this.timestamp; } public GroupEndNode(@NotNull String groupId, @NotNull String groupKey, @NotNull PairedGroupEvent event, long timestamp) {
/* 35 */     super(null);
/*    */     this.groupId = groupId;
/*    */     this.groupKey = groupKey;
/*    */     this.event = event;
/*    */     this.timestamp = timestamp;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\GroupEndNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */