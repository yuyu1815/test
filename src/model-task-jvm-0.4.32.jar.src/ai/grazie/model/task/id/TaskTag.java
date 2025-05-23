/*    */ package ai.grazie.model.task.id;
/*    */ 
/*    */ import ai.grazie.utils.StringValueClassSerializer;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable(with = TaskTag.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\007\030\000 \r2\0020\001:\002\r\016B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\023\020\007\032\0020\b2\b\020\t\032\004\030\0010\001H\002J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/id/TaskTag;", "", "tag", "", "(Ljava/lang/String;)V", "getTag", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "model-task"})
/*    */ public final class TaskTag {
/*    */   @NotNull
/*    */   public final String getTag() {
/*    */     return this.tag;
/*    */   }
/*    */   
/*    */   public TaskTag(@NotNull String tag) {
/* 25 */     Intrinsics.checkNotNullExpressionValue(tag.toLowerCase(Locale.ROOT), "toLowerCase(...)"); this.tag = tag.toLowerCase(Locale.ROOT);
/*    */     
/* 27 */     if (!(!StringsKt.contains$default(this.tag, ":", false, 2, null) ? 1 : 0)) { int $i$a$-require-TaskTag$1 = 0; String str = 
/* 28 */         "Task tag may not contain semicolon";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */      } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\t"}, d2 = {"Lai/grazie/model/task/id/TaskTag$Companion;", "", "()V", "Default", "Lai/grazie/model/task/id/TaskTag;", "getDefault", "()Lai/grazie/model/task/id/TaskTag;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"})
/*    */   public static final class Companion { @NotNull
/* 32 */     public final KSerializer<TaskTag> serializer() { return (KSerializer<TaskTag>)TaskTag.Serializer.INSTANCE; }
/*    */      private Companion() {}
/*    */     @NotNull
/*    */     public final TaskTag getDefault() {
/* 36 */       return TaskTag.Default; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String tag; @NotNull private static final TaskTag Default = new TaskTag("default"); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/task/id/TaskTag$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/task/id/TaskTag;", "()V", "model-task"})
/*    */   public static final class Serializer extends StringValueClassSerializer<TaskTag> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/* 39 */     private Serializer() { super("TaskTag", null.INSTANCE, null.INSTANCE); } } @NotNull
/*    */   public String toString() {
/* 41 */     return this.tag;
/*    */   }
/*    */   public boolean equals(@Nullable Object other) {
/* 44 */     if (this == other) return true; 
/* 45 */     if (!(other instanceof TaskTag)) return false;
/*    */     
/* 47 */     return Intrinsics.areEqual(this.tag, ((TaskTag)other).tag);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 51 */     return this.tag.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\id\TaskTag.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */