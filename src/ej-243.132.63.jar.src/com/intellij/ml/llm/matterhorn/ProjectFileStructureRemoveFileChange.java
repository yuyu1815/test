/*    */ package com.intellij.ml.llm.matterhorn;@Serializable
/*    */ @SerialName("Remove")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B/\b\020\022\006\020\007\032\0020\b\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\020\020\017\032\0020\0202\006\020\021\032\0020\022H\026J\b\020\023\032\0020\003H\026J\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J\035\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\bHÖ\001J%\020\034\032\0020\0202\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\r¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRemoveFileChange;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "filePath", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFilePath", "()Ljava/lang/String;", "getDescription", "applyChange", "", "structure", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "toString", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*    */ public final class ProjectFileStructureRemoveFileChange implements ProjectFileStructureChange { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String filePath;
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRemoveFileChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureRemoveFileChange;", "core"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<ProjectFileStructureRemoveFileChange> serializer() {
/* 14 */       return (KSerializer<ProjectFileStructureRemoveFileChange>)ProjectFileStructureRemoveFileChange.$serializer.INSTANCE;
/*    */     } private Companion() {} } public ProjectFileStructureRemoveFileChange(@NotNull String filePath, @NotNull String description) {
/* 16 */     this.filePath = filePath; this.description = description; } @NotNull public final String getFilePath() { return this.filePath; } @NotNull public final String getDescription() { return this.description; }
/*    */   
/*    */   public void applyChange(@NotNull ProjectFileStructure structure) {
/* 19 */     Intrinsics.checkNotNullParameter(structure, "structure"); structure.getRoot().removeChild(this.filePath);
/*    */   }
/*    */   @NotNull
/*    */   public String toString() {
/* 23 */     return "## Remove " + this.filePath + "\n\n" + this.description + "\n";
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.filePath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProjectFileStructureRemoveFileChange copy(@NotNull String filePath, @NotNull String description) {
/*    */     Intrinsics.checkNotNullParameter(filePath, "filePath");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     return new ProjectFileStructureRemoveFileChange(filePath, description);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.filePath.hashCode();
/*    */     return result * 31 + this.description.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ProjectFileStructureRemoveFileChange))
/*    */       return false; 
/*    */     ProjectFileStructureRemoveFileChange projectFileStructureRemoveFileChange = (ProjectFileStructureRemoveFileChange)other;
/*    */     return !Intrinsics.areEqual(this.filePath, projectFileStructureRemoveFileChange.filePath) ? false : (!!Intrinsics.areEqual(this.description, projectFileStructureRemoveFileChange.description));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureRemoveFileChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */