/*    */ package ai.grazie.model.task.engine;
/*    */ 
/*    */ import ai.grazie.model.task.Task;
/*    */ import ai.grazie.model.task.TaskKt;
/*    */ import ai.grazie.model.task.data.v3.TaskStreamData;
/*    */ import ai.grazie.utils.data.DataHolder;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0202\0020\001:\001\020B\005¢\006\002\020\002J\036\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH@¢\006\002\020\tJ,\020\n\032\b\022\004\022\0020\f0\0132\006\020\005\032\0020\0062\006\020\r\032\0020\0162\006\020\007\032\0020\bH@¢\006\002\020\017¨\006\021"}, d2 = {"Lai/grazie/model/task/engine/AggregatedTasksExecutor;", "Lai/grazie/model/task/engine/TasksExecutor;", "()V", "canExecute", "", "task", "Lai/grazie/model/task/Task;", "context", "Lai/grazie/model/task/engine/TaskExecutionContext;", "(Lai/grazie/model/task/Task;Lai/grazie/model/task/engine/TaskExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/task/data/v3/TaskStreamData;", "parameters", "Lai/grazie/utils/data/DataHolder;", "(Lai/grazie/model/task/Task;Lai/grazie/utils/data/DataHolder;Lai/grazie/model/task/engine/TaskExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "model-task"})
/*    */ public final class AggregatedTasksExecutor
/*    */   implements TasksExecutor
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Nullable
/*    */   public Object canExecute(@NotNull Task task, @NotNull TaskExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/model/task/engine/AggregatedTasksExecutor$canExecute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/model/task/engine/AggregatedTasksExecutor$canExecute$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/task/engine/AggregatedTasksExecutor$canExecute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/task/engine/AggregatedTasksExecutor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #6
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 167, 0 -> 88, 1 -> 145
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: instanceof ai/grazie/model/task/engine/ExecutableTask
/*    */     //   97: ifeq -> 107
/*    */     //   100: aload_1
/*    */     //   101: checkcast ai/grazie/model/task/engine/ExecutableTask
/*    */     //   104: goto -> 108
/*    */     //   107: aconst_null
/*    */     //   108: dup
/*    */     //   109: ifnull -> 161
/*    */     //   112: invokeinterface getExecutor : ()Lai/grazie/model/task/engine/TasksExecutor;
/*    */     //   117: dup
/*    */     //   118: ifnull -> 161
/*    */     //   121: aload_1
/*    */     //   122: aload_2
/*    */     //   123: aload #5
/*    */     //   125: aload #5
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokeinterface canExecute : (Lai/grazie/model/task/Task;Lai/grazie/model/task/engine/TaskExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   136: dup
/*    */     //   137: aload #6
/*    */     //   139: if_acmpne -> 152
/*    */     //   142: aload #6
/*    */     //   144: areturn
/*    */     //   145: aload #4
/*    */     //   147: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   150: aload #4
/*    */     //   152: checkcast java/lang/Boolean
/*    */     //   155: invokevirtual booleanValue : ()Z
/*    */     //   158: goto -> 163
/*    */     //   161: pop
/*    */     //   162: iconst_0
/*    */     //   163: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   166: areturn
/*    */     //   167: new java/lang/IllegalStateException
/*    */     //   170: dup
/*    */     //   171: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   173: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   176: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #55	-> 60
/*    */     //   #56	-> 93
/*    */     //   #55	-> 142
/*    */     //   #56	-> 152
/*    */     //   #55	-> 167
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	43	1	task	Lai/grazie/model/task/Task;
/*    */     //   93	43	2	context	Lai/grazie/model/task/engine/TaskExecutionContext;
/*    */     //   0	177	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	117	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	110	4	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull Task task, @NotNull DataHolder parameters, @NotNull TaskExecutionContext context, @NotNull Continuation<? super Flow<? extends TaskStreamData>> $completion) {
/*    */     TasksExecutor executor;
/* 60 */     if (((task instanceof ExecutableTask) ? task : null) == null || ((task instanceof ExecutableTask) ? task : null).getExecutor() == null) { ((task instanceof ExecutableTask) ? task : null).getExecutor(); TaskInvalidInputExceptionKt.taskInvalidInputException$default("Task " + TaskKt.id(task) + " cannot be executed.", null, 2, null); throw new KotlinNothingValueException(); }
/* 61 */      return executor.execute(task, parameters, context, $completion);
/*    */   }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\034\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\007J\026\020\007\032\0020\0042\f\020\b\032\b\022\004\022\0020\n0\tH\007¨\006\013"}, d2 = {"Lai/grazie/model/task/engine/AggregatedTasksExecutor$Companion;", "", "()V", "fromRegistry", "Lai/grazie/model/task/engine/AggregatedTasksExecutor;", "registry", "Lai/grazie/model/task/engine/TasksRegistry;", "fromTasks", "tasks", "", "Lai/grazie/model/task/Task;", "model-task"})
/*    */   public static final class Companion { @Deprecated(message = "Use default constructor instead, deprecated on 13.12.2024")
/*    */     @NotNull
/*    */     public final AggregatedTasksExecutor fromTasks(@NotNull Iterable tasks) {
/* 67 */       Intrinsics.checkNotNullParameter(tasks, "tasks"); return new AggregatedTasksExecutor();
/*    */     } private Companion() {}
/*    */     @Deprecated(message = "Use default constructor instead, deprecated on 13.12.2024")
/*    */     @NotNull
/*    */     public final AggregatedTasksExecutor fromRegistry(@NotNull TasksRegistry registry) {
/* 72 */       Intrinsics.checkNotNullParameter(registry, "registry"); return new AggregatedTasksExecutor();
/*    */     } }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "TasksExecutor.kt", l = {56}, i = {}, s = {}, n = {}, m = "canExecute", c = "ai.grazie.model.task.engine.AggregatedTasksExecutor")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AggregatedTasksExecutor$canExecute$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AggregatedTasksExecutor$canExecute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AggregatedTasksExecutor.this.canExecute(null, null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\AggregatedTasksExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */