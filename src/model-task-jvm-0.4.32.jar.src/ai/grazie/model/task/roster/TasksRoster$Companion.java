/*    */ package ai.grazie.model.task.roster;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\"\n\002\030\002\n\000\n\002\020$\n\002\b\002\b\003\030\0002\0020\001:\001\024B\007\b\002¢\006\002\020\002J!\020\007\032\0020\0042\022\020\b\032\n\022\006\b\001\022\0020\n0\t\"\0020\nH\007¢\006\002\020\013J#\020\007\032\0020\0042\026\020\f\032\f\022\b\b\001\022\004\030\0010\0040\t\"\004\030\0010\004¢\006\002\020\rJE\020\007\032\0020\00426\020\b\032\034\022\030\b\001\022\024\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0210\0200\0160\t\"\024\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0210\0200\016H\007¢\006\002\020\022J\"\020\007\032\0020\0042\030\020\b\032\024\022\004\022\0020\017\022\n\022\b\022\004\022\0020\0210\0200\023H\007J\026\020\007\032\0020\0042\f\020\b\032\b\022\004\022\0020\n0\020H\007R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\025"}, d2 = {"Lai/grazie/model/task/roster/TasksRoster$Companion;", "", "()V", "empty", "Lai/grazie/model/task/roster/TasksRoster;", "getEmpty", "()Lai/grazie/model/task/roster/TasksRoster;", "of", "tasks", "", "Lai/grazie/model/task/id/TaskID;", "([Lai/grazie/model/task/id/TaskID;)Lai/grazie/model/task/roster/TasksRoster;", "rosters", "([Lai/grazie/model/task/roster/TasksRoster;)Lai/grazie/model/task/roster/TasksRoster;", "Lkotlin/Pair;", "Lai/grazie/model/task/id/TaskName;", "", "Lai/grazie/model/task/id/TaskTag;", "([Lkotlin/Pair;)Lai/grazie/model/task/roster/TasksRoster;", "", "Default", "model-task"})
/*    */ @SourceDebugExtension({"SMAP\nTasksRoster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksRoster.kt\nai/grazie/model/task/roster/TasksRoster$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,52:1\n1368#2:53\n1454#2,5:54\n1485#2:59\n1510#2,3:60\n1513#2,3:70\n1246#2,2:75\n1557#2:77\n1628#2,3:78\n1249#2:81\n1557#2:85\n1628#2,3:86\n381#3,7:63\n462#3:73\n412#3:74\n77#4:82\n97#4,2:83\n99#4,3:89\n*S KotlinDebug\n*F\n+ 1 TasksRoster.kt\nai/grazie/model/task/roster/TasksRoster$Companion\n*L\n30#1:53\n30#1:54,5\n35#1:59\n35#1:60,3\n35#1:70,3\n35#1:75,2\n35#1:77\n35#1:78,3\n35#1:81\n48#1:85\n48#1:86,3\n35#1:63,7\n35#1:73\n35#1:74\n48#1:82\n48#1:83,2\n48#1:89,3\n*E\n"})
/*    */ public final class Companion {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\004\b\002\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lai/grazie/model/task/roster/TasksRoster$Companion$Default;", "Lai/grazie/model/task/roster/TasksRoster;", "ids", "", "Lai/grazie/model/task/id/TaskID;", "(Ljava/util/Set;)V", "getIds", "()Ljava/util/Set;", "model-task"})
/*    */   private static final class Default implements TasksRoster {
/* 23 */     public Default(@NotNull Set<TaskID> ids) { this.ids = ids; } @NotNull private final Set<TaskID> ids; @NotNull public Set<TaskID> getIds() { return this.ids; }
/*    */      } @NotNull
/* 25 */   private static final TasksRoster empty = new TasksRoster$Companion$empty$1(); @NotNull public final TasksRoster getEmpty() { return empty; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"ai/grazie/model/task/roster/TasksRoster$Companion$empty$1", "Lai/grazie/model/task/roster/TasksRoster;", "ids", "", "Lai/grazie/model/task/id/TaskID;", "getIds", "()Ljava/util/Set;", "model-task"})
/* 26 */   public static final class TasksRoster$Companion$empty$1 implements TasksRoster { private final Set<TaskID> ids = SetsKt.emptySet(); public Set<TaskID> getIds() { return this.ids; }
/*    */      }
/*    */   
/*    */   @NotNull
/* 30 */   public final TasksRoster of(@NotNull TasksRoster... rosters) { Intrinsics.checkNotNullParameter(rosters, "rosters"); List list1 = ArraysKt.filterNotNull((Object[])rosters); Companion companion = this; int $i$f$flatMap = 0;
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
/* 53 */     List list2 = list1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 54 */     for (Object element$iv$iv : list2) {
/* 55 */       TasksRoster it = (TasksRoster)element$iv$iv; int $i$a$-flatMap-TasksRoster$Companion$of$1 = 0; Iterable<TaskID> list$iv$iv = it.getIds();
/* 56 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 58 */     return companion.of(CollectionsKt.toSet(destination$iv$iv)); } @NotNull public final TasksRoster of(@NotNull Set tasks) { Intrinsics.checkNotNullParameter(tasks, "tasks"); Iterable $this$groupBy$iv = tasks; int $i$f$groupBy = 0;
/* 59 */     Iterable iterable1 = $this$groupBy$iv; Map<Object, Object> map3 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 60 */     for (Object element$iv$iv : iterable1) {
/* 61 */       TaskID it = (TaskID)element$iv$iv; int $i$a$-groupBy-TasksRoster$Companion$of$grouped$1 = 0; Object key$iv$iv = it.getName();
/* 62 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map3; int $i$f$getOrPut = 0;
/* 63 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 72 */     Map<Object, Object> map1 = map3; int $i$f$mapValues = 0;
/* 73 */     Map<Object, Object> map2 = map1, destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity(map1.size())); int $i$f$mapValuesTo = 0;
/* 74 */     Iterable<Map.Entry<Object, Object>> $this$associateByTo$iv$iv$iv = map2.entrySet(); int $i$f$associateByTo = 0;
/* 75 */     for (Object<Object, Object> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 76 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map4 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map5 = map4; int $i$a$-mapValues-TasksRoster$Companion$of$grouped$2 = 0;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 81 */     Map<Object, Object> grouped = destination$iv$iv; return of((Map)grouped); } @NotNull public final TasksRoster of(@NotNull Map tasks) { Intrinsics.checkNotNullParameter(tasks, "tasks"); Map $this$flatMap$iv = tasks; int $i$f$flatMap = 0;
/* 82 */     Map map1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 83 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 84 */       Map.Entry entry1 = element$iv$iv; int $i$a$-flatMap-TasksRoster$Companion$of$2 = 0; TaskName name = (TaskName)entry1.getKey(); Set tags = (Set)entry1.getValue(); Iterable $this$map$iv = tags; int $i$f$map = 0;
/* 85 */       Iterable iterable1 = $this$map$iv; Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 86 */       Iterator iterator = iterable1.iterator();
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 91 */     Set<TaskID> set = CollectionsKt.toSet(destination$iv$iv);
/*    */     return new Default(set); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TasksRoster of(@NotNull TaskID... tasks) {
/*    */     Intrinsics.checkNotNullParameter(tasks, "tasks");
/*    */     return of(ArraysKt.toSet((Object[])tasks));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksRoster of(@NotNull Pair... tasks) {
/*    */     Intrinsics.checkNotNullParameter(tasks, "tasks");
/*    */     return of(MapsKt.toMap(tasks));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\roster\TasksRoster$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */