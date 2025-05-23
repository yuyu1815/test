/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/id/TaskTag$Companion;", "", "()V", "Default", "Lai/grazie/model/task/id/TaskTag;", "getDefault", "()Lai/grazie/model/task/id/TaskTag;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<TaskTag> serializer() {
/* 32 */     return (KSerializer<TaskTag>)TaskTag.Serializer.INSTANCE;
/*    */   }
/*    */   @NotNull
/*    */   public final TaskTag getDefault() {
/* 36 */     return TaskTag.access$getDefault$cp();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskTag$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */