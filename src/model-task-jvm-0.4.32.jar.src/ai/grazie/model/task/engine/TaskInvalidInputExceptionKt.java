/*    */ package ai.grazie.model.task.engine;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\016\n\000\n\002\020\001\n\002\b\002\n\002\020\003\n\000\032'\020\000\032\0020\0012\006\020\002\032\0020\0032\f\020\004\032\b\022\004\022\0020\0060\005\002\b\n\006\b\000\032\002\020\001\032\034\020\007\032\0020\b2\b\020\t\032\004\030\0010\0062\n\b\002\020\n\032\004\030\0010\013¨\006\f"}, d2 = {"requireOrTaskInvalidInputException", "", "value", "", "description", "Lkotlin/Function0;", "", "taskInvalidInputException", "", "message", "cause", "", "model-task"})
/*    */ public final class TaskInvalidInputExceptionKt {
/*    */   @NotNull
/*    */   public static final Void taskInvalidInputException(@Nullable String message, @Nullable Throwable cause) {
/* 11 */     throw new TaskInvalidInputException(message, cause);
/*    */   }
/*    */   public static final void requireOrTaskInvalidInputException(boolean value, @NotNull Function0 description) {
/* 14 */     Intrinsics.checkNotNullParameter(description, "description");
/*    */ 
/*    */     
/* 17 */     if (!value) { taskInvalidInputException$default((String)description.invoke(), null, 2, null); throw new KotlinNothingValueException(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\TaskInvalidInputExceptionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */