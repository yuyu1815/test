/*   */ package ai.grazie.model.task.engine;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\006\030\0002\0060\001j\002`\002B\033\022\b\020\003\032\004\030\0010\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\002\020\007R\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\b\020\tR\026\020\003\032\004\030\0010\004X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/model/task/engine/TaskInvalidInputException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getMessage", "()Ljava/lang/String;", "model-task"})
/*   */ public final class TaskInvalidInputException extends RuntimeException {
/*   */   @Nullable
/*   */   private final String message;
/*   */   
/* 9 */   public TaskInvalidInputException(@Nullable String message, @Nullable Throwable cause) { this.message = message; this.cause = cause; } @Nullable private final Throwable cause; @Nullable public String getMessage() { return this.message; } @Nullable public Throwable getCause() { return this.cause; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TaskInvalidInputException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */