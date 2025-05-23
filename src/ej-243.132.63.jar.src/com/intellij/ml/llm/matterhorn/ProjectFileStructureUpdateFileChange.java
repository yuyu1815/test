/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("Update")
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003\022\006\020\006\032\0020\003¢\006\004\b\007\020\bBC\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\003\022\b\020\006\032\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\020\020\023\032\0020\0242\006\020\025\032\0020\026H\026J\b\020\027\032\0020\003H\026J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\003HÆ\003J1\020\034\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0032\b\b\002\020\006\032\0020\003HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 HÖ\003J\t\020!\032\0020\nHÖ\001J%\020\"\032\0020\0242\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'H\001¢\006\002\b(R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\020\020\017R\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\021\020\017R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\022\020\017¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureUpdateFileChange;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "oldFilePath", "", "newFilePath", "patchText", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOldFilePath", "()Ljava/lang/String;", "getNewFilePath", "getPatchText", "getDescription", "applyChange", "", "structure", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$core", "$serializer", "Companion", "core"})
/*     */ @SourceDebugExtension({"SMAP\nProjectFileStructureChange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructureChange.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureUpdateFileChange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
/*     */ public final class ProjectFileStructureUpdateFileChange implements ProjectFileStructureChange {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String oldFilePath;
/*     */   @NotNull
/*     */   private final String newFilePath;
/*     */   @NotNull
/*     */   private final String patchText;
/*     */   @NotNull
/*     */   private final String description;
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureUpdateFileChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureUpdateFileChange;", "core"})
/*     */   public static final class Companion { @NotNull
/*     */     public final KSerializer<ProjectFileStructureUpdateFileChange> serializer() {
/*  28 */       return (KSerializer<ProjectFileStructureUpdateFileChange>)ProjectFileStructureUpdateFileChange.$serializer.INSTANCE;
/*     */     } private Companion() {} } public ProjectFileStructureUpdateFileChange(@NotNull String oldFilePath, @NotNull String newFilePath, @NotNull String patchText, @NotNull String description) {
/*  30 */     this.oldFilePath = oldFilePath; this.newFilePath = newFilePath; this.patchText = patchText; this.description = description; } @NotNull public final String getOldFilePath() { return this.oldFilePath; } @NotNull public final String getNewFilePath() { return this.newFilePath; } @NotNull public final String getPatchText() { return this.patchText; } @NotNull public final String getDescription() { return this.description; }
/*     */    public void applyChange(@NotNull ProjectFileStructure structure) {
/*  32 */     Intrinsics.checkNotNullParameter(structure, "structure"); if (structure.getRoot().findChild(this.oldFilePath) == null) { structure.getRoot().findChild(this.oldFilePath);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 139 */       int $i$a$-requireNotNull-ProjectFileStructureUpdateFileChange$applyChange$oldFile$1 = 0;
/*     */       String str = this.oldFilePath + " does not exist.";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     Intrinsics.checkNotNull(structure.getRoot().findChild(this.oldFilePath), "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ProjectStructureFile");
/*     */     ProjectStructureFile oldFile = (ProjectStructureFile)structure.getRoot().findChild(this.oldFilePath);
/*     */     PatchReader reader = new PatchReader(this.patchText);
/*     */     Intrinsics.checkNotNullExpressionValue(reader.readTextPatches(), "readTextPatches(...)");
/*     */     List patches = reader.readTextPatches();
/*     */     String newFileContent = null;
/*     */     if (patches.isEmpty()) {
/*     */       newFileContent = oldFile.getContent();
/*     */     } else {
/*     */       TextFilePatch parsedPatch = (TextFilePatch)CollectionsKt.single(patches);
/*     */       GenericPatchApplier.AppliedPatch appliedPatch = GenericPatchApplier.apply(oldFile.getContent(), parsedPatch.getHunks());
/*     */       if (appliedPatch == null)
/*     */         throw new IllegalStateException("Failed to apply patch. PatchText: " + this.patchText + "\n\nparsedPatch: " + parsedPatch + "\n\noldFilePath: " + this.oldFilePath + "\n\nnewFilePath: " + this.newFilePath + "\n\ndescription: " + this.description); 
/*     */       newFileContent = appliedPatch.patchedText;
/*     */     } 
/*     */     structure.getRoot().removeChild(this.oldFilePath);
/*     */     structure.getRoot().updateOrCreateFile(this.newFilePath, newFileContent);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     String filePath = Intrinsics.areEqual(this.oldFilePath, this.newFilePath) ? this.newFilePath : (this.oldFilePath + " -> " + this.oldFilePath);
/*     */     return "## Update " + filePath + "\n\n" + this.description + "\n\n```\n" + this.patchText + "\n```\n";
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.oldFilePath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.newFilePath;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component3() {
/*     */     return this.patchText;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component4() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProjectFileStructureUpdateFileChange copy(@NotNull String oldFilePath, @NotNull String newFilePath, @NotNull String patchText, @NotNull String description) {
/*     */     Intrinsics.checkNotNullParameter(oldFilePath, "oldFilePath");
/*     */     Intrinsics.checkNotNullParameter(newFilePath, "newFilePath");
/*     */     Intrinsics.checkNotNullParameter(patchText, "patchText");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     return new ProjectFileStructureUpdateFileChange(oldFilePath, newFilePath, patchText, description);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.oldFilePath.hashCode();
/*     */     result = result * 31 + this.newFilePath.hashCode();
/*     */     result = result * 31 + this.patchText.hashCode();
/*     */     return result * 31 + this.description.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ProjectFileStructureUpdateFileChange))
/*     */       return false; 
/*     */     ProjectFileStructureUpdateFileChange projectFileStructureUpdateFileChange = (ProjectFileStructureUpdateFileChange)other;
/*     */     return !Intrinsics.areEqual(this.oldFilePath, projectFileStructureUpdateFileChange.oldFilePath) ? false : (!Intrinsics.areEqual(this.newFilePath, projectFileStructureUpdateFileChange.newFilePath) ? false : (!Intrinsics.areEqual(this.patchText, projectFileStructureUpdateFileChange.patchText) ? false : (!!Intrinsics.areEqual(this.description, projectFileStructureUpdateFileChange.description))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureUpdateFileChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */