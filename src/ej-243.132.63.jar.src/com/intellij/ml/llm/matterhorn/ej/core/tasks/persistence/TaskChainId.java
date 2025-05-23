/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import java.util.UUID;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\037 B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ\b\020\017\032\0020\020H\026J\t\020\021\032\0020\003HÆ\003J\023\020\022\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\007HÖ\001J%\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\001¢\006\002\b\036R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\013\020\f\032\004\b\r\020\016¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "", "id", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/util/UUID;", "toString", "", "component1", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*    */ public final class TaskChainId {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 11 */   public TaskChainId(@NotNull UUID id) { this.id = id; } @NotNull private final UUID id; @NotNull public final UUID getId() { return this.id; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\f\020\006\032\b\022\004\022\0020\0050\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId$Companion;", "", "<init>", "()V", "new", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 13 */     public final KSerializer<TaskChainId> serializer() { return (KSerializer<TaskChainId>)TaskChainId.$serializer.INSTANCE; } @NotNull
/*    */     public final TaskChainId new() {
/* 15 */       Intrinsics.checkNotNullExpressionValue(UUID.randomUUID(), "randomUUID(...)"); return new TaskChainId(UUID.randomUUID());
/*    */     } }
/*    */   @NotNull
/*    */   public String toString() {
/* 19 */     Intrinsics.checkNotNullExpressionValue(this.id.toString(), "toString(...)"); return this.id.toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainId copy(@NotNull UUID id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return new TaskChainId(id);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.id.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskChainId))
/*    */       return false; 
/*    */     TaskChainId taskChainId = (TaskChainId)other;
/*    */     return !!Intrinsics.areEqual(this.id, taskChainId.id);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskChainId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */