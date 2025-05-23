/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.datetime.Instant;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 /2\0020\001:\002./B5\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\005¢\006\004\b\013\020\fBM\b\020\022\006\020\r\032\0020\016\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\017\032\004\030\0010\020¢\006\004\b\013\020\021J\t\020\033\032\0020\003HÆ\003J\013\020\034\032\004\030\0010\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\t\020\036\032\0020\tHÆ\003J\013\020\037\032\004\030\0010\005HÆ\003J?\020 \032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\005HÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010\001HÖ\003J\t\020$\032\0020\016HÖ\001J\t\020%\032\0020\005HÖ\001J%\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\026\020\027R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\030\020\031R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\032\020\025¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "", "id", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "name", "", "created", "Lkotlinx/datetime/Instant;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "errorMessage", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Ljava/lang/String;Lkotlinx/datetime/Instant;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Ljava/lang/String;Lkotlinx/datetime/Instant;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getName", "()Ljava/lang/String;", "getCreated", "()Lkotlinx/datetime/Instant;", "getState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskChainEntity {
/*    */   @NotNull
/*    */   private final TaskChainId id;
/*    */   @Nullable
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final Instant created;
/*    */   @NotNull
/* 28 */   public static final Companion Companion = new Companion(null); @NotNull private final TaskChainState state; @Nullable private final String errorMessage; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState", (Enum[])TaskChainState.values()); arrayOfKSerializer[4] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskChainEntity> serializer() { return (KSerializer<TaskChainEntity>)TaskChainEntity.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 31 */   public TaskChainEntity(@NotNull TaskChainId id, @Nullable String name, @NotNull Instant created, @NotNull TaskChainState state, @Nullable String errorMessage) { this.id = id;
/* 32 */     this.name = name;
/* 33 */     this.created = created;
/* 34 */     this.state = state;
/* 35 */     this.errorMessage = errorMessage; } @NotNull public final TaskChainId getId() { return this.id; } @Nullable public final String getName() { return this.name; } @Nullable public final String getErrorMessage() { return this.errorMessage; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Instant getCreated() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainState getState() {
/*    */     return this.state;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainId component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Instant component3() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainState component4() {
/*    */     return this.state;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.errorMessage;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainEntity copy(@NotNull TaskChainId id, @Nullable String name, @NotNull Instant created, @NotNull TaskChainState state, @Nullable String errorMessage) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(created, "created");
/*    */     Intrinsics.checkNotNullParameter(state, "state");
/*    */     return new TaskChainEntity(id, name, created, state, errorMessage);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskChainEntity(id=" + this.id + ", name=" + this.name + ", created=" + this.created + ", state=" + this.state + ", errorMessage=" + this.errorMessage + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + ((this.name == null) ? 0 : this.name.hashCode());
/*    */     result = result * 31 + this.created.hashCode();
/*    */     result = result * 31 + this.state.hashCode();
/*    */     return result * 31 + ((this.errorMessage == null) ? 0 : this.errorMessage.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskChainEntity))
/*    */       return false; 
/*    */     TaskChainEntity taskChainEntity = (TaskChainEntity)other;
/*    */     return !Intrinsics.areEqual(this.id, taskChainEntity.id) ? false : (!Intrinsics.areEqual(this.name, taskChainEntity.name) ? false : (!Intrinsics.areEqual(this.created, taskChainEntity.created) ? false : ((this.state != taskChainEntity.state) ? false : (!!Intrinsics.areEqual(this.errorMessage, taskChainEntity.errorMessage)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskChainEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */