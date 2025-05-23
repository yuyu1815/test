/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\nH\002J\b\020\013\032\0020\fH\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\r"}, d2 = {"Lai/grazie/model/task/exec/TaskParameters$Default;", "Lai/grazie/model/task/exec/TaskParameters;", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)V", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "equals", "", "other", "", "hashCode", "", "model-task"})
/*    */ public final class Default
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   public Default(@NotNull Attributes attributes) {
/* 36 */     this.attributes = attributes; } @NotNull public Attributes getAttributes() { return this.attributes; }
/*    */    public boolean equals(@Nullable Object other) {
/* 38 */     if (this == other) return true; 
/* 39 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 41 */     (Default)other;
/*    */     
/* 43 */     return Intrinsics.areEqual(getAttributes(), ((Default)other).getAttributes());
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 47 */     return getAttributes().hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParameters$Default.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */