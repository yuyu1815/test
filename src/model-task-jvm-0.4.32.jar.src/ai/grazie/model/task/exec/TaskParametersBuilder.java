/*    */ package ai.grazie.model.task.exec;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\005¢\006\002\020\002J/\020\007\032\0020\b\"\004\b\000\020\t2\024\020\n\032\020\022\002\b\003\022\002\b\003\022\004\022\002H\t0\0132\006\020\f\032\002H\t¢\006\002\020\rJ\r\020\016\032\0020\017H\000¢\006\002\b\020R\032\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\004X\004¢\006\002\n\000¨\006\021"}, d2 = {"Lai/grazie/model/task/exec/TaskParametersBuilder;", "", "()V", "attributes", "", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "add", "", "T", "descriptor", "Lai/grazie/utils/attributes/AttributeDescriptor;", "value", "(Lai/grazie/utils/attributes/AttributeDescriptor;Ljava/lang/Object;)V", "build", "Lai/grazie/model/task/exec/TaskParameters$Default;", "build$model_task", "model-task"})
/*    */ public final class TaskParametersBuilder {
/*    */   @NotNull
/*  8 */   private final Map<Attributes.Key, Attributes.Value> attributes = new HashMap<>();
/*    */   public final <T> void add(@NotNull AttributeDescriptor descriptor, Object value) {
/*    */     Attributes.Value value1;
/* 11 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Map<Attributes.Key, Attributes.Value> map = this.attributes; Attributes.Key key = descriptor.key(); if (descriptor.value(value) == null) { descriptor.value(value); return; }  map.put(key, value1);
/*    */   } @NotNull
/*    */   public final TaskParameters.Default build$model_task() {
/* 14 */     return new TaskParameters.Default(Attributes.Companion.invoke(this.attributes));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParametersBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */