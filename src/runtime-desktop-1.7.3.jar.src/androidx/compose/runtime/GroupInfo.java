/*    */ package androidx.compose.runtime;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\f\b\002\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\032\020\005\032\0020\003X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\004\032\0020\003X\016¢\006\016\n\000\032\004\b\013\020\b\"\004\b\f\020\nR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\r\020\b\"\004\b\016\020\n¨\006\017"}, d2 = {"Landroidx/compose/runtime/GroupInfo;", "", "slotIndex", "", "nodeIndex", "nodeCount", "(III)V", "getNodeCount", "()I", "setNodeCount", "(I)V", "getNodeIndex", "setNodeIndex", "getSlotIndex", "setSlotIndex", "runtime"})
/*    */ final class GroupInfo
/*    */ {
/*    */   private int slotIndex;
/*    */   private int nodeIndex;
/*    */   private int nodeCount;
/*    */   
/*    */   public final int getSlotIndex() {
/*    */     return this.slotIndex;
/*    */   }
/*    */   
/*    */   public final void setSlotIndex(int <set-?>) {
/*    */     this.slotIndex = <set-?>;
/*    */   }
/*    */   
/*    */   public final int getNodeIndex() {
/*    */     return this.nodeIndex;
/*    */   }
/*    */   
/*    */   public final void setNodeIndex(int <set-?>) {
/*    */     this.nodeIndex = <set-?>;
/*    */   }
/*    */   
/*    */   public GroupInfo(int slotIndex, int nodeIndex, int nodeCount) {
/* 52 */     this.slotIndex = slotIndex;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 58 */     this.nodeIndex = nodeIndex;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     this.nodeCount = nodeCount; } public final int getNodeCount() { return this.nodeCount; } public final void setNodeCount(int <set-?>) { this.nodeCount = <set-?>; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\GroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */