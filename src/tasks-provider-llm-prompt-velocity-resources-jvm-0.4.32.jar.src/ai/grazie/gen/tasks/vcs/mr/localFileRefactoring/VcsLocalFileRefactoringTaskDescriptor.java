/*    */ package ai.grazie.gen.tasks.vcs.mr.localFileRefactoring;
/*    */ import ai.grazie.model.task.TaskCallData;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\007\032\0020\b2\006\020\t\032\0020\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\013"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/localFileRefactoring/VcsLocalFileRefactoringTaskDescriptor;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "createCallData", "Lai/grazie/model/task/TaskCallData;", "parameters", "Lai/grazie/gen/tasks/vcs/mr/localFileRefactoring/VcsLocalFileRefactoringTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ @SourceDebugExtension({"SMAP\nVcsLocalFileRefactoringTaskDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VcsLocalFileRefactoringTaskDescriptor.kt\nai/grazie/gen/tasks/vcs/mr/localFileRefactoring/VcsLocalFileRefactoringTaskDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
/*    */ public final class VcsLocalFileRefactoringTaskDescriptor implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final VcsLocalFileRefactoringTaskDescriptor INSTANCE = new VcsLocalFileRefactoringTaskDescriptor(); @NotNull private static final TaskName name = new TaskName("vcs-local-file-refactoring"); @NotNull public TaskName getName() { return name; }
/*    */    @NotNull
/*    */   public final TaskCallData createCallData(@NotNull VcsLocalFileRefactoringTaskParams parameters) {
/* 16 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); JsonElement jsonElement = Json.Default.encodeToJsonElement((SerializationStrategy)VcsLocalFileRefactoringTaskParams.Companion.serializer(), parameters);
/* 17 */     if (!(jsonElement instanceof JsonObject)) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 22 */       int $i$a$-check-VcsLocalFileRefactoringTaskDescriptor$createCallData$1 = 0;
/*    */       String str = "Serialized `VcsLocalFileRefactoringTaskParams` is not a JsonObject";
/*    */       throw new IllegalStateException(str.toString());
/*    */     } 
/*    */     return new TaskCallData(getName(), DataHolderKt.asDataHolder((JsonObject)jsonElement));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\mr\localFileRefactoring\VcsLocalFileRefactoringTaskDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */