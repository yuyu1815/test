/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\t\b\007\030\0002\0020\001B!\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tR\026\020\002\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/SimpleEventNode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/EventNode;", "groupId", "", "event", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "timestamp", "", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;J)V", "getGroupId", "()Ljava/lang/String;", "getEvent", "()Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "getTimestamp", "()J", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class SimpleEventNode
/*    */   extends EventNode
/*    */ {
/*    */   @Nullable
/*    */   private final String groupId;
/*    */   @NotNull
/*    */   private final CustomArtifactEvent event;
/*    */   private final long timestamp;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @Nullable
/*    */   public String getGroupId() {
/* 38 */     return this.groupId; } @NotNull
/* 39 */   public CustomArtifactEvent getEvent() { return this.event; }
/* 40 */   public final long getTimestamp() { return this.timestamp; } public SimpleEventNode(@Nullable String groupId, @NotNull CustomArtifactEvent event, long timestamp) {
/* 41 */     super(null);
/*    */     this.groupId = groupId;
/*    */     this.event = event;
/*    */     this.timestamp = timestamp;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\SimpleEventNode.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */