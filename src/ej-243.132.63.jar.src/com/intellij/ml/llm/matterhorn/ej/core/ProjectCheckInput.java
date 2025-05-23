/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B#\022\f\020\002\032\b\022\004\022\0020\0040\003\022\f\020\005\032\b\022\004\022\0020\0040\003¢\006\004\b\006\020\007B;\b\020\022\006\020\b\032\0020\t\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\005\032\n\022\004\022\0020\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJ\017\020\020\032\b\022\004\022\0020\0040\003HÆ\003J\017\020\021\032\b\022\004\022\0020\0040\003HÆ\003J)\020\022\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\0032\016\b\002\020\005\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\tHÖ\001J\t\020\027\032\0020\004HÖ\001J%\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036H\001¢\006\002\b\037R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\r\020\016R\027\020\005\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\017\020\016¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;", "", "filesToCheck", "", "", "testsToRun", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFilesToCheck", "()Ljava/util/List;", "getTestsToRun", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class ProjectCheckInput {
/*    */   @NotNull
/* 20 */   public static final Companion Companion = new Companion(null); @NotNull private final List<String> filesToCheck; @NotNull private final List<String> testsToRun; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProjectCheckInput> serializer() { return (KSerializer<ProjectCheckInput>)ProjectCheckInput.$serializer.INSTANCE; }
/*    */      }
/* 22 */    public ProjectCheckInput(@NotNull List<String> filesToCheck, @NotNull List<String> testsToRun) { this.filesToCheck = filesToCheck;
/* 23 */     this.testsToRun = testsToRun; } @NotNull public final List<String> getFilesToCheck() { return this.filesToCheck; } @NotNull public final List<String> getTestsToRun() { return this.testsToRun; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.filesToCheck;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.testsToRun;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProjectCheckInput copy(@NotNull List<String> filesToCheck, @NotNull List<String> testsToRun) {
/*    */     Intrinsics.checkNotNullParameter(filesToCheck, "filesToCheck");
/*    */     Intrinsics.checkNotNullParameter(testsToRun, "testsToRun");
/*    */     return new ProjectCheckInput(filesToCheck, testsToRun);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ProjectCheckInput(filesToCheck=" + this.filesToCheck + ", testsToRun=" + this.testsToRun + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.filesToCheck.hashCode();
/*    */     return result * 31 + this.testsToRun.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ProjectCheckInput))
/*    */       return false; 
/*    */     ProjectCheckInput projectCheckInput = (ProjectCheckInput)other;
/*    */     return !Intrinsics.areEqual(this.filesToCheck, projectCheckInput.filesToCheck) ? false : (!!Intrinsics.areEqual(this.testsToRun, projectCheckInput.testsToRun));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ProjectCheckInput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */