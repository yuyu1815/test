/*   */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib;
/*   */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\007\030\0002\0020\001B\035\022\b\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\026\020\002\032\004\030\0010\003X\004¢\006\b\n\000\032\004\b\b\020\tR\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityParseException;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityException;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getMessage", "()Ljava/lang/String;", "getCause", "()Ljava/lang/Throwable;", "tasks-provider-llm-prompt-velocity-model"})
/*   */ public final class VelocityParseException extends VelocityException { @Nullable
/*   */   private final String message;
/* 5 */   public VelocityParseException(@Nullable String message, @Nullable Throwable cause) { super(null); this.message = message; this.cause = cause; } @Nullable private final Throwable cause; @Nullable public String getMessage() { return this.message; } @Nullable public Throwable getCause() { return this.cause; }
/*   */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\VelocityParseException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */