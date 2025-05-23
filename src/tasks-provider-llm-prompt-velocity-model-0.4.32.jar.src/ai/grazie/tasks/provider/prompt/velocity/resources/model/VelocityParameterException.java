/*   */ package ai.grazie.tasks.provider.prompt.velocity.resources.model;
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\007\b\026\030\0002\0060\001j\002`\002B\035\022\b\020\003\032\004\030\0010\004\022\n\b\002\020\005\032\004\030\0010\006¢\006\004\b\007\020\bR\026\020\003\032\004\030\0010\004X\004¢\006\b\n\000\032\004\b\t\020\nR\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityParameterException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "tasks-provider-llm-prompt-velocity-model"})
/*   */ public class VelocityParameterException extends RuntimeException { @Nullable
/*   */   private final String message;
/*   */   
/* 6 */   public VelocityParameterException(@Nullable String message, @Nullable Throwable cause) { super(message, cause); this.message = message; this.cause = cause; } @Nullable private final Throwable cause; @Nullable public String getMessage() { return this.message; } @Nullable public Throwable getCause() { return this.cause; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityParameterException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */