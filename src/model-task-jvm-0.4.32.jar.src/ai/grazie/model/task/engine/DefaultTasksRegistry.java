/*    */ package ai.grazie.model.task.engine;
/*    */ import ai.grazie.model.task.Task;
/*    */ import ai.grazie.model.task.TaskKt;
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.model.task.id.TaskTag;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\034\n\002\030\002\n\002\b\002\n\002\020$\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\003\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\020\020\021\032\0020\0222\006\020\023\032\0020\fH\026J\023\020\024\032\004\030\0010\0042\006\020\023\032\0020\fH\002R&\020\006\032\032\022\004\022\0020\b\022\020\022\016\022\004\022\0020\t\022\004\022\0020\0040\0070\007X\004¢\006\002\n\000R\032\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\b\n\000\032\004\b\r\020\016R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\017\020\020¨\006\025"}, d2 = {"Lai/grazie/model/task/engine/DefaultTasksRegistry;", "Lai/grazie/model/task/engine/TasksRegistry;", "tasks", "", "Lai/grazie/model/task/Task;", "(Ljava/lang/Iterable;)V", "groupedAndAssociated", "", "Lai/grazie/model/task/id/TaskName;", "Lai/grazie/model/task/id/TaskTag;", "ids", "", "Lai/grazie/model/task/id/TaskID;", "getIds", "()Ljava/util/Set;", "getTasks", "()Ljava/lang/Iterable;", "contains", "", "id", "get", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTasksRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksRegistry.kt\nai/grazie/model/task/engine/DefaultTasksRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,44:1\n1557#2:45\n1628#2,3:46\n1485#2:49\n1510#2,3:50\n1513#2,3:60\n1246#2,2:65\n1485#2:67\n1510#2,3:68\n1513#2,3:78\n1246#2,4:83\n1249#2:87\n381#3,7:53\n462#3:63\n412#3:64\n381#3,7:71\n462#3:81\n412#3:82\n*S KotlinDebug\n*F\n+ 1 TasksRegistry.kt\nai/grazie/model/task/engine/DefaultTasksRegistry\n*L\n26#1:45\n26#1:46,3\n29#1:49\n29#1:50,3\n29#1:60,3\n30#1:65,2\n31#1:67\n31#1:68,3\n31#1:78,3\n31#1:83,4\n30#1:87\n29#1:53,7\n30#1:63\n30#1:64\n31#1:71,7\n31#1:81\n31#1:82\n*E\n"})
/*    */ final class DefaultTasksRegistry implements TasksRegistry {
/*    */   public DefaultTasksRegistry(@NotNull Iterable<Task> tasks) {
/* 23 */     this.tasks = tasks;
/*    */ 
/*    */     
/* 26 */     Iterable<Task> iterable1 = getTasks(); DefaultTasksRegistry defaultTasksRegistry = this; int $i$f$map = 0;
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
/* 45 */     Iterable<Task> iterable2 = iterable1; Collection<TaskID> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int $i$f$mapTo = 0;
/* 46 */     for (Task item$iv$iv : iterable2) {
/* 47 */       Task task1 = item$iv$iv; Collection<TaskID> collection = destination$iv$iv; int $i$a$-map-DefaultTasksRegistry$ids$1 = 0; collection.add(TaskKt.id(task1));
/* 48 */     }  defaultTasksRegistry.ids = CollectionsKt.toSet(destination$iv$iv); Iterable<Task> $this$groupBy$iv = getTasks(); int $i$f$groupBy = 0;
/* 49 */     Iterable<Task> iterable3 = $this$groupBy$iv; Map<Object, Object> map4 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 50 */     for (Task element$iv$iv : iterable3) {
/* 51 */       Task it = element$iv$iv; int $i$a$-groupBy-DefaultTasksRegistry$grouped$1 = 0; Object key$iv$iv = TaskKt.name(it);
/* 52 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map4; int $i$f$getOrPut = 0;
/* 53 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     Map<Object, Object> grouped = map4; Map<Object, Object> map1 = grouped; defaultTasksRegistry = this; int $i$f$mapValues = 0;
/* 63 */     Map<Object, Object> map2 = map1, map3 = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int $i$f$mapValuesTo = 0;
/* 64 */     Iterable<Map.Entry<Object, Object>> $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 65 */     for (Object<Object, Object> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 66 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = map3; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-DefaultTasksRegistry$1 = 0;
/*    */     } 
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
/* 87 */     defaultTasksRegistry.groupedAndAssociated = (Map)map3;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final Iterable<Task> tasks;
/*    */   @NotNull
/*    */   private final Map<TaskName, Map<TaskTag, Task>> groupedAndAssociated;
/*    */   @NotNull
/*    */   private final Set<TaskID> ids;
/*    */   
/*    */   @NotNull
/*    */   public Iterable<Task> getTasks() {
/*    */     return this.tasks;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Set<TaskID> getIds() {
/*    */     return this.ids;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Task get(@NotNull TaskID id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     (Map)this.groupedAndAssociated.get(id.getName());
/*    */     return ((Map)this.groupedAndAssociated.get(id.getName()) != null) ? (Task)((Map)this.groupedAndAssociated.get(id.getName())).get(id.getTag()) : null;
/*    */   }
/*    */   
/*    */   public boolean contains(@NotNull TaskID id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return (get(id) != null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\engine\DefaultTasksRegistry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */