/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B#\b\020\022\006\020\006\032\0020\003\022\006\020\002\032\0020\003\022\b\020\007\032\004\030\0010\b¢\006\004\b\004\020\tJ\b\020\f\032\0020\rH\026J\t\020\016\032\0020\003HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\003HÖ\001J%\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032H\001¢\006\002\b\033R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "", "index", "", "<init>", "(I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIndex", "()I", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskId { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int index;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "ej-core"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<TaskId> serializer() {
/* 11 */       return (KSerializer<TaskId>)TaskId.$serializer.INSTANCE;
/*    */     } private Companion() {} }
/*    */   public TaskId(int index) {
/* 14 */     this.index = index; } public final int getIndex() { return this.index; } @NotNull
/*    */   public String toString() {
/* 16 */     return String.valueOf(this.index);
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.index;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskId copy(int index) {
/*    */     return new TaskId(index);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Integer.hashCode(this.index);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskId))
/*    */       return false; 
/*    */     TaskId taskId = (TaskId)other;
/*    */     return !(this.index != taskId.index);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */