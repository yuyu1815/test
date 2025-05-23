/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\016\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 82\0020\001:\00278BO\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\003\022\016\b\002\020\007\032\b\022\004\022\0020\t0\b\022\016\b\002\020\n\032\b\022\004\022\0020\0130\b\022\b\020\f\032\004\030\0010\r¢\006\004\b\016\020\017Bc\b\020\022\006\020\020\032\0020\021\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\003\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\016\020\n\032\n\022\004\022\0020\013\030\0010\b\022\b\020\f\032\004\030\0010\r\022\b\020\022\032\004\030\0010\023¢\006\004\b\016\020\024J\013\020#\032\004\030\0010\003HÆ\003J\013\020$\032\004\030\0010\005HÆ\003J\013\020%\032\004\030\0010\003HÆ\003J\017\020&\032\b\022\004\022\0020\t0\bHÆ\003J\017\020'\032\b\022\004\022\0020\0130\bHÆ\003J\020\020(\032\004\030\0010\rHÆ\003¢\006\002\020\036J^\020)\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0032\016\b\002\020\007\032\b\022\004\022\0020\t0\b2\016\b\002\020\n\032\b\022\004\022\0020\0130\b2\n\b\002\020\f\032\004\030\0010\rHÆ\001¢\006\002\020*J\023\020+\032\0020!2\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\021HÖ\001J\t\020.\032\0020\003HÖ\001J%\020/\032\002002\006\0201\032\0020\0002\006\0202\032\002032\006\0204\032\00205H\001¢\006\002\b6R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\025\020\026R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\027\020\030R\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\031\020\026R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\032\020\033R\027\020\n\032\b\022\004\022\0020\0130\b¢\006\b\n\000\032\004\b\034\020\033R\025\020\f\032\004\030\0010\r¢\006\n\n\002\020\037\032\004\b\035\020\036R\021\020 \032\0020!8F¢\006\006\032\004\b \020\"¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "", "command", "", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "description", "changes", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "testRuns", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TestRun;", "msDuration", "", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCommand", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getDescription", "getChanges", "()Ljava/util/List;", "getTestRuns", "getMsDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isCompleted", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class StepEntity {
/*    */   @NotNull
/* 16 */   public static final Companion Companion = new Companion(null); @Nullable private final String command; @Nullable private final StepType type; @Nullable private final String description; @NotNull private final List<FileChange> changes; @NotNull private final List<TestRun> testRuns; @Nullable private final Long msDuration; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.StepType", (Enum[])StepType.values()); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)FileChange$.serializer.INSTANCE); arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)TestRun.$serializer.INSTANCE); arrayOfKSerializer[5] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<StepEntity> serializer() { return (KSerializer<StepEntity>)StepEntity.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 19 */   public StepEntity(@Nullable String command, @Nullable StepType type, @Nullable String description, @NotNull List<FileChange> changes, @NotNull List<TestRun> testRuns, @Nullable Long msDuration) { this.command = command;
/* 20 */     this.type = type;
/* 21 */     this.description = description;
/* 22 */     this.changes = changes;
/* 23 */     this.testRuns = testRuns;
/* 24 */     this.msDuration = msDuration; } @Nullable public final String getCommand() { return this.command; } @Nullable public final StepType getType() { return this.type; } @Nullable public final Long getMsDuration() { return this.msDuration; }
/*    */   @Nullable
/*    */   public final String getDescription() { return this.description; }
/*    */   @NotNull
/*    */   public final List<FileChange> getChanges() { return this.changes; }
/*    */   @NotNull
/*    */   public final List<TestRun> getTestRuns() { return this.testRuns; } public final boolean isCompleted() {
/* 31 */     CharSequence charSequence = this.command; return (this.type == StepType.Prompt || this.type == StepType.Report) ? ((this.description != null)) : ((!((charSequence == null || charSequence.length() == 0) ? 1 : 0) && this.type != null));
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.command;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final StepType component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<FileChange> component4() {
/*    */     return this.changes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<TestRun> component5() {
/*    */     return this.testRuns;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Long component6() {
/*    */     return this.msDuration;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StepEntity copy(@Nullable String command, @Nullable StepType type, @Nullable String description, @NotNull List<FileChange> changes, @NotNull List<TestRun> testRuns, @Nullable Long msDuration) {
/*    */     Intrinsics.checkNotNullParameter(changes, "changes");
/*    */     Intrinsics.checkNotNullParameter(testRuns, "testRuns");
/*    */     return new StepEntity(command, type, description, changes, testRuns, msDuration);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "StepEntity(command=" + this.command + ", type=" + this.type + ", description=" + this.description + ", changes=" + this.changes + ", testRuns=" + this.testRuns + ", msDuration=" + this.msDuration + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.command == null) ? 0 : this.command.hashCode();
/*    */     result = result * 31 + ((this.type == null) ? 0 : this.type.hashCode());
/*    */     result = result * 31 + ((this.description == null) ? 0 : this.description.hashCode());
/*    */     result = result * 31 + this.changes.hashCode();
/*    */     result = result * 31 + this.testRuns.hashCode();
/*    */     return result * 31 + ((this.msDuration == null) ? 0 : this.msDuration.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof StepEntity))
/*    */       return false; 
/*    */     StepEntity stepEntity = (StepEntity)other;
/*    */     return !Intrinsics.areEqual(this.command, stepEntity.command) ? false : ((this.type != stepEntity.type) ? false : (!Intrinsics.areEqual(this.description, stepEntity.description) ? false : (!Intrinsics.areEqual(this.changes, stepEntity.changes) ? false : (!Intrinsics.areEqual(this.testRuns, stepEntity.testRuns) ? false : (!!Intrinsics.areEqual(this.msDuration, stepEntity.msDuration))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\StepEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */