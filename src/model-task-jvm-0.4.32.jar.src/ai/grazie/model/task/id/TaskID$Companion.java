/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\021\020\003\032\0020\0042\006\020\005\032\0020\006H\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/task/id/TaskID$Companion;", "", "()V", "invoke", "Lai/grazie/model/task/id/TaskID;", "id", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/* 15 */   public final KSerializer<TaskID> serializer() { return (KSerializer<TaskID>)TaskID.Serializer.INSTANCE; } @NotNull
/*    */   public final TaskID invoke(@NotNull String id) {
/* 17 */     Intrinsics.checkNotNullParameter(id, "id"); String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> parts = StringsKt.split$default(id, arrayOfString, false, 0, 6, null);
/* 18 */     if (!((parts.size() == 2) ? 1 : 0)) { int $i$a$-require-TaskID$Companion$invoke$1 = 0; String str = 
/* 19 */         "Id be in format name:version and without any additional semicolons"; throw new IllegalArgumentException(str.toString()); }
/*    */     
/* 21 */     String name = parts.get(0), tag = parts.get(1);
/* 22 */     return new TaskID(new TaskName(name), new TaskTag(tag));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */