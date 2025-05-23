/*    */ package ai.grazie.model.task.validation;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\003\004B\007\b\004¢\006\002\020\002\001\002\005\006¨\006\007"}, d2 = {"Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "", "()V", "Failure", "Ok", "Lai/grazie/model/task/validation/TaskSchemaValidationResult$Failure;", "Lai/grazie/model/task/validation/TaskSchemaValidationResult$Ok;", "model-task"})
/*    */ public abstract class TaskSchemaValidationResult {
/*    */   private TaskSchemaValidationResult() {}
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\b\020\003\032\0020\004H\026¨\006\005"}, d2 = {"Lai/grazie/model/task/validation/TaskSchemaValidationResult$Ok;", "Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "()V", "toString", "", "model-task"})
/* 11 */   public static final class Ok extends TaskSchemaValidationResult { private Ok() { super(null); } @NotNull public static final Ok INSTANCE = new Ok(); @NotNull
/* 12 */     public String toString() { return "Ok"; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/model/task/validation/TaskSchemaValidationResult$Failure;", "Lai/grazie/model/task/validation/TaskSchemaValidationResult;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "model-task"})
/*    */   public static final class Failure extends TaskSchemaValidationResult { @NotNull
/*    */     private final String reason;
/* 15 */     public Failure(@NotNull String reason) { super(null); this.reason = reason; } @NotNull public final String getReason() { return this.reason; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.reason;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Failure copy(@NotNull String reason) {
/*    */       Intrinsics.checkNotNullParameter(reason, "reason");
/*    */       return new Failure(reason);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Failure(reason=" + this.reason + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.reason.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Failure))
/*    */         return false; 
/*    */       Failure failure = (Failure)other;
/*    */       return !!Intrinsics.areEqual(this.reason, failure.reason);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\validation\TaskSchemaValidationResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */